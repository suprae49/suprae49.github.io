package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import co.median.android.eeqadjy.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class p1 extends ListView {
    public final Rect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n1 f2606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2607m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t0.c f2609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d3.d0 f2610q;

    public p1(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f = new Rect();
        this.f2601g = 0;
        this.f2602h = 0;
        this.f2603i = 0;
        this.f2604j = 0;
        this.n = z4;
        setCacheColorHint(0);
    }

    public final int a(int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i4, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i5) {
                return i5;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0180  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean b(MotionEvent motionEvent, int i4) {
        boolean z4;
        boolean zA;
        View childAt;
        View childAt2;
        t0.c cVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z5 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z4 = true;
            } else if (actionMasked != 3) {
                z4 = true;
                z5 = false;
            } else {
                z4 = false;
                z5 = false;
            }
            if (z4 || z5) {
                this.f2608o = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f2605k - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            cVar = this.f2609p;
            if (z4) {
                if (cVar == null) {
                    this.f2609p = new t0.c(this);
                }
                t0.c cVar2 = this.f2609p;
                boolean z6 = cVar2.f3694u;
                cVar2.f3694u = true;
                cVar2.onTouch(this, motionEvent);
            } else if (cVar != null) {
                if (cVar.f3694u) {
                    cVar.d();
                }
                cVar.f3694u = false;
            }
            return z4;
        }
        z4 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i4);
        if (iFindPointerIndex < 0) {
            z4 = false;
            z5 = false;
        } else {
            int x4 = (int) motionEvent.getX(iFindPointerIndex);
            int y4 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x4, y4);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x4;
                float f4 = y4;
                this.f2608o = true;
                k1.a(this, f, f4);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i5 = this.f2605k;
                if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f2605k = iPointToPosition;
                k1.a(childAt3, f - childAt3.getLeft(), f4 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z7 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z7) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f;
                rect.set(left, top, right, bottom);
                rect.left -= this.f2601g;
                rect.top -= this.f2602h;
                rect.right += this.f2603i;
                rect.bottom += this.f2604j;
                if (Build.VERSION.SDK_INT >= 33) {
                    zA = m1.a(this);
                } else {
                    Field field = o1.f2598a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z8 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        m1.b(this, z8);
                    } else {
                        Field field2 = o1.f2598a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z8));
                            } catch (IllegalAccessException e6) {
                                e6.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z7) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f4);
                }
                n1 n1Var = this.f2606l;
                if (n1Var != null) {
                    n1Var.f2591g = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z5 = false;
                z4 = true;
            }
        }
        if (z4) {
            this.f2608o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2605k - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f2608o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2605k - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        cVar = this.f2609p;
        if (z4) {
            if (cVar == null) {
                this.f2609p = new t0.c(this);
            }
            t0.c cVar3 = this.f2609p;
            boolean z9 = cVar3.f3694u;
            cVar3.f3694u = true;
            cVar3.onTouch(this, motionEvent);
        } else if (cVar != null) {
            if (cVar.f3694u) {
                cVar.d();
            }
            cVar.f3694u = false;
        }
        return z4;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2610q != null) {
            return;
        }
        super.drawableStateChanged();
        n1 n1Var = this.f2606l;
        if (n1Var != null) {
            n1Var.f2591g = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2608o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.n && this.f2607m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2610q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2610q == null) {
            d3.d0 d0Var = new d3.d0(4, this);
            this.f2610q = d0Var;
            post(d0Var);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !l1.f2584d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        l1.f2581a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        l1.f2582b.invoke(this, Integer.valueOf(iPointToPosition));
                        l1.f2583c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e5) {
                        e5.printStackTrace();
                    } catch (InvocationTargetException e6) {
                        e6.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2608o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2605k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        d3.d0 d0Var = this.f2610q;
        if (d0Var != null) {
            p1 p1Var = (p1) d0Var.f1697g;
            p1Var.f2610q = null;
            p1Var.removeCallbacks(d0Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f2607m = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        n1 n1Var = null;
        if (drawable != null) {
            n1 n1Var2 = new n1();
            Drawable drawable2 = n1Var2.f;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            n1Var2.f = drawable;
            drawable.setCallback(n1Var2);
            n1Var2.f2591g = true;
            n1Var = n1Var2;
        }
        this.f2606l = n1Var;
        super.setSelector(n1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2601g = rect.left;
        this.f2602h = rect.top;
        this.f2603i = rect.right;
        this.f2604j = rect.bottom;
    }
}
