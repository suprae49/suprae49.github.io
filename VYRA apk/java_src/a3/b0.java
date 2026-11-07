package a3;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44b;

    public /* synthetic */ b0(int i4, Object obj) {
        this.f43a = i4;
        this.f44b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f43a) {
            case 0:
                c0 c0Var = (c0) this.f44b;
                if (c0Var.f38c != null && !c0Var.f39d.isEmpty()) {
                    RectF rectF = c0Var.f39d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c0Var.f46g);
                    break;
                }
                break;
            case 1:
                Path path = ((d0) this.f44b).f40e;
                if (!path.isEmpty()) {
                    outline.setPath(path);
                }
                break;
            default:
                l2.d dVar = ((Chip) this.f44b).f1385j;
                if (dVar == null) {
                    outline.setAlpha(0.0f);
                } else {
                    dVar.getOutline(outline);
                }
                break;
        }
    }
}
