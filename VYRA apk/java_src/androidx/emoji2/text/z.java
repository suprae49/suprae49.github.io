package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends SpannableStringBuilder {
    public final Class f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f597g;

    public z(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f597g = new ArrayList();
        h0.g(cls, "watcherClass cannot be null");
        this.f = cls;
    }

    public final void a() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f597g;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i4)).f596g.incrementAndGet();
            i4++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f597g;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i4)).onTextChanged(this, 0, length(), length());
            i4++;
        }
    }

    public final y c(Object obj) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f597g;
            if (i4 >= arrayList.size()) {
                return null;
            }
            y yVar = (y) arrayList.get(i4);
            if (yVar.f == obj) {
                return yVar;
            }
            i4++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i4, int i5) {
        super.delete(i4, i5);
        return this;
    }

    public final void e() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f597g;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i4)).f596g.decrementAndGet();
            i4++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        y yVarC;
        if (d(obj) && (yVarC = c(obj)) != null) {
            obj = yVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        y yVarC;
        if (d(obj) && (yVarC = c(obj)) != null) {
            obj = yVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        y yVarC;
        if (d(obj) && (yVarC = c(obj)) != null) {
            obj = yVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i4, int i5, Class cls) {
        if (this.f != cls) {
            return super.getSpans(i4, i5, cls);
        }
        y[] yVarArr = (y[]) super.getSpans(i4, i5, y.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, yVarArr.length);
        for (int i6 = 0; i6 < yVarArr.length; i6++) {
            objArr[i6] = yVarArr[i6].f;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i4, int i5, Class cls) {
        if (cls == null || this.f == cls) {
            cls = y.class;
        }
        return super.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        y yVarC;
        if (d(obj)) {
            yVarC = c(obj);
            if (yVarC != null) {
                obj = yVarC;
            }
        } else {
            yVarC = null;
        }
        super.removeSpan(obj);
        if (yVarC != null) {
            this.f597g.remove(yVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence, int i6, int i7) {
        a();
        super.replace(i4, i5, charSequence, i6, i7);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i4, int i5, int i6) {
        if (d(obj)) {
            y yVar = new y(obj);
            this.f597g.add(yVar);
            obj = yVar;
        }
        super.setSpan(obj, i4, i5, i6);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        return new z(this.f, this, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i4, int i5) {
        super.delete(i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i4, CharSequence charSequence, int i5, int i6) {
        super.insert(i4, charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i4, CharSequence charSequence, int i5, int i6) {
        super.insert(i4, charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i4, int i5, CharSequence charSequence, int i6, int i7) {
        replace(i4, i5, charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i4) {
        super.append(charSequence, obj, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence) {
        a();
        super.replace(i4, i5, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i4, int i5, CharSequence charSequence) {
        replace(i4, i5, charSequence);
        return this;
    }

    public z(Class cls, z zVar, int i4, int i5) {
        super(zVar, i4, i5);
        this.f597g = new ArrayList();
        h0.g(cls, "watcherClass cannot be null");
        this.f = cls;
    }
}
