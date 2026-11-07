package k;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 implements j.y {
    public j.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j.o f2522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2523h;

    public g3(Toolbar toolbar) {
        this.f2523h = toolbar;
    }

    @Override // j.y
    public final boolean d(j.o oVar) {
        Toolbar toolbar = this.f2523h;
        toolbar.c();
        ViewParent parent = toolbar.f387m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f387m);
            }
            toolbar.addView(toolbar.f387m);
        }
        View actionView = oVar.getActionView();
        toolbar.n = actionView;
        this.f2522g = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n);
            }
            h3 h3VarJ = Toolbar.j();
            h3VarJ.f2542a = (toolbar.f392s & 112) | 8388611;
            h3VarJ.f2543b = 2;
            toolbar.n.setLayoutParams(h3VarJ);
            toolbar.addView(toolbar.n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((h3) childAt.getLayoutParams()).f2543b != 2 && childAt != toolbar.f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.C = true;
        oVar.n.p(false);
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof i.b) {
            ((i.b) callback).onActionViewExpanded();
        }
        toolbar.x();
        return true;
    }

    @Override // j.y
    public final void f(boolean z4) {
        if (this.f2522g != null) {
            j.m mVar = this.f;
            if (mVar != null) {
                int size = mVar.f.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (this.f.getItem(i4) == this.f2522g) {
                        return;
                    }
                }
            }
            k(this.f2522g);
        }
    }

    @Override // j.y
    public final int getId() {
        return 0;
    }

    @Override // j.y
    public final void h(Context context, j.m mVar) {
        j.o oVar;
        j.m mVar2 = this.f;
        if (mVar2 != null && (oVar = this.f2522g) != null) {
            mVar2.d(oVar);
        }
        this.f = mVar;
    }

    @Override // j.y
    public final boolean i() {
        return false;
    }

    @Override // j.y
    public final Parcelable j() {
        return null;
    }

    @Override // j.y
    public final boolean k(j.o oVar) {
        Toolbar toolbar = this.f2523h;
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof i.b) {
            ((i.b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.n);
        toolbar.removeView(toolbar.f387m);
        toolbar.n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2522g = null;
        toolbar.requestLayout();
        oVar.C = false;
        oVar.n.p(false);
        toolbar.x();
        return true;
    }

    @Override // j.y
    public final boolean m(j.e0 e0Var) {
        return false;
    }

    @Override // j.y
    public final void e(Parcelable parcelable) {
    }

    @Override // j.y
    public final void a(j.m mVar, boolean z4) {
    }
}
