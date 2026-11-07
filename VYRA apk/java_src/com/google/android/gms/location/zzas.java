package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();

    @SafeParcelable.Field(getter = "getStartHour", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getStartMinute", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getEndHour", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getEndMinute", id = 4)
    private final int zzd;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) int i5, @SafeParcelable.Param(id = 3) int i6, @SafeParcelable.Param(id = 4) int i7) {
        Preconditions.checkState(i4 >= 0 && i4 <= 23, "Start hour must be in range [0, 23].");
        Preconditions.checkState(i5 >= 0 && i5 <= 59, "Start minute must be in range [0, 59].");
        Preconditions.checkState(i6 >= 0 && i6 <= 23, "End hour must be in range [0, 23].");
        Preconditions.checkState(i7 >= 0 && i7 <= 59, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i4 + i5) + i6) + i7 > 0, "Parameters can't be all 0.");
        this.zza = i4;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        return this.zza == zzasVar.zza && this.zzb == zzasVar.zzb && this.zzc == zzasVar.zzc && this.zzd == zzasVar.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i4 = this.zza;
        int length = String.valueOf(i4).length();
        int i5 = this.zzb;
        int length2 = String.valueOf(i5).length();
        int i6 = this.zzc;
        int length3 = String.valueOf(i6).length();
        int i7 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i7).length() + 1);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i4);
        sb.append(", startMinute=");
        sb.append(i5);
        sb.append(", endHour=");
        sb.append(i6);
        sb.append(", endMinute=");
        sb.append(i7);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Preconditions.checkNotNull(parcel);
        int i5 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i5);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
