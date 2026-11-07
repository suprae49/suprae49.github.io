.class public Lcom/google/android/material/navigation/NavigationView;
.super Lr2/u;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lt2/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/navigation/NavigationView$SavedState;
    }
.end annotation


# static fields
.field public static final G:[I

.field public static final H:[I


# instance fields
.field public final A:La3/a0;

.field public B:La3/o;

.field public final C:Lt2/h;

.field public final D:Landroidx/emoji2/text/t;

.field public final E:Lu2/n;

.field public final F:Lu2/o;

.field public final m:Lr2/f;

.field public final n:Lr2/q;

.field public o:Lu2/p;

.field public final p:I

.field public final q:[I

.field public r:Li/h;

.field public final s:Lj/d;

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:I

.field public final y:Z

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->G:[I

    .line 9
    .line 10
    const v0, -0x101009e

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->H:[I

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const v4, 0x7f040401

    .line 6
    .line 7
    .line 8
    const v7, 0x7f120479

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    invoke-static {v1, v2, v4, v7}, Lf3/a;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1, v2, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    .line 19
    .line 20
    new-instance v3, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v3, v0, Lr2/u;->h:Landroid/graphics/Rect;

    .line 26
    .line 27
    const/4 v8, 0x1

    .line 28
    iput-boolean v8, v0, Lr2/u;->i:Z

    .line 29
    .line 30
    iput-boolean v8, v0, Lr2/u;->j:Z

    .line 31
    .line 32
    iput-boolean v8, v0, Lr2/u;->k:Z

    .line 33
    .line 34
    iput-boolean v8, v0, Lr2/u;->l:Z

    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    new-array v6, v9, [I

    .line 38
    .line 39
    sget-object v3, La2/a;->J:[I

    .line 40
    .line 41
    const v5, 0x7f12047a

    .line 42
    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, Lr2/a0;->f(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, v0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v8}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lr2/t;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Lr2/t;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 63
    .line 64
    .line 65
    sget-object v2, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 66
    .line 67
    invoke-static {v0, v1}, Lp0/h0;->c(Landroid/view/View;Lp0/q;)V

    .line 68
    .line 69
    .line 70
    new-instance v10, Lr2/q;

    .line 71
    .line 72
    invoke-direct {v10}, Lr2/q;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v10, v0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 76
    .line 77
    const/4 v11, 0x2

    .line 78
    new-array v1, v11, [I

    .line 79
    .line 80
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->q:[I

    .line 81
    .line 82
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->t:Z

    .line 83
    .line 84
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->u:Z

    .line 85
    .line 86
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->v:Z

    .line 87
    .line 88
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->w:Z

    .line 89
    .line 90
    iput v9, v0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 91
    .line 92
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 93
    .line 94
    const/16 v12, 0x21

    .line 95
    .line 96
    if-lt v1, v12, :cond_0

    .line 97
    .line 98
    new-instance v1, La3/d0;

    .line 99
    .line 100
    invoke-direct {v1, v0}, La3/d0;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    new-instance v1, La3/c0;

    .line 105
    .line 106
    invoke-direct {v1, v0}, La3/c0;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 107
    .line 108
    .line 109
    :goto_0
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->A:La3/a0;

    .line 110
    .line 111
    new-instance v1, Lt2/h;

    .line 112
    .line 113
    invoke-direct {v1, v0}, Lt2/h;-><init>(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->C:Lt2/h;

    .line 117
    .line 118
    new-instance v1, Landroidx/emoji2/text/t;

    .line 119
    .line 120
    invoke-direct {v1, v0}, Landroidx/emoji2/text/t;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 121
    .line 122
    .line 123
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->D:Landroidx/emoji2/text/t;

    .line 124
    .line 125
    new-instance v1, Lu2/n;

    .line 126
    .line 127
    invoke-direct {v1, v0}, Lu2/n;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 128
    .line 129
    .line 130
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->E:Lu2/n;

    .line 131
    .line 132
    new-instance v1, Lu2/o;

    .line 133
    .line 134
    invoke-direct {v1, v0}, Lu2/o;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 135
    .line 136
    .line 137
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->F:Lu2/o;

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    new-instance v13, Lr2/f;

    .line 144
    .line 145
    invoke-direct {v13, v1}, Lj/m;-><init>(Landroid/content/Context;)V

    .line 146
    .line 147
    .line 148
    iput-object v13, v0, Lcom/google/android/material/navigation/NavigationView;->m:Lr2/f;

    .line 149
    .line 150
    const v5, 0x7f120479

    .line 151
    .line 152
    .line 153
    new-array v6, v9, [I

    .line 154
    .line 155
    sget-object v3, La2/a;->H:[I

    .line 156
    .line 157
    move-object/from16 v2, p2

    .line 158
    .line 159
    invoke-static/range {v1 .. v6}, Lr2/a0;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroidx/emoji2/text/t;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    iget-object v5, v3, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v5, Landroid/content/res/TypedArray;

    .line 166
    .line 167
    invoke-virtual {v5, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_1

    .line 172
    .line 173
    invoke-virtual {v3, v8}, Landroidx/emoji2/text/t;->i(I)Landroid/graphics/drawable/Drawable;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 178
    .line 179
    .line 180
    :cond_1
    const/4 v6, 0x7

    .line 181
    invoke-virtual {v5, v6, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    iput v6, v0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 186
    .line 187
    if-nez v6, :cond_2

    .line 188
    .line 189
    move v6, v8

    .line 190
    goto :goto_1

    .line 191
    :cond_2
    move v6, v9

    .line 192
    :goto_1
    iput-boolean v6, v0, Lcom/google/android/material/navigation/NavigationView;->y:Z

    .line 193
    .line 194
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    const v14, 0x7f0702cf

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    iput v6, v0, Lcom/google/android/material/navigation/NavigationView;->z:I

    .line 206
    .line 207
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    invoke-static {v6}, Lu1/h0;->u(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 212
    .line 213
    .line 214
    move-result-object v14

    .line 215
    if-eqz v6, :cond_3

    .line 216
    .line 217
    if-eqz v14, :cond_5

    .line 218
    .line 219
    :cond_3
    invoke-static {v1, v2, v4, v7}, La3/o;->g(Landroid/content/Context;Landroid/util/AttributeSet;II)La3/n;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v2}, La3/n;->a()La3/o;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    new-instance v4, La3/j;

    .line 228
    .line 229
    invoke-direct {v4, v2}, La3/j;-><init>(La3/o;)V

    .line 230
    .line 231
    .line 232
    if-eqz v14, :cond_4

    .line 233
    .line 234
    invoke-virtual {v4, v14}, La3/j;->r(Landroid/content/res/ColorStateList;)V

    .line 235
    .line 236
    .line 237
    :cond_4
    invoke-virtual {v4, v1}, La3/j;->n(Landroid/content/Context;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 241
    .line 242
    .line 243
    :cond_5
    const/16 v2, 0x8

    .line 244
    .line 245
    invoke-virtual {v5, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eqz v4, :cond_6

    .line 250
    .line 251
    invoke-virtual {v5, v2, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    int-to-float v2, v2

    .line 256
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationView;->setElevation(F)V

    .line 257
    .line 258
    .line 259
    :cond_6
    invoke-virtual {v5, v11, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-virtual {v0, v2}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 264
    .line 265
    .line 266
    const/4 v2, 0x3

    .line 267
    invoke-virtual {v5, v2, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    iput v2, v0, Lcom/google/android/material/navigation/NavigationView;->p:I

    .line 272
    .line 273
    invoke-virtual {v5, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    const/4 v4, 0x0

    .line 278
    if-eqz v2, :cond_7

    .line 279
    .line 280
    invoke-virtual {v3, v12}, Landroidx/emoji2/text/t;->h(I)Landroid/content/res/ColorStateList;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    goto :goto_2

    .line 285
    :cond_7
    move-object v2, v4

    .line 286
    :goto_2
    const/16 v6, 0x24

    .line 287
    .line 288
    invoke-virtual {v5, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    if-eqz v7, :cond_8

    .line 293
    .line 294
    invoke-virtual {v5, v6, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    goto :goto_3

    .line 299
    :cond_8
    move v6, v9

    .line 300
    :goto_3
    const v7, 0x1010038

    .line 301
    .line 302
    .line 303
    if-nez v6, :cond_9

    .line 304
    .line 305
    if-nez v2, :cond_9

    .line 306
    .line 307
    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/NavigationView;->e(I)Landroid/content/res/ColorStateList;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    :cond_9
    const/16 v12, 0xf

    .line 312
    .line 313
    invoke-virtual {v5, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 314
    .line 315
    .line 316
    move-result v14

    .line 317
    if-eqz v14, :cond_a

    .line 318
    .line 319
    invoke-virtual {v3, v12}, Landroidx/emoji2/text/t;->h(I)Landroid/content/res/ColorStateList;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    goto :goto_4

    .line 324
    :cond_a
    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/NavigationView;->e(I)Landroid/content/res/ColorStateList;

    .line 325
    .line 326
    .line 327
    move-result-object v7

    .line 328
    :goto_4
    const/16 v12, 0x19

    .line 329
    .line 330
    invoke-virtual {v5, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    if-eqz v14, :cond_b

    .line 335
    .line 336
    invoke-virtual {v5, v12, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 337
    .line 338
    .line 339
    move-result v12

    .line 340
    goto :goto_5

    .line 341
    :cond_b
    move v12, v9

    .line 342
    :goto_5
    const/16 v14, 0x1a

    .line 343
    .line 344
    invoke-virtual {v5, v14, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 345
    .line 346
    .line 347
    move-result v14

    .line 348
    const/16 v15, 0xe

    .line 349
    .line 350
    invoke-virtual {v5, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 351
    .line 352
    .line 353
    move-result v16

    .line 354
    if-eqz v16, :cond_c

    .line 355
    .line 356
    invoke-virtual {v5, v15, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 357
    .line 358
    .line 359
    move-result v15

    .line 360
    invoke-virtual {v0, v15}, Lcom/google/android/material/navigation/NavigationView;->setItemIconSize(I)V

    .line 361
    .line 362
    .line 363
    :cond_c
    const/16 v15, 0x1b

    .line 364
    .line 365
    invoke-virtual {v5, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 366
    .line 367
    .line 368
    move-result v16

    .line 369
    if-eqz v16, :cond_d

    .line 370
    .line 371
    invoke-virtual {v3, v15}, Landroidx/emoji2/text/t;->h(I)Landroid/content/res/ColorStateList;

    .line 372
    .line 373
    .line 374
    move-result-object v15

    .line 375
    goto :goto_6

    .line 376
    :cond_d
    move-object v15, v4

    .line 377
    :goto_6
    if-nez v12, :cond_e

    .line 378
    .line 379
    if-nez v15, :cond_e

    .line 380
    .line 381
    const v15, 0x1010036

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v15}, Lcom/google/android/material/navigation/NavigationView;->e(I)Landroid/content/res/ColorStateList;

    .line 385
    .line 386
    .line 387
    move-result-object v15

    .line 388
    :cond_e
    const/16 v11, 0xb

    .line 389
    .line 390
    invoke-virtual {v3, v11}, Landroidx/emoji2/text/t;->i(I)Landroid/graphics/drawable/Drawable;

    .line 391
    .line 392
    .line 393
    move-result-object v11

    .line 394
    if-nez v11, :cond_11

    .line 395
    .line 396
    const/16 v8, 0x12

    .line 397
    .line 398
    invoke-virtual {v5, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    if-nez v8, :cond_f

    .line 403
    .line 404
    const/16 v8, 0x13

    .line 405
    .line 406
    invoke-virtual {v5, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 407
    .line 408
    .line 409
    move-result v8

    .line 410
    if-eqz v8, :cond_11

    .line 411
    .line 412
    :cond_f
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    const/16 v11, 0x14

    .line 417
    .line 418
    invoke-static {v8, v3, v11}, Lt2/i;->i(Landroid/content/Context;Landroidx/emoji2/text/t;I)Landroid/content/res/ColorStateList;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    invoke-virtual {v0, v3, v8}, Lcom/google/android/material/navigation/NavigationView;->f(Landroidx/emoji2/text/t;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/InsetDrawable;

    .line 423
    .line 424
    .line 425
    move-result-object v11

    .line 426
    const/16 v8, 0x11

    .line 427
    .line 428
    invoke-static {v1, v3, v8}, Lt2/i;->i(Landroid/content/Context;Landroidx/emoji2/text/t;I)Landroid/content/res/ColorStateList;

    .line 429
    .line 430
    .line 431
    move-result-object v8

    .line 432
    if-eqz v8, :cond_11

    .line 433
    .line 434
    invoke-virtual {v0, v3, v4}, Lcom/google/android/material/navigation/NavigationView;->f(Landroidx/emoji2/text/t;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/InsetDrawable;

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    move-object/from16 v17, v3

    .line 439
    .line 440
    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    .line 441
    .line 442
    invoke-static {v8}, Ly2/a;->b(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    invoke-direct {v3, v8, v4, v9}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 447
    .line 448
    .line 449
    invoke-static {v1, v3, v4}, Lcom/google/android/material/focus/FocusRingDrawable;->e(Landroid/content/Context;Landroid/graphics/drawable/RippleDrawable;La3/j;)Lcom/google/android/material/focus/FocusRingDrawable;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    if-eqz v8, :cond_10

    .line 454
    .line 455
    iget-object v9, v0, Lcom/google/android/material/navigation/NavigationView;->B:La3/o;

    .line 456
    .line 457
    iget-object v8, v8, Lcom/google/android/material/focus/FocusRingDrawable;->t:Lq2/b;

    .line 458
    .line 459
    iput-object v9, v8, Lq2/b;->t:La3/m;

    .line 460
    .line 461
    :cond_10
    iput-object v3, v10, Lr2/q;->s:Landroid/graphics/drawable/RippleDrawable;

    .line 462
    .line 463
    invoke-virtual {v10}, Lr2/q;->g()V

    .line 464
    .line 465
    .line 466
    goto :goto_7

    .line 467
    :cond_11
    move-object/from16 v17, v3

    .line 468
    .line 469
    :goto_7
    const/16 v3, 0xc

    .line 470
    .line 471
    invoke-virtual {v5, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 472
    .line 473
    .line 474
    move-result v8

    .line 475
    if-eqz v8, :cond_12

    .line 476
    .line 477
    const/4 v8, 0x0

    .line 478
    invoke-virtual {v5, v3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    invoke-virtual {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->setItemHorizontalPadding(I)V

    .line 483
    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_12
    const/4 v8, 0x0

    .line 487
    :goto_8
    const/16 v3, 0x1c

    .line 488
    .line 489
    invoke-virtual {v5, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 490
    .line 491
    .line 492
    move-result v9

    .line 493
    if-eqz v9, :cond_13

    .line 494
    .line 495
    invoke-virtual {v5, v3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    invoke-virtual {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->setItemVerticalPadding(I)V

    .line 500
    .line 501
    .line 502
    :cond_13
    const/4 v3, 0x6

    .line 503
    invoke-virtual {v5, v3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 504
    .line 505
    .line 506
    move-result v3

    .line 507
    invoke-virtual {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetStart(I)V

    .line 508
    .line 509
    .line 510
    const/4 v3, 0x5

    .line 511
    invoke-virtual {v5, v3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    invoke-virtual {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetEnd(I)V

    .line 516
    .line 517
    .line 518
    const/16 v3, 0x23

    .line 519
    .line 520
    invoke-virtual {v5, v3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    invoke-virtual {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetStart(I)V

    .line 525
    .line 526
    .line 527
    const/16 v3, 0x22

    .line 528
    .line 529
    invoke-virtual {v5, v3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    invoke-virtual {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetEnd(I)V

    .line 534
    .line 535
    .line 536
    const/16 v3, 0x25

    .line 537
    .line 538
    iget-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->t:Z

    .line 539
    .line 540
    invoke-virtual {v5, v3, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    invoke-virtual {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->setTopInsetScrimEnabled(Z)V

    .line 545
    .line 546
    .line 547
    iget-boolean v3, v0, Lcom/google/android/material/navigation/NavigationView;->u:Z

    .line 548
    .line 549
    const/4 v8, 0x4

    .line 550
    invoke-virtual {v5, v8, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    invoke-virtual {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->setBottomInsetScrimEnabled(Z)V

    .line 555
    .line 556
    .line 557
    const/16 v3, 0x20

    .line 558
    .line 559
    iget-boolean v9, v0, Lcom/google/android/material/navigation/NavigationView;->v:Z

    .line 560
    .line 561
    invoke-virtual {v5, v3, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    invoke-virtual {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->setStartInsetScrimEnabled(Z)V

    .line 566
    .line 567
    .line 568
    const/16 v3, 0x9

    .line 569
    .line 570
    iget-boolean v9, v0, Lcom/google/android/material/navigation/NavigationView;->w:Z

    .line 571
    .line 572
    invoke-virtual {v5, v3, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 573
    .line 574
    .line 575
    move-result v3

    .line 576
    invoke-virtual {v0, v3}, Lcom/google/android/material/navigation/NavigationView;->setEndInsetScrimEnabled(Z)V

    .line 577
    .line 578
    .line 579
    const/16 v3, 0xd

    .line 580
    .line 581
    const/4 v9, 0x0

    .line 582
    invoke-virtual {v5, v3, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 583
    .line 584
    .line 585
    move-result v3

    .line 586
    const/16 v9, 0x10

    .line 587
    .line 588
    move-object/from16 p2, v4

    .line 589
    .line 590
    const/4 v4, 0x1

    .line 591
    invoke-virtual {v5, v9, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 592
    .line 593
    .line 594
    move-result v9

    .line 595
    invoke-virtual {v0, v9}, Lcom/google/android/material/navigation/NavigationView;->setItemMaxLines(I)V

    .line 596
    .line 597
    .line 598
    new-instance v9, Lr2/t;

    .line 599
    .line 600
    invoke-direct {v9, v0}, Lr2/t;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 601
    .line 602
    .line 603
    iput-object v9, v13, Lj/m;->e:Lj/k;

    .line 604
    .line 605
    iput v4, v10, Lr2/q;->i:I

    .line 606
    .line 607
    invoke-virtual {v10, v1, v13}, Lr2/q;->h(Landroid/content/Context;Lj/m;)V

    .line 608
    .line 609
    .line 610
    if-eqz v6, :cond_14

    .line 611
    .line 612
    iput v6, v10, Lr2/q;->l:I

    .line 613
    .line 614
    invoke-virtual {v10}, Lr2/q;->c()V

    .line 615
    .line 616
    .line 617
    :cond_14
    iput-object v2, v10, Lr2/q;->m:Landroid/content/res/ColorStateList;

    .line 618
    .line 619
    invoke-virtual {v10}, Lr2/q;->c()V

    .line 620
    .line 621
    .line 622
    iput-object v7, v10, Lr2/q;->q:Landroid/content/res/ColorStateList;

    .line 623
    .line 624
    invoke-virtual {v10}, Lr2/q;->g()V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v0}, Landroid/view/View;->getOverScrollMode()I

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    iput v1, v10, Lr2/q;->G:I

    .line 632
    .line 633
    iget-object v2, v10, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 634
    .line 635
    if-eqz v2, :cond_15

    .line 636
    .line 637
    invoke-virtual {v2, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 638
    .line 639
    .line 640
    :cond_15
    if-eqz v12, :cond_16

    .line 641
    .line 642
    iput v12, v10, Lr2/q;->n:I

    .line 643
    .line 644
    invoke-virtual {v10}, Lr2/q;->g()V

    .line 645
    .line 646
    .line 647
    :cond_16
    iput-boolean v14, v10, Lr2/q;->o:Z

    .line 648
    .line 649
    invoke-virtual {v10}, Lr2/q;->g()V

    .line 650
    .line 651
    .line 652
    iput-object v15, v10, Lr2/q;->p:Landroid/content/res/ColorStateList;

    .line 653
    .line 654
    invoke-virtual {v10}, Lr2/q;->g()V

    .line 655
    .line 656
    .line 657
    iput-object v11, v10, Lr2/q;->r:Landroid/graphics/drawable/Drawable;

    .line 658
    .line 659
    invoke-virtual {v10}, Lr2/q;->g()V

    .line 660
    .line 661
    .line 662
    iput v3, v10, Lr2/q;->v:I

    .line 663
    .line 664
    invoke-virtual {v10}, Lr2/q;->g()V

    .line 665
    .line 666
    .line 667
    iget-object v1, v13, Lj/m;->a:Landroid/content/Context;

    .line 668
    .line 669
    invoke-virtual {v13, v10, v1}, Lj/m;->b(Lj/y;Landroid/content/Context;)V

    .line 670
    .line 671
    .line 672
    iget-object v1, v10, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 673
    .line 674
    if-nez v1, :cond_1a

    .line 675
    .line 676
    iget-object v1, v10, Lr2/q;->k:Landroid/view/LayoutInflater;

    .line 677
    .line 678
    const v2, 0x7f0c002d

    .line 679
    .line 680
    .line 681
    const/4 v9, 0x0

    .line 682
    invoke-virtual {v1, v2, v0, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    check-cast v1, Lcom/google/android/material/internal/NavigationMenuView;

    .line 687
    .line 688
    iput-object v1, v10, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 689
    .line 690
    new-instance v2, Lr2/n;

    .line 691
    .line 692
    iget-object v3, v10, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 693
    .line 694
    invoke-direct {v2, v10, v3}, Lr2/n;-><init>(Lr2/q;Lcom/google/android/material/internal/NavigationMenuView;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Lk1/z0;)V

    .line 698
    .line 699
    .line 700
    iget-object v1, v10, Lr2/q;->j:Lr2/i;

    .line 701
    .line 702
    if-nez v1, :cond_18

    .line 703
    .line 704
    new-instance v1, Lr2/i;

    .line 705
    .line 706
    invoke-direct {v1, v10}, Lr2/i;-><init>(Lr2/q;)V

    .line 707
    .line 708
    .line 709
    iput-object v1, v10, Lr2/q;->j:Lr2/i;

    .line 710
    .line 711
    iget-object v2, v1, Lk1/b0;->a:Lk1/c0;

    .line 712
    .line 713
    invoke-virtual {v2}, Lk1/c0;->a()Z

    .line 714
    .line 715
    .line 716
    move-result v2

    .line 717
    if-nez v2, :cond_17

    .line 718
    .line 719
    const/4 v4, 0x1

    .line 720
    iput-boolean v4, v1, Lk1/b0;->b:Z

    .line 721
    .line 722
    goto :goto_9

    .line 723
    :cond_17
    const-string v1, "Cannot change whether this adapter has stable IDs while the adapter has registered observers."

    .line 724
    .line 725
    invoke-static {v1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    throw p2

    .line 729
    :cond_18
    :goto_9
    iget v1, v10, Lr2/q;->G:I

    .line 730
    .line 731
    const/4 v2, -0x1

    .line 732
    if-eq v1, v2, :cond_19

    .line 733
    .line 734
    iget-object v2, v10, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 735
    .line 736
    invoke-virtual {v2, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 737
    .line 738
    .line 739
    :cond_19
    iget-object v1, v10, Lr2/q;->k:Landroid/view/LayoutInflater;

    .line 740
    .line 741
    const v2, 0x7f0c002a

    .line 742
    .line 743
    .line 744
    iget-object v3, v10, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 745
    .line 746
    const/4 v9, 0x0

    .line 747
    invoke-virtual {v1, v2, v3, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    check-cast v1, Landroid/widget/LinearLayout;

    .line 752
    .line 753
    iput-object v1, v10, Lr2/q;->g:Landroid/widget/LinearLayout;

    .line 754
    .line 755
    const/4 v2, 0x2

    .line 756
    invoke-virtual {v1, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 757
    .line 758
    .line 759
    iget-object v1, v10, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 760
    .line 761
    iget-object v2, v10, Lr2/q;->j:Lr2/i;

    .line 762
    .line 763
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lk1/b0;)V

    .line 764
    .line 765
    .line 766
    :cond_1a
    iget-object v1, v10, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 767
    .line 768
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 769
    .line 770
    .line 771
    const/16 v1, 0x1d

    .line 772
    .line 773
    invoke-virtual {v5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    const/4 v9, 0x0

    .line 778
    if-eqz v2, :cond_1d

    .line 779
    .line 780
    invoke-virtual {v5, v1, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 781
    .line 782
    .line 783
    move-result v1

    .line 784
    iget-object v2, v10, Lr2/q;->j:Lr2/i;

    .line 785
    .line 786
    if-eqz v2, :cond_1b

    .line 787
    .line 788
    const/4 v4, 0x1

    .line 789
    iput-boolean v4, v2, Lr2/i;->f:Z

    .line 790
    .line 791
    :cond_1b
    invoke-direct {v0}, Lcom/google/android/material/navigation/NavigationView;->getMenuInflater()Landroid/view/MenuInflater;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    invoke-virtual {v2, v1, v13}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 796
    .line 797
    .line 798
    iget-object v1, v10, Lr2/q;->j:Lr2/i;

    .line 799
    .line 800
    if-eqz v1, :cond_1c

    .line 801
    .line 802
    iput-boolean v9, v1, Lr2/i;->f:Z

    .line 803
    .line 804
    :cond_1c
    invoke-virtual {v10, v9}, Lr2/q;->f(Z)V

    .line 805
    .line 806
    .line 807
    :cond_1d
    const/16 v1, 0xa

    .line 808
    .line 809
    invoke-virtual {v5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 810
    .line 811
    .line 812
    move-result v2

    .line 813
    if-eqz v2, :cond_1e

    .line 814
    .line 815
    invoke-virtual {v5, v1, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 816
    .line 817
    .line 818
    move-result v1

    .line 819
    iget-object v2, v10, Lr2/q;->k:Landroid/view/LayoutInflater;

    .line 820
    .line 821
    iget-object v3, v10, Lr2/q;->g:Landroid/widget/LinearLayout;

    .line 822
    .line 823
    invoke-virtual {v2, v1, v3, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    iget-object v2, v10, Lr2/q;->g:Landroid/widget/LinearLayout;

    .line 828
    .line 829
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 830
    .line 831
    .line 832
    iget-object v1, v10, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 833
    .line 834
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 835
    .line 836
    .line 837
    move-result v2

    .line 838
    invoke-virtual {v1, v9, v9, v9, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 839
    .line 840
    .line 841
    :cond_1e
    invoke-virtual/range {v17 .. v17}, Landroidx/emoji2/text/t;->v()V

    .line 842
    .line 843
    .line 844
    new-instance v1, Lj/d;

    .line 845
    .line 846
    invoke-direct {v1, v8, v0}, Lj/d;-><init>(ILjava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->s:Lj/d;

    .line 850
    .line 851
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    iget-object v2, v0, Lcom/google/android/material/navigation/NavigationView;->s:Lj/d;

    .line 856
    .line 857
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 858
    .line 859
    .line 860
    return-void
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->r:Li/h;

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
    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->r:Li/h;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->r:Li/h;

    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->h()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ly0/f;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->C:Lt2/h;

    .line 10
    .line 11
    iget-object v3, v2, Lt2/a;->f:Landroidx/activity/b;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    iput-object v4, v2, Lt2/a;->f:Landroidx/activity/b;

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v5, 0x22

    .line 21
    .line 22
    if-ge v4, v5, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ly0/c;

    .line 28
    .line 29
    iget v0, v0, Ly0/c;->a:I

    .line 30
    .line 31
    sget v4, Lu2/b;->a:I

    .line 32
    .line 33
    new-instance v4, Le2/b;

    .line 34
    .line 35
    invoke-direct {v4, v1, p0}, Le2/b;-><init>(Ly0/f;Lcom/google/android/material/navigation/NavigationView;)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Ld3/i;

    .line 39
    .line 40
    const/4 v6, 0x2

    .line 41
    invoke-direct {v5, v6, v1}, Ld3/i;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3, v0, v4, v5}, Lt2/h;->b(Landroidx/activity/b;ILandroid/animation/AnimatorListenerAdapter;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 49
    invoke-virtual {v1, p0, v0}, Ly0/f;->c(Landroid/view/View;Z)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final b(Landroidx/activity/b;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->h()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->C:Lt2/h;

    .line 5
    .line 6
    iput-object p1, v0, Lt2/a;->f:Landroidx/activity/b;

    .line 7
    .line 8
    return-void
.end method

.method public final c(Landroidx/activity/b;)V
    .locals 5

    .line 1
    iget v0, p1, Landroidx/activity/b;->c:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->h()Landroid/util/Pair;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ly0/c;

    .line 10
    .line 11
    iget v1, v1, Ly0/c;->a:I

    .line 12
    .line 13
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->C:Lt2/h;

    .line 14
    .line 15
    iget-object v3, v2, Lt2/a;->f:Landroidx/activity/b;

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    const-string v3, "MaterialBackHelper"

    .line 20
    .line 21
    const-string v4, "Must call startBackProgress() before updateBackProgress()"

    .line 22
    .line 23
    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v3, v2, Lt2/a;->f:Landroidx/activity/b;

    .line 27
    .line 28
    iput-object p1, v2, Lt2/a;->f:Landroidx/activity/b;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget p1, p1, Landroidx/activity/b;->d:I

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move p1, v4

    .line 41
    :goto_0
    invoke-virtual {v2, v0, p1, v1}, Lt2/h;->c(FZI)V

    .line 42
    .line 43
    .line 44
    :goto_1
    iget-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->y:Z

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    iget-object p1, v2, Lt2/a;->a:Landroid/view/animation/PathInterpolator;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/animation/PathInterpolator;->getInterpolation(F)F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->z:I

    .line 55
    .line 56
    invoke-static {v4, v0, p1}, Lb2/a;->c(IIF)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iput p1, p0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/navigation/NavigationView;->g(II)V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->h()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->C:Lt2/h;

    .line 5
    .line 6
    invoke-virtual {v0}, Lt2/h;->a()V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->y:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/navigation/NavigationView;->g(II)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->A:La3/a0;

    .line 2
    .line 3
    iget-object v1, v0, La3/a0;->e:Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-virtual {v0}, La3/a0;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/graphics/Path;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 21
    .line 22
    .line 23
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final e(I)Landroid/content/res/ColorStateList;
    .locals 6

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    .line 27
    .line 28
    invoke-static {p1, v1}, Lc0/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const v3, 0x7f04012d

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v3, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    :goto_0
    const/4 p1, 0x0

    .line 50
    return-object p1

    .line 51
    :cond_1
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 58
    .line 59
    sget-object v3, Lcom/google/android/material/navigation/NavigationView;->G:[I

    .line 60
    .line 61
    sget-object v4, Landroid/widget/FrameLayout;->EMPTY_STATE_SET:[I

    .line 62
    .line 63
    sget-object v5, Lcom/google/android/material/navigation/NavigationView;->H:[I

    .line 64
    .line 65
    filled-new-array {v5, v3, v4}, [[I

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {p1, v5, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    filled-new-array {p1, v0, v1}, [I

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v2, v3, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 78
    .line 79
    .line 80
    return-object v2
.end method

.method public final f(Landroidx/emoji2/text/t;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/InsetDrawable;
    .locals 8

    .line 1
    iget-object p1, p1, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/16 v0, 0x12

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v2, 0x13

    .line 13
    .line 14
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3, v0, v2}, La3/o;->f(Landroid/content/Context;II)La3/n;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, La3/n;->a()La3/o;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->B:La3/o;

    .line 31
    .line 32
    new-instance v3, La3/j;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->B:La3/o;

    .line 35
    .line 36
    invoke-direct {v3, v0}, La3/j;-><init>(La3/o;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, p2}, La3/j;->r(Landroid/content/res/ColorStateList;)V

    .line 40
    .line 41
    .line 42
    const/16 p2, 0x17

    .line 43
    .line 44
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/16 p2, 0x18

    .line 49
    .line 50
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    const/16 p2, 0x16

    .line 55
    .line 56
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const/16 p2, 0x15

    .line 61
    .line 62
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    new-instance v2, Landroid/graphics/drawable/InsetDrawable;

    .line 67
    .line 68
    invoke-direct/range {v2 .. v7}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 69
    .line 70
    .line 71
    return-object v2
.end method

.method public final g(II)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ly0/f;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Ly0/c;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 18
    .line 19
    if-gtz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->y:Z

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v0, v0, La3/j;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ly0/c;

    .line 38
    .line 39
    iget v0, v0, Ly0/c;->a:I

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v0, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x3

    .line 50
    const/4 v2, 0x1

    .line 51
    if-ne v0, v1, :cond_1

    .line 52
    .line 53
    move v0, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v0, 0x0

    .line 56
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, La3/j;

    .line 61
    .line 62
    invoke-virtual {v1}, La3/j;->j()La3/o;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, La3/o;->k()La3/n;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget v4, p0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 71
    .line 72
    int-to-float v4, v4

    .line 73
    invoke-virtual {v3, v4}, La3/n;->b(F)V

    .line 74
    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    new-instance v0, La3/a;

    .line 80
    .line 81
    invoke-direct {v0, v4}, La3/a;-><init>(F)V

    .line 82
    .line 83
    .line 84
    iput-object v0, v3, La3/n;->e:La3/d;

    .line 85
    .line 86
    new-instance v0, La3/a;

    .line 87
    .line 88
    invoke-direct {v0, v4}, La3/a;-><init>(F)V

    .line 89
    .line 90
    .line 91
    iput-object v0, v3, La3/n;->h:La3/d;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    new-instance v0, La3/a;

    .line 95
    .line 96
    invoke-direct {v0, v4}, La3/a;-><init>(F)V

    .line 97
    .line 98
    .line 99
    iput-object v0, v3, La3/n;->f:La3/d;

    .line 100
    .line 101
    new-instance v0, La3/a;

    .line 102
    .line 103
    invoke-direct {v0, v4}, La3/a;-><init>(F)V

    .line 104
    .line 105
    .line 106
    iput-object v0, v3, La3/n;->g:La3/d;

    .line 107
    .line 108
    :goto_1
    invoke-virtual {v3}, La3/n;->a()La3/o;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v1, v0}, La3/j;->setShapeAppearanceModel(La3/o;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->A:La3/a0;

    .line 116
    .line 117
    iput-object v0, v1, La3/a0;->c:La3/o;

    .line 118
    .line 119
    invoke-virtual {v1}, La3/a0;->c()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p0}, La3/a0;->a(Lcom/google/android/material/navigation/NavigationView;)V

    .line 123
    .line 124
    .line 125
    new-instance v0, Landroid/graphics/RectF;

    .line 126
    .line 127
    int-to-float p1, p1

    .line 128
    int-to-float p2, p2

    .line 129
    invoke-direct {v0, v4, v4, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 130
    .line 131
    .line 132
    iput-object v0, v1, La3/a0;->d:Landroid/graphics/RectF;

    .line 133
    .line 134
    invoke-virtual {v1}, La3/a0;->c()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, p0}, La3/a0;->a(Lcom/google/android/material/navigation/NavigationView;)V

    .line 138
    .line 139
    .line 140
    iput-boolean v2, v1, La3/a0;->b:Z

    .line 141
    .line 142
    invoke-virtual {v1, p0}, La3/a0;->a(Lcom/google/android/material/navigation/NavigationView;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    return-void
.end method

.method public getBackHelper()Lt2/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->C:Lt2/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCheckedItem()Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget-object v0, v0, Lr2/q;->j:Lr2/i;

    .line 4
    .line 5
    iget-object v0, v0, Lr2/i;->e:Lj/o;

    .line 6
    .line 7
    return-object v0
.end method

.method public getDividerInsetEnd()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget v0, v0, Lr2/q;->y:I

    .line 4
    .line 5
    return v0
.end method

.method public getDividerInsetStart()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget v0, v0, Lr2/q;->x:I

    .line 4
    .line 5
    return v0
.end method

.method public getHeaderCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget-object v0, v0, Lr2/q;->g:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget-object v0, v0, Lr2/q;->r:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    return-object v0
.end method

.method public getItemHorizontalPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget v0, v0, Lr2/q;->t:I

    .line 4
    .line 5
    return v0
.end method

.method public getItemIconPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget v0, v0, Lr2/q;->v:I

    .line 4
    .line 5
    return v0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget-object v0, v0, Lr2/q;->q:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public getItemMaxLines()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget v0, v0, Lr2/q;->D:I

    .line 4
    .line 5
    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget-object v0, v0, Lr2/q;->p:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public getItemVerticalPadding()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget v0, v0, Lr2/q;->u:I

    .line 4
    .line 5
    return v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->m:Lr2/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSubheaderInsetEnd()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget v0, v0, Lr2/q;->A:I

    .line 4
    .line 5
    return v0
.end method

.method public getSubheaderInsetStart()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget v0, v0, Lr2/q;->z:I

    .line 4
    .line 5
    return v0
.end method

.method public final h()Landroid/util/Pair;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, v0, Ly0/f;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    instance-of v2, v1, Ly0/c;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    new-instance v2, Landroid/util/Pair;

    .line 18
    .line 19
    check-cast v0, Ly0/f;

    .line 20
    .line 21
    check-cast v1, Ly0/c;

    .line 22
    .line 23
    invoke-direct {v2, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_0
    const-string v0, "NavigationView back progress requires the direct parent view to be a DrawerLayout."

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Lr2/u;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lu1/h0;->j0(Landroid/view/ViewGroup;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Ly0/f;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Ly0/f;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->F:Lu2/o;

    .line 19
    .line 20
    iput-object v1, v2, Lu2/o;->a:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ly0/f;->p(Ly0/b;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ly0/f;->a(Ly0/b;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->D:Landroidx/emoji2/text/t;

    .line 29
    .line 30
    iget-object v2, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lt2/c;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->E:Lu2/n;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ly0/f;->p(Ly0/b;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ly0/f;->a(Ly0/b;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Ly0/f;->l(Landroid/view/View;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lt2/c;

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    iget-object v2, v1, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lcom/google/android/material/navigation/NavigationView;

    .line 59
    .line 60
    iget-object v1, v1, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lcom/google/android/material/navigation/NavigationView;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    invoke-virtual {v0, v2, v1, v3}, Lt2/c;->b(Lt2/b;Landroid/view/View;Z)V

    .line 66
    .line 67
    .line 68
    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lr2/u;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->s:Lj/d;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v1, v0, Ly0/f;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    check-cast v0, Ly0/f;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->E:Lu2/n;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ly0/f;->p(Ly0/b;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->F:Lu2/o;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ly0/f;->p(Ly0/b;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->D:Landroidx/emoji2/text/t;

    .line 34
    .line 35
    iget-object v1, v0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lt2/c;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lt2/c;->c(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    const/high16 v2, 0x40000000    # 2.0f

    .line 8
    .line 9
    iget v3, p0, Lcom/google/android/material/navigation/NavigationView;->p:I

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v3, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

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
    check-cast p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->f:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->m:Lr2/f;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;->h:Landroid/os/Bundle;

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
    new-instance v1, Lcom/google/android/material/navigation/NavigationView$SavedState;

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
    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationView$SavedState;->h:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->m:Lr2/f;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lj/m;->v(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/navigation/NavigationView;->g(II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setBottomInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->u:Z

    .line 2
    .line 3
    return-void
.end method

.method public setCheckedItem(I)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->m:Lr2/f;

    invoke-virtual {v0, p1}, Lj/m;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 30
    check-cast p1, Lj/o;

    .line 31
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    iget-object v0, v0, Lr2/q;->j:Lr2/i;

    .line 32
    invoke-virtual {v0, p1}, Lr2/i;->h(Lj/o;)V

    :cond_0
    return-void
.end method

.method public setCheckedItem(Landroid/view/MenuItem;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->m:Lr2/f;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, Lj/m;->findItem(I)Landroid/view/MenuItem;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    check-cast p1, Lj/o;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 16
    .line 17
    iget-object v0, v0, Lr2/q;->j:Lr2/i;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lr2/i;->h(Lj/o;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p1, "Called setCheckedItem(MenuItem) with an item that is not in the current menu."

    .line 24
    .line 25
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setDividerInsetEnd(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput p1, v0, Lr2/q;->y:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setDividerInsetStart(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput p1, v0, Lr2/q;->x:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->b()V

    .line 6
    .line 7
    .line 8
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

.method public setEndInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->w:Z

    .line 2
    .line 3
    return-void
.end method

.method public setForceCompatClippingEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->A:La3/a0;

    .line 2
    .line 3
    iget-boolean v1, v0, La3/a0;->a:Z

    .line 4
    .line 5
    if-eq p1, v1, :cond_0

    .line 6
    .line 7
    iput-boolean p1, v0, La3/a0;->a:Z

    .line 8
    .line 9
    invoke-virtual {v0, p0}, La3/a0;->a(Lcom/google/android/material/navigation/NavigationView;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput-object p1, v0, Lr2/q;->r:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setItemHorizontalPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput p1, v0, Lr2/q;->t:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setItemHorizontalPaddingResource(I)V
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
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 10
    .line 11
    iput p1, v0, Lr2/q;->t:I

    .line 12
    .line 13
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setItemIconPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput p1, v0, Lr2/q;->v:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setItemIconPaddingResource(I)V
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
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 10
    .line 11
    iput p1, v0, Lr2/q;->v:I

    .line 12
    .line 13
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iget v1, v0, Lr2/q;->w:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Lr2/q;->w:I

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, v0, Lr2/q;->B:Z

    .line 11
    .line 12
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput-object p1, v0, Lr2/q;->q:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setItemMaxLines(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput p1, v0, Lr2/q;->D:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setItemTextAppearance(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput p1, v0, Lr2/q;->n:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput-boolean p1, v0, Lr2/q;->o:Z

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput-object p1, v0, Lr2/q;->p:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setItemVerticalPadding(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput p1, v0, Lr2/q;->u:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setItemVerticalPaddingResource(I)V
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
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 10
    .line 11
    iput p1, v0, Lr2/q;->u:I

    .line 12
    .line 13
    invoke-virtual {v0}, Lr2/q;->g()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setNavigationItemSelectedListener(Lu2/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->o:Lu2/p;

    .line 2
    .line 3
    return-void
.end method

.method public setOverScrollMode(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput p1, v0, Lr2/q;->G:I

    .line 9
    .line 10
    iget-object v0, v0, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setStartInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->v:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSubheaderInsetEnd(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput p1, v0, Lr2/q;->A:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->c()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setSubheaderInsetStart(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 2
    .line 3
    iput p1, v0, Lr2/q;->z:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lr2/q;->c()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTopInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->t:Z

    .line 2
    .line 3
    return-void
.end method
