package j2;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.k;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2454b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f2453a = i4;
        this.f2454b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        boolean z4;
        d2.a aVar;
        switch (this.f2453a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f2454b;
                if (i6 - i4 != i10 - i8 || i7 - i5 != i11 - i9) {
                    view.post(new k(10, carouselLayoutManager));
                }
                break;
            case 1:
                ((u1.e) this.f2454b).f3889q = i7 - i5;
                break;
            default:
                g2.a aVar2 = (g2.a) this.f2454b;
                View view2 = aVar2.f4187w;
                ImageView imageView = aVar2.f4189y;
                if (imageView.getVisibility() == 0 && (aVar = aVar2.f4165f0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.i(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar2.f4186v.getLayoutParams();
                int i12 = (i6 - i4) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i13 = (i7 - i5) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z5 = true;
                if (aVar2.g0 == 1 && aVar2.f4161a0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (aVar2.f4161a0 != -2 || view2.getMeasuredWidth() == i12) {
                        z4 = false;
                    } else {
                        layoutParams2.width = Math.max(i12, Math.min(aVar2.V, aVar2.getMeasuredWidth() - (aVar2.d0 * 2)));
                        z4 = true;
                    }
                    if (view2.getMeasuredHeight() < i13) {
                        layoutParams2.height = i13;
                    } else {
                        z5 = z4;
                    }
                    if (z5) {
                        view2.setLayoutParams(layoutParams2);
                    }
                    break;
                }
                break;
        }
    }
}
