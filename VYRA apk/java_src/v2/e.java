package v2;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.Arrays;
import r2.a0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ProgressBar {
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f4302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4304m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f4305o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f4306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f4307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f4308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f4309s;

    public e(Context context) {
        super(f3.a.b(context, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), null, R.attr.circularProgressIndicatorStyle);
        this.f4301j = -1L;
        this.f4303l = false;
        this.f4304m = 4;
        this.f4305o = new b(this);
        this.f4306p = new c(this, 0);
        this.f4307q = new c(this, 1);
        this.f4308r = new d(this, 0);
        this.f4309s = new d(this, 1);
        Context context2 = getContext();
        l lVar = new l();
        lVar.f4350e = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        a0.a(context2, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = a2.a.f14d;
        a0.b(context2, null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        lVar.f4346a = t2.i.l(context2, typedArrayObtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null) {
            int i4 = typedValuePeekValue.type;
            if (i4 == 5) {
                lVar.f4347b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), lVar.f4346a / 2);
                lVar.f4349d = false;
            } else if (i4 == 6) {
                lVar.f4348c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                lVar.f4349d = true;
            }
        }
        lVar.f4351g = typedArrayObtainStyledAttributes.getInt(6, 0);
        lVar.f4352h = typedArrayObtainStyledAttributes.getInt(1, 0);
        lVar.f4353i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0));
        lVar.f4354j = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(16, iAbs));
        lVar.f4355k = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(17, iAbs));
        lVar.f4356l = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        lVar.f4357m = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        lVar.n = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        lVar.f4358o = typedArrayObtainStyledAttributes.getFloat(13, 0.1f);
        lVar.f4359p = typedArrayObtainStyledAttributes.getFloat(12, 0.9f);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            Integer numU = e4.a.u(context2, R.attr.colorPrimary);
            lVar.f4350e = new int[]{numU != null ? numU.intValue() : -1};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            lVar.f4350e = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            lVar.f4350e = intArray;
            if (intArray.length == 0) {
                androidx.fragment.app.q.q("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            lVar.f = typedArrayObtainStyledAttributes.getColor(8, -1);
        } else {
            lVar.f = lVar.f4350e[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            lVar.f = e4.a.k(lVar.f, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        a0.a(context2, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr2 = a2.a.f18i;
        a0.b(context2, null, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(null, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        lVar.f4360q = typedArrayObtainStyledAttributes3.getInt(0, 0);
        lVar.f4361r = Math.max(t2.i.l(context2, typedArrayObtainStyledAttributes3, 4, dimensionPixelSize2), lVar.f4346a * 2);
        lVar.f4362s = t2.i.l(context2, typedArrayObtainStyledAttributes3, 3, dimensionPixelSize3);
        lVar.f4363t = typedArrayObtainStyledAttributes3.getInt(2, 0);
        lVar.f4364u = typedArrayObtainStyledAttributes3.getBoolean(1, true);
        typedArrayObtainStyledAttributes3.recycle();
        lVar.b();
        this.f = lVar;
        a0.a(context2, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        a0.b(context2, null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(7, -1);
        this.f4300i = Math.min(typedArrayObtainStyledAttributes4.getInt(5, -1), 1000);
        typedArrayObtainStyledAttributes4.recycle();
        this.f4302k = new a();
        this.f4299h = true;
    }

    private r getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f4400s;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f4365s;
    }

    public final void a(int i4) {
        if (!isIndeterminate()) {
            super.setProgress(i4);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f4298g = i4;
            this.f4303l = true;
            if (getIndeterminateDrawable().isVisible()) {
                a aVar = this.f4302k;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f4401t.l();
                    return;
                }
            }
            this.f4308r.a(getIndeterminateDrawable());
        }
    }

    public final boolean b() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f.f4352h;
    }

    @Override // android.widget.ProgressBar
    public s getIndeterminateDrawable() {
        return (s) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f.f4350e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f.f4353i;
    }

    @Override // android.widget.ProgressBar
    public m getProgressDrawable() {
        return (m) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f.f4351g;
    }

    public int getTrackColor() {
        return this.f.f;
    }

    public int getTrackCornerRadius() {
        return this.f.f4347b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f.f4348c;
    }

    public int getTrackThickness() {
        return this.f.f4346a;
    }

    public int getWaveAmplitude() {
        return this.f.f4356l;
    }

    public int getWaveSpeed() {
        return this.f.f4357m;
    }

    public int getWavelengthDeterminate() {
        return this.f.f4354j;
    }

    public int getWavelengthIndeterminate() {
        return this.f.f4355k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f4401t.k(this.f4308r);
        }
        m progressDrawable = getProgressDrawable();
        d dVar = this.f4309s;
        if (progressDrawable != null) {
            m progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f4381l == null) {
                progressDrawable2.f4381l = new ArrayList();
            }
            if (!progressDrawable2.f4381l.contains(dVar)) {
                progressDrawable2.f4381l.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            s indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f4381l == null) {
                indeterminateDrawable.f4381l = new ArrayList();
            }
            if (!indeterminateDrawable.f4381l.contains(dVar)) {
                indeterminateDrawable.f4381l.add(dVar);
            }
        }
        if (b()) {
            if (this.f4300i > 0) {
                this.f4301j = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f4307q);
        removeCallbacks(this.f4306p);
        ((o) getCurrentDrawable()).d(false, false, false);
        s indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.f4309s;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(dVar);
            getIndeterminateDrawable().f4401t.o();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        getCurrentDrawingDelegate().a();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i4, int i5) {
        try {
            r currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(((f) currentDrawingDelegate).g() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i4) : ((f) currentDrawingDelegate).g() + getPaddingLeft() + getPaddingRight(), ((f) currentDrawingDelegate).g() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i5) : ((f) currentDrawingDelegate).g() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        boolean z4 = i4 == 0;
        if (this.f4299h) {
            ((o) getCurrentDrawable()).d(b(), false, z4);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        if (this.f4299h) {
            ((o) getCurrentDrawable()).d(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.f4302k = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f4377h = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f4377h = aVar;
        }
    }

    public void setHideAfterMaxProgress(boolean z4) {
        if (getProgressDrawable() == null) {
            return;
        }
        b bVar = this.f4305o;
        if (z4) {
            ArrayList arrayList = getProgressDrawable().f4366t.f4841i;
            if (arrayList.contains(bVar)) {
                return;
            }
            arrayList.add(bVar);
            return;
        }
        ArrayList arrayList2 = getProgressDrawable().f4366t.f4841i;
        int iIndexOf = arrayList2.indexOf(bVar);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
        }
    }

    public void setHideAnimationBehavior(int i4) {
        this.f.f4352h = i4;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z4) {
        try {
            if (z4 == isIndeterminate()) {
                return;
            }
            o oVar = (o) getCurrentDrawable();
            if (oVar != null) {
                oVar.d(false, false, false);
            }
            super.setIndeterminate(z4);
            o oVar2 = (o) getCurrentDrawable();
            if (oVar2 != null) {
                oVar2.d(b(), false, false);
            }
            if ((oVar2 instanceof s) && b()) {
                ((s) oVar2).f4401t.n();
            }
            this.f4303l = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        l lVar = this.f;
        if (lVar.n != f) {
            lVar.n = f;
            getIndeterminateDrawable().f4401t.i();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof s) {
            ((o) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.n) {
            androidx.fragment.app.q.q("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            Integer numU = e4.a.u(getContext(), R.attr.colorPrimary);
            iArr = new int[]{numU != null ? numU.intValue() : -1};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f.f4350e = iArr;
        getIndeterminateDrawable().f4401t.i();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i4) {
        l lVar = this.f;
        if (lVar.f4353i != i4) {
            lVar.f4353i = i4;
            lVar.b();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i4) {
        if (isIndeterminate()) {
            return;
        }
        a(i4);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof m) {
            m mVar = (m) drawable;
            mVar.d(false, false, false);
            super.setProgressDrawable(mVar);
            mVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.n) {
            androidx.fragment.app.q.q("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i4) {
        this.f.f4351g = i4;
        invalidate();
    }

    public void setTrackColor(int i4) {
        l lVar = this.f;
        if (lVar.f != i4) {
            lVar.f = i4;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i4) {
        l lVar = this.f;
        if (lVar.f4347b != i4) {
            lVar.f4347b = Math.min(i4, lVar.f4346a / 2);
            lVar.f4349d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        l lVar = this.f;
        if (lVar.f4348c != f) {
            lVar.f4348c = Math.min(f, 0.5f);
            lVar.f4349d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i4) {
        l lVar = this.f;
        if (lVar.f4346a != i4) {
            lVar.f4346a = i4;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i4) {
        if (i4 == 0 || i4 == 4 || i4 == 8) {
            this.f4304m = i4;
        } else {
            androidx.fragment.app.q.q("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i4) {
        l lVar = this.f;
        if (lVar.f4356l != i4) {
            lVar.f4356l = Math.abs(i4);
            requestLayout();
        }
    }

    public void setWaveAmplitudeRampProgressMax(float f) {
        m progressDrawable = getProgressDrawable();
        progressDrawable.f4376g.f4359p = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveAmplitudeRampProgressMin(float f) {
        m progressDrawable = getProgressDrawable();
        progressDrawable.f4376g.f4358o = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveSpeed(int i4) {
        l lVar = this.f;
        lVar.f4357m = i4;
        m progressDrawable = getProgressDrawable();
        boolean z4 = lVar.f4357m != 0;
        ValueAnimator valueAnimator = progressDrawable.f4370x;
        if (z4 && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z4 || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i4) {
        setWavelengthDeterminate(i4);
        setWavelengthIndeterminate(i4);
    }

    public void setWavelengthDeterminate(int i4) {
        l lVar = this.f;
        if (lVar.f4354j != i4) {
            lVar.f4354j = Math.abs(i4);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i4) {
        l lVar = this.f;
        if (lVar.f4355k != i4) {
            lVar.f4355k = Math.abs(i4);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}
