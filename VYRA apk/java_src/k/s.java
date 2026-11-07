package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f2626a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f2627b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2628c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2629d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2630e;
    public final TextView f;

    public /* synthetic */ s(TextView textView) {
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f2628c || this.f2629d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f2628c) {
                    drawableMutate.setTintList(this.f2626a);
                }
                if (this.f2629d) {
                    drawableMutate.setTintMode(this.f2627b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        r rVar = (r) this.f;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2628c || this.f2629d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f2628c) {
                    drawableMutate.setTintList(this.f2626a);
                }
                if (this.f2629d) {
                    drawableMutate.setTintMode(this.f2627b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(rVar.getDrawableState());
                }
                rVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i4) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = d.a.f1642m;
        androidx.emoji2.text.t tVarS = androidx.emoji2.text.t.s(i4, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        p0.p0.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) tVarS.f579c, i4);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(u1.h0.w(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(u1.h0.w(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(u1.h0.w(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(tVarS.h(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(j1.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            tVarS.v();
        }
    }
}
