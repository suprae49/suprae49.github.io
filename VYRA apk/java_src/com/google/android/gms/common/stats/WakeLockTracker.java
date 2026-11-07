package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@Deprecated
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerEvent(Context context, String str, int i4, String str2, String str3, String str4, int i5, List<String> list, long j4) {
    }

    @KeepForSdk
    public void registerReleaseEvent(Context context, Intent intent) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(Context context, String str, String str2, String str3, int i4, List<String> list, boolean z4, long j4) {
    }

    @KeepForSdk
    public void registerEvent(Context context, String str, int i4, String str2, String str3, String str4, int i5, List<String> list) {
    }

    @KeepForSdk
    public void registerAcquireEvent(Context context, Intent intent, String str, String str2, String str3, int i4, String str4) {
    }
}
