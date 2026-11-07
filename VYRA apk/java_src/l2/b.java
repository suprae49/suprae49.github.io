package l2;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import r2.w;
import r2.x;
import t1.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3015h;

    public /* synthetic */ b(int i4, Object obj) {
        this.f3014g = i4;
        this.f3015h = obj;
    }

    @Override // t1.l
    public final void l(int i4) {
        switch (this.f3014g) {
            case 0:
                break;
            default:
                x xVar = (x) this.f3015h;
                xVar.f3603e = true;
                w wVar = (w) xVar.f.get();
                if (wVar != null) {
                    wVar.a();
                }
                break;
        }
    }

    @Override // t1.l
    public final void m(Typeface typeface, boolean z4) {
        switch (this.f3014g) {
            case 0:
                Chip chip = (Chip) this.f3015h;
                d dVar = chip.f1385j;
                chip.setText(dVar.R0 ? dVar.T : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z4) {
                    x xVar = (x) this.f3015h;
                    xVar.f3603e = true;
                    w wVar = (w) xVar.f.get();
                    if (wVar != null) {
                        wVar.a();
                    }
                    break;
                }
                break;
        }
    }

    private final void t(int i4) {
    }
}
