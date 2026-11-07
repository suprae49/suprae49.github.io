package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class HexDumpUtils {
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static String dump(byte[] bArr, int i4, int i5, boolean z4) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i4 < 0 || i5 <= 0 || i4 + i5 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder(((i5 + 15) / 16) * (z4 ? 75 : 57));
        int i6 = i5;
        int i7 = 0;
        int i8 = 0;
        while (i6 > 0) {
            if (i7 == 0) {
                if (i5 < 65536) {
                    sb.append(String.format("%04X:", Integer.valueOf(i4)));
                } else {
                    sb.append(String.format("%08X:", Integer.valueOf(i4)));
                }
                i8 = i4;
            } else if (i7 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i4] & 255)));
            i6--;
            i7++;
            if (z4 && (i7 == 16 || i6 == 0)) {
                int i9 = 16 - i7;
                if (i9 > 0) {
                    for (int i10 = 0; i10 < i9; i10++) {
                        sb.append("   ");
                    }
                }
                if (i9 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i11 = 0; i11 < i7; i11++) {
                    char c4 = (char) bArr[i8 + i11];
                    if (c4 < ' ' || c4 > '~') {
                        c4 = '.';
                    }
                    sb.append(c4);
                }
            }
            if (i7 == 16 || i6 == 0) {
                sb.append('\n');
                i7 = 0;
            }
            i4++;
        }
        return sb.toString();
    }
}
