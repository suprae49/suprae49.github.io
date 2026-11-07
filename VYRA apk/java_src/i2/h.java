package i2;

import a3.j;
import a3.m;
import a3.z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import co.median.android.eeqadjy.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import d3.a0;
import java.lang.ref.WeakReference;
import t1.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f2287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f2288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0.e f2289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f2290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2291e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f2296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f2297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f2298m;
    public ColorStateList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f2299o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2303s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RippleDrawable f2305u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2306v;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2300p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2301q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2302r = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2304t = true;

    public h(MaterialButton materialButton, m mVar) {
        this.f2287a = materialButton;
        this.f2288b = mVar;
    }

    public final j a(boolean z4) {
        RippleDrawable rippleDrawable = this.f2305u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) ((LayerDrawable) ((InsetDrawable) this.f2305u.getDrawable(0)).getDrawable()).getDrawable(!z4 ? 1 : 0);
    }

    public final void b(int i4, int i5, int i6, int i7) {
        MaterialButton materialButton = this.f2287a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i8 = this.f2291e;
        int i9 = this.f2292g;
        int i10 = this.f;
        int i11 = this.f2293h;
        this.f2291e = i4;
        this.f2292g = i5;
        this.f = i6;
        this.f2293h = i7;
        if (!this.f2301q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i4) - i8, (paddingTop + i5) - i9, (paddingEnd + i6) - i10, (paddingBottom + i7) - i11);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a A[LOOP:0: B:41:0x0108->B:46:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0116 A[SYNTHETIC] */
    public final void c() {
        LayerDrawable layerDrawable;
        Drawable drawable;
        j jVar = new j(this.f2288b);
        z0.e eVar = this.f2289c;
        if (eVar != null) {
            jVar.p(eVar);
        }
        a0 a0Var = this.f2290d;
        if (a0Var != null) {
            jVar.J = a0Var;
        }
        MaterialButton materialButton = this.f2287a;
        Context context = materialButton.getContext();
        jVar.n(context);
        jVar.setTintList(this.f2297l);
        PorterDuff.Mode mode = this.f2296k;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f = this.f2295j;
        ColorStateList colorStateList = this.f2298m;
        jVar.f88g.f78j = f;
        jVar.invalidateSelf();
        a3.h hVar = jVar.f88g;
        if (hVar.f73d != colorStateList) {
            hVar.f73d = colorStateList;
            jVar.onStateChange(jVar.getState());
        }
        j jVar2 = new j(this.f2288b);
        z0.e eVar2 = this.f2289c;
        if (eVar2 != null) {
            jVar2.p(eVar2);
        }
        jVar2.setTint(0);
        float f4 = this.f2295j;
        int iA0 = this.f2300p ? e4.a.a0(materialButton.getContext(), l.s(materialButton, R.attr.colorSurface)) : 0;
        jVar2.f88g.f78j = f4;
        jVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iA0);
        a3.h hVar2 = jVar2.f88g;
        if (hVar2.f73d != colorStateListValueOf) {
            hVar2.f73d = colorStateListValueOf;
            jVar2.onStateChange(jVar2.getState());
        }
        j jVar3 = new j(this.f2288b);
        this.f2299o = jVar3;
        z0.e eVar3 = this.f2289c;
        if (eVar3 != null) {
            jVar3.p(eVar3);
        }
        this.f2299o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(y2.a.b(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f2291e, this.f2292g, this.f, this.f2293h), this.f2299o);
        this.f2305u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.f2305u);
        j jVarA = a(false);
        if (jVarA != null) {
            jVarA.q(this.f2306v);
            jVarA.setState(materialButton.getDrawableState());
        }
        Drawable background = materialButton.getBackground();
        if (background instanceof FocusRingDrawable) {
            focusRingDrawable = (FocusRingDrawable) background;
        } else if (background instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) background).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                focusRingDrawable = (FocusRingDrawable) drawable2;
            } else if (background instanceof LayerDrawable) {
                layerDrawable = (LayerDrawable) background;
                for (int i4 = 0; i4 < layerDrawable.getNumberOfLayers(); i4++) {
                    drawable = layerDrawable.getDrawable(i4);
                    if (drawable instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable;
                        break;
                    }
                }
            }
        } else if (background instanceof LayerDrawable) {
            layerDrawable = (LayerDrawable) background;
            while (i4 < layerDrawable.getNumberOfLayers()) {
                drawable = layerDrawable.getDrawable(i4);
                if (drawable instanceof FocusRingDrawable) {
                    focusRingDrawable = (FocusRingDrawable) drawable;
                    break;
                }
            }
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.f1498m = new WeakReference(jVarA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public final void d() {
        z zVar;
        j jVarA = a(false);
        if (jVarA != null) {
            jVarA.s(this.f2288b);
            z0.e eVar = this.f2289c;
            if (eVar != null) {
                jVarA.p(eVar);
            }
        }
        j jVarA2 = a(true);
        if (jVarA2 != null) {
            jVarA2.s(this.f2288b);
            z0.e eVar2 = this.f2289c;
            if (eVar2 != null) {
                jVarA2.p(eVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f2305u;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (objFindDrawableByLayerId instanceof z) {
                zVar = (z) objFindDrawableByLayerId;
            } else {
                zVar = null;
            }
        } else {
            zVar = null;
        }
        if (zVar != null) {
            if (!(zVar instanceof j)) {
                zVar.setShapeAppearanceModel(this.f2288b.c());
                return;
            }
            j jVar = (j) zVar;
            jVar.s(this.f2288b);
            z0.e eVar3 = this.f2289c;
            if (eVar3 != null) {
                jVar.p(eVar3);
            }
        }
    }

    public final void e() {
        int iA0 = 0;
        j jVarA = a(false);
        j jVarA2 = a(true);
        if (jVarA != null) {
            float f = this.f2295j;
            ColorStateList colorStateList = this.f2298m;
            jVarA.f88g.f78j = f;
            jVarA.invalidateSelf();
            a3.h hVar = jVarA.f88g;
            if (hVar.f73d != colorStateList) {
                hVar.f73d = colorStateList;
                jVarA.onStateChange(jVarA.getState());
            }
            if (jVarA2 != null) {
                float f4 = this.f2295j;
                if (this.f2300p) {
                    MaterialButton materialButton = this.f2287a;
                    iA0 = e4.a.a0(materialButton.getContext(), l.s(materialButton, R.attr.colorSurface));
                }
                jVarA2.f88g.f78j = f4;
                jVarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iA0);
                a3.h hVar2 = jVarA2.f88g;
                if (hVar2.f73d != colorStateListValueOf) {
                    hVar2.f73d = colorStateListValueOf;
                    jVarA2.onStateChange(jVarA2.getState());
                }
            }
        }
    }
}
