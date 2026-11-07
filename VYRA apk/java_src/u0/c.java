package u0;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.e;
import k.x2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f3851a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f3851a.c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorG;
        x2 x2Var = (x2) this.f3851a;
        e eVar = x2Var.f2685p;
        String string = charSequence == null ? "" : charSequence.toString();
        if (eVar.getVisibility() == 0 && eVar.getWindowVisibility() == 0) {
            try {
                cursorG = x2Var.g(x2Var.f2686q, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException e5) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e5);
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.f3851a;
        Cursor cursor = bVar.f3846h;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        bVar.b((Cursor) obj);
    }
}
