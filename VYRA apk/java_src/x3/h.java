package x3;

import h3.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends i {
    public static List t(g gVar) {
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return m.f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            List listSingletonList = Collections.singletonList(next);
            listSingletonList.getClass();
            return listSingletonList;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
