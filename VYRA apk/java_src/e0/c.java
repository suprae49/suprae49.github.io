package e0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import co.median.android.eeqadjy.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2012a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        int iE;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = a0.a.f2a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i4, i4);
                int resourceId = ObtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f2012a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i4, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i4, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i4, -65281);
                }
                if (ObtainAttributes.hasValue(r4)) {
                    f = ObtainAttributes.getFloat(r4, 1.0f);
                } else {
                    f = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r4;
                float f4 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i7 = i4;
                int i8 = i7;
                while (i7 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i9 = i8 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i7, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i8] = attributeNameResource;
                        i8 = i9;
                    }
                    i7++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i8);
                float f5 = 100.0f;
                boolean z4 = (f4 < 0.0f || f4 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f != 1.0f || z4) {
                    int iJ = h0.j((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (z4) {
                        a aVarA = a.a(color);
                        float f6 = aVarA.f2001a;
                        float f7 = aVarA.f2002b;
                        m mVar = m.f2034k;
                        if (f7 >= 1.0d && Math.round(f4) > 0.0d && Math.round(f4) < 100.0d) {
                            float fMin = f6 < 0.0f ? 0.0f : Math.min(360.0f, f6);
                            float f8 = 0.0f;
                            float f9 = f7;
                            boolean z5 = r16 == true ? 1 : 0;
                            a aVar = null;
                            while (true) {
                                if (Math.abs(f8 - f7) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (aVar != null) {
                                        iE = aVar.c(mVar);
                                        break;
                                    }
                                    iE = b.e(f4);
                                    break;
                                }
                                float f10 = 1000.0f;
                                float f11 = f5;
                                float f12 = 0.0f;
                                float f13 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f12 - f11) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f5 = f5;
                                        break;
                                    }
                                    f5 = f5;
                                    float f14 = ((f11 - f12) / 2.0f) + f12;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iC = a.b(f14, f9, fMin).c(m.f2034k);
                                    float f15 = b.f(Color.red(iC));
                                    float f16 = b.f(Color.green(iC));
                                    float f17 = b.f(Color.blue(iC));
                                    float[] fArr = b.f2009d[r16 == true ? 1 : 0];
                                    float f18 = ((f17 * fArr[2]) + ((f16 * fArr[r16 == true ? 1 : 0]) + (f15 * fArr[0]))) / f5;
                                    float fCbrt = f18 <= 0.008856452f ? f18 * 903.2963f : (((float) Math.cbrt(f18)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f4 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        a aVarB = a.b(aVarA2.f2003c, aVarA2.f2002b, fMin);
                                        float f19 = aVarA2.f2004d - aVarB.f2004d;
                                        float f20 = aVarA2.f2005e - aVarB.f2005e;
                                        float f21 = aVarA2.f - aVarB.f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f21 * f21) + (f20 * f20) + (f19 * f19)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f13 = fPow;
                                            f10 = fAbs;
                                            aVar2 = aVarA2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f10 == 0.0f && f13 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f4) {
                                        f12 = f14;
                                    } else {
                                        f11 = f14;
                                    }
                                    f5 = f5;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                a aVar3 = aVar2;
                                if (!z5) {
                                    if (aVar3 == null) {
                                        f7 = f9;
                                    } else {
                                        aVar = aVar3;
                                        f8 = f9;
                                    }
                                    f9 = ((f7 - f8) / 2.0f) + f8;
                                } else {
                                    if (aVar3 != null) {
                                        iE = aVar3.c(mVar);
                                        break;
                                    }
                                    f9 = ((f7 - f8) / 2.0f) + f8;
                                    z5 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iE = b.e(f4);
                        }
                        color = iE;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iJ << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i10 = i5 + 1;
                if (i10 > iArr.length) {
                    int[] iArr4 = new int[i5 <= 4 ? 8 : i5 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i5);
                    iArr = iArr4;
                }
                iArr[i5] = color;
                if (i10 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i5);
                    objArr = objArr2;
                }
                objArr[i5] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i5 = i10;
                r4 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i4 = 0;
            } else {
                int i11 = depth2;
                r4 = r4 == true ? 1 : 0;
                depth2 = i11;
                i4 = 0;
            }
        }
        int[] iArr5 = new int[i5];
        int[][] iArr6 = new int[i5][];
        System.arraycopy(iArr, 0, iArr5, 0, i5);
        System.arraycopy(objArr, 0, iArr6, 0, i5);
        return new ColorStateList(iArr6, iArr5);
    }
}
