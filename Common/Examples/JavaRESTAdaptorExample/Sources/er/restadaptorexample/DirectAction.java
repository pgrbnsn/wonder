// Generated by the WOLips Templateengine Plug-in at Apr 12, 2008 12:11:06 PM
package er.restadaptorexample;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WORequest;

import er.extensions.ERXDirectAction;
import er.restadaptorexample.components.Main;


public class DirectAction extends ERXDirectAction {
	public DirectAction(WORequest request) {
		super(request);
	}

	@Override
	public WOActionResults defaultAction() {
		return pageWithName(Main.class.getName());
	}
}