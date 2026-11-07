package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class zzev extends zzet {
    private final zzex zza;

    public zzev(zzex zzexVar, int i4) {
        super(zzexVar.size(), i4);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.location.zzet
    public final Object zza(int i4) {
        return this.zza.get(i4);
    }
}
