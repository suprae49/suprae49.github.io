.class public final Lu1/p;
.super Lc/a;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public a:Landroidx/fragment/app/e0;

.field public b:Lz1/a;

.field public c:Landroid/net/Uri;

.field public d:Landroid/net/Uri;

.field public e:Ljava/util/List;

.field public f:Lu1/r;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z


# direct methods
.method public static h(Landroid/net/Uri;Landroidx/fragment/app/e0;)Z
    .locals 9

    .line 1
    const-string v0, "_size"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    filled-new-array {v0}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v4, p0

    .line 17
    :try_start_1
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    :try_start_2
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-ltz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    const-wide/16 v7, 0x0

    .line 40
    .line 41
    cmp-long v0, v5, v7

    .line 42
    .line 43
    if-lez v0, :cond_0

    .line 44
    .line 45
    move v0, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v0, v2

    .line 48
    :goto_0
    :try_start_3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object v3, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :goto_1
    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    :try_start_5
    invoke-static {p0, v3}, Le4/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 65
    :catch_0
    move-object v4, p0

    .line 66
    :catch_1
    :cond_2
    :goto_2
    move v0, v2

    .line 67
    :goto_3
    if-nez v0, :cond_7

    .line 68
    .line 69
    :try_start_6
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0, v4}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 74
    .line 75
    .line 76
    move-result-object p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 77
    if-eqz p0, :cond_5

    .line 78
    .line 79
    const/16 p1, 0x400

    .line 80
    .line 81
    :try_start_7
    new-array p1, p1, [B

    .line 82
    .line 83
    :cond_3
    invoke-virtual {p0, p1}, Ljava/io/InputStream;->read([B)I

    .line 84
    .line 85
    .line 86
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 87
    const/4 v3, -0x1

    .line 88
    if-eq v0, v3, :cond_4

    .line 89
    .line 90
    if-lez v0, :cond_3

    .line 91
    .line 92
    :try_start_8
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 93
    .line 94
    .line 95
    move p0, v1

    .line 96
    goto :goto_5

    .line 97
    :cond_4
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :catchall_2
    move-exception v0

    .line 102
    move-object p1, v0

    .line 103
    :try_start_9
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 104
    :catchall_3
    move-exception v0

    .line 105
    :try_start_a
    invoke-static {p0, p1}, Le4/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    throw v0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2

    .line 109
    :catch_2
    :cond_5
    :goto_4
    move p0, v2

    .line 110
    :goto_5
    if-eqz p0, :cond_6

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_6
    move v1, v2

    .line 114
    :cond_7
    :goto_6
    return v1
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/e0;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 13

    .line 1
    check-cast p2, Lu1/r;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 7
    .line 8
    iput-object p2, p0, Lu1/p;->f:Lu1/r;

    .line 9
    .line 10
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p1, Lx1/a;->o1:Lz1/a;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lu1/p;->b:Lz1/a;

    .line 20
    .line 21
    iget-boolean p1, p1, Lx1/a;->p:Z

    .line 22
    .line 23
    iput-boolean p1, p0, Lu1/p;->j:Z

    .line 24
    .line 25
    iget-boolean p1, p2, Lu1/r;->c:Z

    .line 26
    .line 27
    iput-boolean p1, p0, Lu1/p;->i:Z

    .line 28
    .line 29
    iget-boolean p1, p2, Lu1/r;->d:Z

    .line 30
    .line 31
    iput-boolean p1, p0, Lu1/p;->h:Z

    .line 32
    .line 33
    iget-object p1, p2, Lu1/r;->b:Ljava/util/List;

    .line 34
    .line 35
    iput-object p1, p0, Lu1/p;->e:Ljava/util/List;

    .line 36
    .line 37
    iget-object p1, p2, Lu1/r;->a:Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    const/4 v0, 0x1

    .line 44
    if-ne p2, v0, :cond_0

    .line 45
    .line 46
    iput-boolean v0, p0, Lu1/p;->g:Z

    .line 47
    .line 48
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    const-string p2, "List is empty."

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Lu1/p;->g()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0}, Lu1/p;->j()Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {p0}, Lu1/p;->k()Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_2

    .line 77
    .line 78
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Landroid/content/Intent;

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 86
    .line 87
    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lu1/p;->g()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    invoke-virtual {p0}, Lu1/p;->j()Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 107
    .line 108
    .line 109
    :cond_4
    iget-boolean v2, p0, Lu1/p;->i:Z

    .line 110
    .line 111
    if-nez v2, :cond_5

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_5
    iget-object v2, p0, Lu1/p;->f:Lu1/r;

    .line 115
    .line 116
    if-eqz v2, :cond_6

    .line 117
    .line 118
    invoke-virtual {v2}, Lu1/r;->b()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    goto :goto_2

    .line 123
    :cond_6
    :goto_1
    move v2, v1

    .line 124
    :goto_2
    if-eqz v2, :cond_7

    .line 125
    .line 126
    invoke-virtual {p0}, Lu1/p;->k()Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 131
    .line 132
    .line 133
    :cond_7
    invoke-virtual {p0}, Lu1/p;->g()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    iget-boolean v3, p0, Lu1/p;->i:Z

    .line 138
    .line 139
    if-nez v3, :cond_8

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_8
    iget-object v3, p0, Lu1/p;->f:Lu1/r;

    .line 143
    .line 144
    if-eqz v3, :cond_9

    .line 145
    .line 146
    invoke-virtual {v3}, Lu1/r;->b()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    goto :goto_4

    .line 151
    :cond_9
    :goto_3
    move v3, v1

    .line 152
    :goto_4
    xor-int/2addr v2, v3

    .line 153
    const/4 v3, 0x0

    .line 154
    const v4, 0x7f11003f

    .line 155
    .line 156
    .line 157
    const-string v5, "context"

    .line 158
    .line 159
    const-string v6, "android.intent.extra.ALLOW_MULTIPLE"

    .line 160
    .line 161
    const-string v7, "android.intent.action.PICK"

    .line 162
    .line 163
    if-eqz v2, :cond_c

    .line 164
    .line 165
    invoke-virtual {p0}, Lu1/p;->g()Z

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-eqz p2, :cond_a

    .line 170
    .line 171
    new-instance p2, Landroid/content/Intent;

    .line 172
    .line 173
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 174
    .line 175
    invoke-direct {p2, v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_a
    new-instance p2, Landroid/content/Intent;

    .line 180
    .line 181
    sget-object v0, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 182
    .line 183
    invoke-direct {p2, v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 184
    .line 185
    .line 186
    :goto_5
    iget-boolean v0, p0, Lu1/p;->g:Z

    .line 187
    .line 188
    invoke-virtual {p2, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 192
    .line 193
    if-eqz v0, :cond_b

    .line 194
    .line 195
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {p2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    goto/16 :goto_e

    .line 204
    .line 205
    :cond_b
    invoke-static {v5}, Lr3/g;->c(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v3

    .line 209
    :cond_c
    iget-object v2, p0, Lu1/p;->f:Lu1/r;

    .line 210
    .line 211
    const-string v8, "android.intent.extra.MIME_TYPES"

    .line 212
    .line 213
    if-eqz v2, :cond_13

    .line 214
    .line 215
    iget-object v2, v2, Lu1/r;->b:Ljava/util/List;

    .line 216
    .line 217
    if-eqz v2, :cond_d

    .line 218
    .line 219
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    if-eqz v9, :cond_d

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_d
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    :cond_e
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    if-eqz v9, :cond_f

    .line 235
    .line 236
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    check-cast v9, Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    const-string v10, "image/"

    .line 246
    .line 247
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    if-nez v10, :cond_e

    .line 252
    .line 253
    const-string v10, "video/"

    .line 254
    .line 255
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    if-eqz v9, :cond_13

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_f
    :goto_7
    new-instance v2, Landroid/content/Intent;

    .line 263
    .line 264
    sget-object v9, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 265
    .line 266
    invoke-direct {v2, v7, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, v2}, Lu1/p;->i(Landroid/content/Intent;)Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    if-ne v10, v0, :cond_11

    .line 278
    .line 279
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-nez v0, :cond_10

    .line 284
    .line 285
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    check-cast p2, Landroid/content/pm/ResolveInfo;

    .line 290
    .line 291
    iget-object p2, p2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 292
    .line 293
    iget-object p2, p2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 294
    .line 295
    const-string v0, "com.google.android.apps.photos"

    .line 296
    .line 297
    invoke-static {p2, v0}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result p2

    .line 301
    if-eqz p2, :cond_11

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_10
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 305
    .line 306
    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw p1

    .line 310
    :cond_11
    new-instance p2, Landroid/content/Intent;

    .line 311
    .line 312
    invoke-direct {p2, v7, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 313
    .line 314
    .line 315
    const-string v0, "image/*, video/*"

    .line 316
    .line 317
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 318
    .line 319
    .line 320
    const-string v0, "image/*"

    .line 321
    .line 322
    const-string v2, "video/*"

    .line 323
    .line 324
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-virtual {p2, v8, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 329
    .line 330
    .line 331
    iget-boolean v0, p0, Lu1/p;->g:Z

    .line 332
    .line 333
    invoke-virtual {p2, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 334
    .line 335
    .line 336
    iget-object v0, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 337
    .line 338
    if-eqz v0, :cond_12

    .line 339
    .line 340
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-static {p2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 345
    .line 346
    .line 347
    move-result-object p2

    .line 348
    goto/16 :goto_e

    .line 349
    .line 350
    :cond_12
    invoke-static {v5}, Lr3/g;->c(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v3

    .line 354
    :cond_13
    :goto_8
    new-instance p2, Landroid/content/Intent;

    .line 355
    .line 356
    const-string v0, "android.intent.action.GET_CONTENT"

    .line 357
    .line 358
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    iget-object v0, p0, Lu1/p;->e:Ljava/util/List;

    .line 362
    .line 363
    const/16 v2, 0x3e

    .line 364
    .line 365
    and-int/lit8 v7, v2, 0x2

    .line 366
    .line 367
    const-string v9, ""

    .line 368
    .line 369
    if-eqz v7, :cond_14

    .line 370
    .line 371
    move-object v7, v9

    .line 372
    goto :goto_9

    .line 373
    :cond_14
    const-string v7, "["

    .line 374
    .line 375
    :goto_9
    and-int/lit8 v2, v2, 0x4

    .line 376
    .line 377
    if-eqz v2, :cond_15

    .line 378
    .line 379
    goto :goto_a

    .line 380
    :cond_15
    const-string v9, "]"

    .line 381
    .line 382
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    new-instance v2, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 391
    .line 392
    .line 393
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    const/4 v7, 0x0

    .line 398
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v10

    .line 402
    if-eqz v10, :cond_1a

    .line 403
    .line 404
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    const/4 v11, 0x1

    .line 409
    add-int/2addr v7, v11

    .line 410
    if-le v7, v11, :cond_16

    .line 411
    .line 412
    const-string v12, ", "

    .line 413
    .line 414
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 415
    .line 416
    .line 417
    :cond_16
    if-nez v10, :cond_17

    .line 418
    .line 419
    goto :goto_c

    .line 420
    :cond_17
    instance-of v11, v10, Ljava/lang/CharSequence;

    .line 421
    .line 422
    :goto_c
    if-eqz v11, :cond_18

    .line 423
    .line 424
    check-cast v10, Ljava/lang/CharSequence;

    .line 425
    .line 426
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 427
    .line 428
    .line 429
    goto :goto_b

    .line 430
    :cond_18
    instance-of v11, v10, Ljava/lang/Character;

    .line 431
    .line 432
    if-eqz v11, :cond_19

    .line 433
    .line 434
    check-cast v10, Ljava/lang/Character;

    .line 435
    .line 436
    invoke-virtual {v10}, Ljava/lang/Character;->charValue()C

    .line 437
    .line 438
    .line 439
    move-result v10

    .line 440
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 441
    .line 442
    .line 443
    goto :goto_b

    .line 444
    :cond_19
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 449
    .line 450
    .line 451
    goto :goto_b

    .line 452
    :cond_1a
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 460
    .line 461
    .line 462
    iget-object v0, p0, Lu1/p;->e:Ljava/util/List;

    .line 463
    .line 464
    new-array v2, v1, [Ljava/lang/String;

    .line 465
    .line 466
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    check-cast v0, [Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {p2, v8, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 473
    .line 474
    .line 475
    iget-boolean v0, p0, Lu1/p;->g:Z

    .line 476
    .line 477
    invoke-virtual {p2, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 478
    .line 479
    .line 480
    const-string v0, "android.intent.category.OPENABLE"

    .line 481
    .line 482
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 483
    .line 484
    .line 485
    invoke-virtual {p0, p2}, Lu1/p;->i(Landroid/content/Intent;)Ljava/util/List;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-eqz v0, :cond_1c

    .line 494
    .line 495
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 496
    .line 497
    if-nez v0, :cond_1b

    .line 498
    .line 499
    move v0, v1

    .line 500
    goto :goto_d

    .line 501
    :cond_1b
    const-string v2, "samsung"

    .line 502
    .line 503
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    :goto_d
    if-eqz v0, :cond_1c

    .line 508
    .line 509
    new-instance p2, Landroid/content/Intent;

    .line 510
    .line 511
    const-string v0, "com.sec.android.app.myfiles.PICK_DATA"

    .line 512
    .line 513
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    const-string v0, "CONTENT_TYPE"

    .line 517
    .line 518
    const-string v2, "*/*"

    .line 519
    .line 520
    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 521
    .line 522
    .line 523
    const-string v0, "android.intent.category.DEFAULT"

    .line 524
    .line 525
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 526
    .line 527
    .line 528
    :cond_1c
    iget-object v0, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 529
    .line 530
    if-eqz v0, :cond_1d

    .line 531
    .line 532
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-static {p2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 537
    .line 538
    .line 539
    move-result-object p2

    .line 540
    :goto_e
    new-array v0, v1, [Landroid/os/Parcelable;

    .line 541
    .line 542
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object p1

    .line 546
    check-cast p1, [Landroid/os/Parcelable;

    .line 547
    .line 548
    const-string v0, "android.intent.extra.INITIAL_INTENTS"

    .line 549
    .line 550
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 551
    .line 552
    .line 553
    return-object p2

    .line 554
    :cond_1d
    invoke-static {v5}, Lr3/g;->c(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    throw v3
.end method

.method public final c(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lu1/p;->f()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lu1/s;

    .line 10
    .line 11
    invoke-direct {p1, v1, v2, v1}, Lu1/s;-><init>(Z[Landroid/net/Uri;Z)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    const/4 v0, 0x1

    .line 16
    const-string v3, "video"

    .line 17
    .line 18
    const-string v4, "context"

    .line 19
    .line 20
    const-string v5, "cameraConfig"

    .line 21
    .line 22
    if-eqz p2, :cond_e

    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    if-eqz v6, :cond_8

    .line 29
    .line 30
    iget-object v6, p0, Lu1/p;->d:Landroid/net/Uri;

    .line 31
    .line 32
    if-eqz v6, :cond_7

    .line 33
    .line 34
    iget-object v7, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 35
    .line 36
    if-eqz v7, :cond_6

    .line 37
    .line 38
    invoke-static {v6, v7}, Lu1/p;->h(Landroid/net/Uri;Landroidx/fragment/app/e0;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_7

    .line 43
    .line 44
    invoke-static {p1, p2}, Landroid/webkit/WebChromeClient$FileChooserParams;->parseResult(ILandroid/content/Intent;)[Landroid/net/Uri;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    aget-object v4, v4, v1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v4, v2

    .line 54
    :goto_0
    invoke-virtual {v6}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    invoke-virtual {v4}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    if-nez v4, :cond_3

    .line 65
    .line 66
    :cond_2
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 67
    .line 68
    :cond_3
    invoke-static {v7, v4}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_7

    .line 73
    .line 74
    iget-object p1, p0, Lu1/p;->b:Lz1/a;

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    iget-boolean p1, p1, Lz1/a;->b:Z

    .line 79
    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    iget-boolean p1, p0, Lu1/p;->h:Z

    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    invoke-virtual {p0, v6, v3}, Lu1/p;->d(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    :cond_4
    new-instance p1, Lu1/s;

    .line 91
    .line 92
    filled-new-array {v6}, [Landroid/net/Uri;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-direct {p1, v0, p2, v1}, Lu1/s;-><init>(Z[Landroid/net/Uri;Z)V

    .line 97
    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_5
    invoke-static {v5}, Lr3/g;->c(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v2

    .line 104
    :cond_6
    invoke-static {v4}, Lr3/g;->c(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v2

    .line 108
    :cond_7
    new-instance v2, Lu1/s;

    .line 109
    .line 110
    invoke-static {p1, p2}, Landroid/webkit/WebChromeClient$FileChooserParams;->parseResult(ILandroid/content/Intent;)[Landroid/net/Uri;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {v2, v0, p1, v1}, Lu1/s;-><init>(Z[Landroid/net/Uri;Z)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :cond_8
    invoke-virtual {p2}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-eqz p1, :cond_e

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    const/high16 v2, -0x80000000

    .line 129
    .line 130
    if-gt p2, v2, :cond_9

    .line 131
    .line 132
    sget-object p2, Lv3/b;->i:Lv3/b;

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_9
    new-instance v2, Lv3/b;

    .line 136
    .line 137
    sub-int/2addr p2, v0

    .line 138
    invoke-direct {v2, v1, p2, v0}, Lv3/b;-><init>(III)V

    .line 139
    .line 140
    .line 141
    move-object p2, v2

    .line 142
    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2}, Lv3/b;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    :cond_a
    :goto_2
    move-object v3, p2

    .line 152
    check-cast v3, Lv3/a;

    .line 153
    .line 154
    iget-boolean v4, v3, Lv3/a;->h:Z

    .line 155
    .line 156
    if-eqz v4, :cond_d

    .line 157
    .line 158
    iget v5, v3, Lv3/a;->i:I

    .line 159
    .line 160
    iget v6, v3, Lv3/a;->g:I

    .line 161
    .line 162
    if-ne v5, v6, :cond_c

    .line 163
    .line 164
    if-eqz v4, :cond_b

    .line 165
    .line 166
    iput-boolean v1, v3, Lv3/a;->h:Z

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_b
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 170
    .line 171
    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :cond_c
    iget v4, v3, Lv3/a;->f:I

    .line 176
    .line 177
    add-int/2addr v4, v5

    .line 178
    iput v4, v3, Lv3/a;->i:I

    .line 179
    .line 180
    :goto_3
    invoke-virtual {p1, v5}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v3}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    if-eqz v3, :cond_a

    .line 189
    .line 190
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_d
    new-instance p1, Lu1/s;

    .line 195
    .line 196
    new-array p2, v1, [Landroid/net/Uri;

    .line 197
    .line 198
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    check-cast p2, [Landroid/net/Uri;

    .line 203
    .line 204
    invoke-direct {p1, v0, p2, v1}, Lu1/s;-><init>(Z[Landroid/net/Uri;Z)V

    .line 205
    .line 206
    .line 207
    return-object p1

    .line 208
    :cond_e
    iget-object p1, p0, Lu1/p;->c:Landroid/net/Uri;

    .line 209
    .line 210
    if-eqz p1, :cond_14

    .line 211
    .line 212
    iget-object p2, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 213
    .line 214
    if-eqz p2, :cond_13

    .line 215
    .line 216
    invoke-static {p1, p2}, Lu1/p;->h(Landroid/net/Uri;Landroidx/fragment/app/e0;)Z

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    if-eqz p2, :cond_14

    .line 221
    .line 222
    iget-object p2, p0, Lu1/p;->b:Lz1/a;

    .line 223
    .line 224
    if-eqz p2, :cond_12

    .line 225
    .line 226
    iget-boolean p2, p2, Lz1/a;->b:Z

    .line 227
    .line 228
    if-eqz p2, :cond_f

    .line 229
    .line 230
    iget-boolean p2, p0, Lu1/p;->h:Z

    .line 231
    .line 232
    if-eqz p2, :cond_f

    .line 233
    .line 234
    const-string p2, "image"

    .line 235
    .line 236
    invoke-virtual {p0, p1, p2}, Lu1/p;->d(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    :cond_f
    iget-object p2, p0, Lu1/p;->b:Lz1/a;

    .line 241
    .line 242
    if-eqz p2, :cond_11

    .line 243
    .line 244
    iget p2, p2, Lz1/a;->a:I

    .line 245
    .line 246
    if-ne p2, v0, :cond_10

    .line 247
    .line 248
    move v1, v0

    .line 249
    :cond_10
    new-instance p2, Lu1/s;

    .line 250
    .line 251
    filled-new-array {p1}, [Landroid/net/Uri;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-direct {p2, v0, p1, v1}, Lu1/s;-><init>(Z[Landroid/net/Uri;Z)V

    .line 256
    .line 257
    .line 258
    return-object p2

    .line 259
    :cond_11
    invoke-static {v5}, Lr3/g;->c(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v2

    .line 263
    :cond_12
    invoke-static {v5}, Lr3/g;->c(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw v2

    .line 267
    :cond_13
    invoke-static {v4}, Lr3/g;->c(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v2

    .line 271
    :cond_14
    iget-object p1, p0, Lu1/p;->d:Landroid/net/Uri;

    .line 272
    .line 273
    if-eqz p1, :cond_18

    .line 274
    .line 275
    iget-object p2, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 276
    .line 277
    if-eqz p2, :cond_17

    .line 278
    .line 279
    invoke-static {p1, p2}, Lu1/p;->h(Landroid/net/Uri;Landroidx/fragment/app/e0;)Z

    .line 280
    .line 281
    .line 282
    move-result p2

    .line 283
    if-eqz p2, :cond_18

    .line 284
    .line 285
    iget-object p2, p0, Lu1/p;->b:Lz1/a;

    .line 286
    .line 287
    if-eqz p2, :cond_16

    .line 288
    .line 289
    iget-boolean p2, p2, Lz1/a;->b:Z

    .line 290
    .line 291
    if-eqz p2, :cond_15

    .line 292
    .line 293
    iget-boolean p2, p0, Lu1/p;->h:Z

    .line 294
    .line 295
    if-eqz p2, :cond_15

    .line 296
    .line 297
    invoke-virtual {p0, p1, v3}, Lu1/p;->d(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    :cond_15
    new-instance p2, Lu1/s;

    .line 302
    .line 303
    filled-new-array {p1}, [Landroid/net/Uri;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-direct {p2, v0, p1, v1}, Lu1/s;-><init>(Z[Landroid/net/Uri;Z)V

    .line 308
    .line 309
    .line 310
    return-object p2

    .line 311
    :cond_16
    invoke-static {v5}, Lr3/g;->c(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v2

    .line 315
    :cond_17
    invoke-static {v4}, Lr3/g;->c(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v2

    .line 319
    :cond_18
    invoke-virtual {p0}, Lu1/p;->f()V

    .line 320
    .line 321
    .line 322
    new-instance p1, Lu1/s;

    .line 323
    .line 324
    invoke-direct {p1, v1, v2, v1}, Lu1/s;-><init>(Z[Landroid/net/Uri;Z)V

    .line 325
    .line 326
    .line 327
    return-object p1
.end method

.method public final d(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    .locals 10

    .line 1
    const-string v0, "Failed to open input stream for "

    .line 2
    .line 3
    const-string v1, "Failed to open output stream for "

    .line 4
    .line 5
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 6
    .line 7
    const-string v3, "yyyyMMdd_HHmmss"

    .line 8
    .line 9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Ljava/util/Date;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 26
    .line 27
    invoke-virtual {p2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const-string v4, "image"

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    new-instance v3, Lg3/e;

    .line 43
    .line 44
    const-string v4, "IMG_"

    .line 45
    .line 46
    const-string v5, ".jpg"

    .line 47
    .line 48
    invoke-static {v4, v2, v5}, Landroidx/fragment/app/u;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v4, "image/jpeg"

    .line 53
    .line 54
    sget-object v5, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 55
    .line 56
    invoke-direct {v3, v2, v4, v5}, Lg3/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Comparable;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const-string v4, "video"

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_a

    .line 67
    .line 68
    new-instance v3, Lg3/e;

    .line 69
    .line 70
    const-string v4, "VID_"

    .line 71
    .line 72
    const-string v5, ".mp4"

    .line 73
    .line 74
    invoke-static {v4, v2, v5}, Landroidx/fragment/app/u;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v4, "video/mp4"

    .line 79
    .line 80
    sget-object v5, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 81
    .line 82
    invoke-direct {v3, v2, v4, v5}, Lg3/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Comparable;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    iget-object v2, v3, Lg3/e;->h:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Landroid/net/Uri;

    .line 88
    .line 89
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    .line 91
    const/16 v5, 0x1d

    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    const-string v7, "context"

    .line 95
    .line 96
    iget-object v8, v3, Lg3/e;->f:Ljava/lang/String;

    .line 97
    .line 98
    if-lt v4, v5, :cond_2

    .line 99
    .line 100
    iget-object v4, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 101
    .line 102
    if-eqz v4, :cond_1

    .line 103
    .line 104
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    new-instance v5, Landroid/content/ContentValues;

    .line 109
    .line 110
    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v9, "_display_name"

    .line 114
    .line 115
    invoke-virtual {v5, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const-string v8, "mime_type"

    .line 119
    .line 120
    iget-object v3, v3, Lg3/e;->g:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v5, v8, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    sget-object v3, Landroid/os/Environment;->DIRECTORY_DCIM:Ljava/lang/String;

    .line 126
    .line 127
    new-instance v8, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v3, "/Camera"

    .line 136
    .line 137
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    const-string v8, "relative_path"

    .line 145
    .line 146
    invoke-virtual {v5, v8, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v2, v5}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    goto :goto_1

    .line 154
    :cond_1
    invoke-static {v7}, Lr3/g;->c(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v6

    .line 158
    :cond_2
    new-instance v2, Ljava/io/File;

    .line 159
    .line 160
    sget-object v3, Landroid/os/Environment;->DIRECTORY_DCIM:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v3}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    const-string v4, "Camera"

    .line 167
    .line 168
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 172
    .line 173
    .line 174
    new-instance v3, Ljava/io/File;

    .line 175
    .line 176
    invoke-direct {v3, v2, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    iget-object v2, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 180
    .line 181
    if-eqz v2, :cond_9

    .line 182
    .line 183
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    new-instance v5, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v4, ".fileprovider"

    .line 196
    .line 197
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-static {v2, v4, v3}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    :goto_1
    if-eqz v2, :cond_8

    .line 209
    .line 210
    :try_start_0
    iget-object v3, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 211
    .line 212
    if-eqz v3, :cond_7

    .line 213
    .line 214
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-virtual {v3, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 219
    .line 220
    .line 221
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    if-eqz v3, :cond_6

    .line 223
    .line 224
    :try_start_1
    iget-object v0, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 225
    .line 226
    if-eqz v0, :cond_5

    .line 227
    .line 228
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 233
    .line 234
    .line 235
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    if-eqz v0, :cond_4

    .line 237
    .line 238
    const/16 v1, 0x2000

    .line 239
    .line 240
    :try_start_2
    new-array v1, v1, [B

    .line 241
    .line 242
    invoke-virtual {v3, v1}, Ljava/io/InputStream;->read([B)I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    :goto_2
    if-ltz v4, :cond_3

    .line 247
    .line 248
    const/4 v5, 0x0

    .line 249
    invoke-virtual {v0, v1, v5, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3, v1}, Ljava/io/InputStream;->read([B)I

    .line 253
    .line 254
    .line 255
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 256
    goto :goto_2

    .line 257
    :cond_3
    :try_start_3
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 258
    .line 259
    .line 260
    :try_start_4
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0}, Lu1/p;->f()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 264
    .line 265
    .line 266
    return-object v2

    .line 267
    :catch_0
    move-exception v0

    .line 268
    goto :goto_4

    .line 269
    :catchall_0
    move-exception v0

    .line 270
    goto :goto_3

    .line 271
    :catchall_1
    move-exception v1

    .line 272
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 273
    :catchall_2
    move-exception v2

    .line 274
    :try_start_6
    invoke-static {v0, v1}, Le4/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 275
    .line 276
    .line 277
    throw v2

    .line 278
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 279
    .line 280
    new-instance v4, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v0

    .line 296
    :cond_5
    invoke-static {v7}, Lr3/g;->c(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 300
    :goto_3
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 301
    :catchall_3
    move-exception v1

    .line 302
    :try_start_8
    invoke-static {v3, v0}, Le4/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 303
    .line 304
    .line 305
    throw v1

    .line 306
    :cond_6
    new-instance v1, Ljava/io/IOException;

    .line 307
    .line 308
    new-instance v2, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw v1

    .line 324
    :cond_7
    invoke-static {v7}, Lr3/g;->c(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw v6
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 328
    :goto_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    const-string v2, "Failed to copy "

    .line 331
    .line 332
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string p2, " to gallery"

    .line 339
    .line 340
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    const-string v1, "FileUploadContract"

    .line 348
    .line 349
    invoke-static {v1, p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 350
    .line 351
    .line 352
    :cond_8
    return-object p1

    .line 353
    :cond_9
    invoke-static {v7}, Lr3/g;->c(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw v6

    .line 357
    :cond_a
    const-string p1, "Unsupported media type: "

    .line 358
    .line 359
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    const/4 p1, 0x0

    .line 367
    return-object p1
.end method

.method public final e(Z)Landroid/net/Uri;
    .locals 5

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "temp_video_recording.mp4"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "temp_capture_image.jpg"

    .line 7
    .line 8
    :goto_0
    new-instance v0, Ljava/io/File;

    .line 9
    .line 10
    iget-object v1, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, "context"

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v4, "downloads"

    .line 22
    .line 23
    invoke-direct {v0, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 33
    .line 34
    .line 35
    :cond_1
    new-instance v1, Ljava/io/File;

    .line 36
    .line 37
    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ".fileprovider"

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {p1, v0, v1}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_2
    invoke-static {v3}, Lr3/g;->c(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v2

    .line 81
    :cond_3
    invoke-static {v3}, Lr3/g;->c(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v2
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu1/p;->c:Landroid/net/Uri;

    .line 2
    .line 3
    const-string v1, "context"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v3, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3, v0, v2, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lu1/p;->c:Landroid/net/Uri;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v1}, Lr3/g;->c(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v2

    .line 26
    :cond_1
    :goto_0
    iget-object v0, p0, Lu1/p;->d:Landroid/net/Uri;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v3, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 31
    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1, v0, v2, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lu1/p;->d:Landroid/net/Uri;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-static {v1}, Lr3/g;->c(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v2

    .line 48
    :cond_3
    return-void
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu1/p;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lu1/p;->f:Lu1/r;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lu1/r;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final i(Landroid/content/Intent;)Ljava/util/List;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    iget-object v1, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "context"

    .line 7
    .line 8
    const/16 v4, 0x21

    .line 9
    .line 10
    if-lt v0, v4, :cond_1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {}, Landroidx/activity/r;->b()Landroid/content/pm/PackageManager$ResolveInfoFlags;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, p1, v1}, Landroidx/activity/r;->j(Landroid/content/pm/PackageManager;Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-static {v3}, Lr3/g;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v2

    .line 34
    :cond_1
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/high16 v1, 0x10000

    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    invoke-static {v3}, Lr3/g;->c(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v2
.end method

.method public final j()Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lu1/p;->a:Landroidx/fragment/app/e0;

    .line 7
    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    invoke-static {v1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-boolean v1, v1, Lx1/a;->p:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 20
    .line 21
    const-string v2, "android.media.action.IMAGE_CAPTURE"

    .line 22
    .line 23
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {p0, v2}, Lu1/p;->e(Z)Landroid/net/Uri;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iput-object v2, p0, Lu1/p;->c:Landroid/net/Uri;

    .line 32
    .line 33
    const-string v3, "output"

    .line 34
    .line 35
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lu1/p;->i(Landroid/content/Intent;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 57
    .line 58
    iget-object v4, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 59
    .line 60
    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 61
    .line 62
    new-instance v5, Landroid/content/Intent;

    .line 63
    .line 64
    invoke-direct {v5, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 65
    .line 66
    .line 67
    new-instance v6, Landroid/content/ComponentName;

    .line 68
    .line 69
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 70
    .line 71
    iget-object v7, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {v6, v7, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    :goto_1
    return-object v0

    .line 89
    :cond_2
    const-string v0, "context"

    .line 90
    .line 91
    invoke-static {v0}, Lr3/g;->c(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    throw v0
.end method

.method public final k()Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Lu1/p;->j:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 12
    .line 13
    const-string v2, "android.media.action.VIDEO_CAPTURE"

    .line 14
    .line 15
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lu1/p;->b:Lz1/a;

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    iget v2, v2, Lz1/a;->a:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    const/4 v4, 0x1

    .line 26
    const-string v5, "android.intent.extra.videoQuality"

    .line 27
    .line 28
    if-ne v2, v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v1, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {p0, v4}, Lu1/p;->e(Z)Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iput-object v2, p0, Lu1/p;->d:Landroid/net/Uri;

    .line 43
    .line 44
    const-string v3, "output"

    .line 45
    .line 46
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lu1/p;->i(Landroid/content/Intent;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 68
    .line 69
    iget-object v4, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 70
    .line 71
    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 72
    .line 73
    new-instance v5, Landroid/content/Intent;

    .line 74
    .line 75
    invoke-direct {v5, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 76
    .line 77
    .line 78
    new-instance v6, Landroid/content/ComponentName;

    .line 79
    .line 80
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 81
    .line 82
    iget-object v7, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {v6, v7, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    :goto_2
    return-object v0

    .line 100
    :cond_3
    const-string v0, "cameraConfig"

    .line 101
    .line 102
    invoke-static {v0}, Lr3/g;->c(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    throw v0
.end method
