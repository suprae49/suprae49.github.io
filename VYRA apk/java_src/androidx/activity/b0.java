package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends r3.h implements q3.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0 f184h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(j0 j0Var, int i4) {
        super(1);
        this.f183g = i4;
        this.f184h = j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 java.lang.Object, still in use, count: 2, list:
          (r1v5 java.lang.Object) from 0x0052: PHI (r1 I:??) = (r1v2 java.lang.Object), (r1v5 java.lang.Object) binds: [B:22:0x0051, B:32:0x0052] A[DONT_GENERATE, DONT_INLINE]
          (r1v5 java.lang.Object) from 0x004a: CHECK_CAST (androidx.fragment.app.m0) (r1v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // q3.l
    public final java.lang.Object g(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f183g
            switch(r0) {
                case 0: goto L30;
                default: goto L5;
            }
        L5:
            androidx.activity.b r4 = (androidx.activity.b) r4
            r4.getClass()
            androidx.activity.j0 r4 = r3.f184h
            androidx.fragment.app.m0 r0 = r4.f209c
            if (r0 != 0) goto L2d
            h3.c r4 = r4.f208b
            int r0 = r4.f2176h
            java.util.ListIterator r4 = r4.listIterator(r0)
        L18:
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r4.previous()
            r1 = r0
            androidx.fragment.app.m0 r1 = (androidx.fragment.app.m0) r1
            boolean r1 = r1.f724a
            if (r1 == 0) goto L18
            goto L2b
        L2a:
            r0 = 0
        L2b:
            androidx.fragment.app.m0 r0 = (androidx.fragment.app.m0) r0
        L2d:
            g3.g r4 = g3.g.f2156a
            return r4
        L30:
            androidx.activity.b r4 = (androidx.activity.b) r4
            r4.getClass()
            androidx.activity.j0 r4 = r3.f184h
            h3.c r0 = r4.f208b
            int r1 = r0.f2176h
            java.util.ListIterator r0 = r0.listIterator(r1)
        L3f:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.fragment.app.m0 r2 = (androidx.fragment.app.m0) r2
            boolean r2 = r2.f724a
            if (r2 == 0) goto L3f
            goto L52
        L51:
            r1 = 0
        L52:
            androidx.fragment.app.m0 r1 = (androidx.fragment.app.m0) r1
            androidx.fragment.app.m0 r0 = r4.f209c
            if (r0 == 0) goto L5b
            r4.c()
        L5b:
            r4.f209c = r1
            g3.g r4 = g3.g.f2156a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.b0.g(java.lang.Object):java.lang.Object");
    }
}
