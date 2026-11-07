package p0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f3220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f3221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f3222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3224e;

    public n(ViewGroup viewGroup) {
        this.f3222c = viewGroup;
    }

    public final boolean a(float f, float f4, boolean z4) {
        ViewParent viewParentE;
        if (this.f3223d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f3222c, f, f4, z4);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e5);
            }
        }
        return false;
    }

    public final boolean b(float f, float f4) {
        ViewParent viewParentE;
        if (this.f3223d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f3222c, f, f4);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e5);
            }
        }
        return false;
    }

    public final boolean c(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f3223d || (viewParentE = e(i6)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f3222c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (this.f3224e == null) {
                this.f3224e = new int[2];
            }
            iArr3 = this.f3224e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof o) {
            ((o) viewParentE).c(viewGroup, i4, i5, iArr3, i6);
        } else if (i6 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i4, i5, iArr3);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent viewParentE;
        int i9;
        int i10;
        int[] iArr3;
        if (this.f3223d && (viewParentE = e(i8)) != null) {
            if (i4 != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
                ViewGroup viewGroup = this.f3222c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i9 = iArr[0];
                    i10 = iArr[1];
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                if (iArr2 == null) {
                    if (this.f3224e == null) {
                        this.f3224e = new int[2];
                    }
                    int[] iArr4 = this.f3224e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof p) {
                    ((p) viewParentE).d(viewGroup, i4, i5, i6, i7, i8, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i6;
                    iArr3[1] = iArr3[1] + i7;
                    if (viewParentE instanceof o) {
                        ((o) viewParentE).e(viewGroup, i4, i5, i6, i7, i8);
                    } else if (i8 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i4, i5, i6, i7);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e5);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i9;
                    iArr[1] = iArr[1] - i10;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i4) {
        if (i4 == 0) {
            return this.f3220a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f3221b;
    }

    public final boolean f(int i4) {
        return e(i4) != null;
    }

    public final void g(boolean z4) {
        if (this.f3223d) {
            WeakHashMap weakHashMap = p0.f3233a;
            this.f3222c.stopNestedScroll();
        }
        this.f3223d = z4;
    }

    public final boolean h(int i4, int i5) {
        boolean zOnStartNestedScroll;
        if (!f(i5)) {
            if (this.f3223d) {
                View view = this.f3222c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z4 = parent instanceof o;
                    if (z4) {
                        zOnStartNestedScroll = ((o) parent).f(view2, view, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i4);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e5);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i5 == 0) {
                            this.f3220a = parent;
                        } else if (i5 == 1) {
                            this.f3221b = parent;
                        }
                        if (z4) {
                            ((o) parent).a(view2, view, i4, i5);
                        } else if (i5 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i4);
                            } catch (AbstractMethodError e6) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e6);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void i(int i4) {
        ViewParent viewParentE = e(i4);
        if (viewParentE != null) {
            boolean z4 = viewParentE instanceof o;
            ViewGroup viewGroup = this.f3222c;
            if (z4) {
                ((o) viewParentE).b(viewGroup, i4);
            } else if (i4 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i4 == 0) {
                this.f3220a = null;
            } else {
                if (i4 != 1) {
                    return;
                }
                this.f3221b = null;
            }
        }
    }
}
