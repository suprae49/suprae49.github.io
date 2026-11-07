.class public final Lu1/x;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lco/median/android/GoNativeApplication;Lco/median/android/GoNativeApplication;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/x;->c:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lu1/x;->b:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lu1/x;->a:Z

    .line 11
    .line 12
    new-instance p1, Lx1/h;

    .line 13
    .line 14
    invoke-direct {p1, p2}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/x;->b:Ljava/lang/Object;

    .line 19
    new-instance p1, Lu1/g1;

    invoke-direct {p1, p0}, Lu1/g1;-><init>(Lu1/x;)V

    iput-object p1, p0, Lu1/x;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lu1/x;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 4
    .line 5
    iget-object v1, v0, Lco/median/android/GoNativeApplication;->k:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    new-array v2, v2, [Lx1/b;

    .line 13
    .line 14
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lco/median/android/GoNativeApplication;->k:Ljava/util/ArrayList;

    .line 22
    .line 23
    :cond_0
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->k:Ljava/util/ArrayList;

    .line 24
    .line 25
    return-object v0
.end method

.method public b(Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    const-string v3, "gonativeCommand"

    .line 8
    .line 9
    const-string v4, "medianCommand"

    .line 10
    .line 11
    const-string v5, "Invalid brightness value in "

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_21

    .line 16
    .line 17
    :cond_0
    invoke-static {v2}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    iget-boolean v7, v1, Lu1/x;->a:Z

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    if-eqz v7, :cond_1

    .line 25
    .line 26
    iget-boolean v7, v6, Lx1/a;->a1:Z

    .line 27
    .line 28
    if-nez v7, :cond_1

    .line 29
    .line 30
    new-instance v0, Ln2/b;

    .line 31
    .line 32
    invoke-direct {v0, v2}, Ln2/b;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Le/f;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Le/b;

    .line 38
    .line 39
    const-string v3, "License required to use JavaScript Bridge"

    .line 40
    .line 41
    iput-object v3, v2, Le/b;->f:Ljava/lang/String;

    .line 42
    .line 43
    const-string v3, "Okay"

    .line 44
    .line 45
    iput-object v3, v2, Le/b;->g:Ljava/lang/CharSequence;

    .line 46
    .line 47
    iput-object v8, v2, Le/b;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 48
    .line 49
    invoke-virtual {v0}, Ln2/b;->a()Le/g;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-static {v2}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    iget-object v7, v7, Lx1/a;->j1:Lz1/g;

    .line 62
    .line 63
    if-nez v7, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-wide v9, v7, Lz1/g;->b:J

    .line 67
    .line 68
    iget-boolean v11, v7, Lz1/g;->e:Z

    .line 69
    .line 70
    if-eqz v11, :cond_5

    .line 71
    .line 72
    const-wide/16 v11, -0x1

    .line 73
    .line 74
    cmp-long v11, v9, v11

    .line 75
    .line 76
    if-gtz v11, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget-wide v11, v7, Lz1/g;->f:J

    .line 80
    .line 81
    const-wide/16 v13, 0x0

    .line 82
    .line 83
    cmp-long v11, v11, v13

    .line 84
    .line 85
    if-lez v11, :cond_4

    .line 86
    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 88
    .line 89
    .line 90
    move-result-wide v11

    .line 91
    iget-wide v13, v7, Lz1/g;->f:J

    .line 92
    .line 93
    sub-long/2addr v11, v13

    .line 94
    cmp-long v9, v11, v9

    .line 95
    .line 96
    if-ltz v9, :cond_5

    .line 97
    .line 98
    invoke-static {v2}, Lt1/l;->a(Landroid/app/Activity;)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v9

    .line 105
    iput-wide v9, v7, Lz1/g;->f:J

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    invoke-static {v2}, Lt1/l;->a(Landroid/app/Activity;)V

    .line 109
    .line 110
    .line 111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 112
    .line 113
    .line 114
    move-result-wide v9

    .line 115
    iput-wide v9, v7, Lz1/g;->f:J

    .line 116
    .line 117
    :cond_5
    :goto_0
    instance-of v7, v0, Landroid/net/Uri;

    .line 118
    .line 119
    const-string v9, "GoNative Handle JS Bridge Functions Error:- "

    .line 120
    .line 121
    const-string v10, "data"

    .line 122
    .line 123
    const-string v11, "co.median.median_core.Bridge"

    .line 124
    .line 125
    if-eqz v7, :cond_6

    .line 126
    .line 127
    :try_start_0
    check-cast v0, Landroid/net/Uri;

    .line 128
    .line 129
    invoke-static {v0}, Lt2/i;->J(Landroid/net/Uri;)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    move-object v7, v3

    .line 134
    :goto_1
    move-object v3, v0

    .line 135
    goto :goto_2

    .line 136
    :catch_0
    move-exception v0

    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_6
    :try_start_1
    check-cast v0, Lorg/json/JSONObject;

    .line 158
    .line 159
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    if-eqz v12, :cond_7

    .line 168
    .line 169
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    goto :goto_1

    .line 178
    :catch_1
    move-exception v0

    .line 179
    goto/16 :goto_22

    .line 180
    .line 181
    :cond_7
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-eqz v4, :cond_8

    .line 186
    .line 187
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 192
    .line 193
    .line 194
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 195
    goto :goto_1

    .line 196
    :cond_8
    move-object v3, v8

    .line 197
    :goto_2
    invoke-virtual {v1}, Lu1/x;->a()Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-nez v4, :cond_7d

    .line 212
    .line 213
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    const-string v4, "system"

    .line 221
    .line 222
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_9

    .line 227
    .line 228
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    const-string v3, "/exitApp"

    .line 233
    .line 234
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_7c

    .line 239
    .line 240
    invoke-virtual {v2}, Landroid/app/Activity;->finishAffinity()V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_9
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const-string v4, "registration"

    .line 249
    .line 250
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_e

    .line 255
    .line 256
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const-string v4, "/send"

    .line 261
    .line 262
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_e

    .line 267
    .line 268
    move-object v0, v2

    .line 269
    check-cast v0, Lx1/g;

    .line 270
    .line 271
    move-object v4, v0

    .line 272
    check-cast v4, Lco/median/android/MainActivity;

    .line 273
    .line 274
    iget-object v0, v4, Lco/median/android/MainActivity;->c0:Landroidx/emoji2/text/x;

    .line 275
    .line 276
    if-nez v0, :cond_a

    .line 277
    .line 278
    goto/16 :goto_6

    .line 279
    .line 280
    :cond_a
    if-eqz v7, :cond_d

    .line 281
    .line 282
    const-string v0, "customData"

    .line 283
    .line 284
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    if-nez v9, :cond_b

    .line 289
    .line 290
    :try_start_2
    new-instance v12, Lorg/json/JSONObject;

    .line 291
    .line 292
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-direct {v12, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 297
    .line 298
    .line 299
    move-object v9, v12

    .line 300
    goto :goto_3

    .line 301
    :catch_2
    move-exception v0

    .line 302
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 303
    .line 304
    .line 305
    move-result-object v12

    .line 306
    new-instance v13, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    const-string v14, "GoNative Registration JSONException:- "

    .line 309
    .line 310
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v14

    .line 317
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v13

    .line 324
    const-string v14, "co.median.android.MainActivity"

    .line 325
    .line 326
    invoke-virtual {v12, v14, v13, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 327
    .line 328
    .line 329
    :cond_b
    :goto_3
    if-eqz v9, :cond_d

    .line 330
    .line 331
    iget-object v0, v4, Lco/median/android/MainActivity;->c0:Landroidx/emoji2/text/x;

    .line 332
    .line 333
    iput-object v9, v0, Landroidx/emoji2/text/x;->b:Ljava/lang/Object;

    .line 334
    .line 335
    iget-object v9, v0, Landroidx/emoji2/text/x;->d:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v9, Ljava/util/LinkedList;

    .line 338
    .line 339
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    :cond_c
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v12

    .line 347
    if-eqz v12, :cond_d

    .line 348
    .line 349
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v12

    .line 353
    check-cast v12, Lu1/n1;

    .line 354
    .line 355
    iget-object v13, v0, Landroidx/emoji2/text/x;->c:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v13, Ljava/lang/String;

    .line 358
    .line 359
    if-eqz v13, :cond_c

    .line 360
    .line 361
    iget-object v14, v12, Lu1/n1;->b:Ljava/util/LinkedList;

    .line 362
    .line 363
    invoke-static {v13, v14}, Lt2/i;->P(Ljava/lang/String;Ljava/util/LinkedList;)Z

    .line 364
    .line 365
    .line 366
    move-result v13

    .line 367
    if-eqz v13, :cond_c

    .line 368
    .line 369
    invoke-virtual {v12}, Lu1/n1;->a()V

    .line 370
    .line 371
    .line 372
    goto :goto_4

    .line 373
    :cond_d
    iget-object v0, v4, Lco/median/android/MainActivity;->c0:Landroidx/emoji2/text/x;

    .line 374
    .line 375
    iget-object v0, v0, Landroidx/emoji2/text/x;->d:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Ljava/util/LinkedList;

    .line 378
    .line 379
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 384
    .line 385
    .line 386
    move-result v4

    .line 387
    if-eqz v4, :cond_e

    .line 388
    .line 389
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    check-cast v4, Lu1/n1;

    .line 394
    .line 395
    invoke-virtual {v4}, Lu1/n1;->a()V

    .line 396
    .line 397
    .line 398
    goto :goto_5

    .line 399
    :cond_e
    :goto_6
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    const-string v4, "nativebridge"

    .line 404
    .line 405
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    const/4 v4, 0x0

    .line 410
    const-string v9, "callback"

    .line 411
    .line 412
    if-eqz v0, :cond_15

    .line 413
    .line 414
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    const-string v5, "/multi"

    .line 419
    .line 420
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-eqz v0, :cond_12

    .line 425
    .line 426
    if-nez v7, :cond_f

    .line 427
    .line 428
    goto/16 :goto_21

    .line 429
    .line 430
    :cond_f
    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    if-eqz v3, :cond_10

    .line 439
    .line 440
    goto/16 :goto_21

    .line 441
    .line 442
    :cond_10
    :try_start_3
    new-instance v3, Lorg/json/JSONObject;

    .line 443
    .line 444
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    const-string v0, "urls"

    .line 448
    .line 449
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    :goto_7
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    if-ge v4, v3, :cond_7c

    .line 458
    .line 459
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    const-string v5, "gonative"

    .line 468
    .line 469
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v6

    .line 473
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v5

    .line 477
    if-nez v5, :cond_11

    .line 478
    .line 479
    goto :goto_8

    .line 480
    :cond_11
    invoke-virtual {v1, v2, v3}, Lu1/x;->b(Landroid/app/Activity;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 481
    .line 482
    .line 483
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 484
    .line 485
    goto :goto_7

    .line 486
    :catch_3
    move-exception v0

    .line 487
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    const-string v3, "Error calling gonative://nativebridge/multi"

    .line 492
    .line 493
    invoke-virtual {v2, v11, v3, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 494
    .line 495
    .line 496
    goto/16 :goto_21

    .line 497
    .line 498
    :cond_12
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    const-string v3, "/custom"

    .line 503
    .line 504
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    if-eqz v0, :cond_7c

    .line 509
    .line 510
    if-nez v7, :cond_13

    .line 511
    .line 512
    goto/16 :goto_21

    .line 513
    .line 514
    :cond_13
    new-instance v3, Ljava/util/HashMap;

    .line 515
    .line 516
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v7}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 524
    .line 525
    .line 526
    move-result v4

    .line 527
    if-eqz v4, :cond_14

    .line 528
    .line 529
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    check-cast v4, Ljava/lang/String;

    .line 534
    .line 535
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    goto :goto_9

    .line 543
    :cond_14
    move-object v0, v2

    .line 544
    check-cast v0, Lx1/g;

    .line 545
    .line 546
    move-object v2, v0

    .line 547
    check-cast v2, Lco/median/android/MainActivity;

    .line 548
    .line 549
    :try_start_4
    invoke-static {v3}, Lt2/i;->g(Ljava/util/HashMap;)Lorg/json/JSONObject;

    .line 550
    .line 551
    .line 552
    move-result-object v8
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 553
    goto :goto_a

    .line 554
    :catch_4
    move-exception v0

    .line 555
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    const-string v5, "t1.l"

    .line 560
    .line 561
    const-string v6, "Error executing custom code"

    .line 562
    .line 563
    invoke-virtual {v4, v5, v6, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 564
    .line 565
    .line 566
    :goto_a
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    check-cast v0, Ljava/lang/String;

    .line 571
    .line 572
    if-eqz v0, :cond_7c

    .line 573
    .line 574
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    if-nez v3, :cond_7c

    .line 579
    .line 580
    invoke-static {v0, v8}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    new-instance v3, Landroid/os/Handler;

    .line 585
    .line 586
    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 591
    .line 592
    .line 593
    new-instance v4, Landroidx/activity/p;

    .line 594
    .line 595
    const/16 v5, 0x8

    .line 596
    .line 597
    invoke-direct {v4, v2, v5, v0}, Landroidx/activity/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 601
    .line 602
    .line 603
    goto/16 :goto_21

    .line 604
    .line 605
    :cond_15
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    const-string v12, "open"

    .line 610
    .line 611
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v0

    .line 615
    if-eqz v0, :cond_16

    .line 616
    .line 617
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    const-string v3, "/app-settings"

    .line 622
    .line 623
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    if-eqz v0, :cond_7c

    .line 628
    .line 629
    :try_start_5
    new-instance v0, Landroid/content/Intent;

    .line 630
    .line 631
    const-string v3, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 632
    .line 633
    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    const-string v3, "package"

    .line 637
    .line 638
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v4

    .line 642
    invoke-static {v3, v4, v8}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 650
    .line 651
    .line 652
    goto/16 :goto_21

    .line 653
    .line 654
    :catch_5
    move-exception v0

    .line 655
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    const-string v3, "Error opening app settings"

    .line 660
    .line 661
    invoke-virtual {v2, v11, v3, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 662
    .line 663
    .line 664
    return-void

    .line 665
    :cond_16
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    const-string v13, "webview"

    .line 670
    .line 671
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    const/4 v13, 0x1

    .line 676
    if-eqz v0, :cond_1c

    .line 677
    .line 678
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    const-string v4, "/clearCache"

    .line 683
    .line 684
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v0

    .line 688
    if-eqz v0, :cond_17

    .line 689
    .line 690
    const-string v0, "Clearing webview cache"

    .line 691
    .line 692
    invoke-static {v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 693
    .line 694
    .line 695
    move-object v0, v2

    .line 696
    check-cast v0, Lx1/g;

    .line 697
    .line 698
    check-cast v0, Lco/median/android/MainActivity;

    .line 699
    .line 700
    iget-object v0, v0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 701
    .line 702
    invoke-interface {v0, v13}, Lx1/i;->clearCache(Z)V

    .line 703
    .line 704
    .line 705
    return-void

    .line 706
    :cond_17
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    const-string v4, "/clearCookies"

    .line 711
    .line 712
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v0

    .line 716
    if-eqz v0, :cond_18

    .line 717
    .line 718
    const-string v0, "Clearing webview cookies"

    .line 719
    .line 720
    invoke-static {v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 721
    .line 722
    .line 723
    move-object v0, v2

    .line 724
    check-cast v0, Lx1/g;

    .line 725
    .line 726
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    new-instance v2, Lu1/u0;

    .line 731
    .line 732
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v0, v2}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 736
    .line 737
    .line 738
    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 739
    .line 740
    new-instance v3, Landroidx/activity/k;

    .line 741
    .line 742
    const/16 v4, 0xc

    .line 743
    .line 744
    invoke-direct {v3, v4, v0}, Landroidx/activity/k;-><init>(ILjava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 748
    .line 749
    .line 750
    return-void

    .line 751
    :cond_18
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    const-string v4, "/reload"

    .line 756
    .line 757
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v0

    .line 761
    if-eqz v0, :cond_19

    .line 762
    .line 763
    const-string v0, "Reloading webview"

    .line 764
    .line 765
    invoke-static {v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 766
    .line 767
    .line 768
    move-object v0, v2

    .line 769
    check-cast v0, Lx1/g;

    .line 770
    .line 771
    check-cast v0, Lco/median/android/MainActivity;

    .line 772
    .line 773
    invoke-virtual {v0}, Lco/median/android/MainActivity;->R()V

    .line 774
    .line 775
    .line 776
    return-void

    .line 777
    :cond_19
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    const-string v4, "/setZoom"

    .line 782
    .line 783
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    move-result v0

    .line 787
    if-eqz v0, :cond_1a

    .line 788
    .line 789
    if-eqz v7, :cond_1a

    .line 790
    .line 791
    const-string v0, "scale"

    .line 792
    .line 793
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 794
    .line 795
    invoke-virtual {v7, v0, v3, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 796
    .line 797
    .line 798
    move-result-wide v3

    .line 799
    double-to-float v0, v3

    .line 800
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    check-cast v2, Lx1/g;

    .line 805
    .line 806
    check-cast v2, Lco/median/android/MainActivity;

    .line 807
    .line 808
    invoke-virtual {v2, v0, v3}, Lco/median/android/MainActivity;->Z(FLjava/lang/String;)V

    .line 809
    .line 810
    .line 811
    return-void

    .line 812
    :cond_1a
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    const-string v3, "/getZoom"

    .line 817
    .line 818
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v0

    .line 822
    if-eqz v0, :cond_7c

    .line 823
    .line 824
    if-eqz v7, :cond_7c

    .line 825
    .line 826
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 831
    .line 832
    .line 833
    move-result v0

    .line 834
    if-eqz v0, :cond_1b

    .line 835
    .line 836
    goto/16 :goto_21

    .line 837
    .line 838
    :cond_1b
    new-instance v3, Lorg/json/JSONObject;

    .line 839
    .line 840
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 841
    .line 842
    .line 843
    :try_start_6
    const-string v0, "zoom"

    .line 844
    .line 845
    move-object v4, v2

    .line 846
    check-cast v4, Lx1/g;

    .line 847
    .line 848
    check-cast v4, Lco/median/android/MainActivity;

    .line 849
    .line 850
    iget v5, v4, Lco/median/android/MainActivity;->F0:F

    .line 851
    .line 852
    iget v4, v4, Lco/median/android/MainActivity;->E0:F

    .line 853
    .line 854
    div-float/2addr v5, v4

    .line 855
    float-to-double v4, v5

    .line 856
    invoke-virtual {v3, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_6

    .line 857
    .line 858
    .line 859
    goto :goto_b

    .line 860
    :catch_6
    move-exception v0

    .line 861
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    invoke-virtual {v4, v11, v0, v8}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 870
    .line 871
    .line 872
    :goto_b
    move-object v0, v2

    .line 873
    check-cast v0, Lx1/g;

    .line 874
    .line 875
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    invoke-static {v2, v3}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    check-cast v0, Lco/median/android/MainActivity;

    .line 884
    .line 885
    invoke-virtual {v0, v2, v8}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 886
    .line 887
    .line 888
    return-void

    .line 889
    :cond_1c
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    const-string v14, "run"

    .line 894
    .line 895
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    if-eqz v0, :cond_1e

    .line 900
    .line 901
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    const-string v14, "/median_device_info"

    .line 906
    .line 907
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    if-eqz v0, :cond_1e

    .line 912
    .line 913
    const-string v0, "median_device_info"

    .line 914
    .line 915
    if-eqz v7, :cond_1d

    .line 916
    .line 917
    invoke-virtual {v7, v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    const-string v14, "includeCarrierNames"

    .line 922
    .line 923
    invoke-virtual {v7, v14, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 924
    .line 925
    .line 926
    move-result v14

    .line 927
    goto :goto_c

    .line 928
    :cond_1d
    move v14, v4

    .line 929
    :goto_c
    move-object v15, v2

    .line 930
    check-cast v15, Lx1/g;

    .line 931
    .line 932
    check-cast v15, Lco/median/android/MainActivity;

    .line 933
    .line 934
    invoke-virtual {v15, v0, v14}, Lco/median/android/MainActivity;->U(Ljava/lang/String;Z)V

    .line 935
    .line 936
    .line 937
    :cond_1e
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    const-string v14, "geoLocation"

    .line 942
    .line 943
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    move-result v0

    .line 947
    const-string v14, "enabled"

    .line 948
    .line 949
    if-eqz v0, :cond_22

    .line 950
    .line 951
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    const-string v5, "/promptLocationServices"

    .line 956
    .line 957
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 958
    .line 959
    .line 960
    move-result v0

    .line 961
    if-eqz v0, :cond_1f

    .line 962
    .line 963
    move-object v0, v2

    .line 964
    check-cast v0, Lx1/g;

    .line 965
    .line 966
    check-cast v0, Lco/median/android/MainActivity;

    .line 967
    .line 968
    iget-object v0, v0, Lco/median/android/MainActivity;->k0:Lu1/r0;

    .line 969
    .line 970
    invoke-virtual {v0}, Lu1/r0;->a()V

    .line 971
    .line 972
    .line 973
    return-void

    .line 974
    :cond_1f
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    const-string v3, "/isLocationServicesEnabled"

    .line 979
    .line 980
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 981
    .line 982
    .line 983
    move-result v0

    .line 984
    if-eqz v0, :cond_7c

    .line 985
    .line 986
    if-eqz v7, :cond_7c

    .line 987
    .line 988
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    move-object v3, v2

    .line 993
    check-cast v3, Lx1/g;

    .line 994
    .line 995
    check-cast v3, Lco/median/android/MainActivity;

    .line 996
    .line 997
    iget-object v3, v3, Lco/median/android/MainActivity;->k0:Lu1/r0;

    .line 998
    .line 999
    iget-object v5, v3, Lu1/r0;->a:Lco/median/android/MainActivity;

    .line 1000
    .line 1001
    const-string v6, "android.permission.ACCESS_FINE_LOCATION"

    .line 1002
    .line 1003
    invoke-static {v5, v6}, Lc0/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 1004
    .line 1005
    .line 1006
    move-result v6

    .line 1007
    const-string v7, "android.permission.ACCESS_COARSE_LOCATION"

    .line 1008
    .line 1009
    invoke-static {v5, v7}, Lc0/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 1010
    .line 1011
    .line 1012
    move-result v5

    .line 1013
    if-nez v6, :cond_21

    .line 1014
    .line 1015
    if-nez v5, :cond_21

    .line 1016
    .line 1017
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1018
    .line 1019
    iget-object v3, v3, Lu1/r0;->a:Lco/median/android/MainActivity;

    .line 1020
    .line 1021
    const/16 v6, 0x1c

    .line 1022
    .line 1023
    if-lt v5, v6, :cond_20

    .line 1024
    .line 1025
    const-class v4, Landroid/location/LocationManager;

    .line 1026
    .line 1027
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v3

    .line 1031
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1032
    .line 1033
    .line 1034
    check-cast v3, Landroid/location/LocationManager;

    .line 1035
    .line 1036
    invoke-static {v3}, Landroidx/activity/v;->v(Landroid/location/LocationManager;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v4

    .line 1040
    goto :goto_d

    .line 1041
    :cond_20
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v3

    .line 1045
    const-string v5, "location_mode"

    .line 1046
    .line 1047
    invoke-static {v3, v5, v4}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 1048
    .line 1049
    .line 1050
    move-result v3

    .line 1051
    if-eqz v3, :cond_21

    .line 1052
    .line 1053
    move v4, v13

    .line 1054
    :cond_21
    :goto_d
    new-instance v3, Lorg/json/JSONObject;

    .line 1055
    .line 1056
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 1057
    .line 1058
    .line 1059
    :try_start_7
    invoke-virtual {v3, v14, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1060
    .line 1061
    .line 1062
    check-cast v2, Lx1/g;

    .line 1063
    .line 1064
    invoke-static {v0, v3}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    check-cast v2, Lco/median/android/MainActivity;

    .line 1069
    .line 1070
    invoke-virtual {v2, v0, v8}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_7

    .line 1071
    .line 1072
    .line 1073
    goto/16 :goto_21

    .line 1074
    .line 1075
    :catch_7
    move-exception v0

    .line 1076
    const-string v2, "handleJSBridgeFunctions: "

    .line 1077
    .line 1078
    invoke-static {v11, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1079
    .line 1080
    .line 1081
    return-void

    .line 1082
    :cond_22
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    const-string v15, "config"

    .line 1087
    .line 1088
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v0

    .line 1092
    const-string v15, "/set"

    .line 1093
    .line 1094
    if-eqz v0, :cond_23

    .line 1095
    .line 1096
    if-eqz v7, :cond_23

    .line 1097
    .line 1098
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v0

    .line 1106
    if-eqz v0, :cond_7c

    .line 1107
    .line 1108
    const-string v0, "initialUrl"

    .line 1109
    .line 1110
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1115
    .line 1116
    .line 1117
    move-result v2

    .line 1118
    if-nez v2, :cond_7c

    .line 1119
    .line 1120
    invoke-virtual {v6, v0}, Lx1/a;->z(Ljava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    return-void

    .line 1124
    :cond_23
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    const-string v13, "screen"

    .line 1129
    .line 1130
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v0

    .line 1134
    const-string v13, "mode"

    .line 1135
    .line 1136
    if-eqz v0, :cond_32

    .line 1137
    .line 1138
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    const-string v6, "/setBrightness"

    .line 1143
    .line 1144
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1145
    .line 1146
    .line 1147
    move-result v0

    .line 1148
    const-string v6, "default"

    .line 1149
    .line 1150
    if-eqz v0, :cond_2a

    .line 1151
    .line 1152
    if-nez v7, :cond_24

    .line 1153
    .line 1154
    goto/16 :goto_21

    .line 1155
    .line 1156
    :cond_24
    const-string v0, "brightness"

    .line 1157
    .line 1158
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v0

    .line 1162
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1163
    .line 1164
    .line 1165
    move-result v9

    .line 1166
    if-eqz v9, :cond_25

    .line 1167
    .line 1168
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1173
    .line 1174
    const-string v4, "Brightness not specified in "

    .line 1175
    .line 1176
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v3

    .line 1183
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    invoke-virtual {v0, v11, v2, v8}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1191
    .line 1192
    .line 1193
    return-void

    .line 1194
    :cond_25
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v6

    .line 1198
    if-eqz v6, :cond_26

    .line 1199
    .line 1200
    move-object v0, v2

    .line 1201
    check-cast v0, Lx1/g;

    .line 1202
    .line 1203
    check-cast v0, Lco/median/android/MainActivity;

    .line 1204
    .line 1205
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v2

    .line 1209
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v2

    .line 1213
    const/high16 v3, -0x40800000    # -1.0f

    .line 1214
    .line 1215
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 1216
    .line 1217
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v3

    .line 1221
    invoke-virtual {v3, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 1222
    .line 1223
    .line 1224
    iput-boolean v4, v0, Lco/median/android/MainActivity;->r0:Z

    .line 1225
    .line 1226
    return-void

    .line 1227
    :cond_26
    :try_start_8
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1228
    .line 1229
    .line 1230
    move-result v0

    .line 1231
    const/4 v4, 0x0

    .line 1232
    cmpg-float v4, v0, v4

    .line 1233
    .line 1234
    if-ltz v4, :cond_29

    .line 1235
    .line 1236
    float-to-double v8, v0

    .line 1237
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 1238
    .line 1239
    cmpl-double v4, v8, v12

    .line 1240
    .line 1241
    if-lez v4, :cond_27

    .line 1242
    .line 1243
    goto :goto_f

    .line 1244
    :cond_27
    move-object v3, v2

    .line 1245
    check-cast v3, Lx1/g;

    .line 1246
    .line 1247
    check-cast v3, Lco/median/android/MainActivity;

    .line 1248
    .line 1249
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v4

    .line 1253
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v4

    .line 1257
    iput v0, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 1258
    .line 1259
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    invoke-virtual {v0, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 1264
    .line 1265
    .line 1266
    const-string v0, "restoreOnNavigation"

    .line 1267
    .line 1268
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    const-string v3, "true"

    .line 1273
    .line 1274
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v3

    .line 1278
    if-nez v3, :cond_28

    .line 1279
    .line 1280
    const-string v3, "1"

    .line 1281
    .line 1282
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v0

    .line 1286
    if-eqz v0, :cond_7c

    .line 1287
    .line 1288
    goto :goto_e

    .line 1289
    :catch_8
    move-exception v0

    .line 1290
    goto :goto_10

    .line 1291
    :cond_28
    :goto_e
    move-object v0, v2

    .line 1292
    check-cast v0, Lx1/g;

    .line 1293
    .line 1294
    check-cast v0, Lco/median/android/MainActivity;

    .line 1295
    .line 1296
    const/4 v2, 0x1

    .line 1297
    iput-boolean v2, v0, Lco/median/android/MainActivity;->r0:Z

    .line 1298
    .line 1299
    goto/16 :goto_21

    .line 1300
    .line 1301
    :cond_29
    :goto_f
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1306
    .line 1307
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v3

    .line 1314
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v2

    .line 1321
    invoke-virtual {v0, v11, v2}, Lx1/f;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    .line 1322
    .line 1323
    .line 1324
    goto/16 :goto_21

    .line 1325
    .line 1326
    :goto_10
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    const-string v3, "Error parsing brightness"

    .line 1331
    .line 1332
    invoke-virtual {v2, v11, v3, v0}, Lx1/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1333
    .line 1334
    .line 1335
    goto/16 :goto_21

    .line 1336
    .line 1337
    :cond_2a
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    const-string v5, "/fullscreen"

    .line 1342
    .line 1343
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v0

    .line 1347
    if-eqz v0, :cond_2b

    .line 1348
    .line 1349
    move-object v0, v2

    .line 1350
    check-cast v0, Lx1/g;

    .line 1351
    .line 1352
    check-cast v0, Lco/median/android/MainActivity;

    .line 1353
    .line 1354
    const/4 v2, 0x1

    .line 1355
    invoke-virtual {v0, v2}, Lco/median/android/MainActivity;->s0(Z)V

    .line 1356
    .line 1357
    .line 1358
    return-void

    .line 1359
    :cond_2b
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v0

    .line 1363
    const-string v5, "/normal"

    .line 1364
    .line 1365
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1366
    .line 1367
    .line 1368
    move-result v0

    .line 1369
    if-eqz v0, :cond_2c

    .line 1370
    .line 1371
    move-object v0, v2

    .line 1372
    check-cast v0, Lx1/g;

    .line 1373
    .line 1374
    check-cast v0, Lco/median/android/MainActivity;

    .line 1375
    .line 1376
    invoke-virtual {v0, v4}, Lco/median/android/MainActivity;->s0(Z)V

    .line 1377
    .line 1378
    .line 1379
    return-void

    .line 1380
    :cond_2c
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v0

    .line 1384
    const-string v4, "/keepScreenOn"

    .line 1385
    .line 1386
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1387
    .line 1388
    .line 1389
    move-result v0

    .line 1390
    const/16 v4, 0x80

    .line 1391
    .line 1392
    if-eqz v0, :cond_2d

    .line 1393
    .line 1394
    move-object v0, v2

    .line 1395
    check-cast v0, Lx1/g;

    .line 1396
    .line 1397
    check-cast v0, Lco/median/android/MainActivity;

    .line 1398
    .line 1399
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v0

    .line 1403
    invoke-virtual {v0, v4}, Landroid/view/Window;->addFlags(I)V

    .line 1404
    .line 1405
    .line 1406
    return-void

    .line 1407
    :cond_2d
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v0

    .line 1411
    const-string v5, "/keepScreenNormal"

    .line 1412
    .line 1413
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1414
    .line 1415
    .line 1416
    move-result v0

    .line 1417
    if-eqz v0, :cond_2e

    .line 1418
    .line 1419
    move-object v0, v2

    .line 1420
    check-cast v0, Lx1/g;

    .line 1421
    .line 1422
    check-cast v0, Lco/median/android/MainActivity;

    .line 1423
    .line 1424
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v0

    .line 1428
    invoke-virtual {v0, v4}, Landroid/view/Window;->clearFlags(I)V

    .line 1429
    .line 1430
    .line 1431
    return-void

    .line 1432
    :cond_2e
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v0

    .line 1436
    const-string v4, "/setColorScheme"

    .line 1437
    .line 1438
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1439
    .line 1440
    .line 1441
    move-result v0

    .line 1442
    if-eqz v0, :cond_2f

    .line 1443
    .line 1444
    if-eqz v7, :cond_2f

    .line 1445
    .line 1446
    move-object v0, v2

    .line 1447
    check-cast v0, Lx1/g;

    .line 1448
    .line 1449
    invoke-virtual {v7, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v2

    .line 1453
    check-cast v0, Lco/median/android/MainActivity;

    .line 1454
    .line 1455
    invoke-virtual {v0, v2}, Lco/median/android/MainActivity;->i0(Ljava/lang/String;)V

    .line 1456
    .line 1457
    .line 1458
    return-void

    .line 1459
    :cond_2f
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v0

    .line 1463
    const-string v4, "/resetColorScheme"

    .line 1464
    .line 1465
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1466
    .line 1467
    .line 1468
    move-result v0

    .line 1469
    if-eqz v0, :cond_30

    .line 1470
    .line 1471
    move-object v0, v2

    .line 1472
    check-cast v0, Lx1/g;

    .line 1473
    .line 1474
    check-cast v0, Lco/median/android/MainActivity;

    .line 1475
    .line 1476
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v2

    .line 1480
    iget-object v2, v2, Lx1/a;->l0:Ljava/lang/String;

    .line 1481
    .line 1482
    iput-object v2, v0, Lco/median/android/MainActivity;->A0:Ljava/lang/String;

    .line 1483
    .line 1484
    invoke-virtual {v0, v2}, Lco/median/android/MainActivity;->i0(Ljava/lang/String;)V

    .line 1485
    .line 1486
    .line 1487
    return-void

    .line 1488
    :cond_30
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v0

    .line 1492
    const-string v3, "/setMode"

    .line 1493
    .line 1494
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1495
    .line 1496
    .line 1497
    move-result v0

    .line 1498
    if-eqz v0, :cond_7c

    .line 1499
    .line 1500
    if-eqz v7, :cond_7c

    .line 1501
    .line 1502
    const-string v0, "auto"

    .line 1503
    .line 1504
    invoke-virtual {v7, v13, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v0

    .line 1508
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1509
    .line 1510
    .line 1511
    move-result v3

    .line 1512
    if-eqz v3, :cond_31

    .line 1513
    .line 1514
    move-object v0, v2

    .line 1515
    check-cast v0, Lx1/g;

    .line 1516
    .line 1517
    check-cast v0, Lco/median/android/MainActivity;

    .line 1518
    .line 1519
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v2

    .line 1523
    iget-object v2, v2, Lx1/a;->l0:Ljava/lang/String;

    .line 1524
    .line 1525
    iput-object v2, v0, Lco/median/android/MainActivity;->A0:Ljava/lang/String;

    .line 1526
    .line 1527
    invoke-virtual {v0, v2}, Lco/median/android/MainActivity;->i0(Ljava/lang/String;)V

    .line 1528
    .line 1529
    .line 1530
    return-void

    .line 1531
    :cond_31
    check-cast v2, Lx1/g;

    .line 1532
    .line 1533
    check-cast v2, Lco/median/android/MainActivity;

    .line 1534
    .line 1535
    invoke-virtual {v2, v0}, Lco/median/android/MainActivity;->i0(Ljava/lang/String;)V

    .line 1536
    .line 1537
    .line 1538
    return-void

    .line 1539
    :cond_32
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v0

    .line 1543
    const-string v5, "window"

    .line 1544
    .line 1545
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1546
    .line 1547
    .line 1548
    move-result v0

    .line 1549
    const-string v5, "url"

    .line 1550
    .line 1551
    if-eqz v0, :cond_34

    .line 1552
    .line 1553
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v0

    .line 1557
    const-string v4, "/close"

    .line 1558
    .line 1559
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1560
    .line 1561
    .line 1562
    move-result v0

    .line 1563
    if-eqz v0, :cond_33

    .line 1564
    .line 1565
    move-object v0, v2

    .line 1566
    check-cast v0, Lx1/g;

    .line 1567
    .line 1568
    check-cast v0, Lco/median/android/MainActivity;

    .line 1569
    .line 1570
    invoke-virtual {v0}, Lco/median/android/MainActivity;->A()V

    .line 1571
    .line 1572
    .line 1573
    return-void

    .line 1574
    :cond_33
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v0

    .line 1578
    const-string v3, "/open"

    .line 1579
    .line 1580
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1581
    .line 1582
    .line 1583
    move-result v0

    .line 1584
    if-eqz v0, :cond_7c

    .line 1585
    .line 1586
    if-eqz v7, :cond_7c

    .line 1587
    .line 1588
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    invoke-virtual {v7, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v3

    .line 1596
    check-cast v2, Lx1/g;

    .line 1597
    .line 1598
    check-cast v2, Lco/median/android/MainActivity;

    .line 1599
    .line 1600
    invoke-virtual {v2, v0, v3}, Lco/median/android/MainActivity;->Q(Ljava/lang/String;Ljava/lang/String;)V

    .line 1601
    .line 1602
    .line 1603
    return-void

    .line 1604
    :cond_34
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v0

    .line 1608
    const-string v13, "navigationMaxWindows"

    .line 1609
    .line 1610
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1611
    .line 1612
    .line 1613
    move-result v0

    .line 1614
    const-string v13, "persist"

    .line 1615
    .line 1616
    if-eqz v0, :cond_35

    .line 1617
    .line 1618
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v0

    .line 1622
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1623
    .line 1624
    .line 1625
    move-result v0

    .line 1626
    if-eqz v0, :cond_7c

    .line 1627
    .line 1628
    if-eqz v7, :cond_7c

    .line 1629
    .line 1630
    iget-boolean v0, v6, Lx1/a;->D:Z

    .line 1631
    .line 1632
    invoke-virtual {v7, v14, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 1633
    .line 1634
    .line 1635
    move-result v0

    .line 1636
    iget v2, v6, Lx1/a;->E:I

    .line 1637
    .line 1638
    const-string v3, "numWindows"

    .line 1639
    .line 1640
    invoke-virtual {v7, v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 1641
    .line 1642
    .line 1643
    move-result v2

    .line 1644
    invoke-virtual {v7, v10, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 1645
    .line 1646
    .line 1647
    move-result v2

    .line 1648
    iget-boolean v3, v6, Lx1/a;->F:Z

    .line 1649
    .line 1650
    const-string v4, "autoClose"

    .line 1651
    .line 1652
    invoke-virtual {v7, v4, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 1653
    .line 1654
    .line 1655
    move-result v3

    .line 1656
    invoke-virtual {v7, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 1657
    .line 1658
    .line 1659
    move-result v4

    .line 1660
    invoke-virtual {v6, v0, v2, v3, v4}, Lx1/a;->A(ZIZZ)V

    .line 1661
    .line 1662
    .line 1663
    return-void

    .line 1664
    :cond_35
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v0

    .line 1668
    const-string v8, "navigationTitles"

    .line 1669
    .line 1670
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1671
    .line 1672
    .line 1673
    move-result v0

    .line 1674
    if-eqz v0, :cond_38

    .line 1675
    .line 1676
    if-eqz v7, :cond_38

    .line 1677
    .line 1678
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v0

    .line 1682
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1683
    .line 1684
    .line 1685
    move-result v0

    .line 1686
    if-eqz v0, :cond_37

    .line 1687
    .line 1688
    invoke-virtual {v7, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 1689
    .line 1690
    .line 1691
    move-result v2

    .line 1692
    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v3

    .line 1696
    if-nez v3, :cond_36

    .line 1697
    .line 1698
    :try_start_9
    new-instance v0, Lorg/json/JSONObject;

    .line 1699
    .line 1700
    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v4

    .line 1704
    invoke-direct {v0, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_9

    .line 1705
    .line 1706
    .line 1707
    move-object v3, v0

    .line 1708
    goto :goto_11

    .line 1709
    :catch_9
    move-exception v0

    .line 1710
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v4

    .line 1714
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1715
    .line 1716
    const-string v7, "Median Navigation Titles JSONException:- "

    .line 1717
    .line 1718
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1719
    .line 1720
    .line 1721
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v7

    .line 1725
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v5

    .line 1732
    invoke-virtual {v4, v11, v5, v0}, Lx1/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1733
    .line 1734
    .line 1735
    :cond_36
    :goto_11
    invoke-virtual {v6, v3, v2}, Lx1/a;->C(Lorg/json/JSONObject;Z)V

    .line 1736
    .line 1737
    .line 1738
    return-void

    .line 1739
    :cond_37
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v0

    .line 1743
    const-string v3, "/setCurrent"

    .line 1744
    .line 1745
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1746
    .line 1747
    .line 1748
    move-result v0

    .line 1749
    if-eqz v0, :cond_7c

    .line 1750
    .line 1751
    move-object v0, v2

    .line 1752
    check-cast v0, Lx1/g;

    .line 1753
    .line 1754
    const-string v2, "title"

    .line 1755
    .line 1756
    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v2

    .line 1760
    check-cast v0, Lco/median/android/MainActivity;

    .line 1761
    .line 1762
    invoke-virtual {v0, v2}, Lco/median/android/MainActivity;->a0(Ljava/lang/String;)V

    .line 1763
    .line 1764
    .line 1765
    return-void

    .line 1766
    :cond_38
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v0

    .line 1770
    const-string v8, "navigationLevels"

    .line 1771
    .line 1772
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1773
    .line 1774
    .line 1775
    move-result v0

    .line 1776
    if-eqz v0, :cond_3a

    .line 1777
    .line 1778
    if-eqz v7, :cond_3a

    .line 1779
    .line 1780
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v0

    .line 1784
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1785
    .line 1786
    .line 1787
    move-result v0

    .line 1788
    if-eqz v0, :cond_7c

    .line 1789
    .line 1790
    invoke-virtual {v7, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 1791
    .line 1792
    .line 1793
    move-result v0

    .line 1794
    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v2

    .line 1798
    if-nez v2, :cond_39

    .line 1799
    .line 1800
    :try_start_a
    new-instance v2, Lorg/json/JSONObject;

    .line 1801
    .line 1802
    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v3

    .line 1806
    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_a

    .line 1807
    .line 1808
    .line 1809
    goto :goto_12

    .line 1810
    :catch_a
    move-exception v0

    .line 1811
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v2

    .line 1815
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1816
    .line 1817
    const-string v4, "Median Navigation Levels JSONException:- "

    .line 1818
    .line 1819
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1820
    .line 1821
    .line 1822
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v4

    .line 1826
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1827
    .line 1828
    .line 1829
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v3

    .line 1833
    invoke-virtual {v2, v11, v3, v0}, Lx1/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1834
    .line 1835
    .line 1836
    return-void

    .line 1837
    :cond_39
    :goto_12
    invoke-virtual {v6, v2, v0}, Lx1/a;->B(Lorg/json/JSONObject;Z)V

    .line 1838
    .line 1839
    .line 1840
    return-void

    .line 1841
    :cond_3a
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v0

    .line 1845
    const-string v8, "swipeGestures"

    .line 1846
    .line 1847
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1848
    .line 1849
    .line 1850
    move-result v0

    .line 1851
    if-eqz v0, :cond_3c

    .line 1852
    .line 1853
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v0

    .line 1857
    const-string v2, "/enable"

    .line 1858
    .line 1859
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1860
    .line 1861
    .line 1862
    move-result v0

    .line 1863
    if-eqz v0, :cond_3b

    .line 1864
    .line 1865
    const/4 v2, 0x1

    .line 1866
    iput-boolean v2, v6, Lx1/a;->C:Z

    .line 1867
    .line 1868
    return-void

    .line 1869
    :cond_3b
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v0

    .line 1873
    const-string v2, "/disable"

    .line 1874
    .line 1875
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1876
    .line 1877
    .line 1878
    move-result v0

    .line 1879
    if-eqz v0, :cond_7c

    .line 1880
    .line 1881
    iput-boolean v4, v6, Lx1/a;->C:Z

    .line 1882
    .line 1883
    return-void

    .line 1884
    :cond_3c
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v0

    .line 1888
    const-string v8, "sidebar"

    .line 1889
    .line 1890
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1891
    .line 1892
    .line 1893
    move-result v0

    .line 1894
    if-eqz v0, :cond_40

    .line 1895
    .line 1896
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v0

    .line 1900
    const-string v5, "/setItems"

    .line 1901
    .line 1902
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1903
    .line 1904
    .line 1905
    move-result v0

    .line 1906
    if-eqz v0, :cond_3f

    .line 1907
    .line 1908
    if-eqz v7, :cond_3f

    .line 1909
    .line 1910
    const-string v0, "items"

    .line 1911
    .line 1912
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v3

    .line 1916
    if-nez v3, :cond_3d

    .line 1917
    .line 1918
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v0

    .line 1922
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1923
    .line 1924
    .line 1925
    move-result v5

    .line 1926
    if-nez v5, :cond_3d

    .line 1927
    .line 1928
    :try_start_b
    new-instance v3, Lorg/json/JSONTokener;

    .line 1929
    .line 1930
    invoke-direct {v3, v0}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 1931
    .line 1932
    .line 1933
    invoke-virtual {v3}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v3
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_b

    .line 1937
    :cond_3d
    const/4 v0, 0x1

    .line 1938
    goto :goto_13

    .line 1939
    :catch_b
    const-string v0, "Median sidebar error: items is not JSON object"

    .line 1940
    .line 1941
    invoke-static {v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1942
    .line 1943
    .line 1944
    return-void

    .line 1945
    :goto_13
    invoke-virtual {v7, v14, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 1946
    .line 1947
    .line 1948
    move-result v0

    .line 1949
    invoke-virtual {v7, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 1950
    .line 1951
    .line 1952
    move-result v5

    .line 1953
    if-eqz v5, :cond_3e

    .line 1954
    .line 1955
    invoke-virtual {v7, v13, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 1956
    .line 1957
    .line 1958
    move-result v4

    .line 1959
    invoke-virtual {v6, v3, v0, v4}, Lx1/a;->F(Ljava/lang/Object;ZZ)V

    .line 1960
    .line 1961
    .line 1962
    goto :goto_14

    .line 1963
    :cond_3e
    invoke-virtual {v6, v3}, Lx1/a;->E(Ljava/lang/Object;)V

    .line 1964
    .line 1965
    .line 1966
    :goto_14
    check-cast v2, Lx1/g;

    .line 1967
    .line 1968
    check-cast v2, Lco/median/android/MainActivity;

    .line 1969
    .line 1970
    invoke-virtual {v2, v0}, Lco/median/android/MainActivity;->d0(Z)V

    .line 1971
    .line 1972
    .line 1973
    return-void

    .line 1974
    :cond_3f
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v0

    .line 1978
    const-string v3, "/getItems"

    .line 1979
    .line 1980
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1981
    .line 1982
    .line 1983
    move-result v0

    .line 1984
    if-eqz v0, :cond_7c

    .line 1985
    .line 1986
    if-eqz v7, :cond_7c

    .line 1987
    .line 1988
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v0

    .line 1992
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1993
    .line 1994
    .line 1995
    move-result v0

    .line 1996
    if-nez v0, :cond_7c

    .line 1997
    .line 1998
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v0

    .line 2002
    invoke-virtual {v6}, Lx1/a;->w()Lorg/json/JSONObject;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v3

    .line 2006
    if-eqz v3, :cond_7c

    .line 2007
    .line 2008
    check-cast v2, Lx1/g;

    .line 2009
    .line 2010
    invoke-static {v0, v3}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v0

    .line 2014
    check-cast v2, Lco/median/android/MainActivity;

    .line 2015
    .line 2016
    const/4 v3, 0x0

    .line 2017
    invoke-virtual {v2, v0, v3}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 2018
    .line 2019
    .line 2020
    return-void

    .line 2021
    :cond_40
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v0

    .line 2025
    const-string v8, "share"

    .line 2026
    .line 2027
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2028
    .line 2029
    .line 2030
    move-result v0

    .line 2031
    if-eqz v0, :cond_43

    .line 2032
    .line 2033
    if-eqz v7, :cond_43

    .line 2034
    .line 2035
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v0

    .line 2039
    const-string v4, "filename"

    .line 2040
    .line 2041
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v19

    .line 2045
    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 2046
    .line 2047
    .line 2048
    move-result v21

    .line 2049
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v22

    .line 2053
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v4

    .line 2057
    const-string v5, "/sharePage"

    .line 2058
    .line 2059
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2060
    .line 2061
    .line 2062
    move-result v4

    .line 2063
    if-eqz v4, :cond_41

    .line 2064
    .line 2065
    const-string v3, "text"

    .line 2066
    .line 2067
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2068
    .line 2069
    .line 2070
    move-result-object v3

    .line 2071
    check-cast v2, Lx1/g;

    .line 2072
    .line 2073
    check-cast v2, Lco/median/android/MainActivity;

    .line 2074
    .line 2075
    invoke-virtual {v2, v0, v3}, Lco/median/android/MainActivity;->l0(Ljava/lang/String;Ljava/lang/String;)V

    .line 2076
    .line 2077
    .line 2078
    return-void

    .line 2079
    :cond_41
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v4

    .line 2083
    const-string v5, "/downloadFile"

    .line 2084
    .line 2085
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2086
    .line 2087
    .line 2088
    move-result v4

    .line 2089
    if-eqz v4, :cond_42

    .line 2090
    .line 2091
    check-cast v2, Lx1/g;

    .line 2092
    .line 2093
    const/16 v20, 0x0

    .line 2094
    .line 2095
    move-object/from16 v17, v2

    .line 2096
    .line 2097
    check-cast v17, Lco/median/android/MainActivity;

    .line 2098
    .line 2099
    move-object/from16 v18, v0

    .line 2100
    .line 2101
    invoke-virtual/range {v17 .. v22}, Lco/median/android/MainActivity;->C(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    .line 2102
    .line 2103
    .line 2104
    return-void

    .line 2105
    :cond_42
    move-object/from16 v18, v0

    .line 2106
    .line 2107
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v0

    .line 2111
    const-string v3, "/downloadImage"

    .line 2112
    .line 2113
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2114
    .line 2115
    .line 2116
    move-result v0

    .line 2117
    if-eqz v0, :cond_7c

    .line 2118
    .line 2119
    move-object v0, v2

    .line 2120
    check-cast v0, Lx1/g;

    .line 2121
    .line 2122
    const/16 v20, 0x1

    .line 2123
    .line 2124
    move-object/from16 v17, v0

    .line 2125
    .line 2126
    check-cast v17, Lco/median/android/MainActivity;

    .line 2127
    .line 2128
    invoke-virtual/range {v17 .. v22}, Lco/median/android/MainActivity;->C(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    .line 2129
    .line 2130
    .line 2131
    return-void

    .line 2132
    :cond_43
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v0

    .line 2136
    const-string v5, "tabs"

    .line 2137
    .line 2138
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2139
    .line 2140
    .line 2141
    move-result v0

    .line 2142
    if-eqz v0, :cond_48

    .line 2143
    .line 2144
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v0

    .line 2148
    const-string v4, "/select/"

    .line 2149
    .line 2150
    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 2151
    .line 2152
    .line 2153
    move-result v0

    .line 2154
    if-eqz v0, :cond_44

    .line 2155
    .line 2156
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v0

    .line 2160
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2161
    .line 2162
    .line 2163
    move-result v3

    .line 2164
    const/4 v4, 0x2

    .line 2165
    if-ne v3, v4, :cond_7c

    .line 2166
    .line 2167
    const/4 v3, 0x1

    .line 2168
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v0

    .line 2172
    move-object v3, v0

    .line 2173
    check-cast v3, Ljava/lang/String;

    .line 2174
    .line 2175
    :try_start_c
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2176
    .line 2177
    .line 2178
    move-result v0

    .line 2179
    if-ltz v0, :cond_7c

    .line 2180
    .line 2181
    check-cast v2, Lx1/g;

    .line 2182
    .line 2183
    check-cast v2, Lco/median/android/MainActivity;

    .line 2184
    .line 2185
    invoke-virtual {v2, v0}, Lco/median/android/MainActivity;->W(I)V
    :try_end_c
    .catch Ljava/lang/NumberFormatException; {:try_start_c .. :try_end_c} :catch_c

    .line 2186
    .line 2187
    .line 2188
    goto/16 :goto_21

    .line 2189
    .line 2190
    :catch_c
    move-exception v0

    .line 2191
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v2

    .line 2195
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2196
    .line 2197
    const-string v5, "Invalid tab number "

    .line 2198
    .line 2199
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2200
    .line 2201
    .line 2202
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2203
    .line 2204
    .line 2205
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v3

    .line 2209
    invoke-virtual {v2, v11, v3, v0}, Lx1/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2210
    .line 2211
    .line 2212
    return-void

    .line 2213
    :cond_44
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2214
    .line 2215
    .line 2216
    move-result-object v0

    .line 2217
    const-string v4, "/deselect"

    .line 2218
    .line 2219
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2220
    .line 2221
    .line 2222
    move-result v0

    .line 2223
    if-eqz v0, :cond_45

    .line 2224
    .line 2225
    move-object v0, v2

    .line 2226
    check-cast v0, Lx1/g;

    .line 2227
    .line 2228
    check-cast v0, Lco/median/android/MainActivity;

    .line 2229
    .line 2230
    invoke-virtual {v0}, Lco/median/android/MainActivity;->B()V

    .line 2231
    .line 2232
    .line 2233
    return-void

    .line 2234
    :cond_45
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v0

    .line 2238
    const-string v3, "/setTabs"

    .line 2239
    .line 2240
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2241
    .line 2242
    .line 2243
    move-result v0

    .line 2244
    if-eqz v0, :cond_7c

    .line 2245
    .line 2246
    if-eqz v7, :cond_7c

    .line 2247
    .line 2248
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v0

    .line 2252
    if-nez v0, :cond_47

    .line 2253
    .line 2254
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v0

    .line 2258
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 2259
    .line 2260
    .line 2261
    move-result v3

    .line 2262
    if-eqz v3, :cond_46

    .line 2263
    .line 2264
    goto/16 :goto_21

    .line 2265
    .line 2266
    :cond_46
    :try_start_d
    new-instance v3, Lorg/json/JSONObject;

    .line 2267
    .line 2268
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_d

    .line 2269
    .line 2270
    .line 2271
    move-object v0, v3

    .line 2272
    goto :goto_15

    .line 2273
    :catch_d
    move-exception v0

    .line 2274
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v2

    .line 2278
    const-string v3, "Median Tabs JSONException"

    .line 2279
    .line 2280
    invoke-virtual {v2, v11, v3, v0}, Lx1/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2281
    .line 2282
    .line 2283
    return-void

    .line 2284
    :cond_47
    :goto_15
    const-string v3, "tabMenu"

    .line 2285
    .line 2286
    const/4 v4, -0x1

    .line 2287
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 2288
    .line 2289
    .line 2290
    move-result v3

    .line 2291
    check-cast v2, Lx1/g;

    .line 2292
    .line 2293
    check-cast v2, Lco/median/android/MainActivity;

    .line 2294
    .line 2295
    invoke-virtual {v2, v0, v3}, Lco/median/android/MainActivity;->h0(Lorg/json/JSONObject;I)V

    .line 2296
    .line 2297
    .line 2298
    return-void

    .line 2299
    :cond_48
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2300
    .line 2301
    .line 2302
    move-result-object v0

    .line 2303
    const-string v5, "connectivity"

    .line 2304
    .line 2305
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2306
    .line 2307
    .line 2308
    move-result v0

    .line 2309
    const-string v5, "/unsubscribe"

    .line 2310
    .line 2311
    const-string v8, "/subscribe"

    .line 2312
    .line 2313
    const-string v12, "/get"

    .line 2314
    .line 2315
    if-eqz v0, :cond_4b

    .line 2316
    .line 2317
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v0

    .line 2321
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2322
    .line 2323
    .line 2324
    move-result v0

    .line 2325
    if-eqz v0, :cond_49

    .line 2326
    .line 2327
    if-eqz v7, :cond_4b

    .line 2328
    .line 2329
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v0

    .line 2333
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 2334
    .line 2335
    .line 2336
    move-result v0

    .line 2337
    if-nez v0, :cond_4b

    .line 2338
    .line 2339
    move-object v0, v2

    .line 2340
    check-cast v0, Lx1/g;

    .line 2341
    .line 2342
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2343
    .line 2344
    .line 2345
    move-result-object v13

    .line 2346
    check-cast v0, Lco/median/android/MainActivity;

    .line 2347
    .line 2348
    invoke-virtual {v0, v13}, Lco/median/android/MainActivity;->Y(Ljava/lang/String;)V

    .line 2349
    .line 2350
    .line 2351
    goto :goto_16

    .line 2352
    :cond_49
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v0

    .line 2356
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2357
    .line 2358
    .line 2359
    move-result v0

    .line 2360
    if-eqz v0, :cond_4a

    .line 2361
    .line 2362
    if-eqz v7, :cond_4b

    .line 2363
    .line 2364
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v0

    .line 2368
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 2369
    .line 2370
    .line 2371
    move-result v0

    .line 2372
    if-nez v0, :cond_4b

    .line 2373
    .line 2374
    move-object v0, v2

    .line 2375
    check-cast v0, Lx1/g;

    .line 2376
    .line 2377
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2378
    .line 2379
    .line 2380
    move-result-object v13

    .line 2381
    check-cast v0, Lco/median/android/MainActivity;

    .line 2382
    .line 2383
    invoke-virtual {v0, v13}, Lco/median/android/MainActivity;->p0(Ljava/lang/String;)V

    .line 2384
    .line 2385
    .line 2386
    goto :goto_16

    .line 2387
    :cond_4a
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2388
    .line 2389
    .line 2390
    move-result-object v0

    .line 2391
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2392
    .line 2393
    .line 2394
    move-result v0

    .line 2395
    if-eqz v0, :cond_4b

    .line 2396
    .line 2397
    move-object v0, v2

    .line 2398
    check-cast v0, Lx1/g;

    .line 2399
    .line 2400
    check-cast v0, Lco/median/android/MainActivity;

    .line 2401
    .line 2402
    invoke-virtual {v0}, Lco/median/android/MainActivity;->t0()V

    .line 2403
    .line 2404
    .line 2405
    :cond_4b
    :goto_16
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2406
    .line 2407
    .line 2408
    move-result-object v0

    .line 2409
    const-string v13, "camera"

    .line 2410
    .line 2411
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2412
    .line 2413
    .line 2414
    move-result v0

    .line 2415
    if-eqz v0, :cond_4f

    .line 2416
    .line 2417
    iget-object v0, v6, Lx1/a;->o1:Lz1/a;

    .line 2418
    .line 2419
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2420
    .line 2421
    .line 2422
    move-result-object v4

    .line 2423
    const-string v5, "/setCaptureQuality"

    .line 2424
    .line 2425
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2426
    .line 2427
    .line 2428
    move-result v4

    .line 2429
    if-eqz v4, :cond_4d

    .line 2430
    .line 2431
    if-eqz v7, :cond_4d

    .line 2432
    .line 2433
    const-string v3, "quality"

    .line 2434
    .line 2435
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v3

    .line 2439
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 2440
    .line 2441
    .line 2442
    move-result-object v3

    .line 2443
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2444
    .line 2445
    .line 2446
    move-result v4

    .line 2447
    if-nez v4, :cond_7c

    .line 2448
    .line 2449
    const-string v4, "LOW"

    .line 2450
    .line 2451
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2452
    .line 2453
    .line 2454
    move-result v4

    .line 2455
    if-nez v4, :cond_4c

    .line 2456
    .line 2457
    const-string v4, "HIGH"

    .line 2458
    .line 2459
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2460
    .line 2461
    .line 2462
    move-result v4

    .line 2463
    if-nez v4, :cond_4c

    .line 2464
    .line 2465
    goto/16 :goto_21

    .line 2466
    .line 2467
    :cond_4c
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v3

    .line 2471
    invoke-static {v3}, Landroidx/fragment/app/u;->d(Ljava/lang/String;)I

    .line 2472
    .line 2473
    .line 2474
    move-result v3

    .line 2475
    invoke-virtual {v0, v3}, Lz1/a;->e(I)V

    .line 2476
    .line 2477
    .line 2478
    goto :goto_17

    .line 2479
    :cond_4d
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2480
    .line 2481
    .line 2482
    move-result-object v3

    .line 2483
    const-string v4, "/saveToGallery"

    .line 2484
    .line 2485
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2486
    .line 2487
    .line 2488
    move-result v3

    .line 2489
    if-eqz v3, :cond_4e

    .line 2490
    .line 2491
    if-eqz v7, :cond_4e

    .line 2492
    .line 2493
    invoke-virtual {v0}, Lz1/a;->d()Z

    .line 2494
    .line 2495
    .line 2496
    move-result v3

    .line 2497
    const-string v4, "saveToGallery"

    .line 2498
    .line 2499
    invoke-virtual {v7, v4, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 2500
    .line 2501
    .line 2502
    move-result v3

    .line 2503
    invoke-virtual {v0, v3}, Lz1/a;->f(Z)V

    .line 2504
    .line 2505
    .line 2506
    :cond_4e
    :goto_17
    invoke-virtual {v0, v2}, Lz1/a;->c(Landroid/app/Activity;)V

    .line 2507
    .line 2508
    .line 2509
    return-void

    .line 2510
    :cond_4f
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2511
    .line 2512
    .line 2513
    move-result-object v0

    .line 2514
    const-string v13, "audio"

    .line 2515
    .line 2516
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2517
    .line 2518
    .line 2519
    move-result v0

    .line 2520
    if-eqz v0, :cond_50

    .line 2521
    .line 2522
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v0

    .line 2526
    const-string v3, "/requestFocus"

    .line 2527
    .line 2528
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2529
    .line 2530
    .line 2531
    move-result v0

    .line 2532
    if-eqz v0, :cond_7c

    .line 2533
    .line 2534
    iget-object v0, v6, Lx1/a;->J0:Lz1/d;

    .line 2535
    .line 2536
    invoke-virtual {v0}, Lz1/d;->a()Z

    .line 2537
    .line 2538
    .line 2539
    move-result v0

    .line 2540
    if-eqz v0, :cond_7c

    .line 2541
    .line 2542
    if-eqz v7, :cond_7c

    .line 2543
    .line 2544
    move-object v0, v2

    .line 2545
    check-cast v0, Lx1/g;

    .line 2546
    .line 2547
    const/4 v2, 0x1

    .line 2548
    invoke-virtual {v7, v14, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 2549
    .line 2550
    .line 2551
    move-result v2

    .line 2552
    check-cast v0, Lco/median/android/MainActivity;

    .line 2553
    .line 2554
    invoke-virtual {v0, v2}, Lco/median/android/MainActivity;->D(Z)V

    .line 2555
    .line 2556
    .line 2557
    return-void

    .line 2558
    :cond_50
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v0

    .line 2562
    const-string v13, "statusbar"

    .line 2563
    .line 2564
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2565
    .line 2566
    .line 2567
    move-result v0

    .line 2568
    const-string v13, "insetsController"

    .line 2569
    .line 2570
    const-string v4, "color"

    .line 2571
    .line 2572
    move/from16 v17, v0

    .line 2573
    .line 2574
    const-string v0, "overlay"

    .line 2575
    .line 2576
    const-string v1, "style"

    .line 2577
    .line 2578
    if-eqz v17, :cond_56

    .line 2579
    .line 2580
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2581
    .line 2582
    .line 2583
    move-result-object v3

    .line 2584
    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2585
    .line 2586
    .line 2587
    move-result v3

    .line 2588
    if-eqz v3, :cond_7c

    .line 2589
    .line 2590
    if-eqz v7, :cond_7c

    .line 2591
    .line 2592
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2593
    .line 2594
    .line 2595
    move-result-object v3

    .line 2596
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2597
    .line 2598
    .line 2599
    move-result v4

    .line 2600
    if-nez v4, :cond_51

    .line 2601
    .line 2602
    invoke-static {v3}, Lt2/i;->H(Ljava/lang/String;)Ljava/lang/Integer;

    .line 2603
    .line 2604
    .line 2605
    move-result-object v3

    .line 2606
    if-eqz v3, :cond_51

    .line 2607
    .line 2608
    move-object v4, v2

    .line 2609
    check-cast v4, Lx1/g;

    .line 2610
    .line 2611
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2612
    .line 2613
    .line 2614
    move-result v3

    .line 2615
    check-cast v4, Lco/median/android/MainActivity;

    .line 2616
    .line 2617
    invoke-virtual {v4, v3}, Lco/median/android/MainActivity;->e0(I)V

    .line 2618
    .line 2619
    .line 2620
    :cond_51
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 2621
    .line 2622
    .line 2623
    move-result v3

    .line 2624
    if-eqz v3, :cond_54

    .line 2625
    .line 2626
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2627
    .line 2628
    .line 2629
    move-result-object v1

    .line 2630
    move-object v3, v2

    .line 2631
    check-cast v3, Lx1/g;

    .line 2632
    .line 2633
    check-cast v3, Lco/median/android/MainActivity;

    .line 2634
    .line 2635
    iget-object v3, v3, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2636
    .line 2637
    if-eqz v3, :cond_54

    .line 2638
    .line 2639
    if-eqz v1, :cond_54

    .line 2640
    .line 2641
    invoke-static {v1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 2642
    .line 2643
    .line 2644
    move-result v4

    .line 2645
    if-eqz v4, :cond_52

    .line 2646
    .line 2647
    goto :goto_18

    .line 2648
    :cond_52
    iput-object v1, v3, Lu1/r1;->l:Ljava/lang/String;

    .line 2649
    .line 2650
    iget-object v4, v3, Lu1/r1;->e:La3/h0;

    .line 2651
    .line 2652
    if-eqz v4, :cond_53

    .line 2653
    .line 2654
    invoke-virtual {v3, v1}, Lu1/r1;->b(Ljava/lang/String;)Z

    .line 2655
    .line 2656
    .line 2657
    move-result v1

    .line 2658
    iget-object v3, v4, La3/h0;->g:Ljava/lang/Object;

    .line 2659
    .line 2660
    check-cast v3, Le4/a;

    .line 2661
    .line 2662
    invoke-virtual {v3, v1}, Le4/a;->c0(Z)V

    .line 2663
    .line 2664
    .line 2665
    goto :goto_18

    .line 2666
    :cond_53
    invoke-static {v13}, Lr3/g;->c(Ljava/lang/String;)V

    .line 2667
    .line 2668
    .line 2669
    const/16 v16, 0x0

    .line 2670
    .line 2671
    throw v16

    .line 2672
    :cond_54
    :goto_18
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 2673
    .line 2674
    .line 2675
    move-result v1

    .line 2676
    if-eqz v1, :cond_7c

    .line 2677
    .line 2678
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 2679
    .line 2680
    .line 2681
    move-result v0

    .line 2682
    move-object v1, v2

    .line 2683
    check-cast v1, Lx1/g;

    .line 2684
    .line 2685
    check-cast v1, Lco/median/android/MainActivity;

    .line 2686
    .line 2687
    iget-object v2, v1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2688
    .line 2689
    if-nez v2, :cond_55

    .line 2690
    .line 2691
    goto/16 :goto_21

    .line 2692
    .line 2693
    :cond_55
    invoke-static {v1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 2694
    .line 2695
    .line 2696
    move-result-object v2

    .line 2697
    iput-boolean v0, v2, Lx1/a;->t0:Z

    .line 2698
    .line 2699
    iget-object v0, v1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2700
    .line 2701
    iget-object v0, v0, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 2702
    .line 2703
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2704
    .line 2705
    .line 2706
    move-result-object v0

    .line 2707
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 2708
    .line 2709
    .line 2710
    move-result-object v0

    .line 2711
    invoke-virtual {v0}, Landroid/view/View;->requestApplyInsets()V

    .line 2712
    .line 2713
    .line 2714
    goto/16 :goto_21

    .line 2715
    .line 2716
    :cond_56
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2717
    .line 2718
    .line 2719
    move-result-object v2

    .line 2720
    move-object/from16 v17, v3

    .line 2721
    .line 2722
    const-string v3, "systemNavBar"

    .line 2723
    .line 2724
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2725
    .line 2726
    .line 2727
    move-result v2

    .line 2728
    if-eqz v2, :cond_5c

    .line 2729
    .line 2730
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2731
    .line 2732
    .line 2733
    move-result-object v2

    .line 2734
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2735
    .line 2736
    .line 2737
    move-result v2

    .line 2738
    if-eqz v2, :cond_7c

    .line 2739
    .line 2740
    if-eqz v7, :cond_7c

    .line 2741
    .line 2742
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2743
    .line 2744
    .line 2745
    move-result-object v2

    .line 2746
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2747
    .line 2748
    .line 2749
    move-result v3

    .line 2750
    if-nez v3, :cond_57

    .line 2751
    .line 2752
    invoke-static {v2}, Lt2/i;->H(Ljava/lang/String;)Ljava/lang/Integer;

    .line 2753
    .line 2754
    .line 2755
    move-result-object v2

    .line 2756
    if-eqz v2, :cond_57

    .line 2757
    .line 2758
    move-object/from16 v3, p1

    .line 2759
    .line 2760
    check-cast v3, Lx1/g;

    .line 2761
    .line 2762
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2763
    .line 2764
    .line 2765
    move-result v2

    .line 2766
    check-cast v3, Lco/median/android/MainActivity;

    .line 2767
    .line 2768
    invoke-virtual {v3, v2}, Lco/median/android/MainActivity;->g0(I)V

    .line 2769
    .line 2770
    .line 2771
    :cond_57
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 2772
    .line 2773
    .line 2774
    move-result v2

    .line 2775
    if-eqz v2, :cond_5a

    .line 2776
    .line 2777
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v1

    .line 2781
    move-object/from16 v2, p1

    .line 2782
    .line 2783
    check-cast v2, Lx1/g;

    .line 2784
    .line 2785
    check-cast v2, Lco/median/android/MainActivity;

    .line 2786
    .line 2787
    iget-object v2, v2, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2788
    .line 2789
    if-eqz v2, :cond_5a

    .line 2790
    .line 2791
    if-eqz v1, :cond_5a

    .line 2792
    .line 2793
    invoke-static {v1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 2794
    .line 2795
    .line 2796
    move-result v3

    .line 2797
    if-eqz v3, :cond_58

    .line 2798
    .line 2799
    goto :goto_19

    .line 2800
    :cond_58
    iput-object v1, v2, Lu1/r1;->m:Ljava/lang/String;

    .line 2801
    .line 2802
    iget-object v3, v2, Lu1/r1;->e:La3/h0;

    .line 2803
    .line 2804
    if-eqz v3, :cond_59

    .line 2805
    .line 2806
    invoke-virtual {v2, v1}, Lu1/r1;->b(Ljava/lang/String;)Z

    .line 2807
    .line 2808
    .line 2809
    move-result v1

    .line 2810
    iget-object v2, v3, La3/h0;->g:Ljava/lang/Object;

    .line 2811
    .line 2812
    check-cast v2, Le4/a;

    .line 2813
    .line 2814
    invoke-virtual {v2, v1}, Le4/a;->b0(Z)V

    .line 2815
    .line 2816
    .line 2817
    goto :goto_19

    .line 2818
    :cond_59
    invoke-static {v13}, Lr3/g;->c(Ljava/lang/String;)V

    .line 2819
    .line 2820
    .line 2821
    const/16 v16, 0x0

    .line 2822
    .line 2823
    throw v16

    .line 2824
    :cond_5a
    :goto_19
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 2825
    .line 2826
    .line 2827
    move-result v1

    .line 2828
    if-eqz v1, :cond_7c

    .line 2829
    .line 2830
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 2831
    .line 2832
    .line 2833
    move-result v0

    .line 2834
    move-object/from16 v1, p1

    .line 2835
    .line 2836
    check-cast v1, Lx1/g;

    .line 2837
    .line 2838
    check-cast v1, Lco/median/android/MainActivity;

    .line 2839
    .line 2840
    iget-object v2, v1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2841
    .line 2842
    if-nez v2, :cond_5b

    .line 2843
    .line 2844
    goto/16 :goto_21

    .line 2845
    .line 2846
    :cond_5b
    invoke-static {v1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 2847
    .line 2848
    .line 2849
    move-result-object v2

    .line 2850
    iput-boolean v0, v2, Lx1/a;->u0:Z

    .line 2851
    .line 2852
    iget-object v0, v1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2853
    .line 2854
    iget-object v0, v0, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 2855
    .line 2856
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2857
    .line 2858
    .line 2859
    move-result-object v0

    .line 2860
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 2861
    .line 2862
    .line 2863
    move-result-object v0

    .line 2864
    invoke-virtual {v0}, Landroid/view/View;->requestApplyInsets()V

    .line 2865
    .line 2866
    .line 2867
    goto/16 :goto_21

    .line 2868
    .line 2869
    :cond_5c
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2870
    .line 2871
    .line 2872
    move-result-object v2

    .line 2873
    const-string v3, "systemBars"

    .line 2874
    .line 2875
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2876
    .line 2877
    .line 2878
    move-result v2

    .line 2879
    if-eqz v2, :cond_66

    .line 2880
    .line 2881
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2882
    .line 2883
    .line 2884
    move-result-object v2

    .line 2885
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2886
    .line 2887
    .line 2888
    move-result v2

    .line 2889
    if-eqz v2, :cond_7c

    .line 2890
    .line 2891
    if-eqz v7, :cond_7c

    .line 2892
    .line 2893
    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2894
    .line 2895
    .line 2896
    move-result-object v2

    .line 2897
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2898
    .line 2899
    .line 2900
    move-result v3

    .line 2901
    if-nez v3, :cond_5d

    .line 2902
    .line 2903
    invoke-static {v2}, Lt2/i;->H(Ljava/lang/String;)Ljava/lang/Integer;

    .line 2904
    .line 2905
    .line 2906
    move-result-object v2

    .line 2907
    if-eqz v2, :cond_5d

    .line 2908
    .line 2909
    move-object/from16 v3, p1

    .line 2910
    .line 2911
    check-cast v3, Lx1/g;

    .line 2912
    .line 2913
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2914
    .line 2915
    .line 2916
    move-result v2

    .line 2917
    check-cast v3, Lco/median/android/MainActivity;

    .line 2918
    .line 2919
    invoke-virtual {v3, v2}, Lco/median/android/MainActivity;->f0(I)V

    .line 2920
    .line 2921
    .line 2922
    :cond_5d
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 2923
    .line 2924
    .line 2925
    move-result v2

    .line 2926
    if-eqz v2, :cond_63

    .line 2927
    .line 2928
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2929
    .line 2930
    .line 2931
    move-result-object v1

    .line 2932
    move-object/from16 v2, p1

    .line 2933
    .line 2934
    check-cast v2, Lx1/g;

    .line 2935
    .line 2936
    check-cast v2, Lco/median/android/MainActivity;

    .line 2937
    .line 2938
    iget-object v3, v2, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2939
    .line 2940
    if-eqz v3, :cond_60

    .line 2941
    .line 2942
    if-eqz v1, :cond_60

    .line 2943
    .line 2944
    invoke-static {v1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 2945
    .line 2946
    .line 2947
    move-result v4

    .line 2948
    if-eqz v4, :cond_5e

    .line 2949
    .line 2950
    goto :goto_1a

    .line 2951
    :cond_5e
    iput-object v1, v3, Lu1/r1;->l:Ljava/lang/String;

    .line 2952
    .line 2953
    iget-object v4, v3, Lu1/r1;->e:La3/h0;

    .line 2954
    .line 2955
    if-eqz v4, :cond_5f

    .line 2956
    .line 2957
    invoke-virtual {v3, v1}, Lu1/r1;->b(Ljava/lang/String;)Z

    .line 2958
    .line 2959
    .line 2960
    move-result v3

    .line 2961
    iget-object v4, v4, La3/h0;->g:Ljava/lang/Object;

    .line 2962
    .line 2963
    check-cast v4, Le4/a;

    .line 2964
    .line 2965
    invoke-virtual {v4, v3}, Le4/a;->c0(Z)V

    .line 2966
    .line 2967
    .line 2968
    goto :goto_1a

    .line 2969
    :cond_5f
    invoke-static {v13}, Lr3/g;->c(Ljava/lang/String;)V

    .line 2970
    .line 2971
    .line 2972
    const/16 v16, 0x0

    .line 2973
    .line 2974
    throw v16

    .line 2975
    :cond_60
    :goto_1a
    iget-object v2, v2, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2976
    .line 2977
    if-eqz v2, :cond_63

    .line 2978
    .line 2979
    if-eqz v1, :cond_63

    .line 2980
    .line 2981
    invoke-static {v1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 2982
    .line 2983
    .line 2984
    move-result v3

    .line 2985
    if-eqz v3, :cond_61

    .line 2986
    .line 2987
    goto :goto_1b

    .line 2988
    :cond_61
    iput-object v1, v2, Lu1/r1;->m:Ljava/lang/String;

    .line 2989
    .line 2990
    iget-object v3, v2, Lu1/r1;->e:La3/h0;

    .line 2991
    .line 2992
    if-eqz v3, :cond_62

    .line 2993
    .line 2994
    invoke-virtual {v2, v1}, Lu1/r1;->b(Ljava/lang/String;)Z

    .line 2995
    .line 2996
    .line 2997
    move-result v1

    .line 2998
    iget-object v2, v3, La3/h0;->g:Ljava/lang/Object;

    .line 2999
    .line 3000
    check-cast v2, Le4/a;

    .line 3001
    .line 3002
    invoke-virtual {v2, v1}, Le4/a;->b0(Z)V

    .line 3003
    .line 3004
    .line 3005
    goto :goto_1b

    .line 3006
    :cond_62
    invoke-static {v13}, Lr3/g;->c(Ljava/lang/String;)V

    .line 3007
    .line 3008
    .line 3009
    const/16 v16, 0x0

    .line 3010
    .line 3011
    throw v16

    .line 3012
    :cond_63
    :goto_1b
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 3013
    .line 3014
    .line 3015
    move-result v1

    .line 3016
    if-eqz v1, :cond_7c

    .line 3017
    .line 3018
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 3019
    .line 3020
    .line 3021
    move-result v0

    .line 3022
    move-object/from16 v1, p1

    .line 3023
    .line 3024
    check-cast v1, Lx1/g;

    .line 3025
    .line 3026
    check-cast v1, Lco/median/android/MainActivity;

    .line 3027
    .line 3028
    iget-object v2, v1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 3029
    .line 3030
    if-nez v2, :cond_64

    .line 3031
    .line 3032
    goto :goto_1c

    .line 3033
    :cond_64
    invoke-static {v1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 3034
    .line 3035
    .line 3036
    move-result-object v2

    .line 3037
    iput-boolean v0, v2, Lx1/a;->t0:Z

    .line 3038
    .line 3039
    iget-object v2, v1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 3040
    .line 3041
    iget-object v2, v2, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 3042
    .line 3043
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 3044
    .line 3045
    .line 3046
    move-result-object v2

    .line 3047
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 3048
    .line 3049
    .line 3050
    move-result-object v2

    .line 3051
    invoke-virtual {v2}, Landroid/view/View;->requestApplyInsets()V

    .line 3052
    .line 3053
    .line 3054
    :goto_1c
    iget-object v2, v1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 3055
    .line 3056
    if-nez v2, :cond_65

    .line 3057
    .line 3058
    goto/16 :goto_21

    .line 3059
    .line 3060
    :cond_65
    invoke-static {v1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 3061
    .line 3062
    .line 3063
    move-result-object v2

    .line 3064
    iput-boolean v0, v2, Lx1/a;->u0:Z

    .line 3065
    .line 3066
    iget-object v0, v1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 3067
    .line 3068
    iget-object v0, v0, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 3069
    .line 3070
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 3071
    .line 3072
    .line 3073
    move-result-object v0

    .line 3074
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 3075
    .line 3076
    .line 3077
    move-result-object v0

    .line 3078
    invoke-virtual {v0}, Landroid/view/View;->requestApplyInsets()V

    .line 3079
    .line 3080
    .line 3081
    goto/16 :goto_21

    .line 3082
    .line 3083
    :cond_66
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 3084
    .line 3085
    .line 3086
    move-result-object v0

    .line 3087
    const-string v1, "internalExternal"

    .line 3088
    .line 3089
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3090
    .line 3091
    .line 3092
    move-result v0

    .line 3093
    if-eqz v0, :cond_6d

    .line 3094
    .line 3095
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 3096
    .line 3097
    .line 3098
    move-result-object v0

    .line 3099
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3100
    .line 3101
    .line 3102
    move-result v0

    .line 3103
    if-eqz v0, :cond_7c

    .line 3104
    .line 3105
    if-eqz v7, :cond_67

    .line 3106
    .line 3107
    invoke-virtual {v7}, Lorg/json/JSONObject;->length()I

    .line 3108
    .line 3109
    .line 3110
    move-result v0

    .line 3111
    if-nez v0, :cond_68

    .line 3112
    .line 3113
    :cond_67
    const/4 v3, 0x0

    .line 3114
    goto :goto_20

    .line 3115
    :cond_68
    :try_start_e
    const-string v0, "rules"

    .line 3116
    .line 3117
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 3118
    .line 3119
    .line 3120
    move-result-object v0

    .line 3121
    if-eqz v0, :cond_69

    .line 3122
    .line 3123
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 3124
    .line 3125
    .line 3126
    move-result v1

    .line 3127
    if-nez v1, :cond_6a

    .line 3128
    .line 3129
    :cond_69
    const/4 v3, 0x0

    .line 3130
    goto :goto_1e

    .line 3131
    :cond_6a
    const/4 v4, 0x0

    .line 3132
    :goto_1d
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 3133
    .line 3134
    .line 3135
    move-result v1

    .line 3136
    if-ge v4, v1, :cond_6c

    .line 3137
    .line 3138
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 3139
    .line 3140
    .line 3141
    move-result-object v1

    .line 3142
    const-string v2, "regex"

    .line 3143
    .line 3144
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 3145
    .line 3146
    .line 3147
    move-result-object v1

    .line 3148
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3149
    .line 3150
    .line 3151
    move-result v1

    .line 3152
    if-eqz v1, :cond_6b

    .line 3153
    .line 3154
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 3155
    .line 3156
    .line 3157
    move-result-object v0

    .line 3158
    const-string v1, "handleJSBridgeFunctions: internalExternal/set format error, missing field"

    .line 3159
    .line 3160
    invoke-virtual {v0, v11, v1}, Lx1/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 3161
    .line 3162
    .line 3163
    goto/16 :goto_21

    .line 3164
    .line 3165
    :catch_e
    move-exception v0

    .line 3166
    goto :goto_1f

    .line 3167
    :cond_6b
    add-int/lit8 v4, v4, 0x1

    .line 3168
    .line 3169
    goto :goto_1d

    .line 3170
    :cond_6c
    invoke-virtual {v6, v0}, Lx1/a;->D(Lorg/json/JSONArray;)V

    .line 3171
    .line 3172
    .line 3173
    goto/16 :goto_21

    .line 3174
    .line 3175
    :goto_1e
    invoke-virtual {v6, v3}, Lx1/a;->D(Lorg/json/JSONArray;)V
    :try_end_e
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_e

    .line 3176
    .line 3177
    .line 3178
    goto/16 :goto_21

    .line 3179
    .line 3180
    :goto_1f
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 3181
    .line 3182
    .line 3183
    move-result-object v1

    .line 3184
    const-string v2, "handleJSBridgeFunctions: internalExternal/set parse error"

    .line 3185
    .line 3186
    invoke-virtual {v1, v11, v2, v0}, Lx1/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 3187
    .line 3188
    .line 3189
    return-void

    .line 3190
    :goto_20
    invoke-virtual {v6, v3}, Lx1/a;->D(Lorg/json/JSONArray;)V

    .line 3191
    .line 3192
    .line 3193
    return-void

    .line 3194
    :cond_6d
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 3195
    .line 3196
    .line 3197
    move-result-object v0

    .line 3198
    const-string v1, "keyboard"

    .line 3199
    .line 3200
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3201
    .line 3202
    .line 3203
    move-result v0

    .line 3204
    if-eqz v0, :cond_6f

    .line 3205
    .line 3206
    if-eqz v7, :cond_6f

    .line 3207
    .line 3208
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 3209
    .line 3210
    .line 3211
    move-result-object v0

    .line 3212
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 3213
    .line 3214
    .line 3215
    move-result-object v1

    .line 3216
    const-string v2, "/info"

    .line 3217
    .line 3218
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3219
    .line 3220
    .line 3221
    move-result v1

    .line 3222
    if-eqz v1, :cond_6e

    .line 3223
    .line 3224
    move-object/from16 v1, p1

    .line 3225
    .line 3226
    check-cast v1, Lx1/g;

    .line 3227
    .line 3228
    check-cast v1, Lco/median/android/MainActivity;

    .line 3229
    .line 3230
    invoke-virtual {v1, v0}, Lco/median/android/MainActivity;->F(Ljava/lang/String;)V

    .line 3231
    .line 3232
    .line 3233
    return-void

    .line 3234
    :cond_6e
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 3235
    .line 3236
    .line 3237
    move-result-object v1

    .line 3238
    const-string v2, "/listen"

    .line 3239
    .line 3240
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3241
    .line 3242
    .line 3243
    move-result v1

    .line 3244
    if-eqz v1, :cond_7c

    .line 3245
    .line 3246
    move-object/from16 v1, p1

    .line 3247
    .line 3248
    check-cast v1, Lx1/g;

    .line 3249
    .line 3250
    check-cast v1, Lco/median/android/MainActivity;

    .line 3251
    .line 3252
    invoke-virtual {v1, v0}, Lco/median/android/MainActivity;->w(Ljava/lang/String;)V

    .line 3253
    .line 3254
    .line 3255
    return-void

    .line 3256
    :cond_6f
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 3257
    .line 3258
    .line 3259
    move-result-object v0

    .line 3260
    const-string v1, "clipboard"

    .line 3261
    .line 3262
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3263
    .line 3264
    .line 3265
    move-result v0

    .line 3266
    if-eqz v0, :cond_72

    .line 3267
    .line 3268
    if-eqz v7, :cond_72

    .line 3269
    .line 3270
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 3271
    .line 3272
    .line 3273
    move-result-object v0

    .line 3274
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3275
    .line 3276
    .line 3277
    move-result v0

    .line 3278
    if-eqz v0, :cond_71

    .line 3279
    .line 3280
    move-object/from16 v0, p1

    .line 3281
    .line 3282
    check-cast v0, Lx1/g;

    .line 3283
    .line 3284
    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 3285
    .line 3286
    .line 3287
    move-result-object v2

    .line 3288
    check-cast v0, Lco/median/android/MainActivity;

    .line 3289
    .line 3290
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 3291
    .line 3292
    .line 3293
    move-result v3

    .line 3294
    if-eqz v3, :cond_70

    .line 3295
    .line 3296
    goto/16 :goto_21

    .line 3297
    .line 3298
    :cond_70
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 3299
    .line 3300
    .line 3301
    move-result-object v0

    .line 3302
    check-cast v0, Landroid/content/ClipboardManager;

    .line 3303
    .line 3304
    const-string v1, "copy"

    .line 3305
    .line 3306
    invoke-static {v1, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 3307
    .line 3308
    .line 3309
    move-result-object v1

    .line 3310
    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 3311
    .line 3312
    .line 3313
    goto/16 :goto_21

    .line 3314
    .line 3315
    :cond_71
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 3316
    .line 3317
    .line 3318
    move-result-object v0

    .line 3319
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3320
    .line 3321
    .line 3322
    move-result v0

    .line 3323
    if-eqz v0, :cond_7c

    .line 3324
    .line 3325
    move-object/from16 v0, p1

    .line 3326
    .line 3327
    check-cast v0, Lx1/g;

    .line 3328
    .line 3329
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 3330
    .line 3331
    .line 3332
    move-result-object v1

    .line 3333
    check-cast v0, Lco/median/android/MainActivity;

    .line 3334
    .line 3335
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->z(Ljava/lang/String;)V

    .line 3336
    .line 3337
    .line 3338
    return-void

    .line 3339
    :cond_72
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 3340
    .line 3341
    .line 3342
    move-result-object v0

    .line 3343
    const-string v1, "events"

    .line 3344
    .line 3345
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3346
    .line 3347
    .line 3348
    move-result v0

    .line 3349
    if-eqz v0, :cond_76

    .line 3350
    .line 3351
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 3352
    .line 3353
    .line 3354
    move-result-object v0

    .line 3355
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3356
    .line 3357
    .line 3358
    move-result v0

    .line 3359
    const-string v1, "eventName"

    .line 3360
    .line 3361
    if-eqz v0, :cond_74

    .line 3362
    .line 3363
    if-eqz v7, :cond_74

    .line 3364
    .line 3365
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 3366
    .line 3367
    .line 3368
    move-result-object v0

    .line 3369
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3370
    .line 3371
    .line 3372
    move-result v1

    .line 3373
    if-eqz v1, :cond_73

    .line 3374
    .line 3375
    goto/16 :goto_21

    .line 3376
    .line 3377
    :cond_73
    move-object/from16 v1, p1

    .line 3378
    .line 3379
    check-cast v1, Lx1/g;

    .line 3380
    .line 3381
    check-cast v1, Lco/median/android/MainActivity;

    .line 3382
    .line 3383
    invoke-virtual {v1, v0}, Lco/median/android/MainActivity;->q0(Ljava/lang/String;)V

    .line 3384
    .line 3385
    .line 3386
    return-void

    .line 3387
    :cond_74
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 3388
    .line 3389
    .line 3390
    move-result-object v0

    .line 3391
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3392
    .line 3393
    .line 3394
    move-result v0

    .line 3395
    if-eqz v0, :cond_7c

    .line 3396
    .line 3397
    if-eqz v7, :cond_7c

    .line 3398
    .line 3399
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 3400
    .line 3401
    .line 3402
    move-result-object v0

    .line 3403
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3404
    .line 3405
    .line 3406
    move-result v1

    .line 3407
    if-eqz v1, :cond_75

    .line 3408
    .line 3409
    goto/16 :goto_21

    .line 3410
    .line 3411
    :cond_75
    move-object/from16 v1, p1

    .line 3412
    .line 3413
    check-cast v1, Lx1/g;

    .line 3414
    .line 3415
    check-cast v1, Lco/median/android/MainActivity;

    .line 3416
    .line 3417
    invoke-virtual {v1, v0}, Lco/median/android/MainActivity;->u0(Ljava/lang/String;)V

    .line 3418
    .line 3419
    .line 3420
    return-void

    .line 3421
    :cond_76
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 3422
    .line 3423
    .line 3424
    move-result-object v0

    .line 3425
    const-string v1, "contextMenu"

    .line 3426
    .line 3427
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3428
    .line 3429
    .line 3430
    move-result v0

    .line 3431
    if-eqz v0, :cond_7a

    .line 3432
    .line 3433
    if-eqz v7, :cond_7a

    .line 3434
    .line 3435
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 3436
    .line 3437
    .line 3438
    move-result-object v0

    .line 3439
    const-string v1, "/setEnabled"

    .line 3440
    .line 3441
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3442
    .line 3443
    .line 3444
    move-result v0

    .line 3445
    if-eqz v0, :cond_79

    .line 3446
    .line 3447
    iget-object v0, v6, Lx1/a;->I0:Lz1/b;

    .line 3448
    .line 3449
    iget-boolean v0, v0, Lz1/b;->a:Z

    .line 3450
    .line 3451
    invoke-virtual {v7, v14, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 3452
    .line 3453
    .line 3454
    move-result v0

    .line 3455
    move-object/from16 v1, p1

    .line 3456
    .line 3457
    check-cast v1, Lx1/g;

    .line 3458
    .line 3459
    check-cast v1, Lco/median/android/MainActivity;

    .line 3460
    .line 3461
    iget-object v2, v1, Lco/median/android/MainActivity;->F:Lco/median/android/widget/WebViewContainerView;

    .line 3462
    .line 3463
    if-nez v2, :cond_77

    .line 3464
    .line 3465
    goto :goto_21

    .line 3466
    :cond_77
    if-eqz v0, :cond_78

    .line 3467
    .line 3468
    invoke-virtual {v1, v2}, Landroid/app/Activity;->registerForContextMenu(Landroid/view/View;)V

    .line 3469
    .line 3470
    .line 3471
    goto :goto_21

    .line 3472
    :cond_78
    invoke-virtual {v1, v2}, Landroid/app/Activity;->unregisterForContextMenu(Landroid/view/View;)V

    .line 3473
    .line 3474
    .line 3475
    goto :goto_21

    .line 3476
    :cond_79
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 3477
    .line 3478
    .line 3479
    move-result-object v0

    .line 3480
    const-string v1, "/setLinkActions"

    .line 3481
    .line 3482
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3483
    .line 3484
    .line 3485
    move-result v0

    .line 3486
    if-eqz v0, :cond_7c

    .line 3487
    .line 3488
    const-string v0, "linkActions"

    .line 3489
    .line 3490
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 3491
    .line 3492
    .line 3493
    move-result-object v0

    .line 3494
    if-eqz v0, :cond_7c

    .line 3495
    .line 3496
    new-instance v1, Lz1/b;

    .line 3497
    .line 3498
    iget-object v2, v6, Lx1/a;->I0:Lz1/b;

    .line 3499
    .line 3500
    iget-boolean v2, v2, Lz1/b;->a:Z

    .line 3501
    .line 3502
    invoke-direct {v1, v2, v0}, Lz1/b;-><init>(ZLorg/json/JSONArray;)V

    .line 3503
    .line 3504
    .line 3505
    iput-object v1, v6, Lx1/a;->I0:Lz1/b;

    .line 3506
    .line 3507
    return-void

    .line 3508
    :cond_7a
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 3509
    .line 3510
    .line 3511
    move-result-object v0

    .line 3512
    const-string v1, "permissions"

    .line 3513
    .line 3514
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3515
    .line 3516
    .line 3517
    move-result v0

    .line 3518
    if-eqz v0, :cond_7c

    .line 3519
    .line 3520
    if-eqz v7, :cond_7c

    .line 3521
    .line 3522
    invoke-virtual/range {v17 .. v17}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 3523
    .line 3524
    .line 3525
    move-result-object v0

    .line 3526
    const-string v2, "/status"

    .line 3527
    .line 3528
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3529
    .line 3530
    .line 3531
    move-result v0

    .line 3532
    if-eqz v0, :cond_7c

    .line 3533
    .line 3534
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 3535
    .line 3536
    .line 3537
    move-result-object v0

    .line 3538
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3539
    .line 3540
    .line 3541
    move-result v2

    .line 3542
    if-eqz v2, :cond_7b

    .line 3543
    .line 3544
    goto :goto_21

    .line 3545
    :cond_7b
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 3546
    .line 3547
    .line 3548
    move-result-object v1

    .line 3549
    move-object/from16 v2, p1

    .line 3550
    .line 3551
    check-cast v2, Lx1/g;

    .line 3552
    .line 3553
    check-cast v2, Lco/median/android/MainActivity;

    .line 3554
    .line 3555
    invoke-virtual {v2, v1}, Lco/median/android/MainActivity;->y(Lorg/json/JSONArray;)Ljava/util/LinkedHashMap;

    .line 3556
    .line 3557
    .line 3558
    move-result-object v1

    .line 3559
    new-instance v3, Lorg/json/JSONObject;

    .line 3560
    .line 3561
    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 3562
    .line 3563
    .line 3564
    invoke-static {v0, v3}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 3565
    .line 3566
    .line 3567
    move-result-object v0

    .line 3568
    const/4 v3, 0x0

    .line 3569
    invoke-virtual {v2, v0, v3}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 3570
    .line 3571
    .line 3572
    :cond_7c
    :goto_21
    return-void

    .line 3573
    :cond_7d
    move-object v3, v8

    .line 3574
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3575
    .line 3576
    .line 3577
    move-result-object v0

    .line 3578
    invoke-static {v0}, Landroidx/fragment/app/u;->n(Ljava/lang/Object;)V

    .line 3579
    .line 3580
    .line 3581
    throw v3

    .line 3582
    :goto_22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 3583
    .line 3584
    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3585
    .line 3586
    .line 3587
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 3588
    .line 3589
    .line 3590
    move-result-object v0

    .line 3591
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3592
    .line 3593
    .line 3594
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3595
    .line 3596
    .line 3597
    move-result-object v0

    .line 3598
    invoke-static {v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3599
    .line 3600
    .line 3601
    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lu1/x;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lu1/x;->b:Ljava/lang/Object;

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v3, ""

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    array-length v3, v0

    .line 30
    move v4, v2

    .line 31
    :goto_0
    if-ge v4, v3, :cond_1

    .line 32
    .line 33
    aget-object v5, v0, v4

    .line 34
    .line 35
    const-string v6, "-plugin.js"

    .line 36
    .line 37
    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    const-string v6, "GoNativeJSBridgeLibrary.js"

    .line 44
    .line 45
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_0

    .line 50
    .line 51
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    .line 52
    .line 53
    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v7, Ljava/io/BufferedInputStream;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-virtual {v8, v5}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-direct {v7, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v7, v6}, Lt1/l;->g(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V

    .line 70
    .line 71
    .line 72
    iget-object v5, p0, Lu1/x;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v5, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catch_0
    move-exception v0

    .line 85
    goto :goto_2

    .line 86
    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :goto_2
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v4, "co.median.median_core.Bridge"

    .line 98
    .line 99
    invoke-virtual {v3, v4, v0, v1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    iget-object v0, p0, Lu1/x;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    :cond_2
    :goto_3
    if-ge v2, v3, :cond_3

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    add-int/lit8 v2, v2, 0x1

    .line 117
    .line 118
    check-cast v4, Ljava/lang/String;

    .line 119
    .line 120
    if-eqz p1, :cond_2

    .line 121
    .line 122
    move-object v5, p1

    .line 123
    check-cast v5, Lx1/g;

    .line 124
    .line 125
    check-cast v5, Lco/median/android/MainActivity;

    .line 126
    .line 127
    invoke-virtual {v5, v4, v1}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_3
    return-void
.end method
