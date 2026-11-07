package k;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class w extends EditText implements p0.r {
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f2668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f2669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t0.g f2670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0 f2671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v f2672k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        a3.a(context);
        z2.a(this, getContext());
        o oVar = new o(this);
        this.f = oVar;
        oVar.k(attributeSet, R.attr.editTextStyle);
        u0 u0Var = new u0(this);
        this.f2668g = u0Var;
        u0Var.f(attributeSet, R.attr.editTextStyle);
        u0Var.b();
        c0 c0Var = new c0();
        c0Var.f2497b = this;
        this.f2669h = c0Var;
        this.f2670i = new t0.g();
        c0 c0Var2 = new c0(this);
        this.f2671j = c0Var2;
        c0Var2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c0Var2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private v getSuperCaller() {
        if (this.f2672k == null) {
            this.f2672k = new v(this);
        }
        return this.f2672k;
    }

    @Override // p0.r
    public final p0.f a(p0.f fVar) {
        this.f2670i.getClass();
        return t0.g.a(this, fVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f2668g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return u1.h0.r0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f;
        if (oVar != null) {
            return oVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f;
        if (oVar != null) {
            return oVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2668g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2668g.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f2669h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0Var.f2498c;
        return textClassifier == null ? p0.a((TextView) c0Var.f2497b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrG;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2668g.getClass();
        u0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        u1.h0.N(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrG = p0.p0.g(this)) != null) {
            editorInfo.contentMimeTypes = strArrG;
            inputConnectionOnCreateInputConnection = new r0.a(inputConnectionOnCreateInputConnection, new d3.a0(3, this));
        }
        return this.f2671j.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || i4 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && p0.p0.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = f0.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i4) {
        p0.d dVar;
        p0.c cVar;
        int i5;
        a3.h0 h0Var;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31 || p0.p0.g(this) == null || !(i4 == 16908322 || i4 == 16908337)) {
            return super.onTextContextMenuItem(i4);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i6 >= 31) {
                h0Var = new a3.h0(primaryClip, 1);
            } else {
                dVar = new p0.d();
                dVar.f3179g = primaryClip;
                dVar.f3180h = 1;
            }
            if (i4 == 16908322) {
                cVar = dVar;
                cVar = h0Var;
                i5 = 0;
            } else {
                cVar = dVar;
                cVar = h0Var;
                i5 = 1;
            }
            cVar.v(i5);
            p0.p0.i(this, cVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f;
        if (oVar != null) {
            oVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        o oVar = this.f;
        if (oVar != null) {
            oVar.n(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2668g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f2668g;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u1.h0.s0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f2671j.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2671j.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f;
        if (oVar != null) {
            oVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f;
        if (oVar != null) {
            oVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        u0 u0Var = this.f2668g;
        u0Var.l(colorStateList);
        u0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        u0 u0Var = this.f2668g;
        u0Var.m(mode);
        u0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        u0 u0Var = this.f2668g;
        if (u0Var != null) {
            u0Var.g(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f2669h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f2498c = textClassifier;
        }
    }
}
