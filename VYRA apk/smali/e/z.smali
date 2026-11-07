.class public final Le/z;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Le/z;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Le/z;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget p1, p0, Le/z;->a:I

    .line 2
    .line 3
    iget-object p2, p0, Le/z;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p2, Lco/median/android/MainActivity;

    .line 9
    .line 10
    sget p1, Lco/median/android/MainActivity;->G0:I

    .line 11
    .line 12
    invoke-virtual {p2}, Lco/median/android/MainActivity;->T()V

    .line 13
    .line 14
    .line 15
    iget-object p1, p2, Lco/median/android/MainActivity;->n0:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Lco/median/android/MainActivity;->X(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    check-cast p2, Le/a0;

    .line 24
    .line 25
    invoke-virtual {p2}, Le/a0;->j()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
