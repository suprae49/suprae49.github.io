package com.google.android.gms.location;

import androidx.fragment.app.q;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.location.zzek;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 3;
        private long zzc = -1;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        public Geofence build() {
            if (this.zza == null) {
                q.q("Request ID not set.");
                return null;
            }
            int i4 = this.zzb;
            if (i4 == 0) {
                q.q("Transitions types not set.");
                return null;
            }
            if ((i4 & 4) != 0 && this.zzi < 0) {
                q.q("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                return null;
            }
            if (this.zzc == Long.MIN_VALUE) {
                q.q("Expiration not set.");
                return null;
            }
            if (this.zzd == -1) {
                q.q("Geofence region not set.");
                return null;
            }
            if (this.zzh >= 0) {
                return new zzek(this.zza, this.zzb, (short) 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
            }
            q.q("Notification responsiveness should be nonnegative.");
            return null;
        }

        public Builder setCircularRegion(double d5, double d6, float f) {
            boolean z4 = d5 >= -90.0d && d5 <= 90.0d;
            StringBuilder sb = new StringBuilder(String.valueOf(d5).length() + 18);
            sb.append("Invalid latitude: ");
            sb.append(d5);
            Preconditions.checkArgument(z4, sb.toString());
            boolean z5 = d6 >= -180.0d && d6 <= 180.0d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(d6).length() + 19);
            sb2.append("Invalid longitude: ");
            sb2.append(d6);
            Preconditions.checkArgument(z5, sb2.toString());
            boolean z6 = f > 0.0f;
            StringBuilder sb3 = new StringBuilder(String.valueOf(f).length() + 16);
            sb3.append("Invalid radius: ");
            sb3.append(f);
            Preconditions.checkArgument(z6, sb3.toString());
            this.zzd = (short) 1;
            this.zze = d5;
            this.zzf = d6;
            this.zzg = f;
            return this;
        }

        public Builder setExpirationDuration(long j4) {
            if (j4 < 0) {
                this.zzc = -1L;
                return this;
            }
            this.zzc = DefaultClock.getInstance().elapsedRealtime() + j4;
            return this;
        }

        public Builder setLoiteringDelay(int i4) {
            this.zzi = i4;
            return this;
        }

        public Builder setNotificationResponsiveness(int i4) {
            this.zzh = i4;
            return this;
        }

        public Builder setRequestId(String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        public Builder setTransitionTypes(@TransitionTypes int i4) {
            this.zzb = i4;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public @interface GeofenceTransition {
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
