package u1;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f4149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4150h;

    public /* synthetic */ z(KeyEvent.Callback callback, Object obj, int i4) {
        this.f = i4;
        this.f4149g = callback;
        this.f4150h = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        int i5 = this.f;
        Object obj = this.f4150h;
        KeyEvent.Callback callback = this.f4149g;
        switch (i5) {
            case 0:
                ((JsPromptResult) obj).confirm(((EditText) callback).getText().toString());
                break;
            default:
                MainActivity mainActivity = (MainActivity) callback;
                int i6 = MainActivity.G0;
                String str = (String) ((ArrayList) obj).get(i4);
                if (!Objects.equals(str, mainActivity.getString(R.string.action_copy))) {
                    if (Objects.equals(str, mainActivity.getString(R.string.action_open_browser))) {
                        mainActivity.P(Uri.parse(mainActivity.B0));
                    }
                    break;
                } else {
                    String str2 = mainActivity.B0;
                    if (!str2.isEmpty()) {
                        ((ClipboardManager) mainActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy", str2));
                        break;
                    }
                }
                break;
        }
    }
}
