package b0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f1015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f1016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f1017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f1018e;
    public CharSequence f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f1019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.emoji2.text.p f1022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f1024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f1025m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Notification f1026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f1027p;

    public static CharSequence a(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void b(androidx.emoji2.text.p pVar) {
        if (this.f1022j != pVar) {
            this.f1022j = pVar;
            if (((j) pVar.f568g) != this) {
                pVar.f568g = this;
                b(pVar);
            }
        }
    }
}
