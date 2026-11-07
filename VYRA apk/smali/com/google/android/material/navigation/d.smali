.class public abstract Lcom/google/android/material/navigation/d;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final f:Lu2/g;

.field public final g:Lg2/b;

.field public final h:Lcom/google/android/material/navigation/b;

.field public i:Li/h;

.field public j:Lu2/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const v4, 0x7f040087

    .line 6
    .line 7
    .line 8
    const v5, 0x7f120475

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    invoke-static {v1, v2, v4, v5}, Lf3/a;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1, v2, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    .line 19
    .line 20
    new-instance v7, Lcom/google/android/material/navigation/b;

    .line 21
    .line 22
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    iput-boolean v8, v7, Lcom/google/android/material/navigation/b;->g:Z

    .line 27
    .line 28
    iput-object v7, v0, Lcom/google/android/material/navigation/d;->h:Lcom/google/android/material/navigation/b;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/16 v9, 0x11

    .line 35
    .line 36
    const/16 v10, 0xf

    .line 37
    .line 38
    filled-new-array {v9, v10}, [I

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    sget-object v3, La2/a;->G:[I

    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, Lr2/a0;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroidx/emoji2/text/t;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    new-instance v6, Lu2/g;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    invoke-virtual {v0}, Lcom/google/android/material/navigation/d;->getMaxItemCount()I

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    invoke-direct {v6, v1, v11, v12}, Lu2/g;-><init>(Landroid/content/Context;Ljava/lang/Class;I)V

    .line 59
    .line 60
    .line 61
    iput-object v6, v0, Lcom/google/android/material/navigation/d;->f:Lu2/g;

    .line 62
    .line 63
    new-instance v11, Lg2/b;

    .line 64
    .line 65
    invoke-direct {v11, v1}, Lg2/b;-><init>(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    iput-object v11, v0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    invoke-virtual {v11, v12}, Landroid/view/View;->setMinimumHeight(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/google/android/material/navigation/d;->getCollapsedMaxItemCount()I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    invoke-virtual {v11, v12}, Lu2/j;->setCollapsedMaxItemCount(I)V

    .line 82
    .line 83
    .line 84
    iput-object v11, v7, Lcom/google/android/material/navigation/b;->f:Lg2/b;

    .line 85
    .line 86
    const/4 v12, 0x1

    .line 87
    iput v12, v7, Lcom/google/android/material/navigation/b;->h:I

    .line 88
    .line 89
    invoke-virtual {v11, v7}, Lu2/j;->setPresenter(Lcom/google/android/material/navigation/b;)V

    .line 90
    .line 91
    .line 92
    iget-object v13, v6, Lj/m;->a:Landroid/content/Context;

    .line 93
    .line 94
    invoke-virtual {v6, v7, v13}, Lj/m;->b(Lj/y;Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    invoke-virtual {v7, v13, v6}, Lcom/google/android/material/navigation/b;->h(Landroid/content/Context;Lj/m;)V

    .line 102
    .line 103
    .line 104
    iget-object v6, v3, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v6, Landroid/content/res/TypedArray;

    .line 107
    .line 108
    const/16 v7, 0xb

    .line 109
    .line 110
    invoke-virtual {v6, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    if-eqz v13, :cond_0

    .line 115
    .line 116
    invoke-virtual {v3, v7}, Landroidx/emoji2/text/t;->h(I)Landroid/content/res/ColorStateList;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    invoke-virtual {v11, v13}, Lu2/j;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {v11}, Lu2/j;->c()Landroid/content/res/ColorStateList;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    invoke-virtual {v11, v13}, Lu2/j;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 129
    .line 130
    .line 131
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    const v14, 0x7f070417

    .line 136
    .line 137
    .line 138
    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    const/16 v14, 0xa

    .line 143
    .line 144
    invoke-virtual {v6, v14, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    invoke-virtual {v0, v13}, Lcom/google/android/material/navigation/d;->setItemIconSize(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-eqz v13, :cond_1

    .line 156
    .line 157
    invoke-virtual {v6, v9, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    invoke-virtual {v0, v9}, Lcom/google/android/material/navigation/d;->setItemTextAppearanceInactive(I)V

    .line 162
    .line 163
    .line 164
    :cond_1
    invoke-virtual {v6, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-eqz v9, :cond_2

    .line 169
    .line 170
    invoke-virtual {v6, v10, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    invoke-virtual {v0, v9}, Lcom/google/android/material/navigation/d;->setItemTextAppearanceActive(I)V

    .line 175
    .line 176
    .line 177
    :cond_2
    const/4 v9, 0x4

    .line 178
    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    if-eqz v10, :cond_3

    .line 183
    .line 184
    invoke-virtual {v6, v9, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 185
    .line 186
    .line 187
    move-result v10

    .line 188
    invoke-virtual {v0, v10}, Lcom/google/android/material/navigation/d;->setHorizontalItemTextAppearanceInactive(I)V

    .line 189
    .line 190
    .line 191
    :cond_3
    const/4 v10, 0x3

    .line 192
    invoke-virtual {v6, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 193
    .line 194
    .line 195
    move-result v13

    .line 196
    if-eqz v13, :cond_4

    .line 197
    .line 198
    invoke-virtual {v6, v10, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 199
    .line 200
    .line 201
    move-result v13

    .line 202
    invoke-virtual {v0, v13}, Lcom/google/android/material/navigation/d;->setHorizontalItemTextAppearanceActive(I)V

    .line 203
    .line 204
    .line 205
    :cond_4
    const/16 v13, 0x10

    .line 206
    .line 207
    invoke-virtual {v6, v13, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    invoke-virtual {v0, v13}, Lcom/google/android/material/navigation/d;->setItemTextAppearanceActiveBoldEnabled(Z)V

    .line 212
    .line 213
    .line 214
    const/16 v13, 0x12

    .line 215
    .line 216
    invoke-virtual {v6, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 217
    .line 218
    .line 219
    move-result v15

    .line 220
    if-eqz v15, :cond_5

    .line 221
    .line 222
    invoke-virtual {v3, v13}, Landroidx/emoji2/text/t;->h(I)Landroid/content/res/ColorStateList;

    .line 223
    .line 224
    .line 225
    move-result-object v13

    .line 226
    invoke-virtual {v0, v13}, Lcom/google/android/material/navigation/d;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 227
    .line 228
    .line 229
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    invoke-static {v13}, Lu1/h0;->u(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 234
    .line 235
    .line 236
    move-result-object v15

    .line 237
    if-eqz v13, :cond_6

    .line 238
    .line 239
    if-eqz v15, :cond_8

    .line 240
    .line 241
    :cond_6
    invoke-static {v1, v2, v4, v5}, La3/o;->g(Landroid/content/Context;Landroid/util/AttributeSet;II)La3/n;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-virtual {v2}, La3/n;->a()La3/o;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    new-instance v4, La3/j;

    .line 250
    .line 251
    invoke-direct {v4, v2}, La3/j;-><init>(La3/o;)V

    .line 252
    .line 253
    .line 254
    if-eqz v15, :cond_7

    .line 255
    .line 256
    invoke-virtual {v4, v15}, La3/j;->r(Landroid/content/res/ColorStateList;)V

    .line 257
    .line 258
    .line 259
    :cond_7
    invoke-virtual {v4, v1}, La3/j;->n(Landroid/content/Context;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 263
    .line 264
    .line 265
    :cond_8
    const/16 v2, 0xd

    .line 266
    .line 267
    invoke-virtual {v6, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_9

    .line 272
    .line 273
    invoke-virtual {v6, v2, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/d;->setItemPaddingTop(I)V

    .line 278
    .line 279
    .line 280
    :cond_9
    const/16 v2, 0xc

    .line 281
    .line 282
    invoke-virtual {v6, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    if-eqz v4, :cond_a

    .line 287
    .line 288
    invoke-virtual {v6, v2, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/d;->setItemPaddingBottom(I)V

    .line 293
    .line 294
    .line 295
    :cond_a
    invoke-virtual {v6, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-eqz v2, :cond_b

    .line 300
    .line 301
    invoke-virtual {v6, v8, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/d;->setActiveIndicatorLabelPadding(I)V

    .line 306
    .line 307
    .line 308
    :cond_b
    const/4 v2, 0x5

    .line 309
    invoke-virtual {v6, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    if-eqz v4, :cond_c

    .line 314
    .line 315
    invoke-virtual {v6, v2, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    invoke-virtual {v0, v4}, Lcom/google/android/material/navigation/d;->setIconLabelHorizontalSpacing(I)V

    .line 320
    .line 321
    .line 322
    :cond_c
    const/4 v4, 0x2

    .line 323
    invoke-virtual {v6, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    if-eqz v5, :cond_d

    .line 328
    .line 329
    invoke-virtual {v6, v4, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    int-to-float v5, v5

    .line 334
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/d;->setElevation(F)V

    .line 335
    .line 336
    .line 337
    :cond_d
    invoke-static {v1, v3, v12}, Lt2/i;->i(Landroid/content/Context;Landroidx/emoji2/text/t;I)Landroid/content/res/ColorStateList;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 342
    .line 343
    .line 344
    move-result-object v13

    .line 345
    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 346
    .line 347
    .line 348
    move-result-object v13

    .line 349
    invoke-virtual {v13, v5}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 350
    .line 351
    .line 352
    const/16 v5, 0x15

    .line 353
    .line 354
    const/4 v13, -0x1

    .line 355
    invoke-virtual {v6, v5, v13}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/d;->setLabelVisibilityMode(I)V

    .line 360
    .line 361
    .line 362
    const/16 v5, 0x9

    .line 363
    .line 364
    invoke-virtual {v6, v5, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 365
    .line 366
    .line 367
    move-result v15

    .line 368
    invoke-virtual {v0, v15}, Lcom/google/android/material/navigation/d;->setItemIconGravity(I)V

    .line 369
    .line 370
    .line 371
    const/16 v15, 0x31

    .line 372
    .line 373
    move/from16 p1, v13

    .line 374
    .line 375
    const/16 v13, 0x8

    .line 376
    .line 377
    invoke-virtual {v6, v13, v15}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 378
    .line 379
    .line 380
    move-result v15

    .line 381
    invoke-virtual {v0, v15}, Lcom/google/android/material/navigation/d;->setItemGravity(I)V

    .line 382
    .line 383
    .line 384
    const/4 v15, 0x7

    .line 385
    invoke-virtual {v6, v15, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 386
    .line 387
    .line 388
    move-result v7

    .line 389
    if-eqz v7, :cond_e

    .line 390
    .line 391
    invoke-virtual {v11, v7}, Lu2/j;->setItemBackgroundRes(I)V

    .line 392
    .line 393
    .line 394
    goto :goto_1

    .line 395
    :cond_e
    const/16 v7, 0xe

    .line 396
    .line 397
    invoke-static {v1, v3, v7}, Lt2/i;->i(Landroid/content/Context;Landroidx/emoji2/text/t;I)Landroid/content/res/ColorStateList;

    .line 398
    .line 399
    .line 400
    move-result-object v7

    .line 401
    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/d;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 402
    .line 403
    .line 404
    :goto_1
    const/16 v7, 0x16

    .line 405
    .line 406
    invoke-virtual {v6, v7, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 407
    .line 408
    .line 409
    move-result v7

    .line 410
    invoke-direct {v0, v7}, Lcom/google/android/material/navigation/d;->setMeasureBottomPaddingFromLabelBaseline(Z)V

    .line 411
    .line 412
    .line 413
    const/16 v7, 0x13

    .line 414
    .line 415
    invoke-virtual {v6, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 416
    .line 417
    .line 418
    move-result v7

    .line 419
    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/d;->setLabelFontScalingEnabled(Z)V

    .line 420
    .line 421
    .line 422
    const/16 v7, 0x14

    .line 423
    .line 424
    invoke-virtual {v6, v7, v12}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 425
    .line 426
    .line 427
    move-result v7

    .line 428
    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/d;->setLabelMaxLines(I)V

    .line 429
    .line 430
    .line 431
    const/4 v7, 0x6

    .line 432
    invoke-virtual {v6, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    if-eqz v4, :cond_16

    .line 437
    .line 438
    invoke-virtual {v0, v12}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorEnabled(Z)V

    .line 439
    .line 440
    .line 441
    sget-object v10, La2/a;->F:[I

    .line 442
    .line 443
    invoke-virtual {v1, v4, v10}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    invoke-virtual {v4, v12, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 448
    .line 449
    .line 450
    move-result v10

    .line 451
    invoke-virtual {v0, v10}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorWidth(I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v4, v8, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 455
    .line 456
    .line 457
    move-result v7

    .line 458
    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorHeight(I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v4, v14, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 462
    .line 463
    .line 464
    move-result v7

    .line 465
    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorMarginHorizontal(I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v14

    .line 472
    const/4 v8, -0x2

    .line 473
    if-eqz v14, :cond_11

    .line 474
    .line 475
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v12

    .line 479
    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v12

    .line 483
    if-eqz v12, :cond_f

    .line 484
    .line 485
    move/from16 v8, p1

    .line 486
    .line 487
    goto :goto_2

    .line 488
    :cond_f
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v12

    .line 492
    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v12

    .line 496
    if-eqz v12, :cond_10

    .line 497
    .line 498
    goto :goto_2

    .line 499
    :cond_10
    invoke-virtual {v4, v5, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 500
    .line 501
    .line 502
    move-result v5

    .line 503
    move v8, v5

    .line 504
    :cond_11
    :goto_2
    invoke-virtual {v0, v8}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorExpandedWidth(I)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v4, v15, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorExpandedHeight(I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v4, v13, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorExpandedMarginHorizontal(I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    const v7, 0x7f0702d4

    .line 526
    .line 527
    .line 528
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 529
    .line 530
    .line 531
    move-result v5

    .line 532
    invoke-virtual {v4, v2, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    invoke-virtual {v4, v9, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 537
    .line 538
    .line 539
    move-result v5

    .line 540
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 541
    .line 542
    .line 543
    move-result v7

    .line 544
    const/4 v8, 0x1

    .line 545
    if-ne v7, v8, :cond_12

    .line 546
    .line 547
    move v7, v5

    .line 548
    :goto_3
    const/4 v9, 0x6

    .line 549
    const/4 v10, 0x0

    .line 550
    goto :goto_4

    .line 551
    :cond_12
    move v7, v2

    .line 552
    goto :goto_3

    .line 553
    :goto_4
    invoke-virtual {v4, v9, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 558
    .line 559
    .line 560
    move-result v12

    .line 561
    if-ne v12, v8, :cond_13

    .line 562
    .line 563
    :goto_5
    const/4 v5, 0x3

    .line 564
    goto :goto_6

    .line 565
    :cond_13
    move v2, v5

    .line 566
    goto :goto_5

    .line 567
    :goto_6
    invoke-virtual {v4, v5, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 568
    .line 569
    .line 570
    move-result v5

    .line 571
    iget-object v8, v11, Lu2/j;->d0:Landroid/graphics/Rect;

    .line 572
    .line 573
    iput v7, v8, Landroid/graphics/Rect;->left:I

    .line 574
    .line 575
    iput v9, v8, Landroid/graphics/Rect;->top:I

    .line 576
    .line 577
    iput v2, v8, Landroid/graphics/Rect;->right:I

    .line 578
    .line 579
    iput v5, v8, Landroid/graphics/Rect;->bottom:I

    .line 580
    .line 581
    iget-object v2, v11, Lu2/j;->l:[Lu2/i;

    .line 582
    .line 583
    if-eqz v2, :cond_15

    .line 584
    .line 585
    array-length v5, v2

    .line 586
    const/4 v10, 0x0

    .line 587
    :goto_7
    if-ge v10, v5, :cond_15

    .line 588
    .line 589
    aget-object v7, v2, v10

    .line 590
    .line 591
    instance-of v9, v7, Lu2/f;

    .line 592
    .line 593
    if-eqz v9, :cond_14

    .line 594
    .line 595
    check-cast v7, Lu2/f;

    .line 596
    .line 597
    invoke-virtual {v7, v8}, Lu2/f;->setActiveIndicatorExpandedPadding(Landroid/graphics/Rect;)V

    .line 598
    .line 599
    .line 600
    :cond_14
    add-int/lit8 v10, v10, 0x1

    .line 601
    .line 602
    goto :goto_7

    .line 603
    :cond_15
    const/4 v2, 0x2

    .line 604
    invoke-static {v1, v4, v2}, Lt2/i;->h(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 609
    .line 610
    .line 611
    const/16 v2, 0xb

    .line 612
    .line 613
    const/4 v10, 0x0

    .line 614
    invoke-virtual {v4, v2, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    invoke-static {v1, v2, v10}, La3/o;->f(Landroid/content/Context;II)La3/n;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    invoke-virtual {v1}, La3/n;->a()La3/o;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    invoke-virtual {v0, v1}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorShapeAppearance(La3/o;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 630
    .line 631
    .line 632
    goto :goto_8

    .line 633
    :cond_16
    move v10, v8

    .line 634
    :goto_8
    const/16 v1, 0x17

    .line 635
    .line 636
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    if-eqz v2, :cond_17

    .line 641
    .line 642
    invoke-virtual {v6, v1, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    iget-object v2, v0, Lcom/google/android/material/navigation/d;->h:Lcom/google/android/material/navigation/b;

    .line 647
    .line 648
    const/4 v8, 0x1

    .line 649
    iput-boolean v8, v2, Lcom/google/android/material/navigation/b;->g:Z

    .line 650
    .line 651
    invoke-direct {v0}, Lcom/google/android/material/navigation/d;->getMenuInflater()Landroid/view/MenuInflater;

    .line 652
    .line 653
    .line 654
    move-result-object v4

    .line 655
    iget-object v5, v0, Lcom/google/android/material/navigation/d;->f:Lu2/g;

    .line 656
    .line 657
    invoke-virtual {v4, v1, v5}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 658
    .line 659
    .line 660
    iput-boolean v10, v2, Lcom/google/android/material/navigation/b;->g:Z

    .line 661
    .line 662
    invoke-virtual {v2, v8}, Lcom/google/android/material/navigation/b;->f(Z)V

    .line 663
    .line 664
    .line 665
    :cond_17
    invoke-virtual {v3}, Landroidx/emoji2/text/t;->v()V

    .line 666
    .line 667
    .line 668
    iget-object v1, v0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 669
    .line 670
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 671
    .line 672
    .line 673
    iget-object v1, v0, Lcom/google/android/material/navigation/d;->f:Lu2/g;

    .line 674
    .line 675
    new-instance v2, Lr0/b;

    .line 676
    .line 677
    move-object v3, v0

    .line 678
    check-cast v3, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 679
    .line 680
    invoke-direct {v2, v3}, Lr0/b;-><init>(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    iput-object v2, v1, Lj/m;->e:Lj/k;

    .line 684
    .line 685
    return-void
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->i:Li/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Li/h;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Li/h;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/material/navigation/d;->i:Li/h;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->i:Li/h;

    .line 17
    .line 18
    return-object v0
.end method

.method private setMeasureBottomPaddingFromLabelBaseline(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setMeasurePaddingFromLabelBaseline(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getActiveIndicatorLabelPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getActiveIndicatorLabelPadding()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getCollapsedMaxItemCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/navigation/d;->getMaxItemCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getHorizontalItemTextAppearanceActive()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getHorizontalItemTextAppearanceActive()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getHorizontalItemTextAppearanceInactive()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getHorizontalItemTextAppearanceInactive()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getIconLabelHorizontalSpacing()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getIconLabelHorizontalSpacing()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemActiveIndicatorExpandedHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemActiveIndicatorExpandedHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorExpandedMarginHorizontal()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemActiveIndicatorExpandedMarginHorizontal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorExpandedWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemActiveIndicatorExpandedWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemActiveIndicatorHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorMarginHorizontal()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemActiveIndicatorMarginHorizontal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemActiveIndicatorShapeAppearance()La3/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemActiveIndicatorShapeAppearance()La3/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemActiveIndicatorWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemActiveIndicatorWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemBackgroundResource()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemBackgroundRes()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemGravity()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemGravity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemIconGravity()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemIconGravity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemIconSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemIconSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getIconTintList()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemPaddingBottom()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemPaddingBottom()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemPaddingTop()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemRippleColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemRippleColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getItemTextAppearanceActive()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemTextAppearanceActive()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemTextAppearanceInactive()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemTextAppearanceInactive()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemTextColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getLabelVisibilityMode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getLabelVisibilityMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public abstract getMaxItemCount()I
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->f:Lu2/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMenuView()Lj/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMenuViewGroup()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPresenter()Lcom/google/android/material/navigation/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->h:Lcom/google/android/material/navigation/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScaleLabelTextWithFont()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getScaleLabelTextWithFont()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getSelectedItemId()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getSelectedItemId()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lu1/h0;->j0(Landroid/view/ViewGroup;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->f:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->f:Lu2/g;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;->h:Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lj/m;->t(Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;->h:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/material/navigation/d;->f:Lu2/g;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lj/m;->v(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public setActiveIndicatorLabelPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setActiveIndicatorLabelPadding(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lu1/h0;->b0(Landroid/view/ViewGroup;F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setHorizontalItemTextAppearanceActive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setHorizontalItemTextAppearanceActive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setHorizontalItemTextAppearanceInactive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setHorizontalItemTextAppearanceInactive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIconLabelHorizontalSpacing(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setIconLabelHorizontalSpacing(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemActiveIndicatorEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorExpandedHeight(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemActiveIndicatorExpandedHeight(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorExpandedMarginHorizontal(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemActiveIndicatorExpandedMarginHorizontal(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorExpandedWidth(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemActiveIndicatorExpandedWidth(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorHeight(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemActiveIndicatorHeight(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorMarginHorizontal(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemActiveIndicatorMarginHorizontal(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorShapeAppearance(La3/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemActiveIndicatorShapeAppearance(La3/o;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorWidth(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemActiveIndicatorWidth(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemBackgroundRes(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemGravity(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemGravity()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lu2/j;->setItemGravity(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/material/navigation/d;->h:Lcom/google/android/material/navigation/b;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/b;->f(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setItemIconGravity(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getItemIconGravity()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lu2/j;->setItemIconGravity(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/material/navigation/d;->h:Lcom/google/android/material/navigation/b;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/b;->f(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemIconSize(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemIconSizeRes(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/d;->setItemIconSize(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemPaddingBottom(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemPaddingTop(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemTextAppearanceActive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemTextAppearanceActiveBoldEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemTextAppearanceInactive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelFontScalingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setLabelFontScalingEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelMaxLines(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lu2/j;->setLabelMaxLines(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/j;->getLabelVisibilityMode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lu2/j;->setLabelVisibilityMode(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/material/navigation/d;->h:Lcom/google/android/material/navigation/b;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/b;->f(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setOnItemReselectedListener(Lu2/l;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnItemSelectedListener(Lu2/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/d;->j:Lu2/m;

    .line 2
    .line 3
    return-void
.end method

.method public setSelectedItemId(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->f:Lu2/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lj/m;->findItem(I)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/material/navigation/d;->h:Lcom/google/android/material/navigation/b;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, p1, v1, v2}, Lj/m;->q(Landroid/view/MenuItem;Lj/y;I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-interface {p1}, Landroid/view/MenuItem;->isCheckable()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->g:Lg2/b;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lu2/j;->setCheckedItem(Landroid/view/MenuItem;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method
