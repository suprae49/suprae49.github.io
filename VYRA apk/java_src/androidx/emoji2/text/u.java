package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements j {
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0.d f581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a3.f f582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f583i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ThreadPoolExecutor f585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ThreadPoolExecutor f586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h0 f587m;

    public u(Context context, l0.d dVar) {
        h0.g(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.f581g = dVar;
        this.f582h = v.f588d;
    }

    public final void a() {
        synchronized (this.f583i) {
            try {
                this.f587m = null;
                Handler handler = this.f584j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f584j = null;
                ThreadPoolExecutor threadPoolExecutor = this.f586l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f585k = null;
                this.f586l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final l0.i b() {
        try {
            a3.f fVar = this.f582h;
            Context context = this.f;
            l0.d dVar = this.f581g;
            fVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            e.f fVarA = l0.c.a(context, Collections.unmodifiableList(arrayList));
            int i4 = fVarA.f;
            if (i4 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i4 + ")");
            }
            l0.i[] iVarArr = (l0.i[]) ((List) fVarA.f1920g).get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e5) {
            throw new RuntimeException("provider not found", e5);
        }
    }

    @Override // androidx.emoji2.text.j
    public final void u(h0 h0Var) {
        synchronized (this.f583i) {
            this.f587m = h0Var;
        }
        synchronized (this.f583i) {
            try {
                if (this.f587m == null) {
                    return;
                }
                if (this.f585k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f586l = threadPoolExecutor;
                    this.f585k = threadPoolExecutor;
                }
                this.f585k.execute(new androidx.activity.k(2, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
