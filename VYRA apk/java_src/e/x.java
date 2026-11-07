package e;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p0.r0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Window.Callback {
    public final Window.Callback f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j0 f1991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f1995k;

    public x(d0 d0Var, Window.Callback callback) {
        this.f1995k = d0Var;
        if (callback != null) {
            this.f = callback;
        } else {
            androidx.fragment.app.q.q("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.f1992h = true;
            callback.onContentChanged();
        } finally {
            this.f1992h = false;
        }
    }

    public final boolean b(int i4, Menu menu) {
        return this.f.onMenuOpened(i4, menu);
    }

    public final void c(int i4, Menu menu) {
        this.f.onPanelClosed(i4, menu);
    }

    public final void d(List list, Menu menu, int i4) {
        i.l.a(this.f, list, menu, i4);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f1993i;
        Window.Callback callback = this.f;
        if (z4) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f1995k.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            d0 d0Var = this.f1995k;
            d0Var.C();
            u1.h0 h0Var = d0Var.f1889t;
            if (h0Var == null || !h0Var.Q(keyCode, keyEvent)) {
                c0 c0Var = d0Var.R;
                if (c0Var == null || !d0Var.H(c0Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (d0Var.R == null) {
                        c0 c0VarB = d0Var.B(0);
                        d0Var.I(c0VarB, keyEvent);
                        boolean zH = d0Var.H(c0VarB, keyEvent.getKeyCode(), keyEvent);
                        c0VarB.f1867k = false;
                        if (zH) {
                        }
                    }
                    return false;
                }
                c0 c0Var2 = d0Var.R;
                if (c0Var2 != null) {
                    c0Var2.f1868l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f1992h) {
            this.f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 != 0 || (menu instanceof j.m)) {
            return this.f.onCreatePanelMenu(i4, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i4) {
        j0 j0Var = this.f1991g;
        if (j0Var != null) {
            View view = i4 == 0 ? new View(j0Var.f.f1939e.f2562a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f.onCreatePanelView(i4);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f.onMenuItemSelected(i4, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i4, Menu menu) {
        b(i4, menu);
        if (i4 == 108) {
            d0 d0Var = this.f1995k;
            d0Var.C();
            u1.h0 h0Var = d0Var.f1889t;
            if (h0Var != null) {
                h0Var.t(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i4, Menu menu) {
        if (this.f1994j) {
            this.f.onPanelClosed(i4, menu);
            return;
        }
        c(i4, menu);
        d0 d0Var = this.f1995k;
        if (i4 == 108) {
            d0Var.C();
            u1.h0 h0Var = d0Var.f1889t;
            if (h0Var != null) {
                h0Var.t(false);
                return;
            }
            return;
        }
        if (i4 == 0) {
            c0 c0VarB = d0Var.B(i4);
            if (c0VarB.f1869m) {
                d0Var.t(c0VarB, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        i.m.a(this.f, z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        j.m mVar = menu instanceof j.m ? (j.m) menu : null;
        if (i4 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f2405x = true;
        }
        j0 j0Var = this.f1991g;
        if (j0Var != null && i4 == 0) {
            l0 l0Var = j0Var.f;
            if (!l0Var.f1941h) {
                l0Var.f1939e.f2572l = true;
                l0Var.f1941h = true;
            }
        }
        boolean zOnPreparePanel = this.f.onPreparePanel(i4, view, menu);
        if (mVar != null) {
            mVar.f2405x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
        j.m mVar = this.f1995k.B(0).f1864h;
        if (mVar != null) {
            d(list, mVar, i4);
        } else {
            d(list, menu, i4);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return i.k.a(this.f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        ViewGroup viewGroup;
        d0 d0Var = this.f1995k;
        Context context = d0Var.f1885p;
        if (i4 != 0) {
            return i.k.b(this.f, callback, i4);
        }
        androidx.emoji2.text.x xVar = new androidx.emoji2.text.x();
        xVar.f593b = context;
        xVar.f592a = callback;
        xVar.f594c = new ArrayList();
        boolean z4 = false;
        xVar.f595d = new p.k(0);
        i.a aVar = d0Var.f1895z;
        if (aVar != null) {
            aVar.a();
        }
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(d0Var, xVar, 4, z4);
        d0Var.C();
        u1.h0 h0Var = d0Var.f1889t;
        if (h0Var != null) {
            d0Var.f1895z = h0Var.p0(pVar);
        }
        if (d0Var.f1895z == null) {
            r0 r0Var = d0Var.D;
            if (r0Var != null) {
                r0Var.b();
            }
            i.a aVar2 = d0Var.f1895z;
            if (aVar2 != null) {
                aVar2.a();
            }
            int i5 = 1;
            if (d0Var.A == null) {
                if (d0Var.N) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        i.c cVar = new i.c(context, 0);
                        cVar.getTheme().setTo(themeNewTheme);
                        context = cVar;
                    }
                    d0Var.A = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    d0Var.B = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    d0Var.B.setContentView(d0Var.A);
                    d0Var.B.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    d0Var.A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    d0Var.B.setHeight(-2);
                    d0Var.C = new r(d0Var, i5);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) d0Var.F.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(d0Var.z()));
                        d0Var.A = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (d0Var.A != null) {
                r0 r0Var2 = d0Var.D;
                if (r0Var2 != null) {
                    r0Var2.b();
                }
                d0Var.A.e();
                Context context2 = d0Var.A.getContext();
                ActionBarContextView actionBarContextView = d0Var.A;
                i.d dVar = new i.d();
                dVar.f2185h = context2;
                dVar.f2186i = actionBarContextView;
                dVar.f2187j = pVar;
                j.m mVar = new j.m(actionBarContextView.getContext());
                mVar.f2394l = 1;
                dVar.f2190m = mVar;
                mVar.f2388e = dVar;
                if (((androidx.emoji2.text.x) pVar.f568g).e(dVar, mVar)) {
                    dVar.g();
                    d0Var.A.c(dVar);
                    d0Var.f1895z = dVar;
                    boolean z5 = d0Var.E && (viewGroup = d0Var.F) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = d0Var.A;
                    if (z5) {
                        actionBarContextView2.setAlpha(0.0f);
                        r0 r0VarA = p0.p0.a(d0Var.A);
                        r0VarA.a(1.0f);
                        d0Var.D = r0VarA;
                        r0VarA.d(new t(i5, d0Var));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        d0Var.A.setVisibility(0);
                        if (d0Var.A.getParent() instanceof View) {
                            View view = (View) d0Var.A.getParent();
                            WeakHashMap weakHashMap = p0.p0.f3233a;
                            view.requestApplyInsets();
                        }
                    }
                    if (d0Var.B != null) {
                        d0Var.f1886q.getDecorView().post(d0Var.C);
                    }
                } else {
                    d0Var.f1895z = null;
                }
            }
            d0Var.K();
            d0Var.f1895z = d0Var.f1895z;
        }
        d0Var.K();
        i.a aVar3 = d0Var.f1895z;
        if (aVar3 != null) {
            return xVar.b(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
