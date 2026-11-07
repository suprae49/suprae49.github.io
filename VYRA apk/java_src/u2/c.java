package u2;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FrameLayout implements i {
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4155h;

    public final void a() {
        setVisibility((!this.f4155h || (!this.f && this.f4154g)) ? 8 : 0);
    }

    @Override // j.z
    public final void b(j.o oVar) {
        a();
    }

    @Override // j.z
    public j.o getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
    }

    public void setDividersEnabled(boolean z4) {
        this.f4155h = z4;
        a();
    }

    @Override // u2.i
    public void setExpanded(boolean z4) {
        this.f = z4;
        a();
    }

    @Override // u2.i
    public void setOnlyShowWhenExpanded(boolean z4) {
        this.f4154g = z4;
        a();
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
