package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends p0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1624e;

    public /* synthetic */ a(ViewGroup viewGroup, int i4) {
        this.f1623d = i4;
        this.f1624e = viewGroup;
    }

    @Override // p0.b
    public final void d(View view, q0.e eVar) {
        switch (this.f1623d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f3378a;
                this.f3167a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                eVar.j(((EditText) view).getText());
                accessibilityNodeInfo.setHintText(((ChipTextInputComboView) this.f1624e).f1605h.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f3378a;
                this.f3167a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) this.f1624e).C.get(iIntValue - 1));
                }
                eVar.h(c3.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
                accessibilityNodeInfo2.setClickable(true);
                eVar.b(q0.c.f3367g);
                break;
        }
    }

    @Override // p0.b
    public boolean g(View view, int i4, Bundle bundle) {
        switch (this.f1623d) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.f1624e;
                ClockHandView clockHandView = clockFaceView.f1607y;
                Rect rect = clockFaceView.f1608z;
                if (i4 != 16) {
                    return super.g(view, i4, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(rect);
                float fCenterX = rect.centerX();
                float fCenterY = rect.centerY();
                clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            default:
                return super.g(view, i4, bundle);
        }
    }
}
