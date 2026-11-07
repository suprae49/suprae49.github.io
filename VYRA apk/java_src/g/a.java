package g;

import android.graphics.drawable.Drawable;
import q1.e;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Drawable.Callback {
    public final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2094g;

    public a(e eVar) {
        this.f2094g = eVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f) {
            case 0:
                break;
            default:
                ((e) this.f2094g).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        switch (this.f) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f2094g;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j4);
                }
                break;
            default:
                ((e) this.f2094g).scheduleSelf(runnable, j4);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f2094g;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            default:
                ((e) this.f2094g).unscheduleSelf(runnable);
                break;
        }
    }

    public /* synthetic */ a() {
    }

    private final void a(Drawable drawable) {
    }
}
