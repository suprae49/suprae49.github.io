.class public final synthetic Lu1/q0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq3/l;


# instance fields
.field public final synthetic f:Lu1/r0;


# direct methods
.method public synthetic constructor <init>(Lu1/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/q0;->f:Lu1/r0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/location/LocationSettingsResponse;

    .line 2
    .line 3
    iget-object p1, p0, Lu1/q0;->f:Lu1/r0;

    .line 4
    .line 5
    iget-object p1, p1, Lu1/r0;->b:Lu1/y;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, Lu1/y;->a(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    sget-object p1, Lg3/g;->a:Lg3/g;

    .line 14
    .line 15
    return-object p1
.end method
