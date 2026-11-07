package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class zad {
    public static final Api.ClientKey zaa;

    @ShowFirstParty
    public static final Api.ClientKey zab;
    public static final Api.AbstractClientBuilder zac;
    static final Api.AbstractClientBuilder zad;
    public static final Scope zae;
    public static final Scope zaf;
    public static final Api zag;
    public static final Api zah;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zaa = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        zab = clientKey2;
        zaa zaaVar = new zaa();
        zac = zaaVar;
        zab zabVar = new zab();
        zad = zabVar;
        zae = new Scope(Scopes.PROFILE);
        zaf = new Scope(Scopes.EMAIL);
        zag = new Api("SignIn.API", zaaVar, clientKey);
        zah = new Api("SignIn.INTERNAL_API", zabVar, clientKey2);
    }
}
