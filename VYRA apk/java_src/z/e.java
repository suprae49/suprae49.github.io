package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f4803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4807e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f4812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f4813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4814m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f4816p;

    public e(Context context, AttributeSet attributeSet) {
        b bVar;
        super(context, attributeSet);
        this.f4804b = false;
        this.f4805c = 0;
        this.f4806d = 0;
        this.f4807e = -1;
        this.f = -1;
        this.f4808g = 0;
        this.f4809h = 0;
        this.f4816p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.a.f4765b);
        this.f4805c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f4806d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f4807e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f4808g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f4809h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f4804b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f465y;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f465y;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.A;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f466z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e5) {
                    throw new RuntimeException("Could not inflate Behavior subclass ".concat(string), e5);
                }
            }
            this.f4803a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f4803a;
        if (bVar2 != null) {
            bVar2.g(this);
        }
    }

    public final boolean a(int i4) {
        if (i4 == 0) {
            return this.f4814m;
        }
        if (i4 != 1) {
            return false;
        }
        return this.n;
    }

    public final void b(b bVar) {
        b bVar2 = this.f4803a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.j();
            }
            this.f4803a = bVar;
            this.f4804b = true;
            if (bVar != null) {
                bVar.g(this);
            }
        }
    }

    public e() {
        super(-2, -2);
        this.f4804b = false;
        this.f4805c = 0;
        this.f4806d = 0;
        this.f4807e = -1;
        this.f = -1;
        this.f4808g = 0;
        this.f4809h = 0;
        this.f4816p = new Rect();
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f4804b = false;
        this.f4805c = 0;
        this.f4806d = 0;
        this.f4807e = -1;
        this.f = -1;
        this.f4808g = 0;
        this.f4809h = 0;
        this.f4816p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4804b = false;
        this.f4805c = 0;
        this.f4806d = 0;
        this.f4807e = -1;
        this.f = -1;
        this.f4808g = 0;
        this.f4809h = 0;
        this.f4816p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4804b = false;
        this.f4805c = 0;
        this.f4806d = 0;
        this.f4807e = -1;
        this.f = -1;
        this.f4808g = 0;
        this.f4809h = 0;
        this.f4816p = new Rect();
    }
}
