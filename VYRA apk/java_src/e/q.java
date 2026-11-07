package e;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final o f = new o(new p());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f1961g = -100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static k0.g f1962h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static k0.g f1963i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Boolean f1964j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f1965k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p.g f1966l = new p.g(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f1967m = new Object();
    public static final Object n = new Object();

    public static boolean c(Context context) {
        if (f1964j == null) {
            try {
                int i4 = i0.f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) i0.class), h0.a() | 128).metaData;
                if (bundle != null) {
                    f1964j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1964j = Boolean.FALSE;
            }
        }
        return f1964j.booleanValue();
    }

    public static void f(d0 d0Var) {
        synchronized (f1967m) {
            try {
                p.g gVar = f1966l;
                gVar.getClass();
                p.b bVar = new p.b(gVar);
                while (bVar.hasNext()) {
                    q qVar = (q) ((WeakReference) bVar.next()).get();
                    if (qVar == d0Var || qVar == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void m(int i4) {
        if (i4 != -1 && i4 != 0 && i4 != 1 && i4 != 2 && i4 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f1961g != i4) {
            f1961g = i4;
            synchronized (f1967m) {
                try {
                    p.g gVar = f1966l;
                    gVar.getClass();
                    p.b bVar = new p.b(gVar);
                    while (bVar.hasNext()) {
                        q qVar = (q) ((WeakReference) bVar.next()).get();
                        if (qVar != null) {
                            ((d0) qVar).o(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i4);

    public abstract void h(int i4);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void n(CharSequence charSequence);
}
