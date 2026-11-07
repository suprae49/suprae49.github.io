package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final SparseIntArray n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f4618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f4622e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f4623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f4626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4629m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4642i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            switch (n.get(index)) {
                case 1:
                    this.f4618a = typedArrayObtainStyledAttributes.getFloat(index, this.f4618a);
                    break;
                case 2:
                    this.f4619b = typedArrayObtainStyledAttributes.getFloat(index, this.f4619b);
                    break;
                case 3:
                    this.f4620c = typedArrayObtainStyledAttributes.getFloat(index, this.f4620c);
                    break;
                case 4:
                    this.f4621d = typedArrayObtainStyledAttributes.getFloat(index, this.f4621d);
                    break;
                case 5:
                    this.f4622e = typedArrayObtainStyledAttributes.getFloat(index, this.f4622e);
                    break;
                case 6:
                    this.f = typedArrayObtainStyledAttributes.getDimension(index, this.f);
                    break;
                case 7:
                    this.f4623g = typedArrayObtainStyledAttributes.getDimension(index, this.f4623g);
                    break;
                case 8:
                    this.f4625i = typedArrayObtainStyledAttributes.getDimension(index, this.f4625i);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    this.f4626j = typedArrayObtainStyledAttributes.getDimension(index, this.f4626j);
                    break;
                case 10:
                    this.f4627k = typedArrayObtainStyledAttributes.getDimension(index, this.f4627k);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    this.f4628l = true;
                    this.f4629m = typedArrayObtainStyledAttributes.getDimension(index, this.f4629m);
                    break;
                case 12:
                    this.f4624h = o.f(typedArrayObtainStyledAttributes, index, this.f4624h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
