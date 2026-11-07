.class public final enum Lx1/d;
.super Ljava/lang/Enum;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final g:Ljava/util/LinkedHashMap;

.field public static final enum h:Lx1/d;

.field public static final synthetic i:[Lx1/d;


# instance fields
.field public final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lx1/d;

    .line 2
    .line 3
    const-string v1, "no_cache"

    .line 4
    .line 5
    const-string v2, "NO_CACHE"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lx1/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lx1/d;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-string v4, "cache_only"

    .line 15
    .line 16
    const-string v5, "CACHE_ONLY"

    .line 17
    .line 18
    invoke-direct {v1, v5, v2, v4}, Lx1/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lx1/d;

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    const-string v5, "cache_else_network"

    .line 25
    .line 26
    const-string v6, "CACHE_ELSE_NETWORK"

    .line 27
    .line 28
    invoke-direct {v2, v6, v4, v5}, Lx1/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lx1/d;

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    const-string v6, "default"

    .line 35
    .line 36
    const-string v7, "DEFAULT"

    .line 37
    .line 38
    invoke-direct {v4, v7, v5, v6}, Lx1/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object v4, Lx1/d;->h:Lx1/d;

    .line 42
    .line 43
    filled-new-array {v0, v1, v2, v4}, [Lx1/d;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lx1/d;->i:[Lx1/d;

    .line 48
    .line 49
    invoke-static {}, Lx1/d;->values()[Lx1/d;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    array-length v1, v0

    .line 54
    invoke-static {v1}, Lh3/p;->o0(I)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/16 v2, 0x10

    .line 59
    .line 60
    if-ge v1, v2, :cond_0

    .line 61
    .line 62
    move v1, v2

    .line 63
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 66
    .line 67
    .line 68
    array-length v1, v0

    .line 69
    :goto_0
    if-ge v3, v1, :cond_1

    .line 70
    .line 71
    aget-object v4, v0, v3

    .line 72
    .line 73
    iget-object v5, v4, Lx1/d;->f:Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    sput-object v2, Lx1/d;->g:Ljava/util/LinkedHashMap;

    .line 82
    .line 83
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lx1/d;->f:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final a(Ljava/lang/String;)Lx1/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lx1/d;->g:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lx1/d;

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    sget-object p0, Lx1/d;->h:Lx1/d;

    .line 15
    .line 16
    :cond_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lx1/d;
    .locals 1

    .line 1
    const-class v0, Lx1/d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lx1/d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lx1/d;
    .locals 1

    .line 1
    sget-object v0, Lx1/d;->i:[Lx1/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lx1/d;

    .line 8
    .line 9
    return-object v0
.end method
