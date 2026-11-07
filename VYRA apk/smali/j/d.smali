.class public final Lj/d;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lj/d;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lj/d;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 10

    .line 1
    iget v0, p0, Lj/d;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj/d;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->q:[I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    aget v3, v1, v2

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v4

    .line 24
    :goto_0
    iget-object v5, v0, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 25
    .line 26
    iget-boolean v6, v5, Lr2/q;->C:Z

    .line 27
    .line 28
    if-eq v6, v3, :cond_3

    .line 29
    .line 30
    iput-boolean v3, v5, Lr2/q;->C:Z

    .line 31
    .line 32
    iget-object v6, v5, Lr2/q;->g:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-lez v6, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-boolean v6, v5, Lr2/q;->C:Z

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    iget v6, v5, Lr2/q;->E:I

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    :goto_1
    move v6, v4

    .line 49
    :goto_2
    iget-object v5, v5, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 50
    .line 51
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    invoke-virtual {v5, v4, v6, v4, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 56
    .line 57
    .line 58
    :cond_3
    if-eqz v3, :cond_4

    .line 59
    .line 60
    iget-boolean v3, v0, Lcom/google/android/material/navigation/NavigationView;->t:Z

    .line 61
    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    move v3, v2

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    move v3, v4

    .line 67
    :goto_3
    invoke-virtual {v0, v3}, Lr2/u;->setDrawTopInsetForeground(Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-ne v3, v2, :cond_5

    .line 75
    .line 76
    move v3, v2

    .line 77
    goto :goto_4

    .line 78
    :cond_5
    move v3, v4

    .line 79
    :goto_4
    aget v5, v1, v4

    .line 80
    .line 81
    if-eqz v5, :cond_6

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    add-int/2addr v6, v5

    .line 88
    if-nez v6, :cond_8

    .line 89
    .line 90
    :cond_6
    if-eqz v3, :cond_7

    .line 91
    .line 92
    iget-boolean v5, v0, Lcom/google/android/material/navigation/NavigationView;->w:Z

    .line 93
    .line 94
    if-eqz v5, :cond_8

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_7
    iget-boolean v5, v0, Lcom/google/android/material/navigation/NavigationView;->v:Z

    .line 98
    .line 99
    if-eqz v5, :cond_8

    .line 100
    .line 101
    :goto_5
    move v5, v2

    .line 102
    goto :goto_6

    .line 103
    :cond_8
    move v5, v4

    .line 104
    :goto_6
    invoke-virtual {v0, v5}, Lr2/u;->setDrawLeftInsetForeground(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    :goto_7
    instance-of v6, v5, Landroid/content/ContextWrapper;

    .line 112
    .line 113
    if-eqz v6, :cond_a

    .line 114
    .line 115
    instance-of v6, v5, Landroid/app/Activity;

    .line 116
    .line 117
    if-eqz v6, :cond_9

    .line 118
    .line 119
    check-cast v5, Landroid/app/Activity;

    .line 120
    .line 121
    goto :goto_8

    .line 122
    :cond_9
    check-cast v5, Landroid/content/ContextWrapper;

    .line 123
    .line 124
    invoke-virtual {v5}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    goto :goto_7

    .line 129
    :cond_a
    const/4 v5, 0x0

    .line 130
    :goto_8
    if-eqz v5, :cond_13

    .line 131
    .line 132
    const-string v6, "window"

    .line 133
    .line 134
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    check-cast v6, Landroid/view/WindowManager;

    .line 139
    .line 140
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 141
    .line 142
    const/16 v8, 0x1e

    .line 143
    .line 144
    if-lt v7, v8, :cond_b

    .line 145
    .line 146
    invoke-static {v6}, Lp0/u1;->d(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-static {v6}, Lp0/u1;->b(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    goto :goto_9

    .line 155
    :cond_b
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    new-instance v8, Landroid/graphics/Point;

    .line 160
    .line 161
    invoke-direct {v8}, Landroid/graphics/Point;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v8}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 165
    .line 166
    .line 167
    new-instance v6, Landroid/graphics/Rect;

    .line 168
    .line 169
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 170
    .line 171
    .line 172
    iget v9, v8, Landroid/graphics/Point;->x:I

    .line 173
    .line 174
    iput v9, v6, Landroid/graphics/Rect;->right:I

    .line 175
    .line 176
    iget v8, v8, Landroid/graphics/Point;->y:I

    .line 177
    .line 178
    iput v8, v6, Landroid/graphics/Rect;->bottom:I

    .line 179
    .line 180
    :goto_9
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    sub-int/2addr v8, v9

    .line 189
    aget v9, v1, v2

    .line 190
    .line 191
    if-ne v8, v9, :cond_c

    .line 192
    .line 193
    move v8, v2

    .line 194
    goto :goto_a

    .line 195
    :cond_c
    move v8, v4

    .line 196
    :goto_a
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    const/16 v9, 0x23

    .line 201
    .line 202
    if-ge v7, v9, :cond_d

    .line 203
    .line 204
    invoke-virtual {v5}, Landroid/view/Window;->getNavigationBarColor()I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    goto :goto_b

    .line 209
    :cond_d
    move v5, v4

    .line 210
    :goto_b
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    if-eqz v5, :cond_e

    .line 215
    .line 216
    move v5, v2

    .line 217
    goto :goto_c

    .line 218
    :cond_e
    move v5, v4

    .line 219
    :goto_c
    if-eqz v8, :cond_f

    .line 220
    .line 221
    if-eqz v5, :cond_f

    .line 222
    .line 223
    iget-boolean v5, v0, Lcom/google/android/material/navigation/NavigationView;->u:Z

    .line 224
    .line 225
    if-eqz v5, :cond_f

    .line 226
    .line 227
    move v5, v2

    .line 228
    goto :goto_d

    .line 229
    :cond_f
    move v5, v4

    .line 230
    :goto_d
    invoke-virtual {v0, v5}, Lr2/u;->setDrawBottomInsetForeground(Z)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    aget v7, v1, v4

    .line 238
    .line 239
    if-eq v5, v7, :cond_10

    .line 240
    .line 241
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    sub-int/2addr v5, v6

    .line 250
    aget v1, v1, v4

    .line 251
    .line 252
    if-ne v5, v1, :cond_12

    .line 253
    .line 254
    :cond_10
    if-eqz v3, :cond_11

    .line 255
    .line 256
    iget-boolean v1, v0, Lcom/google/android/material/navigation/NavigationView;->v:Z

    .line 257
    .line 258
    if-eqz v1, :cond_12

    .line 259
    .line 260
    goto :goto_e

    .line 261
    :cond_11
    iget-boolean v1, v0, Lcom/google/android/material/navigation/NavigationView;->w:Z

    .line 262
    .line 263
    if-eqz v1, :cond_12

    .line 264
    .line 265
    goto :goto_e

    .line 266
    :cond_12
    move v2, v4

    .line 267
    :goto_e
    invoke-virtual {v0, v2}, Lr2/u;->setDrawRightInsetForeground(Z)V

    .line 268
    .line 269
    .line 270
    :cond_13
    return-void

    .line 271
    :pswitch_0
    iget-object v0, p0, Lj/d;->g:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, Lk/n0;

    .line 274
    .line 275
    iget-object v1, v0, Lk/n0;->L:Landroidx/appcompat/widget/c;

    .line 276
    .line 277
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-eqz v2, :cond_14

    .line 282
    .line 283
    iget-object v2, v0, Lk/n0;->J:Landroid/graphics/Rect;

    .line 284
    .line 285
    invoke-virtual {v1, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-eqz v1, :cond_14

    .line 290
    .line 291
    invoke-virtual {v0}, Lk/n0;->s()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Lk/a2;->c()V

    .line 295
    .line 296
    .line 297
    goto :goto_f

    .line 298
    :cond_14
    invoke-virtual {v0}, Lk/a2;->dismiss()V

    .line 299
    .line 300
    .line 301
    :goto_f
    return-void

    .line 302
    :pswitch_1
    iget-object v0, p0, Lj/d;->g:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Landroidx/appcompat/widget/c;

    .line 305
    .line 306
    invoke-virtual {v0}, Landroidx/appcompat/widget/c;->getInternalPopup()Lk/o0;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-interface {v1}, Lk/o0;->b()Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-nez v1, :cond_15

    .line 315
    .line 316
    iget-object v1, v0, Landroidx/appcompat/widget/c;->k:Lk/o0;

    .line 317
    .line 318
    invoke-virtual {v0}, Landroid/view/View;->getTextDirection()I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    invoke-virtual {v0}, Landroid/view/View;->getTextAlignment()I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    invoke-interface {v1, v2, v3}, Lk/o0;->m(II)V

    .line 327
    .line 328
    .line 329
    :cond_15
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    if-eqz v0, :cond_16

    .line 334
    .line 335
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 336
    .line 337
    .line 338
    :cond_16
    return-void

    .line 339
    :pswitch_2
    iget-object v0, p0, Lj/d;->g:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, Lj/d0;

    .line 342
    .line 343
    iget-object v1, v0, Lj/d0;->n:Lk/f2;

    .line 344
    .line 345
    invoke-virtual {v0}, Lj/d0;->b()Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    if-eqz v2, :cond_19

    .line 350
    .line 351
    iget-boolean v2, v1, Lk/a2;->D:Z

    .line 352
    .line 353
    if-nez v2, :cond_19

    .line 354
    .line 355
    iget-object v2, v0, Lj/d0;->s:Landroid/view/View;

    .line 356
    .line 357
    if-eqz v2, :cond_18

    .line 358
    .line 359
    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-nez v2, :cond_17

    .line 364
    .line 365
    goto :goto_10

    .line 366
    :cond_17
    invoke-virtual {v1}, Lk/a2;->c()V

    .line 367
    .line 368
    .line 369
    goto :goto_11

    .line 370
    :cond_18
    :goto_10
    invoke-virtual {v0}, Lj/d0;->dismiss()V

    .line 371
    .line 372
    .line 373
    :cond_19
    :goto_11
    return-void

    .line 374
    :pswitch_3
    iget-object v0, p0, Lj/d;->g:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Lj/g;

    .line 377
    .line 378
    iget-object v1, v0, Lj/g;->n:Ljava/util/ArrayList;

    .line 379
    .line 380
    invoke-virtual {v0}, Lj/g;->b()Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    if-eqz v2, :cond_1c

    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    if-lez v2, :cond_1c

    .line 391
    .line 392
    const/4 v2, 0x0

    .line 393
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    check-cast v3, Lj/f;

    .line 398
    .line 399
    iget-object v3, v3, Lj/f;->a:Lk/f2;

    .line 400
    .line 401
    iget-boolean v3, v3, Lk/a2;->D:Z

    .line 402
    .line 403
    if-nez v3, :cond_1c

    .line 404
    .line 405
    iget-object v3, v0, Lj/g;->u:Landroid/view/View;

    .line 406
    .line 407
    if-eqz v3, :cond_1b

    .line 408
    .line 409
    invoke-virtual {v3}, Landroid/view/View;->isShown()Z

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    if-nez v3, :cond_1a

    .line 414
    .line 415
    goto :goto_13

    .line 416
    :cond_1a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    :goto_12
    if-ge v2, v0, :cond_1c

    .line 421
    .line 422
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    add-int/lit8 v2, v2, 0x1

    .line 427
    .line 428
    check-cast v3, Lj/f;

    .line 429
    .line 430
    iget-object v3, v3, Lj/f;->a:Lk/f2;

    .line 431
    .line 432
    invoke-virtual {v3}, Lk/a2;->c()V

    .line 433
    .line 434
    .line 435
    goto :goto_12

    .line 436
    :cond_1b
    :goto_13
    invoke-virtual {v0}, Lj/g;->dismiss()V

    .line 437
    .line 438
    .line 439
    :cond_1c
    return-void

    .line 440
    nop

    .line 441
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
