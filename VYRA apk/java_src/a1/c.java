package a1;

import a3.f;
import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10d;

    public c() {
        if (f.f51g == null) {
            f.f51g = new f(1);
        }
    }

    public int a(int i4) {
        if (i4 < this.f9c) {
            return ((ByteBuffer) this.f10d).getShort(this.f8b + i4);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        p0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f8b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f8b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f7a);
            if (!((Class) this.f10d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = p0.d(view);
            if (accessibilityDelegateD == null) {
                bVar = null;
            } else {
                bVar = accessibilityDelegateD instanceof p0.a ? ((p0.a) accessibilityDelegateD).f3160a : new p0.b(accessibilityDelegateD);
            }
            if (bVar == null) {
                bVar = new p0.b();
            }
            p0.m(view, bVar);
            view.setTag(this.f7a, obj);
            p0.h(view, this.f9c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
