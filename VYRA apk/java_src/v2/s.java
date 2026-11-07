package v2;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import e.a0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends o {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f4400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a0 f4401t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q1.o f4402u;

    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        int i4;
        q1.o oVar;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f4385q)) {
            a aVar = this.f4377h;
            l lVar = this.f4376g;
            int i5 = 0;
            if (aVar != null && Settings.Global.getFloat(this.f.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (oVar = this.f4402u) != null) {
                oVar.setBounds(getBounds());
                this.f4402u.setTint(lVar.f4350e[0]);
                this.f4402u.draw(canvas);
                return;
            }
            canvas.save();
            f fVar = this.f4400s;
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f4378i;
            boolean z4 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f4379j;
            fVar.b(canvas, bounds, fB, z4, objectAnimator2 != null && objectAnimator2.isRunning());
            int i6 = lVar.f4353i;
            int i7 = this.f4384p;
            boolean z5 = (lVar instanceof l) && lVar.f4364u;
            boolean z6 = z5 && i6 == 0 && !lVar.a(false);
            Paint paint = this.f4383o;
            if (!z6) {
                canvas2 = canvas;
                if (z5) {
                    p pVar = (p) ((ArrayList) this.f4401t.f1840b).get(0);
                    ArrayList arrayList = (ArrayList) this.f4401t.f1840b;
                    p pVar2 = (p) arrayList.get(arrayList.size() - 1);
                    canvas.save();
                    canvas.rotate(pVar2.f);
                    i4 = i6;
                    this.f4400s.f(canvas2, paint, pVar2.f4387b, pVar.f4386a + 1.0f, lVar.f, i7, i4);
                    canvas.restore();
                }
                while (i5 < ((ArrayList) this.f4401t.f1840b).size()) {
                    p pVar3 = (p) ((ArrayList) this.f4401t.f1840b).get(i5);
                    pVar3.f4390e = c();
                    this.f4400s.e(canvas, paint, pVar3, this.f4384p);
                    if (i5 <= 0 && !z6 && z5) {
                        this.f4400s.f(canvas2, paint, ((p) ((ArrayList) this.f4401t.f1840b).get(i5 - 1)).f4387b, pVar3.f4386a, lVar.f, i7, i4);
                    }
                    i5++;
                    canvas2 = canvas;
                }
                canvas.restore();
            }
            canvas2 = canvas;
            this.f4400s.f(canvas2, paint, 0.0f, 1.0f, lVar.f, i7, 0);
            i4 = i6;
            while (i5 < ((ArrayList) this.f4401t.f1840b).size()) {
                p pVar4 = (p) ((ArrayList) this.f4401t.f1840b).get(i5);
                pVar4.f4390e = c();
                this.f4400s.e(canvas, paint, pVar4, this.f4384p);
                if (i5 <= 0) {
                }
                i5++;
                canvas2 = canvas;
            }
            canvas.restore();
        }
    }

    @Override // v2.o
    public final boolean e(boolean z4, boolean z5, boolean z6) {
        q1.o oVar;
        boolean zE = super.e(z4, z5, z6);
        if (this.f4377h != null && Settings.Global.getFloat(this.f.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (oVar = this.f4402u) != null) {
            return oVar.setVisible(z4, z5);
        }
        if (!isRunning()) {
            this.f4401t.c();
        }
        if (z4 && z6) {
            this.f4401t.n();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4400s.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4400s.g();
    }
}
