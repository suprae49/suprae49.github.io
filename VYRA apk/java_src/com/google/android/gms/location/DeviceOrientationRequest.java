package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzer;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
@SafeParcelable.Reserved({1, 3, 4, 5})
public final class DeviceOrientationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new zzn();
    public static final long OUTPUT_PERIOD_DEFAULT = 20000;
    public static final long OUTPUT_PERIOD_FAST = 5000;
    public static final long OUTPUT_PERIOD_MEDIUM = 10000;

    @SafeParcelable.Field(getter = "getSamplingPeriodMicros", id = 2)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "false", getter = "isVelocityEnabled", id = 6)
    private final boolean zzb;

    @SafeParcelable.Constructor
    public DeviceOrientationRequest(@SafeParcelable.Param(id = 2) long j4, @SafeParcelable.Param(id = 6) boolean z4) {
        this.zza = j4;
        this.zzb = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        return this.zza == deviceOrientationRequest.zza && this.zzb == deviceOrientationRequest.zzb;
    }

    @Pure
    public long getSamplingPeriodMicros() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Boolean.valueOf(this.zzb));
    }

    public String toString() {
        long j4 = this.zza;
        int length = String.valueOf(j4).length();
        String str = true != this.zzb ? "" : ", withVelocity";
        StringBuilder sb = new StringBuilder(str.length() + length + 46 + 1);
        sb.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb.append(j4);
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, getSamplingPeriodMicros());
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final /* synthetic */ long zza() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzb() {
        return this.zzb;
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static final class Builder {
        private long zza;
        private final boolean zzb;

        public Builder(DeviceOrientationRequest deviceOrientationRequest) {
            this.zza = deviceOrientationRequest.zza();
            this.zzb = deviceOrientationRequest.zzb();
        }

        public DeviceOrientationRequest build() {
            return new DeviceOrientationRequest(this.zza, this.zzb);
        }

        public Builder setSamplingPeriodMicros(long j4) {
            boolean z4 = false;
            if (j4 >= 0 && j4 < Long.MAX_VALUE) {
                z4 = true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j4).length() + 102);
            sb.append("Invalid interval: ");
            sb.append(j4);
            sb.append(" should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
            zzer.zzb(z4, sb.toString());
            this.zza = j4;
            return this;
        }

        public Builder(long j4) {
            this.zzb = false;
            setSamplingPeriodMicros(j4);
        }
    }
}
