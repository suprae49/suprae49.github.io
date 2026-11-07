.class public final synthetic Lu1/t;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lu1/w;


# direct methods
.method public synthetic constructor <init>(Lu1/w;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu1/t;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lu1/t;->g:Lu1/w;

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
    iget v0, p0, Lu1/t;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/t;->g:Lu1/w;

    .line 7
    .line 8
    iget-object v0, v0, Lu1/w;->d:Lco/median/android/MainActivity;

    .line 9
    .line 10
    const-string v1, "medianGotStoragePermissions()"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Lu1/t;->g:Lu1/w;

    .line 18
    .line 19
    iget-object v0, v0, Lu1/w;->d:Lco/median/android/MainActivity;

    .line 20
    .line 21
    const-string v1, "medianGotStoragePermissions()"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v0, v1, v2}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
