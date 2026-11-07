package u1;

import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements q3.l {
    public final /* synthetic */ int f;

    public /* synthetic */ q(int i4) {
        this.f = i4;
    }

    @Override // q3.l
    public final Object g(Object obj) {
        switch (this.f) {
            case 0:
                String str = (String) obj;
                str.getClass();
                String[] strArr = {"[,;\\s]"};
                String str2 = strArr[0];
                if (str2.length() != 0) {
                    int iU = y3.j.u(str, str2, 0, false);
                    if (iU == -1) {
                        List listSingletonList = Collections.singletonList(str.toString());
                        listSingletonList.getClass();
                        return listSingletonList;
                    }
                    ArrayList arrayList = new ArrayList(10);
                    int length = 0;
                    do {
                        arrayList.add(str.subSequence(length, iU).toString());
                        length = str2.length() + iU;
                        iU = y3.j.u(str, str2, length, false);
                    } while (iU != -1);
                    arrayList.add(str.subSequence(length, str.length()).toString());
                    return arrayList;
                }
                List listAsList = Arrays.asList(strArr);
                listAsList.getClass();
                x3.j jVar = new x3.j(new x3.l(str, new y3.i(listAsList)));
                ArrayList arrayList2 = new ArrayList(h3.g.u0(jVar));
                Iterator it = jVar.iterator();
                while (true) {
                    y3.b bVar = (y3.b) it;
                    if (!bVar.hasNext()) {
                        return arrayList2;
                    }
                    v3.b bVar2 = (v3.b) bVar.next();
                    bVar2.getClass();
                    arrayList2.add(str.subSequence(bVar2.f, bVar2.f4407g + 1).toString());
                }
                break;
            case 1:
                String str3 = (String) obj;
                str3.getClass();
                return Boolean.valueOf(y3.j.t(str3, "/") || str3.startsWith("."));
            case 2:
                String str4 = (String) obj;
                str4.getClass();
                return str4.startsWith(".") ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(str4.substring(1)) : str4;
            case 3:
                obj.getClass();
                t3.a aVar = t3.e.f;
                return Integer.valueOf(t3.e.f.a().nextInt(2147418112) + 65536);
            case 4:
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                return iterable.iterator();
            case 5:
                return Boolean.valueOf(obj == null);
            default:
                i3.e eVar = (i3.e) obj;
                if (eVar instanceof z3.h) {
                    return (z3.h) eVar;
                }
                return null;
        }
    }
}
