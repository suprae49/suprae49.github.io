package k;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f2665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f2666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2667e;
    public boolean f;

    public v2(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f2667e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f2664b = rect3;
        Rect rect4 = new Rect();
        this.f2666d = rect4;
        Rect rect5 = new Rect();
        this.f2665c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i4 = -scaledTouchSlop;
        rect4.inset(i4, i4);
        rect5.set(rect2);
        this.f2663a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z5 = this.f;
                if (z5 && !this.f2666d.contains(x4, y4)) {
                    z6 = z5;
                    z4 = false;
                }
            } else if (action != 3) {
                z4 = true;
                z6 = false;
            } else {
                z5 = this.f;
                this.f = false;
            }
            z6 = z5;
            z4 = true;
        } else if (this.f2664b.contains(x4, y4)) {
            this.f = true;
            z4 = true;
        } else {
            z4 = true;
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        Rect rect = this.f2665c;
        View view = this.f2663a;
        if (!z4 || rect.contains(x4, y4)) {
            motionEvent.setLocation(x4 - rect.left, y4 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
