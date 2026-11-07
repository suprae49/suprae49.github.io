package b1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.k;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3.f f1034b;

    public b(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        a3.f fVar = new a3.f(6);
        super(inputConnection, false);
        this.f1033a = textView;
        this.f1034b = fVar;
        if (k.f554k != null) {
            k kVarA = k.a();
            if (kVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar2 = kVarA.f559e;
            fVar2.getClass();
            Bundle bundle = editorInfo.extras;
            a1.b bVar = (a1.b) fVar2.f547c.f592a;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f10d).getInt(iA + bVar.f7a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i5) {
        Editable editableText = this.f1033a.getEditableText();
        this.f1034b.getClass();
        return a3.f.o(this, editableText, i4, i5, false) || super.deleteSurroundingText(i4, i5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        Editable editableText = this.f1033a.getEditableText();
        this.f1034b.getClass();
        return a3.f.o(this, editableText, i4, i5, true) || super.deleteSurroundingTextInCodePoints(i4, i5);
    }
}
