package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f566e;
    public final /* synthetic */ ThreadPoolExecutor f;

    public m(h0 h0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f566e = h0Var;
        this.f = threadPoolExecutor;
    }

    @Override // u1.h0
    public final void P(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f;
        try {
            this.f566e.P(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // u1.h0
    public final void R(x xVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f;
        try {
            this.f566e.R(xVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
