package h2;

import android.view.View;
import androidx.emoji2.text.p;
import java.util.Iterator;
import java.util.List;
import p0.a1;
import p0.t0;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f2170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f2173e = new int[2];

    public b(View view) {
        this.f2170b = view;
    }

    @Override // p0.t0
    public final void a(a1 a1Var) {
        this.f2170b.setTranslationY(0.0f);
    }

    @Override // p0.t0
    public final void b(a1 a1Var) {
        View view = this.f2170b;
        int[] iArr = this.f2173e;
        view.getLocationOnScreen(iArr);
        this.f2171c = iArr[1];
    }

    @Override // p0.t0
    public final y1 c(y1 y1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            if ((a1Var.f3162a.d() & 8) != 0) {
                this.f2170b.setTranslationY(b2.a.c(this.f2172d, 0, a1Var.f3162a.c()));
                break;
            }
        }
        return y1Var;
    }

    @Override // p0.t0
    public final p d(a1 a1Var, p pVar) {
        View view = this.f2170b;
        int[] iArr = this.f2173e;
        view.getLocationOnScreen(iArr);
        int i4 = this.f2171c - iArr[1];
        this.f2172d = i4;
        view.setTranslationY(i4);
        return pVar;
    }
}
