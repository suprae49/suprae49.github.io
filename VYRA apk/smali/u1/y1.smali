.class public final synthetic Lu1/y1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lu1/e2;


# direct methods
.method public synthetic constructor <init>(Lu1/e2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu1/y1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lu1/y1;->b:Lu1/e2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lu1/y1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lu1/y1;->b:Lu1/e2;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const-string v0, "u1.e2"

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, v1, Lu1/e2;->m:Z

    .line 20
    .line 21
    const-string p1, "Custom CSS Injection Success"

    .line 22
    .line 23
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p1, "Custom CSS Injection Failed"

    .line 28
    .line 29
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :pswitch_0
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-object v0, v1, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 38
    .line 39
    iput p1, v0, Lco/median/android/MainActivity;->E0:F

    .line 40
    .line 41
    iget v1, v0, Lco/median/android/MainActivity;->F0:F

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    cmpg-float v1, v1, v2

    .line 45
    .line 46
    if-gez v1, :cond_1

    .line 47
    .line 48
    iput p1, v0, Lco/median/android/MainActivity;->F0:F

    .line 49
    .line 50
    iget-object v0, v0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 51
    .line 52
    instance-of v1, v0, Lu1/o0;

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    check-cast v0, Lu1/o0;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lu1/o0;->setCurrentScale(F)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
