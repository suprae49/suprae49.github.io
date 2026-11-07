.class public Lf0/f;
.super Le4/a;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static o:Ljava/lang/Class; = null

.field public static p:Ljava/lang/reflect/Constructor; = null

.field public static q:Ljava/lang/reflect/Method; = null

.field public static r:Ljava/lang/reflect/Method; = null

.field public static s:Z = false


# instance fields
.field public final h:Ljava/lang/Class;

.field public final i:Ljava/lang/reflect/Constructor;

.field public final j:Ljava/lang/reflect/Method;

.field public final k:Ljava/lang/reflect/Method;

.field public final l:Ljava/lang/reflect/Method;

.field public final m:Ljava/lang/reflect/Method;

.field public final n:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Le4/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    const-string v1, "android.graphics.FontFamily"

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v1}, Lf0/f;->t0(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const-string v4, "addFontFromBuffer"

    .line 20
    .line 21
    const-class v5, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    const-class v7, [Landroid/graphics/fonts/FontVariationAxis;

    .line 26
    .line 27
    filled-new-array {v5, v6, v7, v6, v6}, [Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-string v5, "freeze"

    .line 36
    .line 37
    invoke-virtual {v1, v5, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const-string v6, "abortCreation"

    .line 42
    .line 43
    invoke-virtual {v1, v6, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {p0, v1}, Lf0/f;->u0(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    move-object v8, v1

    .line 52
    move-object v1, v0

    .line 53
    move-object v0, v8

    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception v1

    .line 56
    goto :goto_0

    .line 57
    :catch_1
    move-exception v1

    .line 58
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "Unable to collect necessary methods for class "

    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-string v3, "TypefaceCompatApi26Impl"

    .line 73
    .line 74
    invoke-static {v3, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 75
    .line 76
    .line 77
    move-object v1, v0

    .line 78
    move-object v2, v1

    .line 79
    move-object v3, v2

    .line 80
    move-object v4, v3

    .line 81
    move-object v5, v4

    .line 82
    move-object v6, v5

    .line 83
    :goto_1
    iput-object v0, p0, Lf0/f;->h:Ljava/lang/Class;

    .line 84
    .line 85
    iput-object v2, p0, Lf0/f;->i:Ljava/lang/reflect/Constructor;

    .line 86
    .line 87
    iput-object v3, p0, Lf0/f;->j:Ljava/lang/reflect/Method;

    .line 88
    .line 89
    iput-object v4, p0, Lf0/f;->k:Ljava/lang/reflect/Method;

    .line 90
    .line 91
    iput-object v5, p0, Lf0/f;->l:Ljava/lang/reflect/Method;

    .line 92
    .line 93
    iput-object v6, p0, Lf0/f;->m:Ljava/lang/reflect/Method;

    .line 94
    .line 95
    iput-object v1, p0, Lf0/f;->n:Ljava/lang/reflect/Method;

    .line 96
    .line 97
    return-void
.end method

.method public static p0(Ljava/lang/Object;Ljava/lang/String;IZ)Z
    .locals 1

    .line 1
    invoke-static {}, Lf0/f;->s0()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v0, Lf0/f;->q:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return p0

    .line 29
    :catch_0
    move-exception p0

    .line 30
    new-instance p1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public static s0()V
    .locals 8

    .line 1
    sget-boolean v0, Lf0/f;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lf0/f;->s:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_0
    const-string v2, "android.graphics.FontFamily"

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const-string v4, "addFontWeightStyle"

    .line 21
    .line 22
    const-class v5, Ljava/lang/String;

    .line 23
    .line 24
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    filled-new-array {v5, v6, v7}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-class v5, Landroid/graphics/Typeface;

    .line 41
    .line 42
    const-string v6, "createFromFamiliesWithDefault"

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v5, v6, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    move-object v0, v1

    .line 57
    move-object v1, v3

    .line 58
    goto :goto_1

    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto :goto_0

    .line 61
    :catch_1
    move-exception v0

    .line 62
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const-string v3, "TypefaceCompatApi21Impl"

    .line 71
    .line 72
    invoke-static {v3, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 73
    .line 74
    .line 75
    move-object v0, v1

    .line 76
    move-object v2, v0

    .line 77
    move-object v4, v2

    .line 78
    :goto_1
    sput-object v1, Lf0/f;->p:Ljava/lang/reflect/Constructor;

    .line 79
    .line 80
    sput-object v2, Lf0/f;->o:Ljava/lang/Class;

    .line 81
    .line 82
    sput-object v4, Lf0/f;->q:Ljava/lang/reflect/Method;

    .line 83
    .line 84
    sput-object v0, Lf0/f;->r:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    return-void
.end method

.method public static t0(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 8

    .line 1
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v7, [Landroid/graphics/fonts/FontVariationAxis;

    .line 4
    .line 5
    const-class v0, Landroid/content/res/AssetManager;

    .line 6
    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    move-object v5, v2

    .line 13
    move-object v6, v2

    .line 14
    filled-new-array/range {v0 .. v7}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "addFontFromAssetManager"

    .line 19
    .line 20
    invoke-virtual {p0, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method


# virtual methods
.method public final o(Landroid/content/Context;Le0/f;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .locals 10

    .line 1
    iget-object p2, p2, Le0/f;->a:[Le0/g;

    .line 2
    .line 3
    iget-object p4, p0, Lf0/f;->j:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    const-string v0, "TypefaceCompatApi26Impl"

    .line 8
    .line 9
    const-string v1, "Unable to collect necessary private methods. Fallback to legacy implementation."

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p4, :cond_5

    .line 17
    .line 18
    :try_start_0
    iget-object p3, p0, Lf0/f;->i:Ljava/lang/reflect/Constructor;

    .line 19
    .line 20
    invoke-virtual {p3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    move-object v4, p3

    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-object v4, v1

    .line 27
    :goto_0
    if-nez v4, :cond_1

    .line 28
    .line 29
    move-object v2, p0

    .line 30
    goto :goto_3

    .line 31
    :cond_1
    array-length p3, p2

    .line 32
    :goto_1
    if-ge v0, p3, :cond_3

    .line 33
    .line 34
    aget-object p4, p2, v0

    .line 35
    .line 36
    iget-object v5, p4, Le0/g;->a:Ljava/lang/String;

    .line 37
    .line 38
    iget v6, p4, Le0/g;->e:I

    .line 39
    .line 40
    iget v7, p4, Le0/g;->b:I

    .line 41
    .line 42
    iget-boolean v8, p4, Le0/g;->c:Z

    .line 43
    .line 44
    iget-object p4, p4, Le0/g;->d:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p4}, Landroid/graphics/fonts/FontVariationAxis;->fromFontVariationSettings(Ljava/lang/String;)[Landroid/graphics/fonts/FontVariationAxis;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    move-object v2, p0

    .line 51
    move-object v3, p1

    .line 52
    invoke-virtual/range {v2 .. v9}, Lf0/f;->o0(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    :try_start_1
    iget-object p1, v2, Lf0/f;->m:Ljava/lang/reflect/Method;

    .line 59
    .line 60
    invoke-virtual {p1, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    move-object p1, v3

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move-object v2, p0

    .line 69
    invoke-virtual {p0, v4}, Lf0/f;->r0(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    invoke-virtual {p0, v4}, Lf0/f;->q0(Ljava/lang/Object;)Landroid/graphics/Typeface;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_5
    move-object v2, p0

    .line 82
    move-object v3, p1

    .line 83
    invoke-static {}, Lf0/f;->s0()V

    .line 84
    .line 85
    .line 86
    :try_start_2
    sget-object p1, Lf0/f;->p:Ljava/lang/reflect/Constructor;

    .line 87
    .line 88
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_7

    .line 92
    array-length p4, p2

    .line 93
    move v4, v0

    .line 94
    :goto_2
    if-ge v4, p4, :cond_b

    .line 95
    .line 96
    aget-object v5, p2, v4

    .line 97
    .line 98
    invoke-static {v3}, Lu1/h0;->A(Landroid/content/Context;)Ljava/io/File;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    if-nez v6, :cond_6

    .line 103
    .line 104
    :catch_1
    :goto_3
    return-object v1

    .line 105
    :cond_6
    :try_start_3
    iget v7, v5, Le0/g;->f:I
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 106
    .line 107
    :try_start_4
    invoke-virtual {p3, v7}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 108
    .line 109
    .line 110
    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 111
    :try_start_5
    invoke-static {v6, v7}, Lu1/h0;->q(Ljava/io/File;Ljava/io/InputStream;)Z

    .line 112
    .line 113
    .line 114
    move-result v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 115
    if-eqz v7, :cond_7

    .line 116
    .line 117
    :try_start_6
    invoke-interface {v7}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 118
    .line 119
    .line 120
    :catch_2
    :cond_7
    if-nez v8, :cond_8

    .line 121
    .line 122
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 123
    .line 124
    .line 125
    return-object v1

    .line 126
    :cond_8
    :try_start_7
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    iget v8, v5, Le0/g;->b:I

    .line 131
    .line 132
    iget-boolean v5, v5, Le0/g;->c:Z

    .line 133
    .line 134
    invoke-static {p1, v7, v8, v5}, Lf0/f;->p0(Ljava/lang/Object;Ljava/lang/String;IZ)Z

    .line 135
    .line 136
    .line 137
    move-result v5
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 138
    if-nez v5, :cond_9

    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 141
    .line 142
    .line 143
    return-object v1

    .line 144
    :cond_9
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 145
    .line 146
    .line 147
    add-int/lit8 v4, v4, 0x1

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    move-object p1, v0

    .line 152
    goto :goto_6

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    :goto_4
    move-object p1, v0

    .line 155
    goto :goto_5

    .line 156
    :catchall_2
    move-exception v0

    .line 157
    move-object v7, v1

    .line 158
    goto :goto_4

    .line 159
    :goto_5
    if-eqz v7, :cond_a

    .line 160
    .line 161
    :try_start_8
    invoke-interface {v7}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 162
    .line 163
    .line 164
    :catch_3
    :cond_a
    :try_start_9
    throw p1
    :try_end_9
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 165
    :goto_6
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 166
    .line 167
    .line 168
    throw p1

    .line 169
    :catch_4
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 170
    .line 171
    .line 172
    return-object v1

    .line 173
    :cond_b
    invoke-static {}, Lf0/f;->s0()V

    .line 174
    .line 175
    .line 176
    :try_start_a
    sget-object p2, Lf0/f;->o:Ljava/lang/Class;

    .line 177
    .line 178
    const/4 p3, 0x1

    .line 179
    invoke-static {p2, p3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-static {p2, v0, p1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    sget-object p1, Lf0/f;->r:Ljava/lang/reflect/Method;

    .line 187
    .line 188
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-virtual {p1, v1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Landroid/graphics/Typeface;
    :try_end_a
    .catch Ljava/lang/IllegalAccessException; {:try_start_a .. :try_end_a} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_a .. :try_end_a} :catch_5

    .line 197
    .line 198
    return-object p1

    .line 199
    :catch_5
    move-exception v0

    .line 200
    :goto_7
    move-object p1, v0

    .line 201
    goto :goto_8

    .line 202
    :catch_6
    move-exception v0

    .line 203
    goto :goto_7

    .line 204
    :goto_8
    new-instance p2, Ljava/lang/RuntimeException;

    .line 205
    .line 206
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    throw p2

    .line 210
    :catch_7
    move-exception v0

    .line 211
    :goto_9
    move-object p1, v0

    .line 212
    goto :goto_a

    .line 213
    :catch_8
    move-exception v0

    .line 214
    goto :goto_9

    .line 215
    :catch_9
    move-exception v0

    .line 216
    goto :goto_9

    .line 217
    :goto_a
    new-instance p2, Ljava/lang/RuntimeException;

    .line 218
    .line 219
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    throw p2
.end method

.method public final o0(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lf0/f;->j:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    move-object v3, p3

    .line 27
    move-object/from16 v9, p7

    .line 28
    .line 29
    filled-new-array/range {v2 .. v9}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v1, p2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    return p1

    .line 44
    :catch_0
    return v0
.end method

.method public final p(Landroid/content/Context;[Ll0/i;I)Landroid/graphics/Typeface;
    .locals 12

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ge v0, v2, :cond_0

    .line 5
    .line 6
    goto/16 :goto_b

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lf0/f;->j:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v3, "TypefaceCompatApi26Impl"

    .line 13
    .line 14
    const-string v4, "Unable to collect necessary private methods. Fallback to legacy implementation."

    .line 15
    .line 16
    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v3, 0x0

    .line 20
    if-eqz v0, :cond_c

    .line 21
    .line 22
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    array-length v4, p2

    .line 28
    move v5, v3

    .line 29
    :goto_0
    if-ge v5, v4, :cond_4

    .line 30
    .line 31
    aget-object v6, p2, v5

    .line 32
    .line 33
    iget v7, v6, Ll0/i;->f:I

    .line 34
    .line 35
    if-eqz v7, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v6, v6, Ll0/i;->a:Landroid/net/Uri;

    .line 39
    .line 40
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    invoke-static {p1, v6}, Lu1/h0;->L(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :try_start_0
    iget-object v0, p0, Lf0/f;->i:Ljava/lang/reflect/Constructor;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_2

    .line 68
    :catch_0
    move-object v0, v1

    .line 69
    :goto_2
    if-nez v0, :cond_5

    .line 70
    .line 71
    goto/16 :goto_b

    .line 72
    .line 73
    :cond_5
    array-length v4, p2

    .line 74
    move v5, v3

    .line 75
    move v6, v5

    .line 76
    :goto_3
    iget-object v7, p0, Lf0/f;->m:Ljava/lang/reflect/Method;

    .line 77
    .line 78
    if-ge v5, v4, :cond_8

    .line 79
    .line 80
    aget-object v8, p2, v5

    .line 81
    .line 82
    iget-object v9, v8, Ll0/i;->a:Landroid/net/Uri;

    .line 83
    .line 84
    invoke-interface {p1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    check-cast v9, Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    if-nez v9, :cond_6

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_6
    iget v6, v8, Ll0/i;->b:I

    .line 94
    .line 95
    iget v10, v8, Ll0/i;->c:I

    .line 96
    .line 97
    iget-boolean v8, v8, Ll0/i;->d:Z

    .line 98
    .line 99
    :try_start_1
    iget-object v11, p0, Lf0/f;->k:Ljava/lang/reflect/Method;

    .line 100
    .line 101
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    filled-new-array {v9, v6, v1, v10, v8}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-virtual {v11, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    check-cast v6, Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 124
    .line 125
    .line 126
    move-result v6
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 127
    goto :goto_4

    .line 128
    :catch_1
    move v6, v3

    .line 129
    :goto_4
    if-nez v6, :cond_7

    .line 130
    .line 131
    :try_start_2
    invoke-virtual {v7, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    goto/16 :goto_b

    .line 135
    .line 136
    :cond_7
    move v6, v2

    .line 137
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    if-nez v6, :cond_9

    .line 141
    .line 142
    invoke-virtual {v7, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_2

    .line 143
    .line 144
    .line 145
    goto/16 :goto_b

    .line 146
    .line 147
    :cond_9
    invoke-virtual {p0, v0}, Lf0/f;->r0(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-nez p1, :cond_a

    .line 152
    .line 153
    goto/16 :goto_b

    .line 154
    .line 155
    :cond_a
    invoke-virtual {p0, v0}, Lf0/f;->q0(Ljava/lang/Object;)Landroid/graphics/Typeface;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-nez p1, :cond_b

    .line 160
    .line 161
    goto/16 :goto_b

    .line 162
    .line 163
    :cond_b
    invoke-static {p1, p3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1

    .line 168
    :cond_c
    and-int/lit8 v0, p3, 0x1

    .line 169
    .line 170
    if-nez v0, :cond_d

    .line 171
    .line 172
    const/16 v0, 0x190

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_d
    const/16 v0, 0x2bc

    .line 176
    .line 177
    :goto_6
    and-int/lit8 p3, p3, 0x2

    .line 178
    .line 179
    if-eqz p3, :cond_e

    .line 180
    .line 181
    move p3, v2

    .line 182
    goto :goto_7

    .line 183
    :cond_e
    move p3, v3

    .line 184
    :goto_7
    array-length v4, p2

    .line 185
    const v5, 0x7fffffff

    .line 186
    .line 187
    .line 188
    move-object v7, v1

    .line 189
    move v6, v3

    .line 190
    :goto_8
    if-ge v6, v4, :cond_12

    .line 191
    .line 192
    aget-object v8, p2, v6

    .line 193
    .line 194
    iget v9, v8, Ll0/i;->c:I

    .line 195
    .line 196
    sub-int/2addr v9, v0

    .line 197
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    mul-int/lit8 v9, v9, 0x2

    .line 202
    .line 203
    iget-boolean v10, v8, Ll0/i;->d:Z

    .line 204
    .line 205
    if-ne v10, p3, :cond_f

    .line 206
    .line 207
    move v10, v3

    .line 208
    goto :goto_9

    .line 209
    :cond_f
    move v10, v2

    .line 210
    :goto_9
    add-int/2addr v9, v10

    .line 211
    if-eqz v7, :cond_10

    .line 212
    .line 213
    if-le v5, v9, :cond_11

    .line 214
    .line 215
    :cond_10
    move-object v7, v8

    .line 216
    move v5, v9

    .line 217
    :cond_11
    add-int/lit8 v6, v6, 0x1

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_12
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    :try_start_3
    iget-object p2, v7, Ll0/i;->a:Landroid/net/Uri;

    .line 225
    .line 226
    const-string p3, "r"

    .line 227
    .line 228
    invoke-virtual {p1, p2, p3, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    if-nez p1, :cond_13

    .line 233
    .line 234
    if-eqz p1, :cond_14

    .line 235
    .line 236
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 237
    .line 238
    .line 239
    return-object v1

    .line 240
    :cond_13
    :try_start_4
    new-instance p2, Landroid/graphics/Typeface$Builder;

    .line 241
    .line 242
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 243
    .line 244
    .line 245
    move-result-object p3

    .line 246
    invoke-direct {p2, p3}, Landroid/graphics/Typeface$Builder;-><init>(Ljava/io/FileDescriptor;)V

    .line 247
    .line 248
    .line 249
    iget p3, v7, Ll0/i;->c:I

    .line 250
    .line 251
    invoke-virtual {p2, p3}, Landroid/graphics/Typeface$Builder;->setWeight(I)Landroid/graphics/Typeface$Builder;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    iget-boolean p3, v7, Ll0/i;->d:Z

    .line 256
    .line 257
    invoke-virtual {p2, p3}, Landroid/graphics/Typeface$Builder;->setItalic(Z)Landroid/graphics/Typeface$Builder;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-virtual {p2}, Landroid/graphics/Typeface$Builder;->build()Landroid/graphics/Typeface;

    .line 262
    .line 263
    .line 264
    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 265
    :try_start_5
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 266
    .line 267
    .line 268
    return-object p2

    .line 269
    :catchall_0
    move-exception p2

    .line 270
    :try_start_6
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 271
    .line 272
    .line 273
    goto :goto_a

    .line 274
    :catchall_1
    move-exception p1

    .line 275
    :try_start_7
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    :goto_a
    throw p2
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 279
    :catch_2
    :cond_14
    :goto_b
    return-object v1
.end method

.method public q0(Ljava/lang/Object;)Landroid/graphics/Typeface;
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    iget-object v2, p0, Lf0/f;->h:Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-static {v2, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v2, v3, p1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lf0/f;->n:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    filled-new-array {v2, v0, v0}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    return-object p1

    .line 31
    :catch_0
    return-object v1
.end method

.method public final r(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;)Landroid/graphics/Typeface;
    .locals 10

    .line 1
    iget-object v0, p0, Lf0/f;->j:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v1, "TypefaceCompatApi26Impl"

    .line 6
    .line 7
    const-string v2, "Unable to collect necessary private methods. Fallback to legacy implementation."

    .line 8
    .line 9
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    :try_start_0
    iget-object p2, p0, Lf0/f;->i:Ljava/lang/reflect/Constructor;

    .line 16
    .line 17
    invoke-virtual {p2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    move-object v4, p2

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-object v4, v1

    .line 24
    :goto_0
    if-nez v4, :cond_1

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v8, -0x1

    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, -0x1

    .line 32
    move-object v2, p0

    .line 33
    move-object v3, p1

    .line 34
    move-object v5, p4

    .line 35
    invoke-virtual/range {v2 .. v9}, Lf0/f;->o0(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    :try_start_1
    iget-object p1, v2, Lf0/f;->m:Ljava/lang/reflect/Method;

    .line 42
    .line 43
    invoke-virtual {p1, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {p0, v4}, Lf0/f;->r0(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-virtual {p0, v4}, Lf0/f;->q0(Ljava/lang/Object;)Landroid/graphics/Typeface;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :cond_4
    move-object v2, p0

    .line 60
    move-object v3, p1

    .line 61
    invoke-static {v3}, Lu1/h0;->A(Landroid/content/Context;)Ljava/io/File;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-nez p1, :cond_5

    .line 66
    .line 67
    :catch_1
    :goto_1
    return-object v1

    .line 68
    :cond_5
    :try_start_2
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 69
    .line 70
    .line 71
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 72
    :try_start_3
    invoke-static {p1, p2}, Lu1/h0;->q(Ljava/io/File;Ljava/io/InputStream;)Z

    .line 73
    .line 74
    .line 75
    move-result p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 76
    if-eqz p2, :cond_6

    .line 77
    .line 78
    :try_start_4
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 79
    .line 80
    .line 81
    :catch_2
    :cond_6
    if-nez p3, :cond_7

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_7
    :try_start_5
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 92
    .line 93
    .line 94
    move-result-object p2
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 95
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 96
    .line 97
    .line 98
    return-object p2

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    move-object p2, v0

    .line 101
    goto :goto_4

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    :goto_2
    move-object p3, v0

    .line 104
    goto :goto_3

    .line 105
    :catchall_2
    move-exception v0

    .line 106
    move-object p2, v1

    .line 107
    goto :goto_2

    .line 108
    :goto_3
    if-eqz p2, :cond_8

    .line 109
    .line 110
    :try_start_6
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 111
    .line 112
    .line 113
    :catch_3
    :cond_8
    :try_start_7
    throw p3
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 114
    :goto_4
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 115
    .line 116
    .line 117
    throw p2

    .line 118
    :catch_4
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 119
    .line 120
    .line 121
    return-object v1
.end method

.method public final r0(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lf0/f;->l:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return p1

    .line 15
    :catch_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method public u0(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    filled-new-array {p1, v1, v1}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-class v1, Landroid/graphics/Typeface;

    .line 17
    .line 18
    const-string v2, "createFromFamiliesWithDefault"

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method
