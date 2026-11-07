package a3;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends t2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85a;

    public i(int i4) {
        this.f85a = i4;
    }

    @Override // t2.i
    public final void O(Object obj, float f) {
        j jVar = (j) obj;
        float[] fArr = jVar.H;
        if (fArr != null) {
            int i4 = this.f85a;
            if (fArr[i4] != f) {
                fArr[i4] = f;
                d3.a0 a0Var = jVar.J;
                if (a0Var != null) {
                    float fI = jVar.i();
                    MaterialButton materialButton = (MaterialButton) a0Var.f1680g;
                    int i5 = (int) (fI * 0.11f);
                    if (materialButton.J != i5) {
                        materialButton.J = i5;
                        materialButton.w();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }

    @Override // t2.i
    public final float p(Object obj) {
        float[] fArr = ((j) obj).H;
        if (fArr != null) {
            return fArr[this.f85a];
        }
        return 0.0f;
    }
}
