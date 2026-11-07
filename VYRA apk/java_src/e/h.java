package e;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements l1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1935b;

    public h(l1.c cVar) {
        this.f1934a = 1;
        this.f1935b = new LinkedHashSet();
        cVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // l1.b
    public final Bundle a() {
        switch (this.f1934a) {
            case 0:
                Bundle bundle = new Bundle();
                ((j) this.f1935b).u().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f1935b));
                return bundle2;
        }
    }

    public h(j jVar) {
        this.f1934a = 0;
        this.f1935b = jVar;
    }
}
