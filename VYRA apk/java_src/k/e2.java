package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends p1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b2 f2519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j.o f2520u;

    public e2(Context context, boolean z4) {
        super(context, z4);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2517r = 21;
            this.f2518s = 22;
        } else {
            this.f2517r = 22;
            this.f2518s = 21;
        }
    }

    @Override // k.p1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.j jVar;
        int headersCount;
        int iPointToPosition;
        int i4;
        if (this.f2519t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                jVar = (j.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (j.j) adapter;
                headersCount = 0;
            }
            j.o oVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = iPointToPosition - headersCount) < 0 || i4 >= jVar.getCount()) ? null : jVar.getItem(i4);
            j.o oVar = this.f2520u;
            if (oVar != oVarB) {
                j.m mVar = jVar.f;
                if (oVar != null) {
                    this.f2519t.f(mVar, oVar);
                }
                this.f2520u = oVarB;
                if (oVarB != null) {
                    this.f2519t.k(mVar, oVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i4 == this.f2517r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i4 != this.f2518s) {
            return super.onKeyDown(i4, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (j.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (j.j) adapter).f.c(false);
        return true;
    }

    public void setHoverListener(b2 b2Var) {
        this.f2519t = b2Var;
    }

    @Override // k.p1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
