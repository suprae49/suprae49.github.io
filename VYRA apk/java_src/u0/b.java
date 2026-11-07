package u0;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import k.x2;
import k.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Cursor f3846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f3848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y1 f3849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f3850l;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f3846h;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f3848j;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                y1 y1Var = this.f3849k;
                if (y1Var != null) {
                    cursor2.unregisterDataSetObserver(y1Var);
                }
            }
            this.f3846h = cursor;
            if (cursor != null) {
                a aVar2 = this.f3848j;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                y1 y1Var2 = this.f3849k;
                if (y1Var2 != null) {
                    cursor.registerDataSetObserver(y1Var2);
                }
                this.f3847i = cursor.getColumnIndexOrThrow("_id");
                this.f = true;
                notifyDataSetChanged();
            } else {
                this.f3847i = -1;
                this.f = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f || (cursor = this.f3846h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f) {
            return null;
        }
        this.f3846h.moveToPosition(i4);
        if (view == null) {
            x2 x2Var = (x2) this;
            view = x2Var.f2684o.inflate(x2Var.n, viewGroup, false);
        }
        a(view, this.f3846h);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f3850l == null) {
            c cVar = new c();
            cVar.f3851a = this;
            this.f3850l = cVar;
        }
        return this.f3850l;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        Cursor cursor;
        if (!this.f || (cursor = this.f3846h) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f3846h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        Cursor cursor;
        if (this.f && (cursor = this.f3846h) != null && cursor.moveToPosition(i4)) {
            return this.f3846h.getLong(this.f3847i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f) {
            q.j("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.f3846h.moveToPosition(i4)) {
            q.j(u.k(i4, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f3846h);
        return view;
    }
}
