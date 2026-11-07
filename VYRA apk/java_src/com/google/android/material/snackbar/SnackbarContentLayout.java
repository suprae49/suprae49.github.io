package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b2.a;
import co.median.android.eeqadjy.R;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f1556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f1557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1558i;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.L(context, R.attr.motionEasingEmphasizedInterpolator, a.f1048b);
    }

    public final boolean a(int i4, int i5, int i6) {
        boolean z4;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f.getPaddingTop() == i5 && this.f.getPaddingBottom() == i6) {
            return z4;
        }
        TextView textView = this.f;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i5, textView.getPaddingEnd(), i6);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i5, textView.getPaddingRight(), i6);
        return true;
    }

    public Button getActionView() {
        return this.f1556g;
    }

    public Button getCloseView() {
        return this.f1557h;
    }

    public TextView getMessageView() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (TextView) findViewById(R.id.snackbar_text);
        this.f1556g = (Button) findViewById(R.id.snackbar_action);
        this.f1557h = (Button) findViewById(R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f.getLayout();
        boolean z4 = layout != null && layout.getLineCount() > 1;
        if (!z4 || this.f1558i <= 0 || this.f1556g.getMeasuredWidth() <= this.f1558i) {
            if (!z4) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i4, i5);
    }

    public void setMaxInlineActionWidth(int i4) {
        this.f1558i = i4;
    }
}
