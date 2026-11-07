package l2;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import co.median.android.eeqadjy.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import q0.e;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends w0.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f3016q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f3016q = chip;
    }

    @Override // w0.b
    public final void l(ArrayList arrayList) {
        d dVar;
        arrayList.add(0);
        Rect rect = Chip.B;
        Chip chip = this.f3016q;
        if (!chip.c() || (dVar = chip.f1385j) == null || !dVar.Z || chip.f1388m == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // w0.b
    public final void o(int i4, e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f3378a;
        if (i4 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.B);
            return;
        }
        Chip chip = this.f3016q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        eVar.b(q0.c.f3367g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        eVar.g(Button.class.getName());
    }

    @Override // w0.b
    public final void p(int i4, boolean z4) {
        Chip chip = this.f3016q;
        if (i4 == 1) {
            chip.f1392r = z4;
        }
        d dVar = chip.f1385j;
        boolean z5 = chip.f1392r;
        boolean zV = false;
        if (dVar.f3017a0 != null) {
            zV = dVar.V(z5 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : d.U0);
        }
        if (zV) {
            chip.refreshDrawableState();
        }
    }
}
