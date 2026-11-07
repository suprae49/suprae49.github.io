.class public final Lu1/e0;
.super Landroid/webkit/WebChromeClient;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lco/median/android/MainActivity;

.field public final b:Lu1/e2;

.field public final c:Z

.field public d:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field public e:Z

.field public f:J


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;Lu1/e2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lu1/e0;->e:Z

    .line 6
    .line 7
    iput-object p1, p0, Lu1/e0;->a:Lco/median/android/MainActivity;

    .line 8
    .line 9
    iput-object p2, p0, Lu1/e0;->b:Lu1/e2;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lu1/e0;->f:J

    .line 14
    .line 15
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-boolean p1, p1, Lx1/a;->k1:Z

    .line 20
    .line 21
    iput-boolean p1, p0, Lu1/e0;->c:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const-string p1, "GoNative WebView"

    .line 26
    .line 27
    const-string p2, "Web Console logs enabled"

    .line 28
    .line 29
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method


# virtual methods
.method public final onCloseWindow(Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lu1/e0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    iget-boolean v0, p1, Lco/median/android/MainActivity;->T:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lu1/e0;->c:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    sget-object v0, Lu1/d0;->a:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    aget v0, v0, v2

    .line 17
    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    if-eq v0, v2, :cond_2

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    if-eq v0, v2, :cond_2

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    if-eq v0, v2, :cond_1

    .line 28
    .line 29
    const/4 v2, 0x5

    .line 30
    if-eq v0, v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, Ljava/lang/Exception;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string p1, "[console.error]"

    .line 51
    .line 52
    invoke-virtual {v0, p1, v2, v3}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 53
    .line 54
    .line 55
    return v1

    .line 56
    :cond_1
    const-string v0, "[console.warn]"

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    return v1

    .line 66
    :cond_2
    const-string v0, "[console.debug]"

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    return v1

    .line 76
    :cond_3
    const-string v0, "[console.log]"

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    :cond_4
    :goto_0
    return v1
.end method

.method public final onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 4

    .line 1
    iget-object p2, p0, Lu1/e0;->b:Lu1/e2;

    .line 2
    .line 3
    iget-object p3, p2, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-static {p3}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v1, v0, Lx1/a;->D:Z

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget v1, v0, Lx1/a;->E:I

    .line 15
    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p3}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget v3, v0, Lx1/a;->E:I

    .line 31
    .line 32
    if-lt v1, v3, :cond_0

    .line 33
    .line 34
    new-instance p3, Landroid/webkit/WebView;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p3, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Landroid/webkit/WebView$WebViewTransport;

    .line 46
    .line 47
    invoke-virtual {p1, p3}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    .line 51
    .line 52
    .line 53
    new-instance p1, Lu1/b2;

    .line 54
    .line 55
    invoke-direct {p1, p2}, Lu1/b2;-><init>(Lu1/e2;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 59
    .line 60
    .line 61
    return v2

    .line 62
    :cond_0
    iget-boolean p1, v0, Lx1/a;->D:Z

    .line 63
    .line 64
    invoke-virtual {p3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Lco/median/android/GoNativeApplication;

    .line 69
    .line 70
    iput-object p4, p2, Lco/median/android/GoNativeApplication;->i:Landroid/os/Message;

    .line 71
    .line 72
    new-instance p2, Landroid/content/Intent;

    .line 73
    .line 74
    invoke-virtual {p3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    const-class v0, Lco/median/android/MainActivity;

    .line 79
    .line 80
    invoke-direct {p2, p4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 81
    .line 82
    .line 83
    const-string p4, "isRoot"

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-virtual {p2, p4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 87
    .line 88
    .line 89
    const-string p4, "io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN"

    .line 90
    .line 91
    invoke-virtual {p2, p4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    if-eqz p1, :cond_1

    .line 95
    .line 96
    const-string p1, "ignoreInterceptMaxWindows"

    .line 97
    .line 98
    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 99
    .line 100
    .line 101
    :cond_1
    const/16 p1, 0x190

    .line 102
    .line 103
    invoke-virtual {p3, p2, p1}, Landroidx/activity/q;->startActivityForResult(Landroid/content/Intent;I)V

    .line 104
    .line 105
    .line 106
    return v2
.end method

.method public final onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lu1/e0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lx1/a;->J0:Lz1/d;

    .line 8
    .line 9
    iget-boolean v1, v1, Lz1/d;->a:Z

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-interface {p2, p1, v2, v2}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    iget-wide v5, p0, Lu1/e0;->f:J

    .line 23
    .line 24
    sub-long/2addr v3, v5

    .line 25
    const-wide/16 v5, 0x3e8

    .line 26
    .line 27
    cmp-long v1, v3, v5

    .line 28
    .line 29
    if-gez v1, :cond_1

    .line 30
    .line 31
    invoke-interface {p2, p1, v2, v2}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object v0, v0, Lco/median/android/MainActivity;->k0:Lu1/r0;

    .line 36
    .line 37
    new-instance v1, Lu1/y;

    .line 38
    .line 39
    invoke-direct {v1, p0, p2, p1}, Lu1/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iput-object v1, v0, Lu1/r0;->b:Lu1/y;

    .line 46
    .line 47
    invoke-virtual {v0}, Lu1/r0;->a()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final onHideCustomView()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lu1/e0;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, Lu1/e0;->a:Lco/median/android/MainActivity;

    .line 5
    .line 6
    iget-object v1, v0, Lco/median/android/MainActivity;->O:Landroid/widget/RelativeLayout;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lu1/e0;->d:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-boolean v1, p0, Lu1/e0;->e:Z

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->s0(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 2

    .line 1
    new-instance p1, Ln2/b;

    .line 2
    .line 3
    iget-object p2, p0, Lu1/e0;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ln2/b;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p1, Le/f;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Le/b;

    .line 11
    .line 12
    iput-object p3, p2, Le/b;->f:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p3, Lu1/b0;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p3, p4, v0}, Lu1/b0;-><init>(Landroid/webkit/JsResult;I)V

    .line 18
    .line 19
    .line 20
    const v0, 0x7f1100ef

    .line 21
    .line 22
    .line 23
    iget-object v1, p2, Le/b;->a:Landroid/view/ContextThemeWrapper;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p2, Le/b;->g:Ljava/lang/CharSequence;

    .line 30
    .line 31
    iput-object p3, p2, Le/b;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 32
    .line 33
    new-instance p3, Lu1/c0;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {p3, p4, v0}, Lu1/c0;-><init>(Landroid/webkit/JsResult;I)V

    .line 37
    .line 38
    .line 39
    iput-object p3, p2, Le/b;->k:Landroid/content/DialogInterface$OnDismissListener;

    .line 40
    .line 41
    invoke-virtual {p1}, Ln2/b;->a()Le/g;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    return p1
.end method

.method public final onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lu1/e0;->b:Lu1/e2;

    .line 2
    .line 3
    iget-object v1, v0, Lu1/e2;->g:Landroid/os/Handler;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v2, v0, Lu1/e2;->h:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v2, v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 18
    .line 19
    new-instance v2, Lu1/z1;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v2, v0, v3}, Lu1/z1;-><init>(Lu1/e2;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 2

    .line 1
    new-instance p1, Ln2/b;

    .line 2
    .line 3
    iget-object p2, p0, Lu1/e0;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ln2/b;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p1, Le/f;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Le/b;

    .line 11
    .line 12
    iput-object p3, p2, Le/b;->f:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p3, Lu1/b0;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p3, p4, v0}, Lu1/b0;-><init>(Landroid/webkit/JsResult;I)V

    .line 18
    .line 19
    .line 20
    const v0, 0x7f1100ef

    .line 21
    .line 22
    .line 23
    iget-object v1, p2, Le/b;->a:Landroid/view/ContextThemeWrapper;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p2, Le/b;->g:Ljava/lang/CharSequence;

    .line 30
    .line 31
    iput-object p3, p2, Le/b;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 32
    .line 33
    new-instance p3, Lu1/b0;

    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-direct {p3, p4, v0}, Lu1/b0;-><init>(Landroid/webkit/JsResult;I)V

    .line 37
    .line 38
    .line 39
    const v0, 0x7f11003a

    .line 40
    .line 41
    .line 42
    iget-object v1, p2, Le/b;->a:Landroid/view/ContextThemeWrapper;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p2, Le/b;->i:Ljava/lang/CharSequence;

    .line 49
    .line 50
    iput-object p3, p2, Le/b;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 51
    .line 52
    new-instance p3, Lu1/c0;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-direct {p3, p4, v0}, Lu1/c0;-><init>(Landroid/webkit/JsResult;I)V

    .line 56
    .line 57
    .line 58
    iput-object p3, p2, Le/b;->k:Landroid/content/DialogInterface$OnDismissListener;

    .line 59
    .line 60
    invoke-virtual {p1}, Ln2/b;->a()Le/g;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x1

    .line 68
    return p1
.end method

.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 1

    .line 1
    new-instance p1, Landroid/widget/EditText;

    .line 2
    .line 3
    iget-object p2, p0, Lu1/e0;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-direct {p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    new-instance p4, Ln2/b;

    .line 12
    .line 13
    invoke-direct {p4, p2}, Ln2/b;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p4, Le/f;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Le/b;

    .line 19
    .line 20
    iput-object p3, p2, Le/b;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p1, p2, Le/b;->p:Landroid/widget/EditText;

    .line 23
    .line 24
    new-instance p3, Lu1/z;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-direct {p3, p1, p5, v0}, Lu1/z;-><init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    const p1, 0x7f1100ef

    .line 31
    .line 32
    .line 33
    iget-object v0, p2, Le/b;->a:Landroid/view/ContextThemeWrapper;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p2, Le/b;->g:Ljava/lang/CharSequence;

    .line 40
    .line 41
    iput-object p3, p2, Le/b;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 42
    .line 43
    new-instance p1, Lu1/b0;

    .line 44
    .line 45
    const/4 p3, 0x3

    .line 46
    invoke-direct {p1, p5, p3}, Lu1/b0;-><init>(Landroid/webkit/JsResult;I)V

    .line 47
    .line 48
    .line 49
    const p3, 0x7f11003a

    .line 50
    .line 51
    .line 52
    iget-object v0, p2, Le/b;->a:Landroid/view/ContextThemeWrapper;

    .line 53
    .line 54
    invoke-virtual {v0, p3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    iput-object p3, p2, Le/b;->i:Ljava/lang/CharSequence;

    .line 59
    .line 60
    iput-object p1, p2, Le/b;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 61
    .line 62
    new-instance p1, Lu1/a0;

    .line 63
    .line 64
    const/4 p3, 0x0

    .line 65
    invoke-direct {p1, p3, p5}, Lu1/a0;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p2, Le/b;->k:Landroid/content/DialogInterface$OnDismissListener;

    .line 69
    .line 70
    invoke-virtual {p4}, Ln2/b;->a()Le/g;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x1

    .line 78
    return p1
.end method

.method public final onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    array-length v3, v0

    .line 12
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    const-string v4, "android.webkit.resource.AUDIO_CAPTURE"

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const-string v3, "android.permission.RECORD_AUDIO"

    .line 25
    .line 26
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    const-string v3, "android.permission.MODIFY_AUDIO_SETTINGS"

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    aget-object v3, v0, v2

    .line 36
    .line 37
    const-string v4, "android.webkit.resource.VIDEO_CAPTURE"

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    const-string v3, "android.permission.CAMERA"

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    new-array v0, v0, [Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, [Ljava/lang/String;

    .line 64
    .line 65
    new-instance v1, Lr0/b;

    .line 66
    .line 67
    invoke-direct {v1, p1}, Lr0/b;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lu1/e0;->a:Lco/median/android/MainActivity;

    .line 71
    .line 72
    invoke-virtual {p1, v0, v1}, Lco/median/android/MainActivity;->G([Ljava/lang/String;Lu1/a1;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lu1/e0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu1/e0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    iget-object v1, v0, Lco/median/android/MainActivity;->O:Landroid/widget/RelativeLayout;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput-object p2, p0, Lu1/e0;->d:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    iput-boolean p2, p0, Lu1/e0;->e:Z

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-virtual {v1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    invoke-direct {p2, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    .line 25
    .line 26
    iget-boolean p1, p0, Lu1/e0;->e:Z

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lco/median/android/MainActivity;->s0(Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 9

    .line 1
    iget-object p1, p0, Lu1/e0;->b:Lu1/e2;

    .line 2
    .line 3
    iget-object v0, p1, Lu1/e2;->r:Landroid/webkit/ValueCallback;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p1, Lu1/e2;->r:Landroid/webkit/ValueCallback;

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x3

    .line 18
    const/4 v3, 0x0

    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    invoke-interface {p2, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return v3

    .line 25
    :cond_1
    iget-object v0, p1, Lu1/e2;->q:Lb/g;

    .line 26
    .line 27
    iget-object v1, p1, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 28
    .line 29
    iput-object p2, p1, Lu1/e2;->r:Landroid/webkit/ValueCallback;

    .line 30
    .line 31
    new-instance p2, Lu1/r;

    .line 32
    .line 33
    invoke-direct {p2, p3}, Lu1/r;-><init>(Landroid/webkit/WebChromeClient$FileChooserParams;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v4, 0x1

    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    invoke-virtual {p2}, Lu1/r;->a()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {p2}, Lu1/r;->b()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {v0, p2}, Lb/g;->a(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return v4

    .line 60
    :cond_3
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v5, "android.permission.CAMERA"

    .line 66
    .line 67
    invoke-static {v1, v5}, Lt2/i;->t(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_5

    .line 72
    .line 73
    invoke-static {v1, v5}, Lc0/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-nez v6, :cond_4

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    :goto_1
    iput-boolean v4, p2, Lu1/r;->c:Z

    .line 85
    .line 86
    :goto_2
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 87
    .line 88
    const/16 v6, 0x1d

    .line 89
    .line 90
    if-lt v5, v6, :cond_6

    .line 91
    .line 92
    move v5, v4

    .line 93
    goto :goto_3

    .line 94
    :cond_6
    move v5, v3

    .line 95
    :goto_3
    const-string v6, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 96
    .line 97
    invoke-static {v1, v6}, Lt2/i;->t(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    invoke-static {v1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    iget-object v8, v8, Lx1/a;->o1:Lz1/a;

    .line 106
    .line 107
    iget-boolean v8, v8, Lz1/a;->b:Z

    .line 108
    .line 109
    if-eqz v5, :cond_7

    .line 110
    .line 111
    iput-boolean v4, p2, Lu1/r;->d:Z

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    if-eqz v7, :cond_8

    .line 115
    .line 116
    if-eqz v8, :cond_8

    .line 117
    .line 118
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_8
    iput-boolean v3, p2, Lu1/r;->d:Z

    .line 123
    .line 124
    :goto_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-nez v5, :cond_9

    .line 129
    .line 130
    new-array v0, v3, [Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, [Ljava/lang/String;

    .line 137
    .line 138
    new-instance v2, Lu1/y;

    .line 139
    .line 140
    invoke-direct {v2, p1, p3, p2}, Lu1/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v0, v2}, Lco/median/android/MainActivity;->G([Ljava/lang/String;Lu1/a1;)V

    .line 144
    .line 145
    .line 146
    return v4

    .line 147
    :cond_9
    invoke-virtual {v0, p2}, Lb/g;->a(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    return v4
.end method
