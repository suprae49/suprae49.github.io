package u1;

import co.median.android.GoNativeApplication;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f4013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.emoji2.text.x f4014c;

    public n1(androidx.emoji2.text.x xVar, String str, LinkedList linkedList) {
        this.f4014c = xVar;
        this.f4012a = str;
        this.f4013b = linkedList;
    }

    public final void a() {
        androidx.emoji2.text.x xVar = this.f4014c;
        GoNativeApplication goNativeApplication = (GoNativeApplication) xVar.f592a;
        o1 o1Var = new o1();
        o1Var.f4038a = this;
        o1Var.f4039b = xVar;
        o1Var.f4040c = goNativeApplication;
        o1Var.execute(new Void[0]);
    }
}
