.class public abstract Lw0/b;
.super Lp0/b;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final n:Landroid/graphics/Rect;

.field public static final o:La3/f;

.field public static final p:La3/f;


# instance fields
.field public final d:Landroid/graphics/Rect;

.field public final e:Landroid/graphics/Rect;

.field public final f:Landroid/graphics/Rect;

.field public final g:[I

.field public final h:Landroid/view/accessibility/AccessibilityManager;

.field public final i:Lcom/google/android/material/chip/Chip;

.field public j:Lw0/a;

.field public k:I

.field public l:I

.field public m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    const/high16 v2, -0x80000000

    .line 7
    .line 8
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lw0/b;->n:Landroid/graphics/Rect;

    .line 12
    .line 13
    new-instance v0, La3/f;

    .line 14
    .line 15
    const/16 v1, 0x18

    .line 16
    .line 17
    invoke-direct {v0, v1}, La3/f;-><init>(I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lw0/b;->o:La3/f;

    .line 21
    .line 22
    new-instance v0, La3/f;

    .line 23
    .line 24
    const/16 v1, 0x19

    .line 25
    .line 26
    invoke-direct {v0, v1}, La3/f;-><init>(I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lw0/b;->p:La3/f;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/chip/Chip;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lp0/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lw0/b;->d:Landroid/graphics/Rect;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lw0/b;->e:Landroid/graphics/Rect;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lw0/b;->f:Landroid/graphics/Rect;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    iput-object v0, p0, Lw0/b;->g:[I

    .line 29
    .line 30
    const/high16 v0, -0x80000000

    .line 31
    .line 32
    iput v0, p0, Lw0/b;->k:I

    .line 33
    .line 34
    iput v0, p0, Lw0/b;->l:I

    .line 35
    .line 36
    iput v0, p0, Lw0/b;->m:I

    .line 37
    .line 38
    iput-object p1, p0, Lw0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "accessibility"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 51
    .line 52
    iput-object v0, p0, Lw0/b;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_0

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 65
    .line 66
    .line 67
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)La3/h0;
    .locals 0

    .line 1
    iget-object p1, p0, Lw0/b;->j:Lw0/a;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lw0/a;

    .line 6
    .line 7
    invoke-direct {p1, p0}, Lw0/a;-><init>(Lw0/b;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lw0/b;->j:Lw0/a;

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lw0/b;->j:Lw0/a;

    .line 13
    .line 14
    return-object p1
.end method

.method public final d(Landroid/view/View;Lq0/e;)V
    .locals 2

    .line 1
    iget-object v0, p2, Lq0/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    iget-object v1, p0, Lp0/b;->a:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v1, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    move-object p1, p0

    .line 9
    check-cast p1, Ll2/c;

    .line 10
    .line 11
    iget-object p1, p1, Ll2/c;->q:Lcom/google/android/material/chip/Chip;

    .line 12
    .line 13
    iget-object v1, p1, Lcom/google/android/material/chip/Chip;->j:Ll2/d;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-boolean v1, v1, Ll2/d;->f0:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/google/android/material/chip/Chip;->getAccessibilityClassName()Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p2, v0}, Lq0/e;->g(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p2, p1}, Lq0/e;->j(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final j(I)Z
    .locals 2

    .line 1
    iget v0, p0, Lw0/b;->l:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    iput v0, p0, Lw0/b;->l:I

    .line 10
    .line 11
    invoke-virtual {p0, p1, v1}, Lw0/b;->p(IZ)V

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Lw0/b;->r(II)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1
.end method

.method public final k(I)Lq0/e;
    .locals 10

    .line 1
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lq0/e;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lq0/e;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 15
    .line 16
    .line 17
    const-string v3, "android.view.View"

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Lq0/e;->g(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    sget-object v3, Lw0/b;->n:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    iget-object v4, p0, Lw0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, v1}, Lw0/b;->o(ILq0/e;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lq0/e;->f()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    if-eqz v5, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 52
    .line 53
    const-string v0, "Callbacks must add text or a content description in populateNodeForVirtualViewId()"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_1
    :goto_0
    iget-object v5, p0, Lw0/b;->e:Landroid/graphics/Rect;

    .line 60
    .line 61
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInParent(Landroid/graphics/Rect;)V

    .line 62
    .line 63
    .line 64
    iget-object v6, p0, Lw0/b;->d:Landroid/graphics/Rect;

    .line 65
    .line 66
    invoke-virtual {v0, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_3

    .line 74
    .line 75
    invoke-virtual {v6, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-nez v7, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 83
    .line 84
    const-string v0, "Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()"

    .line 85
    .line 86
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_3
    :goto_1
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getActions()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    and-int/lit8 v8, v7, 0x40

    .line 95
    .line 96
    if-nez v8, :cond_f

    .line 97
    .line 98
    const/16 v8, 0x80

    .line 99
    .line 100
    and-int/2addr v7, v8

    .line 101
    if-nez v7, :cond_e

    .line 102
    .line 103
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v0, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    .line 114
    iput p1, v1, Lq0/e;->b:I

    .line 115
    .line 116
    invoke-virtual {v0, v4, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 117
    .line 118
    .line 119
    iget v7, p0, Lw0/b;->k:I

    .line 120
    .line 121
    const/4 v9, 0x0

    .line 122
    if-ne v7, p1, :cond_4

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v8}, Lq0/e;->a(I)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    invoke-virtual {v0, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 132
    .line 133
    .line 134
    const/16 v7, 0x40

    .line 135
    .line 136
    invoke-virtual {v1, v7}, Lq0/e;->a(I)V

    .line 137
    .line 138
    .line 139
    :goto_2
    iget v7, p0, Lw0/b;->l:I

    .line 140
    .line 141
    if-ne v7, p1, :cond_5

    .line 142
    .line 143
    move p1, v2

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move p1, v9

    .line 146
    :goto_3
    if-eqz p1, :cond_6

    .line 147
    .line 148
    const/4 v7, 0x2

    .line 149
    invoke-virtual {v1, v7}, Lq0/e;->a(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    if-eqz v7, :cond_7

    .line 158
    .line 159
    invoke-virtual {v1, v2}, Lq0/e;->a(I)V

    .line 160
    .line 161
    .line 162
    :cond_7
    :goto_4
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lw0/b;->g:[I

    .line 166
    .line 167
    invoke-virtual {v4, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_8

    .line 175
    .line 176
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 177
    .line 178
    .line 179
    new-instance v3, Landroid/graphics/Rect;

    .line 180
    .line 181
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v5}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 188
    .line 189
    .line 190
    aget v5, p1, v9

    .line 191
    .line 192
    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    sub-int/2addr v5, v7

    .line 197
    aget v7, p1, v2

    .line 198
    .line 199
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    sub-int/2addr v7, v8

    .line 204
    invoke-virtual {v3, v5, v7}, Landroid/graphics/Rect;->offset(II)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 211
    .line 212
    .line 213
    :cond_8
    iget-object v3, p0, Lw0/b;->f:Landroid/graphics/Rect;

    .line 214
    .line 215
    invoke-virtual {v4, v3}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_d

    .line 220
    .line 221
    aget v5, p1, v9

    .line 222
    .line 223
    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    sub-int/2addr v5, v7

    .line 228
    aget p1, p1, v2

    .line 229
    .line 230
    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    sub-int/2addr p1, v7

    .line 235
    invoke-virtual {v3, v5, p1}, Landroid/graphics/Rect;->offset(II)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v3}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    if-eqz p1, :cond_d

    .line 243
    .line 244
    invoke-virtual {v0, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, Landroid/graphics/Rect;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-eqz p1, :cond_9

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_9
    invoke-virtual {v4}, Landroid/view/View;->getWindowVisibility()I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-eqz p1, :cond_a

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_a
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    :goto_5
    instance-of v0, p1, Landroid/view/View;

    .line 266
    .line 267
    if-eqz v0, :cond_c

    .line 268
    .line 269
    check-cast p1, Landroid/view/View;

    .line 270
    .line 271
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    const/4 v3, 0x0

    .line 276
    cmpg-float v0, v0, v3

    .line 277
    .line 278
    if-lez v0, :cond_d

    .line 279
    .line 280
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_b

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    goto :goto_5

    .line 292
    :cond_c
    if-eqz p1, :cond_d

    .line 293
    .line 294
    iget-object p1, v1, Lq0/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 295
    .line 296
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 297
    .line 298
    .line 299
    :cond_d
    :goto_6
    return-object v1

    .line 300
    :cond_e
    new-instance p1, Ljava/lang/RuntimeException;

    .line 301
    .line 302
    const-string v0, "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    .line 303
    .line 304
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw p1

    .line 308
    :cond_f
    new-instance p1, Ljava/lang/RuntimeException;

    .line 309
    .line 310
    const-string v0, "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    .line 311
    .line 312
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw p1
.end method

.method public abstract l(Ljava/util/ArrayList;)V
.end method

.method public final m(ILandroid/graphics/Rect;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v3}, Lw0/b;->l(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    new-instance v4, Lp/l;

    .line 16
    .line 17
    invoke-direct {v4}, Lp/l;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-ge v6, v7, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    check-cast v7, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-virtual {v0, v7}, Lw0/b;->k(I)Lq0/e;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    check-cast v8, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    invoke-virtual {v4, v8, v7}, Lp/l;->b(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v6, v6, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget v3, v0, Lw0/b;->l:I

    .line 58
    .line 59
    const/high16 v7, -0x80000000

    .line 60
    .line 61
    if-ne v3, v7, :cond_1

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget-object v8, v4, Lp/l;->f:[I

    .line 66
    .line 67
    iget v9, v4, Lp/l;->h:I

    .line 68
    .line 69
    invoke-static {v9, v3, v8}, Lq/a;->a(II[I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-ltz v3, :cond_2

    .line 74
    .line 75
    iget-object v8, v4, Lp/l;->g:[Ljava/lang/Object;

    .line 76
    .line 77
    aget-object v3, v8, v3

    .line 78
    .line 79
    sget-object v8, Lp/i;->b:Ljava/lang/Object;

    .line 80
    .line 81
    if-ne v3, v8, :cond_3

    .line 82
    .line 83
    :cond_2
    const/4 v3, 0x0

    .line 84
    :cond_3
    check-cast v3, Lq0/e;

    .line 85
    .line 86
    :goto_1
    sget-object v8, Lw0/b;->o:La3/f;

    .line 87
    .line 88
    sget-object v9, Lw0/b;->p:La3/f;

    .line 89
    .line 90
    iget-object v10, v0, Lw0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 91
    .line 92
    const/4 v11, 0x2

    .line 93
    const/4 v12, -0x1

    .line 94
    const/4 v13, 0x1

    .line 95
    if-eq v1, v13, :cond_17

    .line 96
    .line 97
    if-eq v1, v11, :cond_17

    .line 98
    .line 99
    const/16 v11, 0x82

    .line 100
    .line 101
    const/16 v14, 0x42

    .line 102
    .line 103
    const/16 v15, 0x21

    .line 104
    .line 105
    const/16 v6, 0x11

    .line 106
    .line 107
    if-eq v1, v6, :cond_4

    .line 108
    .line 109
    if-eq v1, v15, :cond_4

    .line 110
    .line 111
    if-eq v1, v14, :cond_4

    .line 112
    .line 113
    if-ne v1, v11, :cond_5

    .line 114
    .line 115
    :cond_4
    move/from16 v17, v13

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    const-string v1, "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 119
    .line 120
    invoke-static {v1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :goto_2
    const/4 v1, 0x0

    .line 124
    return v1

    .line 125
    :goto_3
    new-instance v13, Landroid/graphics/Rect;

    .line 126
    .line 127
    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    .line 128
    .line 129
    .line 130
    iget v5, v0, Lw0/b;->l:I

    .line 131
    .line 132
    const-string v19, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    .line 133
    .line 134
    if-eq v5, v7, :cond_6

    .line 135
    .line 136
    invoke-virtual {v0, v5}, Lw0/b;->n(I)Lq0/e;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    iget-object v2, v2, Lq0/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 141
    .line 142
    invoke-virtual {v2, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    if-eqz v2, :cond_7

    .line 147
    .line 148
    invoke-virtual {v13, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-virtual {v10}, Landroid/view/View;->getHeight()I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eq v1, v6, :cond_b

    .line 161
    .line 162
    if-eq v1, v15, :cond_a

    .line 163
    .line 164
    if-eq v1, v14, :cond_9

    .line 165
    .line 166
    if-ne v1, v11, :cond_8

    .line 167
    .line 168
    const/4 v10, 0x0

    .line 169
    invoke-virtual {v13, v10, v12, v2, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_8
    invoke-static/range {v19 .. v19}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_9
    const/4 v10, 0x0

    .line 178
    invoke-virtual {v13, v12, v10, v12, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_a
    const/4 v10, 0x0

    .line 183
    invoke-virtual {v13, v10, v5, v2, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_b
    const/4 v10, 0x0

    .line 188
    invoke-virtual {v13, v2, v10, v2, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 189
    .line 190
    .line 191
    :goto_4
    new-instance v2, Landroid/graphics/Rect;

    .line 192
    .line 193
    invoke-direct {v2, v13}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 194
    .line 195
    .line 196
    if-eq v1, v6, :cond_f

    .line 197
    .line 198
    if-eq v1, v15, :cond_e

    .line 199
    .line 200
    if-eq v1, v14, :cond_d

    .line 201
    .line 202
    if-ne v1, v11, :cond_c

    .line 203
    .line 204
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    add-int/lit8 v5, v5, 0x1

    .line 209
    .line 210
    neg-int v5, v5

    .line 211
    const/4 v6, 0x0

    .line 212
    invoke-virtual {v2, v6, v5}, Landroid/graphics/Rect;->offset(II)V

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_c
    invoke-static/range {v19 .. v19}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_d
    const/4 v6, 0x0

    .line 221
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    add-int/lit8 v5, v5, 0x1

    .line 226
    .line 227
    neg-int v5, v5

    .line 228
    invoke-virtual {v2, v5, v6}, Landroid/graphics/Rect;->offset(II)V

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_e
    const/4 v6, 0x0

    .line 233
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    add-int/lit8 v5, v5, 0x1

    .line 238
    .line 239
    invoke-virtual {v2, v6, v5}, Landroid/graphics/Rect;->offset(II)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_f
    const/4 v6, 0x0

    .line 244
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    add-int/lit8 v5, v5, 0x1

    .line 249
    .line 250
    invoke-virtual {v2, v5, v6}, Landroid/graphics/Rect;->offset(II)V

    .line 251
    .line 252
    .line 253
    :goto_5
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget v5, v4, Lp/l;->h:I

    .line 257
    .line 258
    new-instance v9, Landroid/graphics/Rect;

    .line 259
    .line 260
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 261
    .line 262
    .line 263
    move v10, v6

    .line 264
    const/16 v16, 0x0

    .line 265
    .line 266
    :goto_6
    if-ge v10, v5, :cond_16

    .line 267
    .line 268
    iget-object v11, v4, Lp/l;->g:[Ljava/lang/Object;

    .line 269
    .line 270
    aget-object v11, v11, v10

    .line 271
    .line 272
    check-cast v11, Lq0/e;

    .line 273
    .line 274
    if-ne v11, v3, :cond_10

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_10
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    iget-object v14, v11, Lq0/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 281
    .line 282
    invoke-virtual {v14, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v1, v13, v9}, Lt1/l;->i(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 286
    .line 287
    .line 288
    move-result v14

    .line 289
    if-nez v14, :cond_11

    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_11
    invoke-static {v1, v13, v2}, Lt1/l;->i(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 293
    .line 294
    .line 295
    move-result v14

    .line 296
    if-nez v14, :cond_12

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_12
    invoke-static {v1, v13, v9, v2}, Lt1/l;->c(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 300
    .line 301
    .line 302
    move-result v14

    .line 303
    if-eqz v14, :cond_13

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_13
    invoke-static {v1, v13, v2, v9}, Lt1/l;->c(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 307
    .line 308
    .line 309
    move-result v14

    .line 310
    if-eqz v14, :cond_14

    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_14
    invoke-static {v1, v13, v9}, Lt1/l;->j(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 314
    .line 315
    .line 316
    move-result v14

    .line 317
    invoke-static {v1, v13, v9}, Lt1/l;->k(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 318
    .line 319
    .line 320
    move-result v15

    .line 321
    mul-int/lit8 v17, v14, 0xd

    .line 322
    .line 323
    mul-int v17, v17, v14

    .line 324
    .line 325
    mul-int/2addr v15, v15

    .line 326
    add-int v15, v15, v17

    .line 327
    .line 328
    invoke-static {v1, v13, v2}, Lt1/l;->j(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 329
    .line 330
    .line 331
    move-result v14

    .line 332
    invoke-static {v1, v13, v2}, Lt1/l;->k(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    .line 333
    .line 334
    .line 335
    move-result v17

    .line 336
    mul-int/lit8 v18, v14, 0xd

    .line 337
    .line 338
    mul-int v18, v18, v14

    .line 339
    .line 340
    mul-int v17, v17, v17

    .line 341
    .line 342
    add-int v14, v17, v18

    .line 343
    .line 344
    if-ge v15, v14, :cond_15

    .line 345
    .line 346
    :goto_7
    invoke-virtual {v2, v9}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 347
    .line 348
    .line 349
    move-object/from16 v16, v11

    .line 350
    .line 351
    :cond_15
    :goto_8
    add-int/lit8 v10, v10, 0x1

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_16
    :goto_9
    move-object/from16 v1, v16

    .line 355
    .line 356
    goto/16 :goto_11

    .line 357
    .line 358
    :cond_17
    move/from16 v17, v13

    .line 359
    .line 360
    const/4 v6, 0x0

    .line 361
    invoke-virtual {v10}, Landroid/view/View;->getLayoutDirection()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    move/from16 v5, v17

    .line 366
    .line 367
    if-ne v2, v5, :cond_18

    .line 368
    .line 369
    const/4 v2, 0x1

    .line 370
    goto :goto_a

    .line 371
    :cond_18
    move v2, v6

    .line 372
    :goto_a
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    iget v5, v4, Lp/l;->h:I

    .line 376
    .line 377
    new-instance v9, Ljava/util/ArrayList;

    .line 378
    .line 379
    invoke-direct {v9, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 380
    .line 381
    .line 382
    move v10, v6

    .line 383
    :goto_b
    if-ge v10, v5, :cond_19

    .line 384
    .line 385
    iget-object v13, v4, Lp/l;->g:[Ljava/lang/Object;

    .line 386
    .line 387
    aget-object v13, v13, v10

    .line 388
    .line 389
    check-cast v13, Lq0/e;

    .line 390
    .line 391
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    add-int/lit8 v10, v10, 0x1

    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_19
    new-instance v5, Lw0/c;

    .line 398
    .line 399
    invoke-direct {v5, v2, v8}, Lw0/c;-><init>(ZLa3/f;)V

    .line 400
    .line 401
    .line 402
    invoke-static {v9, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 403
    .line 404
    .line 405
    const/4 v5, 0x1

    .line 406
    if-eq v1, v5, :cond_1d

    .line 407
    .line 408
    if-ne v1, v11, :cond_1c

    .line 409
    .line 410
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-nez v3, :cond_1a

    .line 415
    .line 416
    move v2, v12

    .line 417
    goto :goto_c

    .line 418
    :cond_1a
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    :goto_c
    add-int/2addr v2, v5

    .line 423
    if-ge v2, v1, :cond_1b

    .line 424
    .line 425
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    :goto_d
    move-object/from16 v16, v1

    .line 430
    .line 431
    goto :goto_10

    .line 432
    :cond_1b
    const/16 v16, 0x0

    .line 433
    .line 434
    goto :goto_10

    .line 435
    :cond_1c
    const-string v1, "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."

    .line 436
    .line 437
    invoke-static {v1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    goto/16 :goto_2

    .line 441
    .line 442
    :cond_1d
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-nez v3, :cond_1e

    .line 447
    .line 448
    :goto_e
    const/16 v17, 0x1

    .line 449
    .line 450
    goto :goto_f

    .line 451
    :cond_1e
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    goto :goto_e

    .line 456
    :goto_f
    add-int/lit8 v1, v1, -0x1

    .line 457
    .line 458
    if-ltz v1, :cond_1b

    .line 459
    .line 460
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    goto :goto_d

    .line 465
    :goto_10
    check-cast v16, Lq0/e;

    .line 466
    .line 467
    goto :goto_9

    .line 468
    :goto_11
    if-nez v1, :cond_1f

    .line 469
    .line 470
    goto :goto_14

    .line 471
    :cond_1f
    iget v2, v4, Lp/l;->h:I

    .line 472
    .line 473
    move v5, v6

    .line 474
    :goto_12
    if-ge v5, v2, :cond_21

    .line 475
    .line 476
    iget-object v3, v4, Lp/l;->g:[Ljava/lang/Object;

    .line 477
    .line 478
    aget-object v3, v3, v5

    .line 479
    .line 480
    if-ne v3, v1, :cond_20

    .line 481
    .line 482
    move v12, v5

    .line 483
    goto :goto_13

    .line 484
    :cond_20
    add-int/lit8 v5, v5, 0x1

    .line 485
    .line 486
    goto :goto_12

    .line 487
    :cond_21
    :goto_13
    iget-object v1, v4, Lp/l;->f:[I

    .line 488
    .line 489
    aget v7, v1, v12

    .line 490
    .line 491
    :goto_14
    invoke-virtual {v0, v7}, Lw0/b;->q(I)Z

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    return v1
.end method

.method public final n(I)Lq0/e;
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_3

    .line 3
    .line 4
    iget-object p1, p0, Lw0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lq0/e;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lq0/e;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/google/android/material/chip/Chip;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lw0/b;->l(Ljava/util/ArrayList;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-gtz v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    const-string v0, "Views cannot have both real and virtual children"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, 0x0

    .line 54
    :goto_1
    if-ge v3, v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget-object v5, v1, Lq0/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 67
    .line 68
    invoke-virtual {v5, p1, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    return-object v1

    .line 75
    :cond_3
    invoke-virtual {p0, p1}, Lw0/b;->k(I)Lq0/e;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

.method public abstract o(ILq0/e;)V
.end method

.method public abstract p(IZ)V
.end method

.method public final q(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget v0, p0, Lw0/b;->l:I

    .line 17
    .line 18
    if-ne v0, p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/high16 v1, -0x80000000

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lw0/b;->j(I)Z

    .line 26
    .line 27
    .line 28
    :cond_2
    if-ne p1, v1, :cond_3

    .line 29
    .line 30
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :cond_3
    iput p1, p0, Lw0/b;->l:I

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p0, p1, v0}, Lw0/b;->p(IZ)V

    .line 36
    .line 37
    .line 38
    const/16 v1, 0x8

    .line 39
    .line 40
    invoke-virtual {p0, p1, v1}, Lw0/b;->r(II)V

    .line 41
    .line 42
    .line 43
    return v0
.end method

.method public final r(II)V
    .locals 5

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lw0/b;->h:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lw0/b;->i:Lcom/google/android/material/chip/Chip;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    const/4 v2, -0x1

    .line 25
    if-eq p1, v2, :cond_4

    .line 26
    .line 27
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p0, p1}, Lw0/b;->n(I)Lq0/e;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2}, Lq0/e;->f()Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v2, v2, Lq0/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isScrollable()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isPassword()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isEnabled()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-eqz v3, :cond_2

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 101
    .line 102
    const-string p2, "Callbacks must add text or a content description in populateEventForVirtualViewId()"

    .line 103
    .line 104
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_3
    :goto_0
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {p2, v2}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {v0, p2}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 135
    .line 136
    .line 137
    :goto_1
    invoke-interface {v1, v0, p2}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 138
    .line 139
    .line 140
    :cond_5
    :goto_2
    return-void
.end method
