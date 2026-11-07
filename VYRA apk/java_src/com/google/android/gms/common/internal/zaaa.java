package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import com.google.android.gms.common.util.DeviceProperties;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i4, int i5, int i6, int i7) {
        if (i4 == 0) {
            return i5;
        }
        if (i4 == 1) {
            return i6;
        }
        if (i4 == 2) {
            return i7;
        }
        q.j(u.k(i4, "Unknown color scheme: "));
        return 0;
    }

    public final void zaa(Resources resources, int i4, int i5) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i6 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i6);
        setMinWidth(i6);
        int i7 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i8 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int iZab = zab(i5, i7, i8, i8);
        int i9 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i10 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int iZab2 = zab(i5, i9, i10, i10);
        if (i4 == 0 || i4 == 1) {
            iZab = iZab2;
        } else if (i4 != 2) {
            q.j(u.k(i4, "Unknown button size: "));
            return;
        }
        Drawable drawable = resources.getDrawable(iZab);
        drawable.setTintList(resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i11 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i12 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i5, i11, i12, i12))));
        if (i4 == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i4 == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i4 != 2) {
                q.j(u.k(i4, "Unknown button size: "));
                return;
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
