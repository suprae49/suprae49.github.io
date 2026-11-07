package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class y extends ImageButton {
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0.d f2696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a3.a(context);
        this.f2697h = false;
        z2.a(this, getContext());
        o oVar = new o(this);
        this.f = oVar;
        oVar.k(attributeSet, i4);
        e0.d dVar = new e0.d(this);
        this.f2696g = dVar;
        dVar.d(attributeSet, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f;
        if (oVar != null) {
            oVar.a();
        }
        e0.d dVar = this.f2696g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f;
        if (oVar != null) {
            return oVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f;
        if (oVar != null) {
            return oVar.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        b3 b3Var;
        e0.d dVar = this.f2696g;
        if (dVar == null || (b3Var = (b3) dVar.f2015c) == null) {
            return null;
        }
        return b3Var.f2490a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        b3 b3Var;
        e0.d dVar = this.f2696g;
        if (dVar == null || (b3Var = (b3) dVar.f2015c) == null) {
            return null;
        }
        return b3Var.f2491b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2696g.f2014b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f;
        if (oVar != null) {
            oVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        o oVar = this.f;
        if (oVar != null) {
            oVar.n(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        e0.d dVar = this.f2696g;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        e0.d dVar = this.f2696g;
        if (dVar != null && drawable != null && !this.f2697h) {
            dVar.f2013a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f2697h) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f2014b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f2013a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i4) {
        super.setImageLevel(i4);
        this.f2697h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        e0.d dVar = this.f2696g;
        ImageView imageView = (ImageView) dVar.f2014b;
        if (i4 != 0) {
            Drawable drawableW = u1.h0.w(imageView.getContext(), i4);
            if (drawableW != null) {
                j1.a(drawableW);
            }
            imageView.setImageDrawable(drawableW);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        e0.d dVar = this.f2696g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f;
        if (oVar != null) {
            oVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f;
        if (oVar != null) {
            oVar.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        e0.d dVar = this.f2696g;
        if (dVar != null) {
            if (((b3) dVar.f2015c) == null) {
                dVar.f2015c = new b3();
            }
            b3 b3Var = (b3) dVar.f2015c;
            b3Var.f2490a = colorStateList;
            b3Var.f2493d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        e0.d dVar = this.f2696g;
        if (dVar != null) {
            if (((b3) dVar.f2015c) == null) {
                dVar.f2015c = new b3();
            }
            b3 b3Var = (b3) dVar.f2015c;
            b3Var.f2491b = mode;
            b3Var.f2492c = true;
            dVar.a();
        }
    }
}
