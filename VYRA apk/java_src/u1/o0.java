package u1;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends WebView implements x1.i, p0.m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f4024u = 0;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WebViewClient f4025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WebChromeClient f4026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GestureDetector f4027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f4031m;
    public final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p0.n f4033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m0 f4034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f4035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4037t;

    public o0(Context context) {
        t1.m mVar;
        super(context);
        this.f = getSettings().getUserAgentString();
        this.f4025g = null;
        this.f4026h = null;
        this.f4028j = "";
        this.f4029k = false;
        this.f4031m = new int[2];
        this.n = new int[2];
        this.f4035r = -1.0f;
        this.f4036s = false;
        this.f4037t = false;
        this.f4027i = new GestureDetector(context, new l0(this));
        x1.a aVarU = x1.a.u(context);
        this.f4029k = aVarU.f4682n0 || aVarU.f4685o0;
        this.f4033p = new p0.n(this);
        setNestedScrollingEnabled(true);
        if (e4.a.R("DOCUMENT_START_SCRIPT")) {
            Set setSingleton = Collections.singleton("*");
            WeakHashMap weakHashMap = s1.b.f3670a;
            if (!t1.i.f3712d.b()) {
                androidx.fragment.app.q.t("This method is not supported by the current version of the framework and the current WebView APK");
                throw null;
            }
            if (t1.i.f3713e.b()) {
                WeakHashMap weakHashMap2 = s1.b.f3670a;
                mVar = (t1.m) weakHashMap2.get(this);
                if (mVar == null) {
                    mVar = new t1.m(t1.k.f3715a.b(this));
                    weakHashMap2.put(this, mVar);
                }
            } else {
                mVar = new t1.m(t1.k.f3715a.b(this));
            }
        }
    }

    public final void a(String str) {
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView
    public final boolean canGoForward() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() + 1);
        if (itemAtIndex == null || !"file:///android_asset/offline.html".equals(itemAtIndex.getUrl())) {
            return super.canGoForward();
        }
        return webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() + 2) != null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f4, boolean z4) {
        return this.f4033p.a(f, f4, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f4) {
        return this.f4033p.b(f, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f4033p.c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f4033p.d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // x1.i
    public String getDefaultUserAgent() {
        return this.f;
    }

    public int getMaxHorizontalScroll() {
        return computeHorizontalScrollRange() - getWidth();
    }

    @Deprecated
    public n0 getOnSwipeListener() {
        return null;
    }

    public int getWebViewScrollX() {
        return getScrollX();
    }

    public int getWebViewScrollY() {
        return getScrollY();
    }

    @Override // android.webkit.WebView
    public final void goBack() {
        WebHistoryItem itemAtIndex;
        int currentIndex;
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
            int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex() - 1;
            while (true) {
                if (currentIndex2 < 0) {
                    itemAtIndex = null;
                    currentIndex = 0;
                    break;
                } else {
                    itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex2);
                    if (!itemAtIndex.getUrl().equals("file:///android_asset/offline.html")) {
                        currentIndex = currentIndex2 - webBackForwardListCopyBackForwardList.getCurrentIndex();
                        break;
                    }
                    currentIndex2--;
                }
            }
            if (itemAtIndex == null || this.f4025g.shouldOverrideUrlLoading(this, itemAtIndex.getUrl())) {
                return;
            }
            goBackOrForward(currentIndex);
        } catch (Exception unused) {
            super.goBack();
        }
    }

    @Override // android.webkit.WebView
    public final void goForward() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() + 1);
        if (itemAtIndex == null || !"file:///android_asset/offline.html".equals(itemAtIndex.getUrl())) {
            super.goForward();
        } else if (webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() + 2) != null) {
            goBackOrForward(2);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4033p.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4033p.f3223d;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        WebViewClient webViewClient;
        if (str == null) {
            return;
        }
        if ("file:///offline.html".equals(str)) {
            str = "file:///android_asset/offline.html";
        }
        if (str.startsWith("javascript:") || (webViewClient = this.f4025g) == null || !webViewClient.shouldOverrideUrlLoading(this, str)) {
            super.loadUrl(str);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        if (this.f4035r < 0.0f) {
            return;
        }
        this.f4036s = getHeight() + i5 >= ((int) (((float) getContentHeight()) * this.f4035r)) + (-10);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f4027i.onTouchEvent(motionEvent);
        if (!this.f4029k || this.f4037t || motionEvent.getPointerCount() > 1) {
            return super.onTouchEvent(motionEvent);
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEventObtain.getActionMasked();
        if (actionMasked == 0) {
            this.f4032o = 0;
        }
        int y4 = (int) motionEventObtain.getY();
        motionEventObtain.offsetLocation(0.0f, this.f4032o);
        if (actionMasked == 0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEventObtain);
            this.f4030l = y4;
            startNestedScroll(2);
            return zOnTouchEvent;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i4 = this.f4030l - y4;
                int[] iArr = this.n;
                int[] iArr2 = this.f4031m;
                if (dispatchNestedPreScroll(0, i4, iArr, iArr2)) {
                    i4 -= iArr[1];
                    int i5 = iArr2[1];
                    this.f4030l = y4 - i5;
                    motionEventObtain.offsetLocation(0.0f, -i5);
                    this.f4032o += iArr2[1];
                }
                int i6 = i4;
                boolean zOnTouchEvent2 = super.onTouchEvent(motionEventObtain);
                if (dispatchNestedScroll(0, iArr2[1], 0, i6, iArr2)) {
                    motionEventObtain.offsetLocation(0.0f, iArr2[1]);
                    int i7 = this.f4032o;
                    int i8 = iArr2[1];
                    this.f4032o = i7 + i8;
                    this.f4030l -= i8;
                }
                return zOnTouchEvent2;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        boolean zOnTouchEvent3 = super.onTouchEvent(motionEventObtain);
        stopNestedScroll();
        return zOnTouchEvent3;
    }

    @Override // android.webkit.WebView
    public final void reload() {
        WebViewClient webViewClient = this.f4025g;
        if (webViewClient == null || !(webViewClient instanceof f0)) {
            super.reload();
            return;
        }
        if (((f0) webViewClient).f3919a.f(this, getUrl(), false)) {
            return;
        }
        super.reload();
    }

    public void setCurrentScale(float f) {
        this.f4035r = f;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        this.f4033p.g(z4);
    }

    public void setOnScrollYEndListener(m0 m0Var) {
        this.f4034q = m0Var;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f4026h = webChromeClient;
        super.setWebChromeClient(webChromeClient);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.f4025g = webViewClient;
        super.setWebViewClient(webViewClient);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.f4033p.h(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f4033p.i(0);
    }

    public void setCheckLoginSignup(boolean z4) {
    }

    @Deprecated
    public void setOnSwipeListener(n0 n0Var) {
    }
}
