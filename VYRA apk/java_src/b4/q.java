package b4;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements q3.p {
    public final /* synthetic */ int f;

    public /* synthetic */ q(int i4) {
        this.f = i4;
    }

    @Override // q3.p
    public final Object f(Object obj, Object obj2) {
        i3.b bVar;
        switch (this.f) {
            case 0:
                return obj;
            case 1:
                if (obj == null) {
                    return null;
                }
                androidx.fragment.app.q.c();
                return null;
            case 2:
                return (s) obj;
            case 3:
                String str = (String) obj;
                i3.e eVar = (i3.e) obj2;
                str.getClass();
                if (str.length() == 0) {
                    return eVar.toString();
                }
                return str + ", " + eVar;
            case 4:
                i3.g gVar = (i3.g) obj;
                i3.e eVar2 = (i3.e) obj2;
                gVar.getClass();
                i3.g gVarF = gVar.f(eVar2.getKey());
                i3.h hVar = i3.h.f;
                if (gVarF == hVar) {
                    return eVar2;
                }
                i3.d dVar = i3.d.f;
                z3.h hVar2 = (z3.h) gVarF.a(dVar);
                if (hVar2 == null) {
                    bVar = new i3.b(eVar2, gVarF);
                } else {
                    i3.g gVarF2 = gVarF.f(dVar);
                    if (gVarF2 == hVar) {
                        return new i3.b(hVar2, eVar2);
                    }
                    bVar = new i3.b(hVar2, new i3.b(eVar2, gVarF2));
                }
                return bVar;
            case 5:
                return ((i3.g) obj).b((i3.e) obj2);
            case 6:
                return ((i3.g) obj).b((i3.e) obj2);
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
        }
    }
}
