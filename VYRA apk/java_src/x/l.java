package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f4605j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f4610e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4613i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4605j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            switch (f4605j.get(index)) {
                case 1:
                    this.f4610e = typedArrayObtainStyledAttributes.getFloat(index, this.f4610e);
                    break;
                case 2:
                    this.f4608c = typedArrayObtainStyledAttributes.getInt(index, this.f4608c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = t.a.f3671a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4606a = o.f(typedArrayObtainStyledAttributes, index, this.f4606a);
                    break;
                case 6:
                    this.f4607b = typedArrayObtainStyledAttributes.getInteger(index, this.f4607b);
                    break;
                case 7:
                    this.f4609d = typedArrayObtainStyledAttributes.getFloat(index, this.f4609d);
                    break;
                case 8:
                    this.f4611g = typedArrayObtainStyledAttributes.getInteger(index, this.f4611g);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 10:
                    int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i5 == 1) {
                        this.f4613i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i5 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f4612h = string;
                        if (string.indexOf("/") > 0) {
                            this.f4613i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f4613i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
