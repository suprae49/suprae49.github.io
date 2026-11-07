package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class s extends Dialog implements androidx.lifecycle.t, k0, l1.e {
    public androidx.lifecycle.v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.d f253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0 f254h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, int i4) {
        super(context, i4);
        context.getClass();
        this.f253g = new l1.d(this);
        this.f254h = new j0(new k(1, this));
    }

    public static void b(s sVar) {
        super.onBackPressed();
    }

    @Override // androidx.activity.k0
    public final j0 a() {
        return this.f254h;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    public final void c() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        androidx.lifecycle.v vVar = this.f;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.f = vVar2;
        return vVar2;
    }

    @Override // l1.e
    public final l1.c getSavedStateRegistry() {
        return this.f253g.f3011b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f254h.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            j0 j0Var = this.f254h;
            j0Var.getClass();
            j0Var.f211e = onBackInvokedDispatcher;
            j0Var.e(j0Var.f212g);
        }
        this.f253g.b(bundle);
        androidx.lifecycle.v vVar = this.f;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.f = vVar;
        }
        vVar.e(androidx.lifecycle.m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f253g.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.v vVar = this.f;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.f = vVar;
        }
        vVar.e(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.v vVar = this.f;
        if (vVar == null) {
            vVar = new androidx.lifecycle.v(this);
            this.f = vVar;
        }
        vVar.e(androidx.lifecycle.m.ON_DESTROY);
        this.f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i4) {
        c();
        super.setContentView(i4);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
