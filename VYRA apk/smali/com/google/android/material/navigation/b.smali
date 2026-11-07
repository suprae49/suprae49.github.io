.class public final Lcom/google/android/material/navigation/b;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lj/y;


# instance fields
.field public f:Lg2/b;

.field public g:Z

.field public h:I


# virtual methods
.method public final a(Lj/m;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(Lj/o;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final e(Landroid/os/Parcelable;)V
    .locals 7

    .line 1
    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/navigation/b;->f:Lg2/b;

    .line 6
    .line 7
    check-cast p1, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;

    .line 8
    .line 9
    iget v1, p1, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;->f:I

    .line 10
    .line 11
    iget-object v2, v0, Lu2/j;->R:Lu2/h;

    .line 12
    .line 13
    iget-object v2, v2, Lu2/h;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_1

    .line 22
    .line 23
    iget-object v5, v0, Lu2/j;->R:Lu2/h;

    .line 24
    .line 25
    invoke-virtual {v5, v4}, Lu2/h;->a(I)Landroid/view/MenuItem;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-ne v1, v6, :cond_0

    .line 34
    .line 35
    iput v1, v0, Lu2/j;->m:I

    .line 36
    .line 37
    iput v4, v0, Lu2/j;->n:I

    .line 38
    .line 39
    invoke-virtual {v0, v5}, Lu2/j;->setCheckedItem(Landroid/view/MenuItem;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/google/android/material/navigation/b;->f:Lg2/b;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;->g:Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 53
    .line 54
    new-instance v1, Landroid/util/SparseArray;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-direct {v1, v2}, Landroid/util/SparseArray;-><init>(I)V

    .line 61
    .line 62
    .line 63
    move v2, v3

    .line 64
    :goto_2
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-ge v2, v4, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Lcom/google/android/material/badge/BadgeState$State;

    .line 79
    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    new-instance v6, Ld2/a;

    .line 83
    .line 84
    invoke-direct {v6, v0, v5}, Ld2/a;-><init>(Landroid/content/Context;Lcom/google/android/material/badge/BadgeState$State;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_2
    const/4 v6, 0x0

    .line 89
    :goto_3
    invoke-virtual {v1, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    iget-object p1, p0, Lcom/google/android/material/navigation/b;->f:Lg2/b;

    .line 96
    .line 97
    iget-object v0, p1, Lu2/j;->A:Landroid/util/SparseArray;

    .line 98
    .line 99
    move v2, v3

    .line 100
    :goto_4
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-ge v2, v4, :cond_5

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-gez v5, :cond_4

    .line 115
    .line 116
    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, Ld2/a;

    .line 121
    .line 122
    invoke-virtual {v0, v4, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_5
    iget-object p1, p1, Lu2/j;->l:[Lu2/i;

    .line 129
    .line 130
    if-eqz p1, :cond_7

    .line 131
    .line 132
    array-length v1, p1

    .line 133
    :goto_5
    if-ge v3, v1, :cond_7

    .line 134
    .line 135
    aget-object v2, p1, v3

    .line 136
    .line 137
    instance-of v4, v2, Lu2/f;

    .line 138
    .line 139
    if-eqz v4, :cond_6

    .line 140
    .line 141
    check-cast v2, Lu2/f;

    .line 142
    .line 143
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    check-cast v4, Ld2/a;

    .line 152
    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    invoke-virtual {v2, v4}, Lu2/f;->setBadge(Ld2/a;)V

    .line 156
    .line 157
    .line 158
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_7
    return-void
.end method

.method public final f(Z)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/navigation/b;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_8

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/b;->f:Lg2/b;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lu2/j;->b()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget-object p1, v0, Lu2/j;->R:Lu2/h;

    .line 16
    .line 17
    if-eqz p1, :cond_11

    .line 18
    .line 19
    iget-object v1, v0, Lu2/j;->l:[Lu2/i;

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_2
    iget-object v1, v0, Lu2/j;->Q:Lcom/google/android/material/navigation/b;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    iput-boolean v2, v1, Lcom/google/android/material/navigation/b;->g:Z

    .line 29
    .line 30
    invoke-virtual {p1}, Lu2/h;->b()V

    .line 31
    .line 32
    .line 33
    iget-object p1, v0, Lu2/j;->Q:Lcom/google/android/material/navigation/b;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iput-boolean v1, p1, Lcom/google/android/material/navigation/b;->g:Z

    .line 37
    .line 38
    iget-object p1, v0, Lu2/j;->l:[Lu2/i;

    .line 39
    .line 40
    if-eqz p1, :cond_10

    .line 41
    .line 42
    iget-object p1, v0, Lu2/j;->R:Lu2/h;

    .line 43
    .line 44
    if-eqz p1, :cond_10

    .line 45
    .line 46
    iget-object p1, p1, Lu2/h;->b:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iget-object v3, v0, Lu2/j;->l:[Lu2/i;

    .line 53
    .line 54
    array-length v3, v3

    .line 55
    if-eq p1, v3, :cond_3

    .line 56
    .line 57
    goto/16 :goto_7

    .line 58
    .line 59
    :cond_3
    move p1, v1

    .line 60
    :goto_0
    iget-object v3, v0, Lu2/j;->l:[Lu2/i;

    .line 61
    .line 62
    array-length v3, v3

    .line 63
    if-ge p1, v3, :cond_8

    .line 64
    .line 65
    iget-object v3, v0, Lu2/j;->R:Lu2/h;

    .line 66
    .line 67
    invoke-virtual {v3, p1}, Lu2/h;->a(I)Landroid/view/MenuItem;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    instance-of v3, v3, Lu2/a;

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    iget-object v3, v0, Lu2/j;->l:[Lu2/i;

    .line 76
    .line 77
    aget-object v3, v3, p1

    .line 78
    .line 79
    instance-of v3, v3, Lu2/c;

    .line 80
    .line 81
    if-nez v3, :cond_4

    .line 82
    .line 83
    goto/16 :goto_7

    .line 84
    .line 85
    :cond_4
    iget-object v3, v0, Lu2/j;->R:Lu2/h;

    .line 86
    .line 87
    invoke-virtual {v3, p1}, Lu2/h;->a(I)Landroid/view/MenuItem;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-interface {v3}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    iget-object v3, v0, Lu2/j;->l:[Lu2/i;

    .line 98
    .line 99
    aget-object v3, v3, p1

    .line 100
    .line 101
    instance-of v3, v3, Lu2/k;

    .line 102
    .line 103
    if-nez v3, :cond_5

    .line 104
    .line 105
    move v3, v2

    .line 106
    goto :goto_1

    .line 107
    :cond_5
    move v3, v1

    .line 108
    :goto_1
    iget-object v4, v0, Lu2/j;->R:Lu2/h;

    .line 109
    .line 110
    invoke-virtual {v4, p1}, Lu2/h;->a(I)Landroid/view/MenuItem;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-interface {v4}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_6

    .line 119
    .line 120
    iget-object v4, v0, Lu2/j;->l:[Lu2/i;

    .line 121
    .line 122
    aget-object v4, v4, p1

    .line 123
    .line 124
    instance-of v4, v4, Lu2/f;

    .line 125
    .line 126
    if-nez v4, :cond_6

    .line 127
    .line 128
    move v4, v2

    .line 129
    goto :goto_2

    .line 130
    :cond_6
    move v4, v1

    .line 131
    :goto_2
    iget-object v5, v0, Lu2/j;->R:Lu2/h;

    .line 132
    .line 133
    invoke-virtual {v5, p1}, Lu2/h;->a(I)Landroid/view/MenuItem;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    instance-of v5, v5, Lu2/a;

    .line 138
    .line 139
    if-nez v5, :cond_7

    .line 140
    .line 141
    if-nez v3, :cond_10

    .line 142
    .line 143
    if-eqz v4, :cond_7

    .line 144
    .line 145
    goto/16 :goto_7

    .line 146
    .line 147
    :cond_7
    add-int/lit8 p1, p1, 0x1

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_8
    iget p1, v0, Lu2/j;->m:I

    .line 151
    .line 152
    iget-object v3, v0, Lu2/j;->R:Lu2/h;

    .line 153
    .line 154
    iget-object v3, v3, Lu2/h;->b:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    move v4, v1

    .line 161
    :goto_3
    if-ge v4, v3, :cond_a

    .line 162
    .line 163
    iget-object v5, v0, Lu2/j;->R:Lu2/h;

    .line 164
    .line 165
    invoke-virtual {v5, v4}, Lu2/h;->a(I)Landroid/view/MenuItem;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-interface {v5}, Landroid/view/MenuItem;->isChecked()Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_9

    .line 174
    .line 175
    invoke-virtual {v0, v5}, Lu2/j;->setCheckedItem(Landroid/view/MenuItem;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    iput v5, v0, Lu2/j;->m:I

    .line 183
    .line 184
    iput v4, v0, Lu2/j;->n:I

    .line 185
    .line 186
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_a
    iget v4, v0, Lu2/j;->m:I

    .line 190
    .line 191
    if-eq p1, v4, :cond_b

    .line 192
    .line 193
    iget-object p1, v0, Lu2/j;->f:Lp1/a;

    .line 194
    .line 195
    if-eqz p1, :cond_b

    .line 196
    .line 197
    invoke-static {v0, p1}, Lp1/v;->a(Landroid/view/ViewGroup;Lp1/r;)V

    .line 198
    .line 199
    .line 200
    :cond_b
    iget p1, v0, Lu2/j;->j:I

    .line 201
    .line 202
    invoke-virtual {v0}, Lu2/j;->getCurrentVisibleContentItemCount()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    const/4 v5, -0x1

    .line 207
    if-ne p1, v5, :cond_c

    .line 208
    .line 209
    const/4 p1, 0x3

    .line 210
    if-le v4, p1, :cond_d

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_c
    if-nez p1, :cond_d

    .line 214
    .line 215
    :goto_4
    move p1, v2

    .line 216
    goto :goto_5

    .line 217
    :cond_d
    move p1, v1

    .line 218
    :goto_5
    move v4, v1

    .line 219
    :goto_6
    if-ge v4, v3, :cond_11

    .line 220
    .line 221
    iget-object v5, v0, Lu2/j;->Q:Lcom/google/android/material/navigation/b;

    .line 222
    .line 223
    iput-boolean v2, v5, Lcom/google/android/material/navigation/b;->g:Z

    .line 224
    .line 225
    iget-object v5, v0, Lu2/j;->l:[Lu2/i;

    .line 226
    .line 227
    aget-object v5, v5, v4

    .line 228
    .line 229
    iget-boolean v6, v0, Lu2/j;->W:Z

    .line 230
    .line 231
    invoke-interface {v5, v6}, Lu2/i;->setExpanded(Z)V

    .line 232
    .line 233
    .line 234
    iget-object v5, v0, Lu2/j;->l:[Lu2/i;

    .line 235
    .line 236
    aget-object v5, v5, v4

    .line 237
    .line 238
    instance-of v6, v5, Lu2/f;

    .line 239
    .line 240
    if-eqz v6, :cond_e

    .line 241
    .line 242
    check-cast v5, Lu2/f;

    .line 243
    .line 244
    iget v6, v0, Lu2/j;->j:I

    .line 245
    .line 246
    invoke-virtual {v5, v6}, Lu2/f;->setLabelVisibilityMode(I)V

    .line 247
    .line 248
    .line 249
    iget v6, v0, Lu2/j;->k:I

    .line 250
    .line 251
    invoke-virtual {v5, v6}, Lu2/f;->setItemIconGravity(I)V

    .line 252
    .line 253
    .line 254
    iget v6, v0, Lu2/j;->M:I

    .line 255
    .line 256
    invoke-virtual {v5, v6}, Lu2/f;->setItemGravity(I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v5, p1}, Lu2/f;->setShifting(Z)V

    .line 260
    .line 261
    .line 262
    :cond_e
    iget-object v5, v0, Lu2/j;->R:Lu2/h;

    .line 263
    .line 264
    invoke-virtual {v5, v4}, Lu2/h;->a(I)Landroid/view/MenuItem;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    instance-of v5, v5, Lj/o;

    .line 269
    .line 270
    if-eqz v5, :cond_f

    .line 271
    .line 272
    iget-object v5, v0, Lu2/j;->l:[Lu2/i;

    .line 273
    .line 274
    aget-object v5, v5, v4

    .line 275
    .line 276
    iget-object v6, v0, Lu2/j;->R:Lu2/h;

    .line 277
    .line 278
    invoke-virtual {v6, v4}, Lu2/h;->a(I)Landroid/view/MenuItem;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    check-cast v6, Lj/o;

    .line 283
    .line 284
    invoke-interface {v5, v6}, Lj/z;->b(Lj/o;)V

    .line 285
    .line 286
    .line 287
    :cond_f
    iget-object v5, v0, Lu2/j;->Q:Lcom/google/android/material/navigation/b;

    .line 288
    .line 289
    iput-boolean v1, v5, Lcom/google/android/material/navigation/b;->g:Z

    .line 290
    .line 291
    add-int/lit8 v4, v4, 0x1

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_10
    :goto_7
    invoke-virtual {v0}, Lu2/j;->b()V

    .line 295
    .line 296
    .line 297
    :cond_11
    :goto_8
    return-void
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/navigation/b;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final h(Landroid/content/Context;Lj/m;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/material/navigation/b;->f:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lu2/j;->a(Lj/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j()Landroid/os/Parcelable;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/navigation/b;->f:Lg2/b;

    .line 7
    .line 8
    invoke-virtual {v1}, Lu2/j;->getSelectedItemId()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iput v1, v0, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;->f:I

    .line 13
    .line 14
    iget-object v1, p0, Lcom/google/android/material/navigation/b;->f:Lg2/b;

    .line 15
    .line 16
    invoke-virtual {v1}, Lu2/j;->getBadgeDrawables()Landroid/util/SparseArray;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 21
    .line 22
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-ge v3, v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Ld2/a;

    .line 41
    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    iget-object v5, v5, Ld2/a;->j:Ld2/b;

    .line 45
    .line 46
    iget-object v5, v5, Ld2/b;->a:Lcom/google/android/material/badge/BadgeState$State;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/4 v5, 0x0

    .line 50
    :goto_1
    invoke-virtual {v2, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iput-object v2, v0, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;->g:Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 57
    .line 58
    return-object v0
.end method

.method public final k(Lj/o;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final m(Lj/e0;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
