.class public final synthetic Landroidx/activity/k;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/activity/k;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/activity/k;->f:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lz0/b;

    .line 13
    .line 14
    iget-object v0, v0, Lz0/b;->c:Lr0/b;

    .line 15
    .line 16
    iget-object v0, v0, Lr0/b;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lz0/b;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    iget-object v2, v0, Lz0/b;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v8

    .line 30
    move v10, v4

    .line 31
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    if-ge v10, v11, :cond_10

    .line 36
    .line 37
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    check-cast v11, Lz0/d;

    .line 42
    .line 43
    if-nez v11, :cond_1

    .line 44
    .line 45
    :cond_0
    :goto_1
    move-wide/from16 v26, v6

    .line 46
    .line 47
    move-wide/from16 v35, v8

    .line 48
    .line 49
    goto/16 :goto_c

    .line 50
    .line 51
    :cond_1
    iget-object v12, v0, Lz0/b;->a:Lp/k;

    .line 52
    .line 53
    invoke-virtual {v12, v11}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v13

    .line 57
    check-cast v13, Ljava/lang/Long;

    .line 58
    .line 59
    if-nez v13, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v13

    .line 66
    cmp-long v13, v13, v8

    .line 67
    .line 68
    if-gez v13, :cond_0

    .line 69
    .line 70
    invoke-virtual {v12, v11}, Lp/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :goto_2
    iget-wide v12, v11, Lz0/d;->g:J

    .line 74
    .line 75
    const-wide/16 v14, 0x0

    .line 76
    .line 77
    cmp-long v16, v12, v14

    .line 78
    .line 79
    if-nez v16, :cond_3

    .line 80
    .line 81
    iput-wide v6, v11, Lz0/d;->g:J

    .line 82
    .line 83
    iget v12, v11, Lz0/d;->b:F

    .line 84
    .line 85
    invoke-virtual {v11, v12}, Lz0/d;->c(F)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    sub-long v12, v6, v12

    .line 90
    .line 91
    iput-wide v6, v11, Lz0/d;->g:J

    .line 92
    .line 93
    invoke-static {}, Lz0/d;->b()Lz0/b;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    iget v14, v14, Lz0/b;->g:F

    .line 98
    .line 99
    const/4 v15, 0x0

    .line 100
    cmpl-float v18, v14, v15

    .line 101
    .line 102
    if-nez v18, :cond_4

    .line 103
    .line 104
    const-wide/32 v12, 0x7fffffff

    .line 105
    .line 106
    .line 107
    :goto_3
    move-wide/from16 v23, v12

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_4
    long-to-float v12, v12

    .line 111
    div-float/2addr v12, v14

    .line 112
    float-to-long v12, v12

    .line 113
    goto :goto_3

    .line 114
    :goto_4
    iget-boolean v12, v11, Lz0/d;->m:Z

    .line 115
    .line 116
    iget v13, v11, Lz0/d;->l:F

    .line 117
    .line 118
    const v14, 0x7f7fffff    # Float.MAX_VALUE

    .line 119
    .line 120
    .line 121
    if-eqz v12, :cond_6

    .line 122
    .line 123
    cmpl-float v12, v13, v14

    .line 124
    .line 125
    if-eqz v12, :cond_5

    .line 126
    .line 127
    iget-object v12, v11, Lz0/d;->k:Lz0/e;

    .line 128
    .line 129
    move-wide/from16 v26, v6

    .line 130
    .line 131
    float-to-double v5, v13

    .line 132
    iput-wide v5, v12, Lz0/e;->i:D

    .line 133
    .line 134
    iput v14, v11, Lz0/d;->l:F

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_5
    move-wide/from16 v26, v6

    .line 138
    .line 139
    :goto_5
    iget-object v5, v11, Lz0/d;->k:Lz0/e;

    .line 140
    .line 141
    iget-wide v5, v5, Lz0/e;->i:D

    .line 142
    .line 143
    double-to-float v5, v5

    .line 144
    iput v5, v11, Lz0/d;->b:F

    .line 145
    .line 146
    iput v15, v11, Lz0/d;->a:F

    .line 147
    .line 148
    iput-boolean v4, v11, Lz0/d;->m:Z

    .line 149
    .line 150
    move-wide/from16 v35, v8

    .line 151
    .line 152
    :goto_6
    const/4 v3, 0x1

    .line 153
    goto/16 :goto_8

    .line 154
    .line 155
    :cond_6
    move-wide/from16 v26, v6

    .line 156
    .line 157
    cmpl-float v5, v13, v14

    .line 158
    .line 159
    iget-object v6, v11, Lz0/d;->k:Lz0/e;

    .line 160
    .line 161
    iget v12, v11, Lz0/d;->b:F

    .line 162
    .line 163
    iget v13, v11, Lz0/d;->a:F

    .line 164
    .line 165
    if-eqz v5, :cond_7

    .line 166
    .line 167
    move-wide/from16 v35, v8

    .line 168
    .line 169
    float-to-double v7, v12

    .line 170
    float-to-double v12, v13

    .line 171
    const-wide/16 v18, 0x2

    .line 172
    .line 173
    div-long v33, v23, v18

    .line 174
    .line 175
    move-object/from16 v28, v6

    .line 176
    .line 177
    move-wide/from16 v29, v7

    .line 178
    .line 179
    move-wide/from16 v31, v12

    .line 180
    .line 181
    invoke-virtual/range {v28 .. v34}, Lz0/e;->c(DDJ)Lj2/e;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    iget-object v7, v11, Lz0/d;->k:Lz0/e;

    .line 186
    .line 187
    iget v8, v11, Lz0/d;->l:F

    .line 188
    .line 189
    float-to-double v8, v8

    .line 190
    iput-wide v8, v7, Lz0/e;->i:D

    .line 191
    .line 192
    iput v14, v11, Lz0/d;->l:F

    .line 193
    .line 194
    iget v8, v6, Lj2/e;->a:F

    .line 195
    .line 196
    float-to-double v8, v8

    .line 197
    iget v6, v6, Lj2/e;->b:F

    .line 198
    .line 199
    float-to-double v12, v6

    .line 200
    move-object/from16 v28, v7

    .line 201
    .line 202
    move-wide/from16 v29, v8

    .line 203
    .line 204
    move-wide/from16 v31, v12

    .line 205
    .line 206
    invoke-virtual/range {v28 .. v34}, Lz0/e;->c(DDJ)Lj2/e;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    iget v7, v6, Lj2/e;->a:F

    .line 211
    .line 212
    iput v7, v11, Lz0/d;->b:F

    .line 213
    .line 214
    iget v6, v6, Lj2/e;->b:F

    .line 215
    .line 216
    iput v6, v11, Lz0/d;->a:F

    .line 217
    .line 218
    goto :goto_7

    .line 219
    :cond_7
    move-object/from16 v18, v6

    .line 220
    .line 221
    move-wide/from16 v35, v8

    .line 222
    .line 223
    float-to-double v6, v12

    .line 224
    float-to-double v8, v13

    .line 225
    move-wide/from16 v19, v6

    .line 226
    .line 227
    move-wide/from16 v21, v8

    .line 228
    .line 229
    invoke-virtual/range {v18 .. v24}, Lz0/e;->c(DDJ)Lj2/e;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    iget v7, v6, Lj2/e;->a:F

    .line 234
    .line 235
    iput v7, v11, Lz0/d;->b:F

    .line 236
    .line 237
    iget v6, v6, Lj2/e;->b:F

    .line 238
    .line 239
    iput v6, v11, Lz0/d;->a:F

    .line 240
    .line 241
    :goto_7
    iget v6, v11, Lz0/d;->b:F

    .line 242
    .line 243
    const v7, -0x800001

    .line 244
    .line 245
    .line 246
    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    iput v5, v11, Lz0/d;->b:F

    .line 251
    .line 252
    invoke-static {v5, v14}, Ljava/lang/Math;->min(FF)F

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    iput v5, v11, Lz0/d;->b:F

    .line 257
    .line 258
    iget v6, v11, Lz0/d;->a:F

    .line 259
    .line 260
    iget-object v8, v11, Lz0/d;->k:Lz0/e;

    .line 261
    .line 262
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    float-to-double v12, v6

    .line 270
    iget-wide v3, v8, Lz0/e;->e:D

    .line 271
    .line 272
    cmpg-double v3, v12, v3

    .line 273
    .line 274
    if-gez v3, :cond_8

    .line 275
    .line 276
    iget-wide v3, v8, Lz0/e;->i:D

    .line 277
    .line 278
    double-to-float v3, v3

    .line 279
    sub-float/2addr v5, v3

    .line 280
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    float-to-double v3, v3

    .line 285
    iget-wide v12, v8, Lz0/e;->d:D

    .line 286
    .line 287
    cmpg-double v3, v3, v12

    .line 288
    .line 289
    if-gez v3, :cond_8

    .line 290
    .line 291
    iget-object v3, v11, Lz0/d;->k:Lz0/e;

    .line 292
    .line 293
    iget-wide v3, v3, Lz0/e;->i:D

    .line 294
    .line 295
    double-to-float v3, v3

    .line 296
    iput v3, v11, Lz0/d;->b:F

    .line 297
    .line 298
    iput v15, v11, Lz0/d;->a:F

    .line 299
    .line 300
    goto/16 :goto_6

    .line 301
    .line 302
    :cond_8
    const/4 v3, 0x0

    .line 303
    :goto_8
    iget v4, v11, Lz0/d;->b:F

    .line 304
    .line 305
    invoke-static {v4, v14}, Ljava/lang/Math;->min(FF)F

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    iput v4, v11, Lz0/d;->b:F

    .line 310
    .line 311
    const v7, -0x800001

    .line 312
    .line 313
    .line 314
    invoke-static {v4, v7}, Ljava/lang/Math;->max(FF)F

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    iput v4, v11, Lz0/d;->b:F

    .line 319
    .line 320
    invoke-virtual {v11, v4}, Lz0/d;->c(F)V

    .line 321
    .line 322
    .line 323
    if-eqz v3, :cond_f

    .line 324
    .line 325
    iget-object v3, v11, Lz0/d;->i:Ljava/util/ArrayList;

    .line 326
    .line 327
    const/4 v9, 0x0

    .line 328
    iput-boolean v9, v11, Lz0/d;->f:Z

    .line 329
    .line 330
    invoke-static {}, Lz0/d;->b()Lz0/b;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    iget-object v5, v4, Lz0/b;->a:Lp/k;

    .line 335
    .line 336
    invoke-virtual {v5, v11}, Lp/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    iget-object v5, v4, Lz0/b;->b:Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    if-ltz v7, :cond_9

    .line 346
    .line 347
    const/4 v6, 0x0

    .line 348
    invoke-virtual {v5, v7, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    const/4 v5, 0x1

    .line 352
    iput-boolean v5, v4, Lz0/b;->f:Z

    .line 353
    .line 354
    :cond_9
    const-wide/16 v4, 0x0

    .line 355
    .line 356
    iput-wide v4, v11, Lz0/d;->g:J

    .line 357
    .line 358
    const/4 v9, 0x0

    .line 359
    iput-boolean v9, v11, Lz0/d;->c:Z

    .line 360
    .line 361
    const/4 v4, 0x0

    .line 362
    :goto_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    if-ge v4, v5, :cond_d

    .line 367
    .line 368
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    if-eqz v5, :cond_c

    .line 373
    .line 374
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    check-cast v5, Lv2/b;

    .line 379
    .line 380
    iget-object v5, v5, Lv2/b;->a:Lv2/e;

    .line 381
    .line 382
    invoke-virtual {v5}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    if-eqz v7, :cond_c

    .line 387
    .line 388
    invoke-virtual {v5}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 389
    .line 390
    .line 391
    move-result-object v7

    .line 392
    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    const/16 v8, 0x2710

    .line 397
    .line 398
    if-ne v7, v8, :cond_c

    .line 399
    .line 400
    iget-object v7, v5, Lv2/e;->q:Lv2/c;

    .line 401
    .line 402
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    if-eqz v8, :cond_a

    .line 407
    .line 408
    iget-object v7, v5, Lv2/e;->p:Lv2/c;

    .line 409
    .line 410
    invoke-virtual {v5, v7}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 411
    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_a
    invoke-virtual {v5, v7}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 415
    .line 416
    .line 417
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 418
    .line 419
    .line 420
    move-result-wide v11

    .line 421
    iget-wide v13, v5, Lv2/e;->j:J

    .line 422
    .line 423
    sub-long/2addr v11, v13

    .line 424
    iget v8, v5, Lv2/e;->i:I

    .line 425
    .line 426
    int-to-long v13, v8

    .line 427
    cmp-long v8, v11, v13

    .line 428
    .line 429
    if-ltz v8, :cond_b

    .line 430
    .line 431
    invoke-virtual {v7}, Lv2/c;->run()V

    .line 432
    .line 433
    .line 434
    goto :goto_a

    .line 435
    :cond_b
    sub-long/2addr v13, v11

    .line 436
    invoke-virtual {v5, v7, v13, v14}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 437
    .line 438
    .line 439
    :cond_c
    :goto_a
    add-int/lit8 v4, v4, 0x1

    .line 440
    .line 441
    goto :goto_9

    .line 442
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    const/16 v25, 0x1

    .line 447
    .line 448
    add-int/lit8 v4, v4, -0x1

    .line 449
    .line 450
    :goto_b
    if-ltz v4, :cond_f

    .line 451
    .line 452
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    if-nez v5, :cond_e

    .line 457
    .line 458
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    :cond_e
    add-int/lit8 v4, v4, -0x1

    .line 462
    .line 463
    goto :goto_b

    .line 464
    :cond_f
    :goto_c
    add-int/lit8 v10, v10, 0x1

    .line 465
    .line 466
    move-wide/from16 v6, v26

    .line 467
    .line 468
    move-wide/from16 v8, v35

    .line 469
    .line 470
    const/4 v4, 0x0

    .line 471
    goto/16 :goto_0

    .line 472
    .line 473
    :cond_10
    iget-boolean v3, v0, Lz0/b;->f:Z

    .line 474
    .line 475
    if-eqz v3, :cond_14

    .line 476
    .line 477
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    const/16 v25, 0x1

    .line 482
    .line 483
    add-int/lit8 v3, v3, -0x1

    .line 484
    .line 485
    :goto_d
    if-ltz v3, :cond_12

    .line 486
    .line 487
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    if-nez v4, :cond_11

    .line 492
    .line 493
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    :cond_11
    add-int/lit8 v3, v3, -0x1

    .line 497
    .line 498
    goto :goto_d

    .line 499
    :cond_12
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 500
    .line 501
    .line 502
    move-result v3

    .line 503
    if-nez v3, :cond_13

    .line 504
    .line 505
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 506
    .line 507
    const/16 v4, 0x21

    .line 508
    .line 509
    if-lt v3, v4, :cond_13

    .line 510
    .line 511
    iget-object v3, v0, Lz0/b;->h:Landroidx/emoji2/text/p;

    .line 512
    .line 513
    iget-object v4, v3, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v4, Lz0/a;

    .line 516
    .line 517
    invoke-static {v4}, Landroidx/activity/r;->n(Lz0/a;)Z

    .line 518
    .line 519
    .line 520
    const/4 v6, 0x0

    .line 521
    iput-object v6, v3, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 522
    .line 523
    :cond_13
    const/4 v9, 0x0

    .line 524
    iput-boolean v9, v0, Lz0/b;->f:Z

    .line 525
    .line 526
    :cond_14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    if-lez v2, :cond_15

    .line 531
    .line 532
    iget-object v2, v0, Lz0/b;->e:Landroidx/emoji2/text/p;

    .line 533
    .line 534
    iget-object v0, v0, Lz0/b;->d:Landroidx/activity/k;

    .line 535
    .line 536
    iget-object v2, v2, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v2, Landroid/view/Choreographer;

    .line 539
    .line 540
    new-instance v3, Li1/f;

    .line 541
    .line 542
    invoke-direct {v3, v0}, Li1/f;-><init>(Ljava/lang/Runnable;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 546
    .line 547
    .line 548
    :cond_15
    return-void

    .line 549
    :pswitch_0
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Ly0/e;

    .line 552
    .line 553
    iget-object v2, v0, Ly0/e;->d:Ly0/f;

    .line 554
    .line 555
    iget-object v3, v0, Ly0/e;->b:Lw0/e;

    .line 556
    .line 557
    iget v3, v3, Lw0/e;->o:I

    .line 558
    .line 559
    iget v4, v0, Ly0/e;->a:I

    .line 560
    .line 561
    const/4 v5, 0x3

    .line 562
    if-ne v4, v5, :cond_16

    .line 563
    .line 564
    const/4 v6, 0x1

    .line 565
    goto :goto_e

    .line 566
    :cond_16
    const/4 v6, 0x0

    .line 567
    :goto_e
    const/4 v7, 0x5

    .line 568
    if-eqz v6, :cond_18

    .line 569
    .line 570
    invoke-virtual {v2, v5}, Ly0/f;->e(I)Landroid/view/View;

    .line 571
    .line 572
    .line 573
    move-result-object v8

    .line 574
    if-eqz v8, :cond_17

    .line 575
    .line 576
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 577
    .line 578
    .line 579
    move-result v10

    .line 580
    neg-int v10, v10

    .line 581
    goto :goto_f

    .line 582
    :cond_17
    const/4 v10, 0x0

    .line 583
    :goto_f
    add-int/2addr v10, v3

    .line 584
    goto :goto_10

    .line 585
    :cond_18
    invoke-virtual {v2, v7}, Ly0/f;->e(I)Landroid/view/View;

    .line 586
    .line 587
    .line 588
    move-result-object v8

    .line 589
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 590
    .line 591
    .line 592
    move-result v10

    .line 593
    sub-int/2addr v10, v3

    .line 594
    :goto_10
    if-eqz v8, :cond_1e

    .line 595
    .line 596
    if-eqz v6, :cond_19

    .line 597
    .line 598
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    if-lt v3, v10, :cond_1a

    .line 603
    .line 604
    :cond_19
    if-nez v6, :cond_1e

    .line 605
    .line 606
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 607
    .line 608
    .line 609
    move-result v3

    .line 610
    if-le v3, v10, :cond_1e

    .line 611
    .line 612
    :cond_1a
    invoke-virtual {v2, v8}, Ly0/f;->h(Landroid/view/View;)I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    if-nez v3, :cond_1e

    .line 617
    .line 618
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 619
    .line 620
    .line 621
    move-result-object v3

    .line 622
    check-cast v3, Ly0/c;

    .line 623
    .line 624
    iget-object v0, v0, Ly0/e;->b:Lw0/e;

    .line 625
    .line 626
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    .line 627
    .line 628
    .line 629
    move-result v6

    .line 630
    invoke-virtual {v0, v8, v10, v6}, Lw0/e;->r(Landroid/view/View;II)Z

    .line 631
    .line 632
    .line 633
    const/4 v6, 0x1

    .line 634
    iput-boolean v6, v3, Ly0/c;->c:Z

    .line 635
    .line 636
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 637
    .line 638
    .line 639
    if-ne v4, v5, :cond_1b

    .line 640
    .line 641
    move v5, v7

    .line 642
    :cond_1b
    invoke-virtual {v2, v5}, Ly0/f;->e(I)Landroid/view/View;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    if-eqz v0, :cond_1c

    .line 647
    .line 648
    invoke-virtual {v2, v0, v6}, Ly0/f;->c(Landroid/view/View;Z)V

    .line 649
    .line 650
    .line 651
    :cond_1c
    iget-boolean v0, v2, Ly0/f;->x:Z

    .line 652
    .line 653
    if-nez v0, :cond_1e

    .line 654
    .line 655
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 656
    .line 657
    .line 658
    move-result-wide v10

    .line 659
    const/16 v16, 0x0

    .line 660
    .line 661
    const/16 v17, 0x0

    .line 662
    .line 663
    const/4 v14, 0x3

    .line 664
    const/4 v15, 0x0

    .line 665
    move-wide v12, v10

    .line 666
    invoke-static/range {v10 .. v17}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    const/4 v4, 0x0

    .line 675
    :goto_11
    if-ge v4, v3, :cond_1d

    .line 676
    .line 677
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 678
    .line 679
    .line 680
    move-result-object v5

    .line 681
    invoke-virtual {v5, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 682
    .line 683
    .line 684
    add-int/lit8 v4, v4, 0x1

    .line 685
    .line 686
    goto :goto_11

    .line 687
    :cond_1d
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 688
    .line 689
    .line 690
    const/4 v5, 0x1

    .line 691
    iput-boolean v5, v2, Ly0/f;->x:Z

    .line 692
    .line 693
    :cond_1e
    return-void

    .line 694
    :pswitch_1
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v0, Ly0/f;

    .line 697
    .line 698
    const/4 v9, 0x0

    .line 699
    invoke-virtual {v0, v9}, Ly0/f;->d(Z)V

    .line 700
    .line 701
    .line 702
    return-void

    .line 703
    :pswitch_2
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v0, Landroid/widget/PopupWindow;

    .line 706
    .line 707
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 708
    .line 709
    .line 710
    return-void

    .line 711
    :pswitch_3
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v0, Lco/median/android/widget/MedianProgressView;

    .line 714
    .line 715
    sget v2, Lco/median/android/widget/MedianProgressView;->g:I

    .line 716
    .line 717
    const/4 v2, 0x4

    .line 718
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 719
    .line 720
    .line 721
    return-void

    .line 722
    :pswitch_4
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast v0, Landroidx/emoji2/text/t;

    .line 725
    .line 726
    iget-object v2, v0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v2, Lt2/c;

    .line 729
    .line 730
    if-eqz v2, :cond_1f

    .line 731
    .line 732
    iget-object v3, v0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 733
    .line 734
    check-cast v3, Lcom/google/android/material/navigation/NavigationView;

    .line 735
    .line 736
    iget-object v0, v0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    .line 739
    .line 740
    const/4 v5, 0x1

    .line 741
    invoke-virtual {v2, v3, v0, v5}, Lt2/c;->b(Lt2/b;Landroid/view/View;Z)V

    .line 742
    .line 743
    .line 744
    :cond_1f
    return-void

    .line 745
    :pswitch_5
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v0, Lx1/i;

    .line 748
    .line 749
    invoke-interface {v0}, Lx1/i;->stopLoading()V

    .line 750
    .line 751
    .line 752
    const-string v2, "file:///android_asset/offline.html"

    .line 753
    .line 754
    check-cast v0, Lu1/o0;

    .line 755
    .line 756
    invoke-virtual {v0, v2}, Lu1/o0;->a(Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    return-void

    .line 760
    :pswitch_6
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast v0, Lu1/x;

    .line 763
    .line 764
    const-string v2, "x"

    .line 765
    .line 766
    iget-object v3, v0, Lu1/x;->b:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v3, Lco/median/android/MainActivity;

    .line 769
    .line 770
    iget-object v4, v3, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 771
    .line 772
    instance-of v5, v4, Landroid/webkit/WebView;

    .line 773
    .line 774
    if-eqz v5, :cond_20

    .line 775
    .line 776
    check-cast v4, Landroid/webkit/WebView;

    .line 777
    .line 778
    goto :goto_12

    .line 779
    :cond_20
    const/4 v4, 0x0

    .line 780
    :goto_12
    if-nez v4, :cond_21

    .line 781
    .line 782
    const-string v0, "printCurrentPage: current webview does not support printing"

    .line 783
    .line 784
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 785
    .line 786
    .line 787
    goto :goto_14

    .line 788
    :cond_21
    iget-boolean v5, v0, Lu1/x;->a:Z

    .line 789
    .line 790
    if-eqz v5, :cond_22

    .line 791
    .line 792
    const-string v0, "printCurrentPage: a print job is already pending"

    .line 793
    .line 794
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 795
    .line 796
    .line 797
    goto :goto_14

    .line 798
    :cond_22
    invoke-virtual {v4}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    if-eqz v5, :cond_23

    .line 803
    .line 804
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 805
    .line 806
    .line 807
    move-result v7

    .line 808
    if-nez v7, :cond_24

    .line 809
    .line 810
    :cond_23
    const/4 v5, 0x0

    .line 811
    :cond_24
    if-nez v5, :cond_25

    .line 812
    .line 813
    const-string v5, "Document"

    .line 814
    .line 815
    :cond_25
    const-string v7, "print"

    .line 816
    .line 817
    invoke-virtual {v3, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    instance-of v7, v3, Landroid/print/PrintManager;

    .line 822
    .line 823
    if-eqz v7, :cond_26

    .line 824
    .line 825
    check-cast v3, Landroid/print/PrintManager;

    .line 826
    .line 827
    goto :goto_13

    .line 828
    :cond_26
    const/4 v3, 0x0

    .line 829
    :goto_13
    if-nez v3, :cond_27

    .line 830
    .line 831
    const-string v0, "printCurrentPage: print service unavailable"

    .line 832
    .line 833
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 834
    .line 835
    .line 836
    goto :goto_14

    .line 837
    :cond_27
    const/4 v2, 0x1

    .line 838
    iput-boolean v2, v0, Lu1/x;->a:Z

    .line 839
    .line 840
    new-instance v2, Lu1/h1;

    .line 841
    .line 842
    invoke-virtual {v4, v5}, Landroid/webkit/WebView;->createPrintDocumentAdapter(Ljava/lang/String;)Landroid/print/PrintDocumentAdapter;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    invoke-direct {v2, v0, v4}, Lu1/h1;-><init>(Lu1/x;Landroid/print/PrintDocumentAdapter;)V

    .line 850
    .line 851
    .line 852
    const/4 v6, 0x0

    .line 853
    invoke-virtual {v3, v5, v2, v6}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;

    .line 854
    .line 855
    .line 856
    :goto_14
    return-void

    .line 857
    :pswitch_7
    const/4 v6, 0x0

    .line 858
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v0, Lu1/x0;

    .line 861
    .line 862
    iget-object v0, v0, Lu1/x0;->g:Lco/median/android/MainActivity;

    .line 863
    .line 864
    iget-object v0, v0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 865
    .line 866
    if-eqz v0, :cond_28

    .line 867
    .line 868
    const-string v2, "if (median_status_checker && typeof median_status_checker.onReadyState === \'function\') median_status_checker.onReadyState(document.readyState);"

    .line 869
    .line 870
    check-cast v0, Lu1/o0;

    .line 871
    .line 872
    invoke-virtual {v0, v2, v6}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 873
    .line 874
    .line 875
    :cond_28
    return-void

    .line 876
    :pswitch_8
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 877
    .line 878
    check-cast v0, Landroid/webkit/CookieManager;

    .line 879
    .line 880
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V

    .line 881
    .line 882
    .line 883
    return-void

    .line 884
    :pswitch_9
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v0, Ls0/e;

    .line 887
    .line 888
    iget-object v0, v0, Ls0/e;->a:Ls0/b;

    .line 889
    .line 890
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 895
    .line 896
    if-eqz v3, :cond_29

    .line 897
    .line 898
    check-cast v2, Landroid/view/ViewGroup;

    .line 899
    .line 900
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 901
    .line 902
    .line 903
    :cond_29
    return-void

    .line 904
    :pswitch_a
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 905
    .line 906
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 907
    .line 908
    invoke-virtual {v0}, Lk1/l0;->m0()V

    .line 909
    .line 910
    .line 911
    return-void

    .line 912
    :pswitch_b
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 913
    .line 914
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 915
    .line 916
    invoke-static {v0}, Lcom/google/android/material/button/MaterialButton;->a(Lcom/google/android/material/button/MaterialButton;)V

    .line 917
    .line 918
    .line 919
    return-void

    .line 920
    :pswitch_c
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 921
    .line 922
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 923
    .line 924
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->j:Landroid/widget/EditText;

    .line 925
    .line 926
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 927
    .line 928
    .line 929
    return-void

    .line 930
    :pswitch_d
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 931
    .line 932
    check-cast v0, Ld3/m;

    .line 933
    .line 934
    iget-object v2, v0, Ld3/m;->h:Landroid/widget/AutoCompleteTextView;

    .line 935
    .line 936
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 937
    .line 938
    .line 939
    move-result v2

    .line 940
    invoke-virtual {v0, v2}, Ld3/m;->s(Z)V

    .line 941
    .line 942
    .line 943
    iput-boolean v2, v0, Ld3/m;->m:Z

    .line 944
    .line 945
    return-void

    .line 946
    :pswitch_e
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v0, Ld3/e;

    .line 949
    .line 950
    const/4 v5, 0x1

    .line 951
    invoke-virtual {v0, v5}, Ld3/e;->s(Z)V

    .line 952
    .line 953
    .line 954
    return-void

    .line 955
    :pswitch_f
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 956
    .line 957
    check-cast v0, Lb3/g;

    .line 958
    .line 959
    const/4 v9, 0x0

    .line 960
    iput-boolean v9, v0, Lb3/g;->c:Z

    .line 961
    .line 962
    iget-object v3, v0, Lb3/g;->e:Lz/b;

    .line 963
    .line 964
    check-cast v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 965
    .line 966
    iget-object v4, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:Lw0/e;

    .line 967
    .line 968
    if-eqz v4, :cond_2a

    .line 969
    .line 970
    invoke-virtual {v4}, Lw0/e;->g()Z

    .line 971
    .line 972
    .line 973
    move-result v4

    .line 974
    if-eqz v4, :cond_2a

    .line 975
    .line 976
    iget v2, v0, Lb3/g;->b:I

    .line 977
    .line 978
    invoke-virtual {v0, v2}, Lb3/g;->a(I)V

    .line 979
    .line 980
    .line 981
    goto :goto_15

    .line 982
    :cond_2a
    iget v4, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 983
    .line 984
    if-ne v4, v2, :cond_2b

    .line 985
    .line 986
    iget v0, v0, Lb3/g;->b:I

    .line 987
    .line 988
    invoke-virtual {v3, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->x(I)V

    .line 989
    .line 990
    .line 991
    :cond_2b
    :goto_15
    return-void

    .line 992
    :pswitch_10
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 993
    .line 994
    move-object v2, v0

    .line 995
    check-cast v2, Landroid/app/Activity;

    .line 996
    .line 997
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 998
    .line 999
    .line 1000
    move-result v0

    .line 1001
    if-nez v0, :cond_35

    .line 1002
    .line 1003
    sget-object v3, Lb0/d;->g:Landroid/os/Handler;

    .line 1004
    .line 1005
    sget-object v0, Lb0/d;->f:Ljava/lang/reflect/Method;

    .line 1006
    .line 1007
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1008
    .line 1009
    const/16 v5, 0x1c

    .line 1010
    .line 1011
    if-lt v4, v5, :cond_2c

    .line 1012
    .line 1013
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 1014
    .line 1015
    .line 1016
    goto/16 :goto_1b

    .line 1017
    .line 1018
    :cond_2c
    const/16 v5, 0x1b

    .line 1019
    .line 1020
    const/16 v6, 0x1a

    .line 1021
    .line 1022
    if-eq v4, v6, :cond_2d

    .line 1023
    .line 1024
    if-ne v4, v5, :cond_2e

    .line 1025
    .line 1026
    :cond_2d
    if-nez v0, :cond_2e

    .line 1027
    .line 1028
    goto/16 :goto_1a

    .line 1029
    .line 1030
    :cond_2e
    sget-object v7, Lb0/d;->e:Ljava/lang/reflect/Method;

    .line 1031
    .line 1032
    if-nez v7, :cond_2f

    .line 1033
    .line 1034
    sget-object v7, Lb0/d;->d:Ljava/lang/reflect/Method;

    .line 1035
    .line 1036
    if-nez v7, :cond_2f

    .line 1037
    .line 1038
    goto/16 :goto_1a

    .line 1039
    .line 1040
    :cond_2f
    :try_start_0
    sget-object v7, Lb0/d;->c:Ljava/lang/reflect/Field;

    .line 1041
    .line 1042
    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v10

    .line 1046
    if-nez v10, :cond_30

    .line 1047
    .line 1048
    goto :goto_1a

    .line 1049
    :cond_30
    sget-object v7, Lb0/d;->b:Ljava/lang/reflect/Field;

    .line 1050
    .line 1051
    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v7

    .line 1055
    if-nez v7, :cond_31

    .line 1056
    .line 1057
    goto :goto_1a

    .line 1058
    :cond_31
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v8

    .line 1062
    new-instance v11, Lb0/c;

    .line 1063
    .line 1064
    invoke-direct {v11, v2}, Lb0/c;-><init>(Landroid/app/Activity;)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v8, v11}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1068
    .line 1069
    .line 1070
    new-instance v12, Lb0/b;

    .line 1071
    .line 1072
    const/4 v9, 0x0

    .line 1073
    invoke-direct {v12, v11, v9, v10}, Lb0/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v3, v12}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1077
    .line 1078
    .line 1079
    if-eq v4, v6, :cond_33

    .line 1080
    .line 1081
    if-ne v4, v5, :cond_32

    .line 1082
    .line 1083
    goto :goto_16

    .line 1084
    :cond_32
    move v4, v9

    .line 1085
    goto :goto_17

    .line 1086
    :cond_33
    :goto_16
    const/4 v4, 0x1

    .line 1087
    :goto_17
    if-eqz v4, :cond_34

    .line 1088
    .line 1089
    :try_start_1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v13

    .line 1093
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1094
    .line 1095
    const/4 v15, 0x0

    .line 1096
    const/16 v16, 0x0

    .line 1097
    .line 1098
    move-object v4, v11

    .line 1099
    const/4 v11, 0x0

    .line 1100
    const/4 v12, 0x0

    .line 1101
    move-object/from16 v17, v14

    .line 1102
    .line 1103
    move-object/from16 v18, v14

    .line 1104
    .line 1105
    :try_start_2
    filled-new-array/range {v10 .. v18}, [Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v5

    .line 1109
    invoke-virtual {v0, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    goto :goto_18

    .line 1113
    :catchall_0
    move-exception v0

    .line 1114
    goto :goto_19

    .line 1115
    :catchall_1
    move-exception v0

    .line 1116
    move-object v4, v11

    .line 1117
    goto :goto_19

    .line 1118
    :cond_34
    move-object v4, v11

    .line 1119
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1120
    .line 1121
    .line 1122
    :goto_18
    :try_start_3
    new-instance v0, Lb0/b;

    .line 1123
    .line 1124
    const/4 v5, 0x1

    .line 1125
    const/4 v9, 0x0

    .line 1126
    invoke-direct {v0, v8, v4, v5, v9}, Lb0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1130
    .line 1131
    .line 1132
    goto :goto_1b

    .line 1133
    :goto_19
    new-instance v5, Lb0/b;

    .line 1134
    .line 1135
    const/4 v6, 0x1

    .line 1136
    const/4 v9, 0x0

    .line 1137
    invoke-direct {v5, v8, v4, v6, v9}, Lb0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v3, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1141
    .line 1142
    .line 1143
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1144
    :catchall_2
    :goto_1a
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 1145
    .line 1146
    .line 1147
    :cond_35
    :goto_1b
    return-void

    .line 1148
    :pswitch_11
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 1149
    .line 1150
    check-cast v0, Landroidx/lifecycle/f0;

    .line 1151
    .line 1152
    iget-object v2, v0, Landroidx/lifecycle/f0;->k:Landroidx/lifecycle/v;

    .line 1153
    .line 1154
    iget v3, v0, Landroidx/lifecycle/f0;->g:I

    .line 1155
    .line 1156
    if-nez v3, :cond_36

    .line 1157
    .line 1158
    const/4 v5, 0x1

    .line 1159
    iput-boolean v5, v0, Landroidx/lifecycle/f0;->h:Z

    .line 1160
    .line 1161
    sget-object v3, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 1162
    .line 1163
    invoke-virtual {v2, v3}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 1164
    .line 1165
    .line 1166
    goto :goto_1c

    .line 1167
    :cond_36
    const/4 v5, 0x1

    .line 1168
    :goto_1c
    iget v3, v0, Landroidx/lifecycle/f0;->f:I

    .line 1169
    .line 1170
    if-nez v3, :cond_37

    .line 1171
    .line 1172
    iget-boolean v3, v0, Landroidx/lifecycle/f0;->h:Z

    .line 1173
    .line 1174
    if-eqz v3, :cond_37

    .line 1175
    .line 1176
    sget-object v3, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 1177
    .line 1178
    invoke-virtual {v2, v3}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 1179
    .line 1180
    .line 1181
    iput-boolean v5, v0, Landroidx/lifecycle/f0;->i:Z

    .line 1182
    .line 1183
    :cond_37
    return-void

    .line 1184
    :pswitch_12
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 1185
    .line 1186
    move-object v3, v0

    .line 1187
    check-cast v3, Landroidx/emoji2/text/u;

    .line 1188
    .line 1189
    const-string v0, "fetchFonts result is not OK. ("

    .line 1190
    .line 1191
    iget-object v4, v3, Landroidx/emoji2/text/u;->i:Ljava/lang/Object;

    .line 1192
    .line 1193
    monitor-enter v4

    .line 1194
    :try_start_4
    iget-object v5, v3, Landroidx/emoji2/text/u;->m:Lu1/h0;

    .line 1195
    .line 1196
    if-nez v5, :cond_38

    .line 1197
    .line 1198
    monitor-exit v4

    .line 1199
    goto/16 :goto_23

    .line 1200
    .line 1201
    :catchall_3
    move-exception v0

    .line 1202
    goto/16 :goto_25

    .line 1203
    .line 1204
    :cond_38
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 1205
    :try_start_5
    invoke-virtual {v3}, Landroidx/emoji2/text/u;->b()Ll0/i;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v4

    .line 1209
    iget v5, v4, Ll0/i;->f:I

    .line 1210
    .line 1211
    if-ne v5, v2, :cond_39

    .line 1212
    .line 1213
    iget-object v2, v3, Landroidx/emoji2/text/u;->i:Ljava/lang/Object;

    .line 1214
    .line 1215
    monitor-enter v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1216
    :try_start_6
    monitor-exit v2

    .line 1217
    goto :goto_1d

    .line 1218
    :catchall_4
    move-exception v0

    .line 1219
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1220
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 1221
    :catchall_5
    move-exception v0

    .line 1222
    goto/16 :goto_21

    .line 1223
    .line 1224
    :cond_39
    :goto_1d
    if-nez v5, :cond_3c

    .line 1225
    .line 1226
    :try_start_8
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 1227
    .line 1228
    sget v2, Lk0/i;->a:I

    .line 1229
    .line 1230
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    iget-object v0, v3, Landroidx/emoji2/text/u;->h:La3/f;

    .line 1234
    .line 1235
    iget-object v2, v3, Landroidx/emoji2/text/u;->f:Landroid/content/Context;

    .line 1236
    .line 1237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1238
    .line 1239
    .line 1240
    filled-new-array {v4}, [Ll0/i;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v0

    .line 1244
    sget-object v5, Lf0/e;->a:Le4/a;

    .line 1245
    .line 1246
    const-string v5, "TypefaceCompat.createFromFontInfo"

    .line 1247
    .line 1248
    invoke-static {v5}, Le4/a;->c(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 1249
    .line 1250
    .line 1251
    :try_start_9
    sget-object v5, Lf0/e;->a:Le4/a;

    .line 1252
    .line 1253
    const/4 v9, 0x0

    .line 1254
    invoke-virtual {v5, v2, v0, v9}, Le4/a;->p(Landroid/content/Context;[Ll0/i;I)Landroid/graphics/Typeface;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1258
    :try_start_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1259
    .line 1260
    .line 1261
    iget-object v2, v3, Landroidx/emoji2/text/u;->f:Landroid/content/Context;

    .line 1262
    .line 1263
    iget-object v4, v4, Ll0/i;->a:Landroid/net/Uri;

    .line 1264
    .line 1265
    invoke-static {v2, v4}, Lu1/h0;->L(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1269
    if-eqz v2, :cond_3b

    .line 1270
    .line 1271
    if-eqz v0, :cond_3b

    .line 1272
    .line 1273
    :try_start_b
    const-string v4, "EmojiCompat.MetadataRepo.create"

    .line 1274
    .line 1275
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    new-instance v4, Landroidx/emoji2/text/x;

    .line 1279
    .line 1280
    invoke-static {v2}, Lu1/h0;->V(Ljava/nio/MappedByteBuffer;)La1/b;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v2

    .line 1284
    invoke-direct {v4, v0, v2}, Landroidx/emoji2/text/x;-><init>(Landroid/graphics/Typeface;La1/b;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 1285
    .line 1286
    .line 1287
    :try_start_c
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 1288
    .line 1289
    .line 1290
    :try_start_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1291
    .line 1292
    .line 1293
    iget-object v2, v3, Landroidx/emoji2/text/u;->i:Ljava/lang/Object;

    .line 1294
    .line 1295
    monitor-enter v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 1296
    :try_start_e
    iget-object v0, v3, Landroidx/emoji2/text/u;->m:Lu1/h0;

    .line 1297
    .line 1298
    if-eqz v0, :cond_3a

    .line 1299
    .line 1300
    invoke-virtual {v0, v4}, Lu1/h0;->R(Landroidx/emoji2/text/x;)V

    .line 1301
    .line 1302
    .line 1303
    goto :goto_1e

    .line 1304
    :catchall_6
    move-exception v0

    .line 1305
    goto :goto_1f

    .line 1306
    :cond_3a
    :goto_1e
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 1307
    :try_start_f
    invoke-virtual {v3}, Landroidx/emoji2/text/u;->a()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 1308
    .line 1309
    .line 1310
    goto :goto_23

    .line 1311
    :goto_1f
    :try_start_10
    monitor-exit v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 1312
    :try_start_11
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 1313
    :catchall_7
    move-exception v0

    .line 1314
    :try_start_12
    sget v2, Lk0/i;->a:I

    .line 1315
    .line 1316
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1317
    .line 1318
    .line 1319
    throw v0

    .line 1320
    :cond_3b
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1321
    .line 1322
    const-string v2, "Unable to open file."

    .line 1323
    .line 1324
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    throw v0

    .line 1328
    :catchall_8
    move-exception v0

    .line 1329
    goto :goto_20

    .line 1330
    :catchall_9
    move-exception v0

    .line 1331
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1332
    .line 1333
    .line 1334
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 1335
    :goto_20
    :try_start_13
    sget v2, Lk0/i;->a:I

    .line 1336
    .line 1337
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1338
    .line 1339
    .line 1340
    throw v0

    .line 1341
    :cond_3c
    new-instance v2, Ljava/lang/RuntimeException;

    .line 1342
    .line 1343
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1344
    .line 1345
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1349
    .line 1350
    .line 1351
    const-string v0, ")"

    .line 1352
    .line 1353
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1361
    .line 1362
    .line 1363
    throw v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    .line 1364
    :goto_21
    iget-object v2, v3, Landroidx/emoji2/text/u;->i:Ljava/lang/Object;

    .line 1365
    .line 1366
    monitor-enter v2

    .line 1367
    :try_start_14
    iget-object v4, v3, Landroidx/emoji2/text/u;->m:Lu1/h0;

    .line 1368
    .line 1369
    if-eqz v4, :cond_3d

    .line 1370
    .line 1371
    invoke-virtual {v4, v0}, Lu1/h0;->P(Ljava/lang/Throwable;)V

    .line 1372
    .line 1373
    .line 1374
    goto :goto_22

    .line 1375
    :catchall_a
    move-exception v0

    .line 1376
    goto :goto_24

    .line 1377
    :cond_3d
    :goto_22
    monitor-exit v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 1378
    invoke-virtual {v3}, Landroidx/emoji2/text/u;->a()V

    .line 1379
    .line 1380
    .line 1381
    :goto_23
    return-void

    .line 1382
    :goto_24
    :try_start_15
    monitor-exit v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 1383
    throw v0

    .line 1384
    :goto_25
    :try_start_16
    monitor-exit v4
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    .line 1385
    throw v0

    .line 1386
    :pswitch_13
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 1387
    .line 1388
    check-cast v0, Landroidx/activity/s;

    .line 1389
    .line 1390
    invoke-static {v0}, Landroidx/activity/s;->b(Landroidx/activity/s;)V

    .line 1391
    .line 1392
    .line 1393
    return-void

    .line 1394
    :pswitch_14
    iget-object v0, v1, Landroidx/activity/k;->g:Ljava/lang/Object;

    .line 1395
    .line 1396
    check-cast v0, Landroidx/activity/l;

    .line 1397
    .line 1398
    iget-object v2, v0, Landroidx/activity/l;->g:Ljava/lang/Runnable;

    .line 1399
    .line 1400
    if-eqz v2, :cond_3e

    .line 1401
    .line 1402
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 1403
    .line 1404
    .line 1405
    const/4 v6, 0x0

    .line 1406
    iput-object v6, v0, Landroidx/activity/l;->g:Ljava/lang/Runnable;

    .line 1407
    .line 1408
    :cond_3e
    return-void

    .line 1409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
