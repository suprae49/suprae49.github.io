package e;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p0.t1;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements j.x, r2.c0 {
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1937g;

    public k0(BottomSheetBehavior bottomSheetBehavior, boolean z4) {
        this.f1937g = bottomSheetBehavior;
        this.f = z4;
    }

    @Override // j.x
    public void a(j.m mVar, boolean z4) {
        androidx.appcompat.widget.b bVar;
        l0 l0Var = (l0) this.f1937g;
        if (this.f) {
            return;
        }
        this.f = true;
        ActionMenuView actionMenuView = l0Var.f1939e.f2562a.f;
        if (actionMenuView != null && (bVar = actionMenuView.f330y) != null) {
            bVar.c();
            k.g gVar = bVar.f424z;
            if (gVar != null && gVar.b()) {
                gVar.f2449j.dismiss();
            }
        }
        l0Var.f.onPanelClosed(108, mVar);
        this.f = false;
    }

    public boolean b() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    public boolean c(CharSequence charSequence, int i4) {
        if (charSequence == null || i4 < 0 || charSequence.length() - i4 < 0) {
            throw new IllegalArgumentException();
        }
        n0.e eVar = (n0.e) this.f1937g;
        if (eVar == null) {
            return b();
        }
        eVar.getClass();
        char c4 = 0;
        c4 = 2;
        for (int i5 = 0; i5 < i4 && c4 == 2; i5++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i5));
            k0 k0Var = n0.f.f3086a;
            if (directionality == 0) {
                c4 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c4 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c4 = 2;
                        continue;
                }
            }
        }
        if (c4 == 0) {
            return true;
        }
        if (c4 != 1) {
            return b();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    @Override // r2.c0
    public y1 d(View view, y1 y1Var, r2.d0 d0Var) {
        boolean z4;
        t1 t1Var = y1Var.f3268a;
        f0.c cVarH = t1Var.h(519);
        f0.c cVarH2 = t1Var.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1937g;
        boolean z5 = bottomSheetBehavior.f1330u;
        int i4 = cVarH.f2068b;
        int i5 = cVarH.f2069c;
        int i6 = cVarH.f2067a;
        bottomSheetBehavior.C = i4;
        boolean z6 = true;
        boolean z7 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (z5) {
            int iA = y1Var.a();
            bottomSheetBehavior.B = iA;
            paddingBottom = iA + d0Var.f3551d;
        }
        if (bottomSheetBehavior.f1331v) {
            paddingLeft = (z7 ? d0Var.f3550c : d0Var.f3548a) + i6;
        }
        if (bottomSheetBehavior.f1332w) {
            paddingRight = (z7 ? d0Var.f3548a : d0Var.f3550c) + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f1334y || marginLayoutParams.leftMargin == i6) {
            z4 = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z4 = true;
        }
        if (bottomSheetBehavior.f1335z && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z4 = true;
        }
        if (bottomSheetBehavior.A) {
            int i7 = marginLayoutParams.topMargin;
            int i8 = cVarH.f2068b;
            if (i7 != i8) {
                marginLayoutParams.topMargin = i8;
            } else {
                z6 = z4;
            }
        } else {
            z6 = z4;
        }
        if (z6) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z8 = this.f;
        if (z8) {
            bottomSheetBehavior.f1328s = cVarH2.f2070d;
        }
        if (!z5 && !z8) {
            return y1Var;
        }
        bottomSheetBehavior.Q();
        return y1Var;
    }

    @Override // j.x
    public boolean h(j.m mVar) {
        ((l0) this.f1937g).f.onMenuOpened(108, mVar);
        return true;
    }

    public k0(n0.e eVar, boolean z4) {
        this(eVar);
        this.f = z4;
    }

    public /* synthetic */ k0(Object obj) {
        this.f1937g = obj;
    }
}
