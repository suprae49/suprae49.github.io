package o0;

import androidx.fragment.app.q;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f3133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3134b;

    public c(int i4) {
        if (i4 > 0) {
            this.f3133a = new Object[i4];
        } else {
            q.q("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i4 = this.f3134b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object[] objArr = this.f3133a;
        Object obj = objArr[i5];
        obj.getClass();
        objArr[i5] = null;
        this.f3134b--;
        return obj;
    }

    public void b(s.b bVar) {
        int i4 = this.f3134b;
        Object[] objArr = this.f3133a;
        if (i4 < objArr.length) {
            objArr[i4] = bVar;
            this.f3134b = i4 + 1;
        }
    }

    public boolean c(Object obj) {
        obj.getClass();
        int i4 = this.f3134b;
        int i5 = 0;
        while (true) {
            Object[] objArr = this.f3133a;
            if (i5 >= i4) {
                int i6 = this.f3134b;
                if (i6 >= objArr.length) {
                    return false;
                }
                objArr[i6] = obj;
                this.f3134b = i6 + 1;
                return true;
            }
            if (objArr[i5] == obj) {
                q.j("Already in the pool!");
                return false;
            }
            i5++;
        }
    }

    public c() {
        this.f3133a = new Object[256];
    }
}
