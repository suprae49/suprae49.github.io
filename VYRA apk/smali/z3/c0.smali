.class public final Lz3/c0;
.super Lz3/b0;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final e:Lz3/e0;

.field public final f:Lz3/d0;

.field public final g:Lz3/d;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lz3/e0;Lz3/d0;Lz3/d;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb4/h;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz3/c0;->e:Lz3/e0;

    .line 5
    .line 6
    iput-object p2, p0, Lz3/c0;->f:Lz3/d0;

    .line 7
    .line 8
    iput-object p3, p0, Lz3/c0;->g:Lz3/d;

    .line 9
    .line 10
    iput-object p4, p0, Lz3/c0;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final k()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lz3/c0;->g:Lz3/d;

    .line 2
    .line 3
    invoke-static {p1}, Lz3/e0;->y(Lb4/h;)Lz3/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lz3/c0;->e:Lz3/e0;

    .line 8
    .line 9
    iget-object v2, p0, Lz3/c0;->f:Lz3/d0;

    .line 10
    .line 11
    iget-object v3, p0, Lz3/c0;->h:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v2, v0, v3}, Lz3/e0;->G(Lz3/d0;Lz3/d;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, v2, Lz3/d0;->a:Lz3/f0;

    .line 23
    .line 24
    new-instance v4, Lb4/f;

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-direct {v4, v5}, Lb4/f;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v4, v5}, Lb4/h;->e(Lb4/h;I)Z

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lz3/e0;->y(Lb4/h;)Lz3/d;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1, v2, p1, v3}, Lz3/e0;->G(Lz3/d0;Lz3/d;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :cond_1
    invoke-virtual {v1, v2, v3}, Lz3/e0;->o(Lz3/d0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v1, p1}, Lz3/e0;->h(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
