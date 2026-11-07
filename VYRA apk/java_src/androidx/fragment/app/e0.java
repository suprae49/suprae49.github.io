package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends androidx.activity.q {
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w f674y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final androidx.lifecycle.v f675z = new androidx.lifecycle.v(this);
    public boolean C = true;

    public e0() {
        final e.j jVar = (e.j) this;
        this.f674y = new w(3, new d0(jVar));
        this.f235i.f3011b.c("android:support:lifecycle", new androidx.activity.f(1, jVar));
        final int i4 = 0;
        this.f240o.add(new o0.a() { // from class: androidx.fragment.app.c0
            @Override // o0.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        jVar.f674y.a();
                        break;
                    default:
                        jVar.f674y.a();
                        break;
                }
            }
        });
        final int i5 = 1;
        this.f242q.add(new o0.a() { // from class: androidx.fragment.app.c0
            @Override // o0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        jVar.f674y.a();
                        break;
                    default:
                        jVar.f674y.a();
                        break;
                }
            }
        });
        o(new androidx.activity.g(jVar, 1));
    }

    public static boolean t(u0 u0Var) {
        boolean zT = false;
        for (Fragment fragment : u0Var.f751c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zT |= t(fragment.getChildFragmentManager());
                }
                l1 l1Var = fragment.mViewLifecycleOwner;
                androidx.lifecycle.n nVar = androidx.lifecycle.n.f843h;
                androidx.lifecycle.n nVar2 = androidx.lifecycle.n.f844i;
                if (l1Var != null) {
                    l1Var.c();
                    if (l1Var.f722h.f866c.compareTo(nVar2) >= 0) {
                        androidx.lifecycle.v vVar = fragment.mViewLifecycleOwner.f722h;
                        vVar.d("setCurrentState");
                        vVar.f(nVar);
                        zT = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f866c.compareTo(nVar2) >= 0) {
                    androidx.lifecycle.v vVar2 = fragment.mLifecycleRegistry;
                    vVar2.d("setCurrentState");
                    vVar2.f(nVar);
                    zT = true;
                }
            }
        }
        return zT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.A);
        printWriter.print(" mResumed=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        if (getApplication() != null) {
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(getViewModelStore(), g1.b.f2143e);
            String canonicalName = g1.b.class.getCanonicalName();
            if (canonicalName == null) {
                q.q("Local and anonymous classes can not be ViewModels");
                return;
            }
            p.l lVar = ((g1.b) tVar.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), g1.b.class)).f2144d;
            if (lVar.f3159h > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (lVar.f3159h > 0) {
                    if (lVar.f3158g[0] != null) {
                        q.c();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(lVar.f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((d0) this.f674y.f773g).f698i.u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.q, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        this.f674y.a();
        super.onActivityResult(i4, i5, intent);
    }

    @Override // androidx.activity.q, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f675z.e(androidx.lifecycle.m.ON_CREATE);
        v0 v0Var = ((d0) this.f674y.f773g).f698i;
        v0Var.E = false;
        v0Var.F = false;
        v0Var.L.f779i = false;
        v0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((d0) this.f674y.f773g).f698i.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((d0) this.f674y.f773g).f698i.k();
        this.f675z.e(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // androidx.activity.q, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 6) {
            return ((d0) this.f674y.f773g).f698i.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.B = false;
        ((d0) this.f674y.f773g).f698i.t(5);
        this.f675z.e(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f675z.e(androidx.lifecycle.m.ON_RESUME);
        v0 v0Var = ((d0) this.f674y.f773g).f698i;
        v0Var.E = false;
        v0Var.F = false;
        v0Var.L.f779i = false;
        v0Var.t(7);
    }

    @Override // androidx.activity.q, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        this.f674y.a();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        w wVar = this.f674y;
        wVar.a();
        super.onResume();
        this.B = true;
        ((d0) wVar.f773g).f698i.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        w wVar = this.f674y;
        wVar.a();
        d0 d0Var = (d0) wVar.f773g;
        super.onStart();
        this.C = false;
        if (!this.A) {
            this.A = true;
            v0 v0Var = d0Var.f698i;
            v0Var.E = false;
            v0Var.F = false;
            v0Var.L.f779i = false;
            v0Var.t(4);
        }
        d0Var.f698i.x(true);
        this.f675z.e(androidx.lifecycle.m.ON_START);
        v0 v0Var2 = d0Var.f698i;
        v0Var2.E = false;
        v0Var2.F = false;
        v0Var2.L.f779i = false;
        v0Var2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f674y.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        w wVar;
        super.onStop();
        this.C = true;
        do {
            wVar = this.f674y;
        } while (t(((d0) wVar.f773g).f698i));
        v0 v0Var = ((d0) wVar.f773g).f698i;
        v0Var.F = true;
        v0Var.L.f779i = true;
        v0Var.t(4);
        this.f675z.e(androidx.lifecycle.m.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((d0) this.f674y.f773g).f698i.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }
}
