package e3;

import android.content.Context;
import android.content.res.TypedArray;
import co.median.android.eeqadjy.R;
import k.y0;
import t1.l;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends y0 {
    @Override // k.y0, android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        if (l.q(context.getTheme(), R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i4, a2.a.C);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int iL = -1;
            for (int i5 = 0; i5 < 2 && iL < 0; i5++) {
                iL = i.l(context2, typedArrayObtainStyledAttributes, iArr[i5], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iL >= 0) {
                setLineHeight(iL);
            }
        }
    }
}
