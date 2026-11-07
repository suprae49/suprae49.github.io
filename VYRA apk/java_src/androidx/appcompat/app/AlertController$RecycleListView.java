package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import d.a;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f255g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1649u);
        this.f255g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
