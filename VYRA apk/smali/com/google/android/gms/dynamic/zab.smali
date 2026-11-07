.class final Lcom/google/android/gms/dynamic/zab;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lcom/google/android/gms/dynamic/zah;


# instance fields
.field final synthetic zaa:Landroid/app/Activity;

.field final synthetic zab:Landroid/os/Bundle;

.field final synthetic zac:Landroid/os/Bundle;

.field final synthetic zad:Lcom/google/android/gms/dynamic/DeferredLifecycleHelper;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/dynamic/DeferredLifecycleHelper;Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/dynamic/zab;->zad:Lcom/google/android/gms/dynamic/DeferredLifecycleHelper;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/gms/dynamic/zab;->zaa:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/google/android/gms/dynamic/zab;->zab:Landroid/os/Bundle;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/google/android/gms/dynamic/zab;->zac:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final zaa()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final zab(Lcom/google/android/gms/dynamic/LifecycleDelegate;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/dynamic/zab;->zad:Lcom/google/android/gms/dynamic/DeferredLifecycleHelper;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/gms/dynamic/DeferredLifecycleHelper;->zaa(Lcom/google/android/gms/dynamic/DeferredLifecycleHelper;)Lcom/google/android/gms/dynamic/LifecycleDelegate;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/google/android/gms/dynamic/zab;->zaa:Landroid/app/Activity;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/gms/dynamic/zab;->zab:Landroid/os/Bundle;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/android/gms/dynamic/zab;->zac:Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/dynamic/LifecycleDelegate;->onInflate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
