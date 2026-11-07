.class public final Lz3/d;
.super Lz3/b0;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lz3/c;


# instance fields
.field public final e:Lz3/e0;


# direct methods
.method public constructor <init>(Lz3/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb4/h;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz3/d;->e:Lz3/e0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz3/b0;->j()Lz3/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Lz3/e0;->j(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lz3/e0;->q()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    return p1
.end method

.method public final k()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lz3/d;->e:Lz3/e0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz3/b0;->j()Lz3/e0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lz3/e0;->j(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
