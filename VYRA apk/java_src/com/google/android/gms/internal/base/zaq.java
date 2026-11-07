package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public interface zaq {
    ExecutorService zaa(ThreadFactory threadFactory, int i4);

    ExecutorService zab(int i4, int i5);

    ExecutorService zac(int i4, ThreadFactory threadFactory, int i5);
}
