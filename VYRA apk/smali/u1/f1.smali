.class public final Lu1/f1;
.super Lk3/e;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq3/p;


# instance fields
.field public j:I

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Landroid/net/Uri;

.field public final synthetic m:Lr0/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;Lr0/b;Li3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/f1;->k:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lu1/f1;->l:Landroid/net/Uri;

    .line 4
    .line 5
    iput-object p3, p0, Lu1/f1;->m:Lr0/b;

    .line 6
    .line 7
    invoke-direct {p0, p4}, Lk3/e;-><init>(Li3/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lz3/j;

    .line 2
    .line 3
    check-cast p2, Li3/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lu1/f1;->h(Li3/c;Ljava/lang/Object;)Li3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu1/f1;

    .line 10
    .line 11
    sget-object p2, Lg3/g;->a:Lg3/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu1/f1;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final h(Li3/c;Ljava/lang/Object;)Li3/c;
    .locals 3

    .line 1
    new-instance p2, Lu1/f1;

    .line 2
    .line 3
    iget-object v0, p0, Lu1/f1;->l:Landroid/net/Uri;

    .line 4
    .line 5
    iget-object v1, p0, Lu1/f1;->m:Lr0/b;

    .line 6
    .line 7
    iget-object v2, p0, Lu1/f1;->k:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {p2, v2, v0, v1, p1}, Lu1/f1;-><init>(Landroid/content/Context;Landroid/net/Uri;Lr0/b;Li3/c;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lu1/f1;->k:Landroid/content/Context;

    .line 2
    .line 3
    iget v1, p0, Lu1/f1;->j:I

    .line 4
    .line 5
    sget-object v2, Lg3/g;->a:Lg3/g;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    iget-object v5, p0, Lu1/f1;->m:Lr0/b;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    sget-object v8, Lj3/a;->f:Lj3/a;

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v6, :cond_2

    .line 18
    .line 19
    if-eq v1, v4, :cond_1

    .line 20
    .line 21
    if-ne v1, v3, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, Lu1/h0;->q0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_8

    .line 27
    .line 28
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v7

    .line 34
    :cond_1
    :try_start_0
    invoke-static {p1}, Lu1/h0;->q0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :catch_0
    move-exception p1

    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_2
    invoke-static {p1}, Lu1/h0;->q0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_3
    invoke-static {p1}, Lu1/h0;->q0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object v1, p0, Lu1/f1;->l:Landroid/net/Uri;

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    :try_start_2
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 62
    .line 63
    .line 64
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 71
    :catchall_1
    move-exception v1

    .line 72
    :try_start_5
    invoke-static {p1, v0}, Le4/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_4
    move-object v1, v7

    .line 77
    :goto_0
    if-nez v1, :cond_6

    .line 78
    .line 79
    sget-object p1, Lz3/q;->a:Ld4/e;

    .line 80
    .line 81
    sget-object p1, Lb4/l;->a:La4/c;

    .line 82
    .line 83
    new-instance v0, Lu1/c1;

    .line 84
    .line 85
    invoke-direct {v0, v5, v7}, Lu1/c1;-><init>(Lr0/b;Li3/c;)V

    .line 86
    .line 87
    .line 88
    iput v6, p0, Lu1/f1;->j:I

    .line 89
    .line 90
    invoke-static {p1, v0, p0}, Lz3/l;->g(La4/c;Lq3/p;Lu1/f1;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v8, :cond_5

    .line 95
    .line 96
    goto/16 :goto_7

    .line 97
    .line 98
    :cond_5
    return-object v2

    .line 99
    :cond_6
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-le v9, p1, :cond_7

    .line 108
    .line 109
    move v10, v6

    .line 110
    goto :goto_1

    .line 111
    :cond_7
    const/4 v10, 0x0

    .line 112
    :goto_1
    if-eqz v10, :cond_8

    .line 113
    .line 114
    move v11, p1

    .line 115
    goto :goto_2

    .line 116
    :cond_8
    move v11, v9

    .line 117
    :goto_2
    if-eqz v10, :cond_9

    .line 118
    .line 119
    move p1, v9

    .line 120
    :cond_9
    const/high16 v9, 0x43f00000    # 480.0f

    .line 121
    .line 122
    int-to-float v11, v11

    .line 123
    div-float/2addr v9, v11

    .line 124
    int-to-float p1, p1

    .line 125
    mul-float/2addr p1, v9

    .line 126
    float-to-int p1, p1

    .line 127
    const/16 v9, 0x1e0

    .line 128
    .line 129
    if-eqz v10, :cond_a

    .line 130
    .line 131
    move v11, v9

    .line 132
    goto :goto_3

    .line 133
    :cond_a
    move v11, p1

    .line 134
    :goto_3
    if-eqz v10, :cond_b

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_b
    move p1, v9

    .line 138
    :goto_4
    invoke-static {v1, v11, p1, v6}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-nez v6, :cond_c

    .line 150
    .line 151
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 152
    .line 153
    .line 154
    :cond_c
    new-instance v1, Ljava/io/File;

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    const-string v9, "downloads"

    .line 161
    .line 162
    invoke-direct {v1, v6, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-nez v6, :cond_d

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 172
    .line 173
    .line 174
    :cond_d
    new-instance v6, Ljava/io/File;

    .line 175
    .line 176
    const-string v9, "temp_capture_image.jpg"

    .line 177
    .line 178
    invoke-direct {v6, v1, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    new-instance v1, Ljava/io/FileOutputStream;

    .line 182
    .line 183
    invoke-direct {v1, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 184
    .line 185
    .line 186
    :try_start_6
    sget-object v9, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 187
    .line 188
    const/16 v10, 0x5a

    .line 189
    .line 190
    invoke-virtual {p1, v9, v10, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 191
    .line 192
    .line 193
    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 194
    .line 195
    .line 196
    sget-object p1, Lz3/q;->a:Ld4/e;

    .line 197
    .line 198
    sget-object p1, Lb4/l;->a:La4/c;

    .line 199
    .line 200
    new-instance v1, Lu1/d1;

    .line 201
    .line 202
    invoke-direct {v1, v5, v0, v6, v7}, Lu1/d1;-><init>(Lr0/b;Landroid/content/Context;Ljava/io/File;Li3/c;)V

    .line 203
    .line 204
    .line 205
    iput v4, p0, Lu1/f1;->j:I

    .line 206
    .line 207
    invoke-static {p1, v1, p0}, Lz3/l;->g(La4/c;Lq3/p;Lu1/f1;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    if-ne p1, v8, :cond_e

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_e
    :goto_5
    check-cast p1, Lg3/g;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 215
    .line 216
    return-object v2

    .line 217
    :catchall_2
    move-exception p1

    .line 218
    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 219
    :catchall_3
    move-exception v0

    .line 220
    :try_start_9
    invoke-static {v1, p1}, Le4/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    throw v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 224
    :goto_6
    sget-object v0, Lz3/q;->a:Ld4/e;

    .line 225
    .line 226
    sget-object v0, Lb4/l;->a:La4/c;

    .line 227
    .line 228
    new-instance v1, Lu1/e1;

    .line 229
    .line 230
    invoke-direct {v1, v5, p1, v7}, Lu1/e1;-><init>(Lr0/b;Ljava/lang/Exception;Li3/c;)V

    .line 231
    .line 232
    .line 233
    iput v3, p0, Lu1/f1;->j:I

    .line 234
    .line 235
    invoke-static {v0, v1, p0}, Lz3/l;->g(La4/c;Lq3/p;Lu1/f1;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    if-ne p1, v8, :cond_f

    .line 240
    .line 241
    :goto_7
    return-object v8

    .line 242
    :cond_f
    :goto_8
    check-cast p1, Lg3/g;

    .line 243
    .line 244
    return-object v2
.end method
