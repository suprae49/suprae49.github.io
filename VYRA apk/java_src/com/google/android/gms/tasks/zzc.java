package com.google.android.gms.tasks;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, Task task) {
        this.zzb = zzdVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsCanceled = this.zza.isCanceled();
        zzd zzdVar = this.zzb;
        if (zIsCanceled) {
            zzdVar.zzc.zzc();
            return;
        }
        try {
            this.zzb.zzc.zzb(zzdVar.zzb.then(this.zza));
        } catch (RuntimeExecutionException e5) {
            boolean z4 = e5.getCause() instanceof Exception;
            zzd zzdVar2 = this.zzb;
            if (z4) {
                zzdVar2.zzc.zza((Exception) e5.getCause());
            } else {
                zzdVar2.zzc.zza(e5);
            }
        } catch (Exception e6) {
            this.zzb.zzc.zza(e6);
        }
    }
}
