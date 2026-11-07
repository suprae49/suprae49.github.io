.class public final Lz3/g;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Li3/f;


# instance fields
.field public final f:Lq3/l;

.field public final g:Li3/f;


# direct methods
.method public constructor <init>(Li3/f;Lq3/l;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lz3/g;->f:Lq3/l;

    .line 8
    .line 9
    instance-of p2, p1, Lz3/g;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    check-cast p1, Lz3/g;

    .line 14
    .line 15
    iget-object p1, p1, Lz3/g;->g:Li3/f;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lz3/g;->g:Li3/f;

    .line 18
    .line 19
    return-void
.end method
