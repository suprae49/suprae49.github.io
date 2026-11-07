package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class zzac extends zzae {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzaf zzafVar, GoogleApiClient googleApiClient, long j4, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = j4;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        PendingIntent pendingIntent = this.zzb;
        zzg zzgVar = (zzg) anyClient;
        Preconditions.checkNotNull(pendingIntent);
        long j4 = this.zza;
        Preconditions.checkArgument(j4 >= 0, "detectionIntervalMillis must be >= 0");
        ((zzv) zzgVar.getService()).zzh(j4, true, pendingIntent);
        setResult(Status.RESULT_SUCCESS);
    }
}
