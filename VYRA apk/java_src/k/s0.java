package k;

import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i4, int i5, int i6, int i7) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
    }

    public static void c(TextView textView, int[] iArr, int i4) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
