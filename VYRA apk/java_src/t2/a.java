package t2;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathInterpolator f3722a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3726e;
    public androidx.activity.b f;

    public a(View view) {
        this.f3723b = view;
        Context context = view.getContext();
        this.f3724c = i.K(context, R.attr.motionDurationMedium2, 300);
        this.f3725d = i.K(context, R.attr.motionDurationShort3, 150);
        this.f3726e = i.K(context, R.attr.motionDurationShort2, 100);
    }
}
