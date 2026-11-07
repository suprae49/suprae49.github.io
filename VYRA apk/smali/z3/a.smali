.class public abstract Lz3/a;
.super Lz3/e0;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Li3/c;
.implements Lz3/j;


# instance fields
.field public final h:Li3/g;


# direct methods
.method public constructor <init>(Li3/g;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lz3/e0;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Lz3/i;->g:Lz3/i;

    .line 5
    .line 6
    invoke-interface {p1, p2}, Li3/g;->a(Li3/f;)Li3/e;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lz3/e0;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lz3/e0;->u(Lz3/e0;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Li3/g;->b(Li3/g;)Li3/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lz3/a;->h:Li3/g;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lz3/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lz3/e;

    .line 6
    .line 7
    sget-object v0, Lz3/e;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final d()Li3/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/a;->h:Li3/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lg3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lg3/c;

    .line 7
    .line 8
    iget-object v0, v0, Lg3/c;->f:Ljava/lang/Throwable;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    new-instance p1, Lz3/e;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lz3/e;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :goto_1
    invoke-virtual {p0, p1}, Lz3/e0;->x(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object v0, Lz3/l;->c:Landroidx/emoji2/text/r;

    .line 25
    .line 26
    if-ne p1, v0, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    invoke-virtual {p0, p1}, Lz3/a;->i(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, " was cancelled"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final t(Landroidx/fragment/app/z;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/a;->h:Li3/g;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz3/l;->c(Li3/g;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
