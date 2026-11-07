package w1;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends RelativeLayout {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4481j;

    public j(Context context, Drawable drawable, Drawable drawable2, String str, int i4, int i5) {
        super(context, null, 0);
        View.inflate(getContext(), R.layout.view_handle, this);
        View viewFindViewById = findViewById(R.id.icon);
        viewFindViewById.getClass();
        ImageView imageView = (ImageView) viewFindViewById;
        this.f = imageView;
        View viewFindViewById2 = findViewById(R.id.text);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f4478g = textView;
        this.f4479h = Integer.MIN_VALUE;
        this.f4480i = -1;
        this.f4481j = -1;
        setBackground(drawable);
        imageView.setImageDrawable(drawable2);
        setText(str);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = 0;
        textView.setLayoutParams(layoutParams);
        this.f4480i = i4;
        this.f4481j = i5;
        imageView.setColorFilter(i4);
    }

    public final void a() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f4480i), Integer.valueOf(this.f4481j));
        valueAnimatorOfObject.addUpdateListener(new i(this, 0));
        valueAnimatorOfObject.setDuration(100L);
        valueAnimatorOfObject.start();
    }

    public final void b() {
        CharSequence text = this.f4478g.getText();
        text.getClass();
        if (text.length() == 0) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f4479h, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new i(this, 1));
        valueAnimatorOfInt.start();
    }

    public final void c() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f4481j), Integer.valueOf(this.f4480i));
        valueAnimatorOfObject.addUpdateListener(new i(this, 3));
        valueAnimatorOfObject.setDuration(200L);
        valueAnimatorOfObject.start();
    }

    public final void d() {
        TextView textView = this.f4478g;
        CharSequence text = textView.getText();
        text.getClass();
        if (text.length() == 0) {
            return;
        }
        if (textView.getLayoutParams().width != 0) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = 0;
            textView.setLayoutParams(layoutParams);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f4479h);
        valueAnimatorOfInt.addUpdateListener(new i(this, 2));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.start();
    }

    public final int getActiveColor() {
        return this.f4481j;
    }

    public final int getInactiveColor() {
        return this.f4480i;
    }

    public final int getMaxTextWidth() {
        return this.f4479h;
    }

    public final void setActiveColor(int i4) {
        this.f4481j = i4;
    }

    public final void setInactiveColor(int i4) {
        this.f4480i = i4;
    }

    public final void setMaxTextWidth(int i4) {
        this.f4479h = i4;
    }

    public final void setText(String str) {
        TextView textView = this.f4478g;
        textView.getLayoutParams().width = -2;
        textView.setText(str);
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f4479h = textView.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = 0;
        textView.setLayoutParams(layoutParams);
    }
}
