package com.google.android.gms.location;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
public @interface Granularity {
    public static final int GRANULARITY_COARSE = 1;
    public static final int GRANULARITY_FINE = 2;
    public static final int GRANULARITY_PERMISSION_LEVEL = 0;
}
