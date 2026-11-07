package b1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements TransformationMethod {
    public final TransformationMethod f;

    public j(TransformationMethod transformationMethod) {
        this.f = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || k.a().b() != 1) {
            return charSequence;
        }
        k kVarA = k.a();
        kVarA.getClass();
        return kVarA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i4, Rect rect) {
        TransformationMethod transformationMethod = this.f;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z4, i4, rect);
        }
    }
}
