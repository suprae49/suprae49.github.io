package x2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import t1.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f4728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextPaint f4729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f4730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f4731j;

    public c(d dVar, Context context, TextPaint textPaint, l lVar) {
        this.f4731j = dVar;
        this.f4728g = context;
        this.f4729h = textPaint;
        this.f4730i = lVar;
    }

    @Override // t1.l
    public final void l(int i4) {
        this.f4730i.l(i4);
    }

    @Override // t1.l
    public final void m(Typeface typeface, boolean z4) {
        this.f4731j.f(this.f4728g, this.f4729h, typeface);
        this.f4730i.m(typeface, z4);
    }
}
