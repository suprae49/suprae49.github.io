package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import x.e;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public boolean f;

    public Guideline(Context context) {
        super(context);
        this.f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z4) {
        this.f = z4;
    }

    public void setGuidelineBegin(int i4) {
        e eVar = (e) getLayoutParams();
        if (this.f && eVar.f4500a == i4) {
            return;
        }
        eVar.f4500a = i4;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i4) {
        e eVar = (e) getLayoutParams();
        if (this.f && eVar.f4502b == i4) {
            return;
        }
        eVar.f4502b = i4;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f) {
        e eVar = (e) getLayoutParams();
        if (this.f && eVar.f4504c == f) {
            return;
        }
        eVar.f4504c = f;
        setLayoutParams(eVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
    }
}
