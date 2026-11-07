.class public abstract Landroidx/lifecycle/k0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final a:Landroidx/lifecycle/q0;

.field public static final b:Landroidx/lifecycle/q0;

.field public static final c:Landroidx/lifecycle/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/q0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/k0;->a:Landroidx/lifecycle/q0;

    .line 7
    .line 8
    new-instance v0, Landroidx/lifecycle/q0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/lifecycle/k0;->b:Landroidx/lifecycle/q0;

    .line 14
    .line 15
    new-instance v0, Landroidx/lifecycle/q0;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/lifecycle/k0;->c:Landroidx/lifecycle/q0;

    .line 21
    .line 22
    return-void
.end method

.method public static final a(Landroidx/lifecycle/p0;Ll1/c;Landroidx/lifecycle/o;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/lifecycle/p0;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-enter v1

    .line 16
    :try_start_0
    iget-object p0, p0, Landroidx/lifecycle/p0;->a:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :goto_0
    check-cast p0, Landroidx/lifecycle/SavedStateHandleController;

    .line 24
    .line 25
    if-eqz p0, :cond_3

    .line 26
    .line 27
    iget-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->h:Z

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/SavedStateHandleController;->b(Landroidx/lifecycle/o;Ll1/c;)V

    .line 32
    .line 33
    .line 34
    move-object p0, p2

    .line 35
    check-cast p0, Landroidx/lifecycle/v;

    .line 36
    .line 37
    iget-object p0, p0, Landroidx/lifecycle/v;->c:Landroidx/lifecycle/n;

    .line 38
    .line 39
    sget-object v0, Landroidx/lifecycle/n;->g:Landroidx/lifecycle/n;

    .line 40
    .line 41
    if-eq p0, v0, :cond_2

    .line 42
    .line 43
    sget-object v0, Landroidx/lifecycle/n;->i:Landroidx/lifecycle/n;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-ltz p0, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance p0, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;

    .line 53
    .line 54
    invoke-direct {p0, p2, p1}, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;-><init>(Landroidx/lifecycle/o;Ll1/c;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, p0}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/s;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ll1/c;->d()V

    .line 62
    .line 63
    .line 64
    :cond_3
    return-void

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw p0
.end method

.method public static b(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/j0;
    .locals 5

    .line 1
    if-nez p0, :cond_2

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p0, Landroidx/lifecycle/j0;

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/lifecycle/j0;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance p1, Landroidx/lifecycle/j0;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Landroidx/lifecycle/j0;-><init>(Ljava/util/HashMap;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_2
    const-string p1, "keys"

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v0, "values"

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    if-eqz p0, :cond_4

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-ne v0, v1, :cond_4

    .line 78
    .line 79
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const/4 v2, 0x0

    .line 89
    :goto_1
    if-ge v2, v1, :cond_3

    .line 90
    .line 91
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    check-cast v3, Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    new-instance p0, Landroidx/lifecycle/j0;

    .line 111
    .line 112
    invoke-direct {p0, v0}, Landroidx/lifecycle/j0;-><init>(Ljava/util/HashMap;)V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_4
    const-string p0, "Invalid bundle passed as restored state"

    .line 117
    .line 118
    invoke-static {p0}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x0

    .line 122
    return-object p0
.end method

.method public static final c(Lf1/c;)Landroidx/lifecycle/j0;
    .locals 7

    .line 1
    iget-object p0, p0, Lf1/b;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    sget-object v0, Landroidx/lifecycle/k0;->a:Landroidx/lifecycle/q0;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ll1/e;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_8

    .line 13
    .line 14
    sget-object v2, Landroidx/lifecycle/k0;->b:Landroidx/lifecycle/q0;

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Landroidx/lifecycle/u0;

    .line 21
    .line 22
    if-eqz v2, :cond_7

    .line 23
    .line 24
    sget-object v3, Landroidx/lifecycle/k0;->c:Landroidx/lifecycle/q0;

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroid/os/Bundle;

    .line 31
    .line 32
    sget-object v4, Landroidx/lifecycle/q0;->g:Landroidx/lifecycle/q0;

    .line 33
    .line 34
    invoke-virtual {p0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/String;

    .line 39
    .line 40
    if-eqz p0, :cond_6

    .line 41
    .line 42
    invoke-interface {v0}, Ll1/e;->getSavedStateRegistry()Ll1/c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ll1/c;->b()Ll1/b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    instance-of v4, v0, Landroidx/lifecycle/l0;

    .line 51
    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    check-cast v0, Landroidx/lifecycle/l0;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object v0, v1

    .line 58
    :goto_0
    if-eqz v0, :cond_5

    .line 59
    .line 60
    invoke-static {v2}, Landroidx/lifecycle/k0;->e(Landroidx/lifecycle/u0;)Landroidx/lifecycle/m0;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v4, v2, Landroidx/lifecycle/m0;->d:Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    invoke-virtual {v4, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Landroidx/lifecycle/j0;

    .line 71
    .line 72
    if-nez v4, :cond_4

    .line 73
    .line 74
    sget-object v4, Landroidx/lifecycle/j0;->f:[Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/lifecycle/l0;->b()V

    .line 77
    .line 78
    .line 79
    iget-object v4, v0, Landroidx/lifecycle/l0;->c:Landroid/os/Bundle;

    .line 80
    .line 81
    if-eqz v4, :cond_1

    .line 82
    .line 83
    invoke-virtual {v4, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move-object v4, v1

    .line 89
    :goto_1
    iget-object v5, v0, Landroidx/lifecycle/l0;->c:Landroid/os/Bundle;

    .line 90
    .line 91
    if-eqz v5, :cond_2

    .line 92
    .line 93
    invoke-virtual {v5, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    iget-object v5, v0, Landroidx/lifecycle/l0;->c:Landroid/os/Bundle;

    .line 97
    .line 98
    if-eqz v5, :cond_3

    .line 99
    .line 100
    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const/4 v6, 0x1

    .line 105
    if-ne v5, v6, :cond_3

    .line 106
    .line 107
    iput-object v1, v0, Landroidx/lifecycle/l0;->c:Landroid/os/Bundle;

    .line 108
    .line 109
    :cond_3
    invoke-static {v4, v3}, Landroidx/lifecycle/k0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/j0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v1, v2, Landroidx/lifecycle/m0;->d:Ljava/util/LinkedHashMap;

    .line 114
    .line 115
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_4
    return-object v4

    .line 120
    :cond_5
    const-string p0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    .line 121
    .line 122
    invoke-static {p0}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v1

    .line 126
    :cond_6
    const-string p0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    .line 127
    .line 128
    invoke-static {p0}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v1

    .line 132
    :cond_7
    const-string p0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    .line 133
    .line 134
    invoke-static {p0}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v1

    .line 138
    :cond_8
    const-string p0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    .line 139
    .line 140
    invoke-static {p0}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-object v1
.end method

.method public static final d(Ll1/e;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Landroidx/lifecycle/t;->getLifecycle()Landroidx/lifecycle/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/lifecycle/v;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/lifecycle/v;->c:Landroidx/lifecycle/n;

    .line 8
    .line 9
    sget-object v1, Landroidx/lifecycle/n;->g:Landroidx/lifecycle/n;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Landroidx/lifecycle/n;->h:Landroidx/lifecycle/n;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "Failed requirement."

    .line 19
    .line 20
    invoke-static {p0}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    :goto_0
    invoke-interface {p0}, Ll1/e;->getSavedStateRegistry()Ll1/c;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ll1/c;->b()Ll1/b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    new-instance v0, Landroidx/lifecycle/l0;

    .line 35
    .line 36
    invoke-interface {p0}, Ll1/e;->getSavedStateRegistry()Ll1/c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    move-object v2, p0

    .line 41
    check-cast v2, Landroidx/lifecycle/u0;

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/l0;-><init>(Ll1/c;Landroidx/lifecycle/u0;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p0}, Ll1/e;->getSavedStateRegistry()Ll1/c;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 51
    .line 52
    invoke-virtual {v1, v2, v0}, Ll1/c;->c(Ljava/lang/String;Ll1/b;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p0}, Landroidx/lifecycle/t;->getLifecycle()Landroidx/lifecycle/o;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v1, Landroidx/lifecycle/SavedStateHandleAttacher;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Landroidx/lifecycle/l0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v1}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/s;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
.end method

.method public static final e(Landroidx/lifecycle/u0;)Landroidx/lifecycle/m0;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lr3/l;->a:Lr3/m;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Lr3/d;

    .line 12
    .line 13
    new-instance v1, Lf1/d;

    .line 14
    .line 15
    const-class v2, Landroidx/lifecycle/m0;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lf1/d;-><init>(Ljava/lang/Class;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    new-instance v1, La3/h0;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    new-array v3, v3, [Lf1/d;

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, [Lf1/d;

    .line 33
    .line 34
    array-length v3, v0

    .line 35
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, [Lf1/d;

    .line 40
    .line 41
    const/16 v3, 0xc

    .line 42
    .line 43
    invoke-direct {v1, v3, v0}, La3/h0;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Landroidx/emoji2/text/t;

    .line 47
    .line 48
    invoke-interface {p0}, Landroidx/lifecycle/u0;->getViewModelStore()Landroidx/lifecycle/t0;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    instance-of v4, p0, Landroidx/lifecycle/i;

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    check-cast p0, Landroidx/lifecycle/i;

    .line 57
    .line 58
    invoke-interface {p0}, Landroidx/lifecycle/i;->getDefaultViewModelCreationExtras()Lf1/b;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object p0, Lf1/a;->b:Lf1/a;

    .line 64
    .line 65
    :goto_0
    invoke-direct {v0, v3, v1, p0}, Landroidx/emoji2/text/t;-><init>(Landroidx/lifecycle/t0;Landroidx/lifecycle/s0;Lf1/b;)V

    .line 66
    .line 67
    .line 68
    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 69
    .line 70
    invoke-virtual {v0, p0, v2}, Landroidx/emoji2/text/t;->e(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/p0;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Landroidx/lifecycle/m0;

    .line 75
    .line 76
    return-object p0
.end method
