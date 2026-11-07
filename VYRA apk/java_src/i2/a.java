package i2;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f2269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Drawable f2270h;

    public /* synthetic */ a(MaterialButton materialButton, Drawable drawable, int i4) {
        this.f = i4;
        this.f2269g = materialButton;
        this.f2270h = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f;
        Drawable drawable = this.f2270h;
        MaterialButton materialButton = this.f2269g;
        switch (i4) {
            case 0:
                int[] iArr = MaterialButton.S;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.S;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
