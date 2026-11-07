package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.datepicker.i;
import k.y;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends y implements Checkable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f1506m = {R.attr.state_checked};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r2.a f1510l;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f1511h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1511h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f1511h ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, co.median.android.eeqadjy.R.attr.imageButtonStyle);
        this.f1508j = true;
        this.f1509k = true;
        p0.m(this, new i(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1507i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        return this.f1507i ? View.mergeDrawableStates(super.onCreateDrawableState(i4 + 1), f1506m) : super.onCreateDrawableState(i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f1510l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f);
        setChecked(savedState.f1511h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1511h = this.f1507i;
        return savedState;
    }

    public void setCheckable(boolean z4) {
        if (this.f1508j != z4) {
            this.f1508j = z4;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (!this.f1508j || this.f1507i == z4) {
            return;
        }
        this.f1507i = z4;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z4) {
        r2.a aVar;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z4);
        if (zIsFocusable == z4 || (aVar = this.f1510l) == null) {
            return;
        }
        aVar.b();
    }

    public void setOnFocusableChangedListener(r2.a aVar) {
        this.f1510l = aVar;
    }

    public void setPressable(boolean z4) {
        this.f1509k = z4;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        if (this.f1509k) {
            super.setPressed(z4);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1507i);
    }
}
