package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.emoji2.text.t;
import j.a0;
import j.l;
import j.m;
import j.o;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, a0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f266g = {R.attr.background, R.attr.divider};
    public m f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        t tVarS = t.s(R.attr.listViewStyle, 0, context, attributeSet, f266g);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(tVarS.i(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(tVarS.i(1));
        }
        tVarS.v();
    }

    @Override // j.a0
    public final void a(m mVar) {
        this.f = mVar;
    }

    @Override // j.l
    public final boolean c(o oVar) {
        return this.f.q(oVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        c((o) getAdapter().getItem(i4));
    }
}
