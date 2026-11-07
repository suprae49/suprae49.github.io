package r2;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3602d;
    public final WeakReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x2.d f3604g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f3599a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2.b f3600b = new l2.b(1, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3603e = true;

    public x(w wVar) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(wVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f3599a;
        this.f3601c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f3602d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f3603e = false;
    }

    public final void b(x2.d dVar, Context context) {
        if (this.f3604g != dVar) {
            this.f3604g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f3599a;
                l2.b bVar = this.f3600b;
                dVar.e(context, textPaint, bVar);
                w wVar = (w) this.f.get();
                if (wVar != null) {
                    textPaint.drawableState = wVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                this.f3603e = true;
            }
            w wVar2 = (w) this.f.get();
            if (wVar2 != null) {
                wVar2.a();
                wVar2.onStateChange(wVar2.getState());
            }
        }
    }
}
