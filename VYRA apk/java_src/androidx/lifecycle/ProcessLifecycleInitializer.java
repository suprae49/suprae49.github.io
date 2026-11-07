package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements m1.b {
    @Override // m1.b
    public final List a() {
        return h3.m.f;
    }

    @Override // m1.b
    public final Object b(Context context) {
        context.getClass();
        m1.a aVarC = m1.a.c(context);
        aVarC.getClass();
        if (!aVarC.f3068b.contains(ProcessLifecycleInitializer.class)) {
            androidx.fragment.app.q.j("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!q.f856a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new p());
        }
        f0 f0Var = f0.n;
        f0Var.getClass();
        f0Var.f823j = new Handler();
        f0Var.f824k.e(m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new e0(f0Var));
        return f0Var;
    }
}
