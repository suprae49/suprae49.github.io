package b0;

import a3.h0;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import co.median.android.MainActivity;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import u1.e2;
import u1.o0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f994h;

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z4) {
        this.f = 4;
        this.f994h = swipeDismissBehavior;
        this.f993g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f;
        Object obj = this.f994h;
        switch (i4) {
            case 0:
                ((c) this.f993g).f = obj;
                return;
            case 1:
                ((Application) obj).unregisterActivityLifecycleCallbacks((c) this.f993g);
                return;
            case 2:
                Object obj2 = this.f993g;
                try {
                    Method method = d.f1003d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        d.f1004e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e5) {
                    if (e5.getClass() == RuntimeException.class && e5.getMessage() != null && e5.getMessage().startsWith("Unable to stop")) {
                        throw e5;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 3:
                b4.e eVar = (b4.e) obj;
                z3.h hVar = eVar.f1090h;
                int i5 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f993g).run();
                    } catch (Throwable th2) {
                        z3.l.c(i3.h.f, th2);
                    }
                    Runnable runnableH = eVar.h();
                    if (runnableH == null) {
                        return;
                    }
                    this.f993g = runnableH;
                    i5++;
                    if (i5 >= 16 && hVar.d(eVar)) {
                        hVar.c(eVar, this);
                        return;
                    }
                    break;
                }
                break;
            case 4:
                w0.e eVar2 = ((SwipeDismissBehavior) obj).f;
                if (eVar2 == null || !eVar2.g()) {
                    return;
                }
                ((View) this.f993g).postOnAnimation(this);
                return;
            case 5:
                Typeface typeface = (Typeface) obj;
                e0.b bVar = (e0.b) ((h0) this.f993g).f84g;
                if (bVar != null) {
                    bVar.i(typeface);
                    return;
                }
                return;
            case 6:
                ((l0.f) this.f993g).accept(obj);
                return;
            case 7:
                String str = (String) this.f993g;
                int i6 = MainActivity.G0;
                ((MainActivity) obj).X(str);
                return;
            case 8:
                ((e2) obj).f3901a.K((String) this.f993g);
                return;
            default:
                x1.a aVarU = x1.a.u(((e2) obj).f3901a);
                x1.i iVar = (x1.i) this.f993g;
                String url = iVar.getUrl();
                if (!aVarU.W || "file:///android_asset/offline.html".equals(url)) {
                    return;
                }
                ((o0) iVar).a("file:///android_asset/offline.html");
                return;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i4, boolean z4) {
        this.f = i4;
        this.f994h = obj;
        this.f993g = obj2;
    }

    public /* synthetic */ b(Object obj, int i4, Object obj2) {
        this.f = i4;
        this.f993g = obj;
        this.f994h = obj2;
    }
}
