package k;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements View.OnKeyListener {
    public final /* synthetic */ androidx.appcompat.widget.e f;

    public o2(androidx.appcompat.widget.e eVar) {
        this.f = eVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        androidx.appcompat.widget.e eVar = this.f;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = eVar.f443u;
        if (eVar.f439i0 != null) {
            if (!searchView$SearchAutoComplete.isPopupShowing() || searchView$SearchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchView$SearchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i4 == 66) {
                    view.cancelLongPress();
                    eVar.getContext().startActivity(eVar.j("android.intent.action.SEARCH", null, null, searchView$SearchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (eVar.f439i0 != null && eVar.U != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i4 == 66 || i4 == 84 || i4 == 61) {
                    eVar.n(searchView$SearchAutoComplete.getListSelection());
                    return true;
                }
                if (i4 == 21 || i4 == 22) {
                    searchView$SearchAutoComplete.setSelection(i4 == 21 ? 0 : searchView$SearchAutoComplete.length());
                    searchView$SearchAutoComplete.setListSelection(0);
                    searchView$SearchAutoComplete.clearListSelection();
                    searchView$SearchAutoComplete.a();
                    return true;
                }
                if (i4 == 19) {
                    searchView$SearchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
