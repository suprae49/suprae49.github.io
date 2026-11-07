package k;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends a2 implements o0 {
    public CharSequence H;
    public l0 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ androidx.appcompat.widget.c L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.appcompat.widget.c cVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = cVar;
        this.J = new Rect();
        this.f2481t = cVar;
        this.D = true;
        this.E.setFocusable(true);
        this.f2482u = new d3.w(1, this);
    }

    @Override // k.o0
    public final void e(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // k.o0
    public final void j(int i4) {
        this.K = i4;
    }

    @Override // k.o0
    public final void m(int i4, int i5) {
        ViewTreeObserver viewTreeObserver;
        b0 b0Var = this.E;
        boolean zIsShowing = b0Var.isShowing();
        s();
        b0Var.setInputMethodMode(2);
        c();
        p1 p1Var = this.f2470h;
        p1Var.setChoiceMode(1);
        p1Var.setTextDirection(i4);
        p1Var.setTextAlignment(i5);
        androidx.appcompat.widget.c cVar = this.L;
        int selectedItemPosition = cVar.getSelectedItemPosition();
        p1 p1Var2 = this.f2470h;
        if (b0Var.isShowing() && p1Var2 != null) {
            p1Var2.setListSelectionHidden(false);
            p1Var2.setSelection(selectedItemPosition);
            if (p1Var2.getChoiceMode() != 0) {
                p1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = cVar.getViewTreeObserver()) == null) {
            return;
        }
        j.d dVar = new j.d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        b0Var.setOnDismissListener(new m0(this, dVar));
    }

    @Override // k.o0
    public final CharSequence o() {
        return this.H;
    }

    @Override // k.a2, k.o0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.I = (l0) listAdapter;
    }

    public final void s() {
        int i4;
        b0 b0Var = this.E;
        Drawable background = b0Var.getBackground();
        androidx.appcompat.widget.c cVar = this.L;
        Rect rect = cVar.f431m;
        if (background != null) {
            background.getPadding(rect);
            boolean z4 = p3.f2612a;
            i4 = cVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i4 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = cVar.getPaddingLeft();
        int paddingRight = cVar.getPaddingRight();
        int width = cVar.getWidth();
        int i5 = cVar.f430l;
        if (i5 == -2) {
            int iA = cVar.a(this.I, b0Var.getBackground());
            int i6 = (cVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i6) {
                iA = i6;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i5 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i5);
        }
        boolean z5 = p3.f2612a;
        this.f2473k = cVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2472j) - this.K) + i4 : paddingLeft + this.K + i4;
    }
}
