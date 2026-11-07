package a3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import co.median.android.eeqadjy.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0[] f110d;

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i0 i0Var;
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
                int[] iArr = a2.a.O;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                if (typedValuePeekValue != null) {
                    int i4 = typedValuePeekValue.type;
                    if (i4 == 5) {
                        i0Var = new i0(2, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i4 == 6) {
                        i0Var = new i0(1, typedValuePeekValue.getFraction(1.0f, 1.0f));
                    } else {
                        i0Var = null;
                    }
                } else {
                    i0Var = null;
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i5 = 0;
                for (int i6 = 0; i6 < attributeCount; i6++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i6);
                    if (attributeNameResource != R.attr.widthChange) {
                        int i7 = i5 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i6, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i5] = attributeNameResource;
                        i5 = i7;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i5);
                h0 h0Var = new h0(0);
                h0Var.f84g = i0Var;
                int i8 = this.f107a;
                if (i8 == 0 || iArrTrimStateSet.length == 0) {
                    this.f108b = h0Var;
                }
                int[][] iArr3 = this.f109c;
                if (i8 >= iArr3.length) {
                    int i9 = i8 + 10;
                    int[][] iArr4 = new int[i9][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i8);
                    this.f109c = iArr4;
                    h0[] h0VarArr = new h0[i9];
                    System.arraycopy(this.f110d, 0, h0VarArr, 0, i8);
                    this.f110d = h0VarArr;
                }
                int[][] iArr5 = this.f109c;
                int i10 = this.f107a;
                iArr5[i10] = iArrTrimStateSet;
                this.f110d[i10] = h0Var;
                this.f107a = i10 + 1;
            }
        }
    }
}
