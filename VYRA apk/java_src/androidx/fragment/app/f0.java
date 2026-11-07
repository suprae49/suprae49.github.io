package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AnimationSet implements Runnable {
    public final ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f682j;

    public f0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f682j = true;
        this.f = viewGroup;
        this.f679g = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation) {
        this.f682j = true;
        if (this.f680h) {
            return !this.f681i;
        }
        if (!super.getTransformation(j4, transformation)) {
            this.f680h = true;
            p0.s.a(this.f, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f680h;
        ViewGroup viewGroup = this.f;
        if (z4 || !this.f682j) {
            viewGroup.endViewTransition(this.f679g);
            this.f681i = true;
        } else {
            this.f682j = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation, float f) {
        this.f682j = true;
        if (this.f680h) {
            return !this.f681i;
        }
        if (!super.getTransformation(j4, transformation, f)) {
            this.f680h = true;
            p0.s.a(this.f, this);
        }
        return true;
    }
}
