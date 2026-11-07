.class public final Lb3/e;
.super Lt2/i;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lz/b;


# direct methods
.method public synthetic constructor <init>(Lz/b;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb3/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb3/e;->b:Lz/b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final C(I)V
    .locals 2

    .line 1
    iget v0, p0, Lb3/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lb3/e;->b:Lz/b;

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    iget-boolean v1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    const/4 v0, 0x1

    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lb3/e;->b:Lz/b;

    .line 25
    .line 26
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 27
    .line 28
    iget-boolean v1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->l:Z

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->x(I)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final D(Landroid/view/View;II)V
    .locals 4

    .line 1
    iget v0, p0, Lb3/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lb3/e;->b:Lz/b;

    .line 7
    .line 8
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 9
    .line 10
    invoke-virtual {p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p3, p0, Lb3/e;->b:Lz/b;

    .line 15
    .line 16
    check-cast p3, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 17
    .line 18
    iget-object v0, p3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->v:Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/view/View;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v2, p3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:Le4/a;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {v2, v1, v3, p1}, Le4/a;->m0(Landroid/view/ViewGroup$MarginLayoutParams;II)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object p1, p3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->A:Ljava/util/LinkedHashSet;

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    iget-object p3, p3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:Le4/a;

    .line 65
    .line 66
    invoke-virtual {p3, p2}, Le4/a;->e(I)F

    .line 67
    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-nez p2, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    invoke-static {p1}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    throw p1

    .line 85
    :cond_3
    :goto_1
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final E(Landroid/view/View;FF)V
    .locals 5

    .line 1
    iget v0, p0, Lb3/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    cmpg-float v1, p3, v0

    .line 8
    .line 9
    iget-object v2, p0, Lb3/e;->b:Lz/b;

    .line 10
    .line 11
    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    const/4 v3, 0x6

    .line 14
    const/4 v4, 0x3

    .line 15
    if-gez v1, :cond_2

    .line 16
    .line 17
    iget-boolean p2, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:Z

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    :cond_0
    :goto_0
    move v3, v4

    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 29
    .line 30
    .line 31
    iget p3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:I

    .line 32
    .line 33
    if-le p2, p3, :cond_0

    .line 34
    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :cond_2
    iget-boolean v1, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O:Z

    .line 38
    .line 39
    if-eqz v1, :cond_7

    .line 40
    .line 41
    invoke-virtual {v2, p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L(Landroid/view/View;F)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_7

    .line 46
    .line 47
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    cmpg-float p2, p2, v0

    .line 56
    .line 57
    if-gez p2, :cond_3

    .line 58
    .line 59
    iget p2, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I

    .line 60
    .line 61
    int-to-float p2, p2

    .line 62
    cmpl-float p2, p3, p2

    .line 63
    .line 64
    if-gtz p2, :cond_4

    .line 65
    .line 66
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    iget p3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0:I

    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    add-int/2addr v0, p3

    .line 77
    div-int/lit8 v0, v0, 0x2

    .line 78
    .line 79
    if-le p2, v0, :cond_5

    .line 80
    .line 81
    :cond_4
    const/4 v3, 0x5

    .line 82
    goto/16 :goto_2

    .line 83
    .line 84
    :cond_5
    iget-boolean p2, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:Z

    .line 85
    .line 86
    if-eqz p2, :cond_6

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    invoke-virtual {v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D()I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    sub-int/2addr p2, p3

    .line 98
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    iget v0, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:I

    .line 107
    .line 108
    sub-int/2addr p3, v0

    .line 109
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    if-ge p2, p3, :cond_e

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_7
    cmpl-float v0, p3, v0

    .line 117
    .line 118
    const/4 v1, 0x4

    .line 119
    if-eqz v0, :cond_b

    .line 120
    .line 121
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    cmpl-float p2, p2, p3

    .line 130
    .line 131
    if-lez p2, :cond_8

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_8
    iget-boolean p2, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:Z

    .line 135
    .line 136
    if-eqz p2, :cond_a

    .line 137
    .line 138
    :cond_9
    move v3, v1

    .line 139
    goto :goto_2

    .line 140
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    iget p3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:I

    .line 145
    .line 146
    sub-int p3, p2, p3

    .line 147
    .line 148
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    iget v0, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:I

    .line 153
    .line 154
    sub-int/2addr p2, v0

    .line 155
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    if-ge p3, p2, :cond_9

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_b
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    iget-boolean p3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:Z

    .line 167
    .line 168
    if-eqz p3, :cond_c

    .line 169
    .line 170
    iget p3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:I

    .line 171
    .line 172
    sub-int p3, p2, p3

    .line 173
    .line 174
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 175
    .line 176
    .line 177
    move-result p3

    .line 178
    iget v0, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:I

    .line 179
    .line 180
    sub-int/2addr p2, v0

    .line 181
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-ge p3, p2, :cond_9

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_c
    iget p3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:I

    .line 190
    .line 191
    if-ge p2, p3, :cond_d

    .line 192
    .line 193
    iget p3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:I

    .line 194
    .line 195
    sub-int p3, p2, p3

    .line 196
    .line 197
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 198
    .line 199
    .line 200
    move-result p3

    .line 201
    if-ge p2, p3, :cond_e

    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_d
    sub-int p3, p2, p3

    .line 206
    .line 207
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    iget v0, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:I

    .line 212
    .line 213
    sub-int/2addr p2, v0

    .line 214
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-ge p3, p2, :cond_9

    .line 219
    .line 220
    :cond_e
    :goto_2
    const/4 p2, 0x1

    .line 221
    invoke-virtual {v2, p1, v3, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M(Landroid/view/View;IZ)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :pswitch_0
    iget-object v0, p0, Lb3/e;->b:Lz/b;

    .line 226
    .line 227
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 228
    .line 229
    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:Le4/a;

    .line 230
    .line 231
    invoke-virtual {v1, p2}, Le4/a;->Q(F)Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_f

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_f
    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:Le4/a;

    .line 239
    .line 240
    invoke-virtual {v1, p1, p2}, Le4/a;->g0(Landroid/view/View;F)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_10

    .line 245
    .line 246
    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:Le4/a;

    .line 247
    .line 248
    invoke-virtual {v1, p2, p3}, Le4/a;->T(FF)Z

    .line 249
    .line 250
    .line 251
    move-result p2

    .line 252
    if-nez p2, :cond_13

    .line 253
    .line 254
    iget-object p2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:Le4/a;

    .line 255
    .line 256
    invoke-virtual {p2, p1}, Le4/a;->S(Landroid/view/View;)Z

    .line 257
    .line 258
    .line 259
    move-result p2

    .line 260
    if-eqz p2, :cond_12

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_10
    const/4 v1, 0x0

    .line 264
    cmpl-float v1, p2, v1

    .line 265
    .line 266
    if-eqz v1, :cond_11

    .line 267
    .line 268
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 273
    .line 274
    .line 275
    move-result p3

    .line 276
    cmpl-float p2, p2, p3

    .line 277
    .line 278
    if-lez p2, :cond_11

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_11
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    iget-object p3, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:Le4/a;

    .line 286
    .line 287
    invoke-virtual {p3}, Le4/a;->A()I

    .line 288
    .line 289
    .line 290
    move-result p3

    .line 291
    sub-int p3, p2, p3

    .line 292
    .line 293
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 294
    .line 295
    .line 296
    move-result p3

    .line 297
    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:Le4/a;

    .line 298
    .line 299
    invoke-virtual {v1}, Le4/a;->B()I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    sub-int/2addr p2, v1

    .line 304
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 305
    .line 306
    .line 307
    move-result p2

    .line 308
    if-ge p3, p2, :cond_13

    .line 309
    .line 310
    :cond_12
    :goto_3
    const/4 p2, 0x3

    .line 311
    goto :goto_5

    .line 312
    :cond_13
    :goto_4
    const/4 p2, 0x5

    .line 313
    :goto_5
    const/4 p3, 0x1

    .line 314
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->z(Landroid/view/View;IZ)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final Q(Landroid/view/View;I)Z
    .locals 5

    .line 1
    iget v0, p0, Lb3/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb3/e;->b:Lz/b;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 9
    .line 10
    iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-boolean v4, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l0:Z

    .line 18
    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 v4, 0x3

    .line 23
    if-ne v1, v4, :cond_4

    .line 24
    .line 25
    iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i0:I

    .line 26
    .line 27
    if-ne v1, p2, :cond_4

    .line 28
    .line 29
    iget-boolean p2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:Z

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    iget-object p2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k0:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    move-object v1, p2

    .line 43
    check-cast v1, Landroid/view/View;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object p2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    move-object v1, p2

    .line 65
    check-cast v1, Landroid/view/View;

    .line 66
    .line 67
    :cond_3
    :goto_0
    if-eqz v1, :cond_4

    .line 68
    .line 69
    const/4 p2, -0x1

    .line 70
    invoke-virtual {v1, p2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 78
    .line 79
    .line 80
    iget-object p2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:Ljava/lang/ref/WeakReference;

    .line 81
    .line 82
    if-eqz p2, :cond_5

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    if-ne p2, p1, :cond_5

    .line 89
    .line 90
    move v2, v3

    .line 91
    :cond_5
    :goto_1
    return v2

    .line 92
    :pswitch_0
    iget-object p2, p0, Lb3/e;->b:Lz/b;

    .line 93
    .line 94
    check-cast p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 95
    .line 96
    iget v0, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 97
    .line 98
    const/4 v1, 0x1

    .line 99
    if-ne v0, v1, :cond_6

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    iget-object p2, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:Ljava/lang/ref/WeakReference;

    .line 103
    .line 104
    if-eqz p2, :cond_7

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    if-ne p2, p1, :cond_7

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_7
    :goto_2
    const/4 v1, 0x0

    .line 114
    :goto_3
    return v1

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/view/View;I)I
    .locals 1

    .line 1
    iget v0, p0, Lb3/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object p1, p0, Lb3/e;->b:Lz/b;

    .line 12
    .line 13
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 14
    .line 15
    iget-object v0, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:Le4/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Le4/a;->E()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->f:Le4/a;

    .line 22
    .line 23
    invoke-virtual {p1}, Le4/a;->D()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p2, v0, p1}, Lu1/h0;->j(III)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;I)I
    .locals 1

    .line 1
    iget v0, p0, Lb3/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lb3/e;->b:Lz/b;

    .line 7
    .line 8
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p0}, Lb3/e;->r()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {p2, p1, v0}, Lu1/h0;->j(III)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public q(Landroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, Lb3/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lt2/i;->q(Landroid/view/View;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object p1, p0, Lb3/e;->b:Lz/b;

    .line 12
    .line 13
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 14
    .line 15
    iget v0, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->q:I

    .line 16
    .line 17
    iget p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t:I

    .line 18
    .line 19
    add-int/2addr v0, p1

    .line 20
    return v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public r()I
    .locals 2

    .line 1
    iget v0, p0, Lb3/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lt2/i;->r()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lb3/e;->b:Lz/b;

    .line 12
    .line 13
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    iget-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:I

    .line 23
    .line 24
    :goto_0
    return v0

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
