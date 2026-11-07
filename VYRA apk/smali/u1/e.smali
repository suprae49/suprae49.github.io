.class public final Lu1/e;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lco/median/android/MainActivity;

.field public b:Z

.field public c:Lu1/h0;

.field public d:Lcom/google/android/material/appbar/AppBarLayout;

.field public final e:Lcom/google/android/material/appbar/MaterialToolbar;

.field public final f:Landroid/widget/ImageView;

.field public final g:Landroid/view/View;

.field public final h:Ljava/util/HashMap;

.field public final i:I

.field public final j:I

.field public k:I

.field public l:Landroid/view/Menu;

.field public m:Landroidx/appcompat/widget/e;

.field public n:Ljava/lang/String;

.field public o:Z

.field public p:Landroid/widget/PopupWindow;

.field public q:I

.field public r:Z

.field public s:Z

.field public t:Lu1/c;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lu1/e;->b:Z

    .line 8
    .line 9
    const v1, 0x7f090224

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1}, Le/j;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast v1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 20
    .line 21
    iput-object v1, p0, Lu1/e;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 22
    .line 23
    const v2, 0x7f090221

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v2}, Le/j;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Landroid/widget/ImageView;

    .line 31
    .line 32
    iput-object v2, p0, Lu1/e;->f:Landroid/widget/ImageView;

    .line 33
    .line 34
    const v2, 0x7f090228

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v2}, Le/j;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iput-object v2, p0, Lu1/e;->g:Landroid/view/View;

    .line 42
    .line 43
    new-instance v2, Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lu1/e;->h:Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-virtual {p1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const v3, 0x7f070055

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    iput v2, p0, Lu1/e;->i:I

    .line 62
    .line 63
    invoke-virtual {p1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const v3, 0x7f070053

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iput v2, p0, Lu1/e;->j:I

    .line 75
    .line 76
    const v2, 0x7f0603e3

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v2}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    iput v2, p0, Lu1/e;->k:I

    .line 84
    .line 85
    invoke-virtual {p1}, Le/j;->u()Le/q;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Le/d0;

    .line 90
    .line 91
    iget-object v2, p1, Le/d0;->o:Ljava/lang/Object;

    .line 92
    .line 93
    instance-of v2, v2, Landroid/app/Activity;

    .line 94
    .line 95
    if-nez v2, :cond_0

    .line 96
    .line 97
    return-void

    .line 98
    :cond_0
    invoke-virtual {p1}, Le/d0;->C()V

    .line 99
    .line 100
    .line 101
    iget-object v2, p1, Le/d0;->t:Lu1/h0;

    .line 102
    .line 103
    instance-of v3, v2, Le/q0;

    .line 104
    .line 105
    if-nez v3, :cond_3

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    iput-object v3, p1, Le/d0;->u:Li/h;

    .line 109
    .line 110
    if-eqz v2, :cond_1

    .line 111
    .line 112
    invoke-virtual {v2}, Lu1/h0;->O()V

    .line 113
    .line 114
    .line 115
    :cond_1
    iput-object v3, p1, Le/d0;->t:Lu1/h0;

    .line 116
    .line 117
    new-instance v2, Le/l0;

    .line 118
    .line 119
    iget-object v3, p1, Le/d0;->o:Ljava/lang/Object;

    .line 120
    .line 121
    instance-of v4, v3, Landroid/app/Activity;

    .line 122
    .line 123
    if-eqz v4, :cond_2

    .line 124
    .line 125
    check-cast v3, Landroid/app/Activity;

    .line 126
    .line 127
    invoke-virtual {v3}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    goto :goto_0

    .line 132
    :cond_2
    iget-object v3, p1, Le/d0;->v:Ljava/lang/CharSequence;

    .line 133
    .line 134
    :goto_0
    iget-object v4, p1, Le/d0;->r:Le/x;

    .line 135
    .line 136
    invoke-direct {v2, v1, v3, v4}, Le/l0;-><init>(Lcom/google/android/material/appbar/MaterialToolbar;Ljava/lang/CharSequence;Le/x;)V

    .line 137
    .line 138
    .line 139
    iput-object v2, p1, Le/d0;->t:Lu1/h0;

    .line 140
    .line 141
    iget-object v3, p1, Le/d0;->r:Le/x;

    .line 142
    .line 143
    iget-object v2, v2, Le/l0;->g:Le/j0;

    .line 144
    .line 145
    iput-object v2, v3, Le/x;->g:Le/j0;

    .line 146
    .line 147
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setBackInvokedCallbackEnabled(Z)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Le/d0;->b()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_3
    const-string p1, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    .line 155
    .line 156
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const/4 p1, 0x0

    .line 160
    throw p1
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/e;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Lc2/c;

    .line 11
    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    iget-boolean v1, p0, Lu1/e;->r:Z

    .line 15
    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    const/16 p1, 0x15

    .line 19
    .line 20
    iput p1, v0, Lc2/c;->a:I

    .line 21
    .line 22
    new-instance p1, Lu1/c;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lu1/c;-><init>(Lu1/e;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lu1/e;->t:Lu1/c;

    .line 28
    .line 29
    iget-object v0, p0, Lu1/e;->d:Lcom/google/android/material/appbar/AppBarLayout;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v1, v0, Lcom/google/android/material/appbar/AppBarLayout;->m:Ljava/util/ArrayList;

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v1, v0, Lcom/google/android/material/appbar/AppBarLayout;->m:Ljava/util/ArrayList;

    .line 43
    .line 44
    :cond_0
    iget-object v1, v0, Lcom/google/android/material/appbar/AppBarLayout;->m:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    iget-object v0, v0, Lcom/google/android/material/appbar/AppBarLayout;->m:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_1
    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Lu1/e;->r:Z

    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    if-nez p1, :cond_4

    .line 62
    .line 63
    iget-boolean p1, p0, Lu1/e;->r:Z

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p1, p0, Lu1/e;->t:Lu1/c;

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    iget-object v1, p0, Lu1/e;->d:Lcom/google/android/material/appbar/AppBarLayout;

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    iget-object v1, v1, Lcom/google/android/material/appbar/AppBarLayout;->m:Ljava/util/ArrayList;

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_3
    const/4 p1, 0x0

    .line 83
    iput p1, v0, Lc2/c;->a:I

    .line 84
    .line 85
    iput-boolean p1, p0, Lu1/e;->r:Z

    .line 86
    .line 87
    :cond_4
    return-void
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    iget-object v3, p0, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    sparse-switch v1, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :sswitch_0
    const-string v1, "refresh"

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v3}, Lco/median/android/MainActivity;->N()V

    .line 25
    .line 26
    .line 27
    return v2

    .line 28
    :sswitch_1
    const-string v1, "overflow"

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object p1, p0, Lu1/e;->p:Landroid/widget/PopupWindow;

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    iget v1, p0, Lu1/e;->j:I

    .line 42
    .line 43
    iget-object v3, p0, Lu1/e;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    sub-int/2addr v4, v1

    .line 50
    add-int/lit8 v4, v4, -0xf

    .line 51
    .line 52
    invoke-virtual {p1, v3, v4, v0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 53
    .line 54
    .line 55
    return v2

    .line 56
    :sswitch_2
    const-string v1, "share"

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    invoke-virtual {v3, p1, p1}, Lco/median/android/MainActivity;->l0(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return v2

    .line 69
    :sswitch_3
    const-string v1, "search"

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    :cond_2
    :goto_0
    iget-object v1, v3, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 78
    .line 79
    invoke-virtual {v1, p1, v2, v0}, Lu1/x1;->b(Ljava/lang/String;ZZ)V

    .line 80
    .line 81
    .line 82
    :cond_3
    return v2

    .line 83
    :cond_4
    return v0

    .line 84
    nop

    .line 85
    :sswitch_data_0
    .sparse-switch
        -0x36059a58 -> :sswitch_3
        0x6854fdf -> :sswitch_2
        0x1f91b402 -> :sswitch_1
        0x40b292db -> :sswitch_0
    .end sparse-switch
.end method

.method public final c(Ljava/lang/String;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lu1/e;->c:Lu1/h0;

    .line 6
    .line 7
    if-eqz v2, :cond_22

    .line 8
    .line 9
    if-eqz v1, :cond_22

    .line 10
    .line 11
    invoke-static {v1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_10

    .line 18
    .line 19
    :cond_0
    iget-object v2, v0, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 20
    .line 21
    invoke-static {v2}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, v3, Lx1/a;->Y0:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    iget-object v5, v0, Lu1/e;->g:Landroid/view/View;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    if-eqz v4, :cond_3

    .line 35
    .line 36
    iget-boolean v1, v0, Lu1/e;->r:Z

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0, v6}, Lu1/e;->a(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v0, Lu1/e;->c:Lu1/h0;

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1}, Lu1/h0;->E()V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput v6, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 55
    .line 56
    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    iget-object v1, v0, Lu1/e;->c:Lu1/h0;

    .line 61
    .line 62
    if-eqz v1, :cond_22

    .line 63
    .line 64
    invoke-virtual {v1}, Lu1/h0;->E()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    iget-object v4, v3, Lx1/a;->R:Ljava/util/ArrayList;

    .line 69
    .line 70
    const-string v7, "regex"

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    if-nez v4, :cond_5

    .line 74
    .line 75
    :cond_4
    :goto_0
    move-object v11, v8

    .line 76
    goto :goto_1

    .line 77
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    move v10, v6

    .line 82
    :cond_6
    if-ge v10, v9, :cond_4

    .line 83
    .line 84
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    add-int/lit8 v10, v10, 0x1

    .line 89
    .line 90
    check-cast v11, Ljava/util/HashMap;

    .line 91
    .line 92
    invoke-virtual {v11, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    check-cast v12, Ljava/util/regex/Pattern;

    .line 97
    .line 98
    if-nez v12, :cond_7

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_7
    invoke-virtual {v12, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    if-eqz v12, :cond_6

    .line 110
    .line 111
    :goto_1
    if-eqz v11, :cond_8

    .line 112
    .line 113
    const/4 v9, 0x1

    .line 114
    goto :goto_2

    .line 115
    :cond_8
    move v9, v6

    .line 116
    :goto_2
    iget-object v10, v3, Lx1/a;->c0:Ljava/util/ArrayList;

    .line 117
    .line 118
    iget-object v12, v3, Lx1/a;->d0:Ljava/util/ArrayList;

    .line 119
    .line 120
    if-eqz v10, :cond_b

    .line 121
    .line 122
    if-eqz v12, :cond_b

    .line 123
    .line 124
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    move v14, v6

    .line 129
    :goto_3
    if-ge v14, v13, :cond_b

    .line 130
    .line 131
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v15

    .line 135
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    check-cast v15, Ljava/util/regex/Pattern;

    .line 139
    .line 140
    invoke-virtual {v15, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 141
    .line 142
    .line 143
    move-result-object v15

    .line 144
    invoke-virtual {v15}, Ljava/util/regex/Matcher;->matches()Z

    .line 145
    .line 146
    .line 147
    move-result v15

    .line 148
    if-eqz v15, :cond_a

    .line 149
    .line 150
    iget-object v10, v3, Lx1/a;->b0:Ljava/util/HashMap;

    .line 151
    .line 152
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v12

    .line 156
    invoke-virtual {v10, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    check-cast v10, Lorg/json/JSONObject;

    .line 161
    .line 162
    if-eqz v10, :cond_9

    .line 163
    .line 164
    const-string v12, "items"

    .line 165
    .line 166
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    goto :goto_4

    .line 171
    :cond_9
    move-object v10, v8

    .line 172
    :goto_4
    if-eqz v10, :cond_b

    .line 173
    .line 174
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-lez v10, :cond_b

    .line 179
    .line 180
    const/4 v10, 0x1

    .line 181
    goto :goto_5

    .line 182
    :cond_a
    add-int/lit8 v14, v14, 0x1

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_b
    move v10, v6

    .line 186
    :goto_5
    iget-boolean v12, v3, Lx1/a;->m0:Z

    .line 187
    .line 188
    if-nez v12, :cond_e

    .line 189
    .line 190
    iget-boolean v12, v3, Lx1/a;->H:Z

    .line 191
    .line 192
    if-nez v12, :cond_e

    .line 193
    .line 194
    if-nez v9, :cond_e

    .line 195
    .line 196
    if-nez v10, :cond_e

    .line 197
    .line 198
    iget-boolean v1, v0, Lu1/e;->r:Z

    .line 199
    .line 200
    if-eqz v1, :cond_d

    .line 201
    .line 202
    invoke-virtual {v0, v6}, Lu1/e;->a(Z)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v0, Lu1/e;->c:Lu1/h0;

    .line 206
    .line 207
    if-eqz v1, :cond_c

    .line 208
    .line 209
    invoke-virtual {v1}, Lu1/h0;->E()V

    .line 210
    .line 211
    .line 212
    :cond_c
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    iput v6, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 217
    .line 218
    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_d
    iget-object v1, v0, Lu1/e;->c:Lu1/h0;

    .line 223
    .line 224
    if-eqz v1, :cond_22

    .line 225
    .line 226
    invoke-virtual {v1}, Lu1/h0;->E()V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_e
    iget-object v5, v2, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 231
    .line 232
    invoke-interface {v5}, Lx1/i;->getTitle()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    if-eqz v5, :cond_f

    .line 237
    .line 238
    iget-object v5, v2, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 239
    .line 240
    invoke-interface {v5}, Lx1/i;->getTitle()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    :goto_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_f
    const v5, 0x7f110024

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    goto :goto_6

    .line 256
    :goto_7
    iget-object v12, v0, Lu1/e;->f:Landroid/widget/ImageView;

    .line 257
    .line 258
    iget-object v13, v0, Lu1/e;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 259
    .line 260
    const-string v14, ""

    .line 261
    .line 262
    const-string v15, "showImage"

    .line 263
    .line 264
    if-nez v9, :cond_16

    .line 265
    .line 266
    invoke-virtual {v3}, Lx1/a;->d()V

    .line 267
    .line 268
    .line 269
    iget-object v8, v3, Lx1/a;->R:Ljava/util/ArrayList;

    .line 270
    .line 271
    if-eqz v8, :cond_11

    .line 272
    .line 273
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    move v11, v6

    .line 278
    :cond_10
    if-ge v11, v9, :cond_11

    .line 279
    .line 280
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v16

    .line 284
    add-int/lit8 v11, v11, 0x1

    .line 285
    .line 286
    move-object/from16 v4, v16

    .line 287
    .line 288
    check-cast v4, Ljava/util/HashMap;

    .line 289
    .line 290
    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v16

    .line 294
    move-object/from16 v10, v16

    .line 295
    .line 296
    check-cast v10, Ljava/util/regex/Pattern;

    .line 297
    .line 298
    invoke-virtual {v10, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    .line 303
    .line 304
    .line 305
    move-result v10

    .line 306
    if-eqz v10, :cond_10

    .line 307
    .line 308
    invoke-virtual {v4, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    if-eqz v7, :cond_11

    .line 313
    .line 314
    invoke-virtual {v4, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    if-eqz v7, :cond_11

    .line 319
    .line 320
    invoke-virtual {v4, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    check-cast v4, Ljava/lang/Boolean;

    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-eqz v4, :cond_11

    .line 331
    .line 332
    :goto_8
    const/4 v1, 0x1

    .line 333
    goto :goto_9

    .line 334
    :cond_11
    iget-object v4, v3, Lx1/a;->x0:Ljava/util/ArrayList;

    .line 335
    .line 336
    if-nez v4, :cond_12

    .line 337
    .line 338
    iget-boolean v1, v3, Lx1/a;->q0:Z

    .line 339
    .line 340
    goto :goto_9

    .line 341
    :cond_12
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    move v7, v6

    .line 346
    :cond_13
    if-ge v7, v3, :cond_14

    .line 347
    .line 348
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    add-int/lit8 v7, v7, 0x1

    .line 353
    .line 354
    check-cast v8, Ljava/util/regex/Pattern;

    .line 355
    .line 356
    invoke-virtual {v8, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    if-eqz v8, :cond_13

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_14
    move v1, v6

    .line 368
    :goto_9
    if-eqz v1, :cond_15

    .line 369
    .line 370
    invoke-virtual {v12, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v13, v14}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 374
    .line 375
    .line 376
    goto/16 :goto_f

    .line 377
    .line 378
    :cond_15
    const/16 v1, 0x8

    .line 379
    .line 380
    invoke-virtual {v12, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v13, v5}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 384
    .line 385
    .line 386
    goto :goto_f

    .line 387
    :cond_16
    if-eqz v11, :cond_17

    .line 388
    .line 389
    const-string v1, "title"

    .line 390
    .line 391
    invoke-virtual {v11, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    goto :goto_a

    .line 396
    :cond_17
    move-object v1, v8

    .line 397
    :goto_a
    instance-of v3, v1, Ljava/lang/String;

    .line 398
    .line 399
    if-eqz v3, :cond_18

    .line 400
    .line 401
    check-cast v1, Ljava/lang/String;

    .line 402
    .line 403
    goto :goto_b

    .line 404
    :cond_18
    move-object v1, v8

    .line 405
    :goto_b
    if-nez v1, :cond_19

    .line 406
    .line 407
    move-object v1, v14

    .line 408
    :cond_19
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    if-nez v3, :cond_1a

    .line 413
    .line 414
    if-nez p2, :cond_1a

    .line 415
    .line 416
    goto :goto_10

    .line 417
    :cond_1a
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    if-nez v3, :cond_1b

    .line 422
    .line 423
    goto :goto_c

    .line 424
    :cond_1b
    move-object v5, v1

    .line 425
    :goto_c
    invoke-virtual {v2, v5}, Lco/median/android/MainActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 426
    .line 427
    .line 428
    if-eqz v11, :cond_1c

    .line 429
    .line 430
    invoke-virtual {v11, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    goto :goto_d

    .line 435
    :cond_1c
    move-object v1, v8

    .line 436
    :goto_d
    instance-of v3, v1, Ljava/lang/Boolean;

    .line 437
    .line 438
    if-eqz v3, :cond_1d

    .line 439
    .line 440
    move-object v8, v1

    .line 441
    check-cast v8, Ljava/lang/Boolean;

    .line 442
    .line 443
    :cond_1d
    if-eqz v8, :cond_1e

    .line 444
    .line 445
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    goto :goto_e

    .line 450
    :cond_1e
    move v1, v6

    .line 451
    :goto_e
    if-eqz v1, :cond_1f

    .line 452
    .line 453
    invoke-virtual {v12, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v13, v14}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 457
    .line 458
    .line 459
    goto :goto_f

    .line 460
    :cond_1f
    const/16 v1, 0x8

    .line 461
    .line 462
    invoke-virtual {v12, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v13, v5}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 466
    .line 467
    .line 468
    :goto_f
    iget-object v1, v0, Lu1/e;->c:Lu1/h0;

    .line 469
    .line 470
    if-eqz v1, :cond_20

    .line 471
    .line 472
    invoke-virtual {v1}, Lu1/h0;->J()Z

    .line 473
    .line 474
    .line 475
    move-result v6

    .line 476
    :cond_20
    if-nez v6, :cond_21

    .line 477
    .line 478
    iget-object v1, v0, Lu1/e;->c:Lu1/h0;

    .line 479
    .line 480
    if-eqz v1, :cond_21

    .line 481
    .line 482
    invoke-virtual {v1}, Lu1/h0;->o0()V

    .line 483
    .line 484
    .line 485
    :cond_21
    invoke-static {v2}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    iget-boolean v1, v1, Lx1/a;->n0:Z

    .line 490
    .line 491
    if-eqz v1, :cond_22

    .line 492
    .line 493
    iget-boolean v1, v0, Lu1/e;->r:Z

    .line 494
    .line 495
    if-nez v1, :cond_22

    .line 496
    .line 497
    const/4 v1, 0x1

    .line 498
    invoke-virtual {v0, v1}, Lu1/e;->a(Z)V

    .line 499
    .line 500
    .line 501
    :cond_22
    :goto_10
    return-void
.end method

.method public final d(Z)V
    .locals 5

    .line 1
    iput-boolean p1, p0, Lu1/e;->b:Z

    .line 2
    .line 3
    iget-object v0, p0, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-virtual {v0}, Le/j;->v()Lu1/h0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iput-object v1, p0, Lu1/e;->c:Lu1/h0;

    .line 13
    .line 14
    const v1, 0x7f090055

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Le/j;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 22
    .line 23
    iput-object v1, p0, Lu1/e;->d:Lcom/google/android/material/appbar/AppBarLayout;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v1, v2

    .line 34
    :goto_0
    instance-of v3, v1, Lz/e;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    check-cast v1, Lz/e;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v1, v2

    .line 42
    :goto_1
    if-eqz v1, :cond_4

    .line 43
    .line 44
    iget-object v3, v1, Lz/e;->a:Lz/b;

    .line 45
    .line 46
    instance-of v4, v3, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    move-object v2, v3

    .line 51
    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    .line 52
    .line 53
    :cond_3
    if-nez v2, :cond_4

    .line 54
    .line 55
    new-instance v2, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    .line 56
    .line 57
    invoke-direct {v2}, Lcom/google/android/material/appbar/AppBarLayout$Behavior;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lz/e;->b(Lz/b;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-boolean v1, v0, Lx1/a;->o0:Z

    .line 68
    .line 69
    iput-boolean v1, p0, Lu1/e;->s:Z

    .line 70
    .line 71
    iget-object v1, p0, Lu1/e;->c:Lu1/h0;

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    const/4 v3, 0x1

    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    iget-boolean p1, v0, Lx1/a;->H:Z

    .line 80
    .line 81
    if-nez p1, :cond_6

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Lu1/h0;->Z(Z)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    invoke-virtual {v1, v3}, Lu1/h0;->Z(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Lu1/h0;->a0()V

    .line 91
    .line 92
    .line 93
    :cond_6
    :goto_2
    new-instance p1, Ld3/a0;

    .line 94
    .line 95
    const/4 v1, 0x5

    .line 96
    invoke-direct {p1, v1, p0}, Ld3/a0;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lu1/e;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Lk/i3;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_7

    .line 109
    .line 110
    iget v4, p0, Lu1/e;->k:I

    .line 111
    .line 112
    invoke-static {v4}, Le4/a;->n(I)Landroid/graphics/ColorFilter;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {p1, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 117
    .line 118
    .line 119
    :cond_7
    new-instance p1, Lj2/a;

    .line 120
    .line 121
    const/4 v4, 0x1

    .line 122
    invoke-direct {p1, v4, p0}, Lj2/a;-><init>(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 126
    .line 127
    .line 128
    iget-boolean p1, v0, Lx1/a;->n0:Z

    .line 129
    .line 130
    if-eqz p1, :cond_9

    .line 131
    .line 132
    iget-object p1, p0, Lu1/e;->c:Lu1/h0;

    .line 133
    .line 134
    if-eqz p1, :cond_8

    .line 135
    .line 136
    invoke-virtual {p1}, Lu1/h0;->J()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    goto :goto_3

    .line 141
    :cond_8
    move p1, v2

    .line 142
    :goto_3
    if-eqz p1, :cond_9

    .line 143
    .line 144
    move v2, v3

    .line 145
    :cond_9
    invoke-virtual {p0, v2}, Lu1/e;->a(Z)V

    .line 146
    .line 147
    .line 148
    return-void
.end method
