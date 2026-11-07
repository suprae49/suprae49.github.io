package e;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import co.median.android.eeqadjy.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final c E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f1897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f1898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f1899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1900e;
    public AlertController$RecycleListView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f1901g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f1903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Message f1905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f1906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f1907m;
    public Message n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f1908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f1909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f1910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NestedScrollView f1911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f1912s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f1913t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f1914u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f1915v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f1916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListAdapter f1917x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f1919z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1902h = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1918y = -1;
    public final com.google.android.material.datepicker.k F = new com.google.android.material.datepicker.k(1, this);

    public e(Context context, g gVar, Window window) {
        this.f1896a = context;
        this.f1897b = gVar;
        this.f1898c = window;
        c cVar = new c();
        cVar.f1857a = new WeakReference(gVar);
        this.E = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, d.a.f1635e, R.attr.alertDialogStyle, 0);
        this.f1919z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.d().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.E.obtainMessage(i4, onClickListener) : null;
        if (i4 == -3) {
            this.f1909p = charSequence;
            this.f1910q = messageObtainMessage;
        } else if (i4 == -2) {
            this.f1907m = charSequence;
            this.n = messageObtainMessage;
        } else if (i4 != -1) {
            androidx.fragment.app.q.q("Button does not exist");
        } else {
            this.f1904j = charSequence;
            this.f1905k = messageObtainMessage;
        }
    }
}
