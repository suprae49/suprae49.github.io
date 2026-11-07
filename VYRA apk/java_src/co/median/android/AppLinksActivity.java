package co.median.android;

import android.content.Intent;
import android.os.Bundle;
import e.j;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class AppLinksActivity extends j {
    @Override // androidx.fragment.app.e0, androidx.activity.q, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
        if (getIntent().getData() != null) {
            intent.setData(getIntent().getData());
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(872415232);
            intent.putExtra("source", "app_links");
        }
        startActivity(intent);
        finish();
    }
}
