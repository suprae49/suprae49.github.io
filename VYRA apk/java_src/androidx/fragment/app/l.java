package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f716b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f717c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f718d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f719e = false;

    public l(ViewGroup viewGroup) {
        this.f715a = viewGroup;
    }

    public static void a(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i4 = p0.q0.f3238a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                a(childAt, arrayList);
            }
        }
    }

    public static void e(p.f fVar, View view) {
        WeakHashMap weakHashMap = p0.p0.f3233a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            fVar.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    e(fVar, childAt);
                }
            }
        }
    }

    public static l h(ViewGroup viewGroup, p0 p0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof l) {
            return (l) tag;
        }
        p0Var.getClass();
        l lVar = new l(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
        return lVar;
    }

    public static l i(ViewGroup viewGroup, u0 u0Var) {
        return h(viewGroup, u0Var.E());
    }

    public static void k(p.f fVar, Collection collection) {
        Iterator it = ((p.a) fVar.entrySet()).iterator();
        while (true) {
            p.d dVar = (p.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            View view = (View) dVar.getValue();
            WeakHashMap weakHashMap = p0.p0.f3233a;
            if (!collection.contains(view.getTransitionName())) {
                dVar.remove();
            }
        }
    }

    public final void b(int i4, int i5, z0 z0Var) {
        synchronized (this.f716b) {
            try {
                k0.e eVar = new k0.e();
                o1 o1VarF = f(z0Var.f804c);
                if (o1VarF != null) {
                    o1VarF.c(i4, i5);
                    return;
                }
                o1 o1Var = new o1(i4, i5, z0Var, eVar);
                this.f716b.add(o1Var);
                o1Var.f739d.add(new n1(this, o1Var, 0));
                o1Var.f739d.add(new n1(this, o1Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:216:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:220:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:223:0x06de  */
    /* JADX WARN: Code duplicated, block: B:226:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:230:0x0706  */
    /* JADX WARN: Code duplicated, block: B:235:0x072e  */
    /* JADX WARN: Code duplicated, block: B:236:0x0731  */
    /* JADX WARN: Code duplicated, block: B:239:0x0737  */
    /* JADX WARN: Code duplicated, block: B:242:0x0765  */
    /* JADX WARN: Code duplicated, block: B:246:0x079e  */
    /* JADX WARN: Code duplicated, block: B:250:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:255:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:259:0x0805  */
    /* JADX WARN: Code duplicated, block: B:260:0x080c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0827  */
    /* JADX WARN: Code duplicated, block: B:266:0x084e A[LOOP:7: B:265:0x084c->B:266:0x084e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x086b  */
    /* JADX WARN: Code duplicated, block: B:300:0x0729 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x06e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x06fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x06ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x06da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x07ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x07ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x07f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x07d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:230:0x0706, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:242:0x0765, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:250:0x07b6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:255:0x07d8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:262:0x0827, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:269:0x086b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(ArrayList arrayList, boolean z4) {
        int i4;
        ArrayList arrayList2;
        HashMap map;
        String str;
        o1 o1Var;
        int i5;
        ArrayList arrayList3;
        int i6;
        String str2;
        o1 o1Var2;
        Object obj;
        View view;
        View view2;
        View view3;
        int i7;
        ArrayList arrayList4;
        int i8;
        View view4;
        boolean zContainsValue;
        Context context;
        ArrayList arrayList5;
        int size;
        int i9;
        int i10;
        boolean z5;
        int i11;
        ArrayList arrayList6;
        ViewGroup viewGroup;
        int size2;
        int i12;
        int size3;
        int i13;
        i iVar;
        o1 o1Var3;
        Fragment fragment;
        View view5;
        Animation animation;
        i iVar2;
        boolean z6;
        int i14;
        e eVarC;
        Animator animator;
        o1 o1Var4;
        Fragment fragment2;
        boolean z7;
        ArrayList arrayList7;
        int size4 = arrayList.size();
        o1 o1Var5 = null;
        o1 o1Var6 = null;
        int i15 = 0;
        while (true) {
            i4 = 1;
            if (i15 >= size4) {
                break;
            }
            Object obj2 = arrayList.get(i15);
            i15++;
            o1 o1Var7 = (o1) obj2;
            int iC = u.c(o1Var7.f738c.mView);
            int iB = s.e.b(o1Var7.f736a);
            if (iB != 0) {
                if (iB != 1) {
                    if (iB == 2 || iB == 3) {
                    }
                } else if (iC != 2) {
                    o1Var6 = o1Var7;
                }
            }
            if (iC == 2 && o1Var5 == null) {
                o1Var5 = o1Var7;
            }
        }
        String str3 = " to ";
        String str4 = "FragmentManager";
        if (u0.G(2)) {
            Log.v("FragmentManager", "Executing operations from " + o1Var5 + " to " + o1Var6);
        }
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList(arrayList);
        Fragment fragment3 = ((o1) arrayList.get(arrayList.size() - 1)).f738c;
        int size5 = arrayList.size();
        int i16 = 2;
        int i17 = 0;
        while (i17 < size5) {
            Object obj3 = arrayList.get(i17);
            i17++;
            y yVar = ((o1) obj3).f738c.mAnimationInfo;
            int i18 = i4;
            y yVar2 = fragment3.mAnimationInfo;
            yVar.f786b = yVar2.f786b;
            yVar.f787c = yVar2.f787c;
            yVar.f788d = yVar2.f788d;
            yVar.f789e = yVar2.f789e;
            i4 = i18;
        }
        int i19 = i4;
        int size6 = arrayList.size();
        int i20 = 0;
        while (i20 < size6) {
            Object obj4 = arrayList.get(i20);
            i20++;
            o1 o1Var8 = (o1) obj4;
            k0.e eVar = new k0.e();
            o1Var8.d();
            HashSet hashSet = o1Var8.f740e;
            hashSet.add(eVar);
            i iVar3 = new i(o1Var8, eVar);
            iVar3.f701d = false;
            iVar3.f700c = z4;
            arrayList8.add(iVar3);
            k0.e eVar2 = new k0.e();
            o1Var8.d();
            hashSet.add(eVar2);
            arrayList9.add(new k(o1Var8, eVar2, z4, (!z4 ? o1Var8 == o1Var6 : o1Var8 == o1Var5) ? 0 : i19));
            o1Var8.f739d.add(new c(this, arrayList10, o1Var8, 0));
        }
        HashMap map2 = new HashMap();
        int size7 = arrayList9.size();
        k1 k1Var = null;
        int i21 = 0;
        while (i21 < size7) {
            Object obj5 = arrayList9.get(i21);
            i21++;
            k kVar = (k) obj5;
            boolean zB = kVar.b();
            Fragment fragment4 = kVar.f704a.f738c;
            size7 = size7;
            Object obj6 = kVar.f710c;
            if (!zB) {
                k1 k1VarC = kVar.c(obj6);
                Object obj7 = kVar.f712e;
                k1 k1VarC2 = kVar.c(obj7);
                String str5 = str3;
                ArrayList arrayList11 = arrayList8;
                if (k1VarC != null && k1VarC2 != null && k1VarC != k1VarC2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + fragment4 + " returned Transition " + obj6 + " which uses a different Transition  type than its shared element transition " + obj7);
                }
                if (k1VarC == null) {
                    k1VarC = k1VarC2;
                }
                if (k1Var == null) {
                    k1Var = k1VarC;
                } else if (k1VarC != null && k1Var != k1VarC) {
                    q.n("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", fragment4, " returned Transition ", obj6, " which uses a different Transition  type than other Fragments.");
                    return;
                }
                i21 = i21;
                str3 = str5;
                arrayList8 = arrayList11;
            }
        }
        ArrayList arrayList12 = arrayList8;
        String str6 = str3;
        ViewGroup viewGroup2 = this.f715a;
        if (k1Var == null) {
            int size8 = arrayList9.size();
            int i22 = 0;
            while (i22 < size8) {
                Object obj8 = arrayList9.get(i22);
                i22++;
                k kVar2 = (k) obj8;
                map2.put(kVar2.f704a, Boolean.FALSE);
                kVar2.a();
            }
            map = map2;
            o1Var = o1Var6;
            str = "FragmentManager";
            arrayList2 = arrayList10;
        } else {
            View view6 = new View(viewGroup2.getContext());
            Rect rect = new Rect();
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            p.f fVar = new p.f(0);
            int size9 = arrayList9.size();
            arrayList2 = arrayList10;
            int i23 = 0;
            Object obj9 = null;
            boolean z8 = false;
            View view7 = null;
            while (i23 < size9) {
                Object obj10 = arrayList9.get(i23);
                int i24 = i23 + 1;
                Object obj11 = ((k) obj10).f712e;
                if (obj11 == null || o1Var5 == null) {
                    view3 = view6;
                    i7 = size9;
                } else {
                    i7 = size9;
                    Fragment fragment5 = o1Var5.f738c;
                    if (o1Var6 != null) {
                        Fragment fragment6 = o1Var6.f738c;
                        Object objR = k1Var.r(k1Var.f(obj11));
                        arrayList9 = arrayList9;
                        ArrayList<String> sharedElementSourceNames = fragment6.getSharedElementSourceNames();
                        HashMap map3 = map2;
                        ArrayList<String> sharedElementSourceNames2 = fragment5.getSharedElementSourceNames();
                        View view8 = view6;
                        ArrayList<String> sharedElementTargetNames = fragment5.getSharedElementTargetNames();
                        Rect rect2 = rect;
                        ArrayList arrayList15 = arrayList14;
                        int i25 = 0;
                        while (i25 < sharedElementTargetNames.size()) {
                            int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i25));
                            ArrayList<String> arrayList16 = sharedElementTargetNames;
                            if (iIndexOf != -1) {
                                sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i25));
                            }
                            i25++;
                            sharedElementTargetNames = arrayList16;
                        }
                        ArrayList<String> sharedElementTargetNames2 = fragment6.getSharedElementTargetNames();
                        if (z4) {
                            fragment5.getEnterTransitionCallback();
                            fragment6.getExitTransitionCallback();
                        } else {
                            fragment5.getExitTransitionCallback();
                            fragment6.getEnterTransitionCallback();
                        }
                        int i26 = 0;
                        for (int size10 = sharedElementSourceNames.size(); i26 < size10; size10 = size10) {
                            fVar.put(sharedElementSourceNames.get(i26), sharedElementTargetNames2.get(i26));
                            i26++;
                        }
                        if (u0.G(2)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            int i27 = 0;
                            for (int size11 = sharedElementTargetNames2.size(); i27 < size11; size11 = size11) {
                                String str7 = sharedElementTargetNames2.get(i27);
                                Log.v("FragmentManager", "Name: " + str7);
                                i27++;
                            }
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            int i28 = 0;
                            for (int size12 = sharedElementSourceNames.size(); i28 < size12; size12 = size12) {
                                String str8 = sharedElementSourceNames.get(i28);
                                Log.v("FragmentManager", "Name: " + str8);
                                i28++;
                            }
                        }
                        p.f fVar2 = new p.f(0);
                        e(fVar2, fragment5.mView);
                        fVar2.l(sharedElementSourceNames);
                        fVar.l(fVar2.keySet());
                        p.f fVar3 = new p.f(0);
                        e(fVar3, fragment6.mView);
                        fVar3.l(sharedElementTargetNames2);
                        fVar3.l(fVar.values());
                        i1 i1Var = d1.f671a;
                        int i29 = fVar.f3157h - 1;
                        while (i29 >= 0) {
                            Fragment fragment7 = fragment6;
                            if (!fVar3.containsKey((String) fVar.i(i29))) {
                                fVar.g(i29);
                            }
                            i29--;
                            fragment6 = fragment7;
                        }
                        Fragment fragment8 = fragment6;
                        k(fVar2, fVar.keySet());
                        k(fVar3, fVar.values());
                        if (fVar.isEmpty()) {
                            arrayList13.clear();
                            arrayList15.clear();
                            arrayList4 = arrayList15;
                            view3 = view8;
                            rect = rect2;
                            map2 = map3;
                            obj9 = null;
                        } else {
                            if (z4) {
                                fragment5.getEnterTransitionCallback();
                            } else {
                                fragment8.getEnterTransitionCallback();
                            }
                            p0.s.a(viewGroup2, new h(o1Var6, o1Var5, z4, fVar3));
                            arrayList13.addAll(fVar2.values());
                            if (sharedElementSourceNames.isEmpty()) {
                                i8 = 0;
                            } else {
                                i8 = 0;
                                View view9 = (View) fVar2.get(sharedElementSourceNames.get(0));
                                k1Var.m(view9, objR);
                                view7 = view9;
                            }
                            arrayList4 = arrayList15;
                            arrayList4.addAll(fVar3.values());
                            if (sharedElementTargetNames2.isEmpty() || (view4 = (View) fVar3.get(sharedElementTargetNames2.get(i8))) == null) {
                                rect = rect2;
                            } else {
                                rect = rect2;
                                p0.s.a(viewGroup2, new c(k1Var, view4, rect, i19));
                                z8 = true;
                            }
                            view3 = view8;
                            k1Var.p(objR, view3, arrayList13);
                            k1Var.l(objR, null, null, objR, arrayList4);
                            Boolean bool = Boolean.TRUE;
                            map2 = map3;
                            map2.put(o1Var5, bool);
                            map2.put(o1Var6, bool);
                            obj9 = objR;
                        }
                    } else {
                        view3 = view6;
                    }
                    HashMap map4 = map2;
                    view6 = view3;
                    map2 = map4;
                    i23 = i24;
                    arrayList14 = arrayList4;
                    size9 = i7;
                    arrayList9 = arrayList9;
                    i19 = 1;
                }
                arrayList4 = arrayList14;
                HashMap map5 = map2;
                view6 = view3;
                map2 = map5;
                i23 = i24;
                arrayList14 = arrayList4;
                size9 = i7;
                arrayList9 = arrayList9;
                i19 = 1;
            }
            View view10 = view6;
            map = map2;
            View view11 = view10;
            ArrayList arrayList17 = arrayList9;
            ArrayList arrayList18 = arrayList14;
            ArrayList arrayList19 = new ArrayList();
            int size13 = arrayList17.size();
            int i30 = 0;
            Object objJ = null;
            Object objJ2 = null;
            while (i30 < size13) {
                size13 = size13;
                arrayList17 = arrayList17;
                i30++;
                k kVar3 = (k) arrayList17.get(i30);
                boolean zB2 = kVar3.b();
                str4 = str4;
                o1 o1Var9 = kVar3.f704a;
                if (zB2) {
                    map.put(o1Var9, Boolean.FALSE);
                    kVar3.a();
                } else {
                    Object objF = k1Var.f(kVar3.f710c);
                    boolean z9 = obj9 != null && (o1Var9 == o1Var5 || o1Var9 == o1Var6);
                    if (objF == null) {
                        if (!z9) {
                            map.put(o1Var9, Boolean.FALSE);
                            kVar3.a();
                        }
                        view = view11;
                        o1Var2 = o1Var6;
                        obj = obj9;
                        view2 = view7;
                    } else {
                        o1Var2 = o1Var6;
                        ArrayList arrayList20 = new ArrayList();
                        obj = obj9;
                        Fragment fragment9 = o1Var9.f738c;
                        Object obj12 = objJ;
                        a(fragment9.mView, arrayList20);
                        if (z9) {
                            if (o1Var9 == o1Var5) {
                                arrayList20.removeAll(arrayList13);
                            } else {
                                arrayList20.removeAll(arrayList18);
                            }
                        }
                        if (arrayList20.isEmpty()) {
                            k1Var.a(view11, objF);
                            view = view11;
                        } else {
                            k1Var.b(objF, arrayList20);
                            k1Var.l(objF, objF, arrayList20, null, null);
                            view = view11;
                            if (o1Var9.f736a == 3) {
                                arrayList2.remove(o1Var9);
                                ArrayList arrayList21 = new ArrayList(arrayList20);
                                arrayList21.remove(fragment9.mView);
                                k1Var.k(objF, fragment9.mView, arrayList21);
                                p0.s.a(viewGroup2, new f(1, arrayList20));
                            }
                        }
                        if (o1Var9.f736a == i16) {
                            arrayList19.addAll(arrayList20);
                            if (z8) {
                                k1Var.n(objF, rect);
                            }
                            view2 = view7;
                        } else {
                            view2 = view7;
                            k1Var.m(view2, objF);
                        }
                        map.put(o1Var9, Boolean.TRUE);
                        if (kVar3.f711d) {
                            objJ2 = k1Var.j(objJ2, objF);
                            objJ = obj12;
                        } else {
                            objJ = k1Var.j(obj12, objF);
                        }
                    }
                    view7 = view2;
                    view11 = view;
                    obj9 = obj;
                    o1Var6 = o1Var2;
                    i16 = 2;
                }
            }
            o1 o1Var10 = o1Var6;
            String str9 = str4;
            Object objI = k1Var.i(objJ2, objJ, obj9);
            if (objI != null) {
                int size14 = arrayList17.size();
                int i31 = 0;
                while (i31 < size14) {
                    arrayList17 = arrayList17;
                    Object obj13 = arrayList17.get(i31);
                    i31++;
                    k kVar4 = (k) obj13;
                    boolean zB3 = kVar4.b();
                    o1 o1Var11 = kVar4.f704a;
                    if (zB3) {
                        arrayList17 = arrayList17;
                    } else {
                        Object obj14 = kVar4.f710c;
                        o1 o1Var12 = o1Var10;
                        boolean z10 = obj9 != null && (o1Var11 == o1Var5 || o1Var11 == o1Var12);
                        if (obj14 != null || z10) {
                            WeakHashMap weakHashMap = p0.p0.f3233a;
                            if (viewGroup2.isLaidOut()) {
                                size14 = size14;
                                str2 = str9;
                                k1Var.o(objI, kVar4.f705b, new c(kVar4, o1Var11));
                            } else {
                                if (u0.G(2)) {
                                    str2 = str9;
                                    Log.v(str2, "SpecialEffectsController: Container " + viewGroup2 + " has not been laid out. Completing operation " + o1Var11);
                                } else {
                                    str2 = str9;
                                }
                                kVar4.a();
                            }
                        } else {
                            size14 = size14;
                            str2 = str9;
                        }
                        size14 = size14;
                        str9 = str2;
                        o1Var10 = o1Var12;
                    }
                }
                str = str9;
                o1Var = o1Var10;
                WeakHashMap weakHashMap2 = p0.p0.f3233a;
                if (viewGroup2.isLaidOut()) {
                    d1.a(4, arrayList19);
                    ArrayList arrayList22 = new ArrayList();
                    int size15 = arrayList18.size();
                    for (int i32 = 0; i32 < size15; i32++) {
                        View view12 = (View) arrayList18.get(i32);
                        WeakHashMap weakHashMap3 = p0.p0.f3233a;
                        arrayList22.add(view12.getTransitionName());
                        view12.setTransitionName(null);
                    }
                    if (u0.G(2)) {
                        Log.v(str, ">>>>> Beginning transition <<<<<");
                        Log.v(str, ">>>>> SharedElementFirstOutViews <<<<<");
                        int size16 = arrayList13.size();
                        for (int i33 = 0; i33 < size16; i33++) {
                            Object obj15 = arrayList13.get(i33);
                            int i34 = size16;
                            View view13 = (View) obj15;
                            Log.v(str, "View: " + view13 + " Name: " + view13.getTransitionName());
                            size16 = i34;
                        }
                        Log.v(str, ">>>>> SharedElementLastInViews <<<<<");
                        int size17 = arrayList18.size();
                        for (int i35 = 0; i35 < size17; i35++) {
                            Object obj16 = arrayList18.get(i35);
                            int i36 = size17;
                            View view14 = (View) obj16;
                            Log.v(str, "View: " + view14 + " Name: " + view14.getTransitionName());
                            size17 = i36;
                        }
                    }
                    k1Var.c(viewGroup2, objI);
                    int size18 = arrayList18.size();
                    ArrayList arrayList23 = new ArrayList();
                    int i37 = 0;
                    while (i37 < size18) {
                        View view15 = (View) arrayList13.get(i37);
                        WeakHashMap weakHashMap4 = p0.p0.f3233a;
                        String transitionName = view15.getTransitionName();
                        arrayList23.add(transitionName);
                        if (transitionName == null) {
                            i6 = size18;
                            arrayList3 = arrayList23;
                        } else {
                            arrayList3 = arrayList23;
                            view15.setTransitionName(null);
                            String str10 = (String) fVar.get(transitionName);
                            int i38 = 0;
                            while (true) {
                                i6 = size18;
                                if (i38 >= size18) {
                                    break;
                                }
                                if (str10.equals(arrayList22.get(i38))) {
                                    ((View) arrayList18.get(i38)).setTransitionName(transitionName);
                                    break;
                                } else {
                                    i38++;
                                    size18 = i6;
                                }
                            }
                        }
                        i37++;
                        size18 = i6;
                        arrayList23 = arrayList3;
                    }
                    p0.s.a(viewGroup2, new j1(size18, arrayList18, arrayList22, arrayList13, arrayList23));
                    i5 = 0;
                    d1.a(0, arrayList19);
                    k1Var.q(obj9, arrayList13, arrayList18);
                }
                zContainsValue = map.containsValue(Boolean.TRUE);
                context = viewGroup2.getContext();
                arrayList5 = new ArrayList();
                size = arrayList12.size();
                i9 = i5;
                i10 = i9;
                while (i10 < size) {
                    arrayList12 = arrayList12;
                    Object obj17 = arrayList12.get(i10);
                    i10++;
                    iVar2 = (i) obj17;
                    if (iVar2.b()) {
                        iVar2.a();
                    } else {
                        eVarC = iVar2.c(context);
                        if (eVarC == null) {
                            iVar2.a();
                        } else {
                            animator = (Animator) eVarC.f;
                            if (animator == null) {
                                arrayList5.add(iVar2);
                            } else {
                                o1Var4 = iVar2.f704a;
                                z6 = zContainsValue;
                                fragment2 = o1Var4.f738c;
                                i14 = size;
                                if (Boolean.TRUE.equals(map.get(o1Var4))) {
                                    if (u0.G(2)) {
                                        Log.v(str, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                                    }
                                    iVar2.a();
                                    zContainsValue = z6;
                                    size = i14;
                                    i9 = i9;
                                } else {
                                    if (o1Var4.f736a == 3) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    arrayList7 = arrayList2;
                                    if (z7) {
                                        arrayList7.remove(o1Var4);
                                    }
                                    View view16 = fragment2.mView;
                                    viewGroup2.startViewTransition(view16);
                                    ViewGroup viewGroup3 = viewGroup2;
                                    animator.addListener(new d(viewGroup3, view16, z7, o1Var4, iVar2));
                                    animator.setTarget(view16);
                                    animator.start();
                                    if (u0.G(2)) {
                                        Log.v(str, "Animator from operation " + o1Var4 + " has started.");
                                    }
                                    iVar2.f705b.a(new e(animator, o1Var4));
                                    zContainsValue = z6;
                                    arrayList2 = arrayList7;
                                    viewGroup2 = viewGroup3;
                                    i9 = 1;
                                    size = i14;
                                }
                            }
                        }
                    }
                    z6 = zContainsValue;
                    i14 = size;
                    zContainsValue = z6;
                    size = i14;
                    i9 = i9;
                }
                z5 = zContainsValue;
                i11 = i9;
                arrayList6 = arrayList2;
                viewGroup = viewGroup2;
                size2 = arrayList5.size();
                i12 = 0;
                while (i12 < size2) {
                    Object obj18 = arrayList5.get(i12);
                    i12++;
                    iVar = (i) obj18;
                    o1Var3 = iVar.f704a;
                    fragment = o1Var3.f738c;
                    if (z5) {
                        if (u0.G(2)) {
                            Log.v(str, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                        }
                        iVar.a();
                    } else if (i11 != 0) {
                        if (u0.G(2)) {
                            Log.v(str, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                        }
                        iVar.a();
                    } else {
                        view5 = fragment.mView;
                        e eVarC2 = iVar.c(context);
                        eVarC2.getClass();
                        animation = (Animation) eVarC2.f673g;
                        animation.getClass();
                        if (o1Var3.f736a != 1) {
                            view5.startAnimation(animation);
                            iVar.a();
                        } else {
                            viewGroup.startViewTransition(view5);
                            f0 f0Var = new f0(animation, viewGroup, view5);
                            f0Var.setAnimationListener(new g(view5, viewGroup, iVar, o1Var3));
                            view5.startAnimation(f0Var);
                            if (u0.G(2)) {
                                Log.v(str, "Animation from operation " + o1Var3 + " has started.");
                            }
                        }
                        iVar.f705b.a(new a1(view5, viewGroup, iVar, o1Var3));
                    }
                }
                size3 = arrayList6.size();
                i13 = 0;
                while (i13 < size3) {
                    Object obj19 = arrayList6.get(i13);
                    i13++;
                    o1 o1Var13 = (o1) obj19;
                    u.a(o1Var13.f738c.mView, o1Var13.f736a);
                }
                arrayList6.clear();
                if (u0.G(2)) {
                    Log.v(str, "Completed executing operations from " + o1Var5 + str6 + o1Var);
                }
            }
            str = str9;
            o1Var = o1Var10;
        }
        i5 = 0;
        zContainsValue = map.containsValue(Boolean.TRUE);
        context = viewGroup2.getContext();
        arrayList5 = new ArrayList();
        size = arrayList12.size();
        i9 = i5;
        i10 = i9;
        while (i10 < size) {
            arrayList12 = arrayList12;
            Object obj110 = arrayList12.get(i10);
            i10++;
            iVar2 = (i) obj110;
            if (iVar2.b()) {
                iVar2.a();
            } else {
                eVarC = iVar2.c(context);
                if (eVarC == null) {
                    iVar2.a();
                } else {
                    animator = (Animator) eVarC.f;
                    if (animator == null) {
                        arrayList5.add(iVar2);
                    } else {
                        o1Var4 = iVar2.f704a;
                        z6 = zContainsValue;
                        fragment2 = o1Var4.f738c;
                        i14 = size;
                        if (Boolean.TRUE.equals(map.get(o1Var4))) {
                            if (u0.G(2)) {
                                Log.v(str, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                            }
                            iVar2.a();
                            zContainsValue = z6;
                            size = i14;
                            i9 = i9;
                        } else {
                            if (o1Var4.f736a == 3) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            arrayList7 = arrayList2;
                            if (z7) {
                                arrayList7.remove(o1Var4);
                            }
                            View view17 = fragment2.mView;
                            viewGroup2.startViewTransition(view17);
                            ViewGroup viewGroup4 = viewGroup2;
                            animator.addListener(new d(viewGroup4, view17, z7, o1Var4, iVar2));
                            animator.setTarget(view17);
                            animator.start();
                            if (u0.G(2)) {
                                Log.v(str, "Animator from operation " + o1Var4 + " has started.");
                            }
                            iVar2.f705b.a(new e(animator, o1Var4));
                            zContainsValue = z6;
                            arrayList2 = arrayList7;
                            viewGroup2 = viewGroup4;
                            i9 = 1;
                            size = i14;
                        }
                    }
                }
            }
            z6 = zContainsValue;
            i14 = size;
            zContainsValue = z6;
            size = i14;
            i9 = i9;
        }
        z5 = zContainsValue;
        i11 = i9;
        arrayList6 = arrayList2;
        viewGroup = viewGroup2;
        size2 = arrayList5.size();
        i12 = 0;
        while (i12 < size2) {
            Object obj111 = arrayList5.get(i12);
            i12++;
            iVar = (i) obj111;
            o1Var3 = iVar.f704a;
            fragment = o1Var3.f738c;
            if (z5) {
                if (u0.G(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                }
                iVar.a();
            } else if (i11 != 0) {
                if (u0.G(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                }
                iVar.a();
            } else {
                view5 = fragment.mView;
                e eVarC3 = iVar.c(context);
                eVarC3.getClass();
                animation = (Animation) eVarC3.f673g;
                animation.getClass();
                if (o1Var3.f736a != 1) {
                    view5.startAnimation(animation);
                    iVar.a();
                } else {
                    viewGroup.startViewTransition(view5);
                    f0 f0Var2 = new f0(animation, viewGroup, view5);
                    f0Var2.setAnimationListener(new g(view5, viewGroup, iVar, o1Var3));
                    view5.startAnimation(f0Var2);
                    if (u0.G(2)) {
                        Log.v(str, "Animation from operation " + o1Var3 + " has started.");
                    }
                }
                iVar.f705b.a(new a1(view5, viewGroup, iVar, o1Var3));
            }
        }
        size3 = arrayList6.size();
        i13 = 0;
        while (i13 < size3) {
            Object obj112 = arrayList6.get(i13);
            i13++;
            o1 o1Var14 = (o1) obj112;
            u.a(o1Var14.f738c.mView, o1Var14.f736a);
        }
        arrayList6.clear();
        if (u0.G(2)) {
            Log.v(str, "Completed executing operations from " + o1Var5 + str6 + o1Var);
        }
    }

    public final void d() {
        if (this.f719e) {
            return;
        }
        ViewGroup viewGroup = this.f715a;
        WeakHashMap weakHashMap = p0.p0.f3233a;
        if (!viewGroup.isAttachedToWindow()) {
            g();
            this.f718d = false;
            return;
        }
        synchronized (this.f716b) {
            try {
                if (!this.f716b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f717c);
                    this.f717c.clear();
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        o1 o1Var = (o1) obj;
                        if (u0.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + o1Var);
                        }
                        o1Var.a();
                        if (!o1Var.f741g) {
                            this.f717c.add(o1Var);
                        }
                    }
                    l();
                    ArrayList arrayList2 = new ArrayList(this.f716b);
                    this.f716b.clear();
                    this.f717c.addAll(arrayList2);
                    if (u0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        ((o1) obj2).d();
                    }
                    c(arrayList2, this.f718d);
                    this.f718d = false;
                    if (u0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o1 f(Fragment fragment) {
        ArrayList arrayList = this.f716b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            o1 o1Var = (o1) obj;
            if (o1Var.f738c.equals(fragment) && !o1Var.f) {
                return o1Var;
            }
        }
        return null;
    }

    public final void g() {
        String str;
        String str2;
        if (u0.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f715a;
        WeakHashMap weakHashMap = p0.p0.f3233a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f716b) {
            try {
                l();
                ArrayList arrayList = this.f716b;
                int size = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((o1) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.f717c);
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    o1 o1Var = (o1) obj2;
                    if (u0.G(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f715a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(o1Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    o1Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.f716b);
                int size3 = arrayList3.size();
                while (i4 < size3) {
                    Object obj3 = arrayList3.get(i4);
                    i4++;
                    o1 o1Var2 = (o1) obj3;
                    if (u0.G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f715a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(o1Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    o1Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.f716b) {
            try {
                l();
                this.f719e = false;
                for (int size = this.f716b.size() - 1; size >= 0; size--) {
                    o1 o1Var = (o1) this.f716b.get(size);
                    int iC = u.c(o1Var.f738c.mView);
                    if (o1Var.f736a == 2 && iC != 2) {
                        this.f719e = o1Var.f738c.isPostponed();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        ArrayList arrayList = this.f716b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            o1 o1Var = (o1) obj;
            if (o1Var.f737b == 2) {
                o1Var.c(u.b(o1Var.f738c.requireView().getVisibility()), 1);
            }
        }
    }
}
