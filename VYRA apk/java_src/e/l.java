package e;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f1938g;

    public /* synthetic */ l(Context context, int i4) {
        this.f = i4;
        this.f1938g = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    @Override // java.lang.Runnable
    public final void run() {
        k0.g gVar;
        Object systemService;
        Context context;
        switch (this.f) {
            case 0:
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 33) {
                    Context context2 = this.f1938g;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i4 >= 33) {
                            p.g gVar2 = q.f1966l;
                            gVar2.getClass();
                            p.b bVar = new p.b(gVar2);
                            while (true) {
                                if (bVar.hasNext()) {
                                    q qVar = (q) ((WeakReference) bVar.next()).get();
                                    if (qVar != null && (context = ((d0) qVar).f1885p) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                gVar = new k0.g(new k0.h(n.a(systemService)));
                            } else {
                                gVar = k0.g.f2721b;
                            }
                        } else {
                            gVar = q.f1962h;
                            if (gVar == null) {
                                gVar = k0.g.f2721b;
                            }
                        }
                        if (gVar.f2722a.f2723a.isEmpty()) {
                            String strE = b0.e.e(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                n.b(systemService2, m.a(strE));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                q.f1965k = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new l(this.f1938g, 2));
                break;
            default:
                i1.e.t(this.f1938g, new i1.c(), i1.e.f2248a, false);
                break;
        }
    }
}
