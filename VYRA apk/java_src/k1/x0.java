package k1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List f2944t = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f2946b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2953j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f2960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b0 f2961s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2947c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2948d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2949e = -1;
    public int f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2950g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x0 f2951h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x0 f2952i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f2954k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f2955l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2956m = 0;
    public v1.b n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2957o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2958p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2959q = -1;

    public x0(View view) {
        if (view != null) {
            this.f2945a = view;
        } else {
            androidx.fragment.app.q.q("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i4) {
        this.f2953j = i4 | this.f2953j;
    }

    public final int b() {
        int i4 = this.f2950g;
        return i4 == -1 ? this.f2947c : i4;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2953j & 1024) != 0 || (arrayList = this.f2954k) == null || arrayList.size() == 0) ? f2944t : this.f2955l;
    }

    public final boolean d() {
        View view = this.f2945a;
        return (view.getParent() == null || view.getParent() == this.f2960r) ? false : true;
    }

    public final boolean e() {
        return (this.f2953j & 1) != 0;
    }

    public final boolean f() {
        return (this.f2953j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f2953j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = p0.p0.f3233a;
        return !this.f2945a.hasTransientState();
    }

    public final boolean h() {
        return (this.f2953j & 8) != 0;
    }

    public final boolean i() {
        return this.n != null;
    }

    public final boolean j() {
        return (this.f2953j & 256) != 0;
    }

    public final boolean k() {
        return (this.f2953j & 2) != 0;
    }

    public final void l(int i4, boolean z4) {
        if (this.f2948d == -1) {
            this.f2948d = this.f2947c;
        }
        if (this.f2950g == -1) {
            this.f2950g = this.f2947c;
        }
        if (z4) {
            this.f2950g += i4;
        }
        this.f2947c += i4;
        View view = this.f2945a;
        if (view.getLayoutParams() != null) {
            ((m0) view.getLayoutParams()).f2853c = true;
        }
    }

    public final void m() {
        this.f2953j = 0;
        this.f2947c = -1;
        this.f2948d = -1;
        this.f2949e = -1L;
        this.f2950g = -1;
        this.f2956m = 0;
        this.f2951h = null;
        this.f2952i = null;
        ArrayList arrayList = this.f2954k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2953j &= -1025;
        this.f2958p = 0;
        this.f2959q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z4) {
        int i4 = this.f2956m;
        int i5 = z4 ? i4 - 1 : i4 + 1;
        this.f2956m = i5;
        if (i5 < 0) {
            this.f2956m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z4 && i5 == 1) {
            this.f2953j |= 16;
        } else if (z4 && i5 == 0) {
            this.f2953j &= -17;
        }
    }

    public final boolean o() {
        return (this.f2953j & 128) != 0;
    }

    public final boolean p() {
        return (this.f2953j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2947c + " id=" + this.f2949e + ", oldPos=" + this.f2948d + ", pLpos:" + this.f2950g);
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f2957o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f2953j & 2) != 0) {
            sb.append(" update");
        }
        if (h()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (j()) {
            sb.append(" tmpDetached");
        }
        if (!g()) {
            sb.append(" not recyclable(" + this.f2956m + ")");
        }
        if ((this.f2953j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2945a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
