package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import d.a;
import j.b;
import j.c;
import j.l;
import j.m;
import j.o;
import j.z;
import k.k;
import k.l3;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends y0 implements z, View.OnClickListener, k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f256m;
    public CharSequence n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f262t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f263u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f264v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f265w;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f261s = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1633c, 0, 0);
        this.f263u = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f265w = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f264v = -1;
        setSaveEnabled(false);
    }

    @Override // k.k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // j.z
    public final void b(o oVar) {
        this.f256m = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f2408a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f259q == null) {
            this.f259q = new b(this);
        }
    }

    @Override // k.k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f256m.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i4 < 480) {
            return (i4 >= 640 && i5 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // j.z
    public o getItemData() {
        return this.f256m;
    }

    public final void h() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.n);
        if (this.f257o != null && ((this.f256m.f2430y & 4) != 4 || (!this.f261s && !this.f262t))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.n : null);
        CharSequence charSequence = this.f256m.f2422q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f256m.f2412e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f256m.f2423r;
        if (TextUtils.isEmpty(charSequence2)) {
            l3.a(this, z6 ? null : this.f256m.f2412e);
        } else {
            l3.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f258p;
        if (lVar != null) {
            lVar.c(this.f256m);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f261s = g();
        h();
    }

    @Override // k.y0, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i6 = this.f264v) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f263u;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i5);
        }
        if (!zIsEmpty || this.f257o == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f257o.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f256m.hasSubMenu() && (bVar = this.f259q) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f262t != z4) {
            this.f262t = z4;
            o oVar = this.f256m;
            if (oVar != null) {
                m mVar = oVar.n;
                mVar.f2393k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f257o = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f265w;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(l lVar) {
        this.f258p = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i5, int i6, int i7) {
        this.f264v = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(c cVar) {
        this.f260r = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.n = charSequence;
        h();
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }
}
