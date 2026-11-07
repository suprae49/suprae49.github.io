.class public final Lcom/google/android/material/datepicker/k;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/datepicker/k;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/material/datepicker/k;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/k;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lu2/f;

    .line 7
    .line 8
    invoke-virtual {p1}, Lu2/f;->getItemData()Lj/o;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lg2/b;

    .line 15
    .line 16
    iget-object v1, v0, Lu2/j;->R:Lu2/h;

    .line 17
    .line 18
    iget-object v2, v0, Lu2/j;->Q:Lcom/google/android/material/navigation/b;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    iget-object v1, v1, Lu2/h;->a:Lj/m;

    .line 22
    .line 23
    invoke-virtual {v1, p1, v2, v3}, Lj/m;->q(Landroid/view/MenuItem;Lj/y;I)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Lj/o;->isCheckable()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Lj/o;->isChecked()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    :cond_0
    invoke-virtual {v0, p1}, Lu2/j;->setCheckedItem(Landroid/view/MenuItem;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void

    .line 47
    :pswitch_0
    check-cast p1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lr2/q;

    .line 52
    .line 53
    iget-object v1, v0, Lr2/q;->j:Lr2/i;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iput-boolean v2, v1, Lr2/i;->f:Z

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/material/internal/NavigationMenuItemView;->getItemData()Lj/o;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v1, v0, Lr2/q;->h:Lj/m;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-virtual {v1, p1, v0, v3}, Lj/m;->q(Landroid/view/MenuItem;Lj/y;I)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    invoke-virtual {p1}, Lj/o;->isCheckable()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    iget-object v1, v0, Lr2/q;->j:Lr2/i;

    .line 82
    .line 83
    invoke-virtual {v1, p1}, Lr2/i;->h(Lj/o;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    move v2, v3

    .line 88
    :goto_0
    iget-object p1, v0, Lr2/q;->j:Lr2/i;

    .line 89
    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    iput-boolean v3, p1, Lr2/i;->f:Z

    .line 93
    .line 94
    :cond_4
    if-eqz v2, :cond_5

    .line 95
    .line 96
    invoke-virtual {v0, v3}, Lr2/q;->f(Z)V

    .line 97
    .line 98
    .line 99
    :cond_5
    return-void

    .line 100
    :pswitch_1
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->g:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 103
    .line 104
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->R:Lk/g3;

    .line 105
    .line 106
    if-nez p1, :cond_6

    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    goto :goto_1

    .line 110
    :cond_6
    iget-object p1, p1, Lk/g3;->g:Lj/o;

    .line 111
    .line 112
    :goto_1
    if-eqz p1, :cond_7

    .line 113
    .line 114
    invoke-virtual {p1}, Lj/o;->collapseActionView()Z

    .line 115
    .line 116
    .line 117
    :cond_7
    return-void

    .line 118
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->g:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Landroidx/appcompat/widget/e;

    .line 121
    .line 122
    iget-object v1, v0, Landroidx/appcompat/widget/e;->u:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 123
    .line 124
    iget-object v2, v0, Landroidx/appcompat/widget/e;->y:Landroid/widget/ImageView;

    .line 125
    .line 126
    if-ne p1, v2, :cond_8

    .line 127
    .line 128
    const/4 p1, 0x0

    .line 129
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/e;->w(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 133
    .line 134
    .line 135
    const/4 p1, 0x1

    .line 136
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    .line 137
    .line 138
    .line 139
    iget-object p1, v0, Landroidx/appcompat/widget/e;->R:Landroid/view/View$OnClickListener;

    .line 140
    .line 141
    if-eqz p1, :cond_f

    .line 142
    .line 143
    invoke-interface {p1, v0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_8
    iget-object v2, v0, Landroidx/appcompat/widget/e;->A:Landroid/widget/ImageView;

    .line 148
    .line 149
    if-ne p1, v2, :cond_9

    .line 150
    .line 151
    invoke-virtual {v0}, Landroidx/appcompat/widget/e;->m()V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_9
    iget-object v2, v0, Landroidx/appcompat/widget/e;->z:Landroid/widget/ImageView;

    .line 156
    .line 157
    if-ne p1, v2, :cond_a

    .line 158
    .line 159
    invoke-virtual {v0}, Landroidx/appcompat/widget/e;->q()V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_a
    iget-object v2, v0, Landroidx/appcompat/widget/e;->B:Landroid/widget/ImageView;

    .line 164
    .line 165
    if-ne p1, v2, :cond_e

    .line 166
    .line 167
    iget-object p1, v0, Landroidx/appcompat/widget/e;->i0:Landroid/app/SearchableInfo;

    .line 168
    .line 169
    if-nez p1, :cond_b

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_b
    :try_start_0
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_d

    .line 177
    .line 178
    iget-object v1, v0, Landroidx/appcompat/widget/e;->M:Landroid/content/Intent;

    .line 179
    .line 180
    new-instance v2, Landroid/content/Intent;

    .line 181
    .line 182
    invoke-direct {v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const-string v1, "calling_package"

    .line 190
    .line 191
    if-nez p1, :cond_c

    .line 192
    .line 193
    const/4 p1, 0x0

    .line 194
    goto :goto_2

    .line 195
    :cond_c
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    :goto_2
    invoke-virtual {v2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_d
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_f

    .line 215
    .line 216
    iget-object v1, v0, Landroidx/appcompat/widget/e;->N:Landroid/content/Intent;

    .line 217
    .line 218
    invoke-virtual {v0, v1, p1}, Landroidx/appcompat/widget/e;->k(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :catch_0
    const-string p1, "SearchView"

    .line 231
    .line 232
    const-string v0, "Could not find voice search activity"

    .line 233
    .line 234
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_e
    if-ne p1, v1, :cond_f

    .line 239
    .line 240
    invoke-virtual {v0}, Landroidx/appcompat/widget/e;->l()V

    .line 241
    .line 242
    .line 243
    :cond_f
    :goto_3
    return-void

    .line 244
    :pswitch_3
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->g:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p1, Li/a;

    .line 247
    .line 248
    invoke-virtual {p1}, Li/a;->a()V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :pswitch_4
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->g:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Le/e;

    .line 255
    .line 256
    iget-object v1, v0, Le/e;->i:Landroid/widget/Button;

    .line 257
    .line 258
    if-ne p1, v1, :cond_10

    .line 259
    .line 260
    iget-object v1, v0, Le/e;->k:Landroid/os/Message;

    .line 261
    .line 262
    if-eqz v1, :cond_10

    .line 263
    .line 264
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    goto :goto_4

    .line 269
    :cond_10
    iget-object v1, v0, Le/e;->l:Landroid/widget/Button;

    .line 270
    .line 271
    if-ne p1, v1, :cond_11

    .line 272
    .line 273
    iget-object v1, v0, Le/e;->n:Landroid/os/Message;

    .line 274
    .line 275
    if-eqz v1, :cond_11

    .line 276
    .line 277
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    goto :goto_4

    .line 282
    :cond_11
    iget-object v1, v0, Le/e;->o:Landroid/widget/Button;

    .line 283
    .line 284
    if-ne p1, v1, :cond_12

    .line 285
    .line 286
    iget-object p1, v0, Le/e;->q:Landroid/os/Message;

    .line 287
    .line 288
    if-eqz p1, :cond_12

    .line 289
    .line 290
    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    goto :goto_4

    .line 295
    :cond_12
    const/4 p1, 0x0

    .line 296
    :goto_4
    if-eqz p1, :cond_13

    .line 297
    .line 298
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 299
    .line 300
    .line 301
    :cond_13
    iget-object p1, v0, Le/e;->E:Le/c;

    .line 302
    .line 303
    const/4 v1, 0x1

    .line 304
    iget-object v0, v0, Le/e;->b:Le/g;

    .line 305
    .line 306
    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :pswitch_5
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->g:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p1, Lcom/google/android/material/datepicker/l;

    .line 317
    .line 318
    iget v0, p1, Lcom/google/android/material/datepicker/l;->j:I

    .line 319
    .line 320
    const/4 v1, 0x1

    .line 321
    const/4 v2, 0x2

    .line 322
    if-ne v0, v2, :cond_14

    .line 323
    .line 324
    invoke-virtual {p1, v1}, Lcom/google/android/material/datepicker/l;->j(I)V

    .line 325
    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_14
    if-ne v0, v1, :cond_15

    .line 329
    .line 330
    invoke-virtual {p1, v2}, Lcom/google/android/material/datepicker/l;->j(I)V

    .line 331
    .line 332
    .line 333
    :cond_15
    :goto_5
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/l;->k(Landroid/view/View;)V

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
