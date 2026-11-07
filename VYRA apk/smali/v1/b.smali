.class public final Lv1/b;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public a:I

.field public b:I

.field public final c:Ljava/lang/Object;

.field public d:Ljava/io/Serializable;

.field public final e:Ljava/io/Serializable;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;IILjava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "-"

    .line 2
    .line 3
    const-string v1, ".json"

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lv1/b;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lv1/b;->d:Ljava/io/Serializable;

    .line 14
    .line 15
    iput p2, p0, Lv1/b;->a:I

    .line 16
    .line 17
    iput p3, p0, Lv1/b;->b:I

    .line 18
    .line 19
    sget-object p2, Lr3/l;->a:Lr3/m;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance p2, Lr3/d;

    .line 25
    .line 26
    const-class p2, Lv1/b;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz p3, :cond_0

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isLocalClass()Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-eqz p3, :cond_4

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {p2}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    const/16 v5, 0x24

    .line 54
    .line 55
    if-eqz p3, :cond_1

    .line 56
    .line 57
    new-instance p2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {v4, p2}, Ly3/j;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Class;->getEnclosingConstructor()Ljava/lang/reflect/Constructor;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    new-instance p3, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {v4, p2}, Ly3/j;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    goto :goto_0

    .line 111
    :cond_2
    invoke-virtual {v4, v5, v2}, Ljava/lang/String;->indexOf(II)I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    const/4 p3, -0x1

    .line 116
    if-ne p2, p3, :cond_3

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    add-int/2addr p2, v3

    .line 120
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    invoke-virtual {v4, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    goto :goto_0

    .line 129
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Class;->isArray()Z

    .line 130
    .line 131
    .line 132
    move-result p3

    .line 133
    if-eqz p3, :cond_6

    .line 134
    .line 135
    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 140
    .line 141
    .line 142
    move-result p3

    .line 143
    const-string v5, "Array"

    .line 144
    .line 145
    if-eqz p3, :cond_5

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-static {p2}, Lr3/n;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    if-eqz p2, :cond_5

    .line 156
    .line 157
    invoke-virtual {p2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    :cond_5
    if-nez v4, :cond_7

    .line 162
    .line 163
    move-object v4, v5

    .line 164
    goto :goto_0

    .line 165
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    invoke-static {p3}, Lr3/n;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    if-nez v4, :cond_7

    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    :cond_7
    :goto_0
    iput-object v4, p0, Lv1/b;->e:Ljava/io/Serializable;

    .line 180
    .line 181
    const-string p2, "custom"

    .line 182
    .line 183
    invoke-virtual {p4, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    if-eqz p2, :cond_8

    .line 188
    .line 189
    sget-object p2, Lv1/a;->c:Lv1/a;

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_8
    const-string p2, "fas"

    .line 193
    .line 194
    invoke-virtual {p4, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    sget-object p3, Lv1/a;->f:Lv1/a;

    .line 199
    .line 200
    if-eqz p2, :cond_a

    .line 201
    .line 202
    :cond_9
    move-object p2, p3

    .line 203
    goto :goto_1

    .line 204
    :cond_a
    const-string p2, "fab"

    .line 205
    .line 206
    invoke-virtual {p4, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    if-eqz p2, :cond_b

    .line 211
    .line 212
    sget-object p2, Lv1/a;->e:Lv1/a;

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_b
    const-string p2, "far"

    .line 216
    .line 217
    invoke-virtual {p4, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    if-eqz p2, :cond_c

    .line 222
    .line 223
    sget-object p2, Lv1/a;->d:Lv1/a;

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_c
    const-string p2, "fal"

    .line 227
    .line 228
    invoke-virtual {p4, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    if-eqz p2, :cond_d

    .line 233
    .line 234
    sget-object p2, Lv1/a;->h:Lv1/a;

    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_d
    const-string p2, "fat"

    .line 238
    .line 239
    invoke-virtual {p4, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    if-eqz p2, :cond_e

    .line 244
    .line 245
    sget-object p2, Lv1/a;->g:Lv1/a;

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_e
    const-string p2, "md"

    .line 249
    .line 250
    invoke-virtual {p4, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 251
    .line 252
    .line 253
    move-result p2

    .line 254
    if-eqz p2, :cond_9

    .line 255
    .line 256
    sget-object p2, Lv1/a;->i:Lv1/a;

    .line 257
    .line 258
    :goto_1
    iput-object p2, p0, Lv1/b;->g:Ljava/lang/Object;

    .line 259
    .line 260
    if-nez p2, :cond_f

    .line 261
    .line 262
    invoke-virtual {p0}, Lv1/b;->c()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    goto/16 :goto_4

    .line 267
    .line 268
    :cond_f
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    iget-object p2, p2, Lv1/a;->b:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    sget-object p2, Ly3/a;->a:Ljava/nio/charset/Charset;

    .line 286
    .line 287
    new-instance p3, Ljava/io/InputStreamReader;

    .line 288
    .line 289
    invoke-direct {p3, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 290
    .line 291
    .line 292
    const/16 p1, 0x2000

    .line 293
    .line 294
    new-instance p2, Ljava/io/BufferedReader;

    .line 295
    .line 296
    invoke-direct {p2, p3, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 297
    .line 298
    .line 299
    :try_start_1
    new-instance p3, Ljava/io/StringWriter;

    .line 300
    .line 301
    invoke-direct {p3}, Ljava/io/StringWriter;-><init>()V

    .line 302
    .line 303
    .line 304
    new-array p1, p1, [C

    .line 305
    .line 306
    invoke-virtual {p2, p1}, Ljava/io/Reader;->read([C)I

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    :goto_2
    if-ltz v1, :cond_10

    .line 311
    .line 312
    invoke-virtual {p3, p1, v2, v1}, Ljava/io/Writer;->write([CII)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p2, p1}, Ljava/io/Reader;->read([C)I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    goto :goto_2

    .line 320
    :cond_10
    invoke-virtual {p3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 325
    .line 326
    .line 327
    :try_start_2
    invoke-interface {p2}, Ljava/io/Closeable;->close()V

    .line 328
    .line 329
    .line 330
    new-instance p2, Lorg/json/JSONObject;

    .line 331
    .line 332
    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-static {p4, v0}, Ly3/j;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 336
    .line 337
    .line 338
    move-result p1

    .line 339
    if-nez p1, :cond_11

    .line 340
    .line 341
    invoke-virtual {p0}, Lv1/b;->c()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    goto :goto_4

    .line 346
    :catch_0
    move-exception p1

    .line 347
    goto :goto_3

    .line 348
    :cond_11
    const/4 p1, 0x6

    .line 349
    invoke-static {p4, v0, v2, p1}, Ly3/j;->v(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    .line 350
    .line 351
    .line 352
    move-result p1

    .line 353
    add-int/2addr p1, v3

    .line 354
    invoke-virtual {p4, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 359
    .line 360
    .line 361
    move-result-wide p3

    .line 362
    const-wide/16 v0, 0x0

    .line 363
    .line 364
    cmp-long p3, p3, v0

    .line 365
    .line 366
    if-nez p3, :cond_12

    .line 367
    .line 368
    invoke-virtual {p0}, Lv1/b;->c()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    goto :goto_4

    .line 373
    :cond_12
    const-string p3, "%s"

    .line 374
    .line 375
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 376
    .line 377
    .line 378
    move-result-wide p1

    .line 379
    long-to-int p1, p1

    .line 380
    int-to-char p1, p1

    .line 381
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    invoke-static {p3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 397
    goto :goto_4

    .line 398
    :catchall_0
    move-exception p1

    .line 399
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 400
    :catchall_1
    move-exception p3

    .line 401
    :try_start_4
    invoke-static {p2, p1}, Le4/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 402
    .line 403
    .line 404
    throw p3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 405
    :goto_3
    iget-object p2, p0, Lv1/b;->e:Ljava/io/Serializable;

    .line 406
    .line 407
    check-cast p2, Ljava/lang/String;

    .line 408
    .line 409
    const-string p3, "glyphForIconName: "

    .line 410
    .line 411
    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 412
    .line 413
    .line 414
    invoke-virtual {p0}, Lv1/b;->c()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    :goto_4
    iput-object p1, p0, Lv1/b;->f:Ljava/lang/Object;

    .line 419
    .line 420
    iget-object p1, p0, Lv1/b;->c:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast p1, Landroid/content/Context;

    .line 423
    .line 424
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 425
    .line 426
    .line 427
    move-result-object p2

    .line 428
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object p2

    .line 432
    new-instance p3, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    const-string p2, "/"

    .line 441
    .line 442
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object p2

    .line 449
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 458
    .line 459
    new-instance p3, Ljava/lang/StringBuilder;

    .line 460
    .line 461
    const-string p4, "@"

    .line 462
    .line 463
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    const/16 p1, 0x78

    .line 470
    .line 471
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    new-instance p3, Ljava/lang/StringBuilder;

    .line 479
    .line 480
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 481
    .line 482
    .line 483
    iget-object p4, p0, Lv1/b;->g:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast p4, Lv1/a;

    .line 486
    .line 487
    iget-object p4, p4, Lv1/a;->a:Ljava/lang/String;

    .line 488
    .line 489
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    const/16 p4, 0x3a

    .line 493
    .line 494
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    iget-object v0, p0, Lv1/b;->d:Ljava/io/Serializable;

    .line 498
    .line 499
    check-cast v0, Ljava/lang/String;

    .line 500
    .line 501
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    iget p4, p0, Lv1/b;->b:I

    .line 508
    .line 509
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p3

    .line 516
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 517
    .line 518
    .line 519
    move-result p3

    .line 520
    const/16 p4, 0x20

    .line 521
    .line 522
    invoke-static {p4}, Lt2/i;->b(I)V

    .line 523
    .line 524
    .line 525
    invoke-static {p3, p4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object p3

    .line 529
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    new-instance p4, Ljava/lang/StringBuilder;

    .line 533
    .line 534
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 535
    .line 536
    .line 537
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    const/16 p2, 0x5f

    .line 544
    .line 545
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    iget p2, p0, Lv1/b;->a:I

    .line 549
    .line 550
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    const-string p1, ".png"

    .line 557
    .line 558
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object p1

    .line 565
    new-instance p2, Ljava/io/File;

    .line 566
    .line 567
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    iput-object p2, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 571
    .line 572
    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 573
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 574
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv1/b;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 575
    iput-object v0, p0, Lv1/b;->d:Ljava/io/Serializable;

    .line 576
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv1/b;->e:Ljava/io/Serializable;

    .line 577
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lv1/b;->f:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 578
    iput p1, p0, Lv1/b;->a:I

    .line 579
    iput p1, p0, Lv1/b;->b:I

    return-void
.end method


# virtual methods
.method public a(Lk1/x0;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Lk1/x0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lk1/x0;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->r0:Lk1/z0;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget-object v2, v2, Lk1/z0;->e:Lk1/y0;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget-object v2, v2, Lk1/y0;->e:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lp0/b;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v2, v3

    .line 29
    :goto_0
    invoke-static {v0, v2}, Lp0/p0;->m(Landroid/view/View;Lp0/b;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    if-eqz p2, :cond_4

    .line 33
    .line 34
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->s:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-gtz v0, :cond_3

    .line 41
    .line 42
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Lk1/b0;->f(Lk1/x0;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->k0:Lk1/u0;

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->k:Landroidx/emoji2/text/p;

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Landroidx/emoji2/text/p;->y(Lk1/x0;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 p1, 0x0

    .line 60
    invoke-static {p1, p2}, Landroidx/fragment/app/u;->i(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    throw p1

    .line 65
    :cond_4
    :goto_1
    iput-object v3, p1, Lk1/x0;->s:Lk1/b0;

    .line 66
    .line 67
    iput-object v3, p1, Lk1/x0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    invoke-virtual {p0}, Lv1/b;->e()Lk1/q0;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget v0, p1, Lk1/x0;->f:I

    .line 77
    .line 78
    invoke-virtual {p2, v0}, Lk1/q0;->a(I)Lk1/p0;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v1, v1, Lk1/p0;->a:Ljava/util/ArrayList;

    .line 83
    .line 84
    iget-object p2, p2, Lk1/q0;->a:Landroid/util/SparseArray;

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    check-cast p2, Lk1/p0;

    .line 91
    .line 92
    iget p2, p2, Lk1/p0;->b:I

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-gt p2, v0, :cond_5

    .line 99
    .line 100
    return-void

    .line 101
    :cond_5
    invoke-virtual {p1}, Lk1/x0;->m()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public b(I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->k0:Lk1/u0;

    .line 6
    .line 7
    if-ltz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v1}, Lk1/u0;->b()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge p1, v2, :cond_1

    .line 14
    .line 15
    iget-boolean v1, v1, Lk1/u0;->g:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->i:Lk/o;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, p1, v1}, Lk/o;->g(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 29
    .line 30
    invoke-virtual {v1}, Lk1/u0;->b()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v4, "invalid position "

    .line 41
    .line 42
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p1, ". State item count is "

    .line 49
    .line 50
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {v2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v2
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lv1/a;->d:Lv1/a;

    .line 2
    .line 3
    iput-object v0, p0, Lv1/b;->g:Ljava/lang/Object;

    .line 4
    .line 5
    const v0, 0xf059

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "%s"

    .line 22
    .line 23
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public d()Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 1
    iget-object v0, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0}, Lv1/b;->k()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    iget-object v1, p0, Lv1/b;->e:Ljava/io/Serializable;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v2, p0, Lv1/b;->d:Ljava/io/Serializable;

    .line 21
    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v4, "getDrawable: Error occurred while saving image for iconName "

    .line 27
    .line 28
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lv1/b;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Landroid/content/Context;

    .line 44
    .line 45
    const v1, 0x7f0800af

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Landroid/graphics/drawable/Drawable;->createFromPath(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method

.method public e()Lk1/q0;
    .locals 2

    .line 1
    iget-object v0, p0, Lv1/b;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk1/q0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lk1/q0;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lk1/q0;->a:Landroid/util/SparseArray;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput v1, v0, Lk1/q0;->b:I

    .line 21
    .line 22
    iput-object v0, p0, Lv1/b;->g:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lv1/b;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lk1/q0;

    .line 27
    .line 28
    return-object v0
.end method

.method public f(I)Landroid/view/View;
    .locals 2

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, v1}, Lv1/b;->m(IJ)Lk1/x0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p1, p1, Lk1/x0;->a:Landroid/view/View;

    .line 11
    .line 12
    return-object p1
.end method

.method public g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv1/b;->e:Ljava/io/Serializable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lv1/b;->h(I)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, -0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 20
    .line 21
    .line 22
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 23
    .line 24
    iget-object v0, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 27
    .line 28
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Lc2/h;

    .line 29
    .line 30
    iget-object v1, v0, Lc2/h;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, [I

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const/4 v2, -0x1

    .line 37
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    iput v1, v0, Lc2/h;->c:I

    .line 42
    .line 43
    return-void
.end method

.method public h(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv1/b;->e:Ljava/io/Serializable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lk1/x0;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-virtual {p0, v1, v2}, Lv1/b;->a(Lk1/x0;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public i(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lk1/x0;->j()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v1}, Lk1/x0;->i()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, v1, Lk1/x0;->n:Lv1/b;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lv1/b;->n(Lk1/x0;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v1}, Lk1/x0;->p()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget p1, v1, Lk1/x0;->j:I

    .line 38
    .line 39
    and-int/lit8 p1, p1, -0x21

    .line 40
    .line 41
    iput p1, v1, Lk1/x0;->j:I

    .line 42
    .line 43
    :cond_2
    :goto_0
    invoke-virtual {p0, v1}, Lv1/b;->j(Lk1/x0;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->P:Lk1/h0;

    .line 47
    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    invoke-virtual {v1}, Lk1/x0;->g()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->P:Lk1/h0;

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Lk1/h0;->d(Lk1/x0;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method

.method public j(Lk1/x0;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lv1/b;->e:Ljava/io/Serializable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->j0:Lc2/h;

    .line 10
    .line 11
    invoke-virtual {p1}, Lk1/x0;->i()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    iget-object v4, p1, Lk1/x0;->a:Landroid/view/View;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x1

    .line 19
    if-nez v3, :cond_f

    .line 20
    .line 21
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto/16 :goto_9

    .line 28
    .line 29
    :cond_0
    invoke-virtual {p1}, Lk1/x0;->j()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_e

    .line 34
    .line 35
    invoke-virtual {p1}, Lk1/x0;->o()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_d

    .line 40
    .line 41
    iget v3, p1, Lk1/x0;->j:I

    .line 42
    .line 43
    and-int/lit8 v3, v3, 0x10

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    sget-object v3, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-virtual {v4}, Landroid/view/View;->hasTransientState()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    move v3, v6

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v3, v5

    .line 58
    :goto_0
    invoke-virtual {p1}, Lk1/x0;->g()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_b

    .line 63
    .line 64
    iget v4, p0, Lv1/b;->b:I

    .line 65
    .line 66
    if-lez v4, :cond_9

    .line 67
    .line 68
    iget v4, p1, Lk1/x0;->j:I

    .line 69
    .line 70
    and-int/lit16 v4, v4, 0x20e

    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    iget v7, p0, Lv1/b;->b:I

    .line 80
    .line 81
    if-lt v4, v7, :cond_3

    .line 82
    .line 83
    if-lez v4, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0, v5}, Lv1/b;->h(I)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v4, v4, -0x1

    .line 89
    .line 90
    :cond_3
    sget-object v7, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 91
    .line 92
    if-lez v4, :cond_8

    .line 93
    .line 94
    iget v7, p1, Lk1/x0;->c:I

    .line 95
    .line 96
    iget-object v8, v2, Lc2/h;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v8, [I

    .line 99
    .line 100
    if-eqz v8, :cond_5

    .line 101
    .line 102
    iget v8, v2, Lc2/h;->c:I

    .line 103
    .line 104
    mul-int/lit8 v8, v8, 0x2

    .line 105
    .line 106
    move v9, v5

    .line 107
    :goto_1
    if-ge v9, v8, :cond_5

    .line 108
    .line 109
    iget-object v10, v2, Lc2/h;->d:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v10, [I

    .line 112
    .line 113
    aget v10, v10, v9

    .line 114
    .line 115
    if-ne v10, v7, :cond_4

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_4
    add-int/lit8 v9, v9, 0x2

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_5
    add-int/lit8 v4, v4, -0x1

    .line 122
    .line 123
    :goto_2
    if-ltz v4, :cond_7

    .line 124
    .line 125
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    check-cast v7, Lk1/x0;

    .line 130
    .line 131
    iget v7, v7, Lk1/x0;->c:I

    .line 132
    .line 133
    iget-object v8, v2, Lc2/h;->d:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v8, [I

    .line 136
    .line 137
    if-eqz v8, :cond_7

    .line 138
    .line 139
    iget v8, v2, Lc2/h;->c:I

    .line 140
    .line 141
    mul-int/lit8 v8, v8, 0x2

    .line 142
    .line 143
    move v9, v5

    .line 144
    :goto_3
    if-ge v9, v8, :cond_7

    .line 145
    .line 146
    iget-object v10, v2, Lc2/h;->d:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v10, [I

    .line 149
    .line 150
    aget v10, v10, v9

    .line 151
    .line 152
    if-ne v10, v7, :cond_6

    .line 153
    .line 154
    add-int/lit8 v4, v4, -0x1

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_6
    add-int/lit8 v9, v9, 0x2

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    add-int/2addr v4, v6

    .line 161
    :cond_8
    :goto_4
    invoke-virtual {v0, v4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    move v0, v6

    .line 165
    goto :goto_6

    .line 166
    :cond_9
    :goto_5
    move v0, v5

    .line 167
    :goto_6
    if-nez v0, :cond_a

    .line 168
    .line 169
    invoke-virtual {p0, p1, v6}, Lv1/b;->a(Lk1/x0;Z)V

    .line 170
    .line 171
    .line 172
    :goto_7
    move v5, v0

    .line 173
    goto :goto_8

    .line 174
    :cond_a
    move v6, v5

    .line 175
    goto :goto_7

    .line 176
    :cond_b
    move v6, v5

    .line 177
    :goto_8
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->k:Landroidx/emoji2/text/p;

    .line 178
    .line 179
    invoke-virtual {v0, p1}, Landroidx/emoji2/text/p;->y(Lk1/x0;)V

    .line 180
    .line 181
    .line 182
    if-nez v5, :cond_c

    .line 183
    .line 184
    if-nez v6, :cond_c

    .line 185
    .line 186
    if-eqz v3, :cond_c

    .line 187
    .line 188
    const/4 v0, 0x0

    .line 189
    iput-object v0, p1, Lk1/x0;->s:Lk1/b0;

    .line 190
    .line 191
    iput-object v0, p1, Lk1/x0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 192
    .line 193
    :cond_c
    return-void

    .line 194
    :cond_d
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    const-string v0, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 199
    .line 200
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    new-instance v2, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string v3, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 213
    .line 214
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v0

    .line 235
    :cond_f
    :goto_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 236
    .line 237
    new-instance v2, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string v3, "Scrapped or attached views may not be recycled. isScrap:"

    .line 240
    .line 241
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1}, Lk1/x0;->i()Z

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string p1, " isAttached:"

    .line 252
    .line 253
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    if-eqz p1, :cond_10

    .line 261
    .line 262
    move v5, v6

    .line 263
    :cond_10
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v0
.end method

.method public k()V
    .locals 9

    .line 1
    iget-object v0, p0, Lv1/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget v1, p0, Lv1/b;->a:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    iget-object v2, p0, Lv1/b;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const/4 v4, 0x2

    .line 21
    invoke-static {v4, v1, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v3, p0, Lv1/b;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lv1/a;

    .line 28
    .line 29
    iget-object v3, v3, Lv1/a;->a:Ljava/lang/String;

    .line 30
    .line 31
    sget-object v4, Lv1/a;->i:Lv1/a;

    .line 32
    .line 33
    iget-object v4, v4, Lv1/a;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    iget-object v3, p0, Lv1/b;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lv1/a;

    .line 44
    .line 45
    iget-object v3, v3, Lv1/a;->a:Ljava/lang/String;

    .line 46
    .line 47
    sget-object v4, Lv1/a;->c:Lv1/a;

    .line 48
    .line 49
    iget-object v4, v4, Lv1/a;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    :cond_0
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 58
    .line 59
    mul-float/2addr v1, v3

    .line 60
    :cond_1
    new-instance v3, Landroid/text/TextPaint;

    .line 61
    .line 62
    invoke-direct {v3}, Landroid/text/TextPaint;-><init>()V

    .line 63
    .line 64
    .line 65
    iget v4, p0, Lv1/b;->b:I

    .line 66
    .line 67
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 71
    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 75
    .line 76
    .line 77
    const-string v1, "?"

    .line 78
    .line 79
    invoke-static {v0, v1}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_2

    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p0, Lv1/b;->g:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Lv1/a;

    .line 92
    .line 93
    iget-object v2, v2, Lv1/a;->a:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 100
    .line 101
    .line 102
    :cond_2
    new-instance v1, Landroid/graphics/Rect;

    .line 103
    .line 104
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 105
    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-virtual {v3, v0, v2, v4, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    add-int/lit8 v2, v2, 0x5

    .line 120
    .line 121
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    add-int/lit8 v4, v4, 0x5

    .line 126
    .line 127
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 128
    .line 129
    invoke-static {v2, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v4, Landroid/graphics/Canvas;

    .line 137
    .line 138
    invoke-direct {v4, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    sub-int/2addr v5, v6

    .line 150
    int-to-float v5, v5

    .line 151
    const/high16 v6, 0x40000000    # 2.0f

    .line 152
    .line 153
    div-float/2addr v5, v6

    .line 154
    iget v7, v1, Landroid/graphics/Rect;->left:I

    .line 155
    .line 156
    int-to-float v7, v7

    .line 157
    sub-float/2addr v5, v7

    .line 158
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    sub-int/2addr v7, v8

    .line 167
    int-to-float v7, v7

    .line 168
    div-float/2addr v7, v6

    .line 169
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 170
    .line 171
    int-to-float v1, v1

    .line 172
    sub-float/2addr v7, v1

    .line 173
    invoke-virtual {v4, v0, v5, v7, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 174
    .line 175
    .line 176
    new-instance v0, Ljava/io/FileOutputStream;

    .line 177
    .line 178
    iget-object v1, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Ljava/io/File;

    .line 181
    .line 182
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 183
    .line 184
    .line 185
    :try_start_0
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 186
    .line 187
    const/16 v3, 0x64

    .line 188
    .line 189
    invoke-virtual {v2, v1, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :catchall_0
    move-exception v1

    .line 200
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 201
    :catchall_1
    move-exception v2

    .line 202
    invoke-static {v0, v1}, Le4/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    throw v2
.end method

.method public l(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v1, p1, Lk1/x0;->j:I

    .line 10
    .line 11
    and-int/lit8 v1, v1, 0xc

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lk1/x0;->k()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->P:Lk1/h0;

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-virtual {p1}, Lk1/x0;->c()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v1, Lk1/i;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    iget-boolean v1, v1, Lk1/i;->g:Z

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, Lk1/x0;->f()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, Lv1/b;->d:Ljava/io/Serializable;

    .line 50
    .line 51
    check-cast v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    new-instance v0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lv1/b;->d:Ljava/io/Serializable;

    .line 61
    .line 62
    :cond_2
    iput-object p0, p1, Lk1/x0;->n:Lv1/b;

    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p1, Lk1/x0;->o:Z

    .line 66
    .line 67
    iget-object v0, p0, Lv1/b;->d:Ljava/io/Serializable;

    .line 68
    .line 69
    check-cast v0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lk1/x0;->f()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    invoke-virtual {p1}, Lk1/x0;->h()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_5

    .line 86
    .line 87
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 88
    .line 89
    iget-boolean v1, v1, Lk1/b0;->b:Z

    .line 90
    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string v0, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_5
    :goto_1
    iput-object p0, p1, Lk1/x0;->n:Lv1/b;

    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    iput-boolean v0, p1, Lk1/x0;->o:Z

    .line 112
    .line 113
    iget-object v0, p0, Lv1/b;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public m(IJ)Lk1/x0;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lv1/b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v3, v1, Lv1/b;->e:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v4, v1, Lv1/b;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->k0:Lk1/u0;

    .line 18
    .line 19
    if-ltz v0, :cond_4f

    .line 20
    .line 21
    invoke-virtual {v5}, Lk1/u0;->b()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-ge v0, v6, :cond_4f

    .line 26
    .line 27
    iget-boolean v6, v5, Lk1/u0;->g:Z

    .line 28
    .line 29
    const/16 v7, 0x20

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    if-eqz v6, :cond_7

    .line 33
    .line 34
    iget-object v6, v1, Lv1/b;->d:Ljava/io/Serializable;

    .line 35
    .line 36
    check-cast v6, Ljava/util/ArrayList;

    .line 37
    .line 38
    if-eqz v6, :cond_5

    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-nez v6, :cond_0

    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_0
    move v11, v10

    .line 49
    :goto_0
    if-ge v11, v6, :cond_2

    .line 50
    .line 51
    iget-object v12, v1, Lv1/b;->d:Ljava/io/Serializable;

    .line 52
    .line 53
    check-cast v12, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v12

    .line 59
    check-cast v12, Lk1/x0;

    .line 60
    .line 61
    invoke-virtual {v12}, Lk1/x0;->p()Z

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    if-nez v13, :cond_1

    .line 66
    .line 67
    invoke-virtual {v12}, Lk1/x0;->b()I

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    if-ne v13, v0, :cond_1

    .line 72
    .line 73
    invoke-virtual {v12, v7}, Lk1/x0;->a(I)V

    .line 74
    .line 75
    .line 76
    const/4 v15, 0x0

    .line 77
    const/16 v16, 0x1

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 84
    .line 85
    iget-boolean v11, v11, Lk1/b0;->b:Z

    .line 86
    .line 87
    if-eqz v11, :cond_5

    .line 88
    .line 89
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->i:Lk/o;

    .line 90
    .line 91
    invoke-virtual {v11, v0, v10}, Lk/o;->g(II)I

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    if-lez v11, :cond_5

    .line 96
    .line 97
    iget-object v12, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 98
    .line 99
    invoke-virtual {v12}, Lk1/b0;->a()I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-ge v11, v12, :cond_5

    .line 104
    .line 105
    iget-object v12, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 106
    .line 107
    invoke-virtual {v12, v11}, Lk1/b0;->b(I)J

    .line 108
    .line 109
    .line 110
    move-result-wide v11

    .line 111
    move v13, v10

    .line 112
    :goto_1
    if-ge v13, v6, :cond_5

    .line 113
    .line 114
    iget-object v14, v1, Lv1/b;->d:Ljava/io/Serializable;

    .line 115
    .line 116
    check-cast v14, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v14

    .line 122
    check-cast v14, Lk1/x0;

    .line 123
    .line 124
    invoke-virtual {v14}, Lk1/x0;->p()Z

    .line 125
    .line 126
    .line 127
    move-result v15

    .line 128
    if-nez v15, :cond_3

    .line 129
    .line 130
    const/4 v15, 0x0

    .line 131
    const/16 v16, 0x1

    .line 132
    .line 133
    iget-wide v8, v14, Lk1/x0;->e:J

    .line 134
    .line 135
    cmp-long v8, v8, v11

    .line 136
    .line 137
    if-nez v8, :cond_4

    .line 138
    .line 139
    invoke-virtual {v14, v7}, Lk1/x0;->a(I)V

    .line 140
    .line 141
    .line 142
    move-object v12, v14

    .line 143
    goto :goto_3

    .line 144
    :cond_3
    const/4 v15, 0x0

    .line 145
    const/16 v16, 0x1

    .line 146
    .line 147
    :cond_4
    add-int/lit8 v13, v13, 0x1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_5
    :goto_2
    const/4 v15, 0x0

    .line 151
    const/16 v16, 0x1

    .line 152
    .line 153
    move-object v12, v15

    .line 154
    :goto_3
    if-eqz v12, :cond_6

    .line 155
    .line 156
    move/from16 v6, v16

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_6
    move v6, v10

    .line 160
    goto :goto_4

    .line 161
    :cond_7
    const/4 v15, 0x0

    .line 162
    const/16 v16, 0x1

    .line 163
    .line 164
    move v6, v10

    .line 165
    move-object v12, v15

    .line 166
    :goto_4
    if-nez v12, :cond_1e

    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    move v9, v10

    .line 173
    :goto_5
    if-ge v9, v8, :cond_a

    .line 174
    .line 175
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    check-cast v11, Lk1/x0;

    .line 180
    .line 181
    invoke-virtual {v11}, Lk1/x0;->p()Z

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    if-nez v12, :cond_9

    .line 186
    .line 187
    invoke-virtual {v11}, Lk1/x0;->b()I

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    if-ne v12, v0, :cond_9

    .line 192
    .line 193
    invoke-virtual {v11}, Lk1/x0;->f()Z

    .line 194
    .line 195
    .line 196
    move-result v12

    .line 197
    if-nez v12, :cond_9

    .line 198
    .line 199
    iget-boolean v12, v5, Lk1/u0;->g:Z

    .line 200
    .line 201
    if-nez v12, :cond_8

    .line 202
    .line 203
    invoke-virtual {v11}, Lk1/x0;->h()Z

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    if-nez v12, :cond_9

    .line 208
    .line 209
    :cond_8
    invoke-virtual {v11, v7}, Lk1/x0;->a(I)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_b

    .line 213
    .line 214
    :cond_9
    add-int/lit8 v9, v9, 0x1

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_a
    iget-object v8, v4, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 218
    .line 219
    iget-object v8, v8, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v8, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    move v11, v10

    .line 228
    :goto_6
    if-ge v11, v9, :cond_c

    .line 229
    .line 230
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    check-cast v12, Landroid/view/View;

    .line 235
    .line 236
    invoke-static {v12}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    invoke-virtual {v13}, Lk1/x0;->b()I

    .line 241
    .line 242
    .line 243
    move-result v14

    .line 244
    if-ne v14, v0, :cond_b

    .line 245
    .line 246
    invoke-virtual {v13}, Lk1/x0;->f()Z

    .line 247
    .line 248
    .line 249
    move-result v14

    .line 250
    if-nez v14, :cond_b

    .line 251
    .line 252
    invoke-virtual {v13}, Lk1/x0;->h()Z

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    if-nez v13, :cond_b

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_c
    move-object v12, v15

    .line 263
    :goto_7
    if-eqz v12, :cond_12

    .line 264
    .line 265
    invoke-static {v12}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 270
    .line 271
    iget-object v11, v9, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v11, Lk1/b;

    .line 274
    .line 275
    iget-object v13, v9, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v13, Lk1/a0;

    .line 278
    .line 279
    iget-object v13, v13, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 280
    .line 281
    invoke-virtual {v13, v12}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 282
    .line 283
    .line 284
    move-result v13

    .line 285
    if-ltz v13, :cond_11

    .line 286
    .line 287
    invoke-virtual {v11, v13}, Lk1/b;->d(I)Z

    .line 288
    .line 289
    .line 290
    move-result v14

    .line 291
    if-eqz v14, :cond_10

    .line 292
    .line 293
    invoke-virtual {v11, v13}, Lk1/b;->a(I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v9, v12}, Landroidx/emoji2/text/t;->x(Landroid/view/View;)V

    .line 297
    .line 298
    .line 299
    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 300
    .line 301
    iget-object v11, v9, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v11, Lk1/b;

    .line 304
    .line 305
    iget-object v9, v9, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v9, Lk1/a0;

    .line 308
    .line 309
    iget-object v9, v9, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 310
    .line 311
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    const/4 v13, -0x1

    .line 316
    if-ne v9, v13, :cond_d

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_d
    invoke-virtual {v11, v9}, Lk1/b;->d(I)Z

    .line 320
    .line 321
    .line 322
    move-result v14

    .line 323
    if-eqz v14, :cond_e

    .line 324
    .line 325
    :goto_8
    move v9, v13

    .line 326
    goto :goto_9

    .line 327
    :cond_e
    invoke-virtual {v11, v9}, Lk1/b;->b(I)I

    .line 328
    .line 329
    .line 330
    move-result v11

    .line 331
    sub-int/2addr v9, v11

    .line 332
    :goto_9
    if-eq v9, v13, :cond_f

    .line 333
    .line 334
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 335
    .line 336
    invoke-virtual {v11, v9}, Landroidx/emoji2/text/t;->d(I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1, v12}, Lv1/b;->l(Landroid/view/View;)V

    .line 340
    .line 341
    .line 342
    const/16 v9, 0x2020

    .line 343
    .line 344
    invoke-virtual {v8, v9}, Lk1/x0;->a(I)V

    .line 345
    .line 346
    .line 347
    move-object v11, v8

    .line 348
    goto :goto_b

    .line 349
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 350
    .line 351
    new-instance v2, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    const-string v3, "layout index should not be -1 after unhiding a view:"

    .line 354
    .line 355
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw v0

    .line 376
    :cond_10
    new-instance v0, Ljava/lang/RuntimeException;

    .line 377
    .line 378
    new-instance v2, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    const-string v3, "trying to unhide a view that was not hidden"

    .line 381
    .line 382
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v0

    .line 396
    :cond_11
    const-string v0, "view is not a child, cannot hide "

    .line 397
    .line 398
    invoke-static {v12, v0}, Landroidx/fragment/app/q;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    return-object v15

    .line 402
    :cond_12
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    move v9, v10

    .line 407
    :goto_a
    if-ge v9, v8, :cond_14

    .line 408
    .line 409
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v11

    .line 413
    check-cast v11, Lk1/x0;

    .line 414
    .line 415
    invoke-virtual {v11}, Lk1/x0;->f()Z

    .line 416
    .line 417
    .line 418
    move-result v12

    .line 419
    if-nez v12, :cond_13

    .line 420
    .line 421
    invoke-virtual {v11}, Lk1/x0;->b()I

    .line 422
    .line 423
    .line 424
    move-result v12

    .line 425
    if-ne v12, v0, :cond_13

    .line 426
    .line 427
    invoke-virtual {v11}, Lk1/x0;->d()Z

    .line 428
    .line 429
    .line 430
    move-result v12

    .line 431
    if-nez v12, :cond_13

    .line 432
    .line 433
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_13
    add-int/lit8 v9, v9, 0x1

    .line 438
    .line 439
    goto :goto_a

    .line 440
    :cond_14
    move-object v11, v15

    .line 441
    :goto_b
    if-eqz v11, :cond_1d

    .line 442
    .line 443
    invoke-virtual {v11}, Lk1/x0;->h()Z

    .line 444
    .line 445
    .line 446
    move-result v8

    .line 447
    if-eqz v8, :cond_15

    .line 448
    .line 449
    iget-boolean v8, v5, Lk1/u0;->g:Z

    .line 450
    .line 451
    goto :goto_c

    .line 452
    :cond_15
    iget v8, v11, Lk1/x0;->c:I

    .line 453
    .line 454
    if-ltz v8, :cond_1c

    .line 455
    .line 456
    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 457
    .line 458
    invoke-virtual {v9}, Lk1/b0;->a()I

    .line 459
    .line 460
    .line 461
    move-result v9

    .line 462
    if-ge v8, v9, :cond_1c

    .line 463
    .line 464
    iget-boolean v8, v5, Lk1/u0;->g:Z

    .line 465
    .line 466
    if-nez v8, :cond_17

    .line 467
    .line 468
    iget-object v8, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 469
    .line 470
    iget v9, v11, Lk1/x0;->c:I

    .line 471
    .line 472
    invoke-virtual {v8, v9}, Lk1/b0;->c(I)I

    .line 473
    .line 474
    .line 475
    move-result v8

    .line 476
    iget v9, v11, Lk1/x0;->f:I

    .line 477
    .line 478
    if-eq v8, v9, :cond_17

    .line 479
    .line 480
    :cond_16
    move v8, v10

    .line 481
    goto :goto_c

    .line 482
    :cond_17
    iget-object v8, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 483
    .line 484
    iget-boolean v9, v8, Lk1/b0;->b:Z

    .line 485
    .line 486
    if-eqz v9, :cond_18

    .line 487
    .line 488
    iget-wide v12, v11, Lk1/x0;->e:J

    .line 489
    .line 490
    iget v9, v11, Lk1/x0;->c:I

    .line 491
    .line 492
    invoke-virtual {v8, v9}, Lk1/b0;->b(I)J

    .line 493
    .line 494
    .line 495
    move-result-wide v8

    .line 496
    cmp-long v8, v12, v8

    .line 497
    .line 498
    if-nez v8, :cond_16

    .line 499
    .line 500
    :cond_18
    move/from16 v8, v16

    .line 501
    .line 502
    :goto_c
    if-nez v8, :cond_1b

    .line 503
    .line 504
    const/4 v8, 0x4

    .line 505
    invoke-virtual {v11, v8}, Lk1/x0;->a(I)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v11}, Lk1/x0;->i()Z

    .line 509
    .line 510
    .line 511
    move-result v8

    .line 512
    if-eqz v8, :cond_19

    .line 513
    .line 514
    iget-object v8, v11, Lk1/x0;->a:Landroid/view/View;

    .line 515
    .line 516
    invoke-virtual {v4, v8, v10}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 517
    .line 518
    .line 519
    iget-object v8, v11, Lk1/x0;->n:Lv1/b;

    .line 520
    .line 521
    invoke-virtual {v8, v11}, Lv1/b;->n(Lk1/x0;)V

    .line 522
    .line 523
    .line 524
    goto :goto_d

    .line 525
    :cond_19
    invoke-virtual {v11}, Lk1/x0;->p()Z

    .line 526
    .line 527
    .line 528
    move-result v8

    .line 529
    if-eqz v8, :cond_1a

    .line 530
    .line 531
    iget v8, v11, Lk1/x0;->j:I

    .line 532
    .line 533
    and-int/lit8 v8, v8, -0x21

    .line 534
    .line 535
    iput v8, v11, Lk1/x0;->j:I

    .line 536
    .line 537
    :cond_1a
    :goto_d
    invoke-virtual {v1, v11}, Lv1/b;->j(Lk1/x0;)V

    .line 538
    .line 539
    .line 540
    move-object v12, v15

    .line 541
    goto :goto_e

    .line 542
    :cond_1b
    move-object v12, v11

    .line 543
    move/from16 v6, v16

    .line 544
    .line 545
    goto :goto_e

    .line 546
    :cond_1c
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 547
    .line 548
    new-instance v2, Ljava/lang/StringBuilder;

    .line 549
    .line 550
    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    .line 551
    .line 552
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-direct {v0, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    throw v0

    .line 573
    :cond_1d
    move-object v12, v11

    .line 574
    :cond_1e
    :goto_e
    const-wide/16 v17, 0x0

    .line 575
    .line 576
    const-wide v19, 0x7fffffffffffffffL

    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    if-nez v12, :cond_33

    .line 582
    .line 583
    iget-object v11, v4, Landroidx/recyclerview/widget/RecyclerView;->i:Lk/o;

    .line 584
    .line 585
    invoke-virtual {v11, v0, v10}, Lk/o;->g(II)I

    .line 586
    .line 587
    .line 588
    move-result v11

    .line 589
    if-ltz v11, :cond_32

    .line 590
    .line 591
    const-wide/16 v21, 0x3

    .line 592
    .line 593
    iget-object v8, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 594
    .line 595
    invoke-virtual {v8}, Lk1/b0;->a()I

    .line 596
    .line 597
    .line 598
    move-result v8

    .line 599
    if-ge v11, v8, :cond_32

    .line 600
    .line 601
    iget-object v8, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 602
    .line 603
    invoke-virtual {v8, v11}, Lk1/b0;->c(I)I

    .line 604
    .line 605
    .line 606
    move-result v8

    .line 607
    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 608
    .line 609
    const-wide/16 v23, 0x4

    .line 610
    .line 611
    iget-boolean v13, v9, Lk1/b0;->b:Z

    .line 612
    .line 613
    if-eqz v13, :cond_27

    .line 614
    .line 615
    invoke-virtual {v9, v11}, Lk1/b0;->b(I)J

    .line 616
    .line 617
    .line 618
    move-result-wide v12

    .line 619
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 620
    .line 621
    .line 622
    move-result v9

    .line 623
    add-int/lit8 v9, v9, -0x1

    .line 624
    .line 625
    :goto_f
    if-ltz v9, :cond_21

    .line 626
    .line 627
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v14

    .line 631
    check-cast v14, Lk1/x0;

    .line 632
    .line 633
    move/from16 v25, v11

    .line 634
    .line 635
    iget-wide v10, v14, Lk1/x0;->e:J

    .line 636
    .line 637
    iget-object v15, v14, Lk1/x0;->a:Landroid/view/View;

    .line 638
    .line 639
    cmp-long v10, v10, v12

    .line 640
    .line 641
    if-nez v10, :cond_20

    .line 642
    .line 643
    invoke-virtual {v14}, Lk1/x0;->p()Z

    .line 644
    .line 645
    .line 646
    move-result v10

    .line 647
    if-nez v10, :cond_20

    .line 648
    .line 649
    iget v10, v14, Lk1/x0;->f:I

    .line 650
    .line 651
    if-ne v8, v10, :cond_1f

    .line 652
    .line 653
    invoke-virtual {v14, v7}, Lk1/x0;->a(I)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v14}, Lk1/x0;->h()Z

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    if-eqz v2, :cond_25

    .line 661
    .line 662
    iget-boolean v2, v5, Lk1/u0;->g:Z

    .line 663
    .line 664
    if-nez v2, :cond_25

    .line 665
    .line 666
    iget v2, v14, Lk1/x0;->j:I

    .line 667
    .line 668
    and-int/lit8 v2, v2, -0xf

    .line 669
    .line 670
    or-int/lit8 v2, v2, 0x2

    .line 671
    .line 672
    iput v2, v14, Lk1/x0;->j:I

    .line 673
    .line 674
    goto :goto_11

    .line 675
    :cond_1f
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    const/4 v10, 0x0

    .line 679
    invoke-virtual {v4, v15, v10}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 680
    .line 681
    .line 682
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 683
    .line 684
    .line 685
    move-result-object v11

    .line 686
    const/4 v15, 0x0

    .line 687
    iput-object v15, v11, Lk1/x0;->n:Lv1/b;

    .line 688
    .line 689
    iput-boolean v10, v11, Lk1/x0;->o:Z

    .line 690
    .line 691
    iget v10, v11, Lk1/x0;->j:I

    .line 692
    .line 693
    and-int/lit8 v10, v10, -0x21

    .line 694
    .line 695
    iput v10, v11, Lk1/x0;->j:I

    .line 696
    .line 697
    invoke-virtual {v1, v11}, Lv1/b;->j(Lk1/x0;)V

    .line 698
    .line 699
    .line 700
    :cond_20
    add-int/lit8 v9, v9, -0x1

    .line 701
    .line 702
    move/from16 v11, v25

    .line 703
    .line 704
    const/4 v10, 0x0

    .line 705
    const/4 v15, 0x0

    .line 706
    goto :goto_f

    .line 707
    :cond_21
    move/from16 v25, v11

    .line 708
    .line 709
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 710
    .line 711
    .line 712
    move-result v2

    .line 713
    add-int/lit8 v2, v2, -0x1

    .line 714
    .line 715
    :goto_10
    if-ltz v2, :cond_23

    .line 716
    .line 717
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v7

    .line 721
    check-cast v7, Lk1/x0;

    .line 722
    .line 723
    iget-wide v9, v7, Lk1/x0;->e:J

    .line 724
    .line 725
    cmp-long v9, v9, v12

    .line 726
    .line 727
    if-nez v9, :cond_24

    .line 728
    .line 729
    invoke-virtual {v7}, Lk1/x0;->d()Z

    .line 730
    .line 731
    .line 732
    move-result v9

    .line 733
    if-nez v9, :cond_24

    .line 734
    .line 735
    iget v9, v7, Lk1/x0;->f:I

    .line 736
    .line 737
    if-ne v8, v9, :cond_22

    .line 738
    .line 739
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-object v14, v7

    .line 743
    goto :goto_11

    .line 744
    :cond_22
    invoke-virtual {v1, v2}, Lv1/b;->h(I)V

    .line 745
    .line 746
    .line 747
    :cond_23
    const/4 v14, 0x0

    .line 748
    goto :goto_11

    .line 749
    :cond_24
    add-int/lit8 v2, v2, -0x1

    .line 750
    .line 751
    goto :goto_10

    .line 752
    :cond_25
    :goto_11
    if-eqz v14, :cond_26

    .line 753
    .line 754
    move/from16 v2, v25

    .line 755
    .line 756
    iput v2, v14, Lk1/x0;->c:I

    .line 757
    .line 758
    move-object v12, v14

    .line 759
    move/from16 v6, v16

    .line 760
    .line 761
    goto :goto_12

    .line 762
    :cond_26
    move-object v12, v14

    .line 763
    :cond_27
    :goto_12
    if-nez v12, :cond_2b

    .line 764
    .line 765
    invoke-virtual {v1}, Lv1/b;->e()Lk1/q0;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    iget-object v2, v2, Lk1/q0;->a:Landroid/util/SparseArray;

    .line 770
    .line 771
    invoke-virtual {v2, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    check-cast v2, Lk1/p0;

    .line 776
    .line 777
    if-eqz v2, :cond_29

    .line 778
    .line 779
    iget-object v2, v2, Lk1/p0;->a:Ljava/util/ArrayList;

    .line 780
    .line 781
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    if-nez v3, :cond_29

    .line 786
    .line 787
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 788
    .line 789
    .line 790
    move-result v3

    .line 791
    add-int/lit8 v3, v3, -0x1

    .line 792
    .line 793
    :goto_13
    if-ltz v3, :cond_29

    .line 794
    .line 795
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v7

    .line 799
    check-cast v7, Lk1/x0;

    .line 800
    .line 801
    invoke-virtual {v7}, Lk1/x0;->d()Z

    .line 802
    .line 803
    .line 804
    move-result v7

    .line 805
    if-nez v7, :cond_28

    .line 806
    .line 807
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    check-cast v2, Lk1/x0;

    .line 812
    .line 813
    goto :goto_14

    .line 814
    :cond_28
    add-int/lit8 v3, v3, -0x1

    .line 815
    .line 816
    goto :goto_13

    .line 817
    :cond_29
    const/4 v2, 0x0

    .line 818
    :goto_14
    if-eqz v2, :cond_2a

    .line 819
    .line 820
    invoke-virtual {v2}, Lk1/x0;->m()V

    .line 821
    .line 822
    .line 823
    sget-object v3, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 824
    .line 825
    :cond_2a
    move-object v12, v2

    .line 826
    :cond_2b
    if-nez v12, :cond_34

    .line 827
    .line 828
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 829
    .line 830
    .line 831
    move-result-wide v2

    .line 832
    cmp-long v7, p2, v19

    .line 833
    .line 834
    if-eqz v7, :cond_2e

    .line 835
    .line 836
    iget-object v7, v1, Lv1/b;->g:Ljava/lang/Object;

    .line 837
    .line 838
    check-cast v7, Lk1/q0;

    .line 839
    .line 840
    invoke-virtual {v7, v8}, Lk1/q0;->a(I)Lk1/p0;

    .line 841
    .line 842
    .line 843
    move-result-object v7

    .line 844
    iget-wide v9, v7, Lk1/p0;->c:J

    .line 845
    .line 846
    cmp-long v7, v9, v17

    .line 847
    .line 848
    if-eqz v7, :cond_2d

    .line 849
    .line 850
    add-long/2addr v9, v2

    .line 851
    cmp-long v7, v9, p2

    .line 852
    .line 853
    if-gez v7, :cond_2c

    .line 854
    .line 855
    goto :goto_15

    .line 856
    :cond_2c
    const/4 v7, 0x0

    .line 857
    goto :goto_16

    .line 858
    :cond_2d
    :goto_15
    move/from16 v7, v16

    .line 859
    .line 860
    :goto_16
    if-nez v7, :cond_2e

    .line 861
    .line 862
    const/4 v15, 0x0

    .line 863
    return-object v15

    .line 864
    :cond_2e
    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 865
    .line 866
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    :try_start_0
    const-string v9, "RV CreateView"

    .line 870
    .line 871
    sget v10, Lk0/i;->a:I

    .line 872
    .line 873
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v7, v4, v8}, Lk1/b0;->e(Landroid/view/ViewGroup;I)Lk1/x0;

    .line 877
    .line 878
    .line 879
    move-result-object v12

    .line 880
    iget-object v7, v12, Lk1/x0;->a:Landroid/view/View;

    .line 881
    .line 882
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 883
    .line 884
    .line 885
    move-result-object v7

    .line 886
    if-nez v7, :cond_31

    .line 887
    .line 888
    iput v8, v12, Lk1/x0;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 889
    .line 890
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 891
    .line 892
    .line 893
    sget-object v7, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 894
    .line 895
    iget-object v7, v12, Lk1/x0;->a:Landroid/view/View;

    .line 896
    .line 897
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 898
    .line 899
    .line 900
    move-result-object v7

    .line 901
    if-eqz v7, :cond_2f

    .line 902
    .line 903
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 904
    .line 905
    invoke-direct {v9, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    iput-object v9, v12, Lk1/x0;->b:Ljava/lang/ref/WeakReference;

    .line 909
    .line 910
    :cond_2f
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 911
    .line 912
    .line 913
    move-result-wide v9

    .line 914
    iget-object v7, v1, Lv1/b;->g:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v7, Lk1/q0;

    .line 917
    .line 918
    sub-long/2addr v9, v2

    .line 919
    invoke-virtual {v7, v8}, Lk1/q0;->a(I)Lk1/p0;

    .line 920
    .line 921
    .line 922
    move-result-object v2

    .line 923
    iget-wide v7, v2, Lk1/p0;->c:J

    .line 924
    .line 925
    cmp-long v3, v7, v17

    .line 926
    .line 927
    if-nez v3, :cond_30

    .line 928
    .line 929
    goto :goto_17

    .line 930
    :cond_30
    div-long v7, v7, v23

    .line 931
    .line 932
    mul-long v7, v7, v21

    .line 933
    .line 934
    div-long v9, v9, v23

    .line 935
    .line 936
    add-long/2addr v9, v7

    .line 937
    :goto_17
    iput-wide v9, v2, Lk1/p0;->c:J

    .line 938
    .line 939
    goto :goto_19

    .line 940
    :catchall_0
    move-exception v0

    .line 941
    goto :goto_18

    .line 942
    :cond_31
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 943
    .line 944
    const-string v2, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 945
    .line 946
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 950
    :goto_18
    sget v2, Lk0/i;->a:I

    .line 951
    .line 952
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 953
    .line 954
    .line 955
    throw v0

    .line 956
    :cond_32
    move v2, v11

    .line 957
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    .line 958
    .line 959
    invoke-virtual {v5}, Lk1/u0;->b()I

    .line 960
    .line 961
    .line 962
    move-result v5

    .line 963
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    new-instance v6, Ljava/lang/StringBuilder;

    .line 968
    .line 969
    const-string v7, "Inconsistency detected. Invalid item position "

    .line 970
    .line 971
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    const-string v0, "(offset:"

    .line 978
    .line 979
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 980
    .line 981
    .line 982
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    const-string v0, ").state:"

    .line 986
    .line 987
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 991
    .line 992
    .line 993
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    invoke-direct {v3, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    throw v3

    .line 1004
    :cond_33
    const-wide/16 v21, 0x3

    .line 1005
    .line 1006
    const-wide/16 v23, 0x4

    .line 1007
    .line 1008
    :cond_34
    :goto_19
    iget-object v2, v12, Lk1/x0;->a:Landroid/view/View;

    .line 1009
    .line 1010
    if-eqz v6, :cond_36

    .line 1011
    .line 1012
    iget-boolean v3, v5, Lk1/u0;->g:Z

    .line 1013
    .line 1014
    if-nez v3, :cond_36

    .line 1015
    .line 1016
    iget v3, v12, Lk1/x0;->j:I

    .line 1017
    .line 1018
    and-int/lit16 v7, v3, 0x2000

    .line 1019
    .line 1020
    if-eqz v7, :cond_35

    .line 1021
    .line 1022
    move/from16 v7, v16

    .line 1023
    .line 1024
    goto :goto_1a

    .line 1025
    :cond_35
    const/4 v7, 0x0

    .line 1026
    :goto_1a
    if-eqz v7, :cond_36

    .line 1027
    .line 1028
    and-int/lit16 v3, v3, -0x2001

    .line 1029
    .line 1030
    iput v3, v12, Lk1/x0;->j:I

    .line 1031
    .line 1032
    iget-boolean v3, v5, Lk1/u0;->j:Z

    .line 1033
    .line 1034
    if-eqz v3, :cond_36

    .line 1035
    .line 1036
    invoke-static {v12}, Lk1/h0;->b(Lk1/x0;)V

    .line 1037
    .line 1038
    .line 1039
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->P:Lk1/h0;

    .line 1040
    .line 1041
    invoke-virtual {v12}, Lk1/x0;->c()Ljava/util/List;

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1045
    .line 1046
    .line 1047
    new-instance v3, Lk1/g0;

    .line 1048
    .line 1049
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v3, v12}, Lk1/g0;->a(Lk1/x0;)V

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v4, v12, v3}, Landroidx/recyclerview/widget/RecyclerView;->V(Lk1/x0;Lk1/g0;)V

    .line 1056
    .line 1057
    .line 1058
    :cond_36
    iget-boolean v3, v5, Lk1/u0;->g:Z

    .line 1059
    .line 1060
    if-eqz v3, :cond_37

    .line 1061
    .line 1062
    invoke-virtual {v12}, Lk1/x0;->e()Z

    .line 1063
    .line 1064
    .line 1065
    move-result v3

    .line 1066
    if-eqz v3, :cond_37

    .line 1067
    .line 1068
    iput v0, v12, Lk1/x0;->g:I

    .line 1069
    .line 1070
    goto :goto_1c

    .line 1071
    :cond_37
    invoke-virtual {v12}, Lk1/x0;->e()Z

    .line 1072
    .line 1073
    .line 1074
    move-result v3

    .line 1075
    if-eqz v3, :cond_3a

    .line 1076
    .line 1077
    iget v3, v12, Lk1/x0;->j:I

    .line 1078
    .line 1079
    and-int/lit8 v3, v3, 0x2

    .line 1080
    .line 1081
    if-eqz v3, :cond_38

    .line 1082
    .line 1083
    move/from16 v3, v16

    .line 1084
    .line 1085
    goto :goto_1b

    .line 1086
    :cond_38
    const/4 v3, 0x0

    .line 1087
    :goto_1b
    if-nez v3, :cond_3a

    .line 1088
    .line 1089
    invoke-virtual {v12}, Lk1/x0;->f()Z

    .line 1090
    .line 1091
    .line 1092
    move-result v3

    .line 1093
    if-eqz v3, :cond_39

    .line 1094
    .line 1095
    goto :goto_1d

    .line 1096
    :cond_39
    :goto_1c
    move/from16 v7, v16

    .line 1097
    .line 1098
    const/4 v0, 0x0

    .line 1099
    const/4 v10, 0x0

    .line 1100
    goto/16 :goto_24

    .line 1101
    .line 1102
    :cond_3a
    :goto_1d
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->i:Lk/o;

    .line 1103
    .line 1104
    const/4 v10, 0x0

    .line 1105
    invoke-virtual {v3, v0, v10}, Lk/o;->g(II)I

    .line 1106
    .line 1107
    .line 1108
    move-result v3

    .line 1109
    const/4 v15, 0x0

    .line 1110
    iput-object v15, v12, Lk1/x0;->s:Lk1/b0;

    .line 1111
    .line 1112
    iput-object v4, v12, Lk1/x0;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 1113
    .line 1114
    iget v7, v12, Lk1/x0;->f:I

    .line 1115
    .line 1116
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1117
    .line 1118
    .line 1119
    move-result-wide v8

    .line 1120
    cmp-long v11, p2, v19

    .line 1121
    .line 1122
    if-eqz v11, :cond_3c

    .line 1123
    .line 1124
    iget-object v11, v1, Lv1/b;->g:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v11, Lk1/q0;

    .line 1127
    .line 1128
    invoke-virtual {v11, v7}, Lk1/q0;->a(I)Lk1/p0;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v7

    .line 1132
    iget-wide v13, v7, Lk1/p0;->d:J

    .line 1133
    .line 1134
    cmp-long v7, v13, v17

    .line 1135
    .line 1136
    if-eqz v7, :cond_3c

    .line 1137
    .line 1138
    add-long/2addr v13, v8

    .line 1139
    cmp-long v7, v13, p2

    .line 1140
    .line 1141
    if-gez v7, :cond_3b

    .line 1142
    .line 1143
    goto :goto_1e

    .line 1144
    :cond_3b
    move v0, v10

    .line 1145
    move/from16 v7, v16

    .line 1146
    .line 1147
    goto/16 :goto_24

    .line 1148
    .line 1149
    :cond_3c
    :goto_1e
    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Lk1/b0;

    .line 1150
    .line 1151
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1152
    .line 1153
    .line 1154
    iget-object v11, v12, Lk1/x0;->s:Lk1/b0;

    .line 1155
    .line 1156
    if-nez v11, :cond_3d

    .line 1157
    .line 1158
    move/from16 v11, v16

    .line 1159
    .line 1160
    goto :goto_1f

    .line 1161
    :cond_3d
    move v11, v10

    .line 1162
    :goto_1f
    if-eqz v11, :cond_3f

    .line 1163
    .line 1164
    iput v3, v12, Lk1/x0;->c:I

    .line 1165
    .line 1166
    iget-boolean v13, v7, Lk1/b0;->b:Z

    .line 1167
    .line 1168
    if-eqz v13, :cond_3e

    .line 1169
    .line 1170
    invoke-virtual {v7, v3}, Lk1/b0;->b(I)J

    .line 1171
    .line 1172
    .line 1173
    move-result-wide v13

    .line 1174
    iput-wide v13, v12, Lk1/x0;->e:J

    .line 1175
    .line 1176
    :cond_3e
    iget v13, v12, Lk1/x0;->j:I

    .line 1177
    .line 1178
    and-int/lit16 v13, v13, -0x208

    .line 1179
    .line 1180
    or-int/lit8 v13, v13, 0x1

    .line 1181
    .line 1182
    iput v13, v12, Lk1/x0;->j:I

    .line 1183
    .line 1184
    sget v13, Lk0/i;->a:I

    .line 1185
    .line 1186
    const-string v13, "RV OnBindView"

    .line 1187
    .line 1188
    invoke-static {v13}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1189
    .line 1190
    .line 1191
    :cond_3f
    iput-object v7, v12, Lk1/x0;->s:Lk1/b0;

    .line 1192
    .line 1193
    invoke-virtual {v12}, Lk1/x0;->c()Ljava/util/List;

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v7, v12, v3}, Lk1/b0;->d(Lk1/x0;I)V

    .line 1197
    .line 1198
    .line 1199
    if-eqz v11, :cond_42

    .line 1200
    .line 1201
    iget-object v3, v12, Lk1/x0;->k:Ljava/util/ArrayList;

    .line 1202
    .line 1203
    if-eqz v3, :cond_40

    .line 1204
    .line 1205
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 1206
    .line 1207
    .line 1208
    :cond_40
    iget v3, v12, Lk1/x0;->j:I

    .line 1209
    .line 1210
    and-int/lit16 v3, v3, -0x401

    .line 1211
    .line 1212
    iput v3, v12, Lk1/x0;->j:I

    .line 1213
    .line 1214
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v3

    .line 1218
    instance-of v7, v3, Lk1/m0;

    .line 1219
    .line 1220
    if-eqz v7, :cond_41

    .line 1221
    .line 1222
    check-cast v3, Lk1/m0;

    .line 1223
    .line 1224
    move/from16 v7, v16

    .line 1225
    .line 1226
    iput-boolean v7, v3, Lk1/m0;->c:Z

    .line 1227
    .line 1228
    :cond_41
    sget v3, Lk0/i;->a:I

    .line 1229
    .line 1230
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1231
    .line 1232
    .line 1233
    :cond_42
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1234
    .line 1235
    .line 1236
    move-result-wide v13

    .line 1237
    iget-object v3, v1, Lv1/b;->g:Ljava/lang/Object;

    .line 1238
    .line 1239
    check-cast v3, Lk1/q0;

    .line 1240
    .line 1241
    iget v7, v12, Lk1/x0;->f:I

    .line 1242
    .line 1243
    sub-long/2addr v13, v8

    .line 1244
    invoke-virtual {v3, v7}, Lk1/q0;->a(I)Lk1/p0;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v3

    .line 1248
    iget-wide v7, v3, Lk1/p0;->d:J

    .line 1249
    .line 1250
    cmp-long v9, v7, v17

    .line 1251
    .line 1252
    if-nez v9, :cond_43

    .line 1253
    .line 1254
    goto :goto_20

    .line 1255
    :cond_43
    div-long v7, v7, v23

    .line 1256
    .line 1257
    mul-long v7, v7, v21

    .line 1258
    .line 1259
    div-long v13, v13, v23

    .line 1260
    .line 1261
    add-long/2addr v13, v7

    .line 1262
    :goto_20
    iput-wide v13, v3, Lk1/p0;->d:J

    .line 1263
    .line 1264
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->F:Landroid/view/accessibility/AccessibilityManager;

    .line 1265
    .line 1266
    if-eqz v3, :cond_44

    .line 1267
    .line 1268
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1269
    .line 1270
    .line 1271
    move-result v3

    .line 1272
    if-eqz v3, :cond_44

    .line 1273
    .line 1274
    const/4 v3, 0x1

    .line 1275
    goto :goto_21

    .line 1276
    :cond_44
    move v3, v10

    .line 1277
    :goto_21
    if-eqz v3, :cond_4a

    .line 1278
    .line 1279
    sget-object v3, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 1280
    .line 1281
    invoke-virtual {v2}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1282
    .line 1283
    .line 1284
    move-result v3

    .line 1285
    const/4 v7, 0x1

    .line 1286
    if-nez v3, :cond_45

    .line 1287
    .line 1288
    invoke-virtual {v2, v7}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1289
    .line 1290
    .line 1291
    :cond_45
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->r0:Lk1/z0;

    .line 1292
    .line 1293
    if-nez v3, :cond_46

    .line 1294
    .line 1295
    goto :goto_23

    .line 1296
    :cond_46
    iget-object v3, v3, Lk1/z0;->e:Lk1/y0;

    .line 1297
    .line 1298
    if-eqz v3, :cond_49

    .line 1299
    .line 1300
    invoke-static {v2}, Lp0/p0;->d(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v8

    .line 1304
    if-nez v8, :cond_47

    .line 1305
    .line 1306
    move-object v8, v15

    .line 1307
    goto :goto_22

    .line 1308
    :cond_47
    instance-of v9, v8, Lp0/a;

    .line 1309
    .line 1310
    if-eqz v9, :cond_48

    .line 1311
    .line 1312
    check-cast v8, Lp0/a;

    .line 1313
    .line 1314
    iget-object v8, v8, Lp0/a;->a:Lp0/b;

    .line 1315
    .line 1316
    goto :goto_22

    .line 1317
    :cond_48
    new-instance v9, Lp0/b;

    .line 1318
    .line 1319
    invoke-direct {v9, v8}, Lp0/b;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1320
    .line 1321
    .line 1322
    move-object v8, v9

    .line 1323
    :goto_22
    if-eqz v8, :cond_49

    .line 1324
    .line 1325
    if-eq v8, v3, :cond_49

    .line 1326
    .line 1327
    iget-object v9, v3, Lk1/y0;->e:Ljava/util/WeakHashMap;

    .line 1328
    .line 1329
    invoke-virtual {v9, v2, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1330
    .line 1331
    .line 1332
    :cond_49
    invoke-static {v2, v3}, Lp0/p0;->m(Landroid/view/View;Lp0/b;)V

    .line 1333
    .line 1334
    .line 1335
    goto :goto_23

    .line 1336
    :cond_4a
    const/4 v7, 0x1

    .line 1337
    :goto_23
    iget-boolean v3, v5, Lk1/u0;->g:Z

    .line 1338
    .line 1339
    if-eqz v3, :cond_4b

    .line 1340
    .line 1341
    iput v0, v12, Lk1/x0;->g:I

    .line 1342
    .line 1343
    :cond_4b
    move v0, v7

    .line 1344
    :goto_24
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v3

    .line 1348
    if-nez v3, :cond_4c

    .line 1349
    .line 1350
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v3

    .line 1354
    check-cast v3, Lk1/m0;

    .line 1355
    .line 1356
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1357
    .line 1358
    .line 1359
    goto :goto_25

    .line 1360
    :cond_4c
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1361
    .line 1362
    .line 1363
    move-result v5

    .line 1364
    if-nez v5, :cond_4d

    .line 1365
    .line 1366
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v3

    .line 1370
    check-cast v3, Lk1/m0;

    .line 1371
    .line 1372
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1373
    .line 1374
    .line 1375
    goto :goto_25

    .line 1376
    :cond_4d
    check-cast v3, Lk1/m0;

    .line 1377
    .line 1378
    :goto_25
    iput-object v12, v3, Lk1/m0;->a:Lk1/x0;

    .line 1379
    .line 1380
    if-eqz v6, :cond_4e

    .line 1381
    .line 1382
    if-eqz v0, :cond_4e

    .line 1383
    .line 1384
    move v9, v7

    .line 1385
    goto :goto_26

    .line 1386
    :cond_4e
    move v9, v10

    .line 1387
    :goto_26
    iput-boolean v9, v3, Lk1/m0;->d:Z

    .line 1388
    .line 1389
    return-object v12

    .line 1390
    :cond_4f
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 1391
    .line 1392
    invoke-virtual {v5}, Lk1/u0;->b()I

    .line 1393
    .line 1394
    .line 1395
    move-result v3

    .line 1396
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v4

    .line 1400
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1401
    .line 1402
    const-string v6, "Invalid item position "

    .line 1403
    .line 1404
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1408
    .line 1409
    .line 1410
    const-string v6, "("

    .line 1411
    .line 1412
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1416
    .line 1417
    .line 1418
    const-string v0, "). Item count:"

    .line 1419
    .line 1420
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v0

    .line 1433
    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1434
    .line 1435
    .line 1436
    throw v2
.end method

.method public n(Lk1/x0;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lk1/x0;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lv1/b;->d:Ljava/io/Serializable;

    .line 6
    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lv1/b;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p1, Lk1/x0;->n:Lv1/b;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p1, Lk1/x0;->o:Z

    .line 25
    .line 26
    iget v0, p1, Lk1/x0;->j:I

    .line 27
    .line 28
    and-int/lit8 v0, v0, -0x21

    .line 29
    .line 30
    iput v0, p1, Lk1/x0;->j:I

    .line 31
    .line 32
    return-void
.end method

.method public o()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv1/b;->e:Ljava/io/Serializable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Lv1/b;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->r:Lk1/l0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget v1, v1, Lk1/l0;->j:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    iget v2, p0, Lv1/b;->a:I

    .line 18
    .line 19
    add-int/2addr v2, v1

    .line 20
    iput v2, p0, Lv1/b;->b:I

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    :goto_1
    if-ltz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget v3, p0, Lv1/b;->b:I

    .line 35
    .line 36
    if-le v2, v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lv1/b;->h(I)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, -0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    return-void
.end method
