package w0;

import a3.h0;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f4410h;

    public a(b bVar) {
        this.f4410h = bVar;
    }

    @Override // a3.h0
    public final boolean A(int i4, int i5, Bundle bundle) {
        int i6;
        b bVar = this.f4410h;
        Chip chip = bVar.f4417i;
        if (i4 == -1) {
            return chip.performAccessibilityAction(i5, bundle);
        }
        if (i5 == 1) {
            return bVar.q(i4);
        }
        if (i5 == 2) {
            return bVar.j(i4);
        }
        boolean z4 = false;
        if (i5 == 64) {
            AccessibilityManager accessibilityManager = bVar.f4416h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i6 = bVar.f4419k) == i4) {
                return false;
            }
            if (i6 != Integer.MIN_VALUE) {
                bVar.f4419k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.r(i6, 65536);
            }
            bVar.f4419k = i4;
            chip.invalidate();
            bVar.r(i4, 32768);
            return true;
        }
        if (i5 == 128) {
            if (bVar.f4419k != i4) {
                return false;
            }
            bVar.f4419k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.r(i4, 65536);
            return true;
        }
        Chip chip2 = ((l2.c) bVar).f3016q;
        if (i5 == 16) {
            if (i4 == 0) {
                return chip2.performClick();
            }
            if (i4 == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f1388m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z4 = true;
                }
                if (chip2.f1398x) {
                    chip2.f1397w.r(1, 1);
                }
            }
        }
        return z4;
    }

    @Override // a3.h0
    public final q0.e x(int i4) {
        return new q0.e(AccessibilityNodeInfo.obtain(this.f4410h.n(i4).f3378a));
    }

    @Override // a3.h0
    public final q0.e y(int i4) {
        b bVar = this.f4410h;
        int i5 = i4 == 2 ? bVar.f4419k : bVar.f4420l;
        if (i5 == Integer.MIN_VALUE) {
            return null;
        }
        return x(i5);
    }
}
