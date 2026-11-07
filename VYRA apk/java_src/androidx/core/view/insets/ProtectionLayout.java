package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.k;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.List;
import s0.a;
import s0.e;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f505h = new Object();
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f506g;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f = new ArrayList();
    }

    private e getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof e) {
            return (e) tag;
        }
        e eVar = new e(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, eVar);
        return eVar;
    }

    public final void a() {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        e orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.f506g = new a(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.f506g.f3657a.size() <= 0) {
            return;
        }
        if (this.f506g.f3657a.get(0) != null) {
            q.c();
        } else {
            getContext();
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f505h) {
            a aVar = this.f506g;
            int childCount = getChildCount() - (aVar != null ? aVar.f3657a.size() : 0);
            if (i4 > childCount || i4 < 0) {
                i4 = childCount;
            }
        }
        super.addView(view, i4, layoutParams);
    }

    public final void b() {
        if (this.f506g != null) {
            removeViews(getChildCount() - this.f506g.f3657a.size(), this.f506g.f3657a.size());
            int size = this.f506g.f3657a.size();
            a aVar = this.f506g;
            if (size > 0) {
                throw u.i(0, aVar.f3657a);
            }
            ArrayList arrayList = aVar.f3657a;
            if (!aVar.f3660d) {
                aVar.f3660d = true;
                aVar.f3658b.f3666b.remove(aVar);
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    throw u.i(size2, arrayList);
                }
                arrayList.clear();
            }
            this.f506g = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof e) {
            e eVar = (e) tag;
            if (eVar.f3666b.isEmpty()) {
                eVar.f3665a.post(new k(11, eVar));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<Object> list) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
