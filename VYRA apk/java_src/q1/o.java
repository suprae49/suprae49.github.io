package q1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final PorterDuff.Mode f3445o = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f3446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuffColorFilter f3447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ColorFilter f3448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f3451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Matrix f3452m;
    public final Rect n;

    public o() {
        this.f3450k = true;
        this.f3451l = new float[9];
        this.f3452m = new Matrix();
        this.n = new Rect();
        m mVar = new m();
        mVar.f3435c = null;
        mVar.f3436d = f3445o;
        mVar.f3434b = new l();
        this.f3446g = mVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3448i;
        if (colorFilter == null) {
            colorFilter = this.f3447h;
        }
        Matrix matrix = this.f3452m;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3451l;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        m mVar = this.f3446g;
        Bitmap bitmap = mVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != mVar.f.getHeight()) {
            mVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            mVar.f3442k = true;
        }
        boolean z4 = this.f3450k;
        m mVar2 = this.f3446g;
        if (!z4) {
            mVar2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(mVar2.f);
            l lVar = mVar2.f3434b;
            lVar.a(lVar.f3425g, l.f3419p, canvas2, iMin, iMin2);
        } else if (mVar2.f3442k || mVar2.f3438g != mVar2.f3435c || mVar2.f3439h != mVar2.f3436d || mVar2.f3441j != mVar2.f3437e || mVar2.f3440i != mVar2.f3434b.getRootAlpha()) {
            m mVar3 = this.f3446g;
            mVar3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(mVar3.f);
            l lVar2 = mVar3.f3434b;
            lVar2.a(lVar2.f3425g, l.f3419p, canvas3, iMin, iMin2);
            m mVar4 = this.f3446g;
            mVar4.f3438g = mVar4.f3435c;
            mVar4.f3439h = mVar4.f3436d;
            mVar4.f3440i = mVar4.f3434b.getRootAlpha();
            mVar4.f3441j = mVar4.f3437e;
            mVar4.f3442k = false;
        }
        m mVar5 = this.f3446g;
        if (mVar5.f3434b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (mVar5.f3443l == null) {
                Paint paint2 = new Paint();
                mVar5.f3443l = paint2;
                paint2.setFilterBitmap(true);
            }
            mVar5.f3443l.setAlpha(mVar5.f3434b.getRootAlpha());
            mVar5.f3443l.setColorFilter(colorFilter);
            paint = mVar5.f3443l;
        }
        canvas.drawBitmap(mVar5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getAlpha() : this.f3446g.f3434b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3446g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getColorFilter() : this.f3448i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f != null) {
            return new n(this.f.getConstantState());
        }
        this.f3446g.f3433a = getChangingConfigurations();
        return this.f3446g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3446g.f3434b.f3427i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3446g.f3434b.f3426h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i4;
        char c4;
        int i5;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.f3446g;
        mVar.f3434b = new l();
        TypedArray typedArrayG = e0.b.g(resources, theme, attributeSet, a.f3381a);
        m mVar2 = this.f3446g;
        l lVar = mVar2.f3434b;
        int i6 = !e0.b.d(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i6 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i6 != 5) {
            if (i6 != 9) {
                switch (i6) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        mVar2.f3436d = mode;
        ColorStateList colorStateListA = null;
        int i7 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayG.getValue(1, typedValue);
            int i8 = typedValue.type;
            if (i8 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i8 < 28 || i8 > 31) {
                Resources resources2 = typedArrayG.getResources();
                int resourceId = typedArrayG.getResourceId(1, 0);
                ThreadLocal threadLocal = e0.c.f2012a;
                try {
                    colorStateListA = e0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e5) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e5);
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            mVar2.f3435c = colorStateList;
        }
        boolean z4 = mVar2.f3437e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z4 = typedArrayG.getBoolean(5, z4);
        }
        mVar2.f3437e = z4;
        float f = lVar.f3428j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayG.getFloat(7, f);
        }
        lVar.f3428j = f;
        float f4 = lVar.f3429k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f4 = typedArrayG.getFloat(8, f4);
        }
        lVar.f3429k = f4;
        if (lVar.f3428j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        lVar.f3426h = typedArrayG.getDimension(3, lVar.f3426h);
        float dimension = typedArrayG.getDimension(2, lVar.f3427i);
        lVar.f3427i = dimension;
        if (lVar.f3426h <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = lVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayG.getFloat(4, alpha);
        }
        lVar.setAlpha(alpha);
        String string = typedArrayG.getString(0);
        if (string != null) {
            lVar.f3431m = string;
            lVar.f3432o.put(string, lVar);
        }
        typedArrayG.recycle();
        mVar.f3433a = getChangingConfigurations();
        mVar.f3442k = true;
        m mVar3 = this.f3446g;
        l lVar2 = mVar3.f3434b;
        ArrayDeque arrayDeque = new ArrayDeque();
        i iVar = lVar2.f3425g;
        p.f fVar = lVar2.f3432o;
        arrayDeque.push(iVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z5 = true;
        while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                i iVar2 = (i) arrayDeque.peek();
                i4 = depth;
                if ("path".equals(name)) {
                    h hVar = new h();
                    hVar.f3398e = 0.0f;
                    hVar.f3399g = 1.0f;
                    hVar.f3400h = 1.0f;
                    hVar.f3401i = 0.0f;
                    hVar.f3402j = 1.0f;
                    hVar.f3403k = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    hVar.f3404l = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    hVar.f3405m = join2;
                    hVar.n = 4.0f;
                    TypedArray typedArrayG2 = e0.b.g(resources, theme, attributeSet, a.f3383c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayG2.getString(0);
                        if (string2 != null) {
                            hVar.f3417b = string2;
                        }
                        String string3 = typedArrayG2.getString(2);
                        if (string3 != null) {
                            hVar.f3416a = h0.s(string3);
                        }
                        hVar.f = e0.b.c(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                        float f5 = hVar.f3400h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f5 = typedArrayG2.getFloat(12, f5);
                        }
                        hVar.f3400h = f5;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG2.getInt(8, -1) : -1;
                        Paint.Cap cap3 = hVar.f3404l;
                        if (i9 == 0) {
                            cap = cap2;
                        } else if (i9 != 1) {
                            cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        hVar.f3404l = cap;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG2.getInt(9, -1) : -1;
                        Paint.Join join3 = hVar.f3405m;
                        if (i10 == 0) {
                            join = join2;
                        } else if (i10 != 1) {
                            join = i10 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        hVar.f3405m = join;
                        float f6 = hVar.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f6 = typedArrayG2.getFloat(10, f6);
                        }
                        hVar.n = f6;
                        hVar.f3397d = e0.b.c(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                        float f7 = hVar.f3399g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f7 = typedArrayG2.getFloat(11, f7);
                        }
                        hVar.f3399g = f7;
                        float f8 = hVar.f3398e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f8 = typedArrayG2.getFloat(4, f8);
                        }
                        hVar.f3398e = f8;
                        float f9 = hVar.f3402j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f9 = typedArrayG2.getFloat(6, f9);
                        }
                        hVar.f3402j = f9;
                        float f10 = hVar.f3403k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f10 = typedArrayG2.getFloat(7, f10);
                        }
                        hVar.f3403k = f10;
                        float f11 = hVar.f3401i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f11 = typedArrayG2.getFloat(5, f11);
                        }
                        hVar.f3401i = f11;
                        int i11 = hVar.f3418c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i11 = typedArrayG2.getInt(13, i11);
                        }
                        hVar.f3418c = i11;
                    }
                    typedArrayG2.recycle();
                    iVar2.f3407b.add(hVar);
                    if (hVar.getPathName() != null) {
                        fVar.put(hVar.getPathName(), hVar);
                    }
                    mVar3.f3433a = mVar3.f3433a;
                    z5 = false;
                    c4 = '\b';
                } else {
                    c4 = '\b';
                    if ("clip-path".equals(name)) {
                        g gVar = new g();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayG3 = e0.b.g(resources, theme, attributeSet, a.f3384d);
                            String string4 = typedArrayG3.getString(0);
                            if (string4 != null) {
                                gVar.f3417b = string4;
                            }
                            String string5 = typedArrayG3.getString(1);
                            if (string5 != null) {
                                gVar.f3416a = h0.s(string5);
                            }
                            gVar.f3418c = !e0.b.d(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                            typedArrayG3.recycle();
                        }
                        iVar2.f3407b.add(gVar);
                        if (gVar.getPathName() != null) {
                            fVar.put(gVar.getPathName(), gVar);
                        }
                        mVar3.f3433a = mVar3.f3433a;
                    } else if ("group".equals(name)) {
                        i iVar3 = new i();
                        TypedArray typedArrayG4 = e0.b.g(resources, theme, attributeSet, a.f3382b);
                        float f12 = iVar3.f3408c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f12 = typedArrayG4.getFloat(5, f12);
                        }
                        iVar3.f3408c = f12;
                        iVar3.f3409d = typedArrayG4.getFloat(1, iVar3.f3409d);
                        iVar3.f3410e = typedArrayG4.getFloat(2, iVar3.f3410e);
                        float f13 = iVar3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f13 = typedArrayG4.getFloat(3, f13);
                        }
                        iVar3.f = f13;
                        float f14 = iVar3.f3411g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f14 = typedArrayG4.getFloat(4, f14);
                        }
                        iVar3.f3411g = f14;
                        float f15 = iVar3.f3412h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f15 = typedArrayG4.getFloat(6, f15);
                        }
                        iVar3.f3412h = f15;
                        float f16 = iVar3.f3413i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f16 = typedArrayG4.getFloat(7, f16);
                        }
                        iVar3.f3413i = f16;
                        String string6 = typedArrayG4.getString(0);
                        if (string6 != null) {
                            iVar3.f3415k = string6;
                        }
                        iVar3.c();
                        typedArrayG4.recycle();
                        iVar2.f3407b.add(iVar3);
                        arrayDeque.push(iVar3);
                        if (iVar3.getGroupName() != null) {
                            fVar.put(iVar3.getGroupName(), iVar3);
                        }
                        mVar3.f3433a = mVar3.f3433a;
                    }
                }
                i5 = 1;
            } else {
                i4 = depth;
                c4 = '\b';
                i5 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i7 = i5;
            depth = i4;
        }
        if (z5) {
            throw new XmlPullParserException("no path defined");
        }
        this.f3447h = a(mVar.f3435c, mVar.f3436d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f;
        return drawable != null ? drawable.isAutoMirrored() : this.f3446g.f3437e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        m mVar = this.f3446g;
        if (mVar == null) {
            return false;
        }
        l lVar = mVar.f3434b;
        if (lVar.n == null) {
            lVar.n = Boolean.valueOf(lVar.f3425g.a());
        }
        if (lVar.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f3446g.f3435c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3449j && super.mutate() == this) {
            m mVar = this.f3446g;
            m mVar2 = new m();
            mVar2.f3435c = null;
            mVar2.f3436d = f3445o;
            if (mVar != null) {
                mVar2.f3433a = mVar.f3433a;
                l lVar = new l(mVar.f3434b);
                mVar2.f3434b = lVar;
                if (mVar.f3434b.f3424e != null) {
                    lVar.f3424e = new Paint(mVar.f3434b.f3424e);
                }
                if (mVar.f3434b.f3423d != null) {
                    mVar2.f3434b.f3423d = new Paint(mVar.f3434b.f3423d);
                }
                mVar2.f3435c = mVar.f3435c;
                mVar2.f3436d = mVar.f3436d;
                mVar2.f3437e = mVar.f3437e;
            }
            this.f3446g = mVar2;
            this.f3449j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f3446g;
        ColorStateList colorStateList = mVar.f3435c;
        if (colorStateList == null || (mode = mVar.f3436d) == null) {
            z4 = false;
        } else {
            this.f3447h = a(colorStateList, mode);
            invalidateSelf();
            z4 = true;
        }
        l lVar = mVar.f3434b;
        if (lVar.n == null) {
            lVar.n = Boolean.valueOf(lVar.f3425g.a());
        }
        if (lVar.n.booleanValue()) {
            boolean zB = mVar.f3434b.f3425g.b(iArr);
            mVar.f3442k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.f3446g.f3434b.getRootAlpha() != i4) {
            this.f3446g.f3434b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f3446g.f3437e = z4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3448i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTint(i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        m mVar = this.f3446g;
        if (mVar.f3435c != colorStateList) {
            mVar.f3435c = colorStateList;
            this.f3447h = a(colorStateList, mVar.f3436d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        m mVar = this.f3446g;
        if (mVar.f3436d != mode) {
            mVar.f3436d = mode;
            this.f3447h = a(mVar.f3435c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f;
        return drawable != null ? drawable.setVisible(z4, z5) : super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public o(m mVar) {
        this.f3450k = true;
        this.f3451l = new float[9];
        this.f3452m = new Matrix();
        this.n = new Rect();
        this.f3446g = mVar;
        this.f3447h = a(mVar.f3435c, mVar.f3436d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
