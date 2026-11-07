package p1;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import co.median.android.eeqadjy.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends r {
    public static final String[] I = {"android:visibility:visibility", "android:visibility:parent"};
    public final int H;

    public g() {
        this.H = 3;
    }

    public static void L(a0 a0Var) {
        View view = a0Var.f3277b;
        int visibility = view.getVisibility();
        HashMap map = a0Var.f3276a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float N(a0 a0Var, float f) {
        Float f4;
        return (a0Var == null || (f4 = (Float) a0Var.f3276a.get("android:fade:transitionAlpha")) == null) ? f : f4.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static l0 O(a0 a0Var, a0 a0Var2) {
        l0 l0Var = new l0();
        l0Var.f3313a = false;
        l0Var.f3314b = false;
        if (a0Var != null) {
            HashMap map = a0Var.f3276a;
            if (map.containsKey("android:visibility:visibility")) {
                l0Var.f3315c = ((Integer) map.get("android:visibility:visibility")).intValue();
                l0Var.f3317e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                l0Var.f3315c = -1;
                l0Var.f3317e = null;
            }
        } else {
            l0Var.f3315c = -1;
            l0Var.f3317e = null;
        }
        if (a0Var2 != null) {
            HashMap map2 = a0Var2.f3276a;
            if (map2.containsKey("android:visibility:visibility")) {
                l0Var.f3316d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                l0Var.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                l0Var.f3316d = -1;
                l0Var.f = null;
            }
        } else {
            l0Var.f3316d = -1;
            l0Var.f = null;
        }
        if (a0Var != null && a0Var2 != null) {
            int i4 = l0Var.f3315c;
            int i5 = l0Var.f3316d;
            if (i4 != i5 || l0Var.f3317e != l0Var.f) {
                if (i4 != i5) {
                    if (i4 == 0) {
                        l0Var.f3314b = false;
                        l0Var.f3313a = true;
                        return l0Var;
                    }
                    if (i5 == 0) {
                        l0Var.f3314b = true;
                        l0Var.f3313a = true;
                        return l0Var;
                    }
                } else {
                    if (l0Var.f == null) {
                        l0Var.f3314b = false;
                        l0Var.f3313a = true;
                        return l0Var;
                    }
                    if (l0Var.f3317e == null) {
                        l0Var.f3314b = true;
                        l0Var.f3313a = true;
                        return l0Var;
                    }
                }
            }
        } else {
            if (a0Var == null && l0Var.f3316d == 0) {
                l0Var.f3314b = true;
                l0Var.f3313a = true;
                return l0Var;
            }
            if (a0Var2 == null && l0Var.f3315c == 0) {
                l0Var.f3314b = false;
                l0Var.f3313a = true;
            }
        }
        return l0Var;
    }

    public final ObjectAnimator M(View view, float f, float f4) {
        if (f == f4) {
            return null;
        }
        c0.f3281a.m0(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, c0.f3282b, f4);
        f fVar = new f(view);
        objectAnimatorOfFloat.addListener(fVar);
        q().a(fVar);
        return objectAnimatorOfFloat;
    }

    @Override // p1.r
    public final void e(a0 a0Var) {
        L(a0Var);
    }

    @Override // p1.r
    public final void h(a0 a0Var) {
        L(a0Var);
        View view = a0Var.f3277b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(c0.f3281a.D(view)) : Float.valueOf(0.0f);
        }
        a0Var.f3276a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (O(p(r3, false), t(r3, false)).f3313a != false) goto L9;
     */
    @Override // p1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator l(android.view.ViewGroup r24, p1.a0 r25, p1.a0 r26) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.g.l(android.view.ViewGroup, p1.a0, p1.a0):android.animation.Animator");
    }

    @Override // p1.r
    public final String[] s() {
        return I;
    }

    @Override // p1.r
    public final boolean u(a0 a0Var, a0 a0Var2) {
        if (a0Var == null && a0Var2 == null) {
            return false;
        }
        if (a0Var != null && a0Var2 != null && a0Var2.f3276a.containsKey("android:visibility:visibility") != a0Var.f3276a.containsKey("android:visibility:visibility")) {
            return false;
        }
        l0 l0VarO = O(a0Var, a0Var2);
        if (l0VarO.f3313a) {
            return l0VarO.f3315c == 0 || l0VarO.f3316d == 0;
        }
        return false;
    }

    public g(int i4) {
        this();
        this.H = i4;
    }
}
