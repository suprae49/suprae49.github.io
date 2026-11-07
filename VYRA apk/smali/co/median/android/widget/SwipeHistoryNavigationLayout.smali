.class public final Lco/median/android/widget/SwipeHistoryNavigationLayout;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public A:Z

.field public B:F

.field public C:F

.field public D:Z

.field public E:Lw1/k;

.field public final f:Lw1/j;

.field public final g:Lw1/j;

.field public final h:Landroid/widget/EdgeEffect;

.field public final i:F

.field public final j:F

.field public k:I

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public final q:F

.field public final r:F

.field public final s:F

.field public final t:F

.field public u:I

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const v2, 0x7f0700a5

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->i:F

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 34
    .line 35
    int-to-float v2, v2

    .line 36
    const/16 v3, 0xa0

    .line 37
    .line 38
    int-to-float v3, v3

    .line 39
    div-float/2addr v2, v3

    .line 40
    div-float/2addr v1, v2

    .line 41
    iput v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->j:F

    .line 42
    .line 43
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 44
    .line 45
    iput v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->l:F

    .line 46
    .line 47
    iput v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->m:F

    .line 48
    .line 49
    iput v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->n:F

    .line 50
    .line 51
    iput v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->o:F

    .line 52
    .line 53
    iput v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->p:F

    .line 54
    .line 55
    const v2, 0x3d4ccccd    # 0.05f

    .line 56
    .line 57
    .line 58
    iput v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->q:F

    .line 59
    .line 60
    const v2, 0x3e23d70a    # 0.16f

    .line 61
    .line 62
    .line 63
    iput v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->r:F

    .line 64
    .line 65
    const/high16 v2, 0x42a00000    # 80.0f

    .line 66
    .line 67
    iput v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->s:F

    .line 68
    .line 69
    const/high16 v2, 0x41f00000    # 30.0f

    .line 70
    .line 71
    iput v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->t:F

    .line 72
    .line 73
    const/high16 v2, -0x80000000

    .line 74
    .line 75
    iput v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 76
    .line 77
    iput v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->y:F

    .line 78
    .line 79
    iput v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 80
    .line 81
    new-instance v1, La3/f;

    .line 82
    .line 83
    const/16 v2, 0x1a

    .line 84
    .line 85
    invoke-direct {v1, v2}, La3/f;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iput-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    sget-object v2, Lu1/m1;->a:[I

    .line 95
    .line 96
    invoke-virtual {v1, p2, v2, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    const/4 v1, 0x1

    .line 101
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const/4 v1, 0x3

    .line 106
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-nez v1, :cond_0

    .line 111
    .line 112
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object v3, Le0/l;->a:Ljava/lang/ThreadLocal;

    .line 121
    .line 122
    const v3, 0x7f0800a2

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v3, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    :cond_0
    move-object v5, v1

    .line 130
    const/4 v1, 0x5

    .line 131
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-nez v1, :cond_1

    .line 136
    .line 137
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    sget-object v3, Le0/l;->a:Ljava/lang/ThreadLocal;

    .line 146
    .line 147
    const v3, 0x7f0800a3

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v3, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    :cond_1
    const/4 v2, 0x4

    .line 155
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    if-nez v2, :cond_2

    .line 160
    .line 161
    const-string v2, ""

    .line 162
    .line 163
    :cond_2
    move-object v6, v2

    .line 164
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    sget-object v7, Le0/l;->a:Ljava/lang/ThreadLocal;

    .line 173
    .line 174
    const v7, 0x7f0603d8

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v7, v3}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    const/4 v3, 0x2

    .line 182
    invoke-virtual {p2, v3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const v3, 0x7f0603d6

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    invoke-virtual {v2, v3, v8}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    iput p2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->k:I

    .line 206
    .line 207
    new-instance v2, Lw1/j;

    .line 208
    .line 209
    iget v8, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->k:I

    .line 210
    .line 211
    move-object v3, p1

    .line 212
    invoke-direct/range {v2 .. v8}, Lw1/j;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/String;II)V

    .line 213
    .line 214
    .line 215
    iput-object v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->f:Lw1/j;

    .line 216
    .line 217
    new-instance v2, Lw1/j;

    .line 218
    .line 219
    const-string v6, ""

    .line 220
    .line 221
    iget v8, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->k:I

    .line 222
    .line 223
    move-object v5, v1

    .line 224
    invoke-direct/range {v2 .. v8}, Lw1/j;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/String;II)V

    .line 225
    .line 226
    .line 227
    iput-object v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->g:Lw1/j;

    .line 228
    .line 229
    new-instance p1, Landroid/widget/EdgeEffect;

    .line 230
    .line 231
    invoke-direct {p1, v3}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 232
    .line 233
    .line 234
    iput-object p1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->h:Landroid/widget/EdgeEffect;

    .line 235
    .line 236
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 237
    .line 238
    .line 239
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->f:Lw1/j;

    .line 6
    .line 7
    invoke-virtual {v0}, Lw1/j;->c()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lw1/j;->b()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->g:Lw1/j;

    .line 19
    .line 20
    invoke-virtual {v0}, Lw1/j;->c()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lw1/j;->b()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->h:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v0, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->finish()V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    sub-int/2addr v3, v4

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    sub-int/2addr v3, v4

    .line 55
    const/high16 v4, 0x42b40000    # 90.0f

    .line 56
    .line 57
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    int-to-float v4, v4

    .line 65
    int-to-float v5, v2

    .line 66
    neg-float v5, v5

    .line 67
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    :goto_1
    const/4 v1, 0x0

    .line 82
    :goto_2
    if-eqz v1, :cond_3

    .line 83
    .line 84
    sget-object p1, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 87
    .line 88
    .line 89
    :cond_3
    return-void
.end method

.method public final getSwipeNavListener()Lw1/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final onFinishInflate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 5
    .line 6
    const/16 v1, 0x13

    .line 7
    .line 8
    const/4 v2, -0x2

    .line 9
    invoke-direct {v0, v2, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->f:Lw1/j;

    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 18
    .line 19
    const/16 v1, 0x10

    .line 20
    .line 21
    invoke-direct {v0, v2, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->g:Lw1/j;

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 2
    .line 3
    invoke-interface {v0}, Lw1/k;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    const/4 v2, 0x1

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_4

    .line 33
    .line 34
    iput-boolean v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->D:Z

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->B:F

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->C:F

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->n:F

    .line 53
    .line 54
    cmpg-float v0, v0, v1

    .line 55
    .line 56
    if-gtz v0, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 59
    .line 60
    invoke-interface {v0}, Lw1/k;->i()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    float-to-int v0, v0

    .line 73
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 74
    .line 75
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    const-string v0, ""

    .line 81
    .line 82
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->f:Lw1/j;

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Lw1/j;->setText(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_5

    .line 88
    .line 89
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iget v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->o:F

    .line 94
    .line 95
    cmpl-float v0, v0, v1

    .line 96
    .line 97
    if-ltz v0, :cond_d

    .line 98
    .line 99
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 100
    .line 101
    invoke-interface {v0}, Lw1/k;->b()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_d

    .line 106
    .line 107
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 114
    .line 115
    goto/16 :goto_5

    .line 116
    .line 117
    :cond_4
    :goto_1
    if-nez v0, :cond_5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    const/4 v4, 0x2

    .line 125
    if-ne v3, v4, :cond_b

    .line 126
    .line 127
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->B:F

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    sub-float/2addr v0, v3

    .line 134
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->C:F

    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    sub-float/2addr v3, p1

    .line 145
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->x:Z

    .line 150
    .line 151
    if-eqz v3, :cond_6

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_6
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 155
    .line 156
    if-nez v3, :cond_7

    .line 157
    .line 158
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 159
    .line 160
    if-eqz v3, :cond_a

    .line 161
    .line 162
    :cond_7
    iget v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->t:F

    .line 163
    .line 164
    cmpl-float v4, v0, v3

    .line 165
    .line 166
    if-gtz v4, :cond_8

    .line 167
    .line 168
    cmpl-float v3, p1, v3

    .line 169
    .line 170
    if-lez v3, :cond_a

    .line 171
    .line 172
    :cond_8
    iget-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->D:Z

    .line 173
    .line 174
    if-nez v3, :cond_a

    .line 175
    .line 176
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->D:Z

    .line 177
    .line 178
    float-to-double v3, p1

    .line 179
    float-to-double v5, v0

    .line 180
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 181
    .line 182
    .line 183
    move-result-wide v3

    .line 184
    double-to-float p1, v3

    .line 185
    float-to-double v3, p1

    .line 186
    const-wide v5, 0x3fe0c152382d7365L    # 0.5235987755982988

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    cmpl-double p1, v3, v5

    .line 192
    .line 193
    if-lez p1, :cond_9

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_9
    iput-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->x:Z

    .line 197
    .line 198
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 203
    .line 204
    .line 205
    return v2

    .line 206
    :cond_a
    :goto_2
    return v1

    .line 207
    :cond_b
    :goto_3
    if-nez v0, :cond_c

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-ne v0, v2, :cond_d

    .line 215
    .line 216
    const/4 v0, 0x0

    .line 217
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->B:F

    .line 218
    .line 219
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->C:F

    .line 220
    .line 221
    iput-boolean v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 222
    .line 223
    iput-boolean v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 224
    .line 225
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->x:Z

    .line 226
    .line 227
    if-eqz v0, :cond_d

    .line 228
    .line 229
    :goto_4
    return v2

    .line 230
    :cond_d
    :goto_5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move p2, p1

    .line 5
    move-object p1, p0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget p2, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->i:F

    .line 9
    .line 10
    neg-float p3, p2

    .line 11
    iput p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->l:F

    .line 12
    .line 13
    iget-object p4, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->f:Lw1/j;

    .line 14
    .line 15
    invoke-virtual {p4, p3}, Landroid/view/View;->setTranslationX(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    int-to-float p3, p3

    .line 23
    add-float/2addr p3, p2

    .line 24
    iput p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->m:F

    .line 25
    .line 26
    iget-object p2, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->g:Lw1/j;

    .line 27
    .line 28
    invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationX(F)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    int-to-float p2, p2

    .line 36
    iget p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->q:F

    .line 37
    .line 38
    mul-float/2addr p2, p3

    .line 39
    iput p2, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->n:F

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    int-to-float p2, p2

    .line 46
    iget p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->n:F

    .line 47
    .line 48
    sub-float/2addr p2, p3

    .line 49
    iput p2, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->o:F

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    int-to-float p2, p2

    .line 56
    iget p3, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->r:F

    .line 57
    .line 58
    mul-float/2addr p2, p3

    .line 59
    iput p2, p1, Lco/median/android/widget/SwipeHistoryNavigationLayout;->p:F

    .line 60
    .line 61
    :cond_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->h:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    const/4 v3, 0x1

    .line 17
    iget-object v4, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->g:Lw1/j;

    .line 18
    .line 19
    iget-object v5, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->f:Lw1/j;

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-ne v7, v2, :cond_8

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v7, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 37
    .line 38
    iput v7, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->y:F

    .line 39
    .line 40
    iget v7, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 41
    .line 42
    int-to-float v7, v7

    .line 43
    sub-float/2addr v0, v7

    .line 44
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 49
    .line 50
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 51
    .line 52
    iget v7, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->i:F

    .line 53
    .line 54
    iget v8, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->t:F

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 59
    .line 60
    invoke-interface {v0}, Lw1/k;->f()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 67
    .line 68
    cmpl-float v9, v0, v8

    .line 69
    .line 70
    if-ltz v9, :cond_2

    .line 71
    .line 72
    sub-float/2addr v0, v8

    .line 73
    iget v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 74
    .line 75
    int-to-float v1, v1

    .line 76
    sub-float/2addr v0, v1

    .line 77
    sub-float/2addr v0, v7

    .line 78
    iget v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->p:F

    .line 79
    .line 80
    sub-float/2addr v1, v7

    .line 81
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-virtual {v5, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 94
    .line 95
    invoke-interface {v0}, Lw1/k;->f()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 102
    .line 103
    cmpl-float v0, v0, v8

    .line 104
    .line 105
    if-ltz v0, :cond_4

    .line 106
    .line 107
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 108
    .line 109
    invoke-interface {v0}, Lw1/k;->b()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->u:I

    .line 116
    .line 117
    int-to-float v0, v0

    .line 118
    iget v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 119
    .line 120
    sub-float/2addr v1, v8

    .line 121
    sub-float/2addr v0, v1

    .line 122
    int-to-float v1, v2

    .line 123
    div-float/2addr v7, v1

    .line 124
    add-float/2addr v7, v0

    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    int-to-float v0, v0

    .line 130
    iget v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->p:F

    .line 131
    .line 132
    sub-float/2addr v0, v1

    .line 133
    invoke-static {v7, v0}, Ljava/lang/Math;->max(FF)F

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-virtual {v4, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    iget v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 142
    .line 143
    iget v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->y:F

    .line 144
    .line 145
    cmpl-float v7, v0, v2

    .line 146
    .line 147
    if-lez v7, :cond_4

    .line 148
    .line 149
    sub-float/2addr v0, v2

    .line 150
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    int-to-float v2, v2

    .line 159
    div-float/2addr v0, v2

    .line 160
    invoke-virtual {v1, v0}, Landroid/widget/EdgeEffect;->onPull(F)V

    .line 161
    .line 162
    .line 163
    move v0, v3

    .line 164
    goto :goto_2

    .line 165
    :cond_4
    :goto_1
    move v0, v6

    .line 166
    :goto_2
    iget v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->z:F

    .line 167
    .line 168
    iget v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->p:F

    .line 169
    .line 170
    iget v7, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->s:F

    .line 171
    .line 172
    add-float/2addr v2, v7

    .line 173
    iget v7, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->j:F

    .line 174
    .line 175
    add-float/2addr v2, v7

    .line 176
    cmpl-float v1, v1, v2

    .line 177
    .line 178
    iget-boolean v2, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:Z

    .line 179
    .line 180
    if-lez v1, :cond_6

    .line 181
    .line 182
    if-nez v2, :cond_7

    .line 183
    .line 184
    iput-boolean v3, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:Z

    .line 185
    .line 186
    iget-boolean v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 187
    .line 188
    if-eqz v1, :cond_5

    .line 189
    .line 190
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 191
    .line 192
    invoke-interface {v1}, Lw1/k;->i()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_5

    .line 197
    .line 198
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5}, Lw1/j;->a()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5}, Lw1/j;->d()V

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_5
    iget-boolean v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 211
    .line 212
    if-eqz v1, :cond_7

    .line 213
    .line 214
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 215
    .line 216
    invoke-interface {v1}, Lw1/k;->b()Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_7

    .line 221
    .line 222
    iget-object v1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Lw1/j;->a()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, Lw1/j;->d()V

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_6
    if-eqz v2, :cond_7

    .line 235
    .line 236
    iput-boolean v6, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:Z

    .line 237
    .line 238
    invoke-virtual {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a()V

    .line 239
    .line 240
    .line 241
    :cond_7
    :goto_3
    move v6, v0

    .line 242
    goto/16 :goto_6

    .line 243
    .line 244
    :cond_8
    :goto_4
    if-nez v0, :cond_9

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-ne v0, v3, :cond_e

    .line 252
    .line 253
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 254
    .line 255
    .line 256
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 257
    .line 258
    const-wide/16 v7, 0x190

    .line 259
    .line 260
    sget-object v9, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 261
    .line 262
    if-eqz v0, :cond_b

    .line 263
    .line 264
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:Z

    .line 265
    .line 266
    if-eqz v0, :cond_a

    .line 267
    .line 268
    invoke-virtual {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a()V

    .line 269
    .line 270
    .line 271
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 272
    .line 273
    invoke-interface {v0}, Lw1/k;->e()Z

    .line 274
    .line 275
    .line 276
    :cond_a
    invoke-virtual {v5}, Landroid/view/View;->getTranslationX()F

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    iget v4, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->l:F

    .line 281
    .line 282
    new-array v2, v2, [F

    .line 283
    .line 284
    aput v0, v2, v6

    .line 285
    .line 286
    aput v4, v2, v3

    .line 287
    .line 288
    invoke-static {v5, v9, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {v0, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 296
    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_b
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 300
    .line 301
    if-eqz v0, :cond_d

    .line 302
    .line 303
    iget-boolean v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:Z

    .line 304
    .line 305
    if-eqz v0, :cond_c

    .line 306
    .line 307
    invoke-virtual {p0}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->a()V

    .line 308
    .line 309
    .line 310
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 311
    .line 312
    invoke-interface {v0}, Lw1/k;->g()Z

    .line 313
    .line 314
    .line 315
    :cond_c
    invoke-virtual {v4}, Landroid/view/View;->getTranslationX()F

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    iget v5, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->m:F

    .line 320
    .line 321
    new-array v2, v2, [F

    .line 322
    .line 323
    aput v0, v2, v6

    .line 324
    .line 325
    aput v5, v2, v3

    .line 326
    .line 327
    invoke-static {v4, v9, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v0, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 335
    .line 336
    .line 337
    :cond_d
    :goto_5
    iput-boolean v6, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->v:Z

    .line 338
    .line 339
    iput-boolean v6, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->w:Z

    .line 340
    .line 341
    iput-boolean v6, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->A:Z

    .line 342
    .line 343
    iput-boolean v6, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->x:Z

    .line 344
    .line 345
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-interface {v1, v6}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 354
    .line 355
    .line 356
    goto :goto_3

    .line 357
    :cond_e
    :goto_6
    if-eqz v6, :cond_f

    .line 358
    .line 359
    sget-object v0, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 360
    .line 361
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 362
    .line 363
    .line 364
    :cond_f
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 365
    .line 366
    .line 367
    move-result p1

    .line 368
    return p1
.end method

.method public final setActiveColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->k:I

    .line 2
    .line 3
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->g:Lw1/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lw1/j;->setActiveColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->f:Lw1/j;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lw1/j;->setActiveColor(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSwipeNavListener(Lw1/k;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lco/median/android/widget/SwipeHistoryNavigationLayout;->E:Lw1/k;

    .line 5
    .line 6
    return-void
.end method
