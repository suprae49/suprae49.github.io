.class public abstract Lw1/h;
.super Landroid/view/ViewGroup;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lp0/m;


# static fields
.field public static final P:[I


# instance fields
.field public A:I

.field public final B:I

.field public final C:I

.field public D:I

.field public final E:Ln1/d;

.field public F:Lw1/c;

.field public G:Lw1/c;

.field public H:Lw1/d;

.field public I:Lw1/d;

.field public J:Z

.field public K:I

.field public L:Z

.field public final M:Lw1/b;

.field public final N:Lw1/e;

.field public final O:Lw1/e;

.field public f:Landroid/view/View;

.field public g:Lw1/g;

.field public h:Z

.field public final i:I

.field public j:F

.field public k:F

.field public final l:Lk1/g0;

.field public final m:Lp0/n;

.field public final n:[I

.field public final o:[I

.field public p:Z

.field public final q:I

.field public r:I

.field public s:F

.field public t:F

.field public u:F

.field public v:Z

.field public w:I

.field public final x:Landroid/view/animation/DecelerateInterpolator;

.field public final y:Lw1/a;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x101000e

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lw1/h;->P:[I

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lw1/h;->h:Z

    .line 6
    .line 7
    const/high16 v1, -0x40800000    # -1.0f

    .line 8
    .line 9
    iput v1, p0, Lw1/h;->j:F

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    new-array v2, v1, [I

    .line 13
    .line 14
    iput-object v2, p0, Lw1/h;->n:[I

    .line 15
    .line 16
    new-array v1, v1, [I

    .line 17
    .line 18
    iput-object v1, p0, Lw1/h;->o:[I

    .line 19
    .line 20
    const/4 v1, -0x1

    .line 21
    iput v1, p0, Lw1/h;->w:I

    .line 22
    .line 23
    iput v1, p0, Lw1/h;->z:I

    .line 24
    .line 25
    iput-boolean v0, p0, Lw1/h;->L:Z

    .line 26
    .line 27
    new-instance v1, Lw1/b;

    .line 28
    .line 29
    move-object v2, p0

    .line 30
    check-cast v2, Lco/median/android/MySwipeRefreshLayout;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v1, v2, v3}, Lw1/b;-><init>(Lw1/h;I)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lw1/h;->M:Lw1/b;

    .line 37
    .line 38
    new-instance v1, Lw1/e;

    .line 39
    .line 40
    invoke-direct {v1, v2, v3}, Lw1/e;-><init>(Lco/median/android/MySwipeRefreshLayout;I)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lw1/h;->N:Lw1/e;

    .line 44
    .line 45
    new-instance v1, Lw1/e;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-direct {v1, v2, v3}, Lw1/e;-><init>(Lco/median/android/MySwipeRefreshLayout;I)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lw1/h;->O:Lw1/e;

    .line 52
    .line 53
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iput v1, p0, Lw1/h;->i:I

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const v2, 0x10e0001

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iput v1, p0, Lw1/h;->q:I

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 77
    .line 78
    .line 79
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 80
    .line 81
    const/high16 v2, 0x40000000    # 2.0f

    .line 82
    .line 83
    invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lw1/h;->x:Landroid/view/animation/DecelerateInterpolator;

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const/high16 v2, 0x42200000    # 40.0f

    .line 97
    .line 98
    iget v3, v1, Landroid/util/DisplayMetrics;->density:F

    .line 99
    .line 100
    mul-float/2addr v3, v2

    .line 101
    float-to-int v2, v3

    .line 102
    iput v2, p0, Lw1/h;->K:I

    .line 103
    .line 104
    new-instance v2, Lw1/a;

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-direct {v2, v3}, Lk/z;-><init>(Landroid/content/Context;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 126
    .line 127
    new-instance v4, Landroid/graphics/drawable/ShapeDrawable;

    .line 128
    .line 129
    new-instance v5, Landroid/graphics/drawable/shapes/OvalShape;

    .line 130
    .line 131
    invoke-direct {v5}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-direct {v4, v5}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 135
    .line 136
    .line 137
    const/high16 v5, 0x40800000    # 4.0f

    .line 138
    .line 139
    mul-float/2addr v3, v5

    .line 140
    invoke-virtual {v2, v3}, Landroid/view/View;->setElevation(F)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    const v5, -0x50506

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 154
    .line 155
    .line 156
    iput-object v2, p0, Lw1/h;->y:Lw1/a;

    .line 157
    .line 158
    new-instance v2, Ln1/d;

    .line 159
    .line 160
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-direct {v2, v3}, Ln1/d;-><init>(Landroid/content/Context;)V

    .line 165
    .line 166
    .line 167
    iput-object v2, p0, Lw1/h;->E:Ln1/d;

    .line 168
    .line 169
    const/4 v3, 0x1

    .line 170
    invoke-virtual {v2, v3}, Ln1/d;->c(I)V

    .line 171
    .line 172
    .line 173
    iget-object v2, p0, Lw1/h;->y:Lw1/a;

    .line 174
    .line 175
    iget-object v4, p0, Lw1/h;->E:Ln1/d;

    .line 176
    .line 177
    invoke-virtual {v2, v4}, Lk/z;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 178
    .line 179
    .line 180
    iget-object v2, p0, Lw1/h;->y:Lw1/a;

    .line 181
    .line 182
    const/16 v4, 0x8

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 185
    .line 186
    .line 187
    iget-object v2, p0, Lw1/h;->y:Lw1/a;

    .line 188
    .line 189
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 193
    .line 194
    .line 195
    const/high16 v2, 0x42800000    # 64.0f

    .line 196
    .line 197
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 198
    .line 199
    mul-float/2addr v1, v2

    .line 200
    float-to-int v1, v1

    .line 201
    iput v1, p0, Lw1/h;->C:I

    .line 202
    .line 203
    int-to-float v1, v1

    .line 204
    iput v1, p0, Lw1/h;->j:F

    .line 205
    .line 206
    new-instance v1, Lk1/g0;

    .line 207
    .line 208
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 209
    .line 210
    .line 211
    iput-object v1, p0, Lw1/h;->l:Lk1/g0;

    .line 212
    .line 213
    new-instance v1, Lp0/n;

    .line 214
    .line 215
    invoke-direct {v1, p0}, Lp0/n;-><init>(Landroid/view/ViewGroup;)V

    .line 216
    .line 217
    .line 218
    iput-object v1, p0, Lw1/h;->m:Lp0/n;

    .line 219
    .line 220
    invoke-virtual {p0, v3}, Lw1/h;->setNestedScrollingEnabled(Z)V

    .line 221
    .line 222
    .line 223
    iget v1, p0, Lw1/h;->K:I

    .line 224
    .line 225
    neg-int v1, v1

    .line 226
    iput v1, p0, Lw1/h;->r:I

    .line 227
    .line 228
    iput v1, p0, Lw1/h;->B:I

    .line 229
    .line 230
    const/high16 v1, 0x3f800000    # 1.0f

    .line 231
    .line 232
    invoke-virtual {p0, v1}, Lw1/h;->e(F)V

    .line 233
    .line 234
    .line 235
    sget-object v1, Lw1/h;->P:[I

    .line 236
    .line 237
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    invoke-virtual {p0, p2}, Lw1/h;->setEnabled(Z)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 249
    .line 250
    .line 251
    return-void
.end method

.method private setColorViewAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lw1/h;->E:Ln1/d;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ln1/d;->setAlpha(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lw1/h;->f:Landroid/view/View;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lw1/h;->y:Lw1/a;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    iput-object v1, p0, Lw1/h;->f:Landroid/view/View;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public final c(F)V
    .locals 4

    .line 1
    iget v0, p0, Lw1/h;->j:F

    .line 2
    .line 3
    cmpl-float p1, p1, v0

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1, p1}, Lw1/h;->g(ZZ)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lw1/h;->h:Z

    .line 14
    .line 15
    iget-object v0, p0, Lw1/h;->E:Ln1/d;

    .line 16
    .line 17
    iget-object v1, v0, Ln1/d;->f:Ln1/c;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput v2, v1, Ln1/c;->e:F

    .line 21
    .line 22
    iput v2, v1, Ln1/c;->f:F

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lw1/b;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {v0, p0, v1}, Lw1/b;-><init>(Lw1/h;I)V

    .line 31
    .line 32
    .line 33
    iget v1, p0, Lw1/h;->r:I

    .line 34
    .line 35
    iput v1, p0, Lw1/h;->A:I

    .line 36
    .line 37
    iget-object v1, p0, Lw1/h;->O:Lw1/e;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/animation/Animation;->reset()V

    .line 40
    .line 41
    .line 42
    const-wide/16 v2, 0xc8

    .line 43
    .line 44
    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Lw1/h;->x:Landroid/view/animation/DecelerateInterpolator;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Lw1/h;->y:Lw1/a;

    .line 53
    .line 54
    iput-object v0, v2, Lw1/a;->i:Landroid/view/animation/Animation$AnimationListener;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/view/View;->clearAnimation()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lw1/h;->E:Ln1/d;

    .line 65
    .line 66
    iget-object v1, v0, Ln1/d;->f:Ln1/c;

    .line 67
    .line 68
    iget-boolean v2, v1, Ln1/c;->n:Z

    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    iput-boolean p1, v1, Ln1/c;->n:Z

    .line 73
    .line 74
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final d(F)V
    .locals 11

    .line 1
    iget-object v0, p0, Lw1/h;->E:Ln1/d;

    .line 2
    .line 3
    iget-object v1, v0, Ln1/d;->f:Ln1/c;

    .line 4
    .line 5
    iget-boolean v2, v1, Ln1/c;->n:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eq v2, v3, :cond_0

    .line 9
    .line 10
    iput-boolean v3, v1, Ln1/c;->n:Z

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lw1/h;->j:F

    .line 16
    .line 17
    div-float v0, p1, v0

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/high16 v1, 0x3f800000    # 1.0f

    .line 24
    .line 25
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    float-to-double v2, v0

    .line 30
    const-wide v4, 0x3fd999999999999aL    # 0.4

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    sub-double/2addr v2, v4

    .line 36
    const-wide/16 v4, 0x0

    .line 37
    .line 38
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    double-to-float v2, v2

    .line 43
    const/high16 v3, 0x40a00000    # 5.0f

    .line 44
    .line 45
    mul-float/2addr v2, v3

    .line 46
    const/high16 v3, 0x40400000    # 3.0f

    .line 47
    .line 48
    div-float/2addr v2, v3

    .line 49
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iget v4, p0, Lw1/h;->j:F

    .line 54
    .line 55
    sub-float/2addr v3, v4

    .line 56
    iget v4, p0, Lw1/h;->D:I

    .line 57
    .line 58
    if-lez v4, :cond_1

    .line 59
    .line 60
    :goto_0
    int-to-float v4, v4

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    iget v4, p0, Lw1/h;->C:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :goto_1
    const/high16 v5, 0x40000000    # 2.0f

    .line 66
    .line 67
    mul-float v6, v4, v5

    .line 68
    .line 69
    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    div-float/2addr v3, v4

    .line 74
    const/4 v6, 0x0

    .line 75
    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    const/high16 v7, 0x40800000    # 4.0f

    .line 80
    .line 81
    div-float/2addr v3, v7

    .line 82
    float-to-double v7, v3

    .line 83
    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    .line 84
    .line 85
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 86
    .line 87
    .line 88
    move-result-wide v9

    .line 89
    sub-double/2addr v7, v9

    .line 90
    double-to-float v3, v7

    .line 91
    mul-float/2addr v3, v5

    .line 92
    mul-float v7, v4, v3

    .line 93
    .line 94
    mul-float/2addr v7, v5

    .line 95
    mul-float/2addr v4, v0

    .line 96
    add-float/2addr v4, v7

    .line 97
    float-to-int v0, v4

    .line 98
    iget v4, p0, Lw1/h;->B:I

    .line 99
    .line 100
    add-int/2addr v4, v0

    .line 101
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 110
    .line 111
    const/4 v7, 0x0

    .line 112
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 113
    .line 114
    .line 115
    :cond_2
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 123
    .line 124
    .line 125
    iget v0, p0, Lw1/h;->j:F

    .line 126
    .line 127
    cmpg-float p1, p1, v0

    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    const-wide/16 v7, 0x12c

    .line 131
    .line 132
    iget-object v9, p0, Lw1/h;->E:Ln1/d;

    .line 133
    .line 134
    if-gez p1, :cond_4

    .line 135
    .line 136
    iget-object p1, v9, Ln1/d;->f:Ln1/c;

    .line 137
    .line 138
    iget p1, p1, Ln1/c;->t:I

    .line 139
    .line 140
    const/16 v9, 0x4c

    .line 141
    .line 142
    if-le p1, v9, :cond_6

    .line 143
    .line 144
    iget-object p1, p0, Lw1/h;->H:Lw1/d;

    .line 145
    .line 146
    if-eqz p1, :cond_3

    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-eqz v10, :cond_3

    .line 153
    .line 154
    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_3

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_3
    iget-object p1, p0, Lw1/h;->E:Ln1/d;

    .line 162
    .line 163
    iget-object p1, p1, Ln1/d;->f:Ln1/c;

    .line 164
    .line 165
    iget p1, p1, Ln1/c;->t:I

    .line 166
    .line 167
    new-instance v10, Lw1/d;

    .line 168
    .line 169
    invoke-direct {v10, p0, p1, v9}, Lw1/d;-><init>(Lw1/h;II)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10, v7, v8}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 173
    .line 174
    .line 175
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 176
    .line 177
    iput-object v0, p1, Lw1/a;->i:Landroid/view/animation/Animation$AnimationListener;

    .line 178
    .line 179
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 183
    .line 184
    invoke-virtual {p1, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 185
    .line 186
    .line 187
    iput-object v10, p0, Lw1/h;->H:Lw1/d;

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_4
    iget-object p1, v9, Ln1/d;->f:Ln1/c;

    .line 191
    .line 192
    iget p1, p1, Ln1/c;->t:I

    .line 193
    .line 194
    const/16 v9, 0xff

    .line 195
    .line 196
    if-ge p1, v9, :cond_6

    .line 197
    .line 198
    iget-object p1, p0, Lw1/h;->I:Lw1/d;

    .line 199
    .line 200
    if-eqz p1, :cond_5

    .line 201
    .line 202
    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-eqz v10, :cond_5

    .line 207
    .line 208
    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-nez p1, :cond_5

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_5
    iget-object p1, p0, Lw1/h;->E:Ln1/d;

    .line 216
    .line 217
    iget-object p1, p1, Ln1/d;->f:Ln1/c;

    .line 218
    .line 219
    iget p1, p1, Ln1/c;->t:I

    .line 220
    .line 221
    new-instance v10, Lw1/d;

    .line 222
    .line 223
    invoke-direct {v10, p0, p1, v9}, Lw1/d;-><init>(Lw1/h;II)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v10, v7, v8}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 227
    .line 228
    .line 229
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 230
    .line 231
    iput-object v0, p1, Lw1/a;->i:Landroid/view/animation/Animation$AnimationListener;

    .line 232
    .line 233
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 237
    .line 238
    invoke-virtual {p1, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 239
    .line 240
    .line 241
    iput-object v10, p0, Lw1/h;->I:Lw1/d;

    .line 242
    .line 243
    :cond_6
    :goto_2
    const p1, 0x3f4ccccd    # 0.8f

    .line 244
    .line 245
    .line 246
    mul-float v0, v2, p1

    .line 247
    .line 248
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    iget-object v0, p0, Lw1/h;->E:Ln1/d;

    .line 253
    .line 254
    iget-object v7, v0, Ln1/d;->f:Ln1/c;

    .line 255
    .line 256
    iput v6, v7, Ln1/c;->e:F

    .line 257
    .line 258
    iput p1, v7, Ln1/c;->f:F

    .line 259
    .line 260
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 261
    .line 262
    .line 263
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    iget-object v0, p0, Lw1/h;->E:Ln1/d;

    .line 268
    .line 269
    iget-object v1, v0, Ln1/d;->f:Ln1/c;

    .line 270
    .line 271
    iget v6, v1, Ln1/c;->p:F

    .line 272
    .line 273
    cmpl-float v6, p1, v6

    .line 274
    .line 275
    if-eqz v6, :cond_7

    .line 276
    .line 277
    iput p1, v1, Ln1/c;->p:F

    .line 278
    .line 279
    :cond_7
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 280
    .line 281
    .line 282
    const p1, 0x3ecccccd    # 0.4f

    .line 283
    .line 284
    .line 285
    mul-float/2addr v2, p1

    .line 286
    const/high16 p1, -0x41800000    # -0.25f

    .line 287
    .line 288
    add-float/2addr v2, p1

    .line 289
    mul-float/2addr v3, v5

    .line 290
    add-float/2addr v3, v2

    .line 291
    const/high16 p1, 0x3f000000    # 0.5f

    .line 292
    .line 293
    mul-float/2addr v3, p1

    .line 294
    iget-object p1, p0, Lw1/h;->E:Ln1/d;

    .line 295
    .line 296
    iget-object v0, p1, Ln1/d;->f:Ln1/c;

    .line 297
    .line 298
    iput v3, v0, Ln1/c;->g:F

    .line 299
    .line 300
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 301
    .line 302
    .line 303
    iget p1, p0, Lw1/h;->r:I

    .line 304
    .line 305
    sub-int/2addr v4, p1

    .line 306
    invoke-virtual {p0, v4}, Lw1/h;->setTargetOffsetTopAndBottom(I)V

    .line 307
    .line 308
    .line 309
    return-void
.end method

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/h;->m:Lp0/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lp0/n;->a(FFZ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/h;->m:Lp0/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lp0/n;->b(FF)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lw1/h;->m:Lp0/n;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    move v1, p1

    .line 5
    move v2, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-virtual/range {v0 .. v5}, Lp0/n;->c(III[I[I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 8

    .line 1
    const/4 v6, 0x0

    .line 2
    const/4 v7, 0x0

    .line 3
    iget-object v0, p0, Lw1/h;->m:Lp0/n;

    .line 4
    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v7}, Lp0/n;->d(IIII[II[I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final e(F)V
    .locals 2

    .line 1
    iget v0, p0, Lw1/h;->A:I

    .line 2
    .line 3
    iget v1, p0, Lw1/h;->B:I

    .line 4
    .line 5
    sub-int/2addr v1, v0

    .line 6
    int-to-float v1, v1

    .line 7
    mul-float/2addr v1, p1

    .line 8
    float-to-int p1, v1

    .line 9
    add-int/2addr v0, p1

    .line 10
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    sub-int/2addr v0, p1

    .line 17
    invoke-virtual {p0, v0}, Lw1/h;->setTargetOffsetTopAndBottom(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw1/h;->E:Ln1/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Ln1/d;->stop()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    const/16 v0, 0xff

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lw1/h;->setColorViewAlpha(I)V

    .line 21
    .line 22
    .line 23
    iget v0, p0, Lw1/h;->B:I

    .line 24
    .line 25
    iget v1, p0, Lw1/h;->r:I

    .line 26
    .line 27
    sub-int/2addr v0, v1

    .line 28
    invoke-virtual {p0, v0}, Lw1/h;->setTargetOffsetTopAndBottom(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lw1/h;->r:I

    .line 38
    .line 39
    return-void
.end method

.method public final g(ZZ)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lw1/h;->h:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    iput-boolean p2, p0, Lw1/h;->J:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lw1/h;->b()V

    .line 8
    .line 9
    .line 10
    iput-boolean p1, p0, Lw1/h;->h:Z

    .line 11
    .line 12
    iget-object p2, p0, Lw1/h;->M:Lw1/b;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget p1, p0, Lw1/h;->r:I

    .line 17
    .line 18
    iput p1, p0, Lw1/h;->A:I

    .line 19
    .line 20
    iget-object p1, p0, Lw1/h;->N:Lw1/e;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    .line 23
    .line 24
    .line 25
    const-wide/16 v0, 0xc8

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lw1/h;->x:Landroid/view/animation/DecelerateInterpolator;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 33
    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 38
    .line 39
    iput-object p2, v0, Lw1/a;->i:Landroid/view/animation/Animation$AnimationListener;

    .line 40
    .line 41
    :cond_0
    iget-object p2, p0, Lw1/h;->y:Lw1/a;

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/view/View;->clearAnimation()V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Lw1/h;->y:Lw1/a;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    new-instance p1, Lw1/c;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-direct {p1, p0, v0}, Lw1/c;-><init>(Lw1/h;I)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lw1/h;->G:Lw1/c;

    .line 59
    .line 60
    const-wide/16 v0, 0x96

    .line 61
    .line 62
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 66
    .line 67
    iput-object p2, p1, Lw1/a;->i:Landroid/view/animation/Animation$AnimationListener;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 73
    .line 74
    iget-object p2, p0, Lw1/h;->G:Lw1/c;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void
.end method

.method public final getChildDrawingOrder(II)I
    .locals 1

    .line 1
    iget v0, p0, Lw1/h;->z:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 7
    .line 8
    if-ne p2, p1, :cond_1

    .line 9
    .line 10
    return v0

    .line 11
    :cond_1
    if-lt p2, v0, :cond_2

    .line 12
    .line 13
    add-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    :cond_2
    :goto_0
    return p2
.end method

.method public getNestedScrollAxes()I
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/h;->l:Lk1/g0;

    .line 2
    .line 3
    iget v1, v0, Lk1/g0;->a:I

    .line 4
    .line 5
    iget v0, v0, Lk1/g0;->b:I

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    return v0
.end method

.method public getProgressCircleDiameter()I
    .locals 1

    .line 1
    iget v0, p0, Lw1/h;->K:I

    .line 2
    .line 3
    return v0
.end method

.method public getProgressViewEndOffset()I
    .locals 1

    .line 1
    iget v0, p0, Lw1/h;->C:I

    .line 2
    .line 3
    return v0
.end method

.method public getProgressViewStartOffset()I
    .locals 1

    .line 1
    iget v0, p0, Lw1/h;->B:I

    .line 2
    .line 3
    return v0
.end method

.method public final h(F)V
    .locals 2

    .line 1
    iget v0, p0, Lw1/h;->t:F

    .line 2
    .line 3
    sub-float/2addr p1, v0

    .line 4
    iget v1, p0, Lw1/h;->i:I

    .line 5
    .line 6
    int-to-float v1, v1

    .line 7
    cmpl-float p1, p1, v1

    .line 8
    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p0, Lw1/h;->v:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    add-float/2addr v0, v1

    .line 16
    iput v0, p0, Lw1/h;->s:F

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lw1/h;->v:Z

    .line 20
    .line 21
    iget-object p1, p0, Lw1/h;->E:Ln1/d;

    .line 22
    .line 23
    const/16 v0, 0x4c

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ln1/d;->setAlpha(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final hasNestedScrollingParent()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/h;->m:Lp0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lp0/n;->f(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/h;->m:Lp0/n;

    .line 2
    .line 3
    iget-boolean v0, v0, Lp0/n;->d:Z

    .line 4
    .line 5
    return v0
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lw1/h;->f()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lw1/h;->b()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_e

    .line 14
    .line 15
    iget-boolean v1, p0, Lw1/h;->h:Z

    .line 16
    .line 17
    if-nez v1, :cond_e

    .line 18
    .line 19
    iget-boolean v1, p0, Lw1/h;->p:Z

    .line 20
    .line 21
    if-nez v1, :cond_e

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v3, 0x1

    .line 28
    if-le v1, v3, :cond_0

    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_0
    if-eqz v0, :cond_a

    .line 33
    .line 34
    const/4 v1, -0x1

    .line 35
    if-eq v0, v3, :cond_9

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    if-eq v0, v4, :cond_3

    .line 39
    .line 40
    const/4 v4, 0x3

    .line 41
    if-eq v0, v4, :cond_9

    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    if-eq v0, v1, :cond_1

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iget v4, p0, Lw1/h;->w:I

    .line 57
    .line 58
    if-ne v1, v4, :cond_d

    .line 59
    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    move v2, v3

    .line 63
    :cond_2
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iput p1, p0, Lw1/h;->w:I

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_3
    invoke-virtual {p0}, Lw1/h;->a()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_e

    .line 76
    .line 77
    iget-boolean v0, p0, Lw1/h;->L:Z

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    goto/16 :goto_1

    .line 82
    .line 83
    :cond_4
    iget v0, p0, Lw1/h;->w:I

    .line 84
    .line 85
    if-ne v0, v1, :cond_5

    .line 86
    .line 87
    const-string p1, "h"

    .line 88
    .line 89
    const-string v0, "Got ACTION_MOVE event but don\'t have an active pointer id."

    .line 90
    .line 91
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    return v2

    .line 95
    :cond_5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-gez v0, :cond_6

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    iget v4, p0, Lw1/h;->u:F

    .line 107
    .line 108
    sub-float/2addr v1, v4

    .line 109
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    iget v5, p0, Lw1/h;->t:F

    .line 114
    .line 115
    sub-float/2addr v4, v5

    .line 116
    const/4 v5, 0x0

    .line 117
    cmpg-float v5, v4, v5

    .line 118
    .line 119
    if-gez v5, :cond_7

    .line 120
    .line 121
    iput-boolean v3, p0, Lw1/h;->L:Z

    .line 122
    .line 123
    return v2

    .line 124
    :cond_7
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    cmpg-float v1, v2, v1

    .line 133
    .line 134
    if-gez v1, :cond_8

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_8
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    invoke-virtual {p0, p1}, Lw1/h;->h(F)V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_9
    iput-boolean v2, p0, Lw1/h;->L:Z

    .line 146
    .line 147
    iput-boolean v2, p0, Lw1/h;->v:Z

    .line 148
    .line 149
    iput v1, p0, Lw1/h;->w:I

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_a
    invoke-virtual {p0}, Lw1/h;->a()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_b

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_b
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    iget v1, p0, Lw1/h;->B:I

    .line 166
    .line 167
    sub-int/2addr v1, v0

    .line 168
    invoke-virtual {p0, v1}, Lw1/h;->setTargetOffsetTopAndBottom(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    iput v0, p0, Lw1/h;->w:I

    .line 176
    .line 177
    iput-boolean v2, p0, Lw1/h;->v:Z

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-gez v0, :cond_c

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_c
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    iput v1, p0, Lw1/h;->t:F

    .line 191
    .line 192
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    iput p1, p0, Lw1/h;->u:F

    .line 197
    .line 198
    :cond_d
    :goto_0
    iget-boolean p1, p0, Lw1/h;->v:Z

    .line 199
    .line 200
    return p1

    .line 201
    :cond_e
    :goto_1
    return v2
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    if-nez p3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p3, p0, Lw1/h;->f:Landroid/view/View;

    .line 17
    .line 18
    if-nez p3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lw1/h;->b()V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object p3, p0, Lw1/h;->f:Landroid/view/View;

    .line 24
    .line 25
    if-nez p3, :cond_2

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result p5

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sub-int v0, p1, v0

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sub-int/2addr v0, v1

    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    sub-int/2addr p2, v1

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    sub-int/2addr p2, v1

    .line 57
    add-int/2addr v0, p4

    .line 58
    add-int/2addr p2, p5

    .line 59
    invoke-virtual {p3, p4, p5, v0, p2}, Landroid/view/View;->layout(IIII)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Lw1/h;->y:Lw1/a;

    .line 63
    .line 64
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    iget-object p3, p0, Lw1/h;->y:Lw1/a;

    .line 69
    .line 70
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    div-int/lit8 p1, p1, 0x2

    .line 75
    .line 76
    div-int/lit8 p2, p2, 0x2

    .line 77
    .line 78
    sub-int p4, p1, p2

    .line 79
    .line 80
    iget p5, p0, Lw1/h;->r:I

    .line 81
    .line 82
    add-int/2addr p1, p2

    .line 83
    add-int/2addr p3, p5

    .line 84
    iget-object p2, p0, Lw1/h;->y:Lw1/a;

    .line 85
    .line 86
    invoke-virtual {p2, p4, p5, p1, p3}, Landroid/view/View;->layout(IIII)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lw1/h;->f:Landroid/view/View;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lw1/h;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lw1/h;->f:Landroid/view/View;

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sub-int/2addr p2, v0

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr p2, v0

    .line 30
    const/high16 v0, 0x40000000    # 2.0f

    .line 31
    .line 32
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    sub-int/2addr v1, v2

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    sub-int/2addr v1, v2

    .line 50
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p1, p2, v1}, Landroid/view/View;->measure(II)V

    .line 55
    .line 56
    .line 57
    iget p1, p0, Lw1/h;->K:I

    .line 58
    .line 59
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iget p2, p0, Lw1/h;->K:I

    .line 64
    .line 65
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 70
    .line 71
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 72
    .line 73
    .line 74
    const/4 p1, -0x1

    .line 75
    iput p1, p0, Lw1/h;->z:I

    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-ge p1, p2, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 89
    .line 90
    if-ne p2, v0, :cond_2

    .line 91
    .line 92
    iput p1, p0, Lw1/h;->z:I

    .line 93
    .line 94
    return-void

    .line 95
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    :goto_1
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lw1/h;->m:Lp0/n;

    .line 2
    .line 3
    invoke-virtual {p1, p2, p3, p4}, Lp0/n;->a(FFZ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lw1/h;->m:Lp0/n;

    .line 2
    .line 3
    invoke-virtual {p1, p2, p3}, Lp0/n;->b(FF)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 4

    .line 1
    const/4 p1, 0x1

    .line 2
    if-lez p3, :cond_1

    .line 3
    .line 4
    iget v0, p0, Lw1/h;->k:F

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    cmpl-float v2, v0, v1

    .line 8
    .line 9
    if-lez v2, :cond_1

    .line 10
    .line 11
    int-to-float v2, p3

    .line 12
    cmpl-float v3, v2, v0

    .line 13
    .line 14
    if-lez v3, :cond_0

    .line 15
    .line 16
    float-to-int v0, v0

    .line 17
    sub-int v0, p3, v0

    .line 18
    .line 19
    aput v0, p4, p1

    .line 20
    .line 21
    iput v1, p0, Lw1/h;->k:F

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sub-float/2addr v0, v2

    .line 25
    iput v0, p0, Lw1/h;->k:F

    .line 26
    .line 27
    aput p3, p4, p1

    .line 28
    .line 29
    :goto_0
    iget v0, p0, Lw1/h;->k:F

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lw1/h;->d(F)V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    aget v1, p4, v0

    .line 36
    .line 37
    sub-int/2addr p2, v1

    .line 38
    aget v1, p4, p1

    .line 39
    .line 40
    sub-int/2addr p3, v1

    .line 41
    const/4 v1, 0x0

    .line 42
    iget-object v2, p0, Lw1/h;->n:[I

    .line 43
    .line 44
    invoke-virtual {p0, p2, p3, v2, v1}, Lw1/h;->dispatchNestedPreScroll(II[I[I)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    aget p2, p4, v0

    .line 51
    .line 52
    aget p3, v2, v0

    .line 53
    .line 54
    add-int/2addr p2, p3

    .line 55
    aput p2, p4, v0

    .line 56
    .line 57
    aget p2, p4, p1

    .line 58
    .line 59
    aget p3, v2, p1

    .line 60
    .line 61
    add-int/2addr p2, p3

    .line 62
    aput p2, p4, p1

    .line 63
    .line 64
    :cond_2
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
    .locals 6

    .line 1
    iget-object v5, p0, Lw1/h;->o:[I

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move v1, p2

    .line 5
    move v2, p3

    .line 6
    move v3, p4

    .line 7
    move v4, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, Lw1/h;->dispatchNestedScroll(IIII[I)Z

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Lw1/h;->o:[I

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    aget p1, p1, p2

    .line 15
    .line 16
    add-int p5, v4, p1

    .line 17
    .line 18
    if-gez p5, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lw1/h;->a()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    iget p1, v0, Lw1/h;->k:F

    .line 27
    .line 28
    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    int-to-float p2, p2

    .line 33
    add-float/2addr p1, p2

    .line 34
    iput p1, v0, Lw1/h;->k:F

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lw1/h;->d(F)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lw1/h;->l:Lk1/g0;

    .line 2
    .line 3
    iput p3, p1, Lk1/g0;->a:I

    .line 4
    .line 5
    and-int/lit8 p1, p3, 0x2

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lw1/h;->startNestedScroll(I)Z

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lw1/h;->k:F

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lw1/h;->p:Z

    .line 15
    .line 16
    return-void
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-boolean p1, p0, Lw1/h;->h:Z

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    and-int/lit8 p1, p3, 0x2

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lw1/h;->l:Lk1/g0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput v0, p1, Lk1/g0;->a:I

    .line 5
    .line 6
    iput-boolean v0, p0, Lw1/h;->p:Z

    .line 7
    .line 8
    iget p1, p0, Lw1/h;->k:F

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    cmpl-float v1, p1, v0

    .line 12
    .line 13
    if-lez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lw1/h;->c(F)V

    .line 16
    .line 17
    .line 18
    iput v0, p0, Lw1/h;->k:F

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lw1/h;->stopNestedScroll()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_d

    .line 11
    .line 12
    invoke-virtual {p0}, Lw1/h;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_d

    .line 17
    .line 18
    iget-boolean v1, p0, Lw1/h;->h:Z

    .line 19
    .line 20
    if-nez v1, :cond_d

    .line 21
    .line 22
    iget-boolean v1, p0, Lw1/h;->p:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :cond_0
    const/4 v1, 0x1

    .line 29
    if-eqz v0, :cond_c

    .line 30
    .line 31
    const/high16 v3, 0x3f000000    # 0.5f

    .line 32
    .line 33
    const-string v4, "h"

    .line 34
    .line 35
    if-eq v0, v1, :cond_9

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    if-eq v0, v5, :cond_5

    .line 39
    .line 40
    const/4 v3, 0x3

    .line 41
    if-eq v0, v3, :cond_d

    .line 42
    .line 43
    const/4 v3, 0x5

    .line 44
    if-eq v0, v3, :cond_3

    .line 45
    .line 46
    const/4 v3, 0x6

    .line 47
    if-eq v0, v3, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    iget v4, p0, Lw1/h;->w:I

    .line 59
    .line 60
    if-ne v3, v4, :cond_8

    .line 61
    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    move v2, v1

    .line 65
    :cond_2
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iput p1, p0, Lw1/h;->w:I

    .line 70
    .line 71
    return v1

    .line 72
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-gez v0, :cond_4

    .line 77
    .line 78
    const-string p1, "Got ACTION_POINTER_DOWN event but have an invalid action index."

    .line 79
    .line 80
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    return v2

    .line 84
    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    iput p1, p0, Lw1/h;->w:I

    .line 89
    .line 90
    return v1

    .line 91
    :cond_5
    iget v0, p0, Lw1/h;->w:I

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-gez v0, :cond_6

    .line 98
    .line 99
    const-string p1, "Got ACTION_MOVE event but have an invalid active pointer id."

    .line 100
    .line 101
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    return v2

    .line 105
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    iget v5, p0, Lw1/h;->u:F

    .line 110
    .line 111
    sub-float/2addr v4, v5

    .line 112
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    iget v6, p0, Lw1/h;->t:F

    .line 117
    .line 118
    sub-float/2addr v5, v6

    .line 119
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    cmpg-float v4, v5, v4

    .line 128
    .line 129
    if-gez v4, :cond_7

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_7
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    invoke-virtual {p0, p1}, Lw1/h;->h(F)V

    .line 137
    .line 138
    .line 139
    iget-boolean v0, p0, Lw1/h;->v:Z

    .line 140
    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    iget v0, p0, Lw1/h;->s:F

    .line 144
    .line 145
    sub-float/2addr p1, v0

    .line 146
    mul-float/2addr p1, v3

    .line 147
    const/4 v0, 0x0

    .line 148
    cmpl-float v0, p1, v0

    .line 149
    .line 150
    if-lez v0, :cond_d

    .line 151
    .line 152
    invoke-virtual {p0, p1}, Lw1/h;->d(F)V

    .line 153
    .line 154
    .line 155
    :cond_8
    :goto_0
    return v1

    .line 156
    :cond_9
    iget v0, p0, Lw1/h;->w:I

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-gez v0, :cond_a

    .line 163
    .line 164
    const-string p1, "Got ACTION_UP event but don\'t have an active pointer id."

    .line 165
    .line 166
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    return v2

    .line 170
    :cond_a
    iget-boolean v1, p0, Lw1/h;->v:Z

    .line 171
    .line 172
    if-eqz v1, :cond_b

    .line 173
    .line 174
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    iget v0, p0, Lw1/h;->s:F

    .line 179
    .line 180
    sub-float/2addr p1, v0

    .line 181
    mul-float/2addr p1, v3

    .line 182
    iput-boolean v2, p0, Lw1/h;->v:Z

    .line 183
    .line 184
    invoke-virtual {p0, p1}, Lw1/h;->c(F)V

    .line 185
    .line 186
    .line 187
    :cond_b
    const/4 p1, -0x1

    .line 188
    iput p1, p0, Lw1/h;->w:I

    .line 189
    .line 190
    return v2

    .line 191
    :cond_c
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    iput p1, p0, Lw1/h;->w:I

    .line 196
    .line 197
    iput-boolean v2, p0, Lw1/h;->v:Z

    .line 198
    .line 199
    return v1

    .line 200
    :cond_d
    :goto_1
    return v2
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/h;->f:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setAnimationProgress(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public varargs setColorScheme([I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lw1/h;->setColorSchemeResources([I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public varargs setColorSchemeColors([I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lw1/h;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw1/h;->E:Ln1/d;

    .line 5
    .line 6
    iget-object v1, v0, Ln1/d;->f:Ln1/c;

    .line 7
    .line 8
    iput-object p1, v1, Ln1/c;->i:[I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {v1, p1}, Ln1/c;->a(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ln1/c;->a(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public varargs setColorSchemeResources([I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, p1

    .line 6
    new-array v1, v1, [I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    array-length v3, p1

    .line 10
    if-ge v2, v3, :cond_0

    .line 11
    .line 12
    aget v3, p1, v2

    .line 13
    .line 14
    invoke-static {v0, v3}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    aput v3, v1, v2

    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0, v1}, Lw1/h;->setColorSchemeColors([I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setDistanceToTriggerSync(I)V
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    iput p1, p0, Lw1/h;->j:F

    .line 3
    .line 4
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lw1/h;->f()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/h;->m:Lp0/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp0/n;->g(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnChildScrollUpCallback(Lw1/f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnRefreshListener(Lw1/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw1/h;->g:Lw1/g;

    .line 2
    .line 3
    return-void
.end method

.method public setProgressBackgroundColor(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lw1/h;->setProgressBackgroundColorSchemeResource(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setProgressBackgroundColorSchemeColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw1/a;->setBackgroundColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProgressBackgroundColorSchemeResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lw1/h;->setProgressBackgroundColorSchemeColor(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setRefreshing(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-boolean v1, p0, Lw1/h;->h:Z

    .line 5
    .line 6
    if-eq v1, p1, :cond_1

    .line 7
    .line 8
    iput-boolean p1, p0, Lw1/h;->h:Z

    .line 9
    .line 10
    iget p1, p0, Lw1/h;->C:I

    .line 11
    .line 12
    iget v1, p0, Lw1/h;->B:I

    .line 13
    .line 14
    add-int/2addr p1, v1

    .line 15
    iget v1, p0, Lw1/h;->r:I

    .line 16
    .line 17
    sub-int/2addr p1, v1

    .line 18
    invoke-virtual {p0, p1}, Lw1/h;->setTargetOffsetTopAndBottom(I)V

    .line 19
    .line 20
    .line 21
    iput-boolean v0, p0, Lw1/h;->J:Z

    .line 22
    .line 23
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lw1/h;->E:Ln1/d;

    .line 29
    .line 30
    const/16 v0, 0xff

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ln1/d;->setAlpha(I)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Lw1/c;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-direct {p1, p0, v0}, Lw1/c;-><init>(Lw1/h;I)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lw1/h;->F:Lw1/c;

    .line 42
    .line 43
    iget v0, p0, Lw1/h;->q:I

    .line 44
    .line 45
    int-to-long v0, v0

    .line 46
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lw1/h;->M:Lw1/b;

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 54
    .line 55
    iput-object p1, v0, Lw1/a;->i:Landroid/view/animation/Animation$AnimationListener;

    .line 56
    .line 57
    :cond_0
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 63
    .line 64
    iget-object v0, p0, Lw1/h;->F:Lw1/c;

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    invoke-virtual {p0, p1, v0}, Lw1/h;->g(ZZ)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public setSize(I)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    const/high16 v1, 0x42600000    # 56.0f

    .line 18
    .line 19
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 20
    .line 21
    mul-float/2addr v0, v1

    .line 22
    float-to-int v0, v0

    .line 23
    iput v0, p0, Lw1/h;->K:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/high16 v1, 0x42200000    # 40.0f

    .line 27
    .line 28
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 29
    .line 30
    mul-float/2addr v0, v1

    .line 31
    float-to-int v0, v0

    .line 32
    iput v0, p0, Lw1/h;->K:I

    .line 33
    .line 34
    :goto_0
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Lk/z;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lw1/h;->E:Ln1/d;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ln1/d;->c(I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lw1/h;->y:Lw1/a;

    .line 46
    .line 47
    iget-object v0, p0, Lw1/h;->E:Ln1/d;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lk/z;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public setSlingshotDistance(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw1/h;->D:I

    .line 2
    .line 3
    return-void
.end method

.method public setTargetOffsetTopAndBottom(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/h;->y:Lw1/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lw1/h;->r:I

    .line 16
    .line 17
    return-void
.end method

.method public final startNestedScroll(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/h;->m:Lp0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lp0/n;->h(II)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public final stopNestedScroll()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/h;->m:Lp0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lp0/n;->i(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
