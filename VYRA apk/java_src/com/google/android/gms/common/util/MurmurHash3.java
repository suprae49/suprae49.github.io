package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i4, int i5, int i6) {
        int i7;
        int i8 = i4;
        while (true) {
            i7 = (i5 & (-4)) + i4;
            if (i8 >= i7) {
                break;
            }
            int i9 = ((bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | (bArr[i8 + 3] << 24)) * (-862048943);
            int i10 = i6 ^ (((i9 >>> 17) | (i9 << 15)) * 461845907);
            i6 = (((i10 >>> 19) | (i10 << 13)) * 5) - 430675100;
            i8 += 4;
        }
        int i11 = i5 & 3;
        int i12 = 0;
        if (i11 == 1) {
            int i13 = ((bArr[i7] & 255) | i12) * (-862048943);
            i6 ^= ((i13 >>> 17) | (i13 << 15)) * 461845907;
        } else {
            if (i11 != 2) {
                i12 = i11 == 3 ? (bArr[i7 + 2] & 255) << 16 : 0;
            }
            i12 |= (bArr[i7 + 1] & 255) << 8;
            int i14 = ((bArr[i7] & 255) | i12) * (-862048943);
            i6 ^= ((i14 >>> 17) | (i14 << 15)) * 461845907;
        }
        int i15 = i6 ^ i5;
        int i16 = (i15 ^ (i15 >>> 16)) * (-2048144789);
        int i17 = (i16 ^ (i16 >>> 13)) * (-1028477387);
        return i17 ^ (i17 >>> 16);
    }
}
