package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f222i;

    public /* synthetic */ m(Object obj, int i4, Object obj2, int i5) {
        this.f = i5;
        this.f220g = obj;
        this.f221h = i4;
        this.f222i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                n nVar = (n) this.f220g;
                Serializable serializable = (Serializable) ((a3.h0) this.f222i).f84g;
                String str = (String) nVar.f987a.get(Integer.valueOf(this.f221h));
                if (str != null) {
                    b.e eVar = (b.e) nVar.f991e.get(str);
                    if ((eVar != null ? eVar.f979a : null) != null) {
                        b.b bVar = eVar.f979a;
                        bVar.getClass();
                        if (nVar.f990d.remove(str)) {
                            bVar.a(serializable);
                        }
                    } else {
                        nVar.f992g.remove(str);
                        nVar.f.put(str, serializable);
                    }
                    break;
                }
                break;
            case 1:
                ((n) this.f220g).a(this.f221h, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f222i));
                break;
            default:
                ((i1.d) ((i1.a) this.f220g).f2235c).p(this.f221h, this.f222i);
                break;
        }
    }
}
