package a3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f147d;

    public r(ArrayList arrayList, Matrix matrix) {
        this.f146c = arrayList;
        this.f147d = matrix;
    }

    @Override // a3.x
    public final void a(Matrix matrix, z2.a aVar, int i4, Canvas canvas) {
        ArrayList arrayList = this.f146c;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((x) obj).a(this.f147d, aVar, i4, canvas);
        }
    }
}
