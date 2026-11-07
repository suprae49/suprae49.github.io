.class public final Landroidx/fragment/app/l;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/fragment/app/l;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Landroidx/fragment/app/l;->d:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Landroidx/fragment/app/l;->e:Z

    .line 22
    .line 23
    iput-object p1, p0, Landroidx/fragment/app/l;->a:Landroid/view/ViewGroup;

    .line 24
    .line 25
    return-void
.end method

.method public static a(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    sget v1, Lp0/q0;->a:I

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/ViewGroup;->isTransitionGroup()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-ge v1, p0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-static {v2, p1}, Landroidx/fragment/app/l;->a(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void
.end method

.method public static e(Lp/f;Landroid/view/View;)V
    .locals 4

    .line 1
    sget-object v0, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-static {p0, v2}, Landroidx/fragment/app/l;->e(Lp/f;Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-void
.end method

.method public static h(Landroid/view/ViewGroup;Landroidx/fragment/app/p0;)Landroidx/fragment/app/l;
    .locals 3

    .line 1
    const v0, 0x7f0901e0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Landroidx/fragment/app/l;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    check-cast v1, Landroidx/fragment/app/l;

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance p1, Landroidx/fragment/app/l;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Landroidx/fragment/app/l;-><init>(Landroid/view/ViewGroup;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static i(Landroid/view/ViewGroup;Landroidx/fragment/app/u0;)Landroidx/fragment/app/l;
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/u0;->E()Landroidx/fragment/app/p0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Landroidx/fragment/app/l;->h(Landroid/view/ViewGroup;Landroidx/fragment/app/p0;)Landroidx/fragment/app/l;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static k(Lp/f;Ljava/util/Collection;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lp/f;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lp/a;

    .line 6
    .line 7
    invoke-virtual {p0}, Lp/a;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    :goto_0
    move-object v0, p0

    .line 12
    check-cast v0, Lp/d;

    .line 13
    .line 14
    invoke-virtual {v0}, Lp/d;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lp/d;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/view/View;

    .line 31
    .line 32
    sget-object v2, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, Lp/d;->remove()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method


# virtual methods
.method public final b(IILandroidx/fragment/app/z0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lk0/e;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v2, p3, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Landroidx/fragment/app/l;->f(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/o1;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2, p1, p2}, Landroidx/fragment/app/o1;->c(II)V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Landroidx/fragment/app/o1;

    .line 25
    .line 26
    invoke-direct {v2, p1, p2, p3, v1}, Landroidx/fragment/app/o1;-><init>(IILandroidx/fragment/app/z0;Lk0/e;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    new-instance p1, Landroidx/fragment/app/n1;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-direct {p1, p0, v2, p2}, Landroidx/fragment/app/n1;-><init>(Landroidx/fragment/app/l;Landroidx/fragment/app/o1;I)V

    .line 38
    .line 39
    .line 40
    iget-object p2, v2, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    new-instance p1, Landroidx/fragment/app/n1;

    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-direct {p1, p0, v2, p2}, Landroidx/fragment/app/n1;-><init>(Landroidx/fragment/app/l;Landroidx/fragment/app/o1;I)V

    .line 49
    .line 50
    .line 51
    iget-object p2, v2, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1
.end method

.method public final c(Ljava/util/ArrayList;Z)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    :cond_0
    :goto_0
    const/4 v9, 0x3

    .line 15
    const/4 v10, 0x2

    .line 16
    const/4 v11, 0x1

    .line 17
    if-ge v8, v3, :cond_3

    .line 18
    .line 19
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v12

    .line 23
    add-int/lit8 v8, v8, 0x1

    .line 24
    .line 25
    check-cast v12, Landroidx/fragment/app/o1;

    .line 26
    .line 27
    iget-object v13, v12, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    iget-object v13, v13, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 30
    .line 31
    invoke-static {v13}, Landroidx/fragment/app/u;->c(Landroid/view/View;)I

    .line 32
    .line 33
    .line 34
    move-result v13

    .line 35
    iget v14, v12, Landroidx/fragment/app/o1;->a:I

    .line 36
    .line 37
    invoke-static {v14}, Ls/e;->b(I)I

    .line 38
    .line 39
    .line 40
    move-result v14

    .line 41
    if-eqz v14, :cond_2

    .line 42
    .line 43
    if-eq v14, v11, :cond_1

    .line 44
    .line 45
    if-eq v14, v10, :cond_2

    .line 46
    .line 47
    if-eq v14, v9, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    if-eq v13, v10, :cond_0

    .line 51
    .line 52
    move-object v7, v12

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    if-ne v13, v10, :cond_0

    .line 55
    .line 56
    if-nez v6, :cond_0

    .line 57
    .line 58
    move-object v6, v12

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-static {v10}, Landroidx/fragment/app/u0;->G(I)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    const-string v8, " to "

    .line 65
    .line 66
    const-string v12, "FragmentManager"

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    new-instance v3, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v13, "Executing operations from "

    .line 73
    .line 74
    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-static {v12, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance v13, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    new-instance v14, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    sub-int/2addr v15, v11

    .line 113
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    check-cast v15, Landroidx/fragment/app/o1;

    .line 118
    .line 119
    iget-object v15, v15, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    move/from16 v17, v10

    .line 126
    .line 127
    const/4 v10, 0x0

    .line 128
    :goto_1
    if-ge v10, v5, :cond_5

    .line 129
    .line 130
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v18

    .line 134
    add-int/lit8 v10, v10, 0x1

    .line 135
    .line 136
    move-object/from16 v9, v18

    .line 137
    .line 138
    check-cast v9, Landroidx/fragment/app/o1;

    .line 139
    .line 140
    iget-object v9, v9, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 141
    .line 142
    iget-object v9, v9, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/y;

    .line 143
    .line 144
    move/from16 v18, v11

    .line 145
    .line 146
    iget-object v11, v15, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/y;

    .line 147
    .line 148
    iget v4, v11, Landroidx/fragment/app/y;->b:I

    .line 149
    .line 150
    iput v4, v9, Landroidx/fragment/app/y;->b:I

    .line 151
    .line 152
    iget v4, v11, Landroidx/fragment/app/y;->c:I

    .line 153
    .line 154
    iput v4, v9, Landroidx/fragment/app/y;->c:I

    .line 155
    .line 156
    iget v4, v11, Landroidx/fragment/app/y;->d:I

    .line 157
    .line 158
    iput v4, v9, Landroidx/fragment/app/y;->d:I

    .line 159
    .line 160
    iget v4, v11, Landroidx/fragment/app/y;->e:I

    .line 161
    .line 162
    iput v4, v9, Landroidx/fragment/app/y;->e:I

    .line 163
    .line 164
    move/from16 v11, v18

    .line 165
    .line 166
    const/4 v9, 0x3

    .line 167
    goto :goto_1

    .line 168
    :cond_5
    move/from16 v18, v11

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    const/4 v5, 0x0

    .line 175
    :goto_2
    if-ge v5, v4, :cond_8

    .line 176
    .line 177
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    add-int/lit8 v5, v5, 0x1

    .line 182
    .line 183
    check-cast v9, Landroidx/fragment/app/o1;

    .line 184
    .line 185
    new-instance v10, Lk0/e;

    .line 186
    .line 187
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v9}, Landroidx/fragment/app/o1;->d()V

    .line 191
    .line 192
    .line 193
    iget-object v11, v9, Landroidx/fragment/app/o1;->e:Ljava/util/HashSet;

    .line 194
    .line 195
    invoke-virtual {v11, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    new-instance v15, Landroidx/fragment/app/i;

    .line 199
    .line 200
    invoke-direct {v15, v9, v10}, Landroidx/fragment/app/j;-><init>(Landroidx/fragment/app/o1;Lk0/e;)V

    .line 201
    .line 202
    .line 203
    const/4 v10, 0x0

    .line 204
    iput-boolean v10, v15, Landroidx/fragment/app/i;->d:Z

    .line 205
    .line 206
    iput-boolean v2, v15, Landroidx/fragment/app/i;->c:Z

    .line 207
    .line 208
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    new-instance v10, Lk0/e;

    .line 212
    .line 213
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v9}, Landroidx/fragment/app/o1;->d()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v11, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    new-instance v11, Landroidx/fragment/app/k;

    .line 223
    .line 224
    if-eqz v2, :cond_7

    .line 225
    .line 226
    if-ne v9, v6, :cond_6

    .line 227
    .line 228
    :goto_3
    move/from16 v15, v18

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_6
    const/4 v15, 0x0

    .line 232
    goto :goto_4

    .line 233
    :cond_7
    if-ne v9, v7, :cond_6

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :goto_4
    invoke-direct {v11, v9, v10, v2, v15}, Landroidx/fragment/app/k;-><init>(Landroidx/fragment/app/o1;Lk0/e;ZZ)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    new-instance v10, Landroidx/fragment/app/c;

    .line 243
    .line 244
    const/4 v11, 0x0

    .line 245
    invoke-direct {v10, v0, v14, v9, v11}, Landroidx/fragment/app/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 246
    .line 247
    .line 248
    iget-object v9, v9, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_8
    new-instance v1, Ljava/util/HashMap;

    .line 255
    .line 256
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    const/4 v5, 0x0

    .line 264
    const/4 v9, 0x0

    .line 265
    :goto_5
    if-ge v9, v4, :cond_10

    .line 266
    .line 267
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    add-int/lit8 v9, v9, 0x1

    .line 272
    .line 273
    check-cast v10, Landroidx/fragment/app/k;

    .line 274
    .line 275
    invoke-virtual {v10}, Landroidx/fragment/app/j;->b()Z

    .line 276
    .line 277
    .line 278
    move-result v11

    .line 279
    iget-object v15, v10, Landroidx/fragment/app/j;->a:Landroidx/fragment/app/o1;

    .line 280
    .line 281
    iget-object v15, v15, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 282
    .line 283
    move/from16 p1, v4

    .line 284
    .line 285
    iget-object v4, v10, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    .line 286
    .line 287
    if-eqz v11, :cond_9

    .line 288
    .line 289
    move/from16 v4, p1

    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_9
    invoke-virtual {v10, v4}, Landroidx/fragment/app/k;->c(Ljava/lang/Object;)Landroidx/fragment/app/k1;

    .line 293
    .line 294
    .line 295
    move-result-object v11

    .line 296
    move/from16 v19, v9

    .line 297
    .line 298
    iget-object v9, v10, Landroidx/fragment/app/k;->e:Ljava/lang/Object;

    .line 299
    .line 300
    invoke-virtual {v10, v9}, Landroidx/fragment/app/k;->c(Ljava/lang/Object;)Landroidx/fragment/app/k1;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    move-object/from16 v25, v8

    .line 305
    .line 306
    const-string v8, " returned Transition "

    .line 307
    .line 308
    move-object/from16 v26, v3

    .line 309
    .line 310
    const-string v3, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    .line 311
    .line 312
    if-eqz v11, :cond_b

    .line 313
    .line 314
    if-eqz v10, :cond_b

    .line 315
    .line 316
    if-ne v11, v10, :cond_a

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 320
    .line 321
    new-instance v2, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    const-string v3, " which uses a different Transition  type than its shared element transition "

    .line 336
    .line 337
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v1

    .line 351
    :cond_b
    :goto_6
    if-eqz v11, :cond_c

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_c
    move-object v11, v10

    .line 355
    :goto_7
    if-nez v5, :cond_d

    .line 356
    .line 357
    move-object v5, v11

    .line 358
    goto :goto_8

    .line 359
    :cond_d
    if-eqz v11, :cond_f

    .line 360
    .line 361
    if-ne v5, v11, :cond_e

    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_e
    const-string v1, " which uses a different Transition  type than other Fragments."

    .line 365
    .line 366
    invoke-static {v3, v15, v8, v4, v1}, Landroidx/fragment/app/q;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :cond_f
    :goto_8
    move/from16 v4, p1

    .line 371
    .line 372
    move/from16 v9, v19

    .line 373
    .line 374
    move-object/from16 v8, v25

    .line 375
    .line 376
    move-object/from16 v3, v26

    .line 377
    .line 378
    goto :goto_5

    .line 379
    :cond_10
    move-object/from16 v26, v3

    .line 380
    .line 381
    move-object/from16 v25, v8

    .line 382
    .line 383
    iget-object v3, v0, Landroidx/fragment/app/l;->a:Landroid/view/ViewGroup;

    .line 384
    .line 385
    if-nez v5, :cond_12

    .line 386
    .line 387
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    const/4 v4, 0x0

    .line 392
    :goto_9
    if-ge v4, v2, :cond_11

    .line 393
    .line 394
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    add-int/lit8 v4, v4, 0x1

    .line 399
    .line 400
    check-cast v5, Landroidx/fragment/app/k;

    .line 401
    .line 402
    iget-object v8, v5, Landroidx/fragment/app/j;->a:Landroidx/fragment/app/o1;

    .line 403
    .line 404
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 405
    .line 406
    invoke-virtual {v1, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v5}, Landroidx/fragment/app/j;->a()V

    .line 410
    .line 411
    .line 412
    goto :goto_9

    .line 413
    :cond_11
    move-object v4, v1

    .line 414
    move-object v15, v7

    .line 415
    move-object v11, v12

    .line 416
    move-object/from16 v33, v14

    .line 417
    .line 418
    goto/16 :goto_22

    .line 419
    .line 420
    :cond_12
    new-instance v4, Landroid/view/View;

    .line 421
    .line 422
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 423
    .line 424
    .line 425
    move-result-object v8

    .line 426
    invoke-direct {v4, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 427
    .line 428
    .line 429
    new-instance v8, Landroid/graphics/Rect;

    .line 430
    .line 431
    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    .line 432
    .line 433
    .line 434
    new-instance v9, Ljava/util/ArrayList;

    .line 435
    .line 436
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 437
    .line 438
    .line 439
    new-instance v10, Ljava/util/ArrayList;

    .line 440
    .line 441
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 442
    .line 443
    .line 444
    new-instance v11, Lp/f;

    .line 445
    .line 446
    const/4 v15, 0x0

    .line 447
    invoke-direct {v11, v15}, Lp/k;-><init>(I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 451
    .line 452
    .line 453
    move-result v15

    .line 454
    move-object/from16 v33, v14

    .line 455
    .line 456
    const/4 v0, 0x0

    .line 457
    const/4 v14, 0x0

    .line 458
    const/16 v27, 0x0

    .line 459
    .line 460
    const/16 v28, 0x0

    .line 461
    .line 462
    :goto_a
    if-ge v0, v15, :cond_21

    .line 463
    .line 464
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v19

    .line 468
    add-int/lit8 v0, v0, 0x1

    .line 469
    .line 470
    move/from16 p1, v0

    .line 471
    .line 472
    move-object/from16 v0, v19

    .line 473
    .line 474
    check-cast v0, Landroidx/fragment/app/k;

    .line 475
    .line 476
    iget-object v0, v0, Landroidx/fragment/app/k;->e:Ljava/lang/Object;

    .line 477
    .line 478
    if-eqz v0, :cond_20

    .line 479
    .line 480
    if-eqz v6, :cond_20

    .line 481
    .line 482
    move/from16 v29, v15

    .line 483
    .line 484
    iget-object v15, v6, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 485
    .line 486
    if-eqz v7, :cond_1f

    .line 487
    .line 488
    iget-object v14, v7, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 489
    .line 490
    invoke-virtual {v5, v0}, Landroidx/fragment/app/k1;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v5, v0}, Landroidx/fragment/app/k1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    move-object/from16 v30, v13

    .line 499
    .line 500
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 501
    .line 502
    .line 503
    move-result-object v13

    .line 504
    move-object/from16 v34, v1

    .line 505
    .line 506
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    move-object/from16 v31, v4

    .line 511
    .line 512
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    move-object/from16 v32, v8

    .line 517
    .line 518
    move-object/from16 v24, v10

    .line 519
    .line 520
    const/4 v8, 0x0

    .line 521
    :goto_b
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 522
    .line 523
    .line 524
    move-result v10

    .line 525
    if-ge v8, v10, :cond_14

    .line 526
    .line 527
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v10

    .line 531
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 532
    .line 533
    .line 534
    move-result v10

    .line 535
    move-object/from16 v19, v4

    .line 536
    .line 537
    const/4 v4, -0x1

    .line 538
    if-eq v10, v4, :cond_13

    .line 539
    .line 540
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    check-cast v4, Ljava/lang/String;

    .line 545
    .line 546
    invoke-virtual {v13, v10, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 550
    .line 551
    move-object/from16 v4, v19

    .line 552
    .line 553
    goto :goto_b

    .line 554
    :cond_14
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    if-nez v2, :cond_15

    .line 559
    .line 560
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->getExitTransitionCallback()Lb0/r;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lb0/r;

    .line 564
    .line 565
    .line 566
    goto :goto_c

    .line 567
    :cond_15
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lb0/r;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->getExitTransitionCallback()Lb0/r;

    .line 571
    .line 572
    .line 573
    :goto_c
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 574
    .line 575
    .line 576
    move-result v4

    .line 577
    const/4 v8, 0x0

    .line 578
    :goto_d
    if-ge v8, v4, :cond_16

    .line 579
    .line 580
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v10

    .line 584
    check-cast v10, Ljava/lang/String;

    .line 585
    .line 586
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v19

    .line 590
    move/from16 v20, v4

    .line 591
    .line 592
    move-object/from16 v4, v19

    .line 593
    .line 594
    check-cast v4, Ljava/lang/String;

    .line 595
    .line 596
    invoke-virtual {v11, v10, v4}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    add-int/lit8 v8, v8, 0x1

    .line 600
    .line 601
    move/from16 v4, v20

    .line 602
    .line 603
    goto :goto_d

    .line 604
    :cond_16
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/u0;->G(I)Z

    .line 605
    .line 606
    .line 607
    move-result v4

    .line 608
    if-eqz v4, :cond_18

    .line 609
    .line 610
    const-string v4, ">>> entering view names <<<"

    .line 611
    .line 612
    invoke-static {v12, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 616
    .line 617
    .line 618
    move-result v4

    .line 619
    const/4 v8, 0x0

    .line 620
    :goto_e
    const-string v10, "Name: "

    .line 621
    .line 622
    if-ge v8, v4, :cond_17

    .line 623
    .line 624
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v19

    .line 628
    add-int/lit8 v8, v8, 0x1

    .line 629
    .line 630
    move/from16 v20, v4

    .line 631
    .line 632
    move-object/from16 v4, v19

    .line 633
    .line 634
    check-cast v4, Ljava/lang/String;

    .line 635
    .line 636
    move/from16 v19, v8

    .line 637
    .line 638
    new-instance v8, Ljava/lang/StringBuilder;

    .line 639
    .line 640
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v4

    .line 650
    invoke-static {v12, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 651
    .line 652
    .line 653
    move/from16 v8, v19

    .line 654
    .line 655
    move/from16 v4, v20

    .line 656
    .line 657
    goto :goto_e

    .line 658
    :cond_17
    const-string v4, ">>> exiting view names <<<"

    .line 659
    .line 660
    invoke-static {v12, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 661
    .line 662
    .line 663
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 664
    .line 665
    .line 666
    move-result v4

    .line 667
    const/4 v8, 0x0

    .line 668
    :goto_f
    if-ge v8, v4, :cond_18

    .line 669
    .line 670
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v19

    .line 674
    add-int/lit8 v8, v8, 0x1

    .line 675
    .line 676
    move/from16 v20, v4

    .line 677
    .line 678
    move-object/from16 v4, v19

    .line 679
    .line 680
    check-cast v4, Ljava/lang/String;

    .line 681
    .line 682
    move/from16 v19, v8

    .line 683
    .line 684
    new-instance v8, Ljava/lang/StringBuilder;

    .line 685
    .line 686
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v4

    .line 696
    invoke-static {v12, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 697
    .line 698
    .line 699
    move/from16 v8, v19

    .line 700
    .line 701
    move/from16 v4, v20

    .line 702
    .line 703
    goto :goto_f

    .line 704
    :cond_18
    new-instance v4, Lp/f;

    .line 705
    .line 706
    const/4 v10, 0x0

    .line 707
    invoke-direct {v4, v10}, Lp/k;-><init>(I)V

    .line 708
    .line 709
    .line 710
    iget-object v8, v15, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 711
    .line 712
    invoke-static {v4, v8}, Landroidx/fragment/app/l;->e(Lp/f;Landroid/view/View;)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v4, v13}, Lp/f;->l(Ljava/util/Collection;)Z

    .line 716
    .line 717
    .line 718
    invoke-virtual {v4}, Lp/f;->keySet()Ljava/util/Set;

    .line 719
    .line 720
    .line 721
    move-result-object v8

    .line 722
    invoke-virtual {v11, v8}, Lp/f;->l(Ljava/util/Collection;)Z

    .line 723
    .line 724
    .line 725
    new-instance v8, Lp/f;

    .line 726
    .line 727
    invoke-direct {v8, v10}, Lp/k;-><init>(I)V

    .line 728
    .line 729
    .line 730
    iget-object v10, v14, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 731
    .line 732
    invoke-static {v8, v10}, Landroidx/fragment/app/l;->e(Lp/f;Landroid/view/View;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v8, v1}, Lp/f;->l(Ljava/util/Collection;)Z

    .line 736
    .line 737
    .line 738
    invoke-virtual {v11}, Lp/f;->values()Ljava/util/Collection;

    .line 739
    .line 740
    .line 741
    move-result-object v10

    .line 742
    invoke-virtual {v8, v10}, Lp/f;->l(Ljava/util/Collection;)Z

    .line 743
    .line 744
    .line 745
    sget-object v10, Landroidx/fragment/app/d1;->a:Landroidx/fragment/app/i1;

    .line 746
    .line 747
    iget v10, v11, Lp/k;->h:I

    .line 748
    .line 749
    add-int/lit8 v10, v10, -0x1

    .line 750
    .line 751
    :goto_10
    if-ltz v10, :cond_1a

    .line 752
    .line 753
    invoke-virtual {v11, v10}, Lp/k;->i(I)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v19

    .line 757
    move-object/from16 v20, v14

    .line 758
    .line 759
    move-object/from16 v14, v19

    .line 760
    .line 761
    check-cast v14, Ljava/lang/String;

    .line 762
    .line 763
    invoke-virtual {v8, v14}, Lp/k;->containsKey(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result v14

    .line 767
    if-nez v14, :cond_19

    .line 768
    .line 769
    invoke-virtual {v11, v10}, Lp/k;->g(I)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    :cond_19
    add-int/lit8 v10, v10, -0x1

    .line 773
    .line 774
    move-object/from16 v14, v20

    .line 775
    .line 776
    goto :goto_10

    .line 777
    :cond_1a
    move-object/from16 v20, v14

    .line 778
    .line 779
    invoke-virtual {v11}, Lp/f;->keySet()Ljava/util/Set;

    .line 780
    .line 781
    .line 782
    move-result-object v10

    .line 783
    invoke-static {v4, v10}, Landroidx/fragment/app/l;->k(Lp/f;Ljava/util/Collection;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v11}, Lp/f;->values()Ljava/util/Collection;

    .line 787
    .line 788
    .line 789
    move-result-object v10

    .line 790
    invoke-static {v8, v10}, Landroidx/fragment/app/l;->k(Lp/f;Ljava/util/Collection;)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v11}, Lp/k;->isEmpty()Z

    .line 794
    .line 795
    .line 796
    move-result v10

    .line 797
    if-eqz v10, :cond_1b

    .line 798
    .line 799
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->clear()V

    .line 803
    .line 804
    .line 805
    move-object/from16 v13, v24

    .line 806
    .line 807
    move-object/from16 v1, v31

    .line 808
    .line 809
    move-object/from16 v8, v32

    .line 810
    .line 811
    move-object/from16 v4, v34

    .line 812
    .line 813
    const/4 v14, 0x0

    .line 814
    goto/16 :goto_16

    .line 815
    .line 816
    :cond_1b
    if-eqz v2, :cond_1c

    .line 817
    .line 818
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lb0/r;

    .line 819
    .line 820
    .line 821
    goto :goto_11

    .line 822
    :cond_1c
    invoke-virtual/range {v20 .. v20}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lb0/r;

    .line 823
    .line 824
    .line 825
    :goto_11
    new-instance v10, Landroidx/fragment/app/h;

    .line 826
    .line 827
    invoke-direct {v10, v7, v6, v2, v8}, Landroidx/fragment/app/h;-><init>(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;ZLp/f;)V

    .line 828
    .line 829
    .line 830
    invoke-static {v3, v10}, Lp0/s;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v4}, Lp/f;->values()Ljava/util/Collection;

    .line 834
    .line 835
    .line 836
    move-result-object v10

    .line 837
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 838
    .line 839
    .line 840
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 841
    .line 842
    .line 843
    move-result v10

    .line 844
    if-nez v10, :cond_1d

    .line 845
    .line 846
    const/4 v10, 0x0

    .line 847
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v13

    .line 851
    check-cast v13, Ljava/lang/String;

    .line 852
    .line 853
    invoke-virtual {v4, v13}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v4

    .line 857
    check-cast v4, Landroid/view/View;

    .line 858
    .line 859
    invoke-virtual {v5, v4, v0}, Landroidx/fragment/app/k1;->m(Landroid/view/View;Ljava/lang/Object;)V

    .line 860
    .line 861
    .line 862
    move-object/from16 v28, v4

    .line 863
    .line 864
    goto :goto_12

    .line 865
    :cond_1d
    const/4 v10, 0x0

    .line 866
    :goto_12
    invoke-virtual {v8}, Lp/f;->values()Ljava/util/Collection;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    move-object/from16 v13, v24

    .line 871
    .line 872
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 873
    .line 874
    .line 875
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 876
    .line 877
    .line 878
    move-result v4

    .line 879
    if-nez v4, :cond_1e

    .line 880
    .line 881
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v1

    .line 885
    check-cast v1, Ljava/lang/String;

    .line 886
    .line 887
    invoke-virtual {v8, v1}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v1

    .line 891
    check-cast v1, Landroid/view/View;

    .line 892
    .line 893
    if-eqz v1, :cond_1e

    .line 894
    .line 895
    new-instance v4, Landroidx/fragment/app/c;

    .line 896
    .line 897
    move/from16 v10, v18

    .line 898
    .line 899
    move-object/from16 v8, v32

    .line 900
    .line 901
    invoke-direct {v4, v5, v1, v8, v10}, Landroidx/fragment/app/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 902
    .line 903
    .line 904
    invoke-static {v3, v4}, Lp0/s;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 905
    .line 906
    .line 907
    const/16 v27, 0x1

    .line 908
    .line 909
    :goto_13
    move-object/from16 v1, v31

    .line 910
    .line 911
    goto :goto_14

    .line 912
    :cond_1e
    move-object/from16 v8, v32

    .line 913
    .line 914
    goto :goto_13

    .line 915
    :goto_14
    invoke-virtual {v5, v0, v1, v9}, Landroidx/fragment/app/k1;->p(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 916
    .line 917
    .line 918
    const/16 v21, 0x0

    .line 919
    .line 920
    const/16 v22, 0x0

    .line 921
    .line 922
    move-object/from16 v23, v0

    .line 923
    .line 924
    move-object/from16 v20, v0

    .line 925
    .line 926
    move-object/from16 v19, v5

    .line 927
    .line 928
    move-object/from16 v24, v13

    .line 929
    .line 930
    invoke-virtual/range {v19 .. v24}, Landroidx/fragment/app/k1;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 931
    .line 932
    .line 933
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 934
    .line 935
    move-object/from16 v4, v34

    .line 936
    .line 937
    invoke-virtual {v4, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    invoke-virtual {v4, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-object/from16 v14, v20

    .line 944
    .line 945
    goto :goto_16

    .line 946
    :cond_1f
    move-object/from16 v30, v4

    .line 947
    .line 948
    move-object v4, v1

    .line 949
    move-object/from16 v1, v30

    .line 950
    .line 951
    move-object/from16 v30, v13

    .line 952
    .line 953
    :goto_15
    move-object v13, v10

    .line 954
    goto :goto_16

    .line 955
    :cond_20
    move-object/from16 v29, v4

    .line 956
    .line 957
    move-object v4, v1

    .line 958
    move-object/from16 v1, v29

    .line 959
    .line 960
    move-object/from16 v30, v13

    .line 961
    .line 962
    move/from16 v29, v15

    .line 963
    .line 964
    goto :goto_15

    .line 965
    :goto_16
    move-object v0, v4

    .line 966
    move-object v4, v1

    .line 967
    move-object v1, v0

    .line 968
    move/from16 v0, p1

    .line 969
    .line 970
    move-object v10, v13

    .line 971
    move/from16 v15, v29

    .line 972
    .line 973
    move-object/from16 v13, v30

    .line 974
    .line 975
    const/16 v18, 0x1

    .line 976
    .line 977
    goto/16 :goto_a

    .line 978
    .line 979
    :cond_21
    move-object/from16 v30, v4

    .line 980
    .line 981
    move-object v4, v1

    .line 982
    move-object/from16 v1, v30

    .line 983
    .line 984
    move-object/from16 v30, v13

    .line 985
    .line 986
    move-object v13, v10

    .line 987
    new-instance v0, Ljava/util/ArrayList;

    .line 988
    .line 989
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 990
    .line 991
    .line 992
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayList;->size()I

    .line 993
    .line 994
    .line 995
    move-result v2

    .line 996
    move-object/from16 p1, v11

    .line 997
    .line 998
    const/4 v10, 0x0

    .line 999
    const/4 v11, 0x0

    .line 1000
    const/4 v15, 0x0

    .line 1001
    :goto_17
    if-ge v10, v2, :cond_2e

    .line 1002
    .line 1003
    move/from16 p2, v2

    .line 1004
    .line 1005
    move-object/from16 v2, v30

    .line 1006
    .line 1007
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v19

    .line 1011
    add-int/lit8 v10, v10, 0x1

    .line 1012
    .line 1013
    move/from16 v29, v10

    .line 1014
    .line 1015
    move-object/from16 v10, v19

    .line 1016
    .line 1017
    check-cast v10, Landroidx/fragment/app/k;

    .line 1018
    .line 1019
    invoke-virtual {v10}, Landroidx/fragment/app/j;->b()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v19

    .line 1023
    move-object/from16 v34, v12

    .line 1024
    .line 1025
    iget-object v12, v10, Landroidx/fragment/app/j;->a:Landroidx/fragment/app/o1;

    .line 1026
    .line 1027
    if-eqz v19, :cond_22

    .line 1028
    .line 1029
    move-object/from16 v30, v2

    .line 1030
    .line 1031
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1032
    .line 1033
    invoke-virtual {v4, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v10}, Landroidx/fragment/app/j;->a()V

    .line 1037
    .line 1038
    .line 1039
    move/from16 v2, p2

    .line 1040
    .line 1041
    move/from16 v10, v29

    .line 1042
    .line 1043
    move-object/from16 v12, v34

    .line 1044
    .line 1045
    goto :goto_17

    .line 1046
    :cond_22
    move-object/from16 v30, v2

    .line 1047
    .line 1048
    iget-object v2, v10, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    .line 1049
    .line 1050
    invoke-virtual {v5, v2}, Landroidx/fragment/app/k1;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v2

    .line 1054
    if-eqz v14, :cond_24

    .line 1055
    .line 1056
    if-eq v12, v6, :cond_23

    .line 1057
    .line 1058
    if-ne v12, v7, :cond_24

    .line 1059
    .line 1060
    :cond_23
    const/16 v19, 0x1

    .line 1061
    .line 1062
    goto :goto_18

    .line 1063
    :cond_24
    const/16 v19, 0x0

    .line 1064
    .line 1065
    :goto_18
    if-nez v2, :cond_26

    .line 1066
    .line 1067
    if-nez v19, :cond_25

    .line 1068
    .line 1069
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1070
    .line 1071
    invoke-virtual {v4, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v10}, Landroidx/fragment/app/j;->a()V

    .line 1075
    .line 1076
    .line 1077
    :cond_25
    move-object/from16 v19, v1

    .line 1078
    .line 1079
    move-object/from16 v35, v7

    .line 1080
    .line 1081
    move-object/from16 v31, v14

    .line 1082
    .line 1083
    move-object/from16 v1, v28

    .line 1084
    .line 1085
    goto/16 :goto_1c

    .line 1086
    .line 1087
    :cond_26
    move-object/from16 v35, v7

    .line 1088
    .line 1089
    new-instance v7, Ljava/util/ArrayList;

    .line 1090
    .line 1091
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1092
    .line 1093
    .line 1094
    move-object/from16 v31, v14

    .line 1095
    .line 1096
    iget-object v14, v12, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 1097
    .line 1098
    move-object/from16 v32, v11

    .line 1099
    .line 1100
    iget-object v11, v14, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 1101
    .line 1102
    invoke-static {v11, v7}, Landroidx/fragment/app/l;->a(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 1103
    .line 1104
    .line 1105
    if-eqz v19, :cond_28

    .line 1106
    .line 1107
    if-ne v12, v6, :cond_27

    .line 1108
    .line 1109
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 1110
    .line 1111
    .line 1112
    goto :goto_19

    .line 1113
    :cond_27
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 1114
    .line 1115
    .line 1116
    :cond_28
    :goto_19
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1117
    .line 1118
    .line 1119
    move-result v11

    .line 1120
    if-eqz v11, :cond_29

    .line 1121
    .line 1122
    invoke-virtual {v5, v1, v2}, Landroidx/fragment/app/k1;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 1123
    .line 1124
    .line 1125
    move-object/from16 v19, v1

    .line 1126
    .line 1127
    goto :goto_1a

    .line 1128
    :cond_29
    invoke-virtual {v5, v2, v7}, Landroidx/fragment/app/k1;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 1129
    .line 1130
    .line 1131
    const/16 v23, 0x0

    .line 1132
    .line 1133
    const/16 v24, 0x0

    .line 1134
    .line 1135
    move-object/from16 v21, v2

    .line 1136
    .line 1137
    move-object/from16 v20, v2

    .line 1138
    .line 1139
    move-object/from16 v19, v5

    .line 1140
    .line 1141
    move-object/from16 v22, v7

    .line 1142
    .line 1143
    invoke-virtual/range {v19 .. v24}, Landroidx/fragment/app/k1;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 1144
    .line 1145
    .line 1146
    iget v11, v12, Landroidx/fragment/app/o1;->a:I

    .line 1147
    .line 1148
    move-object/from16 v19, v1

    .line 1149
    .line 1150
    const/4 v1, 0x3

    .line 1151
    if-ne v11, v1, :cond_2a

    .line 1152
    .line 1153
    move-object/from16 v1, v33

    .line 1154
    .line 1155
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1156
    .line 1157
    .line 1158
    new-instance v11, Ljava/util/ArrayList;

    .line 1159
    .line 1160
    invoke-direct {v11, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1161
    .line 1162
    .line 1163
    iget-object v1, v14, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 1164
    .line 1165
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    iget-object v1, v14, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 1169
    .line 1170
    invoke-virtual {v5, v2, v1, v11}, Landroidx/fragment/app/k1;->k(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 1171
    .line 1172
    .line 1173
    new-instance v1, Landroidx/fragment/app/f;

    .line 1174
    .line 1175
    const/4 v11, 0x1

    .line 1176
    invoke-direct {v1, v11, v7}, Landroidx/fragment/app/f;-><init>(ILjava/lang/Object;)V

    .line 1177
    .line 1178
    .line 1179
    invoke-static {v3, v1}, Lp0/s;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1180
    .line 1181
    .line 1182
    :cond_2a
    :goto_1a
    iget v1, v12, Landroidx/fragment/app/o1;->a:I

    .line 1183
    .line 1184
    move/from16 v11, v17

    .line 1185
    .line 1186
    if-ne v1, v11, :cond_2c

    .line 1187
    .line 1188
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1189
    .line 1190
    .line 1191
    if-eqz v27, :cond_2b

    .line 1192
    .line 1193
    invoke-virtual {v5, v2, v8}, Landroidx/fragment/app/k1;->n(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 1194
    .line 1195
    .line 1196
    :cond_2b
    move-object/from16 v1, v28

    .line 1197
    .line 1198
    goto :goto_1b

    .line 1199
    :cond_2c
    move-object/from16 v1, v28

    .line 1200
    .line 1201
    invoke-virtual {v5, v1, v2}, Landroidx/fragment/app/k1;->m(Landroid/view/View;Ljava/lang/Object;)V

    .line 1202
    .line 1203
    .line 1204
    :goto_1b
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1205
    .line 1206
    invoke-virtual {v4, v12, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    iget-boolean v7, v10, Landroidx/fragment/app/k;->d:Z

    .line 1210
    .line 1211
    if-eqz v7, :cond_2d

    .line 1212
    .line 1213
    invoke-virtual {v5, v15, v2}, Landroidx/fragment/app/k1;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v2

    .line 1217
    move-object v15, v2

    .line 1218
    move-object/from16 v11, v32

    .line 1219
    .line 1220
    goto :goto_1c

    .line 1221
    :cond_2d
    move-object/from16 v11, v32

    .line 1222
    .line 1223
    invoke-virtual {v5, v11, v2}, Landroidx/fragment/app/k1;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v2

    .line 1227
    move-object v11, v2

    .line 1228
    :goto_1c
    move/from16 v2, p2

    .line 1229
    .line 1230
    move-object/from16 v28, v1

    .line 1231
    .line 1232
    move-object/from16 v1, v19

    .line 1233
    .line 1234
    move/from16 v10, v29

    .line 1235
    .line 1236
    move-object/from16 v14, v31

    .line 1237
    .line 1238
    move-object/from16 v12, v34

    .line 1239
    .line 1240
    move-object/from16 v7, v35

    .line 1241
    .line 1242
    const/16 v17, 0x2

    .line 1243
    .line 1244
    goto/16 :goto_17

    .line 1245
    .line 1246
    :cond_2e
    move-object/from16 v35, v7

    .line 1247
    .line 1248
    move-object/from16 v34, v12

    .line 1249
    .line 1250
    invoke-virtual {v5, v15, v11, v14}, Landroidx/fragment/app/k1;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v1

    .line 1254
    if-nez v1, :cond_2f

    .line 1255
    .line 1256
    move-object/from16 v11, v34

    .line 1257
    .line 1258
    move-object/from16 v15, v35

    .line 1259
    .line 1260
    goto/16 :goto_22

    .line 1261
    .line 1262
    :cond_2f
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayList;->size()I

    .line 1263
    .line 1264
    .line 1265
    move-result v2

    .line 1266
    const/4 v10, 0x0

    .line 1267
    :goto_1d
    if-ge v10, v2, :cond_37

    .line 1268
    .line 1269
    move-object/from16 v7, v30

    .line 1270
    .line 1271
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v8

    .line 1275
    add-int/lit8 v10, v10, 0x1

    .line 1276
    .line 1277
    check-cast v8, Landroidx/fragment/app/k;

    .line 1278
    .line 1279
    invoke-virtual {v8}, Landroidx/fragment/app/j;->b()Z

    .line 1280
    .line 1281
    .line 1282
    move-result v11

    .line 1283
    iget-object v12, v8, Landroidx/fragment/app/j;->a:Landroidx/fragment/app/o1;

    .line 1284
    .line 1285
    if-eqz v11, :cond_30

    .line 1286
    .line 1287
    move-object/from16 v30, v7

    .line 1288
    .line 1289
    goto :goto_1d

    .line 1290
    :cond_30
    iget-object v11, v8, Landroidx/fragment/app/k;->c:Ljava/lang/Object;

    .line 1291
    .line 1292
    move-object/from16 v15, v35

    .line 1293
    .line 1294
    if-eqz v14, :cond_32

    .line 1295
    .line 1296
    if-eq v12, v6, :cond_31

    .line 1297
    .line 1298
    if-ne v12, v15, :cond_32

    .line 1299
    .line 1300
    :cond_31
    const/16 v19, 0x1

    .line 1301
    .line 1302
    goto :goto_1e

    .line 1303
    :cond_32
    const/16 v19, 0x0

    .line 1304
    .line 1305
    :goto_1e
    if-nez v11, :cond_34

    .line 1306
    .line 1307
    if-eqz v19, :cond_33

    .line 1308
    .line 1309
    goto :goto_1f

    .line 1310
    :cond_33
    move/from16 p2, v2

    .line 1311
    .line 1312
    move-object/from16 v30, v7

    .line 1313
    .line 1314
    move-object/from16 v11, v34

    .line 1315
    .line 1316
    goto :goto_21

    .line 1317
    :cond_34
    :goto_1f
    sget-object v11, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 1318
    .line 1319
    invoke-virtual {v3}, Landroid/view/View;->isLaidOut()Z

    .line 1320
    .line 1321
    .line 1322
    move-result v11

    .line 1323
    if-nez v11, :cond_36

    .line 1324
    .line 1325
    const/16 v17, 0x2

    .line 1326
    .line 1327
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/u0;->G(I)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v11

    .line 1331
    if-eqz v11, :cond_35

    .line 1332
    .line 1333
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1334
    .line 1335
    move/from16 p2, v2

    .line 1336
    .line 1337
    const-string v2, "SpecialEffectsController: Container "

    .line 1338
    .line 1339
    invoke-direct {v11, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1343
    .line 1344
    .line 1345
    const-string v2, " has not been laid out. Completing operation "

    .line 1346
    .line 1347
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v2

    .line 1357
    move-object/from16 v11, v34

    .line 1358
    .line 1359
    invoke-static {v11, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1360
    .line 1361
    .line 1362
    goto :goto_20

    .line 1363
    :cond_35
    move/from16 p2, v2

    .line 1364
    .line 1365
    move-object/from16 v11, v34

    .line 1366
    .line 1367
    :goto_20
    invoke-virtual {v8}, Landroidx/fragment/app/j;->a()V

    .line 1368
    .line 1369
    .line 1370
    move-object/from16 v30, v7

    .line 1371
    .line 1372
    goto :goto_21

    .line 1373
    :cond_36
    move/from16 p2, v2

    .line 1374
    .line 1375
    move-object/from16 v11, v34

    .line 1376
    .line 1377
    iget-object v2, v8, Landroidx/fragment/app/j;->b:Lk0/e;

    .line 1378
    .line 1379
    move-object/from16 v30, v7

    .line 1380
    .line 1381
    new-instance v7, Landroidx/fragment/app/c;

    .line 1382
    .line 1383
    invoke-direct {v7, v8, v12}, Landroidx/fragment/app/c;-><init>(Landroidx/fragment/app/k;Landroidx/fragment/app/o1;)V

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v5, v1, v2, v7}, Landroidx/fragment/app/k1;->o(Ljava/lang/Object;Lk0/e;Landroidx/fragment/app/c;)V

    .line 1387
    .line 1388
    .line 1389
    :goto_21
    move/from16 v2, p2

    .line 1390
    .line 1391
    move-object/from16 v34, v11

    .line 1392
    .line 1393
    move-object/from16 v35, v15

    .line 1394
    .line 1395
    goto/16 :goto_1d

    .line 1396
    .line 1397
    :cond_37
    move-object/from16 v11, v34

    .line 1398
    .line 1399
    move-object/from16 v15, v35

    .line 1400
    .line 1401
    sget-object v2, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 1402
    .line 1403
    invoke-virtual {v3}, Landroid/view/View;->isLaidOut()Z

    .line 1404
    .line 1405
    .line 1406
    move-result v2

    .line 1407
    if-nez v2, :cond_38

    .line 1408
    .line 1409
    :goto_22
    const/4 v10, 0x0

    .line 1410
    goto/16 :goto_29

    .line 1411
    .line 1412
    :cond_38
    const/4 v2, 0x4

    .line 1413
    invoke-static {v2, v0}, Landroidx/fragment/app/d1;->a(ILjava/util/ArrayList;)V

    .line 1414
    .line 1415
    .line 1416
    new-instance v2, Ljava/util/ArrayList;

    .line 1417
    .line 1418
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1422
    .line 1423
    .line 1424
    move-result v7

    .line 1425
    const/4 v10, 0x0

    .line 1426
    :goto_23
    if-ge v10, v7, :cond_39

    .line 1427
    .line 1428
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v8

    .line 1432
    check-cast v8, Landroid/view/View;

    .line 1433
    .line 1434
    sget-object v12, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 1435
    .line 1436
    invoke-virtual {v8}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v12

    .line 1440
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1441
    .line 1442
    .line 1443
    const/4 v12, 0x0

    .line 1444
    invoke-virtual {v8, v12}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    .line 1445
    .line 1446
    .line 1447
    add-int/lit8 v10, v10, 0x1

    .line 1448
    .line 1449
    goto :goto_23

    .line 1450
    :cond_39
    const/16 v17, 0x2

    .line 1451
    .line 1452
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/u0;->G(I)Z

    .line 1453
    .line 1454
    .line 1455
    move-result v7

    .line 1456
    if-eqz v7, :cond_3b

    .line 1457
    .line 1458
    const-string v7, ">>>>> Beginning transition <<<<<"

    .line 1459
    .line 1460
    invoke-static {v11, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1461
    .line 1462
    .line 1463
    const-string v7, ">>>>> SharedElementFirstOutViews <<<<<"

    .line 1464
    .line 1465
    invoke-static {v11, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1469
    .line 1470
    .line 1471
    move-result v7

    .line 1472
    const/4 v10, 0x0

    .line 1473
    :goto_24
    const-string v8, " Name: "

    .line 1474
    .line 1475
    const-string v12, "View: "

    .line 1476
    .line 1477
    if-ge v10, v7, :cond_3a

    .line 1478
    .line 1479
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v19

    .line 1483
    add-int/lit8 v10, v10, 0x1

    .line 1484
    .line 1485
    move/from16 p2, v7

    .line 1486
    .line 1487
    move-object/from16 v7, v19

    .line 1488
    .line 1489
    check-cast v7, Landroid/view/View;

    .line 1490
    .line 1491
    move/from16 v19, v10

    .line 1492
    .line 1493
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1494
    .line 1495
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1499
    .line 1500
    .line 1501
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {v7}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v7

    .line 1508
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v7

    .line 1515
    invoke-static {v11, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1516
    .line 1517
    .line 1518
    move/from16 v7, p2

    .line 1519
    .line 1520
    move/from16 v10, v19

    .line 1521
    .line 1522
    goto :goto_24

    .line 1523
    :cond_3a
    const-string v7, ">>>>> SharedElementLastInViews <<<<<"

    .line 1524
    .line 1525
    invoke-static {v11, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1529
    .line 1530
    .line 1531
    move-result v7

    .line 1532
    const/4 v10, 0x0

    .line 1533
    :goto_25
    if-ge v10, v7, :cond_3b

    .line 1534
    .line 1535
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v19

    .line 1539
    add-int/lit8 v10, v10, 0x1

    .line 1540
    .line 1541
    move/from16 p2, v7

    .line 1542
    .line 1543
    move-object/from16 v7, v19

    .line 1544
    .line 1545
    check-cast v7, Landroid/view/View;

    .line 1546
    .line 1547
    move/from16 v19, v10

    .line 1548
    .line 1549
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1550
    .line 1551
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1555
    .line 1556
    .line 1557
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual {v7}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v7

    .line 1564
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v7

    .line 1571
    invoke-static {v11, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1572
    .line 1573
    .line 1574
    move/from16 v7, p2

    .line 1575
    .line 1576
    move/from16 v10, v19

    .line 1577
    .line 1578
    goto :goto_25

    .line 1579
    :cond_3b
    invoke-virtual {v5, v3, v1}, Landroidx/fragment/app/k1;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1583
    .line 1584
    .line 1585
    move-result v1

    .line 1586
    new-instance v7, Ljava/util/ArrayList;

    .line 1587
    .line 1588
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1589
    .line 1590
    .line 1591
    const/4 v10, 0x0

    .line 1592
    :goto_26
    if-ge v10, v1, :cond_3f

    .line 1593
    .line 1594
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v8

    .line 1598
    check-cast v8, Landroid/view/View;

    .line 1599
    .line 1600
    sget-object v12, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 1601
    .line 1602
    invoke-virtual {v8}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v12

    .line 1606
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1607
    .line 1608
    .line 1609
    if-nez v12, :cond_3c

    .line 1610
    .line 1611
    move/from16 v20, v1

    .line 1612
    .line 1613
    move-object/from16 v24, v7

    .line 1614
    .line 1615
    goto :goto_28

    .line 1616
    :cond_3c
    move-object/from16 v24, v7

    .line 1617
    .line 1618
    const/4 v7, 0x0

    .line 1619
    invoke-virtual {v8, v7}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    .line 1620
    .line 1621
    .line 1622
    move-object/from16 v8, p1

    .line 1623
    .line 1624
    invoke-virtual {v8, v12}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v16

    .line 1628
    move-object/from16 v7, v16

    .line 1629
    .line 1630
    check-cast v7, Ljava/lang/String;

    .line 1631
    .line 1632
    const/4 v8, 0x0

    .line 1633
    :goto_27
    move/from16 v20, v1

    .line 1634
    .line 1635
    if-ge v8, v1, :cond_3e

    .line 1636
    .line 1637
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v1

    .line 1641
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1642
    .line 1643
    .line 1644
    move-result v1

    .line 1645
    if-eqz v1, :cond_3d

    .line 1646
    .line 1647
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v1

    .line 1651
    check-cast v1, Landroid/view/View;

    .line 1652
    .line 1653
    invoke-virtual {v1, v12}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    .line 1654
    .line 1655
    .line 1656
    goto :goto_28

    .line 1657
    :cond_3d
    add-int/lit8 v8, v8, 0x1

    .line 1658
    .line 1659
    move/from16 v1, v20

    .line 1660
    .line 1661
    goto :goto_27

    .line 1662
    :cond_3e
    :goto_28
    add-int/lit8 v10, v10, 0x1

    .line 1663
    .line 1664
    move/from16 v1, v20

    .line 1665
    .line 1666
    move-object/from16 v7, v24

    .line 1667
    .line 1668
    goto :goto_26

    .line 1669
    :cond_3f
    move/from16 v20, v1

    .line 1670
    .line 1671
    move-object/from16 v24, v7

    .line 1672
    .line 1673
    new-instance v19, Landroidx/fragment/app/j1;

    .line 1674
    .line 1675
    move-object/from16 v22, v2

    .line 1676
    .line 1677
    move-object/from16 v23, v9

    .line 1678
    .line 1679
    move-object/from16 v21, v13

    .line 1680
    .line 1681
    invoke-direct/range {v19 .. v24}, Landroidx/fragment/app/j1;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1682
    .line 1683
    .line 1684
    move-object/from16 v2, v19

    .line 1685
    .line 1686
    move-object/from16 v1, v23

    .line 1687
    .line 1688
    invoke-static {v3, v2}, Lp0/s;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1689
    .line 1690
    .line 1691
    const/4 v10, 0x0

    .line 1692
    invoke-static {v10, v0}, Landroidx/fragment/app/d1;->a(ILjava/util/ArrayList;)V

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v5, v14, v1, v13}, Landroidx/fragment/app/k1;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1696
    .line 1697
    .line 1698
    :goto_29
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1699
    .line 1700
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    .line 1701
    .line 1702
    .line 1703
    move-result v0

    .line 1704
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v1

    .line 1708
    new-instance v2, Ljava/util/ArrayList;

    .line 1709
    .line 1710
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1711
    .line 1712
    .line 1713
    invoke-virtual/range {v26 .. v26}, Ljava/util/ArrayList;->size()I

    .line 1714
    .line 1715
    .line 1716
    move-result v5

    .line 1717
    move v7, v10

    .line 1718
    move v8, v7

    .line 1719
    :goto_2a
    const-string v9, " has started."

    .line 1720
    .line 1721
    if-ge v8, v5, :cond_48

    .line 1722
    .line 1723
    move-object/from16 v12, v26

    .line 1724
    .line 1725
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v13

    .line 1729
    add-int/lit8 v8, v8, 0x1

    .line 1730
    .line 1731
    check-cast v13, Landroidx/fragment/app/i;

    .line 1732
    .line 1733
    invoke-virtual {v13}, Landroidx/fragment/app/j;->b()Z

    .line 1734
    .line 1735
    .line 1736
    move-result v14

    .line 1737
    if-eqz v14, :cond_40

    .line 1738
    .line 1739
    invoke-virtual {v13}, Landroidx/fragment/app/j;->a()V

    .line 1740
    .line 1741
    .line 1742
    :goto_2b
    move/from16 p1, v0

    .line 1743
    .line 1744
    move/from16 p2, v5

    .line 1745
    .line 1746
    move/from16 v16, v7

    .line 1747
    .line 1748
    goto :goto_2c

    .line 1749
    :cond_40
    invoke-virtual {v13, v1}, Landroidx/fragment/app/i;->c(Landroid/content/Context;)Landroidx/fragment/app/e;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v14

    .line 1753
    if-nez v14, :cond_41

    .line 1754
    .line 1755
    invoke-virtual {v13}, Landroidx/fragment/app/j;->a()V

    .line 1756
    .line 1757
    .line 1758
    goto :goto_2b

    .line 1759
    :cond_41
    iget-object v14, v14, Landroidx/fragment/app/e;->f:Ljava/lang/Cloneable;

    .line 1760
    .line 1761
    check-cast v14, Landroid/animation/Animator;

    .line 1762
    .line 1763
    if-nez v14, :cond_42

    .line 1764
    .line 1765
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1766
    .line 1767
    .line 1768
    goto :goto_2b

    .line 1769
    :cond_42
    iget-object v10, v13, Landroidx/fragment/app/j;->a:Landroidx/fragment/app/o1;

    .line 1770
    .line 1771
    move/from16 p1, v0

    .line 1772
    .line 1773
    iget-object v0, v10, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 1774
    .line 1775
    move/from16 p2, v5

    .line 1776
    .line 1777
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1778
    .line 1779
    move/from16 v16, v7

    .line 1780
    .line 1781
    invoke-virtual {v4, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v7

    .line 1785
    invoke-virtual {v5, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 1786
    .line 1787
    .line 1788
    move-result v5

    .line 1789
    if-eqz v5, :cond_44

    .line 1790
    .line 1791
    const/16 v17, 0x2

    .line 1792
    .line 1793
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/u0;->G(I)Z

    .line 1794
    .line 1795
    .line 1796
    move-result v5

    .line 1797
    if-eqz v5, :cond_43

    .line 1798
    .line 1799
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1800
    .line 1801
    const-string v7, "Ignoring Animator set on "

    .line 1802
    .line 1803
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1804
    .line 1805
    .line 1806
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1807
    .line 1808
    .line 1809
    const-string v0, " as this Fragment was involved in a Transition."

    .line 1810
    .line 1811
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1812
    .line 1813
    .line 1814
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v0

    .line 1818
    invoke-static {v11, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1819
    .line 1820
    .line 1821
    :cond_43
    invoke-virtual {v13}, Landroidx/fragment/app/j;->a()V

    .line 1822
    .line 1823
    .line 1824
    :goto_2c
    move/from16 v0, p1

    .line 1825
    .line 1826
    move/from16 v5, p2

    .line 1827
    .line 1828
    move-object/from16 v26, v12

    .line 1829
    .line 1830
    move/from16 v7, v16

    .line 1831
    .line 1832
    const/4 v10, 0x0

    .line 1833
    goto :goto_2a

    .line 1834
    :cond_44
    iget v5, v10, Landroidx/fragment/app/o1;->a:I

    .line 1835
    .line 1836
    const/4 v7, 0x3

    .line 1837
    if-ne v5, v7, :cond_45

    .line 1838
    .line 1839
    const/16 v30, 0x1

    .line 1840
    .line 1841
    goto :goto_2d

    .line 1842
    :cond_45
    const/16 v30, 0x0

    .line 1843
    .line 1844
    :goto_2d
    move-object/from16 v5, v33

    .line 1845
    .line 1846
    if-eqz v30, :cond_46

    .line 1847
    .line 1848
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1849
    .line 1850
    .line 1851
    :cond_46
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 1852
    .line 1853
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 1854
    .line 1855
    .line 1856
    new-instance v27, Landroidx/fragment/app/d;

    .line 1857
    .line 1858
    move-object/from16 v29, v0

    .line 1859
    .line 1860
    move-object/from16 v28, v3

    .line 1861
    .line 1862
    move-object/from16 v31, v10

    .line 1863
    .line 1864
    move-object/from16 v32, v13

    .line 1865
    .line 1866
    invoke-direct/range {v27 .. v32}, Landroidx/fragment/app/d;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/o1;Landroidx/fragment/app/i;)V

    .line 1867
    .line 1868
    .line 1869
    move-object/from16 v10, v27

    .line 1870
    .line 1871
    move-object/from16 v7, v28

    .line 1872
    .line 1873
    move-object/from16 v3, v29

    .line 1874
    .line 1875
    move-object/from16 v0, v31

    .line 1876
    .line 1877
    invoke-virtual {v14, v10}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1878
    .line 1879
    .line 1880
    invoke-virtual {v14, v3}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 1881
    .line 1882
    .line 1883
    invoke-virtual {v14}, Landroid/animation/Animator;->start()V

    .line 1884
    .line 1885
    .line 1886
    const/16 v17, 0x2

    .line 1887
    .line 1888
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/u0;->G(I)Z

    .line 1889
    .line 1890
    .line 1891
    move-result v3

    .line 1892
    if-eqz v3, :cond_47

    .line 1893
    .line 1894
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1895
    .line 1896
    const-string v10, "Animator from operation "

    .line 1897
    .line 1898
    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1899
    .line 1900
    .line 1901
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1902
    .line 1903
    .line 1904
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1905
    .line 1906
    .line 1907
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v3

    .line 1911
    invoke-static {v11, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1912
    .line 1913
    .line 1914
    :cond_47
    iget-object v3, v13, Landroidx/fragment/app/j;->b:Lk0/e;

    .line 1915
    .line 1916
    new-instance v9, Landroidx/fragment/app/e;

    .line 1917
    .line 1918
    invoke-direct {v9, v14, v0}, Landroidx/fragment/app/e;-><init>(Landroid/animation/Animator;Landroidx/fragment/app/o1;)V

    .line 1919
    .line 1920
    .line 1921
    invoke-virtual {v3, v9}, Lk0/e;->a(Lk0/d;)V

    .line 1922
    .line 1923
    .line 1924
    move/from16 v0, p1

    .line 1925
    .line 1926
    move-object/from16 v33, v5

    .line 1927
    .line 1928
    move-object v3, v7

    .line 1929
    move-object/from16 v26, v12

    .line 1930
    .line 1931
    const/4 v7, 0x1

    .line 1932
    const/4 v10, 0x0

    .line 1933
    move/from16 v5, p2

    .line 1934
    .line 1935
    goto/16 :goto_2a

    .line 1936
    .line 1937
    :cond_48
    move/from16 p1, v0

    .line 1938
    .line 1939
    move/from16 v16, v7

    .line 1940
    .line 1941
    move-object/from16 v5, v33

    .line 1942
    .line 1943
    move-object v7, v3

    .line 1944
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1945
    .line 1946
    .line 1947
    move-result v0

    .line 1948
    const/4 v10, 0x0

    .line 1949
    :goto_2e
    if-ge v10, v0, :cond_4f

    .line 1950
    .line 1951
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v3

    .line 1955
    add-int/lit8 v10, v10, 0x1

    .line 1956
    .line 1957
    check-cast v3, Landroidx/fragment/app/i;

    .line 1958
    .line 1959
    iget-object v4, v3, Landroidx/fragment/app/j;->a:Landroidx/fragment/app/o1;

    .line 1960
    .line 1961
    iget-object v8, v4, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 1962
    .line 1963
    const-string v12, "Ignoring Animation set on "

    .line 1964
    .line 1965
    if-eqz p1, :cond_4a

    .line 1966
    .line 1967
    const/16 v17, 0x2

    .line 1968
    .line 1969
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/u0;->G(I)Z

    .line 1970
    .line 1971
    .line 1972
    move-result v4

    .line 1973
    if-eqz v4, :cond_49

    .line 1974
    .line 1975
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1976
    .line 1977
    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1978
    .line 1979
    .line 1980
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1981
    .line 1982
    .line 1983
    const-string v8, " as Animations cannot run alongside Transitions."

    .line 1984
    .line 1985
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1986
    .line 1987
    .line 1988
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v4

    .line 1992
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1993
    .line 1994
    .line 1995
    :cond_49
    invoke-virtual {v3}, Landroidx/fragment/app/j;->a()V

    .line 1996
    .line 1997
    .line 1998
    goto :goto_2e

    .line 1999
    :cond_4a
    if-eqz v16, :cond_4c

    .line 2000
    .line 2001
    const/16 v17, 0x2

    .line 2002
    .line 2003
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/u0;->G(I)Z

    .line 2004
    .line 2005
    .line 2006
    move-result v4

    .line 2007
    if-eqz v4, :cond_4b

    .line 2008
    .line 2009
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2010
    .line 2011
    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2012
    .line 2013
    .line 2014
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2015
    .line 2016
    .line 2017
    const-string v8, " as Animations cannot run alongside Animators."

    .line 2018
    .line 2019
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2020
    .line 2021
    .line 2022
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v4

    .line 2026
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2027
    .line 2028
    .line 2029
    :cond_4b
    invoke-virtual {v3}, Landroidx/fragment/app/j;->a()V

    .line 2030
    .line 2031
    .line 2032
    goto :goto_2e

    .line 2033
    :cond_4c
    iget-object v8, v8, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 2034
    .line 2035
    invoke-virtual {v3, v1}, Landroidx/fragment/app/i;->c(Landroid/content/Context;)Landroidx/fragment/app/e;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v12

    .line 2039
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2040
    .line 2041
    .line 2042
    iget-object v12, v12, Landroidx/fragment/app/e;->g:Ljava/lang/Object;

    .line 2043
    .line 2044
    check-cast v12, Landroid/view/animation/Animation;

    .line 2045
    .line 2046
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2047
    .line 2048
    .line 2049
    iget v13, v4, Landroidx/fragment/app/o1;->a:I

    .line 2050
    .line 2051
    const/4 v14, 0x1

    .line 2052
    if-eq v13, v14, :cond_4d

    .line 2053
    .line 2054
    invoke-virtual {v8, v12}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 2055
    .line 2056
    .line 2057
    invoke-virtual {v3}, Landroidx/fragment/app/j;->a()V

    .line 2058
    .line 2059
    .line 2060
    goto :goto_2f

    .line 2061
    :cond_4d
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 2062
    .line 2063
    .line 2064
    new-instance v13, Landroidx/fragment/app/f0;

    .line 2065
    .line 2066
    invoke-direct {v13, v12, v7, v8}, Landroidx/fragment/app/f0;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 2067
    .line 2068
    .line 2069
    new-instance v12, Landroidx/fragment/app/g;

    .line 2070
    .line 2071
    invoke-direct {v12, v8, v7, v3, v4}, Landroidx/fragment/app/g;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/i;Landroidx/fragment/app/o1;)V

    .line 2072
    .line 2073
    .line 2074
    invoke-virtual {v13, v12}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 2075
    .line 2076
    .line 2077
    invoke-virtual {v8, v13}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 2078
    .line 2079
    .line 2080
    const/16 v17, 0x2

    .line 2081
    .line 2082
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/u0;->G(I)Z

    .line 2083
    .line 2084
    .line 2085
    move-result v12

    .line 2086
    if-eqz v12, :cond_4e

    .line 2087
    .line 2088
    new-instance v12, Ljava/lang/StringBuilder;

    .line 2089
    .line 2090
    const-string v13, "Animation from operation "

    .line 2091
    .line 2092
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2093
    .line 2094
    .line 2095
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2096
    .line 2097
    .line 2098
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2099
    .line 2100
    .line 2101
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2102
    .line 2103
    .line 2104
    move-result-object v12

    .line 2105
    invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2106
    .line 2107
    .line 2108
    :cond_4e
    :goto_2f
    iget-object v12, v3, Landroidx/fragment/app/j;->b:Lk0/e;

    .line 2109
    .line 2110
    new-instance v13, Landroidx/fragment/app/a1;

    .line 2111
    .line 2112
    invoke-direct {v13, v8, v7, v3, v4}, Landroidx/fragment/app/a1;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/i;Landroidx/fragment/app/o1;)V

    .line 2113
    .line 2114
    .line 2115
    invoke-virtual {v12, v13}, Lk0/e;->a(Lk0/d;)V

    .line 2116
    .line 2117
    .line 2118
    goto/16 :goto_2e

    .line 2119
    .line 2120
    :cond_4f
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 2121
    .line 2122
    .line 2123
    move-result v0

    .line 2124
    const/4 v4, 0x0

    .line 2125
    :goto_30
    if-ge v4, v0, :cond_50

    .line 2126
    .line 2127
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v1

    .line 2131
    add-int/lit8 v4, v4, 0x1

    .line 2132
    .line 2133
    check-cast v1, Landroidx/fragment/app/o1;

    .line 2134
    .line 2135
    iget-object v2, v1, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 2136
    .line 2137
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 2138
    .line 2139
    iget v1, v1, Landroidx/fragment/app/o1;->a:I

    .line 2140
    .line 2141
    invoke-static {v2, v1}, Landroidx/fragment/app/u;->a(Landroid/view/View;I)V

    .line 2142
    .line 2143
    .line 2144
    goto :goto_30

    .line 2145
    :cond_50
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 2146
    .line 2147
    .line 2148
    const/16 v17, 0x2

    .line 2149
    .line 2150
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/u0;->G(I)Z

    .line 2151
    .line 2152
    .line 2153
    move-result v0

    .line 2154
    if-eqz v0, :cond_51

    .line 2155
    .line 2156
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2157
    .line 2158
    const-string v1, "Completed executing operations from "

    .line 2159
    .line 2160
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2161
    .line 2162
    .line 2163
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2164
    .line 2165
    .line 2166
    move-object/from16 v1, v25

    .line 2167
    .line 2168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2169
    .line 2170
    .line 2171
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2172
    .line 2173
    .line 2174
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v0

    .line 2178
    invoke-static {v11, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2179
    .line 2180
    .line 2181
    :cond_51
    return-void
.end method

.method public final d()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/l;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/l;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    sget-object v1, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/l;->g()V

    .line 18
    .line 19
    .line 20
    iput-boolean v1, p0, Landroidx/fragment/app/l;->d:Z

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v2, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_7

    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v3, p0, Landroidx/fragment/app/l;->c:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p0, Landroidx/fragment/app/l;->c:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    move v4, v1

    .line 51
    :cond_2
    :goto_0
    const/4 v5, 0x2

    .line 52
    if-ge v4, v3, :cond_4

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    check-cast v6, Landroidx/fragment/app/o1;

    .line 61
    .line 62
    invoke-static {v5}, Landroidx/fragment/app/u0;->G(I)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    const-string v5, "FragmentManager"

    .line 69
    .line 70
    new-instance v7, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v8, "SpecialEffectsController: Cancelling operation "

    .line 76
    .line 77
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-static {v5, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catchall_0
    move-exception v1

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    :goto_1
    invoke-virtual {v6}, Landroidx/fragment/app/o1;->a()V

    .line 94
    .line 95
    .line 96
    iget-boolean v5, v6, Landroidx/fragment/app/o1;->g:Z

    .line 97
    .line 98
    if-nez v5, :cond_2

    .line 99
    .line 100
    iget-object v5, p0, Landroidx/fragment/app/l;->c:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/l;->l()V

    .line 107
    .line 108
    .line 109
    new-instance v2, Ljava/util/ArrayList;

    .line 110
    .line 111
    iget-object v3, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 114
    .line 115
    .line 116
    iget-object v3, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 119
    .line 120
    .line 121
    iget-object v3, p0, Landroidx/fragment/app/l;->c:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 124
    .line 125
    .line 126
    invoke-static {v5}, Landroidx/fragment/app/u0;->G(I)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_5

    .line 131
    .line 132
    const-string v3, "FragmentManager"

    .line 133
    .line 134
    const-string v4, "SpecialEffectsController: Executing pending operations"

    .line 135
    .line 136
    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    move v4, v1

    .line 144
    :goto_2
    if-ge v4, v3, :cond_6

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    add-int/lit8 v4, v4, 0x1

    .line 151
    .line 152
    check-cast v6, Landroidx/fragment/app/o1;

    .line 153
    .line 154
    invoke-virtual {v6}, Landroidx/fragment/app/o1;->d()V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_6
    iget-boolean v3, p0, Landroidx/fragment/app/l;->d:Z

    .line 159
    .line 160
    invoke-virtual {p0, v2, v3}, Landroidx/fragment/app/l;->c(Ljava/util/ArrayList;Z)V

    .line 161
    .line 162
    .line 163
    iput-boolean v1, p0, Landroidx/fragment/app/l;->d:Z

    .line 164
    .line 165
    invoke-static {v5}, Landroidx/fragment/app/u0;->G(I)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_7

    .line 170
    .line 171
    const-string v1, "FragmentManager"

    .line 172
    .line 173
    const-string v2, "SpecialEffectsController: Finished executing pending operations"

    .line 174
    .line 175
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    :cond_7
    monitor-exit v0

    .line 179
    return-void

    .line 180
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    throw v1
.end method

.method public final f(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/o1;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :cond_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Landroidx/fragment/app/o1;

    .line 17
    .line 18
    iget-object v4, v3, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 19
    .line 20
    invoke-virtual {v4, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    iget-boolean v4, v3, Landroidx/fragment/app/o1;->f:Z

    .line 27
    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    return-object v3

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    return-object p1
.end method

.method public final g()V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->G(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string v1, "FragmentManager"

    .line 9
    .line 10
    const-string v2, "SpecialEffectsController: Forcing all operations to complete"

    .line 11
    .line 12
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/l;->a:Landroid/view/ViewGroup;

    .line 16
    .line 17
    sget-object v2, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    monitor-enter v2

    .line 26
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/l;->l()V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/4 v5, 0x0

    .line 36
    move v6, v5

    .line 37
    :goto_0
    if-ge v6, v4, :cond_1

    .line 38
    .line 39
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    add-int/lit8 v6, v6, 0x1

    .line 44
    .line 45
    check-cast v7, Landroidx/fragment/app/o1;

    .line 46
    .line 47
    invoke-virtual {v7}, Landroidx/fragment/app/o1;->d()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    .line 55
    .line 56
    iget-object v4, p0, Landroidx/fragment/app/l;->c:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    move v6, v5

    .line 66
    :goto_1
    if-ge v6, v4, :cond_4

    .line 67
    .line 68
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    check-cast v7, Landroidx/fragment/app/o1;

    .line 75
    .line 76
    invoke-static {v0}, Landroidx/fragment/app/u0;->G(I)Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-eqz v8, :cond_3

    .line 81
    .line 82
    const-string v8, "FragmentManager"

    .line 83
    .line 84
    new-instance v9, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v10, "SpecialEffectsController: "

    .line 90
    .line 91
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    const-string v10, ""

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    new-instance v10, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v11, "Container "

    .line 105
    .line 106
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v11, p0, Landroidx/fragment/app/l;->a:Landroid/view/ViewGroup;

    .line 110
    .line 111
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v11, " is not attached to window. "

    .line 115
    .line 116
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    :goto_2
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v10, "Cancelling running operation "

    .line 127
    .line 128
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    :cond_3
    invoke-virtual {v7}, Landroidx/fragment/app/o1;->a()V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    .line 146
    .line 147
    iget-object v4, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    :goto_3
    if-ge v5, v4, :cond_7

    .line 157
    .line 158
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    add-int/lit8 v5, v5, 0x1

    .line 163
    .line 164
    check-cast v6, Landroidx/fragment/app/o1;

    .line 165
    .line 166
    invoke-static {v0}, Landroidx/fragment/app/u0;->G(I)Z

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    if-eqz v7, :cond_6

    .line 171
    .line 172
    const-string v7, "FragmentManager"

    .line 173
    .line 174
    new-instance v8, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v9, "SpecialEffectsController: "

    .line 180
    .line 181
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    if-eqz v1, :cond_5

    .line 185
    .line 186
    const-string v9, ""

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_5
    new-instance v9, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v10, "Container "

    .line 195
    .line 196
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget-object v10, p0, Landroidx/fragment/app/l;->a:Landroid/view/ViewGroup;

    .line 200
    .line 201
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v10, " is not attached to window. "

    .line 205
    .line 206
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    :goto_4
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v9, "Cancelling pending operation "

    .line 217
    .line 218
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    :cond_6
    invoke-virtual {v6}, Landroidx/fragment/app/o1;->a()V

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_7
    monitor-exit v2

    .line 236
    return-void

    .line 237
    :goto_5
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    throw v0
.end method

.method public final j()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/l;->l()V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Landroidx/fragment/app/l;->e:Z

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/lit8 v1, v1, -0x1

    .line 17
    .line 18
    :goto_0
    if-ltz v1, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroidx/fragment/app/o1;

    .line 27
    .line 28
    iget-object v3, v2, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    iget-object v3, v3, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 31
    .line 32
    invoke-static {v3}, Landroidx/fragment/app/u;->c(Landroid/view/View;)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    iget v4, v2, Landroidx/fragment/app/o1;->a:I

    .line 37
    .line 38
    const/4 v5, 0x2

    .line 39
    if-ne v4, v5, :cond_0

    .line 40
    .line 41
    if-eq v3, v5, :cond_0

    .line 42
    .line 43
    iget-object v1, v2, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->isPostponed()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iput-boolean v1, p0, Landroidx/fragment/app/l;->e:Z

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto :goto_2

    .line 54
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    :goto_1
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    throw v1
.end method

.method public final l()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/l;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Landroidx/fragment/app/o1;

    .line 17
    .line 18
    iget v4, v3, Landroidx/fragment/app/o1;->b:I

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    if-ne v4, v5, :cond_0

    .line 22
    .line 23
    iget-object v4, v3, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 24
    .line 25
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {v4}, Landroidx/fragment/app/u;->b(I)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/4 v5, 0x1

    .line 38
    invoke-virtual {v3, v4, v5}, Landroidx/fragment/app/o1;->c(II)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-void
.end method
