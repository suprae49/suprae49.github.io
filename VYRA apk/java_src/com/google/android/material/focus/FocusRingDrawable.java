package com.google.android.material.focus;

import a3.f;
import a3.j;
import a3.m;
import a3.o;
import a3.q;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q2.a;
import q2.b;
import t1.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ColorDrawable f1488u = new ColorDrawable(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f1489v = {R.attr.state_focused, R.attr.state_window_focused};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final OvershootInterpolator f1490w = new OvershootInterpolator(4.0f);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f1491x = new a("interpolation");
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f1492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f1493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f1494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f1495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Matrix f1496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f1497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f1498m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObjectAnimator f1499o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f1504t;

    private FocusRingDrawable(b bVar, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f = paint;
        this.f1492g = new RectF();
        this.f1493h = new Rect();
        this.f1494i = new Path();
        this.f1495j = new Path();
        this.f1496k = new Matrix();
        this.f1497l = q.b();
        this.n = -1.0f;
        this.f1500p = 1.0f;
        this.f1502r = false;
        this.f1503s = false;
        b bVar2 = new b(bVar);
        this.f1504t = bVar2;
        Drawable.ConstantState constantState = bVar2.f3453a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f1504t.f3461j)) {
            return;
        }
        paint.setStrokeWidth(this.f1504t.f3461j);
    }

    public static int c(TypedArray typedArray, int i4) {
        if (typedArray.getType(i4) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i4, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static FocusRingDrawable e(Context context, RippleDrawable rippleDrawable, j jVar) {
        if (!l.q(context.getTheme(), co.median.android.eeqadjy.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f1488u);
        if (jVar != null) {
            focusRingDrawable.f1498m = new WeakReference(jVar);
        }
        rippleDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(rippleDrawable);
        return focusRingDrawable;
    }

    public static float f(float f, Resources.Theme theme, int i4, TypedArray typedArray, int i5, int i6) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i4 != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i4, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i5, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i6 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i6);
    }

    public final void a(RectF rectF) {
        Rect rect = this.f1504t.f3473w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.f1498m;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((j) this.f1498m.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.f1493h;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        d(theme);
    }

    public final void b(Canvas canvas, Path path, float f, float f4, int i4) {
        RectF rectF = this.f1492g;
        a(rectF);
        float f5 = f * 2.0f;
        float fWidth = 1.0f - (f5 / rectF.width());
        float fHeight = 1.0f - (f5 / rectF.height());
        Matrix matrix = this.f1496k;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f1494i;
        path.transform(matrix, path2);
        float f6 = f4 * this.f1500p;
        Paint paint = this.f;
        paint.setStrokeWidth(f6);
        paint.setColor(i4);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    public final void d(Resources.Theme theme) {
        TypedValue typedValueP;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(a2.a.n);
        int i4 = this.f1504t.f3456d;
        if (i4 != Integer.MIN_VALUE && (typedValueP = l.p(theme, i4)) != null) {
            b bVar = this.f1504t;
            bVar.f3455c = typedValueP.data != 0;
            bVar.f3457e = true;
        }
        b bVar2 = this.f1504t;
        if (!bVar2.f3457e) {
            bVar2.f3455c = l.q(theme, co.median.android.eeqadjy.R.attr.focusRingsEnabled, bVar2.f3455c);
        }
        b bVar3 = this.f1504t;
        if (bVar3.f3455c) {
            int color = bVar3.f;
            int i5 = bVar3.f3458g;
            if (color == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue, true)) {
                        color = typedValue.data;
                    } else {
                        color = typedArrayObtainStyledAttributes.getColor(5, -16777216);
                    }
                } else {
                    color = typedArrayObtainStyledAttributes.getColor(5, -16777216);
                }
            }
            bVar3.f = color;
            b bVar4 = this.f1504t;
            int color2 = bVar4.f3459h;
            int i6 = bVar4.f3460i;
            if (color2 == Integer.MIN_VALUE) {
                if (i6 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i6, typedValue2, true)) {
                        color2 = typedValue2.data;
                    } else {
                        color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
                    }
                } else {
                    color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
                }
            }
            bVar4.f3459h = color2;
            b bVar5 = this.f1504t;
            bVar5.f3461j = f(bVar5.f3461j, theme, bVar5.f3462k, typedArrayObtainStyledAttributes, 6, co.median.android.eeqadjy.R.dimen.mtrl_focus_ring_outer_stroke_width);
            b bVar6 = this.f1504t;
            bVar6.f3463l = f(bVar6.f3463l, theme, bVar6.f3464m, typedArrayObtainStyledAttributes, 3, co.median.android.eeqadjy.R.dimen.mtrl_focus_ring_inner_stroke_width);
            b bVar7 = this.f1504t;
            bVar7.n = f(bVar7.n, theme, bVar7.f3465o, typedArrayObtainStyledAttributes, 7, 0);
            b bVar8 = this.f1504t;
            bVar8.f3466p = f(bVar8.f3466p, theme, bVar8.f3467q, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.f1504t.f3466p)) {
                this.f1504t.f3466p = 0.0f;
            }
            b bVar9 = this.f1504t;
            bVar9.f3468r = f(bVar9.f3468r, theme, bVar9.f3469s, typedArrayObtainStyledAttributes, 2, co.median.android.eeqadjy.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            b bVar10 = this.f1504t;
            int i7 = bVar10.f3471u;
            int[] iArr = a2.a.L;
            if (i7 != Integer.MIN_VALUE) {
                bVar10.f3470t = o.h(theme.obtainStyledAttributes(i7, iArr), new a3.a(0.0f)).a();
            } else {
                int i8 = bVar10.f3472v;
                if (i8 == Integer.MIN_VALUE) {
                    i8 = co.median.android.eeqadjy.R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueP2 = l.p(theme, i8);
                if (typedValueP2 != null) {
                    this.f1504t.f3470t = o.h(theme.obtainStyledAttributes(typedValueP2.resourceId, iArr), new a3.a(0.0f)).a();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f;
        paint.setStyle(style);
        if (Float.isNaN(this.f1504t.f3461j)) {
            return;
        }
        paint.setStrokeWidth(this.f1504t.f3461j);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fMax;
        Drawable drawable;
        int radius;
        super.draw(canvas);
        b bVar = this.f1504t;
        if (bVar.f3455c && this.f1502r) {
            float f = bVar.f3466p;
            float f4 = bVar.f3461j / 2.0f;
            float f5 = this.f1500p;
            float f6 = (f4 * f5) + f;
            float f7 = ((bVar.f3463l / 2.0f) * f5) + f + bVar.f3468r;
            Path path = this.f1495j;
            if (path.isEmpty()) {
                WeakReference weakReference = this.f1498m;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = ((j) this.f1498m.get()).n;
                    if (path.isEmpty()) {
                        path = null;
                    }
                }
            }
            Path path2 = path;
            b bVar2 = this.f1504t;
            if (path2 != null) {
                b(canvas, path2, f7, bVar2.f3463l, bVar2.f3459h);
                b bVar3 = this.f1504t;
                b(canvas, path2, f6, bVar3.f3461j, bVar3.f);
                return;
            }
            if (Float.isNaN(bVar2.n)) {
                fMax = this.n;
                if (fMax < 0.0f) {
                    WeakReference weakReference2 = this.f1498m;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        drawable = getDrawable();
                        if ((drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
                            fMax = 0.0f;
                        } else {
                            fMax = radius;
                        }
                    } else {
                        j jVar = (j) this.f1498m.get();
                        float fC = jVar.c(jVar.h(), jVar.f88g.f70a.c(), jVar.H);
                        if (fC >= 0.0f) {
                            fC *= jVar.f88g.f77i;
                        }
                        if (fC >= 0.0f) {
                            fMax = Math.max(0.0f, fC - (this.f1504t.f3461j / 2.0f));
                        } else {
                            drawable = getDrawable();
                            if (drawable instanceof RippleDrawable) {
                                fMax = 0.0f;
                            } else {
                                fMax = 0.0f;
                            }
                        }
                    }
                }
            } else {
                fMax = this.f1504t.n;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.f1504t.f3461j / 2.0f));
            b bVar4 = this.f1504t;
            float f8 = bVar4.f3463l;
            int i4 = bVar4.f3459h;
            RectF rectF = this.f1492g;
            a(rectF);
            rectF.inset(f7, f7);
            float f9 = f8 * this.f1500p;
            Paint paint = this.f;
            paint.setStrokeWidth(f9);
            paint.setColor(i4);
            canvas.drawRoundRect(rectF, fMax2, fMax2, paint);
            b bVar5 = this.f1504t;
            float f10 = bVar5.f3461j;
            int i5 = bVar5.f;
            a(rectF);
            rectF.inset(f6, f6);
            paint.setStrokeWidth(f10 * this.f1500p);
            paint.setColor(i5);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
        }
    }

    public final void g(m mVar) {
        RectF rectF = this.f1492g;
        a(rectF);
        o oVarB = mVar.b(f1489v);
        boolean zJ = oVarB.j(rectF);
        Path path = this.f1495j;
        if (!zJ) {
            this.f1497l.a(oVarB, null, 1.0f, rectF, null, path);
            this.n = -1.0f;
            return;
        }
        b bVar = this.f1504t;
        float f = ((bVar.f3461j / 2.0f) * this.f1500p) + bVar.f3466p;
        rectF.inset(f, f);
        this.n = oVarB.f127e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        b bVar = this.f1504t;
        if (bVar.f3453a == null) {
            return null;
        }
        bVar.f3454b = getChangingConfigurations();
        return this.f1504t;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.f1504t.f3455c;
        } catch (NoSuchMethodError unused) {
            return this.f1504t.f3455c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = a2.a.n;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f1504t.f3456d = c(typedArrayObtainStyledAttributes, 0);
        if (this.f1504t.f3456d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            b bVar = this.f1504t;
            bVar.f3455c = typedArrayObtainStyledAttributes.getBoolean(0, bVar.f3455c);
            this.f1504t.f3457e = true;
        }
        this.f1504t.f3458g = c(typedArrayObtainStyledAttributes, 5);
        b bVar2 = this.f1504t;
        if (bVar2.f3458g == Integer.MIN_VALUE) {
            bVar2.f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f1504t.f3460i = c(typedArrayObtainStyledAttributes, 1);
        b bVar3 = this.f1504t;
        if (bVar3.f3460i == Integer.MIN_VALUE) {
            bVar3.f3459h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f1504t.f3462k = c(typedArrayObtainStyledAttributes, 6);
        b bVar4 = this.f1504t;
        if (bVar4.f3462k == Integer.MIN_VALUE) {
            bVar4.f3461j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f1504t.f3464m = c(typedArrayObtainStyledAttributes, 3);
        b bVar5 = this.f1504t;
        if (bVar5.f3464m == Integer.MIN_VALUE) {
            bVar5.f3463l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f1504t.f3464m = c(typedArrayObtainStyledAttributes, 3);
        b bVar6 = this.f1504t;
        if (bVar6.f3464m == Integer.MIN_VALUE) {
            bVar6.f3463l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f1504t.f3465o = c(typedArrayObtainStyledAttributes, 7);
        b bVar7 = this.f1504t;
        if (bVar7.f3465o == Integer.MIN_VALUE) {
            bVar7.n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f1504t.f3467q = c(typedArrayObtainStyledAttributes, 4);
        b bVar8 = this.f1504t;
        if (bVar8.f3467q == Integer.MIN_VALUE) {
            bVar8.f3466p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f1504t.f3469s = c(typedArrayObtainStyledAttributes, 2);
        b bVar9 = this.f1504t;
        if (bVar9.f3469s == Integer.MIN_VALUE) {
            bVar9.f3468r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f1504t.f3472v = c(typedArrayObtainStyledAttributes, 8);
        this.f1504t.f3471u = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.f1504t.f3453a = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = f1488u;
            setDrawable(colorDrawable);
            this.f1504t.f3453a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f1504t.f3455c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f1499o;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f1499o = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f1503s && super.mutate() == this) {
            this.f1504t = new b(this.f1504t);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f1504t.f3453a = drawable.getConstantState();
            }
            this.f1503s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        o oVar;
        super.onBoundsChange(rect);
        b bVar = this.f1504t;
        if (bVar.f3455c) {
            m mVar = bVar.f3470t;
            if (mVar != null) {
                g(mVar);
                return;
            }
            Drawable drawable = getDrawable();
            m mVar2 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    a3.l lVar = new a3.l();
                    a3.l lVar2 = new a3.l();
                    a3.l lVar3 = new a3.l();
                    a3.l lVar4 = new a3.l();
                    f fVar = new f(0);
                    f fVar2 = new f(0);
                    f fVar3 = new f(0);
                    f fVar4 = new f(0);
                    float radius = outline.getRadius();
                    a3.a aVar = new a3.a(radius);
                    a3.a aVar2 = new a3.a(radius);
                    a3.a aVar3 = new a3.a(radius);
                    a3.a aVar4 = new a3.a(radius);
                    oVar = new o();
                    oVar.f123a = lVar;
                    oVar.f124b = lVar2;
                    oVar.f125c = lVar3;
                    oVar.f126d = lVar4;
                    oVar.f127e = aVar;
                    oVar.f = aVar2;
                    oVar.f128g = aVar3;
                    oVar.f129h = aVar4;
                    oVar.f130i = fVar;
                    oVar.f131j = fVar2;
                    oVar.f132k = fVar3;
                    oVar.f133l = fVar4;
                    mVar2 = oVar;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    a3.l lVar5 = new a3.l();
                    a3.l lVar6 = new a3.l();
                    a3.l lVar7 = new a3.l();
                    a3.l lVar8 = new a3.l();
                    f fVar5 = new f(0);
                    f fVar6 = new f(0);
                    f fVar7 = new f(0);
                    f fVar8 = new f(0);
                    a3.a aVar5 = new a3.a(Math.min(cornerRadii[0], cornerRadii[1]));
                    a3.a aVar6 = new a3.a(Math.min(cornerRadii[2], cornerRadii[3]));
                    a3.a aVar7 = new a3.a(Math.min(cornerRadii[4], cornerRadii[5]));
                    a3.a aVar8 = new a3.a(Math.min(cornerRadii[6], cornerRadii[7]));
                    oVar = new o();
                    oVar.f123a = lVar5;
                    oVar.f124b = lVar6;
                    oVar.f125c = lVar7;
                    oVar.f126d = lVar8;
                    oVar.f127e = aVar5;
                    oVar.f = aVar6;
                    oVar.f128g = aVar7;
                    oVar.f129h = aVar8;
                    oVar.f130i = fVar5;
                    oVar.f131j = fVar6;
                    oVar.f132k = fVar7;
                    oVar.f133l = fVar8;
                    mVar2 = oVar;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        a3.l lVar9 = new a3.l();
                        a3.l lVar10 = new a3.l();
                        a3.l lVar11 = new a3.l();
                        a3.l lVar12 = new a3.l();
                        f fVar9 = new f(0);
                        f fVar10 = new f(0);
                        f fVar11 = new f(0);
                        f fVar12 = new f(0);
                        a3.a aVar9 = new a3.a(cornerRadius);
                        a3.a aVar10 = new a3.a(cornerRadius);
                        a3.a aVar11 = new a3.a(cornerRadius);
                        a3.a aVar12 = new a3.a(cornerRadius);
                        o oVar2 = new o();
                        oVar2.f123a = lVar9;
                        oVar2.f124b = lVar10;
                        oVar2.f125c = lVar11;
                        oVar2.f126d = lVar12;
                        oVar2.f127e = aVar9;
                        oVar2.f = aVar10;
                        oVar2.f128g = aVar11;
                        oVar2.f129h = aVar12;
                        oVar2.f130i = fVar9;
                        oVar2.f131j = fVar10;
                        oVar2.f132k = fVar11;
                        oVar2.f133l = fVar12;
                        mVar2 = oVar2;
                    }
                }
            }
            if (mVar2 != null) {
                g(mVar2);
            } else {
                this.n = -1.0f;
                this.f1495j.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        b bVar = this.f1504t;
        if (!bVar.f3455c) {
            this.f1502r = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(bVar.f3474x, iArr);
        boolean z4 = this.f1502r != zStateSetMatches;
        this.f1502r = zStateSetMatches;
        if (z4 && iArr.length > 0 && !this.f1501q) {
            ObjectAnimator objectAnimator = this.f1499o;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f1499o = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1491x, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(f1490w);
                objectAnimatorOfFloat.addListener(new b3.f(7, this));
                this.f1499o = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.f1500p = 1.0f;
            }
        }
        this.f1501q = iArr.length == 0;
        return super.onStateChange(iArr) || z4;
    }

    public FocusRingDrawable() {
        super(null);
        this.f = new Paint(1);
        this.f1492g = new RectF();
        this.f1493h = new Rect();
        this.f1494i = new Path();
        this.f1495j = new Path();
        this.f1496k = new Matrix();
        this.f1497l = q.b();
        this.n = -1.0f;
        this.f1500p = 1.0f;
        this.f1502r = false;
        this.f1503s = false;
        this.f1504t = new b(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f = new Paint(1);
        this.f1492g = new RectF();
        this.f1493h = new Rect();
        this.f1494i = new Path();
        this.f1495j = new Path();
        this.f1496k = new Matrix();
        this.f1497l = q.b();
        this.n = -1.0f;
        this.f1500p = 1.0f;
        this.f1502r = false;
        this.f1503s = false;
        b bVar = new b(null);
        this.f1504t = bVar;
        if (drawable != null) {
            bVar.f3453a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(b bVar, Resources resources, a aVar) {
        this(bVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
