.class public final Lu1/z0;
.super Landroid/telephony/PhoneStateListener;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:Lco/median/android/MainActivity;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/z0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/z0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    iput-object p1, v0, Lco/median/android/MainActivity;->q0:Landroid/telephony/SignalStrength;

    .line 4
    .line 5
    iget-object p1, v0, Lco/median/android/MainActivity;->o0:Ljava/lang/String;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Lco/median/android/MainActivity;->X(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-object p1, v0, Lco/median/android/MainActivity;->o0:Ljava/lang/String;

    .line 15
    .line 16
    :goto_0
    iget-object p1, v0, Lco/median/android/MainActivity;->n0:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lco/median/android/MainActivity;->X(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method
