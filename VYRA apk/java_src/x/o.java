package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f4630d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4631e;
    public static final SparseIntArray f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4632a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4633b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4634c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4631e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(a aVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < strArrSplit.length) {
            String strTrim = strArrSplit[i4].trim();
            Object obj = null;
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f462r;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f462r.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i5] = iIntValue;
            i4++;
            i5++;
        }
        return i5 != strArrSplit.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    public static j d(Context context, AttributeSet attributeSet, boolean z4) {
        int i4;
        int i5;
        j jVar = new j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4 ? r.f4637c : r.f4635a);
        m mVar = jVar.f4564b;
        n nVar = jVar.f4567e;
        l lVar = jVar.f4565c;
        k kVar = jVar.f4566d;
        int[] iArr = f4630d;
        String[] strArr = t.a.f3671a;
        SparseIntArray sparseIntArray = f4631e;
        if (z4) {
            i iVar = new i();
            iVar.f4552a = new int[10];
            iVar.f4553b = new int[10];
            iVar.f4554c = 0;
            iVar.f4555d = new int[10];
            iVar.f4556e = new float[10];
            iVar.f = 0;
            iVar.f4557g = new int[5];
            iVar.f4558h = new String[5];
            iVar.f4559i = 0;
            iVar.f4560j = new int[4];
            iVar.f4561k = new boolean[4];
            iVar.f4562l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i6 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i6 < indexCount; indexCount = i5) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                int i7 = i6;
                switch (f.get(index)) {
                    case 2:
                        i5 = indexCount;
                        iVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.I));
                        continue;
                        i6 = i7 + 1;
                        break;
                    case 3:
                    case 4:
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i5 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i5 = indexCount;
                        iVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i6 = i7 + 1;
                        break;
                    case 6:
                        i5 = indexCount;
                        iVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.C));
                        break;
                    case 7:
                        i5 = indexCount;
                        iVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.D));
                        break;
                    case 8:
                        i5 = indexCount;
                        iVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.J));
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        i5 = indexCount;
                        iVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.P));
                        break;
                    case 12:
                        i5 = indexCount;
                        iVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.Q));
                        break;
                    case 13:
                        i5 = indexCount;
                        iVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.M));
                        break;
                    case 14:
                        i5 = indexCount;
                        iVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.O));
                        break;
                    case 15:
                        i5 = indexCount;
                        iVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.R));
                        break;
                    case 16:
                        i5 = indexCount;
                        iVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.N));
                        break;
                    case 17:
                        i5 = indexCount;
                        iVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f4575d));
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        i5 = indexCount;
                        iVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f4576e));
                        break;
                    case 19:
                        i5 = indexCount;
                        iVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, kVar.f));
                        break;
                    case 20:
                        i5 = indexCount;
                        iVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, kVar.f4601w));
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        i5 = indexCount;
                        iVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.f4573c));
                        break;
                    case 22:
                        i5 = indexCount;
                        iVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, mVar.f4614a)]);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        i5 = indexCount;
                        iVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.f4571b));
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        i5 = indexCount;
                        iVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.F));
                        break;
                    case 27:
                        i5 = indexCount;
                        iVar.b(27, typedArrayObtainStyledAttributes.getInt(index, kVar.E));
                        break;
                    case 28:
                        i5 = indexCount;
                        iVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.G));
                        break;
                    case 31:
                        i5 = indexCount;
                        iVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.K));
                        break;
                    case 34:
                        i5 = indexCount;
                        iVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.H));
                        break;
                    case 37:
                        i5 = indexCount;
                        iVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, kVar.f4602x));
                        break;
                    case 38:
                        i5 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, jVar.f4563a);
                        jVar.f4563a = resourceId;
                        iVar.b(38, resourceId);
                        break;
                    case 39:
                        i5 = indexCount;
                        iVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, kVar.U));
                        break;
                    case 40:
                        i5 = indexCount;
                        iVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, kVar.T));
                        break;
                    case 41:
                        i5 = indexCount;
                        iVar.b(41, typedArrayObtainStyledAttributes.getInt(index, kVar.V));
                        break;
                    case 42:
                        i5 = indexCount;
                        iVar.b(42, typedArrayObtainStyledAttributes.getInt(index, kVar.W));
                        break;
                    case 43:
                        i5 = indexCount;
                        iVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, mVar.f4616c));
                        break;
                    case 44:
                        i5 = indexCount;
                        iVar.d(44, true);
                        iVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, nVar.f4629m));
                        break;
                    case 45:
                        i5 = indexCount;
                        iVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, nVar.f4619b));
                        break;
                    case 46:
                        i5 = indexCount;
                        iVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, nVar.f4620c));
                        break;
                    case 47:
                        i5 = indexCount;
                        iVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, nVar.f4621d));
                        break;
                    case 48:
                        i5 = indexCount;
                        iVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, nVar.f4622e));
                        break;
                    case 49:
                        i5 = indexCount;
                        iVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, nVar.f));
                        break;
                    case 50:
                        i5 = indexCount;
                        iVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, nVar.f4623g));
                        break;
                    case 51:
                        i5 = indexCount;
                        iVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, nVar.f4625i));
                        break;
                    case 52:
                        i5 = indexCount;
                        iVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, nVar.f4626j));
                        break;
                    case 53:
                        i5 = indexCount;
                        iVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, nVar.f4627k));
                        break;
                    case 54:
                        i5 = indexCount;
                        iVar.b(54, typedArrayObtainStyledAttributes.getInt(index, kVar.X));
                        break;
                    case 55:
                        i5 = indexCount;
                        iVar.b(55, typedArrayObtainStyledAttributes.getInt(index, kVar.Y));
                        break;
                    case 56:
                        i5 = indexCount;
                        iVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.Z));
                        break;
                    case 57:
                        i5 = indexCount;
                        iVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f4570a0));
                        break;
                    case 58:
                        i5 = indexCount;
                        iVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f4572b0));
                        break;
                    case 59:
                        i5 = indexCount;
                        iVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f4574c0));
                        break;
                    case 60:
                        i5 = indexCount;
                        iVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, nVar.f4618a));
                        break;
                    case 62:
                        i5 = indexCount;
                        iVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.A));
                        break;
                    case 63:
                        i5 = indexCount;
                        iVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, kVar.B));
                        break;
                    case 64:
                        i5 = indexCount;
                        iVar.b(64, f(typedArrayObtainStyledAttributes, index, lVar.f4606a));
                        break;
                    case 65:
                        i5 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            iVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            iVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i5 = indexCount;
                        iVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i5 = indexCount;
                        iVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, lVar.f4610e));
                        break;
                    case 68:
                        i5 = indexCount;
                        iVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, mVar.f4617d));
                        break;
                    case 69:
                        i5 = indexCount;
                        iVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i5 = indexCount;
                        iVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i5 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i5 = indexCount;
                        iVar.b(72, typedArrayObtainStyledAttributes.getInt(index, kVar.f4578f0));
                        break;
                    case 73:
                        i5 = indexCount;
                        iVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.g0));
                        break;
                    case 74:
                        i5 = indexCount;
                        iVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i5 = indexCount;
                        iVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f4591n0));
                        break;
                    case 76:
                        i5 = indexCount;
                        iVar.b(76, typedArrayObtainStyledAttributes.getInt(index, lVar.f4608c));
                        break;
                    case 77:
                        i5 = indexCount;
                        iVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i5 = indexCount;
                        iVar.b(78, typedArrayObtainStyledAttributes.getInt(index, mVar.f4615b));
                        break;
                    case 79:
                        i5 = indexCount;
                        iVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, lVar.f4609d));
                        break;
                    case 80:
                        i5 = indexCount;
                        iVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f4588l0));
                        break;
                    case 81:
                        i5 = indexCount;
                        iVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f4590m0));
                        break;
                    case 82:
                        i5 = indexCount;
                        iVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, lVar.f4607b));
                        break;
                    case 83:
                        i5 = indexCount;
                        iVar.b(83, f(typedArrayObtainStyledAttributes, index, nVar.f4624h));
                        break;
                    case 84:
                        i5 = indexCount;
                        iVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, lVar.f4611g));
                        break;
                    case 85:
                        i5 = indexCount;
                        iVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, lVar.f));
                        break;
                    case 86:
                        i5 = indexCount;
                        int i8 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i8 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            lVar.f4613i = resourceId2;
                            iVar.b(89, resourceId2);
                            if (lVar.f4613i != -1) {
                                iVar.b(88, -2);
                            }
                        } else if (i8 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            lVar.f4612h = string;
                            iVar.c(90, string);
                            if (lVar.f4612h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                lVar.f4613i = resourceId3;
                                iVar.b(89, resourceId3);
                                iVar.b(88, -2);
                            } else {
                                iVar.b(88, -1);
                            }
                        } else {
                            iVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, lVar.f4613i));
                        }
                        break;
                    case 87:
                        i5 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i5 = indexCount;
                        iVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.L));
                        break;
                    case 94:
                        i5 = indexCount;
                        iVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.S));
                        break;
                    case 95:
                        i5 = indexCount;
                        g(iVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i5 = indexCount;
                        g(iVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i5 = indexCount;
                        iVar.b(97, typedArrayObtainStyledAttributes.getInt(index, kVar.f4593o0));
                        break;
                    case 98:
                        i5 = indexCount;
                        int i9 = w.a.f4409v;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            jVar.f4563a = typedArrayObtainStyledAttributes.getResourceId(index, jVar.f4563a);
                        }
                        break;
                    case 99:
                        i5 = indexCount;
                        iVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f4579g));
                        break;
                }
                i6 = i7 + 1;
            }
        } else {
            int i10 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i10 < indexCount2; indexCount2 = i4) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        lVar.getClass();
                        kVar.getClass();
                        nVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i4 = indexCount2;
                        kVar.f4594p = f(typedArrayObtainStyledAttributes, index2, kVar.f4594p);
                        continue;
                        i10++;
                        break;
                    case 2:
                        i4 = indexCount2;
                        kVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.I);
                        continue;
                        i10++;
                        break;
                    case 3:
                        i4 = indexCount2;
                        kVar.f4592o = f(typedArrayObtainStyledAttributes, index2, kVar.f4592o);
                        continue;
                        i10++;
                        break;
                    case 4:
                        i4 = indexCount2;
                        kVar.n = f(typedArrayObtainStyledAttributes, index2, kVar.n);
                        continue;
                        i10++;
                        break;
                    case 5:
                        i4 = indexCount2;
                        kVar.f4603y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i10++;
                        break;
                    case 6:
                        i4 = indexCount2;
                        kVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.C);
                        continue;
                        i10++;
                        break;
                    case 7:
                        i4 = indexCount2;
                        kVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.D);
                        continue;
                        i10++;
                        break;
                    case 8:
                        i4 = indexCount2;
                        kVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.J);
                        continue;
                        i10++;
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        i4 = indexCount2;
                        kVar.f4600v = f(typedArrayObtainStyledAttributes, index2, kVar.f4600v);
                        continue;
                        i10++;
                        break;
                    case 10:
                        i4 = indexCount2;
                        kVar.f4599u = f(typedArrayObtainStyledAttributes, index2, kVar.f4599u);
                        continue;
                        i10++;
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        i4 = indexCount2;
                        kVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.P);
                        continue;
                        i10++;
                        break;
                    case 12:
                        i4 = indexCount2;
                        kVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.Q);
                        continue;
                        i10++;
                        break;
                    case 13:
                        i4 = indexCount2;
                        kVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.M);
                        continue;
                        i10++;
                        break;
                    case 14:
                        i4 = indexCount2;
                        kVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.O);
                        continue;
                        i10++;
                        break;
                    case 15:
                        i4 = indexCount2;
                        kVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.R);
                        continue;
                        i10++;
                        break;
                    case 16:
                        i4 = indexCount2;
                        kVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.N);
                        continue;
                        i10++;
                        break;
                    case 17:
                        i4 = indexCount2;
                        kVar.f4575d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f4575d);
                        continue;
                        i10++;
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        i4 = indexCount2;
                        kVar.f4576e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f4576e);
                        continue;
                        i10++;
                        break;
                    case 19:
                        i4 = indexCount2;
                        kVar.f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f);
                        continue;
                        i10++;
                        break;
                    case 20:
                        i4 = indexCount2;
                        kVar.f4601w = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f4601w);
                        continue;
                        i10++;
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        i4 = indexCount2;
                        kVar.f4573c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.f4573c);
                        continue;
                        i10++;
                        break;
                    case 22:
                        i4 = indexCount2;
                        int i11 = typedArrayObtainStyledAttributes.getInt(index2, mVar.f4614a);
                        mVar.f4614a = i11;
                        mVar.f4614a = iArr[i11];
                        continue;
                        i10++;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        i4 = indexCount2;
                        kVar.f4571b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.f4571b);
                        continue;
                        i10++;
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        i4 = indexCount2;
                        kVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.F);
                        continue;
                        i10++;
                        break;
                    case 25:
                        i4 = indexCount2;
                        kVar.f4580h = f(typedArrayObtainStyledAttributes, index2, kVar.f4580h);
                        continue;
                        i10++;
                        break;
                    case 26:
                        i4 = indexCount2;
                        kVar.f4582i = f(typedArrayObtainStyledAttributes, index2, kVar.f4582i);
                        continue;
                        i10++;
                        break;
                    case 27:
                        i4 = indexCount2;
                        kVar.E = typedArrayObtainStyledAttributes.getInt(index2, kVar.E);
                        continue;
                        i10++;
                        break;
                    case 28:
                        i4 = indexCount2;
                        kVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.G);
                        continue;
                        i10++;
                        break;
                    case 29:
                        i4 = indexCount2;
                        kVar.f4584j = f(typedArrayObtainStyledAttributes, index2, kVar.f4584j);
                        continue;
                        i10++;
                        break;
                    case 30:
                        i4 = indexCount2;
                        kVar.f4585k = f(typedArrayObtainStyledAttributes, index2, kVar.f4585k);
                        continue;
                        i10++;
                        break;
                    case 31:
                        i4 = indexCount2;
                        kVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.K);
                        continue;
                        i10++;
                        break;
                    case 32:
                        i4 = indexCount2;
                        kVar.f4597s = f(typedArrayObtainStyledAttributes, index2, kVar.f4597s);
                        continue;
                        i10++;
                        break;
                    case 33:
                        i4 = indexCount2;
                        kVar.f4598t = f(typedArrayObtainStyledAttributes, index2, kVar.f4598t);
                        continue;
                        i10++;
                        break;
                    case 34:
                        i4 = indexCount2;
                        kVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.H);
                        continue;
                        i10++;
                        break;
                    case 35:
                        i4 = indexCount2;
                        kVar.f4589m = f(typedArrayObtainStyledAttributes, index2, kVar.f4589m);
                        continue;
                        i10++;
                        break;
                    case 36:
                        i4 = indexCount2;
                        kVar.f4587l = f(typedArrayObtainStyledAttributes, index2, kVar.f4587l);
                        continue;
                        i10++;
                        break;
                    case 37:
                        i4 = indexCount2;
                        kVar.f4602x = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f4602x);
                        continue;
                        i10++;
                        break;
                    case 38:
                        i4 = indexCount2;
                        jVar.f4563a = typedArrayObtainStyledAttributes.getResourceId(index2, jVar.f4563a);
                        continue;
                        i10++;
                        break;
                    case 39:
                        i4 = indexCount2;
                        kVar.U = typedArrayObtainStyledAttributes.getFloat(index2, kVar.U);
                        continue;
                        i10++;
                        break;
                    case 40:
                        i4 = indexCount2;
                        kVar.T = typedArrayObtainStyledAttributes.getFloat(index2, kVar.T);
                        continue;
                        i10++;
                        break;
                    case 41:
                        i4 = indexCount2;
                        kVar.V = typedArrayObtainStyledAttributes.getInt(index2, kVar.V);
                        continue;
                        i10++;
                        break;
                    case 42:
                        i4 = indexCount2;
                        kVar.W = typedArrayObtainStyledAttributes.getInt(index2, kVar.W);
                        continue;
                        i10++;
                        break;
                    case 43:
                        i4 = indexCount2;
                        mVar.f4616c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f4616c);
                        continue;
                        i10++;
                        break;
                    case 44:
                        i4 = indexCount2;
                        nVar.f4628l = true;
                        nVar.f4629m = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f4629m);
                        continue;
                        i10++;
                        break;
                    case 45:
                        i4 = indexCount2;
                        nVar.f4619b = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f4619b);
                        continue;
                        i10++;
                        break;
                    case 46:
                        i4 = indexCount2;
                        nVar.f4620c = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f4620c);
                        continue;
                        i10++;
                        break;
                    case 47:
                        i4 = indexCount2;
                        nVar.f4621d = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f4621d);
                        continue;
                        i10++;
                        break;
                    case 48:
                        i4 = indexCount2;
                        nVar.f4622e = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f4622e);
                        continue;
                        i10++;
                        break;
                    case 49:
                        i4 = indexCount2;
                        nVar.f = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f);
                        continue;
                        i10++;
                        break;
                    case 50:
                        i4 = indexCount2;
                        nVar.f4623g = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f4623g);
                        continue;
                        i10++;
                        break;
                    case 51:
                        i4 = indexCount2;
                        nVar.f4625i = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f4625i);
                        continue;
                        i10++;
                        break;
                    case 52:
                        i4 = indexCount2;
                        nVar.f4626j = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f4626j);
                        continue;
                        i10++;
                        break;
                    case 53:
                        i4 = indexCount2;
                        nVar.f4627k = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f4627k);
                        continue;
                        i10++;
                        break;
                    case 54:
                        i4 = indexCount2;
                        kVar.X = typedArrayObtainStyledAttributes.getInt(index2, kVar.X);
                        continue;
                        i10++;
                        break;
                    case 55:
                        i4 = indexCount2;
                        kVar.Y = typedArrayObtainStyledAttributes.getInt(index2, kVar.Y);
                        continue;
                        i10++;
                        break;
                    case 56:
                        i4 = indexCount2;
                        kVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.Z);
                        continue;
                        i10++;
                        break;
                    case 57:
                        i4 = indexCount2;
                        kVar.f4570a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4570a0);
                        continue;
                        i10++;
                        break;
                    case 58:
                        i4 = indexCount2;
                        kVar.f4572b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4572b0);
                        continue;
                        i10++;
                        break;
                    case 59:
                        i4 = indexCount2;
                        kVar.f4574c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f4574c0);
                        continue;
                        i10++;
                        break;
                    case 60:
                        i4 = indexCount2;
                        nVar.f4618a = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f4618a);
                        continue;
                        i10++;
                        break;
                    case 61:
                        i4 = indexCount2;
                        kVar.f4604z = f(typedArrayObtainStyledAttributes, index2, kVar.f4604z);
                        continue;
                        i10++;
                        break;
                    case 62:
                        i4 = indexCount2;
                        kVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.A);
                        continue;
                        i10++;
                        break;
                    case 63:
                        i4 = indexCount2;
                        kVar.B = typedArrayObtainStyledAttributes.getFloat(index2, kVar.B);
                        continue;
                        i10++;
                        break;
                    case 64:
                        i4 = indexCount2;
                        lVar.f4606a = f(typedArrayObtainStyledAttributes, index2, lVar.f4606a);
                        continue;
                        i10++;
                        break;
                    case 65:
                        i4 = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            lVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            lVar.getClass();
                        }
                        i10++;
                        break;
                    case 66:
                        i4 = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        lVar.getClass();
                        continue;
                        i10++;
                        break;
                    case 67:
                        i4 = indexCount2;
                        lVar.f4610e = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f4610e);
                        break;
                    case 68:
                        i4 = indexCount2;
                        mVar.f4617d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f4617d);
                        break;
                    case 69:
                        i4 = indexCount2;
                        kVar.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i4 = indexCount2;
                        kVar.f4577e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i4 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i4 = indexCount2;
                        kVar.f4578f0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f4578f0);
                        break;
                    case 73:
                        i4 = indexCount2;
                        kVar.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.g0);
                        break;
                    case 74:
                        i4 = indexCount2;
                        kVar.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i4 = indexCount2;
                        kVar.f4591n0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f4591n0);
                        break;
                    case 76:
                        i4 = indexCount2;
                        lVar.f4608c = typedArrayObtainStyledAttributes.getInt(index2, lVar.f4608c);
                        break;
                    case 77:
                        i4 = indexCount2;
                        kVar.f4586k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i4 = indexCount2;
                        mVar.f4615b = typedArrayObtainStyledAttributes.getInt(index2, mVar.f4615b);
                        break;
                    case 79:
                        i4 = indexCount2;
                        lVar.f4609d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f4609d);
                        break;
                    case 80:
                        i4 = indexCount2;
                        kVar.f4588l0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f4588l0);
                        break;
                    case 81:
                        i4 = indexCount2;
                        kVar.f4590m0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f4590m0);
                        break;
                    case 82:
                        i4 = indexCount2;
                        lVar.f4607b = typedArrayObtainStyledAttributes.getInteger(index2, lVar.f4607b);
                        break;
                    case 83:
                        i4 = indexCount2;
                        nVar.f4624h = f(typedArrayObtainStyledAttributes, index2, nVar.f4624h);
                        break;
                    case 84:
                        i4 = indexCount2;
                        lVar.f4611g = typedArrayObtainStyledAttributes.getInteger(index2, lVar.f4611g);
                        break;
                    case 85:
                        i4 = indexCount2;
                        lVar.f = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f);
                        break;
                    case 86:
                        i4 = indexCount2;
                        int i12 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i12 == 1) {
                            lVar.f4613i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i12 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            lVar.f4612h = string2;
                            if (string2.indexOf("/") > 0) {
                                lVar.f4613i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, lVar.f4613i);
                        }
                        break;
                    case 87:
                        i4 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i4 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i4 = indexCount2;
                        kVar.f4595q = f(typedArrayObtainStyledAttributes, index2, kVar.f4595q);
                        break;
                    case 92:
                        i4 = indexCount2;
                        kVar.f4596r = f(typedArrayObtainStyledAttributes, index2, kVar.f4596r);
                        break;
                    case 93:
                        i4 = indexCount2;
                        kVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.L);
                        break;
                    case 94:
                        i4 = indexCount2;
                        kVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.S);
                        break;
                    case 95:
                        i4 = indexCount2;
                        g(kVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i10++;
                        break;
                    case 96:
                        i4 = indexCount2;
                        g(kVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i4 = indexCount2;
                        kVar.f4593o0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f4593o0);
                        break;
                }
                i10++;
            }
            if (kVar.j0 != null) {
                kVar.f4583i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return jVar;
    }

    public static int f(TypedArray typedArray, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i4, i5);
        return resourceId == -1 ? typedArray.getInt(i4, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void g(Object obj, TypedArray typedArray, int i4, int i5) {
        int dimensionPixelSize;
        i iVar;
        k kVar;
        e eVar;
        if (obj == null) {
            return;
        }
        int i6 = typedArray.peekValue(i4).type;
        boolean z4 = true;
        int i7 = 0;
        if (i6 != 3) {
            if (i6 != 5) {
                dimensionPixelSize = typedArray.getInt(i4, 0);
                if (dimensionPixelSize == -4) {
                    i7 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z4 = false;
                }
                if (obj instanceof e) {
                    eVar = (e) obj;
                    if (i5 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar).width = i7;
                        eVar.W = z4;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).height = i7;
                        eVar.X = z4;
                        return;
                    }
                }
                if (obj instanceof k) {
                    kVar = (k) obj;
                    if (i5 == 0) {
                        kVar.f4571b = i7;
                        kVar.f4588l0 = z4;
                        return;
                    } else {
                        kVar.f4573c = i7;
                        kVar.f4590m0 = z4;
                        return;
                    }
                }
                if (obj instanceof i) {
                    iVar = (i) obj;
                    if (i5 == 0) {
                        iVar.b(23, i7);
                        iVar.d(80, z4);
                        return;
                    } else {
                        iVar.b(21, i7);
                        iVar.d(81, z4);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i4, 0);
            z4 = false;
            i7 = dimensionPixelSize;
            if (obj instanceof e) {
                eVar = (e) obj;
                if (i5 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar).width = i7;
                    eVar.W = z4;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar).height = i7;
                    eVar.X = z4;
                    return;
                }
            }
            if (obj instanceof k) {
                kVar = (k) obj;
                if (i5 == 0) {
                    kVar.f4571b = i7;
                    kVar.f4588l0 = z4;
                    return;
                } else {
                    kVar.f4573c = i7;
                    kVar.f4590m0 = z4;
                    return;
                }
            }
            if (obj instanceof i) {
                iVar = (i) obj;
                if (i5 == 0) {
                    iVar.b(23, i7);
                    iVar.d(80, z4);
                    return;
                } else {
                    iVar.b(21, i7);
                    iVar.d(81, z4);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i4);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof e) {
                    e eVar2 = (e) obj;
                    if (i5 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                    }
                    h(eVar2, strTrim2);
                    return;
                }
                if (obj instanceof k) {
                    ((k) obj).f4603y = strTrim2;
                    return;
                } else {
                    if (obj instanceof i) {
                        ((i) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f4 = Float.parseFloat(strTrim2);
                    if (obj instanceof e) {
                        e eVar3 = (e) obj;
                        if (i5 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                            eVar3.H = f4;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                            eVar3.I = f4;
                            return;
                        }
                    }
                    if (obj instanceof k) {
                        k kVar2 = (k) obj;
                        if (i5 == 0) {
                            kVar2.f4571b = 0;
                            kVar2.U = f4;
                            return;
                        } else {
                            kVar2.f4573c = 0;
                            kVar2.T = f4;
                            return;
                        }
                    }
                    if (obj instanceof i) {
                        i iVar2 = (i) obj;
                        if (i5 == 0) {
                            iVar2.b(23, 0);
                            iVar2.a(39, f4);
                            return;
                        } else {
                            iVar2.b(21, 0);
                            iVar2.a(40, f4);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof e) {
                        e eVar4 = (e) obj;
                        if (i5 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar4).width = 0;
                            eVar4.R = fMax;
                            eVar4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar4).height = 0;
                            eVar4.S = fMax;
                            eVar4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof k) {
                        k kVar3 = (k) obj;
                        if (i5 == 0) {
                            kVar3.f4571b = 0;
                            kVar3.d0 = fMax;
                            kVar3.X = 2;
                            return;
                        } else {
                            kVar3.f4573c = 0;
                            kVar3.f4577e0 = fMax;
                            kVar3.Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof i) {
                        i iVar3 = (i) obj;
                        if (i5 == 0) {
                            iVar3.b(23, 0);
                            iVar3.b(54, 2);
                        } else {
                            iVar3.b(21, 0);
                            iVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i4 = 0;
            int i5 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i4 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i5 = i4;
                i4 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i4);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i4, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f4 = Float.parseFloat(strSubstring3);
                        float f5 = Float.parseFloat(strSubstring4);
                        if (f4 > 0.0f && f5 > 0.0f) {
                            if (i5 == 1) {
                                Math.abs(f5 / f4);
                            } else {
                                Math.abs(f4 / f5);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i4;
        HashMap map;
        String resourceEntryName;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = oVar.f4634c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (oVar.f4633b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        j jVar = (j) map2.get(Integer.valueOf(id));
                        if (jVar != null) {
                            m mVar = jVar.f4564b;
                            k kVar = jVar.f4566d;
                            n nVar = jVar.f4567e;
                            if (childAt instanceof a) {
                                kVar.f4581h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(kVar.f4578f0);
                                aVar.setMargin(kVar.g0);
                                aVar.setAllowsGoneWidget(kVar.f4591n0);
                                int[] iArr = kVar.f4583i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str = kVar.j0;
                                    if (str != null) {
                                        int[] iArrC = c(aVar, str);
                                        kVar.f4583i0 = iArrC;
                                        aVar.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            jVar.a(eVar);
                            HashMap map3 = jVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                b bVar = (b) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String str3 = bVar.f4487a ? str2 : "set" + str2;
                                try {
                                    int iB = s.e.b(bVar.f4488b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iB) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(str3, cls3).invoke(childAt, Integer.valueOf(bVar.f4489c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(str3, cls2).invoke(childAt, Float.valueOf(bVar.f4490d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(str3, cls3).invoke(childAt, Integer.valueOf(bVar.f4492g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str3, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f4492g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e5) {
                                                e = e5;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            } catch (NoSuchMethodException e6) {
                                                e = e6;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str3, e);
                                            } catch (InvocationTargetException e7) {
                                                e = e7;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(str3, CharSequence.class).invoke(childAt, bVar.f4491e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(str3, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(str3, cls2).invoke(childAt, Float.valueOf(bVar.f4490d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(str3, cls3).invoke(childAt, Integer.valueOf(bVar.f4489c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e8) {
                                    e = e8;
                                    map = map3;
                                } catch (NoSuchMethodException e9) {
                                    e = e9;
                                    map = map3;
                                } catch (InvocationTargetException e10) {
                                    e = e10;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i5 = i5;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i4 = i5;
                            childAt.setLayoutParams(eVar);
                            if (mVar.f4615b == 0) {
                                childAt.setVisibility(mVar.f4614a);
                            }
                            childAt.setAlpha(mVar.f4616c);
                            childAt.setRotation(nVar.f4618a);
                            childAt.setRotationX(nVar.f4619b);
                            childAt.setRotationY(nVar.f4620c);
                            childAt.setScaleX(nVar.f4621d);
                            childAt.setScaleY(nVar.f4622e);
                            if (nVar.f4624h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(nVar.f4624h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nVar.f)) {
                                    childAt.setPivotX(nVar.f);
                                }
                                if (!Float.isNaN(nVar.f4623g)) {
                                    childAt.setPivotY(nVar.f4623g);
                                }
                            }
                            childAt.setTranslationX(nVar.f4625i);
                            childAt.setTranslationY(nVar.f4626j);
                            childAt.setTranslationZ(nVar.f4627k);
                            if (nVar.f4628l) {
                                childAt.setElevation(nVar.f4629m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i4 = i5;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i5 = i4 + 1;
                oVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i4 = i5;
            i5 = i4 + 1;
            oVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            j jVar2 = (j) map2.get(num);
            if (jVar2 != null) {
                k kVar2 = jVar2.f4566d;
                if (kVar2.f4581h0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.f = new int[32];
                    aVar2.f4498l = new HashMap();
                    aVar2.f4494h = context;
                    u.a aVar3 = new u.a();
                    aVar3.f3739s0 = 0;
                    aVar3.f3740t0 = true;
                    aVar3.f3741u0 = 0;
                    aVar3.v0 = false;
                    aVar2.f4486o = aVar3;
                    aVar2.f4495i = aVar3;
                    aVar2.i();
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = kVar2.f4583i0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str4 = kVar2.j0;
                        if (str4 != null) {
                            int[] iArrC2 = c(aVar2, str4);
                            kVar2.f4583i0 = iArrC2;
                            aVar2.setReferencedIds(iArrC2);
                        }
                    }
                    aVar2.setType(kVar2.f4578f0);
                    aVar2.setMargin(kVar2.g0);
                    e eVarG = ConstraintLayout.g();
                    aVar2.i();
                    jVar2.a(eVarG);
                    constraintLayout.addView(aVar2, eVarG);
                }
                if (kVar2.f4569a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    e eVarG2 = ConstraintLayout.g();
                    jVar2.a(eVarG2);
                    constraintLayout.addView(guideline, eVarG2);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i4;
        HashMap map;
        int i5;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = oVar.f4634c;
        map2.clear();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = constraintLayout.getChildAt(i6);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.f4633b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new j());
            }
            j jVar = (j) map2.get(Integer.valueOf(id));
            if (jVar == null) {
                i4 = childCount;
                map = map2;
                i5 = i6;
            } else {
                m mVar = jVar.f4564b;
                k kVar = jVar.f4566d;
                n nVar = jVar.f4567e;
                i4 = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i5 = i6;
                HashMap map4 = oVar.f4632a;
                for (String str : map4.keySet()) {
                    b bVar = (b) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e5);
                    } catch (NoSuchMethodException e6) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e6);
                    } catch (InvocationTargetException e7) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e7);
                    }
                    map4 = map5;
                }
                jVar.f = map3;
                jVar.f4563a = id;
                kVar.f4580h = eVar.f4507e;
                kVar.f4582i = eVar.f;
                kVar.f4584j = eVar.f4510g;
                kVar.f4585k = eVar.f4511h;
                kVar.f4587l = eVar.f4513i;
                kVar.f4589m = eVar.f4515j;
                kVar.n = eVar.f4516k;
                kVar.f4592o = eVar.f4518l;
                kVar.f4594p = eVar.f4520m;
                kVar.f4595q = eVar.n;
                kVar.f4596r = eVar.f4523o;
                kVar.f4597s = eVar.f4529s;
                kVar.f4598t = eVar.f4530t;
                kVar.f4599u = eVar.f4531u;
                kVar.f4600v = eVar.f4532v;
                kVar.f4601w = eVar.E;
                kVar.f4602x = eVar.F;
                kVar.f4603y = eVar.G;
                kVar.f4604z = eVar.f4525p;
                kVar.A = eVar.f4527q;
                kVar.B = eVar.f4528r;
                kVar.C = eVar.T;
                kVar.D = eVar.U;
                kVar.E = eVar.V;
                kVar.f = eVar.f4504c;
                kVar.f4575d = eVar.f4500a;
                kVar.f4576e = eVar.f4502b;
                kVar.f4571b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.f4573c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.L = eVar.D;
                kVar.T = eVar.I;
                kVar.U = eVar.H;
                kVar.W = eVar.K;
                kVar.V = eVar.J;
                kVar.f4588l0 = eVar.W;
                kVar.f4590m0 = eVar.X;
                kVar.X = eVar.L;
                kVar.Y = eVar.M;
                kVar.Z = eVar.P;
                kVar.f4570a0 = eVar.Q;
                kVar.f4572b0 = eVar.N;
                kVar.f4574c0 = eVar.O;
                kVar.d0 = eVar.R;
                kVar.f4577e0 = eVar.S;
                kVar.f4586k0 = eVar.Y;
                kVar.N = eVar.f4534x;
                kVar.P = eVar.f4536z;
                kVar.M = eVar.f4533w;
                kVar.O = eVar.f4535y;
                kVar.R = eVar.A;
                kVar.Q = eVar.B;
                kVar.S = eVar.C;
                kVar.f4593o0 = eVar.Z;
                kVar.J = eVar.getMarginEnd();
                kVar.K = eVar.getMarginStart();
                mVar.f4614a = childAt.getVisibility();
                mVar.f4616c = childAt.getAlpha();
                nVar.f4618a = childAt.getRotation();
                nVar.f4619b = childAt.getRotationX();
                nVar.f4620c = childAt.getRotationY();
                nVar.f4621d = childAt.getScaleX();
                nVar.f4622e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f = pivotX;
                    nVar.f4623g = pivotY;
                }
                nVar.f4625i = childAt.getTranslationX();
                nVar.f4626j = childAt.getTranslationY();
                nVar.f4627k = childAt.getTranslationZ();
                if (nVar.f4628l) {
                    nVar.f4629m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    kVar.f4591n0 = aVar.getAllowsGoneWidget();
                    kVar.f4583i0 = aVar.getReferencedIds();
                    kVar.f4578f0 = aVar.getType();
                    kVar.g0 = aVar.getMargin();
                }
            }
            i6 = i5 + 1;
            oVar = this;
            childCount = i4;
            map2 = map;
        }
    }

    public final void e(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    j jVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        jVarD.f4566d.f4569a = true;
                    }
                    this.f4634c.put(Integer.valueOf(jVarD.f4563a), jVarD);
                }
            }
        } catch (IOException e5) {
            Log.e("ConstraintSet", "Error parsing resource: " + i4, e5);
        } catch (XmlPullParserException e6) {
            Log.e("ConstraintSet", "Error parsing resource: " + i4, e6);
        }
    }
}
