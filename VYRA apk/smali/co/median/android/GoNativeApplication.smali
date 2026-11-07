.class public Lco/median/android/GoNativeApplication;
.super Landroid/app/Application;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public f:Lu1/s0;

.field public g:Landroidx/emoji2/text/x;

.field public h:Lu1/h2;

.field public i:Landroid/os/Message;

.field public j:Landroidx/emoji2/text/x;

.field public k:Ljava/util/ArrayList;

.field public l:Z

.field public final m:Lu1/x;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lco/median/android/GoNativeApplication;->l:Z

    .line 6
    .line 7
    new-instance v0, Lu1/x;

    .line 8
    .line 9
    invoke-direct {v0, p0, p0}, Lu1/x;-><init>(Lco/median/android/GoNativeApplication;Lco/median/android/GoNativeApplication;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/HashMap;
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    return-object v0

    .line 35
    :cond_0
    return-object v1

    .line 36
    :cond_1
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    throw v0
.end method

.method public final b(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    check-cast v4, Ljava/lang/String;

    .line 25
    .line 26
    :try_start_0
    new-instance v5, Ljava/io/BufferedInputStream;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {v6, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-direct {v5, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v5, v1}, Lt1/l;->g(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception v5

    .line 50
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    new-instance v7, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v8, "Error reading "

    .line 57
    .line 58
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const-string v7, "GoNativeApplication"

    .line 69
    .line 70
    invoke-virtual {v6, v7, v4, v5}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-static {v1}, Lt1/l;->f(Ljava/io/Closeable;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1
.end method

.method public final onCreate()V
    .locals 13

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1f

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-lt v0, v1, :cond_1

    .line 11
    .line 12
    invoke-static {p0}, Lt2/i;->j(Landroid/content/ContextWrapper;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "median_theme_preference"

    .line 17
    .line 18
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const-string v5, "THEME_PREFERENCE_KEY_INITIAL_THEME_SET"

    .line 23
    .line 24
    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {p0, v0}, Lt2/i;->N(Landroid/content/ContextWrapper;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0, v5, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    sget-object v0, Le/q;->f:Le/o;

    .line 50
    .line 51
    sget v0, Lk/m3;->a:I

    .line 52
    .line 53
    iget-object v0, p0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const-string v4, "com.android.vending"

    .line 71
    .line 72
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_2

    .line 77
    .line 78
    const-string v4, "com.google.market"

    .line 79
    .line 80
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    :cond_2
    iput-boolean v3, v0, Lu1/x;->a:Z

    .line 87
    .line 88
    :cond_3
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_13

    .line 103
    .line 104
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v1, v0, Lx1/a;->c:Ljava/lang/Exception;

    .line 109
    .line 110
    iget-boolean v4, v0, Lx1/a;->i0:Z

    .line 111
    .line 112
    iget-boolean v5, v0, Lx1/a;->g0:Z

    .line 113
    .line 114
    iget-object v6, v0, Lx1/a;->N0:Lorg/json/JSONArray;

    .line 115
    .line 116
    const-string v7, "GoNativeApplication"

    .line 117
    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    const-string v1, "Invalid appConfig json"

    .line 121
    .line 122
    invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 127
    .line 128
    .line 129
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v8, "AppConfig error"

    .line 134
    .line 135
    iget-object v9, v0, Lx1/a;->c:Ljava/lang/Exception;

    .line 136
    .line 137
    invoke-virtual {v1, v7, v8, v9}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    new-instance v1, Lu1/s0;

    .line 141
    .line 142
    invoke-direct {v1}, Ljava/util/Observable;-><init>()V

    .line 143
    .line 144
    .line 145
    const/4 v8, 0x0

    .line 146
    iput-object v8, v1, Lu1/s0;->b:Lu1/h;

    .line 147
    .line 148
    iput-boolean v2, v1, Lu1/s0;->c:Z

    .line 149
    .line 150
    iput-object p0, v1, Lu1/s0;->a:Lco/median/android/GoNativeApplication;

    .line 151
    .line 152
    invoke-virtual {v1}, Lu1/s0;->c()V

    .line 153
    .line 154
    .line 155
    iput-object v1, p0, Lco/median/android/GoNativeApplication;->f:Lu1/s0;

    .line 156
    .line 157
    if-eqz v6, :cond_7

    .line 158
    .line 159
    new-instance v1, Landroidx/emoji2/text/x;

    .line 160
    .line 161
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 162
    .line 163
    .line 164
    iput-object p0, v1, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 165
    .line 166
    new-instance v8, Ljava/util/LinkedList;

    .line 167
    .line 168
    invoke-direct {v8}, Ljava/util/LinkedList;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-object v8, v1, Landroidx/emoji2/text/x;->d:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v1, p0, Lco/median/android/GoNativeApplication;->g:Landroidx/emoji2/text/x;

    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/util/LinkedList;->clear()V

    .line 176
    .line 177
    .line 178
    move v9, v2

    .line 179
    :goto_1
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-ge v9, v10, :cond_7

    .line 184
    .line 185
    invoke-virtual {v6, v9}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    if-nez v10, :cond_5

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_5
    const-string v11, "url"

    .line 193
    .line 194
    invoke-static {v11, v10}, Lt2/i;->F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    if-nez v11, :cond_6

    .line 199
    .line 200
    const-string v10, "androidx.emoji2.text.x"

    .line 201
    .line 202
    const-string v11, "Invalid registration: endpoint url is null"

    .line 203
    .line 204
    invoke-static {v10, v11}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_6
    const-string v12, "urlRegex"

    .line 209
    .line 210
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    invoke-static {v10}, Lt2/i;->f(Ljava/lang/Object;)Ljava/util/LinkedList;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    new-instance v12, Lu1/n1;

    .line 219
    .line 220
    invoke-direct {v12, v1, v11, v10}, Lu1/n1;-><init>(Landroidx/emoji2/text/x;Ljava/lang/String;Ljava/util/LinkedList;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8, v12}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    :goto_2
    add-int/lit8 v9, v9, 0x1

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_7
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    iget-boolean v1, v1, Lx1/a;->l1:Z

    .line 234
    .line 235
    if-nez v1, :cond_9

    .line 236
    .line 237
    invoke-static {p0}, Lu1/h0;->y(Landroid/content/Context;)Ljava/util/HashMap;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    const-string v6, "distribution"

    .line 242
    .line 243
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    check-cast v1, Ljava/lang/String;

    .line 248
    .line 249
    if-eqz v1, :cond_9

    .line 250
    .line 251
    const-string v6, "debug"

    .line 252
    .line 253
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-nez v6, :cond_8

    .line 258
    .line 259
    const-string v6, "adhoc"

    .line 260
    .line 261
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-eqz v1, :cond_9

    .line 266
    .line 267
    :cond_8
    invoke-static {v3}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 268
    .line 269
    .line 270
    :cond_9
    new-instance v1, Lu1/h2;

    .line 271
    .line 272
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 273
    .line 274
    .line 275
    new-instance v6, Lr0/b;

    .line 276
    .line 277
    invoke-direct {v6, v1}, Lr0/b;-><init>(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    iput-object v6, v1, Lu1/h2;->e:Lr0/b;

    .line 281
    .line 282
    iput-object v1, p0, Lco/median/android/GoNativeApplication;->h:Lu1/h2;

    .line 283
    .line 284
    new-instance v1, Landroidx/emoji2/text/x;

    .line 285
    .line 286
    const/4 v6, 0x3

    .line 287
    invoke-direct {v1, v6}, Landroidx/emoji2/text/x;-><init>(I)V

    .line 288
    .line 289
    .line 290
    iput-object v1, p0, Lco/median/android/GoNativeApplication;->j:Landroidx/emoji2/text/x;

    .line 291
    .line 292
    iget-boolean v1, v0, Lx1/a;->h0:Z

    .line 293
    .line 294
    const/4 v6, 0x2

    .line 295
    if-nez v5, :cond_a

    .line 296
    .line 297
    if-nez v1, :cond_a

    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_a
    new-instance v8, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 303
    .line 304
    .line 305
    if-eqz v5, :cond_b

    .line 306
    .line 307
    const-string v5, "customCSS.css"

    .line 308
    .line 309
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    :cond_b
    if-eqz v1, :cond_c

    .line 313
    .line 314
    const-string v1, "androidCustomCSS.css"

    .line 315
    .line 316
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    :cond_c
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-nez v1, :cond_d

    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_d
    :try_start_0
    invoke-virtual {p0, v8}, Lco/median/android/GoNativeApplication;->b(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 331
    .line 332
    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-static {v1, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    iput-object v1, p0, Lco/median/android/GoNativeApplication;->n:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 341
    .line 342
    goto :goto_3

    .line 343
    :catch_0
    move-exception v1

    .line 344
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    const-string v8, "Error loading custom CSS files"

    .line 349
    .line 350
    invoke-virtual {v5, v7, v8, v1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 351
    .line 352
    .line 353
    :goto_3
    iget-boolean v0, v0, Lx1/a;->j0:Z

    .line 354
    .line 355
    if-nez v4, :cond_e

    .line 356
    .line 357
    if-nez v0, :cond_e

    .line 358
    .line 359
    goto :goto_4

    .line 360
    :cond_e
    new-instance v1, Ljava/util/ArrayList;

    .line 361
    .line 362
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 363
    .line 364
    .line 365
    if-eqz v4, :cond_f

    .line 366
    .line 367
    const-string v4, "customJS.js"

    .line 368
    .line 369
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    :cond_f
    if-eqz v0, :cond_10

    .line 373
    .line 374
    const-string v0, "androidCustomJS.js"

    .line 375
    .line 376
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    :cond_10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-nez v0, :cond_11

    .line 384
    .line 385
    goto :goto_4

    .line 386
    :cond_11
    :try_start_1
    invoke-virtual {p0, v1}, Lco/median/android/GoNativeApplication;->b(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 391
    .line 392
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-static {v0, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    iput-object v0, p0, Lco/median/android/GoNativeApplication;->o:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 401
    .line 402
    goto :goto_4

    .line 403
    :catch_1
    move-exception v0

    .line 404
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    const-string v4, "Error loading custom JS files"

    .line 409
    .line 410
    invoke-virtual {v1, v7, v4, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 411
    .line 412
    .line 413
    :goto_4
    invoke-static {p0}, Le4/a;->x(Landroid/content/ContextWrapper;)Landroid/content/SharedPreferences;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    const-string v1, "hasLaunched"

    .line 418
    .line 419
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    if-nez v2, :cond_12

    .line 424
    .line 425
    iput-boolean v3, p0, Lco/median/android/GoNativeApplication;->l:Z

    .line 426
    .line 427
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 436
    .line 437
    .line 438
    :cond_12
    return-void

    .line 439
    :cond_13
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    throw v0
.end method
