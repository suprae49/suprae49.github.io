package l0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2991e;

    public /* synthetic */ e(String str, Context context, Object obj, int i4, int i5) {
        this.f2987a = i5;
        this.f2988b = str;
        this.f2989c = context;
        this.f2991e = obj;
        this.f2990d = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2987a) {
            case 0:
                Object[] objArr = {(d) this.f2991e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return h.b(this.f2988b, this.f2989c, Collections.unmodifiableList(arrayList), this.f2990d);
            default:
                try {
                    return h.b(this.f2988b, this.f2989c, (ArrayList) this.f2991e, this.f2990d);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
