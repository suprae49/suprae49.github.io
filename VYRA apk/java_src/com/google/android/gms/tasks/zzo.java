package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class zzo implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzp zzb;

    public zzo(zzp zzpVar, Task task) {
        this.zzb = zzpVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.zzb.zzb.then(this.zza.getResult());
            zzp zzpVar = this.zzb;
            if (taskThen == null) {
                zzpVar.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.zza;
            taskThen.addOnSuccessListener(executor, zzpVar);
            taskThen.addOnFailureListener(executor, this.zzb);
            taskThen.addOnCanceledListener(executor, this.zzb);
        } catch (RuntimeExecutionException e5) {
            boolean z4 = e5.getCause() instanceof Exception;
            zzp zzpVar2 = this.zzb;
            if (z4) {
                zzpVar2.onFailure((Exception) e5.getCause());
            } else {
                zzpVar2.onFailure(e5);
            }
        } catch (CancellationException unused) {
            this.zzb.onCanceled();
        } catch (Exception e6) {
            this.zzb.onFailure(e6);
        }
    }
}
