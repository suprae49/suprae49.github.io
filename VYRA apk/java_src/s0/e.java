package s0;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import d3.a0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.h0;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3666b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0.c f3667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f0.c f3668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3669e;

    public e(ViewGroup viewGroup) {
        View childAt;
        f0.c cVar = f0.c.f2066e;
        this.f3667c = cVar;
        this.f3668d = cVar;
        Drawable background = viewGroup.getBackground();
        this.f3669e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        b bVar = new b(this, viewGroup.getContext(), viewGroup);
        this.f3665a = bVar;
        bVar.setVisibility(8);
        bVar.setWillNotDraw(true);
        a0 a0Var = new a0(4, this);
        WeakHashMap weakHashMap = p0.f3233a;
        h0.c(bVar, a0Var);
        p0.o(bVar, new c(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(bVar, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new d(viewGroup, bVar));
        }
    }
}
