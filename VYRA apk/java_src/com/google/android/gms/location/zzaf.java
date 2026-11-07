package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        com.google.android.gms.internal.location.zze zzeVar = null;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z5 = false;
        long j4 = -1;
        float f = 0.0f;
        int i6 = Integer.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        long j6 = Long.MAX_VALUE;
        long j7 = 0;
        long j8 = 600000;
        long j9 = 3600000;
        int i7 = 102;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    j9 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                case 14:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 5:
                    j5 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    j7 = SafeParcelReader.readLong(parcel, header);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 15:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, header, WorkSource.CREATOR);
                    break;
                case 17:
                    zzeVar = (com.google.android.gms.internal.location.zze) SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.location.zze.CREATOR);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationRequest(i7, j9, j8, j7, j5, j6, i6, f, z4, j4, i4, i5, z5, workSource, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new LocationRequest[i4];
    }
}
