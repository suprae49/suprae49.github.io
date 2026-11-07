.class public final Lx/f;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public final synthetic h:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx/f;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 5
    .line 6
    iput-object p2, p0, Lx/f;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    return-void
.end method

.method public static a(III)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 v1, 0x40000000    # 2.0f

    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    const/high16 v0, -0x80000000

    .line 21
    .line 22
    if-eq p0, v0, :cond_1

    .line 23
    .line 24
    if-nez p0, :cond_2

    .line 25
    .line 26
    :cond_1
    if-ne p2, p1, :cond_2

    .line 27
    .line 28
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_2
    const/4 p0, 0x0

    .line 31
    return p0
.end method


# virtual methods
.method public final b(Lu/d;Lv/b;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_10

    .line 10
    .line 11
    :cond_0
    iget-object v3, v1, Lu/d;->K:Lu/c;

    .line 12
    .line 13
    iget-object v4, v1, Lu/d;->I:Lu/c;

    .line 14
    .line 15
    iget v5, v1, Lu/d;->g0:I

    .line 16
    .line 17
    const/16 v6, 0x8

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    if-ne v5, v6, :cond_1

    .line 21
    .line 22
    iput v7, v2, Lv/b;->e:I

    .line 23
    .line 24
    iput v7, v2, Lv/b;->f:I

    .line 25
    .line 26
    iput v7, v2, Lv/b;->g:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v5, v1, Lu/d;->T:Lu/d;

    .line 30
    .line 31
    if-nez v5, :cond_2

    .line 32
    .line 33
    goto/16 :goto_10

    .line 34
    .line 35
    :cond_2
    sget-object v5, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Lx/s;

    .line 36
    .line 37
    iget v5, v2, Lv/b;->a:I

    .line 38
    .line 39
    iget v6, v2, Lv/b;->b:I

    .line 40
    .line 41
    iget v8, v2, Lv/b;->c:I

    .line 42
    .line 43
    iget v9, v2, Lv/b;->d:I

    .line 44
    .line 45
    iget v10, v0, Lx/f;->b:I

    .line 46
    .line 47
    iget v11, v0, Lx/f;->c:I

    .line 48
    .line 49
    add-int/2addr v10, v11

    .line 50
    iget v11, v0, Lx/f;->d:I

    .line 51
    .line 52
    iget-object v12, v1, Lu/d;->f0:Landroid/view/View;

    .line 53
    .line 54
    invoke-static {v5}, Ls/e;->b(I)I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    const/4 v14, 0x1

    .line 59
    const/4 v15, 0x3

    .line 60
    const/4 v7, 0x2

    .line 61
    if-eqz v13, :cond_d

    .line 62
    .line 63
    if-eq v13, v14, :cond_c

    .line 64
    .line 65
    if-eq v13, v7, :cond_6

    .line 66
    .line 67
    if-eq v13, v15, :cond_3

    .line 68
    .line 69
    const/4 v8, 0x0

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget v8, v0, Lx/f;->f:I

    .line 72
    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    iget v13, v4, Lu/c;->g:I

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    const/4 v13, 0x0

    .line 79
    :goto_0
    if-eqz v3, :cond_5

    .line 80
    .line 81
    iget v15, v3, Lu/c;->g:I

    .line 82
    .line 83
    add-int/2addr v13, v15

    .line 84
    :cond_5
    add-int/2addr v11, v13

    .line 85
    const/4 v13, -0x1

    .line 86
    invoke-static {v8, v11, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    goto :goto_3

    .line 91
    :cond_6
    iget v8, v0, Lx/f;->f:I

    .line 92
    .line 93
    const/4 v13, -0x2

    .line 94
    invoke-static {v8, v11, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    iget v11, v1, Lu/d;->r:I

    .line 99
    .line 100
    if-ne v11, v14, :cond_7

    .line 101
    .line 102
    move v11, v14

    .line 103
    goto :goto_1

    .line 104
    :cond_7
    const/4 v11, 0x0

    .line 105
    :goto_1
    iget v13, v2, Lv/b;->j:I

    .line 106
    .line 107
    if-eq v13, v14, :cond_8

    .line 108
    .line 109
    if-ne v13, v7, :cond_e

    .line 110
    .line 111
    :cond_8
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    invoke-virtual {v1}, Lu/d;->k()I

    .line 116
    .line 117
    .line 118
    move-result v15

    .line 119
    if-ne v13, v15, :cond_9

    .line 120
    .line 121
    move v13, v14

    .line 122
    goto :goto_2

    .line 123
    :cond_9
    const/4 v13, 0x0

    .line 124
    :goto_2
    iget v15, v2, Lv/b;->j:I

    .line 125
    .line 126
    if-eq v15, v7, :cond_b

    .line 127
    .line 128
    if-eqz v11, :cond_b

    .line 129
    .line 130
    if-eqz v11, :cond_a

    .line 131
    .line 132
    if-nez v13, :cond_b

    .line 133
    .line 134
    :cond_a
    invoke-virtual {v1}, Lu/d;->A()Z

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    if-eqz v11, :cond_e

    .line 139
    .line 140
    :cond_b
    invoke-virtual {v1}, Lu/d;->q()I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    const/high16 v13, 0x40000000    # 2.0f

    .line 145
    .line 146
    invoke-static {v8, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    goto :goto_3

    .line 151
    :cond_c
    const/high16 v13, 0x40000000    # 2.0f

    .line 152
    .line 153
    iget v8, v0, Lx/f;->f:I

    .line 154
    .line 155
    const/4 v15, -0x2

    .line 156
    invoke-static {v8, v11, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    goto :goto_3

    .line 161
    :cond_d
    const/high16 v13, 0x40000000    # 2.0f

    .line 162
    .line 163
    invoke-static {v8, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    :cond_e
    :goto_3
    invoke-static {v6}, Ls/e;->b(I)I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_19

    .line 172
    .line 173
    if-eq v11, v14, :cond_18

    .line 174
    .line 175
    if-eq v11, v7, :cond_12

    .line 176
    .line 177
    const/4 v9, 0x3

    .line 178
    if-eq v11, v9, :cond_f

    .line 179
    .line 180
    const/4 v3, 0x0

    .line 181
    goto/16 :goto_7

    .line 182
    .line 183
    :cond_f
    iget v9, v0, Lx/f;->g:I

    .line 184
    .line 185
    if-eqz v4, :cond_10

    .line 186
    .line 187
    iget-object v4, v1, Lu/d;->J:Lu/c;

    .line 188
    .line 189
    iget v4, v4, Lu/c;->g:I

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_10
    const/4 v4, 0x0

    .line 193
    :goto_4
    if-eqz v3, :cond_11

    .line 194
    .line 195
    iget-object v3, v1, Lu/d;->L:Lu/c;

    .line 196
    .line 197
    iget v3, v3, Lu/c;->g:I

    .line 198
    .line 199
    add-int/2addr v4, v3

    .line 200
    :cond_11
    add-int/2addr v10, v4

    .line 201
    const/4 v13, -0x1

    .line 202
    invoke-static {v9, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    goto :goto_7

    .line 207
    :cond_12
    iget v3, v0, Lx/f;->g:I

    .line 208
    .line 209
    const/4 v13, -0x2

    .line 210
    invoke-static {v3, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    iget v4, v1, Lu/d;->s:I

    .line 215
    .line 216
    if-ne v4, v14, :cond_13

    .line 217
    .line 218
    move v4, v14

    .line 219
    goto :goto_5

    .line 220
    :cond_13
    const/4 v4, 0x0

    .line 221
    :goto_5
    iget v9, v2, Lv/b;->j:I

    .line 222
    .line 223
    if-eq v9, v14, :cond_14

    .line 224
    .line 225
    if-ne v9, v7, :cond_1a

    .line 226
    .line 227
    :cond_14
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    invoke-virtual {v1}, Lu/d;->q()I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    if-ne v9, v10, :cond_15

    .line 236
    .line 237
    move v9, v14

    .line 238
    goto :goto_6

    .line 239
    :cond_15
    const/4 v9, 0x0

    .line 240
    :goto_6
    iget v10, v2, Lv/b;->j:I

    .line 241
    .line 242
    if-eq v10, v7, :cond_17

    .line 243
    .line 244
    if-eqz v4, :cond_17

    .line 245
    .line 246
    if-eqz v4, :cond_16

    .line 247
    .line 248
    if-nez v9, :cond_17

    .line 249
    .line 250
    :cond_16
    invoke-virtual {v1}, Lu/d;->B()Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-eqz v4, :cond_1a

    .line 255
    .line 256
    :cond_17
    invoke-virtual {v1}, Lu/d;->k()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    const/high16 v13, 0x40000000    # 2.0f

    .line 261
    .line 262
    invoke-static {v3, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    goto :goto_7

    .line 267
    :cond_18
    const/high16 v13, 0x40000000    # 2.0f

    .line 268
    .line 269
    iget v3, v0, Lx/f;->g:I

    .line 270
    .line 271
    const/4 v15, -0x2

    .line 272
    invoke-static {v3, v10, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    goto :goto_7

    .line 277
    :cond_19
    const/high16 v13, 0x40000000    # 2.0f

    .line 278
    .line 279
    invoke-static {v9, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    :cond_1a
    :goto_7
    iget-object v4, v1, Lu/d;->T:Lu/d;

    .line 284
    .line 285
    check-cast v4, Lu/e;

    .line 286
    .line 287
    iget-object v9, v0, Lx/f;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 288
    .line 289
    if-eqz v4, :cond_1b

    .line 290
    .line 291
    iget v10, v9, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 292
    .line 293
    const/16 v11, 0x100

    .line 294
    .line 295
    invoke-static {v10, v11}, Lu/j;->c(II)Z

    .line 296
    .line 297
    .line 298
    move-result v10

    .line 299
    if-eqz v10, :cond_1b

    .line 300
    .line 301
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    invoke-virtual {v1}, Lu/d;->q()I

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    if-ne v10, v11, :cond_1b

    .line 310
    .line 311
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 312
    .line 313
    .line 314
    move-result v10

    .line 315
    invoke-virtual {v4}, Lu/d;->q()I

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    if-ge v10, v11, :cond_1b

    .line 320
    .line 321
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    invoke-virtual {v1}, Lu/d;->k()I

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    if-ne v10, v11, :cond_1b

    .line 330
    .line 331
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    invoke-virtual {v4}, Lu/d;->k()I

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    if-ge v10, v4, :cond_1b

    .line 340
    .line 341
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    iget v10, v1, Lu/d;->a0:I

    .line 346
    .line 347
    if-ne v4, v10, :cond_1b

    .line 348
    .line 349
    invoke-virtual {v1}, Lu/d;->z()Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-nez v4, :cond_1b

    .line 354
    .line 355
    iget v4, v1, Lu/d;->G:I

    .line 356
    .line 357
    invoke-virtual {v1}, Lu/d;->q()I

    .line 358
    .line 359
    .line 360
    move-result v10

    .line 361
    invoke-static {v4, v8, v10}, Lx/f;->a(III)Z

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    if-eqz v4, :cond_1b

    .line 366
    .line 367
    iget v4, v1, Lu/d;->H:I

    .line 368
    .line 369
    invoke-virtual {v1}, Lu/d;->k()I

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    invoke-static {v4, v3, v10}, Lx/f;->a(III)Z

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    if-eqz v4, :cond_1b

    .line 378
    .line 379
    invoke-virtual {v1}, Lu/d;->q()I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    iput v3, v2, Lv/b;->e:I

    .line 384
    .line 385
    invoke-virtual {v1}, Lu/d;->k()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    iput v3, v2, Lv/b;->f:I

    .line 390
    .line 391
    iget v1, v1, Lu/d;->a0:I

    .line 392
    .line 393
    iput v1, v2, Lv/b;->g:I

    .line 394
    .line 395
    return-void

    .line 396
    :cond_1b
    const/4 v4, 0x3

    .line 397
    if-ne v5, v4, :cond_1c

    .line 398
    .line 399
    move v10, v14

    .line 400
    goto :goto_8

    .line 401
    :cond_1c
    const/4 v10, 0x0

    .line 402
    :goto_8
    if-ne v6, v4, :cond_1d

    .line 403
    .line 404
    move v4, v14

    .line 405
    goto :goto_9

    .line 406
    :cond_1d
    const/4 v4, 0x0

    .line 407
    :goto_9
    const/4 v11, 0x4

    .line 408
    if-eq v6, v11, :cond_1f

    .line 409
    .line 410
    if-ne v6, v14, :cond_1e

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_1e
    const/4 v6, 0x0

    .line 414
    goto :goto_b

    .line 415
    :cond_1f
    :goto_a
    move v6, v14

    .line 416
    :goto_b
    if-eq v5, v11, :cond_21

    .line 417
    .line 418
    if-ne v5, v14, :cond_20

    .line 419
    .line 420
    goto :goto_c

    .line 421
    :cond_20
    const/4 v5, 0x0

    .line 422
    goto :goto_d

    .line 423
    :cond_21
    :goto_c
    move v5, v14

    .line 424
    :goto_d
    const/4 v11, 0x0

    .line 425
    if-eqz v10, :cond_22

    .line 426
    .line 427
    iget v13, v1, Lu/d;->W:F

    .line 428
    .line 429
    cmpl-float v13, v13, v11

    .line 430
    .line 431
    if-lez v13, :cond_22

    .line 432
    .line 433
    move v13, v14

    .line 434
    goto :goto_e

    .line 435
    :cond_22
    const/4 v13, 0x0

    .line 436
    :goto_e
    if-eqz v4, :cond_23

    .line 437
    .line 438
    iget v15, v1, Lu/d;->W:F

    .line 439
    .line 440
    cmpl-float v11, v15, v11

    .line 441
    .line 442
    if-lez v11, :cond_23

    .line 443
    .line 444
    move v11, v14

    .line 445
    goto :goto_f

    .line 446
    :cond_23
    const/4 v11, 0x0

    .line 447
    :goto_f
    if-nez v12, :cond_24

    .line 448
    .line 449
    :goto_10
    return-void

    .line 450
    :cond_24
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 451
    .line 452
    .line 453
    move-result-object v15

    .line 454
    check-cast v15, Lx/e;

    .line 455
    .line 456
    iget v0, v2, Lv/b;->j:I

    .line 457
    .line 458
    if-eq v0, v14, :cond_26

    .line 459
    .line 460
    if-eq v0, v7, :cond_26

    .line 461
    .line 462
    if-eqz v10, :cond_26

    .line 463
    .line 464
    iget v0, v1, Lu/d;->r:I

    .line 465
    .line 466
    if-nez v0, :cond_26

    .line 467
    .line 468
    if-eqz v4, :cond_26

    .line 469
    .line 470
    iget v0, v1, Lu/d;->s:I

    .line 471
    .line 472
    if-eqz v0, :cond_25

    .line 473
    .line 474
    goto :goto_11

    .line 475
    :cond_25
    const/4 v0, 0x0

    .line 476
    const/4 v3, 0x0

    .line 477
    const/4 v5, 0x0

    .line 478
    const/4 v13, -0x1

    .line 479
    const/4 v14, 0x0

    .line 480
    goto/16 :goto_1a

    .line 481
    .line 482
    :cond_26
    :goto_11
    instance-of v0, v12, Lx/t;

    .line 483
    .line 484
    if-eqz v0, :cond_27

    .line 485
    .line 486
    instance-of v0, v1, Lu/g;

    .line 487
    .line 488
    if-eqz v0, :cond_27

    .line 489
    .line 490
    move-object v0, v1

    .line 491
    check-cast v0, Lu/g;

    .line 492
    .line 493
    move-object v4, v12

    .line 494
    check-cast v4, Lx/t;

    .line 495
    .line 496
    invoke-virtual {v4, v0, v8, v3}, Lx/t;->j(Lu/g;II)V

    .line 497
    .line 498
    .line 499
    goto :goto_12

    .line 500
    :cond_27
    invoke-virtual {v12, v8, v3}, Landroid/view/View;->measure(II)V

    .line 501
    .line 502
    .line 503
    :goto_12
    iput v8, v1, Lu/d;->G:I

    .line 504
    .line 505
    iput v3, v1, Lu/d;->H:I

    .line 506
    .line 507
    const/4 v0, 0x0

    .line 508
    iput-boolean v0, v1, Lu/d;->g:Z

    .line 509
    .line 510
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    iget v10, v1, Lu/d;->u:I

    .line 523
    .line 524
    if-lez v10, :cond_28

    .line 525
    .line 526
    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    .line 527
    .line 528
    .line 529
    move-result v10

    .line 530
    goto :goto_13

    .line 531
    :cond_28
    move v10, v0

    .line 532
    :goto_13
    iget v14, v1, Lu/d;->v:I

    .line 533
    .line 534
    if-lez v14, :cond_29

    .line 535
    .line 536
    invoke-static {v14, v10}, Ljava/lang/Math;->min(II)I

    .line 537
    .line 538
    .line 539
    move-result v10

    .line 540
    :cond_29
    iget v14, v1, Lu/d;->x:I

    .line 541
    .line 542
    if-lez v14, :cond_2a

    .line 543
    .line 544
    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    .line 545
    .line 546
    .line 547
    move-result v14

    .line 548
    :goto_14
    move/from16 v16, v3

    .line 549
    .line 550
    goto :goto_15

    .line 551
    :cond_2a
    move v14, v4

    .line 552
    goto :goto_14

    .line 553
    :goto_15
    iget v3, v1, Lu/d;->y:I

    .line 554
    .line 555
    if-lez v3, :cond_2b

    .line 556
    .line 557
    invoke-static {v3, v14}, Ljava/lang/Math;->min(II)I

    .line 558
    .line 559
    .line 560
    move-result v14

    .line 561
    :cond_2b
    iget v3, v9, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 562
    .line 563
    const/4 v9, 0x1

    .line 564
    invoke-static {v3, v9}, Lu/j;->c(II)Z

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    if-nez v3, :cond_2d

    .line 569
    .line 570
    const/high16 v3, 0x3f000000    # 0.5f

    .line 571
    .line 572
    if-eqz v13, :cond_2c

    .line 573
    .line 574
    if-eqz v6, :cond_2c

    .line 575
    .line 576
    iget v5, v1, Lu/d;->W:F

    .line 577
    .line 578
    int-to-float v6, v14

    .line 579
    mul-float/2addr v6, v5

    .line 580
    add-float/2addr v6, v3

    .line 581
    float-to-int v3, v6

    .line 582
    move v10, v3

    .line 583
    goto :goto_16

    .line 584
    :cond_2c
    if-eqz v11, :cond_2d

    .line 585
    .line 586
    if-eqz v5, :cond_2d

    .line 587
    .line 588
    iget v5, v1, Lu/d;->W:F

    .line 589
    .line 590
    int-to-float v6, v10

    .line 591
    div-float/2addr v6, v5

    .line 592
    add-float/2addr v6, v3

    .line 593
    float-to-int v3, v6

    .line 594
    move v14, v3

    .line 595
    :cond_2d
    :goto_16
    if-ne v0, v10, :cond_2f

    .line 596
    .line 597
    if-eq v4, v14, :cond_2e

    .line 598
    .line 599
    goto :goto_18

    .line 600
    :cond_2e
    move v5, v7

    .line 601
    move v3, v10

    .line 602
    const/4 v0, 0x0

    .line 603
    :goto_17
    const/4 v13, -0x1

    .line 604
    goto :goto_1a

    .line 605
    :cond_2f
    :goto_18
    const/high16 v13, 0x40000000    # 2.0f

    .line 606
    .line 607
    if-eq v0, v10, :cond_30

    .line 608
    .line 609
    invoke-static {v10, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 610
    .line 611
    .line 612
    move-result v8

    .line 613
    :cond_30
    if-eq v4, v14, :cond_31

    .line 614
    .line 615
    invoke-static {v14, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    goto :goto_19

    .line 620
    :cond_31
    move/from16 v3, v16

    .line 621
    .line 622
    :goto_19
    invoke-virtual {v12, v8, v3}, Landroid/view/View;->measure(II)V

    .line 623
    .line 624
    .line 625
    iput v8, v1, Lu/d;->G:I

    .line 626
    .line 627
    iput v3, v1, Lu/d;->H:I

    .line 628
    .line 629
    const/4 v0, 0x0

    .line 630
    iput-boolean v0, v1, Lu/d;->g:Z

    .line 631
    .line 632
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 633
    .line 634
    .line 635
    move-result v3

    .line 636
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 637
    .line 638
    .line 639
    move-result v4

    .line 640
    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    .line 641
    .line 642
    .line 643
    move-result v5

    .line 644
    move v14, v4

    .line 645
    goto :goto_17

    .line 646
    :goto_1a
    if-eq v5, v13, :cond_32

    .line 647
    .line 648
    const/4 v4, 0x1

    .line 649
    goto :goto_1b

    .line 650
    :cond_32
    move v4, v0

    .line 651
    :goto_1b
    iget v6, v2, Lv/b;->c:I

    .line 652
    .line 653
    if-ne v3, v6, :cond_34

    .line 654
    .line 655
    iget v6, v2, Lv/b;->d:I

    .line 656
    .line 657
    if-eq v14, v6, :cond_33

    .line 658
    .line 659
    goto :goto_1c

    .line 660
    :cond_33
    move v7, v0

    .line 661
    goto :goto_1d

    .line 662
    :cond_34
    :goto_1c
    const/4 v7, 0x1

    .line 663
    :goto_1d
    iput-boolean v7, v2, Lv/b;->i:Z

    .line 664
    .line 665
    iget-boolean v0, v15, Lx/e;->c0:Z

    .line 666
    .line 667
    if-eqz v0, :cond_35

    .line 668
    .line 669
    const/4 v9, 0x1

    .line 670
    goto :goto_1e

    .line 671
    :cond_35
    move v9, v4

    .line 672
    :goto_1e
    if-eqz v9, :cond_36

    .line 673
    .line 674
    const/4 v13, -0x1

    .line 675
    if-eq v5, v13, :cond_36

    .line 676
    .line 677
    iget v0, v1, Lu/d;->a0:I

    .line 678
    .line 679
    if-eq v0, v5, :cond_36

    .line 680
    .line 681
    const/4 v0, 0x1

    .line 682
    iput-boolean v0, v2, Lv/b;->i:Z

    .line 683
    .line 684
    :cond_36
    iput v3, v2, Lv/b;->e:I

    .line 685
    .line 686
    iput v14, v2, Lv/b;->f:I

    .line 687
    .line 688
    iput-boolean v9, v2, Lv/b;->h:Z

    .line 689
    .line 690
    iput v5, v2, Lv/b;->g:I

    .line 691
    .line 692
    return-void
.end method
