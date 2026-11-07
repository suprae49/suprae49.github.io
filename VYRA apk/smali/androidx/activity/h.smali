.class public final synthetic Landroidx/activity/h;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroidx/lifecycle/r;


# instance fields
.field public final synthetic f:Landroidx/activity/j0;

.field public final synthetic g:Landroidx/fragment/app/e0;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/j0;Landroidx/fragment/app/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/h;->f:Landroidx/activity/j0;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/h;->g:Landroidx/fragment/app/e0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/t;Landroidx/lifecycle/m;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/activity/i;->a:Landroidx/activity/i;

    .line 6
    .line 7
    iget-object p2, p0, Landroidx/activity/h;->g:Landroidx/fragment/app/e0;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroidx/activity/i;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Landroidx/activity/h;->f:Landroidx/activity/j0;

    .line 17
    .line 18
    iput-object p1, p2, Landroidx/activity/j0;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 19
    .line 20
    iget-boolean p1, p2, Landroidx/activity/j0;->g:Z

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Landroidx/activity/j0;->e(Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
