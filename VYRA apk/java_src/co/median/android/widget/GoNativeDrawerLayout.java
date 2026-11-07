package co.median.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import y0.f;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class GoNativeDrawerLayout extends f {
    public boolean M;

    public GoNativeDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = false;
    }

    @Override // y0.f, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.M) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        Log.d("SWIPE", "GNDrawerLayout disabled touch");
        return false;
    }

    @Override // y0.f, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.M) {
            Log.d("SWIPE", "GNDrawerLayout disabled touch");
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setDisableTouch(boolean z4) {
        this.M = z4;
    }
}
