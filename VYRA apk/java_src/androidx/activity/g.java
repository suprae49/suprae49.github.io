package androidx.activity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.e0 f199b;

    public /* synthetic */ g(androidx.fragment.app.e0 e0Var, int i4) {
        this.f198a = i4;
        this.f199b = e0Var;
    }

    @Override // a.b
    public final void a(q qVar) {
        switch (this.f198a) {
            case 0:
                qVar.getClass();
                androidx.fragment.app.e0 e0Var = this.f199b;
                Bundle bundleA = e0Var.f235i.f3011b.a("android:support:activity-result");
                if (bundleA != null) {
                    n nVar = e0Var.n;
                    LinkedHashMap linkedHashMap = nVar.f988b;
                    LinkedHashMap linkedHashMap2 = nVar.f987a;
                    Bundle bundle = nVar.f992g;
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        nVar.f990d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = stringArrayList.get(i4);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof s3.a) {
                                    r3.n.b(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i4);
                        num2.getClass();
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i4);
                        str2.getClass();
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        nVar.f988b.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
            default:
                androidx.fragment.app.d0 d0Var = (androidx.fragment.app.d0) ((e.j) this.f199b).f674y.f773g;
                d0Var.f698i.b(d0Var, d0Var, null);
                return;
        }
    }
}
