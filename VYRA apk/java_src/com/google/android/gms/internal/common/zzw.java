package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzw extends zzj {
    final CharSequence zzb;
    final zzo zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public zzw(zzx zzxVar, CharSequence charSequence) {
        this.zzc = zzxVar.zza;
        this.zzd = zzxVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzj
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i4 = this.zze;
        while (true) {
            int i5 = this.zze;
            if (i5 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i5);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i4) {
                int i6 = iZzc + 1;
                this.zze = i6;
                if (i6 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i4 < iZzd) {
                    this.zzb.charAt(i4);
                }
                if (i4 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i4 != iZzd) {
                    int i7 = this.zzf;
                    if (i7 == 1) {
                        iZzd = this.zzb.length();
                        this.zze = -1;
                        if (iZzd > i4) {
                            this.zzb.charAt(iZzd - 1);
                        }
                    } else {
                        this.zzf = i7 - 1;
                    }
                    return this.zzb.subSequence(i4, iZzd).toString();
                }
                i4 = this.zze;
            }
        }
    }

    public abstract int zzc(int i4);

    public abstract int zzd(int i4);
}
