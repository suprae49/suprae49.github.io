package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response(T t4) {
        this.zza = t4;
    }

    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t4) {
        this.zza = t4;
    }

    public Response() {
    }
}
