package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzs extends com.google.android.gms.internal.location.zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.location.IDeviceOrientationListener");
    }

    public static zzt zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof zzt ? (zzt) iInterfaceQueryLocalInterface : new zzr(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 != 1) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) com.google.android.gms.internal.location.zzc.zza(parcel, DeviceOrientation.CREATOR);
        com.google.android.gms.internal.location.zzc.zzd(parcel);
        zzd(deviceOrientation);
        return true;
    }
}
