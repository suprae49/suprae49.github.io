package a3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import co.median.android.eeqadjy.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f64b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[][] f65c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f66d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f67e;
    public final e0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f68g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f69h;

    public g0(f0 f0Var) {
        this.f63a = f0Var.f55a;
        this.f64b = f0Var.f56b;
        this.f65c = f0Var.f57c;
        this.f66d = f0Var.f58d;
        this.f67e = f0Var.f59e;
        this.f = f0Var.f;
        this.f68g = f0Var.f60g;
        this.f69h = f0Var.f61h;
    }

    public static void f(f0 f0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = a2.a.A;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                o oVarA = o.f(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                f0Var.a(StateSet.trimStateSet(iArr2, i4), oVarA);
            }
        }
    }

    public static g0 g(Context context, TypedArray typedArray, int i4) {
        int next;
        int resourceId = typedArray.getResourceId(i4, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        f0 f0Var = new f0();
        f0Var.c();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
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
                if (xml.getName().equals("selector")) {
                    f(f0Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return f0Var.b();
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            f0Var.c();
        }
    }

    @Override // a3.m
    public final o a(float f) {
        return h().a(f);
    }

    @Override // a3.m
    public final o b(int[] iArr) {
        int i4;
        int i5;
        int[][] iArr2;
        int i6 = 0;
        while (true) {
            i4 = -1;
            i5 = this.f63a;
            iArr2 = this.f65c;
            if (i6 >= i5) {
                i6 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i6], iArr)) {
                break;
            }
            i6++;
        }
        if (i6 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            for (int i7 = 0; i7 < i5; i7++) {
                if (StateSet.stateSetMatches(iArr2[i7], iArr3)) {
                    i4 = i7;
                    break;
                }
            }
            i6 = i4;
        }
        o[] oVarArr = this.f66d;
        e0 e0Var = this.f69h;
        e0 e0Var2 = this.f68g;
        e0 e0Var3 = this.f;
        e0 e0Var4 = this.f67e;
        if (e0Var4 == null && e0Var3 == null && e0Var2 == null && e0Var == null) {
            return oVarArr[i6];
        }
        n nVarK = oVarArr[i6].k();
        if (e0Var4 != null) {
            nVarK.f116e = e0Var4.c(iArr);
        }
        if (e0Var3 != null) {
            nVarK.f = e0Var3.c(iArr);
        }
        if (e0Var2 != null) {
            nVarK.f118h = e0Var2.c(iArr);
        }
        if (e0Var != null) {
            nVarK.f117g = e0Var.c(iArr);
        }
        return nVarK.a();
    }

    @Override // a3.m
    public final o c() {
        return h();
    }

    @Override // a3.m
    public final o d(k kVar) {
        return h().d(kVar);
    }

    @Override // a3.m
    public final boolean e() {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        e0 e0Var4;
        return this.f63a > 1 || ((e0Var = this.f67e) != null && e0Var.f47a > 1) || (((e0Var2 = this.f) != null && e0Var2.f47a > 1) || (((e0Var3 = this.f68g) != null && e0Var3.f47a > 1) || ((e0Var4 = this.f69h) != null && e0Var4.f47a > 1)));
    }

    public final o h() {
        o oVar = this.f64b;
        e0 e0Var = this.f69h;
        e0 e0Var2 = this.f68g;
        e0 e0Var3 = this.f;
        e0 e0Var4 = this.f67e;
        if (e0Var4 == null && e0Var3 == null && e0Var2 == null && e0Var == null) {
            return oVar;
        }
        n nVarK = oVar.k();
        if (e0Var4 != null) {
            nVarK.f116e = e0Var4.f48b;
        }
        if (e0Var3 != null) {
            nVarK.f = e0Var3.f48b;
        }
        if (e0Var2 != null) {
            nVarK.f118h = e0Var2.f48b;
        }
        if (e0Var != null) {
            nVarK.f117g = e0Var.f48b;
        }
        return nVarK.a();
    }

    public final f0 i() {
        f0 f0Var = new f0();
        int i4 = this.f63a;
        f0Var.f55a = i4;
        f0Var.f56b = this.f64b;
        int[][] iArr = this.f65c;
        int[][] iArr2 = new int[iArr.length][];
        f0Var.f57c = iArr2;
        o[] oVarArr = this.f66d;
        f0Var.f58d = new o[oVarArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, i4);
        System.arraycopy(oVarArr, 0, f0Var.f58d, 0, f0Var.f55a);
        f0Var.f59e = this.f67e;
        f0Var.f = this.f;
        f0Var.f60g = this.f68g;
        f0Var.f61h = this.f69h;
        return f0Var;
    }
}
