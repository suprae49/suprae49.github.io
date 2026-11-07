.class public final Ld3/d0;
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
    iput p1, p0, Ld3/d0;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Ld3/d0;->g:Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ld3/d0;->f:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, v1, Ld3/d0;->g:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v6, Lw0/e;

    .line 15
    .line 16
    invoke-virtual {v6, v5}, Lw0/e;->o(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast v6, Lu1/h2;

    .line 21
    .line 22
    iget-object v0, v6, Lu1/h2;->h:Lu1/o0;

    .line 23
    .line 24
    iget-object v2, v6, Lu1/h2;->i:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lu1/o0;->loadUrl(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    check-cast v6, Lu1/e2;

    .line 31
    .line 32
    iget-object v0, v6, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 33
    .line 34
    invoke-virtual {v0}, Lco/median/android/MainActivity;->m0()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_2
    check-cast v6, Lx1/i;

    .line 39
    .line 40
    check-cast v6, Lu1/o0;

    .line 41
    .line 42
    invoke-virtual {v6}, Lu1/o0;->reload()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_3
    check-cast v6, Landroid/webkit/WebView;

    .line 47
    .line 48
    invoke-virtual {v6, v4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_4
    check-cast v6, Lu1/o;

    .line 53
    .line 54
    iget-object v0, v6, Lu1/o;->a:Lco/median/android/MainActivity;

    .line 55
    .line 56
    invoke-virtual {v0}, Lco/median/android/MainActivity;->m0()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_5
    check-cast v6, Lt0/c;

    .line 61
    .line 62
    iget-object v0, v6, Lt0/c;->h:Lk/p1;

    .line 63
    .line 64
    iget-object v2, v6, Lt0/c;->f:Lt0/a;

    .line 65
    .line 66
    iget-boolean v3, v6, Lt0/c;->t:Z

    .line 67
    .line 68
    if-nez v3, :cond_0

    .line 69
    .line 70
    goto/16 :goto_1

    .line 71
    .line 72
    :cond_0
    iget-boolean v3, v6, Lt0/c;->r:Z

    .line 73
    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    iput-boolean v5, v6, Lt0/c;->r:Z

    .line 77
    .line 78
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    iput-wide v3, v2, Lt0/a;->e:J

    .line 83
    .line 84
    const-wide/16 v7, -0x1

    .line 85
    .line 86
    iput-wide v7, v2, Lt0/a;->g:J

    .line 87
    .line 88
    iput-wide v3, v2, Lt0/a;->f:J

    .line 89
    .line 90
    const/high16 v3, 0x3f000000    # 0.5f

    .line 91
    .line 92
    iput v3, v2, Lt0/a;->h:F

    .line 93
    .line 94
    :cond_1
    iget-wide v3, v2, Lt0/a;->g:J

    .line 95
    .line 96
    const-wide/16 v7, 0x0

    .line 97
    .line 98
    cmp-long v3, v3, v7

    .line 99
    .line 100
    if-lez v3, :cond_2

    .line 101
    .line 102
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    iget-wide v9, v2, Lt0/a;->g:J

    .line 107
    .line 108
    iget v11, v2, Lt0/a;->i:I

    .line 109
    .line 110
    int-to-long v11, v11

    .line 111
    add-long/2addr v9, v11

    .line 112
    cmp-long v3, v3, v9

    .line 113
    .line 114
    if-lez v3, :cond_2

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    invoke-virtual {v6}, Lt0/c;->e()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_3

    .line 122
    .line 123
    :goto_0
    iput-boolean v5, v6, Lt0/c;->t:Z

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    iget-boolean v3, v6, Lt0/c;->s:Z

    .line 127
    .line 128
    if-eqz v3, :cond_4

    .line 129
    .line 130
    iput-boolean v5, v6, Lt0/c;->s:Z

    .line 131
    .line 132
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 133
    .line 134
    .line 135
    move-result-wide v9

    .line 136
    const/4 v15, 0x0

    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    const/4 v13, 0x3

    .line 140
    const/4 v14, 0x0

    .line 141
    move-wide v11, v9

    .line 142
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v0, v3}, Lk/p1;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 150
    .line 151
    .line 152
    :cond_4
    iget-wide v3, v2, Lt0/a;->f:J

    .line 153
    .line 154
    cmp-long v3, v3, v7

    .line 155
    .line 156
    if-eqz v3, :cond_5

    .line 157
    .line 158
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 159
    .line 160
    .line 161
    move-result-wide v3

    .line 162
    invoke-virtual {v2, v3, v4}, Lt0/a;->a(J)F

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    const/high16 v7, -0x3f800000    # -4.0f

    .line 167
    .line 168
    mul-float/2addr v7, v5

    .line 169
    mul-float/2addr v7, v5

    .line 170
    const/high16 v8, 0x40800000    # 4.0f

    .line 171
    .line 172
    mul-float/2addr v5, v8

    .line 173
    add-float/2addr v5, v7

    .line 174
    iget-wide v7, v2, Lt0/a;->f:J

    .line 175
    .line 176
    sub-long v7, v3, v7

    .line 177
    .line 178
    iput-wide v3, v2, Lt0/a;->f:J

    .line 179
    .line 180
    long-to-float v3, v7

    .line 181
    mul-float/2addr v3, v5

    .line 182
    iget v2, v2, Lt0/a;->d:F

    .line 183
    .line 184
    mul-float/2addr v3, v2

    .line 185
    float-to-int v2, v3

    .line 186
    iget-object v3, v6, Lt0/c;->v:Lk/p1;

    .line 187
    .line 188
    invoke-virtual {v3, v2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 189
    .line 190
    .line 191
    sget-object v2, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 194
    .line 195
    .line 196
    :goto_1
    return-void

    .line 197
    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    .line 198
    .line 199
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 200
    .line 201
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v0

    .line 205
    :pswitch_6
    check-cast v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 206
    .line 207
    invoke-virtual {v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B0()Z

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_7
    check-cast v6, Lk1/l;

    .line 212
    .line 213
    iget-object v0, v6, Lk1/l;->z:Landroid/animation/ValueAnimator;

    .line 214
    .line 215
    iget v4, v6, Lk1/l;->A:I

    .line 216
    .line 217
    if-eq v4, v3, :cond_6

    .line 218
    .line 219
    if-eq v4, v2, :cond_7

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_6
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 223
    .line 224
    .line 225
    :cond_7
    const/4 v4, 0x3

    .line 226
    iput v4, v6, Lk1/l;->A:I

    .line 227
    .line 228
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    check-cast v4, Ljava/lang/Float;

    .line 233
    .line 234
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    new-array v2, v2, [F

    .line 239
    .line 240
    aput v4, v2, v5

    .line 241
    .line 242
    const/4 v4, 0x0

    .line 243
    aput v4, v2, v3

    .line 244
    .line 245
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 246
    .line 247
    .line 248
    const/16 v2, 0x1f4

    .line 249
    .line 250
    int-to-long v2, v2

    .line 251
    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 255
    .line 256
    .line 257
    :goto_2
    return-void

    .line 258
    :pswitch_8
    check-cast v6, Landroidx/appcompat/widget/Toolbar;

    .line 259
    .line 260
    invoke-virtual {v6}, Landroidx/appcompat/widget/Toolbar;->w()Z

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :pswitch_9
    check-cast v6, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 265
    .line 266
    iget-boolean v0, v6, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->l:Z

    .line 267
    .line 268
    if-eqz v0, :cond_8

    .line 269
    .line 270
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    const-string v2, "input_method"

    .line 275
    .line 276
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 281
    .line 282
    invoke-virtual {v0, v6, v5}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 283
    .line 284
    .line 285
    iput-boolean v5, v6, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->l:Z

    .line 286
    .line 287
    :cond_8
    return-void

    .line 288
    :pswitch_a
    check-cast v6, Lk/p1;

    .line 289
    .line 290
    iput-object v4, v6, Lk/p1;->q:Ld3/d0;

    .line 291
    .line 292
    invoke-virtual {v6}, Lk/p1;->drawableStateChanged()V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :pswitch_b
    check-cast v6, Lb3/g;

    .line 297
    .line 298
    iput-boolean v5, v6, Lb3/g;->c:Z

    .line 299
    .line 300
    iget-object v0, v6, Lb3/g;->e:Lz/b;

    .line 301
    .line 302
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 303
    .line 304
    iget-object v3, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->V:Lw0/e;

    .line 305
    .line 306
    if-eqz v3, :cond_9

    .line 307
    .line 308
    invoke-virtual {v3}, Lw0/e;->g()Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eqz v3, :cond_9

    .line 313
    .line 314
    iget v0, v6, Lb3/g;->b:I

    .line 315
    .line 316
    invoke-virtual {v6, v0}, Lb3/g;->a(I)V

    .line 317
    .line 318
    .line 319
    goto :goto_3

    .line 320
    :cond_9
    iget v3, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:I

    .line 321
    .line 322
    if-ne v3, v2, :cond_a

    .line 323
    .line 324
    iget v2, v6, Lb3/g;->b:I

    .line 325
    .line 326
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K(I)V

    .line 327
    .line 328
    .line 329
    :cond_a
    :goto_3
    return-void

    .line 330
    :pswitch_c
    check-cast v6, Lg/d;

    .line 331
    .line 332
    invoke-virtual {v6, v3}, Lg/d;->b(Z)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 336
    .line 337
    .line 338
    return-void

    .line 339
    :pswitch_d
    check-cast v6, Le/l0;

    .line 340
    .line 341
    iget-object v0, v6, Le/l0;->f:Landroid/view/Window$Callback;

    .line 342
    .line 343
    invoke-virtual {v6}, Le/l0;->u0()Landroid/view/Menu;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    instance-of v3, v2, Lj/m;

    .line 348
    .line 349
    if-eqz v3, :cond_b

    .line 350
    .line 351
    move-object v3, v2

    .line 352
    check-cast v3, Lj/m;

    .line 353
    .line 354
    goto :goto_4

    .line 355
    :cond_b
    move-object v3, v4

    .line 356
    :goto_4
    if-eqz v3, :cond_c

    .line 357
    .line 358
    invoke-virtual {v3}, Lj/m;->y()V

    .line 359
    .line 360
    .line 361
    :cond_c
    :try_start_0
    invoke-interface {v2}, Landroid/view/Menu;->clear()V

    .line 362
    .line 363
    .line 364
    invoke-interface {v0, v5, v2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    if-eqz v6, :cond_d

    .line 369
    .line 370
    invoke-interface {v0, v5, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-nez v0, :cond_e

    .line 375
    .line 376
    goto :goto_5

    .line 377
    :catchall_0
    move-exception v0

    .line 378
    goto :goto_6

    .line 379
    :cond_d
    :goto_5
    invoke-interface {v2}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 380
    .line 381
    .line 382
    :cond_e
    if-eqz v3, :cond_f

    .line 383
    .line 384
    invoke-virtual {v3}, Lj/m;->x()V

    .line 385
    .line 386
    .line 387
    :cond_f
    return-void

    .line 388
    :goto_6
    if-eqz v3, :cond_10

    .line 389
    .line 390
    invoke-virtual {v3}, Lj/m;->x()V

    .line 391
    .line 392
    .line 393
    :cond_10
    throw v0

    .line 394
    :pswitch_e
    check-cast v6, Lcom/google/android/material/textfield/TextInputLayout;

    .line 395
    .line 396
    iget-object v0, v6, Lcom/google/android/material/textfield/TextInputLayout;->h:Ld3/s;

    .line 397
    .line 398
    iget-object v0, v0, Ld3/s;->l:Lcom/google/android/material/internal/CheckableImageButton;

    .line 399
    .line 400
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :pswitch_data_0
    .packed-switch 0x0
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
