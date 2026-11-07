.class public final Ln2/b;
.super Le/f;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final h:La3/j;

.field public final i:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f04036f

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lt1/l;->p(Landroid/content/res/Resources$Theme;I)Landroid/util/TypedValue;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 18
    .line 19
    :goto_0
    new-array v3, v2, [I

    .line 20
    .line 21
    const v4, 0x7f040030

    .line 22
    .line 23
    .line 24
    const v5, 0x7f12014a

    .line 25
    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-static {v4, v5, p1, v6, v3}, Lf3/a;->a(IILandroid/content/Context;Landroid/util/AttributeSet;[I)Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    new-instance v7, Li/c;

    .line 36
    .line 37
    invoke-direct {v7, v3, v0}, Li/c;-><init>(Landroid/content/Context;I)V

    .line 38
    .line 39
    .line 40
    move-object v3, v7

    .line 41
    :goto_1
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1, v1}, Lt1/l;->p(Landroid/content/res/Resources$Theme;I)Landroid/util/TypedValue;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    move p1, v2

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    iget p1, p1, Landroid/util/TypedValue;->data:I

    .line 54
    .line 55
    :goto_2
    invoke-direct {p0, v3, p1}, Le/f;-><init>(Landroid/content/Context;I)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Le/f;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Le/b;

    .line 61
    .line 62
    iget-object v7, p1, Le/b;->a:Landroid/view/ContextThemeWrapper;

    .line 63
    .line 64
    invoke-virtual {v7}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-array v12, v2, [I

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    const v10, 0x7f040030

    .line 72
    .line 73
    .line 74
    const v11, 0x7f12014a

    .line 75
    .line 76
    .line 77
    invoke-static {v7, v8, v10, v11}, Lr2/a0;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 78
    .line 79
    .line 80
    sget-object v9, La2/a;->p:[I

    .line 81
    .line 82
    invoke-static/range {v7 .. v12}, Lr2/a0;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v8, v9, v10, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const v3, 0x7f07039a

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    const/4 v3, 0x2

    .line 101
    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const v8, 0x7f07039b

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    const/4 v8, 0x3

    .line 117
    invoke-virtual {v0, v8, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    const v10, 0x7f070399

    .line 126
    .line 127
    .line 128
    invoke-virtual {v8, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    const/4 v10, 0x1

    .line 133
    invoke-virtual {v0, v10, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    const v12, 0x7f070398

    .line 142
    .line 143
    .line 144
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    invoke-virtual {v0, v2, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-ne v0, v10, :cond_3

    .line 168
    .line 169
    move v11, v8

    .line 170
    goto :goto_3

    .line 171
    :cond_3
    move v11, v1

    .line 172
    :goto_3
    if-ne v0, v10, :cond_4

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_4
    move v1, v8

    .line 176
    :goto_4
    new-instance v0, Landroid/graphics/Rect;

    .line 177
    .line 178
    invoke-direct {v0, v11, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 179
    .line 180
    .line 181
    iput-object v0, p0, Ln2/b;->i:Landroid/graphics/Rect;

    .line 182
    .line 183
    const-class v0, Ln2/b;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    const v1, 0x7f04013b

    .line 190
    .line 191
    .line 192
    invoke-static {v7, v1, v0}, Lt1/l;->r(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v7, v0}, Le4/a;->a0(Landroid/content/Context;Landroid/util/TypedValue;)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    invoke-virtual {v7, v6, v9, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    const/4 v2, 0x4

    .line 205
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 210
    .line 211
    .line 212
    new-instance v1, La3/j;

    .line 213
    .line 214
    invoke-direct {v1, v7, v6, v4, v5}, La3/j;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v7}, La3/j;->n(Landroid/content/Context;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v1, v0}, La3/j;->r(Landroid/content/res/ColorStateList;)V

    .line 225
    .line 226
    .line 227
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 228
    .line 229
    const/16 v2, 0x1c

    .line 230
    .line 231
    if-lt v0, v2, :cond_5

    .line 232
    .line 233
    new-instance v0, Landroid/util/TypedValue;

    .line 234
    .line 235
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 236
    .line 237
    .line 238
    const v2, 0x1010571

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, v2, v0, v10}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 242
    .line 243
    .line 244
    iget-object p1, p0, Le/f;->g:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p1, Le/b;

    .line 247
    .line 248
    iget-object p1, p1, Le/b;->a:Landroid/view/ContextThemeWrapper;

    .line 249
    .line 250
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {v0, p1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    iget v0, v0, Landroid/util/TypedValue;->type:I

    .line 263
    .line 264
    const/4 v2, 0x5

    .line 265
    if-ne v0, v2, :cond_5

    .line 266
    .line 267
    const/4 v0, 0x0

    .line 268
    cmpl-float v0, p1, v0

    .line 269
    .line 270
    if-ltz v0, :cond_5

    .line 271
    .line 272
    iget-object v0, v1, La3/j;->g:La3/h;

    .line 273
    .line 274
    iget-object v0, v0, La3/h;->a:La3/m;

    .line 275
    .line 276
    invoke-interface {v0, p1}, La3/m;->a(F)La3/o;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-virtual {v1, p1}, La3/j;->setShapeAppearanceModel(La3/o;)V

    .line 281
    .line 282
    .line 283
    :cond_5
    iput-object v1, p0, Ln2/b;->h:La3/j;

    .line 284
    .line 285
    return-void
.end method


# virtual methods
.method public final a()Le/g;
    .locals 10

    .line 1
    invoke-super {p0}, Le/f;->a()Le/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v4, p0, Ln2/b;->h:La3/j;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getElevation()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v4, v3}, La3/j;->q(F)V

    .line 22
    .line 23
    .line 24
    :cond_0
    new-instance v3, Landroid/graphics/drawable/InsetDrawable;

    .line 25
    .line 26
    iget-object v9, p0, Ln2/b;->i:Landroid/graphics/Rect;

    .line 27
    .line 28
    iget v5, v9, Landroid/graphics/Rect;->left:I

    .line 29
    .line 30
    iget v6, v9, Landroid/graphics/Rect;->top:I

    .line 31
    .line 32
    iget v7, v9, Landroid/graphics/Rect;->right:I

    .line 33
    .line 34
    iget v8, v9, Landroid/graphics/Rect;->bottom:I

    .line 35
    .line 36
    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Ln2/a;

    .line 43
    .line 44
    invoke-direct {v1, v0, v9}, Ln2/a;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method
