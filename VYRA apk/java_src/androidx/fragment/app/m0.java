package androidx.fragment.app;

import co.median.android.MainActivity;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.activity.i0 f726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f728e;

    public m0(boolean z4) {
        this.f724a = z4;
        this.f725b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(u0 u0Var) {
        this(false);
        this.f727d = 0;
        this.f728e = u0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(MainActivity mainActivity) {
        this(true);
        this.f727d = 1;
        this.f728e = mainActivity;
    }
}
