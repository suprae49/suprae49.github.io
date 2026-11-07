package com.google.android.gms.common.util;

import androidx.fragment.app.q;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @KeepForSdk
    public static String bytesToStringLowercase(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i4 = 0;
        for (byte b5 : bArr) {
            char[] cArr2 = zzb;
            cArr[i4] = cArr2[(b5 & 255) >>> 4];
            cArr[i4 + 1] = cArr2[b5 & 15];
            i4 += 2;
        }
        return new String(cArr);
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] bArr, boolean z4) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i4 = 0; i4 < length && (!z4 || i4 != length - 1 || (bArr[i4] & 255) != 0); i4++) {
            char[] cArr = zza;
            sb.append(cArr[(bArr[i4] & 240) >>> 4]);
            sb.append(cArr[bArr[i4] & 15]);
        }
        return sb.toString();
    }

    @KeepForSdk
    public static byte[] stringToBytes(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            q.q("Hex string has odd number of characters");
            return null;
        }
        byte[] bArr = new byte[length / 2];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 2;
            bArr[i4 / 2] = (byte) Integer.parseInt(str.substring(i4, i5), 16);
            i4 = i5;
        }
        return bArr;
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }
}
