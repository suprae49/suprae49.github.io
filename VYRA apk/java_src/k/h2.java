package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import co.median.android.eeqadjy.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static h2 f2535g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f2537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2538b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f2539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f2541e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g2 f2536h = new g2(6);

    public static synchronized h2 b() {
        try {
            if (f2535g == null) {
                f2535g = new h2();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2535g;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        g2 g2Var = f2536h;
        g2Var.getClass();
        int i5 = (31 + i4) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) g2Var.get(Integer.valueOf(mode.hashCode() + i5));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i4, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i4) {
        LayerDrawable layerDrawableC;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        if (this.f2539c == null) {
            this.f2539c = new TypedValue();
        }
        TypedValue typedValue = this.f2539c;
        context.getResources().getValue(i4, typedValue, true);
        long j4 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            p.h hVar = (p.h) this.f2538b.get(context);
            layerDrawableC = null;
            if (hVar != null && (weakReference = (WeakReference) hVar.b(j4)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iB = q.a.b(hVar.f3151g, hVar.f3153i, j4);
                    if (iB >= 0) {
                        Object[] objArr = hVar.f3152h;
                        Object obj = objArr[iB];
                        Object obj2 = p.i.f3154a;
                        if (obj != obj2) {
                            objArr[iB] = obj2;
                            hVar.f = true;
                        }
                    }
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.f2541e != null) {
            if (i4 == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i4 == R.drawable.abc_ratingbar_material) {
                layerDrawableC = t.c(this, context, R.dimen.abc_star_big);
            } else if (i4 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = t.c(this, context, R.dimen.abc_star_medium);
            } else if (i4 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = t.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableC;
                }
                p.h hVar2 = (p.h) this.f2538b.get(context);
                if (hVar2 == null) {
                    hVar2 = new p.h();
                    this.f2538b.put(context, hVar2);
                }
                hVar2.d(j4, new WeakReference(constantState2));
                return layerDrawableC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable c(Context context, int i4) {
        return d(context, i4, false);
    }

    public final synchronized Drawable d(Context context, int i4, boolean z4) {
        Drawable drawableA;
        try {
            if (!this.f2540d) {
                this.f2540d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof q1.o) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f2540d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i4);
            if (drawableA == null) {
                drawableA = c0.c.getDrawable(context, i4);
            }
            if (drawableA != null) {
                drawableA = g(context, i4, z4, drawableA);
            }
            if (drawableA != null) {
                j1.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i4) {
        ColorStateList colorStateList;
        p.l lVar;
        Object obj;
        WeakHashMap weakHashMap = this.f2537a;
        ColorStateList colorStateListD = null;
        if (weakHashMap == null || (lVar = (p.l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int iA = q.a.a(lVar.f3159h, i4, lVar.f);
            if (iA < 0 || (obj = lVar.f3158g[iA]) == p.i.f3155b) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            t tVar = this.f2541e;
            if (tVar != null) {
                colorStateListD = tVar.d(context, i4);
            }
            if (colorStateListD != null) {
                if (this.f2537a == null) {
                    this.f2537a = new WeakHashMap();
                }
                p.l lVar2 = (p.l) this.f2537a.get(context);
                if (lVar2 == null) {
                    lVar2 = new p.l();
                    this.f2537a.put(context, lVar2);
                }
                lVar2.a(i4, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    public final Drawable g(Context context, int i4, boolean z4, Drawable drawable) {
        int i5;
        boolean z5;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListF = f(context, i4);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListF);
            if (this.f2541e != null && i4 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.f2541e != null) {
            if (i4 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = z2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = u.f2643b;
                t.e(drawableFindDrawableByLayerId, iC, mode2);
                t.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), z2.c(context, R.attr.colorControlNormal), mode2);
                t.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), z2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i4 == R.drawable.abc_ratingbar_material || i4 == R.drawable.abc_ratingbar_indicator_material || i4 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = z2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = u.f2643b;
                t.e(drawableFindDrawableByLayerId2, iB, mode3);
                t.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), z2.c(context, R.attr.colorControlActivated), mode3);
                t.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), z2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        t tVar = this.f2541e;
        boolean z6 = false;
        if (tVar != null) {
            PorterDuff.Mode mode4 = u.f2643b;
            if (t.a(tVar.f2638a, i4)) {
                i5 = R.attr.colorControlNormal;
            } else if (t.a(tVar.f2640c, i4)) {
                i5 = R.attr.colorControlActivated;
            } else {
                if (t.a(tVar.f2641d, i4)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i4 == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i5 = 16842800;
                        z5 = true;
                    } else {
                        if (i4 != R.drawable.abc_dialog_material_background) {
                            i5 = 0;
                            z5 = false;
                        }
                        iRound = -1;
                    }
                    if (z5) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(u.c(z2.c(context, i5), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z6 = true;
                    }
                }
                i5 = 16842801;
            }
            z5 = true;
            iRound = -1;
            if (z5) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(u.c(z2.c(context, i5), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z6 = true;
            }
        }
        if (z6 || !z4) {
            return drawable;
        }
        return null;
    }
}
