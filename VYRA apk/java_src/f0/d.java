package f0;

import android.graphics.Path;
import android.util.Log;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f2071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f2072b;

    public d(d dVar) {
        this.f2071a = dVar.f2071a;
        float[] fArr = dVar.f2072b;
        this.f2072b = h0.p(fArr, fArr.length);
    }

    public static void a(Path path, float f, float f4, float f5, float f6, float f7, float f8, float f9, boolean z4, boolean z5) {
        double d5;
        double d6;
        double radians = Math.toRadians(f9);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d7 = f;
        double d8 = f4;
        double d9 = f7;
        double d10 = ((d8 * dSin) + (d7 * dCos)) / d9;
        double d11 = f8;
        double d12 = ((d8 * dCos) + (((double) (-f)) * dSin)) / d11;
        double d13 = f6;
        double d14 = ((d13 * dSin) + (((double) f5) * dCos)) / d9;
        double d15 = ((d13 * dCos) + (((double) (-f5)) * dSin)) / d11;
        double d16 = d10 - d14;
        double d17 = d12 - d15;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = (d12 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d20);
            float fSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            a(path, f, f4, f5, f6, f7 * fSqrt, fSqrt * f8, f9, z4, z5);
            return;
        }
        double dSqrt = Math.sqrt(d21);
        double d22 = dSqrt * d16;
        double d23 = dSqrt * d17;
        if (z4 == z5) {
            d5 = d18 - d23;
            d6 = d19 + d22;
        } else {
            d5 = d18 + d23;
            d6 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d12 - d6, d10 - d5);
        double dAtan3 = Math.atan2(d15 - d6, d14 - d5) - dAtan2;
        if (z5 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d5 * d9;
        double d25 = d6 * d11;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d9;
        double d29 = d28 * dCos2;
        double d30 = d11 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d11 * dCos2;
        double d34 = dAtan3 / ((double) iCeil);
        double d35 = (dCos3 * d33) + (dSin3 * d32);
        double d36 = d7;
        double d37 = d8;
        int i4 = 0;
        double d38 = dAtan2;
        while (i4 < iCeil) {
            double d39 = d38 + d34;
            double dSin4 = Math.sin(d39);
            double dCos4 = Math.cos(d39);
            int i5 = iCeil;
            double d40 = (((d9 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d41 = (d33 * dSin4) + (d9 * dSin2 * dCos4) + d27;
            double d42 = (d29 * dSin4) - (d30 * dCos4);
            double d43 = (dCos4 * d33) + (dSin4 * d32);
            double d44 = d39 - d38;
            double dTan = Math.tan(d44 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d44)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d31 * dSqrt2) + d36), (float) ((d35 * dSqrt2) + d37), (float) (d40 - (dSqrt2 * d42)), (float) (d41 - (dSqrt2 * d43)), (float) d40, (float) d41);
            i4++;
            d37 = d41;
            dCos2 = dCos2;
            d32 = d32;
            d38 = d39;
            d35 = d43;
            d36 = d40;
            iCeil = i5;
            d31 = d42;
            d34 = d34;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(d[] dVarArr, Path path) {
        int i4;
        float f;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        d[] dVarArr2 = dVarArr;
        float[] fArr = new float[6];
        int length = dVarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c4 = 'm';
        while (i6 < length) {
            d dVar = dVarArr2[i6];
            char c5 = dVar.f2071a;
            float[] fArr2 = dVar.f2072b;
            float f13 = fArr[i5];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            int i7 = i5;
            float f18 = fArr[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i4 = 7;
                    break;
                case 'C':
                case 'c':
                    i4 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i4 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i4 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i4 = 2;
                    break;
            }
            float f19 = f17;
            float f20 = f18;
            float f21 = f13;
            float f22 = f14;
            int i8 = i7;
            while (i8 < fArr2.length) {
                if (c5 == 'A') {
                    fArr2 = fArr2;
                    i8 = i8;
                    dVar = dVar;
                    float f23 = f22;
                    i6 = i6;
                    int i9 = i8 + 5;
                    int i10 = i8 + 6;
                    a(path, f21, f23, fArr2[i9], fArr2[i10], fArr2[i8], fArr2[i8 + 1], fArr2[i8 + 2], fArr2[i8 + 3] != 0.0f ? 1 : i7, fArr2[i8 + 4] != 0.0f ? 1 : i7);
                    f15 = fArr2[i9];
                    f = fArr2[i10];
                    f16 = f;
                    f4 = f15;
                } else if (c5 == 'C') {
                    fArr2 = fArr2;
                    i8 = i8;
                    i6 = i6;
                    dVar = dVar;
                    int i11 = i8 + 2;
                    int i12 = i8 + 3;
                    int i13 = i8 + 4;
                    int i14 = i8 + 5;
                    path.cubicTo(fArr2[i8], fArr2[i8 + 1], fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                    float f24 = fArr2[i13];
                    float f25 = fArr2[i14];
                    f15 = fArr2[i11];
                    f16 = fArr2[i12];
                    f = f25;
                    f4 = f24;
                } else if (c5 == 'H') {
                    fArr2 = fArr2;
                    i8 = i8;
                    dVar = dVar;
                    f = f22;
                    i6 = i6;
                    path.lineTo(fArr2[i8], f);
                    f4 = fArr2[i8];
                } else if (c5 == 'Q') {
                    fArr2 = fArr2;
                    i8 = i8;
                    i6 = i6;
                    dVar = dVar;
                    int i15 = i8 + 1;
                    int i16 = i8 + 2;
                    int i17 = i8 + 3;
                    path.quadTo(fArr2[i8], fArr2[i15], fArr2[i16], fArr2[i17]);
                    float f26 = fArr2[i8];
                    float f27 = fArr2[i15];
                    float f28 = fArr2[i16];
                    float f29 = fArr2[i17];
                    f15 = f26;
                    f16 = f27;
                    f4 = f28;
                    f = f29;
                } else if (c5 == 'V') {
                    fArr2 = fArr2;
                    i8 = i8;
                    i6 = i6;
                    dVar = dVar;
                    f4 = f21;
                    path.lineTo(f4, fArr2[i8]);
                    f = fArr2[i8];
                } else if (c5 != 'a') {
                    if (c5 == 'c') {
                        fArr2 = fArr2;
                        i8 = i8;
                        int i18 = i8 + 2;
                        int i19 = i8 + 3;
                        int i20 = i8 + 4;
                        int i21 = i8 + 5;
                        path.rCubicTo(fArr2[i8], fArr2[i8 + 1], fArr2[i18], fArr2[i19], fArr2[i20], fArr2[i21]);
                        float f30 = fArr2[i18] + f21;
                        float f31 = fArr2[i19] + f22;
                        f21 += fArr2[i20];
                        f22 += fArr2[i21];
                        f15 = f30;
                        f16 = f31;
                    } else if (c5 != 'h') {
                        if (c5 != 'q') {
                            if (c5 != 'v') {
                                if (c5 == 'L') {
                                    fArr2 = fArr2;
                                    i8 = i8;
                                    int i22 = i8 + 1;
                                    path.lineTo(fArr2[i8], fArr2[i22]);
                                    f4 = fArr2[i8];
                                    f = fArr2[i22];
                                } else if (c5 == 'M') {
                                    fArr2 = fArr2;
                                    i8 = i8;
                                    f4 = fArr2[i8];
                                    f = fArr2[i8 + 1];
                                    if (i8 > 0) {
                                        path.lineTo(f4, f);
                                    } else {
                                        path.moveTo(f4, f);
                                        f19 = f4;
                                        f20 = f;
                                    }
                                } else if (c5 == 'S') {
                                    fArr2 = fArr2;
                                    i8 = i8;
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f21 = (f21 * 2.0f) - f15;
                                        f22 = (f22 * 2.0f) - f16;
                                    }
                                    float f32 = f21;
                                    float f33 = f22;
                                    int i23 = i8 + 1;
                                    int i24 = i8 + 2;
                                    int i25 = i8 + 3;
                                    path.cubicTo(f32, f33, fArr2[i8], fArr2[i23], fArr2[i24], fArr2[i25]);
                                    f15 = fArr2[i8];
                                    f16 = fArr2[i23];
                                    f4 = fArr2[i24];
                                    f = fArr2[i25];
                                } else if (c5 == 'T') {
                                    fArr2 = fArr2;
                                    i8 = i8;
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f21 = (f21 * 2.0f) - f15;
                                        f22 = (f22 * 2.0f) - f16;
                                    }
                                    int i26 = i8 + 1;
                                    path.quadTo(f21, f22, fArr2[i8], fArr2[i26]);
                                    f4 = fArr2[i8];
                                    f = fArr2[i26];
                                    dVar = dVar;
                                    f15 = f21;
                                    f16 = f22;
                                } else if (c5 == 'l') {
                                    fArr2 = fArr2;
                                    i8 = i8;
                                    int i27 = i8 + 1;
                                    path.rLineTo(fArr2[i8], fArr2[i27]);
                                    f21 += fArr2[i8];
                                    f8 = fArr2[i27];
                                } else if (c5 == 'm') {
                                    fArr2 = fArr2;
                                    i8 = i8;
                                    float f34 = fArr2[i8];
                                    f21 += f34;
                                    float f35 = fArr2[i8 + 1];
                                    f22 += f35;
                                    if (i8 > 0) {
                                        path.rLineTo(f34, f35);
                                    } else {
                                        path.rMoveTo(f34, f35);
                                        dVar = dVar;
                                        f4 = f21;
                                        f19 = f4;
                                        f = f22;
                                        f20 = f;
                                    }
                                } else if (c5 != 's') {
                                    if (c5 != 't') {
                                        f4 = f21;
                                    } else {
                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                            f11 = f21 - f15;
                                            f12 = f22 - f16;
                                        } else {
                                            f12 = 0.0f;
                                            f11 = 0.0f;
                                        }
                                        int i28 = i8 + 1;
                                        path.rQuadTo(f11, f12, fArr2[i8], fArr2[i28]);
                                        float f36 = f11 + f21;
                                        float f37 = f12 + f22;
                                        float f38 = f21 + fArr2[i8];
                                        f22 += fArr2[i28];
                                        f16 = f37;
                                        f4 = f38;
                                        f15 = f36;
                                    }
                                    f = f22;
                                } else {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f9 = f22 - f16;
                                        f10 = f21 - f15;
                                    } else {
                                        f10 = 0.0f;
                                        f9 = 0.0f;
                                    }
                                    int i29 = i8;
                                    int i30 = i29 + 1;
                                    int i31 = i29 + 2;
                                    int i32 = i29 + 3;
                                    fArr2 = fArr2;
                                    i8 = i29;
                                    path.rCubicTo(f10, f9, fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                                    f5 = fArr2[i8] + f21;
                                    f6 = fArr2[i30] + f22;
                                    f21 += fArr2[i31];
                                    f7 = fArr2[i32];
                                }
                                dVar = dVar;
                            } else {
                                fArr2 = fArr2;
                                i8 = i8;
                                path.rLineTo(0.0f, fArr2[i8]);
                                f8 = fArr2[i8];
                            }
                            f22 += f8;
                        } else {
                            fArr2 = fArr2;
                            i8 = i8;
                            int i33 = i8 + 1;
                            int i34 = i8 + 2;
                            int i35 = i8 + 3;
                            path.rQuadTo(fArr2[i8], fArr2[i33], fArr2[i34], fArr2[i35]);
                            f5 = fArr2[i8] + f21;
                            f6 = fArr2[i33] + f22;
                            f21 += fArr2[i34];
                            f7 = fArr2[i35];
                        }
                        f22 += f7;
                        f15 = f5;
                        f16 = f6;
                    } else {
                        fArr2 = fArr2;
                        i8 = i8;
                        path.rLineTo(fArr2[i8], 0.0f);
                        f21 += fArr2[i8];
                    }
                    dVar = dVar;
                    f4 = f21;
                    f = f22;
                } else {
                    fArr2 = fArr2;
                    i8 = i8;
                    int i36 = i8 + 5;
                    float f39 = fArr2[i36] + f21;
                    int i37 = i8 + 6;
                    float f40 = fArr2[i37] + f22;
                    dVar = dVar;
                    float f41 = f21;
                    float f42 = f22;
                    i6 = i6;
                    a(path, f41, f42, f39, f40, fArr2[i8], fArr2[i8 + 1], fArr2[i8 + 2], fArr2[i8 + 3] != 0.0f ? 1 : i7, fArr2[i8 + 4] != 0.0f ? 1 : i7);
                    f4 = f41 + fArr2[i36];
                    f = f42 + fArr2[i37];
                    f15 = f4;
                    f16 = f;
                }
                i8 += i4;
                path = path;
                dVar = dVar;
                c5 = c5;
                i6 = i6;
                f21 = f4;
                f22 = f;
                c4 = c5;
                fArr2 = fArr2;
            }
            fArr[i7] = f21;
            fArr[1] = f22;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f19;
            fArr[5] = f20;
            c4 = dVar.f2071a;
            i6++;
            dVarArr2 = dVarArr;
            i5 = i7;
        }
    }

    public d(char c4, float[] fArr) {
        this.f2071a = c4;
        this.f2072b = fArr;
    }
}
