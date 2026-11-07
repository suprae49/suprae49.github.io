package com.google.android.material.datepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends p0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1423d;

    public /* synthetic */ e(int i4) {
        this.f1423d = i4;
    }

    @Override // p0.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1423d) {
            case 4:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p0.b
    public final void d(View view, q0.e eVar) {
        int scrollRange;
        int i4 = this.f1423d;
        View.AccessibilityDelegate accessibilityDelegate = this.f3167a;
        switch (i4) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f3378a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f3378a);
                eVar.i(false);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f3378a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = eVar.f3378a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setVisibleToUser(false);
                break;
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f3378a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                eVar.g(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    eVar.i(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        eVar.b(q0.c.f3369i);
                        eVar.b(q0.c.f3372l);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        eVar.b(q0.c.f3368h);
                        eVar.b(q0.c.f3373m);
                    }
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = eVar.f3378a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                WeakHashMap weakHashMap = p0.f3233a;
                if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
                    accessibilityNodeInfo4.setParent(null);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    @Override // p0.b
    public boolean g(View view, int i4, Bundle bundle) {
        int iMin;
        switch (this.f1423d) {
            case 4:
                if (super.g(view, i4, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i4 == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), true, iMin - nestedScrollView.getScrollY());
                            return true;
                        }
                    } else if (i4 == 8192 || i4 == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), true, iMax - nestedScrollView.getScrollY());
                            return true;
                        }
                    } else if (i4 == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), true, iMin - nestedScrollView.getScrollY());
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.g(view, i4, bundle);
        }
    }
}
