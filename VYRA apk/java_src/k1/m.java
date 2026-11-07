package k1;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2850a;

    public /* synthetic */ m(int i4) {
        this.f2850a = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return 1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.f2850a
            r1 = 0
            r2 = 1
            r3 = -1
            switch(r0) {
                case 0: goto L39;
                case 1: goto L2c;
                case 2: goto L22;
                default: goto L8;
            }
        L8:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r0 = p0.p0.f3233a
            float r7 = r7.getZ()
            float r8 = r8.getZ()
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r1 = r3
            goto L21
        L1c:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L21
            r1 = r2
        L21:
            return r1
        L22:
            s.f r7 = (s.f) r7
            s.f r8 = (s.f) r8
            int r7 = r7.f3647g
            int r8 = r8.f3647g
        L2a:
            int r7 = r7 - r8
            return r7
        L2c:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r7.getTop()
            int r8 = r8.getTop()
            goto L2a
        L39:
            k1.n r7 = (k1.n) r7
            k1.n r8 = (k1.n) r8
            androidx.recyclerview.widget.RecyclerView r0 = r7.f2858d
            if (r0 != 0) goto L43
            r4 = r2
            goto L44
        L43:
            r4 = r1
        L44:
            androidx.recyclerview.widget.RecyclerView r5 = r8.f2858d
            if (r5 != 0) goto L4a
            r5 = r2
            goto L4b
        L4a:
            r5 = r1
        L4b:
            if (r4 == r5) goto L50
            if (r0 != 0) goto L58
            goto L5a
        L50:
            boolean r0 = r7.f2855a
            boolean r4 = r8.f2855a
            if (r0 == r4) goto L5c
            if (r0 == 0) goto L5a
        L58:
            r1 = r3
            goto L6d
        L5a:
            r1 = r2
            goto L6d
        L5c:
            int r0 = r8.f2856b
            int r2 = r7.f2856b
            int r0 = r0 - r2
            if (r0 == 0) goto L65
            r1 = r0
            goto L6d
        L65:
            int r7 = r7.f2857c
            int r8 = r8.f2857c
            int r7 = r7 - r8
            if (r7 == 0) goto L6d
            r1 = r7
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.m.compare(java.lang.Object, java.lang.Object):int");
    }
}
