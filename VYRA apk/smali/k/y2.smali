.class public final Lk/y2;
.super Landroid/util/Property;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0

    .line 1
    iput p2, p0, Lk/y2;->a:I

    .line 2
    .line 3
    invoke-direct {p0, p3, p1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk/y2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv2/o;

    .line 7
    .line 8
    invoke-virtual {p1}, Lv2/o;->b()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :pswitch_0
    check-cast p1, Lv2/j;

    .line 18
    .line 19
    iget p1, p1, Lv2/j;->i:F

    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_1
    check-cast p1, Lv2/j;

    .line 27
    .line 28
    iget p1, p1, Lv2/j;->h:F

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_2
    check-cast p1, Lv2/h;

    .line 36
    .line 37
    iget p1, p1, Lv2/h;->i:F

    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :pswitch_3
    check-cast p1, Lv2/h;

    .line 45
    .line 46
    iget p1, p1, Lv2/h;->h:F

    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 61
    .line 62
    sget-object v0, Lp1/c0;->a:Lp1/h0;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lu1/h0;->D(Landroid/view/View;)F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :pswitch_6
    check-cast p1, Landroid/view/View;

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    return-object p1

    .line 77
    :pswitch_7
    check-cast p1, Landroid/view/View;

    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    return-object p1

    .line 81
    :pswitch_8
    check-cast p1, Landroid/view/View;

    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    return-object p1

    .line 85
    :pswitch_9
    check-cast p1, Lp1/d;

    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    return-object p1

    .line 89
    :pswitch_a
    check-cast p1, Lp1/d;

    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    return-object p1

    .line 93
    :pswitch_b
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 94
    .line 95
    iget p1, p1, Landroidx/appcompat/widget/SwitchCompat;->E:F

    .line 96
    .line 97
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget v0, p0, Lk/y2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv2/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Float;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iget v0, p1, Lv2/o;->n:F

    .line 15
    .line 16
    cmpl-float v0, v0, p2

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iput p2, p1, Lv2/o;->n:F

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    check-cast p1, Lv2/j;

    .line 27
    .line 28
    check-cast p2, Ljava/lang/Float;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iput p2, p1, Lv2/j;->i:F

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    check-cast p1, Lv2/j;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Float;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iput p2, p1, Lv2/j;->h:F

    .line 46
    .line 47
    const v0, 0x45bb8000    # 6000.0f

    .line 48
    .line 49
    .line 50
    mul-float/2addr p2, v0

    .line 51
    float-to-int p2, p2

    .line 52
    iget-object v0, p1, Lv2/j;->e:Landroid/animation/TimeInterpolator;

    .line 53
    .line 54
    iget-object v1, p1, Le/a0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Lv2/p;

    .line 64
    .line 65
    const/high16 v4, 0x44870000    # 1080.0f

    .line 66
    .line 67
    iget v5, p1, Lv2/j;->h:F

    .line 68
    .line 69
    mul-float/2addr v5, v4

    .line 70
    sget-object v4, Lv2/j;->l:[I

    .line 71
    .line 72
    array-length v6, v4

    .line 73
    const/4 v7, 0x0

    .line 74
    move v8, v2

    .line 75
    move v9, v7

    .line 76
    :goto_0
    if-ge v8, v6, :cond_1

    .line 77
    .line 78
    aget v10, v4, v8

    .line 79
    .line 80
    const/16 v11, 0x1f4

    .line 81
    .line 82
    invoke-static {p2, v10, v11}, Le/a0;->g(III)F

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    invoke-interface {v0, v10}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    const/high16 v11, 0x42b40000    # 90.0f

    .line 91
    .line 92
    mul-float/2addr v10, v11

    .line 93
    add-float/2addr v9, v10

    .line 94
    add-int/lit8 v8, v8, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    add-float/2addr v5, v9

    .line 98
    iput v5, v3, Lv2/p;->f:F

    .line 99
    .line 100
    const/16 v5, 0xbb8

    .line 101
    .line 102
    invoke-static {p2, v2, v5}, Le/a0;->g(III)F

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-interface {v0, v6}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    invoke-static {p2, v5, v5}, Le/a0;->g(III)F

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-interface {v0, v5}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    sub-float/2addr v6, v5

    .line 119
    iput v7, v3, Lv2/p;->a:F

    .line 120
    .line 121
    sget-object v5, Lv2/j;->m:[F

    .line 122
    .line 123
    aget v8, v5, v2

    .line 124
    .line 125
    const/4 v9, 0x1

    .line 126
    aget v5, v5, v9

    .line 127
    .line 128
    invoke-static {v8, v5, v6}, Lu1/h0;->K(FFF)F

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    iput v5, v3, Lv2/p;->b:F

    .line 133
    .line 134
    iget v6, p1, Lv2/j;->i:F

    .line 135
    .line 136
    cmpl-float v8, v6, v7

    .line 137
    .line 138
    const/high16 v9, 0x3f800000    # 1.0f

    .line 139
    .line 140
    if-lez v8, :cond_2

    .line 141
    .line 142
    sub-float v6, v9, v6

    .line 143
    .line 144
    mul-float/2addr v6, v5

    .line 145
    iput v6, v3, Lv2/p;->b:F

    .line 146
    .line 147
    :cond_2
    move v3, v2

    .line 148
    :goto_1
    array-length v5, v4

    .line 149
    if-ge v3, v5, :cond_4

    .line 150
    .line 151
    aget v5, v4, v3

    .line 152
    .line 153
    const/16 v6, 0x64

    .line 154
    .line 155
    invoke-static {p2, v5, v6}, Le/a0;->g(III)F

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    cmpl-float v6, v5, v7

    .line 160
    .line 161
    if-ltz v6, :cond_3

    .line 162
    .line 163
    cmpg-float v6, v5, v9

    .line 164
    .line 165
    if-gtz v6, :cond_3

    .line 166
    .line 167
    iget p2, p1, Lv2/j;->g:I

    .line 168
    .line 169
    add-int/2addr v3, p2

    .line 170
    iget-object p2, p1, Lv2/j;->f:Lv2/l;

    .line 171
    .line 172
    iget-object p2, p2, Lv2/l;->e:[I

    .line 173
    .line 174
    array-length v4, p2

    .line 175
    rem-int/2addr v3, v4

    .line 176
    add-int/lit8 v4, v3, 0x1

    .line 177
    .line 178
    array-length v6, p2

    .line 179
    rem-int/2addr v4, v6

    .line 180
    aget v3, p2, v3

    .line 181
    .line 182
    aget p2, p2, v4

    .line 183
    .line 184
    invoke-interface {v0, v5}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, Lv2/p;

    .line 193
    .line 194
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-static {v0, v2, p2}, Lb2/b;->a(FLjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    iput p2, v1, Lv2/p;->c:I

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_4
    :goto_2
    iget-object p1, p1, Le/a0;->a:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast p1, Lv2/s;

    .line 219
    .line 220
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_2
    check-cast p1, Lv2/h;

    .line 225
    .line 226
    check-cast p2, Ljava/lang/Float;

    .line 227
    .line 228
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    iput p2, p1, Lv2/h;->i:F

    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_3
    check-cast p1, Lv2/h;

    .line 236
    .line 237
    check-cast p2, Ljava/lang/Float;

    .line 238
    .line 239
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    iput p2, p1, Lv2/h;->h:F

    .line 244
    .line 245
    const v0, 0x45a8c000    # 5400.0f

    .line 246
    .line 247
    .line 248
    mul-float/2addr p2, v0

    .line 249
    float-to-int p2, p2

    .line 250
    iget-object v0, p1, Lv2/h;->e:Le1/a;

    .line 251
    .line 252
    iget-object v1, p1, Le/a0;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v1, Ljava/util/ArrayList;

    .line 255
    .line 256
    const/4 v2, 0x0

    .line 257
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    check-cast v3, Lv2/p;

    .line 262
    .line 263
    const/high16 v4, 0x44be0000    # 1520.0f

    .line 264
    .line 265
    iget v5, p1, Lv2/h;->h:F

    .line 266
    .line 267
    mul-float/2addr v5, v4

    .line 268
    const/high16 v4, -0x3e600000    # -20.0f

    .line 269
    .line 270
    add-float/2addr v4, v5

    .line 271
    iput v4, v3, Lv2/p;->a:F

    .line 272
    .line 273
    iput v5, v3, Lv2/p;->b:F

    .line 274
    .line 275
    move v4, v2

    .line 276
    :goto_3
    const/4 v5, 0x4

    .line 277
    if-ge v4, v5, :cond_5

    .line 278
    .line 279
    sget-object v5, Lv2/h;->k:[I

    .line 280
    .line 281
    aget v5, v5, v4

    .line 282
    .line 283
    const/16 v6, 0x29b

    .line 284
    .line 285
    invoke-static {p2, v5, v6}, Le/a0;->g(III)F

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    iget v7, v3, Lv2/p;->b:F

    .line 290
    .line 291
    invoke-virtual {v0, v5}, Le1/a;->getInterpolation(F)F

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    const/high16 v8, 0x437a0000    # 250.0f

    .line 296
    .line 297
    mul-float/2addr v5, v8

    .line 298
    add-float/2addr v5, v7

    .line 299
    iput v5, v3, Lv2/p;->b:F

    .line 300
    .line 301
    sget-object v5, Lv2/h;->l:[I

    .line 302
    .line 303
    aget v5, v5, v4

    .line 304
    .line 305
    invoke-static {p2, v5, v6}, Le/a0;->g(III)F

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    iget v6, v3, Lv2/p;->a:F

    .line 310
    .line 311
    invoke-virtual {v0, v5}, Le1/a;->getInterpolation(F)F

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    mul-float/2addr v5, v8

    .line 316
    add-float/2addr v5, v6

    .line 317
    iput v5, v3, Lv2/p;->a:F

    .line 318
    .line 319
    add-int/lit8 v4, v4, 0x1

    .line 320
    .line 321
    goto :goto_3

    .line 322
    :cond_5
    iget v4, v3, Lv2/p;->a:F

    .line 323
    .line 324
    iget v6, v3, Lv2/p;->b:F

    .line 325
    .line 326
    sub-float v7, v6, v4

    .line 327
    .line 328
    iget v8, p1, Lv2/h;->i:F

    .line 329
    .line 330
    mul-float/2addr v7, v8

    .line 331
    add-float/2addr v7, v4

    .line 332
    const/high16 v4, 0x43b40000    # 360.0f

    .line 333
    .line 334
    div-float/2addr v7, v4

    .line 335
    iput v7, v3, Lv2/p;->a:F

    .line 336
    .line 337
    div-float/2addr v6, v4

    .line 338
    iput v6, v3, Lv2/p;->b:F

    .line 339
    .line 340
    move v3, v2

    .line 341
    :goto_4
    if-ge v3, v5, :cond_7

    .line 342
    .line 343
    sget-object v4, Lv2/h;->m:[I

    .line 344
    .line 345
    aget v4, v4, v3

    .line 346
    .line 347
    const/16 v6, 0x14d

    .line 348
    .line 349
    invoke-static {p2, v4, v6}, Le/a0;->g(III)F

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    const/4 v6, 0x0

    .line 354
    cmpl-float v6, v4, v6

    .line 355
    .line 356
    if-lez v6, :cond_6

    .line 357
    .line 358
    const/high16 v6, 0x3f800000    # 1.0f

    .line 359
    .line 360
    cmpg-float v6, v4, v6

    .line 361
    .line 362
    if-gez v6, :cond_6

    .line 363
    .line 364
    iget p2, p1, Lv2/h;->g:I

    .line 365
    .line 366
    add-int/2addr v3, p2

    .line 367
    iget-object p2, p1, Lv2/h;->f:Lv2/l;

    .line 368
    .line 369
    iget-object p2, p2, Lv2/l;->e:[I

    .line 370
    .line 371
    array-length v5, p2

    .line 372
    rem-int/2addr v3, v5

    .line 373
    add-int/lit8 v5, v3, 0x1

    .line 374
    .line 375
    array-length v6, p2

    .line 376
    rem-int/2addr v5, v6

    .line 377
    aget v3, p2, v3

    .line 378
    .line 379
    aget p2, p2, v5

    .line 380
    .line 381
    invoke-virtual {v0, v4}, Le1/a;->getInterpolation(F)F

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    check-cast v1, Lv2/p;

    .line 390
    .line 391
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 396
    .line 397
    .line 398
    move-result-object p2

    .line 399
    invoke-static {v0, v2, p2}, Lb2/b;->a(FLjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object p2

    .line 403
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 404
    .line 405
    .line 406
    move-result p2

    .line 407
    iput p2, v1, Lv2/p;->c:I

    .line 408
    .line 409
    goto :goto_5

    .line 410
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 411
    .line 412
    goto :goto_4

    .line 413
    :cond_7
    :goto_5
    iget-object p1, p1, Le/a0;->a:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast p1, Lv2/s;

    .line 416
    .line 417
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 418
    .line 419
    .line 420
    return-void

    .line 421
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 422
    .line 423
    check-cast p2, Landroid/graphics/Rect;

    .line 424
    .line 425
    invoke-virtual {p1, p2}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 430
    .line 431
    check-cast p2, Ljava/lang/Float;

    .line 432
    .line 433
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 434
    .line 435
    .line 436
    move-result p2

    .line 437
    sget-object v0, Lp1/c0;->a:Lp1/h0;

    .line 438
    .line 439
    invoke-virtual {v0, p1, p2}, Lu1/h0;->m0(Landroid/view/View;F)V

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :pswitch_6
    check-cast p1, Landroid/view/View;

    .line 444
    .line 445
    check-cast p2, Landroid/graphics/PointF;

    .line 446
    .line 447
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 448
    .line 449
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 454
    .line 455
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 456
    .line 457
    .line 458
    move-result p2

    .line 459
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    add-int/2addr v1, v0

    .line 464
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 465
    .line 466
    .line 467
    move-result v2

    .line 468
    add-int/2addr v2, p2

    .line 469
    invoke-static {p1, v0, p2, v1, v2}, Lp1/c0;->a(Landroid/view/View;IIII)V

    .line 470
    .line 471
    .line 472
    return-void

    .line 473
    :pswitch_7
    check-cast p1, Landroid/view/View;

    .line 474
    .line 475
    check-cast p2, Landroid/graphics/PointF;

    .line 476
    .line 477
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 478
    .line 479
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 484
    .line 485
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 486
    .line 487
    .line 488
    move-result p2

    .line 489
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    invoke-static {p1, v0, p2, v1, v2}, Lp1/c0;->a(Landroid/view/View;IIII)V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :pswitch_8
    check-cast p1, Landroid/view/View;

    .line 502
    .line 503
    check-cast p2, Landroid/graphics/PointF;

    .line 504
    .line 505
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 510
    .line 511
    .line 512
    move-result v1

    .line 513
    iget v2, p2, Landroid/graphics/PointF;->x:F

    .line 514
    .line 515
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 520
    .line 521
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 522
    .line 523
    .line 524
    move-result p2

    .line 525
    invoke-static {p1, v0, v1, v2, p2}, Lp1/c0;->a(Landroid/view/View;IIII)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :pswitch_9
    check-cast p1, Lp1/d;

    .line 530
    .line 531
    check-cast p2, Landroid/graphics/PointF;

    .line 532
    .line 533
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 537
    .line 538
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    iput v0, p1, Lp1/d;->c:I

    .line 543
    .line 544
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 545
    .line 546
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 547
    .line 548
    .line 549
    move-result p2

    .line 550
    iput p2, p1, Lp1/d;->d:I

    .line 551
    .line 552
    iget v0, p1, Lp1/d;->g:I

    .line 553
    .line 554
    add-int/lit8 v0, v0, 0x1

    .line 555
    .line 556
    iput v0, p1, Lp1/d;->g:I

    .line 557
    .line 558
    iget v1, p1, Lp1/d;->f:I

    .line 559
    .line 560
    if-ne v1, v0, :cond_8

    .line 561
    .line 562
    iget-object v0, p1, Lp1/d;->e:Landroid/view/View;

    .line 563
    .line 564
    iget v1, p1, Lp1/d;->a:I

    .line 565
    .line 566
    iget v2, p1, Lp1/d;->b:I

    .line 567
    .line 568
    iget v3, p1, Lp1/d;->c:I

    .line 569
    .line 570
    invoke-static {v0, v1, v2, v3, p2}, Lp1/c0;->a(Landroid/view/View;IIII)V

    .line 571
    .line 572
    .line 573
    const/4 p2, 0x0

    .line 574
    iput p2, p1, Lp1/d;->f:I

    .line 575
    .line 576
    iput p2, p1, Lp1/d;->g:I

    .line 577
    .line 578
    :cond_8
    return-void

    .line 579
    :pswitch_a
    check-cast p1, Lp1/d;

    .line 580
    .line 581
    check-cast p2, Landroid/graphics/PointF;

    .line 582
    .line 583
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 587
    .line 588
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    iput v0, p1, Lp1/d;->a:I

    .line 593
    .line 594
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 595
    .line 596
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 597
    .line 598
    .line 599
    move-result p2

    .line 600
    iput p2, p1, Lp1/d;->b:I

    .line 601
    .line 602
    iget v0, p1, Lp1/d;->f:I

    .line 603
    .line 604
    add-int/lit8 v0, v0, 0x1

    .line 605
    .line 606
    iput v0, p1, Lp1/d;->f:I

    .line 607
    .line 608
    iget v1, p1, Lp1/d;->g:I

    .line 609
    .line 610
    if-ne v0, v1, :cond_9

    .line 611
    .line 612
    iget-object v0, p1, Lp1/d;->e:Landroid/view/View;

    .line 613
    .line 614
    iget v1, p1, Lp1/d;->a:I

    .line 615
    .line 616
    iget v2, p1, Lp1/d;->c:I

    .line 617
    .line 618
    iget v3, p1, Lp1/d;->d:I

    .line 619
    .line 620
    invoke-static {v0, v1, p2, v2, v3}, Lp1/c0;->a(Landroid/view/View;IIII)V

    .line 621
    .line 622
    .line 623
    const/4 p2, 0x0

    .line 624
    iput p2, p1, Lp1/d;->f:I

    .line 625
    .line 626
    iput p2, p1, Lp1/d;->g:I

    .line 627
    .line 628
    :cond_9
    return-void

    .line 629
    :pswitch_b
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 630
    .line 631
    check-cast p2, Ljava/lang/Float;

    .line 632
    .line 633
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 634
    .line 635
    .line 636
    move-result p2

    .line 637
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V

    .line 638
    .line 639
    .line 640
    return-void

    .line 641
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
