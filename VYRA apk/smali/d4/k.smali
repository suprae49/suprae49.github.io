.class public final Ld4/k;
.super Lz3/h;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final h:Ld4/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ld4/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lz3/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld4/k;->h:Ld4/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Li3/g;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p1, Ld4/e;->i:Ld4/e;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p1, p1, Ld4/e;->h:Ld4/c;

    .line 5
    .line 6
    invoke-virtual {p1, p2, v0}, Ld4/c;->b(Ljava/lang/Runnable;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final e(I)Lz3/h;
    .locals 1

    .line 1
    invoke-static {p1}, Lb4/d;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Ld4/j;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lz3/h;->e(I)Lz3/h;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object v0
.end method
