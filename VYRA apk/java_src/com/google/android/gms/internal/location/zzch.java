package com.google.android.gms.internal.location;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzch implements Executor {
    static final /* synthetic */ zzch zza = new zzch();

    private /* synthetic */ zzch() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
