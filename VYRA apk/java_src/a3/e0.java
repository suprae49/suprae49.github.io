package a3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import co.median.android.eeqadjy.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f48b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f49c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d[] f50d = new d[10];

    public static e0 b(d dVar) {
        e0 e0Var = new e0();
        e0Var.a(StateSet.WILD_CARD, dVar);
        return e0Var;
    }

    public final void a(int[] iArr, d dVar) {
        int i4 = this.f47a;
        if (i4 == 0 || iArr.length == 0) {
            this.f48b = dVar;
        }
        int[][] iArr2 = this.f49c;
        if (i4 >= iArr2.length) {
            int i5 = i4 + 10;
            int[][] iArr3 = new int[i5][];
            System.arraycopy(iArr2, 0, iArr3, 0, i4);
            this.f49c = iArr3;
            d[] dVarArr = new d[i5];
            System.arraycopy(this.f50d, 0, dVarArr, 0, i4);
            this.f50d = dVarArr;
        }
        int[][] iArr4 = this.f49c;
        int i6 = this.f47a;
        iArr4[i6] = iArr;
        this.f50d[i6] = dVar;
        this.f47a = i6 + 1;
    }

    public final d c(int[] iArr) {
        int i4;
        int[][] iArr2 = this.f49c;
        int i5 = 0;
        while (true) {
            i4 = -1;
            if (i5 >= this.f47a) {
                i5 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                break;
            }
            i5++;
        }
        if (i5 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f49c;
            for (int i6 = 0; i6 < this.f47a; i6++) {
                if (StateSet.stateSetMatches(iArr4[i6], iArr3)) {
                    i4 = i6;
                    break;
                }
            }
            i5 = i4;
        }
        return i5 < 0 ? this.f48b : this.f50d[i5];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = a2.a.L;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d dVarI = o.i(typedArrayObtainAttributes, 5, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i4), dVarI);
            }
        }
    }
}
