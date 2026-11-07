package x2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import t1.l;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f4732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4736e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f4740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ColorStateList f4741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f4742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4743m;
    public boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4744o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Typeface f4745p;

    public d(Context context, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, d.a.f1653y);
        this.f4742l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f4741k = i.h(context, typedArrayObtainStyledAttributes, 3);
        i.h(context, typedArrayObtainStyledAttributes, 4);
        i.h(context, typedArrayObtainStyledAttributes, 5);
        this.f4735d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f4736e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i5 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f4743m = typedArrayObtainStyledAttributes.getResourceId(i5, 0);
        this.f4733b = typedArrayObtainStyledAttributes.getString(i5);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f4732a = i.h(context, typedArrayObtainStyledAttributes, 6);
        this.f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f4737g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f4738h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i4, a2.a.C);
        this.f4739i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f4740j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.f4734c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f4745p;
        int i4 = this.f4735d;
        if (typeface == null && (str = this.f4733b) != null) {
            this.f4745p = Typeface.create(str, i4);
        }
        if (this.f4745p == null) {
            int i5 = this.f4736e;
            if (i5 == 1) {
                this.f4745p = Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.f4745p = Typeface.SERIF;
            } else if (i5 != 3) {
                this.f4745p = Typeface.DEFAULT;
            } else {
                this.f4745p = Typeface.MONOSPACE;
            }
            this.f4745p = Typeface.create(this.f4745p, i4);
        }
    }

    public final void b(Context context, l lVar) {
        if (!c(context)) {
            a();
        }
        int i4 = this.f4743m;
        if (i4 == 0) {
            this.n = true;
        }
        if (this.n) {
            lVar.m(this.f4745p, true);
            return;
        }
        try {
            b bVar = new b(this, lVar);
            ThreadLocal threadLocal = e0.l.f2031a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                e0.l.a(context, i4, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            lVar.l(1);
        } catch (Exception e5) {
            Log.d("TextAppearance", "Error loading font " + this.f4733b, e5);
            this.n = true;
            lVar.l(-3);
        }
    }

    public final boolean c(Context context) throws Exception {
        Context context2;
        Typeface typefaceA;
        String string;
        Typeface typefaceCreate;
        if (this.n) {
            return true;
        }
        int i4 = this.f4743m;
        if (i4 != 0) {
            ThreadLocal threadLocal = e0.l.f2031a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceA = null;
            } else {
                context2 = context;
                typefaceA = e0.l.a(context2, i4, new TypedValue(), 0, null, false, true);
            }
            if (typefaceA != null) {
                this.f4745p = typefaceA;
                this.n = true;
                return true;
            }
            if (!this.f4744o) {
                this.f4744o = true;
                Resources resources = context2.getResources();
                int i5 = this.f4743m;
                if (i5 == 0 || !resources.getResourceTypeName(i5).equals("font")) {
                    string = null;
                    break;
                }
                try {
                    XmlResourceParser xml = resources.getXml(i5);
                    while (true) {
                        if (xml.getEventType() == 1) {
                            string = null;
                            break;
                        }
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), a0.a.f3b);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                        break;
                    }
                } catch (Throwable unused) {
                }
                if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                    typefaceCreate2 = Typeface.create(typefaceCreate, this.f4735d);
                }
            }
            if (typefaceCreate2 != null) {
                this.f4745p = typefaceCreate2;
                this.n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, l lVar) {
        e(context, textPaint, lVar);
        ColorStateList colorStateList = this.f4741k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f4732a;
        textPaint.setShadowLayer(this.f4738h, this.f, this.f4737g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, l lVar) {
        Typeface typeface;
        if (c(context) && this.n && (typeface = this.f4745p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f4745p);
        b(context, new c(this, context, textPaint, lVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceY = i.y(context.getResources().getConfiguration(), typeface);
        if (typefaceY != null) {
            typeface = typefaceY;
        }
        textPaint.setTypeface(typeface);
        int i4 = (~typeface.getStyle()) & this.f4735d;
        textPaint.setFakeBoldText((i4 & 1) != 0);
        textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f4742l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.f4734c);
        if (this.f4739i) {
            textPaint.setLetterSpacing(this.f4740j);
        }
    }
}
