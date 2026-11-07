package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import co.median.android.eeqadjy.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k.l3;
import p0.a2;
import p0.b2;
import p0.p0;
import p0.z1;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class q<S> extends androidx.fragment.app.p {
    public boolean A;
    public CharSequence B;
    public CharSequence C;
    public final LinkedHashSet f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f1448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f1450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CalendarConstraints f1451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f1452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f1454m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f1457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1458r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f1459s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1460t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f1461u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1462v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f1463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f1464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CheckableImageButton f1465y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a3.j f1466z;

    public q() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.f1448g = new LinkedHashSet();
    }

    public static int i(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(b0.b());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i4 = month.f1410i;
        return ((i4 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i4) + (dimensionPixelOffset * 2);
    }

    public static boolean j(Context context, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(t1.l.r(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, new int[]{i4});
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z4;
    }

    public final void h() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        androidx.fragment.app.q.c();
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f1449h = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            androidx.fragment.app.q.c();
            return;
        }
        this.f1451j = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            androidx.fragment.app.q.c();
            return;
        }
        this.f1453l = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1454m = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1455o = bundle.getInt("INPUT_MODE_KEY");
        this.f1456p = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1457q = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1458r = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1459s = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f1460t = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1461u = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f1462v = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f1463w = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f1454m;
        if (text == null) {
            text = requireContext().getResources().getText(this.f1453l);
        }
        this.B = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.C = text;
    }

    @Override // androidx.fragment.app.p
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i4 = this.f1449h;
        if (i4 == 0) {
            h();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i4);
        Context context = dialog.getContext();
        this.n = j(context, android.R.attr.windowFullscreen);
        this.f1466z = new a3.j(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a2.a.f30v, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1466z.n(context);
        this.f1466z.r(ColorStateList.valueOf(color));
        this.f1466z.q(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.n ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.n) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(i(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(i(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f1465y = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f1464x = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f1465y.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1465y;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, h0.w(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], h0.w(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1465y.setChecked(this.f1455o != 0);
        p0.m(this.f1465y, null);
        CheckableImageButton checkableImageButton2 = this.f1465y;
        this.f1465y.setContentDescription(this.f1455o == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.f1465y;
        l3.a(this.f1465y, this.f1455o == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.f1465y.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f.h();
                throw null;
            }
        });
        h();
        throw null;
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1448g.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1449h);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints calendarConstraints = this.f1451j;
        b bVar = new b();
        int i4 = b.f1414b;
        int i5 = b.f1414b;
        long j4 = calendarConstraints.f.f1412k;
        long j5 = calendarConstraints.f1401g.f1412k;
        bVar.f1415a = Long.valueOf(calendarConstraints.f1403i.f1412k);
        int i6 = calendarConstraints.f1404j;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.f1402h;
        l lVar = this.f1452k;
        Month month = lVar == null ? null : lVar.f1432i;
        if (month != null) {
            bVar.f1415a = Long.valueOf(month.f1412k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthB = Month.b(j4);
        Month monthB2 = Month.b(j5);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = bVar.f1415a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthB, monthB2, dateValidator2, l4 == null ? null : Month.b(l4.longValue()), i6));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1453l);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1454m);
        bundle.putInt("INPUT_MODE_KEY", this.f1455o);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1456p);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1457q);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1458r);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1459s);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1460t);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1461u);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1462v);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1463w);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.Fragment
    public final void onStart() {
        y yVar;
        y yVar2;
        y yVar3;
        int iD;
        e4.a a2Var;
        e4.a a2Var2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.n) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1466z);
            if (!this.A) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListU = h0.u(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListU != null ? Integer.valueOf(colorStateListU.getDefaultColor()) : null;
                boolean z4 = false;
                boolean z5 = numValueOf == null || numValueOf.intValue() == 0;
                Integer numU = e4.a.u(window.getContext(), android.R.attr.colorBackground);
                int iIntValue = numU != null ? numU.intValue() : -16777216;
                if (z5) {
                    numValueOf = Integer.valueOf(iIntValue);
                }
                e4.a.d0(window, false);
                window.getContext();
                Context context = window.getContext();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 27) {
                    Integer numU2 = e4.a.u(context, android.R.attr.navigationBarColor);
                    iD = f0.b.d(numU2 != null ? numU2.intValue() : -16777216, 128);
                } else {
                    iD = 0;
                }
                if (i4 < 35) {
                    window.setStatusBarColor(0);
                }
                if (i4 < 35) {
                    window.setNavigationBarColor(iD);
                }
                boolean z6 = e4.a.O(0) || e4.a.O(numValueOf.intValue());
                a3.h0 h0Var = new a3.h0(window.getDecorView());
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 35) {
                    a2Var = new b2(window, h0Var);
                } else {
                    a2Var = i5 >= 30 ? new a2(window, h0Var) : new z1(window, h0Var);
                }
                a2Var.c0(z6);
                boolean zO = e4.a.O(iIntValue);
                if (e4.a.O(iD) || (iD == 0 && zO)) {
                    z4 = true;
                }
                a3.h0 h0Var2 = new a3.h0(window.getDecorView());
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 35) {
                    a2Var2 = new b2(window, h0Var2);
                } else {
                    a2Var2 = i6 >= 30 ? new a2(window, h0Var2) : new z1(window, h0Var2);
                }
                a2Var2.b0(z4);
                o oVar = new o(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = p0.f3233a;
                p0.h0.c(viewFindViewById, oVar);
                this.A = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1466z, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new n2.a(requireDialog(), rect));
        }
        requireContext();
        int i7 = this.f1449h;
        if (i7 == 0) {
            h();
            throw null;
        }
        Fragment fragmentB = getChildFragmentManager().B(this.f1455o == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        if (fragmentB instanceof y) {
            yVar3 = (y) fragmentB;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            if (this.f1455o == 1) {
                yVar = yVar3;
                h();
                CalendarConstraints calendarConstraints = this.f1451j;
                r rVar = new r();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i7);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
                rVar.setArguments(bundle);
                yVar2 = rVar;
            } else {
                yVar = yVar3;
                h();
                CalendarConstraints calendarConstraints2 = this.f1451j;
                l lVar = new l();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i7);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", calendarConstraints2.f1403i);
                lVar.setArguments(bundle2);
                this.f1452k = lVar;
                yVar2 = lVar;
            }
            yVar = yVar2;
        }
        yVar = yVar3;
        this.f1450i = yVar;
        yVar.g(new p());
        this.f1464x.setText((this.f1455o == 1 && getResources().getConfiguration().orientation == 2) ? this.C : this.B);
        h();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f1450i.f.clear();
        super.onStop();
    }
}
