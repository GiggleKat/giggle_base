/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.statusbar.policy;

import com.android.systemui.R;

class TelephonyIcons {
    //***** Signal strength icons

    //GSM/UMTS
    static final int[][] TELEPHONY_SIGNAL_STRENGTH = {
        { R.drawable.stat_sys_signal_0_fully,
          R.drawable.stat_sys_signal_1_fully,
          R.drawable.stat_sys_signal_2_fully,
          R.drawable.stat_sys_signal_3_fully,
          R.drawable.stat_sys_signal_4_fully },
        { R.drawable.stat_sys_signal_0_fully,
          R.drawable.stat_sys_signal_1_fully,
          R.drawable.stat_sys_signal_2_fully,
          R.drawable.stat_sys_signal_3_fully,
          R.drawable.stat_sys_signal_4_fully }
    };

    static final int[][] QS_TELEPHONY_SIGNAL_STRENGTH = {
        { R.drawable.ic_qs_signal_0,
          R.drawable.ic_qs_signal_1,
          R.drawable.ic_qs_signal_2,
          R.drawable.ic_qs_signal_3,
          R.drawable.ic_qs_signal_4 },
        { R.drawable.ic_qs_signal_full_0,
          R.drawable.ic_qs_signal_full_1,
          R.drawable.ic_qs_signal_full_2,
          R.drawable.ic_qs_signal_full_3,
          R.drawable.ic_qs_signal_full_4 }
    };

    static final int[][] TELEPHONY_SIGNAL_STRENGTH_ROAMING = {
        { R.drawable.stat_sys_signal_0_fully,
          R.drawable.stat_sys_signal_1_fully,
          R.drawable.stat_sys_signal_2_fully,
          R.drawable.stat_sys_signal_3_fully,
          R.drawable.stat_sys_signal_4_fully },
        { R.drawable.stat_sys_signal_0_fully,
          R.drawable.stat_sys_signal_1_fully,
          R.drawable.stat_sys_signal_2_fully,
          R.drawable.stat_sys_signal_3_fully,
          R.drawable.stat_sys_signal_4_fully }
    };

    static final int[][] TELEPHONY_SIGNAL_STRENGTH_6BAR = {
        { R.drawable.stat_sys_signal_0_fully_6bar,
          R.drawable.stat_sys_signal_1_fully_6bar,
          R.drawable.stat_sys_signal_2_fully_6bar,
          R.drawable.stat_sys_signal_3_fully_6bar,
          R.drawable.stat_sys_signal_4_fully_6bar,
          R.drawable.stat_sys_signal_5_fully_6bar,
          R.drawable.stat_sys_signal_6_fully_6bar },
        { R.drawable.stat_sys_signal_0_fully_6bar,
          R.drawable.stat_sys_signal_1_fully_6bar,
          R.drawable.stat_sys_signal_2_fully_6bar,
          R.drawable.stat_sys_signal_3_fully_6bar,
          R.drawable.stat_sys_signal_4_fully_6bar,
          R.drawable.stat_sys_signal_5_fully_6bar,
          R.drawable.stat_sys_signal_6_fully_6bar }
    };

    static final int[][] QS_TELEPHONY_SIGNAL_STRENGTH_6BAR = {
        { R.drawable.ic_qs_signal_0_6bar,
          R.drawable.ic_qs_signal_1_6bar,
          R.drawable.ic_qs_signal_2_6bar,
          R.drawable.ic_qs_signal_3_6bar,
          R.drawable.ic_qs_signal_4_6bar,
          R.drawable.ic_qs_signal_5_6bar,
          R.drawable.ic_qs_signal_6_6bar },
        { R.drawable.ic_qs_signal_full_0_6bar,
          R.drawable.ic_qs_signal_full_1_6bar,
          R.drawable.ic_qs_signal_full_2_6bar,
          R.drawable.ic_qs_signal_full_3_6bar,
          R.drawable.ic_qs_signal_full_4_6bar,
          R.drawable.ic_qs_signal_full_5_6bar,
          R.drawable.ic_qs_signal_full_6_6bar }
    };

    static final int[] QS_DATA_R = {
        R.drawable.ic_qs_signal_r,
        R.drawable.ic_qs_signal_full_r
    };

    static final int[][] DATA_SIGNAL_STRENGTH = TELEPHONY_SIGNAL_STRENGTH;

    //***** Data connection icons

    //GSM/UMTS
    static final int[][] DATA_G = {
            { R.drawable.stat_sys_data_fully_connected_g,
              R.drawable.stat_sys_data_fully_connected_g,
              R.drawable.stat_sys_data_fully_connected_g,
              R.drawable.stat_sys_data_fully_connected_g },
            { R.drawable.stat_sys_data_fully_connected_g,
              R.drawable.stat_sys_data_fully_connected_g,
              R.drawable.stat_sys_data_fully_connected_g,
              R.drawable.stat_sys_data_fully_connected_g }
        };

    static final int[] QS_DATA_G = {
        R.drawable.ic_qs_signal_g,
        R.drawable.ic_qs_signal_full_g
    };

    static final int[][] DATA_3G = {
            { R.drawable.stat_sys_data_fully_connected_3g,
              R.drawable.stat_sys_data_fully_connected_3g,
              R.drawable.stat_sys_data_fully_connected_3g,
              R.drawable.stat_sys_data_fully_connected_3g },
            { R.drawable.stat_sys_data_fully_connected_3g,
              R.drawable.stat_sys_data_fully_connected_3g,
              R.drawable.stat_sys_data_fully_connected_3g,
              R.drawable.stat_sys_data_fully_connected_3g }
        };

    static final int[] QS_DATA_3G = {
        R.drawable.ic_qs_signal_3g,
        R.drawable.ic_qs_signal_full_3g
    };

    static final int[][] DATA_E = {
            { R.drawable.stat_sys_data_fully_connected_e,
              R.drawable.stat_sys_data_fully_connected_e,
              R.drawable.stat_sys_data_fully_connected_e,
              R.drawable.stat_sys_data_fully_connected_e },
            { R.drawable.stat_sys_data_fully_connected_e,
              R.drawable.stat_sys_data_fully_connected_e,
              R.drawable.stat_sys_data_fully_connected_e,
              R.drawable.stat_sys_data_fully_connected_e }
        };

    static final int[] QS_DATA_E = {
        R.drawable.ic_qs_signal_e,
        R.drawable.ic_qs_signal_full_e
    };

    //3.5G
    static final int[][] DATA_H = {
            { R.drawable.stat_sys_data_fully_connected_h,
              R.drawable.stat_sys_data_fully_connected_h,
              R.drawable.stat_sys_data_fully_connected_h,
              R.drawable.stat_sys_data_fully_connected_h },
            { R.drawable.stat_sys_data_fully_connected_h,
              R.drawable.stat_sys_data_fully_connected_h,
              R.drawable.stat_sys_data_fully_connected_h,
              R.drawable.stat_sys_data_fully_connected_h }
    };

    static final int[] QS_DATA_H = {
                R.drawable.ic_qs_signal_h,
                R.drawable.ic_qs_signal_full_h
    };

    //HPSPA+
    static final int[][] DATA_HP = {
            { R.drawable.stat_sys_data_fully_connected_hp,
              R.drawable.stat_sys_data_fully_connected_hp,
              R.drawable.stat_sys_data_fully_connected_hp,
              R.drawable.stat_sys_data_fully_connected_hp },
            { R.drawable.stat_sys_data_fully_connected_hp,
              R.drawable.stat_sys_data_fully_connected_hp,
              R.drawable.stat_sys_data_fully_connected_hp,
              R.drawable.stat_sys_data_fully_connected_hp }
    };

    static final int[] QS_DATA_HP = {
                R.drawable.ic_qs_signal_hp,
                R.drawable.ic_qs_signal_full_hp

    };

    //DC-HPSPA+
    static final int[][] DATA_DC = {
            { R.drawable.stat_sys_data_fully_connected_dc,
              R.drawable.stat_sys_data_fully_connected_dc,
              R.drawable.stat_sys_data_fully_connected_dc,
              R.drawable.stat_sys_data_fully_connected_dc },
            { R.drawable.stat_sys_data_fully_connected_dc,
              R.drawable.stat_sys_data_fully_connected_dc,
              R.drawable.stat_sys_data_fully_connected_dc,
              R.drawable.stat_sys_data_fully_connected_dc }
    };

    static final int[] QS_DATA_DC = {
                R.drawable.ic_qs_signal_dc,
                R.drawable.ic_qs_signal_full_dc

    };

    //CDMA
    // Use 3G icons for EVDO data and 1x icons for 1XRTT data
    static final int[][] DATA_1X = {
            { R.drawable.stat_sys_data_fully_connected_1x,
              R.drawable.stat_sys_data_fully_connected_1x,
              R.drawable.stat_sys_data_fully_connected_1x,
              R.drawable.stat_sys_data_fully_connected_1x },
            { R.drawable.stat_sys_data_fully_connected_1x,
              R.drawable.stat_sys_data_fully_connected_1x,
              R.drawable.stat_sys_data_fully_connected_1x,
              R.drawable.stat_sys_data_fully_connected_1x }
            };

    static final int[] QS_DATA_1X = {
        R.drawable.ic_qs_signal_1x,
        R.drawable.ic_qs_signal_full_1x
    };

    // LTE and eHRPD
    static final int[][] DATA_4G = {
            { R.drawable.stat_sys_data_fully_connected_4g,
              R.drawable.stat_sys_data_fully_connected_4g,
              R.drawable.stat_sys_data_fully_connected_4g,
              R.drawable.stat_sys_data_fully_connected_4g },
            { R.drawable.stat_sys_data_fully_connected_4g,
              R.drawable.stat_sys_data_fully_connected_4g,
              R.drawable.stat_sys_data_fully_connected_4g,
              R.drawable.stat_sys_data_fully_connected_4g }
        };

    static final int[] QS_DATA_4G = {
        R.drawable.ic_qs_signal_4g,
        R.drawable.ic_qs_signal_full_4g
    };

    // LTE branded "LTE"
    static final int[][] DATA_LTE = {
            { R.drawable.stat_sys_data_fully_connected_lte,
                    R.drawable.stat_sys_data_fully_connected_lte,
                    R.drawable.stat_sys_data_fully_connected_lte,
                    R.drawable.stat_sys_data_fully_connected_lte },
            { R.drawable.stat_sys_data_fully_connected_lte,
                    R.drawable.stat_sys_data_fully_connected_lte,
                    R.drawable.stat_sys_data_fully_connected_lte,
                    R.drawable.stat_sys_data_fully_connected_lte }
    };

    static final int[] QS_DATA_LTE = {
        R.drawable.ic_qs_signal_lte,
        R.drawable.ic_qs_signal_full_lte
    };

}

