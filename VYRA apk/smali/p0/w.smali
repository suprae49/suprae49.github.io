.class public final Lp0/w;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lp0/v;


# direct methods
.method public constructor <init>(Landroidx/core/widget/NestedScrollView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x23

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lp0/u;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lp0/u;-><init>(Landroidx/core/widget/NestedScrollView;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lp0/w;->a:Lp0/v;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, La3/f;

    .line 19
    .line 20
    const/16 v0, 0x13

    .line 21
    .line 22
    invoke-direct {p1, v0}, La3/f;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lp0/w;->a:Lp0/v;

    .line 26
    .line 27
    return-void
.end method
