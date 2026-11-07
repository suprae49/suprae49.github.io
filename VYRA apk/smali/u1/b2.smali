.class public final Lu1/b2;
.super Landroid/webkit/WebViewClient;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:Lu1/e2;


# direct methods
.method public constructor <init>(Lu1/e2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/b2;->a:Lu1/e2;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lu1/b2;->a:Lu1/e2;

    .line 2
    .line 3
    iget-object v0, p1, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lco/median/android/MainActivity;->M(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroid/content/Intent;

    .line 12
    .line 13
    iget-object v1, p1, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-class v2, Lco/median/android/MainActivity;

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "isRoot"

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    const-string v1, "url"

    .line 31
    .line 32
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const-string p2, "ignoreInterceptMaxWindows"

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 42
    .line 43
    const/16 p2, 0x190

    .line 44
    .line 45
    invoke-virtual {p1, v0, p2}, Landroidx/activity/q;->startActivityForResult(Landroid/content/Intent;I)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method
