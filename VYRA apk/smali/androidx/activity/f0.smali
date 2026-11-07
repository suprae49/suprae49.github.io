.class public final Landroidx/activity/f0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lq3/l;

.field public final synthetic b:Lq3/l;

.field public final synthetic c:Lq3/a;

.field public final synthetic d:Lq3/a;


# direct methods
.method public constructor <init>(Lq3/l;Lq3/l;Lq3/a;Lq3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/f0;->a:Lq3/l;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/f0;->b:Lq3/l;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/activity/f0;->c:Lq3/a;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/activity/f0;->d:Lq3/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/f0;->d:Lq3/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lq3/a;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/f0;->c:Lq3/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lq3/a;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/activity/b;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Landroidx/activity/f0;->b:Lq3/l;

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lq3/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/activity/b;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Landroidx/activity/f0;->a:Lq3/l;

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lq3/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method
