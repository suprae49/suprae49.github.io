.class public Le/f;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq0/n;


# instance fields
.field public final f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 25
    iput v0, p0, Le/f;->f:I

    const/4 v0, 0x0

    .line 26
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le/f;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 23
    invoke-static {p1, v0}, Le/g;->f(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Le/f;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le/b;

    .line 5
    .line 6
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 7
    .line 8
    invoke-static {p1, p2}, Le/g;->f(Landroid/content/Context;I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Le/b;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Le/f;->g:Ljava/lang/Object;

    .line 19
    .line 20
    iput p2, p0, Le/f;->f:I

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f;->g:Ljava/lang/Object;

    iput p2, p0, Le/f;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput v0, p0, Le/f;->f:I

    .line 29
    iput-object p1, p0, Le/f;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Le/g;
    .locals 12

    .line 1
    new-instance v0, Le/g;

    .line 2
    .line 3
    iget-object v1, p0, Le/f;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Le/b;

    .line 6
    .line 7
    iget-object v2, v1, Le/b;->a:Landroid/view/ContextThemeWrapper;

    .line 8
    .line 9
    iget v3, p0, Le/f;->f:I

    .line 10
    .line 11
    invoke-direct {v0, v2, v3}, Le/g;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Le/b;->e:Landroid/view/View;

    .line 15
    .line 16
    iget-object v3, v0, Le/g;->k:Le/e;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iput-object v2, v3, Le/e;->w:Landroid/view/View;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v2, v1, Le/b;->d:Ljava/lang/CharSequence;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iput-object v2, v3, Le/e;->d:Ljava/lang/CharSequence;

    .line 29
    .line 30
    iget-object v5, v3, Le/e;->u:Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v2, v1, Le/b;->c:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    iput-object v2, v3, Le/e;->s:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    iget-object v5, v3, Le/e;->t:Landroid/widget/ImageView;

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v5, v3, Le/e;->t:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    iget-object v2, v1, Le/b;->f:Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iput-object v2, v3, Le/e;->e:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v5, v3, Le/e;->v:Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object v2, v1, Le/b;->g:Ljava/lang/CharSequence;

    .line 69
    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const/4 v5, -0x1

    .line 74
    iget-object v6, v1, Le/b;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 75
    .line 76
    invoke-virtual {v3, v5, v2, v6}, Le/e;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-object v2, v1, Le/b;->i:Ljava/lang/CharSequence;

    .line 80
    .line 81
    if-nez v2, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    const/4 v5, -0x2

    .line 85
    iget-object v6, v1, Le/b;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 86
    .line 87
    invoke-virtual {v3, v5, v2, v6}, Le/e;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    iget-object v2, v1, Le/b;->m:[Ljava/lang/CharSequence;

    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v6, 0x1

    .line 94
    if-nez v2, :cond_6

    .line 95
    .line 96
    iget-object v2, v1, Le/b;->n:Landroid/widget/ListAdapter;

    .line 97
    .line 98
    if-eqz v2, :cond_b

    .line 99
    .line 100
    :cond_6
    iget-object v2, v1, Le/b;->b:Landroid/view/LayoutInflater;

    .line 101
    .line 102
    iget v7, v3, Le/e;->A:I

    .line 103
    .line 104
    invoke-virtual {v2, v7, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 109
    .line 110
    iget-boolean v7, v1, Le/b;->q:Z

    .line 111
    .line 112
    if-eqz v7, :cond_7

    .line 113
    .line 114
    iget v7, v3, Le/e;->B:I

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_7
    iget v7, v3, Le/e;->C:I

    .line 118
    .line 119
    :goto_3
    iget-object v8, v1, Le/b;->n:Landroid/widget/ListAdapter;

    .line 120
    .line 121
    if-eqz v8, :cond_8

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_8
    new-instance v8, Le/d;

    .line 125
    .line 126
    iget-object v9, v1, Le/b;->a:Landroid/view/ContextThemeWrapper;

    .line 127
    .line 128
    const v10, 0x1020014

    .line 129
    .line 130
    .line 131
    iget-object v11, v1, Le/b;->m:[Ljava/lang/CharSequence;

    .line 132
    .line 133
    invoke-direct {v8, v9, v7, v10, v11}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :goto_4
    iput-object v8, v3, Le/e;->x:Landroid/widget/ListAdapter;

    .line 137
    .line 138
    iget v7, v1, Le/b;->r:I

    .line 139
    .line 140
    iput v7, v3, Le/e;->y:I

    .line 141
    .line 142
    iget-object v7, v1, Le/b;->o:Landroid/content/DialogInterface$OnClickListener;

    .line 143
    .line 144
    if-eqz v7, :cond_9

    .line 145
    .line 146
    new-instance v7, Le/a;

    .line 147
    .line 148
    invoke-direct {v7, v1, v3}, Le/a;-><init>(Le/b;Le/e;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v7}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 152
    .line 153
    .line 154
    :cond_9
    iget-boolean v7, v1, Le/b;->q:Z

    .line 155
    .line 156
    if-eqz v7, :cond_a

    .line 157
    .line 158
    invoke-virtual {v2, v6}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 159
    .line 160
    .line 161
    :cond_a
    iput-object v2, v3, Le/e;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 162
    .line 163
    :cond_b
    iget-object v2, v1, Le/b;->p:Landroid/widget/EditText;

    .line 164
    .line 165
    if-eqz v2, :cond_c

    .line 166
    .line 167
    iput-object v2, v3, Le/e;->g:Landroid/widget/EditText;

    .line 168
    .line 169
    iput-boolean v4, v3, Le/e;->h:Z

    .line 170
    .line 171
    :cond_c
    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 178
    .line 179
    .line 180
    iget-object v2, v1, Le/b;->k:Landroid/content/DialogInterface$OnDismissListener;

    .line 181
    .line 182
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 183
    .line 184
    .line 185
    iget-object v1, v1, Le/b;->l:Lj/n;

    .line 186
    .line 187
    if-eqz v1, :cond_d

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 190
    .line 191
    .line 192
    :cond_d
    return-object v0
.end method

.method public e(Landroid/view/View;)Z
    .locals 1

    .line 1
    iget-object p1, p0, Le/f;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    iget v0, p0, Le/f;->f:I

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1
.end method
