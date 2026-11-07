package v2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q1.b f4295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4297c;

    public /* synthetic */ d(View view, int i4) {
        this.f4296b = i4;
        this.f4297c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.f4296b) {
            case 0:
                e eVar = (e) this.f4297c;
                eVar.setIndeterminate(false);
                eVar.a(eVar.f4298g);
                break;
            case 1:
                e eVar2 = (e) this.f4297c;
                if (!eVar2.f4303l) {
                    eVar2.setVisibility(eVar2.f4304m);
                }
                break;
            default:
                ColorStateList colorStateList = ((com.google.android.material.checkbox.b) this.f4297c).f1378t;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.f4296b) {
            case 2:
                com.google.android.material.checkbox.b bVar = (com.google.android.material.checkbox.b) this.f4297c;
                ColorStateList colorStateList = bVar.f1378t;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(bVar.f1382x, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
