package androidx.emoji2.text;

import a3.h0;
import android.R;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsetsAnimation;
import android.widget.EditText;
import co.median.android.MainActivity;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.s2;
import k1.e1;
import k1.f1;
import k1.g0;
import k1.j0;
import k1.x0;
import org.xmlpull.v1.XmlPullParserException;
import p0.p0;
import p0.r0;
import p0.y1;
import u1.o0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class p implements q, p0.q, s2, w1.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static p f567i;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f569h;

    public p(int i4) {
        this.f = i4;
        switch (i4) {
            case 6:
                this.f568g = new SparseIntArray();
                this.f569h = new SparseIntArray();
                break;
            case 8:
                this.f568g = new p.k(0);
                this.f569h = new p.h();
                break;
            case 20:
                this.f568g = Choreographer.getInstance();
                this.f569h = Looper.myLooper();
                break;
            default:
                this.f568g = new Rect();
                this.f569h = new Rect();
                break;
        }
    }

    public static p l() {
        if (f567i == null) {
            p pVar = new p(17, false);
            pVar.f568g = null;
            pVar.f569h = null;
            f567i = pVar;
        }
        return f567i;
    }

    public static int m(int i4, int i5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            i6++;
            if (i6 == i5) {
                i7++;
                i6 = 0;
            } else if (i6 > i5) {
                i7++;
                i6 = 1;
            }
        }
        return i6 + 1 > i5 ? i7 + 1 : i7;
    }

    @Override // androidx.emoji2.text.q
    public Object a() {
        return (d0) this.f568g;
    }

    @Override // w1.k
    public boolean b() {
        MainActivity mainActivity = (MainActivity) this.f569h;
        if (((o0) mainActivity.G).getMaxHorizontalScroll() <= 0 || mainActivity.G.getScrollX() >= ((o0) mainActivity.G).getMaxHorizontalScroll()) {
            return ((o0) mainActivity.G).canGoForward();
        }
        return false;
    }

    @Override // androidx.emoji2.text.q
    public boolean c(CharSequence charSequence, int i4, int i5, a0 a0Var) {
        if ((a0Var.f536c & 4) > 0) {
            return true;
        }
        if (((d0) this.f568g) == null) {
            this.f568g = new d0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((a3.f) this.f569h).getClass();
        ((d0) this.f568g).setSpan(new b0(a0Var), i4, i5, 33);
        return true;
    }

    @Override // p0.q
    public y1 d(View view, y1 y1Var) {
        r2.c0 c0Var = (r2.c0) this.f568g;
        r2.d0 d0Var = (r2.d0) this.f569h;
        r2.d0 d0Var2 = new r2.d0();
        d0Var2.f3548a = d0Var.f3548a;
        d0Var2.f3549b = d0Var.f3549b;
        d0Var2.f3550c = d0Var.f3550c;
        d0Var2.f3551d = d0Var.f3551d;
        return c0Var.d(view, y1Var, d0Var2);
    }

    @Override // w1.k
    public boolean e() {
        MainActivity mainActivity = (MainActivity) this.f569h;
        if (((x1.a) this.f568g).C) {
            x1.i iVar = mainActivity.G;
            if (iVar == null ? false : iVar.canGoBack()) {
                x1.i iVar2 = mainActivity.G;
                if (iVar2 == null) {
                    return true;
                }
                int i4 = o0.f4024u;
                ((o0) iVar2).goBack();
                return true;
            }
        }
        return false;
    }

    @Override // w1.k
    public boolean f() {
        return ((x1.a) this.f568g).C;
    }

    @Override // w1.k
    public boolean g() {
        MainActivity mainActivity = (MainActivity) this.f569h;
        if (!((x1.a) this.f568g).C || !((o0) mainActivity.G).canGoForward()) {
            return false;
        }
        int i4 = o0.f4024u;
        ((o0) mainActivity.G).goForward();
        return true;
    }

    public void h(x0 x0Var, g0 g0Var) {
        p.k kVar = (p.k) this.f568g;
        f1 f1VarA = (f1) kVar.get(x0Var);
        if (f1VarA == null) {
            f1VarA = f1.a();
            kVar.put(x0Var, f1VarA);
        }
        f1VarA.f2774c = g0Var;
        f1VarA.f2772a |= 8;
    }

    @Override // w1.k
    public boolean i() {
        x1.i iVar;
        MainActivity mainActivity = (MainActivity) this.f569h;
        if ((((o0) mainActivity.G).getMaxHorizontalScroll() <= 0 || mainActivity.G.getScrollX() <= 0) && (iVar = mainActivity.G) != null) {
            return iVar.canGoBack();
        }
        return false;
    }

    public void j() {
        View rootView = ((ViewGroup) ((MainActivity) this.f568g).findViewById(R.id.content)).getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            viewGroup.addView((ViewGroup) ((g3.d) this.f569h).a());
        }
    }

    public View k(int i4, int i5, int i6, int i7) {
        View viewU;
        e1 e1Var = (e1) this.f569h;
        j0 j0Var = (j0) this.f568g;
        int iD = j0Var.d();
        int iC = j0Var.c();
        int i8 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            switch (j0Var.f2805a) {
                case 0:
                    viewU = j0Var.f2806b.u(i4);
                    break;
                default:
                    viewU = j0Var.f2806b.u(i4);
                    break;
            }
            int iB = j0Var.b(viewU);
            int iA = j0Var.a(viewU);
            e1Var.f2762b = iD;
            e1Var.f2763c = iC;
            e1Var.f2764d = iB;
            e1Var.f2765e = iA;
            if (i6 != 0) {
                e1Var.f2761a = i6;
                if (e1Var.a()) {
                    return viewU;
                }
            }
            if (i7 != 0) {
                e1Var.f2761a = i7;
                if (e1Var.a()) {
                    view = viewU;
                }
            }
            i4 += i8;
        }
        return view;
    }

    public ViewGroup n() {
        return (ViewGroup) ((g3.d) this.f569h).a();
    }

    public void o(String str) {
        Pattern pattern = (Pattern) this.f568g;
        if (pattern != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.groupCount() <= 0 || !matcher.find()) {
                return;
            }
            this.f569h = matcher.group(1);
        }
    }

    public void p() {
        ((SparseIntArray) this.f568g).clear();
    }

    public boolean q(View view) {
        e1 e1Var = (e1) this.f569h;
        j0 j0Var = (j0) this.f568g;
        int iD = j0Var.d();
        int iC = j0Var.c();
        int iB = j0Var.b(view);
        int iA = j0Var.a(view);
        e1Var.f2762b = iD;
        e1Var.f2763c = iC;
        e1Var.f2764d = iB;
        e1Var.f2765e = iA;
        e1Var.f2761a = 24579;
        return e1Var.a();
    }

    public void r(i.a aVar) {
        x xVar = (x) this.f568g;
        ((ActionMode.Callback) xVar.f592a).onDestroyActionMode(xVar.b(aVar));
        e.d0 d0Var = (e.d0) this.f569h;
        if (d0Var.B != null) {
            d0Var.f1886q.getDecorView().removeCallbacks(d0Var.C);
        }
        if (d0Var.A != null) {
            r0 r0Var = d0Var.D;
            if (r0Var != null) {
                r0Var.b();
            }
            r0 r0VarA = p0.a(d0Var.A);
            r0VarA.a(0.0f);
            d0Var.D = r0VarA;
            r0VarA.d(new e.t(2, this));
        }
        d0Var.f1895z = null;
        ViewGroup viewGroup = d0Var.F;
        WeakHashMap weakHashMap = p0.f3233a;
        viewGroup.requestApplyInsets();
        d0Var.K();
    }

    public boolean s(i.a aVar, Menu menu) {
        ViewGroup viewGroup = ((e.d0) this.f569h).F;
        WeakHashMap weakHashMap = p0.f3233a;
        viewGroup.requestApplyInsets();
        x xVar = (x) this.f568g;
        ActionMode.Callback callback = (ActionMode.Callback) xVar.f592a;
        i.e eVarB = xVar.b(aVar);
        p.k kVar = (p.k) xVar.f595d;
        Menu b0Var = (Menu) kVar.get(menu);
        if (b0Var == null) {
            b0Var = new j.b0((Context) xVar.f593b, (j.m) menu);
            kVar.put(menu, b0Var);
        }
        return callback.onPrepareActionMode(eVarB, b0Var);
    }

    public void t(l0.g gVar) {
        k0.f fVar = (k0.f) this.f569h;
        h0 h0Var = (h0) this.f568g;
        int i4 = gVar.f2995b;
        if (i4 != 0) {
            fVar.execute(new i(i4, 2, h0Var));
        } else {
            fVar.execute(new b0.b(h0Var, 5, gVar.f2994a));
        }
    }

    public String toString() {
        switch (this.f) {
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return "Bounds{lower=" + ((f0.c) this.f568g) + " upper=" + ((f0.c) this.f569h) + "}";
            case 12:
            default:
                return super.toString();
            case 13:
                String str = "[ ";
                if (((s.f) this.f568g) != null) {
                    for (int i4 = 0; i4 < 9; i4++) {
                        str = str + ((s.f) this.f568g).f3653m[i4] + " ";
                    }
                }
                return str + "] " + ((s.f) this.f568g);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void u(Context context, XmlResourceParser xmlResourceParser) {
        x.o oVar = new x.o();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = xmlResourceParser.getAttributeName(i4);
            String attributeValue = xmlResourceParser.getAttributeValue(i4);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    x.j jVarD = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (jVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        jVarD.f4566d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (jVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        jVarD.f4565c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        jVarD = x.o.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (jVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        jVarD.f4564b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (jVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        jVarD.f4567e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        jVarD = x.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        jVarD.f4566d.f4569a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (jVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        x.b.a(context, xmlResourceParser, jVarD.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        jVarD = x.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        jVarD.f4566d.f4581h0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (jVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        x.b.a(context, xmlResourceParser, jVarD.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        jVarD = x.o.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        oVar.f4634c.put(Integer.valueOf(jVarD.f4563a), jVarD);
                                        jVarD = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        oVar.f4634c.put(Integer.valueOf(jVarD.f4563a), jVarD);
                                        jVarD = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        oVar.f4634c.put(Integer.valueOf(jVarD.f4563a), jVarD);
                                        jVarD = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.f569h).put(identifier, oVar);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e5) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e5);
                } catch (XmlPullParserException e6) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e6);
                }
                ((SparseArray) this.f569h).put(identifier, oVar);
                return;
            }
        }
    }

    public g0 v(x0 x0Var, int i4) {
        f1 f1Var;
        g0 g0Var;
        p.k kVar = (p.k) this.f568g;
        int iD = kVar.d(x0Var);
        if (iD >= 0 && (f1Var = (f1) kVar.i(iD)) != null) {
            int i5 = f1Var.f2772a;
            if ((i5 & i4) != 0) {
                int i6 = i5 & (~i4);
                f1Var.f2772a = i6;
                if (i4 == 4) {
                    g0Var = f1Var.f2773b;
                } else {
                    if (i4 != 8) {
                        androidx.fragment.app.q.q("Must provide flag PRE or POST");
                        return null;
                    }
                    g0Var = f1Var.f2774c;
                }
                if ((i6 & 12) == 0) {
                    kVar.g(iD);
                    f1Var.f2772a = 0;
                    f1Var.f2773b = null;
                    f1Var.f2774c = null;
                    f1.f2771d.c(f1Var);
                }
                return g0Var;
            }
        }
        return null;
    }

    public void w() {
        ViewParent parent = n().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(n());
        }
    }

    public void x(x0 x0Var) {
        f1 f1Var = (f1) ((p.k) this.f568g).get(x0Var);
        if (f1Var == null) {
            return;
        }
        f1Var.f2772a &= -2;
    }

    public void y(x0 x0Var) {
        p.h hVar = (p.h) this.f569h;
        for (int iE = hVar.e() - 1; iE >= 0; iE--) {
            if (x0Var == hVar.f(iE)) {
                Object[] objArr = hVar.f3152h;
                Object obj = objArr[iE];
                Object obj2 = p.i.f3154a;
                if (obj == obj2) {
                    break;
                }
                objArr[iE] = obj2;
                hVar.f = true;
                break;
            }
        }
        f1 f1Var = (f1) ((p.k) this.f568g).remove(x0Var);
        if (f1Var != null) {
            f1Var.f2772a = 0;
            f1Var.f2773b = null;
            f1Var.f2774c = null;
            f1.f2771d.c(f1Var);
        }
    }

    public /* synthetic */ p(int i4, boolean z4) {
        this.f = i4;
    }

    public /* synthetic */ p(Object obj, int i4, Object obj2) {
        this.f = i4;
        this.f568g = obj;
        this.f569h = obj2;
    }

    public /* synthetic */ p(Object obj, Object obj2, int i4, boolean z4) {
        this.f = i4;
        this.f569h = obj;
        this.f568g = obj2;
    }

    public p(MainActivity mainActivity) {
        this.f = 10;
        this.f568g = mainActivity;
        this.f569h = new g3.d(new m0.h(0, this));
    }

    public p(j0 j0Var) {
        this.f = 7;
        this.f568g = j0Var;
        e1 e1Var = new e1();
        e1Var.f2761a = 0;
        this.f569h = e1Var;
    }

    public p(ArrayList arrayList, ArrayList arrayList2) {
        this.f = 5;
        int size = arrayList.size();
        this.f568g = new int[size];
        this.f569h = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            ((int[]) this.f568g)[i4] = ((Integer) arrayList.get(i4)).intValue();
            ((float[]) this.f569h)[i4] = ((Float) arrayList2.get(i4)).floatValue();
        }
    }

    public p(WindowInsetsAnimation.Bounds bounds) {
        this.f = 11;
        this.f568g = f0.c.d(bounds.getLowerBound());
        this.f569h = f0.c.d(bounds.getUpperBound());
    }

    public p(int i4, int i5) {
        this.f = 5;
        this.f568g = new int[]{i4, i5};
        this.f569h = new float[]{0.0f, 1.0f};
    }

    public p(int i4, int i5, int i6) {
        this.f = 5;
        this.f568g = new int[]{i4, i5, i6};
        this.f569h = new float[]{0.0f, 0.5f, 1.0f};
    }

    public p(EditText editText) {
        this.f = 2;
        this.f568g = editText;
        b1.i iVar = new b1.i(editText);
        this.f569h = iVar;
        editText.addTextChangedListener(iVar);
        if (b1.a.f1031b == null) {
            synchronized (b1.a.f1030a) {
                try {
                    if (b1.a.f1031b == null) {
                        b1.a aVar = new b1.a();
                        try {
                            b1.a.f1032c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        b1.a.f1031b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(b1.a.f1031b);
    }

    public /* synthetic */ p(int i4, Object obj) {
        this.f = i4;
        this.f569h = obj;
    }
}
