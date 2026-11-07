package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.q;
import java.lang.ref.WeakReference;
import k.n3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LayoutInflater f404i;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.C, 0, 0);
        this.f402g = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            q.j("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.f == 0) {
            q.q("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f404i;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f, viewGroup, false);
        int i4 = this.f402g;
        if (i4 != -1) {
            viewInflate.setId(i4);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f403h = new WeakReference(viewInflate);
        return viewInflate;
    }

    public int getInflatedId() {
        return this.f402g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f404i;
    }

    public int getLayoutResource() {
        return this.f;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f402g = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f404i = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f = i4;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference weakReference = this.f403h;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i4);
                return;
            } else {
                q.j("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(n3 n3Var) {
    }
}
