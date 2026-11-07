package k1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2962g;

    public /* synthetic */ y(RecyclerView recyclerView, int i4) {
        this.f = i4;
        this.f2962g = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        int i4 = this.f;
        RecyclerView recyclerView = this.f2962g;
        switch (i4) {
            case 0:
                if (recyclerView.f945y && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f941w) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.B) {
                        recyclerView.m();
                    } else {
                        recyclerView.A = true;
                    }
                    break;
                }
                break;
            default:
                h0 h0Var = recyclerView.P;
                if (h0Var != null) {
                    i iVar = (i) h0Var;
                    long j4 = iVar.f2790d;
                    ArrayList arrayList = iVar.f2794h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = iVar.f2796j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = iVar.f2797k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = iVar.f2795i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z4 = false;
                    } else {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            int i6 = i5 + 1;
                            x0 x0Var = (x0) obj;
                            View view = x0Var.f2945a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            iVar.f2802q.add(x0Var);
                            viewPropertyAnimatorAnimate.setDuration(j4).alpha(0.0f).setListener(new d(iVar, x0Var, viewPropertyAnimatorAnimate, view)).start();
                            i5 = i6;
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z5 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            iVar.f2799m.add(arrayList5);
                            arrayList2.clear();
                            c cVar = new c(iVar, arrayList5, 0);
                            if (z5) {
                                cVar.run();
                            } else {
                                View view2 = ((h) arrayList5.get(0)).f2782a.f2945a;
                                WeakHashMap weakHashMap = p0.p0.f3233a;
                                view2.postOnAnimationDelayed(cVar, j4);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            iVar.n.add(arrayList6);
                            arrayList3.clear();
                            c cVar2 = new c(iVar, arrayList6, 1);
                            if (z5) {
                                cVar2.run();
                            } else {
                                View view3 = ((g) arrayList6.get(0)).f2775a.f2945a;
                                WeakHashMap weakHashMap2 = p0.p0.f3233a;
                                view3.postOnAnimationDelayed(cVar2, j4);
                            }
                        }
                        if (zIsEmpty4) {
                            z4 = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            iVar.f2798l.add(arrayList7);
                            arrayList4.clear();
                            c cVar3 = new c(iVar, arrayList7, 2);
                            if (z5 && zIsEmpty2 && zIsEmpty3) {
                                cVar3.run();
                                z4 = false;
                            } else {
                                if (z5) {
                                    j4 = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? iVar.f2791e : 0L, zIsEmpty3 ? 0L : iVar.f) + j4;
                                z4 = false;
                                View view4 = ((x0) arrayList7.get(0)).f2945a;
                                WeakHashMap weakHashMap3 = p0.p0.f3233a;
                                view4.postOnAnimationDelayed(cVar3, jMax);
                            }
                        }
                    }
                } else {
                    z4 = false;
                }
                recyclerView.f931q0 = z4;
                break;
        }
    }
}
