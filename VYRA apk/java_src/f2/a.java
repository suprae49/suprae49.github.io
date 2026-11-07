package f2;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.e;
import co.median.android.eeqadjy.R;
import k.p3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2091b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f2090a = i4;
        this.f2091b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        switch (this.f2090a) {
            case 0:
                throw null;
            default:
                e eVar = (e) this.f2091b;
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = eVar.f443u;
                View view2 = eVar.C;
                if (view2.getWidth() > 1) {
                    Resources resources = eVar.getContext().getResources();
                    int paddingLeft = eVar.f445w.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z4 = p3.f2612a;
                    boolean z5 = eVar.getLayoutDirection() == 1;
                    int dimensionPixelSize = eVar.S ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchView$SearchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i12 = rect.left;
                    searchView$SearchAutoComplete.setDropDownHorizontalOffset(z5 ? -i12 : paddingLeft - (i12 + dimensionPixelSize));
                    searchView$SearchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
