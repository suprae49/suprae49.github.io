package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.StateSet;
import d3.d0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable implements Drawable.Callback {
    public c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f2131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f2132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f2133i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2135k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2137m;
    public d0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f2140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f2141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2142s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2134j = 255;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2136l = -1;

    public d(c cVar, Resources resources) {
        c cVar2 = new c(cVar, this, resources);
        this.f = cVar2;
        int i4 = this.f2136l;
        if (i4 >= 0) {
            Drawable drawableB = cVar2.b(i4);
            this.f2132h = drawableB;
            if (drawableB != null) {
                d(drawableB);
            }
        }
        this.f2133i = null;
        this.f2141r = cVar2;
        onStateChange(getState());
    }

    public final void a(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            c cVar = this.f2141r;
            int i4 = cVar.f2113h;
            Drawable[] drawableArr = cVar.f2112g;
            if (i4 >= drawableArr.length) {
                int i5 = i4 + 10;
                Drawable[] drawableArr2 = new Drawable[i5];
                System.arraycopy(drawableArr, 0, drawableArr2, 0, i4);
                cVar.f2112g = drawableArr2;
                int[][] iArr2 = new int[i5][];
                System.arraycopy(cVar.D, 0, iArr2, 0, i4);
                cVar.D = iArr2;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(cVar.f2107a);
            cVar.f2112g[i4] = drawable;
            cVar.f2113h++;
            cVar.f2111e = drawable.getChangingConfigurations() | cVar.f2111e;
            cVar.f2120p = false;
            cVar.f2122r = false;
            cVar.f2115j = null;
            cVar.f2114i = false;
            cVar.f2116k = false;
            cVar.f2123s = false;
            cVar.D[i4] = iArr;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        c(theme);
        onStateChange(getState());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void b(boolean z4) {
        boolean z5;
        Drawable drawable;
        long j4;
        boolean z6 = true;
        this.f2135k = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f2132h;
        if (drawable2 != null) {
            long j5 = this.f2138o;
            if (j5 != 0) {
                if (j5 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f2134j);
                    this.f2138o = 0L;
                } else {
                    this.f.getClass();
                    drawable2.setAlpha(((255 - (((int) ((j5 - jUptimeMillis) * 255)) / 0)) * this.f2134j) / 255);
                    z5 = true;
                }
            }
            drawable = this.f2133i;
            if (drawable != null) {
                j4 = this.f2139p;
                if (j4 == 0) {
                    if (j4 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f2133i = null;
                        this.f2139p = 0L;
                    } else {
                        this.f.getClass();
                        drawable.setAlpha(((((int) ((j4 - jUptimeMillis) * 255)) / 0) * this.f2134j) / 255);
                    }
                }
                if (z4 || !z6) {
                }
                scheduleSelf(this.n, jUptimeMillis + 16);
                return;
            }
            this.f2139p = 0L;
            z6 = z5;
            if (z4) {
            }
        }
        this.f2138o = 0L;
        z5 = false;
        drawable = this.f2133i;
        if (drawable != null) {
            j4 = this.f2139p;
            if (j4 == 0) {
                if (j4 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f2133i = null;
                    this.f2139p = 0L;
                } else {
                    this.f.getClass();
                    drawable.setAlpha(((((int) ((j4 - jUptimeMillis) * 255)) / 0) * this.f2134j) / 255);
                }
            }
            if (z4) {
            }
        }
        this.f2139p = 0L;
        z6 = z5;
        if (z4) {
        }
    }

    public final void c(Resources.Theme theme) {
        c cVar = this.f;
        if (theme == null) {
            cVar.getClass();
            return;
        }
        cVar.a();
        int i4 = cVar.f2113h;
        Drawable[] drawableArr = cVar.f2112g;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i5].applyTheme(theme);
                cVar.f2111e |= drawableArr[i5].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            cVar.f2108b = resources;
            int i6 = resources.getDisplayMetrics().densityDpi;
            if (i6 == 0) {
                i6 = 160;
            }
            int i7 = cVar.f2109c;
            cVar.f2109c = i6;
            if (i7 != i6) {
                cVar.f2116k = false;
                cVar.f2114i = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f2140q == null) {
            this.f2140q = new a();
        }
        a aVar = this.f2140q;
        aVar.f2094g = drawable.getCallback();
        drawable.setCallback(aVar);
        try {
            this.f.getClass();
            if (this.f2135k) {
                drawable.setAlpha(this.f2134j);
            }
            c cVar = this.f;
            if (cVar.f2129y) {
                drawable.setColorFilter(cVar.f2128x);
            } else {
                if (cVar.B) {
                    drawable.setTintList(cVar.f2130z);
                }
                c cVar2 = this.f;
                if (cVar2.C) {
                    drawable.setTintMode(cVar2.A);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f.f2125u);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f.f2127w);
            Rect rect = this.f2131g;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            a aVar2 = this.f2140q;
            Drawable.Callback callback = (Drawable.Callback) aVar2.f2094g;
            aVar2.f2094g = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2132h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2133i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final Drawable e() {
        if (!this.f2137m && super.mutate() == this) {
            c cVar = new c(this.f2141r, this, null);
            cVar.c();
            this.f = cVar;
            int i4 = this.f2136l;
            if (i4 >= 0) {
                Drawable drawableB = cVar.b(i4);
                this.f2132h = drawableB;
                if (drawableB != null) {
                    d(drawableB);
                }
            }
            this.f2133i = null;
            this.f2141r = cVar;
            this.f2137m = true;
        }
        return this;
    }

    public final boolean f(int[] iArr) {
        Drawable drawable = this.f2133i;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f2132h;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2134j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z4;
        c cVar = this.f;
        if (!cVar.f2123s) {
            cVar.a();
            cVar.f2123s = true;
            int i4 = cVar.f2113h;
            Drawable[] drawableArr = cVar.f2112g;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    cVar.f2124t = true;
                    z4 = true;
                    break;
                }
                if (drawableArr[i5].getConstantState() == null) {
                    cVar.f2124t = false;
                    z4 = false;
                    break;
                }
                i5++;
            }
        } else {
            z4 = cVar.f2124t;
        }
        if (!z4) {
            return null;
        }
        this.f.f2110d = getChangingConfigurations();
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f2132h;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2131g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        this.f.getClass();
        Drawable drawable = this.f2132h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.f.getClass();
        Drawable drawable = this.f2132h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        this.f.getClass();
        Drawable drawable = this.f2132h;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        this.f.getClass();
        Drawable drawable = this.f2132h;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2132h;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            c cVar = this.f;
            if (cVar.f2120p) {
                return cVar.f2121q;
            }
            cVar.a();
            int i4 = cVar.f2113h;
            Drawable[] drawableArr = cVar.f2112g;
            opacity = i4 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i5 = 1; i5 < i4; i5++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i5].getOpacity());
            }
            cVar.f2121q = opacity;
            cVar.f2120p = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f2132h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        c cVar = this.f;
        cVar.getClass();
        Rect rect2 = cVar.f2115j;
        boolean padding = false;
        if (rect2 == null && !cVar.f2114i) {
            cVar.a();
            Rect rect3 = new Rect();
            int i4 = cVar.f2113h;
            Drawable[] drawableArr = cVar.f2112g;
            Rect rect4 = null;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5].getPadding(rect3)) {
                    if (rect4 == null) {
                        rect4 = new Rect(0, 0, 0, 0);
                    }
                    int i6 = rect3.left;
                    if (i6 > rect4.left) {
                        rect4.left = i6;
                    }
                    int i7 = rect3.top;
                    if (i7 > rect4.top) {
                        rect4.top = i7;
                    }
                    int i8 = rect3.right;
                    if (i8 > rect4.right) {
                        rect4.right = i8;
                    }
                    int i9 = rect3.bottom;
                    if (i9 > rect4.bottom) {
                        rect4.bottom = i9;
                    }
                }
            }
            cVar.f2114i = true;
            cVar.f2115j = rect4;
            rect2 = rect4;
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f2132h;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f.f2127w && getLayoutDirection() == 1) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.f2120p = false;
            cVar.f2122r = false;
        }
        if (drawable != this.f2132h || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f.f2127w;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        boolean z4;
        Drawable drawable = this.f2133i;
        boolean z5 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2133i = null;
            z4 = true;
        } else {
            z4 = false;
        }
        Drawable drawable2 = this.f2132h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2135k) {
                this.f2132h.setAlpha(this.f2134j);
            }
        }
        if (this.f2139p != 0) {
            this.f2139p = 0L;
            z4 = true;
        }
        if (this.f2138o != 0) {
            this.f2138o = 0L;
        } else {
            z5 = z4;
        }
        if (z5) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f2142s) {
            e();
            this.f2141r.c();
            this.f2142s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2133i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2132h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        c cVar = this.f;
        int i5 = this.f2136l;
        int i6 = cVar.f2113h;
        Drawable[] drawableArr = cVar.f2112g;
        boolean z4 = false;
        for (int i7 = 0; i7 < i6; i7++) {
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i4);
                if (i7 == i5) {
                    z4 = layoutDirection;
                }
            }
        }
        cVar.f2126v = i4;
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        Drawable drawable = this.f2133i;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        Drawable drawable2 = this.f2132h;
        if (drawable2 != null) {
            return drawable2.setLevel(i4);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zF = f(iArr);
        c cVar = this.f2141r;
        int[][] iArr2 = cVar.D;
        int i4 = cVar.f2113h;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                break;
            }
            i5++;
        }
        if (i5 < 0) {
            c cVar2 = this.f2141r;
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = cVar2.D;
            int i6 = cVar2.f2113h;
            i5 = 0;
            while (true) {
                if (i5 >= i6) {
                    i5 = -1;
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i5], iArr3)) {
                    break;
                }
                i5++;
            }
        }
        if (i5 == this.f2136l) {
            return zF;
        }
        SystemClock.uptimeMillis();
        this.f.getClass();
        Drawable drawable = this.f2132h;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
        if (i5 >= 0) {
            c cVar3 = this.f;
            if (i5 < cVar3.f2113h) {
                Drawable drawableB = cVar3.b(i5);
                this.f2132h = drawableB;
                this.f2136l = i5;
                if (drawableB != null) {
                    this.f.getClass();
                    d(drawableB);
                }
            } else {
                this.f2132h = null;
                this.f2136l = -1;
            }
        } else {
            this.f2132h = null;
            this.f2136l = -1;
        }
        if (this.f2138o != 0 || this.f2139p != 0) {
            d0 d0Var = this.n;
            if (d0Var == null) {
                this.n = new d0(2, this);
            } else {
                unscheduleSelf(d0Var);
            }
            b(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        if (drawable != this.f2132h || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.f2135k && this.f2134j == i4) {
            return;
        }
        this.f2135k = true;
        this.f2134j = i4;
        Drawable drawable = this.f2132h;
        if (drawable != null) {
            if (this.f2138o == 0) {
                drawable.setAlpha(i4);
            } else {
                b(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        c cVar = this.f;
        if (cVar.f2127w != z4) {
            cVar.f2127w = z4;
            Drawable drawable = this.f2132h;
            if (drawable != null) {
                drawable.setAutoMirrored(z4);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f;
        cVar.f2129y = true;
        if (cVar.f2128x != colorFilter) {
            cVar.f2128x = colorFilter;
            Drawable drawable = this.f2132h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z4) {
        c cVar = this.f;
        if (cVar.f2125u != z4) {
            cVar.f2125u = z4;
            Drawable drawable = this.f2132h;
            if (drawable != null) {
                drawable.setDither(z4);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f4) {
        Drawable drawable = this.f2132h;
        if (drawable != null) {
            drawable.setHotspot(f, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i4, int i5, int i6, int i7) {
        Rect rect = this.f2131g;
        if (rect == null) {
            this.f2131g = new Rect(i4, i5, i6, i7);
        } else {
            rect.set(i4, i5, i6, i7);
        }
        Drawable drawable = this.f2132h;
        if (drawable != null) {
            drawable.setHotspotBounds(i4, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f;
        cVar.B = true;
        if (cVar.f2130z != colorStateList) {
            cVar.f2130z = colorStateList;
            this.f2132h.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f;
        cVar.C = true;
        if (cVar.A != mode) {
            cVar.A = mode;
            this.f2132h.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        Drawable drawable = this.f2133i;
        if (drawable != null) {
            drawable.setVisible(z4, z5);
        }
        Drawable drawable2 = this.f2132h;
        if (drawable2 != null) {
            drawable2.setVisible(z4, z5);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f2132h || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
