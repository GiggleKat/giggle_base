
package com.android.internal.util.beanstalk;

public class ButtonsConstants {

    // key must fit with the values arrays from Settings to use
    // SlimActions.java actions
    public static final String ACTION_HOME                 = "**home**";
    public static final String ACTION_BACK                 = "**back**";
    public static final String ACTION_SEARCH               = "**search**";
    public static final String ACTION_MENU                 = "**menu**";
    public static final String ACTION_MENU_BIG             = "**menu_big**";
    public static final String ACTION_POWER                = "**power**";
    public static final String ACTION_NOTIFICATIONS        = "**notifications**";
    public static final String ACTION_QS                   = "**quicksettings**";
    public static final String ACTION_RECENTS              = "**recents**";
    public static final String ACTION_SCREENSHOT           = "**screenshot**";
    public static final String ACTION_IME                  = "**ime**";
    public static final String ACTION_LAST_APP             = "**lastapp**";
    public static final String ACTION_KILL                 = "**kill**";
    public static final String ACTION_ASSIST               = "**assist**";
    public static final String ACTION_VIB                  = "**ring_vib**";
    public static final String ACTION_SILENT               = "**ring_silent**";
    public static final String ACTION_VIB_SILENT           = "**ring_vib_silent**";
    public static final String ACTION_POWER_MENU           = "**power_menu**";
    public static final String ACTION_TORCH                = "**torch**";
    public static final String ACTION_EXPANDED_DESKTOP     = "**expanded_desktop**";

    // no action
    public static final String ACTION_NULL            = "**null**";

    // this shorcut constant is only used to identify if the user
    // selected in settings a custom app...after it is choosed intent uri
    // is saved in the ButtonConfig object
    public static final String ACTION_APP          = "**app**";

    public static final String ICON_EMPTY = "empty";
    public static final String SYSTEM_ICON_IDENTIFIER = "system_shortcut=";
    public static final String ACTION_DELIMITER = "|";

    public static final String NAVIGATION_CONFIG_DEFAULT =
          ACTION_BACK    + ACTION_DELIMITER
        + ACTION_NULL    + ACTION_DELIMITER
        + ICON_EMPTY     + ACTION_DELIMITER
        + ACTION_HOME    + ACTION_DELIMITER
        + ACTION_NULL    + ACTION_DELIMITER
        + ICON_EMPTY     + ACTION_DELIMITER
        + ACTION_RECENTS + ACTION_DELIMITER
        + ACTION_NULL    + ACTION_DELIMITER
        + ICON_EMPTY;

    public static final String NAV_RING_CONFIG_DEFAULT =
          ACTION_ASSIST + ACTION_DELIMITER
        + ACTION_NULL   + ACTION_DELIMITER
        + ICON_EMPTY;

}