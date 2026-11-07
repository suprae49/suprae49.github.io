package j2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import co.median.android.eeqadjy.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k1.i0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f2455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2456b;

    public b() {
        Paint paint = new Paint();
        this.f2455a = paint;
        this.f2456b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // k1.i0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int iF;
        int iD;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f2455a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f2456b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = f0.b.f2065a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int iE = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1367q;
                switch (cVar.f2458b) {
                    case 0:
                        break;
                    default:
                        iE = cVar.f2459c.G();
                        break;
                }
                float f4 = iE;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1367q;
                switch (cVar2.f2458b) {
                    case 0:
                        iD = cVar2.f2459c.f2849o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.f2459c;
                        iD = carouselLayoutManager.f2849o - carouselLayoutManager.D();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f4, 0.0f, iD, paint);
            } else {
                canvas2 = canvas;
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1367q;
                switch (cVar3.f2458b) {
                    case 0:
                        iE = cVar3.f2459c.E();
                        break;
                }
                float f5 = iE;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1367q;
                switch (cVar4.f2458b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.f2459c;
                        iF = carouselLayoutManager2.n - carouselLayoutManager2.F();
                        break;
                    default:
                        iF = cVar4.f2459c.n;
                        break;
                }
                canvas2.drawLine(f5, 0.0f, iF, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
