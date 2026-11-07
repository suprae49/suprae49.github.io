.class public final Lu1/h;
.super Landroid/os/AsyncTask;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 10
    iput p1, p0, Lu1/h;->a:I

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method public constructor <init>(Lx1/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lu1/h;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Lu1/h;->b:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lu1/h;->a:I

    .line 2
    .line 3
    const-string v1, "application/json"

    .line 4
    .line 5
    const-string v2, "Content-Type"

    .line 6
    .line 7
    const-string v3, "POST"

    .line 8
    .line 9
    const-string v4, "UTF-8"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, [Ljava/lang/Void;

    .line 18
    .line 19
    iget-object p1, p0, Lu1/h;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lx1/a;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v8

    .line 27
    iput-wide v8, p1, Lx1/a;->Z0:J

    .line 28
    .line 29
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 30
    .line 31
    invoke-static {p1}, Lx1/a;->a(Lx1/a;)Ljava/util/HashMap;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 36
    .line 37
    .line 38
    const/16 p1, 0x28

    .line 39
    .line 40
    new-array v8, p1, [B

    .line 41
    .line 42
    fill-array-data v8, :array_0

    .line 43
    .line 44
    .line 45
    new-array v9, p1, [B

    .line 46
    .line 47
    fill-array-data v9, :array_1

    .line 48
    .line 49
    .line 50
    new-array v10, p1, [B

    .line 51
    .line 52
    :goto_0
    if-ge v6, p1, :cond_0

    .line 53
    .line 54
    aget-byte v11, v8, v6

    .line 55
    .line 56
    aget-byte v12, v9, v6

    .line 57
    .line 58
    xor-int/2addr v11, v12

    .line 59
    int-to-byte v11, v11

    .line 60
    aput-byte v11, v10, v6

    .line 61
    .line 62
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    new-instance p1, Ljava/net/URL;

    .line 66
    .line 67
    new-instance v6, Ljava/lang/String;

    .line 68
    .line 69
    const-string v8, "US-ASCII"

    .line 70
    .line 71
    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-direct {v6, v10, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p1, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 86
    .line 87
    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v2, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v7}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-direct {v1, v2, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->close()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    const/16 v1, 0xc8

    .line 123
    .line 124
    if-ne v0, v1, :cond_2

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-lez v0, :cond_1

    .line 131
    .line 132
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 143
    .line 144
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 145
    .line 146
    .line 147
    :goto_1
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {v1, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v1, v0}, Lt1/l;->g(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 163
    .line 164
    .line 165
    new-instance p1, Lorg/json/JSONObject;

    .line 166
    .line 167
    invoke-virtual {v0, v4}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    move-object v5, p1

    .line 175
    goto :goto_2

    .line 176
    :cond_2
    new-instance p1, Ljava/lang/Exception;

    .line 177
    .line 178
    const-string v0, "Non-200 response"

    .line 179
    .line 180
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    :catch_0
    :goto_2
    return-object v5

    .line 185
    :pswitch_0
    check-cast p1, [Ljava/lang/String;

    .line 186
    .line 187
    iget-object v0, p0, Lu1/h;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Lu1/s0;

    .line 196
    .line 197
    if-nez v0, :cond_3

    .line 198
    .line 199
    goto/16 :goto_7

    .line 200
    .line 201
    :cond_3
    :try_start_1
    new-instance v1, Ljava/net/URL;

    .line 202
    .line 203
    aget-object p1, p1, v6

    .line 204
    .line 205
    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    move-object p1, v5

    .line 209
    move v2, v6

    .line 210
    :cond_4
    if-eqz p1, :cond_5

    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :catch_1
    move-exception p1

    .line 217
    goto :goto_6

    .line 218
    :cond_5
    :goto_3
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 223
    .line 224
    invoke-virtual {p1, v7}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 225
    .line 226
    .line 227
    const-string v3, "User-Agent"

    .line 228
    .line 229
    iget-object v4, v0, Lu1/s0;->a:Lco/median/android/GoNativeApplication;

    .line 230
    .line 231
    invoke-static {v4}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    iget-object v4, v4, Lx1/a;->k:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {p1, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    const/16 v4, 0x12d

    .line 248
    .line 249
    if-eq v3, v4, :cond_7

    .line 250
    .line 251
    const/16 v4, 0x12e

    .line 252
    .line 253
    if-ne v3, v4, :cond_6

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_6
    move v3, v6

    .line 257
    goto :goto_5

    .line 258
    :cond_7
    :goto_4
    new-instance v3, Ljava/net/URL;

    .line 259
    .line 260
    const-string v4, "Location"

    .line 261
    .line 262
    invoke-virtual {p1, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-direct {v3, v1, v4}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    add-int/lit8 v2, v2, 0x1

    .line 270
    .line 271
    move-object v1, v3

    .line 272
    move v3, v7

    .line 273
    :goto_5
    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-nez v4, :cond_8

    .line 278
    .line 279
    if-eqz v3, :cond_8

    .line 280
    .line 281
    const/16 v3, 0xa

    .line 282
    .line 283
    if-lt v2, v3, :cond_4

    .line 284
    .line 285
    :cond_8
    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 294
    .line 295
    .line 296
    move-object v5, v0

    .line 297
    goto :goto_7

    .line 298
    :goto_6
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    sget v1, Lu1/s0;->d:I

    .line 303
    .line 304
    const-string v1, "u1.s0"

    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-virtual {v0, v1, v2, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 311
    .line 312
    .line 313
    :goto_7
    return-object v5

    .line 314
    :pswitch_1
    check-cast p1, [Ljava/lang/Void;

    .line 315
    .line 316
    const-string p1, "a3.f"

    .line 317
    .line 318
    iget-object v0, p0, Lu1/h;->b:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 321
    .line 322
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Landroid/content/Context;

    .line 327
    .line 328
    if-nez v0, :cond_9

    .line 329
    .line 330
    goto :goto_8

    .line 331
    :cond_9
    new-instance v8, Lorg/json/JSONObject;

    .line 332
    .line 333
    invoke-static {v0}, Lu1/h0;->y(Landroid/content/Context;)Ljava/util/HashMap;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-direct {v8, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 338
    .line 339
    .line 340
    :try_start_2
    const-string v0, "event"

    .line 341
    .line 342
    const-string v9, "launch"

    .line 343
    .line 344
    invoke-virtual {v8, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3

    .line 345
    .line 346
    .line 347
    :try_start_3
    new-instance v0, Ljava/net/URL;

    .line 348
    .line 349
    const-string v9, "https://events.gonative.io/api/events/new"

    .line 350
    .line 351
    invoke-direct {v0, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 359
    .line 360
    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, v2, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0, v7}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v6}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 370
    .line 371
    .line 372
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-direct {v1, v2, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->close()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 398
    .line 399
    .line 400
    goto :goto_8

    .line 401
    :catch_2
    move-exception v0

    .line 402
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {v1, p1, v2, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 411
    .line 412
    .line 413
    goto :goto_8

    .line 414
    :catch_3
    move-exception v0

    .line 415
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-virtual {v1, p1, v2, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 424
    .line 425
    .line 426
    :goto_8
    return-object v5

    .line 427
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    :array_0
    .array-data 1
        -0x15t
        0x29t
        0xdt
        -0x3et
        0x71t
        0x1dt
        -0x7t
        0x30t
        0x1at
        -0x61t
        0x4t
        0x7dt
        -0x6bt
        0x4t
        -0x50t
        0x73t
        0x1at
        -0x7ft
        0x16t
        0x32t
        -0x27t
        -0x21t
        0x60t
        -0x69t
        0x19t
        -0x2et
        0x7bt
        -0x3et
        -0x5at
        0x6dt
        -0x21t
        0x3at
        0x47t
        -0x64t
        -0x6bt
        0x38t
        -0x14t
        -0x10t
        -0x5t
        0x74t
    .end array-data

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    :array_1
    .array-data 1
        -0x7dt
        0x5dt
        0x79t
        -0x4et
        0x2t
        0x27t
        -0x2at
        0x1ft
        0x76t
        -0xat
        0x67t
        0x18t
        -0x5t
        0x77t
        -0x2bt
        0x5dt
        0x7dt
        -0x12t
        0x78t
        0x53t
        -0x53t
        -0x4at
        0x16t
        -0xet
        0x37t
        -0x45t
        0x14t
        -0x13t
        -0x36t
        0x4t
        -0x44t
        0x5ft
        0x29t
        -0x11t
        -0x10t
        0x5bt
        -0x7ct
        -0x6bt
        -0x68t
        0x1ft
    .end array-data
.end method

.method public onPostExecute(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lu1/h;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super/range {p0 .. p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v1, v0, Lu1/h;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lx1/a;

    .line 15
    .line 16
    iget-object v2, v1, Lx1/a;->a:Landroid/content/Context;

    .line 17
    .line 18
    iget-object v3, v1, Lx1/a;->e1:Ljava/util/HashMap;

    .line 19
    .line 20
    iget-object v4, v1, Lx1/a;->T:Lx1/f;

    .line 21
    .line 22
    iget-object v5, v1, Lx1/a;->U:Lx1/f;

    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    check-cast v6, Lorg/json/JSONObject;

    .line 27
    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :cond_0
    const-string v7, "isLicensed"

    .line 33
    .line 34
    const/4 v8, 0x1

    .line 35
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    const-string v9, "splashPageConfig"

    .line 40
    .line 41
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    const-string v10, "widgetConfig"

    .line 46
    .line 47
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    if-eqz v10, :cond_1

    .line 52
    .line 53
    new-instance v11, Lz1/g;

    .line 54
    .line 55
    invoke-direct {v11, v10}, Lz1/g;-><init>(Lorg/json/JSONObject;)V

    .line 56
    .line 57
    .line 58
    iput-object v11, v1, Lx1/a;->j1:Lz1/g;

    .line 59
    .line 60
    :cond_1
    const-string v10, "splashPageUrl"

    .line 61
    .line 62
    const-string v11, "splashpage.json"

    .line 63
    .line 64
    if-eqz v7, :cond_3

    .line 65
    .line 66
    if-nez v9, :cond_2

    .line 67
    .line 68
    invoke-virtual {v1, v11}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    if-eqz v12, :cond_3

    .line 73
    .line 74
    invoke-virtual {v12, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    if-eqz v12, :cond_3

    .line 79
    .line 80
    iput-object v3, v1, Lx1/a;->V:Ljava/util/HashMap;

    .line 81
    .line 82
    invoke-virtual {v1, v11}, Lx1/a;->j(Ljava/lang/String;)Ljava/io/File;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    invoke-virtual {v12}, Ljava/io/File;->delete()Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    invoke-static {v1, v9}, Lx1/a;->b(Lx1/a;Lorg/json/JSONObject;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_0
    const-string v12, "isLicensedForPush"

    .line 94
    .line 95
    invoke-virtual {v6, v12, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    const-string v13, "isPublished"

    .line 100
    .line 101
    const/4 v14, 0x0

    .line 102
    invoke-virtual {v6, v13, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    iput-boolean v13, v1, Lx1/a;->c1:Z

    .line 107
    .line 108
    const-string v13, "alert"

    .line 109
    .line 110
    const/4 v15, 0x0

    .line 111
    invoke-static {v6, v13, v15}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    if-eqz v13, :cond_6

    .line 116
    .line 117
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v16

    .line 121
    if-nez v16, :cond_6

    .line 122
    .line 123
    if-nez v7, :cond_5

    .line 124
    .line 125
    iget-boolean v15, v1, Lx1/a;->c1:Z

    .line 126
    .line 127
    if-eqz v15, :cond_5

    .line 128
    .line 129
    invoke-virtual {v1, v11}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    if-eqz v15, :cond_4

    .line 134
    .line 135
    invoke-virtual {v15, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-nez v10, :cond_6

    .line 140
    .line 141
    :cond_4
    invoke-static {v2, v13, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_5
    invoke-static {v2, v13, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 154
    .line 155
    .line 156
    :cond_6
    :goto_1
    if-nez v7, :cond_7

    .line 157
    .line 158
    move v12, v14

    .line 159
    :cond_7
    if-nez v7, :cond_f

    .line 160
    .line 161
    iget-boolean v2, v1, Lx1/a;->a1:Z

    .line 162
    .line 163
    if-eqz v2, :cond_f

    .line 164
    .line 165
    iput-boolean v14, v1, Lx1/a;->a1:Z

    .line 166
    .line 167
    iget-boolean v2, v1, Lx1/a;->c1:Z

    .line 168
    .line 169
    if-eqz v2, :cond_8

    .line 170
    .line 171
    if-eqz v9, :cond_f

    .line 172
    .line 173
    invoke-static {v1, v9}, Lx1/a;->b(Lx1/a;Lorg/json/JSONObject;)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_6

    .line 177
    .line 178
    :cond_8
    invoke-virtual {v1, v11}, Lx1/a;->j(Ljava/lang/String;)Ljava/io/File;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 183
    .line 184
    .line 185
    const-string v2, "unlicensedUrl"

    .line 186
    .line 187
    invoke-static {v2, v6}, Lt2/i;->G(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    if-nez v2, :cond_9

    .line 192
    .line 193
    const-string v2, "https://gonative.io/unlicensed"

    .line 194
    .line 195
    :cond_9
    const-string v9, "unlicensedLabel"

    .line 196
    .line 197
    invoke-static {v9, v6}, Lt2/i;->G(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    if-nez v9, :cond_a

    .line 202
    .line 203
    const-string v9, "Disabled"

    .line 204
    .line 205
    :cond_a
    iget-object v10, v1, Lx1/a;->d:Ljava/lang/String;

    .line 206
    .line 207
    iput-object v10, v1, Lx1/a;->e:Ljava/lang/String;

    .line 208
    .line 209
    iput-object v2, v1, Lx1/a;->d:Ljava/lang/String;

    .line 210
    .line 211
    const-string v10, "disableRedirects"

    .line 212
    .line 213
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    if-eqz v10, :cond_b

    .line 218
    .line 219
    const/4 v10, 0x0

    .line 220
    iput-object v10, v1, Lx1/a;->V:Ljava/util/HashMap;

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_b
    new-instance v10, Ljava/util/HashMap;

    .line 224
    .line 225
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object v10, v1, Lx1/a;->V:Ljava/util/HashMap;

    .line 229
    .line 230
    const-string v11, "*"

    .line 231
    .line 232
    invoke-virtual {v10, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    :goto_2
    iget-object v10, v4, Lx1/f;->a:Ljava/util/ArrayList;

    .line 236
    .line 237
    iput-object v10, v1, Lx1/a;->f1:Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 240
    .line 241
    .line 242
    const-string v10, "regexInternalExternalRules"

    .line 243
    .line 244
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    if-eqz v6, :cond_c

    .line 249
    .line 250
    invoke-virtual {v1, v6}, Lx1/a;->l(Lorg/json/JSONArray;)V

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_c
    new-instance v6, Lx1/l;

    .line 255
    .line 256
    const-string v10, ".*"

    .line 257
    .line 258
    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    const-string v11, "internal"

    .line 263
    .line 264
    invoke-direct {v6, v11, v10}, Lx1/l;-><init>(Ljava/lang/String;Ljava/util/regex/Pattern;)V

    .line 265
    .line 266
    .line 267
    iget-object v10, v4, Lx1/f;->a:Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    :goto_3
    new-instance v6, Ljava/util/HashMap;

    .line 273
    .line 274
    iget-object v10, v1, Lx1/a;->G:Ljava/util/HashMap;

    .line 275
    .line 276
    invoke-direct {v6, v10}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 277
    .line 278
    .line 279
    iput-object v6, v1, Lx1/a;->g1:Ljava/util/HashMap;

    .line 280
    .line 281
    iget-object v6, v1, Lx1/a;->G:Ljava/util/HashMap;

    .line 282
    .line 283
    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    :catch_0
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    const-string v11, "label"

    .line 296
    .line 297
    const-string v13, "url"

    .line 298
    .line 299
    if-eqz v10, :cond_d

    .line 300
    .line 301
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    check-cast v10, Ljava/lang/String;

    .line 306
    .line 307
    :try_start_0
    new-instance v15, Lorg/json/JSONObject;

    .line 308
    .line 309
    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v15, v13, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v15, v11, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 316
    .line 317
    .line 318
    new-instance v11, Lorg/json/JSONArray;

    .line 319
    .line 320
    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v11, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 324
    .line 325
    .line 326
    iget-object v13, v1, Lx1/a;->G:Ljava/util/HashMap;

    .line 327
    .line 328
    invoke-virtual {v13, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 329
    .line 330
    .line 331
    goto :goto_4

    .line 332
    :cond_d
    new-instance v6, Ljava/util/HashMap;

    .line 333
    .line 334
    iget-object v10, v1, Lx1/a;->Y:Ljava/util/HashMap;

    .line 335
    .line 336
    invoke-direct {v6, v10}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 337
    .line 338
    .line 339
    iput-object v6, v1, Lx1/a;->h1:Ljava/util/HashMap;

    .line 340
    .line 341
    iget-object v6, v1, Lx1/a;->Y:Ljava/util/HashMap;

    .line 342
    .line 343
    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v10

    .line 355
    if-eqz v10, :cond_e

    .line 356
    .line 357
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    check-cast v10, Ljava/lang/String;

    .line 362
    .line 363
    :try_start_1
    new-instance v15, Lorg/json/JSONObject;

    .line 364
    .line 365
    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v15, v13, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v15, v11, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 372
    .line 373
    .line 374
    const-string v8, "icon"

    .line 375
    .line 376
    const-string v14, "fa-ban"

    .line 377
    .line 378
    invoke-virtual {v15, v8, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 379
    .line 380
    .line 381
    new-instance v8, Lorg/json/JSONArray;

    .line 382
    .line 383
    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v8, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 387
    .line 388
    .line 389
    iget-object v14, v1, Lx1/a;->Y:Ljava/util/HashMap;

    .line 390
    .line 391
    invoke-virtual {v14, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 392
    .line 393
    .line 394
    :catch_1
    const/4 v8, 0x1

    .line 395
    const/4 v14, 0x0

    .line 396
    goto :goto_5

    .line 397
    :cond_e
    invoke-virtual {v5}, Lx1/f;->f()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v5}, Lx1/f;->g()V

    .line 401
    .line 402
    .line 403
    :cond_f
    :goto_6
    if-nez v12, :cond_10

    .line 404
    .line 405
    iget-boolean v2, v1, Lx1/a;->b1:Z

    .line 406
    .line 407
    if-eqz v2, :cond_10

    .line 408
    .line 409
    const/4 v2, 0x0

    .line 410
    iput-boolean v2, v1, Lx1/a;->b1:Z

    .line 411
    .line 412
    iget-boolean v6, v1, Lx1/a;->K0:Z

    .line 413
    .line 414
    iput-boolean v6, v1, Lx1/a;->i1:Z

    .line 415
    .line 416
    iput-boolean v2, v1, Lx1/a;->K0:Z

    .line 417
    .line 418
    :cond_10
    if-eqz v7, :cond_11

    .line 419
    .line 420
    iget-boolean v2, v1, Lx1/a;->a1:Z

    .line 421
    .line 422
    if-nez v2, :cond_11

    .line 423
    .line 424
    const/4 v2, 0x1

    .line 425
    iput-boolean v2, v1, Lx1/a;->a1:Z

    .line 426
    .line 427
    iget-object v2, v1, Lx1/a;->e:Ljava/lang/String;

    .line 428
    .line 429
    iput-object v2, v1, Lx1/a;->d:Ljava/lang/String;

    .line 430
    .line 431
    iput-object v3, v1, Lx1/a;->V:Ljava/util/HashMap;

    .line 432
    .line 433
    iget-object v2, v1, Lx1/a;->f1:Ljava/util/ArrayList;

    .line 434
    .line 435
    iput-object v2, v4, Lx1/f;->a:Ljava/util/ArrayList;

    .line 436
    .line 437
    iget-object v2, v1, Lx1/a;->g1:Ljava/util/HashMap;

    .line 438
    .line 439
    iput-object v2, v1, Lx1/a;->G:Ljava/util/HashMap;

    .line 440
    .line 441
    iget-object v2, v1, Lx1/a;->h1:Ljava/util/HashMap;

    .line 442
    .line 443
    iput-object v2, v1, Lx1/a;->Y:Ljava/util/HashMap;

    .line 444
    .line 445
    invoke-virtual {v5}, Lx1/f;->f()V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v5}, Lx1/f;->g()V

    .line 449
    .line 450
    .line 451
    :cond_11
    if-eqz v12, :cond_12

    .line 452
    .line 453
    iget-boolean v2, v1, Lx1/a;->b1:Z

    .line 454
    .line 455
    if-nez v2, :cond_12

    .line 456
    .line 457
    const/4 v2, 0x1

    .line 458
    iput-boolean v2, v1, Lx1/a;->b1:Z

    .line 459
    .line 460
    iget-boolean v2, v1, Lx1/a;->i1:Z

    .line 461
    .line 462
    iput-boolean v2, v1, Lx1/a;->K0:Z

    .line 463
    .line 464
    :cond_12
    :goto_7
    return-void

    .line 465
    :pswitch_1
    move-object/from16 v1, p1

    .line 466
    .line 467
    check-cast v1, Ljava/lang/String;

    .line 468
    .line 469
    iget-object v2, v0, Lu1/h;->b:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 472
    .line 473
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    check-cast v2, Lu1/s0;

    .line 478
    .line 479
    if-nez v2, :cond_13

    .line 480
    .line 481
    goto :goto_9

    .line 482
    :cond_13
    invoke-static {}, Landroidx/emoji2/text/p;->l()Landroidx/emoji2/text/p;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-virtual {v3, v1}, Landroidx/emoji2/text/p;->o(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    const/4 v3, 0x0

    .line 490
    if-nez v1, :cond_14

    .line 491
    .line 492
    iput-boolean v3, v2, Lu1/s0;->c:Z

    .line 493
    .line 494
    invoke-static {v2}, Lu1/s0;->a(Lu1/s0;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2}, Ljava/util/Observable;->notifyObservers()V

    .line 498
    .line 499
    .line 500
    goto :goto_9

    .line 501
    :cond_14
    iget-object v4, v2, Lu1/s0;->a:Lco/median/android/GoNativeApplication;

    .line 502
    .line 503
    invoke-static {v4}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    iget-object v5, v4, Lx1/a;->N:Ljava/util/ArrayList;

    .line 508
    .line 509
    move v6, v3

    .line 510
    :goto_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 511
    .line 512
    .line 513
    move-result v7

    .line 514
    if-ge v6, v7, :cond_16

    .line 515
    .line 516
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v7

    .line 520
    check-cast v7, Ljava/util/regex/Pattern;

    .line 521
    .line 522
    invoke-virtual {v7, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 523
    .line 524
    .line 525
    move-result-object v7

    .line 526
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 527
    .line 528
    .line 529
    move-result v7

    .line 530
    if-eqz v7, :cond_15

    .line 531
    .line 532
    iget-object v1, v4, Lx1/a;->O:Ljava/util/ArrayList;

    .line 533
    .line 534
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    check-cast v1, Lorg/json/JSONObject;

    .line 539
    .line 540
    const-string v4, "loggedIn"

    .line 541
    .line 542
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 543
    .line 544
    .line 545
    move-result v3

    .line 546
    iput-boolean v3, v2, Lu1/s0;->c:Z

    .line 547
    .line 548
    const-string v3, "menuName"

    .line 549
    .line 550
    const/4 v4, 0x0

    .line 551
    invoke-static {v1, v3, v4}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    invoke-static {v2}, Lu1/s0;->b(Lu1/s0;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2}, Ljava/util/Observable;->notifyObservers()V

    .line 558
    .line 559
    .line 560
    goto :goto_9

    .line 561
    :cond_15
    add-int/lit8 v6, v6, 0x1

    .line 562
    .line 563
    goto :goto_8

    .line 564
    :cond_16
    :goto_9
    return-void

    .line 565
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
