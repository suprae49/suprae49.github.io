package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class zzae extends zzz {
    private final zzag zza;

    public zzae(zzag zzagVar, int i4) {
        super(zzagVar.size(), i4);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final Object zza(int i4) {
        return this.zza.get(i4);
    }
}
