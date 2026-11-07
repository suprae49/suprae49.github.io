package b;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.a f986d;

    public /* synthetic */ g(h hVar, String str, c.a aVar, int i4) {
        this.f983a = i4;
        this.f984b = hVar;
        this.f985c = str;
        this.f986d = aVar;
    }

    @Override // b.c
    public final void a(Object obj) {
        switch (this.f983a) {
            case 0:
                h hVar = this.f984b;
                ArrayList arrayList = hVar.f990d;
                LinkedHashMap linkedHashMap = hVar.f988b;
                String str = this.f985c;
                Object obj2 = linkedHashMap.get(str);
                c.a aVar = this.f986d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    hVar.b(iIntValue, aVar, obj);
                    return;
                } catch (Exception e5) {
                    arrayList.remove(str);
                    throw e5;
                }
            default:
                h hVar2 = this.f984b;
                ArrayList arrayList2 = hVar2.f990d;
                LinkedHashMap linkedHashMap2 = hVar2.f988b;
                String str2 = this.f985c;
                Object obj3 = linkedHashMap2.get(str2);
                c.a aVar2 = this.f986d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    hVar2.b(iIntValue2, aVar2, obj);
                    return;
                } catch (Exception e6) {
                    arrayList2.remove(str2);
                    throw e6;
                }
        }
    }

    public void b() {
        this.f984b.f(this.f985c);
    }
}
