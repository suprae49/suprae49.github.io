package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class zzel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i4 = -1;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        long j4 = 0;
        float f = 0.0f;
        double d5 = 0.0d;
        double d6 = 0.0d;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    s2 = SafeParcelReader.readShort(parcel, header);
                    break;
                case 4:
                    d5 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 5:
                    d6 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 6:
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    i6 = SafeParcelReader.readInt(parcel, header);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzek(strCreateString, i5, s2, d5, d6, f, j4, i6, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new zzek[i4];
    }
}
