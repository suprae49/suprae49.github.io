package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void onResult(R r4) {
        Status status = r4.getStatus();
        if (status.isSuccess()) {
            onSuccess(r4);
            return;
        }
        onFailure(status);
        if (r4 instanceof Releasable) {
            try {
                ((Releasable) r4).release();
            } catch (RuntimeException e5) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r4)), e5);
            }
        }
    }

    public abstract void onSuccess(R r4);
}
