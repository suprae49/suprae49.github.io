package u1;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends PrintDocumentAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrintDocumentAdapter f3944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f3945b;

    public h1(x xVar, PrintDocumentAdapter printDocumentAdapter) {
        this.f3945b = xVar;
        this.f3944a = printDocumentAdapter;
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onFinish() {
        this.f3944a.onFinish();
        this.f3945b.f4134a = false;
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        this.f3944a.onLayout(printAttributes, printAttributes2, cancellationSignal, layoutResultCallback, bundle);
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onStart() {
        this.f3944a.onStart();
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        this.f3944a.onWrite(pageRangeArr, parcelFileDescriptor, cancellationSignal, writeResultCallback);
    }
}
