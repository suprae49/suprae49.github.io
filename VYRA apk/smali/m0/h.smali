.class public final synthetic Lm0/h;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq3/a;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lm0/h;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lm0/h;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lm0/h;->f:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lm0/h;->g:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, Lu1/r1;

    .line 10
    .line 11
    iget-object v0, v2, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 12
    .line 13
    sget-object v2, Ls1/b;->a:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-static {}, Landroid/webkit/WebView;->getCurrentWebViewPackage()Landroid/content/pm/PackageInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :try_start_0
    const-string v2, "android.webkit.WebViewUpdateService"

    .line 24
    .line 25
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v4, "getCurrentWebViewPackageName"

    .line 30
    .line 31
    invoke-virtual {v2, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :try_start_1
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 49
    .line 50
    .line 51
    move-result-object v2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    :goto_0
    move-object v2, v1

    .line 54
    :goto_1
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move-object v0, v1

    .line 60
    :goto_2
    const/4 v2, 0x1

    .line 61
    if-eqz v0, :cond_f

    .line 62
    .line 63
    const/16 v4, 0x2e

    .line 64
    .line 65
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->indexOf(II)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    const/4 v5, -0x1

    .line 70
    if-ne v4, v5, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_3
    const/16 v4, 0xa

    .line 78
    .line 79
    invoke-static {v4}, Lt2/i;->b(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-nez v5, :cond_4

    .line 87
    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    const/16 v7, 0x30

    .line 95
    .line 96
    const v8, -0x7fffffff

    .line 97
    .line 98
    .line 99
    if-ge v6, v7, :cond_8

    .line 100
    .line 101
    if-ne v5, v2, :cond_5

    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_5
    const/16 v7, 0x2b

    .line 105
    .line 106
    if-eq v6, v7, :cond_7

    .line 107
    .line 108
    const/16 v7, 0x2d

    .line 109
    .line 110
    if-eq v6, v7, :cond_6

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_6
    const/high16 v8, -0x80000000

    .line 114
    .line 115
    move v6, v2

    .line 116
    :goto_4
    move v7, v6

    .line 117
    goto :goto_5

    .line 118
    :cond_7
    move v6, v2

    .line 119
    move v7, v3

    .line 120
    goto :goto_5

    .line 121
    :cond_8
    move v6, v3

    .line 122
    goto :goto_4

    .line 123
    :goto_5
    const v9, -0x38e38e3

    .line 124
    .line 125
    .line 126
    move v10, v3

    .line 127
    move v11, v9

    .line 128
    :goto_6
    if-ge v6, v5, :cond_c

    .line 129
    .line 130
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    invoke-static {v12, v4}, Ljava/lang/Character;->digit(II)I

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-gez v12, :cond_9

    .line 139
    .line 140
    goto :goto_7

    .line 141
    :cond_9
    if-ge v10, v11, :cond_a

    .line 142
    .line 143
    if-ne v11, v9, :cond_e

    .line 144
    .line 145
    div-int/lit8 v11, v8, 0xa

    .line 146
    .line 147
    if-ge v10, v11, :cond_a

    .line 148
    .line 149
    goto :goto_7

    .line 150
    :cond_a
    mul-int/lit8 v10, v10, 0xa

    .line 151
    .line 152
    add-int v13, v8, v12

    .line 153
    .line 154
    if-ge v10, v13, :cond_b

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_b
    sub-int/2addr v10, v12

    .line 158
    add-int/lit8 v6, v6, 0x1

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_c
    if-eqz v7, :cond_d

    .line 162
    .line 163
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    goto :goto_7

    .line 168
    :cond_d
    neg-int v0, v10

    .line 169
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    :cond_e
    :goto_7
    if-eqz v1, :cond_f

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    goto :goto_8

    .line 180
    :cond_f
    move v0, v3

    .line 181
    :goto_8
    const/16 v1, 0x8b

    .line 182
    .line 183
    if-lt v0, v1, :cond_10

    .line 184
    .line 185
    move v3, v2

    .line 186
    :cond_10
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :pswitch_0
    check-cast v2, Landroidx/emoji2/text/p;

    .line 192
    .line 193
    iget-object v0, v2, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Lco/median/android/MainActivity;

    .line 196
    .line 197
    const v2, 0x7f0c008f

    .line 198
    .line 199
    .line 200
    invoke-static {v0, v2, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    check-cast v0, Landroid/view/ViewGroup;

    .line 208
    .line 209
    return-object v0

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
