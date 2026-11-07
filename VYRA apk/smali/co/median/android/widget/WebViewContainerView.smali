.class public Lco/median/android/widget/WebViewContainerView;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final f:Landroid/view/ViewGroup;

.field public final g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    iput-boolean p2, p0, Lco/median/android/widget/WebViewContainerView;->g:Z

    .line 6
    .line 7
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-boolean p2, p2, Lx1/a;->l1:Z

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    :try_start_0
    const-string p2, "co.median.plugins.android.geckoview.GNGeckoView"

    .line 16
    .line 17
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const-class v0, Landroid/content/Context;

    .line 22
    .line 23
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p2, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroid/view/ViewGroup;

    .line 40
    .line 41
    iput-object p1, p0, Lco/median/android/widget/WebViewContainerView;->f:Landroid/view/ViewGroup;

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Lco/median/android/widget/WebViewContainerView;->g:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance p2, Lu1/o0;

    .line 53
    .line 54
    invoke-direct {p2, p1}, Lu1/o0;-><init>(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, Lco/median/android/widget/WebViewContainerView;->f:Landroid/view/ViewGroup;

    .line 58
    .line 59
    :goto_0
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 60
    .line 61
    const/4 p2, -0x1

    .line 62
    invoke-direct {p1, p2, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Lco/median/android/widget/WebViewContainerView;->f:Landroid/view/ViewGroup;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lco/median/android/widget/WebViewContainerView;->f:Landroid/view/ViewGroup;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final a(Lco/median/android/MainActivity;Z)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lco/median/android/widget/WebViewContainerView;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    const-string v0, "co.median.plugins.android.geckoview.WebViewSetup"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "setupWebviewForActivity"

    .line 12
    .line 13
    const-class v2, Landroid/app/Activity;

    .line 14
    .line 15
    const-class v3, Lx1/i;

    .line 16
    .line 17
    const-class v4, Lu1/x;

    .line 18
    .line 19
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p0, Lco/median/android/widget/WebViewContainerView;->f:Landroid/view/ViewGroup;

    .line 30
    .line 31
    check-cast v2, Lx1/i;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lco/median/android/GoNativeApplication;

    .line 38
    .line 39
    iget-object v3, v3, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 40
    .line 41
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    filled-new-array {p1, v2, v3, p2}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v1, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto :goto_0

    .line 55
    :catch_1
    move-exception p1

    .line 56
    goto :goto_0

    .line 57
    :catch_2
    move-exception p1

    .line 58
    goto :goto_0

    .line 59
    :catch_3
    move-exception p1

    .line 60
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_0
    invoke-virtual {p0}, Lco/median/android/widget/WebViewContainerView;->getWebview()Lx1/i;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    instance-of v0, p2, Lu1/o0;

    .line 70
    .line 71
    const-string v1, "co.median.android.a"

    .line 72
    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    const-string v0, "Expected webview to be of class LeanWebView and not "

    .line 88
    .line 89
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-virtual {p1, v1, p2, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_1

    .line 98
    .line 99
    :cond_1
    move-object v0, p2

    .line 100
    check-cast v0, Lu1/o0;

    .line 101
    .line 102
    invoke-static {v0, p1}, Lco/median/android/a;->a(Lu1/o0;Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    new-instance v2, Lu1/e2;

    .line 106
    .line 107
    invoke-direct {v2, p1}, Lu1/e2;-><init>(Lco/median/android/MainActivity;)V

    .line 108
    .line 109
    .line 110
    check-cast p2, Landroid/webkit/WebView;

    .line 111
    .line 112
    invoke-virtual {p2}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    iput-object p2, v2, Lu1/e2;->d:Ljava/lang/String;

    .line 117
    .line 118
    iget-object p2, v2, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 119
    .line 120
    invoke-virtual {p2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    check-cast p2, Lco/median/android/GoNativeApplication;

    .line 125
    .line 126
    iget-object p2, p2, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    new-instance p2, Lu1/e0;

    .line 132
    .line 133
    invoke-direct {p2, p1, v2}, Lu1/e0;-><init>(Lco/median/android/MainActivity;Lu1/e2;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p2}, Lu1/o0;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 137
    .line 138
    .line 139
    new-instance p2, Lu1/f0;

    .line 140
    .line 141
    invoke-direct {p2, p1, v2}, Lu1/f0;-><init>(Lco/median/android/MainActivity;Lu1/e2;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p2}, Lu1/o0;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 145
    .line 146
    .line 147
    iget-object p2, p1, Lco/median/android/MainActivity;->Z:Lu1/o;

    .line 148
    .line 149
    if-eqz p2, :cond_2

    .line 150
    .line 151
    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 152
    .line 153
    .line 154
    iput-object v2, p2, Lu1/o;->d:Lu1/e2;

    .line 155
    .line 156
    :cond_2
    const-string p2, "median_status_checker"

    .line 157
    .line 158
    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    new-instance v2, Lco/median/android/MainActivity$a;

    .line 162
    .line 163
    invoke-direct {v2, p1}, Lco/median/android/MainActivity$a;-><init>(Lco/median/android/MainActivity;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v2, p2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string p2, "gonative_file_writer_sharer"

    .line 170
    .line 171
    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object v2, p1, Lco/median/android/MainActivity;->a0:Lu1/w;

    .line 175
    .line 176
    iget-object v2, v2, Lu1/w;->c:Lu1/v;

    .line 177
    .line 178
    invoke-virtual {v0, v2, p2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const-string p2, "JSBridge"

    .line 182
    .line 183
    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    new-instance v2, Lu1/f2;

    .line 187
    .line 188
    new-instance v3, Lu1/v0;

    .line 189
    .line 190
    const/4 v4, 0x5

    .line 191
    invoke-direct {v3, p1, v4}, Lu1/v0;-><init>(Lco/median/android/MainActivity;I)V

    .line 192
    .line 193
    .line 194
    invoke-direct {v2, v3}, Lu1/f2;-><init>(Lu1/v0;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v2, p2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    const-string p2, "median_print"

    .line 201
    .line 202
    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-object v2, p1, Lco/median/android/MainActivity;->f0:Lu1/x;

    .line 206
    .line 207
    iget-object v2, v2, Lu1/x;->c:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v2, Lu1/g1;

    .line 210
    .line 211
    invoke-virtual {v0, v2, p2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    check-cast p2, Lco/median/android/GoNativeApplication;

    .line 219
    .line 220
    iget-object p2, p2, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 221
    .line 222
    invoke-virtual {p2}, Lu1/x;->a()Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    check-cast p2, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    if-nez v2, :cond_4

    .line 237
    .line 238
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    const-string v2, "io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN"

    .line 243
    .line 244
    const/4 v3, 0x0

    .line 245
    invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    if-eqz p2, :cond_3

    .line 250
    .line 251
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    check-cast p1, Lco/median/android/GoNativeApplication;

    .line 256
    .line 257
    iget-object p1, p1, Lco/median/android/GoNativeApplication;->i:Landroid/os/Message;

    .line 258
    .line 259
    if-eqz p1, :cond_3

    .line 260
    .line 261
    :try_start_1
    iget-object p2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast p2, Landroid/webkit/WebView$WebViewTransport;

    .line 264
    .line 265
    if-eqz p2, :cond_3

    .line 266
    .line 267
    invoke-virtual {p2, v0}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_4

    .line 271
    .line 272
    .line 273
    goto :goto_1

    .line 274
    :catch_4
    move-exception p1

    .line 275
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {p2, v1, v0, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 284
    .line 285
    .line 286
    :cond_3
    :goto_1
    return-void

    .line 287
    :cond_4
    invoke-static {p2}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    throw p1
.end method

.method public getWebview()Lx1/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/widget/WebViewContainerView;->f:Landroid/view/ViewGroup;

    .line 2
    .line 3
    check-cast v0, Lx1/i;

    .line 4
    .line 5
    return-object v0
.end method
