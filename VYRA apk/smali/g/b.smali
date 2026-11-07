.class public final Lg/b;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final m:F


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:Z

.field public final g:Landroid/graphics/Path;

.field public final h:I

.field public i:Z

.field public j:F

.field public final k:F

.field public final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0x4046800000000000L    # 45.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    double-to-float v0, v0

    .line 11
    sput v0, Lg/b;->m:F

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg/b;->a:Landroid/graphics/Paint;

    .line 10
    .line 11
    new-instance v1, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lg/b;->g:Landroid/graphics/Path;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-boolean v1, p0, Lg/b;->i:Z

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    iput v2, p0, Lg/b;->l:I

    .line 23
    .line 24
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 27
    .line 28
    .line 29
    sget-object v3, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 32
    .line 33
    .line 34
    sget-object v3, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 37
    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const v4, 0x7f0401cc

    .line 48
    .line 49
    .line 50
    const v5, 0x7f1200e2

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    sget-object v7, Ld/a;->n:[I

    .line 55
    .line 56
    invoke-virtual {p1, v6, v7, v4, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const/4 v4, 0x3

    .line 61
    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eq v4, v5, :cond_0

    .line 70
    .line 71
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 75
    .line 76
    .line 77
    :cond_0
    const/4 v4, 0x7

    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    cmpl-float v6, v6, v4

    .line 88
    .line 89
    if-eqz v6, :cond_1

    .line 90
    .line 91
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 92
    .line 93
    .line 94
    const/high16 v0, 0x40000000    # 2.0f

    .line 95
    .line 96
    div-float/2addr v4, v0

    .line 97
    float-to-double v6, v4

    .line 98
    sget v0, Lg/b;->m:F

    .line 99
    .line 100
    float-to-double v8, v0

    .line 101
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 102
    .line 103
    .line 104
    move-result-wide v8

    .line 105
    mul-double/2addr v8, v6

    .line 106
    double-to-float v0, v8

    .line 107
    iput v0, p0, Lg/b;->k:F

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 110
    .line 111
    .line 112
    :cond_1
    const/4 v0, 0x6

    .line 113
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget-boolean v4, p0, Lg/b;->f:Z

    .line 118
    .line 119
    if-eq v4, v0, :cond_2

    .line 120
    .line 121
    iput-boolean v0, p0, Lg/b;->f:Z

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 124
    .line 125
    .line 126
    :cond_2
    const/4 v0, 0x5

    .line 127
    invoke-virtual {p1, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    int-to-float v0, v0

    .line 136
    iget v4, p0, Lg/b;->e:F

    .line 137
    .line 138
    cmpl-float v4, v0, v4

    .line 139
    .line 140
    if-eqz v4, :cond_3

    .line 141
    .line 142
    iput v0, p0, Lg/b;->e:F

    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 145
    .line 146
    .line 147
    :cond_3
    const/4 v0, 0x4

    .line 148
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    iput v0, p0, Lg/b;->h:I

    .line 153
    .line 154
    invoke-virtual {p1, v2, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    int-to-float v0, v0

    .line 163
    iput v0, p0, Lg/b;->c:F

    .line 164
    .line 165
    invoke-virtual {p1, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    int-to-float v0, v0

    .line 174
    iput v0, p0, Lg/b;->b:F

    .line 175
    .line 176
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    iput v0, p0, Lg/b;->d:F

    .line 181
    .line 182
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public static a(FFF)F
    .locals 0

    .line 1
    sub-float/2addr p1, p0

    .line 2
    mul-float/2addr p1, p2

    .line 3
    add-float/2addr p1, p0

    .line 4
    return p1
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    iget v5, v0, Lg/b;->l:I

    .line 12
    .line 13
    if-eqz v5, :cond_2

    .line 14
    .line 15
    if-eq v5, v4, :cond_1

    .line 16
    .line 17
    const/4 v6, 0x3

    .line 18
    if-eq v5, v6, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-ne v5, v4, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_2

    .line 32
    .line 33
    :cond_1
    :goto_0
    move v3, v4

    .line 34
    :cond_2
    iget v5, v0, Lg/b;->b:F

    .line 35
    .line 36
    mul-float/2addr v5, v5

    .line 37
    const/high16 v6, 0x40000000    # 2.0f

    .line 38
    .line 39
    mul-float/2addr v5, v6

    .line 40
    float-to-double v7, v5

    .line 41
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    double-to-float v5, v7

    .line 46
    iget v7, v0, Lg/b;->j:F

    .line 47
    .line 48
    iget v8, v0, Lg/b;->c:F

    .line 49
    .line 50
    invoke-static {v8, v5, v7}, Lg/b;->a(FFF)F

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    iget v7, v0, Lg/b;->d:F

    .line 55
    .line 56
    iget v9, v0, Lg/b;->j:F

    .line 57
    .line 58
    invoke-static {v8, v7, v9}, Lg/b;->a(FFF)F

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    iget v8, v0, Lg/b;->k:F

    .line 63
    .line 64
    iget v9, v0, Lg/b;->j:F

    .line 65
    .line 66
    const/4 v10, 0x0

    .line 67
    invoke-static {v10, v8, v9}, Lg/b;->a(FFF)F

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    int-to-float v8, v8

    .line 76
    sget v9, Lg/b;->m:F

    .line 77
    .line 78
    iget v11, v0, Lg/b;->j:F

    .line 79
    .line 80
    invoke-static {v10, v9, v11}, Lg/b;->a(FFF)F

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    move v11, v10

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const/high16 v11, -0x3ccc0000    # -180.0f

    .line 89
    .line 90
    :goto_1
    if-eqz v3, :cond_4

    .line 91
    .line 92
    const/high16 v13, 0x43340000    # 180.0f

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move v13, v10

    .line 96
    :goto_2
    iget v14, v0, Lg/b;->j:F

    .line 97
    .line 98
    invoke-static {v11, v13, v14}, Lg/b;->a(FFF)F

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    float-to-double v13, v5

    .line 103
    float-to-double v4, v9

    .line 104
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 105
    .line 106
    .line 107
    move-result-wide v15

    .line 108
    mul-double/2addr v15, v13

    .line 109
    move-wide/from16 v17, v13

    .line 110
    .line 111
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->round(D)J

    .line 112
    .line 113
    .line 114
    move-result-wide v12

    .line 115
    long-to-float v12, v12

    .line 116
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 117
    .line 118
    .line 119
    move-result-wide v4

    .line 120
    mul-double v4, v4, v17

    .line 121
    .line 122
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    long-to-float v4, v4

    .line 127
    iget-object v5, v0, Lg/b;->g:Landroid/graphics/Path;

    .line 128
    .line 129
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 130
    .line 131
    .line 132
    iget v13, v0, Lg/b;->e:F

    .line 133
    .line 134
    iget-object v14, v0, Lg/b;->a:Landroid/graphics/Paint;

    .line 135
    .line 136
    invoke-virtual {v14}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 137
    .line 138
    .line 139
    move-result v15

    .line 140
    add-float/2addr v13, v15

    .line 141
    move v15, v6

    .line 142
    iget v6, v0, Lg/b;->k:F

    .line 143
    .line 144
    neg-float v6, v6

    .line 145
    iget v9, v0, Lg/b;->j:F

    .line 146
    .line 147
    invoke-static {v13, v6, v9}, Lg/b;->a(FFF)F

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    neg-float v9, v7

    .line 152
    div-float/2addr v9, v15

    .line 153
    add-float v13, v9, v8

    .line 154
    .line 155
    invoke-virtual {v5, v13, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 156
    .line 157
    .line 158
    mul-float/2addr v8, v15

    .line 159
    sub-float/2addr v7, v8

    .line 160
    invoke-virtual {v5, v7, v10}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5, v9, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5, v12, v4}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 167
    .line 168
    .line 169
    neg-float v6, v6

    .line 170
    invoke-virtual {v5, v9, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 171
    .line 172
    .line 173
    neg-float v4, v4

    .line 174
    invoke-virtual {v5, v12, v4}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 181
    .line 182
    .line 183
    invoke-virtual {v14}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    int-to-float v6, v6

    .line 192
    const/high16 v7, 0x40400000    # 3.0f

    .line 193
    .line 194
    mul-float/2addr v7, v4

    .line 195
    sub-float/2addr v6, v7

    .line 196
    iget v7, v0, Lg/b;->e:F

    .line 197
    .line 198
    mul-float v8, v7, v15

    .line 199
    .line 200
    sub-float/2addr v6, v8

    .line 201
    float-to-int v6, v6

    .line 202
    div-int/lit8 v6, v6, 0x4

    .line 203
    .line 204
    mul-int/lit8 v6, v6, 0x2

    .line 205
    .line 206
    int-to-float v6, v6

    .line 207
    const/high16 v8, 0x3fc00000    # 1.5f

    .line 208
    .line 209
    mul-float/2addr v4, v8

    .line 210
    add-float/2addr v4, v7

    .line 211
    add-float/2addr v4, v6

    .line 212
    invoke-virtual {v2}, Landroid/graphics/Rect;->centerX()I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    int-to-float v2, v2

    .line 217
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 218
    .line 219
    .line 220
    iget-boolean v2, v0, Lg/b;->f:Z

    .line 221
    .line 222
    if-eqz v2, :cond_6

    .line 223
    .line 224
    iget-boolean v2, v0, Lg/b;->i:Z

    .line 225
    .line 226
    xor-int/2addr v2, v3

    .line 227
    if-eqz v2, :cond_5

    .line 228
    .line 229
    const/4 v4, -0x1

    .line 230
    goto :goto_3

    .line 231
    :cond_5
    const/4 v4, 0x1

    .line 232
    :goto_3
    int-to-float v2, v4

    .line 233
    mul-float/2addr v11, v2

    .line 234
    invoke-virtual {v1, v11}, Landroid/graphics/Canvas;->rotate(F)V

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_6
    if-eqz v3, :cond_7

    .line 239
    .line 240
    const/high16 v9, 0x43340000    # 180.0f

    .line 241
    .line 242
    invoke-virtual {v1, v9}, Landroid/graphics/Canvas;->rotate(F)V

    .line 243
    .line 244
    .line 245
    :cond_7
    :goto_4
    invoke-virtual {v1, v5, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 249
    .line 250
    .line 251
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lg/b;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lg/b;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
.end method

.method public final setAlpha(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eq p1, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg/b;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
