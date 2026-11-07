package com.google.android.material.datepicker;

import a3.h0;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h0 f1407g;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        b0.c(null);
        if (q.j(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(co.median.android.eeqadjy.R.id.cancel_button);
            setNextFocusRightId(co.median.android.eeqadjy.R.id.confirm_button);
        }
        this.f = q.j(getContext(), co.median.android.eeqadjy.R.attr.nestedScrollable);
        p0.m(this, new e(2));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        t tVar = (t) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.f1488u;
        if (t1.l.q(context.getTheme(), co.median.android.eeqadjy.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            androidx.emoji2.text.t tVar2 = tVar.f1472g;
            if (tVar2 != null) {
                focusRingDrawable.f1504t.f3470t = (a3.o) ((h0) tVar2.f578b).f84g;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final t b() {
        return (t) super.getAdapter();
    }

    public final boolean c(int i4, boolean z4) {
        h0 h0Var;
        h0 h0Var2;
        int iA = z4 ? ((t) super.getAdapter()).a(i4) : ((t) super.getAdapter()).b(i4);
        if (iA != -1) {
            setSelection(iA);
            return true;
        }
        if (!z4 && (h0Var2 = this.f1407g) != null) {
            return l.h((l) h0Var2.f84g, false);
        }
        if (!z4 || (h0Var = this.f1407g) == null) {
            return true;
        }
        return l.h((l) h0Var.f84g, true);
    }

    public final boolean d(int i4) {
        t tVar = (t) super.getAdapter();
        if (!tVar.e(i4)) {
            long itemId = tVar.getItemId(i4);
            int i5 = 1;
            while (true) {
                if (i5 >= tVar.f.f1410i) {
                    i4 = -1;
                    break;
                }
                int i6 = i4 + i5;
                if ((i6 < t.f1471j && tVar.getItemId(i6) == itemId && tVar.e(i6)) || ((i6 = i4 - i5) >= 0 && tVar.getItemId(i6) == itemId && tVar.e(i6))) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
        }
        if (i4 == -1) {
            return false;
        }
        setSelection(i4);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (t) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((t) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.m
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.a(this.f);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        t tVar = (t) super.getAdapter();
        tVar.getClass();
        int iMax = Math.max(tVar.c(), getFirstVisiblePosition());
        int iMin = Math.min(tVar.f(), getLastVisiblePosition());
        tVar.getItem(iMax);
        tVar.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z4, int i4, Rect rect) {
        int iB;
        if (!z4) {
            super.onFocusChanged(false, i4, rect);
            return;
        }
        if (i4 == 33 || i4 == 1) {
            t tVar = (t) super.getAdapter();
            iB = tVar.b(tVar.f() + 1);
        } else if (i4 == 130 || i4 == 2) {
            t tVar2 = (t) super.getAdapter();
            iB = tVar2.a(tVar2.c() - 1);
        } else {
            iB = -1;
        }
        if (iB != -1) {
            setSelection(iB);
        } else {
            super.onFocusChanged(true, i4, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i4, keyEvent);
        }
        boolean z4 = getLayoutDirection() == 1;
        if (i4 == 21) {
            return c(selectedItemPosition, z4);
        }
        if (i4 == 22) {
            return c(selectedItemPosition, !z4);
        }
        if (i4 == 61) {
            int iB = keyEvent.isShiftPressed() ? ((t) super.getAdapter()).b(selectedItemPosition) : ((t) super.getAdapter()).a(selectedItemPosition);
            if (iB == -1) {
                return false;
            }
            setSelection(iB);
            return true;
        }
        if (!super.onKeyDown(i4, keyEvent)) {
            return false;
        }
        t tVar = (t) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || tVar.e(selectedItemPosition2)) {
            return true;
        }
        t tVar2 = (t) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i4) {
                if (i4 == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > tVar2.f()) {
                            break;
                        }
                        if (!d(numColumns)) {
                            selectedItemPosition2 = getNumColumns();
                        }
                    }
                }
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                selectedItemPosition2 -= numColumns2;
                if (selectedItemPosition2 < tVar2.c()) {
                    return false;
                }
                if (d(selectedItemPosition2)) {
                    break;
                }
                numColumns2 = getNumColumns();
            }
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i4, int i5) {
        if (!this.f) {
            super.onMeasure(i4, i5);
            return;
        }
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof t)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), t.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i4) {
        t tVar = (t) super.getAdapter();
        super.setSelection(Math.max(i4, tVar.a(tVar.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (t) super.getAdapter();
    }
}
