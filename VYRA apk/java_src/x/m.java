package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4617d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4640g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == 1) {
                this.f4616c = typedArrayObtainStyledAttributes.getFloat(index, this.f4616c);
            } else if (index == 0) {
                int i5 = typedArrayObtainStyledAttributes.getInt(index, this.f4614a);
                this.f4614a = i5;
                this.f4614a = o.f4630d[i5];
            } else if (index == 4) {
                this.f4615b = typedArrayObtainStyledAttributes.getInt(index, this.f4615b);
            } else if (index == 3) {
                this.f4617d = typedArrayObtainStyledAttributes.getFloat(index, this.f4617d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
