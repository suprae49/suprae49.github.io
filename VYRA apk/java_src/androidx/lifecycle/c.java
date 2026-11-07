package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f815b;

    public c(int i4, Method method) {
        this.f814a = i4;
        this.f815b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f814a == cVar.f814a && this.f815b.getName().equals(cVar.f815b.getName());
    }

    public final int hashCode() {
        return this.f815b.getName().hashCode() + (this.f814a * 31);
    }
}
