package k1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f2744h;

    public /* synthetic */ c(i iVar, ArrayList arrayList, int i4) {
        this.f = i4;
        this.f2744h = iVar;
        this.f2743g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ArrayList arrayList = this.f2743g;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    i iVar = this.f2744h;
                    if (i4 >= size) {
                        arrayList.clear();
                        iVar.f2799m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i4);
                        i4++;
                        h hVar = (h) obj;
                        x0 x0Var = hVar.f2782a;
                        int i5 = hVar.f2783b;
                        int i6 = hVar.f2784c;
                        int i7 = hVar.f2785d;
                        int i8 = hVar.f2786e;
                        iVar.getClass();
                        View view = x0Var.f2945a;
                        int i9 = i7 - i5;
                        int i10 = i8 - i6;
                        if (i9 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i10 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        iVar.f2801p.add(x0Var);
                        viewPropertyAnimatorAnimate.setDuration(iVar.f2791e).setListener(new e(iVar, x0Var, i9, view, i10, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f2743g;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    i iVar2 = this.f2744h;
                    if (i11 >= size2) {
                        arrayList2.clear();
                        iVar2.n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        g gVar = (g) obj2;
                        ArrayList arrayList3 = iVar2.f2803r;
                        long j4 = iVar2.f;
                        x0 x0Var2 = gVar.f2775a;
                        View view2 = x0Var2 == null ? null : x0Var2.f2945a;
                        x0 x0Var3 = gVar.f2776b;
                        View view3 = x0Var3 != null ? x0Var3.f2945a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j4);
                            arrayList3.add(gVar.f2775a);
                            duration.translationX(gVar.f2779e - gVar.f2777c);
                            duration.translationY(gVar.f - gVar.f2778d);
                            duration.alpha(0.0f).setListener(new f(iVar2, gVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(gVar.f2776b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j4).alpha(1.0f).setListener(new f(iVar2, gVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f2743g;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (true) {
                    i iVar3 = this.f2744h;
                    if (i12 >= size3) {
                        arrayList4.clear();
                        iVar3.f2798l.remove(arrayList4);
                    } else {
                        Object obj3 = arrayList4.get(i12);
                        i12++;
                        x0 x0Var4 = (x0) obj3;
                        iVar3.getClass();
                        View view4 = x0Var4.f2945a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        iVar3.f2800o.add(x0Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(iVar3.f2789c).setListener(new d(iVar3, x0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
