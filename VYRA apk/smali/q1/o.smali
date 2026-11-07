.class public final Lq1/o;
.super Lq1/f;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final o:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public g:Lq1/m;

.field public h:Landroid/graphics/PorterDuffColorFilter;

.field public i:Landroid/graphics/ColorFilter;

.field public j:Z

.field public k:Z

.field public final l:[F

.field public final m:Landroid/graphics/Matrix;

.field public final n:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    sput-object v0, Lq1/o;->o:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lq1/o;->k:Z

    .line 6
    .line 7
    const/16 v0, 0x9

    .line 8
    .line 9
    new-array v0, v0, [F

    .line 10
    .line 11
    iput-object v0, p0, Lq1/o;->l:[F

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lq1/o;->m:Landroid/graphics/Matrix;

    .line 19
    .line 20
    new-instance v0, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lq1/o;->n:Landroid/graphics/Rect;

    .line 26
    .line 27
    new-instance v0, Lq1/m;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iput-object v1, v0, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 34
    .line 35
    sget-object v1, Lq1/o;->o:Landroid/graphics/PorterDuff$Mode;

    .line 36
    .line 37
    iput-object v1, v0, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 38
    .line 39
    new-instance v1, Lq1/l;

    .line 40
    .line 41
    invoke-direct {v1}, Lq1/l;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, v0, Lq1/m;->b:Lq1/l;

    .line 45
    .line 46
    iput-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Lq1/m;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Lq1/o;->k:Z

    const/16 v0, 0x9

    .line 51
    new-array v0, v0, [F

    iput-object v0, p0, Lq1/o;->l:[F

    .line 52
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lq1/o;->m:Landroid/graphics/Matrix;

    .line 53
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lq1/o;->n:Landroid/graphics/Rect;

    .line 54
    iput-object p1, p0, Lq1/o;->g:Lq1/m;

    .line 55
    iget-object v0, p1, Lq1/m;->c:Landroid/content/res/ColorStateList;

    iget-object p1, p1, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, v0, p1}, Lq1/o;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Lq1/o;->h:Landroid/graphics/PorterDuffColorFilter;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lq1/f;->getState()[I

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public final canApplyTheme()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v2, v0, Lq1/o;->n:Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-lez v3, :cond_d

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-gtz v3, :cond_1

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_1
    iget-object v3, v0, Lq1/o;->i:Landroid/graphics/ColorFilter;

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    iget-object v3, v0, Lq1/o;->h:Landroid/graphics/PorterDuffColorFilter;

    .line 37
    .line 38
    :cond_2
    iget-object v4, v0, Lq1/o;->m:Landroid/graphics/Matrix;

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    .line 41
    .line 42
    .line 43
    iget-object v5, v0, Lq1/o;->l:[F

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->getValues([F)V

    .line 46
    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    aget v6, v5, v4

    .line 50
    .line 51
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    const/4 v7, 0x4

    .line 56
    aget v7, v5, v7

    .line 57
    .line 58
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/4 v8, 0x1

    .line 63
    aget v9, v5, v8

    .line 64
    .line 65
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    const/4 v10, 0x3

    .line 70
    aget v5, v5, v10

    .line 71
    .line 72
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    const/4 v10, 0x0

    .line 77
    cmpl-float v9, v9, v10

    .line 78
    .line 79
    const/high16 v11, 0x3f800000    # 1.0f

    .line 80
    .line 81
    if-nez v9, :cond_3

    .line 82
    .line 83
    cmpl-float v5, v5, v10

    .line 84
    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    :cond_3
    move v6, v11

    .line 88
    move v7, v6

    .line 89
    :cond_4
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    int-to-float v5, v5

    .line 94
    mul-float/2addr v5, v6

    .line 95
    float-to-int v5, v5

    .line 96
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    int-to-float v6, v6

    .line 101
    mul-float/2addr v6, v7

    .line 102
    float-to-int v6, v6

    .line 103
    const/16 v7, 0x800

    .line 104
    .line 105
    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-lez v5, :cond_d

    .line 114
    .line 115
    if-gtz v6, :cond_5

    .line 116
    .line 117
    goto/16 :goto_4

    .line 118
    .line 119
    :cond_5
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    iget v9, v2, Landroid/graphics/Rect;->left:I

    .line 124
    .line 125
    int-to-float v9, v9

    .line 126
    iget v12, v2, Landroid/graphics/Rect;->top:I

    .line 127
    .line 128
    int-to-float v12, v12

    .line 129
    invoke-virtual {v1, v9, v12}, Landroid/graphics/Canvas;->translate(FF)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lq1/o;->isAutoMirrored()Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_6

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    if-ne v9, v8, :cond_6

    .line 143
    .line 144
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    int-to-float v9, v9

    .line 149
    invoke-virtual {v1, v9, v10}, Landroid/graphics/Canvas;->translate(FF)V

    .line 150
    .line 151
    .line 152
    const/high16 v9, -0x40800000    # -1.0f

    .line 153
    .line 154
    invoke-virtual {v1, v9, v11}, Landroid/graphics/Canvas;->scale(FF)V

    .line 155
    .line 156
    .line 157
    :cond_6
    invoke-virtual {v2, v4, v4}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 158
    .line 159
    .line 160
    iget-object v9, v0, Lq1/o;->g:Lq1/m;

    .line 161
    .line 162
    iget-object v10, v9, Lq1/m;->f:Landroid/graphics/Bitmap;

    .line 163
    .line 164
    if-eqz v10, :cond_7

    .line 165
    .line 166
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    if-ne v5, v10, :cond_7

    .line 171
    .line 172
    iget-object v10, v9, Lq1/m;->f:Landroid/graphics/Bitmap;

    .line 173
    .line 174
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-ne v6, v10, :cond_7

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_7
    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 182
    .line 183
    invoke-static {v5, v6, v10}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    iput-object v10, v9, Lq1/m;->f:Landroid/graphics/Bitmap;

    .line 188
    .line 189
    iput-boolean v8, v9, Lq1/m;->k:Z

    .line 190
    .line 191
    :goto_0
    iget-boolean v9, v0, Lq1/o;->k:Z

    .line 192
    .line 193
    iget-object v10, v0, Lq1/o;->g:Lq1/m;

    .line 194
    .line 195
    if-nez v9, :cond_8

    .line 196
    .line 197
    iget-object v9, v10, Lq1/m;->f:Landroid/graphics/Bitmap;

    .line 198
    .line 199
    invoke-virtual {v9, v4}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 200
    .line 201
    .line 202
    new-instance v15, Landroid/graphics/Canvas;

    .line 203
    .line 204
    iget-object v4, v10, Lq1/m;->f:Landroid/graphics/Bitmap;

    .line 205
    .line 206
    invoke-direct {v15, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 207
    .line 208
    .line 209
    iget-object v12, v10, Lq1/m;->b:Lq1/l;

    .line 210
    .line 211
    iget-object v13, v12, Lq1/l;->g:Lq1/i;

    .line 212
    .line 213
    sget-object v14, Lq1/l;->p:Landroid/graphics/Matrix;

    .line 214
    .line 215
    move/from16 v16, v5

    .line 216
    .line 217
    move/from16 v17, v6

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v17}, Lq1/l;->a(Lq1/i;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_8
    move/from16 v16, v5

    .line 224
    .line 225
    move/from16 v17, v6

    .line 226
    .line 227
    iget-boolean v5, v10, Lq1/m;->k:Z

    .line 228
    .line 229
    if-nez v5, :cond_9

    .line 230
    .line 231
    iget-object v5, v10, Lq1/m;->g:Landroid/content/res/ColorStateList;

    .line 232
    .line 233
    iget-object v6, v10, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 234
    .line 235
    if-ne v5, v6, :cond_9

    .line 236
    .line 237
    iget-object v5, v10, Lq1/m;->h:Landroid/graphics/PorterDuff$Mode;

    .line 238
    .line 239
    iget-object v6, v10, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 240
    .line 241
    if-ne v5, v6, :cond_9

    .line 242
    .line 243
    iget-boolean v5, v10, Lq1/m;->j:Z

    .line 244
    .line 245
    iget-boolean v6, v10, Lq1/m;->e:Z

    .line 246
    .line 247
    if-ne v5, v6, :cond_9

    .line 248
    .line 249
    iget v5, v10, Lq1/m;->i:I

    .line 250
    .line 251
    iget-object v6, v10, Lq1/m;->b:Lq1/l;

    .line 252
    .line 253
    invoke-virtual {v6}, Lq1/l;->getRootAlpha()I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-ne v5, v6, :cond_9

    .line 258
    .line 259
    goto :goto_1

    .line 260
    :cond_9
    iget-object v5, v0, Lq1/o;->g:Lq1/m;

    .line 261
    .line 262
    iget-object v6, v5, Lq1/m;->f:Landroid/graphics/Bitmap;

    .line 263
    .line 264
    invoke-virtual {v6, v4}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 265
    .line 266
    .line 267
    new-instance v15, Landroid/graphics/Canvas;

    .line 268
    .line 269
    iget-object v6, v5, Lq1/m;->f:Landroid/graphics/Bitmap;

    .line 270
    .line 271
    invoke-direct {v15, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 272
    .line 273
    .line 274
    iget-object v12, v5, Lq1/m;->b:Lq1/l;

    .line 275
    .line 276
    iget-object v13, v12, Lq1/l;->g:Lq1/i;

    .line 277
    .line 278
    sget-object v14, Lq1/l;->p:Landroid/graphics/Matrix;

    .line 279
    .line 280
    invoke-virtual/range {v12 .. v17}, Lq1/l;->a(Lq1/i;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    .line 281
    .line 282
    .line 283
    iget-object v5, v0, Lq1/o;->g:Lq1/m;

    .line 284
    .line 285
    iget-object v6, v5, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 286
    .line 287
    iput-object v6, v5, Lq1/m;->g:Landroid/content/res/ColorStateList;

    .line 288
    .line 289
    iget-object v6, v5, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 290
    .line 291
    iput-object v6, v5, Lq1/m;->h:Landroid/graphics/PorterDuff$Mode;

    .line 292
    .line 293
    iget-object v6, v5, Lq1/m;->b:Lq1/l;

    .line 294
    .line 295
    invoke-virtual {v6}, Lq1/l;->getRootAlpha()I

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    iput v6, v5, Lq1/m;->i:I

    .line 300
    .line 301
    iget-boolean v6, v5, Lq1/m;->e:Z

    .line 302
    .line 303
    iput-boolean v6, v5, Lq1/m;->j:Z

    .line 304
    .line 305
    iput-boolean v4, v5, Lq1/m;->k:Z

    .line 306
    .line 307
    :goto_1
    iget-object v4, v0, Lq1/o;->g:Lq1/m;

    .line 308
    .line 309
    iget-object v5, v4, Lq1/m;->b:Lq1/l;

    .line 310
    .line 311
    invoke-virtual {v5}, Lq1/l;->getRootAlpha()I

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    const/16 v6, 0xff

    .line 316
    .line 317
    const/4 v9, 0x0

    .line 318
    if-ge v5, v6, :cond_a

    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_a
    if-nez v3, :cond_b

    .line 322
    .line 323
    move-object v3, v9

    .line 324
    goto :goto_3

    .line 325
    :cond_b
    :goto_2
    iget-object v5, v4, Lq1/m;->l:Landroid/graphics/Paint;

    .line 326
    .line 327
    if-nez v5, :cond_c

    .line 328
    .line 329
    new-instance v5, Landroid/graphics/Paint;

    .line 330
    .line 331
    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 332
    .line 333
    .line 334
    iput-object v5, v4, Lq1/m;->l:Landroid/graphics/Paint;

    .line 335
    .line 336
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 337
    .line 338
    .line 339
    :cond_c
    iget-object v5, v4, Lq1/m;->l:Landroid/graphics/Paint;

    .line 340
    .line 341
    iget-object v6, v4, Lq1/m;->b:Lq1/l;

    .line 342
    .line 343
    invoke-virtual {v6}, Lq1/l;->getRootAlpha()I

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 348
    .line 349
    .line 350
    iget-object v5, v4, Lq1/m;->l:Landroid/graphics/Paint;

    .line 351
    .line 352
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 353
    .line 354
    .line 355
    iget-object v3, v4, Lq1/m;->l:Landroid/graphics/Paint;

    .line 356
    .line 357
    :goto_3
    iget-object v4, v4, Lq1/m;->f:Landroid/graphics/Bitmap;

    .line 358
    .line 359
    invoke-virtual {v1, v4, v9, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 363
    .line 364
    .line 365
    :cond_d
    :goto_4
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 11
    .line 12
    iget-object v0, v0, Lq1/m;->b:Lq1/l;

    .line 13
    .line 14
    invoke-virtual {v0}, Lq1/l;->getRootAlpha()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getChangingConfigurations()I
    .locals 2

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lq1/o;->g:Lq1/m;

    .line 15
    .line 16
    invoke-virtual {v1}, Lq1/m;->getChangingConfigurations()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    or-int/2addr v0, v1

    .line 21
    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lq1/o;->i:Landroid/graphics/ColorFilter;

    .line 11
    .line 12
    return-object v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lq1/n;

    .line 6
    .line 7
    iget-object v1, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Lq1/n;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 18
    .line 19
    invoke-virtual {p0}, Lq1/o;->getChangingConfigurations()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, v0, Lq1/m;->a:I

    .line 24
    .line 25
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 26
    .line 27
    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 11
    .line 12
    iget-object v0, v0, Lq1/m;->b:Lq1/l;

    .line 13
    .line 14
    iget v0, v0, Lq1/l;->i:F

    .line 15
    .line 16
    float-to-int v0, v0

    .line 17
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 11
    .line 12
    iget-object v0, v0, Lq1/m;->b:Lq1/l;

    .line 13
    .line 14
    iget v0, v0, Lq1/l;->h:F

    .line 15
    .line 16
    float-to-int v0, v0

    .line 17
    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, -0x3

    .line 11
    return v0
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1187
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1188
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1189
    invoke-virtual {p0, p1, p2, p3, v0}, Lq1/o;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    iget-object v0, v1, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v6, v1, Lq1/o;->g:Lq1/m;

    .line 20
    .line 21
    new-instance v0, Lq1/l;

    .line 22
    .line 23
    invoke-direct {v0}, Lq1/l;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, v6, Lq1/m;->b:Lq1/l;

    .line 27
    .line 28
    sget-object v0, Lq1/a;->a:[I

    .line 29
    .line 30
    invoke-static {v2, v5, v4, v0}, Le0/b;->g(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    iget-object v8, v1, Lq1/o;->g:Lq1/m;

    .line 35
    .line 36
    iget-object v9, v8, Lq1/m;->b:Lq1/l;

    .line 37
    .line 38
    const-string v0, "tintMode"

    .line 39
    .line 40
    invoke-static {v3, v0}, Le0/b;->d(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v10, -0x1

    .line 45
    const/4 v11, 0x6

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    move v0, v10

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v7, v11, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    :goto_0
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 55
    .line 56
    const/16 v13, 0x9

    .line 57
    .line 58
    const/4 v14, 0x3

    .line 59
    const/4 v15, 0x5

    .line 60
    if-eq v0, v14, :cond_3

    .line 61
    .line 62
    if-eq v0, v15, :cond_4

    .line 63
    .line 64
    if-eq v0, v13, :cond_2

    .line 65
    .line 66
    packed-switch v0, :pswitch_data_0

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :pswitch_0
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :pswitch_1
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_2
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    sget-object v12, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 83
    .line 84
    :cond_4
    :goto_1
    iput-object v12, v8, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 85
    .line 86
    const-string v0, "tint"

    .line 87
    .line 88
    const-string v12, "http://schemas.android.com/apk/res/android"

    .line 89
    .line 90
    invoke-interface {v3, v12, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const/16 v16, 0x0

    .line 95
    .line 96
    const/4 v11, 0x2

    .line 97
    const/4 v13, 0x0

    .line 98
    const/4 v10, 0x1

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    new-instance v0, Landroid/util/TypedValue;

    .line 102
    .line 103
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v7, v10, v0}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 107
    .line 108
    .line 109
    iget v14, v0, Landroid/util/TypedValue;->type:I

    .line 110
    .line 111
    if-eq v14, v11, :cond_7

    .line 112
    .line 113
    const/16 v11, 0x1c

    .line 114
    .line 115
    if-lt v14, v11, :cond_6

    .line 116
    .line 117
    const/16 v11, 0x1f

    .line 118
    .line 119
    if-gt v14, v11, :cond_6

    .line 120
    .line 121
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 122
    .line 123
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 124
    .line 125
    .line 126
    move-result-object v16

    .line 127
    :cond_5
    :goto_2
    move-object/from16 v0, v16

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v7, v10, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    sget-object v14, Le0/c;->a:Ljava/lang/ThreadLocal;

    .line 139
    .line 140
    :try_start_0
    invoke-virtual {v0, v11}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    invoke-static {v0, v11, v5}, Le0/c;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 145
    .line 146
    .line 147
    move-result-object v16
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    goto :goto_2

    .line 149
    :catch_0
    move-exception v0

    .line 150
    const-string v11, "CSLCompat"

    .line 151
    .line 152
    const-string v14, "Failed to inflate ColorStateList."

    .line 153
    .line 154
    invoke-static {v11, v14, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_7
    new-instance v2, Ljava/lang/UnsupportedOperationException;

    .line 159
    .line 160
    new-instance v3, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v4, "Failed to resolve attribute at index 1: "

    .line 163
    .line 164
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-direct {v2, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v2

    .line 178
    :goto_3
    if-eqz v0, :cond_8

    .line 179
    .line 180
    iput-object v0, v8, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 181
    .line 182
    :cond_8
    iget-boolean v0, v8, Lq1/m;->e:Z

    .line 183
    .line 184
    const-string v11, "autoMirrored"

    .line 185
    .line 186
    invoke-interface {v3, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    if-eqz v11, :cond_9

    .line 191
    .line 192
    invoke-virtual {v7, v15, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    :cond_9
    iput-boolean v0, v8, Lq1/m;->e:Z

    .line 197
    .line 198
    iget v0, v9, Lq1/l;->j:F

    .line 199
    .line 200
    const-string v8, "viewportWidth"

    .line 201
    .line 202
    invoke-interface {v3, v12, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    const/4 v11, 0x7

    .line 207
    if-eqz v8, :cond_a

    .line 208
    .line 209
    invoke-virtual {v7, v11, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    :cond_a
    iput v0, v9, Lq1/l;->j:F

    .line 214
    .line 215
    iget v0, v9, Lq1/l;->k:F

    .line 216
    .line 217
    const-string v8, "viewportHeight"

    .line 218
    .line 219
    invoke-interface {v3, v12, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    const/16 v14, 0x8

    .line 224
    .line 225
    if-eqz v8, :cond_b

    .line 226
    .line 227
    invoke-virtual {v7, v14, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    :cond_b
    iput v0, v9, Lq1/l;->k:F

    .line 232
    .line 233
    iget v8, v9, Lq1/l;->j:F

    .line 234
    .line 235
    const/4 v15, 0x0

    .line 236
    cmpg-float v8, v8, v15

    .line 237
    .line 238
    if-lez v8, :cond_39

    .line 239
    .line 240
    cmpg-float v0, v0, v15

    .line 241
    .line 242
    if-lez v0, :cond_38

    .line 243
    .line 244
    iget v0, v9, Lq1/l;->h:F

    .line 245
    .line 246
    const/4 v8, 0x3

    .line 247
    invoke-virtual {v7, v8, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    iput v0, v9, Lq1/l;->h:F

    .line 252
    .line 253
    iget v0, v9, Lq1/l;->i:F

    .line 254
    .line 255
    const/4 v8, 0x2

    .line 256
    invoke-virtual {v7, v8, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    iput v0, v9, Lq1/l;->i:F

    .line 261
    .line 262
    iget v8, v9, Lq1/l;->h:F

    .line 263
    .line 264
    cmpg-float v8, v8, v15

    .line 265
    .line 266
    if-lez v8, :cond_37

    .line 267
    .line 268
    cmpg-float v0, v0, v15

    .line 269
    .line 270
    if-lez v0, :cond_36

    .line 271
    .line 272
    invoke-virtual {v9}, Lq1/l;->getAlpha()F

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    const-string v8, "alpha"

    .line 277
    .line 278
    invoke-interface {v3, v12, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    const/4 v11, 0x4

    .line 283
    if-eqz v8, :cond_c

    .line 284
    .line 285
    invoke-virtual {v7, v11, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    :cond_c
    invoke-virtual {v9, v0}, Lq1/l;->setAlpha(F)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v7, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    if-eqz v0, :cond_d

    .line 297
    .line 298
    iput-object v0, v9, Lq1/l;->m:Ljava/lang/String;

    .line 299
    .line 300
    iget-object v8, v9, Lq1/l;->o:Lp/f;

    .line 301
    .line 302
    invoke-virtual {v8, v0, v9}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    :cond_d
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1}, Lq1/o;->getChangingConfigurations()I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    iput v0, v6, Lq1/m;->a:I

    .line 313
    .line 314
    iput-boolean v10, v6, Lq1/m;->k:Z

    .line 315
    .line 316
    iget-object v0, v1, Lq1/o;->g:Lq1/m;

    .line 317
    .line 318
    iget-object v7, v0, Lq1/m;->b:Lq1/l;

    .line 319
    .line 320
    new-instance v8, Ljava/util/ArrayDeque;

    .line 321
    .line 322
    invoke-direct {v8}, Ljava/util/ArrayDeque;-><init>()V

    .line 323
    .line 324
    .line 325
    iget-object v9, v7, Lq1/l;->g:Lq1/i;

    .line 326
    .line 327
    iget-object v7, v7, Lq1/l;->o:Lp/f;

    .line 328
    .line 329
    invoke-virtual {v8, v9}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 337
    .line 338
    .line 339
    move-result v21

    .line 340
    add-int/lit8 v11, v21, 0x1

    .line 341
    .line 342
    move/from16 v21, v10

    .line 343
    .line 344
    :goto_4
    if-eq v9, v10, :cond_34

    .line 345
    .line 346
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 347
    .line 348
    .line 349
    move-result v14

    .line 350
    if-ge v14, v11, :cond_e

    .line 351
    .line 352
    const/4 v14, 0x3

    .line 353
    if-eq v9, v14, :cond_34

    .line 354
    .line 355
    :cond_e
    const-string v14, "group"

    .line 356
    .line 357
    const/4 v10, 0x2

    .line 358
    if-ne v9, v10, :cond_32

    .line 359
    .line 360
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v9

    .line 364
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    check-cast v10, Lq1/i;

    .line 369
    .line 370
    const-string v13, "path"

    .line 371
    .line 372
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v13

    .line 376
    const-string v15, "fillType"

    .line 377
    .line 378
    move/from16 v25, v11

    .line 379
    .line 380
    const-string v11, "pathData"

    .line 381
    .line 382
    if-eqz v13, :cond_23

    .line 383
    .line 384
    new-instance v9, Lq1/h;

    .line 385
    .line 386
    invoke-direct {v9}, Lq1/k;-><init>()V

    .line 387
    .line 388
    .line 389
    const/4 v13, 0x0

    .line 390
    iput v13, v9, Lq1/h;->e:F

    .line 391
    .line 392
    const/high16 v14, 0x3f800000    # 1.0f

    .line 393
    .line 394
    iput v14, v9, Lq1/h;->g:F

    .line 395
    .line 396
    iput v14, v9, Lq1/h;->h:F

    .line 397
    .line 398
    iput v13, v9, Lq1/h;->i:F

    .line 399
    .line 400
    iput v14, v9, Lq1/h;->j:F

    .line 401
    .line 402
    iput v13, v9, Lq1/h;->k:F

    .line 403
    .line 404
    sget-object v14, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 405
    .line 406
    iput-object v14, v9, Lq1/h;->l:Landroid/graphics/Paint$Cap;

    .line 407
    .line 408
    sget-object v13, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 409
    .line 410
    iput-object v13, v9, Lq1/h;->m:Landroid/graphics/Paint$Join;

    .line 411
    .line 412
    move-object/from16 v21, v13

    .line 413
    .line 414
    const/high16 v13, 0x40800000    # 4.0f

    .line 415
    .line 416
    iput v13, v9, Lq1/h;->n:F

    .line 417
    .line 418
    sget-object v13, Lq1/a;->c:[I

    .line 419
    .line 420
    invoke-static {v2, v5, v4, v13}, Le0/b;->g(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 421
    .line 422
    .line 423
    move-result-object v13

    .line 424
    invoke-interface {v3, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v11

    .line 428
    if-eqz v11, :cond_21

    .line 429
    .line 430
    move-object/from16 v26, v14

    .line 431
    .line 432
    const/4 v11, 0x0

    .line 433
    invoke-virtual {v13, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v14

    .line 437
    if-eqz v14, :cond_f

    .line 438
    .line 439
    iput-object v14, v9, Lq1/k;->b:Ljava/lang/String;

    .line 440
    .line 441
    :cond_f
    const/4 v11, 0x2

    .line 442
    invoke-virtual {v13, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v14

    .line 446
    if-eqz v14, :cond_10

    .line 447
    .line 448
    invoke-static {v14}, Lu1/h0;->s(Ljava/lang/String;)[Lf0/d;

    .line 449
    .line 450
    .line 451
    move-result-object v11

    .line 452
    iput-object v11, v9, Lq1/k;->a:[Lf0/d;

    .line 453
    .line 454
    :cond_10
    const-string v11, "fillColor"

    .line 455
    .line 456
    const/4 v14, 0x1

    .line 457
    invoke-static {v13, v3, v5, v11, v14}, Le0/b;->c(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Le0/d;

    .line 458
    .line 459
    .line 460
    move-result-object v11

    .line 461
    iput-object v11, v9, Lq1/h;->f:Le0/d;

    .line 462
    .line 463
    iget v11, v9, Lq1/h;->h:F

    .line 464
    .line 465
    const-string v14, "fillAlpha"

    .line 466
    .line 467
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v14

    .line 471
    if-eqz v14, :cond_11

    .line 472
    .line 473
    const/16 v14, 0xc

    .line 474
    .line 475
    invoke-virtual {v13, v14, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    :cond_11
    iput v11, v9, Lq1/h;->h:F

    .line 480
    .line 481
    const-string v11, "strokeLineCap"

    .line 482
    .line 483
    invoke-interface {v3, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v11

    .line 487
    if-eqz v11, :cond_12

    .line 488
    .line 489
    const/16 v11, 0x8

    .line 490
    .line 491
    const/4 v14, -0x1

    .line 492
    invoke-virtual {v13, v11, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 493
    .line 494
    .line 495
    move-result v23

    .line 496
    move/from16 v14, v23

    .line 497
    .line 498
    goto :goto_5

    .line 499
    :cond_12
    const/4 v14, -0x1

    .line 500
    :goto_5
    iget-object v11, v9, Lq1/h;->l:Landroid/graphics/Paint$Cap;

    .line 501
    .line 502
    if-eqz v14, :cond_15

    .line 503
    .line 504
    move-object/from16 v27, v11

    .line 505
    .line 506
    const/4 v11, 0x1

    .line 507
    if-eq v14, v11, :cond_14

    .line 508
    .line 509
    const/4 v11, 0x2

    .line 510
    if-eq v14, v11, :cond_13

    .line 511
    .line 512
    move-object/from16 v14, v27

    .line 513
    .line 514
    goto :goto_6

    .line 515
    :cond_13
    sget-object v14, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 516
    .line 517
    goto :goto_6

    .line 518
    :cond_14
    sget-object v14, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 519
    .line 520
    goto :goto_6

    .line 521
    :cond_15
    move-object/from16 v14, v26

    .line 522
    .line 523
    :goto_6
    iput-object v14, v9, Lq1/h;->l:Landroid/graphics/Paint$Cap;

    .line 524
    .line 525
    const-string v11, "strokeLineJoin"

    .line 526
    .line 527
    invoke-interface {v3, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v11

    .line 531
    if-eqz v11, :cond_16

    .line 532
    .line 533
    const/4 v11, -0x1

    .line 534
    const/16 v14, 0x9

    .line 535
    .line 536
    invoke-virtual {v13, v14, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 537
    .line 538
    .line 539
    move-result v18

    .line 540
    move/from16 v11, v18

    .line 541
    .line 542
    goto :goto_7

    .line 543
    :cond_16
    const/4 v11, -0x1

    .line 544
    :goto_7
    iget-object v14, v9, Lq1/h;->m:Landroid/graphics/Paint$Join;

    .line 545
    .line 546
    if-eqz v11, :cond_19

    .line 547
    .line 548
    move-object/from16 v26, v14

    .line 549
    .line 550
    const/4 v14, 0x1

    .line 551
    if-eq v11, v14, :cond_18

    .line 552
    .line 553
    const/4 v14, 0x2

    .line 554
    if-eq v11, v14, :cond_17

    .line 555
    .line 556
    move-object/from16 v11, v26

    .line 557
    .line 558
    goto :goto_8

    .line 559
    :cond_17
    sget-object v11, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    .line 560
    .line 561
    goto :goto_8

    .line 562
    :cond_18
    sget-object v11, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 563
    .line 564
    goto :goto_8

    .line 565
    :cond_19
    move-object/from16 v11, v21

    .line 566
    .line 567
    :goto_8
    iput-object v11, v9, Lq1/h;->m:Landroid/graphics/Paint$Join;

    .line 568
    .line 569
    iget v11, v9, Lq1/h;->n:F

    .line 570
    .line 571
    const-string v14, "strokeMiterLimit"

    .line 572
    .line 573
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v14

    .line 577
    if-eqz v14, :cond_1a

    .line 578
    .line 579
    const/16 v14, 0xa

    .line 580
    .line 581
    invoke-virtual {v13, v14, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 582
    .line 583
    .line 584
    move-result v11

    .line 585
    :cond_1a
    iput v11, v9, Lq1/h;->n:F

    .line 586
    .line 587
    const-string v11, "strokeColor"

    .line 588
    .line 589
    const/4 v14, 0x3

    .line 590
    invoke-static {v13, v3, v5, v11, v14}, Le0/b;->c(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Le0/d;

    .line 591
    .line 592
    .line 593
    move-result-object v11

    .line 594
    iput-object v11, v9, Lq1/h;->d:Le0/d;

    .line 595
    .line 596
    iget v11, v9, Lq1/h;->g:F

    .line 597
    .line 598
    const-string v14, "strokeAlpha"

    .line 599
    .line 600
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v14

    .line 604
    if-eqz v14, :cond_1b

    .line 605
    .line 606
    const/16 v14, 0xb

    .line 607
    .line 608
    invoke-virtual {v13, v14, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 609
    .line 610
    .line 611
    move-result v11

    .line 612
    :cond_1b
    iput v11, v9, Lq1/h;->g:F

    .line 613
    .line 614
    iget v11, v9, Lq1/h;->e:F

    .line 615
    .line 616
    const-string v14, "strokeWidth"

    .line 617
    .line 618
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v14

    .line 622
    if-eqz v14, :cond_1c

    .line 623
    .line 624
    const/4 v14, 0x4

    .line 625
    invoke-virtual {v13, v14, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 626
    .line 627
    .line 628
    move-result v11

    .line 629
    :cond_1c
    iput v11, v9, Lq1/h;->e:F

    .line 630
    .line 631
    iget v11, v9, Lq1/h;->j:F

    .line 632
    .line 633
    const-string v14, "trimPathEnd"

    .line 634
    .line 635
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v14

    .line 639
    if-eqz v14, :cond_1d

    .line 640
    .line 641
    const/4 v14, 0x6

    .line 642
    invoke-virtual {v13, v14, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 643
    .line 644
    .line 645
    move-result v11

    .line 646
    :cond_1d
    iput v11, v9, Lq1/h;->j:F

    .line 647
    .line 648
    iget v11, v9, Lq1/h;->k:F

    .line 649
    .line 650
    const-string v14, "trimPathOffset"

    .line 651
    .line 652
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v14

    .line 656
    if-eqz v14, :cond_1e

    .line 657
    .line 658
    const/4 v14, 0x7

    .line 659
    invoke-virtual {v13, v14, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 660
    .line 661
    .line 662
    move-result v11

    .line 663
    :cond_1e
    iput v11, v9, Lq1/h;->k:F

    .line 664
    .line 665
    iget v11, v9, Lq1/h;->i:F

    .line 666
    .line 667
    const-string v14, "trimPathStart"

    .line 668
    .line 669
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v14

    .line 673
    if-eqz v14, :cond_1f

    .line 674
    .line 675
    const/4 v14, 0x5

    .line 676
    invoke-virtual {v13, v14, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 677
    .line 678
    .line 679
    move-result v11

    .line 680
    :cond_1f
    iput v11, v9, Lq1/h;->i:F

    .line 681
    .line 682
    iget v11, v9, Lq1/k;->c:I

    .line 683
    .line 684
    invoke-interface {v3, v12, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v14

    .line 688
    if-eqz v14, :cond_20

    .line 689
    .line 690
    const/16 v14, 0xd

    .line 691
    .line 692
    invoke-virtual {v13, v14, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 693
    .line 694
    .line 695
    move-result v11

    .line 696
    :cond_20
    iput v11, v9, Lq1/k;->c:I

    .line 697
    .line 698
    :cond_21
    invoke-virtual {v13}, Landroid/content/res/TypedArray;->recycle()V

    .line 699
    .line 700
    .line 701
    iget-object v10, v10, Lq1/i;->b:Ljava/util/ArrayList;

    .line 702
    .line 703
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    invoke-virtual {v9}, Lq1/k;->getPathName()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v10

    .line 710
    if-eqz v10, :cond_22

    .line 711
    .line 712
    invoke-virtual {v9}, Lq1/k;->getPathName()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v10

    .line 716
    invoke-virtual {v7, v10, v9}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    :cond_22
    iget v9, v0, Lq1/m;->a:I

    .line 720
    .line 721
    iput v9, v0, Lq1/m;->a:I

    .line 722
    .line 723
    const/4 v13, 0x0

    .line 724
    const/4 v15, 0x2

    .line 725
    const/16 v18, 0x9

    .line 726
    .line 727
    const/16 v19, -0x1

    .line 728
    .line 729
    const/16 v21, 0x0

    .line 730
    .line 731
    const/16 v23, 0x8

    .line 732
    .line 733
    goto/16 :goto_e

    .line 734
    .line 735
    :cond_23
    const/16 v18, 0x9

    .line 736
    .line 737
    const/16 v19, -0x1

    .line 738
    .line 739
    const/16 v23, 0x8

    .line 740
    .line 741
    const-string v13, "clip-path"

    .line 742
    .line 743
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    move-result v13

    .line 747
    if-eqz v13, :cond_2a

    .line 748
    .line 749
    new-instance v9, Lq1/g;

    .line 750
    .line 751
    invoke-direct {v9}, Lq1/k;-><init>()V

    .line 752
    .line 753
    .line 754
    invoke-interface {v3, v12, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v11

    .line 758
    if-eqz v11, :cond_27

    .line 759
    .line 760
    sget-object v11, Lq1/a;->d:[I

    .line 761
    .line 762
    invoke-static {v2, v5, v4, v11}, Le0/b;->g(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 763
    .line 764
    .line 765
    move-result-object v11

    .line 766
    const/4 v13, 0x0

    .line 767
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v14

    .line 771
    if-eqz v14, :cond_24

    .line 772
    .line 773
    iput-object v14, v9, Lq1/k;->b:Ljava/lang/String;

    .line 774
    .line 775
    :cond_24
    const/4 v14, 0x1

    .line 776
    invoke-virtual {v11, v14}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v13

    .line 780
    if-eqz v13, :cond_25

    .line 781
    .line 782
    invoke-static {v13}, Lu1/h0;->s(Ljava/lang/String;)[Lf0/d;

    .line 783
    .line 784
    .line 785
    move-result-object v13

    .line 786
    iput-object v13, v9, Lq1/k;->a:[Lf0/d;

    .line 787
    .line 788
    :cond_25
    invoke-static {v3, v15}, Le0/b;->d(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 789
    .line 790
    .line 791
    move-result v13

    .line 792
    if-nez v13, :cond_26

    .line 793
    .line 794
    const/4 v15, 0x0

    .line 795
    goto :goto_9

    .line 796
    :cond_26
    const/4 v13, 0x0

    .line 797
    const/4 v14, 0x2

    .line 798
    invoke-virtual {v11, v14, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 799
    .line 800
    .line 801
    move-result v15

    .line 802
    :goto_9
    iput v15, v9, Lq1/k;->c:I

    .line 803
    .line 804
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    .line 805
    .line 806
    .line 807
    :cond_27
    iget-object v10, v10, Lq1/i;->b:Ljava/util/ArrayList;

    .line 808
    .line 809
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    invoke-virtual {v9}, Lq1/k;->getPathName()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v10

    .line 816
    if-eqz v10, :cond_28

    .line 817
    .line 818
    invoke-virtual {v9}, Lq1/k;->getPathName()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v10

    .line 822
    invoke-virtual {v7, v10, v9}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    :cond_28
    iget v9, v0, Lq1/m;->a:I

    .line 826
    .line 827
    iput v9, v0, Lq1/m;->a:I

    .line 828
    .line 829
    :cond_29
    const/4 v13, 0x0

    .line 830
    const/4 v15, 0x2

    .line 831
    goto/16 :goto_e

    .line 832
    .line 833
    :cond_2a
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v9

    .line 837
    if-eqz v9, :cond_29

    .line 838
    .line 839
    new-instance v9, Lq1/i;

    .line 840
    .line 841
    invoke-direct {v9}, Lq1/i;-><init>()V

    .line 842
    .line 843
    .line 844
    sget-object v11, Lq1/a;->b:[I

    .line 845
    .line 846
    invoke-static {v2, v5, v4, v11}, Le0/b;->g(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 847
    .line 848
    .line 849
    move-result-object v11

    .line 850
    iget v13, v9, Lq1/i;->c:F

    .line 851
    .line 852
    const-string v14, "rotation"

    .line 853
    .line 854
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v14

    .line 858
    if-eqz v14, :cond_2b

    .line 859
    .line 860
    const/4 v15, 0x5

    .line 861
    invoke-virtual {v11, v15, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 862
    .line 863
    .line 864
    move-result v13

    .line 865
    goto :goto_a

    .line 866
    :cond_2b
    const/4 v15, 0x5

    .line 867
    :goto_a
    iput v13, v9, Lq1/i;->c:F

    .line 868
    .line 869
    iget v13, v9, Lq1/i;->d:F

    .line 870
    .line 871
    const/4 v14, 0x1

    .line 872
    invoke-virtual {v11, v14, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 873
    .line 874
    .line 875
    move-result v13

    .line 876
    iput v13, v9, Lq1/i;->d:F

    .line 877
    .line 878
    iget v13, v9, Lq1/i;->e:F

    .line 879
    .line 880
    const/4 v15, 0x2

    .line 881
    invoke-virtual {v11, v15, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 882
    .line 883
    .line 884
    move-result v13

    .line 885
    iput v13, v9, Lq1/i;->e:F

    .line 886
    .line 887
    iget v13, v9, Lq1/i;->f:F

    .line 888
    .line 889
    const-string v14, "scaleX"

    .line 890
    .line 891
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v14

    .line 895
    if-eqz v14, :cond_2c

    .line 896
    .line 897
    const/4 v14, 0x3

    .line 898
    invoke-virtual {v11, v14, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 899
    .line 900
    .line 901
    move-result v13

    .line 902
    :cond_2c
    iput v13, v9, Lq1/i;->f:F

    .line 903
    .line 904
    iget v13, v9, Lq1/i;->g:F

    .line 905
    .line 906
    const-string v14, "scaleY"

    .line 907
    .line 908
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v14

    .line 912
    if-eqz v14, :cond_2d

    .line 913
    .line 914
    const/4 v14, 0x4

    .line 915
    invoke-virtual {v11, v14, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 916
    .line 917
    .line 918
    move-result v13

    .line 919
    goto :goto_b

    .line 920
    :cond_2d
    const/4 v14, 0x4

    .line 921
    :goto_b
    iput v13, v9, Lq1/i;->g:F

    .line 922
    .line 923
    iget v13, v9, Lq1/i;->h:F

    .line 924
    .line 925
    const-string v14, "translateX"

    .line 926
    .line 927
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v14

    .line 931
    if-eqz v14, :cond_2e

    .line 932
    .line 933
    const/4 v14, 0x6

    .line 934
    invoke-virtual {v11, v14, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 935
    .line 936
    .line 937
    move-result v13

    .line 938
    goto :goto_c

    .line 939
    :cond_2e
    const/4 v14, 0x6

    .line 940
    :goto_c
    iput v13, v9, Lq1/i;->h:F

    .line 941
    .line 942
    iget v13, v9, Lq1/i;->i:F

    .line 943
    .line 944
    const-string v14, "translateY"

    .line 945
    .line 946
    invoke-interface {v3, v12, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v14

    .line 950
    if-eqz v14, :cond_2f

    .line 951
    .line 952
    const/4 v14, 0x7

    .line 953
    invoke-virtual {v11, v14, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 954
    .line 955
    .line 956
    move-result v13

    .line 957
    goto :goto_d

    .line 958
    :cond_2f
    const/4 v14, 0x7

    .line 959
    :goto_d
    iput v13, v9, Lq1/i;->i:F

    .line 960
    .line 961
    const/4 v13, 0x0

    .line 962
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v14

    .line 966
    if-eqz v14, :cond_30

    .line 967
    .line 968
    iput-object v14, v9, Lq1/i;->k:Ljava/lang/String;

    .line 969
    .line 970
    :cond_30
    invoke-virtual {v9}, Lq1/i;->c()V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    .line 974
    .line 975
    .line 976
    iget-object v10, v10, Lq1/i;->b:Ljava/util/ArrayList;

    .line 977
    .line 978
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 979
    .line 980
    .line 981
    invoke-virtual {v8, v9}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v9}, Lq1/i;->getGroupName()Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object v10

    .line 988
    if-eqz v10, :cond_31

    .line 989
    .line 990
    invoke-virtual {v9}, Lq1/i;->getGroupName()Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v10

    .line 994
    invoke-virtual {v7, v10, v9}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    :cond_31
    iget v9, v0, Lq1/m;->a:I

    .line 998
    .line 999
    iput v9, v0, Lq1/m;->a:I

    .line 1000
    .line 1001
    :goto_e
    const/4 v10, 0x3

    .line 1002
    const/16 v17, 0x6

    .line 1003
    .line 1004
    const/16 v20, 0x7

    .line 1005
    .line 1006
    const/16 v22, 0x4

    .line 1007
    .line 1008
    const/16 v24, 0x1

    .line 1009
    .line 1010
    goto :goto_f

    .line 1011
    :cond_32
    move v15, v10

    .line 1012
    move/from16 v25, v11

    .line 1013
    .line 1014
    const/4 v10, 0x3

    .line 1015
    const/16 v17, 0x6

    .line 1016
    .line 1017
    const/16 v18, 0x9

    .line 1018
    .line 1019
    const/16 v19, -0x1

    .line 1020
    .line 1021
    const/16 v20, 0x7

    .line 1022
    .line 1023
    const/16 v22, 0x4

    .line 1024
    .line 1025
    const/16 v23, 0x8

    .line 1026
    .line 1027
    const/16 v24, 0x1

    .line 1028
    .line 1029
    if-ne v9, v10, :cond_33

    .line 1030
    .line 1031
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v9

    .line 1035
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v9

    .line 1039
    if-eqz v9, :cond_33

    .line 1040
    .line 1041
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    :cond_33
    :goto_f
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1045
    .line 1046
    .line 1047
    move-result v9

    .line 1048
    move/from16 v14, v23

    .line 1049
    .line 1050
    move/from16 v10, v24

    .line 1051
    .line 1052
    move/from16 v11, v25

    .line 1053
    .line 1054
    const/4 v15, 0x0

    .line 1055
    goto/16 :goto_4

    .line 1056
    .line 1057
    :cond_34
    if-nez v21, :cond_35

    .line 1058
    .line 1059
    iget-object v0, v6, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 1060
    .line 1061
    iget-object v2, v6, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 1062
    .line 1063
    invoke-virtual {v1, v0, v2}, Lq1/o;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    iput-object v0, v1, Lq1/o;->h:Landroid/graphics/PorterDuffColorFilter;

    .line 1068
    .line 1069
    return-void

    .line 1070
    :cond_35
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1071
    .line 1072
    const-string v2, "no path defined"

    .line 1073
    .line 1074
    invoke-direct {v0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    throw v0

    .line 1078
    :cond_36
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1079
    .line 1080
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v2

    .line 1084
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1085
    .line 1086
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1090
    .line 1091
    .line 1092
    const-string v2, "<vector> tag requires height > 0"

    .line 1093
    .line 1094
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v2

    .line 1101
    invoke-direct {v0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1102
    .line 1103
    .line 1104
    throw v0

    .line 1105
    :cond_37
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1106
    .line 1107
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v2

    .line 1111
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1112
    .line 1113
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1117
    .line 1118
    .line 1119
    const-string v2, "<vector> tag requires width > 0"

    .line 1120
    .line 1121
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v2

    .line 1128
    invoke-direct {v0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1129
    .line 1130
    .line 1131
    throw v0

    .line 1132
    :cond_38
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1133
    .line 1134
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v2

    .line 1138
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1139
    .line 1140
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1144
    .line 1145
    .line 1146
    const-string v2, "<vector> tag requires viewportHeight > 0"

    .line 1147
    .line 1148
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    invoke-direct {v0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1156
    .line 1157
    .line 1158
    throw v0

    .line 1159
    :cond_39
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1160
    .line 1161
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v2

    .line 1165
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1166
    .line 1167
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1171
    .line 1172
    .line 1173
    const-string v2, "<vector> tag requires viewportWidth > 0"

    .line 1174
    .line 1175
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v2

    .line 1182
    invoke-direct {v0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1183
    .line 1184
    .line 1185
    throw v0

    .line 1186
    nop

    .line 1187
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invalidateSelf()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final isAutoMirrored()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 11
    .line 12
    iget-boolean v0, v0, Lq1/m;->e:Z

    .line 13
    .line 14
    return v0
.end method

.method public final isStateful()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, v0, Lq1/m;->b:Lq1/l;

    .line 21
    .line 22
    iget-object v1, v0, Lq1/l;->n:Ljava/lang/Boolean;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v0, Lq1/l;->g:Lq1/i;

    .line 27
    .line 28
    invoke-virtual {v1}, Lq1/i;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, v0, Lq1/l;->n:Ljava/lang/Boolean;

    .line 37
    .line 38
    :cond_1
    iget-object v0, v0, Lq1/l;->n:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 47
    .line 48
    iget-object v0, v0, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v0, 0x0

    .line 60
    return v0

    .line 61
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 62
    return v0
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-boolean v0, p0, Lq1/o;->j:Z

    .line 10
    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-ne v0, p0, :cond_4

    .line 18
    .line 19
    new-instance v0, Lq1/m;

    .line 20
    .line 21
    iget-object v1, p0, Lq1/o;->g:Lq1/m;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    iput-object v2, v0, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 28
    .line 29
    sget-object v2, Lq1/o;->o:Landroid/graphics/PorterDuff$Mode;

    .line 30
    .line 31
    iput-object v2, v0, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    iget v2, v1, Lq1/m;->a:I

    .line 36
    .line 37
    iput v2, v0, Lq1/m;->a:I

    .line 38
    .line 39
    new-instance v2, Lq1/l;

    .line 40
    .line 41
    iget-object v3, v1, Lq1/m;->b:Lq1/l;

    .line 42
    .line 43
    invoke-direct {v2, v3}, Lq1/l;-><init>(Lq1/l;)V

    .line 44
    .line 45
    .line 46
    iput-object v2, v0, Lq1/m;->b:Lq1/l;

    .line 47
    .line 48
    iget-object v3, v1, Lq1/m;->b:Lq1/l;

    .line 49
    .line 50
    iget-object v3, v3, Lq1/l;->e:Landroid/graphics/Paint;

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    new-instance v3, Landroid/graphics/Paint;

    .line 55
    .line 56
    iget-object v4, v1, Lq1/m;->b:Lq1/l;

    .line 57
    .line 58
    iget-object v4, v4, Lq1/l;->e:Landroid/graphics/Paint;

    .line 59
    .line 60
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    iput-object v3, v2, Lq1/l;->e:Landroid/graphics/Paint;

    .line 64
    .line 65
    :cond_1
    iget-object v2, v1, Lq1/m;->b:Lq1/l;

    .line 66
    .line 67
    iget-object v2, v2, Lq1/l;->d:Landroid/graphics/Paint;

    .line 68
    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    iget-object v2, v0, Lq1/m;->b:Lq1/l;

    .line 72
    .line 73
    new-instance v3, Landroid/graphics/Paint;

    .line 74
    .line 75
    iget-object v4, v1, Lq1/m;->b:Lq1/l;

    .line 76
    .line 77
    iget-object v4, v4, Lq1/l;->d:Landroid/graphics/Paint;

    .line 78
    .line 79
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 80
    .line 81
    .line 82
    iput-object v3, v2, Lq1/l;->d:Landroid/graphics/Paint;

    .line 83
    .line 84
    :cond_2
    iget-object v2, v1, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 85
    .line 86
    iput-object v2, v0, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 87
    .line 88
    iget-object v2, v1, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 89
    .line 90
    iput-object v2, v0, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 91
    .line 92
    iget-boolean v1, v1, Lq1/m;->e:Z

    .line 93
    .line 94
    iput-boolean v1, v0, Lq1/m;->e:Z

    .line 95
    .line 96
    :cond_3
    iput-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 97
    .line 98
    const/4 v0, 0x1

    .line 99
    iput-boolean v0, p0, Lq1/o;->j:Z

    .line 100
    .line 101
    :cond_4
    return-object p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final onStateChange([I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 11
    .line 12
    iget-object v1, v0, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v3, v0, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v1, v3}, Lq1/o;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, Lq1/o;->h:Landroid/graphics/PorterDuffColorFilter;

    .line 26
    .line 27
    invoke-virtual {p0}, Lq1/o;->invalidateSelf()V

    .line 28
    .line 29
    .line 30
    move v1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    :goto_0
    iget-object v3, v0, Lq1/m;->b:Lq1/l;

    .line 34
    .line 35
    iget-object v4, v3, Lq1/l;->n:Ljava/lang/Boolean;

    .line 36
    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    iget-object v4, v3, Lq1/l;->g:Lq1/i;

    .line 40
    .line 41
    invoke-virtual {v4}, Lq1/i;->a()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iput-object v4, v3, Lq1/l;->n:Ljava/lang/Boolean;

    .line 50
    .line 51
    :cond_2
    iget-object v3, v3, Lq1/l;->n:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    iget-object v3, v0, Lq1/m;->b:Lq1/l;

    .line 60
    .line 61
    iget-object v3, v3, Lq1/l;->g:Lq1/i;

    .line 62
    .line 63
    invoke-virtual {v3, p1}, Lq1/i;->b([I)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iget-boolean v3, v0, Lq1/m;->k:Z

    .line 68
    .line 69
    or-int/2addr v3, p1

    .line 70
    iput-boolean v3, v0, Lq1/m;->k:Z

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Lq1/o;->invalidateSelf()V

    .line 75
    .line 76
    .line 77
    return v2

    .line 78
    :cond_3
    return v1
.end method

.method public final scheduleSelf(Ljava/lang/Runnable;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 10
    .line 11
    iget-object v0, v0, Lq1/m;->b:Lq1/l;

    .line 12
    .line 13
    invoke-virtual {v0}, Lq1/l;->getRootAlpha()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eq v0, p1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 20
    .line 21
    iget-object v0, v0, Lq1/m;->b:Lq1/l;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lq1/l;->setRootAlpha(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lq1/o;->invalidateSelf()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final setAutoMirrored(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 10
    .line 11
    iput-boolean p1, v0, Lq1/m;->e:Z

    .line 12
    .line 13
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-object p1, p0, Lq1/o;->i:Landroid/graphics/ColorFilter;

    .line 10
    .line 11
    invoke-virtual {p0}, Lq1/o;->invalidateSelf()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setTint(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lq1/o;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 10
    .line 11
    iget-object v1, v0, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    if-eq v1, p1, :cond_1

    .line 14
    .line 15
    iput-object p1, v0, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 16
    .line 17
    iget-object v0, v0, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Lq1/o;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lq1/o;->h:Landroid/graphics/PorterDuffColorFilter;

    .line 24
    .line 25
    invoke-virtual {p0}, Lq1/o;->invalidateSelf()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lq1/o;->g:Lq1/m;

    .line 10
    .line 11
    iget-object v1, v0, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 12
    .line 13
    if-eq v1, p1, :cond_1

    .line 14
    .line 15
    iput-object p1, v0, Lq1/m;->d:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    iget-object v0, v0, Lq1/m;->c:Landroid/content/res/ColorStateList;

    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Lq1/o;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lq1/o;->h:Landroid/graphics/PorterDuffColorFilter;

    .line 24
    .line 25
    invoke-virtual {p0}, Lq1/o;->invalidateSelf()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final unscheduleSelf(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
