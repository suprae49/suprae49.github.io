package com.google.android.gms.internal.location;

import androidx.fragment.app.q;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class zzer {
    public static void zza(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z4, @CheckForNull Object obj) {
        if (z4) {
            return;
        }
        q.q((String) obj);
    }

    public static int zzc(int i4, int i5, String str) {
        String strZza;
        if (i4 >= 0 && i4 < i5) {
            return i4;
        }
        if (i4 < 0) {
            strZza = zzes.zza("%s (%s) must not be negative", "index", Integer.valueOf(i4));
        } else {
            if (i5 < 0) {
                q.e(String.valueOf(i5).length() + 15, i5, "negative size: ");
                return 0;
            }
            strZza = zzes.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzd(int i4, int i5, String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(zzf(i4, i5, "index"));
        }
        return i4;
    }

    public static void zze(int i4, int i5, int i6) {
        String strZzf;
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            if (i4 < 0 || i4 > i6) {
                strZzf = zzf(i4, i6, "start index");
            } else {
                strZzf = (i5 < 0 || i5 > i6) ? zzf(i5, i6, "end index") : zzes.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    private static String zzf(int i4, int i5, String str) {
        if (i4 < 0) {
            return zzes.zza("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return zzes.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        q.e(String.valueOf(i5).length() + 15, i5, "negative size: ");
        return null;
    }
}
