package p0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import co.median.android.eeqadjy.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f3233a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f3234b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f3235c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f3236d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f3237e = new c0();
    public static final e0 f = new e0();

    public static r0 a(View view) {
        if (f3233a == null) {
            f3233a = new WeakHashMap();
        }
        r0 r0Var = (r0) f3233a.get(view);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(view);
        f3233a.put(view, r0Var2);
        return r0Var2;
    }

    public static void b(View view, y1 y1Var) {
        WindowInsets windowInsetsG = y1Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? m0.a(view, windowInsetsG) : f0.a(view, windowInsetsG);
            if (windowInsetsA.equals(windowInsetsG)) {
                return;
            }
            y1.h(view, windowInsetsA);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = o0.f3228d;
        o0 o0Var = (o0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (o0Var == null) {
            o0Var = new o0();
            o0Var.f3229a = null;
            o0Var.f3230b = null;
            o0Var.f3231c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, o0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = o0Var.f3229a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = o0.f3228d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (o0Var.f3229a == null) {
                            o0Var.f3229a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = o0.f3228d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                o0Var.f3229a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    o0Var.f3229a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = o0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (o0Var.f3230b == null) {
                    o0Var.f3230b = new SparseArray();
                }
                o0Var.f3230b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return l0.a(view);
        }
        if (f3235c) {
            return null;
        }
        if (f3234b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3234b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3235c = true;
                return null;
            }
        }
        try {
            Object obj = f3234b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3235c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = k0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(k.w wVar) {
        return Build.VERSION.SDK_INT >= 31 ? n0.a(wVar) : (String[]) wVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z4 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i4);
                if (z4) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i4 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
                        return;
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e5);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i4);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f i(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n0.b(view, fVar);
        }
        t0.g gVar = (t0.g) view.getTag(R.id.tag_on_receive_content_listener);
        r rVar = f3237e;
        if (gVar == null) {
            if (view instanceof r) {
                rVar = (r) view;
            }
            return rVar.a(fVar);
        }
        f fVarA = t0.g.a(view, fVar);
        if (fVarA == null) {
            return null;
        }
        if (view instanceof r) {
            rVar = (r) view;
        }
        return rVar.a(fVarA);
    }

    public static void j(View view, int i4) {
        ArrayList arrayListF = f(view);
        for (int i5 = 0; i5 < arrayListF.size(); i5++) {
            if (((q0.c) arrayListF.get(i5)).a() == i4) {
                arrayListF.remove(i5);
                return;
            }
        }
    }

    public static void k(View view, q0.c cVar, q0.n nVar) {
        b bVar;
        if (nVar == null) {
            j(view, cVar.a());
            h(view, 0);
            return;
        }
        q0.c cVar2 = new q0.c(null, cVar.f3375b, null, nVar, cVar.f3376c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        if (accessibilityDelegateD == null) {
            bVar = null;
        } else {
            bVar = accessibilityDelegateD instanceof a ? ((a) accessibilityDelegateD).f3160a : new b(accessibilityDelegateD);
        }
        if (bVar == null) {
            bVar = new b();
        }
        m(view, bVar);
        j(view, cVar2.a());
        f(view).add(cVar2);
        h(view, 0);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            l0.b(view, context, iArr, attributeSet, typedArray, i4, 0);
        }
    }

    public static void m(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f3168b);
    }

    public static void n(View view, CharSequence charSequence) {
        new d0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        e0 e0Var = f;
        if (charSequence == null) {
            e0Var.f.remove(view);
            view.removeOnAttachStateChangeListener(e0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(e0Var);
        } else {
            e0Var.f.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(e0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(e0Var);
            }
        }
    }

    public static void o(View view, t0 t0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new x0(t0Var));
            return;
        }
        PathInterpolator pathInterpolator = w0.f3257e;
        View.OnApplyWindowInsetsListener v0Var = new v0(view, t0Var);
        view.setTag(R.id.tag_window_insets_animation_callback, v0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(v0Var);
        }
    }
}
