package k;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements o0, DialogInterface.OnClickListener {
    public e.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f2559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f2560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.c f2561i;

    public k0(androidx.appcompat.widget.c cVar) {
        this.f2561i = cVar;
    }

    @Override // k.o0
    public final int a() {
        return 0;
    }

    @Override // k.o0
    public final boolean b() {
        e.g gVar = this.f;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override // k.o0
    public final Drawable d() {
        return null;
    }

    @Override // k.o0
    public final void dismiss() {
        e.g gVar = this.f;
        if (gVar != null) {
            gVar.dismiss();
            this.f = null;
        }
    }

    @Override // k.o0
    public final void e(CharSequence charSequence) {
        this.f2560h = charSequence;
    }

    @Override // k.o0
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // k.o0
    public final void i(int i4) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // k.o0
    public final void j(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // k.o0
    public final void l(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // k.o0
    public final void m(int i4, int i5) {
        if (this.f2559g == null) {
            return;
        }
        androidx.appcompat.widget.c cVar = this.f2561i;
        e.f fVar = new e.f(cVar.getPopupContext());
        e.b bVar = (e.b) fVar.f1920g;
        CharSequence charSequence = this.f2560h;
        if (charSequence != null) {
            bVar.f1844d = charSequence;
        }
        l0 l0Var = this.f2559g;
        int selectedItemPosition = cVar.getSelectedItemPosition();
        bVar.n = l0Var;
        bVar.f1853o = this;
        bVar.f1856r = selectedItemPosition;
        bVar.f1855q = true;
        e.g gVarA = fVar.a();
        this.f = gVarA;
        AlertController$RecycleListView alertController$RecycleListView = gVarA.f1926k.f;
        alertController$RecycleListView.setTextDirection(i4);
        alertController$RecycleListView.setTextAlignment(i5);
        this.f.show();
    }

    @Override // k.o0
    public final int n() {
        return 0;
    }

    @Override // k.o0
    public final CharSequence o() {
        return this.f2560h;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        androidx.appcompat.widget.c cVar = this.f2561i;
        cVar.setSelection(i4);
        if (cVar.getOnItemClickListener() != null) {
            cVar.performItemClick(null, i4, this.f2559g.getItemId(i4));
        }
        dismiss();
    }

    @Override // k.o0
    public final void p(ListAdapter listAdapter) {
        this.f2559g = (l0) listAdapter;
    }
}
