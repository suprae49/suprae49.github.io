.class public final synthetic Lu1/v0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lm0/g;
.implements Lb/b;
.implements Lu1/i1;
.implements Lu1/m0;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lco/median/android/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu1/v0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lu1/v0;->g:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lu1/v0;->f:I

    .line 2
    .line 3
    iget-object v1, p0, Lu1/v0;->g:Lco/median/android/MainActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 9
    .line 10
    sget p1, Lco/median/android/MainActivity;->G0:I

    .line 11
    .line 12
    const-string p1, "median_appbrowser_closed"

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {p1, v0}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v1, p1, v0}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object p1, v1, Lco/median/android/MainActivity;->u0:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {v1, p1, v0}, Lco/median/android/MainActivity;->U(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/v0;->g:Lco/median/android/MainActivity;

    .line 2
    .line 3
    iget-boolean v0, v0, Lco/median/android/MainActivity;->w0:Z

    .line 4
    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    return v0
.end method
