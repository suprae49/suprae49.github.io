package p1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import k.y2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r {
    public static final String[] H = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final y2 I = new y2("topLeft", 1, PointF.class);
    public static final y2 J = new y2("bottomRight", 2, PointF.class);
    public static final y2 K = new y2("bottomRight", 3, PointF.class);
    public static final y2 L = new y2("topLeft", 4, PointF.class);
    public static final y2 M = new y2("position", 5, PointF.class);

    public static void L(a0 a0Var) {
        View view = a0Var.f3277b;
        HashMap map = a0Var.f3276a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p1.r
    public final void e(a0 a0Var) {
        L(a0Var);
    }

    @Override // p1.r
    public final void h(a0 a0Var) {
        L(a0Var);
    }

    @Override // p1.r
    public final Animator l(ViewGroup viewGroup, a0 a0Var, a0 a0Var2) {
        int i4;
        e eVar;
        Animator animatorA;
        if (a0Var != null) {
            HashMap map = a0Var.f3276a;
            if (a0Var2 != null) {
                HashMap map2 = a0Var2.f3276a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = a0Var2.f3277b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i5 = rect.left;
                    int i6 = rect2.left;
                    int i7 = rect.top;
                    int i8 = rect2.top;
                    int i9 = rect.right;
                    int i10 = rect2.right;
                    int i11 = rect.bottom;
                    int i12 = rect2.bottom;
                    int i13 = i9 - i5;
                    int i14 = i11 - i7;
                    int i15 = i10 - i6;
                    int i16 = i12 - i8;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
                        i4 = 0;
                    } else {
                        i4 = (i5 == i6 && i7 == i8) ? 0 : 1;
                        if (i9 != i10 || i11 != i12) {
                            i4++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i4++;
                    }
                    int i17 = i4;
                    if (i17 > 0) {
                        c0.a(view, i5, i7, i9, i11);
                        if (i17 != 2) {
                            eVar = this;
                            if (i5 == i6 && i7 == i8) {
                                eVar.C.getClass();
                                animatorA = n.a(view, K, a3.f.k(i9, i11, i10, i12));
                            } else {
                                eVar.C.getClass();
                                animatorA = n.a(view, L, a3.f.k(i5, i7, i6, i8));
                            }
                        } else if (i13 == i15 && i14 == i16) {
                            eVar = this;
                            eVar.C.getClass();
                            animatorA = n.a(view, M, a3.f.k(i5, i7, i6, i8));
                        } else {
                            eVar = this;
                            d dVar = new d(view);
                            eVar.C.getClass();
                            ObjectAnimator objectAnimatorA = n.a(dVar, I, a3.f.k(i5, i7, i6, i8));
                            eVar.C.getClass();
                            ObjectAnimator objectAnimatorA2 = n.a(dVar, J, a3.f.k(i9, i11, i10, i12));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
                            animatorSet.addListener(new b(dVar));
                            animatorA = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            e4.a.j0(viewGroup4, true);
                            eVar.q().a(new c(viewGroup4));
                        }
                        return animatorA;
                    }
                }
            }
        }
        return null;
    }

    @Override // p1.r
    public final String[] s() {
        return H;
    }
}
