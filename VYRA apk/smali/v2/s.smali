.class public final Lv2/s;
.super Lv2/o;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public s:Lv2/f;

.field public t:Le/a0;

.field public u:Lq1/o;


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    move-object v1, p1

    .line 2
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_c

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_c

    .line 17
    .line 18
    iget-object v0, p0, Lv2/o;->q:Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto/16 :goto_7

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lv2/o;->h:Lv2/a;

    .line 29
    .line 30
    const/high16 v6, 0x3f800000    # 1.0f

    .line 31
    .line 32
    iget-object v8, p0, Lv2/o;->g:Lv2/l;

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lv2/o;->f:Landroid/content/Context;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v2, "animator_duration_scale"

    .line 44
    .line 45
    invoke-static {v0, v2, v6}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v2, 0x0

    .line 50
    cmpl-float v0, v0, v2

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Lv2/s;->u:Lq1/o;

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lv2/s;->u:Lq1/o;

    .line 66
    .line 67
    iget-object v2, v8, Lv2/l;->e:[I

    .line 68
    .line 69
    aget v2, v2, v9

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Lq1/o;->setTint(I)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lv2/s;->u:Lq1/o;

    .line 75
    .line 76
    invoke-virtual {v0, p1}, Lq1/o;->draw(Landroid/graphics/Canvas;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lv2/s;->s:Lv2/f;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {p0}, Lv2/o;->b()F

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    iget-object v4, p0, Lv2/o;->i:Landroid/animation/ObjectAnimator;

    .line 94
    .line 95
    const/4 v7, 0x1

    .line 96
    if-eqz v4, :cond_3

    .line 97
    .line 98
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_2

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    move v4, v7

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    :goto_0
    move v4, v9

    .line 108
    :goto_1
    iget-object v5, p0, Lv2/o;->j:Landroid/animation/ObjectAnimator;

    .line 109
    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-nez v5, :cond_4

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    move v5, v7

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    :goto_2
    move v5, v9

    .line 122
    :goto_3
    invoke-virtual/range {v0 .. v5}, Lv2/r;->b(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    .line 123
    .line 124
    .line 125
    iget v10, v8, Lv2/l;->i:I

    .line 126
    .line 127
    move v0, v6

    .line 128
    iget v6, p0, Lv2/o;->p:I

    .line 129
    .line 130
    instance-of v1, v8, Lv2/l;

    .line 131
    .line 132
    if-eqz v1, :cond_6

    .line 133
    .line 134
    iget-boolean v1, v8, Lv2/l;->u:Z

    .line 135
    .line 136
    if-eqz v1, :cond_6

    .line 137
    .line 138
    move v11, v7

    .line 139
    goto :goto_4

    .line 140
    :cond_6
    move v11, v9

    .line 141
    :goto_4
    if-eqz v11, :cond_7

    .line 142
    .line 143
    if-nez v10, :cond_7

    .line 144
    .line 145
    invoke-virtual {v8, v9}, Lv2/l;->a(Z)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_7

    .line 150
    .line 151
    move v12, v7

    .line 152
    goto :goto_5

    .line 153
    :cond_7
    move v12, v9

    .line 154
    :goto_5
    iget-object v2, p0, Lv2/o;->o:Landroid/graphics/Paint;

    .line 155
    .line 156
    if-eqz v12, :cond_9

    .line 157
    .line 158
    iget-object v0, p0, Lv2/s;->s:Lv2/f;

    .line 159
    .line 160
    iget v5, v8, Lv2/l;->f:I

    .line 161
    .line 162
    const/4 v7, 0x0

    .line 163
    const/4 v3, 0x0

    .line 164
    const/high16 v4, 0x3f800000    # 1.0f

    .line 165
    .line 166
    move-object v1, p1

    .line 167
    invoke-virtual/range {v0 .. v7}, Lv2/f;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 168
    .line 169
    .line 170
    :cond_8
    move v7, v10

    .line 171
    goto :goto_6

    .line 172
    :cond_9
    move-object v1, p1

    .line 173
    if-eqz v11, :cond_8

    .line 174
    .line 175
    iget-object v3, p0, Lv2/s;->t:Le/a0;

    .line 176
    .line 177
    iget-object v3, v3, Le/a0;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v3, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Lv2/p;

    .line 186
    .line 187
    iget-object v4, p0, Lv2/s;->t:Le/a0;

    .line 188
    .line 189
    iget-object v4, v4, Le/a0;->b:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v4, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    sub-int/2addr v5, v7

    .line 198
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, Lv2/p;

    .line 203
    .line 204
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 205
    .line 206
    .line 207
    iget v5, v4, Lv2/p;->f:F

    .line 208
    .line 209
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 210
    .line 211
    .line 212
    move v5, v0

    .line 213
    iget-object v0, p0, Lv2/s;->s:Lv2/f;

    .line 214
    .line 215
    iget v4, v4, Lv2/p;->b:F

    .line 216
    .line 217
    iget v3, v3, Lv2/p;->a:F

    .line 218
    .line 219
    add-float/2addr v3, v5

    .line 220
    iget v5, v8, Lv2/l;->f:I

    .line 221
    .line 222
    move v7, v4

    .line 223
    move v4, v3

    .line 224
    move v3, v7

    .line 225
    move v7, v10

    .line 226
    invoke-virtual/range {v0 .. v7}, Lv2/f;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 230
    .line 231
    .line 232
    :goto_6
    iget-object v0, p0, Lv2/s;->t:Le/a0;

    .line 233
    .line 234
    iget-object v0, v0, Le/a0;->b:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-ge v9, v0, :cond_b

    .line 243
    .line 244
    iget-object v0, p0, Lv2/s;->t:Le/a0;

    .line 245
    .line 246
    iget-object v0, v0, Le/a0;->b:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    check-cast v0, Lv2/p;

    .line 255
    .line 256
    invoke-virtual {p0}, Lv2/o;->c()F

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    iput v3, v0, Lv2/p;->e:F

    .line 261
    .line 262
    iget-object v3, p0, Lv2/s;->s:Lv2/f;

    .line 263
    .line 264
    iget v4, p0, Lv2/o;->p:I

    .line 265
    .line 266
    invoke-virtual {v3, p1, v2, v0, v4}, Lv2/f;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lv2/p;I)V

    .line 267
    .line 268
    .line 269
    if-lez v9, :cond_a

    .line 270
    .line 271
    if-nez v12, :cond_a

    .line 272
    .line 273
    if-eqz v11, :cond_a

    .line 274
    .line 275
    iget-object v3, p0, Lv2/s;->t:Le/a0;

    .line 276
    .line 277
    iget-object v3, v3, Le/a0;->b:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v3, Ljava/util/ArrayList;

    .line 280
    .line 281
    add-int/lit8 v4, v9, -0x1

    .line 282
    .line 283
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    check-cast v3, Lv2/p;

    .line 288
    .line 289
    iget-object v4, p0, Lv2/s;->s:Lv2/f;

    .line 290
    .line 291
    iget v3, v3, Lv2/p;->b:F

    .line 292
    .line 293
    iget v0, v0, Lv2/p;->a:F

    .line 294
    .line 295
    iget v5, v8, Lv2/l;->f:I

    .line 296
    .line 297
    move-object v13, v4

    .line 298
    move v4, v0

    .line 299
    move-object v0, v13

    .line 300
    invoke-virtual/range {v0 .. v7}, Lv2/f;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 301
    .line 302
    .line 303
    :cond_a
    add-int/lit8 v9, v9, 0x1

    .line 304
    .line 305
    move-object v1, p1

    .line 306
    goto :goto_6

    .line 307
    :cond_b
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 308
    .line 309
    .line 310
    :cond_c
    :goto_7
    return-void
.end method

.method public final e(ZZZ)Z
    .locals 4

    .line 1
    invoke-super {p0, p1, p2, p3}, Lv2/o;->e(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lv2/o;->h:Lv2/a;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lv2/o;->f:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "animator_duration_scale"

    .line 16
    .line 17
    const/high16 v3, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-static {v1, v2, v3}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    cmpl-float v1, v1, v2

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lv2/s;->u:Lq1/o;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1, p1, p2}, Lq1/o;->setVisible(ZZ)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_0
    invoke-virtual {p0}, Lv2/o;->isRunning()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    iget-object p2, p0, Lv2/s;->t:Le/a0;

    .line 44
    .line 45
    invoke-virtual {p2}, Le/a0;->c()V

    .line 46
    .line 47
    .line 48
    :cond_1
    if-eqz p1, :cond_3

    .line 49
    .line 50
    if-nez p3, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget-object p1, p0, Lv2/s;->t:Le/a0;

    .line 54
    .line 55
    invoke-virtual {p1}, Le/a0;->n()V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_0
    return v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/s;->s:Lv2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv2/f;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/s;->s:Lv2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv2/f;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
