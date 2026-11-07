package d3;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ArrayAdapter {
    public ColorStateList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f1788h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Context context, int i4, String[] strArr) {
        super(context, i4, strArr);
        this.f1788h = yVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        y yVar = this.f1788h;
        ColorStateList colorStateList2 = yVar.f1796r;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f1787g = colorStateList;
        if (yVar.f1795q != 0 && yVar.f1796r != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{f0.b.b(yVar.f1796r.getColorForState(iArr3, 0), yVar.f1795q), f0.b.b(yVar.f1796r.getColorForState(iArr2, 0), yVar.f1795q), yVar.f1795q});
        }
        this.f = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i4, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            y yVar = this.f1788h;
            Drawable drawable = null;
            if (yVar.getText().toString().contentEquals(textView.getText()) && yVar.f1795q != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(yVar.f1795q);
                if (this.f1787g != null) {
                    colorDrawable.setTintList(this.f);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.f1787g, colorDrawable, null);
                    FocusRingDrawable focusRingDrawableE = FocusRingDrawable.e(getContext(), rippleDrawable, null);
                    if (focusRingDrawableE != null) {
                        focusRingDrawableE.f1504t.f3474x = yVar.f1791l;
                    }
                    drawable = rippleDrawable;
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
