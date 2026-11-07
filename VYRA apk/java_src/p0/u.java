package p0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements v {
    public final ScrollFeedbackProvider f;

    public u(NestedScrollView nestedScrollView) {
        this.f = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p0.v
    public final void onScrollLimit(int i4, int i5, int i6, boolean z4) {
        this.f.onScrollLimit(i4, i5, i6, z4);
    }

    @Override // p0.v
    public final void onScrollProgress(int i4, int i5, int i6, int i7) {
        this.f.onScrollProgress(i4, i5, i6, i7);
    }
}
