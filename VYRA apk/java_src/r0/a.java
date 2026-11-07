package r0;

import a3.h0;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import d3.a0;
import k.w;
import p0.c;
import p0.d;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f3494a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InputConnection inputConnection, a0 a0Var) {
        super(inputConnection, false);
        this.f3494a = a0Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        Bundle bundle2;
        c h0Var;
        b bVar = inputContentInfo == null ? null : new b(new h0(29, inputContentInfo));
        w wVar = (w) this.f3494a.f1680g;
        if ((i4 & 1) != 0) {
            try {
                ((InputContentInfo) ((h0) bVar.f).f84g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((h0) bVar.f).f84g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e5) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e5);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((h0) bVar.f).f84g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            h0Var = new h0(clipData, 2);
        } else {
            d dVar = new d();
            dVar.f3179g = clipData;
            dVar.f3180h = 2;
            h0Var = dVar;
        }
        h0Var.r(inputContentInfo3.getLinkUri());
        h0Var.setExtras(bundle2);
        if (p0.i(wVar, h0Var.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i4, bundle);
    }
}
