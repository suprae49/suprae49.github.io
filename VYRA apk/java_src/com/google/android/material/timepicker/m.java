package com.google.android.material.timepicker;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import k.a2;
import k.b0;
import k.x1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements View.OnTouchListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1630g;

    public /* synthetic */ m(int i4, Object obj) {
        this.f = i4;
        this.f1630g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f) {
            case 0:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.f1630g).onTouchEvent(motionEvent);
                }
                return false;
            default:
                a2 a2Var = (a2) this.f1630g;
                x1 x1Var = a2Var.f2484w;
                Handler handler = a2Var.A;
                b0 b0Var = a2Var.E;
                int action = motionEvent.getAction();
                int x4 = (int) motionEvent.getX();
                int y4 = (int) motionEvent.getY();
                if (action == 0 && b0Var != null && b0Var.isShowing() && x4 >= 0 && x4 < b0Var.getWidth() && y4 >= 0 && y4 < b0Var.getHeight()) {
                    handler.postDelayed(x1Var, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(x1Var);
                return false;
        }
    }
}
