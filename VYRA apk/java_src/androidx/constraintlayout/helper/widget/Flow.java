package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import u.c;
import u.d;
import u.e;
import u.f;
import u.g;
import u.h;
import v.b;
import x.r;
import x.t;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g f450o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new int[32];
        this.f4498l = new HashMap();
        this.f4494h = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f3829s0 = 0;
        gVar.f3830t0 = 0;
        gVar.f3831u0 = 0;
        gVar.v0 = 0;
        gVar.f3832w0 = 0;
        gVar.f3833x0 = 0;
        gVar.f3834y0 = false;
        gVar.f3835z0 = 0;
        gVar.A0 = 0;
        gVar.B0 = new b();
        gVar.C0 = null;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = -1;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0.5f;
        gVar.P0 = 0;
        gVar.Q0 = 0;
        gVar.R0 = 2;
        gVar.S0 = 2;
        gVar.T0 = 0;
        gVar.U0 = -1;
        gVar.V0 = 0;
        gVar.W0 = new ArrayList();
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.Z0 = null;
        gVar.f3828b1 = 0;
        this.f450o = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4636b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == 0) {
                    this.f450o.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f450o;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f3829s0 = dimensionPixelSize;
                    gVar2.f3830t0 = dimensionPixelSize;
                    gVar2.f3831u0 = dimensionPixelSize;
                    gVar2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f450o;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f3831u0 = dimensionPixelSize2;
                    gVar3.f3832w0 = dimensionPixelSize2;
                    gVar3.f3833x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f450o.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f450o.f3832w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f450o.f3829s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f450o.f3833x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f450o.f3830t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f450o.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f450o.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f450o.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f450o.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f450o.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f450o.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f450o.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f450o.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f450o.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f450o.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f450o.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f450o.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f450o.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f450o.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f450o.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f450o.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f450o.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f450o.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f4495i = this.f450o;
        i();
    }

    @Override // x.c
    public final void h(d dVar, boolean z4) {
        g gVar = this.f450o;
        int i4 = gVar.f3831u0;
        if (i4 > 0 || gVar.v0 > 0) {
            if (z4) {
                gVar.f3832w0 = gVar.v0;
                gVar.f3833x0 = i4;
            } else {
                gVar.f3832w0 = i4;
                gVar.f3833x0 = gVar.v0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:111:0x0202  */
    /* JADX WARN: Code duplicated, block: B:114:0x0217  */
    /* JADX WARN: Code duplicated, block: B:116:0x021f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0230  */
    /* JADX WARN: Code duplicated, block: B:134:0x0253  */
    /* JADX WARN: Code duplicated, block: B:136:0x026c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0270  */
    /* JADX WARN: Code duplicated, block: B:147:0x0299  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:167:0x0314  */
    /* JADX WARN: Code duplicated, block: B:169:0x031d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0321  */
    /* JADX WARN: Code duplicated, block: B:172:0x0332  */
    /* JADX WARN: Code duplicated, block: B:175:0x0354  */
    /* JADX WARN: Code duplicated, block: B:180:0x036b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0381 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    /* JADX WARN: Code duplicated, block: B:185:0x0388 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x038a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0392  */
    /* JADX WARN: Code duplicated, block: B:193:0x039a  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:200:0x03ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:208:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:214:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:223:0x03dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x03df  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:230:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:239:0x0410  */
    /* JADX WARN: Code duplicated, block: B:242:0x0417  */
    /* JADX WARN: Code duplicated, block: B:244:0x041a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0420  */
    /* JADX WARN: Code duplicated, block: B:257:0x043c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0450  */
    /* JADX WARN: Code duplicated, block: B:267:0x045e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0464 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:270:0x0466  */
    /* JADX WARN: Code duplicated, block: B:275:0x0476  */
    /* JADX WARN: Code duplicated, block: B:277:0x047c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:278:0x047e  */
    /* JADX WARN: Code duplicated, block: B:291:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:294:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:296:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:298:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:300:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:317:0x0517  */
    /* JADX WARN: Code duplicated, block: B:319:0x052c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:320:0x052e  */
    /* JADX WARN: Code duplicated, block: B:322:0x053c  */
    /* JADX WARN: Code duplicated, block: B:324:0x0541  */
    /* JADX WARN: Code duplicated, block: B:326:0x054f  */
    /* JADX WARN: Code duplicated, block: B:343:0x0572  */
    /* JADX WARN: Code duplicated, block: B:345:0x0589  */
    /* JADX WARN: Code duplicated, block: B:347:0x058d  */
    /* JADX WARN: Code duplicated, block: B:355:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:360:0x05be  */
    /* JADX WARN: Code duplicated, block: B:362:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:363:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:367:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:369:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:371:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:372:0x060e  */
    /* JADX WARN: Code duplicated, block: B:375:0x0630  */
    /* JADX WARN: Code duplicated, block: B:377:0x0639  */
    /* JADX WARN: Code duplicated, block: B:379:0x063d  */
    /* JADX WARN: Code duplicated, block: B:380:0x064e  */
    /* JADX WARN: Code duplicated, block: B:383:0x0670  */
    /* JADX WARN: Code duplicated, block: B:387:0x0686  */
    /* JADX WARN: Code duplicated, block: B:390:0x069c  */
    /* JADX WARN: Code duplicated, block: B:392:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:393:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:396:0x06f7 A[LOOP:18: B:395:0x06f5->B:396:0x06f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:401:0x0721 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:402:0x0723  */
    /* JADX WARN: Code duplicated, block: B:403:0x0728 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:404:0x072a  */
    /* JADX WARN: Code duplicated, block: B:405:0x072c  */
    /* JADX WARN: Code duplicated, block: B:407:0x072f  */
    /* JADX WARN: Code duplicated, block: B:408:0x0732 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:409:0x0734  */
    /* JADX WARN: Code duplicated, block: B:410:0x073b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:411:0x073d  */
    /* JADX WARN: Code duplicated, block: B:412:0x073f  */
    /* JADX WARN: Code duplicated, block: B:415:0x074e  */
    /* JADX WARN: Code duplicated, block: B:416:0x0750  */
    /* JADX WARN: Code duplicated, block: B:426:0x0108 A[EDGE_INSN: B:426:0x0108->B:61:0x0108 BREAK  A[LOOP:1: B:55:0x00f1->B:60:0x0103], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:431:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x03a0 A[EDGE_INSN: B:445:0x03a0->B:195:0x03a0 BREAK  A[LOOP:7: B:184:0x0386->B:194:0x039d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x039d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:454:0x0493 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x03c3 A[EDGE_INSN: B:475:0x03c3->B:210:0x03c3 BREAK  A[LOOP:13: B:199:0x03a9->B:209:0x03c0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x013c  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x0153  */
    /* JADX WARN: Code duplicated, block: B:84:0x0158  */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // x.t
    public final void j(g gVar, int i4, int i5) {
        c cVar;
        c cVar2;
        c cVar3;
        ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        d[] dVarArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        d[] dVarArr2;
        int i19;
        d[] dVarArr3;
        int i20;
        int i21;
        int[] iArr2;
        int i22;
        int i23;
        f fVar;
        int i24;
        char c4;
        char c5;
        int i25;
        int i26;
        int iMin;
        boolean z4;
        int i27;
        d[] dVarArr4;
        int i28;
        f fVar2;
        int i29;
        int i30;
        int i31;
        d dVar;
        int iT;
        boolean z5;
        int i32;
        int size;
        boolean z6;
        int i33;
        int i34;
        int i35;
        int i36;
        c cVar4;
        c cVar5;
        c cVar6;
        c cVar7;
        int i37;
        int iMax;
        int i38;
        f fVar3;
        int iD;
        int iC;
        int i39;
        f fVar4;
        int i40;
        int i41;
        d dVar2;
        int iU;
        boolean z7;
        int i42;
        d[] dVarArr5;
        int i43;
        int i44;
        int iCeil;
        int iCeil2;
        int i45;
        int i46;
        int i47;
        d dVar3;
        int iT2;
        boolean z8;
        d[] dVarArr6;
        Object obj;
        d[] dVarArr7;
        int i48;
        int i49;
        int iU2;
        int i50;
        int iT3;
        d dVar4;
        d dVar5;
        int i51;
        int i52;
        d dVar6;
        d dVar7;
        d dVar8;
        int i53;
        int i54;
        d dVar9;
        int iU3;
        int i55;
        int i56;
        d[] dVarArr8;
        f fVar5;
        char c6;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        d dVar10;
        int iT4;
        int i62;
        boolean z9;
        int i63;
        int size2;
        boolean z10;
        int i64;
        int i65;
        int i66;
        int i67;
        c cVar8;
        c cVar9;
        c cVar10;
        c cVar11;
        int i68;
        int iMax2;
        int i69;
        f fVar6;
        int iD2;
        int iC2;
        int i70;
        f fVar7;
        int i71;
        int i72;
        int i73;
        d dVar11;
        int iU4;
        int i74;
        int i75;
        boolean z11;
        int i76;
        int i77;
        int i78;
        int i79;
        int i80;
        d dVar12;
        d[] dVarArr9;
        c cVar12;
        c cVar13;
        c cVar14;
        ArrayList arrayList2;
        int i81;
        int mode = View.MeasureSpec.getMode(i4);
        int size3 = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size4 = View.MeasureSpec.getSize(i5);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr3 = gVar.f3791p0;
        c cVar15 = gVar.J;
        c cVar16 = gVar.I;
        c cVar17 = gVar.K;
        c cVar18 = gVar.L;
        ArrayList arrayList3 = gVar.W0;
        if (gVar.f3842r0 > 0) {
            b bVar = gVar.B0;
            d dVar13 = gVar.T;
            x.f fVar8 = dVar13 != null ? ((e) dVar13).f3806u0 : null;
            if (fVar8 == null) {
                gVar.f3835z0 = 0;
                gVar.A0 = 0;
                gVar.f3834y0 = false;
            } else {
                int i82 = 0;
                while (i82 < gVar.f3842r0) {
                    d dVar14 = gVar.f3841q0[i82];
                    if (dVar14 == null) {
                        cVar12 = cVar16;
                    } else {
                        cVar12 = cVar16;
                        if (!(dVar14 instanceof h)) {
                            cVar13 = cVar17;
                            int iJ = dVar14.j(0);
                            cVar14 = cVar18;
                            int iJ2 = dVar14.j(1);
                            arrayList2 = arrayList3;
                            if (iJ == 3) {
                                i81 = i82;
                                if (dVar14.f3793r == 1 || iJ2 != 3 || dVar14.f3794s == 1) {
                                }
                            } else {
                                i81 = i82;
                            }
                            if (iJ == 3) {
                                iJ = 2;
                            }
                            if (iJ2 == 3) {
                                iJ2 = 2;
                            }
                            bVar.f4228a = iJ;
                            bVar.f4229b = iJ2;
                            bVar.f4230c = dVar14.q();
                            bVar.f4231d = dVar14.k();
                            fVar8.b(dVar14, bVar);
                            dVar14.O(bVar.f4232e);
                            dVar14.L(bVar.f);
                            dVar14.I(bVar.f4233g);
                        }
                        i82 = i81 + 1;
                        cVar16 = cVar12;
                        cVar17 = cVar13;
                        cVar18 = cVar14;
                        arrayList3 = arrayList2;
                    }
                    cVar13 = cVar17;
                    cVar14 = cVar18;
                    arrayList2 = arrayList3;
                    i81 = i82;
                    i82 = i81 + 1;
                    cVar16 = cVar12;
                    cVar17 = cVar13;
                    cVar18 = cVar14;
                    arrayList3 = arrayList2;
                }
                cVar = cVar16;
                cVar2 = cVar17;
                cVar3 = cVar18;
                arrayList = arrayList3;
                i6 = gVar.f3832w0;
                int i83 = gVar.f3833x0;
                i7 = gVar.f3829s0;
                i8 = gVar.f3830t0;
                iArr = new int[2];
                i9 = (size3 - i6) - i83;
                i10 = gVar.V0;
                if (i10 == 1) {
                    i9 = (size4 - i7) - i8;
                }
                i11 = i9;
                i12 = gVar.D0;
                i13 = i83;
                if (i10 == 0) {
                    if (i12 == -1) {
                        gVar.D0 = 0;
                    }
                    if (gVar.E0 == -1) {
                        gVar.E0 = 0;
                    }
                } else {
                    if (i12 == -1) {
                        gVar.D0 = 0;
                    }
                    if (gVar.E0 == -1) {
                        gVar.E0 = 0;
                    }
                }
                dVarArr = gVar.f3841q0;
                i14 = 0;
                i15 = 0;
                while (true) {
                    i16 = gVar.f3842r0;
                    i17 = i7;
                    if (i14 < i16) {
                        break;
                    }
                    if (gVar.f3841q0[i14].g0 == 8) {
                        i15++;
                    }
                    i14++;
                    i7 = i17;
                }
                if (i15 > 0) {
                    dVarArr2 = new d[i16 - i15];
                    i79 = 0;
                    i80 = 0;
                    while (i79 < gVar.f3842r0) {
                        dVar12 = gVar.f3841q0[i79];
                        dVarArr9 = dVarArr2;
                        if (dVar12.g0 != 8) {
                            dVarArr9[i80] = dVar12;
                            i80++;
                        }
                        i79++;
                        dVarArr2 = dVarArr9;
                    }
                    i18 = i80;
                } else {
                    i18 = i16;
                    dVarArr2 = dVarArr;
                }
                gVar.f3827a1 = dVarArr2;
                gVar.f3828b1 = i18;
                i19 = gVar.T0;
                if (i19 != 0) {
                    dVarArr3 = dVarArr2;
                    i20 = i18;
                    i21 = i8;
                    iArr2 = iArr;
                    i22 = size4;
                    i6 = i6;
                    i13 = i13;
                    i17 = i17;
                    i23 = gVar.V0;
                    if (i20 == 0) {
                        if (arrayList.size() == 0) {
                            fVar = new f(gVar, i23, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                            arrayList.add(fVar);
                        } else {
                            f fVar9 = (f) arrayList.get(0);
                            fVar9.f3813c = 0;
                            fVar9.f3812b = null;
                            fVar9.f3821l = 0;
                            fVar9.f3822m = 0;
                            fVar9.n = 0;
                            fVar9.f3823o = 0;
                            fVar9.f3824p = 0;
                            fVar9.f(i23, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f3832w0, gVar.f3829s0, gVar.f3833x0, gVar.f3830t0, i11);
                            fVar = fVar9;
                        }
                        for (i24 = 0; i24 < i20; i24++) {
                            fVar.a(dVarArr3[i24]);
                        }
                        c4 = 0;
                        iArr2[0] = fVar.d();
                        c5 = 1;
                        iArr2[1] = fVar.c();
                    }
                    i25 = iArr2[c4] + i6 + i13;
                    i26 = iArr2[c5] + i17 + i21;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size3 = Math.min(i25, size3);
                        } else if (mode == 0) {
                            size3 = i25;
                        } else {
                            size3 = 0;
                        }
                    }
                    if (mode2 == 1073741824) {
                        iMin = i22;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(i26, i22);
                    } else if (mode2 == 0) {
                        iMin = i26;
                    } else {
                        iMin = 0;
                    }
                    gVar.f3835z0 = size3;
                    gVar.A0 = iMin;
                    gVar.O(size3);
                    gVar.L(iMin);
                    if (gVar.f3842r0 > 0) {
                        z4 = c5;
                    } else {
                        z4 = 0;
                    }
                    gVar.f3834y0 = z4;
                } else if (i19 != 1) {
                    if (i19 != 2) {
                        dVarArr5 = dVarArr2;
                        i43 = i18;
                        i21 = i8;
                        iArr2 = iArr;
                        i22 = size4;
                        i6 = i6;
                        i13 = i13;
                        i17 = i17;
                        i44 = gVar.V0;
                        iCeil = gVar.U0;
                        if (i44 == 0) {
                            if (iCeil <= 0) {
                                i54 = 0;
                                iCeil2 = 0;
                                for (i53 = 0; i53 < i43; i53++) {
                                    if (i53 > 0) {
                                        i54 += gVar.P0;
                                    }
                                    dVar9 = dVarArr5[i53];
                                    if (dVar9 != null) {
                                        iU3 = gVar.U(dVar9, i11) + i54;
                                        if (iU3 > i11) {
                                            break;
                                        }
                                        iCeil2++;
                                        i54 = iU3;
                                    }
                                }
                            } else {
                                iCeil2 = iCeil;
                            }
                            iCeil = 0;
                        } else {
                            if (iCeil <= 0) {
                                i46 = 0;
                                i47 = 0;
                                for (i45 = 0; i45 < i43; i45++) {
                                    if (i45 > 0) {
                                        i46 += gVar.Q0;
                                    }
                                    dVar3 = dVarArr5[i45];
                                    if (dVar3 != null) {
                                        iT2 = gVar.T(dVar3, i11) + i46;
                                        if (iT2 > i11) {
                                            break;
                                        }
                                        i47++;
                                        i46 = iT2;
                                    }
                                }
                                iCeil = i47;
                            }
                            iCeil2 = 0;
                        }
                        if (gVar.Z0 == null) {
                            gVar.Z0 = new int[2];
                        }
                        z8 = (iCeil != 0 && i44 == 1) || (iCeil2 == 0 && i44 == 0);
                        while (!z8) {
                            if (i44 == 0) {
                                iCeil = (int) Math.ceil(i43 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i43 / iCeil);
                            }
                            dVarArr6 = gVar.Y0;
                            if (dVarArr6 != null || dVarArr6.length < iCeil2) {
                                obj = null;
                                gVar.Y0 = new d[iCeil2];
                            } else {
                                obj = null;
                                Arrays.fill(dVarArr6, (Object) null);
                            }
                            dVarArr7 = gVar.X0;
                            if (dVarArr7 != null || dVarArr7.length < iCeil) {
                                gVar.X0 = new d[iCeil];
                            } else {
                                Arrays.fill(dVarArr7, obj);
                            }
                            for (i48 = 0; i48 < iCeil2; i48++) {
                                for (i51 = 0; i51 < iCeil; i51++) {
                                    i52 = (i51 * iCeil2) + i48;
                                    if (i44 == 1) {
                                        i52 = (i48 * iCeil) + i51;
                                    }
                                    if (i52 < dVarArr5.length && (dVar6 = dVarArr5[i52]) != null) {
                                        int iU5 = gVar.U(dVar6, i11);
                                        dVar7 = gVar.Y0[i48];
                                        if (dVar7 != null || dVar7.q() < iU5) {
                                            gVar.Y0[i48] = dVar6;
                                        }
                                        int iT5 = gVar.T(dVar6, i11);
                                        dVar8 = gVar.X0[i51];
                                        if (dVar8 != null || dVar8.k() < iT5) {
                                            gVar.X0[i51] = dVar6;
                                        }
                                    }
                                }
                            }
                            iU2 = 0;
                            for (i49 = 0; i49 < iCeil2; i49++) {
                                dVar5 = gVar.Y0[i49];
                                if (dVar5 == null) {
                                    if (i49 > 0) {
                                        iU2 += gVar.P0;
                                    }
                                    iU2 = gVar.U(dVar5, i11) + iU2;
                                }
                            }
                            iT3 = 0;
                            for (i50 = 0; i50 < iCeil; i50++) {
                                dVar4 = gVar.X0[i50];
                                if (dVar4 == null) {
                                    if (i50 > 0) {
                                        iT3 += gVar.Q0;
                                    }
                                    iT3 = gVar.T(dVar4, i11) + iT3;
                                }
                            }
                            iArr2[0] = iU2;
                            iArr2[1] = iT3;
                            if (i44 == 0) {
                                if (iU2 > i11 || iCeil2 <= 1) {
                                    z8 = true;
                                } else {
                                    iCeil2--;
                                }
                            } else if (iT3 > i11 || iCeil <= 1) {
                                z8 = true;
                            } else {
                                iCeil--;
                            }
                        }
                        c5 = 1;
                        int[] iArr4 = gVar.Z0;
                        iArr4[0] = iCeil2;
                        iArr4[1] = iCeil;
                    } else if (i19 != 3) {
                        i21 = i8;
                        iArr2 = iArr;
                        i22 = size4;
                        i6 = i6;
                        i13 = i13;
                        i17 = i17;
                    } else {
                        i55 = i18;
                        i56 = gVar.V0;
                        if (i55 == 0) {
                            i21 = i8;
                            iArr2 = iArr;
                            i22 = size4;
                            c6 = 1;
                        } else {
                            arrayList.clear();
                            dVarArr8 = dVarArr2;
                            i21 = i8;
                            iArr2 = iArr;
                            c6 = 1;
                            fVar5 = new f(gVar, i56, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                            arrayList.add(fVar5);
                            if (i56 == 0) {
                                i71 = 0;
                                i72 = 0;
                                i61 = 0;
                                i73 = 0;
                                while (i71 < i55) {
                                    i72++;
                                    dVar11 = dVarArr8[i71];
                                    iU4 = gVar.U(dVar11, i11);
                                    i74 = i56;
                                    i75 = i71;
                                    if (dVar11.f3791p0[0] == 3) {
                                        i61++;
                                    }
                                    int i84 = i61;
                                    z11 = (i73 != i11 || (gVar.P0 + i73) + iU4 > i11) && fVar5.f3812b != null;
                                    if (!z11 && i75 > 0 && (i78 = gVar.U0) > 0 && i72 > i78) {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        i76 = size4;
                                        i56 = i74;
                                        i77 = i75;
                                        fVar5 = new f(gVar, i56, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                                        fVar5.n = i77;
                                        arrayList.add(fVar5);
                                        i72 = 1;
                                    } else {
                                        i76 = size4;
                                        i56 = i74;
                                        i77 = i75;
                                        if (i77 > 0) {
                                            i73 = gVar.P0 + iU4 + i73;
                                        }
                                        fVar5.a(dVar11);
                                        i71 = i77 + 1;
                                        i61 = i84;
                                        size4 = i76;
                                    }
                                    i73 = iU4;
                                    fVar5.a(dVar11);
                                    i71 = i77 + 1;
                                    i61 = i84;
                                    size4 = i76;
                                }
                                i22 = size4;
                            } else {
                                i22 = size4;
                                i57 = 0;
                                i58 = 0;
                                i59 = 0;
                                i60 = 0;
                                while (i57 < i55) {
                                    i58++;
                                    dVar10 = dVarArr8[i57];
                                    iT4 = gVar.T(dVar10, i11);
                                    i62 = i56;
                                    if (dVar10.f3791p0[1] == 3) {
                                        i59++;
                                    }
                                    int i85 = i59;
                                    z9 = (i60 != i11 || (gVar.Q0 + i60) + iT4 > i11) && fVar5.f3812b != null;
                                    if (!z9 && i57 > 0 && (i63 = gVar.U0) > 0 && i58 > i63) {
                                        z9 = true;
                                    }
                                    if (z9) {
                                        i56 = i62;
                                        fVar5 = new f(gVar, i56, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                                        fVar5.n = i57;
                                        arrayList.add(fVar5);
                                        i58 = 1;
                                    } else {
                                        i56 = i62;
                                        if (i57 > 0) {
                                            i60 = gVar.Q0 + iT4 + i60;
                                        }
                                        fVar5.a(dVar10);
                                        i57++;
                                        i59 = i85;
                                    }
                                    i60 = iT4;
                                    fVar5.a(dVar10);
                                    i57++;
                                    i59 = i85;
                                }
                                i61 = i59;
                            }
                            size2 = arrayList.size();
                            int i86 = gVar.f3832w0;
                            int i87 = gVar.f3829s0;
                            int i88 = gVar.f3833x0;
                            int i89 = gVar.f3830t0;
                            if (iArr3[0] != 2 || iArr3[1] == 2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (i61 > 0 && z10) {
                                for (i70 = 0; i70 < size2; i70++) {
                                    fVar7 = (f) arrayList.get(i70);
                                    if (i56 == 0) {
                                        fVar7.e(i11 - fVar7.d());
                                    } else {
                                        fVar7.e(i11 - fVar7.c());
                                    }
                                }
                            }
                            i64 = i86;
                            i65 = i87;
                            i66 = i88;
                            i67 = i89;
                            cVar8 = cVar;
                            cVar9 = cVar2;
                            cVar10 = cVar3;
                            cVar11 = cVar15;
                            iMax2 = 0;
                            i69 = 0;
                            for (i68 = 0; i68 < size2; i68++) {
                                fVar6 = (f) arrayList.get(i68);
                                if (i56 == 0) {
                                    if (i68 < size2 - 1) {
                                        cVar10 = ((f) arrayList.get(i68 + 1)).f3812b.J;
                                        i67 = 0;
                                    } else {
                                        i67 = gVar.f3830t0;
                                        cVar10 = cVar3;
                                    }
                                    c cVar19 = fVar6.f3812b.L;
                                    fVar6.f(i56, cVar8, cVar11, cVar9, cVar10, i64, i65, i66, i67, i11);
                                    iMax2 = Math.max(iMax2, fVar6.d());
                                    iC2 = fVar6.c() + i69;
                                    if (i68 > 0) {
                                        iC2 += gVar.Q0;
                                    }
                                    i69 = iC2;
                                    cVar11 = cVar19;
                                    i65 = 0;
                                } else {
                                    if (i68 < size2 - 1) {
                                        cVar9 = ((f) arrayList.get(i68 + 1)).f3812b.I;
                                        i66 = 0;
                                    } else {
                                        i66 = gVar.f3833x0;
                                        cVar9 = cVar2;
                                    }
                                    c cVar20 = fVar6.f3812b.K;
                                    fVar6.f(i56, cVar8, cVar11, cVar9, cVar10, i64, i65, i66, i67, i11);
                                    iD2 = fVar6.d() + iMax2;
                                    int iMax3 = Math.max(i69, fVar6.c());
                                    if (i68 > 0) {
                                        iD2 += gVar.P0;
                                    }
                                    i69 = iMax3;
                                    iMax2 = iD2;
                                    cVar8 = cVar20;
                                    i64 = 0;
                                }
                            }
                            iArr2[0] = iMax2;
                            iArr2[1] = i69;
                        }
                        c5 = c6;
                    }
                    c4 = 0;
                    i25 = iArr2[c4] + i6 + i13;
                    i26 = iArr2[c5] + i17 + i21;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size3 = Math.min(i25, size3);
                        } else if (mode == 0) {
                            size3 = i25;
                        } else {
                            size3 = 0;
                        }
                    }
                    if (mode2 == 1073741824) {
                        iMin = i22;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(i26, i22);
                    } else if (mode2 == 0) {
                        iMin = i26;
                    } else {
                        iMin = 0;
                    }
                    gVar.f3835z0 = size3;
                    gVar.A0 = iMin;
                    gVar.O(size3);
                    gVar.L(iMin);
                    if (gVar.f3842r0 > 0) {
                        z4 = c5;
                    } else {
                        z4 = 0;
                    }
                    gVar.f3834y0 = z4;
                } else {
                    i21 = i8;
                    iArr2 = iArr;
                    i22 = size4;
                    i6 = i6;
                    i13 = i13;
                    i17 = i17;
                    i27 = i18;
                    dVarArr4 = dVarArr2;
                    i28 = gVar.V0;
                    if (i27 != 0) {
                        arrayList.clear();
                        fVar2 = new f(gVar, i28, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                        arrayList.add(fVar2);
                        if (i28 == 0) {
                            i40 = 0;
                            i30 = 0;
                            i41 = 0;
                            while (i40 < i27) {
                                dVar2 = dVarArr4[i40];
                                iU = gVar.U(dVar2, i11);
                                if (dVar2.f3791p0[0] == 3) {
                                    i30++;
                                }
                                int i90 = i30;
                                z7 = (i41 != i11 || (gVar.P0 + i41) + iU > i11) && fVar2.f3812b != null;
                                if (!z7 && i40 > 0 && (i42 = gVar.U0) > 0 && i40 % i42 == 0) {
                                    z7 = true;
                                }
                                if (z7) {
                                    fVar2 = new f(gVar, i28, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                                    fVar2.n = i40;
                                    arrayList.add(fVar2);
                                } else {
                                    if (i40 > 0) {
                                        i41 = gVar.P0 + iU + i41;
                                    }
                                    fVar2.a(dVar2);
                                    i40++;
                                    i30 = i90;
                                }
                                i41 = iU;
                                fVar2.a(dVar2);
                                i40++;
                                i30 = i90;
                            }
                        } else {
                            i29 = 0;
                            i30 = 0;
                            i31 = 0;
                            while (i29 < i27) {
                                dVar = dVarArr4[i29];
                                iT = gVar.T(dVar, i11);
                                if (dVar.f3791p0[1] == 3) {
                                    i30++;
                                }
                                int i91 = i30;
                                z5 = (i31 != i11 || (gVar.Q0 + i31) + iT > i11) && fVar2.f3812b != null;
                                if (!z5 && i29 > 0 && (i32 = gVar.U0) > 0 && i29 % i32 == 0) {
                                    z5 = true;
                                }
                                if (z5) {
                                    fVar2 = new f(gVar, i28, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                                    fVar2.n = i29;
                                    arrayList.add(fVar2);
                                } else {
                                    if (i29 > 0) {
                                        i31 = gVar.Q0 + iT + i31;
                                    }
                                    fVar2.a(dVar);
                                    i29++;
                                    i30 = i91;
                                }
                                i31 = iT;
                                fVar2.a(dVar);
                                i29++;
                                i30 = i91;
                            }
                        }
                        size = arrayList.size();
                        int i92 = gVar.f3832w0;
                        int i93 = gVar.f3829s0;
                        int i94 = gVar.f3833x0;
                        int i95 = gVar.f3830t0;
                        if (iArr3[0] != 2 || iArr3[1] == 2) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i30 > 0 && z6) {
                            for (i39 = 0; i39 < size; i39++) {
                                fVar4 = (f) arrayList.get(i39);
                                if (i28 == 0) {
                                    fVar4.e(i11 - fVar4.d());
                                } else {
                                    fVar4.e(i11 - fVar4.c());
                                }
                            }
                        }
                        i33 = i92;
                        i34 = i93;
                        i35 = i94;
                        i36 = i95;
                        cVar4 = cVar;
                        cVar5 = cVar2;
                        cVar6 = cVar3;
                        cVar7 = cVar15;
                        iMax = 0;
                        i38 = 0;
                        for (i37 = 0; i37 < size; i37++) {
                            fVar3 = (f) arrayList.get(i37);
                            if (i28 == 0) {
                                if (i37 < size - 1) {
                                    cVar6 = ((f) arrayList.get(i37 + 1)).f3812b.J;
                                    i36 = 0;
                                } else {
                                    i36 = gVar.f3830t0;
                                    cVar6 = cVar3;
                                }
                                c cVar21 = fVar3.f3812b.L;
                                fVar3.f(i28, cVar4, cVar7, cVar5, cVar6, i33, i34, i35, i36, i11);
                                iMax = Math.max(iMax, fVar3.d());
                                iC = fVar3.c() + i38;
                                if (i37 > 0) {
                                    iC += gVar.Q0;
                                }
                                i38 = iC;
                                cVar7 = cVar21;
                                i34 = 0;
                            } else {
                                if (i37 < size - 1) {
                                    cVar5 = ((f) arrayList.get(i37 + 1)).f3812b.I;
                                    i35 = 0;
                                } else {
                                    i35 = gVar.f3833x0;
                                    cVar5 = cVar2;
                                }
                                c cVar22 = fVar3.f3812b.K;
                                fVar3.f(i28, cVar4, cVar7, cVar5, cVar6, i33, i34, i35, i36, i11);
                                iD = fVar3.d() + iMax;
                                int iMax4 = Math.max(i38, fVar3.c());
                                if (i37 > 0) {
                                    iD += gVar.P0;
                                }
                                i38 = iMax4;
                                iMax = iD;
                                cVar4 = cVar22;
                                i33 = 0;
                            }
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i38;
                    }
                }
                c5 = 1;
                c4 = 0;
                i25 = iArr2[c4] + i6 + i13;
                i26 = iArr2[c5] + i17 + i21;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i25, size3);
                    } else if (mode == 0) {
                        size3 = i25;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i22;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i26, i22);
                } else if (mode2 == 0) {
                    iMin = i26;
                } else {
                    iMin = 0;
                }
                gVar.f3835z0 = size3;
                gVar.A0 = iMin;
                gVar.O(size3);
                gVar.L(iMin);
                if (gVar.f3842r0 > 0) {
                    z4 = c5;
                } else {
                    z4 = 0;
                }
                gVar.f3834y0 = z4;
            }
        } else {
            cVar = cVar16;
            cVar2 = cVar17;
            cVar3 = cVar18;
            arrayList = arrayList3;
            i6 = gVar.f3832w0;
            int i810 = gVar.f3833x0;
            i7 = gVar.f3829s0;
            i8 = gVar.f3830t0;
            iArr = new int[2];
            i9 = (size3 - i6) - i810;
            i10 = gVar.V0;
            if (i10 == 1) {
                i9 = (size4 - i7) - i8;
            }
            i11 = i9;
            i12 = gVar.D0;
            i13 = i810;
            if (i10 == 0) {
                if (i12 == -1) {
                    gVar.D0 = 0;
                }
                if (gVar.E0 == -1) {
                    gVar.E0 = 0;
                }
            } else {
                if (i12 == -1) {
                    gVar.D0 = 0;
                }
                if (gVar.E0 == -1) {
                    gVar.E0 = 0;
                }
            }
            dVarArr = gVar.f3841q0;
            i14 = 0;
            i15 = 0;
            while (true) {
                i16 = gVar.f3842r0;
                i17 = i7;
                if (i14 < i16) {
                    break;
                    break;
                }
                if (gVar.f3841q0[i14].g0 == 8) {
                    i15++;
                }
                i14++;
                i7 = i17;
            }
            if (i15 > 0) {
                dVarArr2 = new d[i16 - i15];
                i79 = 0;
                i80 = 0;
                while (i79 < gVar.f3842r0) {
                    dVar12 = gVar.f3841q0[i79];
                    dVarArr9 = dVarArr2;
                    if (dVar12.g0 != 8) {
                        dVarArr9[i80] = dVar12;
                        i80++;
                    }
                    i79++;
                    dVarArr2 = dVarArr9;
                }
                i18 = i80;
            } else {
                i18 = i16;
                dVarArr2 = dVarArr;
            }
            gVar.f3827a1 = dVarArr2;
            gVar.f3828b1 = i18;
            i19 = gVar.T0;
            if (i19 != 0) {
                dVarArr3 = dVarArr2;
                i20 = i18;
                i21 = i8;
                iArr2 = iArr;
                i22 = size4;
                i6 = i6;
                i13 = i13;
                i17 = i17;
                i23 = gVar.V0;
                if (i20 == 0) {
                    if (arrayList.size() == 0) {
                        fVar = new f(gVar, i23, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                        arrayList.add(fVar);
                    } else {
                        f fVar10 = (f) arrayList.get(0);
                        fVar10.f3813c = 0;
                        fVar10.f3812b = null;
                        fVar10.f3821l = 0;
                        fVar10.f3822m = 0;
                        fVar10.n = 0;
                        fVar10.f3823o = 0;
                        fVar10.f3824p = 0;
                        fVar10.f(i23, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f3832w0, gVar.f3829s0, gVar.f3833x0, gVar.f3830t0, i11);
                        fVar = fVar10;
                    }
                    while (i24 < i20) {
                        fVar.a(dVarArr3[i24]);
                    }
                    c4 = 0;
                    iArr2[0] = fVar.d();
                    c5 = 1;
                    iArr2[1] = fVar.c();
                }
                i25 = iArr2[c4] + i6 + i13;
                i26 = iArr2[c5] + i17 + i21;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i25, size3);
                    } else if (mode == 0) {
                        size3 = i25;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i22;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i26, i22);
                } else if (mode2 == 0) {
                    iMin = i26;
                } else {
                    iMin = 0;
                }
                gVar.f3835z0 = size3;
                gVar.A0 = iMin;
                gVar.O(size3);
                gVar.L(iMin);
                if (gVar.f3842r0 > 0) {
                    z4 = c5;
                } else {
                    z4 = 0;
                }
                gVar.f3834y0 = z4;
            } else if (i19 != 1) {
                if (i19 != 2) {
                    dVarArr5 = dVarArr2;
                    i43 = i18;
                    i21 = i8;
                    iArr2 = iArr;
                    i22 = size4;
                    i6 = i6;
                    i13 = i13;
                    i17 = i17;
                    i44 = gVar.V0;
                    iCeil = gVar.U0;
                    if (i44 == 0) {
                        if (iCeil <= 0) {
                            i54 = 0;
                            iCeil2 = 0;
                            while (i53 < i43) {
                                if (i53 > 0) {
                                    i54 += gVar.P0;
                                }
                                dVar9 = dVarArr5[i53];
                                if (dVar9 != null) {
                                    iU3 = gVar.U(dVar9, i11) + i54;
                                    if (iU3 > i11) {
                                        break;
                                        break;
                                    } else {
                                        iCeil2++;
                                        i54 = iU3;
                                    }
                                }
                            }
                        } else {
                            iCeil2 = iCeil;
                        }
                        iCeil = 0;
                    } else {
                        if (iCeil <= 0) {
                            i46 = 0;
                            i47 = 0;
                            while (i45 < i43) {
                                if (i45 > 0) {
                                    i46 += gVar.Q0;
                                }
                                dVar3 = dVarArr5[i45];
                                if (dVar3 != null) {
                                    iT2 = gVar.T(dVar3, i11) + i46;
                                    if (iT2 > i11) {
                                        break;
                                        break;
                                    } else {
                                        i47++;
                                        i46 = iT2;
                                    }
                                }
                            }
                            iCeil = i47;
                        }
                        iCeil2 = 0;
                    }
                    if (gVar.Z0 == null) {
                        gVar.Z0 = new int[2];
                    }
                    if (iCeil != 0) {
                    }
                    while (!z8) {
                        if (i44 == 0) {
                            iCeil = (int) Math.ceil(i43 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i43 / iCeil);
                        }
                        dVarArr6 = gVar.Y0;
                        if (dVarArr6 != null) {
                            obj = null;
                            gVar.Y0 = new d[iCeil2];
                        } else {
                            obj = null;
                            gVar.Y0 = new d[iCeil2];
                        }
                        dVarArr7 = gVar.X0;
                        if (dVarArr7 != null) {
                            gVar.X0 = new d[iCeil];
                        } else {
                            gVar.X0 = new d[iCeil];
                        }
                        while (i48 < iCeil2) {
                            while (i51 < iCeil) {
                                i52 = (i51 * iCeil2) + i48;
                                if (i44 == 1) {
                                    i52 = (i48 * iCeil) + i51;
                                }
                                if (i52 < dVarArr5.length) {
                                    int iU6 = gVar.U(dVar6, i11);
                                    dVar7 = gVar.Y0[i48];
                                    if (dVar7 != null) {
                                        gVar.Y0[i48] = dVar6;
                                    } else {
                                        gVar.Y0[i48] = dVar6;
                                    }
                                    int iT6 = gVar.T(dVar6, i11);
                                    dVar8 = gVar.X0[i51];
                                    if (dVar8 != null) {
                                        gVar.X0[i51] = dVar6;
                                    } else {
                                        gVar.X0[i51] = dVar6;
                                    }
                                }
                            }
                        }
                        iU2 = 0;
                        while (i49 < iCeil2) {
                            dVar5 = gVar.Y0[i49];
                            if (dVar5 == null) {
                                if (i49 > 0) {
                                    iU2 += gVar.P0;
                                }
                                iU2 = gVar.U(dVar5, i11) + iU2;
                            }
                        }
                        iT3 = 0;
                        while (i50 < iCeil) {
                            dVar4 = gVar.X0[i50];
                            if (dVar4 == null) {
                                if (i50 > 0) {
                                    iT3 += gVar.Q0;
                                }
                                iT3 = gVar.T(dVar4, i11) + iT3;
                            }
                        }
                        iArr2[0] = iU2;
                        iArr2[1] = iT3;
                        if (i44 == 0) {
                            if (iU2 > i11) {
                            }
                            z8 = true;
                        } else {
                            if (iT3 > i11) {
                            }
                            z8 = true;
                        }
                    }
                    c5 = 1;
                    int[] iArr5 = gVar.Z0;
                    iArr5[0] = iCeil2;
                    iArr5[1] = iCeil;
                } else if (i19 != 3) {
                    i21 = i8;
                    iArr2 = iArr;
                    i22 = size4;
                    i6 = i6;
                    i13 = i13;
                    i17 = i17;
                } else {
                    i55 = i18;
                    i56 = gVar.V0;
                    if (i55 == 0) {
                        i21 = i8;
                        iArr2 = iArr;
                        i22 = size4;
                        c6 = 1;
                    } else {
                        arrayList.clear();
                        dVarArr8 = dVarArr2;
                        i21 = i8;
                        iArr2 = iArr;
                        c6 = 1;
                        fVar5 = new f(gVar, i56, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                        arrayList.add(fVar5);
                        if (i56 == 0) {
                            i71 = 0;
                            i72 = 0;
                            i61 = 0;
                            i73 = 0;
                            while (i71 < i55) {
                                i72++;
                                dVar11 = dVarArr8[i71];
                                iU4 = gVar.U(dVar11, i11);
                                i74 = i56;
                                i75 = i71;
                                if (dVar11.f3791p0[0] == 3) {
                                    i61++;
                                }
                                int i811 = i61;
                                if (i73 != i11) {
                                }
                                if (!z11) {
                                    z11 = true;
                                }
                                if (z11) {
                                    i76 = size4;
                                    i56 = i74;
                                    i77 = i75;
                                    fVar5 = new f(gVar, i56, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                                    fVar5.n = i77;
                                    arrayList.add(fVar5);
                                    i72 = 1;
                                } else {
                                    i76 = size4;
                                    i56 = i74;
                                    i77 = i75;
                                    if (i77 > 0) {
                                        i73 = gVar.P0 + iU4 + i73;
                                    }
                                    fVar5.a(dVar11);
                                    i71 = i77 + 1;
                                    i61 = i811;
                                    size4 = i76;
                                }
                                i73 = iU4;
                                fVar5.a(dVar11);
                                i71 = i77 + 1;
                                i61 = i811;
                                size4 = i76;
                            }
                            i22 = size4;
                        } else {
                            i22 = size4;
                            i57 = 0;
                            i58 = 0;
                            i59 = 0;
                            i60 = 0;
                            while (i57 < i55) {
                                i58++;
                                dVar10 = dVarArr8[i57];
                                iT4 = gVar.T(dVar10, i11);
                                i62 = i56;
                                if (dVar10.f3791p0[1] == 3) {
                                    i59++;
                                }
                                int i812 = i59;
                                if (i60 != i11) {
                                }
                                if (!z9) {
                                    z9 = true;
                                }
                                if (z9) {
                                    i56 = i62;
                                    fVar5 = new f(gVar, i56, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                                    fVar5.n = i57;
                                    arrayList.add(fVar5);
                                    i58 = 1;
                                } else {
                                    i56 = i62;
                                    if (i57 > 0) {
                                        i60 = gVar.Q0 + iT4 + i60;
                                    }
                                    fVar5.a(dVar10);
                                    i57++;
                                    i59 = i812;
                                }
                                i60 = iT4;
                                fVar5.a(dVar10);
                                i57++;
                                i59 = i812;
                            }
                            i61 = i59;
                        }
                        size2 = arrayList.size();
                        int i813 = gVar.f3832w0;
                        int i814 = gVar.f3829s0;
                        int i815 = gVar.f3833x0;
                        int i816 = gVar.f3830t0;
                        if (iArr3[0] != 2) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (i61 > 0) {
                            while (i70 < size2) {
                                fVar7 = (f) arrayList.get(i70);
                                if (i56 == 0) {
                                    fVar7.e(i11 - fVar7.d());
                                } else {
                                    fVar7.e(i11 - fVar7.c());
                                }
                            }
                        }
                        i64 = i813;
                        i65 = i814;
                        i66 = i815;
                        i67 = i816;
                        cVar8 = cVar;
                        cVar9 = cVar2;
                        cVar10 = cVar3;
                        cVar11 = cVar15;
                        iMax2 = 0;
                        i69 = 0;
                        while (i68 < size2) {
                            fVar6 = (f) arrayList.get(i68);
                            if (i56 == 0) {
                                if (i68 < size2 - 1) {
                                    cVar10 = ((f) arrayList.get(i68 + 1)).f3812b.J;
                                    i67 = 0;
                                } else {
                                    i67 = gVar.f3830t0;
                                    cVar10 = cVar3;
                                }
                                c cVar110 = fVar6.f3812b.L;
                                fVar6.f(i56, cVar8, cVar11, cVar9, cVar10, i64, i65, i66, i67, i11);
                                iMax2 = Math.max(iMax2, fVar6.d());
                                iC2 = fVar6.c() + i69;
                                if (i68 > 0) {
                                    iC2 += gVar.Q0;
                                }
                                i69 = iC2;
                                cVar11 = cVar110;
                                i65 = 0;
                            } else {
                                if (i68 < size2 - 1) {
                                    cVar9 = ((f) arrayList.get(i68 + 1)).f3812b.I;
                                    i66 = 0;
                                } else {
                                    i66 = gVar.f3833x0;
                                    cVar9 = cVar2;
                                }
                                c cVar23 = fVar6.f3812b.K;
                                fVar6.f(i56, cVar8, cVar11, cVar9, cVar10, i64, i65, i66, i67, i11);
                                iD2 = fVar6.d() + iMax2;
                                int iMax5 = Math.max(i69, fVar6.c());
                                if (i68 > 0) {
                                    iD2 += gVar.P0;
                                }
                                i69 = iMax5;
                                iMax2 = iD2;
                                cVar8 = cVar23;
                                i64 = 0;
                            }
                        }
                        iArr2[0] = iMax2;
                        iArr2[1] = i69;
                    }
                    c5 = c6;
                }
                c4 = 0;
                i25 = iArr2[c4] + i6 + i13;
                i26 = iArr2[c5] + i17 + i21;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i25, size3);
                    } else if (mode == 0) {
                        size3 = i25;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i22;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i26, i22);
                } else if (mode2 == 0) {
                    iMin = i26;
                } else {
                    iMin = 0;
                }
                gVar.f3835z0 = size3;
                gVar.A0 = iMin;
                gVar.O(size3);
                gVar.L(iMin);
                if (gVar.f3842r0 > 0) {
                    z4 = c5;
                } else {
                    z4 = 0;
                }
                gVar.f3834y0 = z4;
            } else {
                i21 = i8;
                iArr2 = iArr;
                i22 = size4;
                i6 = i6;
                i13 = i13;
                i17 = i17;
                i27 = i18;
                dVarArr4 = dVarArr2;
                i28 = gVar.V0;
                if (i27 != 0) {
                    arrayList.clear();
                    fVar2 = new f(gVar, i28, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                    arrayList.add(fVar2);
                    if (i28 == 0) {
                        i40 = 0;
                        i30 = 0;
                        i41 = 0;
                        while (i40 < i27) {
                            dVar2 = dVarArr4[i40];
                            iU = gVar.U(dVar2, i11);
                            if (dVar2.f3791p0[0] == 3) {
                                i30++;
                            }
                            int i96 = i30;
                            if (i41 != i11) {
                            }
                            if (!z7) {
                                z7 = true;
                            }
                            if (z7) {
                                fVar2 = new f(gVar, i28, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                                fVar2.n = i40;
                                arrayList.add(fVar2);
                            } else {
                                if (i40 > 0) {
                                    i41 = gVar.P0 + iU + i41;
                                }
                                fVar2.a(dVar2);
                                i40++;
                                i30 = i96;
                            }
                            i41 = iU;
                            fVar2.a(dVar2);
                            i40++;
                            i30 = i96;
                        }
                    } else {
                        i29 = 0;
                        i30 = 0;
                        i31 = 0;
                        while (i29 < i27) {
                            dVar = dVarArr4[i29];
                            iT = gVar.T(dVar, i11);
                            if (dVar.f3791p0[1] == 3) {
                                i30++;
                            }
                            int i97 = i30;
                            if (i31 != i11) {
                            }
                            if (!z5) {
                                z5 = true;
                            }
                            if (z5) {
                                fVar2 = new f(gVar, i28, gVar.I, gVar.J, gVar.K, gVar.L, i11);
                                fVar2.n = i29;
                                arrayList.add(fVar2);
                            } else {
                                if (i29 > 0) {
                                    i31 = gVar.Q0 + iT + i31;
                                }
                                fVar2.a(dVar);
                                i29++;
                                i30 = i97;
                            }
                            i31 = iT;
                            fVar2.a(dVar);
                            i29++;
                            i30 = i97;
                        }
                    }
                    size = arrayList.size();
                    int i98 = gVar.f3832w0;
                    int i99 = gVar.f3829s0;
                    int i910 = gVar.f3833x0;
                    int i911 = gVar.f3830t0;
                    if (iArr3[0] != 2) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (i30 > 0) {
                        while (i39 < size) {
                            fVar4 = (f) arrayList.get(i39);
                            if (i28 == 0) {
                                fVar4.e(i11 - fVar4.d());
                            } else {
                                fVar4.e(i11 - fVar4.c());
                            }
                        }
                    }
                    i33 = i98;
                    i34 = i99;
                    i35 = i910;
                    i36 = i911;
                    cVar4 = cVar;
                    cVar5 = cVar2;
                    cVar6 = cVar3;
                    cVar7 = cVar15;
                    iMax = 0;
                    i38 = 0;
                    while (i37 < size) {
                        fVar3 = (f) arrayList.get(i37);
                        if (i28 == 0) {
                            if (i37 < size - 1) {
                                cVar6 = ((f) arrayList.get(i37 + 1)).f3812b.J;
                                i36 = 0;
                            } else {
                                i36 = gVar.f3830t0;
                                cVar6 = cVar3;
                            }
                            c cVar24 = fVar3.f3812b.L;
                            fVar3.f(i28, cVar4, cVar7, cVar5, cVar6, i33, i34, i35, i36, i11);
                            iMax = Math.max(iMax, fVar3.d());
                            iC = fVar3.c() + i38;
                            if (i37 > 0) {
                                iC += gVar.Q0;
                            }
                            i38 = iC;
                            cVar7 = cVar24;
                            i34 = 0;
                        } else {
                            if (i37 < size - 1) {
                                cVar5 = ((f) arrayList.get(i37 + 1)).f3812b.I;
                                i35 = 0;
                            } else {
                                i35 = gVar.f3833x0;
                                cVar5 = cVar2;
                            }
                            c cVar25 = fVar3.f3812b.K;
                            fVar3.f(i28, cVar4, cVar7, cVar5, cVar6, i33, i34, i35, i36, i11);
                            iD = fVar3.d() + iMax;
                            int iMax6 = Math.max(i38, fVar3.c());
                            if (i37 > 0) {
                                iD += gVar.P0;
                            }
                            i38 = iMax6;
                            iMax = iD;
                            cVar4 = cVar25;
                            i33 = 0;
                        }
                    }
                    iArr2[0] = iMax;
                    iArr2[1] = i38;
                }
            }
            c5 = 1;
            c4 = 0;
            i25 = iArr2[c4] + i6 + i13;
            i26 = iArr2[c5] + i17 + i21;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size3 = Math.min(i25, size3);
                } else if (mode == 0) {
                    size3 = i25;
                } else {
                    size3 = 0;
                }
            }
            if (mode2 == 1073741824) {
                iMin = i22;
            } else if (mode2 == Integer.MIN_VALUE) {
                iMin = Math.min(i26, i22);
            } else if (mode2 == 0) {
                iMin = i26;
            } else {
                iMin = 0;
            }
            gVar.f3835z0 = size3;
            gVar.A0 = iMin;
            gVar.O(size3);
            gVar.L(iMin);
            if (gVar.f3842r0 > 0) {
                z4 = c5;
            } else {
                z4 = 0;
            }
            gVar.f3834y0 = z4;
        }
        setMeasuredDimension(gVar.f3835z0, gVar.A0);
    }

    @Override // x.c, android.view.View
    public final void onMeasure(int i4, int i5) {
        j(this.f450o, i4, i5);
    }

    public void setFirstHorizontalBias(float f) {
        this.f450o.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i4) {
        this.f450o.F0 = i4;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f450o.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i4) {
        this.f450o.G0 = i4;
        requestLayout();
    }

    public void setHorizontalAlign(int i4) {
        this.f450o.R0 = i4;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f450o.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i4) {
        this.f450o.P0 = i4;
        requestLayout();
    }

    public void setHorizontalStyle(int i4) {
        this.f450o.D0 = i4;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f450o.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i4) {
        this.f450o.H0 = i4;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f450o.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i4) {
        this.f450o.I0 = i4;
        requestLayout();
    }

    public void setMaxElementsWrap(int i4) {
        this.f450o.U0 = i4;
        requestLayout();
    }

    public void setOrientation(int i4) {
        this.f450o.V0 = i4;
        requestLayout();
    }

    public void setPadding(int i4) {
        g gVar = this.f450o;
        gVar.f3829s0 = i4;
        gVar.f3830t0 = i4;
        gVar.f3831u0 = i4;
        gVar.v0 = i4;
        requestLayout();
    }

    public void setPaddingBottom(int i4) {
        this.f450o.f3830t0 = i4;
        requestLayout();
    }

    public void setPaddingLeft(int i4) {
        this.f450o.f3832w0 = i4;
        requestLayout();
    }

    public void setPaddingRight(int i4) {
        this.f450o.f3833x0 = i4;
        requestLayout();
    }

    public void setPaddingTop(int i4) {
        this.f450o.f3829s0 = i4;
        requestLayout();
    }

    public void setVerticalAlign(int i4) {
        this.f450o.S0 = i4;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f450o.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i4) {
        this.f450o.Q0 = i4;
        requestLayout();
    }

    public void setVerticalStyle(int i4) {
        this.f450o.E0 = i4;
        requestLayout();
    }

    public void setWrapMode(int i4) {
        this.f450o.T0 = i4;
        requestLayout();
    }
}
