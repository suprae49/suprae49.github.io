package e0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import androidx.emoji2.text.p;
import androidx.emoji2.text.t;
import java.util.ArrayList;
import k.b3;
import k.j1;
import k.u;
import org.xmlpull.v1.XmlPullParserException;
import p0.p0;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2015c;

    public d(Shader shader, ColorStateList colorStateList, int i4) {
        this.f2014b = shader;
        this.f2015c = colorStateList;
        this.f2013a = i4;
    }

    public static d b(Resources resources, int i4, Resources.Theme theme) {
        int next;
        float f;
        float f4;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i4);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new d(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayG = b.g(resources, theme, attributeSetAsAttributeSet, a0.a.f6e);
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayG.getFloat(8, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayG.getFloat(9, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayG.getFloat(10, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayG.getFloat(11, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayG.getFloat(3, 0.0f) : 0.0f;
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayG.getFloat(4, 0.0f) : 0.0f;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayG.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayG.getColor(0, 0) : 0;
        boolean z4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayG.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayG.getColor(1, 0) : 0;
        int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayG.getInt(6, 0) : 0;
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayG.getFloat(5, 0.0f) : 0.0f;
        typedArrayG.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f12 = f11;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f7;
            if (next2 == 1) {
                f4 = f8;
                break;
            }
            int depth2 = xml.getDepth();
            f4 = f8;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayG2 = b.g(resources, theme, attributeSetAsAttributeSet, a0.a.f);
                boolean zHasValue = typedArrayG2.hasValue(0);
                boolean zHasValue2 = typedArrayG2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayG2.getColor(0, 0);
                float f13 = typedArrayG2.getFloat(1, 0.0f);
                typedArrayG2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f13));
            }
            f7 = f;
            f8 = f4;
        }
        p pVar = arrayList2.size() > 0 ? new p(arrayList2, arrayList) : null;
        if (pVar == null) {
            pVar = z4 ? new p(color, color2, color3) : new p(color, color3);
        }
        if (i5 != 1) {
            if (i5 != 2) {
                int[] iArr = (int[]) pVar.f568g;
                float[] fArr = (float[]) pVar.f569h;
                if (i6 != 1) {
                    tileMode2 = i6 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f5, f6, f, f4, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f9, f10, (int[]) pVar.f568g, (float[]) pVar.f569h);
            }
        } else {
            if (f12 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) pVar.f568g;
            float[] fArr2 = (float[]) pVar.f569h;
            if (i6 != 1) {
                tileMode = i6 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f9, f10, f12, iArr2, fArr2, tileMode);
        }
        return new d(radialGradient, null, 0);
    }

    public void a() {
        b3 b3Var;
        ImageView imageView = (ImageView) this.f2014b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            j1.a(drawable);
        }
        if (drawable == null || (b3Var = (b3) this.f2015c) == null) {
            return;
        }
        u.e(drawable, b3Var, imageView.getDrawableState());
    }

    public boolean c() {
        ColorStateList colorStateList;
        return ((Shader) this.f2014b) == null && (colorStateList = (ColorStateList) this.f2015c) != null && colorStateList.isStateful();
    }

    public void d(AttributeSet attributeSet, int i4) {
        int resourceId;
        ImageView imageView = (ImageView) this.f2014b;
        Context context = imageView.getContext();
        int[] iArr = d.a.f;
        t tVarS = t.s(i4, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        p0.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) tVarS.f579c, i4);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = h0.w(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                j1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(tVarS.h(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(j1.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            tVarS.v();
        }
    }

    public d(ImageView imageView) {
        this.f2013a = 0;
        this.f2014b = imageView;
    }
}
