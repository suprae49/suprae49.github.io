.class public abstract Lu2/j;
.super Landroid/view/ViewGroup;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lj/a0;


# static fields
.field public static final e0:[I

.field public static final f0:[I


# instance fields
.field public final A:Landroid/util/SparseArray;

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:Z

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:La3/o;

.field public O:Z

.field public P:Landroid/content/res/ColorStateList;

.field public Q:Lcom/google/android/material/navigation/b;

.field public R:Lu2/h;

.field public S:Z

.field public T:Z

.field public U:I

.field public V:I

.field public W:Z

.field public a0:Landroid/view/MenuItem;

.field public b0:I

.field public c0:Z

.field public final d0:Landroid/graphics/Rect;

.field public final f:Lp1/a;

.field public final g:Lcom/google/android/material/datepicker/k;

.field public h:Lo0/d;

.field public final i:Landroid/util/SparseArray;

.field public j:I

.field public k:I

.field public l:[Lu2/i;

.field public m:I

.field public n:I

.field public o:Landroid/content/res/ColorStateList;

.field public p:I

.field public q:Landroid/content/res/ColorStateList;

.field public final r:Landroid/content/res/ColorStateList;

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:Z

.field public x:Landroid/graphics/drawable/Drawable;

.field public y:Landroid/content/res/ColorStateList;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lu2/j;->e0:[I

    .line 9
    .line 10
    const v0, -0x101009e

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lu2/j;->f0:[I

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lu2/j;->i:Landroid/util/SparseArray;

    .line 10
    .line 11
    const/4 p1, -0x1

    .line 12
    iput p1, p0, Lu2/j;->m:I

    .line 13
    .line 14
    iput p1, p0, Lu2/j;->n:I

    .line 15
    .line 16
    new-instance v0, Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lu2/j;->A:Landroid/util/SparseArray;

    .line 22
    .line 23
    iput p1, p0, Lu2/j;->B:I

    .line 24
    .line 25
    iput p1, p0, Lu2/j;->C:I

    .line 26
    .line 27
    iput p1, p0, Lu2/j;->D:I

    .line 28
    .line 29
    iput p1, p0, Lu2/j;->E:I

    .line 30
    .line 31
    const/16 p1, 0x31

    .line 32
    .line 33
    iput p1, p0, Lu2/j;->M:I

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lu2/j;->O:Z

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    iput v0, p0, Lu2/j;->U:I

    .line 40
    .line 41
    iput p1, p0, Lu2/j;->V:I

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iput-object v1, p0, Lu2/j;->a0:Landroid/view/MenuItem;

    .line 45
    .line 46
    const/4 v2, 0x7

    .line 47
    iput v2, p0, Lu2/j;->b0:I

    .line 48
    .line 49
    iput-boolean p1, p0, Lu2/j;->c0:Z

    .line 50
    .line 51
    new-instance v2, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lu2/j;->d0:Landroid/graphics/Rect;

    .line 57
    .line 58
    invoke-virtual {p0}, Lu2/j;->c()Landroid/content/res/ColorStateList;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iput-object v2, p0, Lu2/j;->r:Landroid/content/res/ColorStateList;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    iput-object v1, p0, Lu2/j;->f:Lp1/a;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance v1, Lp1/a;

    .line 74
    .line 75
    invoke-direct {v1}, Lp1/a;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, Lu2/j;->f:Lp1/a;

    .line 79
    .line 80
    invoke-virtual {v1, p1}, Lp1/x;->O(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lp1/x;->o()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const v3, 0x7f0a002e

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    const v3, 0x7f0403d3

    .line 102
    .line 103
    .line 104
    invoke-static {p1, v3, v2}, Lt2/i;->K(Landroid/content/Context;II)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    int-to-long v2, p1

    .line 109
    invoke-virtual {v1, v2, v3}, Lp1/x;->M(J)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const v2, 0x7f0403e0

    .line 117
    .line 118
    .line 119
    sget-object v3, Lb2/a;->b:Le1/a;

    .line 120
    .line 121
    invoke-static {p1, v2, v3}, Lt2/i;->L(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {v1, p1}, Lp1/x;->N(Landroid/animation/TimeInterpolator;)V

    .line 126
    .line 127
    .line 128
    new-instance p1, Lr2/y;

    .line 129
    .line 130
    invoke-direct {p1}, Lp1/r;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, p1}, Lp1/x;->L(Lp1/r;)V

    .line 134
    .line 135
    .line 136
    :goto_0
    new-instance p1, Lcom/google/android/material/datepicker/k;

    .line 137
    .line 138
    move-object v1, p0

    .line 139
    check-cast v1, Lg2/b;

    .line 140
    .line 141
    const/4 v2, 0x6

    .line 142
    invoke-direct {p1, v2, v1}, Lcom/google/android/material/datepicker/k;-><init>(ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, Lu2/j;->g:Lcom/google/android/material/datepicker/k;

    .line 146
    .line 147
    invoke-virtual {p0, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method private getCollapsedVisibleItemCount()I
    .locals 2

    .line 1
    iget v0, p0, Lu2/j;->b0:I

    .line 2
    .line 3
    iget-object v1, p0, Lu2/j;->R:Lu2/h;

    .line 4
    .line 5
    iget v1, v1, Lu2/h;->e:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method private getNewItem()Lu2/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/j;->h:Lo0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lo0/d;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lu2/f;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lg2/a;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lu2/f;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    return-object v0
.end method

.method private setBadgeIfNeeded(Lu2/f;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lu2/j;->A:Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ld2/a;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lu2/f;->setBadge(Ld2/a;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lj/m;)V
    .locals 1

    .line 1
    new-instance v0, Lu2/h;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lu2/h;-><init>(Lj/m;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lu2/j;->R:Lu2/h;

    .line 7
    .line 8
    return-void
.end method

.method public final b()V
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v3, p0, Lu2/j;->h:Lo0/d;

    .line 11
    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    array-length v3, v0

    .line 15
    move v4, v2

    .line 16
    :goto_0
    if-ge v4, v3, :cond_1

    .line 17
    .line 18
    aget-object v5, v0, v4

    .line 19
    .line 20
    instance-of v6, v5, Lu2/f;

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    iget-object v6, p0, Lu2/j;->h:Lo0/d;

    .line 25
    .line 26
    check-cast v5, Lu2/f;

    .line 27
    .line 28
    invoke-virtual {v6, v5}, Lo0/d;->c(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget-object v6, v5, Lu2/f;->y:Landroid/widget/ImageView;

    .line 32
    .line 33
    invoke-virtual {v5, v6}, Lu2/f;->j(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, v5, Lu2/f;->N:Lj/o;

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    iput v6, v5, Lu2/f;->T:F

    .line 40
    .line 41
    iput-boolean v2, v5, Lu2/f;->f:Z

    .line 42
    .line 43
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v0, p0, Lu2/j;->Q:Lcom/google/android/material/navigation/b;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    iput-boolean v3, v0, Lcom/google/android/material/navigation/b;->g:Z

    .line 50
    .line 51
    iget-object v0, p0, Lu2/j;->R:Lu2/h;

    .line 52
    .line 53
    invoke-virtual {v0}, Lu2/h;->b()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lu2/j;->Q:Lcom/google/android/material/navigation/b;

    .line 57
    .line 58
    iput-boolean v2, v0, Lcom/google/android/material/navigation/b;->g:Z

    .line 59
    .line 60
    iget-object v0, p0, Lu2/j;->R:Lu2/h;

    .line 61
    .line 62
    iget v0, v0, Lu2/h;->c:I

    .line 63
    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    iput v2, p0, Lu2/j;->m:I

    .line 67
    .line 68
    iput v2, p0, Lu2/j;->n:I

    .line 69
    .line 70
    iput-object v1, p0, Lu2/j;->l:[Lu2/i;

    .line 71
    .line 72
    iput-object v1, p0, Lu2/j;->h:Lo0/d;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    iget-object v1, p0, Lu2/j;->h:Lo0/d;

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    iget v1, p0, Lu2/j;->V:I

    .line 80
    .line 81
    if-eq v1, v0, :cond_4

    .line 82
    .line 83
    :cond_3
    iput v0, p0, Lu2/j;->V:I

    .line 84
    .line 85
    new-instance v1, Lo0/d;

    .line 86
    .line 87
    invoke-direct {v1, v0}, Lo0/d;-><init>(I)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Lu2/j;->h:Lo0/d;

    .line 91
    .line 92
    :cond_4
    new-instance v0, Ljava/util/HashSet;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 95
    .line 96
    .line 97
    move v1, v2

    .line 98
    :goto_1
    iget-object v4, p0, Lu2/j;->R:Lu2/h;

    .line 99
    .line 100
    iget-object v4, v4, Lu2/h;->b:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-ge v1, v4, :cond_5

    .line 107
    .line 108
    iget-object v4, p0, Lu2/j;->R:Lu2/h;

    .line 109
    .line 110
    invoke-virtual {v4, v1}, Lu2/h;->a(I)Landroid/view/MenuItem;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    add-int/lit8 v1, v1, 0x1

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_5
    move v1, v2

    .line 129
    :goto_2
    iget-object v4, p0, Lu2/j;->A:Landroid/util/SparseArray;

    .line 130
    .line 131
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-ge v1, v5, :cond_7

    .line 136
    .line 137
    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-nez v6, :cond_6

    .line 150
    .line 151
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->delete(I)V

    .line 152
    .line 153
    .line 154
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_7
    iget-object v0, p0, Lu2/j;->R:Lu2/h;

    .line 158
    .line 159
    iget-object v0, v0, Lu2/h;->b:Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    new-array v1, v0, [Lu2/i;

    .line 166
    .line 167
    iput-object v1, p0, Lu2/j;->l:[Lu2/i;

    .line 168
    .line 169
    iget v1, p0, Lu2/j;->j:I

    .line 170
    .line 171
    invoke-virtual {p0}, Lu2/j;->getCurrentVisibleContentItemCount()I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    const/4 v5, -0x1

    .line 176
    if-ne v1, v5, :cond_8

    .line 177
    .line 178
    const/4 v1, 0x3

    .line 179
    if-le v4, v1, :cond_9

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_8
    if-nez v1, :cond_9

    .line 183
    .line 184
    :goto_3
    move v1, v3

    .line 185
    goto :goto_4

    .line 186
    :cond_9
    move v1, v2

    .line 187
    :goto_4
    move v4, v2

    .line 188
    move v6, v4

    .line 189
    move v7, v6

    .line 190
    :goto_5
    if-ge v4, v0, :cond_11

    .line 191
    .line 192
    iget-object v8, p0, Lu2/j;->R:Lu2/h;

    .line 193
    .line 194
    invoke-virtual {v8, v4}, Lu2/h;->a(I)Landroid/view/MenuItem;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    instance-of v9, v8, Lu2/a;

    .line 199
    .line 200
    if-eqz v9, :cond_a

    .line 201
    .line 202
    new-instance v10, Lu2/c;

    .line 203
    .line 204
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    invoke-direct {v10, v11}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v11}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    const v12, 0x7f0c003a

    .line 216
    .line 217
    .line 218
    invoke-virtual {v11, v12, v10, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v10}, Lu2/c;->a()V

    .line 222
    .line 223
    .line 224
    invoke-interface {v10, v3}, Lu2/i;->setOnlyShowWhenExpanded(Z)V

    .line 225
    .line 226
    .line 227
    iget-boolean v11, p0, Lu2/j;->c0:Z

    .line 228
    .line 229
    invoke-virtual {v10, v11}, Lu2/c;->setDividersEnabled(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_a
    invoke-interface {v8}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    if-eqz v10, :cond_d

    .line 238
    .line 239
    if-gtz v6, :cond_c

    .line 240
    .line 241
    new-instance v10, Lu2/k;

    .line 242
    .line 243
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    invoke-direct {v10, v6}, Lu2/k;-><init>(Landroid/content/Context;)V

    .line 248
    .line 249
    .line 250
    iget v6, p0, Lu2/j;->v:I

    .line 251
    .line 252
    if-eqz v6, :cond_b

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_b
    iget v6, p0, Lu2/j;->t:I

    .line 256
    .line 257
    :goto_6
    invoke-virtual {v10, v6}, Lu2/k;->setTextAppearance(I)V

    .line 258
    .line 259
    .line 260
    iget-object v6, p0, Lu2/j;->q:Landroid/content/res/ColorStateList;

    .line 261
    .line 262
    invoke-virtual {v10, v6}, Lu2/k;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 263
    .line 264
    .line 265
    invoke-interface {v10, v3}, Lu2/i;->setOnlyShowWhenExpanded(Z)V

    .line 266
    .line 267
    .line 268
    move-object v6, v8

    .line 269
    check-cast v6, Lj/o;

    .line 270
    .line 271
    invoke-virtual {v10, v6}, Lu2/k;->b(Lj/o;)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v8}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-interface {v6}, Landroid/view/Menu;->size()I

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    goto :goto_8

    .line 283
    :cond_c
    const-string v0, "Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar."

    .line 284
    .line 285
    invoke-static {v0}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :cond_d
    if-lez v6, :cond_e

    .line 290
    .line 291
    move-object v10, v8

    .line 292
    check-cast v10, Lj/o;

    .line 293
    .line 294
    invoke-virtual {p0, v4, v10, v1, v3}, Lu2/j;->e(ILj/o;ZZ)Lu2/f;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    add-int/lit8 v6, v6, -0x1

    .line 299
    .line 300
    goto :goto_8

    .line 301
    :cond_e
    move-object v10, v8

    .line 302
    check-cast v10, Lj/o;

    .line 303
    .line 304
    iget v11, p0, Lu2/j;->b0:I

    .line 305
    .line 306
    if-lt v7, v11, :cond_f

    .line 307
    .line 308
    move v11, v3

    .line 309
    goto :goto_7

    .line 310
    :cond_f
    move v11, v2

    .line 311
    :goto_7
    invoke-virtual {p0, v4, v10, v1, v11}, Lu2/j;->e(ILj/o;ZZ)Lu2/f;

    .line 312
    .line 313
    .line 314
    move-result-object v10

    .line 315
    add-int/lit8 v7, v7, 0x1

    .line 316
    .line 317
    :goto_8
    if-nez v9, :cond_10

    .line 318
    .line 319
    invoke-interface {v8}, Landroid/view/MenuItem;->isCheckable()Z

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    if-eqz v8, :cond_10

    .line 324
    .line 325
    iget v8, p0, Lu2/j;->n:I

    .line 326
    .line 327
    if-ne v8, v5, :cond_10

    .line 328
    .line 329
    iput v4, p0, Lu2/j;->n:I

    .line 330
    .line 331
    :cond_10
    iget-object v8, p0, Lu2/j;->l:[Lu2/i;

    .line 332
    .line 333
    aput-object v10, v8, v4

    .line 334
    .line 335
    invoke-virtual {p0, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 336
    .line 337
    .line 338
    add-int/lit8 v4, v4, 0x1

    .line 339
    .line 340
    goto/16 :goto_5

    .line 341
    .line 342
    :cond_11
    sub-int/2addr v0, v3

    .line 343
    iget v1, p0, Lu2/j;->n:I

    .line 344
    .line 345
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    iput v0, p0, Lu2/j;->n:I

    .line 350
    .line 351
    iget-object v1, p0, Lu2/j;->l:[Lu2/i;

    .line 352
    .line 353
    aget-object v0, v1, v0

    .line 354
    .line 355
    invoke-interface {v0}, Lj/z;->getItemData()Lj/o;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {p0, v0}, Lu2/j;->setCheckedItem(Landroid/view/MenuItem;)V

    .line 360
    .line 361
    .line 362
    return-void
.end method

.method public final c()Landroid/content/res/ColorStateList;
    .locals 7

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x1010038

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    .line 30
    .line 31
    invoke-static {v1, v2}, Lc0/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const v4, 0x7f04012d

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v4, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    :goto_0
    const/4 v0, 0x0

    .line 53
    return-object v0

    .line 54
    :cond_1
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    new-instance v3, Landroid/content/res/ColorStateList;

    .line 61
    .line 62
    sget-object v4, Lu2/j;->e0:[I

    .line 63
    .line 64
    sget-object v5, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    .line 65
    .line 66
    sget-object v6, Lu2/j;->f0:[I

    .line 67
    .line 68
    filled-new-array {v6, v4, v5}, [[I

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v1, v6, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    filled-new-array {v1, v0, v2}, [I

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {v3, v4, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 81
    .line 82
    .line 83
    return-object v3
.end method

.method public final d()La3/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/j;->N:La3/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lu2/j;->P:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, La3/j;

    .line 10
    .line 11
    iget-object v1, p0, Lu2/j;->N:La3/o;

    .line 12
    .line 13
    invoke-direct {v0, v1}, La3/j;-><init>(La3/o;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lu2/j;->P:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La3/j;->r(Landroid/content/res/ColorStateList;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public final e(ILj/o;ZZ)Lu2/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/j;->Q:Lcom/google/android/material/navigation/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lcom/google/android/material/navigation/b;->g:Z

    .line 5
    .line 6
    invoke-virtual {p2, v1}, Lj/o;->setCheckable(Z)Landroid/view/MenuItem;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lu2/j;->Q:Lcom/google/android/material/navigation/b;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-boolean v1, v0, Lcom/google/android/material/navigation/b;->g:Z

    .line 13
    .line 14
    invoke-direct {p0}, Lu2/j;->getNewItem()Lu2/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p3}, Lu2/f;->setShifting(Z)V

    .line 19
    .line 20
    .line 21
    iget p3, p0, Lu2/j;->U:I

    .line 22
    .line 23
    invoke-virtual {v0, p3}, Lu2/f;->setLabelMaxLines(I)V

    .line 24
    .line 25
    .line 26
    iget-object p3, p0, Lu2/j;->o:Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    invoke-virtual {v0, p3}, Lu2/f;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 29
    .line 30
    .line 31
    iget p3, p0, Lu2/j;->p:I

    .line 32
    .line 33
    invoke-virtual {v0, p3}, Lu2/f;->setIconSize(I)V

    .line 34
    .line 35
    .line 36
    iget-object p3, p0, Lu2/j;->r:Landroid/content/res/ColorStateList;

    .line 37
    .line 38
    invoke-virtual {v0, p3}, Lu2/f;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 39
    .line 40
    .line 41
    iget p3, p0, Lu2/j;->s:I

    .line 42
    .line 43
    invoke-virtual {v0, p3}, Lu2/f;->setTextAppearanceInactive(I)V

    .line 44
    .line 45
    .line 46
    iget p3, p0, Lu2/j;->t:I

    .line 47
    .line 48
    invoke-virtual {v0, p3}, Lu2/f;->setTextAppearanceActive(I)V

    .line 49
    .line 50
    .line 51
    iget p3, p0, Lu2/j;->u:I

    .line 52
    .line 53
    invoke-virtual {v0, p3}, Lu2/f;->setHorizontalTextAppearanceInactive(I)V

    .line 54
    .line 55
    .line 56
    iget p3, p0, Lu2/j;->v:I

    .line 57
    .line 58
    invoke-virtual {v0, p3}, Lu2/f;->setHorizontalTextAppearanceActive(I)V

    .line 59
    .line 60
    .line 61
    iget-boolean p3, p0, Lu2/j;->w:Z

    .line 62
    .line 63
    invoke-virtual {v0, p3}, Lu2/f;->setTextAppearanceActiveBoldEnabled(Z)V

    .line 64
    .line 65
    .line 66
    iget-object p3, p0, Lu2/j;->q:Landroid/content/res/ColorStateList;

    .line 67
    .line 68
    invoke-virtual {v0, p3}, Lu2/f;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 69
    .line 70
    .line 71
    iget p3, p0, Lu2/j;->B:I

    .line 72
    .line 73
    const/4 v1, -0x1

    .line 74
    if-eq p3, v1, :cond_0

    .line 75
    .line 76
    invoke-virtual {v0, p3}, Lu2/f;->setItemPaddingTop(I)V

    .line 77
    .line 78
    .line 79
    :cond_0
    iget p3, p0, Lu2/j;->C:I

    .line 80
    .line 81
    if-eq p3, v1, :cond_1

    .line 82
    .line 83
    invoke-virtual {v0, p3}, Lu2/f;->setItemPaddingBottom(I)V

    .line 84
    .line 85
    .line 86
    :cond_1
    iget-boolean p3, p0, Lu2/j;->S:Z

    .line 87
    .line 88
    invoke-virtual {v0, p3}, Lu2/f;->setMeasureBottomPaddingFromLabelBaseline(Z)V

    .line 89
    .line 90
    .line 91
    iget-boolean p3, p0, Lu2/j;->T:Z

    .line 92
    .line 93
    invoke-virtual {v0, p3}, Lu2/f;->setLabelFontScalingEnabled(Z)V

    .line 94
    .line 95
    .line 96
    iget p3, p0, Lu2/j;->D:I

    .line 97
    .line 98
    if-eq p3, v1, :cond_2

    .line 99
    .line 100
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorLabelPadding(I)V

    .line 101
    .line 102
    .line 103
    :cond_2
    iget p3, p0, Lu2/j;->E:I

    .line 104
    .line 105
    if-eq p3, v1, :cond_3

    .line 106
    .line 107
    invoke-virtual {v0, p3}, Lu2/f;->setIconLabelHorizontalSpacing(I)V

    .line 108
    .line 109
    .line 110
    :cond_3
    iget p3, p0, Lu2/j;->G:I

    .line 111
    .line 112
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorWidth(I)V

    .line 113
    .line 114
    .line 115
    iget p3, p0, Lu2/j;->H:I

    .line 116
    .line 117
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorHeight(I)V

    .line 118
    .line 119
    .line 120
    iget p3, p0, Lu2/j;->I:I

    .line 121
    .line 122
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorExpandedWidth(I)V

    .line 123
    .line 124
    .line 125
    iget p3, p0, Lu2/j;->J:I

    .line 126
    .line 127
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorExpandedHeight(I)V

    .line 128
    .line 129
    .line 130
    iget p3, p0, Lu2/j;->K:I

    .line 131
    .line 132
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorMarginHorizontal(I)V

    .line 133
    .line 134
    .line 135
    iget p3, p0, Lu2/j;->M:I

    .line 136
    .line 137
    invoke-virtual {v0, p3}, Lu2/f;->setItemGravity(I)V

    .line 138
    .line 139
    .line 140
    iget-object p3, p0, Lu2/j;->d0:Landroid/graphics/Rect;

    .line 141
    .line 142
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorExpandedPadding(Landroid/graphics/Rect;)V

    .line 143
    .line 144
    .line 145
    iget p3, p0, Lu2/j;->L:I

    .line 146
    .line 147
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorExpandedMarginHorizontal(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lu2/j;->d()La3/j;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 155
    .line 156
    .line 157
    iget-boolean p3, p0, Lu2/j;->O:Z

    .line 158
    .line 159
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorResizeable(Z)V

    .line 160
    .line 161
    .line 162
    iget-boolean p3, p0, Lu2/j;->F:Z

    .line 163
    .line 164
    invoke-virtual {v0, p3}, Lu2/f;->setActiveIndicatorEnabled(Z)V

    .line 165
    .line 166
    .line 167
    iget-object p3, p0, Lu2/j;->x:Landroid/graphics/drawable/Drawable;

    .line 168
    .line 169
    if-eqz p3, :cond_4

    .line 170
    .line 171
    invoke-virtual {v0, p3}, Lu2/f;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_4
    iget p3, p0, Lu2/j;->z:I

    .line 176
    .line 177
    invoke-virtual {v0, p3}, Lu2/f;->setItemBackground(I)V

    .line 178
    .line 179
    .line 180
    :goto_0
    iget-object p3, p0, Lu2/j;->y:Landroid/content/res/ColorStateList;

    .line 181
    .line 182
    invoke-virtual {v0, p3}, Lu2/f;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 183
    .line 184
    .line 185
    iget p3, p0, Lu2/j;->j:I

    .line 186
    .line 187
    invoke-virtual {v0, p3}, Lu2/f;->setLabelVisibilityMode(I)V

    .line 188
    .line 189
    .line 190
    iget p3, p0, Lu2/j;->k:I

    .line 191
    .line 192
    invoke-virtual {v0, p3}, Lu2/f;->setItemIconGravity(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, p4}, Lu2/f;->setOnlyShowWhenExpanded(Z)V

    .line 196
    .line 197
    .line 198
    iget-boolean p3, p0, Lu2/j;->W:Z

    .line 199
    .line 200
    invoke-virtual {v0, p3}, Lu2/f;->setExpanded(Z)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, p2}, Lu2/f;->b(Lj/o;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, p1}, Lu2/f;->setItemPosition(I)V

    .line 207
    .line 208
    .line 209
    iget p2, p2, Lj/o;->a:I

    .line 210
    .line 211
    iget-object p3, p0, Lu2/j;->i:Landroid/util/SparseArray;

    .line 212
    .line 213
    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p3

    .line 217
    check-cast p3, Landroid/view/View$OnTouchListener;

    .line 218
    .line 219
    invoke-virtual {v0, p3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 220
    .line 221
    .line 222
    iget-object p3, p0, Lu2/j;->g:Lcom/google/android/material/datepicker/k;

    .line 223
    .line 224
    invoke-virtual {v0, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    .line 226
    .line 227
    iget p3, p0, Lu2/j;->m:I

    .line 228
    .line 229
    if-eqz p3, :cond_5

    .line 230
    .line 231
    if-ne p2, p3, :cond_5

    .line 232
    .line 233
    iput p1, p0, Lu2/j;->n:I

    .line 234
    .line 235
    :cond_5
    invoke-direct {p0, v0}, Lu2/j;->setBadgeIfNeeded(Lu2/f;)V

    .line 236
    .line 237
    .line 238
    return-object v0
.end method

.method public getActiveIndicatorLabelPadding()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->D:I

    .line 2
    .line 3
    return v0
.end method

.method public getBadgeDrawables()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Ld2/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lu2/j;->A:Landroid/util/SparseArray;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCurrentVisibleContentItemCount()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu2/j;->W:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lu2/j;->R:Lu2/h;

    .line 6
    .line 7
    iget v0, v0, Lu2/h;->d:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    invoke-direct {p0}, Lu2/j;->getCollapsedVisibleItemCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public getHorizontalItemTextAppearanceActive()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->v:I

    .line 2
    .line 3
    return v0
.end method

.method public getHorizontalItemTextAppearanceInactive()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public getIconLabelHorizontalSpacing()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->E:I

    .line 2
    .line 3
    return v0
.end method

.method public getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/j;->o:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/j;->P:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemActiveIndicatorEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu2/j;->F:Z

    .line 2
    .line 3
    return v0
.end method

.method public getItemActiveIndicatorExpandedHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->J:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemActiveIndicatorExpandedMarginHorizontal()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->L:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemActiveIndicatorExpandedWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->I:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemActiveIndicatorHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->H:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemActiveIndicatorMarginHorizontal()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->K:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemActiveIndicatorShapeAppearance()La3/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/j;->N:La3/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemActiveIndicatorWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->G:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 1
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-lez v1, :cond_1

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    instance-of v4, v3, Lu2/f;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    check-cast v3, Lu2/f;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v0, p0, Lu2/j;->x:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    return-object v0
.end method

.method public getItemBackgroundRes()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lu2/j;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemGravity()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->M:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemIconGravity()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemIconSize()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemPaddingBottom()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->C:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemPaddingTop()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->B:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemRippleColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/j;->y:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemTextAppearanceActive()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemTextAppearanceInactive()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/j;->q:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLabelMaxLines()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->U:I

    .line 2
    .line 3
    return v0
.end method

.method public getLabelVisibilityMode()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getMenu()Lu2/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/j;->R:Lu2/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScaleLabelTextWithFont()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu2/j;->T:Z

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedItemId()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedItemPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/j;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public getWindowAnimations()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lu2/j;->getCurrentVisibleContentItemCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-static {v2, v0, v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setActiveIndicatorLabelPadding(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->D:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setActiveIndicatorLabelPadding(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setCheckedItem(Landroid/view/MenuItem;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/j;->a0:Landroid/view/MenuItem;

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    invoke-interface {p1}, Landroid/view/MenuItem;->isCheckable()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lu2/j;->a0:Landroid/view/MenuItem;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lu2/j;->a0:Landroid/view/MenuItem;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 26
    .line 27
    .line 28
    :cond_1
    const/4 v0, 0x1

    .line 29
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lu2/j;->a0:Landroid/view/MenuItem;

    .line 33
    .line 34
    :cond_2
    :goto_0
    return-void
.end method

.method public setCollapsedMaxItemCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lu2/j;->b0:I

    .line 2
    .line 3
    return-void
.end method

.method public setExpanded(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lu2/j;->W:Z

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-interface {v3, p1}, Lu2/i;->setExpanded(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public setHorizontalItemTextAppearanceActive(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->v:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setHorizontalTextAppearanceActive(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setHorizontalItemTextAppearanceInactive(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->u:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setHorizontalTextAppearanceInactive(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setIconLabelHorizontalSpacing(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->E:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setIconLabelHorizontalSpacing(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lu2/j;->o:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lu2/j;->P:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p1, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    instance-of v3, v2, Lu2/f;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    check-cast v2, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {p0}, Lu2/j;->d()La3/j;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Lu2/f;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void
.end method

.method public setItemActiveIndicatorEnabled(Z)V
    .locals 5

    .line 1
    iput-boolean p1, p0, Lu2/j;->F:Z

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setActiveIndicatorEnabled(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemActiveIndicatorExpandedHeight(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->J:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setActiveIndicatorExpandedHeight(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemActiveIndicatorExpandedMarginHorizontal(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->L:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setActiveIndicatorExpandedMarginHorizontal(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemActiveIndicatorExpandedWidth(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->I:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setActiveIndicatorExpandedWidth(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemActiveIndicatorHeight(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->H:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setActiveIndicatorHeight(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemActiveIndicatorMarginHorizontal(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->K:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setActiveIndicatorMarginHorizontal(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemActiveIndicatorResizeable(Z)V
    .locals 5

    .line 1
    iput-boolean p1, p0, Lu2/j;->O:Z

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setActiveIndicatorResizeable(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemActiveIndicatorShapeAppearance(La3/o;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lu2/j;->N:La3/o;

    .line 2
    .line 3
    iget-object p1, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    instance-of v3, v2, Lu2/f;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    check-cast v2, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {p0}, Lu2/j;->d()La3/j;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Lu2/f;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void
.end method

.method public setItemActiveIndicatorWidth(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->G:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setActiveIndicatorWidth(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lu2/j;->x:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemBackgroundRes(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->z:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setItemBackground(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemGravity(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->M:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setItemGravity(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemIconGravity(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->k:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setItemIconGravity(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->p:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setIconSize(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 4

    .line 1
    iput p1, p0, Lu2/j;->C:I

    .line 2
    .line 3
    iget-object p1, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    instance-of v3, v2, Lu2/f;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    check-cast v2, Lu2/f;

    .line 18
    .line 19
    iget v3, p0, Lu2/j;->C:I

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Lu2/f;->setItemPaddingBottom(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->B:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setItemPaddingTop(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lu2/j;->y:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->t:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setTextAppearanceActive(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 5

    .line 1
    iput-boolean p1, p0, Lu2/j;->w:Z

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setTextAppearanceActiveBoldEnabled(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->s:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setTextAppearanceInactive(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lu2/j;->q:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setLabelFontScalingEnabled(Z)V
    .locals 5

    .line 1
    iput-boolean p1, p0, Lu2/j;->T:Z

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setLabelFontScalingEnabled(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setLabelMaxLines(I)V
    .locals 5

    .line 1
    iput p1, p0, Lu2/j;->U:I

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setLabelMaxLines(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lu2/j;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public setMeasurePaddingFromLabelBaseline(Z)V
    .locals 5

    .line 1
    iput-boolean p1, p0, Lu2/j;->S:Z

    .line 2
    .line 3
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    instance-of v4, v3, Lu2/f;

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    check-cast v3, Lu2/f;

    .line 18
    .line 19
    invoke-virtual {v3, p1}, Lu2/f;->setMeasureBottomPaddingFromLabelBaseline(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void
.end method

.method public setPresenter(Lcom/google/android/material/navigation/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu2/j;->Q:Lcom/google/android/material/navigation/b;

    .line 2
    .line 3
    return-void
.end method

.method public setSubmenuDividersEnabled(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lu2/j;->c0:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput-boolean p1, p0, Lu2/j;->c0:Z

    .line 7
    .line 8
    iget-object v0, p0, Lu2/j;->l:[Lu2/i;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v1, :cond_2

    .line 15
    .line 16
    aget-object v3, v0, v2

    .line 17
    .line 18
    instance-of v4, v3, Lu2/c;

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    check-cast v3, Lu2/c;

    .line 23
    .line 24
    invoke-virtual {v3, p1}, Lu2/c;->setDividersEnabled(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    return-void
.end method
