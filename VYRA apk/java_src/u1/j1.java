package u1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends ArrayAdapter {
    public final boolean f;

    public j1(Context context, ArrayList arrayList, boolean z4) {
        super(context, 0, arrayList);
        this.f = z4;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.overflow_menu_item, viewGroup, false);
        }
        JSONObject jSONObject = (JSONObject) getItem(i4);
        TextView textView = (TextView) view.findViewById(R.id.overFlowItemTextView);
        ImageView imageView = (ImageView) view.findViewById(R.id.overFlowItemDrawable);
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("label");
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.action_menu_icon_size);
            int color = c0.c.getColor(getContext(), R.color.titleTextColor);
            textView.setText(strOptString);
            if (this.f) {
                String strOptString2 = jSONObject.optString("icon");
                strOptString2.getClass();
                if (y3.j.w(strOptString2)) {
                    imageView.setVisibility(4);
                    return view;
                }
                Context context = getContext();
                context.getClass();
                imageView.setImageDrawable(new v1.b(context, dimensionPixelSize, color, strOptString2).d());
                imageView.setVisibility(0);
                return view;
            }
            imageView.setVisibility(8);
        }
        return view;
    }
}
