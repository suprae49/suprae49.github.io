.class public final Lr3/d;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lr3/c;


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    const-class v22, Lq3/n;

    .line 2
    .line 3
    const-class v23, Lq3/o;

    .line 4
    .line 5
    const-class v1, Lq3/a;

    .line 6
    .line 7
    const-class v2, Lq3/l;

    .line 8
    .line 9
    const-class v3, Lq3/p;

    .line 10
    .line 11
    const-class v4, Lq3/q;

    .line 12
    .line 13
    const-class v5, Lq3/r;

    .line 14
    .line 15
    const-class v6, Lq3/s;

    .line 16
    .line 17
    const-class v7, Lq3/t;

    .line 18
    .line 19
    const-class v8, Lq3/u;

    .line 20
    .line 21
    const-class v9, Lq3/v;

    .line 22
    .line 23
    const-class v10, Lq3/w;

    .line 24
    .line 25
    const-class v11, Lq3/b;

    .line 26
    .line 27
    const-class v12, Lq3/c;

    .line 28
    .line 29
    const-class v13, Lq3/d;

    .line 30
    .line 31
    const-class v14, Lq3/e;

    .line 32
    .line 33
    const-class v15, Lq3/f;

    .line 34
    .line 35
    const-class v16, Lq3/g;

    .line 36
    .line 37
    const-class v17, Lq3/h;

    .line 38
    .line 39
    const-class v18, Lq3/i;

    .line 40
    .line 41
    const-class v19, Lq3/j;

    .line 42
    .line 43
    const-class v20, Lq3/k;

    .line 44
    .line 45
    const-class v21, Lq3/m;

    .line 46
    .line 47
    filled-new-array/range {v1 .. v23}, [Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-static {v0}, Lh3/g;->u0(Ljava/lang/Iterable;)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v2, 0x0

    .line 72
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    add-int/lit8 v4, v2, 0x1

    .line 83
    .line 84
    if-ltz v2, :cond_0

    .line 85
    .line 86
    check-cast v3, Ljava/lang/Class;

    .line 87
    .line 88
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    new-instance v5, Lg3/b;

    .line 93
    .line 94
    invoke-direct {v5, v3, v2}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move v2, v4

    .line 101
    goto :goto_0

    .line 102
    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 103
    .line 104
    const-string v1, "Index overflow has happened."

    .line 105
    .line 106
    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v0

    .line 110
    :cond_1
    invoke-static {v1}, Lh3/p;->p0(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr3/d;->a:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lr3/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Le4/a;->C(Lr3/d;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast p1, Lr3/d;

    .line 10
    .line 11
    invoke-static {p1}, Le4/a;->C(Lr3/d;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    invoke-static {p0}, Le4/a;->C(Lr3/d;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr3/d;->a:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " (Kotlin reflection is not available)"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method
