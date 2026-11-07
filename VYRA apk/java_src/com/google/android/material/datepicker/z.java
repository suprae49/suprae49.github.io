package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends k1.u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1483q = 0;

    public /* synthetic */ z(Context context) {
        super(context);
    }

    @Override // k1.u
    public int b(View view, int i4) {
        switch (this.f1483q) {
            case 1:
                return 0;
            default:
                return super.b(view, i4);
        }
    }

    @Override // k1.u
    public int c(View view, int i4) {
        switch (this.f1483q) {
            case 1:
                return 0;
            default:
                return super.c(view, i4);
        }
    }

    @Override // k1.u
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f1483q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // k1.u
    public PointF f(int i4) {
        switch (this.f1483q) {
            case 1:
                return null;
            default:
                return super.f(i4);
        }
    }

    public z(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
