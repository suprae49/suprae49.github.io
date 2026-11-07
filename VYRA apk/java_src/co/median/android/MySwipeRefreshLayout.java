package co.median.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import u1.i1;
import u1.o0;
import u1.v0;
import w1.h;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class MySwipeRefreshLayout extends h {
    public i1 Q;

    public MySwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // w1.h
    public final boolean a() {
        i1 i1Var = this.Q;
        if (i1Var != null) {
            return ((o0) ((v0) i1Var).f4111g.G).getWebViewScrollY() > 10;
        }
        View view = this.f;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public void setCanChildScrollUpCallback(i1 i1Var) {
        this.Q = i1Var;
    }
}
