package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import e.d0;
import e.s;
import j.m;
import k.f1;
import k.g;
import k.k3;
import p0.r0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TypedValue f335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TypedValue f336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TypedValue f337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TypedValue f338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f1 f340m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f339l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f337j == null) {
            this.f337j = new TypedValue();
        }
        return this.f337j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f338k == null) {
            this.f338k = new TypedValue();
        }
        return this.f338k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f335h == null) {
            this.f335h = new TypedValue();
        }
        return this.f335h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f336i == null) {
            this.f336i = new TypedValue();
        }
        return this.f336i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f334g == null) {
            this.f334g = new TypedValue();
        }
        return this.f334g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f1 f1Var = this.f340m;
        if (f1Var != null) {
            f1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b bVar;
        super.onDetachedFromWindow();
        f1 f1Var = this.f340m;
        if (f1Var != null) {
            d0 d0Var = ((s) f1Var).f1989g;
            ActionBarOverlayLayout actionBarOverlayLayout = d0Var.f1892w;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.f310j).f2562a.f;
                if (actionMenuView != null && (bVar = actionMenuView.f330y) != null) {
                    bVar.c();
                    g gVar = bVar.f424z;
                    if (gVar != null && gVar.b()) {
                        gVar.f2449j.dismiss();
                    }
                }
            }
            if (d0Var.B != null) {
                d0Var.f1886q.getDecorView().removeCallbacks(d0Var.C);
                if (d0Var.B.isShowing()) {
                    try {
                        d0Var.B.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                d0Var.B = null;
            }
            r0 r0Var = d0Var.D;
            if (r0Var != null) {
                r0Var.b();
            }
            m mVar = d0Var.B(0).f1864h;
            if (mVar != null) {
                mVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int iMakeMeasureSpec;
        boolean z4;
        int iMakeMeasureSpec2;
        int i6;
        int i7;
        float fraction;
        int i8;
        int i9;
        float fraction2;
        int i10;
        int i11;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z5 = true;
        boolean z6 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        Rect rect = this.f339l;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i4;
            z4 = false;
        } else {
            TypedValue typedValue = z6 ? this.f336i : this.f335h;
            if (typedValue == null || (i10 = typedValue.type) == 0) {
                iMakeMeasureSpec = i4;
                z4 = false;
            } else {
                if (i10 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i10 == 6) {
                        int i12 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i12, i12);
                    } else {
                        i11 = 0;
                    }
                    if (i11 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.left + rect.right), View.MeasureSpec.getSize(i4)), 1073741824);
                        z4 = true;
                    } else {
                        iMakeMeasureSpec = i4;
                        z4 = false;
                    }
                }
                i11 = (int) fraction3;
                if (i11 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.left + rect.right), View.MeasureSpec.getSize(i4)), 1073741824);
                    z4 = true;
                } else {
                    iMakeMeasureSpec = i4;
                    z4 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i5;
        } else {
            TypedValue typedValue2 = z6 ? this.f337j : this.f338k;
            if (typedValue2 == null || (i8 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i5;
            } else {
                if (i8 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i8 == 6) {
                        int i13 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i13, i13);
                    } else {
                        i9 = 0;
                    }
                    if (i9 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i5)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i5;
                    }
                }
                i9 = (int) fraction2;
                if (i9 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i5)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i5;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z4 || mode != Integer.MIN_VALUE) {
            z5 = false;
        } else {
            TypedValue typedValue3 = z6 ? this.f334g : this.f;
            if (typedValue3 == null || (i6 = typedValue3.type) == 0) {
                z5 = false;
            } else {
                if (i6 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i6 == 6) {
                        int i14 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i14, i14);
                    } else {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        i7 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i7) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    } else {
                        z5 = false;
                    }
                }
                i7 = (int) fraction;
                if (i7 > 0) {
                    i7 -= rect.left + rect.right;
                }
                if (measuredWidth < i7) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else {
                    z5 = false;
                }
            }
        }
        if (z5) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(f1 f1Var) {
        this.f340m = f1Var;
    }
}
