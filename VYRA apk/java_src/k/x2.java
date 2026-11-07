package k;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends u0.b implements View.OnClickListener {
    public static final /* synthetic */ int C = 0;
    public int A;
    public int B;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2683m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LayoutInflater f2684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.appcompat.widget.e f2685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SearchableInfo f2686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f2687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WeakHashMap f2688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2690u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f2691v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2693x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2694y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2695z;

    public x2(Context context, androidx.appcompat.widget.e eVar, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = eVar.getSuggestionRowLayout();
        this.f3845g = true;
        this.f3846h = null;
        this.f = false;
        this.f3847i = -1;
        this.f3848j = new u0.a(this);
        this.f3849k = new y1(1, this);
        this.n = suggestionRowLayout;
        this.f2683m = suggestionRowLayout;
        this.f2684o = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f2690u = 1;
        this.f2692w = -1;
        this.f2693x = -1;
        this.f2694y = -1;
        this.f2695z = -1;
        this.A = -1;
        this.B = -1;
        this.f2685p = eVar;
        this.f2686q = searchableInfo;
        this.f2689t = eVar.getSuggestionCommitIconResId();
        this.f2687r = context;
        this.f2688s = weakHashMap;
    }

    public static String h(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e5);
            return null;
        }
    }

    @Override // u0.b
    public final void a(View view, Cursor cursor) {
        int i4;
        Drawable drawableF;
        CharSequence charSequenceH;
        w2 w2Var = (w2) view.getTag();
        int i5 = this.B;
        int i6 = i5 != -1 ? cursor.getInt(i5) : 0;
        TextView textView = w2Var.f2674a;
        TextView textView2 = w2Var.f2675b;
        ImageView imageView = w2Var.f2678e;
        if (textView != null) {
            String strH = h(cursor, this.f2692w);
            textView.setText(strH);
            if (TextUtils.isEmpty(strH)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f2687r;
        if (textView2 != null) {
            String strH2 = h(cursor, this.f2694y);
            if (strH2 != null) {
                if (this.f2691v == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f2691v = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strH2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2691v, null), 0, strH2.length(), 33);
                charSequenceH = spannableString;
            } else {
                charSequenceH = h(cursor, this.f2693x);
            }
            if (TextUtils.isEmpty(charSequenceH)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceH);
            if (TextUtils.isEmpty(charSequenceH)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = w2Var.f2676c;
        if (imageView2 != null) {
            int i7 = this.f2695z;
            if (i7 == -1) {
                drawableF = null;
            } else {
                drawableF = f(cursor.getString(i7));
                if (drawableF == null) {
                    ComponentName searchActivity = this.f2686q.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f2688s;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableF = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                                    drawableF = null;
                                } else {
                                    drawableF = drawable;
                                }
                            } else {
                                drawableF = null;
                            }
                        } catch (PackageManager.NameNotFoundException e5) {
                            Log.w("SuggestionsAdapter", e5.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableF == null ? null : drawableF.getConstantState());
                    }
                    if (drawableF == null) {
                        drawableF = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawableF);
            if (drawableF == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawableF.setVisible(false, false);
                drawableF.setVisible(true, false);
            }
        }
        ImageView imageView3 = w2Var.f2677d;
        if (imageView3 == null) {
            i4 = 1;
        } else {
            int i8 = this.A;
            Drawable drawableF2 = i8 == -1 ? null : f(cursor.getString(i8));
            imageView3.setImageDrawable(drawableF2);
            if (drawableF2 == null) {
                imageView3.setVisibility(8);
                i4 = 1;
            } else {
                imageView3.setVisibility(0);
                drawableF2.setVisible(false, false);
                i4 = 1;
                drawableF2.setVisible(true, false);
            }
        }
        int i9 = this.f2690u;
        if (i9 != 2 && (i9 != i4 || (i6 & 1) == 0)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // u0.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f2692w = cursor.getColumnIndex("suggest_text_1");
                this.f2693x = cursor.getColumnIndex("suggest_text_2");
                this.f2694y = cursor.getColumnIndex("suggest_text_2_url");
                this.f2695z = cursor.getColumnIndex("suggest_icon_1");
                this.A = cursor.getColumnIndex("suggest_icon_2");
                this.B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e5);
        }
    }

    @Override // u0.b
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f2686q;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // u0.b
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f2684o.inflate(this.f2683m, viewGroup, false);
        viewInflate.setTag(new w2(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f2689t);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            androidx.fragment.app.q.s(uri, "No authority: ");
            return null;
        }
        try {
            Resources resourcesForApplication = this.f2687r.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                androidx.fragment.app.q.s(uri, "No path: ");
                return null;
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    androidx.fragment.app.q.s(uri, "Single path segment is not a resource ID: ");
                    return null;
                }
            } else {
                if (size != 2) {
                    androidx.fragment.app.q.s(uri, "More than two path segments: ");
                    return null;
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            androidx.fragment.app.q.s(uri, "No resource found for: ");
            return null;
        } catch (PackageManager.NameNotFoundException unused2) {
            androidx.fragment.app.q.s(uri, "No package found for authority: ");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.f2688s;
        Context context = this.f2687r;
        Drawable drawableE = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i4 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i4;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = c0.c.getDrawable(context, i4);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableE = e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e5) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e5);
                            }
                            drawableE = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e6) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e6);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e7) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e7.getMessage());
                    if (drawableE != null) {
                        weakHashMap.put(str, drawableE.getConstantState());
                    }
                    return drawableE;
                }
                if (drawableE != null) {
                    weakHashMap.put(str, drawableE.getConstantState());
                }
            }
        }
        return drawableE;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f2687r.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // u0.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewInflate = this.f2684o.inflate(this.n, viewGroup, false);
            if (viewInflate != null) {
                ((w2) viewInflate.getTag()).f2674a.setText(e5.toString());
            }
            return viewInflate;
        }
    }

    @Override // u0.b, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewD = d(viewGroup);
            ((w2) viewD.getTag()).f2674a.setText(e5.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f3846h;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f3846h;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2685p.p((CharSequence) tag);
        }
    }
}
