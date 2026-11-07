.class public final Ld4/d;
.super Lz3/v;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final h:Ld4/d;

.field public static final i:Lz3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ld4/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lz3/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld4/d;->h:Ld4/d;

    .line 7
    .line 8
    sget-object v0, Ld4/k;->h:Ld4/k;

    .line 9
    .line 10
    sget v1, Lb4/p;->a:I

    .line 11
    .line 12
    const/16 v2, 0x40

    .line 13
    .line 14
    if-ge v2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v2

    .line 18
    :goto_0
    const/16 v2, 0xc

    .line 19
    .line 20
    const-string v3, "kotlinx.coroutines.io.parallelism"

    .line 21
    .line 22
    invoke-static {v3, v1, v2}, Lb4/d;->f(Ljava/lang/String;II)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Ld4/k;->e(I)Lz3/h;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Ld4/d;->i:Lz3/h;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final c(Li3/g;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object v0, Ld4/d;->i:Lz3/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lz3/h;->c(Li3/g;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final close()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "Cannot be invoked on Dispatchers.IO"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object v0, Li3/h;->f:Li3/h;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Ld4/d;->c(Li3/g;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object v0
.end method
