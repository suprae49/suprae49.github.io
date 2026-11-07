package y3;

import androidx.fragment.app.q;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import q3.p;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p {
    public final /* synthetic */ List f;

    public /* synthetic */ i(List list) {
        this.f = list;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @Override // q3.p
    public final Object f(Object obj, Object obj2) {
        Object next;
        g3.b bVar;
        String str;
        Object next2;
        String str2;
        CharSequence charSequence = (CharSequence) obj;
        int iIntValue = ((Integer) obj2).intValue();
        charSequence.getClass();
        List list = this.f;
        if (list.size() == 1) {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                q.q("List has more than one element.");
                return null;
            }
            String str3 = (String) list.get(0);
            int iV = j.v(charSequence, str3, iIntValue, 4);
            if (iV < 0) {
                bVar = null;
            } else {
                bVar = new g3.b(Integer.valueOf(iV), str3);
            }
        } else {
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            boolean z4 = charSequence instanceof String;
            int i4 = new v3.b(iIntValue, charSequence.length(), 1).f4407g;
            if (z4) {
                if (iIntValue > i4) {
                    bVar = null;
                } else {
                    while (true) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            str2 = (String) next2;
                        } while (!str2.regionMatches(0, (String) charSequence, iIntValue, str2.length()));
                        String str4 = (String) next2;
                        if (str4 == null) {
                            if (iIntValue == i4) {
                                break;
                            }
                            iIntValue++;
                        } else {
                            bVar = new g3.b(Integer.valueOf(iIntValue), str4);
                        }
                    }
                    bVar = null;
                }
            } else if (iIntValue > i4) {
                bVar = null;
            } else {
                while (true) {
                    Iterator it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        str = (String) next;
                    } while (!j.x(str, charSequence, iIntValue, str.length(), false));
                    String str5 = (String) next;
                    if (str5 != null) {
                        bVar = new g3.b(Integer.valueOf(iIntValue), str5);
                        break;
                    }
                    if (iIntValue != i4) {
                        iIntValue++;
                    } else {
                        bVar = null;
                    }
                }
            }
        }
        if (bVar != null) {
            return new g3.b(bVar.f, Integer.valueOf(((String) bVar.f2150g).length()));
        }
        return null;
    }
}
