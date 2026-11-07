package b2;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f1056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1058e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f1056c;
        return timeInterpolator != null ? timeInterpolator : a.f1048b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1054a == dVar.f1054a && this.f1055b == dVar.f1055b && this.f1057d == dVar.f1057d && this.f1058e == dVar.f1058e) {
            return a().getClass().equals(dVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f1054a;
        long j5 = this.f1055b;
        return ((((a().getClass().hashCode() + (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31)) * 31) + this.f1057d) * 31) + this.f1058e;
    }

    public final String toString() {
        return "\n" + d.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f1054a + " duration: " + this.f1055b + " interpolator: " + a().getClass() + " repeatCount: " + this.f1057d + " repeatMode: " + this.f1058e + "}\n";
    }
}
