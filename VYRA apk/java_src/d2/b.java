package d2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import co.median.android.eeqadjy.R;
import com.google.android.material.badge.BadgeState$State;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import r2.a0;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BadgeState$State f1668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BadgeState$State f1669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1672e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1678l;

    public b(Context context, BadgeState$State badgeState$State) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        BadgeState$State badgeState$State2 = new BadgeState$State();
        badgeState$State2.n = 255;
        badgeState$State2.f1263p = -2;
        badgeState$State2.f1264q = -2;
        badgeState$State2.f1265r = -2;
        badgeState$State2.f1272y = Boolean.TRUE;
        this.f1669b = badgeState$State2;
        int i4 = badgeState$State.f;
        if (i4 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i4);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e5) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i4));
                notFoundException.initCause(e5);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayF = a0.f(context, attributeSet, a2.a.f13c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f1670c = typedArrayF.getDimensionPixelSize(5, -1);
        this.f1675i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f1676j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f1671d = typedArrayF.getDimensionPixelSize(15, -1);
        this.f1672e = typedArrayF.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.f1673g = typedArrayF.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayF.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.f1674h = typedArrayF.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f1677k = typedArrayF.getInt(25, 1);
        this.f1678l = typedArrayF.getInt(2, 0);
        BadgeState$State badgeState$State3 = this.f1669b;
        int i5 = badgeState$State.n;
        badgeState$State3.n = i5 == -2 ? 255 : i5;
        int i6 = badgeState$State.f1263p;
        if (i6 != -2) {
            badgeState$State3.f1263p = i6;
        } else {
            boolean zHasValue = typedArrayF.hasValue(24);
            BadgeState$State badgeState$State4 = this.f1669b;
            if (zHasValue) {
                badgeState$State4.f1263p = typedArrayF.getInt(24, 0);
            } else {
                badgeState$State4.f1263p = -1;
            }
        }
        String str = badgeState$State.f1262o;
        if (str != null) {
            this.f1669b.f1262o = str;
        } else if (typedArrayF.hasValue(8)) {
            this.f1669b.f1262o = typedArrayF.getString(8);
        }
        BadgeState$State badgeState$State5 = this.f1669b;
        badgeState$State5.f1267t = badgeState$State.f1267t;
        CharSequence charSequence = badgeState$State.f1268u;
        badgeState$State5.f1268u = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        BadgeState$State badgeState$State6 = this.f1669b;
        int i7 = badgeState$State.f1269v;
        badgeState$State6.f1269v = i7 == 0 ? R.plurals.mtrl_badge_content_description : i7;
        int i8 = badgeState$State.f1270w;
        badgeState$State6.f1270w = i8 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i8;
        Boolean bool = badgeState$State.f1272y;
        badgeState$State6.f1272y = Boolean.valueOf(bool == null || bool.booleanValue());
        BadgeState$State badgeState$State7 = this.f1669b;
        int i9 = badgeState$State.f1264q;
        badgeState$State7.f1264q = i9 == -2 ? typedArrayF.getInt(22, -2) : i9;
        BadgeState$State badgeState$State8 = this.f1669b;
        int i10 = badgeState$State.f1265r;
        badgeState$State8.f1265r = i10 == -2 ? typedArrayF.getInt(23, -2) : i10;
        BadgeState$State badgeState$State9 = this.f1669b;
        Integer num = badgeState$State.f1258j;
        badgeState$State9.f1258j = Integer.valueOf(num == null ? typedArrayF.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        BadgeState$State badgeState$State10 = this.f1669b;
        Integer num2 = badgeState$State.f1259k;
        badgeState$State10.f1259k = Integer.valueOf(num2 == null ? typedArrayF.getResourceId(7, 0) : num2.intValue());
        BadgeState$State badgeState$State11 = this.f1669b;
        Integer num3 = badgeState$State.f1260l;
        badgeState$State11.f1260l = Integer.valueOf(num3 == null ? typedArrayF.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        BadgeState$State badgeState$State12 = this.f1669b;
        Integer num4 = badgeState$State.f1261m;
        badgeState$State12.f1261m = Integer.valueOf(num4 == null ? typedArrayF.getResourceId(17, 0) : num4.intValue());
        BadgeState$State badgeState$State13 = this.f1669b;
        Integer num5 = badgeState$State.f1255g;
        badgeState$State13.f1255g = Integer.valueOf(num5 == null ? i.h(context, typedArrayF, 1).getDefaultColor() : num5.intValue());
        BadgeState$State badgeState$State14 = this.f1669b;
        Integer num6 = badgeState$State.f1257i;
        badgeState$State14.f1257i = Integer.valueOf(num6 == null ? typedArrayF.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = badgeState$State.f1256h;
        if (num7 != null) {
            this.f1669b.f1256h = num7;
        } else {
            boolean zHasValue2 = typedArrayF.hasValue(10);
            BadgeState$State badgeState$State15 = this.f1669b;
            if (zHasValue2) {
                badgeState$State15.f1256h = Integer.valueOf(i.h(context, typedArrayF, 10).getDefaultColor());
            } else {
                int iIntValue = badgeState$State15.f1257i.intValue();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, d.a.f1653y);
                typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
                ColorStateList colorStateListH = i.h(context, typedArrayObtainStyledAttributes, 3);
                i.h(context, typedArrayObtainStyledAttributes, 4);
                i.h(context, typedArrayObtainStyledAttributes, 5);
                typedArrayObtainStyledAttributes.getInt(2, 0);
                typedArrayObtainStyledAttributes.getInt(1, 1);
                int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
                typedArrayObtainStyledAttributes.getResourceId(i11, 0);
                typedArrayObtainStyledAttributes.getString(i11);
                typedArrayObtainStyledAttributes.getBoolean(14, false);
                i.h(context, typedArrayObtainStyledAttributes, 6);
                typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
                typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
                typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, a2.a.C);
                typedArrayObtainStyledAttributes2.hasValue(0);
                typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
                typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
                typedArrayObtainStyledAttributes2.recycle();
                this.f1669b.f1256h = Integer.valueOf(colorStateListH.getDefaultColor());
            }
        }
        BadgeState$State badgeState$State16 = this.f1669b;
        Integer num8 = badgeState$State.f1271x;
        badgeState$State16.f1271x = Integer.valueOf(num8 == null ? typedArrayF.getInt(3, 8388661) : num8.intValue());
        BadgeState$State badgeState$State17 = this.f1669b;
        Integer num9 = badgeState$State.f1273z;
        badgeState$State17.f1273z = Integer.valueOf(num9 == null ? typedArrayF.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        BadgeState$State badgeState$State18 = this.f1669b;
        Integer num10 = badgeState$State.A;
        badgeState$State18.A = Integer.valueOf(num10 == null ? typedArrayF.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        BadgeState$State badgeState$State19 = this.f1669b;
        Integer num11 = badgeState$State.B;
        badgeState$State19.B = Integer.valueOf(num11 == null ? typedArrayF.getDimensionPixelOffset(19, 0) : num11.intValue());
        BadgeState$State badgeState$State20 = this.f1669b;
        Integer num12 = badgeState$State.C;
        badgeState$State20.C = Integer.valueOf(num12 == null ? typedArrayF.getDimensionPixelOffset(26, 0) : num12.intValue());
        BadgeState$State badgeState$State21 = this.f1669b;
        Integer num13 = badgeState$State.D;
        badgeState$State21.D = Integer.valueOf(num13 == null ? typedArrayF.getDimensionPixelOffset(20, badgeState$State21.B.intValue()) : num13.intValue());
        BadgeState$State badgeState$State22 = this.f1669b;
        Integer num14 = badgeState$State.E;
        badgeState$State22.E = Integer.valueOf(num14 == null ? typedArrayF.getDimensionPixelOffset(27, badgeState$State22.C.intValue()) : num14.intValue());
        BadgeState$State badgeState$State23 = this.f1669b;
        Integer num15 = badgeState$State.H;
        badgeState$State23.H = Integer.valueOf(num15 == null ? typedArrayF.getDimensionPixelOffset(21, 0) : num15.intValue());
        BadgeState$State badgeState$State24 = this.f1669b;
        Integer num16 = badgeState$State.F;
        badgeState$State24.F = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        BadgeState$State badgeState$State25 = this.f1669b;
        Integer num17 = badgeState$State.G;
        badgeState$State25.G = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        BadgeState$State badgeState$State26 = this.f1669b;
        Boolean bool2 = badgeState$State.I;
        badgeState$State26.I = Boolean.valueOf(bool2 == null ? typedArrayF.getBoolean(0, false) : bool2.booleanValue());
        typedArrayF.recycle();
        Locale locale = badgeState$State.f1266s;
        BadgeState$State badgeState$State27 = this.f1669b;
        if (locale == null) {
            badgeState$State27.f1266s = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            badgeState$State27.f1266s = locale;
        }
        this.f1668a = badgeState$State;
    }
}
