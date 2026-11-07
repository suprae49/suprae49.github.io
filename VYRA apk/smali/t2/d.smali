.class public final Lt2/d;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lt2/b;

.field public final synthetic b:Lt2/e;


# direct methods
.method public constructor <init>(Lt2/e;Lt2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt2/d;->b:Lt2/e;

    .line 5
    .line 6
    iput-object p2, p0, Lt2/d;->a:Lt2/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt2/d;->b:Lt2/e;

    .line 2
    .line 3
    iget-object v0, v0, Lt2/c;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lt2/d;->a:Lt2/b;

    .line 8
    .line 9
    invoke-interface {v0}, Lt2/b;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt2/d;->a:Lt2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lt2/b;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt2/d;->b:Lt2/e;

    .line 2
    .line 3
    iget-object v0, v0, Lt2/c;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/activity/b;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lt2/d;->a:Lt2/b;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lt2/b;->c(Landroidx/activity/b;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt2/d;->b:Lt2/e;

    .line 2
    .line 3
    iget-object v0, v0, Lt2/c;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/activity/b;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lt2/d;->a:Lt2/b;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lt2/b;->b(Landroidx/activity/b;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
