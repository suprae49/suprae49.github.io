package b1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f1040e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1041g = true;

    public f(TextView textView) {
        this.f1040e = textView;
        this.f = new d(textView);
    }

    @Override // u1.h0
    public final boolean I() {
        return this.f1041g;
    }

    @Override // u1.h0
    public final void X(boolean z4) {
        if (z4) {
            TextView textView = this.f1040e;
            textView.setTransformationMethod(t0(textView.getTransformationMethod()));
        }
    }

    @Override // u1.h0
    public final void c0(boolean z4) {
        this.f1041g = z4;
        TextView textView = this.f1040e;
        textView.setTransformationMethod(t0(textView.getTransformationMethod()));
        textView.setFilters(x(textView.getFilters()));
    }

    @Override // u1.h0
    public final TransformationMethod t0(TransformationMethod transformationMethod) {
        if (this.f1041g) {
            return ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod);
        }
        return transformationMethod instanceof j ? ((j) transformationMethod).f : transformationMethod;
    }

    @Override // u1.h0
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        if (!this.f1041g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i4 = 0; i4 < inputFilterArr.length; i4++) {
                InputFilter inputFilter = inputFilterArr[i4];
                if (inputFilter instanceof d) {
                    sparseArray.put(i4, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (sparseArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i6];
                    i5++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i7 = 0;
        while (true) {
            d dVar = this.f;
            if (i7 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i7] == dVar) {
                return inputFilterArr;
            }
            i7++;
        }
    }
}
