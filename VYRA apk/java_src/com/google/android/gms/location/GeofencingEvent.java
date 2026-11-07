package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.location.zzek;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class GeofencingEvent {
    private final int zza;

    @Geofence.GeofenceTransition
    private final int zzb;
    private final List zzc;
    private final Location zzd;

    private GeofencingEvent(int i4, @Geofence.GeofenceTransition int i5, List list, Location location) {
        this.zza = i4;
        this.zzb = i5;
        this.zzc = list;
        this.zzd = location;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static GeofencingEvent fromIntent(Intent intent) {
        ArrayList arrayList;
        if (intent != null) {
            int intExtra = intent.getIntExtra(Constants.KEY_GMS_ERROR_CODE, -1);
            int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
            if (intExtra2 == -1) {
                intExtra2 = -1;
            } else if (intExtra2 != 1 && intExtra2 != 2) {
                if (intExtra2 == 4) {
                    intExtra2 = 4;
                } else {
                    intExtra2 = -1;
                }
            }
            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArr = (byte[]) arrayList2.get(i4);
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArr, 0, bArr.length);
                    parcelObtain.setDataPosition(0);
                    zzek zzekVarCreateFromParcel = zzek.CREATOR.createFromParcel(parcelObtain);
                    parcelObtain.recycle();
                    arrayList.add(zzekVarCreateFromParcel);
                }
            }
            Location location = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
            if (arrayList != null || intExtra != -1) {
                return new GeofencingEvent(intExtra, intExtra2, arrayList, location);
            }
        }
        return null;
    }

    public int getErrorCode() {
        return this.zza;
    }

    @Geofence.GeofenceTransition
    public int getGeofenceTransition() {
        return this.zzb;
    }

    public List<Geofence> getTriggeringGeofences() {
        return this.zzc;
    }

    public Location getTriggeringLocation() {
        return this.zzd;
    }

    public boolean hasError() {
        return this.zza != -1;
    }
}
