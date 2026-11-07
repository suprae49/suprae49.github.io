package j2;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f2459c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i4) {
        this(1);
        this.f2458b = i4;
        switch (i4) {
            case 1:
                this.f2459c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f2459c = carouselLayoutManager;
                break;
        }
    }

    public final int a() {
        switch (this.f2458b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f2459c;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    public c(int i4) {
        this.f2457a = i4;
    }
}
