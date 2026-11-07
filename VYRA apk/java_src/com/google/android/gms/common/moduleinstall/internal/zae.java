package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public interface zae extends IInterface {
    void zab(Status status);

    void zac(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse);

    void zad(Status status, ModuleInstallResponse moduleInstallResponse);

    void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);
}
