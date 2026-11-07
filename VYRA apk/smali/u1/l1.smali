.class public final Lu1/l1;
.super Landroid/webkit/WebViewClient;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lr0/b;

.field public final b:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lr0/b;Lu1/o0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/l1;->b:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lu1/l1;->a:Lr0/b;

    .line 7
    .line 8
    invoke-virtual {p3, p0}, Lu1/o0;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ld3/d0;

    .line 18
    .line 19
    const/16 v1, 0xb

    .line 20
    .line 21
    invoke-direct {v0, v1, p1}, Ld3/d0;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    check-cast p1, Lx1/i;

    .line 28
    .line 29
    iget-object p1, p0, Lu1/l1;->a:Lr0/b;

    .line 30
    .line 31
    iget-object p1, p1, Lr0/b;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lu1/h2;

    .line 34
    .line 35
    iget-object p2, p1, Lu1/h2;->c:Ljava/util/HashMap;

    .line 36
    .line 37
    iget-object v0, p1, Lu1/h2;->i:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, Lu1/h2;->h:Lu1/o0;

    .line 40
    .line 41
    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    iput-object p2, p1, Lu1/h2;->i:Ljava/lang/String;

    .line 46
    .line 47
    iput-object p2, p1, Lu1/h2;->h:Lu1/o0;

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    iput-boolean v0, p1, Lu1/h2;->j:Z

    .line 51
    .line 52
    iget-object v0, p1, Lu1/h2;->a:Lk/a;

    .line 53
    .line 54
    iput-object p2, v0, Lk/a;->c:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object p2, p0, Lu1/l1;->b:Landroid/app/Activity;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lu1/h2;->c(Landroid/app/Activity;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 3

    .line 1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    const-string v2, "GET"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v2, "http"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p0, p1, p2}, Lu1/l1;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_2
    :goto_0
    return-object v1
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 3

    .line 46
    check-cast p1, Lx1/i;

    .line 47
    iget-object v0, p0, Lu1/l1;->a:Lr0/b;

    iget-object v0, v0, Lr0/b;->f:Ljava/lang/Object;

    check-cast v0, Lu1/h2;

    .line 48
    iget-object v0, v0, Lu1/h2;->a:Lk/a;

    const/4 v1, 0x0

    iget-object v2, p0, Lu1/l1;->b:Landroid/app/Activity;

    invoke-virtual {v0, v2, p1, p2, v1}, Lk/a;->e(Landroid/app/Activity;Lx1/i;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method
