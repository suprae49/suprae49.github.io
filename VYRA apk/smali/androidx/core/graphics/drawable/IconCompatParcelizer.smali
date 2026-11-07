.class public Landroidx/core/graphics/drawable/IconCompatParcelizer;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static read(Lr1/a;)Landroidx/core/graphics/drawable/IconCompat;
    .locals 7

    .line 1
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->c:[B

    .line 11
    .line 12
    iput-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->d:Landroid/os/Parcelable;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    iput v3, v0, Landroidx/core/graphics/drawable/IconCompat;->e:I

    .line 16
    .line 17
    iput v3, v0, Landroidx/core/graphics/drawable/IconCompat;->f:I

    .line 18
    .line 19
    iput-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->g:Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    sget-object v4, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 22
    .line 23
    iput-object v4, v0, Landroidx/core/graphics/drawable/IconCompat;->h:Landroid/graphics/PorterDuff$Mode;

    .line 24
    .line 25
    iput-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->i:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-virtual {p0, v4}, Lr1/a;->e(I)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    move v4, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v4, p0

    .line 37
    check-cast v4, Lr1/b;

    .line 38
    .line 39
    iget-object v4, v4, Lr1/b;->e:Landroid/os/Parcel;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    :goto_0
    iput v4, v0, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 46
    .line 47
    iget-object v4, v0, Landroidx/core/graphics/drawable/IconCompat;->c:[B

    .line 48
    .line 49
    const/4 v5, 0x2

    .line 50
    invoke-virtual {p0, v5}, Lr1/a;->e(I)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-nez v6, :cond_1

    .line 55
    .line 56
    move-object v2, v4

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v4, p0

    .line 59
    check-cast v4, Lr1/b;

    .line 60
    .line 61
    iget-object v4, v4, Lr1/b;->e:Landroid/os/Parcel;

    .line 62
    .line 63
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-gez v6, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    new-array v2, v6, [B

    .line 71
    .line 72
    invoke-virtual {v4, v2}, Landroid/os/Parcel;->readByteArray([B)V

    .line 73
    .line 74
    .line 75
    :goto_1
    iput-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->c:[B

    .line 76
    .line 77
    iget-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->d:Landroid/os/Parcelable;

    .line 78
    .line 79
    const/4 v4, 0x3

    .line 80
    invoke-virtual {p0, v2, v4}, Lr1/a;->f(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iput-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->d:Landroid/os/Parcelable;

    .line 85
    .line 86
    iget v2, v0, Landroidx/core/graphics/drawable/IconCompat;->e:I

    .line 87
    .line 88
    const/4 v6, 0x4

    .line 89
    invoke-virtual {p0, v6}, Lr1/a;->e(I)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-nez v6, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move-object v2, p0

    .line 97
    check-cast v2, Lr1/b;

    .line 98
    .line 99
    iget-object v2, v2, Lr1/b;->e:Landroid/os/Parcel;

    .line 100
    .line 101
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    :goto_2
    iput v2, v0, Landroidx/core/graphics/drawable/IconCompat;->e:I

    .line 106
    .line 107
    iget v2, v0, Landroidx/core/graphics/drawable/IconCompat;->f:I

    .line 108
    .line 109
    const/4 v6, 0x5

    .line 110
    invoke-virtual {p0, v6}, Lr1/a;->e(I)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-nez v6, :cond_4

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_4
    move-object v2, p0

    .line 118
    check-cast v2, Lr1/b;

    .line 119
    .line 120
    iget-object v2, v2, Lr1/b;->e:Landroid/os/Parcel;

    .line 121
    .line 122
    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    :goto_3
    iput v2, v0, Landroidx/core/graphics/drawable/IconCompat;->f:I

    .line 127
    .line 128
    iget-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->g:Landroid/content/res/ColorStateList;

    .line 129
    .line 130
    const/4 v6, 0x6

    .line 131
    invoke-virtual {p0, v2, v6}, Lr1/a;->f(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Landroid/content/res/ColorStateList;

    .line 136
    .line 137
    iput-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->g:Landroid/content/res/ColorStateList;

    .line 138
    .line 139
    iget-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->i:Ljava/lang/String;

    .line 140
    .line 141
    const/4 v6, 0x7

    .line 142
    invoke-virtual {p0, v6}, Lr1/a;->e(I)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-nez v6, :cond_5

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    move-object v2, p0

    .line 150
    check-cast v2, Lr1/b;

    .line 151
    .line 152
    iget-object v2, v2, Lr1/b;->e:Landroid/os/Parcel;

    .line 153
    .line 154
    invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    :goto_4
    iput-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->i:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->j:Ljava/lang/String;

    .line 161
    .line 162
    const/16 v6, 0x8

    .line 163
    .line 164
    invoke-virtual {p0, v6}, Lr1/a;->e(I)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-nez v6, :cond_6

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_6
    check-cast p0, Lr1/b;

    .line 172
    .line 173
    iget-object p0, p0, Lr1/b;->e:Landroid/os/Parcel;

    .line 174
    .line 175
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    :goto_5
    iput-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->j:Ljava/lang/String;

    .line 180
    .line 181
    iget-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->i:Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {p0}, Landroid/graphics/PorterDuff$Mode;->valueOf(Ljava/lang/String;)Landroid/graphics/PorterDuff$Mode;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->h:Landroid/graphics/PorterDuff$Mode;

    .line 188
    .line 189
    iget p0, v0, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 190
    .line 191
    packed-switch p0, :pswitch_data_0

    .line 192
    .line 193
    .line 194
    :pswitch_0
    goto :goto_6

    .line 195
    :pswitch_1
    iget-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->c:[B

    .line 196
    .line 197
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_2
    new-instance p0, Ljava/lang/String;

    .line 201
    .line 202
    iget-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->c:[B

    .line 203
    .line 204
    const-string v4, "UTF-16"

    .line 205
    .line 206
    invoke-static {v4}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-direct {p0, v2, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 211
    .line 212
    .line 213
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 214
    .line 215
    iget v2, v0, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 216
    .line 217
    if-ne v2, v5, :cond_7

    .line 218
    .line 219
    iget-object v2, v0, Landroidx/core/graphics/drawable/IconCompat;->j:Ljava/lang/String;

    .line 220
    .line 221
    if-nez v2, :cond_7

    .line 222
    .line 223
    const-string v2, ":"

    .line 224
    .line 225
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    aget-object p0, p0, v3

    .line 230
    .line 231
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->j:Ljava/lang/String;

    .line 232
    .line 233
    :cond_7
    :goto_6
    return-object v0

    .line 234
    :pswitch_3
    iget-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->d:Landroid/os/Parcelable;

    .line 235
    .line 236
    if-eqz p0, :cond_8

    .line 237
    .line 238
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 239
    .line 240
    return-object v0

    .line 241
    :cond_8
    iget-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->c:[B

    .line 242
    .line 243
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 244
    .line 245
    iput v4, v0, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 246
    .line 247
    iput v3, v0, Landroidx/core/graphics/drawable/IconCompat;->e:I

    .line 248
    .line 249
    array-length p0, p0

    .line 250
    iput p0, v0, Landroidx/core/graphics/drawable/IconCompat;->f:I

    .line 251
    .line 252
    return-object v0

    .line 253
    :pswitch_4
    iget-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->d:Landroid/os/Parcelable;

    .line 254
    .line 255
    if-eqz p0, :cond_9

    .line 256
    .line 257
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 258
    .line 259
    return-object v0

    .line 260
    :cond_9
    const-string p0, "Invalid icon"

    .line 261
    .line 262
    invoke-static {p0}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    const/4 p0, 0x0

    .line 266
    return-object p0

    .line 267
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public static write(Landroidx/core/graphics/drawable/IconCompat;Lr1/a;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->h:Landroid/graphics/PorterDuff$Mode;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->i:Ljava/lang/String;

    .line 11
    .line 12
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 13
    .line 14
    const-string v1, "UTF-16"

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    :pswitch_0
    goto :goto_0

    .line 20
    :pswitch_1
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->c:[B

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_2
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, [B

    .line 40
    .line 41
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->c:[B

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_3
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->c:[B

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_4
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Landroid/os/Parcelable;

    .line 62
    .line 63
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->d:Landroid/os/Parcelable;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_5
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Landroid/os/Parcelable;

    .line 69
    .line 70
    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->d:Landroid/os/Parcelable;

    .line 71
    .line 72
    :goto_0
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 73
    .line 74
    const/4 v1, -0x1

    .line 75
    if-eq v1, v0, :cond_0

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-virtual {p1, v1}, Lr1/a;->h(I)V

    .line 79
    .line 80
    .line 81
    move-object v1, p1

    .line 82
    check-cast v1, Lr1/b;

    .line 83
    .line 84
    iget-object v1, v1, Lr1/b;->e:Landroid/os/Parcel;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    :cond_0
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->c:[B

    .line 90
    .line 91
    if-eqz v0, :cond_1

    .line 92
    .line 93
    const/4 v1, 0x2

    .line 94
    invoke-virtual {p1, v1}, Lr1/a;->h(I)V

    .line 95
    .line 96
    .line 97
    move-object v1, p1

    .line 98
    check-cast v1, Lr1/b;

    .line 99
    .line 100
    iget-object v1, v1, Lr1/b;->e:Landroid/os/Parcel;

    .line 101
    .line 102
    array-length v2, v0

    .line 103
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 107
    .line 108
    .line 109
    :cond_1
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->d:Landroid/os/Parcelable;

    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    if-eqz v0, :cond_2

    .line 113
    .line 114
    const/4 v2, 0x3

    .line 115
    invoke-virtual {p1, v2}, Lr1/a;->h(I)V

    .line 116
    .line 117
    .line 118
    move-object v2, p1

    .line 119
    check-cast v2, Lr1/b;

    .line 120
    .line 121
    iget-object v2, v2, Lr1/b;->e:Landroid/os/Parcel;

    .line 122
    .line 123
    invoke-virtual {v2, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 124
    .line 125
    .line 126
    :cond_2
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->e:I

    .line 127
    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    const/4 v2, 0x4

    .line 131
    invoke-virtual {p1, v2}, Lr1/a;->h(I)V

    .line 132
    .line 133
    .line 134
    move-object v2, p1

    .line 135
    check-cast v2, Lr1/b;

    .line 136
    .line 137
    iget-object v2, v2, Lr1/b;->e:Landroid/os/Parcel;

    .line 138
    .line 139
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 140
    .line 141
    .line 142
    :cond_3
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->f:I

    .line 143
    .line 144
    if-eqz v0, :cond_4

    .line 145
    .line 146
    const/4 v2, 0x5

    .line 147
    invoke-virtual {p1, v2}, Lr1/a;->h(I)V

    .line 148
    .line 149
    .line 150
    move-object v2, p1

    .line 151
    check-cast v2, Lr1/b;

    .line 152
    .line 153
    iget-object v2, v2, Lr1/b;->e:Landroid/os/Parcel;

    .line 154
    .line 155
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 156
    .line 157
    .line 158
    :cond_4
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->g:Landroid/content/res/ColorStateList;

    .line 159
    .line 160
    if-eqz v0, :cond_5

    .line 161
    .line 162
    const/4 v2, 0x6

    .line 163
    invoke-virtual {p1, v2}, Lr1/a;->h(I)V

    .line 164
    .line 165
    .line 166
    move-object v2, p1

    .line 167
    check-cast v2, Lr1/b;

    .line 168
    .line 169
    iget-object v2, v2, Lr1/b;->e:Landroid/os/Parcel;

    .line 170
    .line 171
    invoke-virtual {v2, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 172
    .line 173
    .line 174
    :cond_5
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->i:Ljava/lang/String;

    .line 175
    .line 176
    if-eqz v0, :cond_6

    .line 177
    .line 178
    const/4 v1, 0x7

    .line 179
    invoke-virtual {p1, v1}, Lr1/a;->h(I)V

    .line 180
    .line 181
    .line 182
    move-object v1, p1

    .line 183
    check-cast v1, Lr1/b;

    .line 184
    .line 185
    iget-object v1, v1, Lr1/b;->e:Landroid/os/Parcel;

    .line 186
    .line 187
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_6
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->j:Ljava/lang/String;

    .line 191
    .line 192
    if-eqz p0, :cond_7

    .line 193
    .line 194
    const/16 v0, 0x8

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Lr1/a;->h(I)V

    .line 197
    .line 198
    .line 199
    check-cast p1, Lr1/b;

    .line 200
    .line 201
    iget-object p1, p1, Lr1/b;->e:Landroid/os/Parcel;

    .line 202
    .line 203
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_7
    return-void

    .line 207
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_1
    .end packed-switch
.end method
