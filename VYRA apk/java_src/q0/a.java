package q0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f3364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3365h;

    public a(int i4, e eVar, int i5) {
        this.f = i4;
        this.f3364g = eVar;
        this.f3365h = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f);
        this.f3364g.f3378a.performAction(this.f3365h, bundle);
    }
}
