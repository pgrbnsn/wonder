import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableSet;

// Generated by the WOLips Templateengine Plug-in at Dec 17, 2007 9:15:09 PM
public class RadioButtonExample extends com.webobjects.appserver.WOComponent {
	private NSMutableArray<Integer> _values;
	private Integer _itemValue;
	private NSMutableSet<Integer> _selectedItems;

	public RadioButtonExample(WOContext context) {
		super(context);
		_values = new NSMutableArray<Integer>();
		for (int i = 0; i < 10; i++) {
			_values.addObject(new Integer(i));
		}
		_selectedItems = new NSMutableSet<Integer>();
	}
	
	public NSMutableSet<Integer> selectedItems() {
		return _selectedItems;
	}

	public NSMutableArray<Integer> getValues() {
		return _values;
	}

	public void setItemValue(Integer itemValue) {
		_itemValue = itemValue;
	}

	public Integer getItemValue() {
		return _itemValue;
	}
	
	public String buttonID () {
		return "button" + _itemValue;
	}

	public void setSelected(boolean selected) {
		if (selected) {
			//_selectedItems.removeAllObjects();
			_selectedItems.addObject(_itemValue);
		}
		else {
			_selectedItems.removeObject(_itemValue);
		}
	}

	public boolean isSelected() {
		return _selectedItems.containsObject(_itemValue);
	}
	
	public WOActionResults submit() {
		System.out.println("RadioButtonExample.submit: submit");
		return null;
	}
}