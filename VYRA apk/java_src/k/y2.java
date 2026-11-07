package k;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2706a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(String str, int i4, Class cls) {
        super(cls, str);
        this.f2706a = i4;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2706a) {
            case 0:
                return Float.valueOf(((SwitchCompat) obj).E);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return Float.valueOf(p1.c0.f3281a.D((View) obj));
            case 7:
                return ((View) obj).getClipBounds();
            case 8:
                return Float.valueOf(((v2.h) obj).f4330h);
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return Float.valueOf(((v2.h) obj).f4331i);
            case 10:
                return Float.valueOf(((v2.j) obj).f4343h);
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return Float.valueOf(((v2.j) obj).f4344i);
            default:
                return Float.valueOf(((v2.o) obj).b());
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2706a) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 1:
                p1.d dVar = (p1.d) obj;
                PointF pointF = (PointF) obj2;
                dVar.getClass();
                dVar.f3283a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                dVar.f3284b = iRound;
                int i4 = dVar.f + 1;
                dVar.f = i4;
                if (i4 == dVar.f3288g) {
                    p1.c0.a(dVar.f3287e, dVar.f3283a, iRound, dVar.f3285c, dVar.f3286d);
                    dVar.f = 0;
                    dVar.f3288g = 0;
                }
                break;
            case 2:
                p1.d dVar2 = (p1.d) obj;
                PointF pointF2 = (PointF) obj2;
                dVar2.getClass();
                dVar2.f3285c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                dVar2.f3286d = iRound2;
                int i5 = dVar2.f3288g + 1;
                dVar2.f3288g = i5;
                if (dVar2.f == i5) {
                    p1.c0.a(dVar2.f3287e, dVar2.f3283a, dVar2.f3284b, dVar2.f3285c, iRound2);
                    dVar2.f = 0;
                    dVar2.f3288g = 0;
                }
                break;
            case 3:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                p1.c0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 4:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                p1.c0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 5:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                p1.c0.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 6:
                p1.c0.f3281a.m0((View) obj, ((Float) obj2).floatValue());
                break;
            case 7:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            case 8:
                v2.h hVar = (v2.h) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                hVar.f4330h = fFloatValue;
                int i6 = (int) (fFloatValue * 5400.0f);
                e1.a aVar = hVar.f4328e;
                ArrayList arrayList = (ArrayList) hVar.f1840b;
                v2.p pVar = (v2.p) arrayList.get(0);
                float f = hVar.f4330h * 1520.0f;
                pVar.f4386a = (-20.0f) + f;
                pVar.f4387b = f;
                for (int i7 = 0; i7 < 4; i7++) {
                    pVar.f4387b = (aVar.getInterpolation(e.a0.g(i6, v2.h.f4322k[i7], 667)) * 250.0f) + pVar.f4387b;
                    pVar.f4386a = (aVar.getInterpolation(e.a0.g(i6, v2.h.f4323l[i7], 667)) * 250.0f) + pVar.f4386a;
                }
                float f4 = pVar.f4386a;
                float f5 = pVar.f4387b;
                pVar.f4386a = (((f5 - f4) * hVar.f4331i) + f4) / 360.0f;
                pVar.f4387b = f5 / 360.0f;
                for (int i8 = 0; i8 < 4; i8++) {
                    float fG = e.a0.g(i6, v2.h.f4324m[i8], 333);
                    if (fG > 0.0f && fG < 1.0f) {
                        int i9 = i8 + hVar.f4329g;
                        int[] iArr = hVar.f.f4350e;
                        int length = i9 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        ((v2.p) arrayList.get(0)).f4388c = b2.b.a(aVar.getInterpolation(fG), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        ((v2.s) hVar.f1839a).invalidateSelf();
                    }
                    break;
                }
                ((v2.s) hVar.f1839a).invalidateSelf();
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                ((v2.h) obj).f4331i = ((Float) obj2).floatValue();
                break;
            case 10:
                v2.j jVar = (v2.j) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                jVar.f4343h = fFloatValue2;
                int i10 = (int) (fFloatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = jVar.f4341e;
                ArrayList arrayList2 = (ArrayList) jVar.f1840b;
                v2.p pVar2 = (v2.p) arrayList2.get(0);
                float f6 = jVar.f4343h * 1080.0f;
                int[] iArr2 = v2.j.f4336l;
                float interpolation = 0.0f;
                for (int i11 : iArr2) {
                    interpolation += timeInterpolator.getInterpolation(e.a0.g(i10, i11, 500)) * 90.0f;
                }
                pVar2.f = f6 + interpolation;
                float interpolation2 = timeInterpolator.getInterpolation(e.a0.g(i10, 0, 3000)) - timeInterpolator.getInterpolation(e.a0.g(i10, 3000, 3000));
                pVar2.f4386a = 0.0f;
                float[] fArr = v2.j.f4337m;
                float fK = u1.h0.K(fArr[0], fArr[1], interpolation2);
                pVar2.f4387b = fK;
                float f7 = jVar.f4344i;
                if (f7 > 0.0f) {
                    pVar2.f4387b = (1.0f - f7) * fK;
                }
                for (int i12 = 0; i12 < iArr2.length; i12++) {
                    float fG2 = e.a0.g(i10, iArr2[i12], 100);
                    if (fG2 >= 0.0f && fG2 <= 1.0f) {
                        int i13 = i12 + jVar.f4342g;
                        int[] iArr3 = jVar.f.f4350e;
                        int length3 = i13 % iArr3.length;
                        int length4 = (length3 + 1) % iArr3.length;
                        ((v2.p) arrayList2.get(0)).f4388c = b2.b.a(timeInterpolator.getInterpolation(fG2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        ((v2.s) jVar.f1839a).invalidateSelf();
                    }
                    break;
                }
                ((v2.s) jVar.f1839a).invalidateSelf();
                break;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                ((v2.j) obj).f4344i = ((Float) obj2).floatValue();
                break;
            default:
                v2.o oVar = (v2.o) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                if (oVar.n != fFloatValue3) {
                    oVar.n = fFloatValue3;
                    oVar.invalidateSelf();
                }
                break;
        }
    }
}
