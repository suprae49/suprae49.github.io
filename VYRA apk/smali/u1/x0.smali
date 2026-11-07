.class public final Lu1/x0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lco/median/android/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu1/x0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lu1/x0;->g:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lu1/x0;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/x0;->g:Lco/median/android/MainActivity;

    .line 7
    .line 8
    iget-object v1, v0, Lco/median/android/MainActivity;->o0:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->X(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Lco/median/android/MainActivity;->o0:Ljava/lang/String;

    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lu1/x0;->g:Lco/median/android/MainActivity;

    .line 21
    .line 22
    iget-object v0, v0, Lco/median/android/MainActivity;->M:Lco/median/android/MySwipeRefreshLayout;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Lw1/h;->setRefreshing(Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    new-instance v0, Landroidx/activity/k;

    .line 30
    .line 31
    const/16 v1, 0xd

    .line 32
    .line 33
    invoke-direct {v0, v1, p0}, Landroidx/activity/k;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lu1/x0;->g:Lco/median/android/MainActivity;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v1, Lco/median/android/MainActivity;->V:Landroid/os/Handler;

    .line 42
    .line 43
    iget-object v1, v1, Lco/median/android/MainActivity;->Y:Lu1/x0;

    .line 44
    .line 45
    const-wide/16 v2, 0x64

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
