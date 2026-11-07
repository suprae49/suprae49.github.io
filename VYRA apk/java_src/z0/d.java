package z0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.emoji2.text.p;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import i1.f;
import java.util.ArrayList;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final c n = new c(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f4829o = new c(2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f4830p = new c(3);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f4831q = new c(4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f4832r = new c(5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f4833s = new c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f4838e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4840h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f4843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f4844l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4845m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f4834a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4835b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4836c = false;
    public boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4839g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4841i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f4842j = new ArrayList();

    public d(Object obj, i iVar) {
        this.f4837d = obj;
        this.f4838e = iVar;
        if (iVar == f4830p || iVar == f4831q || iVar == f4832r) {
            this.f4840h = 0.1f;
        } else if (iVar == f4833s) {
            this.f4840h = 0.00390625f;
        } else if (iVar == n || iVar == f4829o) {
            this.f4840h = 0.002f;
        } else {
            this.f4840h = 1.0f;
        }
        this.f4843k = null;
        this.f4844l = Float.MAX_VALUE;
        this.f4845m = false;
    }

    public static b b() {
        ThreadLocal threadLocal = b.f4820i;
        if (threadLocal.get() == null) {
            threadLocal.set(new b(new p(20)));
        }
        return (b) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, z0.a] */
    public final void a(float f) {
        if (this.f) {
            this.f4844l = f;
            return;
        }
        if (this.f4843k == null) {
            this.f4843k = new e(f);
        }
        e eVar = this.f4843k;
        double d5 = f;
        eVar.f4853i = d5;
        double d6 = (float) d5;
        if (d6 > Float.MAX_VALUE) {
            q.t("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d6 < -3.4028235E38f) {
            q.t("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.f4840h * 0.75f);
        eVar.f4849d = dAbs;
        eVar.f4850e = dAbs * 62.5d;
        p pVar = b().f4825e;
        pVar.getClass();
        if (Thread.currentThread() != ((Looper) pVar.f569h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z4 = this.f;
        if (z4 || z4) {
            return;
        }
        this.f = true;
        if (!this.f4836c) {
            this.f4835b = this.f4838e.p(this.f4837d);
        }
        float f4 = this.f4835b;
        if (f4 > Float.MAX_VALUE || f4 < -3.4028235E38f) {
            q.q("Starting value need to be in between min value and max value");
            return;
        }
        b bVarB = b();
        ArrayList arrayList = bVarB.f4822b;
        if (arrayList.size() == 0) {
            ((Choreographer) bVarB.f4825e.f568g).postFrameCallback(new f(bVarB.f4824d));
            if (Build.VERSION.SDK_INT >= 33) {
                bVarB.f4826g = ValueAnimator.getDurationScale();
                if (bVarB.f4827h == null) {
                    bVarB.f4827h = new p(19, bVarB);
                }
                final p pVar2 = bVarB.f4827h;
                if (((a) pVar2.f568g) == null) {
                    ?? r4 = new ValueAnimator.DurationScaleChangeListener() { // from class: z0.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f5) {
                            ((b) pVar2.f569h).f4826g = f5;
                        }
                    };
                    pVar2.f568g = r4;
                    ValueAnimator.registerDurationScaleChangeListener(r4);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f) {
        this.f4838e.O(this.f4837d, f);
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4842j;
            if (i4 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i4) != null) {
                throw u.i(i4, arrayList);
            }
            i4++;
        }
    }

    public final void d() {
        if (this.f4843k.f4847b <= 0.0d) {
            q.t("Spring animations can only come to an end when there is damping");
            return;
        }
        p pVar = b().f4825e;
        pVar.getClass();
        if (Thread.currentThread() != ((Looper) pVar.f569h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.f4845m = true;
        }
    }
}
