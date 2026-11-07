package com.google.android.material.datepicker;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import co.median.android.eeqadjy.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.WeakHashMap;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1426e;

    public i(y0.f fVar) {
        this.f1425d = 4;
        this.f1426e = fVar;
        new Rect();
    }

    @Override // p0.b
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1425d) {
            case 4:
                y0.f fVar = (y0.f) this.f1426e;
                if (accessibilityEvent.getEventType() != 32) {
                    return this.f3167a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }
                accessibilityEvent.getText();
                View viewF = fVar.f();
                if (viewF != null) {
                    int i4 = fVar.i(viewF);
                    WeakHashMap weakHashMap = p0.f3233a;
                    Gravity.getAbsoluteGravity(i4, fVar.getLayoutDirection());
                }
                return true;
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // p0.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1425d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1426e).f1507i);
                break;
            case 3:
            default:
                super.c(view, accessibilityEvent);
                break;
            case 4:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
        }
    }

    @Override // p0.b
    public final void d(View view, q0.e eVar) {
        int i4;
        int i5 = this.f1425d;
        Object obj = this.f1426e;
        View.AccessibilityDelegate accessibilityDelegate = this.f3167a;
        switch (i5) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f3378a);
                l lVar = (l) obj;
                eVar.b(new q0.c(16, lVar.f1439q.getVisibility() == 0 ? lVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : lVar.getString(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f3378a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i6 = MaterialButtonToggleGroup.f1359x;
                if (view instanceof MaterialButton) {
                    int i7 = 0;
                    for (int i8 = 0; i8 < materialButtonToggleGroup.getChildCount(); i8++) {
                        if (materialButtonToggleGroup.getChildAt(i8) == view) {
                            i4 = i7;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i8) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i8).getVisibility() != 8) {
                                i7++;
                            }
                        }
                    }
                    i4 = -1;
                } else {
                    i4 = -1;
                }
                eVar.h(c3.f.a(0, 1, i4, 1, false, ((MaterialButton) view).f1357z));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f3378a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1508j);
                accessibilityNodeInfo.setChecked(checkableImageButton.f1507i);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f3378a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo2.setCheckable(navigationMenuItemView.C);
                accessibilityNodeInfo2.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
            default:
                int[] iArr = y0.f.J;
                AccessibilityNodeInfo accessibilityNodeInfo3 = eVar.f3378a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                eVar.g("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo3.setFocusable(false);
                accessibilityNodeInfo3.setFocused(false);
                accessibilityNodeInfo3.removeAction((AccessibilityNodeInfo.AccessibilityAction) q0.c.f3366e.f3374a);
                accessibilityNodeInfo3.removeAction((AccessibilityNodeInfo.AccessibilityAction) q0.c.f.f3374a);
                break;
        }
    }

    @Override // p0.b
    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1425d) {
            case 4:
                int[] iArr = y0.f.J;
                return this.f3167a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            default:
                return super.f(viewGroup, view, accessibilityEvent);
        }
    }

    public /* synthetic */ i(int i4, Object obj) {
        this.f1425d = i4;
        this.f1426e = obj;
    }
}
