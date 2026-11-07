package r3;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements w3.a, Serializable {
    public transient w3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f3607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f3608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f3609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f3610k;

    public b(Object obj, Class cls, String str, String str2, boolean z4) {
        this.f3606g = obj;
        this.f3607h = cls;
        this.f3608i = str;
        this.f3609j = str2;
        this.f3610k = z4;
    }

    public final c c() {
        boolean z4 = this.f3610k;
        Class cls = this.f3607h;
        if (z4) {
            l.f3614a.getClass();
            return new i(cls);
        }
        l.f3614a.getClass();
        return new d(cls);
    }
}
