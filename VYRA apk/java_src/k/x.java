package k;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f2679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3.h0 f2680b;

    public x(TextView textView) {
        this.f2679a = textView;
        this.f2680b = new a3.h0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((u1.h0) this.f2680b.f84g).x(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = this.f2679a.getContext().obtainStyledAttributes(attributeSet, d.a.f1638i, i4, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z4);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z4) {
        ((u1.h0) this.f2680b.f84g).X(z4);
    }

    public final void d(boolean z4) {
        ((u1.h0) this.f2680b.f84g).c0(z4);
    }
}
