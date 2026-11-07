package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z implements k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f2547i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.widget.b bVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f2547i = bVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        l3.a(this, getContentDescription());
        setOnTouchListener(new j.b(this, this));
    }

    @Override // k.k
    public final boolean a() {
        return false;
    }

    @Override // k.k
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2547i.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i4, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i4, i5, i6, i7);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
