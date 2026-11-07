.class public final Le/s;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lp0/q;
.implements Lk/f1;
.implements Lj/x;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Le/d0;


# direct methods
.method public synthetic constructor <init>(Le/d0;I)V
    .locals 0

    .line 1
    iput p2, p0, Le/s;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Le/s;->g:Le/d0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lj/m;Z)V
    .locals 9

    .line 1
    iget v0, p0, Le/s;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lj/m;->k()Lj/m;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, p1, :cond_0

    .line 13
    .line 14
    move v3, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v3, v1

    .line 17
    :goto_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :cond_1
    iget-object v4, p0, Le/s;->g:Le/d0;

    .line 21
    .line 22
    iget-object v5, v4, Le/d0;->Q:[Le/c0;

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    array-length v6, v5

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move v6, v1

    .line 29
    :goto_1
    if-ge v1, v6, :cond_4

    .line 30
    .line 31
    aget-object v7, v5, v1

    .line 32
    .line 33
    if-eqz v7, :cond_3

    .line 34
    .line 35
    iget-object v8, v7, Le/c0;->h:Lj/m;

    .line 36
    .line 37
    if-ne v8, p1, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    const/4 v7, 0x0

    .line 44
    :goto_2
    if-eqz v7, :cond_6

    .line 45
    .line 46
    if-eqz v3, :cond_5

    .line 47
    .line 48
    iget p1, v7, Le/c0;->a:I

    .line 49
    .line 50
    invoke-virtual {v4, p1, v7, v0}, Le/d0;->r(ILe/c0;Lj/m;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v7, v2}, Le/d0;->t(Le/c0;Z)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_5
    invoke-virtual {v4, v7, p2}, Le/d0;->t(Le/c0;Z)V

    .line 58
    .line 59
    .line 60
    :cond_6
    :goto_3
    return-void

    .line 61
    :pswitch_0
    iget-object p2, p0, Le/s;->g:Le/d0;

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Le/d0;->s(Lj/m;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public b()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object v0, p0, Le/s;->g:Le/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Le/d0;->z()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x7f040291

    .line 8
    .line 9
    .line 10
    filled-new-array {v1}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v0, v2, v1}, Landroidx/emoji2/text/t;->t(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/emoji2/text/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroidx/emoji2/text/t;->i(I)Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0}, Landroidx/emoji2/text/t;->v()V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method

.method public d(Landroid/view/View;Lp0/y1;)Lp0/y1;
    .locals 17

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Lp0/y1;->d()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    iget-object v4, v3, Le/s;->g:Le/d0;

    .line 10
    .line 11
    iget-object v5, v4, Le/d0;->p:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual/range {p2 .. p2}, Lp0/y1;->d()I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, v4, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 18
    .line 19
    if-eqz v0, :cond_12

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 26
    .line 27
    if-eqz v0, :cond_12

    .line 28
    .line 29
    iget-object v0, v4, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v9, v0

    .line 36
    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 37
    .line 38
    iget-object v0, v4, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v10, 0x1

    .line 45
    if-eqz v0, :cond_10

    .line 46
    .line 47
    iget-object v0, v4, Le/d0;->h0:Landroid/graphics/Rect;

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    new-instance v0, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, v4, Le/d0;->h0:Landroid/graphics/Rect;

    .line 57
    .line 58
    new-instance v0, Landroid/graphics/Rect;

    .line 59
    .line 60
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, v4, Le/d0;->i0:Landroid/graphics/Rect;

    .line 64
    .line 65
    :cond_0
    iget-object v11, v4, Le/d0;->h0:Landroid/graphics/Rect;

    .line 66
    .line 67
    iget-object v0, v4, Le/d0;->i0:Landroid/graphics/Rect;

    .line 68
    .line 69
    invoke-virtual/range {p2 .. p2}, Lp0/y1;->b()I

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    invoke-virtual/range {p2 .. p2}, Lp0/y1;->d()I

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    invoke-virtual/range {p2 .. p2}, Lp0/y1;->c()I

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    invoke-virtual/range {p2 .. p2}, Lp0/y1;->a()I

    .line 82
    .line 83
    .line 84
    move-result v15

    .line 85
    invoke-virtual {v11, v12, v13, v14, v15}, Landroid/graphics/Rect;->set(IIII)V

    .line 86
    .line 87
    .line 88
    iget-object v12, v4, Le/d0;->F:Landroid/view/ViewGroup;

    .line 89
    .line 90
    const-class v13, Landroid/graphics/Rect;

    .line 91
    .line 92
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 93
    .line 94
    const/16 v15, 0x1d

    .line 95
    .line 96
    if-lt v14, v15, :cond_1

    .line 97
    .line 98
    sget-boolean v13, Lk/p3;->a:Z

    .line 99
    .line 100
    invoke-static {v12, v11, v0}, Lk/o3;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 101
    .line 102
    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    sget-boolean v14, Lk/p3;->a:Z

    .line 107
    .line 108
    const-string v15, "ViewUtils"

    .line 109
    .line 110
    if-nez v14, :cond_2

    .line 111
    .line 112
    sput-boolean v10, Lk/p3;->a:Z

    .line 113
    .line 114
    :try_start_0
    const-class v14, Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    const/16 v16, 0x0

    .line 117
    .line 118
    :try_start_1
    const-string v8, "computeFitSystemWindows"

    .line 119
    .line 120
    const/4 v7, 0x2

    .line 121
    new-array v7, v7, [Ljava/lang/Class;

    .line 122
    .line 123
    aput-object v13, v7, v16

    .line 124
    .line 125
    aput-object v13, v7, v10

    .line 126
    .line 127
    invoke-virtual {v14, v8, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    sput-object v7, Lk/p3;->b:Ljava/lang/reflect/Method;

    .line 132
    .line 133
    invoke-virtual {v7}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-nez v7, :cond_3

    .line 138
    .line 139
    sget-object v7, Lk/p3;->b:Ljava/lang/reflect/Method;

    .line 140
    .line 141
    invoke-virtual {v7, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :catch_0
    const/16 v16, 0x0

    .line 146
    .line 147
    :catch_1
    const-string v7, "Could not find method computeFitSystemWindows. Oh well."

    .line 148
    .line 149
    invoke-static {v15, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_2
    const/16 v16, 0x0

    .line 154
    .line 155
    :cond_3
    :goto_0
    sget-object v7, Lk/p3;->b:Ljava/lang/reflect/Method;

    .line 156
    .line 157
    if-eqz v7, :cond_4

    .line 158
    .line 159
    :try_start_2
    filled-new-array {v11, v0}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v7, v12, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :catch_2
    move-exception v0

    .line 168
    const-string v7, "Could not invoke computeFitSystemWindows"

    .line 169
    .line 170
    invoke-static {v15, v7, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 171
    .line 172
    .line 173
    :cond_4
    :goto_1
    iget v0, v11, Landroid/graphics/Rect;->top:I

    .line 174
    .line 175
    iget v7, v11, Landroid/graphics/Rect;->left:I

    .line 176
    .line 177
    iget v8, v11, Landroid/graphics/Rect;->right:I

    .line 178
    .line 179
    iget-object v11, v4, Le/d0;->F:Landroid/view/ViewGroup;

    .line 180
    .line 181
    sget-object v12, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 182
    .line 183
    invoke-static {v11}, Lp0/i0;->a(Landroid/view/View;)Lp0/y1;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    if-nez v11, :cond_5

    .line 188
    .line 189
    move/from16 v12, v16

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_5
    invoke-virtual {v11}, Lp0/y1;->b()I

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    :goto_2
    if-nez v11, :cond_6

    .line 197
    .line 198
    move/from16 v11, v16

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_6
    invoke-virtual {v11}, Lp0/y1;->c()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    :goto_3
    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 206
    .line 207
    if-ne v13, v0, :cond_8

    .line 208
    .line 209
    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 210
    .line 211
    if-ne v13, v7, :cond_8

    .line 212
    .line 213
    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 214
    .line 215
    if-eq v13, v8, :cond_7

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_7
    move/from16 v7, v16

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_8
    :goto_4
    iput v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 222
    .line 223
    iput v7, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 224
    .line 225
    iput v8, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 226
    .line 227
    move v7, v10

    .line 228
    :goto_5
    if-lez v0, :cond_9

    .line 229
    .line 230
    iget-object v0, v4, Le/d0;->H:Landroid/view/View;

    .line 231
    .line 232
    if-nez v0, :cond_9

    .line 233
    .line 234
    new-instance v0, Landroid/view/View;

    .line 235
    .line 236
    invoke-direct {v0, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 237
    .line 238
    .line 239
    iput-object v0, v4, Le/d0;->H:Landroid/view/View;

    .line 240
    .line 241
    const/16 v8, 0x8

    .line 242
    .line 243
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 244
    .line 245
    .line 246
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 247
    .line 248
    iget v13, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 249
    .line 250
    const/16 v14, 0x33

    .line 251
    .line 252
    const/4 v15, -0x1

    .line 253
    invoke-direct {v0, v15, v13, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 254
    .line 255
    .line 256
    iput v12, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 257
    .line 258
    iput v11, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 259
    .line 260
    iget-object v11, v4, Le/d0;->F:Landroid/view/ViewGroup;

    .line 261
    .line 262
    iget-object v12, v4, Le/d0;->H:Landroid/view/View;

    .line 263
    .line 264
    invoke-virtual {v11, v12, v15, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 265
    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_9
    const/16 v8, 0x8

    .line 269
    .line 270
    iget-object v0, v4, Le/d0;->H:Landroid/view/View;

    .line 271
    .line 272
    if-eqz v0, :cond_b

    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 279
    .line 280
    iget v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 281
    .line 282
    iget v14, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 283
    .line 284
    if-ne v13, v14, :cond_a

    .line 285
    .line 286
    iget v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 287
    .line 288
    if-ne v13, v12, :cond_a

    .line 289
    .line 290
    iget v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 291
    .line 292
    if-eq v13, v11, :cond_b

    .line 293
    .line 294
    :cond_a
    iput v14, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 295
    .line 296
    iput v12, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 297
    .line 298
    iput v11, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 299
    .line 300
    iget-object v11, v4, Le/d0;->H:Landroid/view/View;

    .line 301
    .line 302
    invoke-virtual {v11, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 303
    .line 304
    .line 305
    :cond_b
    :goto_6
    iget-object v0, v4, Le/d0;->H:Landroid/view/View;

    .line 306
    .line 307
    if-eqz v0, :cond_c

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_c
    move/from16 v10, v16

    .line 311
    .line 312
    :goto_7
    if-eqz v10, :cond_e

    .line 313
    .line 314
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_e

    .line 319
    .line 320
    iget-object v0, v4, Le/d0;->H:Landroid/view/View;

    .line 321
    .line 322
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 323
    .line 324
    .line 325
    move-result v11

    .line 326
    and-int/lit16 v11, v11, 0x2000

    .line 327
    .line 328
    if-eqz v11, :cond_d

    .line 329
    .line 330
    const v11, 0x7f060006

    .line 331
    .line 332
    .line 333
    invoke-static {v5, v11}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    goto :goto_8

    .line 338
    :cond_d
    const v11, 0x7f060005

    .line 339
    .line 340
    .line 341
    invoke-static {v5, v11}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    :goto_8
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 346
    .line 347
    .line 348
    :cond_e
    iget-boolean v0, v4, Le/d0;->M:Z

    .line 349
    .line 350
    if-nez v0, :cond_f

    .line 351
    .line 352
    if-eqz v10, :cond_f

    .line 353
    .line 354
    move/from16 v6, v16

    .line 355
    .line 356
    :cond_f
    move v0, v10

    .line 357
    move/from16 v5, v16

    .line 358
    .line 359
    move v10, v7

    .line 360
    goto :goto_9

    .line 361
    :cond_10
    const/16 v8, 0x8

    .line 362
    .line 363
    const/16 v16, 0x0

    .line 364
    .line 365
    iget v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 366
    .line 367
    move/from16 v5, v16

    .line 368
    .line 369
    if-eqz v0, :cond_11

    .line 370
    .line 371
    iput v5, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 372
    .line 373
    move v0, v5

    .line 374
    goto :goto_9

    .line 375
    :cond_11
    move v0, v5

    .line 376
    move v10, v0

    .line 377
    :goto_9
    if-eqz v10, :cond_13

    .line 378
    .line 379
    iget-object v7, v4, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 380
    .line 381
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 382
    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_12
    const/4 v5, 0x0

    .line 386
    const/16 v8, 0x8

    .line 387
    .line 388
    move v0, v5

    .line 389
    :cond_13
    :goto_a
    iget-object v4, v4, Le/d0;->H:Landroid/view/View;

    .line 390
    .line 391
    if-eqz v4, :cond_15

    .line 392
    .line 393
    if-eqz v0, :cond_14

    .line 394
    .line 395
    move v7, v5

    .line 396
    goto :goto_b

    .line 397
    :cond_14
    move v7, v8

    .line 398
    :goto_b
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 399
    .line 400
    .line 401
    :cond_15
    if-eq v2, v6, :cond_16

    .line 402
    .line 403
    invoke-virtual/range {p2 .. p2}, Lp0/y1;->b()I

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    invoke-virtual/range {p2 .. p2}, Lp0/y1;->c()I

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    invoke-virtual/range {p2 .. p2}, Lp0/y1;->a()I

    .line 412
    .line 413
    .line 414
    move-result v4

    .line 415
    move-object/from16 v5, p2

    .line 416
    .line 417
    invoke-virtual {v5, v0, v6, v2, v4}, Lp0/y1;->f(IIII)Lp0/y1;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    goto :goto_c

    .line 422
    :cond_16
    move-object/from16 v5, p2

    .line 423
    .line 424
    move-object v0, v5

    .line 425
    :goto_c
    sget-object v2, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 426
    .line 427
    invoke-virtual {v0}, Lp0/y1;->g()Landroid/view/WindowInsets;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    if-eqz v2, :cond_17

    .line 432
    .line 433
    invoke-virtual {v1, v2}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    invoke-virtual {v4, v2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    if-nez v2, :cond_17

    .line 442
    .line 443
    invoke-static {v1, v4}, Lp0/y1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lp0/y1;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    :cond_17
    return-object v0
.end method

.method public h(Lj/m;)Z
    .locals 2

    .line 1
    iget v0, p0, Le/s;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lj/m;->k()Lj/m;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Le/s;->g:Le/d0;

    .line 13
    .line 14
    iget-boolean v1, v0, Le/d0;->K:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Le/d0;->q:Landroid/view/Window;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-boolean v0, v0, Le/d0;->V:Z

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    const/16 v0, 0x6c

    .line 31
    .line 32
    invoke-interface {v1, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :pswitch_0
    iget-object v0, p0, Le/s;->g:Le/d0;

    .line 38
    .line 39
    iget-object v0, v0, Le/d0;->q:Landroid/view/Window;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    const/16 v1, 0x6c

    .line 48
    .line 49
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
