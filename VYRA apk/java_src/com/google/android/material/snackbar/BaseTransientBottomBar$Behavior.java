package com.google.android.material.snackbar;

import a3.f;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c3.c;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f1555m;

    public BaseTransientBottomBar$Behavior() {
        f fVar = new f(8);
        this.f1299j = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f1300k = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f1298i = 0;
        this.f1555m = fVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, z.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f1555m.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (c3.f.f1156b == null) {
                    c3.f.f1156b = new c3.f();
                }
                synchronized (c3.f.f1156b.f1157a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (c3.f.f1156b == null) {
                c3.f.f1156b = new c3.f();
            }
            synchronized (c3.f.f1156b.f1157a) {
            }
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.f1555m.getClass();
        return view instanceof c;
    }
}
