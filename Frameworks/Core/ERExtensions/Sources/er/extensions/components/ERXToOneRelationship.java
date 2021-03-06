/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */
package er.extensions.components;


import com.webobjects.appserver.WOContext;

import er.extensions.foundation.ERXProperties;
import er.extensions.woextensions.WOToOneRelationship;

/**
 * Better layout options that the {@link WOToOneRelationship}, in addition you can set a 
 * qualifier on the dataSource if you passed any.<br />
 *
 * @binding dataSource
 * @binding destinationDisplayKey
 * @binding isMandatory
 * @binding relationshipKey
 * @binding sourceEntityName
 * @binding destinationEntityName
 * @binding sourceObject
 * @binding uiStyle
 * @binding destinationSortKey
 * @binding noSelectionString
 * @binding possibleChoices
 * @binding qualifier
 * @binding popupName
 * @binding size
 * @binding maxColumns
 * @binding localizeDisplayKeys" defaults="Boolean
 * @binding sortCaseInsensitive
 */

public class ERXToOneRelationship extends WOToOneRelationship {
	
	public final String radioButtonComponentName = ERXProperties.stringForKeyWithDefault("er.extensions.components.ERXToOneRelationship.radioButtonComponentName", "ERXRadioButtonMatrix");

    public ERXToOneRelationship(WOContext context) {
        super(context);
    }
}
