package com.google.android.gms.common.internal;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;
import android.view.View;
import android.window.SplashScreenView;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Font.Builder g(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder k(ClipData clipData, int i4) {
        return new ContentInfo.Builder(clipData, i4);
    }

    public static /* bridge */ /* synthetic */ ContentInfo m(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView r(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ boolean y(View view) {
        return view instanceof SplashScreenView;
    }
}
