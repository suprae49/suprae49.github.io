package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.emoji2.text.t;
import co.median.android.eeqadjy.R;
import d.a;
import j.m;
import j.o;
import j.z;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {
    public o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RadioButton f268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CheckBox f270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f273m;
    public LinearLayout n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Drawable f278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LayoutInflater f280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f281v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t tVarS = t.s(R.attr.listMenuViewStyle, 0, getContext(), attributeSet, a.f1647s);
        this.f274o = tVarS.i(5);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        this.f275p = typedArray.getResourceId(1, -1);
        this.f277r = typedArray.getBoolean(7, false);
        this.f276q = context;
        this.f278s = tVarS.i(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f279t = typedArrayObtainStyledAttributes.hasValue(0);
        tVarS.v();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f280u == null) {
            this.f280u = LayoutInflater.from(getContext());
        }
        return this.f280u;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f272l;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f273m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f273m.getLayoutParams();
        rect.top = this.f273m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // j.z
    public final void b(o oVar) {
        boolean z4;
        int i4;
        String string;
        boolean z5;
        this.f = oVar;
        boolean zIsVisible = oVar.isVisible();
        m mVar = oVar.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(oVar.f2412e);
        setCheckable(oVar.isCheckable());
        if (mVar.o()) {
            if ((mVar.n() ? oVar.f2416j : oVar.f2414h) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        mVar.n();
        if (z4) {
            o oVar2 = this.f;
            m mVar2 = oVar2.n;
            if (mVar2.o()) {
                if ((mVar2.n() ? oVar2.f2416j : oVar2.f2414h) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                z5 = false;
            }
            i4 = z5 ? 0 : 8;
        }
        if (i4 == 0) {
            TextView textView = this.f271k;
            o oVar3 = this.f;
            m mVar3 = oVar3.n;
            Context context = mVar3.f2384a;
            char c4 = mVar3.n() ? oVar3.f2416j : oVar3.f2414h;
            if (c4 == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i5 = mVar3.n() ? oVar3.f2417k : oVar3.f2415i;
                o.c(i5, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                o.c(i5, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                o.c(i5, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                o.c(i5, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                o.c(i5, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                o.c(i5, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c4 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c4 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c4 != ' ') {
                    sb.append(c4);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f271k.getVisibility() != i4) {
            this.f271k.setVisibility(i4);
        }
        setIcon(oVar.getIcon());
        setEnabled(oVar.isEnabled());
        setSubMenuArrowVisible(oVar.hasSubMenu());
        setContentDescription(oVar.f2422q);
    }

    @Override // j.z
    public o getItemData() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f274o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f269i = textView;
        int i4 = this.f275p;
        if (i4 != -1) {
            textView.setTextAppearance(this.f276q, i4);
        }
        this.f271k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f272l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f278s);
        }
        this.f273m = (ImageView) findViewById(R.id.group_divider);
        this.n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        if (this.f267g != null && this.f277r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f267g.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f268h == null && this.f270j == null) {
            return;
        }
        if ((this.f.f2429x & 4) != 0) {
            if (this.f268h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f268h = radioButton;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f268h;
            view = this.f270j;
        } else {
            if (this.f270j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f270j = checkBox;
                LinearLayout linearLayout2 = this.n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f270j;
            view = this.f268h;
        }
        if (z4) {
            compoundButton.setChecked(this.f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f270j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f268h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f.f2429x & 4) != 0) {
            if (this.f268h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f268h = radioButton;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f268h;
        } else {
            if (this.f270j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f270j = checkBox;
                LinearLayout linearLayout2 = this.n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f270j;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f281v = z4;
        this.f277r = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f273m;
        if (imageView != null) {
            imageView.setVisibility((this.f279t || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f.n;
        boolean z4 = this.f281v;
        if (z4 || this.f277r) {
            ImageView imageView = this.f267g;
            if (imageView == null && drawable == null && !this.f277r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f267g = imageView2;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f277r) {
                this.f267g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f267g;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f267g.getVisibility() != 0) {
                this.f267g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f269i;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f269i.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f269i.getVisibility() != 0) {
                this.f269i.setVisibility(0);
            }
        }
    }
}
