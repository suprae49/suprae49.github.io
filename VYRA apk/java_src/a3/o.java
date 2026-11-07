package a3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e4.a f123a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e4.a f124b = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e4.a f125c = new l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e4.a f126d = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f127e = new a(0.0f);
    public d f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f128g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f129h = new a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f133l;

    public o() {
        int i4 = 0;
        this.f130i = new f(i4);
        this.f131j = new f(i4);
        this.f132k = new f(i4);
        this.f133l = new f(i4);
    }

    public static n f(Context context, int i4, int i5) {
        a aVar = new a(0);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
        if (i5 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i5, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(a2.a.L), aVar);
    }

    public static n g(Context context, AttributeSet attributeSet, int i4, int i5) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.A, i4, i5);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(a2.a.L), aVar);
    }

    public static n h(TypedArray typedArray, a aVar) {
        try {
            int i4 = typedArray.getInt(0, 0);
            int i5 = typedArray.getInt(3, i4);
            int i6 = typedArray.getInt(4, i4);
            int i7 = typedArray.getInt(2, i4);
            int i8 = typedArray.getInt(1, i4);
            d dVarI = i(typedArray, 5, aVar);
            d dVarI2 = i(typedArray, 8, dVarI);
            d dVarI3 = i(typedArray, 9, dVarI);
            d dVarI4 = i(typedArray, 7, dVarI);
            d dVarI5 = i(typedArray, 6, dVarI);
            n nVar = new n();
            nVar.f112a = u1.h0.r(i5);
            nVar.f116e = dVarI2;
            nVar.f113b = u1.h0.r(i6);
            nVar.f = dVarI3;
            nVar.f114c = u1.h0.r(i7);
            nVar.f117g = dVarI4;
            nVar.f115d = u1.h0.r(i8);
            nVar.f118h = dVarI5;
            return nVar;
        } finally {
            typedArray.recycle();
        }
    }

    public static d i(TypedArray typedArray, int i4, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i4);
        if (typedValuePeekValue != null) {
            int i5 = typedValuePeekValue.type;
            if (i5 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i5 == 6) {
                return new k(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    @Override // a3.m
    public final o a(float f) {
        n nVarK = k();
        nVarK.b(f);
        return nVarK.a();
    }

    @Override // a3.m
    public final o d(k kVar) {
        n nVarK = k();
        nVarK.f116e = kVar;
        nVarK.f = kVar;
        nVarK.f117g = kVar;
        nVarK.f118h = kVar;
        return nVarK.a();
    }

    @Override // a3.m
    public final boolean e() {
        return false;
    }

    public final boolean j(RectF rectF) {
        boolean z4 = this.f133l.getClass().equals(f.class) && this.f131j.getClass().equals(f.class) && this.f130i.getClass().equals(f.class) && this.f132k.getClass().equals(f.class);
        float fA = this.f127e.a(rectF);
        return z4 && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f129h.a(rectF) > fA ? 1 : (this.f129h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f128g.a(rectF) > fA ? 1 : (this.f128g.a(rectF) == fA ? 0 : -1)) == 0) && (this.f124b instanceof l) && (this.f123a instanceof l) && (this.f125c instanceof l) && (this.f126d instanceof l);
    }

    public final n k() {
        n nVar = new n();
        nVar.f112a = this.f123a;
        nVar.f113b = this.f124b;
        nVar.f114c = this.f125c;
        nVar.f115d = this.f126d;
        nVar.f116e = this.f127e;
        nVar.f = this.f;
        nVar.f117g = this.f128g;
        nVar.f118h = this.f129h;
        nVar.f119i = this.f130i;
        nVar.f120j = this.f131j;
        nVar.f121k = this.f132k;
        nVar.f122l = this.f133l;
        return nVar;
    }

    public final String toString() {
        return "[" + this.f127e + ", " + this.f + ", " + this.f128g + ", " + this.f129h + "]";
    }

    @Override // a3.m
    public final o b(int[] iArr) {
        return this;
    }

    @Override // a3.m
    public final o c() {
        return this;
    }
}
