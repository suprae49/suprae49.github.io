.class public final Lu1/o0;
.super Landroid/webkit/WebView;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lx1/i;
.implements Lp0/m;


# static fields
.field public static final synthetic u:I


# instance fields
.field public final f:Ljava/lang/String;

.field public g:Landroid/webkit/WebViewClient;

.field public h:Landroid/webkit/WebChromeClient;

.field public final i:Landroid/view/GestureDetector;

.field public j:Ljava/lang/String;

.field public final k:Z

.field public l:I

.field public final m:[I

.field public final n:[I

.field public o:I

.field public final p:Lp0/n;

.field public q:Lu1/m0;

.field public r:F

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lu1/o0;->f:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lu1/o0;->g:Landroid/webkit/WebViewClient;

    .line 16
    .line 17
    iput-object v0, p0, Lu1/o0;->h:Landroid/webkit/WebChromeClient;

    .line 18
    .line 19
    const-string v1, ""

    .line 20
    .line 21
    iput-object v1, p0, Lu1/o0;->j:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput-boolean v1, p0, Lu1/o0;->k:Z

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    new-array v3, v2, [I

    .line 28
    .line 29
    iput-object v3, p0, Lu1/o0;->m:[I

    .line 30
    .line 31
    new-array v2, v2, [I

    .line 32
    .line 33
    iput-object v2, p0, Lu1/o0;->n:[I

    .line 34
    .line 35
    const/high16 v2, -0x40800000    # -1.0f

    .line 36
    .line 37
    iput v2, p0, Lu1/o0;->r:F

    .line 38
    .line 39
    iput-boolean v1, p0, Lu1/o0;->s:Z

    .line 40
    .line 41
    iput-boolean v1, p0, Lu1/o0;->t:Z

    .line 42
    .line 43
    new-instance v2, Lu1/l0;

    .line 44
    .line 45
    invoke-direct {v2, p0}, Lu1/l0;-><init>(Lu1/o0;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Landroid/view/GestureDetector;

    .line 49
    .line 50
    invoke-direct {v3, p1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 51
    .line 52
    .line 53
    iput-object v3, p0, Lu1/o0;->i:Landroid/view/GestureDetector;

    .line 54
    .line 55
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-boolean v2, p1, Lx1/a;->n0:Z

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    if-nez v2, :cond_1

    .line 63
    .line 64
    iget-boolean p1, p1, Lx1/a;->o0:Z

    .line 65
    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move p1, v1

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    :goto_0
    move p1, v3

    .line 72
    :goto_1
    iput-boolean p1, p0, Lu1/o0;->k:Z

    .line 73
    .line 74
    new-instance p1, Lp0/n;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Lp0/n;-><init>(Landroid/view/ViewGroup;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lu1/o0;->p:Lp0/n;

    .line 80
    .line 81
    invoke-virtual {p0, v3}, Lu1/o0;->setNestedScrollingEnabled(Z)V

    .line 82
    .line 83
    .line 84
    const-string p1, "DOCUMENT_START_SCRIPT"

    .line 85
    .line 86
    invoke-static {p1}, Le4/a;->R(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_2

    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    const-string p1, "*"

    .line 94
    .line 95
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    sget-object v2, Ls1/b;->a:Ljava/util/WeakHashMap;

    .line 100
    .line 101
    sget-object v2, Lt1/i;->d:Lt1/b;

    .line 102
    .line 103
    invoke-virtual {v2}, Lt1/c;->b()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_5

    .line 108
    .line 109
    sget-object v0, Lt1/i;->e:Lt1/b;

    .line 110
    .line 111
    invoke-virtual {v0}, Lt1/c;->b()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    sget-object v0, Ls1/b;->a:Ljava/util/WeakHashMap;

    .line 118
    .line 119
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Lt1/m;

    .line 124
    .line 125
    if-nez v2, :cond_4

    .line 126
    .line 127
    new-instance v2, Lt1/m;

    .line 128
    .line 129
    sget-object v3, Lt1/k;->a:Lt1/n;

    .line 130
    .line 131
    invoke-interface {v3, p0}, Lt1/n;->b(Lu1/o0;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-direct {v2, v3}, Lt1/m;-><init>(Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    new-instance v2, Lt1/m;

    .line 143
    .line 144
    sget-object v0, Lt1/k;->a:Lt1/n;

    .line 145
    .line 146
    invoke-interface {v0, p0}, Lt1/n;->b(Lu1/o0;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-direct {v2, v0}, Lt1/m;-><init>(Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    :goto_2
    new-array v0, v1, [Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {p1, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, [Ljava/lang/String;

    .line 160
    .line 161
    iget-object v0, v2, Lt1/m;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 162
    .line 163
    const-string v1, "window.print = function () { if (window.median_print) window.median_print.print(); };"

    .line 164
    .line 165
    invoke-interface {v0, v1, p1}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->addDocumentStartJavaScript(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/reflect/InvocationHandler;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const-class v0, Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;

    .line 170
    .line 171
    invoke-static {v0, p1}, Le4/a;->i(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    check-cast p1, Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;

    .line 176
    .line 177
    return-void

    .line 178
    :cond_5
    const-string p1, "This method is not supported by the current version of the framework and the current WebView APK"

    .line 179
    .line 180
    invoke-static {p1}, Landroidx/fragment/app/q;->t(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final canGoForward()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    add-int/2addr v1, v2

    .line 11
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const-string v3, "file:///android_asset/offline.html"

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/lit8 v1, v1, 0x2

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    return v2

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    return v0

    .line 44
    :cond_1
    invoke-super {p0}, Landroid/webkit/WebView;->canGoForward()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    return v0
.end method

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/o0;->p:Lp0/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lp0/n;->a(FFZ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/o0;->p:Lp0/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lp0/n;->b(FF)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lu1/o0;->p:Lp0/n;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    move v1, p1

    .line 5
    move v2, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-virtual/range {v0 .. v5}, Lp0/n;->c(III[I[I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 8

    .line 1
    const/4 v6, 0x0

    .line 2
    const/4 v7, 0x0

    .line 3
    iget-object v0, p0, Lu1/o0;->p:Lp0/n;

    .line 4
    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v7}, Lp0/n;->d(IIII[II[I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public getDefaultUserAgent()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/o0;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxHorizontalScroll()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    return v0
.end method

.method public getOnSwipeListener()Lu1/n0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getWebViewScrollX()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getWebViewScrollY()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final goBack()V
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "file:///android_asset/offline.html"

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sub-int/2addr v1, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v2, 0x0

    .line 39
    const/4 v1, 0x0

    .line 40
    :goto_1
    if-nez v2, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    iget-object v0, p0, Lu1/o0;->g:Landroid/webkit/WebViewClient;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v0, p0, v2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    :goto_2
    return-void

    .line 56
    :cond_3
    invoke-virtual {p0, v1}, Landroid/webkit/WebView;->goBackOrForward(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catch_0
    invoke-super {p0}, Landroid/webkit/WebView;->goBack()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final goForward()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const-string v2, "file:///android_asset/offline.html"

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x2

    .line 34
    add-int/2addr v1, v2

    .line 35
    invoke-virtual {v0, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->goBackOrForward(I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void

    .line 45
    :cond_1
    invoke-super {p0}, Landroid/webkit/WebView;->goForward()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final hasNestedScrollingParent()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/o0;->p:Lp0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lp0/n;->f(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/o0;->p:Lp0/n;

    .line 2
    .line 3
    iget-boolean v0, v0, Lp0/n;->d:Z

    .line 4
    .line 5
    return v0
.end method

.method public final loadUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "file:///offline.html"

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string p1, "file:///android_asset/offline.html"

    .line 13
    .line 14
    :cond_1
    const-string v0, "javascript:"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Lu1/o0;->g:Landroid/webkit/WebViewClient;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    :goto_0
    return-void

    .line 34
    :cond_3
    :goto_1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onScrollChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebView;->onScrollChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lu1/o0;->r:F

    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    cmpg-float p1, p1, p3

    .line 8
    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContentHeight()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    int-to-float p1, p1

    .line 17
    iget p3, p0, Lu1/o0;->r:F

    .line 18
    .line 19
    mul-float/2addr p1, p3

    .line 20
    float-to-int p1, p1

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    add-int/2addr p3, p2

    .line 26
    add-int/lit8 p1, p1, -0xa

    .line 27
    .line 28
    if-lt p3, p1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    :goto_0
    iput-boolean p1, p0, Lu1/o0;->s:Z

    .line 34
    .line 35
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lu1/o0;->i:Landroid/view/GestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lu1/o0;->k:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Lu1/o0;->t:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-le v0, v1, :cond_1

    .line 20
    .line 21
    :cond_0
    move-object v6, p0

    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :cond_1
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    iput v2, p0, Lu1/o0;->o:I

    .line 36
    .line 37
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    float-to-int v3, v3

    .line 42
    iget v4, p0, Lu1/o0;->o:I

    .line 43
    .line 44
    int-to-float v4, v4

    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-virtual {p1, v5, v4}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 47
    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    if-eqz v0, :cond_7

    .line 51
    .line 52
    if-eq v0, v1, :cond_3

    .line 53
    .line 54
    if-eq v0, v4, :cond_4

    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    if-eq v0, v1, :cond_3

    .line 58
    .line 59
    return v2

    .line 60
    :cond_3
    move-object v6, p0

    .line 61
    goto :goto_0

    .line 62
    :cond_4
    iget v0, p0, Lu1/o0;->l:I

    .line 63
    .line 64
    sub-int/2addr v0, v3

    .line 65
    iget-object v4, p0, Lu1/o0;->n:[I

    .line 66
    .line 67
    iget-object v11, p0, Lu1/o0;->m:[I

    .line 68
    .line 69
    invoke-virtual {p0, v2, v0, v4, v11}, Lu1/o0;->dispatchNestedPreScroll(II[I[I)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    aget v2, v4, v1

    .line 76
    .line 77
    sub-int/2addr v0, v2

    .line 78
    aget v2, v11, v1

    .line 79
    .line 80
    sub-int/2addr v3, v2

    .line 81
    iput v3, p0, Lu1/o0;->l:I

    .line 82
    .line 83
    neg-int v2, v2

    .line 84
    int-to-float v2, v2

    .line 85
    invoke-virtual {p1, v5, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 86
    .line 87
    .line 88
    iget v2, p0, Lu1/o0;->o:I

    .line 89
    .line 90
    aget v3, v11, v1

    .line 91
    .line 92
    add-int/2addr v2, v3

    .line 93
    iput v2, p0, Lu1/o0;->o:I

    .line 94
    .line 95
    :cond_5
    move v10, v0

    .line 96
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    aget v8, v11, v1

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    const/4 v7, 0x0

    .line 104
    move-object v6, p0

    .line 105
    invoke-virtual/range {v6 .. v11}, Lu1/o0;->dispatchNestedScroll(IIII[I)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_6

    .line 110
    .line 111
    aget v2, v11, v1

    .line 112
    .line 113
    int-to-float v2, v2

    .line 114
    invoke-virtual {p1, v5, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 115
    .line 116
    .line 117
    iget p1, v6, Lu1/o0;->o:I

    .line 118
    .line 119
    aget v1, v11, v1

    .line 120
    .line 121
    add-int/2addr p1, v1

    .line 122
    iput p1, v6, Lu1/o0;->o:I

    .line 123
    .line 124
    iget p1, v6, Lu1/o0;->l:I

    .line 125
    .line 126
    sub-int/2addr p1, v1

    .line 127
    iput p1, v6, Lu1/o0;->l:I

    .line 128
    .line 129
    :cond_6
    return v0

    .line 130
    :goto_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-virtual {p0}, Lu1/o0;->stopNestedScroll()V

    .line 135
    .line 136
    .line 137
    return p1

    .line 138
    :cond_7
    move-object v6, p0

    .line 139
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    iput v3, v6, Lu1/o0;->l:I

    .line 144
    .line 145
    invoke-virtual {p0, v4}, Lu1/o0;->startNestedScroll(I)Z

    .line 146
    .line 147
    .line 148
    return p1

    .line 149
    :goto_1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    return p1
.end method

.method public final reload()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu1/o0;->g:Landroid/webkit/WebViewClient;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    instance-of v1, v0, Lu1/f0;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    check-cast v0, Lu1/f0;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v0, v0, Lu1/f0;->a:Lu1/e2;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, p0, v1, v2}, Lu1/e2;->f(Lx1/i;Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-super {p0}, Landroid/webkit/WebView;->reload()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void

    .line 29
    :cond_2
    :goto_0
    invoke-super {p0}, Landroid/webkit/WebView;->reload()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public setCheckLoginSignup(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public setCurrentScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lu1/o0;->r:F

    .line 2
    .line 3
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/o0;->p:Lp0/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp0/n;->g(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnScrollYEndListener(Lu1/m0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/o0;->q:Lu1/m0;

    .line 2
    .line 3
    return-void
.end method

.method public setOnSwipeListener(Lu1/n0;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/o0;->h:Landroid/webkit/WebChromeClient;

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/o0;->g:Landroid/webkit/WebViewClient;

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final startNestedScroll(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/o0;->p:Lp0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lp0/n;->h(II)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public final stopNestedScroll()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/o0;->p:Lp0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lp0/n;->i(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
