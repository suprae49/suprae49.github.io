.class public abstract Lv2/e;
.super Landroid/widget/ProgressBar;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final f:Lv2/l;

.field public g:I

.field public final h:Z

.field public final i:I

.field public j:J

.field public k:Lv2/a;

.field public l:Z

.field public m:I

.field public n:Z

.field public final o:Lv2/b;

.field public final p:Lv2/c;

.field public final q:Lv2/c;

.field public final r:Lv2/d;

.field public final s:Lv2/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x7f1205fb

    .line 4
    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const v8, 0x7f0400e5

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p1

    .line 11
    .line 12
    invoke-static {v2, v3, v8, v1}, Lf3/a;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1, v3, v8}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v1, -0x1

    .line 20
    .line 21
    iput-wide v1, v0, Lv2/e;->j:J

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput-boolean v1, v0, Lv2/e;->l:Z

    .line 25
    .line 26
    const/4 v9, 0x4

    .line 27
    iput v9, v0, Lv2/e;->m:I

    .line 28
    .line 29
    new-instance v2, Lv2/b;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lv2/b;-><init>(Lv2/e;)V

    .line 32
    .line 33
    .line 34
    iput-object v2, v0, Lv2/e;->o:Lv2/b;

    .line 35
    .line 36
    new-instance v2, Lv2/c;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v2, v0, v4}, Lv2/c;-><init>(Lv2/e;I)V

    .line 40
    .line 41
    .line 42
    iput-object v2, v0, Lv2/e;->p:Lv2/c;

    .line 43
    .line 44
    new-instance v2, Lv2/c;

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    invoke-direct {v2, v0, v4}, Lv2/c;-><init>(Lv2/e;I)V

    .line 48
    .line 49
    .line 50
    iput-object v2, v0, Lv2/e;->q:Lv2/c;

    .line 51
    .line 52
    new-instance v2, Lv2/d;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-direct {v2, v0, v4}, Lv2/d;-><init>(Landroid/view/View;I)V

    .line 56
    .line 57
    .line 58
    iput-object v2, v0, Lv2/e;->r:Lv2/d;

    .line 59
    .line 60
    new-instance v2, Lv2/d;

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    invoke-direct {v2, v0, v4}, Lv2/d;-><init>(Landroid/view/View;I)V

    .line 64
    .line 65
    .line 66
    iput-object v2, v0, Lv2/e;->s:Lv2/d;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v10, Lv2/l;

    .line 73
    .line 74
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    new-array v4, v1, [I

    .line 78
    .line 79
    iput-object v4, v10, Lv2/l;->e:[I

    .line 80
    .line 81
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    const v5, 0x7f070435

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    new-array v7, v1, [I

    .line 93
    .line 94
    const v5, 0x7f0400e5

    .line 95
    .line 96
    .line 97
    const v6, 0x7f1205ca

    .line 98
    .line 99
    .line 100
    invoke-static {v2, v3, v5, v6}, Lr2/a0;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 101
    .line 102
    .line 103
    sget-object v4, La2/a;->d:[I

    .line 104
    .line 105
    invoke-static/range {v2 .. v7}, Lr2/a0;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 106
    .line 107
    .line 108
    move-object v12, v4

    .line 109
    invoke-virtual {v2, v3, v12, v5, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    const/16 v7, 0xa

    .line 114
    .line 115
    invoke-static {v2, v4, v7, v11}, Lt2/i;->l(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    iput v7, v10, Lv2/l;->a:I

    .line 120
    .line 121
    const/16 v7, 0x9

    .line 122
    .line 123
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    const/4 v11, 0x5

    .line 128
    const/4 v13, 0x6

    .line 129
    const/4 v14, 0x2

    .line 130
    const/4 v15, 0x1

    .line 131
    const/high16 v8, 0x3f800000    # 1.0f

    .line 132
    .line 133
    if-eqz v7, :cond_1

    .line 134
    .line 135
    iget v3, v7, Landroid/util/TypedValue;->type:I

    .line 136
    .line 137
    if-ne v3, v11, :cond_0

    .line 138
    .line 139
    iget v3, v7, Landroid/util/TypedValue;->data:I

    .line 140
    .line 141
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-static {v3, v7}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    iget v7, v10, Lv2/l;->a:I

    .line 154
    .line 155
    div-int/2addr v7, v14

    .line 156
    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    iput v3, v10, Lv2/l;->b:I

    .line 161
    .line 162
    iput-boolean v1, v10, Lv2/l;->d:Z

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_0
    if-ne v3, v13, :cond_1

    .line 166
    .line 167
    invoke-virtual {v7, v8, v8}, Landroid/util/TypedValue;->getFraction(FF)F

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    const/high16 v7, 0x3f000000    # 0.5f

    .line 172
    .line 173
    invoke-static {v3, v7}, Ljava/lang/Math;->min(FF)F

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    iput v3, v10, Lv2/l;->c:F

    .line 178
    .line 179
    iput-boolean v15, v10, Lv2/l;->d:Z

    .line 180
    .line 181
    :cond_1
    :goto_0
    invoke-virtual {v4, v13, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    iput v3, v10, Lv2/l;->g:I

    .line 186
    .line 187
    invoke-virtual {v4, v15, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    iput v3, v10, Lv2/l;->h:I

    .line 192
    .line 193
    invoke-virtual {v4, v9, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    iput v3, v10, Lv2/l;->i:I

    .line 198
    .line 199
    const/16 v3, 0xf

    .line 200
    .line 201
    invoke-virtual {v4, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    const/16 v7, 0x10

    .line 210
    .line 211
    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    iput v7, v10, Lv2/l;->j:I

    .line 220
    .line 221
    const/16 v7, 0x11

    .line 222
    .line 223
    invoke-virtual {v4, v7, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    iput v3, v10, Lv2/l;->k:I

    .line 232
    .line 233
    const/16 v3, 0xb

    .line 234
    .line 235
    invoke-virtual {v4, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    iput v3, v10, Lv2/l;->l:I

    .line 244
    .line 245
    const/16 v3, 0xe

    .line 246
    .line 247
    invoke-virtual {v4, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    iput v3, v10, Lv2/l;->m:I

    .line 252
    .line 253
    invoke-virtual {v4, v14, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    iput v3, v10, Lv2/l;->n:F

    .line 258
    .line 259
    const/16 v3, 0xd

    .line 260
    .line 261
    const v7, 0x3dcccccd    # 0.1f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v3, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    iput v3, v10, Lv2/l;->o:F

    .line 269
    .line 270
    const/16 v3, 0xc

    .line 271
    .line 272
    const v7, 0x3f666666    # 0.9f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4, v3, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    iput v3, v10, Lv2/l;->p:F

    .line 280
    .line 281
    const/4 v8, 0x3

    .line 282
    invoke-virtual {v4, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    const/4 v13, -0x1

    .line 287
    if-nez v3, :cond_3

    .line 288
    .line 289
    const v3, 0x7f04012d

    .line 290
    .line 291
    .line 292
    invoke-static {v2, v3}, Le4/a;->u(Landroid/content/Context;I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    if-eqz v3, :cond_2

    .line 297
    .line 298
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    goto :goto_1

    .line 303
    :cond_2
    move v3, v13

    .line 304
    :goto_1
    filled-new-array {v3}, [I

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    iput-object v3, v10, Lv2/l;->e:[I

    .line 309
    .line 310
    goto :goto_2

    .line 311
    :cond_3
    invoke-virtual {v4, v8}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    iget v3, v3, Landroid/util/TypedValue;->type:I

    .line 316
    .line 317
    if-eq v3, v15, :cond_4

    .line 318
    .line 319
    invoke-virtual {v4, v8, v13}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    filled-new-array {v3}, [I

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    iput-object v3, v10, Lv2/l;->e:[I

    .line 328
    .line 329
    goto :goto_2

    .line 330
    :cond_4
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-virtual {v4, v8, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getIntArray(I)[I

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    iput-object v3, v10, Lv2/l;->e:[I

    .line 343
    .line 344
    array-length v3, v3

    .line 345
    if-eqz v3, :cond_6

    .line 346
    .line 347
    :goto_2
    const/16 v3, 0x8

    .line 348
    .line 349
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    if-eqz v7, :cond_5

    .line 354
    .line 355
    invoke-virtual {v4, v3, v13}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    iput v3, v10, Lv2/l;->f:I

    .line 360
    .line 361
    goto :goto_3

    .line 362
    :cond_5
    iget-object v3, v10, Lv2/l;->e:[I

    .line 363
    .line 364
    aget v3, v3, v1

    .line 365
    .line 366
    iput v3, v10, Lv2/l;->f:I

    .line 367
    .line 368
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    const v7, 0x1010033

    .line 373
    .line 374
    .line 375
    filled-new-array {v7}, [I

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    invoke-virtual {v3, v7}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    const v7, 0x3e4ccccd    # 0.2f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v3, v1, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 391
    .line 392
    .line 393
    const/high16 v3, 0x437f0000    # 255.0f

    .line 394
    .line 395
    mul-float/2addr v7, v3

    .line 396
    float-to-int v3, v7

    .line 397
    iget v7, v10, Lv2/l;->f:I

    .line 398
    .line 399
    invoke-static {v7, v3}, Le4/a;->k(II)I

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    iput v3, v10, Lv2/l;->f:I

    .line 404
    .line 405
    :goto_3
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    const v4, 0x7f07042f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    const v7, 0x7f07042a

    .line 424
    .line 425
    .line 426
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    new-array v7, v1, [I

    .line 431
    .line 432
    const/4 v11, 0x0

    .line 433
    invoke-static {v2, v11, v5, v6}, Lr2/a0;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 434
    .line 435
    .line 436
    move/from16 v16, v4

    .line 437
    .line 438
    sget-object v4, La2/a;->i:[I

    .line 439
    .line 440
    move-object v13, v11

    .line 441
    move v11, v3

    .line 442
    move-object v3, v13

    .line 443
    move/from16 v13, v16

    .line 444
    .line 445
    invoke-static/range {v2 .. v7}, Lr2/a0;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    invoke-virtual {v4, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    iput v5, v10, Lv2/l;->q:I

    .line 457
    .line 458
    invoke-static {v2, v4, v9, v11}, Lt2/i;->l(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    .line 459
    .line 460
    .line 461
    move-result v5

    .line 462
    iget v6, v10, Lv2/l;->a:I

    .line 463
    .line 464
    mul-int/2addr v6, v14

    .line 465
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    iput v5, v10, Lv2/l;->r:I

    .line 470
    .line 471
    invoke-static {v2, v4, v8, v13}, Lt2/i;->l(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    iput v5, v10, Lv2/l;->s:I

    .line 476
    .line 477
    invoke-virtual {v4, v14, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 478
    .line 479
    .line 480
    move-result v5

    .line 481
    iput v5, v10, Lv2/l;->t:I

    .line 482
    .line 483
    invoke-virtual {v4, v15, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    iput-boolean v5, v10, Lv2/l;->u:Z

    .line 488
    .line 489
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v10}, Lv2/l;->b()V

    .line 493
    .line 494
    .line 495
    iput-object v10, v0, Lv2/e;->f:Lv2/l;

    .line 496
    .line 497
    new-array v7, v1, [I

    .line 498
    .line 499
    const v6, 0x7f1205ca

    .line 500
    .line 501
    .line 502
    const v5, 0x7f0400e5

    .line 503
    .line 504
    .line 505
    invoke-static {v2, v3, v5, v6}, Lr2/a0;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 506
    .line 507
    .line 508
    move-object v4, v12

    .line 509
    invoke-static/range {v2 .. v7}, Lr2/a0;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    const/4 v2, 0x7

    .line 517
    const/4 v3, -0x1

    .line 518
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 519
    .line 520
    .line 521
    const/4 v2, 0x5

    .line 522
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    const/16 v3, 0x3e8

    .line 527
    .line 528
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    iput v2, v0, Lv2/e;->i:I

    .line 533
    .line 534
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 535
    .line 536
    .line 537
    new-instance v1, Lv2/a;

    .line 538
    .line 539
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 540
    .line 541
    .line 542
    iput-object v1, v0, Lv2/e;->k:Lv2/a;

    .line 543
    .line 544
    iput-boolean v15, v0, Lv2/e;->h:Z

    .line 545
    .line 546
    return-void

    .line 547
    :cond_6
    const-string v1, "indicatorColors cannot be empty when indicatorColor is not used."

    .line 548
    .line 549
    invoke-static {v1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    const/4 v1, 0x0

    .line 553
    throw v1
.end method

.method private getCurrentDrawingDelegate()Lv2/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv2/r;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lv2/s;->s:Lv2/f;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    :goto_0
    const/4 v0, 0x0

    .line 28
    return-object v0

    .line 29
    :cond_2
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, Lv2/m;->s:Lv2/f;

    .line 34
    .line 35
    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    iput p1, p0, Lv2/e;->g:I

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lv2/e;->l:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lv2/e;->k:Lv2/a;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const-string p1, "animator_duration_scale"

    .line 42
    .line 43
    const/high16 v1, 0x3f800000    # 1.0f

    .line 44
    .line 45
    invoke-static {v0, p1, v1}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const/4 v0, 0x0

    .line 50
    cmpl-float p1, p1, v0

    .line 51
    .line 52
    if-nez p1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p1, p1, Lv2/s;->t:Le/a0;

    .line 60
    .line 61
    invoke-virtual {p1}, Le/a0;->l()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    :goto_0
    iget-object p1, p0, Lv2/e;->r:Lv2/d;

    .line 66
    .line 67
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1, v0}, Lv2/d;->a(Landroid/graphics/drawable/Drawable;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Lv2/m;->jumpToCurrentState()V

    .line 89
    .line 90
    .line 91
    :cond_3
    return-void
.end method

.method public final b()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    instance-of v1, v0, Landroid/view/View;

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    :goto_1
    const/4 v0, 0x1

    .line 39
    return v0

    .line 40
    :cond_2
    check-cast v0, Landroid/view/View;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_2
    const/4 v0, 0x0

    .line 44
    return v0
.end method

.method public getCurrentDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getHideAnimationBehavior()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->h:I

    .line 4
    .line 5
    return v0
.end method

.method public bridge synthetic getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    move-result-object v0

    return-object v0
.end method

.method public getIndeterminateDrawable()Lv2/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv2/s;"
        }
    .end annotation

    .line 1
    invoke-super {p0}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lv2/s;

    .line 6
    .line 7
    return-object v0
.end method

.method public getIndicatorColor()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget-object v0, v0, Lv2/l;->e:[I

    .line 4
    .line 5
    return-object v0
.end method

.method public getIndicatorTrackGapSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->i:I

    .line 4
    .line 5
    return v0
.end method

.method public bridge synthetic getProgressDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    move-result-object v0

    return-object v0
.end method

.method public getProgressDrawable()Lv2/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv2/m;"
        }
    .end annotation

    .line 1
    invoke-super {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lv2/m;

    .line 6
    .line 7
    return-object v0
.end method

.method public getShowAnimationBehavior()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->g:I

    .line 4
    .line 5
    return v0
.end method

.method public getTrackColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->f:I

    .line 4
    .line 5
    return v0
.end method

.method public getTrackCornerRadius()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->b:I

    .line 4
    .line 5
    return v0
.end method

.method public getTrackCornerRadiusFraction()F
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->c:F

    .line 4
    .line 5
    return v0
.end method

.method public getTrackThickness()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->a:I

    .line 4
    .line 5
    return v0
.end method

.method public getWaveAmplitude()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->l:I

    .line 4
    .line 5
    return v0
.end method

.method public getWaveSpeed()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->m:I

    .line 4
    .line 5
    return v0
.end method

.method public getWavelengthDeterminate()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->j:I

    .line 4
    .line 5
    return v0
.end method

.method public getWavelengthIndeterminate()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->k:I

    .line 4
    .line 5
    return v0
.end method

.method public final invalidate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv2/e;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lv2/e;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, Lv2/s;->t:Le/a0;

    .line 21
    .line 22
    iget-object v1, p0, Lv2/e;->r:Lv2/d;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Le/a0;->k(Lv2/d;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lv2/e;->s:Lv2/d;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v2, v0, Lv2/o;->l:Ljava/util/ArrayList;

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    new-instance v2, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v2, v0, Lv2/o;->l:Ljava/util/ArrayList;

    .line 49
    .line 50
    :cond_1
    iget-object v2, v0, Lv2/o;->l:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    iget-object v0, v0, Lv2/o;->l:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v2, v0, Lv2/o;->l:Ljava/util/ArrayList;

    .line 74
    .line 75
    if-nez v2, :cond_3

    .line 76
    .line 77
    new-instance v2, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v2, v0, Lv2/o;->l:Ljava/util/ArrayList;

    .line 83
    .line 84
    :cond_3
    iget-object v2, v0, Lv2/o;->l:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    iget-object v0, v0, Lv2/o;->l:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_4
    invoke-virtual {p0}, Lv2/e;->b()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_6

    .line 102
    .line 103
    iget v0, p0, Lv2/e;->i:I

    .line 104
    .line 105
    if-lez v0, :cond_5

    .line 106
    .line 107
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    iput-wide v0, p0, Lv2/e;->j:J

    .line 112
    .line 113
    :cond_5
    const/4 v0, 0x0

    .line 114
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 115
    .line 116
    .line 117
    :cond_6
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->q:Lv2/c;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv2/e;->p:Lv2/c;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lv2/e;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lv2/o;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1, v1, v1}, Lv2/o;->d(ZZZ)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lv2/e;->s:Lv2/d;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, v1}, Lv2/o;->f(Lv2/d;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, Lv2/s;->t:Le/a0;

    .line 41
    .line 42
    invoke-virtual {v0}, Le/a0;->o()V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, v1}, Lv2/o;->f(Lv2/d;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-super {p0}, Landroid/widget/ProgressBar;->onDetachedFromWindow()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-float v1, v1

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    int-to-float v2, v2

    .line 31
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    add-int/2addr v2, v3

    .line 59
    sub-int/2addr v1, v2

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    add-int/2addr v3, v4

    .line 73
    sub-int/2addr v2, v3

    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-virtual {p1, v3, v3, v1, v2}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-virtual {p0}, Lv2/e;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    monitor-exit p0

    .line 89
    return-void

    .line 90
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    throw p1
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lv2/e;->getCurrentDrawingDelegate()Lv2/r;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lv2/r;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final declared-synchronized onMeasure(II)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lv2/e;->getCurrentDrawingDelegate()Lv2/r;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    move-object v1, v0

    .line 11
    check-cast v1, Lv2/f;

    .line 12
    .line 13
    invoke-virtual {v1}, Lv2/f;->g()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-gez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1, p1}, Landroid/view/View;->getDefaultSize(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    move-object p1, v0

    .line 31
    check-cast p1, Lv2/f;

    .line 32
    .line 33
    invoke-virtual {p1}, Lv2/f;->g()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr p1, v1

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr p1, v1

    .line 47
    :goto_0
    move-object v1, v0

    .line 48
    check-cast v1, Lv2/f;

    .line 49
    .line 50
    invoke-virtual {v1}, Lv2/f;->g()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-gez v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v0, p2}, Landroid/view/View;->getDefaultSize(II)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    check-cast v0, Lv2/f;

    .line 66
    .line 67
    invoke-virtual {v0}, Lv2/f;->g()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    add-int/2addr p2, v0

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    add-int/2addr p2, v0

    .line 81
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    .line 84
    monitor-exit p0

    .line 85
    return-void

    .line 86
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    throw p1
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move p2, p1

    .line 10
    :goto_0
    iget-boolean v0, p0, Lv2/e;->h:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    invoke-virtual {p0}, Lv2/e;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lv2/o;

    .line 20
    .line 21
    invoke-virtual {p0}, Lv2/e;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1, p1, p2}, Lv2/o;->d(ZZZ)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lv2/e;->h:Z

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Lv2/e;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lv2/o;

    .line 14
    .line 15
    invoke-virtual {p0}, Lv2/e;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p1, v0, v1, v1}, Lv2/o;->d(ZZZ)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setAnimatorDurationScaleProvider(Lv2/a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lv2/e;->k:Lv2/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object p1, v0, Lv2/o;->h:Lv2/a;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object p1, v0, Lv2/o;->h:Lv2/a;

    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public setHideAfterMaxProgress(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lv2/e;->o:Lv2/b;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p1, p1, Lv2/m;->t:Lz0/d;

    .line 17
    .line 18
    iget-object p1, p1, Lz0/d;->i:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, Lv2/m;->t:Lz0/d;

    .line 35
    .line 36
    iget-object p1, p1, Lz0/d;->i:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ltz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public setHideAnimationBehavior(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iput p1, v0, Lv2/l;->h:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public declared-synchronized setIndeterminate(Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 3
    .line 4
    .line 5
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lv2/e;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lv2/o;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v1, v1, v1}, Lv2/o;->d(ZZZ)Z

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lv2/e;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lv2/o;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lv2/e;->b()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v0, v1, v1}, Lv2/o;->d(ZZZ)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    instance-of v0, p1, Lv2/s;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Lv2/e;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    check-cast p1, Lv2/s;

    .line 54
    .line 55
    iget-object p1, p1, Lv2/s;->t:Le/a0;

    .line 56
    .line 57
    invoke-virtual {p1}, Le/a0;->n()V

    .line 58
    .line 59
    .line 60
    :cond_3
    iput-boolean v1, p0, Lv2/e;->l:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    monitor-exit p0

    .line 63
    return-void

    .line 64
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    throw p1
.end method

.method public setIndeterminateAnimatorDurationScale(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->n:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, Lv2/l;->n:F

    .line 10
    .line 11
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p1, p1, Lv2/s;->t:Le/a0;

    .line 16
    .line 17
    invoke-virtual {p1}, Le/a0;->i()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lv2/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lv2/o;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1, v1, v1}, Lv2/o;->d(ZZZ)Z

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-boolean v0, p0, Lv2/e;->n:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string p1, "Cannot set framework drawable as indeterminate drawable."

    .line 25
    .line 26
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public varargs setIndicatorColor([I)V
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    if-nez v0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const v0, 0x7f04012d

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Le4/a;->u(Landroid/content/Context;I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, -0x1

    .line 23
    :goto_0
    filled-new-array {p1}, [I

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_1
    invoke-virtual {p0}, Lv2/e;->getIndicatorColor()[I

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 38
    .line 39
    iput-object p1, v0, Lv2/l;->e:[I

    .line 40
    .line 41
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p1, p1, Lv2/s;->t:Le/a0;

    .line 46
    .line 47
    invoke-virtual {p1}, Le/a0;->i()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public setIndicatorTrackGapSize(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->i:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Lv2/l;->i:I

    .line 8
    .line 9
    invoke-virtual {v0}, Lv2/l;->b()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public declared-synchronized setProgress(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 3
    .line 4
    .line 5
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lv2/e;->a(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 17
    throw p1
.end method

.method public setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lv2/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lv2/m;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0, v0, v0}, Lv2/o;->d(ZZZ)Z

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    int-to-float v0, v0

    .line 19
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    div-float/2addr v0, v1

    .line 25
    const v1, 0x461c4000    # 10000.0f

    .line 26
    .line 27
    .line 28
    mul-float/2addr v0, v1

    .line 29
    float-to-int v0, v0

    .line 30
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-boolean v0, p0, Lv2/e;->n:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const-string p1, "Cannot set framework drawable as progress drawable."

    .line 43
    .line 44
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public setShowAnimationBehavior(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iput p1, v0, Lv2/l;->g:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTrackColor(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->f:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Lv2/l;->f:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setTrackCornerRadius(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->b:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iget v1, v0, Lv2/l;->a:I

    .line 8
    .line 9
    div-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, v0, Lv2/l;->b:I

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, v0, Lv2/l;->d:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public setTrackCornerRadiusFraction(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->c:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/high16 v1, 0x3f000000    # 0.5f

    .line 10
    .line 11
    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, v0, Lv2/l;->c:F

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, v0, Lv2/l;->d:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public setTrackThickness(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->a:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Lv2/l;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setVisibilityAfterHide(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/16 v0, 0x8

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string p1, "The component\'s visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View."

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    :goto_0
    iput p1, p0, Lv2/e;->m:I

    .line 18
    .line 19
    return-void
.end method

.method public setWaveAmplitude(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->l:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, v0, Lv2/l;->l:I

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setWaveAmplitudeRampProgressMax(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lv2/o;->g:Lv2/l;

    .line 6
    .line 7
    iput p1, v1, Lv2/l;->p:F

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setWaveAmplitudeRampProgressMin(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lv2/o;->g:Lv2/l;

    .line 6
    .line 7
    iput p1, v1, Lv2/l;->o:F

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setWaveSpeed(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iput p1, v0, Lv2/l;->m:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v0, v0, Lv2/l;->m:I

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object p1, p1, Lv2/m;->x:Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    if-nez v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public setWavelength(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lv2/e;->setWavelengthDeterminate(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lv2/e;->setWavelengthIndeterminate(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setWavelengthDeterminate(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->j:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, v0, Lv2/l;->j:I

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public setWavelengthIndeterminate(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->k:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, v0, Lv2/l;->k:I

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
