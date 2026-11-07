package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i4, Activity activity, int i5, DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i4)) {
            i4 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i4, i5, onCancelListener);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i4, Context context, int i5) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i4, i5);
    }

    @Deprecated
    public static String getErrorString(int i4) {
        return GooglePlayServicesUtilLight.getErrorString(i4);
    }

    public static Context getRemoteContext(Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i4) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i4);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i4, Activity activity, Fragment fragment, int i5, DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i4)) {
            i4 = 18;
        }
        int i6 = i4;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i6, i5, onCancelListener);
        }
        Dialog dialogZaa = googleApiAvailability.zaa(activity, i6, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i6, "d"), i5), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, dialogZaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i4, Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i4) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i4)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i4);
        }
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i4) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i4);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i4, Activity activity, int i5) {
        return getErrorDialog(i4, activity, i5, null);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i4, Activity activity, int i5, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i4, activity, null, i5, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i4, Activity activity, int i5) {
        return showErrorDialogFragment(i4, activity, i5, null);
    }
}
