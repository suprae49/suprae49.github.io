package k1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class m0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f2851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2854d;

    public m0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2852b = new Rect();
        this.f2853c = true;
        this.f2854d = false;
    }

    public m0(int i4, int i5) {
        super(i4, i5);
        this.f2852b = new Rect();
        this.f2853c = true;
        this.f2854d = false;
    }

    public m0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2852b = new Rect();
        this.f2853c = true;
        this.f2854d = false;
    }

    public m0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2852b = new Rect();
        this.f2853c = true;
        this.f2854d = false;
    }

    public m0(m0 m0Var) {
        super((ViewGroup.LayoutParams) m0Var);
        this.f2852b = new Rect();
        this.f2853c = true;
        this.f2854d = false;
    }
}
