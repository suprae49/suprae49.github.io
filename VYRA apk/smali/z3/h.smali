.class public abstract Lz3/h;
.super Li3/a;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Li3/e;


# static fields
.field public static final g:Lz3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lz3/g;

    .line 2
    .line 3
    new-instance v1, Lu1/q;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v1, v2}, Lu1/q;-><init>(I)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Li3/d;->f:Li3/d;

    .line 10
    .line 11
    invoke-direct {v0, v2, v1}, Lz3/g;-><init>(Li3/f;Lq3/l;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lz3/h;->g:Lz3/g;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Li3/d;->f:Li3/d;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Li3/a;-><init>(Li3/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Li3/f;)Li3/e;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lz3/g;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    check-cast p1, Lz3/g;

    .line 10
    .line 11
    iget-object v0, p0, Li3/a;->f:Li3/f;

    .line 12
    .line 13
    if-eq v0, p1, :cond_1

    .line 14
    .line 15
    iget-object v2, p1, Lz3/g;->g:Li3/f;

    .line 16
    .line 17
    if-ne v2, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object v1

    .line 21
    :cond_1
    :goto_0
    iget-object p1, p1, Lz3/g;->f:Lq3/l;

    .line 22
    .line 23
    invoke-interface {p1, p0}, Lq3/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Li3/e;

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_2
    sget-object v0, Li3/d;->f:Li3/d;

    .line 33
    .line 34
    if-ne v0, p1, :cond_3

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    return-object v1
.end method

.method public abstract c(Li3/g;Ljava/lang/Runnable;)V
.end method

.method public d(Li3/g;)Z
    .locals 0

    .line 1
    instance-of p1, p0, Lz3/j0;

    .line 2
    .line 3
    xor-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    return p1
.end method

.method public e(I)Lz3/h;
    .locals 1

    .line 1
    invoke-static {p1}, Lb4/d;->a(I)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb4/e;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lb4/e;-><init>(Lz3/h;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final f(Li3/f;)Li3/g;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lz3/g;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    check-cast p1, Lz3/g;

    .line 9
    .line 10
    iget-object v0, p0, Li3/a;->f:Li3/f;

    .line 11
    .line 12
    if-eq v0, p1, :cond_1

    .line 13
    .line 14
    iget-object v1, p1, Lz3/g;->g:Li3/f;

    .line 15
    .line 16
    if-ne v1, v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object p0

    .line 20
    :cond_1
    :goto_0
    iget-object p1, p1, Lz3/g;->f:Lq3/l;

    .line 21
    .line 22
    invoke-interface {p1, p0}, Lq3/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Li3/e;

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    sget-object v0, Li3/d;->f:Li3/d;

    .line 32
    .line 33
    if-ne v0, p1, :cond_3

    .line 34
    .line 35
    :goto_1
    sget-object p1, Li3/h;->f:Li3/h;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x40

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lz3/l;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method
