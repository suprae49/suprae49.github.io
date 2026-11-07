package l0;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f3000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3004e;
    public final int f;

    public i(String str, String str2) {
        this.f3000a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f3001b = 0;
        this.f3002c = 400;
        this.f3003d = false;
        this.f3004e = str2;
        this.f = 0;
    }

    public i(Uri uri, int i4, int i5, boolean z4, String str, int i6) {
        uri.getClass();
        this.f3000a = uri;
        this.f3001b = i4;
        this.f3002c = i5;
        this.f3003d = z4;
        this.f3004e = str;
        this.f = i6;
    }
}
