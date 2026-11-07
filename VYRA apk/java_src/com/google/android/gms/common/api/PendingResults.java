package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class PendingResults {
    private PendingResults() {
    }

    public static <R extends Result> PendingResult<R> canceledPendingResult(R r4) {
        Preconditions.checkNotNull(r4, "Result must not be null");
        Preconditions.checkArgument(r4.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        zaf zafVar = new zaf(r4);
        zafVar.cancel();
        return zafVar;
    }

    @KeepForSdk
    public static <R extends Result> PendingResult<R> immediateFailedResult(R r4, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r4, "Result must not be null");
        Preconditions.checkArgument(!r4.getStatus().isSuccess(), "Status code must not be SUCCESS");
        zag zagVar = new zag(googleApiClient, r4);
        zagVar.setResult(r4);
        return zagVar;
    }

    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r4) {
        Preconditions.checkNotNull(r4, "Result must not be null");
        zah zahVar = new zah(null);
        zahVar.setResult(r4);
        return new OptionalPendingResultImpl(zahVar);
    }

    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r4, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r4, "Result must not be null");
        zah zahVar = new zah(googleApiClient);
        zahVar.setResult(r4);
        return new OptionalPendingResultImpl(zahVar);
    }

    public static PendingResult<Status> immediatePendingResult(Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(Status status, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    public static PendingResult<Status> canceledPendingResult() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }
}
