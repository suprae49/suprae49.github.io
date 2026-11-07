package a3;

import android.R;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.n0;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import androidx.profileinstaller.ProfileInstallReceiver;
import co.median.android.MainActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.b2;
import k.e3;
import k.i3;
import k.v0;
import p0.a2;
import p0.p0;
import p0.y1;
import p0.z1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class h0 implements androidx.emoji2.text.j, p0.q, q0.n, s0, i1.d, i2.c, b2, j.x, j.k, v0, p0.c, p0.e {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f84g;

    public h0(Window window, View view) {
        this.f = 27;
        h0 h0Var = new h0(view);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            this.f84g = new p0.b2(window, h0Var);
        } else if (i4 >= 30) {
            this.f84g = new a2(window, h0Var);
        } else {
            this.f84g = new z1(window, h0Var);
        }
    }

    public static h0 w(Context context, int i4) {
        u1.h0.e("Cannot create a CalendarItemStyle with a styleResId of 0", i4 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, a2.a.f31w);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListH = t2.i.h(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListH2 = t2.i.h(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListH3 = t2.i.h(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        o oVarA = o.f(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new h0(colorStateListH, colorStateListH2, colorStateListH3, dimensionPixelSize, oVarA, rect);
    }

    public boolean A(int i4, int i5, Bundle bundle) {
        return false;
    }

    public void B() {
        View viewFindViewById;
        View view = (View) this.f84g;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new p0.x(viewFindViewById, 0));
    }

    @Override // j.x
    public void a(j.m mVar, boolean z4) {
        if (mVar instanceof j.e0) {
            ((j.e0) mVar).f2349z.k().c(false);
        }
        j.x xVar = ((androidx.appcompat.widget.b) this.f84g).f409j;
        if (xVar != null) {
            xVar.a(mVar, z4);
        }
    }

    @Override // p0.e
    public ClipData b() {
        return ((ContentInfo) this.f84g).getClip();
    }

    @Override // p0.c
    public p0.f build() {
        return new p0.f(new h0(((ContentInfo.Builder) this.f84g).build()));
    }

    @Override // p0.q
    public y1 d(View view, y1 y1Var) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f84g;
        y1 y1Var2 = appBarLayout.getFitsSystemWindows() ? y1Var : null;
        if (!Objects.equals(appBarLayout.f1222l, y1Var2)) {
            appBarLayout.f1222l = y1Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.C != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return y1Var;
    }

    @Override // q0.n
    public boolean e(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f84g;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        boolean z4 = view.getLayoutDirection() == 1;
        int i4 = swipeDismissBehavior.f1298i;
        int width = (!(i4 == 0 && z4) && (i4 != 1 || z4)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = p0.f3233a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // k.b2
    public void f(j.m mVar, MenuItem menuItem) {
        ((j.g) this.f84g).f2358l.removeCallbacksAndMessages(mVar);
    }

    @Override // j.x
    public boolean h(j.m mVar) {
        androidx.appcompat.widget.b bVar = (androidx.appcompat.widget.b) this.f84g;
        if (mVar == bVar.f407h) {
            return false;
        }
        bVar.D = ((j.e0) mVar).A.f2408a;
        j.x xVar = bVar.f409j;
        if (xVar != null) {
            return xVar.h(mVar);
        }
        return false;
    }

    @Override // j.k
    public void i(j.m mVar) {
        j.k kVar = ((ActionMenuView) this.f84g).A;
        if (kVar != null) {
            kVar.i(mVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a A[RETURN] */
    @Override // j.k
    public boolean j(j.m mVar, MenuItem menuItem) {
        boolean zOnMenuItemClick;
        k.m mVar2 = ((ActionMenuView) this.f84g).F;
        if (mVar2 != null) {
            Toolbar toolbar = ((e3) mVar2).f;
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.f579c).iterator();
            while (it.hasNext()) {
                if (((n0) it.next()).f730a.o(menuItem)) {
                    zOnMenuItemClick = true;
                    if (zOnMenuItemClick) {
                        return true;
                    }
                }
            }
            i3 i3Var = toolbar.N;
            zOnMenuItemClick = i3Var != null ? i3Var.onMenuItemClick(menuItem) : false;
            if (zOnMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    @Override // k.b2
    public void k(j.m mVar, j.o oVar) {
        j.g gVar = (j.g) this.f84g;
        Handler handler = gVar.f2358l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.n;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (mVar == ((j.f) arrayList.get(i4)).f2351b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            return;
        }
        int i5 = i4 + 1;
        handler.postAtTime(new j.e(this, i5 < arrayList.size() ? (j.f) arrayList.get(i5) : null, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 l(Class cls, f1.c cVar) {
        m0 m0Var = null;
        for (f1.d dVar : (f1.d[]) this.f84g) {
            if (dVar.f2089a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        androidx.fragment.app.q.q("No initializer set for given class ".concat(cls.getName()));
        return null;
    }

    @Override // p0.e
    public int m() {
        return ((ContentInfo) this.f84g).getFlags();
    }

    @Override // i1.d
    public void n() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p0.e
    public ContentInfo o() {
        return (ContentInfo) this.f84g;
    }

    @Override // i1.d
    public void p(int i4, Object obj) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f84g).setResultCode(i4);
    }

    @Override // p0.c
    public void r(Uri uri) {
        ((ContentInfo.Builder) this.f84g).setLinkUri(uri);
    }

    @Override // p0.e
    public int s() {
        return ((ContentInfo) this.f84g).getSource();
    }

    @Override // p0.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f84g).setExtras(bundle);
    }

    public String toString() {
        switch (this.f) {
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return "ContentInfoCompat{" + ((ContentInfo) this.f84g) + "}";
            default:
                return super.toString();
        }
    }

    @Override // androidx.emoji2.text.j
    public void u(u1.h0 h0Var) {
        androidx.emoji2.text.a aVar = new androidx.emoji2.text.a("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.emoji2.text.l(this, h0Var, threadPoolExecutor, 0));
    }

    @Override // p0.c
    public void v(int i4) {
        ((ContentInfo.Builder) this.f84g).setFlags(i4);
    }

    public q0.e x(int i4) {
        return null;
    }

    public q0.e y(int i4) {
        return null;
    }

    public void z() {
        View view = (View) this.f84g;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public /* synthetic */ h0(int i4, Object obj) {
        this.f = i4;
        this.f84g = obj;
    }

    public h0(MainActivity mainActivity) {
        androidx.emoji2.text.p pVar;
        this.f = 21;
        if (Build.VERSION.SDK_INT >= 31) {
            pVar = new m0.i(mainActivity);
        } else {
            pVar = new androidx.emoji2.text.p(mainActivity);
        }
        pVar.j();
        this.f84g = pVar;
    }

    @Override // k.v0
    public void g(int i4) {
    }

    @Override // k.v0
    public void q(int i4) {
    }

    public h0(View view) {
        this.f = 26;
        if (Build.VERSION.SDK_INT >= 30) {
            p0.z zVar = new p0.z(25, view);
            zVar.f3269h = view;
            this.f84g = zVar;
            return;
        }
        this.f84g = new h0(25, view);
    }

    public h0(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i4, o oVar, Rect rect) {
        this.f = 7;
        u1.h0.f(rect.left);
        u1.h0.f(rect.top);
        u1.h0.f(rect.right);
        u1.h0.f(rect.bottom);
        this.f84g = oVar;
    }

    public h0(TextView textView) {
        this.f = 4;
        this.f84g = new b1.g(textView);
    }

    public h0(EditText editText) {
        this.f = 3;
        this.f84g = new androidx.emoji2.text.p(editText);
    }

    public h0() {
        this.f = 28;
        this.f84g = new q0.f(this);
    }

    public /* synthetic */ h0(int i4) {
        this.f = i4;
    }

    public h0(Context context) {
        this.f = 1;
        this.f84g = context.getApplicationContext();
    }

    public h0(ContentInfo contentInfo) {
        this.f = 24;
        contentInfo.getClass();
        this.f84g = com.google.android.gms.common.internal.a.m(contentInfo);
    }

    public h0(ClipData clipData, int i4) {
        this.f = 23;
        this.f84g = com.google.android.gms.common.internal.a.k(clipData, i4);
    }

    @Override // k.v0
    public void t(int i4, float f) {
    }
}
