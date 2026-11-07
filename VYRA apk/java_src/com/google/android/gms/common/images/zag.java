package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i4) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i4;
    }

    public abstract void zaa(Drawable drawable, boolean z4, boolean z5, boolean z6);

    public final void zab(Context context, zam zamVar, boolean z4) {
        int i4 = this.zab;
        zaa(i4 != 0 ? context.getResources().getDrawable(i4) : null, z4, false, false);
    }

    public final void zac(Context context, Bitmap bitmap, boolean z4) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
