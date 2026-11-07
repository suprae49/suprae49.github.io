package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Spannable {
    public boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Spannable f543g;

    public d0(Spannable spannable) {
        this.f543g = spannable;
    }

    public final void a() {
        Spannable spannable = this.f543g;
        if (!this.f) {
            if ((Build.VERSION.SDK_INT < 28 ? new a3.f(5) : new c0(5)).q(spannable)) {
                this.f543g = new SpannableString(spannable);
            }
        }
        this.f = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.f543g.charAt(i4);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f543g.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f543g.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f543g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f543g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f543g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i4, int i5, Class cls) {
        return this.f543g.getSpans(i4, i5, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f543g.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f543g.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f543g.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i4, int i5, int i6) {
        a();
        this.f543g.setSpan(obj, i4, i5, i6);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        return this.f543g.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f543g.toString();
    }
}
