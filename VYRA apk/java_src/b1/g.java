package b1;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.k;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f1042e;

    public g(TextView textView) {
        this.f1042e = new f(textView);
    }

    @Override // u1.h0
    public final boolean I() {
        return this.f1042e.f1041g;
    }

    @Override // u1.h0
    public final void X(boolean z4) {
        if (k.f554k != null) {
            this.f1042e.X(z4);
        }
    }

    @Override // u1.h0
    public final void c0(boolean z4) {
        boolean z5 = k.f554k != null;
        f fVar = this.f1042e;
        if (z5) {
            fVar.c0(z4);
        } else {
            fVar.f1041g = z4;
        }
    }

    @Override // u1.h0
    public final TransformationMethod t0(TransformationMethod transformationMethod) {
        return !(k.f554k != null) ? transformationMethod : this.f1042e.t0(transformationMethod);
    }

    @Override // u1.h0
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        return !(k.f554k != null) ? inputFilterArr : this.f1042e.x(inputFilterArr);
    }
}
