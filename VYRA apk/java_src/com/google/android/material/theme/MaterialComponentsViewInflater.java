package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.b;
import d3.y;
import e.g0;
import k.d0;
import k.n;
import k.p;
import k.q;
import k.y0;
import t1.l;
import t2.i;
import w2.a;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends g0 {
    @Override // e.g0
    public final n a(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    @Override // e.g0
    public final p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // e.g0
    public final q c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // e.g0
    public final d0 d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // e.g0
    public final y0 e(Context context, AttributeSet attributeSet) {
        e3.a aVar = new e3.a(f3.a.b(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (l.q(context2.getTheme(), co.median.android.eeqadjy.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a2.a.D;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iL = -1;
            for (int i4 = 0; i4 < 2 && iL < 0; i4++) {
                iL = i.l(context2, typedArrayObtainStyledAttributes, iArr2[i4], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iL == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, a2.a.C);
                    Context context3 = aVar.getContext();
                    int[] iArr3 = {2, 4};
                    int iL2 = -1;
                    for (int i5 = 0; i5 < 2 && iL2 < 0; i5++) {
                        iL2 = i.l(context3, typedArrayObtainStyledAttributes3, iArr3[i5], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iL2 >= 0) {
                        aVar.setLineHeight(iL2);
                    }
                }
            }
        }
        return aVar;
    }
}
