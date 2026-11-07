package com.google.android.material.bottomnavigation;

import a2.a;
import a3.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.emoji2.text.t;
import co.median.android.eeqadjy.R;
import com.google.android.material.navigation.d;
import g2.b;
import g2.c;
import r2.a0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends d {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t tVarG = a0.g(getContext(), attributeSet, a.f15e, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) tVarG.f579c;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        tVarG.v();
        a0.d(this, new f(10));
    }

    @Override // com.google.android.material.navigation.d
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int iMakeMeasureSpec;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i5) == 1073741824 || suggestedMinimumHeight <= 0) {
            iMakeMeasureSpec = i5;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i5), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, iMakeMeasureSpec);
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z4) {
        b bVar = (b) getMenuView();
        if (bVar.f2148k0 != z4) {
            bVar.setItemHorizontalTranslationEnabled(z4);
            getPresenter().f(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(g2.d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
