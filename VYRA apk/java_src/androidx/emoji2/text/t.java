package androidx.emoji2.text;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.RecyclerView;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.x0;
import org.json.JSONObject;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static t f576e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f580d;

    /* JADX WARN: Code duplicated, block: B:83:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    public t(b0.j jVar) {
        int i4;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i5;
        char c4;
        Icon iconCreateWithBitmap;
        String strE;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i6;
        this.f577a = 2;
        this.f580d = new Bundle();
        this.f579c = jVar;
        Context context = jVar.f1014a;
        ArrayList arrayList4 = jVar.f1027p;
        ArrayList arrayList5 = jVar.f1016c;
        ArrayList arrayList6 = jVar.f1017d;
        Notification.Builder builder = new Notification.Builder(context, jVar.f1025m);
        this.f578b = builder;
        Notification notification = jVar.f1026o;
        int i7 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(jVar.f1018e).setContentText(jVar.f).setContentInfo(null).setContentIntent(jVar.f1019g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(jVar.f1020h);
        ArrayList arrayList7 = jVar.f1015b;
        int size = arrayList7.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            b0.i iVar = (b0.i) arrayList7.get(i8);
            if (iVar.f1009b == null && (i6 = iVar.f1012e) != 0) {
                iVar.f1009b = IconCompat.a(i6);
            }
            IconCompat iconCompat = iVar.f1009b;
            int i10 = i7;
            boolean z4 = iVar.f1010c;
            Bundle bundle = iVar.f1008a;
            if (iconCompat != null) {
                int i11 = iconCompat.f496a;
                switch (i11) {
                    case -1:
                        arrayList5 = arrayList5;
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i5 = size;
                        c4 = 2;
                        iconCreateWithBitmap = (Icon) iconCompat.f497b;
                        break;
                    case 0:
                    default:
                        androidx.fragment.app.q.q("Unknown type");
                        throw null;
                    case 1:
                        arrayList5 = arrayList5;
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i5 = size;
                        c4 = 2;
                        iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f497b);
                        colorStateList = iconCompat.f501g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f502h;
                        if (mode != IconCompat.f495k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 2:
                        arrayList5 = arrayList5;
                        if (i11 == -1) {
                            Object obj = iconCompat.f497b;
                            arrayList3 = arrayList7;
                            i5 = size;
                            if (Build.VERSION.SDK_INT >= 28) {
                                strE = c0.a.e(obj);
                                arrayList2 = arrayList6;
                            } else {
                                try {
                                    arrayList2 = arrayList6;
                                    try {
                                        strE = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                                    } catch (IllegalAccessException e5) {
                                        e = e5;
                                        Log.e("IconCompat", "Unable to get icon package", e);
                                        strE = null;
                                    } catch (NoSuchMethodException e6) {
                                        e = e6;
                                        Log.e("IconCompat", "Unable to get icon package", e);
                                        strE = null;
                                    } catch (InvocationTargetException e7) {
                                        e = e7;
                                        Log.e("IconCompat", "Unable to get icon package", e);
                                        strE = null;
                                    }
                                } catch (IllegalAccessException e8) {
                                    e = e8;
                                    arrayList2 = arrayList6;
                                } catch (NoSuchMethodException e9) {
                                    e = e9;
                                    arrayList2 = arrayList6;
                                } catch (InvocationTargetException e10) {
                                    e = e10;
                                    arrayList2 = arrayList6;
                                }
                            }
                            c4 = 2;
                        } else {
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            i5 = size;
                            c4 = 2;
                            if (i11 != 2) {
                                androidx.fragment.app.q.i(iconCompat, "called getResPackage() on ");
                                throw null;
                            }
                            String str = iconCompat.f504j;
                            strE = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f497b).split(":", -1)[i10] : iconCompat.f504j;
                        }
                        iconCreateWithBitmap = Icon.createWithResource(strE, iconCompat.f500e);
                        colorStateList = iconCompat.f501g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f502h;
                        if (mode != IconCompat.f495k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 3:
                        iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f497b, iconCompat.f500e, iconCompat.f);
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i5 = size;
                        c4 = 2;
                        colorStateList = iconCompat.f501g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f502h;
                        if (mode != IconCompat.f495k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 4:
                        iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f497b);
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i5 = size;
                        c4 = 2;
                        colorStateList = iconCompat.f501g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f502h;
                        if (mode != IconCompat.f495k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 5:
                        iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.f497b);
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i5 = size;
                        c4 = 2;
                        colorStateList = iconCompat.f501g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f502h;
                        if (mode != IconCompat.f495k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 6:
                        if (Build.VERSION.SDK_INT < 30) {
                            androidx.fragment.app.q.u(iconCompat.c(), "Context is required to resolve the file uri of the icon: ");
                            throw null;
                        }
                        iconCreateWithBitmap = c0.b.b(iconCompat.c());
                        arrayList2 = arrayList6;
                        arrayList3 = arrayList7;
                        i5 = size;
                        c4 = 2;
                        colorStateList = iconCompat.f501g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f502h;
                        if (mode != IconCompat.f495k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                        break;
                }
            } else {
                arrayList5 = arrayList5;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
                i5 = size;
                c4 = 2;
                iconCreateWithBitmap = null;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCreateWithBitmap, iVar.f, iVar.f1013g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z4);
            builder2.setAllowGeneratedReplies(z4);
            bundle2.putInt("android.support.action.semanticAction", i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                b0.k.a(builder2);
            }
            if (i12 >= 29) {
                b0.f.d(builder2);
            }
            if (i12 >= 31) {
                b0.l.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", iVar.f1011d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f578b).addAction(builder2.build());
            i8 = i9;
            arrayList5 = arrayList5;
            arrayList7 = arrayList3;
            size = i5;
            arrayList6 = arrayList2;
            i7 = 0;
        }
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = arrayList6;
        Bundle bundle3 = jVar.f1024l;
        if (bundle3 != null) {
            ((Bundle) this.f580d).putAll(bundle3);
        }
        ((Notification.Builder) this.f578b).setShowWhen(jVar.f1021i);
        ((Notification.Builder) this.f578b).setLocalOnly(jVar.f1023k);
        ((Notification.Builder) this.f578b).setGroup(null);
        ((Notification.Builder) this.f578b).setSortKey(null);
        ((Notification.Builder) this.f578b).setGroupSummary(false);
        ((Notification.Builder) this.f578b).setCategory(null);
        ((Notification.Builder) this.f578b).setColor(0);
        ((Notification.Builder) this.f578b).setVisibility(0);
        ((Notification.Builder) this.f578b).setPublicVersion(null);
        ((Notification.Builder) this.f578b).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList8 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList8.size());
                Iterator it = arrayList8.iterator();
                if (it.hasNext()) {
                    throw androidx.fragment.app.u.j(it);
                }
            }
            if (arrayList != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList;
                } else {
                    p.g gVar = new p.g(arrayList4.size() + arrayList.size());
                    gVar.addAll(arrayList);
                    gVar.addAll(arrayList4);
                    arrayList4 = new ArrayList(gVar);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            int size2 = arrayList4.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList4.get(i13);
                i13++;
                ((Notification.Builder) this.f578b).addPerson((String) obj2);
            }
        }
        if (arrayList9.size() > 0) {
            if (jVar.f1024l == null) {
                jVar.f1024l = new Bundle();
            }
            Bundle bundle4 = jVar.f1024l.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i14 = 0;
            while (i14 < arrayList9.size()) {
                String string = Integer.toString(i14);
                ArrayList arrayList10 = arrayList9;
                b0.i iVar2 = (b0.i) arrayList10.get(i14);
                Bundle bundle7 = new Bundle();
                if (iVar2.f1009b == null && (i4 = iVar2.f1012e) != 0) {
                    iVar2.f1009b = IconCompat.a(i4);
                }
                IconCompat iconCompat2 = iVar2.f1009b;
                Bundle bundle8 = iVar2.f1008a;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.b() : 0);
                bundle7.putCharSequence("title", iVar2.f);
                bundle7.putParcelable("actionIntent", iVar2.f1013g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", iVar2.f1010c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", iVar2.f1011d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i14++;
                arrayList9 = arrayList10;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (jVar.f1024l == null) {
                jVar.f1024l = new Bundle();
            }
            jVar.f1024l.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f580d).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.f578b).setExtras(jVar.f1024l);
        ((Notification.Builder) this.f578b).setRemoteInputHistory(null);
        ((Notification.Builder) this.f578b).setBadgeIconType(0);
        ((Notification.Builder) this.f578b).setSettingsText(null);
        ((Notification.Builder) this.f578b).setShortcutId(null);
        ((Notification.Builder) this.f578b).setTimeoutAfter(0L);
        ((Notification.Builder) this.f578b).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(jVar.f1025m)) {
            ((Notification.Builder) this.f578b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 28) {
            Iterator it2 = arrayList8.iterator();
            if (it2.hasNext()) {
                throw androidx.fragment.app.u.j(it2);
            }
        }
        if (i15 >= 29) {
            b0.f.b((Notification.Builder) this.f578b, jVar.n);
            b0.f.c((Notification.Builder) this.f578b);
        }
        if (i15 >= 36) {
            b0.m.a((Notification.Builder) this.f578b);
        }
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z4) {
        b0[] b0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (b0VarArr = (b0[]) editable.getSpans(selectionStart, selectionEnd, b0.class)) != null && b0VarArr.length > 0) {
                for (b0 b0Var : b0VarArr) {
                    int spanStart = editable.getSpanStart(b0Var);
                    int spanEnd = editable.getSpanEnd(b0Var);
                    if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static t s(int i4, int i5, Context context, AttributeSet attributeSet, int[] iArr) {
        return new t(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    public static t t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new t(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public void a(View view, int i4, boolean z4) {
        RecyclerView recyclerView = ((k1.a0) this.f578b).f2729a;
        int childCount = i4 < 0 ? recyclerView.getChildCount() : l(i4);
        ((k1.b) this.f579c).e(childCount, z4);
        if (z4) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z4) {
        RecyclerView recyclerView = ((k1.a0) this.f578b).f2729a;
        int childCount = i4 < 0 ? recyclerView.getChildCount() : l(i4);
        ((k1.b) this.f579c).e(childCount, z4);
        if (z4) {
            p(view);
        }
        x0 x0VarI = RecyclerView.I(view);
        if (x0VarI != null) {
            if (!x0VarI.j() && !x0VarI.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + x0VarI + recyclerView.y());
            }
            x0VarI.f2953j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i4) {
        x0 x0VarI;
        int iL = l(i4);
        ((k1.b) this.f579c).f(iL);
        RecyclerView recyclerView = ((k1.a0) this.f578b).f2729a;
        View childAt = recyclerView.getChildAt(iL);
        if (childAt != null && (x0VarI = RecyclerView.I(childAt)) != null) {
            if (x0VarI.j() && !x0VarI.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + x0VarI + recyclerView.y());
            }
            x0VarI.a(256);
        }
        recyclerView.detachViewFromParent(iL);
    }

    public p0 e(String str, Class cls) {
        p0 p0VarC;
        s0 s0Var = (s0) this.f579c;
        t0 t0Var = (t0) this.f578b;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = t0Var.f861a;
        p0 p0Var = (p0) linkedHashMap.get(str);
        if (!cls.isInstance(p0Var)) {
            f1.c cVar = new f1.c((f1.b) this.f580d);
            cVar.f2088a.put(q0.f857g, str);
            try {
                p0VarC = s0Var.l(cls, cVar);
            } catch (AbstractMethodError unused) {
                p0VarC = s0Var.c(cls);
            }
            p0VarC.getClass();
            p0 p0Var2 = (p0) linkedHashMap.put(str, p0VarC);
            if (p0Var2 != null) {
                p0Var2.b();
            }
            return p0VarC;
        }
        n0 n0Var = s0Var instanceof n0 ? (n0) s0Var : null;
        if (n0Var != null) {
            p0Var.getClass();
            androidx.lifecycle.o oVar = n0Var.f849i;
            if (oVar != null) {
                l1.c cVar2 = n0Var.f850j;
                cVar2.getClass();
                k0.a(p0Var, cVar2, oVar);
            }
        }
        p0Var.getClass();
        return p0Var;
    }

    public View f(int i4) {
        return ((k1.a0) this.f578b).f2729a.getChildAt(l(i4));
    }

    public int g() {
        return ((k1.a0) this.f578b).f2729a.getChildCount() - ((ArrayList) this.f580d).size();
    }

    public ColorStateList h(int i4) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f579c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (colorStateList = c0.c.getColorStateList((Context) this.f578b, resourceId)) == null) ? typedArray.getColorStateList(i4) : colorStateList;
    }

    public Drawable i(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f579c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) ? typedArray.getDrawable(i4) : h0.w((Context) this.f578b, resourceId);
    }

    public Drawable j(int i4) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.f579c).hasValue(i4) || (resourceId = ((TypedArray) this.f579c).getResourceId(i4, 0)) == 0) {
            return null;
        }
        k.u uVarA = k.u.a();
        Context context = (Context) this.f578b;
        synchronized (uVarA) {
            drawableD = uVarA.f2645a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public Typeface k(int i4, int i5, k.q0 q0Var) {
        int resourceId = ((TypedArray) this.f579c).getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f580d) == null) {
            this.f580d = new TypedValue();
        }
        Context context = (Context) this.f578b;
        TypedValue typedValue = (TypedValue) this.f580d;
        ThreadLocal threadLocal = e0.l.f2031a;
        if (context.isRestricted()) {
            return null;
        }
        return e0.l.a(context, resourceId, typedValue, i5, q0Var, true, false);
    }

    public int l(int i4) {
        k1.b bVar = (k1.b) this.f579c;
        if (i4 < 0) {
            return -1;
        }
        int childCount = ((k1.a0) this.f578b).f2729a.getChildCount();
        int i5 = i4;
        while (i5 < childCount) {
            int iB = i4 - (i5 - bVar.b(i5));
            if (iB == 0) {
                while (bVar.d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += iB;
        }
        return -1;
    }

    public View m(int i4) {
        return ((k1.a0) this.f578b).f2729a.getChildAt(i4);
    }

    public int n() {
        return ((k1.a0) this.f578b).f2729a.getChildCount();
    }

    public boolean o(CharSequence charSequence, int i4, int i5, a0 a0Var) {
        if ((a0Var.f536c & 3) == 0) {
            d dVar = (d) this.f580d;
            a1.a aVarB = a0Var.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f10d).getShort(iA + aVarB.f7a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = d.f541b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i4 < i5) {
                sb.append(charSequence.charAt(i4));
                i4++;
            }
            boolean zHasGlyph = dVar.f542a.hasGlyph(sb.toString());
            int i6 = a0Var.f536c & 4;
            a0Var.f536c = zHasGlyph ? i6 | 2 : i6 | 1;
        }
        return (a0Var.f536c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.f580d).add(view);
        k1.a0 a0Var = (k1.a0) this.f578b;
        x0 x0VarI = RecyclerView.I(view);
        if (x0VarI != null) {
            View view2 = x0VarI.f2945a;
            RecyclerView recyclerView = a0Var.f2729a;
            int i4 = x0VarI.f2959q;
            if (i4 != -1) {
                x0VarI.f2958p = i4;
            } else {
                WeakHashMap weakHashMap = p0.p0.f3233a;
                x0VarI.f2958p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                x0VarI.f2959q = 4;
                recyclerView.f944x0.add(x0VarI);
            } else {
                WeakHashMap weakHashMap2 = p0.p0.f3233a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void q(String str, JSONObject jSONObject) {
        MainActivity mainActivity = (MainActivity) this.f578b;
        if (mainActivity == null || !mainActivity.X.equals((String) mainActivity.E().f595d)) {
            return;
        }
        try {
            mainActivity.V(t2.i.e(str, jSONObject), null);
        } catch (Exception e5) {
            Log.d("androidx.emoji2.text.t", "launchCallbackEvent: ", e5);
        }
    }

    public boolean r(int i4, u.d dVar, x.f fVar) {
        v.b bVar = (v.b) this.f579c;
        int[] iArr = dVar.f3791p0;
        int[] iArr2 = dVar.f3795t;
        bVar.f4228a = iArr[0];
        bVar.f4229b = iArr[1];
        bVar.f4230c = dVar.q();
        bVar.f4231d = dVar.k();
        bVar.f4235i = false;
        bVar.f4236j = i4;
        boolean z4 = bVar.f4228a == 3;
        boolean z5 = bVar.f4229b == 3;
        boolean z6 = z4 && dVar.W > 0.0f;
        boolean z7 = z5 && dVar.W > 0.0f;
        if (z6 && iArr2[0] == 4) {
            bVar.f4228a = 1;
        }
        if (z7 && iArr2[1] == 4) {
            bVar.f4229b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f4232e);
        dVar.L(bVar.f);
        dVar.E = bVar.f4234h;
        dVar.I(bVar.f4233g);
        bVar.f4236j = 0;
        return bVar.f4235i;
    }

    public String toString() {
        switch (this.f577a) {
            case 6:
                return ((k1.b) this.f579c).toString() + ", hidden list:" + ((ArrayList) this.f580d).size();
            default:
                return super.toString();
        }
    }

    public Object u(CharSequence charSequence, int i4, int i5, int i6, boolean z4, q qVar) {
        int i7;
        char c4;
        s sVar = new s((w) ((x) this.f579c).f594c);
        int iCodePointAt = Character.codePointAt(charSequence, i4);
        int i8 = 0;
        boolean zC = true;
        int iCharCount = i4;
        loop0: while (true) {
            i7 = iCharCount;
            while (true) {
                if (iCharCount < i5 && i8 < i6 && zC) {
                    SparseArray sparseArray = sVar.f573c.f589a;
                    w wVar = sparseArray == null ? null : (w) sparseArray.get(iCodePointAt);
                    if (sVar.f571a == 2) {
                        if (wVar != null) {
                            sVar.f573c = wVar;
                            sVar.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                sVar.a();
                            } else if (iCodePointAt != 65039) {
                                w wVar2 = sVar.f573c;
                                if (wVar2.f590b != null) {
                                    if (sVar.f != 1) {
                                        sVar.f574d = wVar2;
                                        sVar.a();
                                    } else if (sVar.b()) {
                                        sVar.f574d = sVar.f573c;
                                        sVar.a();
                                    } else {
                                        sVar.a();
                                    }
                                    c4 = 3;
                                } else {
                                    sVar.a();
                                }
                            }
                            c4 = 1;
                        }
                        c4 = 2;
                    } else if (wVar == null) {
                        sVar.a();
                        c4 = 1;
                    } else {
                        sVar.f571a = 2;
                        sVar.f573c = wVar;
                        sVar.f = 1;
                        c4 = 2;
                    }
                    sVar.f575e = iCodePointAt;
                    if (c4 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i7)) + i7;
                        if (iCharCount >= i5) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c4 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i5) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c4 == 3) {
                        if (!z4 && o(charSequence, i7, iCharCount, sVar.f574d.f590b)) {
                            break;
                        }
                        zC = qVar.c(charSequence, i7, iCharCount, sVar.f574d.f590b);
                        i8++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (sVar.f571a == 2 && sVar.f573c.f590b != null && ((sVar.f > 1 || sVar.b()) && i8 < i6 && zC && (z4 || !o(charSequence, i7, iCharCount, sVar.f573c.f590b)))) {
            qVar.c(charSequence, i7, iCharCount, sVar.f573c.f590b);
        }
        return qVar.a();
    }

    public void v() {
        ((TypedArray) this.f579c).recycle();
    }

    public void w(u.e eVar, int i4, int i5, int i6) {
        eVar.getClass();
        int i7 = eVar.f3768b0;
        int i8 = eVar.f3770c0;
        eVar.f3768b0 = 0;
        eVar.f3770c0 = 0;
        eVar.O(i5);
        eVar.L(i6);
        if (i7 < 0) {
            eVar.f3768b0 = 0;
        } else {
            eVar.f3768b0 = i7;
        }
        if (i8 < 0) {
            eVar.f3770c0 = 0;
        } else {
            eVar.f3770c0 = i8;
        }
        u.e eVar2 = (u.e) this.f580d;
        eVar2.f3805t0 = i4;
        eVar2.U();
    }

    public void x(View view) {
        if (((ArrayList) this.f580d).remove(view)) {
            k1.a0 a0Var = (k1.a0) this.f578b;
            x0 x0VarI = RecyclerView.I(view);
            if (x0VarI != null) {
                RecyclerView recyclerView = a0Var.f2729a;
                int i4 = x0VarI.f2958p;
                if (recyclerView.L()) {
                    x0VarI.f2959q = i4;
                    recyclerView.f944x0.add(x0VarI);
                } else {
                    View view2 = x0VarI.f2945a;
                    WeakHashMap weakHashMap = p0.p0.f3233a;
                    view2.setImportantForAccessibility(i4);
                }
                x0VarI.f2958p = 0;
            }
        }
    }

    public void y(u.e eVar) {
        ArrayList arrayList = (ArrayList) this.f578b;
        arrayList.clear();
        int size = eVar.f3802q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            u.d dVar = (u.d) eVar.f3802q0.get(i4);
            int[] iArr = dVar.f3791p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f3804s0.f4240b = true;
    }

    public t(MainActivity mainActivity) {
        this.f577a = 10;
        this.f579c = new HashMap();
        this.f580d = new ArrayList();
        this.f578b = mainActivity;
    }

    public t(t0 t0Var, s0 s0Var, f1.b bVar) {
        this.f577a = 1;
        t0Var.getClass();
        bVar.getClass();
        this.f578b = t0Var;
        this.f579c = s0Var;
        this.f580d = bVar;
    }

    public t(k1.a0 a0Var) {
        this.f577a = 6;
        this.f578b = a0Var;
        this.f579c = new k1.b();
        this.f580d = new ArrayList();
    }

    public t(NavigationView navigationView) {
        Object cVar;
        this.f577a = 9;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            cVar = new t2.e();
        } else {
            cVar = i4 >= 33 ? new t2.c() : null;
        }
        this.f578b = cVar;
        this.f579c = navigationView;
        this.f580d = navigationView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(t0 t0Var, s0 s0Var) {
        this(t0Var, s0Var, f1.a.f2087b);
        this.f577a = 1;
        t0Var.getClass();
    }

    public /* synthetic */ t() {
        this.f577a = 8;
    }

    public t(Context context, TypedArray typedArray) {
        this.f577a = 5;
        this.f578b = context;
        this.f579c = typedArray;
    }

    public t(Runnable runnable) {
        this.f577a = 7;
        this.f579c = new CopyOnWriteArrayList();
        this.f580d = new HashMap();
        this.f578b = runnable;
    }

    public t(Context context, LocationManager locationManager) {
        this.f577a = 4;
        this.f580d = new e.n0();
        this.f578b = context;
        this.f579c = locationManager;
    }

    public t(Context context) {
        this.f577a = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(t1.l.r(context, R.attr.materialCalendarStyle, com.google.android.material.datepicker.l.class.getCanonicalName()).data, a2.a.f30v);
        this.f578b = a3.h0.w(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        a3.h0.w(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        a3.h0.w(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        a3.h0.w(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListH = t2.i.h(context, typedArrayObtainStyledAttributes, 7);
        this.f579c = a3.h0.w(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        a3.h0.w(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f580d = a3.h0.w(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListH.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public t(u.e eVar) {
        this.f577a = 11;
        this.f578b = new ArrayList();
        this.f579c = new v.b();
        this.f580d = eVar;
    }

    public t(x xVar, a3.f fVar, d dVar, Set set) {
        this.f577a = 0;
        this.f578b = fVar;
        this.f579c = xVar;
        this.f580d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            u(str, 0, str.length(), 1, true, new r(str, 0));
        }
    }
}
