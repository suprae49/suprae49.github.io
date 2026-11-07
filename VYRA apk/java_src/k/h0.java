package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f2525e;
    public Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f2526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2529j;

    public h0(g0 g0Var) {
        super(g0Var);
        this.f2526g = null;
        this.f2527h = null;
        this.f2528i = false;
        this.f2529j = false;
        this.f2525e = g0Var;
    }

    @Override // k.c0
    public final void b(AttributeSet attributeSet, int i4) {
        super.b(attributeSet, R.attr.seekBarStyle);
        g0 g0Var = this.f2525e;
        Context context = g0Var.getContext();
        int[] iArr = d.a.f1636g;
        androidx.emoji2.text.t tVarS = androidx.emoji2.text.t.s(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        p0.p0.l(g0Var, g0Var.getContext(), iArr, attributeSet, (TypedArray) tVarS.f579c, R.attr.seekBarStyle);
        Drawable drawableJ = tVarS.j(0);
        if (drawableJ != null) {
            g0Var.setThumb(drawableJ);
        }
        Drawable drawableI = tVarS.i(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = drawableI;
        if (drawableI != null) {
            drawableI.setCallback(g0Var);
            drawableI.setLayoutDirection(g0Var.getLayoutDirection());
            if (drawableI.isStateful()) {
                drawableI.setState(g0Var.getDrawableState());
            }
            f();
        }
        g0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f2527h = j1.c(typedArray.getInt(3, -1), this.f2527h);
            this.f2529j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2526g = tVarS.h(2);
            this.f2528i = true;
        }
        tVarS.v();
        f();
    }

    public final void f() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.f2528i || this.f2529j) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.f2528i) {
                    drawableMutate.setTintList(this.f2526g);
                }
                if (this.f2529j) {
                    this.f.setTintMode(this.f2527h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(this.f2525e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f != null) {
            g0 g0Var = this.f2525e;
            int max = g0Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f.getIntrinsicWidth();
                int intrinsicHeight = this.f.getIntrinsicHeight();
                int i4 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i5 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f.setBounds(-i4, -i5, i4, i5);
                float width = ((g0Var.getWidth() - g0Var.getPaddingLeft()) - g0Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(g0Var.getPaddingLeft(), g0Var.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
