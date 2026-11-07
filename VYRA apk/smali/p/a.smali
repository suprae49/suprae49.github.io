.class public final Lp/a;
.super Ljava/util/AbstractSet;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic f:Lp/f;


# direct methods
.method public constructor <init>(Lp/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp/a;->f:Lp/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lp/d;

    .line 2
    .line 3
    iget-object v1, p0, Lp/a;->f:Lp/f;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lp/d;-><init>(Lp/f;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lp/a;->f:Lp/f;

    .line 2
    .line 3
    iget v0, v0, Lp/k;->h:I

    .line 4
    .line 5
    return v0
.end method
