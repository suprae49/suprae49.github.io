package androidx.emoji2.text;

import a3.h0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements m1.b {
    @Override // m1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // m1.b
    public final Object b(Context context) {
        Object objB;
        v vVar = new v(new h0(context));
        vVar.f548a = 1;
        if (k.f554k == null) {
            synchronized (k.f553j) {
                try {
                    if (k.f554k == null) {
                        k.f554k = new k(vVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m1.a aVarC = m1.a.c(context);
        aVarC.getClass();
        synchronized (m1.a.f3066e) {
            try {
                objB = aVarC.f3067a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final androidx.lifecycle.o lifecycle = ((androidx.lifecycle.t) objB).getLifecycle();
        lifecycle.a(new androidx.lifecycle.e(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public final void onResume() {
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new n(0), 500L);
                lifecycle.b(this);
            }
        });
        return Boolean.TRUE;
    }
}
