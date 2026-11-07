.class public final Lv2/f;
.super Lv2/r;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:F

.field public n:Z

.field public o:F

.field public final p:Landroid/graphics/RectF;

.field public final q:Landroid/util/Pair;


# direct methods
.method public constructor <init>(Lv2/l;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lv2/r;-><init>(Lv2/l;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lv2/f;->p:Landroid/graphics/RectF;

    .line 10
    .line 11
    new-instance p1, Landroid/util/Pair;

    .line 12
    .line 13
    new-instance v0, Lv2/q;

    .line 14
    .line 15
    invoke-direct {v0}, Lv2/q;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lv2/q;

    .line 19
    .line 20
    invoke-direct {v1}, Lv2/q;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lv2/f;->q:Landroid/util/Pair;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv2/r;->b:Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Path;->rewind()V

    .line 6
    .line 7
    .line 8
    const/high16 v2, 0x3f800000    # 1.0f

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 12
    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    move v9, v8

    .line 16
    :goto_0
    const/4 v10, 0x2

    .line 17
    if-ge v9, v10, :cond_0

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    const/high16 v7, 0x3f800000    # 1.0f

    .line 21
    .line 22
    const/high16 v2, 0x3f800000    # 1.0f

    .line 23
    .line 24
    const v3, 0x3f0d6289

    .line 25
    .line 26
    .line 27
    const v4, 0x3f0d6289

    .line 28
    .line 29
    .line 30
    const/high16 v5, 0x3f800000    # 1.0f

    .line 31
    .line 32
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 33
    .line 34
    .line 35
    const/high16 v6, -0x40800000    # -1.0f

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const v2, -0x40f29d77

    .line 39
    .line 40
    .line 41
    const/high16 v3, 0x3f800000    # 1.0f

    .line 42
    .line 43
    const/high16 v4, -0x40800000    # -1.0f

    .line 44
    .line 45
    const v5, 0x3f0d6289

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 49
    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    const/high16 v7, -0x40800000    # -1.0f

    .line 53
    .line 54
    const/high16 v2, -0x40800000    # -1.0f

    .line 55
    .line 56
    const v3, -0x40f29d77

    .line 57
    .line 58
    .line 59
    const v4, -0x40f29d77

    .line 60
    .line 61
    .line 62
    const/high16 v5, -0x40800000    # -1.0f

    .line 63
    .line 64
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 65
    .line 66
    .line 67
    const/high16 v6, 0x3f800000    # 1.0f

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    const v2, 0x3f0d6289

    .line 71
    .line 72
    .line 73
    const/high16 v3, -0x40800000    # -1.0f

    .line 74
    .line 75
    const/high16 v4, 0x3f800000    # 1.0f

    .line 76
    .line 77
    const v5, -0x40f29d77

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 81
    .line 82
    .line 83
    add-int/lit8 v9, v9, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    iget-object v2, v0, Lv2/r;->e:Landroid/graphics/Matrix;

    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 89
    .line 90
    .line 91
    iget v3, v0, Lv2/f;->i:F

    .line 92
    .line 93
    invoke-virtual {v2, v3, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 97
    .line 98
    .line 99
    iget-object v2, v0, Lv2/r;->a:Lv2/l;

    .line 100
    .line 101
    iget-boolean v3, v0, Lv2/f;->n:Z

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Lv2/l;->a(Z)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    iget-object v9, v0, Lv2/r;->d:Landroid/graphics/PathMeasure;

    .line 108
    .line 109
    if-eqz v3, :cond_3

    .line 110
    .line 111
    invoke-virtual {v9, v1, v8}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 112
    .line 113
    .line 114
    iget v3, v0, Lv2/f;->k:F

    .line 115
    .line 116
    invoke-virtual {v1}, Landroid/graphics/Path;->rewind()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v9}, Landroid/graphics/PathMeasure;->getLength()F

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    iget-boolean v5, v0, Lv2/f;->n:Z

    .line 124
    .line 125
    if-eqz v5, :cond_1

    .line 126
    .line 127
    iget v2, v2, Lv2/l;->j:I

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_1
    iget v2, v2, Lv2/l;->k:I

    .line 131
    .line 132
    :goto_1
    int-to-float v2, v2

    .line 133
    div-float v2, v4, v2

    .line 134
    .line 135
    const/high16 v11, 0x40000000    # 2.0f

    .line 136
    .line 137
    div-float/2addr v2, v11

    .line 138
    float-to-int v2, v2

    .line 139
    const/4 v5, 0x3

    .line 140
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    mul-int/2addr v2, v10

    .line 145
    int-to-float v5, v2

    .line 146
    div-float/2addr v4, v5

    .line 147
    iput v4, v0, Lv2/f;->j:F

    .line 148
    .line 149
    new-instance v12, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    move v4, v8

    .line 155
    :goto_2
    if-ge v4, v2, :cond_2

    .line 156
    .line 157
    new-instance v5, Lv2/q;

    .line 158
    .line 159
    invoke-direct {v5}, Lv2/q;-><init>()V

    .line 160
    .line 161
    .line 162
    iget v6, v0, Lv2/f;->j:F

    .line 163
    .line 164
    int-to-float v7, v4

    .line 165
    mul-float/2addr v6, v7

    .line 166
    iget-object v13, v5, Lv2/q;->a:[F

    .line 167
    .line 168
    iget-object v14, v5, Lv2/q;->b:[F

    .line 169
    .line 170
    invoke-virtual {v9, v6, v13, v14}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 171
    .line 172
    .line 173
    new-instance v6, Lv2/q;

    .line 174
    .line 175
    invoke-direct {v6}, Lv2/q;-><init>()V

    .line 176
    .line 177
    .line 178
    iget v13, v0, Lv2/f;->j:F

    .line 179
    .line 180
    mul-float/2addr v7, v13

    .line 181
    div-float/2addr v13, v11

    .line 182
    add-float/2addr v13, v7

    .line 183
    iget-object v7, v6, Lv2/q;->a:[F

    .line 184
    .line 185
    iget-object v14, v6, Lv2/q;->b:[F

    .line 186
    .line 187
    invoke-virtual {v9, v13, v7, v14}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    mul-float v5, v3, v11

    .line 194
    .line 195
    invoke-virtual {v6, v5}, Lv2/q;->a(F)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    add-int/lit8 v4, v4, 0x1

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_2
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, Lv2/q;

    .line 209
    .line 210
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, Lv2/q;

    .line 218
    .line 219
    iget-object v3, v2, Lv2/q;->a:[F

    .line 220
    .line 221
    aget v4, v3, v8

    .line 222
    .line 223
    const/4 v13, 0x1

    .line 224
    aget v3, v3, v13

    .line 225
    .line 226
    invoke-virtual {v1, v4, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 227
    .line 228
    .line 229
    move v14, v13

    .line 230
    :goto_3
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-ge v14, v3, :cond_3

    .line 235
    .line 236
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    move-object v15, v3

    .line 241
    check-cast v15, Lv2/q;

    .line 242
    .line 243
    iget v3, v0, Lv2/f;->j:F

    .line 244
    .line 245
    div-float/2addr v3, v11

    .line 246
    const v4, 0x3ef5c28f    # 0.48f

    .line 247
    .line 248
    .line 249
    mul-float/2addr v3, v4

    .line 250
    iget-object v4, v2, Lv2/q;->a:[F

    .line 251
    .line 252
    iget-object v2, v2, Lv2/q;->b:[F

    .line 253
    .line 254
    new-array v5, v10, [F

    .line 255
    .line 256
    new-array v6, v10, [F

    .line 257
    .line 258
    invoke-static {v4, v8, v5, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 259
    .line 260
    .line 261
    invoke-static {v2, v8, v6, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 262
    .line 263
    .line 264
    new-instance v2, Landroid/graphics/Matrix;

    .line 265
    .line 266
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 267
    .line 268
    .line 269
    iget-object v2, v15, Lv2/q;->a:[F

    .line 270
    .line 271
    iget-object v4, v15, Lv2/q;->b:[F

    .line 272
    .line 273
    new-array v7, v10, [F

    .line 274
    .line 275
    new-array v11, v10, [F

    .line 276
    .line 277
    invoke-static {v2, v8, v7, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 278
    .line 279
    .line 280
    invoke-static {v4, v8, v11, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 281
    .line 282
    .line 283
    new-instance v2, Landroid/graphics/Matrix;

    .line 284
    .line 285
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 286
    .line 287
    .line 288
    aget v2, v6, v13

    .line 289
    .line 290
    move-object v4, v11

    .line 291
    float-to-double v10, v2

    .line 292
    aget v2, v6, v8

    .line 293
    .line 294
    move/from16 v16, v13

    .line 295
    .line 296
    move/from16 v17, v14

    .line 297
    .line 298
    float-to-double v13, v2

    .line 299
    invoke-static {v10, v11, v13, v14}, Ljava/lang/Math;->atan2(DD)D

    .line 300
    .line 301
    .line 302
    move-result-wide v10

    .line 303
    double-to-float v2, v10

    .line 304
    aget v6, v5, v8

    .line 305
    .line 306
    float-to-double v10, v6

    .line 307
    float-to-double v13, v3

    .line 308
    move/from16 v18, v8

    .line 309
    .line 310
    move-object/from16 v19, v9

    .line 311
    .line 312
    float-to-double v8, v2

    .line 313
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 314
    .line 315
    .line 316
    move-result-wide v20

    .line 317
    mul-double v20, v20, v13

    .line 318
    .line 319
    add-double v10, v20, v10

    .line 320
    .line 321
    double-to-float v2, v10

    .line 322
    aput v2, v5, v18

    .line 323
    .line 324
    aget v2, v5, v16

    .line 325
    .line 326
    float-to-double v10, v2

    .line 327
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 328
    .line 329
    .line 330
    move-result-wide v8

    .line 331
    mul-double/2addr v8, v13

    .line 332
    add-double/2addr v8, v10

    .line 333
    double-to-float v2, v8

    .line 334
    aput v2, v5, v16

    .line 335
    .line 336
    neg-float v2, v3

    .line 337
    aget v3, v4, v16

    .line 338
    .line 339
    float-to-double v8, v3

    .line 340
    aget v3, v4, v18

    .line 341
    .line 342
    float-to-double v3, v3

    .line 343
    invoke-static {v8, v9, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    .line 344
    .line 345
    .line 346
    move-result-wide v3

    .line 347
    double-to-float v3, v3

    .line 348
    aget v4, v7, v18

    .line 349
    .line 350
    float-to-double v8, v4

    .line 351
    float-to-double v10, v2

    .line 352
    float-to-double v2, v3

    .line 353
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 354
    .line 355
    .line 356
    move-result-wide v13

    .line 357
    mul-double/2addr v13, v10

    .line 358
    add-double/2addr v13, v8

    .line 359
    double-to-float v4, v13

    .line 360
    aput v4, v7, v18

    .line 361
    .line 362
    aget v4, v7, v16

    .line 363
    .line 364
    float-to-double v8, v4

    .line 365
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 366
    .line 367
    .line 368
    move-result-wide v2

    .line 369
    mul-double/2addr v2, v10

    .line 370
    add-double/2addr v2, v8

    .line 371
    double-to-float v2, v2

    .line 372
    aput v2, v7, v16

    .line 373
    .line 374
    move-object v3, v5

    .line 375
    move v5, v2

    .line 376
    aget v2, v3, v18

    .line 377
    .line 378
    aget v3, v3, v16

    .line 379
    .line 380
    aget v4, v7, v18

    .line 381
    .line 382
    iget-object v6, v15, Lv2/q;->a:[F

    .line 383
    .line 384
    move-object v7, v6

    .line 385
    aget v6, v7, v18

    .line 386
    .line 387
    aget v7, v7, v16

    .line 388
    .line 389
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 390
    .line 391
    .line 392
    add-int/lit8 v14, v17, 0x1

    .line 393
    .line 394
    move-object v2, v15

    .line 395
    move/from16 v13, v16

    .line 396
    .line 397
    move/from16 v8, v18

    .line 398
    .line 399
    move-object/from16 v9, v19

    .line 400
    .line 401
    const/4 v10, 0x2

    .line 402
    const/high16 v11, 0x40000000    # 2.0f

    .line 403
    .line 404
    goto/16 :goto_3

    .line 405
    .line 406
    :cond_3
    move v3, v8

    .line 407
    move-object v2, v9

    .line 408
    invoke-virtual {v2, v1, v3}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 409
    .line 410
    .line 411
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V
    .locals 20

    move-object/from16 v0, p0

    cmpl-float v1, p4, p3

    const/high16 v2, 0x3f800000    # 1.0f

    if-ltz v1, :cond_0

    sub-float v1, p4, p3

    goto :goto_0

    :cond_0
    add-float v1, p4, v2

    sub-float v1, v1, p3

    :goto_0
    rem-float v3, p3, v2

    const/4 v4, 0x0

    cmpg-float v5, v3, v4

    if-gez v5, :cond_1

    add-float/2addr v3, v2

    .line 1
    :cond_1
    iget v5, v0, Lv2/f;->o:F

    cmpg-float v5, v5, v2

    if-gez v5, :cond_2

    add-float v11, v3, v1

    cmpl-float v5, v11, v2

    if-lez v5, :cond_2

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    .line 2
    invoke-virtual/range {v0 .. v10}, Lv2/f;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move/from16 v7, p7

    move v4, v11

    .line 3
    invoke-virtual/range {v0 .. v10}, Lv2/f;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V

    return-void

    :cond_2
    move-object/from16 v5, p2

    .line 4
    iget v6, v0, Lv2/f;->g:F

    iget v7, v0, Lv2/f;->i:F

    div-float/2addr v6, v7

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    double-to-float v6, v6

    const v7, 0x3f7d70a4    # 0.99f

    sub-float v7, v1, v7

    cmpl-float v8, v7, v4

    const/high16 v9, 0x40000000    # 2.0f

    if-ltz v8, :cond_3

    mul-float/2addr v7, v6

    const/high16 v8, 0x43340000    # 180.0f

    div-float/2addr v7, v8

    const v8, 0x3c23d70a    # 0.01f

    div-float/2addr v7, v8

    add-float/2addr v1, v7

    if-nez p10, :cond_3

    div-float/2addr v7, v9

    sub-float/2addr v3, v7

    .line 5
    :cond_3
    iget v7, v0, Lv2/f;->o:F

    sub-float v7, v2, v7

    invoke-static {v7, v2, v3}, Lu1/h0;->K(FFF)F

    move-result v3

    .line 6
    iget v7, v0, Lv2/f;->o:F

    invoke-static {v4, v7, v1}, Lu1/h0;->K(FFF)F

    move-result v1

    move/from16 v7, p6

    int-to-float v7, v7

    .line 7
    iget v8, v0, Lv2/f;->i:F

    div-float/2addr v7, v8

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v7

    double-to-float v7, v7

    move/from16 v8, p7

    int-to-float v8, v8

    .line 8
    iget v10, v0, Lv2/f;->i:F

    div-float/2addr v8, v10

    float-to-double v10, v8

    invoke-static {v10, v11}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v10

    double-to-float v8, v10

    const/high16 v10, 0x43b40000    # 360.0f

    mul-float/2addr v1, v10

    sub-float/2addr v1, v7

    sub-float/2addr v1, v8

    mul-float/2addr v3, v10

    add-float/2addr v3, v7

    cmpg-float v7, v1, v4

    if-gtz v7, :cond_4

    goto/16 :goto_7

    .line 9
    :cond_4
    iget-object v7, v0, Lv2/r;->a:Lv2/l;

    iget-boolean v8, v0, Lv2/f;->n:Z

    .line 10
    invoke-virtual {v7, v8}, Lv2/l;->a(Z)Z

    move-result v8

    const/4 v11, 0x1

    if-eqz v8, :cond_5

    if-eqz p10, :cond_5

    cmpl-float v8, p8, v4

    if-lez v8, :cond_5

    move v8, v11

    goto :goto_1

    :cond_5
    const/4 v8, 0x0

    .line 11
    :goto_1
    invoke-virtual {v5, v11}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    move/from16 v12, p5

    .line 12
    invoke-virtual {v5, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    iget v12, v0, Lv2/f;->f:F

    invoke-virtual {v5, v12}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 14
    iget v12, v0, Lv2/f;->g:F

    mul-float/2addr v12, v9

    mul-float v13, v6, v9

    cmpg-float v14, v1, v13

    .line 15
    iget-object v15, v0, Lv2/r;->d:Landroid/graphics/PathMeasure;

    const/high16 v16, 0x42b40000    # 90.0f

    if-gez v14, :cond_9

    div-float/2addr v1, v13

    mul-float/2addr v6, v1

    add-float/2addr v6, v3

    .line 16
    new-instance v2, Lv2/q;

    invoke-direct {v2}, Lv2/q;-><init>()V

    if-nez v8, :cond_6

    add-float v6, v6, v16

    .line 17
    invoke-virtual {v2, v6}, Lv2/q;->c(F)V

    .line 18
    iget v3, v0, Lv2/f;->i:F

    neg-float v3, v3

    invoke-virtual {v2, v3}, Lv2/q;->a(F)V

    goto :goto_2

    :cond_6
    div-float/2addr v6, v10

    .line 19
    invoke-virtual {v15}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v3

    mul-float/2addr v3, v6

    div-float/2addr v3, v9

    .line 20
    iget v4, v0, Lv2/f;->h:F

    mul-float v4, v4, p8

    .line 21
    iget v6, v0, Lv2/f;->i:F

    iget v7, v0, Lv2/f;->m:F

    cmpl-float v7, v6, v7

    if-nez v7, :cond_7

    iget v7, v0, Lv2/f;->k:F

    cmpl-float v7, v4, v7

    if-eqz v7, :cond_8

    .line 22
    :cond_7
    iput v4, v0, Lv2/f;->k:F

    .line 23
    iput v6, v0, Lv2/f;->m:F

    .line 24
    invoke-virtual {v0}, Lv2/f;->a()V

    .line 25
    :cond_8
    iget-object v4, v2, Lv2/q;->a:[F

    iget-object v6, v2, Lv2/q;->b:[F

    invoke-virtual {v15, v3, v4, v6}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 26
    :goto_2
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 27
    iget v3, v0, Lv2/f;->f:F

    move-object/from16 p4, p1

    move-object/from16 p3, v0

    move/from16 p9, v1

    move-object/from16 p6, v2

    move/from16 p8, v3

    move-object/from16 p5, v5

    move/from16 p7, v12

    invoke-virtual/range {p3 .. p9}, Lv2/f;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lv2/q;FFF)V

    return-void

    .line 28
    :cond_9
    sget-object v14, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v5, v14}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 29
    iget-boolean v14, v7, Lv2/l;->d:Z

    const/high16 v17, 0x3f000000    # 0.5f

    if-eqz v14, :cond_a

    .line 30
    iget v14, v7, Lv2/l;->c:F

    cmpl-float v14, v14, v17

    if-nez v14, :cond_a

    .line 31
    sget-object v14, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_3

    :cond_a
    sget-object v14, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    :goto_3
    invoke-virtual {v5, v14}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    add-float/2addr v3, v6

    sub-float/2addr v1, v13

    .line 32
    iget-object v6, v0, Lv2/f;->q:Landroid/util/Pair;

    iget-object v13, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v13, Lv2/q;

    invoke-virtual {v13}, Lv2/q;->b()V

    .line 33
    iget-object v13, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v13, Lv2/q;

    invoke-virtual {v13}, Lv2/q;->b()V

    if-nez v8, :cond_b

    .line 34
    iget-object v2, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lv2/q;

    add-float v8, v3, v16

    invoke-virtual {v2, v8}, Lv2/q;->c(F)V

    .line 35
    iget-object v2, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lv2/q;

    iget v8, v0, Lv2/f;->i:F

    neg-float v8, v8

    invoke-virtual {v2, v8}, Lv2/q;->a(F)V

    .line 36
    iget-object v2, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lv2/q;

    add-float v8, v3, v1

    add-float v8, v8, v16

    invoke-virtual {v2, v8}, Lv2/q;->c(F)V

    .line 37
    iget-object v2, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lv2/q;

    iget v8, v0, Lv2/f;->i:F

    neg-float v8, v8

    invoke-virtual {v2, v8}, Lv2/q;->a(F)V

    .line 38
    iget v2, v0, Lv2/f;->i:F

    neg-float v8, v2

    iget-object v9, v0, Lv2/f;->p:Landroid/graphics/RectF;

    invoke-virtual {v9, v8, v8, v2, v2}, Landroid/graphics/RectF;->set(FFFF)V

    const/4 v2, 0x0

    move-object/from16 p3, p1

    move/from16 p6, v1

    move/from16 p7, v2

    move/from16 p5, v3

    move-object/from16 p8, v5

    move-object/from16 p4, v9

    .line 39
    invoke-virtual/range {p3 .. p8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    move-object/from16 v1, p1

    goto/16 :goto_6

    :cond_b
    div-float/2addr v3, v10

    div-float/2addr v1, v10

    .line 40
    iget v8, v0, Lv2/f;->h:F

    mul-float v8, v8, p8

    .line 41
    iget-boolean v13, v0, Lv2/f;->n:Z

    if-eqz v13, :cond_c

    iget v13, v7, Lv2/l;->j:I

    goto :goto_4

    :cond_c
    iget v13, v7, Lv2/l;->k:I

    .line 42
    :goto_4
    iget v14, v0, Lv2/f;->i:F

    move/from16 p3, v9

    iget v9, v0, Lv2/f;->m:F

    cmpl-float v9, v14, v9

    if-nez v9, :cond_d

    iget v9, v0, Lv2/f;->k:F

    cmpl-float v9, v8, v9

    if-nez v9, :cond_d

    iget v9, v0, Lv2/f;->l:I

    if-eq v13, v9, :cond_e

    .line 43
    :cond_d
    iput v8, v0, Lv2/f;->k:F

    .line 44
    iput v13, v0, Lv2/f;->l:I

    .line 45
    iput v14, v0, Lv2/f;->m:F

    .line 46
    invoke-virtual {v0}, Lv2/f;->a()V

    .line 47
    :cond_e
    iget-object v8, v0, Lv2/r;->c:Landroid/graphics/Path;

    invoke-virtual {v8}, Landroid/graphics/Path;->rewind()V

    .line 48
    invoke-static {v1, v4, v2}, Lu1/h0;->i(FFF)F

    move-result v1

    .line 49
    iget-boolean v9, v0, Lv2/f;->n:Z

    invoke-virtual {v7, v9}, Lv2/l;->a(Z)Z

    move-result v9

    if-eqz v9, :cond_f

    .line 50
    iget v9, v0, Lv2/f;->i:F

    float-to-double v13, v9

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    mul-double v13, v13, v18

    iget v9, v0, Lv2/f;->j:F

    move/from16 v16, v2

    move/from16 p4, v3

    float-to-double v2, v9

    div-double/2addr v13, v2

    double-to-float v2, v13

    div-float v2, p9, v2

    add-float v3, p4, v2

    mul-float/2addr v2, v10

    sub-float v2, v4, v2

    goto :goto_5

    :cond_f
    move/from16 v16, v2

    move/from16 p4, v3

    move v2, v4

    :goto_5
    rem-float v3, v3, v16

    .line 51
    invoke-virtual {v15}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v9

    mul-float/2addr v9, v3

    div-float v9, v9, p3

    add-float/2addr v3, v1

    .line 52
    invoke-virtual {v15}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v1

    mul-float/2addr v1, v3

    div-float v1, v1, p3

    .line 53
    invoke-virtual {v15, v9, v1, v8, v11}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 54
    iget-object v3, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lv2/q;

    .line 55
    invoke-virtual {v3}, Lv2/q;->b()V

    .line 56
    iget-object v10, v3, Lv2/q;->a:[F

    iget-object v11, v3, Lv2/q;->b:[F

    invoke-virtual {v15, v9, v10, v11}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 57
    iget-object v9, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Lv2/q;

    .line 58
    invoke-virtual {v9}, Lv2/q;->b()V

    .line 59
    iget-object v10, v9, Lv2/q;->a:[F

    iget-object v11, v9, Lv2/q;->b:[F

    invoke-virtual {v15, v1, v10, v11}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 60
    iget-object v1, v0, Lv2/r;->e:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 61
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 62
    invoke-virtual {v3, v2}, Lv2/q;->c(F)V

    .line 63
    invoke-virtual {v9, v2}, Lv2/q;->c(F)V

    .line 64
    invoke-virtual {v8, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    move-object/from16 v1, p1

    .line 65
    invoke-virtual {v1, v8, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 66
    :goto_6
    iget-boolean v2, v7, Lv2/l;->d:Z

    if-eqz v2, :cond_10

    .line 67
    iget v2, v7, Lv2/l;->c:F

    cmpl-float v2, v2, v17

    if-nez v2, :cond_10

    return-void

    .line 68
    :cond_10
    iget v2, v0, Lv2/f;->g:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_11

    .line 69
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 70
    iget-object v2, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lv2/q;

    iget v3, v0, Lv2/f;->f:F

    const/high16 v4, 0x3f800000    # 1.0f

    move-object/from16 p3, v0

    move-object/from16 p4, v1

    move-object/from16 p6, v2

    move/from16 p8, v3

    move/from16 p9, v4

    move-object/from16 p5, v5

    move/from16 p7, v12

    .line 71
    invoke-virtual/range {p3 .. p9}, Lv2/f;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lv2/q;FFF)V

    .line 72
    iget-object v1, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lv2/q;

    iget v2, v0, Lv2/f;->f:F

    const/high16 v3, 0x3f800000    # 1.0f

    move-object/from16 p4, p1

    move-object/from16 p5, p2

    move-object/from16 p6, v1

    move/from16 p8, v2

    move/from16 p9, v3

    .line 73
    invoke-virtual/range {p3 .. p9}, Lv2/f;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lv2/q;FFF)V

    :cond_11
    :goto_7
    return-void
.end method

.method public final d(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lv2/q;FFF)V
    .locals 5

    .line 1
    iget v0, p0, Lv2/f;->f:F

    .line 2
    .line 3
    invoke-static {p5, v0}, Ljava/lang/Math;->min(FF)F

    .line 4
    .line 5
    .line 6
    move-result p5

    .line 7
    iget v0, p0, Lv2/f;->g:F

    .line 8
    .line 9
    mul-float/2addr v0, p5

    .line 10
    iget v1, p0, Lv2/f;->f:F

    .line 11
    .line 12
    div-float/2addr v0, v1

    .line 13
    const/high16 v1, 0x40000000    # 2.0f

    .line 14
    .line 15
    div-float v2, p4, v1

    .line 16
    .line 17
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    new-instance v3, Landroid/graphics/RectF;

    .line 22
    .line 23
    neg-float p4, p4

    .line 24
    div-float/2addr p4, v1

    .line 25
    neg-float v4, p5

    .line 26
    div-float/2addr v4, v1

    .line 27
    div-float/2addr p5, v1

    .line 28
    invoke-direct {v3, p4, v4, v2, p5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 32
    .line 33
    .line 34
    iget-object p4, p3, Lv2/q;->a:[F

    .line 35
    .line 36
    const/4 p5, 0x0

    .line 37
    aget v1, p4, p5

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    aget p4, p4, v2

    .line 41
    .line 42
    invoke-virtual {p1, v1, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 43
    .line 44
    .line 45
    iget-object p3, p3, Lv2/q;->b:[F

    .line 46
    .line 47
    aget p4, p3, v2

    .line 48
    .line 49
    float-to-double v1, p4

    .line 50
    aget p3, p3, p5

    .line 51
    .line 52
    float-to-double p3, p3

    .line 53
    invoke-static {v1, v2, p3, p4}, Ljava/lang/Math;->atan2(DD)D

    .line 54
    .line 55
    .line 56
    move-result-wide p3

    .line 57
    invoke-static {p3, p4}, Ljava/lang/Math;->toDegrees(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide p3

    .line 61
    double-to-float p3, p3

    .line 62
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->rotate(F)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p6, p6}, Landroid/graphics/Canvas;->scale(FF)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v3, v0, v0, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lv2/p;I)V
    .locals 13

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    iget v1, v0, Lv2/p;->c:I

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    invoke-static {v1, v2}, Le4/a;->k(II)I

    .line 8
    .line 9
    .line 10
    move-result v7

    .line 11
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 12
    .line 13
    .line 14
    iget v1, v0, Lv2/p;->f:F

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->rotate(F)V

    .line 17
    .line 18
    .line 19
    iget-boolean v1, v0, Lv2/p;->g:Z

    .line 20
    .line 21
    iput-boolean v1, p0, Lv2/f;->n:Z

    .line 22
    .line 23
    iget v5, v0, Lv2/p;->a:F

    .line 24
    .line 25
    iget v6, v0, Lv2/p;->b:F

    .line 26
    .line 27
    iget v10, v0, Lv2/p;->d:F

    .line 28
    .line 29
    iget v11, v0, Lv2/p;->e:F

    .line 30
    .line 31
    const/4 v12, 0x1

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    move-object v2, p0

    .line 35
    move-object v3, p1

    .line 36
    move-object v4, p2

    .line 37
    invoke-virtual/range {v2 .. v12}, Lv2/f;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final f(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V
    .locals 11

    .line 1
    invoke-static/range {p5 .. p6}, Le4/a;->k(II)I

    .line 2
    .line 3
    .line 4
    move-result v5

    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lv2/f;->n:Z

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v10, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    move/from16 v7, p7

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    move-object v2, p2

    .line 16
    move v3, p3

    .line 17
    move v4, p4

    .line 18
    move/from16 v6, p7

    .line 19
    .line 20
    invoke-virtual/range {v0 .. v10}, Lv2/f;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIIIFFZ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final g()I
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/r;->a:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->r:I

    .line 4
    .line 5
    iget v0, v0, Lv2/l;->s:I

    .line 6
    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
.end method
