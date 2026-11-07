package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.u0;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements l1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f193b;

    public /* synthetic */ f(int i4, Object obj) {
        this.f192a = i4;
        this.f193b = obj;
    }

    @Override // l1.b
    public final Bundle a() {
        switch (this.f192a) {
            case 0:
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) this.f193b;
                Bundle bundle = new Bundle();
                n nVar = e0Var.n;
                nVar.getClass();
                LinkedHashMap linkedHashMap = nVar.f988b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(nVar.f990d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(nVar.f992g));
                return bundle;
            case 1:
                e.j jVar = (e.j) this.f193b;
                while (androidx.fragment.app.e0.t(((androidx.fragment.app.d0) jVar.f674y.f773g).f698i)) {
                }
                jVar.f675z.e(androidx.lifecycle.m.ON_STOP);
                return new Bundle();
            case 2:
                return ((u0) this.f193b).S();
            default:
                return androidx.lifecycle.j0.a((androidx.lifecycle.j0) this.f193b);
        }
    }
}
