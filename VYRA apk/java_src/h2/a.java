package h2;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f2168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2169i;

    public a(TextView textView, Typeface typeface, int i4) {
        this.f2168h = textView;
        this.f2169i = typeface;
        this.f2167g = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ((BottomSheetBehavior) this.f2169i).M(this.f2168h, this.f2167g, false);
                break;
            default:
                ((TextView) this.f2168h).setTypeface((Typeface) this.f2169i, this.f2167g);
                break;
        }
    }

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i4) {
        this.f2169i = bottomSheetBehavior;
        this.f2168h = view;
        this.f2167g = i4;
    }
}
