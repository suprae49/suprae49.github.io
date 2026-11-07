.class public abstract Landroidx/fragment/app/u0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public A:Lb/g;

.field public B:Lb/g;

.field public C:Ljava/util/ArrayDeque;

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Ljava/util/ArrayList;

.field public J:Ljava/util/ArrayList;

.field public K:Ljava/util/ArrayList;

.field public L:Landroidx/fragment/app/w0;

.field public final M:Landroidx/fragment/app/f;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Landroidx/fragment/app/a1;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Landroidx/fragment/app/j0;

.field public g:Landroidx/activity/j0;

.field public final h:Landroidx/fragment/app/m0;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/Map;

.field public final l:Landroidx/fragment/app/e;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final n:Landroidx/fragment/app/k0;

.field public final o:Landroidx/fragment/app/k0;

.field public final p:Landroidx/fragment/app/k0;

.field public final q:Landroidx/fragment/app/k0;

.field public final r:Landroidx/fragment/app/n0;

.field public s:I

.field public t:Landroidx/fragment/app/h0;

.field public u:Landroidx/fragment/app/g0;

.field public v:Landroidx/fragment/app/Fragment;

.field public w:Landroidx/fragment/app/Fragment;

.field public final x:Landroidx/fragment/app/o0;

.field public final y:Landroidx/fragment/app/p0;

.field public z:Lb/g;


# direct methods
.method public constructor <init>()V
    .locals 2

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
    iput-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Landroidx/fragment/app/a1;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/fragment/app/a1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 17
    .line 18
    new-instance v0, Landroidx/fragment/app/j0;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Landroidx/fragment/app/j0;-><init>(Landroidx/fragment/app/u0;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/fragment/app/u0;->f:Landroidx/fragment/app/j0;

    .line 24
    .line 25
    new-instance v0, Landroidx/fragment/app/m0;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Landroidx/fragment/app/m0;-><init>(Landroidx/fragment/app/u0;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/m0;

    .line 31
    .line 32
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Landroidx/fragment/app/u0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 38
    .line 39
    new-instance v0, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Landroidx/fragment/app/u0;->j:Ljava/util/Map;

    .line 49
    .line 50
    new-instance v0, Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Landroidx/fragment/app/u0;->k:Ljava/util/Map;

    .line 60
    .line 61
    new-instance v0, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 67
    .line 68
    .line 69
    new-instance v0, Landroidx/fragment/app/e;

    .line 70
    .line 71
    invoke-direct {v0, p0}, Landroidx/fragment/app/e;-><init>(Landroidx/fragment/app/u0;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Landroidx/fragment/app/u0;->l:Landroidx/fragment/app/e;

    .line 75
    .line 76
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Landroidx/fragment/app/u0;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 82
    .line 83
    new-instance v0, Landroidx/fragment/app/k0;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/k0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Landroidx/fragment/app/u0;->n:Landroidx/fragment/app/k0;

    .line 90
    .line 91
    new-instance v0, Landroidx/fragment/app/k0;

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/k0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, Landroidx/fragment/app/u0;->o:Landroidx/fragment/app/k0;

    .line 98
    .line 99
    new-instance v0, Landroidx/fragment/app/k0;

    .line 100
    .line 101
    const/4 v1, 0x2

    .line 102
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/k0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Landroidx/fragment/app/u0;->p:Landroidx/fragment/app/k0;

    .line 106
    .line 107
    new-instance v0, Landroidx/fragment/app/k0;

    .line 108
    .line 109
    const/4 v1, 0x3

    .line 110
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/k0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Landroidx/fragment/app/u0;->q:Landroidx/fragment/app/k0;

    .line 114
    .line 115
    new-instance v0, Landroidx/fragment/app/n0;

    .line 116
    .line 117
    invoke-direct {v0, p0}, Landroidx/fragment/app/n0;-><init>(Landroidx/fragment/app/u0;)V

    .line 118
    .line 119
    .line 120
    iput-object v0, p0, Landroidx/fragment/app/u0;->r:Landroidx/fragment/app/n0;

    .line 121
    .line 122
    const/4 v0, -0x1

    .line 123
    iput v0, p0, Landroidx/fragment/app/u0;->s:I

    .line 124
    .line 125
    new-instance v0, Landroidx/fragment/app/o0;

    .line 126
    .line 127
    invoke-direct {v0, p0}, Landroidx/fragment/app/o0;-><init>(Landroidx/fragment/app/u0;)V

    .line 128
    .line 129
    .line 130
    iput-object v0, p0, Landroidx/fragment/app/u0;->x:Landroidx/fragment/app/o0;

    .line 131
    .line 132
    new-instance v0, Landroidx/fragment/app/p0;

    .line 133
    .line 134
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 135
    .line 136
    .line 137
    iput-object v0, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/p0;

    .line 138
    .line 139
    new-instance v0, Ljava/util/ArrayDeque;

    .line 140
    .line 141
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 142
    .line 143
    .line 144
    iput-object v0, p0, Landroidx/fragment/app/u0;->C:Ljava/util/ArrayDeque;

    .line 145
    .line 146
    new-instance v0, Landroidx/fragment/app/f;

    .line 147
    .line 148
    const/4 v1, 0x4

    .line 149
    invoke-direct {v0, v1, p0}, Landroidx/fragment/app/f;-><init>(ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iput-object v0, p0, Landroidx/fragment/app/u0;->M:Landroidx/fragment/app/f;

    .line 153
    .line 154
    return-void
.end method

.method public static G(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static H(Landroidx/fragment/app/Fragment;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHasMenu:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mMenuVisible:Z

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/u0;

    .line 10
    .line 11
    iget-object p0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/a1;->e()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    move v2, v1

    .line 23
    move v3, v2

    .line 24
    :cond_1
    if-ge v3, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 33
    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    invoke-static {v4}, Landroidx/fragment/app/u0;->H(Landroidx/fragment/app/Fragment;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    :cond_2
    if-eqz v2, :cond_1

    .line 41
    .line 42
    :cond_3
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_4
    return v1
.end method

.method public static J(Landroidx/fragment/app/Fragment;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/u0;

    .line 5
    .line 6
    iget-object v1, v0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, v0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 15
    .line 16
    invoke-static {p0}, Landroidx/fragment/app/u0;->J(Landroidx/fragment/app/Fragment;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static Y(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->G(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "show: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 33
    .line 34
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 35
    .line 36
    xor-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final A(I)Landroidx/fragment/app/Fragment;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v4, v3, Landroidx/fragment/app/Fragment;->mFragmentId:I

    .line 24
    .line 25
    if-ne v4, p1, :cond_0

    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Landroidx/fragment/app/z0;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 58
    .line 59
    iget v2, v1, Landroidx/fragment/app/Fragment;->mFragmentId:I

    .line 60
    .line 61
    if-ne v2, p1, :cond_2

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    const/4 p1, 0x0

    .line 65
    return-object p1
.end method

.method public final B(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget-object v4, v3, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    return-object v3

    .line 32
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Landroidx/fragment/app/z0;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    iget-object v1, v1, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 62
    .line 63
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    const/4 p1, 0x0

    .line 73
    return-object p1
.end method

.method public final C(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/u0;->u:Landroidx/fragment/app/g0;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/g0;->o()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/fragment/app/u0;->u:Landroidx/fragment/app/g0;

    .line 20
    .line 21
    iget p1, p1, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroidx/fragment/app/g0;->n(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p1, Landroid/view/ViewGroup;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public final D()Landroidx/fragment/app/o0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/u0;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->D()Landroidx/fragment/app/o0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->x:Landroidx/fragment/app/o0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final E()Landroidx/fragment/app/p0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/u0;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->E()Landroidx/fragment/app/p0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/p0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final F(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->G(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "hide: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 35
    .line 36
    xor-int/2addr v0, v1

    .line 37
    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->X(Landroidx/fragment/app/Fragment;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final I()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/u0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->I()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method public final K(IZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string p1, "No activity"

    .line 10
    .line 11
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 16
    .line 17
    iget p2, p0, Landroidx/fragment/app/u0;->s:I

    .line 18
    .line 19
    if-ne p1, p2, :cond_2

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_2
    iput p1, p0, Landroidx/fragment/app/u0;->s:I

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 26
    .line 27
    iget-object p2, p1, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p2, Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v0, p1, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x0

    .line 40
    move v3, v2

    .line 41
    :cond_3
    :goto_1
    if-ge v3, v1, :cond_4

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 50
    .line 51
    iget-object v4, v4, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Landroidx/fragment/app/z0;

    .line 58
    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    invoke-virtual {v4}, Landroidx/fragment/app/z0;->j()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Landroidx/fragment/app/z0;

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-virtual {v0}, Landroidx/fragment/app/z0;->j()V

    .line 88
    .line 89
    .line 90
    iget-object v1, v0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 91
    .line 92
    iget-boolean v3, v1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 93
    .line 94
    if-eqz v3, :cond_5

    .line 95
    .line 96
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->isInBackStack()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_5

    .line 101
    .line 102
    iget-boolean v3, v1, Landroidx/fragment/app/Fragment;->mBeingSaved:Z

    .line 103
    .line 104
    if-eqz v3, :cond_6

    .line 105
    .line 106
    iget-object v3, p1, Landroidx/fragment/app/a1;->h:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Ljava/util/HashMap;

    .line 109
    .line 110
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_6

    .line 117
    .line 118
    invoke-virtual {v0}, Landroidx/fragment/app/z0;->m()V

    .line 119
    .line 120
    .line 121
    :cond_6
    invoke-virtual {p1, v0}, Landroidx/fragment/app/a1;->h(Landroidx/fragment/app/z0;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_7
    invoke-virtual {p1}, Landroidx/fragment/app/a1;->d()Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    move v0, v2

    .line 134
    :cond_8
    :goto_3
    if-ge v0, p2, :cond_a

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    add-int/lit8 v0, v0, 0x1

    .line 141
    .line 142
    check-cast v1, Landroidx/fragment/app/z0;

    .line 143
    .line 144
    iget-object v3, v1, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 145
    .line 146
    iget-boolean v4, v3, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 147
    .line 148
    if-eqz v4, :cond_8

    .line 149
    .line 150
    iget-boolean v4, p0, Landroidx/fragment/app/u0;->b:Z

    .line 151
    .line 152
    if-eqz v4, :cond_9

    .line 153
    .line 154
    const/4 v1, 0x1

    .line 155
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->H:Z

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_9
    iput-boolean v2, v3, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 159
    .line 160
    invoke-virtual {v1}, Landroidx/fragment/app/z0;->j()V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_a
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->D:Z

    .line 165
    .line 166
    if-eqz p1, :cond_b

    .line 167
    .line 168
    iget-object p1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 169
    .line 170
    if-eqz p1, :cond_b

    .line 171
    .line 172
    iget p2, p0, Landroidx/fragment/app/u0;->s:I

    .line 173
    .line 174
    const/4 v0, 0x7

    .line 175
    if-ne p2, v0, :cond_b

    .line 176
    .line 177
    check-cast p1, Landroidx/fragment/app/d0;

    .line 178
    .line 179
    iget-object p1, p1, Landroidx/fragment/app/d0;->j:Le/j;

    .line 180
    .line 181
    invoke-virtual {p1}, Le/j;->invalidateOptionsMenu()V

    .line 182
    .line 183
    .line 184
    iput-boolean v2, p0, Landroidx/fragment/app/u0;->D:Z

    .line 185
    .line 186
    :cond_b
    :goto_4
    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->E:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->F:Z

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 12
    .line 13
    iput-boolean v0, v1, Landroidx/fragment/app/w0;->i:Z

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->noteStateNotSaved()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :goto_1
    return-void
.end method

.method public final M()Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/u0;->N(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final N(II)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/fragment/app/u0;->x(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, Landroidx/fragment/app/u0;->w(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/u0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroidx/fragment/app/u0;->M()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/u0;->I:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/fragment/app/u0;->J:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0, v2, v3, p1, p2}, Landroidx/fragment/app/u0;->O(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->b:Z

    .line 37
    .line 38
    :try_start_0
    iget-object p2, p0, Landroidx/fragment/app/u0;->I:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v2, p0, Landroidx/fragment/app/u0;->J:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0, p2, v2}, Landroidx/fragment/app/u0;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->d()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->d()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->a0()V

    .line 55
    .line 56
    .line 57
    iget-boolean p2, p0, Landroidx/fragment/app/u0;->H:Z

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 60
    .line 61
    if-eqz p2, :cond_4

    .line 62
    .line 63
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->H:Z

    .line 64
    .line 65
    invoke-virtual {v2}, Landroidx/fragment/app/a1;->d()Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    move v4, v0

    .line 74
    :cond_2
    :goto_1
    if-ge v4, v3, :cond_4

    .line 75
    .line 76
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    add-int/lit8 v4, v4, 0x1

    .line 81
    .line 82
    check-cast v5, Landroidx/fragment/app/z0;

    .line 83
    .line 84
    iget-object v6, v5, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 85
    .line 86
    iget-boolean v7, v6, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 87
    .line 88
    if-eqz v7, :cond_2

    .line 89
    .line 90
    iget-boolean v7, p0, Landroidx/fragment/app/u0;->b:Z

    .line 91
    .line 92
    if-eqz v7, :cond_3

    .line 93
    .line 94
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->H:Z

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    iput-boolean v0, v6, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 98
    .line 99
    invoke-virtual {v5}, Landroidx/fragment/app/z0;->j()V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    iget-object p2, v2, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p2, Ljava/util/HashMap;

    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface {p2, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 117
    .line 118
    .line 119
    return p1
.end method

.method public final O(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p4, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p4, v1

    .line 9
    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_9

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_1
    if-gez p3, :cond_3

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    move v3, v1

    .line 26
    goto :goto_4

    .line 27
    :cond_2
    iget-object p3, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    add-int/lit8 v3, p3, -0x1

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_3
    iget-object v2, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sub-int/2addr v2, v0

    .line 43
    :goto_1
    if-ltz v2, :cond_5

    .line 44
    .line 45
    iget-object v4, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Landroidx/fragment/app/a;

    .line 52
    .line 53
    if-ltz p3, :cond_4

    .line 54
    .line 55
    iget v4, v4, Landroidx/fragment/app/a;->r:I

    .line 56
    .line 57
    if-ne p3, v4, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_5
    :goto_2
    if-gez v2, :cond_6

    .line 64
    .line 65
    move v3, v2

    .line 66
    goto :goto_4

    .line 67
    :cond_6
    if-eqz p4, :cond_7

    .line 68
    .line 69
    move v3, v2

    .line 70
    :goto_3
    if-lez v3, :cond_9

    .line 71
    .line 72
    iget-object p4, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 73
    .line 74
    add-int/lit8 v2, v3, -0x1

    .line 75
    .line 76
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    check-cast p4, Landroidx/fragment/app/a;

    .line 81
    .line 82
    if-ltz p3, :cond_9

    .line 83
    .line 84
    iget p4, p4, Landroidx/fragment/app/a;->r:I

    .line 85
    .line 86
    if-ne p3, p4, :cond_9

    .line 87
    .line 88
    add-int/lit8 v3, v3, -0x1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_7
    iget-object p3, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    sub-int/2addr p3, v0

    .line 98
    if-ne v2, p3, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 102
    .line 103
    :cond_9
    :goto_4
    if-gez v3, :cond_a

    .line 104
    .line 105
    return v1

    .line 106
    :cond_a
    iget-object p3, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    sub-int/2addr p3, v0

    .line 113
    :goto_5
    if-lt p3, v3, :cond_b

    .line 114
    .line 115
    iget-object p4, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    check-cast p4, Landroidx/fragment/app/a;

    .line 122
    .line 123
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    add-int/lit8 p3, p3, -0x1

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_b
    return v0
.end method

.method public final P(Landroidx/fragment/app/Fragment;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->G(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "FragmentManager"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "remove: "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " nesting="

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v2, p1, Landroidx/fragment/app/Fragment;->mBackStackNesting:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isInBackStack()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void

    .line 49
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 50
    .line 51
    iget-object v1, v0, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    monitor-enter v1

    .line 56
    :try_start_0
    iget-object v0, v0, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    .line 66
    .line 67
    invoke-static {p1}, Landroidx/fragment/app/u0;->H(Landroidx/fragment/app/Fragment;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x1

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->D:Z

    .line 75
    .line 76
    :cond_3
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->X(Landroidx/fragment/app/Fragment;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw p1
.end method

.method public final Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroidx/fragment/app/a;

    .line 31
    .line 32
    iget-boolean v3, v3, Landroidx/fragment/app/c1;->o:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, Landroidx/fragment/app/u0;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Landroidx/fragment/app/a;

    .line 74
    .line 75
    iget-boolean v3, v3, Landroidx/fragment/app/c1;->o:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Landroidx/fragment/app/u0;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v2, v0}, Landroidx/fragment/app/u0;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    return-void

    .line 96
    :cond_6
    const-string p1, "Internal error with the back stack records"

    .line 97
    .line 98
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final R(Landroid/os/Parcelable;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "result_"

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    iget-object v5, v0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 42
    .line 43
    iget-object v5, v5, Landroidx/fragment/app/h0;->g:Le/j;

    .line 44
    .line 45
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x7

    .line 53
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v5, v0, Landroidx/fragment/app/u0;->k:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const-string v5, "state"

    .line 81
    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    const-string v6, "fragment_"

    .line 91
    .line 92
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    iget-object v6, v0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 105
    .line 106
    iget-object v6, v6, Landroidx/fragment/app/h0;->g:Le/j;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Landroidx/fragment/app/FragmentState;

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    iget-object v3, v0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 126
    .line 127
    iget-object v4, v3, Landroidx/fragment/app/a1;->h:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v4, Ljava/util/HashMap;

    .line 130
    .line 131
    iget-object v6, v3, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v6, Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    const/4 v9, 0x0

    .line 143
    :goto_2
    if-ge v9, v7, :cond_4

    .line 144
    .line 145
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    add-int/lit8 v9, v9, 0x1

    .line 150
    .line 151
    check-cast v10, Landroidx/fragment/app/FragmentState;

    .line 152
    .line 153
    iget-object v11, v10, Landroidx/fragment/app/FragmentState;->g:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v4, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Landroidx/fragment/app/FragmentManagerState;

    .line 164
    .line 165
    if-nez v1, :cond_5

    .line 166
    .line 167
    return-void

    .line 168
    :cond_5
    invoke-virtual {v6}, Ljava/util/HashMap;->clear()V

    .line 169
    .line 170
    .line 171
    iget-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->f:Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    const/4 v5, 0x0

    .line 178
    :cond_6
    :goto_3
    iget-object v7, v0, Landroidx/fragment/app/u0;->l:Landroidx/fragment/app/e;

    .line 179
    .line 180
    const-string v9, "): "

    .line 181
    .line 182
    const/4 v10, 0x2

    .line 183
    const-string v11, "FragmentManager"

    .line 184
    .line 185
    if-ge v5, v4, :cond_a

    .line 186
    .line 187
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    add-int/lit8 v5, v5, 0x1

    .line 192
    .line 193
    check-cast v12, Ljava/lang/String;

    .line 194
    .line 195
    iget-object v13, v3, Landroidx/fragment/app/a1;->h:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v13, Ljava/util/HashMap;

    .line 198
    .line 199
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v12

    .line 203
    check-cast v12, Landroidx/fragment/app/FragmentState;

    .line 204
    .line 205
    if-eqz v12, :cond_6

    .line 206
    .line 207
    iget-object v13, v0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 208
    .line 209
    iget-object v14, v12, Landroidx/fragment/app/FragmentState;->g:Ljava/lang/String;

    .line 210
    .line 211
    iget-object v13, v13, Landroidx/fragment/app/w0;->d:Ljava/util/HashMap;

    .line 212
    .line 213
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    check-cast v13, Landroidx/fragment/app/Fragment;

    .line 218
    .line 219
    if-eqz v13, :cond_8

    .line 220
    .line 221
    invoke-static {v10}, Landroidx/fragment/app/u0;->G(I)Z

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    if-eqz v14, :cond_7

    .line 226
    .line 227
    new-instance v14, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    const-string v15, "restoreSaveState: re-attaching retained "

    .line 230
    .line 231
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    invoke-static {v11, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 242
    .line 243
    .line 244
    :cond_7
    new-instance v14, Landroidx/fragment/app/z0;

    .line 245
    .line 246
    invoke-direct {v14, v7, v3, v13, v12}, Landroidx/fragment/app/z0;-><init>(Landroidx/fragment/app/e;Landroidx/fragment/app/a1;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentState;)V

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_8
    new-instance v13, Landroidx/fragment/app/z0;

    .line 251
    .line 252
    iget-object v7, v0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 253
    .line 254
    iget-object v7, v7, Landroidx/fragment/app/h0;->g:Le/j;

    .line 255
    .line 256
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 257
    .line 258
    .line 259
    move-result-object v16

    .line 260
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->D()Landroidx/fragment/app/o0;

    .line 261
    .line 262
    .line 263
    move-result-object v17

    .line 264
    iget-object v14, v0, Landroidx/fragment/app/u0;->l:Landroidx/fragment/app/e;

    .line 265
    .line 266
    iget-object v15, v0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 267
    .line 268
    move-object/from16 v18, v12

    .line 269
    .line 270
    invoke-direct/range {v13 .. v18}, Landroidx/fragment/app/z0;-><init>(Landroidx/fragment/app/e;Landroidx/fragment/app/a1;Ljava/lang/ClassLoader;Landroidx/fragment/app/o0;Landroidx/fragment/app/FragmentState;)V

    .line 271
    .line 272
    .line 273
    move-object v14, v13

    .line 274
    :goto_4
    iget-object v7, v14, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 275
    .line 276
    iput-object v0, v7, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/u0;

    .line 277
    .line 278
    invoke-static {v10}, Landroidx/fragment/app/u0;->G(I)Z

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    if-eqz v10, :cond_9

    .line 283
    .line 284
    new-instance v10, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    const-string v12, "restoreSaveState: active ("

    .line 287
    .line 288
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    iget-object v12, v7, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-static {v11, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    :cond_9
    iget-object v7, v0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 310
    .line 311
    iget-object v7, v7, Landroidx/fragment/app/h0;->g:Le/j;

    .line 312
    .line 313
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-virtual {v14, v7}, Landroidx/fragment/app/z0;->k(Ljava/lang/ClassLoader;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3, v14}, Landroidx/fragment/app/a1;->g(Landroidx/fragment/app/z0;)V

    .line 321
    .line 322
    .line 323
    iget v7, v0, Landroidx/fragment/app/u0;->s:I

    .line 324
    .line 325
    iput v7, v14, Landroidx/fragment/app/z0;->e:I

    .line 326
    .line 327
    goto/16 :goto_3

    .line 328
    .line 329
    :cond_a
    iget-object v2, v0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    new-instance v4, Ljava/util/ArrayList;

    .line 335
    .line 336
    iget-object v2, v2, Landroidx/fragment/app/w0;->d:Ljava/util/HashMap;

    .line 337
    .line 338
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    const/4 v5, 0x0

    .line 350
    :goto_5
    const/4 v12, 0x1

    .line 351
    if-ge v5, v2, :cond_d

    .line 352
    .line 353
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    add-int/lit8 v5, v5, 0x1

    .line 358
    .line 359
    check-cast v13, Landroidx/fragment/app/Fragment;

    .line 360
    .line 361
    iget-object v14, v13, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v6, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v14

    .line 367
    if-eqz v14, :cond_b

    .line 368
    .line 369
    goto :goto_5

    .line 370
    :cond_b
    invoke-static {v10}, Landroidx/fragment/app/u0;->G(I)Z

    .line 371
    .line 372
    .line 373
    move-result v14

    .line 374
    if-eqz v14, :cond_c

    .line 375
    .line 376
    new-instance v14, Ljava/lang/StringBuilder;

    .line 377
    .line 378
    const-string v15, "Discarding retained Fragment "

    .line 379
    .line 380
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v15, " that was not found in the set of active Fragments "

    .line 387
    .line 388
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    iget-object v15, v1, Landroidx/fragment/app/FragmentManagerState;->f:Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v14

    .line 400
    invoke-static {v11, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 401
    .line 402
    .line 403
    :cond_c
    iget-object v14, v0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 404
    .line 405
    invoke-virtual {v14, v13}, Landroidx/fragment/app/w0;->f(Landroidx/fragment/app/Fragment;)V

    .line 406
    .line 407
    .line 408
    iput-object v0, v13, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/u0;

    .line 409
    .line 410
    new-instance v14, Landroidx/fragment/app/z0;

    .line 411
    .line 412
    invoke-direct {v14, v7, v3, v13}, Landroidx/fragment/app/z0;-><init>(Landroidx/fragment/app/e;Landroidx/fragment/app/a1;Landroidx/fragment/app/Fragment;)V

    .line 413
    .line 414
    .line 415
    iput v12, v14, Landroidx/fragment/app/z0;->e:I

    .line 416
    .line 417
    invoke-virtual {v14}, Landroidx/fragment/app/z0;->j()V

    .line 418
    .line 419
    .line 420
    iput-boolean v12, v13, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 421
    .line 422
    invoke-virtual {v14}, Landroidx/fragment/app/z0;->j()V

    .line 423
    .line 424
    .line 425
    goto :goto_5

    .line 426
    :cond_d
    iget-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->g:Ljava/util/ArrayList;

    .line 427
    .line 428
    iget-object v4, v3, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v4, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 433
    .line 434
    .line 435
    if-eqz v2, :cond_10

    .line 436
    .line 437
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    const/4 v5, 0x0

    .line 442
    :goto_6
    if-ge v5, v4, :cond_10

    .line 443
    .line 444
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    add-int/lit8 v5, v5, 0x1

    .line 449
    .line 450
    check-cast v6, Ljava/lang/String;

    .line 451
    .line 452
    invoke-virtual {v3, v6}, Landroidx/fragment/app/a1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    if-eqz v7, :cond_f

    .line 457
    .line 458
    invoke-static {v10}, Landroidx/fragment/app/u0;->G(I)Z

    .line 459
    .line 460
    .line 461
    move-result v13

    .line 462
    if-eqz v13, :cond_e

    .line 463
    .line 464
    new-instance v13, Ljava/lang/StringBuilder;

    .line 465
    .line 466
    const-string v14, "restoreSaveState: added ("

    .line 467
    .line 468
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    invoke-static {v11, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    :cond_e
    invoke-virtual {v3, v7}, Landroidx/fragment/app/a1;->a(Landroidx/fragment/app/Fragment;)V

    .line 488
    .line 489
    .line 490
    goto :goto_6

    .line 491
    :cond_f
    const-string v1, "No instantiated fragment for ("

    .line 492
    .line 493
    const-string v2, ")"

    .line 494
    .line 495
    invoke-static {v1, v6, v2}, Landroidx/fragment/app/u;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-static {v1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :cond_10
    iget-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->h:[Landroidx/fragment/app/BackStackRecordState;

    .line 504
    .line 505
    if-eqz v2, :cond_18

    .line 506
    .line 507
    new-instance v2, Ljava/util/ArrayList;

    .line 508
    .line 509
    iget-object v4, v1, Landroidx/fragment/app/FragmentManagerState;->h:[Landroidx/fragment/app/BackStackRecordState;

    .line 510
    .line 511
    array-length v4, v4

    .line 512
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 513
    .line 514
    .line 515
    iput-object v2, v0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 516
    .line 517
    const/4 v2, 0x0

    .line 518
    :goto_7
    iget-object v4, v1, Landroidx/fragment/app/FragmentManagerState;->h:[Landroidx/fragment/app/BackStackRecordState;

    .line 519
    .line 520
    array-length v5, v4

    .line 521
    if-ge v2, v5, :cond_17

    .line 522
    .line 523
    aget-object v4, v4, v2

    .line 524
    .line 525
    iget-object v5, v4, Landroidx/fragment/app/BackStackRecordState;->g:Ljava/util/ArrayList;

    .line 526
    .line 527
    new-instance v6, Landroidx/fragment/app/a;

    .line 528
    .line 529
    invoke-direct {v6, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/u0;)V

    .line 530
    .line 531
    .line 532
    iget-object v7, v4, Landroidx/fragment/app/BackStackRecordState;->f:[I

    .line 533
    .line 534
    const/4 v13, 0x0

    .line 535
    const/4 v14, 0x0

    .line 536
    :goto_8
    array-length v15, v7

    .line 537
    if-ge v13, v15, :cond_13

    .line 538
    .line 539
    new-instance v15, Landroidx/fragment/app/b1;

    .line 540
    .line 541
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 542
    .line 543
    .line 544
    add-int/lit8 v16, v13, 0x1

    .line 545
    .line 546
    move/from16 p1, v10

    .line 547
    .line 548
    aget v10, v7, v13

    .line 549
    .line 550
    iput v10, v15, Landroidx/fragment/app/b1;->a:I

    .line 551
    .line 552
    invoke-static/range {p1 .. p1}, Landroidx/fragment/app/u0;->G(I)Z

    .line 553
    .line 554
    .line 555
    move-result v10

    .line 556
    if-eqz v10, :cond_11

    .line 557
    .line 558
    new-instance v10, Ljava/lang/StringBuilder;

    .line 559
    .line 560
    const-string v8, "Instantiate "

    .line 561
    .line 562
    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    const-string v8, " op #"

    .line 569
    .line 570
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    const-string v8, " base fragment #"

    .line 577
    .line 578
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    aget v8, v7, v16

    .line 582
    .line 583
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v8

    .line 590
    invoke-static {v11, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 591
    .line 592
    .line 593
    :cond_11
    invoke-static {}, Landroidx/lifecycle/n;->values()[Landroidx/lifecycle/n;

    .line 594
    .line 595
    .line 596
    move-result-object v8

    .line 597
    iget-object v10, v4, Landroidx/fragment/app/BackStackRecordState;->h:[I

    .line 598
    .line 599
    aget v10, v10, v14

    .line 600
    .line 601
    aget-object v8, v8, v10

    .line 602
    .line 603
    iput-object v8, v15, Landroidx/fragment/app/b1;->h:Landroidx/lifecycle/n;

    .line 604
    .line 605
    invoke-static {}, Landroidx/lifecycle/n;->values()[Landroidx/lifecycle/n;

    .line 606
    .line 607
    .line 608
    move-result-object v8

    .line 609
    iget-object v10, v4, Landroidx/fragment/app/BackStackRecordState;->i:[I

    .line 610
    .line 611
    aget v10, v10, v14

    .line 612
    .line 613
    aget-object v8, v8, v10

    .line 614
    .line 615
    iput-object v8, v15, Landroidx/fragment/app/b1;->i:Landroidx/lifecycle/n;

    .line 616
    .line 617
    add-int/lit8 v8, v13, 0x2

    .line 618
    .line 619
    aget v10, v7, v16

    .line 620
    .line 621
    if-eqz v10, :cond_12

    .line 622
    .line 623
    move v10, v12

    .line 624
    goto :goto_9

    .line 625
    :cond_12
    const/4 v10, 0x0

    .line 626
    :goto_9
    iput-boolean v10, v15, Landroidx/fragment/app/b1;->c:Z

    .line 627
    .line 628
    add-int/lit8 v10, v13, 0x3

    .line 629
    .line 630
    aget v8, v7, v8

    .line 631
    .line 632
    iput v8, v15, Landroidx/fragment/app/b1;->d:I

    .line 633
    .line 634
    add-int/lit8 v16, v13, 0x4

    .line 635
    .line 636
    aget v10, v7, v10

    .line 637
    .line 638
    iput v10, v15, Landroidx/fragment/app/b1;->e:I

    .line 639
    .line 640
    add-int/lit8 v18, v13, 0x5

    .line 641
    .line 642
    aget v12, v7, v16

    .line 643
    .line 644
    iput v12, v15, Landroidx/fragment/app/b1;->f:I

    .line 645
    .line 646
    add-int/lit8 v13, v13, 0x6

    .line 647
    .line 648
    move-object/from16 v16, v7

    .line 649
    .line 650
    aget v7, v16, v18

    .line 651
    .line 652
    iput v7, v15, Landroidx/fragment/app/b1;->g:I

    .line 653
    .line 654
    iput v8, v6, Landroidx/fragment/app/c1;->b:I

    .line 655
    .line 656
    iput v10, v6, Landroidx/fragment/app/c1;->c:I

    .line 657
    .line 658
    iput v12, v6, Landroidx/fragment/app/c1;->d:I

    .line 659
    .line 660
    iput v7, v6, Landroidx/fragment/app/c1;->e:I

    .line 661
    .line 662
    invoke-virtual {v6, v15}, Landroidx/fragment/app/c1;->b(Landroidx/fragment/app/b1;)V

    .line 663
    .line 664
    .line 665
    add-int/lit8 v14, v14, 0x1

    .line 666
    .line 667
    move/from16 v10, p1

    .line 668
    .line 669
    move-object/from16 v7, v16

    .line 670
    .line 671
    const/4 v12, 0x1

    .line 672
    goto/16 :goto_8

    .line 673
    .line 674
    :cond_13
    move/from16 p1, v10

    .line 675
    .line 676
    iget v7, v4, Landroidx/fragment/app/BackStackRecordState;->j:I

    .line 677
    .line 678
    iput v7, v6, Landroidx/fragment/app/c1;->f:I

    .line 679
    .line 680
    iget-object v7, v4, Landroidx/fragment/app/BackStackRecordState;->k:Ljava/lang/String;

    .line 681
    .line 682
    iput-object v7, v6, Landroidx/fragment/app/c1;->h:Ljava/lang/String;

    .line 683
    .line 684
    const/4 v7, 0x1

    .line 685
    iput-boolean v7, v6, Landroidx/fragment/app/c1;->g:Z

    .line 686
    .line 687
    iget v7, v4, Landroidx/fragment/app/BackStackRecordState;->m:I

    .line 688
    .line 689
    iput v7, v6, Landroidx/fragment/app/c1;->i:I

    .line 690
    .line 691
    iget-object v7, v4, Landroidx/fragment/app/BackStackRecordState;->n:Ljava/lang/CharSequence;

    .line 692
    .line 693
    iput-object v7, v6, Landroidx/fragment/app/c1;->j:Ljava/lang/CharSequence;

    .line 694
    .line 695
    iget v7, v4, Landroidx/fragment/app/BackStackRecordState;->o:I

    .line 696
    .line 697
    iput v7, v6, Landroidx/fragment/app/c1;->k:I

    .line 698
    .line 699
    iget-object v7, v4, Landroidx/fragment/app/BackStackRecordState;->p:Ljava/lang/CharSequence;

    .line 700
    .line 701
    iput-object v7, v6, Landroidx/fragment/app/c1;->l:Ljava/lang/CharSequence;

    .line 702
    .line 703
    iget-object v7, v4, Landroidx/fragment/app/BackStackRecordState;->q:Ljava/util/ArrayList;

    .line 704
    .line 705
    iput-object v7, v6, Landroidx/fragment/app/c1;->m:Ljava/util/ArrayList;

    .line 706
    .line 707
    iget-object v7, v4, Landroidx/fragment/app/BackStackRecordState;->r:Ljava/util/ArrayList;

    .line 708
    .line 709
    iput-object v7, v6, Landroidx/fragment/app/c1;->n:Ljava/util/ArrayList;

    .line 710
    .line 711
    iget-boolean v7, v4, Landroidx/fragment/app/BackStackRecordState;->s:Z

    .line 712
    .line 713
    iput-boolean v7, v6, Landroidx/fragment/app/c1;->o:Z

    .line 714
    .line 715
    iget v4, v4, Landroidx/fragment/app/BackStackRecordState;->l:I

    .line 716
    .line 717
    iput v4, v6, Landroidx/fragment/app/a;->r:I

    .line 718
    .line 719
    const/4 v4, 0x0

    .line 720
    :goto_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 721
    .line 722
    .line 723
    move-result v7

    .line 724
    if-ge v4, v7, :cond_15

    .line 725
    .line 726
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v7

    .line 730
    check-cast v7, Ljava/lang/String;

    .line 731
    .line 732
    if-eqz v7, :cond_14

    .line 733
    .line 734
    iget-object v8, v6, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 735
    .line 736
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v8

    .line 740
    check-cast v8, Landroidx/fragment/app/b1;

    .line 741
    .line 742
    invoke-virtual {v3, v7}, Landroidx/fragment/app/a1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 743
    .line 744
    .line 745
    move-result-object v7

    .line 746
    iput-object v7, v8, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 747
    .line 748
    :cond_14
    add-int/lit8 v4, v4, 0x1

    .line 749
    .line 750
    goto :goto_a

    .line 751
    :cond_15
    const/4 v7, 0x1

    .line 752
    invoke-virtual {v6, v7}, Landroidx/fragment/app/a;->d(I)V

    .line 753
    .line 754
    .line 755
    invoke-static/range {p1 .. p1}, Landroidx/fragment/app/u0;->G(I)Z

    .line 756
    .line 757
    .line 758
    move-result v4

    .line 759
    if-eqz v4, :cond_16

    .line 760
    .line 761
    new-instance v4, Ljava/lang/StringBuilder;

    .line 762
    .line 763
    const-string v5, "restoreAllState: back stack #"

    .line 764
    .line 765
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 769
    .line 770
    .line 771
    const-string v5, " (index "

    .line 772
    .line 773
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 774
    .line 775
    .line 776
    iget v5, v6, Landroidx/fragment/app/a;->r:I

    .line 777
    .line 778
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v4

    .line 791
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 792
    .line 793
    .line 794
    new-instance v4, Landroidx/fragment/app/m1;

    .line 795
    .line 796
    invoke-direct {v4}, Landroidx/fragment/app/m1;-><init>()V

    .line 797
    .line 798
    .line 799
    new-instance v5, Ljava/io/PrintWriter;

    .line 800
    .line 801
    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 802
    .line 803
    .line 804
    const-string v4, "  "

    .line 805
    .line 806
    const/4 v8, 0x0

    .line 807
    invoke-virtual {v6, v4, v5, v8}, Landroidx/fragment/app/a;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 811
    .line 812
    .line 813
    goto :goto_b

    .line 814
    :cond_16
    const/4 v8, 0x0

    .line 815
    :goto_b
    iget-object v4, v0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 816
    .line 817
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    add-int/lit8 v2, v2, 0x1

    .line 821
    .line 822
    move/from16 v10, p1

    .line 823
    .line 824
    move v12, v7

    .line 825
    goto/16 :goto_7

    .line 826
    .line 827
    :cond_17
    const/4 v8, 0x0

    .line 828
    goto :goto_c

    .line 829
    :cond_18
    const/4 v8, 0x0

    .line 830
    const/4 v2, 0x0

    .line 831
    iput-object v2, v0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 832
    .line 833
    :goto_c
    iget-object v2, v0, Landroidx/fragment/app/u0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 834
    .line 835
    iget v4, v1, Landroidx/fragment/app/FragmentManagerState;->i:I

    .line 836
    .line 837
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 838
    .line 839
    .line 840
    iget-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->j:Ljava/lang/String;

    .line 841
    .line 842
    if-eqz v2, :cond_19

    .line 843
    .line 844
    invoke-virtual {v3, v2}, Landroidx/fragment/app/a1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    iput-object v2, v0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/Fragment;

    .line 849
    .line 850
    invoke-virtual {v0, v2}, Landroidx/fragment/app/u0;->q(Landroidx/fragment/app/Fragment;)V

    .line 851
    .line 852
    .line 853
    :cond_19
    iget-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->k:Ljava/util/ArrayList;

    .line 854
    .line 855
    if-eqz v2, :cond_1a

    .line 856
    .line 857
    :goto_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 858
    .line 859
    .line 860
    move-result v3

    .line 861
    if-ge v8, v3, :cond_1a

    .line 862
    .line 863
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v3

    .line 867
    check-cast v3, Ljava/lang/String;

    .line 868
    .line 869
    iget-object v4, v1, Landroidx/fragment/app/FragmentManagerState;->l:Ljava/util/ArrayList;

    .line 870
    .line 871
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v4

    .line 875
    check-cast v4, Landroidx/fragment/app/BackStackState;

    .line 876
    .line 877
    iget-object v5, v0, Landroidx/fragment/app/u0;->j:Ljava/util/Map;

    .line 878
    .line 879
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    add-int/lit8 v8, v8, 0x1

    .line 883
    .line 884
    goto :goto_d

    .line 885
    :cond_1a
    new-instance v2, Ljava/util/ArrayDeque;

    .line 886
    .line 887
    iget-object v1, v1, Landroidx/fragment/app/FragmentManagerState;->m:Ljava/util/ArrayList;

    .line 888
    .line 889
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 890
    .line 891
    .line 892
    iput-object v2, v0, Landroidx/fragment/app/u0;->C:Ljava/util/ArrayDeque;

    .line 893
    .line 894
    return-void
.end method

.method public final S()Landroid/os/Bundle;
    .locals 15

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e()Ljava/util/HashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroidx/fragment/app/l;

    .line 27
    .line 28
    iget-boolean v5, v2, Landroidx/fragment/app/l;->e:Z

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-static {v4}, Landroidx/fragment/app/u0;->G(I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    const-string v4, "FragmentManager"

    .line 39
    .line 40
    const-string v5, "SpecialEffectsController: Forcing postponed operations"

    .line 41
    .line 42
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_1
    iput-boolean v3, v2, Landroidx/fragment/app/l;->e:Z

    .line 46
    .line 47
    invoke-virtual {v2}, Landroidx/fragment/app/l;->d()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e()Ljava/util/HashSet;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Landroidx/fragment/app/l;

    .line 70
    .line 71
    invoke-virtual {v2}, Landroidx/fragment/app/l;->g()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const/4 v1, 0x1

    .line 76
    invoke-virtual {p0, v1}, Landroidx/fragment/app/u0;->x(Z)Z

    .line 77
    .line 78
    .line 79
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->E:Z

    .line 80
    .line 81
    iget-object v2, p0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 82
    .line 83
    iput-boolean v1, v2, Landroidx/fragment/app/w0;->i:Z

    .line 84
    .line 85
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v2, Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v1, v1, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_5

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    check-cast v5, Landroidx/fragment/app/z0;

    .line 122
    .line 123
    if-eqz v5, :cond_4

    .line 124
    .line 125
    iget-object v6, v5, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 126
    .line 127
    invoke-virtual {v5}, Landroidx/fragment/app/z0;->m()V

    .line 128
    .line 129
    .line 130
    iget-object v5, v6, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    invoke-static {v4}, Landroidx/fragment/app/u0;->G(I)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_4

    .line 140
    .line 141
    const-string v5, "FragmentManager"

    .line 142
    .line 143
    new-instance v7, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v8, "Saved state of "

    .line 146
    .line 147
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v8, ": "

    .line 154
    .line 155
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    iget-object v6, v6, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    .line 159
    .line 160
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v5, Ljava/util/ArrayList;

    .line 177
    .line 178
    iget-object v1, v1, Landroidx/fragment/app/a1;->h:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Ljava/util/HashMap;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_6

    .line 194
    .line 195
    invoke-static {v4}, Landroidx/fragment/app/u0;->G(I)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_f

    .line 200
    .line 201
    const-string v1, "FragmentManager"

    .line 202
    .line 203
    const-string v2, "saveAllState: no fragments!"

    .line 204
    .line 205
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    return-object v0

    .line 209
    :cond_6
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 210
    .line 211
    iget-object v6, v1, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v6, Ljava/util/ArrayList;

    .line 214
    .line 215
    monitor-enter v6

    .line 216
    :try_start_0
    iget-object v7, v1, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v7, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    const/4 v8, 0x0

    .line 225
    if-eqz v7, :cond_7

    .line 226
    .line 227
    monitor-exit v6

    .line 228
    move-object v7, v8

    .line 229
    goto :goto_4

    .line 230
    :catchall_0
    move-exception v0

    .line 231
    goto/16 :goto_8

    .line 232
    .line 233
    :cond_7
    new-instance v7, Ljava/util/ArrayList;

    .line 234
    .line 235
    iget-object v9, v1, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v9, Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 244
    .line 245
    .line 246
    iget-object v1, v1, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v1, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    move v10, v3

    .line 255
    :cond_8
    :goto_3
    if-ge v10, v9, :cond_9

    .line 256
    .line 257
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    add-int/lit8 v10, v10, 0x1

    .line 262
    .line 263
    check-cast v11, Landroidx/fragment/app/Fragment;

    .line 264
    .line 265
    iget-object v12, v11, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    invoke-static {v4}, Landroidx/fragment/app/u0;->G(I)Z

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    if-eqz v12, :cond_8

    .line 275
    .line 276
    const-string v12, "FragmentManager"

    .line 277
    .line 278
    new-instance v13, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 281
    .line 282
    .line 283
    const-string v14, "saveAllState: adding fragment ("

    .line 284
    .line 285
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    iget-object v14, v11, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    const-string v14, "): "

    .line 294
    .line 295
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v11

    .line 305
    invoke-static {v12, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 306
    .line 307
    .line 308
    goto :goto_3

    .line 309
    :cond_9
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 310
    :goto_4
    iget-object v1, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 311
    .line 312
    if-eqz v1, :cond_b

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-lez v1, :cond_b

    .line 319
    .line 320
    new-array v6, v1, [Landroidx/fragment/app/BackStackRecordState;

    .line 321
    .line 322
    move v9, v3

    .line 323
    :goto_5
    if-ge v9, v1, :cond_c

    .line 324
    .line 325
    new-instance v10, Landroidx/fragment/app/BackStackRecordState;

    .line 326
    .line 327
    iget-object v11, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 328
    .line 329
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v11

    .line 333
    check-cast v11, Landroidx/fragment/app/a;

    .line 334
    .line 335
    invoke-direct {v10, v11}, Landroidx/fragment/app/BackStackRecordState;-><init>(Landroidx/fragment/app/a;)V

    .line 336
    .line 337
    .line 338
    aput-object v10, v6, v9

    .line 339
    .line 340
    invoke-static {v4}, Landroidx/fragment/app/u0;->G(I)Z

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    if-eqz v10, :cond_a

    .line 345
    .line 346
    const-string v10, "FragmentManager"

    .line 347
    .line 348
    new-instance v11, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    const-string v12, "saveAllState: adding back stack #"

    .line 351
    .line 352
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    const-string v12, ": "

    .line 359
    .line 360
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    iget-object v12, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 364
    .line 365
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v12

    .line 369
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v11

    .line 376
    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 377
    .line 378
    .line 379
    :cond_a
    add-int/lit8 v9, v9, 0x1

    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_b
    move-object v6, v8

    .line 383
    :cond_c
    new-instance v1, Landroidx/fragment/app/FragmentManagerState;

    .line 384
    .line 385
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 386
    .line 387
    .line 388
    iput-object v8, v1, Landroidx/fragment/app/FragmentManagerState;->j:Ljava/lang/String;

    .line 389
    .line 390
    new-instance v4, Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 393
    .line 394
    .line 395
    iput-object v4, v1, Landroidx/fragment/app/FragmentManagerState;->k:Ljava/util/ArrayList;

    .line 396
    .line 397
    new-instance v8, Ljava/util/ArrayList;

    .line 398
    .line 399
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 400
    .line 401
    .line 402
    iput-object v8, v1, Landroidx/fragment/app/FragmentManagerState;->l:Ljava/util/ArrayList;

    .line 403
    .line 404
    iput-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->f:Ljava/util/ArrayList;

    .line 405
    .line 406
    iput-object v7, v1, Landroidx/fragment/app/FragmentManagerState;->g:Ljava/util/ArrayList;

    .line 407
    .line 408
    iput-object v6, v1, Landroidx/fragment/app/FragmentManagerState;->h:[Landroidx/fragment/app/BackStackRecordState;

    .line 409
    .line 410
    iget-object v2, p0, Landroidx/fragment/app/u0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    iput v2, v1, Landroidx/fragment/app/FragmentManagerState;->i:I

    .line 417
    .line 418
    iget-object v2, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/Fragment;

    .line 419
    .line 420
    if-eqz v2, :cond_d

    .line 421
    .line 422
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 423
    .line 424
    iput-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->j:Ljava/lang/String;

    .line 425
    .line 426
    :cond_d
    iget-object v2, p0, Landroidx/fragment/app/u0;->j:Ljava/util/Map;

    .line 427
    .line 428
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 433
    .line 434
    .line 435
    iget-object v2, p0, Landroidx/fragment/app/u0;->j:Ljava/util/Map;

    .line 436
    .line 437
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 442
    .line 443
    .line 444
    new-instance v2, Ljava/util/ArrayList;

    .line 445
    .line 446
    iget-object v4, p0, Landroidx/fragment/app/u0;->C:Ljava/util/ArrayDeque;

    .line 447
    .line 448
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 449
    .line 450
    .line 451
    iput-object v2, v1, Landroidx/fragment/app/FragmentManagerState;->m:Ljava/util/ArrayList;

    .line 452
    .line 453
    const-string v2, "state"

    .line 454
    .line 455
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 456
    .line 457
    .line 458
    iget-object v1, p0, Landroidx/fragment/app/u0;->k:Ljava/util/Map;

    .line 459
    .line 460
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    if-eqz v2, :cond_e

    .line 473
    .line 474
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    check-cast v2, Ljava/lang/String;

    .line 479
    .line 480
    new-instance v4, Ljava/lang/StringBuilder;

    .line 481
    .line 482
    const-string v6, "result_"

    .line 483
    .line 484
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    iget-object v6, p0, Landroidx/fragment/app/u0;->k:Ljava/util/Map;

    .line 495
    .line 496
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    check-cast v2, Landroid/os/Bundle;

    .line 501
    .line 502
    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 503
    .line 504
    .line 505
    goto :goto_6

    .line 506
    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    :goto_7
    if-ge v3, v1, :cond_f

    .line 511
    .line 512
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    add-int/lit8 v3, v3, 0x1

    .line 517
    .line 518
    check-cast v2, Landroidx/fragment/app/FragmentState;

    .line 519
    .line 520
    new-instance v4, Landroid/os/Bundle;

    .line 521
    .line 522
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 523
    .line 524
    .line 525
    const-string v6, "state"

    .line 526
    .line 527
    invoke-virtual {v4, v6, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 528
    .line 529
    .line 530
    new-instance v6, Ljava/lang/StringBuilder;

    .line 531
    .line 532
    const-string v7, "fragment_"

    .line 533
    .line 534
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    iget-object v2, v2, Landroidx/fragment/app/FragmentState;->g:Ljava/lang/String;

    .line 538
    .line 539
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    invoke-virtual {v0, v2, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 547
    .line 548
    .line 549
    goto :goto_7

    .line 550
    :cond_f
    return-object v0

    .line 551
    :goto_8
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 552
    throw v0
.end method

.method public final T()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 14
    .line 15
    iget-object v1, v1, Landroidx/fragment/app/h0;->h:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/fragment/app/u0;->M:Landroidx/fragment/app/f;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 23
    .line 24
    iget-object v1, v1, Landroidx/fragment/app/h0;->h:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/fragment/app/u0;->M:Landroidx/fragment/app/f;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->a0()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v1
.end method

.method public final U(Landroidx/fragment/app/Fragment;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->C(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    .line 12
    .line 13
    xor-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final V(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/n;)V
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroidx/fragment/app/a1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mHost:Landroidx/fragment/app/h0;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/u0;

    .line 20
    .line 21
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mMaxState:Landroidx/lifecycle/n;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p2, "Fragment "

    .line 27
    .line 28
    const-string v0, " is not an active fragment of FragmentManager "

    .line 29
    .line 30
    invoke-static {p2, p1, v0, p0}, Landroidx/fragment/app/q;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final W(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroidx/fragment/app/a1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mHost:Landroidx/fragment/app/h0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/u0;

    .line 22
    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "Fragment "

    .line 27
    .line 28
    const-string v1, " is not an active fragment of FragmentManager "

    .line 29
    .line 30
    invoke-static {v0, p1, v1, p0}, Landroidx/fragment/app/q;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/Fragment;

    .line 35
    .line 36
    iput-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/Fragment;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroidx/fragment/app/u0;->q(Landroidx/fragment/app/Fragment;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/Fragment;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->q(Landroidx/fragment/app/Fragment;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final X(Landroidx/fragment/app/Fragment;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->C(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getEnterAnim()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getExitAnim()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/2addr v2, v1

    .line 16
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getPopEnterAnim()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/2addr v1, v2

    .line 21
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getPopExitAnim()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v1

    .line 26
    if-lez v2, :cond_1

    .line 27
    .line 28
    const v1, 0x7f090244

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getPopDirection()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->setPopDirection(Z)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method

.method public final Z(Ljava/lang/IllegalStateException;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FragmentManager"

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    const-string v0, "Activity state:"

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroidx/fragment/app/m1;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/fragment/app/m1;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/io/PrintWriter;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 26
    .line 27
    const-string v3, "Failed dumping state"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const-string v6, "  "

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    :try_start_0
    new-array v4, v4, [Ljava/lang/String;

    .line 36
    .line 37
    check-cast v0, Landroidx/fragment/app/d0;

    .line 38
    .line 39
    iget-object v0, v0, Landroidx/fragment/app/d0;->j:Le/j;

    .line 40
    .line 41
    invoke-virtual {v0, v6, v5, v2, v4}, Landroidx/fragment/app/e0;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0, v6, v5, v2, v0}, Landroidx/fragment/app/u0;->u(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_1
    move-exception v0

    .line 57
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    :goto_0
    throw p1
.end method

.method public final a(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/z0;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mPreviousWho:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v0}, Ld1/c;->c(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Landroidx/fragment/app/u0;->G(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "add: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "FragmentManager"

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->f(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/z0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object p0, p1, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/u0;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroidx/fragment/app/a1;->g(Landroidx/fragment/app/z0;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 46
    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Landroidx/fragment/app/a1;->a(Landroidx/fragment/app/Fragment;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 54
    .line 55
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mHiddenChanged:Z

    .line 60
    .line 61
    :cond_2
    invoke-static {p1}, Landroidx/fragment/app/u0;->H(Landroidx/fragment/app/Fragment;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    const/4 p1, 0x1

    .line 68
    iput-boolean p1, p0, Landroidx/fragment/app/u0;->D:Z

    .line 69
    .line 70
    :cond_3
    return-object v0
.end method

.method public final a0()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/m0;

    .line 14
    .line 15
    iput-boolean v2, v1, Landroidx/fragment/app/m0;->a:Z

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/fragment/app/m0;->c:Landroidx/activity/i0;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Lq3/a;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object v0, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/m0;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move v1, v3

    .line 42
    :goto_0
    if-lez v1, :cond_3

    .line 43
    .line 44
    iget-object v1, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 45
    .line 46
    invoke-static {v1}, Landroidx/fragment/app/u0;->J(Landroidx/fragment/app/Fragment;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v2, v3

    .line 54
    :goto_1
    iput-boolean v2, v0, Landroidx/fragment/app/m0;->a:Z

    .line 55
    .line 56
    iget-object v0, v0, Landroidx/fragment/app/m0;->c:Landroidx/activity/i0;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-interface {v0}, Lq3/a;->a()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_4
    return-void

    .line 64
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v1
.end method

.method public final b(Landroidx/fragment/app/h0;Landroidx/fragment/app/g0;Landroidx/fragment/app/Fragment;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/fragment/app/u0;->u:Landroidx/fragment/app/g0;

    .line 8
    .line 9
    iput-object p3, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/fragment/app/u0;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroidx/fragment/app/q0;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Landroidx/fragment/app/q0;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of v0, p1, Landroidx/fragment/app/x0;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    check-cast v0, Landroidx/fragment/app/x0;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object p2, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 35
    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->a0()V

    .line 39
    .line 40
    .line 41
    :cond_2
    instance-of p2, p1, Landroidx/activity/k0;

    .line 42
    .line 43
    if-eqz p2, :cond_4

    .line 44
    .line 45
    move-object p2, p1

    .line 46
    check-cast p2, Landroidx/activity/k0;

    .line 47
    .line 48
    invoke-interface {p2}, Landroidx/activity/k0;->a()Landroidx/activity/j0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Landroidx/fragment/app/u0;->g:Landroidx/activity/j0;

    .line 53
    .line 54
    if-eqz p3, :cond_3

    .line 55
    .line 56
    move-object p2, p3

    .line 57
    :cond_3
    iget-object v1, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/m0;

    .line 58
    .line 59
    invoke-virtual {v0, p2, v1}, Landroidx/activity/j0;->a(Landroidx/lifecycle/t;Landroidx/fragment/app/m0;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    const/4 p2, 0x0

    .line 63
    if-eqz p3, :cond_6

    .line 64
    .line 65
    iget-object p1, p3, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/u0;

    .line 66
    .line 67
    iget-object p1, p1, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 68
    .line 69
    iget-object v0, p1, Landroidx/fragment/app/w0;->e:Ljava/util/HashMap;

    .line 70
    .line 71
    iget-object v1, p3, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Landroidx/fragment/app/w0;

    .line 78
    .line 79
    if-nez v1, :cond_5

    .line 80
    .line 81
    new-instance v1, Landroidx/fragment/app/w0;

    .line 82
    .line 83
    iget-boolean p1, p1, Landroidx/fragment/app/w0;->g:Z

    .line 84
    .line 85
    invoke-direct {v1, p1}, Landroidx/fragment/app/w0;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p3, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_5
    iput-object v1, p0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_6
    instance-of v0, p1, Landroidx/lifecycle/u0;

    .line 97
    .line 98
    if-eqz v0, :cond_8

    .line 99
    .line 100
    check-cast p1, Landroidx/lifecycle/u0;

    .line 101
    .line 102
    invoke-interface {p1}, Landroidx/lifecycle/u0;->getViewModelStore()Landroidx/lifecycle/t0;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance v0, Landroidx/emoji2/text/t;

    .line 107
    .line 108
    sget-object v1, Landroidx/fragment/app/w0;->j:Landroidx/fragment/app/p0;

    .line 109
    .line 110
    invoke-direct {v0, p1, v1}, Landroidx/emoji2/text/t;-><init>(Landroidx/lifecycle/t0;Landroidx/lifecycle/s0;)V

    .line 111
    .line 112
    .line 113
    const-class p1, Landroidx/fragment/app/w0;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-eqz v1, :cond_7

    .line 120
    .line 121
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 122
    .line 123
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1, p1}, Landroidx/emoji2/text/t;->e(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/p0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Landroidx/fragment/app/w0;

    .line 132
    .line 133
    iput-object p1, p0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    const-string p1, "Local and anonymous classes can not be ViewModels"

    .line 137
    .line 138
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_8
    new-instance p1, Landroidx/fragment/app/w0;

    .line 143
    .line 144
    invoke-direct {p1, p2}, Landroidx/fragment/app/w0;-><init>(Z)V

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 148
    .line 149
    :goto_1
    iget-object p1, p0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 150
    .line 151
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->E:Z

    .line 152
    .line 153
    if-nez v0, :cond_9

    .line 154
    .line 155
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->F:Z

    .line 156
    .line 157
    if-eqz v0, :cond_a

    .line 158
    .line 159
    :cond_9
    const/4 p2, 0x1

    .line 160
    :cond_a
    iput-boolean p2, p1, Landroidx/fragment/app/w0;->i:Z

    .line 161
    .line 162
    iget-object p2, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 163
    .line 164
    iput-object p1, p2, Landroidx/fragment/app/a1;->i:Ljava/lang/Object;

    .line 165
    .line 166
    iget-object p1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 167
    .line 168
    instance-of p2, p1, Ll1/e;

    .line 169
    .line 170
    if-eqz p2, :cond_b

    .line 171
    .line 172
    if-nez p3, :cond_b

    .line 173
    .line 174
    check-cast p1, Ll1/e;

    .line 175
    .line 176
    invoke-interface {p1}, Ll1/e;->getSavedStateRegistry()Ll1/c;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance p2, Landroidx/activity/f;

    .line 181
    .line 182
    const/4 v0, 0x2

    .line 183
    invoke-direct {p2, v0, p0}, Landroidx/activity/f;-><init>(ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    const-string v0, "android:support:fragments"

    .line 187
    .line 188
    invoke-virtual {p1, v0, p2}, Ll1/c;->c(Ljava/lang/String;Ll1/b;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v0}, Ll1/c;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-eqz p1, :cond_b

    .line 196
    .line 197
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->R(Landroid/os/Parcelable;)V

    .line 198
    .line 199
    .line 200
    :cond_b
    iget-object p1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 201
    .line 202
    instance-of p2, p1, Lb/i;

    .line 203
    .line 204
    if-eqz p2, :cond_d

    .line 205
    .line 206
    check-cast p1, Lb/i;

    .line 207
    .line 208
    invoke-interface {p1}, Lb/i;->j()Lb/h;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    if-eqz p3, :cond_c

    .line 213
    .line 214
    new-instance p2, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    iget-object v0, p3, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v0, ":"

    .line 225
    .line 226
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    goto :goto_2

    .line 234
    :cond_c
    const-string p2, ""

    .line 235
    .line 236
    :goto_2
    const-string v0, "FragmentManager:"

    .line 237
    .line 238
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    const-string v0, "StartActivityForResult"

    .line 243
    .line 244
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    new-instance v1, Landroidx/fragment/app/r0;

    .line 249
    .line 250
    const/4 v2, 0x3

    .line 251
    invoke-direct {v1, v2}, Landroidx/fragment/app/r0;-><init>(I)V

    .line 252
    .line 253
    .line 254
    new-instance v2, Landroidx/fragment/app/l0;

    .line 255
    .line 256
    const/4 v3, 0x1

    .line 257
    invoke-direct {v2, p0, v3}, Landroidx/fragment/app/l0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, v0, v1, v2}, Lb/h;->d(Ljava/lang/String;Lc/a;Lb/b;)Lb/g;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    iput-object v0, p0, Landroidx/fragment/app/u0;->z:Lb/g;

    .line 265
    .line 266
    const-string v0, "StartIntentSenderForResult"

    .line 267
    .line 268
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    new-instance v1, Landroidx/fragment/app/r0;

    .line 273
    .line 274
    const/4 v2, 0x0

    .line 275
    invoke-direct {v1, v2}, Landroidx/fragment/app/r0;-><init>(I)V

    .line 276
    .line 277
    .line 278
    new-instance v2, Landroidx/fragment/app/l0;

    .line 279
    .line 280
    const/4 v3, 0x2

    .line 281
    invoke-direct {v2, p0, v3}, Landroidx/fragment/app/l0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1, v0, v1, v2}, Lb/h;->d(Ljava/lang/String;Lc/a;Lb/b;)Lb/g;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iput-object v0, p0, Landroidx/fragment/app/u0;->A:Lb/g;

    .line 289
    .line 290
    const-string v0, "RequestPermissions"

    .line 291
    .line 292
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p2

    .line 296
    new-instance v0, Landroidx/fragment/app/r0;

    .line 297
    .line 298
    const/4 v1, 0x1

    .line 299
    invoke-direct {v0, v1}, Landroidx/fragment/app/r0;-><init>(I)V

    .line 300
    .line 301
    .line 302
    new-instance v1, Landroidx/fragment/app/l0;

    .line 303
    .line 304
    const/4 v2, 0x0

    .line 305
    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/l0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1, p2, v0, v1}, Lb/h;->d(Ljava/lang/String;Lc/a;Lb/b;)Lb/g;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    iput-object p1, p0, Landroidx/fragment/app/u0;->B:Lb/g;

    .line 313
    .line 314
    :cond_d
    iget-object p1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 315
    .line 316
    instance-of p2, p1, Lc0/e;

    .line 317
    .line 318
    if-eqz p2, :cond_e

    .line 319
    .line 320
    check-cast p1, Lc0/e;

    .line 321
    .line 322
    iget-object p2, p0, Landroidx/fragment/app/u0;->n:Landroidx/fragment/app/k0;

    .line 323
    .line 324
    invoke-interface {p1, p2}, Lc0/e;->c(Lo0/a;)V

    .line 325
    .line 326
    .line 327
    :cond_e
    iget-object p1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 328
    .line 329
    instance-of p2, p1, Lc0/f;

    .line 330
    .line 331
    if-eqz p2, :cond_f

    .line 332
    .line 333
    check-cast p1, Lc0/f;

    .line 334
    .line 335
    iget-object p2, p0, Landroidx/fragment/app/u0;->o:Landroidx/fragment/app/k0;

    .line 336
    .line 337
    invoke-interface {p1, p2}, Lc0/f;->k(Lo0/a;)V

    .line 338
    .line 339
    .line 340
    :cond_f
    iget-object p1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 341
    .line 342
    instance-of p2, p1, Lb0/o;

    .line 343
    .line 344
    if-eqz p2, :cond_10

    .line 345
    .line 346
    check-cast p1, Lb0/o;

    .line 347
    .line 348
    iget-object p2, p0, Landroidx/fragment/app/u0;->p:Landroidx/fragment/app/k0;

    .line 349
    .line 350
    invoke-interface {p1, p2}, Lb0/o;->f(Lo0/a;)V

    .line 351
    .line 352
    .line 353
    :cond_10
    iget-object p1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 354
    .line 355
    instance-of p2, p1, Lb0/p;

    .line 356
    .line 357
    if-eqz p2, :cond_11

    .line 358
    .line 359
    check-cast p1, Lb0/p;

    .line 360
    .line 361
    iget-object p2, p0, Landroidx/fragment/app/u0;->q:Landroidx/fragment/app/k0;

    .line 362
    .line 363
    invoke-interface {p1, p2}, Lb0/p;->m(Lo0/a;)V

    .line 364
    .line 365
    .line 366
    :cond_11
    iget-object p1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 367
    .line 368
    instance-of p2, p1, Lp0/l;

    .line 369
    .line 370
    if-eqz p2, :cond_12

    .line 371
    .line 372
    if-nez p3, :cond_12

    .line 373
    .line 374
    check-cast p1, Lp0/l;

    .line 375
    .line 376
    iget-object p2, p0, Landroidx/fragment/app/u0;->r:Landroidx/fragment/app/n0;

    .line 377
    .line 378
    invoke-interface {p1, p2}, Lp0/l;->d(Landroidx/fragment/app/n0;)V

    .line 379
    .line 380
    .line 381
    :cond_12
    return-void

    .line 382
    :cond_13
    const-string p1, "Already attached"

    .line 383
    .line 384
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    return-void
.end method

.method public final c(Landroidx/fragment/app/Fragment;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->G(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "attach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Landroidx/fragment/app/a1;->a(Landroidx/fragment/app/Fragment;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Landroidx/fragment/app/u0;->G(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "add from attach: "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/u0;->H(Landroidx/fragment/app/Fragment;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, Landroidx/fragment/app/u0;->D:Z

    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/u0;->J:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/fragment/app/u0;->I:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroidx/fragment/app/a1;->d()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    check-cast v4, Landroidx/fragment/app/z0;

    .line 26
    .line 27
    iget-object v4, v4, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    iget-object v4, v4, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->E()Landroidx/fragment/app/p0;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {v4, v5}, Landroidx/fragment/app/l;->h(Landroid/view/ViewGroup;Landroidx/fragment/app/p0;)Landroidx/fragment/app/l;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-object v0
.end method

.method public final f(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/z0;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/fragment/app/z0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Landroidx/fragment/app/z0;

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/fragment/app/u0;->l:Landroidx/fragment/app/e;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/z0;-><init>(Landroidx/fragment/app/e;Landroidx/fragment/app/a1;Landroidx/fragment/app/Fragment;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 26
    .line 27
    iget-object p1, p1, Landroidx/fragment/app/h0;->g:Le/j;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Landroidx/fragment/app/z0;->k(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Landroidx/fragment/app/u0;->s:I

    .line 37
    .line 38
    iput p1, v0, Landroidx/fragment/app/z0;->e:I

    .line 39
    .line 40
    return-object v0
.end method

.method public final g(Landroidx/fragment/app/Fragment;)V
    .locals 4

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1}, Landroidx/fragment/app/u0;->G(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "detach: "

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v2, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 28
    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 33
    .line 34
    iget-boolean v3, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-static {v1}, Landroidx/fragment/app/u0;->G(I)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "remove from detach: "

    .line 47
    .line 48
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 62
    .line 63
    iget-object v1, v0, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    monitor-enter v1

    .line 68
    :try_start_0
    iget-object v0, v0, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->mAdded:Z

    .line 78
    .line 79
    invoke-static {p1}, Landroidx/fragment/app/u0;->H(Landroidx/fragment/app/Fragment;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iput-boolean v2, p0, Landroidx/fragment/app/u0;->D:Z

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->X(Landroidx/fragment/app/Fragment;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1

    .line 94
    :cond_3
    return-void
.end method

.method public final h(ZLandroid/content/res/Configuration;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 4
    .line 5
    instance-of v0, v0, Lc0/e;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string p2, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->Z(Ljava/lang/IllegalStateException;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, p2}, Landroidx/fragment/app/Fragment;->performConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/u0;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-virtual {v1, v2, p2}, Landroidx/fragment/app/u0;->h(ZLandroid/content/res/Configuration;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    return-void
.end method

.method public final i(Landroid/view/MenuItem;)Z
    .locals 4

    .line 1
    iget v0, p0, Landroidx/fragment/app/u0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3, p1}, Landroidx/fragment/app/Fragment;->performContextItemSelected(Landroid/view/MenuItem;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    return v2

    .line 39
    :cond_2
    return v1
.end method

.method public final j(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 7

    .line 1
    iget v0, p0, Landroidx/fragment/app/u0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_3

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->isMenuVisible()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    invoke-virtual {v5, p1, p2}, Landroidx/fragment/app/Fragment;->performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    new-instance v3, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move v4, v2

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 59
    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    :goto_1
    iget-object p1, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-ge v1, p1, :cond_6

    .line 69
    .line 70
    iget-object p1, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 77
    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_5

    .line 85
    .line 86
    :cond_4
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->onDestroyOptionsMenu()V

    .line 87
    .line 88
    .line 89
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_6
    iput-object v3, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 93
    .line 94
    return v4
.end method

.method public final k()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->G:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/u0;->x(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e()Ljava/util/HashSet;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroidx/fragment/app/l;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroidx/fragment/app/l;->g()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 32
    .line 33
    instance-of v2, v1, Landroidx/lifecycle/u0;

    .line 34
    .line 35
    iget-object v3, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget-object v0, v3, Landroidx/fragment/app/a1;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Landroidx/fragment/app/w0;

    .line 42
    .line 43
    iget-boolean v0, v0, Landroidx/fragment/app/w0;->h:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/h0;->g:Le/j;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    xor-int/2addr v0, v1

    .line 55
    :cond_2
    :goto_1
    if-eqz v0, :cond_5

    .line 56
    .line 57
    iget-object v0, p0, Landroidx/fragment/app/u0;->j:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Landroidx/fragment/app/BackStackState;

    .line 78
    .line 79
    iget-object v1, v1, Landroidx/fragment/app/BackStackState;->f:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const/4 v4, 0x0

    .line 86
    :goto_2
    if-ge v4, v2, :cond_3

    .line 87
    .line 88
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    add-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    check-cast v5, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v6, v3, Landroidx/fragment/app/a1;->i:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v6, Landroidx/fragment/app/w0;

    .line 99
    .line 100
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const/4 v7, 0x3

    .line 104
    invoke-static {v7}, Landroidx/fragment/app/u0;->G(I)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_4

    .line 109
    .line 110
    new-instance v7, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v8, "Clearing non-config state for saved state of Fragment "

    .line 113
    .line 114
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    const-string v8, "FragmentManager"

    .line 125
    .line 126
    invoke-static {v8, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    :cond_4
    invoke-virtual {v6, v5}, Landroidx/fragment/app/w0;->e(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    const/4 v0, -0x1

    .line 134
    invoke-virtual {p0, v0}, Landroidx/fragment/app/u0;->t(I)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 138
    .line 139
    instance-of v1, v0, Lc0/f;

    .line 140
    .line 141
    if-eqz v1, :cond_6

    .line 142
    .line 143
    check-cast v0, Lc0/f;

    .line 144
    .line 145
    iget-object v1, p0, Landroidx/fragment/app/u0;->o:Landroidx/fragment/app/k0;

    .line 146
    .line 147
    invoke-interface {v0, v1}, Lc0/f;->l(Lo0/a;)V

    .line 148
    .line 149
    .line 150
    :cond_6
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 151
    .line 152
    instance-of v1, v0, Lc0/e;

    .line 153
    .line 154
    if-eqz v1, :cond_7

    .line 155
    .line 156
    check-cast v0, Lc0/e;

    .line 157
    .line 158
    iget-object v1, p0, Landroidx/fragment/app/u0;->n:Landroidx/fragment/app/k0;

    .line 159
    .line 160
    invoke-interface {v0, v1}, Lc0/e;->h(Lo0/a;)V

    .line 161
    .line 162
    .line 163
    :cond_7
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 164
    .line 165
    instance-of v1, v0, Lb0/o;

    .line 166
    .line 167
    if-eqz v1, :cond_8

    .line 168
    .line 169
    check-cast v0, Lb0/o;

    .line 170
    .line 171
    iget-object v1, p0, Landroidx/fragment/app/u0;->p:Landroidx/fragment/app/k0;

    .line 172
    .line 173
    invoke-interface {v0, v1}, Lb0/o;->g(Lo0/a;)V

    .line 174
    .line 175
    .line 176
    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 177
    .line 178
    instance-of v1, v0, Lb0/p;

    .line 179
    .line 180
    if-eqz v1, :cond_9

    .line 181
    .line 182
    check-cast v0, Lb0/p;

    .line 183
    .line 184
    iget-object v1, p0, Landroidx/fragment/app/u0;->q:Landroidx/fragment/app/k0;

    .line 185
    .line 186
    invoke-interface {v0, v1}, Lb0/p;->b(Lo0/a;)V

    .line 187
    .line 188
    .line 189
    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 190
    .line 191
    instance-of v1, v0, Lp0/l;

    .line 192
    .line 193
    if-eqz v1, :cond_a

    .line 194
    .line 195
    check-cast v0, Lp0/l;

    .line 196
    .line 197
    iget-object v1, p0, Landroidx/fragment/app/u0;->r:Landroidx/fragment/app/n0;

    .line 198
    .line 199
    invoke-interface {v0, v1}, Lp0/l;->i(Landroidx/fragment/app/n0;)V

    .line 200
    .line 201
    .line 202
    :cond_a
    const/4 v0, 0x0

    .line 203
    iput-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 204
    .line 205
    iput-object v0, p0, Landroidx/fragment/app/u0;->u:Landroidx/fragment/app/g0;

    .line 206
    .line 207
    iput-object v0, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 208
    .line 209
    iget-object v1, p0, Landroidx/fragment/app/u0;->g:Landroidx/activity/j0;

    .line 210
    .line 211
    if-eqz v1, :cond_c

    .line 212
    .line 213
    iget-object v1, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/m0;

    .line 214
    .line 215
    iget-object v1, v1, Landroidx/fragment/app/m0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_b

    .line 226
    .line 227
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, Landroidx/activity/c;

    .line 232
    .line 233
    invoke-interface {v2}, Landroidx/activity/c;->cancel()V

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_b
    iput-object v0, p0, Landroidx/fragment/app/u0;->g:Landroidx/activity/j0;

    .line 238
    .line 239
    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/u0;->z:Lb/g;

    .line 240
    .line 241
    if-eqz v0, :cond_d

    .line 242
    .line 243
    invoke-virtual {v0}, Lb/g;->b()V

    .line 244
    .line 245
    .line 246
    iget-object v0, p0, Landroidx/fragment/app/u0;->A:Lb/g;

    .line 247
    .line 248
    invoke-virtual {v0}, Lb/g;->b()V

    .line 249
    .line 250
    .line 251
    iget-object v0, p0, Landroidx/fragment/app/u0;->B:Lb/g;

    .line 252
    .line 253
    invoke-virtual {v0}, Lb/g;->b()V

    .line 254
    .line 255
    .line 256
    :cond_d
    return-void
.end method

.method public final l(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 4
    .line 5
    instance-of v0, v0, Lc0/f;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->Z(Ljava/lang/IllegalStateException;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->performLowMemory()V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/u0;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-virtual {v1, v2}, Landroidx/fragment/app/u0;->l(Z)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    return-void
.end method

.method public final m(ZZ)V
    .locals 3

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 4
    .line 5
    instance-of v0, v0, Lb0/o;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string p2, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->Z(Ljava/lang/IllegalStateException;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->performMultiWindowModeChanged(Z)V

    .line 47
    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/u0;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-virtual {v1, p1, v2}, Landroidx/fragment/app/u0;->m(ZZ)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    return-void
.end method

.method public final n()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->e()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isHidden()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v3, v3, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/u0;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroidx/fragment/app/u0;->n()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method public final o(Landroid/view/MenuItem;)Z
    .locals 4

    .line 1
    iget v0, p0, Landroidx/fragment/app/u0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3, p1}, Landroidx/fragment/app/Fragment;->performOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    return v2

    .line 39
    :cond_2
    return v1
.end method

.method public final p(Landroid/view/Menu;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/fragment/app/u0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->performOptionsMenuClosed(Landroid/view/Menu;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :goto_1
    return-void
.end method

.method public final q(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroidx/fragment/app/a1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->performPrimaryNavigationFragmentChanged()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final r(ZZ)V
    .locals 3

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 4
    .line 5
    instance-of v0, v0, Lb0/p;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string p2, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->Z(Ljava/lang/IllegalStateException;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->performPictureInPictureModeChanged(Z)V

    .line 47
    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mChildFragmentManager:Landroidx/fragment/app/u0;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-virtual {v1, p1, v2}, Landroidx/fragment/app/u0;->r(ZZ)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    return-void
.end method

.method public final s(Landroid/view/Menu;)Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/u0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isMenuVisible()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3, p1}, Landroidx/fragment/app/Fragment;->performPrepareOptionsMenu(Landroid/view/Menu;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    move v1, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return v1
.end method

.method public final t(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 6
    .line 7
    iget-object v2, v2, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Landroidx/fragment/app/z0;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Landroidx/fragment/app/z0;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/u0;->K(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Landroidx/fragment/app/l;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroidx/fragment/app/l;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->b:Z

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Landroidx/fragment/app/u0;->x(Z)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_2
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->b:Z

    .line 72
    .line 73
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string v1, "null"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string v1, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0
.end method

.method public final u(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, "    "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 19
    .line 20
    iget-object v2, v1, Landroidx/fragment/app/a1;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v4, "    "

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v1, v1, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v4, "Active Fragments:"

    .line 55
    .line 56
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Landroidx/fragment/app/z0;

    .line 78
    .line 79
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    if-eqz v4, :cond_0

    .line 83
    .line 84
    iget-object v4, v4, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 85
    .line 86
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v3, p2, p3, p4}, Landroidx/fragment/app/Fragment;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    const-string v4, "null"

    .line 94
    .line 95
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    const/4 p4, 0x0

    .line 104
    if-lez p2, :cond_2

    .line 105
    .line 106
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-string v1, "Added Fragments:"

    .line 110
    .line 111
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move v1, p4

    .line 115
    :goto_1
    if-ge v1, p2, :cond_2

    .line 116
    .line 117
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 122
    .line 123
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const-string v4, "  #"

    .line 127
    .line 128
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 132
    .line 133
    .line 134
    const-string v4, ": "

    .line 135
    .line 136
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v1, v1, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    iget-object p2, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 150
    .line 151
    if-eqz p2, :cond_3

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-lez p2, :cond_3

    .line 158
    .line 159
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string v1, "Fragments Created Menus:"

    .line 163
    .line 164
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    move v1, p4

    .line 168
    :goto_2
    if-ge v1, p2, :cond_3

    .line 169
    .line 170
    iget-object v2, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 177
    .line 178
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const-string v3, "  #"

    .line 182
    .line 183
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 187
    .line 188
    .line 189
    const-string v3, ": "

    .line 190
    .line 191
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    add-int/lit8 v1, v1, 0x1

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_3
    iget-object p2, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 205
    .line 206
    if-eqz p2, :cond_4

    .line 207
    .line 208
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    if-lez p2, :cond_4

    .line 213
    .line 214
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    const-string v1, "Back Stack:"

    .line 218
    .line 219
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    move v1, p4

    .line 223
    :goto_3
    if-ge v1, p2, :cond_4

    .line 224
    .line 225
    iget-object v2, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, Landroidx/fragment/app/a;

    .line 232
    .line 233
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const-string v3, "  #"

    .line 237
    .line 238
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 242
    .line 243
    .line 244
    const-string v3, ": "

    .line 245
    .line 246
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const/4 v3, 0x1

    .line 257
    invoke-virtual {v2, v0, p3, v3}, Landroidx/fragment/app/a;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 258
    .line 259
    .line 260
    add-int/lit8 v1, v1, 0x1

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_4
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    new-instance p2, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v0, "Back Stack Index: "

    .line 269
    .line 270
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, Landroidx/fragment/app/u0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    iget-object p2, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 290
    .line 291
    monitor-enter p2

    .line 292
    :try_start_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-lez v0, :cond_5

    .line 299
    .line 300
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    const-string v1, "Pending Actions:"

    .line 304
    .line 305
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :goto_4
    if-ge p4, v0, :cond_5

    .line 309
    .line 310
    iget-object v1, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, Landroidx/fragment/app/s0;

    .line 317
    .line 318
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    const-string v2, "  #"

    .line 322
    .line 323
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 327
    .line 328
    .line 329
    const-string v2, ": "

    .line 330
    .line 331
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    add-int/lit8 p4, p4, 0x1

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :catchall_0
    move-exception p1

    .line 341
    goto :goto_5

    .line 342
    :cond_5
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 343
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    const-string p2, "FragmentManager misc state:"

    .line 347
    .line 348
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    const-string p2, "  mHost="

    .line 355
    .line 356
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    iget-object p2, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 360
    .line 361
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    const-string p2, "  mContainer="

    .line 368
    .line 369
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    iget-object p2, p0, Landroidx/fragment/app/u0;->u:Landroidx/fragment/app/g0;

    .line 373
    .line 374
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    iget-object p2, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 378
    .line 379
    if-eqz p2, :cond_6

    .line 380
    .line 381
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    const-string p2, "  mParent="

    .line 385
    .line 386
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget-object p2, p0, Landroidx/fragment/app/u0;->v:Landroidx/fragment/app/Fragment;

    .line 390
    .line 391
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    :cond_6
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    const-string p2, "  mCurState="

    .line 398
    .line 399
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    iget p2, p0, Landroidx/fragment/app/u0;->s:I

    .line 403
    .line 404
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 405
    .line 406
    .line 407
    const-string p2, " mStateSaved="

    .line 408
    .line 409
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    iget-boolean p2, p0, Landroidx/fragment/app/u0;->E:Z

    .line 413
    .line 414
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 415
    .line 416
    .line 417
    const-string p2, " mStopped="

    .line 418
    .line 419
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    iget-boolean p2, p0, Landroidx/fragment/app/u0;->F:Z

    .line 423
    .line 424
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 425
    .line 426
    .line 427
    const-string p2, " mDestroyed="

    .line 428
    .line 429
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    iget-boolean p2, p0, Landroidx/fragment/app/u0;->G:Z

    .line 433
    .line 434
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 435
    .line 436
    .line 437
    iget-boolean p2, p0, Landroidx/fragment/app/u0;->D:Z

    .line 438
    .line 439
    if-eqz p2, :cond_7

    .line 440
    .line 441
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    const-string p1, "  mNeedMenuInvalidate="

    .line 445
    .line 446
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->D:Z

    .line 450
    .line 451
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    .line 452
    .line 453
    .line 454
    :cond_7
    return-void

    .line 455
    :goto_5
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 456
    throw p1
.end method

.method public final v(Landroidx/fragment/app/s0;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->G:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const-string p1, "FragmentManager has been destroyed"

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p1, "FragmentManager has not been attached to a host."

    .line 18
    .line 19
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->E:Z

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->F:Z

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const-string p1, "Can not perform this action after onSaveInstanceState"

    .line 33
    .line 34
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    monitor-enter v0

    .line 41
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 42
    .line 43
    if-nez v1, :cond_5

    .line 44
    .line 45
    if-eqz p2, :cond_4

    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "Activity has been destroyed"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_5
    iget-object p2, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->T()V

    .line 65
    .line 66
    .line 67
    monitor-exit v0

    .line 68
    return-void

    .line 69
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    throw p1
.end method

.method public final w(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->G:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-string p1, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p1, "FragmentManager has not been attached to a host."

    .line 20
    .line 21
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 30
    .line 31
    iget-object v1, v1, Landroidx/fragment/app/h0;->h:Landroid/os/Handler;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-ne v0, v1, :cond_5

    .line 38
    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->E:Z

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->F:Z

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const-string p1, "Can not perform this action after onSaveInstanceState"

    .line 51
    .line 52
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/u0;->I:Ljava/util/ArrayList;

    .line 57
    .line 58
    if-nez p1, :cond_4

    .line 59
    .line 60
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Landroidx/fragment/app/u0;->I:Ljava/util/ArrayList;

    .line 66
    .line 67
    new-instance p1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Landroidx/fragment/app/u0;->J:Ljava/util/ArrayList;

    .line 73
    .line 74
    :cond_4
    return-void

    .line 75
    :cond_5
    const-string p1, "Must be called from main thread of fragment host"

    .line 76
    .line 77
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_6
    const-string p1, "FragmentManager is already executing transactions"

    .line 82
    .line 83
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final x(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->w(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    move v0, p1

    .line 6
    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/u0;->I:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/fragment/app/u0;->J:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_0
    iget-object v4, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    move v6, p1

    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    :try_start_1
    iget-object v4, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    move v5, p1

    .line 34
    move v6, v5

    .line 35
    :goto_1
    iget-object v7, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 36
    .line 37
    if-ge v5, v4, :cond_1

    .line 38
    .line 39
    :try_start_2
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Landroidx/fragment/app/s0;

    .line 44
    .line 45
    invoke-interface {v7, v1, v2}, Landroidx/fragment/app/s0;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 46
    .line 47
    .line 48
    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 49
    or-int/2addr v6, v7

    .line 50
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_1
    move-exception p1

    .line 54
    goto :goto_4

    .line 55
    :cond_1
    :try_start_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 59
    .line 60
    iget-object v1, v1, Landroidx/fragment/app/h0;->h:Landroid/os/Handler;

    .line 61
    .line 62
    iget-object v2, p0, Landroidx/fragment/app/u0;->M:Landroidx/fragment/app/f;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    :goto_2
    const/4 v1, 0x1

    .line 69
    if-eqz v6, :cond_2

    .line 70
    .line 71
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->b:Z

    .line 72
    .line 73
    :try_start_4
    iget-object v0, p0, Landroidx/fragment/app/u0;->I:Ljava/util/ArrayList;

    .line 74
    .line 75
    iget-object v2, p0, Landroidx/fragment/app/u0;->J:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/u0;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->d()V

    .line 81
    .line 82
    .line 83
    move v0, v1

    .line 84
    goto :goto_0

    .line 85
    :catchall_2
    move-exception p1

    .line 86
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->d()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->a0()V

    .line 91
    .line 92
    .line 93
    iget-boolean v2, p0, Landroidx/fragment/app/u0;->H:Z

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iput-boolean p1, p0, Landroidx/fragment/app/u0;->H:Z

    .line 98
    .line 99
    iget-object v2, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/fragment/app/a1;->d()Ljava/util/ArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    move v4, p1

    .line 110
    :cond_3
    :goto_3
    if-ge v4, v3, :cond_5

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    add-int/lit8 v4, v4, 0x1

    .line 117
    .line 118
    check-cast v5, Landroidx/fragment/app/z0;

    .line 119
    .line 120
    iget-object v6, v5, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 121
    .line 122
    iget-boolean v7, v6, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 123
    .line 124
    if-eqz v7, :cond_3

    .line 125
    .line 126
    iget-boolean v7, p0, Landroidx/fragment/app/u0;->b:Z

    .line 127
    .line 128
    if-eqz v7, :cond_4

    .line 129
    .line 130
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->H:Z

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    iput-boolean p1, v6, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 134
    .line 135
    invoke-virtual {v5}, Landroidx/fragment/app/z0;->j()V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_5
    iget-object p1, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 140
    .line 141
    iget-object p1, p1, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p1, Ljava/util/HashMap;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const/4 v1, 0x0

    .line 150
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-interface {p1, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 155
    .line 156
    .line 157
    return v0

    .line 158
    :goto_4
    :try_start_5
    iget-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 164
    .line 165
    iget-object v0, v0, Landroidx/fragment/app/h0;->h:Landroid/os/Handler;

    .line 166
    .line 167
    iget-object v1, p0, Landroidx/fragment/app/u0;->M:Landroidx/fragment/app/f;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :goto_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 174
    throw p1
.end method

.method public final y(Landroidx/fragment/app/a;Z)V
    .locals 7

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/h0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->G:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/fragment/app/u0;->w(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Landroidx/fragment/app/u0;->I:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/fragment/app/u0;->J:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/a;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Landroidx/fragment/app/u0;->b:Z

    .line 24
    .line 25
    :try_start_0
    iget-object p2, p0, Landroidx/fragment/app/u0;->I:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/fragment/app/u0;->J:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p0, p2, v0}, Landroidx/fragment/app/u0;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->d()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->a0()V

    .line 36
    .line 37
    .line 38
    iget-boolean p2, p0, Landroidx/fragment/app/u0;->H:Z

    .line 39
    .line 40
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 41
    .line 42
    if-eqz p2, :cond_4

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    iput-boolean p2, p0, Landroidx/fragment/app/u0;->H:Z

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/fragment/app/a1;->d()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    move v3, p2

    .line 56
    :cond_2
    :goto_0
    if-ge v3, v2, :cond_4

    .line 57
    .line 58
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    check-cast v4, Landroidx/fragment/app/z0;

    .line 65
    .line 66
    iget-object v5, v4, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/Fragment;

    .line 67
    .line 68
    iget-boolean v6, v5, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 69
    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    iget-boolean v6, p0, Landroidx/fragment/app/u0;->b:Z

    .line 73
    .line 74
    if-eqz v6, :cond_3

    .line 75
    .line 76
    iput-boolean p1, p0, Landroidx/fragment/app/u0;->H:Z

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iput-boolean p2, v5, Landroidx/fragment/app/Fragment;->mDeferStart:Z

    .line 80
    .line 81
    invoke-virtual {v4}, Landroidx/fragment/app/z0;->j()V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    iget-object p1, v0, Landroidx/fragment/app/a1;->g:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Ljava/util/HashMap;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const/4 p2, 0x0

    .line 94
    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-interface {p1, p2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catchall_0
    move-exception p1

    .line 103
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->d()V

    .line 104
    .line 105
    .line 106
    throw p1
.end method

.method public final z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, Landroidx/fragment/app/a;

    .line 16
    .line 17
    iget-boolean v5, v5, Landroidx/fragment/app/c1;->o:Z

    .line 18
    .line 19
    iget-object v6, v0, Landroidx/fragment/app/u0;->K:Ljava/util/ArrayList;

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    new-instance v6, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v6, v0, Landroidx/fragment/app/u0;->K:Ljava/util/ArrayList;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v6, v0, Landroidx/fragment/app/u0;->K:Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v7, v0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 37
    .line 38
    invoke-virtual {v7}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    iget-object v6, v0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/Fragment;

    .line 46
    .line 47
    move v9, v3

    .line 48
    const/4 v10, 0x0

    .line 49
    :goto_1
    const/4 v12, 0x1

    .line 50
    if-ge v9, v4, :cond_13

    .line 51
    .line 52
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v13

    .line 56
    check-cast v13, Landroidx/fragment/app/a;

    .line 57
    .line 58
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v14

    .line 62
    check-cast v14, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    iget-object v15, v0, Landroidx/fragment/app/u0;->K:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-nez v14, :cond_d

    .line 71
    .line 72
    iget-object v14, v13, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    :goto_2
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-ge v8, v11, :cond_c

    .line 80
    .line 81
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    check-cast v11, Landroidx/fragment/app/b1;

    .line 86
    .line 87
    iget v3, v11, Landroidx/fragment/app/b1;->a:I

    .line 88
    .line 89
    if-eq v3, v12, :cond_b

    .line 90
    .line 91
    const/4 v12, 0x2

    .line 92
    move/from16 v17, v5

    .line 93
    .line 94
    const/16 v5, 0x9

    .line 95
    .line 96
    if-eq v3, v12, :cond_5

    .line 97
    .line 98
    const/4 v12, 0x3

    .line 99
    if-eq v3, v12, :cond_4

    .line 100
    .line 101
    const/4 v12, 0x6

    .line 102
    if-eq v3, v12, :cond_4

    .line 103
    .line 104
    const/4 v12, 0x7

    .line 105
    if-eq v3, v12, :cond_3

    .line 106
    .line 107
    const/16 v12, 0x8

    .line 108
    .line 109
    if-eq v3, v12, :cond_1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_1
    new-instance v3, Landroidx/fragment/app/b1;

    .line 113
    .line 114
    const/4 v12, 0x0

    .line 115
    invoke-direct {v3, v6, v5, v12}, Landroidx/fragment/app/b1;-><init>(Landroidx/fragment/app/Fragment;II)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v14, v8, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    const/4 v3, 0x1

    .line 122
    iput-boolean v3, v11, Landroidx/fragment/app/b1;->c:Z

    .line 123
    .line 124
    add-int/lit8 v8, v8, 0x1

    .line 125
    .line 126
    iget-object v3, v11, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 127
    .line 128
    move-object v6, v3

    .line 129
    :cond_2
    :goto_3
    move/from16 v20, v9

    .line 130
    .line 131
    move/from16 v19, v10

    .line 132
    .line 133
    const/4 v5, 0x1

    .line 134
    goto/16 :goto_9

    .line 135
    .line 136
    :cond_3
    const/4 v5, 0x1

    .line 137
    :goto_4
    move/from16 v20, v9

    .line 138
    .line 139
    move/from16 v19, v10

    .line 140
    .line 141
    goto/16 :goto_8

    .line 142
    .line 143
    :cond_4
    iget-object v3, v11, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 144
    .line 145
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    iget-object v3, v11, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 149
    .line 150
    if-ne v3, v6, :cond_2

    .line 151
    .line 152
    new-instance v6, Landroidx/fragment/app/b1;

    .line 153
    .line 154
    invoke-direct {v6, v3, v5}, Landroidx/fragment/app/b1;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v14, v8, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v8, v8, 0x1

    .line 161
    .line 162
    move/from16 v20, v9

    .line 163
    .line 164
    move/from16 v19, v10

    .line 165
    .line 166
    const/4 v5, 0x1

    .line 167
    const/4 v6, 0x0

    .line 168
    goto/16 :goto_9

    .line 169
    .line 170
    :cond_5
    iget-object v3, v11, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 171
    .line 172
    iget v12, v3, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 173
    .line 174
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v18

    .line 178
    const/16 v16, 0x1

    .line 179
    .line 180
    add-int/lit8 v18, v18, -0x1

    .line 181
    .line 182
    move/from16 v5, v18

    .line 183
    .line 184
    const/16 v18, 0x0

    .line 185
    .line 186
    :goto_5
    if-ltz v5, :cond_9

    .line 187
    .line 188
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v20

    .line 192
    move/from16 v21, v5

    .line 193
    .line 194
    move-object/from16 v5, v20

    .line 195
    .line 196
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 197
    .line 198
    move/from16 v20, v9

    .line 199
    .line 200
    iget v9, v5, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 201
    .line 202
    if-ne v9, v12, :cond_8

    .line 203
    .line 204
    if-ne v5, v3, :cond_6

    .line 205
    .line 206
    move/from16 v19, v10

    .line 207
    .line 208
    const/4 v5, 0x1

    .line 209
    const/16 v18, 0x1

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_6
    if-ne v5, v6, :cond_7

    .line 213
    .line 214
    new-instance v6, Landroidx/fragment/app/b1;

    .line 215
    .line 216
    move/from16 v19, v10

    .line 217
    .line 218
    const/4 v9, 0x0

    .line 219
    const/16 v10, 0x9

    .line 220
    .line 221
    invoke-direct {v6, v5, v10, v9}, Landroidx/fragment/app/b1;-><init>(Landroidx/fragment/app/Fragment;II)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v14, v8, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    add-int/lit8 v8, v8, 0x1

    .line 228
    .line 229
    const/4 v6, 0x0

    .line 230
    goto :goto_6

    .line 231
    :cond_7
    move/from16 v19, v10

    .line 232
    .line 233
    const/4 v9, 0x0

    .line 234
    const/16 v10, 0x9

    .line 235
    .line 236
    :goto_6
    new-instance v10, Landroidx/fragment/app/b1;

    .line 237
    .line 238
    move-object/from16 v22, v6

    .line 239
    .line 240
    const/4 v6, 0x3

    .line 241
    invoke-direct {v10, v5, v6, v9}, Landroidx/fragment/app/b1;-><init>(Landroidx/fragment/app/Fragment;II)V

    .line 242
    .line 243
    .line 244
    iget v6, v11, Landroidx/fragment/app/b1;->d:I

    .line 245
    .line 246
    iput v6, v10, Landroidx/fragment/app/b1;->d:I

    .line 247
    .line 248
    iget v6, v11, Landroidx/fragment/app/b1;->f:I

    .line 249
    .line 250
    iput v6, v10, Landroidx/fragment/app/b1;->f:I

    .line 251
    .line 252
    iget v6, v11, Landroidx/fragment/app/b1;->e:I

    .line 253
    .line 254
    iput v6, v10, Landroidx/fragment/app/b1;->e:I

    .line 255
    .line 256
    iget v6, v11, Landroidx/fragment/app/b1;->g:I

    .line 257
    .line 258
    iput v6, v10, Landroidx/fragment/app/b1;->g:I

    .line 259
    .line 260
    invoke-virtual {v14, v8, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    const/4 v5, 0x1

    .line 267
    add-int/2addr v8, v5

    .line 268
    move-object/from16 v6, v22

    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_8
    move/from16 v19, v10

    .line 272
    .line 273
    const/4 v5, 0x1

    .line 274
    :goto_7
    add-int/lit8 v9, v21, -0x1

    .line 275
    .line 276
    move v5, v9

    .line 277
    move/from16 v10, v19

    .line 278
    .line 279
    move/from16 v9, v20

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_9
    move/from16 v20, v9

    .line 283
    .line 284
    move/from16 v19, v10

    .line 285
    .line 286
    const/4 v5, 0x1

    .line 287
    if-eqz v18, :cond_a

    .line 288
    .line 289
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    add-int/lit8 v8, v8, -0x1

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_a
    iput v5, v11, Landroidx/fragment/app/b1;->a:I

    .line 296
    .line 297
    iput-boolean v5, v11, Landroidx/fragment/app/b1;->c:Z

    .line 298
    .line 299
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    goto :goto_9

    .line 303
    :cond_b
    move/from16 v17, v5

    .line 304
    .line 305
    move v5, v12

    .line 306
    goto/16 :goto_4

    .line 307
    .line 308
    :goto_8
    iget-object v3, v11, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 309
    .line 310
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    :goto_9
    add-int/2addr v8, v5

    .line 314
    move/from16 v3, p3

    .line 315
    .line 316
    move v12, v5

    .line 317
    move/from16 v5, v17

    .line 318
    .line 319
    move/from16 v10, v19

    .line 320
    .line 321
    move/from16 v9, v20

    .line 322
    .line 323
    goto/16 :goto_2

    .line 324
    .line 325
    :cond_c
    move/from16 v17, v5

    .line 326
    .line 327
    move/from16 v20, v9

    .line 328
    .line 329
    move/from16 v19, v10

    .line 330
    .line 331
    goto :goto_c

    .line 332
    :cond_d
    move/from16 v17, v5

    .line 333
    .line 334
    move/from16 v20, v9

    .line 335
    .line 336
    move/from16 v19, v10

    .line 337
    .line 338
    move v5, v12

    .line 339
    iget-object v3, v13, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    sub-int/2addr v8, v5

    .line 346
    :goto_a
    if-ltz v8, :cond_10

    .line 347
    .line 348
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    check-cast v9, Landroidx/fragment/app/b1;

    .line 353
    .line 354
    iget v10, v9, Landroidx/fragment/app/b1;->a:I

    .line 355
    .line 356
    const/4 v12, 0x3

    .line 357
    if-eq v10, v5, :cond_f

    .line 358
    .line 359
    if-eq v10, v12, :cond_e

    .line 360
    .line 361
    packed-switch v10, :pswitch_data_0

    .line 362
    .line 363
    .line 364
    goto :goto_b

    .line 365
    :pswitch_0
    iget-object v5, v9, Landroidx/fragment/app/b1;->h:Landroidx/lifecycle/n;

    .line 366
    .line 367
    iput-object v5, v9, Landroidx/fragment/app/b1;->i:Landroidx/lifecycle/n;

    .line 368
    .line 369
    goto :goto_b

    .line 370
    :pswitch_1
    iget-object v5, v9, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 371
    .line 372
    move-object v6, v5

    .line 373
    goto :goto_b

    .line 374
    :pswitch_2
    const/4 v6, 0x0

    .line 375
    goto :goto_b

    .line 376
    :cond_e
    :pswitch_3
    iget-object v5, v9, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 377
    .line 378
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_f
    :pswitch_4
    iget-object v5, v9, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 383
    .line 384
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    :goto_b
    add-int/lit8 v8, v8, -0x1

    .line 388
    .line 389
    const/4 v5, 0x1

    .line 390
    goto :goto_a

    .line 391
    :cond_10
    :goto_c
    if-nez v19, :cond_12

    .line 392
    .line 393
    iget-boolean v3, v13, Landroidx/fragment/app/c1;->g:Z

    .line 394
    .line 395
    if-eqz v3, :cond_11

    .line 396
    .line 397
    goto :goto_d

    .line 398
    :cond_11
    const/4 v10, 0x0

    .line 399
    goto :goto_e

    .line 400
    :cond_12
    :goto_d
    const/4 v10, 0x1

    .line 401
    :goto_e
    add-int/lit8 v9, v20, 0x1

    .line 402
    .line 403
    move/from16 v3, p3

    .line 404
    .line 405
    move/from16 v5, v17

    .line 406
    .line 407
    goto/16 :goto_1

    .line 408
    .line 409
    :cond_13
    move/from16 v17, v5

    .line 410
    .line 411
    iget-object v3, v0, Landroidx/fragment/app/u0;->K:Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 414
    .line 415
    .line 416
    if-nez v17, :cond_16

    .line 417
    .line 418
    iget v3, v0, Landroidx/fragment/app/u0;->s:I

    .line 419
    .line 420
    const/4 v5, 0x1

    .line 421
    if-lt v3, v5, :cond_16

    .line 422
    .line 423
    move/from16 v3, p3

    .line 424
    .line 425
    :goto_f
    if-ge v3, v4, :cond_16

    .line 426
    .line 427
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    check-cast v5, Landroidx/fragment/app/a;

    .line 432
    .line 433
    iget-object v5, v5, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 434
    .line 435
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    const/4 v8, 0x0

    .line 440
    :cond_14
    :goto_10
    if-ge v8, v6, :cond_15

    .line 441
    .line 442
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v9

    .line 446
    add-int/lit8 v8, v8, 0x1

    .line 447
    .line 448
    check-cast v9, Landroidx/fragment/app/b1;

    .line 449
    .line 450
    iget-object v9, v9, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 451
    .line 452
    if-eqz v9, :cond_14

    .line 453
    .line 454
    iget-object v10, v9, Landroidx/fragment/app/Fragment;->mFragmentManager:Landroidx/fragment/app/u0;

    .line 455
    .line 456
    if-eqz v10, :cond_14

    .line 457
    .line 458
    invoke-virtual {v0, v9}, Landroidx/fragment/app/u0;->f(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/z0;

    .line 459
    .line 460
    .line 461
    move-result-object v9

    .line 462
    invoke-virtual {v7, v9}, Landroidx/fragment/app/a1;->g(Landroidx/fragment/app/z0;)V

    .line 463
    .line 464
    .line 465
    goto :goto_10

    .line 466
    :cond_15
    add-int/lit8 v3, v3, 0x1

    .line 467
    .line 468
    goto :goto_f

    .line 469
    :cond_16
    move/from16 v3, p3

    .line 470
    .line 471
    :goto_11
    const/4 v5, -0x1

    .line 472
    if-ge v3, v4, :cond_1e

    .line 473
    .line 474
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    check-cast v6, Landroidx/fragment/app/a;

    .line 479
    .line 480
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v7

    .line 484
    check-cast v7, Ljava/lang/Boolean;

    .line 485
    .line 486
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 487
    .line 488
    .line 489
    move-result v7

    .line 490
    const-string v8, "Unknown cmd: "

    .line 491
    .line 492
    if-eqz v7, :cond_1c

    .line 493
    .line 494
    invoke-virtual {v6, v5}, Landroidx/fragment/app/a;->d(I)V

    .line 495
    .line 496
    .line 497
    iget-object v5, v6, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/u0;

    .line 498
    .line 499
    iget-object v7, v6, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 500
    .line 501
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 502
    .line 503
    .line 504
    move-result v9

    .line 505
    const/4 v10, 0x1

    .line 506
    sub-int/2addr v9, v10

    .line 507
    :goto_12
    if-ltz v9, :cond_1b

    .line 508
    .line 509
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v11

    .line 513
    check-cast v11, Landroidx/fragment/app/b1;

    .line 514
    .line 515
    iget-object v12, v11, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 516
    .line 517
    if-eqz v12, :cond_1a

    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    iput-boolean v13, v12, Landroidx/fragment/app/Fragment;->mBeingSaved:Z

    .line 521
    .line 522
    invoke-virtual {v12, v10}, Landroidx/fragment/app/Fragment;->setPopDirection(Z)V

    .line 523
    .line 524
    .line 525
    iget v10, v6, Landroidx/fragment/app/c1;->f:I

    .line 526
    .line 527
    const/16 v13, 0x2002

    .line 528
    .line 529
    const/16 v14, 0x1001

    .line 530
    .line 531
    if-eq v10, v14, :cond_19

    .line 532
    .line 533
    if-eq v10, v13, :cond_17

    .line 534
    .line 535
    const/16 v13, 0x1004

    .line 536
    .line 537
    const/16 v14, 0x2005

    .line 538
    .line 539
    if-eq v10, v14, :cond_19

    .line 540
    .line 541
    const/16 v15, 0x1003

    .line 542
    .line 543
    if-eq v10, v15, :cond_18

    .line 544
    .line 545
    if-eq v10, v13, :cond_17

    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    goto :goto_13

    .line 549
    :cond_17
    move v13, v14

    .line 550
    goto :goto_13

    .line 551
    :cond_18
    move v13, v15

    .line 552
    :cond_19
    :goto_13
    invoke-virtual {v12, v13}, Landroidx/fragment/app/Fragment;->setNextTransition(I)V

    .line 553
    .line 554
    .line 555
    iget-object v10, v6, Landroidx/fragment/app/c1;->n:Ljava/util/ArrayList;

    .line 556
    .line 557
    iget-object v13, v6, Landroidx/fragment/app/c1;->m:Ljava/util/ArrayList;

    .line 558
    .line 559
    invoke-virtual {v12, v10, v13}, Landroidx/fragment/app/Fragment;->setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 560
    .line 561
    .line 562
    :cond_1a
    iget v10, v11, Landroidx/fragment/app/b1;->a:I

    .line 563
    .line 564
    packed-switch v10, :pswitch_data_1

    .line 565
    .line 566
    .line 567
    :pswitch_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 568
    .line 569
    iget v2, v11, Landroidx/fragment/app/b1;->a:I

    .line 570
    .line 571
    new-instance v3, Ljava/lang/StringBuilder;

    .line 572
    .line 573
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    throw v1

    .line 587
    :pswitch_6
    iget-object v10, v11, Landroidx/fragment/app/b1;->h:Landroidx/lifecycle/n;

    .line 588
    .line 589
    invoke-virtual {v5, v12, v10}, Landroidx/fragment/app/u0;->V(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/n;)V

    .line 590
    .line 591
    .line 592
    :goto_14
    const/4 v10, 0x1

    .line 593
    goto/16 :goto_15

    .line 594
    .line 595
    :pswitch_7
    invoke-virtual {v5, v12}, Landroidx/fragment/app/u0;->W(Landroidx/fragment/app/Fragment;)V

    .line 596
    .line 597
    .line 598
    goto :goto_14

    .line 599
    :pswitch_8
    const/4 v10, 0x0

    .line 600
    invoke-virtual {v5, v10}, Landroidx/fragment/app/u0;->W(Landroidx/fragment/app/Fragment;)V

    .line 601
    .line 602
    .line 603
    goto :goto_14

    .line 604
    :pswitch_9
    iget v10, v11, Landroidx/fragment/app/b1;->d:I

    .line 605
    .line 606
    iget v13, v11, Landroidx/fragment/app/b1;->e:I

    .line 607
    .line 608
    iget v14, v11, Landroidx/fragment/app/b1;->f:I

    .line 609
    .line 610
    iget v11, v11, Landroidx/fragment/app/b1;->g:I

    .line 611
    .line 612
    invoke-virtual {v12, v10, v13, v14, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 613
    .line 614
    .line 615
    const/4 v10, 0x1

    .line 616
    invoke-virtual {v5, v12, v10}, Landroidx/fragment/app/u0;->U(Landroidx/fragment/app/Fragment;Z)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v5, v12}, Landroidx/fragment/app/u0;->g(Landroidx/fragment/app/Fragment;)V

    .line 620
    .line 621
    .line 622
    goto :goto_14

    .line 623
    :pswitch_a
    iget v10, v11, Landroidx/fragment/app/b1;->d:I

    .line 624
    .line 625
    iget v13, v11, Landroidx/fragment/app/b1;->e:I

    .line 626
    .line 627
    iget v14, v11, Landroidx/fragment/app/b1;->f:I

    .line 628
    .line 629
    iget v11, v11, Landroidx/fragment/app/b1;->g:I

    .line 630
    .line 631
    invoke-virtual {v12, v10, v13, v14, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v5, v12}, Landroidx/fragment/app/u0;->c(Landroidx/fragment/app/Fragment;)V

    .line 635
    .line 636
    .line 637
    goto :goto_14

    .line 638
    :pswitch_b
    iget v10, v11, Landroidx/fragment/app/b1;->d:I

    .line 639
    .line 640
    iget v13, v11, Landroidx/fragment/app/b1;->e:I

    .line 641
    .line 642
    iget v14, v11, Landroidx/fragment/app/b1;->f:I

    .line 643
    .line 644
    iget v11, v11, Landroidx/fragment/app/b1;->g:I

    .line 645
    .line 646
    invoke-virtual {v12, v10, v13, v14, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 647
    .line 648
    .line 649
    const/4 v10, 0x1

    .line 650
    invoke-virtual {v5, v12, v10}, Landroidx/fragment/app/u0;->U(Landroidx/fragment/app/Fragment;Z)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v5, v12}, Landroidx/fragment/app/u0;->F(Landroidx/fragment/app/Fragment;)V

    .line 654
    .line 655
    .line 656
    goto :goto_14

    .line 657
    :pswitch_c
    iget v10, v11, Landroidx/fragment/app/b1;->d:I

    .line 658
    .line 659
    iget v13, v11, Landroidx/fragment/app/b1;->e:I

    .line 660
    .line 661
    iget v14, v11, Landroidx/fragment/app/b1;->f:I

    .line 662
    .line 663
    iget v11, v11, Landroidx/fragment/app/b1;->g:I

    .line 664
    .line 665
    invoke-virtual {v12, v10, v13, v14, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    invoke-static {v12}, Landroidx/fragment/app/u0;->Y(Landroidx/fragment/app/Fragment;)V

    .line 672
    .line 673
    .line 674
    goto :goto_14

    .line 675
    :pswitch_d
    iget v10, v11, Landroidx/fragment/app/b1;->d:I

    .line 676
    .line 677
    iget v13, v11, Landroidx/fragment/app/b1;->e:I

    .line 678
    .line 679
    iget v14, v11, Landroidx/fragment/app/b1;->f:I

    .line 680
    .line 681
    iget v11, v11, Landroidx/fragment/app/b1;->g:I

    .line 682
    .line 683
    invoke-virtual {v12, v10, v13, v14, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v5, v12}, Landroidx/fragment/app/u0;->a(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/z0;

    .line 687
    .line 688
    .line 689
    goto :goto_14

    .line 690
    :pswitch_e
    iget v10, v11, Landroidx/fragment/app/b1;->d:I

    .line 691
    .line 692
    iget v13, v11, Landroidx/fragment/app/b1;->e:I

    .line 693
    .line 694
    iget v14, v11, Landroidx/fragment/app/b1;->f:I

    .line 695
    .line 696
    iget v11, v11, Landroidx/fragment/app/b1;->g:I

    .line 697
    .line 698
    invoke-virtual {v12, v10, v13, v14, v11}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 699
    .line 700
    .line 701
    const/4 v10, 0x1

    .line 702
    invoke-virtual {v5, v12, v10}, Landroidx/fragment/app/u0;->U(Landroidx/fragment/app/Fragment;Z)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v5, v12}, Landroidx/fragment/app/u0;->P(Landroidx/fragment/app/Fragment;)V

    .line 706
    .line 707
    .line 708
    :goto_15
    add-int/lit8 v9, v9, -0x1

    .line 709
    .line 710
    goto/16 :goto_12

    .line 711
    .line 712
    :cond_1b
    const/4 v13, 0x0

    .line 713
    goto/16 :goto_19

    .line 714
    .line 715
    :cond_1c
    const/4 v10, 0x1

    .line 716
    invoke-virtual {v6, v10}, Landroidx/fragment/app/a;->d(I)V

    .line 717
    .line 718
    .line 719
    iget-object v5, v6, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/u0;

    .line 720
    .line 721
    iget-object v7, v6, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 722
    .line 723
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 724
    .line 725
    .line 726
    move-result v9

    .line 727
    const/4 v12, 0x0

    .line 728
    :goto_16
    if-ge v12, v9, :cond_1b

    .line 729
    .line 730
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v10

    .line 734
    check-cast v10, Landroidx/fragment/app/b1;

    .line 735
    .line 736
    iget-object v11, v10, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 737
    .line 738
    if-eqz v11, :cond_1d

    .line 739
    .line 740
    const/4 v13, 0x0

    .line 741
    iput-boolean v13, v11, Landroidx/fragment/app/Fragment;->mBeingSaved:Z

    .line 742
    .line 743
    invoke-virtual {v11, v13}, Landroidx/fragment/app/Fragment;->setPopDirection(Z)V

    .line 744
    .line 745
    .line 746
    iget v13, v6, Landroidx/fragment/app/c1;->f:I

    .line 747
    .line 748
    invoke-virtual {v11, v13}, Landroidx/fragment/app/Fragment;->setNextTransition(I)V

    .line 749
    .line 750
    .line 751
    iget-object v13, v6, Landroidx/fragment/app/c1;->m:Ljava/util/ArrayList;

    .line 752
    .line 753
    iget-object v14, v6, Landroidx/fragment/app/c1;->n:Ljava/util/ArrayList;

    .line 754
    .line 755
    invoke-virtual {v11, v13, v14}, Landroidx/fragment/app/Fragment;->setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 756
    .line 757
    .line 758
    :cond_1d
    iget v13, v10, Landroidx/fragment/app/b1;->a:I

    .line 759
    .line 760
    packed-switch v13, :pswitch_data_2

    .line 761
    .line 762
    .line 763
    :pswitch_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 764
    .line 765
    iget v2, v10, Landroidx/fragment/app/b1;->a:I

    .line 766
    .line 767
    new-instance v3, Ljava/lang/StringBuilder;

    .line 768
    .line 769
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    throw v1

    .line 783
    :pswitch_10
    iget-object v10, v10, Landroidx/fragment/app/b1;->i:Landroidx/lifecycle/n;

    .line 784
    .line 785
    invoke-virtual {v5, v11, v10}, Landroidx/fragment/app/u0;->V(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/n;)V

    .line 786
    .line 787
    .line 788
    :goto_17
    const/4 v13, 0x0

    .line 789
    goto/16 :goto_18

    .line 790
    .line 791
    :pswitch_11
    const/4 v13, 0x0

    .line 792
    invoke-virtual {v5, v13}, Landroidx/fragment/app/u0;->W(Landroidx/fragment/app/Fragment;)V

    .line 793
    .line 794
    .line 795
    goto :goto_17

    .line 796
    :pswitch_12
    const/4 v13, 0x0

    .line 797
    invoke-virtual {v5, v11}, Landroidx/fragment/app/u0;->W(Landroidx/fragment/app/Fragment;)V

    .line 798
    .line 799
    .line 800
    goto :goto_17

    .line 801
    :pswitch_13
    const/4 v13, 0x0

    .line 802
    iget v14, v10, Landroidx/fragment/app/b1;->d:I

    .line 803
    .line 804
    iget v15, v10, Landroidx/fragment/app/b1;->e:I

    .line 805
    .line 806
    iget v13, v10, Landroidx/fragment/app/b1;->f:I

    .line 807
    .line 808
    iget v10, v10, Landroidx/fragment/app/b1;->g:I

    .line 809
    .line 810
    invoke-virtual {v11, v14, v15, v13, v10}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 811
    .line 812
    .line 813
    const/4 v13, 0x0

    .line 814
    invoke-virtual {v5, v11, v13}, Landroidx/fragment/app/u0;->U(Landroidx/fragment/app/Fragment;Z)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v5, v11}, Landroidx/fragment/app/u0;->c(Landroidx/fragment/app/Fragment;)V

    .line 818
    .line 819
    .line 820
    goto :goto_17

    .line 821
    :pswitch_14
    iget v13, v10, Landroidx/fragment/app/b1;->d:I

    .line 822
    .line 823
    iget v14, v10, Landroidx/fragment/app/b1;->e:I

    .line 824
    .line 825
    iget v15, v10, Landroidx/fragment/app/b1;->f:I

    .line 826
    .line 827
    iget v10, v10, Landroidx/fragment/app/b1;->g:I

    .line 828
    .line 829
    invoke-virtual {v11, v13, v14, v15, v10}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v5, v11}, Landroidx/fragment/app/u0;->g(Landroidx/fragment/app/Fragment;)V

    .line 833
    .line 834
    .line 835
    goto :goto_17

    .line 836
    :pswitch_15
    iget v13, v10, Landroidx/fragment/app/b1;->d:I

    .line 837
    .line 838
    iget v14, v10, Landroidx/fragment/app/b1;->e:I

    .line 839
    .line 840
    iget v15, v10, Landroidx/fragment/app/b1;->f:I

    .line 841
    .line 842
    iget v10, v10, Landroidx/fragment/app/b1;->g:I

    .line 843
    .line 844
    invoke-virtual {v11, v13, v14, v15, v10}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 845
    .line 846
    .line 847
    const/4 v13, 0x0

    .line 848
    invoke-virtual {v5, v11, v13}, Landroidx/fragment/app/u0;->U(Landroidx/fragment/app/Fragment;Z)V

    .line 849
    .line 850
    .line 851
    invoke-static {v11}, Landroidx/fragment/app/u0;->Y(Landroidx/fragment/app/Fragment;)V

    .line 852
    .line 853
    .line 854
    goto :goto_17

    .line 855
    :pswitch_16
    iget v13, v10, Landroidx/fragment/app/b1;->d:I

    .line 856
    .line 857
    iget v14, v10, Landroidx/fragment/app/b1;->e:I

    .line 858
    .line 859
    iget v15, v10, Landroidx/fragment/app/b1;->f:I

    .line 860
    .line 861
    iget v10, v10, Landroidx/fragment/app/b1;->g:I

    .line 862
    .line 863
    invoke-virtual {v11, v13, v14, v15, v10}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v5, v11}, Landroidx/fragment/app/u0;->F(Landroidx/fragment/app/Fragment;)V

    .line 867
    .line 868
    .line 869
    goto :goto_17

    .line 870
    :pswitch_17
    iget v13, v10, Landroidx/fragment/app/b1;->d:I

    .line 871
    .line 872
    iget v14, v10, Landroidx/fragment/app/b1;->e:I

    .line 873
    .line 874
    iget v15, v10, Landroidx/fragment/app/b1;->f:I

    .line 875
    .line 876
    iget v10, v10, Landroidx/fragment/app/b1;->g:I

    .line 877
    .line 878
    invoke-virtual {v11, v13, v14, v15, v10}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v5, v11}, Landroidx/fragment/app/u0;->P(Landroidx/fragment/app/Fragment;)V

    .line 882
    .line 883
    .line 884
    goto :goto_17

    .line 885
    :pswitch_18
    iget v13, v10, Landroidx/fragment/app/b1;->d:I

    .line 886
    .line 887
    iget v14, v10, Landroidx/fragment/app/b1;->e:I

    .line 888
    .line 889
    iget v15, v10, Landroidx/fragment/app/b1;->f:I

    .line 890
    .line 891
    iget v10, v10, Landroidx/fragment/app/b1;->g:I

    .line 892
    .line 893
    invoke-virtual {v11, v13, v14, v15, v10}, Landroidx/fragment/app/Fragment;->setAnimations(IIII)V

    .line 894
    .line 895
    .line 896
    const/4 v13, 0x0

    .line 897
    invoke-virtual {v5, v11, v13}, Landroidx/fragment/app/u0;->U(Landroidx/fragment/app/Fragment;Z)V

    .line 898
    .line 899
    .line 900
    invoke-virtual {v5, v11}, Landroidx/fragment/app/u0;->a(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/z0;

    .line 901
    .line 902
    .line 903
    :goto_18
    add-int/lit8 v12, v12, 0x1

    .line 904
    .line 905
    goto/16 :goto_16

    .line 906
    .line 907
    :goto_19
    add-int/lit8 v3, v3, 0x1

    .line 908
    .line 909
    goto/16 :goto_11

    .line 910
    .line 911
    :cond_1e
    const/4 v13, 0x0

    .line 912
    add-int/lit8 v3, v4, -0x1

    .line 913
    .line 914
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    check-cast v3, Ljava/lang/Boolean;

    .line 919
    .line 920
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 921
    .line 922
    .line 923
    move-result v3

    .line 924
    move/from16 v6, p3

    .line 925
    .line 926
    :goto_1a
    if-ge v6, v4, :cond_23

    .line 927
    .line 928
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v7

    .line 932
    check-cast v7, Landroidx/fragment/app/a;

    .line 933
    .line 934
    if-eqz v3, :cond_20

    .line 935
    .line 936
    iget-object v8, v7, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 937
    .line 938
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 939
    .line 940
    .line 941
    move-result v8

    .line 942
    const/16 v16, 0x1

    .line 943
    .line 944
    add-int/lit8 v8, v8, -0x1

    .line 945
    .line 946
    :goto_1b
    if-ltz v8, :cond_22

    .line 947
    .line 948
    iget-object v9, v7, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 949
    .line 950
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v9

    .line 954
    check-cast v9, Landroidx/fragment/app/b1;

    .line 955
    .line 956
    iget-object v9, v9, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 957
    .line 958
    if-eqz v9, :cond_1f

    .line 959
    .line 960
    invoke-virtual {v0, v9}, Landroidx/fragment/app/u0;->f(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/z0;

    .line 961
    .line 962
    .line 963
    move-result-object v9

    .line 964
    invoke-virtual {v9}, Landroidx/fragment/app/z0;->j()V

    .line 965
    .line 966
    .line 967
    :cond_1f
    add-int/lit8 v8, v8, -0x1

    .line 968
    .line 969
    goto :goto_1b

    .line 970
    :cond_20
    iget-object v7, v7, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 971
    .line 972
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 973
    .line 974
    .line 975
    move-result v8

    .line 976
    move v12, v13

    .line 977
    :cond_21
    :goto_1c
    if-ge v12, v8, :cond_22

    .line 978
    .line 979
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v9

    .line 983
    add-int/lit8 v12, v12, 0x1

    .line 984
    .line 985
    check-cast v9, Landroidx/fragment/app/b1;

    .line 986
    .line 987
    iget-object v9, v9, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 988
    .line 989
    if-eqz v9, :cond_21

    .line 990
    .line 991
    invoke-virtual {v0, v9}, Landroidx/fragment/app/u0;->f(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/z0;

    .line 992
    .line 993
    .line 994
    move-result-object v9

    .line 995
    invoke-virtual {v9}, Landroidx/fragment/app/z0;->j()V

    .line 996
    .line 997
    .line 998
    goto :goto_1c

    .line 999
    :cond_22
    add-int/lit8 v6, v6, 0x1

    .line 1000
    .line 1001
    goto :goto_1a

    .line 1002
    :cond_23
    iget v6, v0, Landroidx/fragment/app/u0;->s:I

    .line 1003
    .line 1004
    const/4 v10, 0x1

    .line 1005
    invoke-virtual {v0, v6, v10}, Landroidx/fragment/app/u0;->K(IZ)V

    .line 1006
    .line 1007
    .line 1008
    new-instance v6, Ljava/util/HashSet;

    .line 1009
    .line 1010
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 1011
    .line 1012
    .line 1013
    move/from16 v7, p3

    .line 1014
    .line 1015
    :goto_1d
    if-ge v7, v4, :cond_26

    .line 1016
    .line 1017
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v8

    .line 1021
    check-cast v8, Landroidx/fragment/app/a;

    .line 1022
    .line 1023
    iget-object v8, v8, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 1024
    .line 1025
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1026
    .line 1027
    .line 1028
    move-result v9

    .line 1029
    move v12, v13

    .line 1030
    :cond_24
    :goto_1e
    if-ge v12, v9, :cond_25

    .line 1031
    .line 1032
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v10

    .line 1036
    add-int/lit8 v12, v12, 0x1

    .line 1037
    .line 1038
    check-cast v10, Landroidx/fragment/app/b1;

    .line 1039
    .line 1040
    iget-object v10, v10, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 1041
    .line 1042
    if-eqz v10, :cond_24

    .line 1043
    .line 1044
    iget-object v10, v10, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 1045
    .line 1046
    if-eqz v10, :cond_24

    .line 1047
    .line 1048
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->E()Landroidx/fragment/app/p0;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v11

    .line 1052
    invoke-static {v10, v11}, Landroidx/fragment/app/l;->h(Landroid/view/ViewGroup;Landroidx/fragment/app/p0;)Landroidx/fragment/app/l;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v10

    .line 1056
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1057
    .line 1058
    .line 1059
    goto :goto_1e

    .line 1060
    :cond_25
    add-int/lit8 v7, v7, 0x1

    .line 1061
    .line 1062
    goto :goto_1d

    .line 1063
    :cond_26
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v6

    .line 1067
    :goto_1f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1068
    .line 1069
    .line 1070
    move-result v7

    .line 1071
    if-eqz v7, :cond_27

    .line 1072
    .line 1073
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v7

    .line 1077
    check-cast v7, Landroidx/fragment/app/l;

    .line 1078
    .line 1079
    iput-boolean v3, v7, Landroidx/fragment/app/l;->d:Z

    .line 1080
    .line 1081
    invoke-virtual {v7}, Landroidx/fragment/app/l;->j()V

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v7}, Landroidx/fragment/app/l;->d()V

    .line 1085
    .line 1086
    .line 1087
    goto :goto_1f

    .line 1088
    :cond_27
    move/from16 v3, p3

    .line 1089
    .line 1090
    :goto_20
    if-ge v3, v4, :cond_29

    .line 1091
    .line 1092
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v6

    .line 1096
    check-cast v6, Landroidx/fragment/app/a;

    .line 1097
    .line 1098
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v7

    .line 1102
    check-cast v7, Ljava/lang/Boolean;

    .line 1103
    .line 1104
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1105
    .line 1106
    .line 1107
    move-result v7

    .line 1108
    if-eqz v7, :cond_28

    .line 1109
    .line 1110
    iget v7, v6, Landroidx/fragment/app/a;->r:I

    .line 1111
    .line 1112
    if-ltz v7, :cond_28

    .line 1113
    .line 1114
    iput v5, v6, Landroidx/fragment/app/a;->r:I

    .line 1115
    .line 1116
    :cond_28
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1117
    .line 1118
    .line 1119
    add-int/lit8 v3, v3, 0x1

    .line 1120
    .line 1121
    goto :goto_20

    .line 1122
    :cond_29
    return-void

    .line 1123
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method
