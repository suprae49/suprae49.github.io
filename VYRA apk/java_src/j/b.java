package j;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.s1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends s1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2322o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f2323p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2323p = actionMenuItemView;
    }

    @Override // k.s1
    public final c0 b() {
        k.g gVar;
        switch (this.f2322o) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f2323p).f260r;
                if (cVar == null || (gVar = ((k.h) cVar).f2524a.f424z) == null) {
                    return null;
                }
                return gVar.a();
            default:
                k.g gVar2 = ((k.j) this.f2323p).f2547i.f423y;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    @Override // k.s1
    public final boolean c() {
        c0 c0VarB;
        switch (this.f2322o) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2323p;
                l lVar = actionMenuItemView.f258p;
                return lVar != null && lVar.c(actionMenuItemView.f256m) && (c0VarB = b()) != null && c0VarB.b();
            default:
                ((k.j) this.f2323p).f2547i.n();
                return true;
        }
    }

    @Override // k.s1
    public boolean d() {
        switch (this.f2322o) {
            case 1:
                androidx.appcompat.widget.b bVar = ((k.j) this.f2323p).f2547i;
                if (bVar.A != null) {
                    return false;
                }
                bVar.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k.j jVar, k.j jVar2) {
        super(jVar2);
        this.f2323p = jVar;
    }
}
