package com.google.android.material.behavior;

import a3.h0;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e2.d;
import p0.p0;
import q0.c;
import w0.e;
import z.b;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {
    public e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1298i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1299j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1300k = 0.5f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f1301l = new d(this);

    @Override // z.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f1296g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1296g = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1296g = false;
        }
        if (zO) {
            if (this.f == null) {
                this.f = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1301l);
            }
            if (!this.f1297h && this.f.q(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // z.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            p0.j(view, 1048576);
            p0.h(view, 0);
            if (w(view)) {
                p0.k(view, c.f3371k, new h0(10, this));
            }
        }
        return false;
    }

    @Override // z.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f == null) {
            return false;
        }
        if (this.f1297h && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f.j(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
