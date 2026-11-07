.class public final Lp1/t;
.super Lp1/s;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:Lp/f;

.field public final synthetic b:Lp1/u;


# direct methods
.method public constructor <init>(Lp1/u;Lp/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp1/t;->b:Lp1/u;

    .line 5
    .line 6
    iput-object p2, p0, Lp1/t;->a:Lp/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lp1/r;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp1/t;->b:Lp1/u;

    .line 2
    .line 3
    iget-object v0, v0, Lp1/u;->g:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iget-object v1, p0, Lp1/t;->a:Lp/f;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lp1/r;->z(Lp1/p;)Lp1/r;

    .line 17
    .line 18
    .line 19
    return-void
.end method
