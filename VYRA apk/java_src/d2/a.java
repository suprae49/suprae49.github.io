package d2;

import a3.j;
import a3.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import co.median.android.eeqadjy.R;
import com.google.android.material.badge.BadgeState$State;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import r2.a0;
import r2.w;
import r2.x;
import x2.d;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements w {
    public final WeakReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f1657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f1658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f1659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f1660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1663m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f1666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f1667r;

    public a(Context context, BadgeState$State badgeState$State) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f = weakReference;
        a0.c(context, a0.f3506b, "Theme.MaterialComponents");
        this.f1659i = new Rect();
        x xVar = new x(this);
        this.f1658h = xVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = xVar.f3599a;
        textPaint.setTextAlign(align);
        b bVar = new b(context, badgeState$State);
        this.f1660j = bVar;
        boolean zF = f();
        BadgeState$State badgeState$State2 = bVar.f1669b;
        j jVar = new j(o.f(context, zF ? badgeState$State2.f1260l.intValue() : badgeState$State2.f1258j.intValue(), f() ? badgeState$State2.f1261m.intValue() : badgeState$State2.f1259k.intValue()).a());
        this.f1657g = jVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && xVar.f3604g != (dVar = new d(context2, badgeState$State2.f1257i.intValue()))) {
            xVar.b(dVar, context2);
            textPaint.setColor(badgeState$State2.f1256h.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i4 = badgeState$State2.f1264q;
        if (i4 != -2) {
            this.f1663m = ((int) Math.pow(10.0d, ((double) i4) - 1.0d)) - 1;
        } else {
            this.f1663m = badgeState$State2.f1265r;
        }
        xVar.f3603e = true;
        j();
        invalidateSelf();
        xVar.f3603e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState$State2.f1255g.intValue());
        if (jVar.f88g.f72c != colorStateListValueOf) {
            jVar.r(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(badgeState$State2.f1256h.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f1666q;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f1666q.get();
            WeakReference weakReference3 = this.f1667r;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(badgeState$State2.f1272y.booleanValue(), false);
    }

    @Override // r2.w
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, View view2) {
        float y4;
        float x4;
        ViewParent parent;
        boolean z4;
        FrameLayout frameLayoutD = d();
        if (frameLayoutD == null) {
            float y5 = view.getY();
            x4 = view.getX();
            parent = view.getParent();
            y4 = y5;
        } else {
            y4 = 0.0f;
            x4 = 0.0f;
            parent = frameLayoutD;
        }
        while (true) {
            z4 = parent instanceof View;
            if (!z4 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y4 += view3.getY();
            x4 += view3.getX();
            parent = parent.getParent();
        }
        if (z4) {
            float f = (this.f1662l - this.f1665p) + y4;
            float f4 = (this.f1661k - this.f1664o) + x4;
            View view4 = (View) parent;
            float height = ((this.f1662l + this.f1665p) - view4.getHeight()) + y4;
            float width = ((this.f1661k + this.f1664o) - view4.getWidth()) + x4;
            if (f < 0.0f) {
                this.f1662l = Math.abs(f) + this.f1662l;
            }
            if (f4 < 0.0f) {
                this.f1661k = Math.abs(f4) + this.f1661k;
            }
            if (height > 0.0f) {
                this.f1662l -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f1661k -= Math.abs(width);
            }
        }
    }

    public final String c() {
        b bVar = this.f1660j;
        BadgeState$State badgeState$State = bVar.f1669b;
        BadgeState$State badgeState$State2 = bVar.f1669b;
        String str = badgeState$State.f1262o;
        WeakReference weakReference = this.f;
        if (str == null) {
            if (!g()) {
                return null;
            }
            if (this.f1663m == -2 || e() <= this.f1663m) {
                return NumberFormat.getInstance(badgeState$State2.f1266s).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(badgeState$State2.f1266s, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f1663m), "+");
        }
        int i4 = badgeState$State.f1264q;
        if (i4 == -2 || str == null || str.length() <= i4) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i4 - 1), "…");
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.f1667r;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f1657g.draw(canvas);
        if (!f() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        x xVar = this.f1658h;
        xVar.f3599a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.f1662l - rect.exactCenterY();
        canvas.drawText(strC, this.f1661k, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), xVar.f3599a);
    }

    public final int e() {
        int i4 = this.f1660j.f1669b.f1263p;
        if (i4 != -1) {
            return i4;
        }
        return 0;
    }

    public final boolean f() {
        return this.f1660j.f1669b.f1262o != null || g();
    }

    public final boolean g() {
        BadgeState$State badgeState$State = this.f1660j.f1669b;
        return badgeState$State.f1262o == null && badgeState$State.f1263p != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1660j.f1669b.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f1659i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f1659i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.f.get();
        if (context == null) {
            return;
        }
        boolean zF = f();
        b bVar = this.f1660j;
        this.f1657g.setShapeAppearanceModel(o.f(context, zF ? bVar.f1669b.f1260l.intValue() : bVar.f1669b.f1258j.intValue(), f() ? bVar.f1669b.f1261m.intValue() : bVar.f1669b.f1259k.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f1666q = new WeakReference(view);
        this.f1667r = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0118 A[PHI: r13
      0x0118: PHI (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:45:0x00e4, B:47:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    public final void j() {
        float f;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        WeakReference weakReference = this.f;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f1666q;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f1659i;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f1667r;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zF = f();
        b bVar = this.f1660j;
        float f10 = zF ? bVar.f1671d : bVar.f1670c;
        this.n = f10;
        if (f10 != -1.0f) {
            this.f1664o = f10;
            this.f1665p = f10;
        } else {
            this.f1664o = Math.round((f() ? bVar.f1673g : bVar.f1672e) / 2.0f);
            this.f1665p = Math.round((f() ? bVar.f1674h : bVar.f) / 2.0f);
        }
        if (f()) {
            String strC = c();
            float f11 = this.f1664o;
            x xVar = this.f1658h;
            if (xVar.f3603e) {
                xVar.a(strC);
                f9 = xVar.f3601c;
            } else {
                f9 = xVar.f3601c;
            }
            this.f1664o = Math.max(f11, (f9 / 2.0f) + bVar.f1669b.f1273z.intValue());
            float f12 = this.f1665p;
            if (xVar.f3603e) {
                xVar.a(strC);
            }
            float fMax = Math.max(f12, (xVar.f3602d / 2.0f) + bVar.f1669b.A.intValue());
            this.f1665p = fMax;
            this.f1664o = Math.max(this.f1664o, fMax);
        }
        BadgeState$State badgeState$State = bVar.f1669b;
        BadgeState$State badgeState$State2 = bVar.f1669b;
        int i4 = bVar.f1677k;
        int iIntValue = badgeState$State.C.intValue();
        if (f()) {
            iIntValue = badgeState$State.E.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = b2.a.c(iIntValue, iIntValue - badgeState$State.H.intValue(), b2.a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        if (i4 == 0) {
            iIntValue -= Math.round(this.f1665p);
        }
        int iIntValue2 = badgeState$State.G.intValue() + iIntValue;
        int iIntValue3 = badgeState$State2.f1271x.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f1662l = rect3.bottom - iIntValue2;
        } else {
            this.f1662l = rect3.top + iIntValue2;
        }
        int iIntValue4 = f() ? badgeState$State.D.intValue() : badgeState$State2.B.intValue();
        if (i4 == 1) {
            iIntValue4 += f() ? bVar.f1676j : bVar.f1675i;
        }
        int iIntValue5 = badgeState$State.F.intValue() + iIntValue4;
        int iIntValue6 = badgeState$State2.f1271x.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            if (bVar.f1678l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f = rect3.left + this.f1664o;
                    f4 = (this.f1665p * 2.0f) - iIntValue5;
                    f5 = f - f4;
                } else {
                    f5 = (rect3.right - this.f1664o) + ((this.f1665p * 2.0f) - iIntValue5);
                }
            } else if (view.getLayoutDirection() == 0) {
                f5 = (rect3.left - this.f1664o) + iIntValue5;
            } else {
                f = rect3.right + this.f1664o;
                f4 = iIntValue5;
                f5 = f - f4;
            }
            this.f1661k = f5;
        } else {
            if (bVar.f1678l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f6 = rect3.right + this.f1664o;
                    f7 = iIntValue5;
                    f8 = f6 - f7;
                } else {
                    f8 = (rect3.left - this.f1664o) + iIntValue5;
                }
            } else if (view.getLayoutDirection() == 0) {
                f8 = (rect3.right - this.f1664o) + ((this.f1665p * 2.0f) - iIntValue5);
            } else {
                f6 = rect3.left + this.f1664o;
                f7 = (this.f1665p * 2.0f) - iIntValue5;
                f8 = f6 - f7;
            }
            this.f1661k = f8;
        }
        if (badgeState$State.I.booleanValue()) {
            ViewParent viewParentD = d();
            if (viewParentD == null) {
                viewParentD = view.getParent();
            }
            if ((viewParentD instanceof View) && (viewParentD.getParent() instanceof View)) {
                b(view, (View) viewParentD.getParent());
            }
        } else {
            b(view, null);
        }
        float f13 = this.f1661k;
        float f14 = this.f1662l;
        float f15 = this.f1664o;
        float f16 = this.f1665p;
        rect2.set((int) (f13 - f15), (int) (f14 - f16), (int) (f13 + f15), (int) (f14 + f16));
        float f17 = this.n;
        j jVar = this.f1657g;
        if (f17 != -1082130432) {
            jVar.setShapeAppearanceModel(jVar.f88g.f70a.a(f17));
        }
        if (rect.equals(rect2)) {
            return;
        }
        jVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, r2.w
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        b bVar = this.f1660j;
        bVar.f1668a.n = i4;
        bVar.f1669b.n = i4;
        this.f1658h.f3599a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
