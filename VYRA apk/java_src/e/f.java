package e;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class f implements q0.n {
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1920g;

    public f(Context context, int i4) {
        this.f1920g = new b(new ContextThemeWrapper(context, g.f(context, i4)));
        this.f = i4;
    }

    public g a() {
        b bVar = (b) this.f1920g;
        g gVar = new g(bVar.f1841a, this.f);
        View view = bVar.f1845e;
        e eVar = gVar.f1926k;
        if (view != null) {
            eVar.f1916w = view;
        } else {
            CharSequence charSequence = bVar.f1844d;
            if (charSequence != null) {
                eVar.f1899d = charSequence;
                TextView textView = eVar.f1914u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f1843c;
            if (drawable != null) {
                eVar.f1912s = drawable;
                ImageView imageView = eVar.f1913t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f1913t.setImageDrawable(drawable);
                }
            }
        }
        String str = bVar.f;
        if (str != null) {
            eVar.f1900e = str;
            TextView textView2 = eVar.f1915v;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = bVar.f1846g;
        if (charSequence2 != null) {
            eVar.c(-1, charSequence2, bVar.f1847h);
        }
        CharSequence charSequence3 = bVar.f1848i;
        if (charSequence3 != null) {
            eVar.c(-2, charSequence3, bVar.f1849j);
        }
        if (bVar.f1852m != null || bVar.n != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f1842b.inflate(eVar.A, (ViewGroup) null);
            int i4 = bVar.f1855q ? eVar.B : eVar.C;
            ListAdapter dVar = bVar.n;
            if (dVar == null) {
                dVar = new d(bVar.f1841a, i4, R.id.text1, bVar.f1852m);
            }
            eVar.f1917x = dVar;
            eVar.f1918y = bVar.f1856r;
            if (bVar.f1853o != null) {
                alertController$RecycleListView.setOnItemClickListener(new a(bVar, eVar));
            }
            if (bVar.f1855q) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f = alertController$RecycleListView;
        }
        EditText editText = bVar.f1854p;
        if (editText != null) {
            eVar.f1901g = editText;
            eVar.f1902h = false;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(bVar.f1850k);
        j.n nVar = bVar.f1851l;
        if (nVar != null) {
            gVar.setOnKeyListener(nVar);
        }
        return gVar;
    }

    @Override // q0.n
    public boolean e(View view) {
        ((BottomSheetBehavior) this.f1920g).J(this.f);
        return true;
    }

    public f(Context context) {
        this(context, g.f(context, 0));
    }

    public f() {
        this.f = 1;
        this.f1920g = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f = 0;
        this.f1920g = arrayList;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, int i4) {
        this.f1920g = bottomSheetBehavior;
        this.f = i4;
    }
}
