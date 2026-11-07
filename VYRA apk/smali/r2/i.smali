.class public final Lr2/i;
.super Lk1/b0;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final d:Ljava/util/ArrayList;

.field public e:Lj/o;

.field public f:Z

.field public final synthetic g:Lr2/q;


# direct methods
.method public constructor <init>(Lr2/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr2/i;->g:Lr2/q;

    .line 2
    .line 3
    invoke-direct {p0}, Lk1/b0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lr2/i;->d:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Lr2/i;->g()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/i;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b(I)J
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    return-wide v0
.end method

.method public final c(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/i;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lr2/k;

    .line 8
    .line 9
    instance-of v0, p1, Lr2/l;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    return p1

    .line 15
    :cond_0
    instance-of v0, p1, Lr2/j;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    return p1

    .line 21
    :cond_1
    instance-of v0, p1, Lr2/m;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    check-cast p1, Lr2/m;

    .line 26
    .line 27
    iget-object p1, p1, Lr2/m;->a:Lj/o;

    .line 28
    .line 29
    invoke-virtual {p1}, Lj/o;->hasSubMenu()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_2
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    .line 40
    .line 41
    const-string v0, "Unknown item type."

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
.end method

.method public final d(Lk1/x0;I)V
    .locals 6

    .line 1
    check-cast p1, Lr2/p;

    .line 2
    .line 3
    iget-object p1, p1, Lk1/x0;->a:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lr2/i;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lr2/i;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v2, p0, Lr2/i;->g:Lr2/q;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-eq v0, v3, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Lr2/l;

    .line 27
    .line 28
    iget v0, v2, Lr2/q;->x:I

    .line 29
    .line 30
    iget v1, p2, Lr2/l;->a:I

    .line 31
    .line 32
    iget v2, v2, Lr2/q;->y:I

    .line 33
    .line 34
    iget p2, p2, Lr2/l;->b:I

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    check-cast p1, Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lr2/m;

    .line 47
    .line 48
    iget-object v0, v0, Lr2/m;->a:Lj/o;

    .line 49
    .line 50
    iget-object v0, v0, Lj/o;->e:Ljava/lang/CharSequence;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    iget v0, v2, Lr2/q;->l:I

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 58
    .line 59
    .line 60
    iget v0, v2, Lr2/q;->z:I

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget v4, v2, Lr2/q;->A:I

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {p1, v0, v1, v4, v5}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 73
    .line 74
    .line 75
    iget-object v0, v2, Lr2/q;->m:Landroid/content/res/ColorStateList;

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    new-instance v0, Lr2/h;

    .line 83
    .line 84
    invoke-direct {v0, p0, p2, v3}, Lr2/h;-><init>(Lr2/i;IZ)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v0}, Lp0/p0;->m(Landroid/view/View;Lp0/b;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    check-cast p1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 92
    .line 93
    iget-object v0, v2, Lr2/q;->q:Landroid/content/res/ColorStateList;

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 96
    .line 97
    .line 98
    iget v0, v2, Lr2/q;->n:I

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setTextAppearance(I)V

    .line 101
    .line 102
    .line 103
    iget-object v0, v2, Lr2/q;->p:Landroid/content/res/ColorStateList;

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    iget-object v0, v2, Lr2/q;->r:Landroid/graphics/drawable/Drawable;

    .line 111
    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    goto :goto_0

    .line 123
    :cond_5
    const/4 v0, 0x0

    .line 124
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, v2, Lr2/q;->s:Landroid/graphics/drawable/RippleDrawable;

    .line 128
    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    invoke-virtual {v0}, Landroid/graphics/drawable/RippleDrawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {p1, v0}, Lr2/d;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Lr2/m;

    .line 147
    .line 148
    iget-boolean v1, v0, Lr2/m;->b:Z

    .line 149
    .line 150
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setNeedsEmptyIcon(Z)V

    .line 151
    .line 152
    .line 153
    iget v1, v2, Lr2/q;->t:I

    .line 154
    .line 155
    iget v3, v2, Lr2/q;->u:I

    .line 156
    .line 157
    invoke-virtual {p1, v1, v3, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 158
    .line 159
    .line 160
    iget v1, v2, Lr2/q;->v:I

    .line 161
    .line 162
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconPadding(I)V

    .line 163
    .line 164
    .line 165
    iget-boolean v1, v2, Lr2/q;->B:Z

    .line 166
    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    iget v1, v2, Lr2/q;->w:I

    .line 170
    .line 171
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconSize(I)V

    .line 172
    .line 173
    .line 174
    :cond_7
    iget v1, v2, Lr2/q;->D:I

    .line 175
    .line 176
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setMaxLines(I)V

    .line 177
    .line 178
    .line 179
    iget-object v0, v0, Lr2/m;->a:Lj/o;

    .line 180
    .line 181
    iget-boolean v1, v2, Lr2/q;->o:Z

    .line 182
    .line 183
    iput-boolean v1, p1, Lcom/google/android/material/internal/NavigationMenuItemView;->D:Z

    .line 184
    .line 185
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->b(Lj/o;)V

    .line 186
    .line 187
    .line 188
    new-instance v0, Lr2/h;

    .line 189
    .line 190
    const/4 v1, 0x0

    .line 191
    invoke-direct {v0, p0, p2, v1}, Lr2/h;-><init>(Lr2/i;IZ)V

    .line 192
    .line 193
    .line 194
    invoke-static {p1, v0}, Lp0/p0;->m(Landroid/view/View;Lp0/b;)V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public final e(Landroid/view/ViewGroup;I)Lk1/x0;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lr2/i;->g:Lr2/q;

    .line 3
    .line 4
    if-eqz p2, :cond_3

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq p2, v2, :cond_2

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-eq p2, v2, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x3

    .line 13
    if-eq p2, p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1

    .line 17
    :cond_0
    new-instance p1, Lr2/g;

    .line 18
    .line 19
    iget-object p2, v1, Lr2/q;->g:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    invoke-direct {p1, p2}, Lk1/x0;-><init>(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    new-instance p2, Lr2/g;

    .line 26
    .line 27
    iget-object v1, v1, Lr2/q;->k:Landroid/view/LayoutInflater;

    .line 28
    .line 29
    const v2, 0x7f0c002b

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p2, p1}, Lk1/x0;-><init>(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    return-object p2

    .line 40
    :cond_2
    new-instance p2, Lr2/g;

    .line 41
    .line 42
    iget-object v1, v1, Lr2/q;->k:Landroid/view/LayoutInflater;

    .line 43
    .line 44
    const v2, 0x7f0c002c

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p2, p1}, Lk1/x0;-><init>(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    return-object p2

    .line 55
    :cond_3
    new-instance p2, Lr2/o;

    .line 56
    .line 57
    iget-object v2, v1, Lr2/q;->k:Landroid/view/LayoutInflater;

    .line 58
    .line 59
    iget-object v1, v1, Lr2/q;->H:Lcom/google/android/material/datepicker/k;

    .line 60
    .line 61
    const v3, 0x7f0c0029

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {p2, p1}, Lk1/x0;-><init>(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    .line 73
    .line 74
    return-object p2
.end method

.method public final f(Lk1/x0;)V
    .locals 1

    .line 1
    check-cast p1, Lr2/p;

    .line 2
    .line 3
    instance-of v0, p1, Lr2/o;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object p1, p1, Lk1/x0;->a:Landroid/view/View;

    .line 8
    .line 9
    check-cast p1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 10
    .line 11
    iget-object v0, p1, Lcom/google/android/material/internal/NavigationMenuItemView;->F:Landroid/widget/FrameLayout;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p1, p1, Lcom/google/android/material/internal/NavigationMenuItemView;->E:Landroid/widget/CheckedTextView;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lr2/i;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lr2/i;->f:Z

    .line 10
    .line 11
    iget-object v2, v0, Lr2/i;->d:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lr2/j;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object v3, v0, Lr2/i;->g:Lr2/q;

    .line 25
    .line 26
    iget-object v4, v3, Lr2/q;->h:Lj/m;

    .line 27
    .line 28
    invoke-virtual {v4}, Lj/m;->l()Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, -0x1

    .line 38
    move v7, v5

    .line 39
    move v8, v7

    .line 40
    move v9, v8

    .line 41
    :goto_0
    if-ge v7, v4, :cond_f

    .line 42
    .line 43
    iget-object v10, v3, Lr2/q;->h:Lj/m;

    .line 44
    .line 45
    invoke-virtual {v10}, Lj/m;->l()Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    check-cast v10, Lj/o;

    .line 54
    .line 55
    invoke-virtual {v10}, Lj/o;->isChecked()Z

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    if-eqz v11, :cond_1

    .line 60
    .line 61
    invoke-virtual {v0, v10}, Lr2/i;->h(Lj/o;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v10}, Lj/o;->isCheckable()Z

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-eqz v11, :cond_2

    .line 69
    .line 70
    invoke-virtual {v10, v5}, Lj/o;->f(Z)V

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {v10}, Lj/o;->hasSubMenu()Z

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    if-eqz v11, :cond_9

    .line 78
    .line 79
    iget-object v11, v10, Lj/o;->o:Lj/e0;

    .line 80
    .line 81
    invoke-virtual {v11}, Lj/m;->hasVisibleItems()Z

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    if-eqz v12, :cond_e

    .line 86
    .line 87
    if-eqz v7, :cond_3

    .line 88
    .line 89
    new-instance v12, Lr2/l;

    .line 90
    .line 91
    iget v13, v3, Lr2/q;->F:I

    .line 92
    .line 93
    invoke-direct {v12, v13, v5}, Lr2/l;-><init>(II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_3
    new-instance v12, Lr2/m;

    .line 100
    .line 101
    invoke-direct {v12, v10}, Lr2/m;-><init>(Lj/o;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    iget-object v12, v11, Lj/m;->f:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    move v13, v5

    .line 118
    move v14, v13

    .line 119
    :goto_1
    if-ge v13, v12, :cond_8

    .line 120
    .line 121
    invoke-virtual {v11, v13}, Lj/m;->getItem(I)Landroid/view/MenuItem;

    .line 122
    .line 123
    .line 124
    move-result-object v15

    .line 125
    check-cast v15, Lj/o;

    .line 126
    .line 127
    invoke-virtual {v15}, Lj/o;->isVisible()Z

    .line 128
    .line 129
    .line 130
    move-result v16

    .line 131
    if-eqz v16, :cond_7

    .line 132
    .line 133
    if-nez v14, :cond_4

    .line 134
    .line 135
    invoke-virtual {v15}, Lj/o;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 136
    .line 137
    .line 138
    move-result-object v16

    .line 139
    if-eqz v16, :cond_4

    .line 140
    .line 141
    move v14, v1

    .line 142
    :cond_4
    invoke-virtual {v15}, Lj/o;->isCheckable()Z

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    if-eqz v16, :cond_5

    .line 147
    .line 148
    invoke-virtual {v15, v5}, Lj/o;->f(Z)V

    .line 149
    .line 150
    .line 151
    :cond_5
    invoke-virtual {v15}, Lj/o;->isChecked()Z

    .line 152
    .line 153
    .line 154
    move-result v16

    .line 155
    if-eqz v16, :cond_6

    .line 156
    .line 157
    invoke-virtual {v0, v15}, Lr2/i;->h(Lj/o;)V

    .line 158
    .line 159
    .line 160
    :cond_6
    new-instance v5, Lr2/m;

    .line 161
    .line 162
    invoke-direct {v5, v15}, Lr2/m;-><init>(Lj/o;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    :cond_7
    add-int/lit8 v13, v13, 0x1

    .line 169
    .line 170
    const/4 v5, 0x0

    .line 171
    goto :goto_1

    .line 172
    :cond_8
    if-eqz v14, :cond_e

    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    :goto_2
    if-ge v10, v5, :cond_e

    .line 179
    .line 180
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    check-cast v11, Lr2/m;

    .line 185
    .line 186
    iput-boolean v1, v11, Lr2/m;->b:Z

    .line 187
    .line 188
    add-int/lit8 v10, v10, 0x1

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_9
    iget v5, v10, Lj/o;->b:I

    .line 192
    .line 193
    if-eq v5, v6, :cond_b

    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    invoke-virtual {v10}, Lj/o;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    if-eqz v6, :cond_a

    .line 204
    .line 205
    move v8, v1

    .line 206
    goto :goto_3

    .line 207
    :cond_a
    const/4 v8, 0x0

    .line 208
    :goto_3
    if-eqz v7, :cond_d

    .line 209
    .line 210
    add-int/lit8 v9, v9, 0x1

    .line 211
    .line 212
    new-instance v6, Lr2/l;

    .line 213
    .line 214
    iget v11, v3, Lr2/q;->F:I

    .line 215
    .line 216
    invoke-direct {v6, v11, v11}, Lr2/l;-><init>(II)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_b
    if-nez v8, :cond_d

    .line 224
    .line 225
    invoke-virtual {v10}, Lj/o;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    if-eqz v6, :cond_d

    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    move v8, v9

    .line 236
    :goto_4
    if-ge v8, v6, :cond_c

    .line 237
    .line 238
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    check-cast v11, Lr2/m;

    .line 243
    .line 244
    iput-boolean v1, v11, Lr2/m;->b:Z

    .line 245
    .line 246
    add-int/lit8 v8, v8, 0x1

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_c
    move v8, v1

    .line 250
    :cond_d
    :goto_5
    new-instance v6, Lr2/m;

    .line 251
    .line 252
    invoke-direct {v6, v10}, Lr2/m;-><init>(Lj/o;)V

    .line 253
    .line 254
    .line 255
    iput-boolean v8, v6, Lr2/m;->b:Z

    .line 256
    .line 257
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move v6, v5

    .line 261
    :cond_e
    add-int/lit8 v7, v7, 0x1

    .line 262
    .line 263
    const/4 v5, 0x0

    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :cond_f
    iput-boolean v5, v0, Lr2/i;->f:Z

    .line 267
    .line 268
    return-void
.end method

.method public final h(Lj/o;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr2/i;->e:Lj/o;

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    invoke-virtual {p1}, Lj/o;->isCheckable()Z

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
    iget-object v0, p0, Lr2/i;->e:Lj/o;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Lj/o;->setChecked(Z)Landroid/view/MenuItem;

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-object p1, p0, Lr2/i;->e:Lj/o;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p1, v0}, Lj/o;->setChecked(Z)Landroid/view/MenuItem;

    .line 24
    .line 25
    .line 26
    :cond_2
    :goto_0
    return-void
.end method
