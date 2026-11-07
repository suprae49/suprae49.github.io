package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.emoji2.text.t;
import j.p;
import java.io.IOException;
import k.j1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f2220e;
    public static final Class[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f2221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f2222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2224d;

    static {
        Class[] clsArr = {Context.class};
        f2220e = clsArr;
        f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f2223c = context;
        Object[] objArr = {context};
        this.f2221a = objArr;
        this.f2222b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i4;
        ColorStateList colorStateList;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i4 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i4) {
                if (!z5) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f2223c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f1645q);
                        gVar.f2197b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        gVar.f2198c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        gVar.f2199d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        gVar.f2200e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        gVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        gVar.f2201g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        t tVarT = t.t(context, attributeSet, d.a.f1646r);
                        TypedArray typedArray = (TypedArray) tVarT.f579c;
                        gVar.f2203i = typedArray.getResourceId(2, 0);
                        gVar.f2204j = (typedArray.getInt(5, gVar.f2198c) & (-65536)) | (typedArray.getInt(6, gVar.f2199d) & 65535);
                        gVar.f2205k = typedArray.getText(7);
                        gVar.f2206l = typedArray.getText(8);
                        gVar.f2207m = typedArray.getResourceId(0, 0);
                        String string = typedArray.getString(9);
                        gVar.n = string == null ? (char) 0 : string.charAt(0);
                        gVar.f2208o = typedArray.getInt(16, 4096);
                        String string2 = typedArray.getString(10);
                        gVar.f2209p = string2 == null ? (char) 0 : string2.charAt(0);
                        gVar.f2210q = typedArray.getInt(20, 4096);
                        if (typedArray.hasValue(11)) {
                            gVar.f2211r = typedArray.getBoolean(11, false) ? 1 : 0;
                        } else {
                            gVar.f2211r = gVar.f2200e;
                        }
                        gVar.f2212s = typedArray.getBoolean(3, false);
                        gVar.f2213t = typedArray.getBoolean(4, gVar.f);
                        gVar.f2214u = typedArray.getBoolean(1, gVar.f2201g);
                        gVar.f2215v = typedArray.getInt(21, -1);
                        gVar.f2218y = typedArray.getString(12);
                        gVar.f2216w = typedArray.getResourceId(13, 0);
                        gVar.f2217x = typedArray.getString(15);
                        String string3 = typedArray.getString(14);
                        boolean z6 = string3 != null;
                        if (z6 && gVar.f2216w == 0 && gVar.f2217x == null) {
                            gVar.f2219z = (p) gVar.a(string3, f, this.f2222b);
                        } else {
                            if (z6) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            gVar.f2219z = null;
                        }
                        gVar.A = typedArray.getText(17);
                        gVar.B = typedArray.getText(22);
                        if (typedArray.hasValue(19)) {
                            gVar.D = j1.c(typedArray.getInt(19, -1), gVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            gVar.D = null;
                        }
                        if (typedArray.hasValue(18)) {
                            gVar.C = tVarT.h(18);
                        } else {
                            gVar.C = colorStateList;
                        }
                        tVarT.v();
                        gVar.f2202h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        gVar.f2202h = true;
                        SubMenu subMenuAddSubMenu = gVar.f2196a.addSubMenu(gVar.f2197b, gVar.f2203i, gVar.f2204j, gVar.f2205k);
                        gVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z5 = true;
                    }
                }
                z4 = z4;
            } else if (eventType != 3) {
                z4 = z4;
            } else {
                String name3 = xmlPullParser.getName();
                if (z5 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z5 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        gVar.f2197b = 0;
                        gVar.f2198c = 0;
                        gVar.f2199d = 0;
                        gVar.f2200e = 0;
                        gVar.f = true;
                        gVar.f2201g = true;
                    } else if (name3.equals("item")) {
                        if (!gVar.f2202h) {
                            p pVar = gVar.f2219z;
                            if (pVar == null || !pVar.f2433b.hasSubMenu()) {
                                gVar.f2202h = true;
                                gVar.b(gVar.f2196a.add(gVar.f2197b, gVar.f2203i, gVar.f2204j, gVar.f2205k));
                            } else {
                                gVar.f2202h = true;
                                gVar.b(gVar.f2196a.addSubMenu(gVar.f2197b, gVar.f2203i, gVar.f2204j, gVar.f2205k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z4 = true;
                    }
                    z4 = z4;
                }
            }
            eventType = xmlPullParser.next();
            i4 = 2;
            z4 = z4;
            z5 = z5;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i4, Menu menu) {
        if (!(menu instanceof j.m)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z4 = false;
        try {
            try {
                layout = this.f2223c.getResources().getLayout(i4);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof j.m) {
                    j.m mVar = (j.m) menu;
                    if (!mVar.f2397p) {
                        mVar.y();
                        z4 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z4) {
                    ((j.m) menu).x();
                }
                layout.close();
            } catch (IOException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            } catch (XmlPullParserException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            }
        } catch (Throwable th) {
            if (z4) {
                ((j.m) menu).x();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
