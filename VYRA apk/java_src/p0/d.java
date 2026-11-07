package p0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c, e {
    public final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ClipData f3179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f3182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bundle f3183k;

    public d(d dVar) {
        ClipData clipData = dVar.f3179g;
        clipData.getClass();
        this.f3179g = clipData;
        int i4 = dVar.f3180h;
        if (i4 < 0) {
            Locale locale = Locale.US;
            androidx.fragment.app.q.q("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i4 > 5) {
            Locale locale2 = Locale.US;
            androidx.fragment.app.q.q("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.f3180h = i4;
        int i5 = dVar.f3181i;
        if ((i5 & 1) == i5) {
            this.f3181i = i5;
            this.f3182j = dVar.f3182j;
            this.f3183k = dVar.f3183k;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i5) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // p0.e
    public ClipData b() {
        return this.f3179g;
    }

    @Override // p0.c
    public f build() {
        return new f(new d(this));
    }

    @Override // p0.e
    public int m() {
        return this.f3181i;
    }

    @Override // p0.e
    public ContentInfo o() {
        return null;
    }

    @Override // p0.c
    public void r(Uri uri) {
        this.f3182j = uri;
    }

    @Override // p0.e
    public int s() {
        return this.f3180h;
    }

    @Override // p0.c
    public void setExtras(Bundle bundle) {
        this.f3183k = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f) {
            case 1:
                Uri uri = this.f3182j;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f3179g.getDescription());
                sb.append(", source=");
                int i4 = this.f3180h;
                if (i4 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i4 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i4 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i4 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i4 != 4) {
                    strValueOf = i4 != 5 ? String.valueOf(i4) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i5 = this.f3181i;
                sb.append((i5 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i5));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(this.f3183k != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p0.c
    public void v(int i4) {
        this.f3181i = i4;
    }

    public /* synthetic */ d() {
    }
}
