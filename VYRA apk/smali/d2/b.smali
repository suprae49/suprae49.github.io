.class public final Ld2/b;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lcom/google/android/material/badge/BadgeState$State;

.field public final b:Lcom/google/android/material/badge/BadgeState$State;

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:F

.field public final i:I

.field public final j:I

.field public final k:I

.field public l:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/material/badge/BadgeState$State;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lcom/google/android/material/badge/BadgeState$State;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const/16 v3, 0xff

    .line 14
    .line 15
    iput v3, v2, Lcom/google/android/material/badge/BadgeState$State;->n:I

    .line 16
    .line 17
    const/4 v3, -0x2

    .line 18
    iput v3, v2, Lcom/google/android/material/badge/BadgeState$State;->p:I

    .line 19
    .line 20
    iput v3, v2, Lcom/google/android/material/badge/BadgeState$State;->q:I

    .line 21
    .line 22
    iput v3, v2, Lcom/google/android/material/badge/BadgeState$State;->r:I

    .line 23
    .line 24
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    iput-object v3, v2, Lcom/google/android/material/badge/BadgeState$State;->y:Ljava/lang/Boolean;

    .line 27
    .line 28
    iput-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 29
    .line 30
    iget v2, v0, Lcom/google/android/material/badge/BadgeState$State;->f:I

    .line 31
    .line 32
    const/4 v8, 0x2

    .line 33
    const/4 v9, 0x1

    .line 34
    const/4 v10, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    const-string v3, "badge"

    .line 38
    .line 39
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    :cond_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eq v5, v8, :cond_1

    .line 52
    .line 53
    if-ne v5, v9, :cond_0

    .line 54
    .line 55
    :cond_1
    if-ne v5, v8, :cond_3

    .line 56
    .line 57
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-static {v5, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    invoke-static {v4}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 68
    .line 69
    .line 70
    move-result-object v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    invoke-interface {v2}, Landroid/util/AttributeSet;->getStyleAttribute()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    move/from16 v18, v3

    .line 76
    .line 77
    move-object v3, v2

    .line 78
    move/from16 v2, v18

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catch_0
    move-exception v0

    .line 82
    goto :goto_0

    .line 83
    :catch_1
    move-exception v0

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    :try_start_1
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 86
    .line 87
    new-instance v4, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v5, "Must have a <"

    .line 93
    .line 94
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v3, "> start tag"

    .line 101
    .line 102
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-direct {v0, v3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_3
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 114
    .line 115
    const-string v3, "No start tag found"

    .line 116
    .line 117
    invoke-direct {v0, v3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 121
    :goto_0
    new-instance v3, Landroid/content/res/Resources$NotFoundException;

    .line 122
    .line 123
    new-instance v4, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v5, "Can\'t load badge resource ID #0x"

    .line 126
    .line 127
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-direct {v3, v2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 145
    .line 146
    .line 147
    throw v3

    .line 148
    :cond_4
    const/4 v2, 0x0

    .line 149
    move-object v3, v2

    .line 150
    move v2, v10

    .line 151
    :goto_1
    if-nez v2, :cond_5

    .line 152
    .line 153
    const v2, 0x7f1205ad

    .line 154
    .line 155
    .line 156
    :cond_5
    move v6, v2

    .line 157
    sget-object v4, La2/a;->c:[I

    .line 158
    .line 159
    new-array v7, v10, [I

    .line 160
    .line 161
    const v5, 0x7f040061

    .line 162
    .line 163
    .line 164
    move-object/from16 v2, p1

    .line 165
    .line 166
    invoke-static/range {v2 .. v7}, Lr2/a0;->f(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    const/4 v5, 0x5

    .line 175
    const/4 v6, -0x1

    .line 176
    invoke-virtual {v3, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    int-to-float v7, v7

    .line 181
    iput v7, v1, Ld2/b;->c:F

    .line 182
    .line 183
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    const v11, 0x7f07039d

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    iput v7, v1, Ld2/b;->i:I

    .line 195
    .line 196
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    const v11, 0x7f0703a0

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    iput v7, v1, Ld2/b;->j:I

    .line 208
    .line 209
    const/16 v7, 0xf

    .line 210
    .line 211
    invoke-virtual {v3, v7, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    int-to-float v7, v7

    .line 216
    iput v7, v1, Ld2/b;->d:F

    .line 217
    .line 218
    const/16 v7, 0xd

    .line 219
    .line 220
    const v11, 0x7f0700cc

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4, v11}, Landroid/content/res/Resources;->getDimension(I)F

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    invoke-virtual {v3, v7, v12}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    iput v7, v1, Ld2/b;->e:F

    .line 232
    .line 233
    const/16 v7, 0x12

    .line 234
    .line 235
    const v12, 0x7f0700d0

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4, v12}, Landroid/content/res/Resources;->getDimension(I)F

    .line 239
    .line 240
    .line 241
    move-result v13

    .line 242
    invoke-virtual {v3, v7, v13}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    iput v7, v1, Ld2/b;->g:F

    .line 247
    .line 248
    invoke-virtual {v4, v11}, Landroid/content/res/Resources;->getDimension(I)F

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    const/4 v11, 0x4

    .line 253
    invoke-virtual {v3, v11, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    iput v7, v1, Ld2/b;->f:F

    .line 258
    .line 259
    invoke-virtual {v4, v12}, Landroid/content/res/Resources;->getDimension(I)F

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    const/16 v12, 0xe

    .line 264
    .line 265
    invoke-virtual {v3, v12, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    iput v7, v1, Ld2/b;->h:F

    .line 270
    .line 271
    const/16 v7, 0x19

    .line 272
    .line 273
    invoke-virtual {v3, v7, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    iput v7, v1, Ld2/b;->k:I

    .line 278
    .line 279
    invoke-virtual {v3, v8, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    iput v7, v1, Ld2/b;->l:I

    .line 284
    .line 285
    iget-object v7, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 286
    .line 287
    iget v13, v0, Lcom/google/android/material/badge/BadgeState$State;->n:I

    .line 288
    .line 289
    const/4 v14, -0x2

    .line 290
    if-ne v13, v14, :cond_6

    .line 291
    .line 292
    const/16 v13, 0xff

    .line 293
    .line 294
    :cond_6
    iput v13, v7, Lcom/google/android/material/badge/BadgeState$State;->n:I

    .line 295
    .line 296
    iget v13, v0, Lcom/google/android/material/badge/BadgeState$State;->p:I

    .line 297
    .line 298
    if-eq v13, v14, :cond_7

    .line 299
    .line 300
    iput v13, v7, Lcom/google/android/material/badge/BadgeState$State;->p:I

    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_7
    const/16 v7, 0x18

    .line 304
    .line 305
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    iget-object v15, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 310
    .line 311
    if-eqz v13, :cond_8

    .line 312
    .line 313
    invoke-virtual {v3, v7, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    iput v6, v15, Lcom/google/android/material/badge/BadgeState$State;->p:I

    .line 318
    .line 319
    goto :goto_2

    .line 320
    :cond_8
    iput v6, v15, Lcom/google/android/material/badge/BadgeState$State;->p:I

    .line 321
    .line 322
    :goto_2
    iget-object v6, v0, Lcom/google/android/material/badge/BadgeState$State;->o:Ljava/lang/String;

    .line 323
    .line 324
    const/16 v7, 0x8

    .line 325
    .line 326
    if-eqz v6, :cond_9

    .line 327
    .line 328
    iget-object v13, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 329
    .line 330
    iput-object v6, v13, Lcom/google/android/material/badge/BadgeState$State;->o:Ljava/lang/String;

    .line 331
    .line 332
    goto :goto_3

    .line 333
    :cond_9
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    if-eqz v6, :cond_a

    .line 338
    .line 339
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 340
    .line 341
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v13

    .line 345
    iput-object v13, v6, Lcom/google/android/material/badge/BadgeState$State;->o:Ljava/lang/String;

    .line 346
    .line 347
    :cond_a
    :goto_3
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 348
    .line 349
    iget-object v13, v0, Lcom/google/android/material/badge/BadgeState$State;->t:Ljava/lang/CharSequence;

    .line 350
    .line 351
    iput-object v13, v6, Lcom/google/android/material/badge/BadgeState$State;->t:Ljava/lang/CharSequence;

    .line 352
    .line 353
    iget-object v13, v0, Lcom/google/android/material/badge/BadgeState$State;->u:Ljava/lang/CharSequence;

    .line 354
    .line 355
    if-nez v13, :cond_b

    .line 356
    .line 357
    const v13, 0x7f1100a3

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v13

    .line 364
    :cond_b
    iput-object v13, v6, Lcom/google/android/material/badge/BadgeState$State;->u:Ljava/lang/CharSequence;

    .line 365
    .line 366
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 367
    .line 368
    iget v13, v0, Lcom/google/android/material/badge/BadgeState$State;->v:I

    .line 369
    .line 370
    if-nez v13, :cond_c

    .line 371
    .line 372
    const/high16 v13, 0x7f100000

    .line 373
    .line 374
    :cond_c
    iput v13, v6, Lcom/google/android/material/badge/BadgeState$State;->v:I

    .line 375
    .line 376
    iget v13, v0, Lcom/google/android/material/badge/BadgeState$State;->w:I

    .line 377
    .line 378
    if-nez v13, :cond_d

    .line 379
    .line 380
    const v13, 0x7f1100b4

    .line 381
    .line 382
    .line 383
    :cond_d
    iput v13, v6, Lcom/google/android/material/badge/BadgeState$State;->w:I

    .line 384
    .line 385
    iget-object v13, v0, Lcom/google/android/material/badge/BadgeState$State;->y:Ljava/lang/Boolean;

    .line 386
    .line 387
    if-eqz v13, :cond_f

    .line 388
    .line 389
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 390
    .line 391
    .line 392
    move-result v13

    .line 393
    if-eqz v13, :cond_e

    .line 394
    .line 395
    goto :goto_4

    .line 396
    :cond_e
    move v13, v10

    .line 397
    goto :goto_5

    .line 398
    :cond_f
    :goto_4
    move v13, v9

    .line 399
    :goto_5
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 400
    .line 401
    .line 402
    move-result-object v13

    .line 403
    iput-object v13, v6, Lcom/google/android/material/badge/BadgeState$State;->y:Ljava/lang/Boolean;

    .line 404
    .line 405
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 406
    .line 407
    iget v13, v0, Lcom/google/android/material/badge/BadgeState$State;->q:I

    .line 408
    .line 409
    if-ne v13, v14, :cond_10

    .line 410
    .line 411
    const/16 v13, 0x16

    .line 412
    .line 413
    invoke-virtual {v3, v13, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    :cond_10
    iput v13, v6, Lcom/google/android/material/badge/BadgeState$State;->q:I

    .line 418
    .line 419
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 420
    .line 421
    iget v13, v0, Lcom/google/android/material/badge/BadgeState$State;->r:I

    .line 422
    .line 423
    if-ne v13, v14, :cond_11

    .line 424
    .line 425
    const/16 v13, 0x17

    .line 426
    .line 427
    invoke-virtual {v3, v13, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 428
    .line 429
    .line 430
    move-result v13

    .line 431
    :cond_11
    iput v13, v6, Lcom/google/android/material/badge/BadgeState$State;->r:I

    .line 432
    .line 433
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 434
    .line 435
    iget-object v13, v0, Lcom/google/android/material/badge/BadgeState$State;->j:Ljava/lang/Integer;

    .line 436
    .line 437
    const v14, 0x7f1201cf

    .line 438
    .line 439
    .line 440
    const/4 v15, 0x6

    .line 441
    if-nez v13, :cond_12

    .line 442
    .line 443
    invoke-virtual {v3, v15, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 444
    .line 445
    .line 446
    move-result v13

    .line 447
    goto :goto_6

    .line 448
    :cond_12
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 449
    .line 450
    .line 451
    move-result v13

    .line 452
    :goto_6
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 453
    .line 454
    .line 455
    move-result-object v13

    .line 456
    iput-object v13, v6, Lcom/google/android/material/badge/BadgeState$State;->j:Ljava/lang/Integer;

    .line 457
    .line 458
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 459
    .line 460
    iget-object v13, v0, Lcom/google/android/material/badge/BadgeState$State;->k:Ljava/lang/Integer;

    .line 461
    .line 462
    const/4 v7, 0x7

    .line 463
    if-nez v13, :cond_13

    .line 464
    .line 465
    invoke-virtual {v3, v7, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 466
    .line 467
    .line 468
    move-result v13

    .line 469
    goto :goto_7

    .line 470
    :cond_13
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 471
    .line 472
    .line 473
    move-result v13

    .line 474
    :goto_7
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object v13

    .line 478
    iput-object v13, v6, Lcom/google/android/material/badge/BadgeState$State;->k:Ljava/lang/Integer;

    .line 479
    .line 480
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 481
    .line 482
    iget-object v13, v0, Lcom/google/android/material/badge/BadgeState$State;->l:Ljava/lang/Integer;

    .line 483
    .line 484
    if-nez v13, :cond_14

    .line 485
    .line 486
    const/16 v13, 0x10

    .line 487
    .line 488
    invoke-virtual {v3, v13, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 489
    .line 490
    .line 491
    move-result v13

    .line 492
    goto :goto_8

    .line 493
    :cond_14
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 494
    .line 495
    .line 496
    move-result v13

    .line 497
    :goto_8
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 498
    .line 499
    .line 500
    move-result-object v13

    .line 501
    iput-object v13, v6, Lcom/google/android/material/badge/BadgeState$State;->l:Ljava/lang/Integer;

    .line 502
    .line 503
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 504
    .line 505
    iget-object v13, v0, Lcom/google/android/material/badge/BadgeState$State;->m:Ljava/lang/Integer;

    .line 506
    .line 507
    if-nez v13, :cond_15

    .line 508
    .line 509
    const/16 v13, 0x11

    .line 510
    .line 511
    invoke-virtual {v3, v13, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 512
    .line 513
    .line 514
    move-result v13

    .line 515
    goto :goto_9

    .line 516
    :cond_15
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 517
    .line 518
    .line 519
    move-result v13

    .line 520
    :goto_9
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 521
    .line 522
    .line 523
    move-result-object v13

    .line 524
    iput-object v13, v6, Lcom/google/android/material/badge/BadgeState$State;->m:Ljava/lang/Integer;

    .line 525
    .line 526
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 527
    .line 528
    iget-object v13, v0, Lcom/google/android/material/badge/BadgeState$State;->g:Ljava/lang/Integer;

    .line 529
    .line 530
    if-nez v13, :cond_16

    .line 531
    .line 532
    invoke-static {v2, v3, v9}, Lt2/i;->h(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 533
    .line 534
    .line 535
    move-result-object v13

    .line 536
    invoke-virtual {v13}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 537
    .line 538
    .line 539
    move-result v13

    .line 540
    goto :goto_a

    .line 541
    :cond_16
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 542
    .line 543
    .line 544
    move-result v13

    .line 545
    :goto_a
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 546
    .line 547
    .line 548
    move-result-object v13

    .line 549
    iput-object v13, v6, Lcom/google/android/material/badge/BadgeState$State;->g:Ljava/lang/Integer;

    .line 550
    .line 551
    iget-object v6, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 552
    .line 553
    iget-object v13, v0, Lcom/google/android/material/badge/BadgeState$State;->i:Ljava/lang/Integer;

    .line 554
    .line 555
    const/16 v14, 0x9

    .line 556
    .line 557
    if-nez v13, :cond_17

    .line 558
    .line 559
    const v13, 0x7f1202ad

    .line 560
    .line 561
    .line 562
    invoke-virtual {v3, v14, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 563
    .line 564
    .line 565
    move-result v13

    .line 566
    goto :goto_b

    .line 567
    :cond_17
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 568
    .line 569
    .line 570
    move-result v13

    .line 571
    :goto_b
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 572
    .line 573
    .line 574
    move-result-object v13

    .line 575
    iput-object v13, v6, Lcom/google/android/material/badge/BadgeState$State;->i:Ljava/lang/Integer;

    .line 576
    .line 577
    iget-object v6, v0, Lcom/google/android/material/badge/BadgeState$State;->h:Ljava/lang/Integer;

    .line 578
    .line 579
    const/16 v13, 0xc

    .line 580
    .line 581
    const/4 v14, 0x3

    .line 582
    if-eqz v6, :cond_18

    .line 583
    .line 584
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 585
    .line 586
    iput-object v6, v2, Lcom/google/android/material/badge/BadgeState$State;->h:Ljava/lang/Integer;

    .line 587
    .line 588
    goto/16 :goto_d

    .line 589
    .line 590
    :cond_18
    const/16 v6, 0xa

    .line 591
    .line 592
    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 593
    .line 594
    .line 595
    move-result v16

    .line 596
    iget-object v7, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 597
    .line 598
    if-eqz v16, :cond_19

    .line 599
    .line 600
    invoke-static {v2, v3, v6}, Lt2/i;->h(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    iput-object v2, v7, Lcom/google/android/material/badge/BadgeState$State;->h:Ljava/lang/Integer;

    .line 613
    .line 614
    goto :goto_d

    .line 615
    :cond_19
    iget-object v7, v7, Lcom/google/android/material/badge/BadgeState$State;->i:Ljava/lang/Integer;

    .line 616
    .line 617
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 618
    .line 619
    .line 620
    move-result v7

    .line 621
    sget-object v6, Ld/a;->y:[I

    .line 622
    .line 623
    invoke-virtual {v2, v7, v6}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 624
    .line 625
    .line 626
    move-result-object v6

    .line 627
    const/4 v15, 0x0

    .line 628
    invoke-virtual {v6, v10, v15}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 629
    .line 630
    .line 631
    invoke-static {v2, v6, v14}, Lt2/i;->h(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 632
    .line 633
    .line 634
    move-result-object v17

    .line 635
    invoke-static {v2, v6, v11}, Lt2/i;->h(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 636
    .line 637
    .line 638
    invoke-static {v2, v6, v5}, Lt2/i;->h(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v6, v8, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 642
    .line 643
    .line 644
    invoke-virtual {v6, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 645
    .line 646
    .line 647
    invoke-virtual {v6, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 648
    .line 649
    .line 650
    move-result v5

    .line 651
    if-eqz v5, :cond_1a

    .line 652
    .line 653
    move v5, v13

    .line 654
    goto :goto_c

    .line 655
    :cond_1a
    const/16 v5, 0xa

    .line 656
    .line 657
    :goto_c
    invoke-virtual {v6, v5, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 658
    .line 659
    .line 660
    invoke-virtual {v6, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v6, v12, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 664
    .line 665
    .line 666
    const/4 v5, 0x6

    .line 667
    invoke-static {v2, v6, v5}, Lt2/i;->h(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 668
    .line 669
    .line 670
    const/4 v5, 0x7

    .line 671
    invoke-virtual {v6, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 672
    .line 673
    .line 674
    const/16 v5, 0x8

    .line 675
    .line 676
    invoke-virtual {v6, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 677
    .line 678
    .line 679
    const/16 v5, 0x9

    .line 680
    .line 681
    invoke-virtual {v6, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 682
    .line 683
    .line 684
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 685
    .line 686
    .line 687
    sget-object v5, La2/a;->C:[I

    .line 688
    .line 689
    invoke-virtual {v2, v7, v5}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 694
    .line 695
    .line 696
    invoke-virtual {v2, v10, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 697
    .line 698
    .line 699
    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 700
    .line 701
    .line 702
    move-result v5

    .line 703
    if-eqz v5, :cond_1b

    .line 704
    .line 705
    move v9, v14

    .line 706
    :cond_1b
    invoke-virtual {v2, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 710
    .line 711
    .line 712
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 713
    .line 714
    invoke-virtual/range {v17 .. v17}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    iput-object v5, v2, Lcom/google/android/material/badge/BadgeState$State;->h:Ljava/lang/Integer;

    .line 723
    .line 724
    :goto_d
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 725
    .line 726
    iget-object v5, v0, Lcom/google/android/material/badge/BadgeState$State;->x:Ljava/lang/Integer;

    .line 727
    .line 728
    if-nez v5, :cond_1c

    .line 729
    .line 730
    const v5, 0x800035

    .line 731
    .line 732
    .line 733
    invoke-virtual {v3, v14, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    goto :goto_e

    .line 738
    :cond_1c
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 739
    .line 740
    .line 741
    move-result v5

    .line 742
    :goto_e
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 743
    .line 744
    .line 745
    move-result-object v5

    .line 746
    iput-object v5, v2, Lcom/google/android/material/badge/BadgeState$State;->x:Ljava/lang/Integer;

    .line 747
    .line 748
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 749
    .line 750
    iget-object v5, v0, Lcom/google/android/material/badge/BadgeState$State;->z:Ljava/lang/Integer;

    .line 751
    .line 752
    if-nez v5, :cond_1d

    .line 753
    .line 754
    const v5, 0x7f07039e

    .line 755
    .line 756
    .line 757
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 758
    .line 759
    .line 760
    move-result v5

    .line 761
    invoke-virtual {v3, v13, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 762
    .line 763
    .line 764
    move-result v5

    .line 765
    goto :goto_f

    .line 766
    :cond_1d
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 767
    .line 768
    .line 769
    move-result v5

    .line 770
    :goto_f
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 771
    .line 772
    .line 773
    move-result-object v5

    .line 774
    iput-object v5, v2, Lcom/google/android/material/badge/BadgeState$State;->z:Ljava/lang/Integer;

    .line 775
    .line 776
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 777
    .line 778
    iget-object v5, v0, Lcom/google/android/material/badge/BadgeState$State;->A:Ljava/lang/Integer;

    .line 779
    .line 780
    if-nez v5, :cond_1e

    .line 781
    .line 782
    const v5, 0x7f0700d2

    .line 783
    .line 784
    .line 785
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 786
    .line 787
    .line 788
    move-result v4

    .line 789
    const/16 v5, 0xb

    .line 790
    .line 791
    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 792
    .line 793
    .line 794
    move-result v4

    .line 795
    goto :goto_10

    .line 796
    :cond_1e
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 797
    .line 798
    .line 799
    move-result v4

    .line 800
    :goto_10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 801
    .line 802
    .line 803
    move-result-object v4

    .line 804
    iput-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->A:Ljava/lang/Integer;

    .line 805
    .line 806
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 807
    .line 808
    iget-object v4, v0, Lcom/google/android/material/badge/BadgeState$State;->B:Ljava/lang/Integer;

    .line 809
    .line 810
    if-nez v4, :cond_1f

    .line 811
    .line 812
    const/16 v4, 0x13

    .line 813
    .line 814
    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 815
    .line 816
    .line 817
    move-result v4

    .line 818
    goto :goto_11

    .line 819
    :cond_1f
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 820
    .line 821
    .line 822
    move-result v4

    .line 823
    :goto_11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 824
    .line 825
    .line 826
    move-result-object v4

    .line 827
    iput-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->B:Ljava/lang/Integer;

    .line 828
    .line 829
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 830
    .line 831
    iget-object v4, v0, Lcom/google/android/material/badge/BadgeState$State;->C:Ljava/lang/Integer;

    .line 832
    .line 833
    if-nez v4, :cond_20

    .line 834
    .line 835
    const/16 v4, 0x1a

    .line 836
    .line 837
    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 838
    .line 839
    .line 840
    move-result v4

    .line 841
    goto :goto_12

    .line 842
    :cond_20
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 843
    .line 844
    .line 845
    move-result v4

    .line 846
    :goto_12
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    iput-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->C:Ljava/lang/Integer;

    .line 851
    .line 852
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 853
    .line 854
    iget-object v4, v0, Lcom/google/android/material/badge/BadgeState$State;->D:Ljava/lang/Integer;

    .line 855
    .line 856
    if-nez v4, :cond_21

    .line 857
    .line 858
    iget-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->B:Ljava/lang/Integer;

    .line 859
    .line 860
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 861
    .line 862
    .line 863
    move-result v4

    .line 864
    const/16 v5, 0x14

    .line 865
    .line 866
    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 867
    .line 868
    .line 869
    move-result v4

    .line 870
    goto :goto_13

    .line 871
    :cond_21
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 872
    .line 873
    .line 874
    move-result v4

    .line 875
    :goto_13
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    iput-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->D:Ljava/lang/Integer;

    .line 880
    .line 881
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 882
    .line 883
    iget-object v4, v0, Lcom/google/android/material/badge/BadgeState$State;->E:Ljava/lang/Integer;

    .line 884
    .line 885
    if-nez v4, :cond_22

    .line 886
    .line 887
    iget-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->C:Ljava/lang/Integer;

    .line 888
    .line 889
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 890
    .line 891
    .line 892
    move-result v4

    .line 893
    const/16 v5, 0x1b

    .line 894
    .line 895
    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 896
    .line 897
    .line 898
    move-result v4

    .line 899
    goto :goto_14

    .line 900
    :cond_22
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 901
    .line 902
    .line 903
    move-result v4

    .line 904
    :goto_14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 905
    .line 906
    .line 907
    move-result-object v4

    .line 908
    iput-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->E:Ljava/lang/Integer;

    .line 909
    .line 910
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 911
    .line 912
    iget-object v4, v0, Lcom/google/android/material/badge/BadgeState$State;->H:Ljava/lang/Integer;

    .line 913
    .line 914
    if-nez v4, :cond_23

    .line 915
    .line 916
    const/16 v4, 0x15

    .line 917
    .line 918
    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 919
    .line 920
    .line 921
    move-result v4

    .line 922
    goto :goto_15

    .line 923
    :cond_23
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 924
    .line 925
    .line 926
    move-result v4

    .line 927
    :goto_15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 928
    .line 929
    .line 930
    move-result-object v4

    .line 931
    iput-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->H:Ljava/lang/Integer;

    .line 932
    .line 933
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 934
    .line 935
    iget-object v4, v0, Lcom/google/android/material/badge/BadgeState$State;->F:Ljava/lang/Integer;

    .line 936
    .line 937
    if-nez v4, :cond_24

    .line 938
    .line 939
    move v4, v10

    .line 940
    goto :goto_16

    .line 941
    :cond_24
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 942
    .line 943
    .line 944
    move-result v4

    .line 945
    :goto_16
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 946
    .line 947
    .line 948
    move-result-object v4

    .line 949
    iput-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->F:Ljava/lang/Integer;

    .line 950
    .line 951
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 952
    .line 953
    iget-object v4, v0, Lcom/google/android/material/badge/BadgeState$State;->G:Ljava/lang/Integer;

    .line 954
    .line 955
    if-nez v4, :cond_25

    .line 956
    .line 957
    move v4, v10

    .line 958
    goto :goto_17

    .line 959
    :cond_25
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 960
    .line 961
    .line 962
    move-result v4

    .line 963
    :goto_17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    iput-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->G:Ljava/lang/Integer;

    .line 968
    .line 969
    iget-object v2, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 970
    .line 971
    iget-object v4, v0, Lcom/google/android/material/badge/BadgeState$State;->I:Ljava/lang/Boolean;

    .line 972
    .line 973
    if-nez v4, :cond_26

    .line 974
    .line 975
    invoke-virtual {v3, v10, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 976
    .line 977
    .line 978
    move-result v4

    .line 979
    goto :goto_18

    .line 980
    :cond_26
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 981
    .line 982
    .line 983
    move-result v4

    .line 984
    :goto_18
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 985
    .line 986
    .line 987
    move-result-object v4

    .line 988
    iput-object v4, v2, Lcom/google/android/material/badge/BadgeState$State;->I:Ljava/lang/Boolean;

    .line 989
    .line 990
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 991
    .line 992
    .line 993
    iget-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->s:Ljava/util/Locale;

    .line 994
    .line 995
    iget-object v3, v1, Ld2/b;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 996
    .line 997
    if-nez v2, :cond_27

    .line 998
    .line 999
    sget-object v2, Ljava/util/Locale$Category;->FORMAT:Ljava/util/Locale$Category;

    .line 1000
    .line 1001
    invoke-static {v2}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    iput-object v2, v3, Lcom/google/android/material/badge/BadgeState$State;->s:Ljava/util/Locale;

    .line 1006
    .line 1007
    goto :goto_19

    .line 1008
    :cond_27
    iput-object v2, v3, Lcom/google/android/material/badge/BadgeState$State;->s:Ljava/util/Locale;

    .line 1009
    .line 1010
    :goto_19
    iput-object v0, v1, Ld2/b;->a:Lcom/google/android/material/badge/BadgeState$State;

    .line 1011
    .line 1012
    return-void
.end method
