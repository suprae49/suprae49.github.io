package q1;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0.d f3397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3398e;
    public e0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f3403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f3404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f3405m;
    public float n;

    @Override // q1.j
    public final boolean a() {
        return this.f.c() || this.f3397d.c();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // q1.j
    public final boolean b(int[] iArr) {
        boolean z4;
        e0.d dVar = this.f;
        boolean z5 = true;
        if (dVar.c()) {
            ColorStateList colorStateList = (ColorStateList) dVar.f2015c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar.f2013a) {
                dVar.f2013a = colorForState;
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        e0.d dVar2 = this.f3397d;
        if (dVar2.c()) {
            ColorStateList colorStateList2 = (ColorStateList) dVar2.f2015c;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != dVar2.f2013a) {
                dVar2.f2013a = colorForState2;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        return z4 | z5;
    }

    public float getFillAlpha() {
        return this.f3400h;
    }

    public int getFillColor() {
        return this.f.f2013a;
    }

    public float getStrokeAlpha() {
        return this.f3399g;
    }

    public int getStrokeColor() {
        return this.f3397d.f2013a;
    }

    public float getStrokeWidth() {
        return this.f3398e;
    }

    public float getTrimPathEnd() {
        return this.f3402j;
    }

    public float getTrimPathOffset() {
        return this.f3403k;
    }

    public float getTrimPathStart() {
        return this.f3401i;
    }

    public void setFillAlpha(float f) {
        this.f3400h = f;
    }

    public void setFillColor(int i4) {
        this.f.f2013a = i4;
    }

    public void setStrokeAlpha(float f) {
        this.f3399g = f;
    }

    public void setStrokeColor(int i4) {
        this.f3397d.f2013a = i4;
    }

    public void setStrokeWidth(float f) {
        this.f3398e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f3402j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f3403k = f;
    }

    public void setTrimPathStart(float f) {
        this.f3401i = f;
    }
}
