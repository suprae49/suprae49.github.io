package com.google.android.material.datepicker;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.NavigationMenuItemView;
import k.g3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements View.OnClickListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1429g;

    public /* synthetic */ k(int i4, Object obj) {
        this.f = i4;
        this.f1429g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.f) {
            case 0:
                l lVar = (l) this.f1429g;
                int i4 = lVar.f1433j;
                if (i4 == 2) {
                    lVar.j(1);
                } else if (i4 == 1) {
                    lVar.j(2);
                }
                lVar.k(lVar.getView());
                break;
            case 1:
                e.e eVar = (e.e) this.f1429g;
                if (view == eVar.f1903i && (message3 = eVar.f1905k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != eVar.f1906l || (message2 = eVar.n) == null) {
                    messageObtain = (view != eVar.f1908o || (message = eVar.f1910q) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                eVar.E.obtainMessage(1, eVar.f1897b).sendToTarget();
                break;
            case 2:
                ((i.a) this.f1429g).a();
                break;
            case 3:
                androidx.appcompat.widget.e eVar2 = (androidx.appcompat.widget.e) this.f1429g;
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = eVar2.f443u;
                if (view == eVar2.f447y) {
                    eVar2.w(false);
                    searchView$SearchAutoComplete.requestFocus();
                    searchView$SearchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener = eVar2.R;
                    if (onClickListener != null) {
                        onClickListener.onClick(eVar2);
                    }
                    break;
                } else if (view == eVar2.A) {
                    eVar2.m();
                    break;
                } else if (view == eVar2.f448z) {
                    eVar2.q();
                    break;
                } else if (view != eVar2.B) {
                    if (view == searchView$SearchAutoComplete) {
                        eVar2.l();
                    }
                    break;
                } else {
                    SearchableInfo searchableInfo = eVar2.f439i0;
                    if (searchableInfo != null) {
                        try {
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(eVar2.M);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                                eVar2.getContext().startActivity(intent);
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                eVar2.getContext().startActivity(eVar2.k(eVar2.N, searchableInfo));
                            }
                        } catch (ActivityNotFoundException unused) {
                            Log.w("SearchView", "Could not find voice search activity");
                            return;
                        }
                        break;
                    }
                }
                break;
            case 4:
                g3 g3Var = ((Toolbar) this.f1429g).R;
                j.o oVar = g3Var == null ? null : g3Var.f2522g;
                if (oVar != null) {
                    oVar.collapseActionView();
                }
                break;
            case 5:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                r2.q qVar = (r2.q) this.f1429g;
                r2.i iVar = qVar.f3564j;
                boolean z4 = true;
                if (iVar != null) {
                    iVar.f = true;
                }
                j.o itemData = navigationMenuItemView.getItemData();
                boolean zQ = qVar.f3562h.q(itemData, qVar, 0);
                if (itemData != null && itemData.isCheckable() && zQ) {
                    qVar.f3564j.h(itemData);
                } else {
                    z4 = false;
                }
                r2.i iVar2 = qVar.f3564j;
                if (iVar2 != null) {
                    iVar2.f = false;
                }
                if (z4) {
                    qVar.f(false);
                }
                break;
            default:
                j.o itemData2 = ((u2.f) view).getItemData();
                g2.b bVar = (g2.b) this.f1429g;
                boolean zQ2 = bVar.R.f4192a.q(itemData2, bVar.Q, 0);
                if (itemData2 != null && itemData2.isCheckable()) {
                    if (!zQ2 || itemData2.isChecked()) {
                        bVar.setCheckedItem(itemData2);
                    }
                    break;
                }
                break;
        }
    }
}
