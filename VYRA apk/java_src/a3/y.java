package a3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f167e;
    public final ArrayList f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f168g = new ArrayList();

    public y() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f4 = this.f166d;
        if (f4 == f) {
            return;
        }
        float f5 = ((f - f4) + 360.0f) % 360.0f;
        if (f5 > 180.0f) {
            return;
        }
        float f6 = this.f164b;
        float f7 = this.f165c;
        u uVar = new u(f6, f7, f6, f7);
        uVar.f = this.f166d;
        uVar.f157g = f5;
        this.f168g.add(new s(uVar));
        this.f166d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((w) arrayList.get(i4)).a(matrix, path);
        }
    }

    public final void c(float f, float f4) {
        v vVar = new v();
        vVar.f158b = f;
        vVar.f159c = f4;
        this.f.add(vVar);
        t tVar = new t(vVar, this.f164b, this.f165c);
        float fB = tVar.b() + 270.0f;
        float fB2 = tVar.b() + 270.0f;
        a(fB);
        this.f168g.add(tVar);
        this.f166d = fB2;
        this.f164b = f;
        this.f165c = f4;
    }

    public final void d(float f, float f4, float f5) {
        this.f163a = f;
        this.f164b = 0.0f;
        this.f165c = f;
        this.f166d = f4;
        this.f167e = (f4 + f5) % 360.0f;
        this.f.clear();
        this.f168g.clear();
    }
}
