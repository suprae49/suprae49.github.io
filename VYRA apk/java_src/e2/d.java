package e2;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2057b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f2058c;

    public d(SwipeDismissBehavior swipeDismissBehavior) {
        this.f2058c = swipeDismissBehavior;
    }

    @Override // t2.i
    public final void B(View view, int i4) {
        this.f2057b = i4;
        this.f2056a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f2058c;
            swipeDismissBehavior.f1297h = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1297h = false;
        }
    }

    @Override // t2.i
    public final void D(View view, int i4, int i5) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f2058c;
        float f = width * swipeDismissBehavior.f1299j;
        float width2 = view.getWidth() * swipeDismissBehavior.f1300k;
        float fAbs = Math.abs(i4 - this.f2056a);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    @Override // t2.i
    public final void E(View view, float f, float f4) {
        int i4;
        int left;
        int i5;
        this.f2057b = -1;
        int width = view.getWidth();
        boolean z4 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f2058c;
        if (f != 0.0f) {
            boolean z5 = view.getLayoutDirection() == 1;
            int i6 = swipeDismissBehavior.f1298i;
            if (i6 != 2 && (i6 != 0 ? i6 != 1 || (!z5 ? f < 0.0f : f > 0.0f) : !z5 ? f > 0.0f : f < 0.0f)) {
                i4 = this.f2056a;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i5 = this.f2056a;
                    if (left < i5) {
                        i4 = this.f2056a - width;
                    } else {
                        i4 = i5 + width;
                    }
                } else {
                    i4 = this.f2056a - width;
                }
                z4 = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f2056a) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i5 = this.f2056a;
                    if (left < i5) {
                        i4 = this.f2056a - width;
                    } else {
                        i4 = i5 + width;
                    }
                } else {
                    i4 = this.f2056a - width;
                }
                z4 = true;
            } else {
                i4 = this.f2056a;
            }
        }
        if (swipeDismissBehavior.f.p(i4, view.getTop())) {
            view.postOnAnimation(new b0.b(swipeDismissBehavior, view, z4));
        }
    }

    @Override // t2.i
    public final boolean Q(View view, int i4) {
        int i5 = this.f2057b;
        return (i5 == -1 || i5 == i4) && this.f2058c.w(view);
    }

    @Override // t2.i
    public final int c(View view, int i4) {
        int width;
        int width2;
        boolean z4 = view.getLayoutDirection() == 1;
        int i5 = this.f2058c.f1298i;
        if (i5 == 0) {
            width = this.f2056a;
            if (z4) {
                width -= view.getWidth();
                width2 = this.f2056a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i6 = this.f2056a;
            if (i5 != 1) {
                width = i6 - view.getWidth();
                width2 = view.getWidth() + this.f2056a;
            } else if (z4) {
                width2 = view.getWidth() + i6;
                width = i6;
            } else {
                width = i6 - view.getWidth();
                width2 = this.f2056a;
            }
        }
        return Math.min(Math.max(width, i4), width2);
    }

    @Override // t2.i
    public final int d(View view, int i4) {
        return view.getTop();
    }

    @Override // t2.i
    public final int q(View view) {
        return view.getWidth();
    }

    @Override // t2.i
    public final void C(int i4) {
    }
}
