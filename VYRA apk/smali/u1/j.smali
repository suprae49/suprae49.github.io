.class public final synthetic Lu1/j;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lu1/k;


# direct methods
.method public synthetic constructor <init>(Lu1/k;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu1/j;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lu1/j;->g:Lu1/k;

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
    .locals 15

    .line 1
    iget v0, p0, Lu1/j;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/j;->g:Lu1/k;

    .line 7
    .line 8
    iget-object v0, v0, Lu1/k;->r:Lco/median/android/DownloadService;

    .line 9
    .line 10
    const v1, 0x7f110069

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v1, p0, Lu1/j;->g:Lu1/k;

    .line 27
    .line 28
    iget-object v0, v1, Lu1/k;->r:Lco/median/android/DownloadService;

    .line 29
    .line 30
    iget-object v2, v1, Lu1/k;->o:Landroidx/emoji2/text/p;

    .line 31
    .line 32
    iget-object v3, v2, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ljava/lang/String;

    .line 35
    .line 36
    iget-object v2, v2, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lu1/o;

    .line 39
    .line 40
    const-string v4, "Failed to create download file. filename = "

    .line 41
    .line 42
    const-string v5, "Unexpected error occurred: "

    .line 43
    .line 44
    const-string v6, "Unsupported URI scheme: "

    .line 45
    .line 46
    const-string v7, "DownloadService"

    .line 47
    .line 48
    const-string v8, "startDownload: Thread started"

    .line 49
    .line 50
    invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    :try_start_0
    iget-object v9, v1, Lu1/k;->b:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    const v12, 0x2eefaa

    .line 73
    .line 74
    .line 75
    if-eq v11, v12, :cond_2

    .line 76
    .line 77
    const v12, 0x310888    # 4.503E-39f

    .line 78
    .line 79
    .line 80
    if-eq v11, v12, :cond_1

    .line 81
    .line 82
    const v12, 0x5f008eb

    .line 83
    .line 84
    .line 85
    if-eq v11, v12, :cond_0

    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :cond_0
    const-string v11, "https"

    .line 90
    .line 91
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-eqz v10, :cond_7

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    goto/16 :goto_7

    .line 100
    .line 101
    :catch_0
    move-exception v0

    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_1
    const-string v11, "http"

    .line 105
    .line 106
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-eqz v10, :cond_7

    .line 111
    .line 112
    :goto_0
    invoke-virtual {v1}, Lu1/k;->c()V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    const-string v11, "data"

    .line 117
    .line 118
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    if-eqz v10, :cond_7

    .line 123
    .line 124
    invoke-virtual {v1}, Lu1/k;->b()V

    .line 125
    .line 126
    .line 127
    :goto_1
    const/4 v6, 0x1

    .line 128
    iput-boolean v6, v1, Lu1/k;->q:Z

    .line 129
    .line 130
    iput-boolean v8, v1, Lu1/k;->c:Z

    .line 131
    .line 132
    iget-object v9, v1, Lu1/k;->h:Landroid/net/Uri;

    .line 133
    .line 134
    if-nez v9, :cond_3

    .line 135
    .line 136
    iget-object v9, v1, Lu1/k;->g:Ljava/io/File;

    .line 137
    .line 138
    if-eqz v9, :cond_3

    .line 139
    .line 140
    new-instance v9, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v10, ".fileprovider"

    .line 157
    .line 158
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    iget-object v10, v1, Lu1/k;->g:Ljava/io/File;

    .line 166
    .line 167
    invoke-static {v0, v9, v10}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    iput-object v9, v1, Lu1/k;->h:Landroid/net/Uri;

    .line 172
    .line 173
    :cond_3
    iget-object v9, v0, Lco/median/android/DownloadService;->g:Lu1/o;

    .line 174
    .line 175
    if-eqz v9, :cond_4

    .line 176
    .line 177
    iget-object v10, v1, Lu1/k;->h:Landroid/net/Uri;

    .line 178
    .line 179
    iget-object v11, v1, Lu1/k;->k:Ljava/lang/String;

    .line 180
    .line 181
    iget-boolean v12, v1, Lu1/k;->l:Z

    .line 182
    .line 183
    iget-boolean v13, v1, Lu1/k;->m:Z

    .line 184
    .line 185
    iget-object v0, v1, Lu1/k;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    move-object v14, v0

    .line 192
    check-cast v14, Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual/range {v9 .. v14}, Lu1/o;->f(Landroid/net/Uri;Ljava/lang/String;ZZLjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_4
    iget-object v0, v2, Lu1/o;->a:Lco/median/android/MainActivity;

    .line 198
    .line 199
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 200
    .line 201
    .line 202
    move-result v9
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    if-eqz v9, :cond_5

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_5
    :try_start_1
    new-instance v9, Lorg/json/JSONObject;

    .line 207
    .line 208
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 209
    .line 210
    .line 211
    const-string v10, "success"

    .line 212
    .line 213
    invoke-virtual {v9, v10, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 214
    .line 215
    .line 216
    new-instance v6, Landroidx/emoji2/text/l;

    .line 217
    .line 218
    const/4 v10, 0x1

    .line 219
    invoke-direct {v6, v0, v3, v9, v10}, Landroidx/emoji2/text/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v6}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 223
    .line 224
    .line 225
    :catch_1
    :goto_2
    iget-boolean v0, v1, Lu1/k;->q:Z

    .line 226
    .line 227
    if-nez v0, :cond_6

    .line 228
    .line 229
    iget-object v0, v1, Lu1/k;->g:Ljava/io/File;

    .line 230
    .line 231
    if-eqz v0, :cond_6

    .line 232
    .line 233
    :goto_3
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 234
    .line 235
    .line 236
    :cond_6
    iput-boolean v8, v1, Lu1/k;->c:Z

    .line 237
    .line 238
    iput-object v7, v1, Lu1/k;->g:Ljava/io/File;

    .line 239
    .line 240
    iput-boolean v8, v1, Lu1/k;->q:Z

    .line 241
    .line 242
    invoke-virtual {v1}, Lu1/k;->a()V

    .line 243
    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_7
    :goto_4
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget-object v6, v2, Lu1/o;->a:Lco/median/android/MainActivity;

    .line 263
    .line 264
    invoke-static {v6, v3, v0}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 265
    .line 266
    .line 267
    iget-boolean v0, v1, Lu1/k;->q:Z

    .line 268
    .line 269
    if-nez v0, :cond_6

    .line 270
    .line 271
    iget-object v0, v1, Lu1/k;->g:Ljava/io/File;

    .line 272
    .line 273
    if-eqz v0, :cond_6

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :goto_5
    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    iget-object v2, v2, Lu1/o;->a:Lco/median/android/MainActivity;

    .line 293
    .line 294
    invoke-static {v2, v3, v0}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 295
    .line 296
    .line 297
    iget-boolean v0, v1, Lu1/k;->q:Z

    .line 298
    .line 299
    if-nez v0, :cond_6

    .line 300
    .line 301
    iget-object v0, v1, Lu1/k;->g:Ljava/io/File;

    .line 302
    .line 303
    if-eqz v0, :cond_6

    .line 304
    .line 305
    goto :goto_3

    .line 306
    :catch_2
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    iget-object v4, v1, Lu1/k;->i:Ljava/lang/String;

    .line 312
    .line 313
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string v4, ", mimetype = "

    .line 317
    .line 318
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    iget-object v4, v1, Lu1/k;->k:Ljava/lang/String;

    .line 322
    .line 323
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    const-string v4, "."

    .line 327
    .line 328
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    iget-object v2, v2, Lu1/o;->a:Lco/median/android/MainActivity;

    .line 336
    .line 337
    invoke-static {v2, v3, v0}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 338
    .line 339
    .line 340
    iget-boolean v0, v1, Lu1/k;->q:Z

    .line 341
    .line 342
    if-nez v0, :cond_6

    .line 343
    .line 344
    iget-object v0, v1, Lu1/k;->g:Ljava/io/File;

    .line 345
    .line 346
    if-eqz v0, :cond_6

    .line 347
    .line 348
    goto :goto_3

    .line 349
    :goto_6
    return-void

    .line 350
    :goto_7
    iget-boolean v2, v1, Lu1/k;->q:Z

    .line 351
    .line 352
    if-nez v2, :cond_8

    .line 353
    .line 354
    iget-object v2, v1, Lu1/k;->g:Ljava/io/File;

    .line 355
    .line 356
    if-eqz v2, :cond_8

    .line 357
    .line 358
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 359
    .line 360
    .line 361
    :cond_8
    iput-boolean v8, v1, Lu1/k;->c:Z

    .line 362
    .line 363
    iput-object v7, v1, Lu1/k;->g:Ljava/io/File;

    .line 364
    .line 365
    iput-boolean v8, v1, Lu1/k;->q:Z

    .line 366
    .line 367
    invoke-virtual {v1}, Lu1/k;->a()V

    .line 368
    .line 369
    .line 370
    throw v0

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
