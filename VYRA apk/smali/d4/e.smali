.class public final Ld4/e;
.super Lz3/v;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final i:Ld4/e;


# instance fields
.field public h:Ld4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ld4/e;

    .line 2
    .line 3
    sget v2, Ld4/j;->c:I

    .line 4
    .line 5
    sget v3, Ld4/j;->d:I

    .line 6
    .line 7
    sget-wide v4, Ld4/j;->e:J

    .line 8
    .line 9
    sget-object v6, Ld4/j;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0}, Lz3/h;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ld4/c;

    .line 15
    .line 16
    invoke-direct/range {v1 .. v6}, Ld4/c;-><init>(IIJLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Ld4/e;->h:Ld4/c;

    .line 20
    .line 21
    sput-object v0, Ld4/e;->i:Ld4/e;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final c(Li3/g;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ld4/e;->h:Ld4/c;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, p2, v0}, Ld4/c;->b(Ljava/lang/Runnable;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final close()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Dispatchers.Default cannot be closed"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.Default"

    .line 2
    .line 3
    return-object v0
.end method
