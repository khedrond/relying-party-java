/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License, as published by the Free Software Foundation and
 * available at http://www.fsf.org/licensing/licenses/lgpl.html,
 * version 2.1 or above.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2001-2019 StrongAuth, Inc.
 *
 * $Date: 
 * $Revision:
 * $Author: mishimoto $
 * $URL: 
 *
 * *********************************************
 *                    888
 *                    888
 *                    888
 *  88888b.   .d88b.  888888  .d88b.  .d8888b
 *  888 "88b d88""88b 888    d8P  Y8b 88K
 *  888  888 888  888 888    88888888 "Y8888b.
 *  888  888 Y88..88P Y88b.  Y8b.          X88
 *  888  888  "Y88P"   "Y888  "Y8888   88888P'
 *
 * *********************************************
 * 
 *
 *
 */

package com.strongkey.utilities;

import java.util.Locale;
import java.util.ResourceBundle;

public class WebauthnTutorialLogger {
    // Logger for the application
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger("WEBAUTHNTUTORIAL", "resources.webauthntutorial-messages_"
            + Locale.getDefault());
    
    // Load messages for Exceptions
    private static final ResourceBundle MESSAGEBUNDLE = ResourceBundle.getBundle("resources.webauthntutorial-messages", Locale.getDefault());
    
    public static final String getMessageProperty(String key) {
        return MESSAGEBUNDLE.getString(key);
    }
    
    public static void logp(java.util.logging.Level level,
            String sourceClass, String sourceMethod, String key, Object param) {
        logger.logp(level, sourceClass, sourceMethod, key, param);
    }
}
