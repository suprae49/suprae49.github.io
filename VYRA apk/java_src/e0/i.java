package e0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f2026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f2027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2028c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f2026a = colorStateList;
        this.f2027b = configuration;
        this.f2028c = theme == null ? 0 : theme.hashCode();
    }
}
