package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class zzaf<T> implements zzae<T> {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzaf(int i4, zzw zzwVar) {
        this.zzb = i4;
        this.zzc = zzwVar;
    }

    private final void zza() {
        int i4 = this.zzd;
        int i5 = this.zze;
        int i6 = i4 + i5 + this.zzf;
        int i7 = this.zzb;
        if (i6 == i7) {
            if (this.zzg == null) {
                boolean z4 = this.zzh;
                zzw zzwVar = this.zzc;
                if (z4) {
                    zzwVar.zzc();
                    return;
                } else {
                    zzwVar.zzb(null);
                    return;
                }
            }
            this.zzc.zza(new ExecutionException(i5 + " out of " + i7 + " underlying tasks failed", this.zzg));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t4) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
