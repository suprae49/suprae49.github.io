package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.fragment.app.q;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzeo;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 14, 1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzaf();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 1)
    private int zza;

    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", id = 2)
    private long zzb;

    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", id = 3)
    private long zzc;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMaxUpdateDelayMillis", id = 8)
    private long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 10)
    private long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", id = 6)
    private int zzf;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMinUpdateDistanceMeters", id = 7)
    private float zzg;

    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", id = ConnectionResult.SERVICE_INVALID)
    private boolean zzh;

    @SafeParcelable.Field(defaultValueUnchecked = "-1", getter = "getMaxUpdateAgeMillis", id = ConnectionResult.LICENSE_CHECK_FAILED)
    private long zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 12)
    private final int zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 13)
    private final int zzk;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 15)
    private final boolean zzl;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 16)
    private final WorkSource zzm;

    @SafeParcelable.Field(getter = "getImpersonation", id = 17)
    private final com.google.android.gms.internal.location.zze zzn;

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) long j4, @SafeParcelable.Param(id = 3) long j5, @SafeParcelable.Param(id = 8) long j6, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", id = 5) long j7, @SafeParcelable.Param(id = 10) long j8, @SafeParcelable.Param(id = 6) int i5, @SafeParcelable.Param(id = 7) float f, @SafeParcelable.Param(id = ConnectionResult.SERVICE_INVALID) boolean z4, @SafeParcelable.Param(id = ConnectionResult.LICENSE_CHECK_FAILED) long j9, @SafeParcelable.Param(id = 12) int i6, @SafeParcelable.Param(id = 13) int i7, @SafeParcelable.Param(id = 15) boolean z5, @SafeParcelable.Param(id = 16) WorkSource workSource, @SafeParcelable.Param(id = 17) com.google.android.gms.internal.location.zze zzeVar) {
        this.zza = i4;
        if (i4 == 105) {
            this.zzb = Long.MAX_VALUE;
        } else {
            this.zzb = j4;
        }
        this.zzc = j5;
        this.zzd = j6;
        this.zze = j7 == Long.MAX_VALUE ? j8 : Math.min(Math.max(1L, j7 - SystemClock.elapsedRealtime()), j8);
        this.zzf = i5;
        this.zzg = f;
        this.zzh = z4;
        this.zzi = j9 != -1 ? j9 : j4;
        this.zzj = i6;
        this.zzk = i7;
        this.zzl = z5;
        this.zzm = workSource;
        this.zzn = zzeVar;
    }

    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String zze(long j4) {
        return j4 == Long.MAX_VALUE ? "∞" : zzeo.zzb(j4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzl == locationRequest.zzl && this.zzm.equals(locationRequest.zzm) && Objects.equal(this.zzn, locationRequest.zzn)))) {
                return true;
            }
        }
        return false;
    }

    @Pure
    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    @Pure
    public long getExpirationTime() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = this.zze;
        long j5 = jElapsedRealtime + j4;
        if (((jElapsedRealtime ^ j5) & (j4 ^ j5)) < 0) {
            return Long.MAX_VALUE;
        }
        return j5;
    }

    @Deprecated
    @Pure
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    @Pure
    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    @Pure
    public long getInterval() {
        return getIntervalMillis();
    }

    @Pure
    public long getIntervalMillis() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    @Pure
    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    @Pure
    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    @Pure
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    @Pure
    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    @Pure
    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    @Pure
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    @Pure
    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    @Pure
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzm);
    }

    @Pure
    public boolean isBatched() {
        long j4 = this.zzd;
        return j4 > 0 && (j4 >> 1) >= this.zzb;
    }

    @Deprecated
    @Pure
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    @Pure
    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @Deprecated
    public LocationRequest setExpirationDuration(long j4) {
        Preconditions.checkArgument(j4 > 0, "durationMillis must be greater than 0");
        this.zze = j4;
        return this;
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j4) {
        this.zze = Math.max(1L, j4 - SystemClock.elapsedRealtime());
        return this;
    }

    @Deprecated
    public LocationRequest setFastestInterval(long j4) {
        Preconditions.checkArgument(j4 >= 0, "illegal fastest interval: %d", Long.valueOf(j4));
        this.zzc = j4;
        return this;
    }

    @Deprecated
    public LocationRequest setInterval(long j4) {
        Preconditions.checkArgument(j4 >= 0, "intervalMillis must be greater than or equal to 0");
        long j5 = this.zzc;
        long j6 = this.zzb;
        if (j5 == j6 / 6) {
            this.zzc = j4 / 6;
        }
        if (this.zzi == j6) {
            this.zzi = j4;
        }
        this.zzb = j4;
        return this;
    }

    @Deprecated
    public LocationRequest setMaxWaitTime(long j4) {
        Preconditions.checkArgument(j4 >= 0, "illegal max wait time: %d", Long.valueOf(j4));
        this.zzd = j4;
        return this;
    }

    @Deprecated
    public LocationRequest setNumUpdates(int i4) {
        if (i4 > 0) {
            this.zzf = i4;
            return this;
        }
        q.e(String.valueOf(i4).length() + 20, i4, "invalid numUpdates: ");
        return null;
    }

    @Deprecated
    public LocationRequest setPriority(int i4) {
        zzan.zza(i4);
        this.zza = i4;
        return this;
    }

    @Deprecated
    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzg = f;
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 22);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z4) {
        this.zzh = z4;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (isPassive()) {
            sb.append(zzan.zzb(this.zza));
            if (this.zzd > 0) {
                sb.append("/");
                zzeo.zzc(this.zzd, sb);
            }
        } else {
            sb.append("@");
            boolean zIsBatched = isBatched();
            long j4 = this.zzb;
            if (zIsBatched) {
                zzeo.zzc(j4, sb);
                sb.append("/");
                zzeo.zzc(this.zzd, sb);
            } else {
                zzeo.zzc(j4, sb);
            }
            sb.append(" ");
            sb.append(zzan.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            sb.append(", minUpdateInterval=");
            sb.append(zze(this.zzc));
        }
        if (this.zzg > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.zzg);
        }
        boolean zIsPassive = isPassive();
        long j5 = this.zzi;
        if (!zIsPassive ? j5 != this.zzb : j5 != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(zze(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            sb.append(", duration=");
            zzeo.zzc(this.zze, sb);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.zzf);
        }
        if (this.zzk != 0) {
            sb.append(", ");
            sb.append(zzar.zzb(this.zzk));
        }
        if (this.zzj != 0) {
            sb.append(", ");
            sb.append(zzq.zzb(this.zzj));
        }
        if (this.zzh) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.zzl) {
            sb.append(", bypass");
        }
        if (!WorkSourceUtil.isEmpty(this.zzm)) {
            sb.append(", ");
            sb.append(this.zzm);
        }
        if (this.zzn != null) {
            sb.append(", impersonation=");
            sb.append(this.zzn);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzl);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzm, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzn, i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Pure
    public final int zza() {
        return this.zzk;
    }

    @Pure
    public final boolean zzb() {
        return this.zzl;
    }

    @Pure
    public final WorkSource zzc() {
        return this.zzm;
    }

    @Pure
    public final com.google.android.gms.internal.location.zze zzd() {
        return this.zzn;
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        private boolean zzl;
        private WorkSource zzm;
        private com.google.android.gms.internal.location.zze zzn;

        public Builder(LocationRequest locationRequest) {
            this(locationRequest.getPriority(), locationRequest.getIntervalMillis());
            setMinUpdateIntervalMillis(locationRequest.getMinUpdateIntervalMillis());
            setMaxUpdateDelayMillis(locationRequest.getMaxUpdateDelayMillis());
            setDurationMillis(locationRequest.getDurationMillis());
            setMaxUpdates(locationRequest.getMaxUpdates());
            setMinUpdateDistanceMeters(locationRequest.getMinUpdateDistanceMeters());
            setWaitForAccurateLocation(locationRequest.isWaitForAccurateLocation());
            setMaxUpdateAgeMillis(locationRequest.getMaxUpdateAgeMillis());
            setGranularity(locationRequest.getGranularity());
            int iZza = locationRequest.zza();
            zzar.zza(iZza);
            this.zzk = iZza;
            this.zzl = locationRequest.zzb();
            this.zzm = locationRequest.zzc();
            com.google.android.gms.internal.location.zze zzeVarZzd = locationRequest.zzd();
            boolean z4 = true;
            if (zzeVarZzd != null && zzeVarZzd.zza()) {
                z4 = false;
            }
            Preconditions.checkArgument(z4);
            this.zzn = zzeVarZzd;
        }

        public LocationRequest build() {
            int i4 = this.zza;
            long j4 = this.zzb;
            long jMin = this.zzc;
            if (jMin == -1) {
                jMin = j4;
            } else if (i4 != 105) {
                jMin = Math.min(jMin, j4);
            }
            long jMax = Math.max(this.zzd, this.zzb);
            long j5 = this.zze;
            int i5 = this.zzf;
            float f = this.zzg;
            boolean z4 = this.zzh;
            long j6 = this.zzi;
            if (j6 == -1) {
                j6 = this.zzb;
            }
            return new LocationRequest(i4, j4, jMin, jMax, Long.MAX_VALUE, j5, i5, f, z4, j6, this.zzj, this.zzk, this.zzl, new WorkSource(this.zzm), this.zzn);
        }

        public Builder setDurationMillis(long j4) {
            Preconditions.checkArgument(j4 > 0, "durationMillis must be greater than 0");
            this.zze = j4;
            return this;
        }

        public Builder setGranularity(int i4) {
            zzq.zza(i4);
            this.zzj = i4;
            return this;
        }

        public Builder setIntervalMillis(long j4) {
            Preconditions.checkArgument(j4 >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j4;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j4) {
            boolean z4 = true;
            if (j4 != -1 && j4 < 0) {
                z4 = false;
            }
            Preconditions.checkArgument(z4, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j4;
            return this;
        }

        public Builder setMaxUpdateDelayMillis(long j4) {
            Preconditions.checkArgument(j4 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j4;
            return this;
        }

        public Builder setMaxUpdates(int i4) {
            Preconditions.checkArgument(i4 > 0, "maxUpdates must be greater than 0");
            this.zzf = i4;
            return this;
        }

        public Builder setMinUpdateDistanceMeters(float f) {
            Preconditions.checkArgument(f >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f;
            return this;
        }

        public Builder setMinUpdateIntervalMillis(long j4) {
            boolean z4 = true;
            if (j4 != -1 && j4 < 0) {
                z4 = false;
            }
            Preconditions.checkArgument(z4, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j4;
            return this;
        }

        public Builder setPriority(int i4) {
            zzan.zza(i4);
            this.zza = i4;
            return this;
        }

        public Builder setWaitForAccurateLocation(boolean z4) {
            this.zzh = z4;
            return this;
        }

        public final Builder zza(int i4) {
            zzar.zza(i4);
            this.zzk = i4;
            return this;
        }

        public final Builder zzb(boolean z4) {
            this.zzl = z4;
            return this;
        }

        public final Builder zzc(WorkSource workSource) {
            this.zzm = workSource;
            return this;
        }

        public Builder(long j4) {
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = false;
            this.zzm = null;
            this.zzn = null;
            setIntervalMillis(j4);
        }

        public Builder(int i4, long j4) {
            this(j4);
            setPriority(i4);
        }
    }
}
