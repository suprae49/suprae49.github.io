package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.q;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static double checkArgumentInRange(double d5, double d6, double d7, String str) {
        if (d5 < d6) {
            q.q(zza("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d6), Double.valueOf(d7)));
            return 0.0d;
        }
        if (d5 <= d7) {
            return d5;
        }
        q.q(zza("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d6), Double.valueOf(d7)));
        return 0.0d;
    }

    @KeepForSdk
    public static void checkHandlerThread(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    @KeepForSdk
    public static void checkMainThread(String str) {
        if (com.google.android.gms.common.util.zzb.zza()) {
            return;
        }
        q.j(str);
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static String checkNotEmpty(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread(String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                q.j(str);
            }
        }
    }

    @KeepForSdk
    public static void checkNotMainThread(String str) {
        if (com.google.android.gms.common.util.zzb.zza()) {
            q.j(str);
        }
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static <T> T checkNotNull(T t4, Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static long checkNotZero(long j4, Object obj) {
        if (j4 != 0) {
            return j4;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkState(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i4 = 0;
        int i5 = 0;
        while (i4 < 3 && (iIndexOf = str.indexOf("%s", i5)) != -1) {
            sb.append(str.substring(i5, iIndexOf));
            sb.append(objArr[i4]);
            i5 = iIndexOf + 2;
            i4++;
        }
        sb.append(str.substring(i5));
        if (i4 < 3) {
            sb.append(" [");
            sb.append(objArr[i4]);
            for (int i6 = i4 + 1; i6 < 3; i6++) {
                sb.append(", ");
                sb.append(objArr[i6]);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @KeepForSdk
    public static void checkArgument(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static <T> T checkNotNull(T t4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException("null reference");
    }

    @KeepForSdk
    public static void checkState(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static String checkNotEmpty(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        q.q("Given String is empty or null");
        return null;
    }

    @KeepForSdk
    public static int checkNotZero(int i4, Object obj) {
        if (i4 != 0) {
            return i4;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static long checkNotZero(long j4) {
        if (j4 != 0) {
            return j4;
        }
        q.q("Given Long is zero");
        return 0L;
    }

    @KeepForSdk
    public static int checkNotZero(int i4) {
        if (i4 != 0) {
            return i4;
        }
        q.q("Given Integer is zero");
        return 0;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    @KeepForSdk
    public static float checkArgumentInRange(float f, float f4, float f5, String str) {
        if (f < f4) {
            q.q(zza("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f4), Float.valueOf(f5)));
            return 0.0f;
        }
        if (f <= f5) {
            return f;
        }
        q.q(zza("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f4), Float.valueOf(f5)));
        return 0.0f;
    }

    @KeepForSdk
    public static int checkArgumentInRange(int i4, int i5, int i6, String str) {
        if (i4 < i5) {
            q.q(zza("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
            return 0;
        }
        if (i4 <= i6) {
            return i4;
        }
        q.q(zza("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
        return 0;
    }

    @KeepForSdk
    public static long checkArgumentInRange(long j4, long j5, long j6, String str) {
        if (j4 < j5) {
            q.q(zza("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j5), Long.valueOf(j6)));
            return 0L;
        }
        if (j4 <= j6) {
            return j4;
        }
        q.q(zza("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j5), Long.valueOf(j6)));
        return 0L;
    }

    @KeepForSdk
    public static void checkHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        q.j(str);
    }
}
