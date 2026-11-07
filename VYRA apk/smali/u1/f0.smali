.class public final Lu1/f0;
.super Landroid/webkit/WebViewClient;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lu1/e2;

.field public final b:Lco/median/android/MainActivity;

.field public c:Z


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;Lu1/e2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lu1/f0;->c:Z

    .line 6
    .line 7
    iput-object p2, p0, Lu1/f0;->a:Lu1/e2;

    .line 8
    .line 9
    iput-object p1, p0, Lu1/f0;->b:Lco/median/android/MainActivity;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 4

    .line 1
    check-cast p1, Lx1/i;

    .line 2
    .line 3
    iget-object p1, p0, Lu1/f0;->a:Lu1/e2;

    .line 4
    .line 5
    iget-object v0, p1, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 6
    .line 7
    iget-object v1, v0, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-boolean v3, v1, Lu1/x1;->b:Z

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    iget-boolean v3, v1, Lu1/x1;->e:Z

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    iget-object v1, v1, Lu1/x1;->d:Lu1/e2;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, p2}, Lu1/e2;->c(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p1, "urlNavigation"

    .line 29
    .line 30
    invoke-static {p1}, Lr3/g;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v2

    .line 34
    :cond_1
    :goto_0
    iget v1, p1, Lu1/e2;->h:I

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    if-ne v1, v3, :cond_2

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    iput v1, p1, Lu1/e2;->h:I

    .line 41
    .line 42
    iget-object p1, p1, Lu1/e2;->g:Landroid/os/Handler;

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    if-nez p3, :cond_5

    .line 48
    .line 49
    const-string p1, "file:///android_asset/offline.html"

    .line 50
    .line 51
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_5

    .line 56
    .line 57
    iget-object p1, v0, Lco/median/android/MainActivity;->I:Ljava/util/Stack;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-nez p3, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    check-cast p3, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-nez p3, :cond_4

    .line 76
    .line 77
    :cond_3
    invoke-virtual {p1, p2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-virtual {v0, p2}, Lco/median/android/MainActivity;->x(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-wide p1, 0x3fd3333333333333L    # 0.3

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p1, p2}, Lco/median/android/MainActivity;->n0(D)V

    .line 89
    .line 90
    .line 91
    :cond_5
    return-void
.end method

.method public final onFormResubmission(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    .locals 0

    .line 1
    check-cast p1, Lx1/i;

    .line 2
    .line 3
    iget-object p1, p0, Lu1/f0;->a:Lu1/e2;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Landroid/os/Message;->sendToTarget()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/f0;->a:Lu1/e2;

    .line 2
    .line 3
    iget-object v1, v0, Lu1/e2;->l:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lu1/e2;->a()V

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lx1/i;

    .line 5
    .line 6
    iget-object v0, p0, Lu1/f0;->a:Lu1/e2;

    .line 7
    .line 8
    iget-object v1, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 9
    .line 10
    iget-object v2, v0, Lu1/e2;->l:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const-string p1, ""

    .line 19
    .line 20
    iput-object p1, v0, Lu1/e2;->l:Ljava/lang/String;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v2, v1, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iput-boolean v3, v2, Lu1/x1;->e:Z

    .line 29
    .line 30
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v4, "onpagefinished "

    .line 33
    .line 34
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v4, "u1.e2"

    .line 45
    .line 46
    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x4

    .line 50
    iput v2, v0, Lu1/e2;->h:I

    .line 51
    .line 52
    iput-object p2, v0, Lu1/e2;->d:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v2, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lco/median/android/GoNativeApplication;

    .line 61
    .line 62
    iget-object v2, v2, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz p2, :cond_3

    .line 72
    .line 73
    iget-object v5, v2, Lx1/a;->e0:Ljava/util/ArrayList;

    .line 74
    .line 75
    if-eqz v5, :cond_3

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    move v7, v3

    .line 82
    :cond_2
    if-ge v7, v6, :cond_3

    .line 83
    .line 84
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    add-int/lit8 v7, v7, 0x1

    .line 89
    .line 90
    check-cast v8, Ljava/util/regex/Pattern;

    .line 91
    .line 92
    invoke-virtual {v8, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_2

    .line 101
    .line 102
    goto/16 :goto_9

    .line 103
    .line 104
    :cond_3
    invoke-virtual {v0}, Lu1/e2;->a()V

    .line 105
    .line 106
    .line 107
    const-string v5, "javascript:(function() {var parent = document.getElementsByTagName(\'head\').item(0);var script = document.createElement(\'script\');script.type = \'text/javascript\';script.innerHTML = window.atob(\'"

    .line 108
    .line 109
    iget-object v6, v0, Lu1/e2;->o:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    const/4 v8, 0x0

    .line 116
    if-eqz v7, :cond_4

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    :try_start_0
    new-instance v7, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v5, "\');parent.appendChild(script)})()"

    .line 128
    .line 129
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v1, v5, v8}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 137
    .line 138
    .line 139
    const-string v5, "Custom JS Injection Success"

    .line 140
    .line 141
    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :catch_0
    move-exception v5

    .line 146
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    const-string v7, "Error injecting customJS via javascript"

    .line 151
    .line 152
    invoke-virtual {v6, v4, v7, v5}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 153
    .line 154
    .line 155
    :goto_0
    invoke-virtual {v1}, Lco/median/android/MainActivity;->j0()V

    .line 156
    .line 157
    .line 158
    new-instance v5, Lu1/z1;

    .line 159
    .line 160
    const/4 v6, 0x1

    .line 161
    invoke-direct {v5, v0, v6}, Lu1/z1;-><init>(Lu1/e2;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v5}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 165
    .line 166
    .line 167
    invoke-static {}, Landroidx/emoji2/text/p;->l()Landroidx/emoji2/text/p;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v5, p2}, Landroidx/emoji2/text/p;->o(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-virtual {v0, v5}, Lu1/e2;->b(Landroid/net/Uri;)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_5

    .line 183
    .line 184
    sget-object v5, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 185
    .line 186
    new-instance v7, Landroidx/emoji2/text/n;

    .line 187
    .line 188
    invoke-direct {v7, v6}, Landroidx/emoji2/text/n;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v5, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 192
    .line 193
    .line 194
    :cond_5
    const-string v5, "DOCUMENT_START_SCRIPT"

    .line 195
    .line 196
    invoke-static {v5}, Le4/a;->R(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-eqz v5, :cond_6

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_6
    const-string v5, "window.print = function () { if (window.median_print) window.median_print.print(); };"

    .line 204
    .line 205
    invoke-virtual {v1, v5, v8}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 206
    .line 207
    .line 208
    :goto_1
    iget-boolean v5, v2, Lx1/a;->z:Z

    .line 209
    .line 210
    if-eqz v5, :cond_a

    .line 211
    .line 212
    iget-object v5, v0, Lu1/e2;->d:Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v1, v5}, Lt2/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-nez v5, :cond_7

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_7
    :try_start_1
    iget-object v5, v0, Lu1/e2;->e:Ljava/lang/String;

    .line 222
    .line 223
    if-nez v5, :cond_9

    .line 224
    .line 225
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    .line 226
    .line 227
    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 228
    .line 229
    .line 230
    new-instance v7, Ljava/io/BufferedInputStream;

    .line 231
    .line 232
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    const-string v10, "GoNativeJSBridgeLibrary.js"

    .line 237
    .line 238
    invoke-virtual {v9, v10}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    invoke-direct {v7, v9}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 243
    .line 244
    .line 245
    const/16 v9, 0x400

    .line 246
    .line 247
    new-array v9, v9, [B

    .line 248
    .line 249
    :goto_2
    invoke-virtual {v7, v9}, Ljava/io/InputStream;->read([B)I

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    if-lez v10, :cond_8

    .line 254
    .line 255
    invoke-virtual {v5, v9, v3, v10}, Ljava/io/OutputStream;->write([BII)V

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_8
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    iput-object v5, v0, Lu1/e2;->e:Ljava/lang/String;

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :catch_1
    move-exception v5

    .line 267
    goto :goto_4

    .line 268
    :cond_9
    :goto_3
    iget-object v5, v0, Lu1/e2;->e:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v1, v5, v8}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    check-cast v5, Lco/median/android/GoNativeApplication;

    .line 278
    .line 279
    iget-object v5, v5, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 280
    .line 281
    invoke-virtual {v5, v1}, Lu1/x;->c(Landroid/app/Activity;)V

    .line 282
    .line 283
    .line 284
    const-string v5, "median_library_ready"

    .line 285
    .line 286
    invoke-static {v5, v8}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-virtual {v1, v5, v8}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 291
    .line 292
    .line 293
    const-string v5, "gonative_library_ready"

    .line 294
    .line 295
    invoke-static {v5, v8}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    invoke-virtual {v1, v5, v8}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 300
    .line 301
    .line 302
    const-string v5, "GoNative JSBridgeLibrary Injection Success"

    .line 303
    .line 304
    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 305
    .line 306
    .line 307
    goto :goto_5

    .line 308
    :goto_4
    new-instance v7, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    const-string v9, "GoNative JSBridgeLibrary Injection Error:- "

    .line 311
    .line 312
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 327
    .line 328
    .line 329
    :cond_a
    :goto_5
    iget-object v4, v2, Lx1/a;->M:Ljava/lang/String;

    .line 330
    .line 331
    if-eqz v4, :cond_e

    .line 332
    .line 333
    iget-boolean v4, v0, Lu1/e2;->i:Z

    .line 334
    .line 335
    if-eqz v4, :cond_b

    .line 336
    .line 337
    iget-object v4, v1, Lco/median/android/MainActivity;->b0:Lu1/s0;

    .line 338
    .line 339
    invoke-virtual {v4}, Lu1/s0;->c()V

    .line 340
    .line 341
    .line 342
    :cond_b
    iget-object v4, v2, Lx1/a;->F0:Ljava/lang/String;

    .line 343
    .line 344
    invoke-static {p2, v4}, Lt2/i;->R(Ljava/lang/String;Ljava/lang/String;)Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-nez v4, :cond_d

    .line 349
    .line 350
    iget-object v4, v2, Lx1/a;->H0:Ljava/lang/String;

    .line 351
    .line 352
    invoke-static {p2, v4}, Lt2/i;->R(Ljava/lang/String;Ljava/lang/String;)Z

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-eqz v4, :cond_c

    .line 357
    .line 358
    goto :goto_6

    .line 359
    :cond_c
    move v4, v3

    .line 360
    goto :goto_7

    .line 361
    :cond_d
    :goto_6
    move v4, v6

    .line 362
    :goto_7
    iput-boolean v4, v0, Lu1/e2;->i:Z

    .line 363
    .line 364
    :cond_e
    iget-object v2, v2, Lx1/a;->X0:Ljava/lang/String;

    .line 365
    .line 366
    if-eqz v2, :cond_f

    .line 367
    .line 368
    move-object v4, p1

    .line 369
    check-cast v4, Lu1/o0;

    .line 370
    .line 371
    invoke-virtual {v4, v2, v8}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 372
    .line 373
    .line 374
    :cond_f
    iget-object v2, v0, Lu1/e2;->b:Ljava/lang/String;

    .line 375
    .line 376
    if-eqz v2, :cond_10

    .line 377
    .line 378
    move-object v4, p1

    .line 379
    check-cast v4, Lu1/o0;

    .line 380
    .line 381
    invoke-virtual {v4, v2, v8}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 382
    .line 383
    .line 384
    :cond_10
    iget-object v2, v0, Lu1/e2;->c:Ljava/lang/String;

    .line 385
    .line 386
    if-eqz v2, :cond_11

    .line 387
    .line 388
    check-cast p1, Lu1/o0;

    .line 389
    .line 390
    invoke-virtual {p1, v2, v8}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 391
    .line 392
    .line 393
    :cond_11
    invoke-virtual {v1, p2}, Lco/median/android/MainActivity;->x(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    iget-object p1, v1, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 397
    .line 398
    if-eqz p1, :cond_12

    .line 399
    .line 400
    iput-object v8, v1, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 401
    .line 402
    invoke-virtual {v1, p1, v8}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 403
    .line 404
    .line 405
    :cond_12
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    check-cast p1, Lco/median/android/GoNativeApplication;

    .line 410
    .line 411
    iget-object p1, p1, Lco/median/android/GoNativeApplication;->h:Lu1/h2;

    .line 412
    .line 413
    iput-boolean v3, p1, Lu1/h2;->l:Z

    .line 414
    .line 415
    invoke-virtual {p1, v1}, Lu1/h2;->c(Landroid/app/Activity;)V

    .line 416
    .line 417
    .line 418
    iget-object p1, v0, Lu1/e2;->d:Ljava/lang/String;

    .line 419
    .line 420
    if-eqz p1, :cond_13

    .line 421
    .line 422
    invoke-static {v1, p1}, Lt2/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 423
    .line 424
    .line 425
    move-result p1

    .line 426
    goto :goto_8

    .line 427
    :cond_13
    move p1, v6

    .line 428
    :goto_8
    if-eqz p1, :cond_14

    .line 429
    .line 430
    const-string p1, "median_device_info"

    .line 431
    .line 432
    invoke-virtual {v0, p1}, Lu1/e2;->e(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    const-string p1, "gonative_device_info"

    .line 436
    .line 437
    invoke-virtual {v0, p1}, Lu1/e2;->e(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    :cond_14
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    check-cast p1, Lco/median/android/GoNativeApplication;

    .line 445
    .line 446
    iget-object p1, p1, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 447
    .line 448
    invoke-virtual {p1}, Lu1/x;->a()Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    check-cast p1, Ljava/util/ArrayList;

    .line 453
    .line 454
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 459
    .line 460
    .line 461
    move-result p2

    .line 462
    if-nez p2, :cond_19

    .line 463
    .line 464
    invoke-static {v1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    iget-object p1, p1, Lx1/a;->j1:Lz1/g;

    .line 469
    .line 470
    if-nez p1, :cond_15

    .line 471
    .line 472
    goto :goto_9

    .line 473
    :cond_15
    iget-wide v2, p1, Lz1/g;->a:J

    .line 474
    .line 475
    iget-boolean p2, p1, Lz1/g;->e:Z

    .line 476
    .line 477
    if-nez p2, :cond_18

    .line 478
    .line 479
    iget-boolean p2, p1, Lz1/g;->d:Z

    .line 480
    .line 481
    if-eqz p2, :cond_16

    .line 482
    .line 483
    goto :goto_9

    .line 484
    :cond_16
    iput-boolean v6, p1, Lz1/g;->d:Z

    .line 485
    .line 486
    const-wide/16 v4, -0x1

    .line 487
    .line 488
    cmp-long p2, v2, v4

    .line 489
    .line 490
    if-lez p2, :cond_17

    .line 491
    .line 492
    new-instance p2, Landroid/os/Handler;

    .line 493
    .line 494
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 499
    .line 500
    .line 501
    new-instance v0, Landroidx/activity/p;

    .line 502
    .line 503
    const/16 v4, 0xb

    .line 504
    .line 505
    invoke-direct {v0, v1, v4, p1}, Landroidx/activity/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {p2, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 509
    .line 510
    .line 511
    goto :goto_9

    .line 512
    :cond_17
    iput-boolean v6, p1, Lz1/g;->e:Z

    .line 513
    .line 514
    :cond_18
    :goto_9
    return-void

    .line 515
    :cond_19
    invoke-static {p1}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 516
    .line 517
    .line 518
    move-result-object p1

    .line 519
    throw p1
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lu1/f0;->a:Lu1/e2;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Lu1/e2;->c(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onReceivedClientCertRequest(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lu1/f0;->a:Lu1/e2;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    new-instance v2, Lu1/a2;

    .line 14
    .line 15
    invoke-direct {v2, v0, p2}, Lu1/a2;-><init>(Lu1/e2;Landroid/webkit/ClientCertRequest;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getKeyTypes()[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getPrincipals()[Ljava/security/Principal;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getHost()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getPort()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const/4 v7, 0x0

    .line 37
    invoke-static/range {v1 .. v7}, Landroid/security/KeyChain;->choosePrivateKeyAlias(Landroid/app/Activity;Landroid/security/KeyChainAliasCallback;[Ljava/lang/String;[Ljava/security/Principal;Ljava/lang/String;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 29
    iget-object v0, p0, Lu1/f0;->a:Lu1/e2;

    check-cast p1, Lx1/i;

    invoke-virtual {v0, p1, p2, p3, p4}, Lu1/e2;->d(Lx1/i;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 2

    .line 1
    check-cast p1, Lx1/i;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getErrorCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-interface {p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget-object v1, p0, Lu1/f0;->a:Lu1/e2;

    .line 24
    .line 25
    invoke-virtual {v1, p1, v0, p3, p2}, Lu1/e2;->d(Lx1/i;ILjava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p2, p0, Lu1/f0;->a:Lu1/e2;

    .line 9
    .line 10
    iget-object p2, p2, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 11
    .line 12
    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    if-eq v0, v2, :cond_1

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    if-eq v0, v2, :cond_1

    .line 29
    .line 30
    const v0, 0x7f110102

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const v0, 0x7f110101

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const v0, 0x7f110100

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-static {p2}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-boolean v2, v2, Lx1/a;->y:Z

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-static {p2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 54
    .line 55
    .line 56
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p2, " - Error url: "

    .line 69
    .line 70
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p2, " - Source page: "

    .line 81
    .line 82
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    new-instance p3, Ljava/lang/Exception;

    .line 97
    .line 98
    invoke-direct {p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v0, "u1.e2"

    .line 102
    .line 103
    invoke-virtual {p2, v0, p1, p3}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final onScaleChanged(Landroid/webkit/WebView;FF)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onScaleChanged(Landroid/webkit/WebView;FF)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lu1/f0;->b:Lco/median/android/MainActivity;

    .line 5
    .line 6
    iput p3, p1, Lco/median/android/MainActivity;->F0:F

    .line 7
    .line 8
    iget-object p1, p1, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 9
    .line 10
    instance-of p2, p1, Lu1/o0;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    check-cast p1, Lu1/o0;

    .line 15
    .line 16
    invoke-virtual {p1, p3}, Lu1/o0;->setCurrentScale(F)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lu1/f0;->c:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lu1/f0;->b:Lco/median/android/MainActivity;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, v2, Lco/median/android/MainActivity;->T:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v3, "io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN"

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lu1/f0;->c:Z

    .line 27
    .line 28
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v3, "User-Agent"

    .line 33
    .line 34
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/lang/String;

    .line 39
    .line 40
    sget-object v5, Lco/median/android/a;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v5, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    new-instance v0, Landroid/webkit/WebResourceResponse;

    .line 49
    .line 50
    new-instance v5, Ljava/io/ByteArrayInputStream;

    .line 51
    .line 52
    new-array v4, v4, [B

    .line 53
    .line 54
    invoke-direct {v5, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 55
    .line 56
    .line 57
    const-string v4, "text/plain"

    .line 58
    .line 59
    const-string v6, "UTF-8"

    .line 60
    .line 61
    invoke-direct {v0, v4, v6, v5}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    .line 62
    .line 63
    .line 64
    const/16 v4, 0xcc

    .line 65
    .line 66
    const-string v5, "No Content"

    .line 67
    .line 68
    invoke-virtual {v0, v4, v5}, Landroid/webkit/WebResourceResponse;->setStatusCodeAndReasonPhrase(ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    sget-object v5, Lco/median/android/a;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    new-instance v3, Landroidx/emoji2/text/l;

    .line 81
    .line 82
    const/4 v5, 0x2

    .line 83
    invoke-direct {v3, p0, p2, v4, v5}, Landroidx/emoji2/text/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move-object v0, v1

    .line 91
    :goto_0
    if-eqz v0, :cond_1

    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_1
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 99
    .line 100
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 101
    .line 102
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_5

    .line 117
    .line 118
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    const-string v2, "GET"

    .line 125
    .line 126
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_2

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    if-eqz p2, :cond_4

    .line 138
    .line 139
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const-string v2, "http"

    .line 144
    .line 145
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_3

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p0, p1, p2}, Lu1/f0;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :cond_4
    :goto_1
    return-object v1

    .line 162
    :cond_5
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    throw p1
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 3

    .line 167
    check-cast p1, Lu1/o0;

    .line 168
    iget-object v0, p0, Lu1/f0;->a:Lu1/e2;

    iget-object v1, v0, Lu1/e2;->f:Lk/a;

    .line 169
    iget-object v2, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    iget-object v0, v0, Lu1/e2;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, p1, p2, v0}, Lk/a;->e(Landroid/app/Activity;Lx1/i;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 2

    .line 1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast p1, Lx1/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isRedirect()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    iget-object v1, p0, Lu1/f0;->a:Lu1/e2;

    .line 16
    .line 17
    invoke-virtual {v1, p1, v0, p2}, Lu1/e2;->f(Lx1/i;Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    .line 22
    check-cast p1, Lx1/i;

    const/4 v0, 0x0

    .line 23
    iget-object v1, p0, Lu1/f0;->a:Lu1/e2;

    invoke-virtual {v1, p1, p2, v0}, Lu1/e2;->f(Lx1/i;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method
