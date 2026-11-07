package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f671a = new i1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f672b;

    static {
        k1 k1Var = null;
        try {
            k1Var = (k1) p1.m.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f672b = k1Var;
    }

    public static void a(int i4, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i4);
        }
    }
}
