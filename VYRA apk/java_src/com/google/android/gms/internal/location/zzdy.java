package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class zzdy extends com.google.android.gms.location.zzy {
    private final zzdr zza;

    public zzdy(zzdr zzdrVar) {
        this.zza = zzdrVar;
    }

    public final zzdy zzc(ListenerHolder listenerHolder) {
        this.zza.zzb(listenerHolder);
        return this;
    }

    @Override // com.google.android.gms.location.zzz
    public final void zzd(Location location) {
        this.zza.zza().notifyListener(new zzdw(this, location));
    }

    @Override // com.google.android.gms.location.zzz
    public final void zze() {
        this.zza.zza().notifyListener(new zzdx(this));
    }

    public final void zzf() {
        this.zza.zza().clear();
    }

    public final /* synthetic */ zzdr zzg() {
        return this.zza;
    }
}
