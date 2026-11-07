package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.emoji2.text.p;
import androidx.emoji2.text.t;
import co.median.android.eeqadjy.R;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.material.datepicker.k;
import d3.w;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.WeakHashMap;
import k.l2;
import k.l3;
import k.m2;
import k.n2;
import k.o2;
import k.p2;
import k.q2;
import k.r2;
import k.s2;
import k.t2;
import k.u1;
import k.u2;
import k.v2;
import k.x2;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends LinearLayoutCompat implements i.b {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final u2 f432n0;
    public final ImageView A;
    public final ImageView B;
    public final View C;
    public v2 D;
    public final Rect E;
    public final Rect F;
    public final int[] G;
    public final int[] H;
    public final ImageView I;
    public final Drawable J;
    public final int K;
    public final int L;
    public final Intent M;
    public final Intent N;
    public final CharSequence O;
    public s2 P;
    public View.OnFocusChangeListener Q;
    public View.OnClickListener R;
    public boolean S;
    public boolean T;
    public u0.b U;
    public boolean V;
    public CharSequence W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f433a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f434b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f435c0;
    public boolean d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f436e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public CharSequence f437f0;
    public boolean g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f438h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SearchableInfo f439i0;
    public Bundle j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final m2 f440k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final m2 f441l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final WeakHashMap f442m0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SearchView$SearchAutoComplete f443u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f444v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f447y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f448z;

    static {
        u2 u2Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            u2 u2Var2 = new u2();
            u2Var2.f2659a = null;
            u2Var2.f2660b = null;
            u2Var2.f2661c = null;
            u2.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                u2Var2.f2659a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                u2Var2.f2660b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                u2Var2.f2661c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            u2Var = u2Var2;
        }
        f432n0 = u2Var;
    }

    public e(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.f440k0 = new m2(this, 0);
        this.f441l0 = new m2(this, 1);
        this.f442m0 = new WeakHashMap();
        k kVar = new k(3, this);
        o2 o2Var = new o2(this);
        p2 p2Var = new p2(this);
        w wVar = new w(2, this);
        u1 u1Var = new u1(1, this);
        l2 l2Var = new l2(this);
        int[] iArr = d.a.f1650v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        t tVar = new t(context, typedArrayObtainStyledAttributes);
        p0.l(this, context, iArr, null, typedArrayObtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(21, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f443u = searchView$SearchAutoComplete;
        searchView$SearchAutoComplete.setSearchView(this);
        this.f444v = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f445w = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f446x = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f447y = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f448z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.B = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.I = imageView5;
        viewFindViewById.setBackground(tVar.i(22));
        viewFindViewById2.setBackground(tVar.i(27));
        imageView.setImageDrawable(tVar.i(25));
        imageView2.setImageDrawable(tVar.i(17));
        imageView3.setImageDrawable(tVar.i(12));
        imageView4.setImageDrawable(tVar.i(30));
        imageView5.setImageDrawable(tVar.i(25));
        this.J = tVar.i(24);
        l3.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.K = typedArrayObtainStyledAttributes.getResourceId(28, R.layout.abc_search_dropdown_item_icons_2line);
        this.L = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(kVar);
        imageView3.setOnClickListener(kVar);
        imageView2.setOnClickListener(kVar);
        imageView4.setOnClickListener(kVar);
        searchView$SearchAutoComplete.setOnClickListener(kVar);
        searchView$SearchAutoComplete.addTextChangedListener(l2Var);
        searchView$SearchAutoComplete.setOnEditorActionListener(p2Var);
        searchView$SearchAutoComplete.setOnItemClickListener(wVar);
        searchView$SearchAutoComplete.setOnItemSelectedListener(u1Var);
        searchView$SearchAutoComplete.setOnKeyListener(o2Var);
        searchView$SearchAutoComplete.setOnFocusChangeListener(new n2(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(20, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.O = typedArrayObtainStyledAttributes.getText(15);
        this.W = typedArrayObtainStyledAttributes.getText(23);
        int i4 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        tVar.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.M = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.N = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchView$SearchAutoComplete.getDropDownAnchor());
        this.C = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new f2.a(1, this));
        }
        w(this.S);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        searchView$SearchAutoComplete.setText(charSequence);
        searchView$SearchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f434b0 = true;
        super.clearFocus();
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        searchView$SearchAutoComplete.clearFocus();
        searchView$SearchAutoComplete.setImeVisibility(false);
        this.f434b0 = false;
    }

    public int getImeOptions() {
        return this.f443u.getImeOptions();
    }

    public int getInputType() {
        return this.f443u.getInputType();
    }

    public int getMaxWidth() {
        return this.f435c0;
    }

    public CharSequence getQuery() {
        return this.f443u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.W;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f439i0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.O : getContext().getText(this.f439i0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.L;
    }

    public int getSuggestionRowLayout() {
        return this.K;
    }

    public u0.b getSuggestionsAdapter() {
        return this.U;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f437f0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f439i0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.j0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i4 = Build.VERSION.SDK_INT;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        if (i4 >= 29) {
            q2.a(searchView$SearchAutoComplete);
            return;
        }
        u2 u2Var = f432n0;
        u2Var.getClass();
        u2.a();
        Method method = u2Var.f2659a;
        if (method != null) {
            try {
                method.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        u2Var.getClass();
        u2.a();
        Method method2 = u2Var.f2660b;
        if (method2 != null) {
            try {
                method2.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        if (!TextUtils.isEmpty(searchView$SearchAutoComplete.getText())) {
            searchView$SearchAutoComplete.setText("");
            searchView$SearchAutoComplete.requestFocus();
            searchView$SearchAutoComplete.setImeVisibility(true);
        } else if (this.S) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i4) {
        int position;
        String strH;
        Cursor cursor = this.U.f3846h;
        if (cursor != null && cursor.moveToPosition(i4)) {
            Intent intentJ = null;
            try {
                int i5 = x2.C;
                String strH2 = x2.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f439i0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = x2.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f439i0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = x2.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentJ = j(strH2, strH3 == null ? null : Uri.parse(strH3), x2.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), x2.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e5) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e5);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e6) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e6);
                }
            }
        }
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        searchView$SearchAutoComplete.setImeVisibility(false);
        searchView$SearchAutoComplete.dismissDropDown();
    }

    public final void o(int i4) {
        Editable text = this.f443u.getText();
        Cursor cursor = this.U.f3846h;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i4)) {
            setQuery(text);
            return;
        }
        String strC = this.U.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // i.b
    public final void onActionViewCollapsed() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        searchView$SearchAutoComplete.setText("");
        searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
        this.f437f0 = "";
        clearFocus();
        w(true);
        searchView$SearchAutoComplete.setImeOptions(this.f438h0);
        this.g0 = false;
    }

    @Override // i.b
    public final void onActionViewExpanded() {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        int imeOptions = searchView$SearchAutoComplete.getImeOptions();
        this.f438h0 = imeOptions;
        searchView$SearchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchView$SearchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f440k0);
        post(this.f441l0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
            int[] iArr = this.G;
            searchView$SearchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.H;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchView$SearchAutoComplete.getWidth() + i9;
            int height = searchView$SearchAutoComplete.getHeight() + i8;
            Rect rect = this.E;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i5;
            Rect rect2 = this.F;
            rect2.set(i10, 0, i11, i12);
            v2 v2Var = this.D;
            if (v2Var == null) {
                v2 v2Var2 = new v2(searchView$SearchAutoComplete, rect2, rect);
                this.D = v2Var2;
                setTouchDelegate(v2Var2);
            } else {
                v2Var.f2664b.set(rect2);
                Rect rect3 = v2Var.f2666d;
                rect3.set(rect2);
                int i13 = -v2Var.f2667e;
                rect3.inset(i13, i13);
                v2Var.f2665c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.T) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f435c0;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f435c0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f435c0) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SearchView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SearchView$SavedState searchView$SavedState = (SearchView$SavedState) parcelable;
        super.onRestoreInstanceState(searchView$SavedState.f);
        w(searchView$SavedState.f354h);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SearchView$SavedState searchView$SavedState = new SearchView$SavedState(super.onSaveInstanceState());
        searchView$SavedState.f354h = this.T;
        return searchView$SavedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        post(this.f440k0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        Editable text = searchView$SearchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        s2 s2Var = this.P;
        if (s2Var == null) {
            if (this.f439i0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchView$SearchAutoComplete.setImeVisibility(false);
            searchView$SearchAutoComplete.dismissDropDown();
            return;
        }
        String string = text.toString();
        p pVar = (p) s2Var;
        string.getClass();
        try {
            String strEncode = URLEncoder.encode(string, "UTF-8");
            ((u1.e) pVar.f568g).f3875a.K(((String) pVar.f569h) + strEncode);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f443u.getText());
        int i4 = (!zIsEmpty || (this.S && !this.g0)) ? 0 : 8;
        ImageView imageView = this.A;
        imageView.setVisibility(i4);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i4, Rect rect) {
        if (this.f434b0 || !isFocusable()) {
            return false;
        }
        if (this.T) {
            return super.requestFocus(i4, rect);
        }
        boolean zRequestFocus = this.f443u.requestFocus(i4, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.f443u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f445w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f446x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.j0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            m();
            return;
        }
        w(false);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        searchView$SearchAutoComplete.requestFocus();
        searchView$SearchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.R;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.S == z4) {
            return;
        }
        this.S = z4;
        w(z4);
        t();
    }

    public void setImeOptions(int i4) {
        this.f443u.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f443u.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f435c0 = i4;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.Q = onFocusChangeListener;
    }

    public void setOnQueryTextListener(s2 s2Var) {
        this.P = s2Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.R = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.W = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f433a0 = z4;
        u0.b bVar = this.U;
        if (bVar instanceof x2) {
            ((x2) bVar).f2690u = z4 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z4;
        this.f439i0 = searchableInfo;
        Intent intent = null;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        if (searchableInfo != null) {
            searchView$SearchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchView$SearchAutoComplete.setImeOptions(this.f439i0.getImeOptions());
            int inputType = this.f439i0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f439i0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchView$SearchAutoComplete.setInputType(inputType);
            u0.b bVar = this.U;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f439i0.getSuggestAuthority() != null) {
                x2 x2Var = new x2(getContext(), this, this.f439i0, this.f442m0);
                this.U = x2Var;
                searchView$SearchAutoComplete.setAdapter(x2Var);
                ((x2) this.U).f2690u = this.f433a0 ? 2 : 1;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.f439i0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f439i0.getVoiceSearchLaunchWebSearch()) {
                intent = this.M;
            } else if (this.f439i0.getVoiceSearchLaunchRecognizer()) {
                intent = this.N;
            }
            z4 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.d0 = z4;
        if (z4) {
            searchView$SearchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.T);
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.V = z4;
        w(this.T);
    }

    public void setSuggestionsAdapter(u0.b bVar) {
        this.U = bVar;
        this.f443u.setAdapter(bVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z4 = this.S;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f443u;
        CharSequence charSequence2 = charSequence;
        if (z4 && (drawable = this.J) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchView$SearchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchView$SearchAutoComplete.setHint(charSequence2);
    }

    public final void u() {
        this.f446x.setVisibility(((this.V || this.d0) && !this.T && (this.f448z.getVisibility() == 0 || this.B.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z4) {
        boolean z5 = this.V;
        this.f448z.setVisibility((!z5 || !(z5 || this.d0) || this.T || !hasFocus() || (!z4 && this.d0)) ? 8 : 0);
    }

    public final void w(boolean z4) {
        this.T = z4;
        int i4 = 8;
        int i5 = z4 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f443u.getText());
        this.f447y.setVisibility(i5);
        v(!zIsEmpty);
        this.f444v.setVisibility(z4 ? 8 : 0);
        ImageView imageView = this.I;
        imageView.setVisibility((imageView.getDrawable() == null || this.S) ? 8 : 0);
        r();
        if (this.d0 && !this.T && zIsEmpty) {
            this.f448z.setVisibility(8);
            i4 = 0;
        }
        this.B.setVisibility(i4);
        u();
    }

    public void setOnCloseListener(r2 r2Var) {
    }

    public void setOnSuggestionListener(t2 t2Var) {
    }
}
