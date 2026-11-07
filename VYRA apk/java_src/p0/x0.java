package p0;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f3261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f3262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f3263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3264d;

    public x0(t0 t0Var) {
        super(0);
        this.f3264d = new HashMap();
        this.f3261a = t0Var;
    }

    public final a1 a(WindowInsetsAnimation windowInsetsAnimation) {
        a1 a1Var = (a1) this.f3264d.get(windowInsetsAnimation);
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1(0, null, 0L);
        a1Var2.f3162a = new y0(windowInsetsAnimation);
        this.f3264d.put(windowInsetsAnimation, a1Var2);
        return a1Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f3261a.a(a(windowInsetsAnimation));
        this.f3264d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f3261a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f3263c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f3263c = arrayList2;
            this.f3262b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = com.google.android.gms.common.api.a.j(list.get(size));
            a1 a1VarA = a(windowInsetsAnimationJ);
            a1VarA.f3162a.e(windowInsetsAnimationJ.getFraction());
            this.f3263c.add(a1VarA);
        }
        return this.f3261a.c(y1.h(null, windowInsets), this.f3262b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        androidx.emoji2.text.p pVarD = this.f3261a.d(a(windowInsetsAnimation), new androidx.emoji2.text.p(bounds));
        pVarD.getClass();
        com.google.android.gms.common.api.a.m();
        return com.google.android.gms.common.api.a.h(((f0.c) pVarD.f568g).e(), ((f0.c) pVarD.f569h).e());
    }
}
