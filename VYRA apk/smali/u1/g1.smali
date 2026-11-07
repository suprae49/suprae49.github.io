.class public final Lu1/g1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:Lu1/x;


# direct methods
.method public constructor <init>(Lu1/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/g1;->a:Lu1/x;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final print()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lu1/g1;->a:Lu1/x;

    .line 2
    .line 3
    iget-object v1, v0, Lu1/x;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lco/median/android/MainActivity;

    .line 6
    .line 7
    new-instance v2, Landroidx/activity/k;

    .line 8
    .line 9
    const/16 v3, 0xe

    .line 10
    .line 11
    invoke-direct {v2, v3, v0}, Landroidx/activity/k;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
