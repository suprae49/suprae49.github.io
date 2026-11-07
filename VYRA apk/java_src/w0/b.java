package w0;

import a3.f;
import a3.h0;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.q;
import com.google.android.gms.common.api.Api;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p.i;
import p.l;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends p0.b {
    public static final Rect n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f4411o = new f(24);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f4412p = new f(25);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f4416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Chip f4417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f4418j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f4413d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f4414e = new Rect();
    public final Rect f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f4415g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4419k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4420l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4421m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.f4417i = chip;
        this.f4416h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p0.b
    public final h0 b(View view) {
        if (this.f4418j == null) {
            this.f4418j = new a(this);
        }
        return this.f4418j;
    }

    @Override // p0.b
    public final void d(View view, q0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f3378a;
        this.f3167a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((l2.c) this).f3016q;
        l2.d dVar = chip.f1385j;
        accessibilityNodeInfo.setCheckable(dVar != null && dVar.f3021f0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        eVar.g(chip.getAccessibilityClassName());
        eVar.j(chip.getText());
    }

    public final boolean j(int i4) {
        if (this.f4420l != i4) {
            return false;
        }
        this.f4420l = Integer.MIN_VALUE;
        p(i4, false);
        r(i4, 8);
        return true;
    }

    public final q0.e k(int i4) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        q0.e eVar = new q0.e(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        eVar.g("android.view.View");
        Rect rect = n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f4417i;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i4, eVar);
        if (eVar.f() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f4414e;
        accessibilityNodeInfoObtain.getBoundsInParent(rect2);
        Rect rect3 = this.f4413d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        eVar.f3379b = i4;
        accessibilityNodeInfoObtain.setSource(chip, i4);
        if (this.f4419k == i4) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            eVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            eVar.a(64);
        }
        boolean z4 = this.f4420l == i4;
        if (z4) {
            eVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            eVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z4);
        int[] iArr = this.f4415g;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoObtain.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            accessibilityNodeInfoObtain.setBoundsInScreen(rect4);
            accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        }
        Rect rect5 = this.f;
        if (chip.getLocalVisibleRect(rect5)) {
            rect5.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect5)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        eVar.f3378a.setVisibleToUser(true);
                    }
                }
            }
        }
        return eVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:92:0x01af  */
    public final boolean m(int i4, Rect rect) {
        Object obj;
        q0.e eVar;
        int i5;
        Object obj2;
        Object obj3;
        q0.e eVar2;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        l lVar = new l();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            lVar.b(((Integer) arrayList.get(i6)).intValue(), k(((Integer) arrayList.get(i6)).intValue()));
        }
        int i7 = this.f4420l;
        int i8 = Integer.MIN_VALUE;
        if (i7 == Integer.MIN_VALUE) {
            eVar = null;
        } else {
            int iA = q.a.a(lVar.f3159h, i7, lVar.f);
            if (iA < 0 || (obj = lVar.f3158g[iA]) == i.f3155b) {
                obj = null;
            }
            eVar = (q0.e) obj;
        }
        f fVar = f4411o;
        f fVar2 = f4412p;
        Chip chip = this.f4417i;
        int i9 = -1;
        if (i4 == 1 || i4 == 2) {
            i5 = 0;
            boolean z4 = chip.getLayoutDirection() == 1;
            fVar2.getClass();
            int i10 = lVar.f3159h;
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList2.add((q0.e) lVar.f3158g[i11]);
            }
            Collections.sort(arrayList2, new c(z4, fVar));
            if (i4 == 1) {
                int size = arrayList2.size();
                if (eVar != null) {
                    size = arrayList2.indexOf(eVar);
                }
                int i12 = size - 1;
                if (i12 >= 0) {
                    obj2 = arrayList2.get(i12);
                    obj3 = obj2;
                } else {
                    obj3 = null;
                }
            } else {
                if (i4 != 2) {
                    q.q("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (eVar == null ? -1 : arrayList2.lastIndexOf(eVar)) + 1;
                if (iLastIndexOf < size2) {
                    obj2 = arrayList2.get(iLastIndexOf);
                    obj3 = obj2;
                } else {
                    obj3 = null;
                }
            }
            eVar2 = (q0.e) obj3;
        } else {
            if (i4 != 17 && i4 != 33 && i4 != 66 && i4 != 130) {
                q.q("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i13 = this.f4420l;
            if (i13 != Integer.MIN_VALUE) {
                n(i13).f3378a.getBoundsInScreen(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i4 == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i4 == 33) {
                    rect2.set(0, height, width, height);
                } else if (i4 == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i4 != 130) {
                        q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i4 == 17) {
                i5 = 0;
                rect3.offset(rect2.width() + 1, 0);
            } else if (i4 == 33) {
                i5 = 0;
                rect3.offset(0, rect2.height() + 1);
            } else if (i4 == 66) {
                i5 = 0;
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i4 != 130) {
                    q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                i5 = 0;
                rect3.offset(0, -(rect2.height() + 1));
            }
            fVar2.getClass();
            int i14 = lVar.f3159h;
            Rect rect4 = new Rect();
            eVar2 = null;
            for (int i15 = i5; i15 < i14; i15++) {
                q0.e eVar3 = (q0.e) lVar.f3158g[i15];
                if (eVar3 != eVar) {
                    fVar.getClass();
                    eVar3.f3378a.getBoundsInScreen(rect4);
                    if (t1.l.i(i4, rect2, rect4)) {
                        if (!t1.l.i(i4, rect2, rect3) || t1.l.c(i4, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            eVar2 = eVar3;
                        } else if (!t1.l.c(i4, rect2, rect3, rect4)) {
                            int iJ = t1.l.j(i4, rect2, rect4);
                            int iK = t1.l.k(i4, rect2, rect4);
                            int i16 = (iK * iK) + (iJ * 13 * iJ);
                            int iJ2 = t1.l.j(i4, rect2, rect3);
                            int iK2 = t1.l.k(i4, rect2, rect3);
                            if (i16 < (iK2 * iK2) + (iJ2 * 13 * iJ2)) {
                                rect3.set(rect4);
                                eVar2 = eVar3;
                            }
                        }
                    }
                }
            }
        }
        q0.e eVar4 = eVar2;
        if (eVar4 != null) {
            int i17 = lVar.f3159h;
            for (int i18 = i5; i18 < i17; i18++) {
                if (lVar.f3158g[i18] == eVar4) {
                    i9 = i18;
                    break;
                }
            }
            i8 = lVar.f[i9];
        }
        return q(i8);
    }

    public final q0.e n(int i4) {
        if (i4 != -1) {
            return k(i4);
        }
        Chip chip = this.f4417i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        q0.e eVar = new q0.e(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = p0.f3233a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            eVar.f3378a.addChild(chip, ((Integer) arrayList.get(i5)).intValue());
        }
        return eVar;
    }

    public abstract void o(int i4, q0.e eVar);

    public abstract void p(int i4, boolean z4);

    public final boolean q(int i4) {
        int i5;
        Chip chip = this.f4417i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i5 = this.f4420l) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            j(i5);
        }
        if (i4 == Integer.MIN_VALUE) {
            return false;
        }
        this.f4420l = i4;
        p(i4, true);
        r(i4, 8);
        return true;
    }

    public final void r(int i4, int i5) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i4 == Integer.MIN_VALUE || !this.f4416h.isEnabled() || (parent = (view = this.f4417i).getParent()) == null) {
            return;
        }
        if (i4 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i5);
            q0.e eVarN = n(i4);
            accessibilityEventObtain.getText().add(eVarN.f());
            AccessibilityNodeInfo accessibilityNodeInfo = eVarN.f3378a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i4);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i5);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
