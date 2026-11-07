.class public abstract Lco/median/android/a;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static a:Ljava/lang/String; = ""


# direct methods
.method public static a(Lu1/o0;Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-boolean p1, p1, Lx1/a;->V0:Z

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setMinimumFontSize(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setMinimumLogicalFontSize(I)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x2

    .line 48
    invoke-virtual {v1, p1}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4, p0, v3}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 59
    .line 60
    .line 61
    iget-object v4, v0, Lx1/a;->x:Lx1/d;

    .line 62
    .line 63
    iget-object v5, v0, Lx1/a;->j:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v6, v0, Lx1/a;->k:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object v7, Lx1/c;->a:[I

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    aget v4, v7, v4

    .line 77
    .line 78
    if-eq v4, v3, :cond_2

    .line 79
    .line 80
    const/4 v7, 0x3

    .line 81
    if-eq v4, p1, :cond_3

    .line 82
    .line 83
    if-eq v4, v7, :cond_1

    .line 84
    .line 85
    const/4 v7, -0x1

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move v7, v3

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    move v7, p1

    .line 90
    :cond_3
    :goto_1
    invoke-virtual {v1, v7}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 100
    .line 101
    .line 102
    sget-object v4, Lco/median/android/a;->a:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_6

    .line 109
    .line 110
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-nez v4, :cond_4

    .line 115
    .line 116
    sput-object v6, Lco/median/android/a;->a:Ljava/lang/String;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-nez v4, :cond_5

    .line 124
    .line 125
    new-instance v4, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-interface {p0}, Lx1/i;->getDefaultUserAgent()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v6, " "

    .line 138
    .line 139
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    sput-object v4, Lco/median/android/a;->a:Ljava/lang/String;

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_5
    invoke-interface {p0}, Lx1/i;->getDefaultUserAgent()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    sput-object v4, Lco/median/android/a;->a:Ljava/lang/String;

    .line 157
    .line 158
    :cond_6
    :goto_2
    sget-object v4, Lco/median/android/a;->a:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget v4, v0, Lx1/a;->E:I

    .line 164
    .line 165
    if-ne v4, v3, :cond_7

    .line 166
    .line 167
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_7
    iget-boolean v3, v0, Lx1/a;->r:Z

    .line 172
    .line 173
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 174
    .line 175
    .line 176
    :goto_3
    iget-object v3, v0, Lx1/a;->J0:Lz1/d;

    .line 177
    .line 178
    iget-boolean v3, v3, Lz1/d;->a:Z

    .line 179
    .line 180
    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 184
    .line 185
    .line 186
    iget v2, v0, Lx1/a;->C0:I

    .line 187
    .line 188
    if-lez v2, :cond_8

    .line 189
    .line 190
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 191
    .line 192
    .line 193
    :cond_8
    iget-boolean v0, v0, Lx1/a;->D0:Z

    .line 194
    .line 195
    if-eqz v0, :cond_9

    .line 196
    .line 197
    invoke-virtual {p0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 198
    .line 199
    .line 200
    :cond_9
    const-string p0, "PAYMENT_REQUEST"

    .line 201
    .line 202
    invoke-static {p0}, Le4/a;->R(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    if-eqz p0, :cond_b

    .line 207
    .line 208
    sget-object p0, Lt1/i;->f:Lt1/b;

    .line 209
    .line 210
    invoke-virtual {p0}, Lt1/c;->b()Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-eqz p0, :cond_a

    .line 215
    .line 216
    invoke-static {v1}, Ls1/a;->a(Landroid/webkit/WebSettings;)Lr0/b;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p0}, Lr0/b;->g()V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_a
    const-string p0, "This method is not supported by the current version of the framework and the current WebView APK"

    .line 225
    .line 226
    invoke-static {p0}, Landroidx/fragment/app/q;->t(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :cond_b
    return-void
.end method
