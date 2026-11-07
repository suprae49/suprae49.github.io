.class public final synthetic Lu1/z1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lu1/e2;


# direct methods
.method public synthetic constructor <init>(Lu1/e2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu1/z1;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lu1/z1;->g:Lu1/e2;

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
    .locals 3

    .line 1
    iget v0, p0, Lu1/z1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/z1;->g:Lu1/e2;

    .line 7
    .line 8
    iget-object v0, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 9
    .line 10
    invoke-virtual {v0}, Lco/median/android/MainActivity;->m0()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lu1/z1;->g:Lu1/e2;

    .line 15
    .line 16
    iget-object v0, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-boolean v1, v0, Lco/median/android/MainActivity;->U:Z

    .line 23
    .line 24
    iput-boolean v1, v0, Lco/median/android/MainActivity;->g0:Z

    .line 25
    .line 26
    iget-object v1, v0, Lco/median/android/MainActivity;->V:Landroid/os/Handler;

    .line 27
    .line 28
    iget-object v2, v0, Lco/median/android/MainActivity;->Y:Lu1/x0;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, v0, Lco/median/android/MainActivity;->J:Landroid/view/View;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, Lco/median/android/MainActivity;->L:Lco/median/android/widget/MedianProgressView;

    .line 40
    .line 41
    const/high16 v1, 0x3f800000    # 1.0f

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x4

    .line 47
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
