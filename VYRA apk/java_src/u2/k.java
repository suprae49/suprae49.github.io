package u2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends FrameLayout implements i {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j.o f4223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f4224j;

    public k(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    public final void a() {
        j.o oVar = this.f4223i;
        if (oVar != null) {
            setVisibility((!oVar.isVisible() || (!this.f4221g && this.f4222h)) ? 8 : 0);
        }
    }

    @Override // j.z
    public final void b(j.o oVar) {
        this.f4223i = oVar;
        oVar.setCheckable(false);
        this.f.setText(oVar.f2412e);
        a();
    }

    @Override // j.z
    public j.o getItemData() {
        return this.f4223i;
    }

    @Override // u2.i
    public void setExpanded(boolean z4) {
        this.f4221g = z4;
        a();
    }

    @Override // u2.i
    public void setOnlyShowWhenExpanded(boolean z4) {
        this.f4222h = z4;
        a();
    }

    public void setTextAppearance(int i4) {
        TextView textView = this.f;
        textView.setTextAppearance(i4);
        ColorStateList colorStateList = this.f4224j;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f4224j = colorStateList;
        if (colorStateList != null) {
            this.f.setTextColor(colorStateList);
        }
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
