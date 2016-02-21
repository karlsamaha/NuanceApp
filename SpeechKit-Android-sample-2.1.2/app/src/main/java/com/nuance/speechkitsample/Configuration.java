package com.nuance.speechkitsample;

import android.net.Uri;

import com.nuance.speechkit.PcmFormat;

/**
 * All Nuance Developers configuration parameters can be set here.
 *
 * Copyright (c) 2015 Nuance Communications. All rights reserved.
 */
public class Configuration {

    //All fields are required.
    //Your credentials can be found in your Nuance Developers portal, under "Manage My Apps".
    public static final String APP_KEY = "d146349bd7a8c02c5b463074f411a978699c8ba682461a6f4e20155212a9ffe3ef337ec7db3ff3378523ab7a3454f29df17e4473c45ee2127ff76491a0637590";
    public static final String APP_ID = "NMDPTRIAL_karlsamaha_gmail_com20160220130122";
    public static final String SERVER_HOST = "sslsandbox.nmdp.nuancemobility.net";
    public static final String SERVER_PORT = "443";

    public static final Uri SERVER_URI = Uri.parse("nmsps://" + APP_ID + "@" + SERVER_HOST + ":" + SERVER_PORT);

    //Only needed if using NLU
    public static final String CONTEXT_TAG = "!NLU_CONTEXT_TAG!";

    public static final PcmFormat PCM_FORMAT = new PcmFormat(PcmFormat.SampleFormat.SignedLinear16, 16000, 1);
}

