package er.directtoweb;
// Generated by the WOLips Templateengine Plug-in at 07.10.2006 12:42:25

import org.apache.log4j.Logger;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2W;
import com.webobjects.directtoweb.InspectPageInterface;
import com.webobjects.eocontrol.EOEnterpriseObject;

import er.extensions.eof.ERXEOControlUtilities;
/**
 * Generic link component used to view or edit an object.<br />
 * @binding object object to get list from
 * @binding key keypath to get list from object
 * @binding keyWhenRelationship in case the object is the value at the keypath, defines the display key
 * @binding editConfigurationName name of the page configuration to jump to
 * @binding useNestedEditingContext if the EC should be nested (default is peer)
 * @author ak
 */
public class ERDLinkToEditObject extends ERDCustomEditComponent {

    public static final Logger log = Logger.getLogger(ERDLinkToEditObject.class);

    public ERDLinkToEditObject(WOContext context) {
    	super(context);
    }

    public boolean isStateless() {
    	return true;
    }

    public boolean synchronizesVariablesWithBindings() {
    	return false;
    }

    public void reset() {
    	super.reset();
    }
    
    public Object displayValue() {
        Object value = objectKeyPathValue();
        if (value instanceof EOEnterpriseObject) {
            return ((EOEnterpriseObject) value).valueForKey((String) valueForBinding("keyWhenRelationship"));
        }
        return value;
    }

    public WOComponent view() {
        EOEnterpriseObject eo = object();
        Object value = objectKeyPathValue();
        if (value instanceof EOEnterpriseObject) {
            eo = (EOEnterpriseObject) value;
        }
        String pageConfigurationName = (String)valueForBinding("editConfigurationName");
        InspectPageInterface ipi = (InspectPageInterface)D2W.factory().pageForConfigurationNamed(pageConfigurationName, session());
     	eo = ERXEOControlUtilities.editableInstanceOfObject(eo, booleanValueForBinding("useNestedEditingContext"));
    	ipi.setNextPage(context().page());
    	ipi.setObject(eo);
    	return (WOComponent)ipi;
    }
}