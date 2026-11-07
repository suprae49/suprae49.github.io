package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements TextWatcher, SpanWatcher {
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f596g = new AtomicInteger(0);

    public y(Object obj) {
        this.f = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        ((TextWatcher) this.f).beforeTextChanged(charSequence, i4, i5, i6);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i4, int i5) {
        if (this.f596g.get() <= 0 || !(obj instanceof b0)) {
            ((SpanWatcher) this.f).onSpanAdded(spannable, obj, i4, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (this.f596g.get() <= 0 || !(obj instanceof b0)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i8 = i4;
                i9 = i6;
            } else {
                if (i4 > i5) {
                    i4 = 0;
                }
                if (i6 > i7) {
                    i8 = i4;
                    i9 = 0;
                } else {
                    i8 = i4;
                    i9 = i6;
                }
            }
            ((SpanWatcher) this.f).onSpanChanged(spannable, obj, i8, i5, i9, i7);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i4, int i5) {
        if (this.f596g.get() <= 0 || !(obj instanceof b0)) {
            ((SpanWatcher) this.f).onSpanRemoved(spannable, obj, i4, i5);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        ((TextWatcher) this.f).onTextChanged(charSequence, i4, i5, i6);
    }
}
