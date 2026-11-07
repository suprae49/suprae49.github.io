package a3;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends a0 {
    public boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f46g = 0.0f;

    public c0(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new b0(0, this));
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    @Override // a3.a0
    public final void a(NavigationView navigationView) {
        boolean z4;
        boolean z5;
        o oVar;
        o oVar2;
        RectF rectF;
        o oVar3 = this.f38c;
        this.f46g = (oVar3 == null || (rectF = this.f39d) == null) ? 0.0f : oVar3.f.a(rectF);
        if (!((this.f39d.isEmpty() || (oVar2 = this.f38c) == null) ? false : oVar2.j(this.f39d))) {
            if (this.f39d.isEmpty() || (oVar = this.f38c) == null || !this.f37b || oVar.j(this.f39d)) {
                z5 = false;
            } else {
                o oVar4 = this.f38c;
                if ((oVar4.f123a instanceof l) && (oVar4.f124b instanceof l) && (oVar4.f126d instanceof l) && (oVar4.f125c instanceof l)) {
                    float fA = oVar4.f127e.a(this.f39d);
                    float fA2 = this.f38c.f.a(this.f39d);
                    float fA3 = this.f38c.f129h.a(this.f39d);
                    float fA4 = this.f38c.f128g.a(this.f39d);
                    if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                        RectF rectF2 = this.f39d;
                        rectF2.set(rectF2.left - fA2, rectF2.top, rectF2.right, rectF2.bottom);
                        this.f46g = fA2;
                    } else if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                        RectF rectF3 = this.f39d;
                        rectF3.set(rectF3.left, rectF3.top - fA3, rectF3.right, rectF3.bottom);
                        this.f46g = fA3;
                    } else if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                        RectF rectF4 = this.f39d;
                        rectF4.set(rectF4.left, rectF4.top, rectF4.right + fA, rectF4.bottom);
                        this.f46g = fA;
                    } else if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                        RectF rectF5 = this.f39d;
                        rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + fA);
                        this.f46g = fA;
                    } else {
                        z5 = false;
                    }
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            z4 = z5;
        }
        this.f = z4;
        navigationView.setClipToOutline(!b());
        if (b()) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // a3.a0
    public final boolean b() {
        return !this.f || this.f36a;
    }
}
