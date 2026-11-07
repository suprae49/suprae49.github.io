.class public final Lu1/e2;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final synthetic s:I


# instance fields
.field public final a:Lco/median/android/MainActivity;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public final f:Lk/a;

.field public final g:Landroid/os/Handler;

.field public h:I

.field public i:Z

.field public j:Z

.field public final k:D

.field public l:Ljava/lang/String;

.field public m:Z

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Z

.field public final q:Lb/g;

.field public r:Landroid/webkit/ValueCallback;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lu1/e2;->g:Landroid/os/Handler;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput v0, p0, Lu1/e2;->h:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, p0, Lu1/e2;->i:Z

    .line 16
    .line 17
    iput-boolean v1, p0, Lu1/e2;->j:Z

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    iput-object v2, p0, Lu1/e2;->l:Ljava/lang/String;

    .line 22
    .line 23
    iput-boolean v1, p0, Lu1/e2;->m:Z

    .line 24
    .line 25
    iput-boolean v1, p0, Lu1/e2;->p:Z

    .line 26
    .line 27
    iput-object p1, p0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 28
    .line 29
    new-instance v2, Lk/a;

    .line 30
    .line 31
    invoke-direct {v2, p1}, Lk/a;-><init>(Lco/median/android/MainActivity;)V

    .line 32
    .line 33
    .line 34
    iput-object v2, p0, Lu1/e2;->f:Lk/a;

    .line 35
    .line 36
    iget-object v2, p1, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iput-object p0, v2, Lu1/x1;->d:Lu1/e2;

    .line 41
    .line 42
    :cond_0
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v3, v2, Lx1/a;->S:Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    new-instance v4, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v5, "median_profile_picker.parseJson(eval("

    .line 53
    .line 54
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v3}, Lt2/i;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v5, "))"

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    iput-object v4, p0, Lu1/e2;->b:Ljava/lang/String;

    .line 74
    .line 75
    new-instance v4, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v6, "gonative_profile_picker.parseJson(eval("

    .line 78
    .line 79
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v3}, Lt2/i;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iput-object v3, p0, Lu1/e2;->c:Ljava/lang/String;

    .line 97
    .line 98
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    const-string v4, "io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN"

    .line 103
    .line 104
    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    iput-boolean v0, p0, Lu1/e2;->j:Z

    .line 111
    .line 112
    :cond_2
    iget-wide v0, v2, Lx1/a;->w:D

    .line 113
    .line 114
    iput-wide v0, p0, Lu1/e2;->k:D

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 121
    .line 122
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->n:Ljava/lang/String;

    .line 123
    .line 124
    iput-object v0, p0, Lu1/e2;->n:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 131
    .line 132
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->o:Ljava/lang/String;

    .line 133
    .line 134
    iput-object v0, p0, Lu1/e2;->o:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 141
    .line 142
    iget-boolean v0, v0, Lco/median/android/GoNativeApplication;->l:Z

    .line 143
    .line 144
    iput-boolean v0, p0, Lu1/e2;->p:Z

    .line 145
    .line 146
    new-instance v0, Lu1/p;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 149
    .line 150
    .line 151
    new-instance v1, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .line 155
    .line 156
    iput-object v1, v0, Lu1/p;->e:Ljava/util/List;

    .line 157
    .line 158
    new-instance v1, Ld3/a0;

    .line 159
    .line 160
    const/16 v2, 0x9

    .line 161
    .line 162
    invoke-direct {v1, v2, p0}, Ld3/a0;-><init>(ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v0, v1}, Landroidx/activity/q;->s(Lc/a;Lb/b;)Lb/c;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Lb/g;

    .line 170
    .line 171
    iput-object p1, p0, Lu1/e2;->q:Lb/g;

    .line 172
    .line 173
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu1/e2;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-boolean v1, p0, Lu1/e2;->m:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    iget-object v1, p0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "(function() {var parent = document.getElementsByTagName(\'head\').item(0);var style = document.createElement(\'style\');style.type = \'text/css\';style.id = \'median-custom-css\';style.innerHTML = window.atob(\'"

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, "\');parent.appendChild(style);return document.getElementById(\'median-custom-css\') !== null;})()"

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v2, Lu1/y1;

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-direct {v2, p0, v3}, Lu1/y1;-><init>(Lu1/e2;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catch_0
    move-exception v0

    .line 46
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "u1.e2"

    .line 51
    .line 52
    const-string v3, "Error injecting customCSS via javascript"

    .line 53
    .line 54
    invoke-virtual {v1, v2, v3, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_0
    return-void
.end method

.method public final b(Landroid/net/Uri;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    const-string v1, "http"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v1, "https"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v0, p0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 25
    .line 26
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, v0, Lx1/a;->T:Lx1/f;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, v1, Lx1/f;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1, v2}, Lx1/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "internal"

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object v0, v0, Lx1/a;->f:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v2, "."

    .line 75
    .line 76
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    :cond_3
    const/4 p1, 0x1

    .line 93
    return p1

    .line 94
    :cond_4
    :goto_1
    const/4 p1, 0x0

    .line 95
    return p1
.end method

.method public final c(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    iget-object v1, v0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 4
    .line 5
    new-instance v2, Lu1/y1;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, p0, v3}, Lu1/y1;-><init>(Lu1/e2;I)V

    .line 9
    .line 10
    .line 11
    const-string v3, "window.devicePixelRatio"

    .line 12
    .line 13
    invoke-interface {v1, v3, v2}, Lx1/i;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v1, v0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 17
    .line 18
    check-cast v1, Lu1/o0;

    .line 19
    .line 20
    iget-object v2, v1, Lu1/o0;->j:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const-string v2, ""

    .line 29
    .line 30
    iput-object v2, v1, Lu1/o0;->j:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/webkit/WebView;->stopLoading()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lu1/o0;->reload()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catch_0
    :cond_0
    iget-object v1, v0, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iput-boolean v2, v1, Lu1/x1;->e:Z

    .line 45
    .line 46
    :cond_1
    const/4 v1, 0x3

    .line 47
    iput v1, p0, Lu1/e2;->h:I

    .line 48
    .line 49
    iget-object v1, p0, Lu1/e2;->g:Landroid/os/Handler;

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lu1/e2;->f:Lk/a;

    .line 56
    .line 57
    iput-object p1, v1, Lk/a;->c:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static {}, Landroidx/emoji2/text/p;->l()Landroidx/emoji2/text/p;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, p1}, Landroidx/emoji2/text/p;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-object v3, v3, Lx1/a;->M:Ljava/lang/String;

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Lu1/e2;->b(Landroid/net/Uri;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    iget-object v1, v0, Lco/median/android/MainActivity;->b0:Lu1/s0;

    .line 85
    .line 86
    invoke-virtual {v1}, Lu1/s0;->c()V

    .line 87
    .line 88
    .line 89
    :cond_2
    iget-object v1, v0, Lco/median/android/MainActivity;->Y:Lu1/x0;

    .line 90
    .line 91
    invoke-virtual {v1}, Lu1/x0;->run()V

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, Lco/median/android/MainActivity;->Q:Lu1/w1;

    .line 95
    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Lu1/w1;->a(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    iget-object v1, v0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 102
    .line 103
    const/4 v3, 0x0

    .line 104
    if-eqz v1, :cond_a

    .line 105
    .line 106
    invoke-virtual {v1, p1}, Lu1/q1;->a(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v1, v0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 110
    .line 111
    iget-object v4, v1, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 112
    .line 113
    iget-object v5, v1, Lu1/q1;->a:Lco/median/android/MainActivity;

    .line 114
    .line 115
    invoke-static {v5}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    iget-object v7, v6, Lx1/a;->I:Ljava/util/ArrayList;

    .line 120
    .line 121
    if-eqz v7, :cond_7

    .line 122
    .line 123
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-eqz v7, :cond_4

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    move v7, v3

    .line 131
    :goto_0
    iget-object v8, v6, Lx1/a;->I:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-ge v7, v8, :cond_6

    .line 138
    .line 139
    iget-object v8, v6, Lx1/a;->I:Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    check-cast v8, Ljava/util/regex/Pattern;

    .line 146
    .line 147
    invoke-virtual {v8, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-eqz v8, :cond_5

    .line 156
    .line 157
    iget-object v8, v6, Lx1/a;->J:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    check-cast v7, Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    goto :goto_2

    .line 170
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_6
    move v7, v3

    .line 174
    goto :goto_2

    .line 175
    :cond_7
    :goto_1
    move v7, v2

    .line 176
    :goto_2
    invoke-virtual {v1, v7}, Lu1/q1;->b(Z)V

    .line 177
    .line 178
    .line 179
    const v1, 0x800003

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v1}, Ly0/f;->g(I)I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eq v1, v2, :cond_a

    .line 187
    .line 188
    iget-boolean v1, v6, Lx1/a;->C:Z

    .line 189
    .line 190
    if-eqz v1, :cond_9

    .line 191
    .line 192
    iget-object v1, v5, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 193
    .line 194
    if-nez v1, :cond_8

    .line 195
    .line 196
    move v1, v3

    .line 197
    goto :goto_3

    .line 198
    :cond_8
    invoke-interface {v1}, Lx1/i;->canGoBack()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    :goto_3
    if-eqz v1, :cond_9

    .line 203
    .line 204
    move v1, v2

    .line 205
    goto :goto_4

    .line 206
    :cond_9
    move v1, v3

    .line 207
    :goto_4
    invoke-virtual {v4, v1}, Lco/median/android/widget/GoNativeDrawerLayout;->setDisableTouch(Z)V

    .line 208
    .line 209
    .line 210
    :cond_a
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Lco/median/android/GoNativeApplication;

    .line 215
    .line 216
    iget-object v1, v1, Lco/median/android/GoNativeApplication;->h:Lu1/h2;

    .line 217
    .line 218
    iput-boolean v2, v1, Lu1/h2;->l:Z

    .line 219
    .line 220
    iget-object v4, v1, Lu1/h2;->h:Lu1/o0;

    .line 221
    .line 222
    if-eqz v4, :cond_b

    .line 223
    .line 224
    invoke-virtual {v4}, Landroid/webkit/WebView;->stopLoading()V

    .line 225
    .line 226
    .line 227
    iput-boolean v3, v1, Lu1/h2;->j:Z

    .line 228
    .line 229
    :cond_b
    const-string v1, "file:///android_asset/offline.html"

    .line 230
    .line 231
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    iget-object v1, v0, Lco/median/android/MainActivity;->M:Lco/median/android/MySwipeRefreshLayout;

    .line 236
    .line 237
    if-eqz p1, :cond_c

    .line 238
    .line 239
    if-eqz v1, :cond_d

    .line 240
    .line 241
    invoke-virtual {v1, v2}, Lw1/h;->setEnabled(Z)V

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_c
    if-eqz v1, :cond_d

    .line 246
    .line 247
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    iget-object v0, v0, Lco/median/android/MainActivity;->M:Lco/median/android/MySwipeRefreshLayout;

    .line 252
    .line 253
    iget-boolean p1, p1, Lx1/a;->B:Z

    .line 254
    .line 255
    invoke-virtual {v0, p1}, Lw1/h;->setEnabled(Z)V

    .line 256
    .line 257
    .line 258
    :cond_d
    :goto_5
    iput-boolean v3, p0, Lu1/e2;->m:Z

    .line 259
    .line 260
    return-void
.end method

.method public final d(Lx1/i;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-string v1, "net::ERR_CACHE_MISS"

    .line 6
    .line 7
    invoke-virtual {p3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    new-instance p2, Ld3/d0;

    .line 14
    .line 15
    const/16 p3, 0xc

    .line 16
    .line 17
    invoke-direct {p2, p3, p1}, Ld3/d0;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    iget-boolean p3, p3, Lx1/a;->W:Z

    .line 29
    .line 30
    if-eqz p3, :cond_4

    .line 31
    .line 32
    iget p3, p0, Lu1/e2;->h:I

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    if-eq p3, v1, :cond_1

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    if-ne p3, v1, :cond_4

    .line 39
    .line 40
    :cond_1
    iget-object p3, v0, Lco/median/android/MainActivity;->P:Landroid/net/ConnectivityManager;

    .line 41
    .line 42
    invoke-virtual {p3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    invoke-virtual {p3}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-nez p3, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const/4 p3, -0x2

    .line 56
    if-ne p2, p3, :cond_4

    .line 57
    .line 58
    if-eqz p4, :cond_4

    .line 59
    .line 60
    invoke-interface {p1}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    invoke-interface {p1}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    :cond_3
    :goto_0
    new-instance p2, Landroidx/activity/k;

    .line 77
    .line 78
    const/16 p3, 0xf

    .line 79
    .line 80
    invoke-direct {p2, p3, p1}, Landroidx/activity/k;-><init>(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    new-instance p1, Ld3/d0;

    .line 88
    .line 89
    const/16 p2, 0xd

    .line 90
    .line 91
    invoke-direct {p1, p2, p0}, Ld3/d0;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lu1/h0;->y(Landroid/content/Context;)Ljava/util/HashMap;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v2, p0, Lu1/e2;->p:Z

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "isFirstLaunch"

    .line 14
    .line 15
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lco/median/android/GoNativeApplication;

    .line 23
    .line 24
    iget-object v2, v2, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v3, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lu1/x;->a()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lorg/json/JSONObject;

    .line 54
    .line 55
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v2}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, p1, v1}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    invoke-static {v2}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    throw p1
.end method

.method public final f(Lx1/i;Ljava/lang/String;Z)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "data:"

    .line 6
    .line 7
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x9

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eqz v1, :cond_a

    .line 16
    .line 17
    const-string v1, "data:image/"

    .line 18
    .line 19
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_1
    :try_start_0
    const-string v1, ","

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v4

    .line 34
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    array-length v5, v1

    .line 47
    const/16 v6, 0xa

    .line 48
    .line 49
    if-ge v5, v6, :cond_2

    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_2
    const-string v5, "data:image/gif"

    .line 54
    .line 55
    invoke-virtual {p2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    const/16 v6, 0x8

    .line 60
    .line 61
    const/16 v7, 0xff

    .line 62
    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    new-instance v5, Ljava/lang/String;

    .line 66
    .line 67
    const-string v8, "US-ASCII"

    .line 68
    .line 69
    const/4 v9, 0x6

    .line 70
    invoke-direct {v5, v1, v0, v9, v8}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v8, "GIF87a"

    .line 74
    .line 75
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-nez v8, :cond_3

    .line 80
    .line 81
    const-string v8, "GIF89a"

    .line 82
    .line 83
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-nez v5, :cond_3

    .line 88
    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :cond_3
    aget-byte v5, v1, v9

    .line 92
    .line 93
    and-int/2addr v5, v7

    .line 94
    const/4 v8, 0x7

    .line 95
    aget-byte v8, v1, v8

    .line 96
    .line 97
    and-int/2addr v8, v7

    .line 98
    shl-int/2addr v8, v6

    .line 99
    or-int/2addr v5, v8

    .line 100
    aget-byte v8, v1, v6

    .line 101
    .line 102
    and-int/2addr v8, v7

    .line 103
    aget-byte v1, v1, v2

    .line 104
    .line 105
    and-int/2addr v1, v7

    .line 106
    shl-int/2addr v1, v6

    .line 107
    or-int/2addr v1, v8

    .line 108
    if-ne v5, v4, :cond_a

    .line 109
    .line 110
    if-ne v1, v4, :cond_a

    .line 111
    .line 112
    goto/16 :goto_2

    .line 113
    .line 114
    :cond_4
    const-string v5, "data:image/png"

    .line 115
    .line 116
    invoke-virtual {p2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_6

    .line 121
    .line 122
    array-length v5, v1

    .line 123
    const/16 v8, 0x18

    .line 124
    .line 125
    if-ge v5, v8, :cond_5

    .line 126
    .line 127
    goto/16 :goto_3

    .line 128
    .line 129
    :cond_5
    const/16 v5, 0x10

    .line 130
    .line 131
    aget-byte v9, v1, v5

    .line 132
    .line 133
    and-int/2addr v9, v7

    .line 134
    shl-int/2addr v9, v8

    .line 135
    const/16 v10, 0x11

    .line 136
    .line 137
    aget-byte v10, v1, v10

    .line 138
    .line 139
    and-int/2addr v10, v7

    .line 140
    shl-int/2addr v10, v5

    .line 141
    or-int/2addr v9, v10

    .line 142
    const/16 v10, 0x12

    .line 143
    .line 144
    aget-byte v10, v1, v10

    .line 145
    .line 146
    and-int/2addr v10, v7

    .line 147
    shl-int/2addr v10, v6

    .line 148
    or-int/2addr v9, v10

    .line 149
    const/16 v10, 0x13

    .line 150
    .line 151
    aget-byte v10, v1, v10

    .line 152
    .line 153
    and-int/2addr v10, v7

    .line 154
    or-int/2addr v9, v10

    .line 155
    const/16 v10, 0x14

    .line 156
    .line 157
    aget-byte v10, v1, v10

    .line 158
    .line 159
    and-int/2addr v10, v7

    .line 160
    shl-int/lit8 v8, v10, 0x18

    .line 161
    .line 162
    const/16 v10, 0x15

    .line 163
    .line 164
    aget-byte v10, v1, v10

    .line 165
    .line 166
    and-int/2addr v10, v7

    .line 167
    shl-int/lit8 v5, v10, 0x10

    .line 168
    .line 169
    or-int/2addr v5, v8

    .line 170
    const/16 v8, 0x16

    .line 171
    .line 172
    aget-byte v8, v1, v8

    .line 173
    .line 174
    and-int/2addr v8, v7

    .line 175
    shl-int/lit8 v6, v8, 0x8

    .line 176
    .line 177
    or-int/2addr v5, v6

    .line 178
    const/16 v6, 0x17

    .line 179
    .line 180
    aget-byte v1, v1, v6

    .line 181
    .line 182
    and-int/2addr v1, v7

    .line 183
    or-int/2addr v1, v5

    .line 184
    if-ne v9, v4, :cond_a

    .line 185
    .line 186
    if-ne v1, v4, :cond_a

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_6
    const-string v5, "data:image/jpeg"

    .line 190
    .line 191
    invoke-virtual {p2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_a

    .line 196
    .line 197
    move v5, v3

    .line 198
    :goto_0
    array-length v8, v1

    .line 199
    if-ge v5, v8, :cond_a

    .line 200
    .line 201
    aget-byte v8, v1, v5

    .line 202
    .line 203
    and-int/2addr v8, v7

    .line 204
    if-eq v8, v7, :cond_7

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_7
    add-int/lit8 v8, v5, 0x1

    .line 208
    .line 209
    aget-byte v8, v1, v8

    .line 210
    .line 211
    and-int/2addr v8, v7

    .line 212
    const/16 v9, 0xc0

    .line 213
    .line 214
    if-eq v8, v9, :cond_9

    .line 215
    .line 216
    const/16 v9, 0xc2

    .line 217
    .line 218
    if-ne v8, v9, :cond_8

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_8
    add-int/lit8 v8, v5, 0x2

    .line 222
    .line 223
    aget-byte v8, v1, v8

    .line 224
    .line 225
    and-int/2addr v8, v7

    .line 226
    shl-int/2addr v8, v6

    .line 227
    add-int/lit8 v9, v5, 0x3

    .line 228
    .line 229
    aget-byte v9, v1, v9

    .line 230
    .line 231
    and-int/2addr v9, v7

    .line 232
    or-int/2addr v8, v9

    .line 233
    add-int/2addr v8, v3

    .line 234
    add-int/2addr v5, v8

    .line 235
    goto :goto_0

    .line 236
    :cond_9
    :goto_1
    add-int/lit8 v8, v5, 0x5

    .line 237
    .line 238
    aget-byte v8, v1, v8

    .line 239
    .line 240
    and-int/2addr v8, v7

    .line 241
    shl-int/2addr v8, v6

    .line 242
    add-int/lit8 v9, v5, 0x6

    .line 243
    .line 244
    aget-byte v9, v1, v9

    .line 245
    .line 246
    and-int/2addr v9, v7

    .line 247
    or-int/2addr v8, v9

    .line 248
    add-int/lit8 v9, v5, 0x7

    .line 249
    .line 250
    aget-byte v9, v1, v9

    .line 251
    .line 252
    and-int/2addr v9, v7

    .line 253
    shl-int/2addr v9, v6

    .line 254
    add-int/2addr v5, v6

    .line 255
    aget-byte v1, v1, v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 256
    .line 257
    and-int/2addr v1, v7

    .line 258
    or-int/2addr v1, v9

    .line 259
    if-ne v1, v4, :cond_a

    .line 260
    .line 261
    if-ne v8, v4, :cond_a

    .line 262
    .line 263
    :goto_2
    const-string p1, "shouldOverrideUrlLoading: Detected 1x1 pixel tracking image. Allowing WebView to load. URL: "

    .line 264
    .line 265
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    const-string p2, "u1.e2"

    .line 270
    .line 271
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    return v0

    .line 275
    :catch_0
    :cond_a
    :goto_3
    invoke-virtual {p0, p1, p2}, Lu1/e2;->g(Lx1/i;Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    iget-object v5, p0, Lu1/e2;->g:Landroid/os/Handler;

    .line 280
    .line 281
    iget-object v6, p0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 282
    .line 283
    if-eqz v1, :cond_d

    .line 284
    .line 285
    iget-boolean p1, p0, Lu1/e2;->j:Z

    .line 286
    .line 287
    if-eqz p1, :cond_b

    .line 288
    .line 289
    invoke-virtual {v6}, Landroid/app/Activity;->finish()V

    .line 290
    .line 291
    .line 292
    :cond_b
    if-eqz p3, :cond_c

    .line 293
    .line 294
    iput-object p2, p0, Lu1/e2;->l:Ljava/lang/String;

    .line 295
    .line 296
    const/4 p1, 0x4

    .line 297
    iput p1, p0, Lu1/e2;->h:I

    .line 298
    .line 299
    const/4 p1, 0x0

    .line 300
    invoke-virtual {v5, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v6}, Lco/median/android/MainActivity;->m0()V

    .line 304
    .line 305
    .line 306
    :cond_c
    return v4

    .line 307
    :cond_d
    iput-boolean v0, p0, Lu1/e2;->j:Z

    .line 308
    .line 309
    iget-object p3, p0, Lu1/e2;->f:Lk/a;

    .line 310
    .line 311
    iput-object p2, p3, Lk/a;->c:Ljava/lang/Object;

    .line 312
    .line 313
    invoke-virtual {v6}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 314
    .line 315
    .line 316
    move-result-object p2

    .line 317
    check-cast p2, Lco/median/android/GoNativeApplication;

    .line 318
    .line 319
    iget-object p2, p2, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 320
    .line 321
    invoke-virtual {p2}, Lu1/x;->a()Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    check-cast p2, Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 328
    .line 329
    .line 330
    move-result-object p2

    .line 331
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result p3

    .line 335
    if-nez p3, :cond_10

    .line 336
    .line 337
    invoke-static {v6}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 338
    .line 339
    .line 340
    move-result-object p2

    .line 341
    iget-boolean p2, p2, Lx1/a;->B0:Z

    .line 342
    .line 343
    if-eqz p2, :cond_e

    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_e
    iput-boolean v4, v6, Lco/median/android/MainActivity;->U:Z

    .line 347
    .line 348
    iget-object p2, v6, Lco/median/android/MainActivity;->L:Lco/median/android/widget/MedianProgressView;

    .line 349
    .line 350
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 351
    .line 352
    .line 353
    const/high16 p3, 0x3f800000    # 1.0f

    .line 354
    .line 355
    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 356
    .line 357
    .line 358
    iget-object p2, v6, Lco/median/android/MainActivity;->J:Landroid/view/View;

    .line 359
    .line 360
    iget v1, v6, Lco/median/android/MainActivity;->W:F

    .line 361
    .line 362
    sub-float/2addr p3, v1

    .line 363
    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 364
    .line 365
    .line 366
    const-wide/high16 p2, 0x4024000000000000L    # 10.0

    .line 367
    .line 368
    invoke-virtual {v6, p2, p3}, Lco/median/android/MainActivity;->n0(D)V

    .line 369
    .line 370
    .line 371
    :goto_4
    iput v3, p0, Lu1/e2;->h:I

    .line 372
    .line 373
    iget-wide p2, p0, Lu1/e2;->k:D

    .line 374
    .line 375
    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-nez v1, :cond_f

    .line 380
    .line 381
    invoke-static {p2, p3}, Ljava/lang/Double;->isInfinite(D)Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-nez v1, :cond_f

    .line 386
    .line 387
    const-wide/16 v3, 0x0

    .line 388
    .line 389
    cmpl-double v1, p2, v3

    .line 390
    .line 391
    if-lez v1, :cond_f

    .line 392
    .line 393
    new-instance v1, Lb0/b;

    .line 394
    .line 395
    invoke-direct {v1, p0, p1, v2, v0}, Lb0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 396
    .line 397
    .line 398
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    mul-double/2addr p2, v2

    .line 404
    double-to-long p1, p2

    .line 405
    invoke-virtual {v5, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 406
    .line 407
    .line 408
    :cond_f
    invoke-virtual {v6}, Lco/median/android/MainActivity;->o0()V

    .line 409
    .line 410
    .line 411
    return v0

    .line 412
    :cond_10
    invoke-static {p2}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    throw p1
.end method

.method public final g(Lx1/i;Ljava/lang/String;)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto/16 :goto_b

    .line 5
    .line 6
    :cond_0
    const-string v1, "file:///android_asset/"

    .line 7
    .line 8
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto/16 :goto_b

    .line 15
    .line 16
    :cond_1
    const-string v1, "blob:"

    .line 17
    .line 18
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    goto/16 :goto_b

    .line 25
    .line 26
    :cond_2
    const-string v1, "about:blank"

    .line 27
    .line 28
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    goto/16 :goto_b

    .line 35
    .line 36
    :cond_3
    check-cast p1, Lu1/o0;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-virtual {p1, v1}, Lu1/o0;->setCheckLoginSignup(Z)V

    .line 40
    .line 41
    .line 42
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const/4 v4, 0x0

    .line 51
    iget-object v5, p0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 52
    .line 53
    if-eqz v3, :cond_9

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v6, "gonative-bridge"

    .line 60
    .line 61
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_9

    .line 66
    .line 67
    :try_start_0
    const-string p1, "json"

    .line 68
    .line 69
    invoke-virtual {v2, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance p2, Lorg/json/JSONArray;

    .line 74
    .line 75
    invoke-direct {p2, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    move p1, v0

    .line 79
    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-ge p1, v2, :cond_19

    .line 84
    .line 85
    invoke-virtual {p2, p1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-nez v2, :cond_4

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    const-string v3, "command"

    .line 93
    .line 94
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_5

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    const-string v3, "pop"

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_6

    .line 112
    .line 113
    iget-boolean v2, v5, Lco/median/android/MainActivity;->T:Z

    .line 114
    .line 115
    if-nez v2, :cond_8

    .line 116
    .line 117
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_6
    const-string v3, "clearPools"

    .line 122
    .line 123
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_8

    .line 128
    .line 129
    invoke-virtual {v5}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Lco/median/android/GoNativeApplication;

    .line 134
    .line 135
    iget-object v2, v2, Lco/median/android/GoNativeApplication;->h:Lu1/h2;

    .line 136
    .line 137
    iget-object v3, v2, Lu1/h2;->h:Lu1/o0;

    .line 138
    .line 139
    if-eqz v3, :cond_7

    .line 140
    .line 141
    invoke-virtual {v3}, Landroid/webkit/WebView;->stopLoading()V

    .line 142
    .line 143
    .line 144
    :cond_7
    iput-boolean v0, v2, Lu1/h2;->j:Z

    .line 145
    .line 146
    iput-object v4, v2, Lu1/h2;->h:Lu1/o0;

    .line 147
    .line 148
    iput-object v4, v2, Lu1/h2;->i:Ljava/lang/String;

    .line 149
    .line 150
    iput-object v4, v2, Lu1/h2;->k:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v2, v2, Lu1/h2;->c:Ljava/util/HashMap;

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 155
    .line 156
    .line 157
    :cond_8
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_9
    invoke-static {v5}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    const-string v7, "median"

    .line 169
    .line 170
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    const-string v8, "gonative"

    .line 175
    .line 176
    const-string v9, "u1.e2"

    .line 177
    .line 178
    if-nez v6, :cond_a

    .line 179
    .line 180
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_b

    .line 189
    .line 190
    :cond_a
    iget-object v6, p0, Lu1/e2;->d:Ljava/lang/String;

    .line 191
    .line 192
    if-eqz v6, :cond_b

    .line 193
    .line 194
    invoke-static {v5, v6}, Lt2/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-nez v6, :cond_b

    .line 199
    .line 200
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    new-instance p2, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v0, "URL not authorized for native bridge: "

    .line 207
    .line 208
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    iget-object v0, p0, Lu1/e2;->d:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    invoke-virtual {p1, v9, p2, v4}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 221
    .line 222
    .line 223
    return v1

    .line 224
    :cond_b
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-nez v6, :cond_25

    .line 233
    .line 234
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    if-eqz v6, :cond_c

    .line 243
    .line 244
    goto/16 :goto_c

    .line 245
    .line 246
    :cond_c
    iget-object v6, v3, Lx1/a;->V:Ljava/util/HashMap;

    .line 247
    .line 248
    if-eqz v6, :cond_e

    .line 249
    .line 250
    invoke-virtual {v6, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    check-cast v6, Ljava/lang/String;

    .line 255
    .line 256
    if-nez v6, :cond_d

    .line 257
    .line 258
    iget-object v6, v3, Lx1/a;->V:Ljava/util/HashMap;

    .line 259
    .line 260
    const-string v7, "*"

    .line 261
    .line 262
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    check-cast v6, Ljava/lang/String;

    .line 267
    .line 268
    :cond_d
    if-eqz v6, :cond_e

    .line 269
    .line 270
    invoke-virtual {v6, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    if-nez v7, :cond_e

    .line 275
    .line 276
    new-instance p1, Lb0/b;

    .line 277
    .line 278
    const/16 p2, 0x8

    .line 279
    .line 280
    invoke-direct {p1, p0, v6, p2, v0}, Lb0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v5, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 284
    .line 285
    .line 286
    return v1

    .line 287
    :cond_e
    invoke-virtual {p0, v2}, Lu1/e2;->b(Landroid/net/Uri;)Z

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    if-nez v6, :cond_15

    .line 292
    .line 293
    iget-object p1, v3, Lx1/a;->T:Lx1/f;

    .line 294
    .line 295
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p2

    .line 299
    invoke-virtual {p1, p2}, Lx1/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    const-string p2, "appbrowser"

    .line 304
    .line 305
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result p1

    .line 309
    if-eqz p1, :cond_f

    .line 310
    .line 311
    invoke-virtual {v5, v2}, Lco/median/android/MainActivity;->O(Landroid/net/Uri;)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_5

    .line 315
    .line 316
    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    const-string p2, "processing dynamic link: "

    .line 319
    .line 320
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-static {v9, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 331
    .line 332
    .line 333
    :try_start_1
    const-string p1, "intent"

    .line 334
    .line 335
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object p2

    .line 339
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    if-eqz p1, :cond_10

    .line 344
    .line 345
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-static {p1, v1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    invoke-virtual {v5, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 354
    .line 355
    .line 356
    goto :goto_5

    .line 357
    :catch_0
    move-exception p1

    .line 358
    goto :goto_3

    .line 359
    :catch_1
    move-exception p1

    .line 360
    goto :goto_4

    .line 361
    :cond_10
    const-string p1, "http"

    .line 362
    .line 363
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object p2

    .line 367
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result p1

    .line 371
    if-nez p1, :cond_12

    .line 372
    .line 373
    const-string p1, "https"

    .line 374
    .line 375
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object p2

    .line 379
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result p1

    .line 383
    if-eqz p1, :cond_11

    .line 384
    .line 385
    goto :goto_2

    .line 386
    :cond_11
    new-instance p1, Landroid/content/Intent;

    .line 387
    .line 388
    const-string p2, "android.intent.action.VIEW"

    .line 389
    .line 390
    invoke-direct {p1, p2, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_0

    .line 391
    .line 392
    .line 393
    :try_start_2
    invoke-virtual {v5, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/net/URISyntaxException; {:try_start_2 .. :try_end_2} :catch_0

    .line 394
    .line 395
    .line 396
    goto :goto_5

    .line 397
    :catch_2
    move-exception p2

    .line 398
    move-object v4, p1

    .line 399
    move-object p1, p2

    .line 400
    goto :goto_4

    .line 401
    :cond_12
    :goto_2
    :try_start_3
    invoke-virtual {v5, v2}, Lco/median/android/MainActivity;->P(Landroid/net/Uri;)V
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/net/URISyntaxException; {:try_start_3 .. :try_end_3} :catch_0

    .line 402
    .line 403
    .line 404
    goto :goto_5

    .line 405
    :goto_3
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 406
    .line 407
    .line 408
    move-result-object p2

    .line 409
    invoke-virtual {p1}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {p2, v9, v0, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 414
    .line 415
    .line 416
    goto :goto_5

    .line 417
    :goto_4
    if-eqz v4, :cond_14

    .line 418
    .line 419
    const-string p2, "browser_fallback_url"

    .line 420
    .line 421
    invoke-virtual {v4, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p2

    .line 425
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-nez v0, :cond_13

    .line 430
    .line 431
    invoke-virtual {v5, p2}, Lco/median/android/MainActivity;->K(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    goto :goto_5

    .line 435
    :cond_13
    const p2, 0x7f110025

    .line 436
    .line 437
    .line 438
    invoke-static {v5, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 443
    .line 444
    .line 445
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-virtual {v5, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p2

    .line 453
    invoke-virtual {v0, v9, p2, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 454
    .line 455
    .line 456
    :cond_14
    :goto_5
    const-string p1, "app_links"

    .line 457
    .line 458
    iget-object p2, v5, Lco/median/android/MainActivity;->y0:Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result p1

    .line 464
    if-eqz p1, :cond_19

    .line 465
    .line 466
    iget-object p1, p0, Lu1/e2;->d:Ljava/lang/String;

    .line 467
    .line 468
    if-nez p1, :cond_19

    .line 469
    .line 470
    invoke-virtual {v3}, Lx1/a;->t()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    invoke-virtual {v5, p1}, Lco/median/android/MainActivity;->K(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_15
    iget-boolean v2, v5, Lco/median/android/MainActivity;->r0:Z

    .line 479
    .line 480
    if-nez v2, :cond_16

    .line 481
    .line 482
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    const/high16 v6, -0x40800000    # -1.0f

    .line 491
    .line 492
    iput v6, v2, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 493
    .line 494
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    invoke-virtual {v6, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 499
    .line 500
    .line 501
    iput-boolean v0, v5, Lco/median/android/MainActivity;->r0:Z

    .line 502
    .line 503
    :cond_16
    iget-boolean v2, v3, Lx1/a;->D:Z

    .line 504
    .line 505
    if-eqz v2, :cond_1a

    .line 506
    .line 507
    invoke-virtual {v5}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    iget-object v6, v5, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 512
    .line 513
    iget-object v7, v2, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 516
    .line 517
    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v6

    .line 521
    check-cast v6, Lu1/g0;

    .line 522
    .line 523
    if-eqz v6, :cond_17

    .line 524
    .line 525
    iget-boolean v6, v6, Lu1/g0;->e:Z

    .line 526
    .line 527
    goto :goto_6

    .line 528
    :cond_17
    move v6, v0

    .line 529
    :goto_6
    if-eqz v6, :cond_18

    .line 530
    .line 531
    iget-object v6, v5, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 532
    .line 533
    iget-object v2, v2, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 536
    .line 537
    invoke-virtual {v2, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    check-cast v2, Lu1/g0;

    .line 542
    .line 543
    if-eqz v2, :cond_1a

    .line 544
    .line 545
    iput-boolean v0, v2, Lu1/g0;->e:Z

    .line 546
    .line 547
    goto :goto_8

    .line 548
    :cond_18
    iget v2, v3, Lx1/a;->E:I

    .line 549
    .line 550
    if-lez v2, :cond_1a

    .line 551
    .line 552
    invoke-virtual {v7}, Ljava/util/AbstractMap;->size()I

    .line 553
    .line 554
    .line 555
    move-result v2

    .line 556
    if-le v2, v1, :cond_1a

    .line 557
    .line 558
    invoke-virtual {v7}, Ljava/util/AbstractMap;->size()I

    .line 559
    .line 560
    .line 561
    move-result v2

    .line 562
    iget v6, v3, Lx1/a;->E:I

    .line 563
    .line 564
    if-lt v2, v6, :cond_1a

    .line 565
    .line 566
    invoke-virtual {v5, p2}, Lco/median/android/MainActivity;->M(Ljava/lang/String;)Z

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    if-eqz v2, :cond_1a

    .line 571
    .line 572
    :catch_3
    :cond_19
    :goto_7
    return v1

    .line 573
    :cond_1a
    :goto_8
    invoke-virtual {v5}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    iget-object v6, v5, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 578
    .line 579
    iget-object v2, v2, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 582
    .line 583
    invoke-virtual {v2, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    check-cast v2, Lu1/g0;

    .line 588
    .line 589
    const/4 v6, -0x1

    .line 590
    if-eqz v2, :cond_1b

    .line 591
    .line 592
    iget v2, v2, Lu1/g0;->c:I

    .line 593
    .line 594
    goto :goto_9

    .line 595
    :cond_1b
    move v2, v6

    .line 596
    :goto_9
    invoke-virtual {v5, p2}, Lco/median/android/MainActivity;->w0(Ljava/lang/String;)I

    .line 597
    .line 598
    .line 599
    move-result v7

    .line 600
    if-ltz v2, :cond_1f

    .line 601
    .line 602
    if-ltz v7, :cond_1f

    .line 603
    .line 604
    const-string v8, "postLoadJavascript"

    .line 605
    .line 606
    const-string v9, "url"

    .line 607
    .line 608
    if-le v7, v2, :cond_1d

    .line 609
    .line 610
    new-instance p1, Landroid/content/Intent;

    .line 611
    .line 612
    invoke-virtual {v5}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 613
    .line 614
    .line 615
    move-result-object v6

    .line 616
    const-class v7, Lco/median/android/MainActivity;

    .line 617
    .line 618
    invoke-direct {p1, v6, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 619
    .line 620
    .line 621
    const-string v6, "isRoot"

    .line 622
    .line 623
    invoke-virtual {p1, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 624
    .line 625
    .line 626
    invoke-virtual {p1, v9, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 627
    .line 628
    .line 629
    const-string p2, "parentUrlLevel"

    .line 630
    .line 631
    invoke-virtual {p1, p2, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 632
    .line 633
    .line 634
    iget-object p2, v5, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 635
    .line 636
    invoke-virtual {p1, v8, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 637
    .line 638
    .line 639
    iget-boolean p2, v3, Lx1/a;->D:Z

    .line 640
    .line 641
    if-eqz p2, :cond_1c

    .line 642
    .line 643
    const-string p2, "ignoreInterceptMaxWindows"

    .line 644
    .line 645
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 646
    .line 647
    .line 648
    :cond_1c
    const/16 p2, 0x190

    .line 649
    .line 650
    invoke-virtual {v5, p1, p2}, Landroidx/activity/q;->startActivityForResult(Landroid/content/Intent;I)V

    .line 651
    .line 652
    .line 653
    iput-object v4, v5, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 654
    .line 655
    iput-object v4, v5, Lco/median/android/MainActivity;->i0:Ljava/lang/String;

    .line 656
    .line 657
    return v1

    .line 658
    :cond_1d
    if-ge v7, v2, :cond_1f

    .line 659
    .line 660
    invoke-virtual {v5}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    iget-object v3, v5, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 665
    .line 666
    iget-object v2, v2, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 669
    .line 670
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    check-cast v2, Lu1/g0;

    .line 675
    .line 676
    if-eqz v2, :cond_1e

    .line 677
    .line 678
    iget v2, v2, Lu1/g0;->d:I

    .line 679
    .line 680
    goto :goto_a

    .line 681
    :cond_1e
    move v2, v6

    .line 682
    :goto_a
    if-gt v7, v2, :cond_1f

    .line 683
    .line 684
    new-instance p1, Landroid/content/Intent;

    .line 685
    .line 686
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 687
    .line 688
    .line 689
    invoke-virtual {p1, v9, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 690
    .line 691
    .line 692
    const-string p2, "urlLevel"

    .line 693
    .line 694
    invoke-virtual {p1, p2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 695
    .line 696
    .line 697
    iget-object p2, v5, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 698
    .line 699
    invoke-virtual {p1, v8, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v5, v6, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v5}, Landroid/app/Activity;->finish()V

    .line 706
    .line 707
    .line 708
    return v1

    .line 709
    :cond_1f
    if-ltz v7, :cond_20

    .line 710
    .line 711
    invoke-virtual {v5}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    iget-object v3, v5, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 716
    .line 717
    iget-object v2, v2, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 720
    .line 721
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    check-cast v2, Lu1/g0;

    .line 726
    .line 727
    if-eqz v2, :cond_20

    .line 728
    .line 729
    iget v3, v2, Lu1/g0;->d:I

    .line 730
    .line 731
    iput v7, v2, Lu1/g0;->c:I

    .line 732
    .line 733
    iput v3, v2, Lu1/g0;->d:I

    .line 734
    .line 735
    :cond_20
    new-instance v2, Landroidx/activity/p;

    .line 736
    .line 737
    const/16 v3, 0xa

    .line 738
    .line 739
    invoke-direct {v2, p0, v3, p2}, Landroidx/activity/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v5, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v5}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    check-cast v2, Lco/median/android/GoNativeApplication;

    .line 750
    .line 751
    iget-object v2, v2, Lco/median/android/GoNativeApplication;->h:Lu1/h2;

    .line 752
    .line 753
    invoke-virtual {v2, p2}, Lu1/h2;->d(Ljava/lang/String;)Landroid/util/Pair;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v4, Lx1/i;

    .line 760
    .line 761
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v3, Lu1/i2;

    .line 764
    .line 765
    if-eqz v4, :cond_21

    .line 766
    .line 767
    sget-object v6, Lu1/i2;->f:Lu1/i2;

    .line 768
    .line 769
    if-ne v3, v6, :cond_21

    .line 770
    .line 771
    new-instance p1, Lu1/c2;

    .line 772
    .line 773
    invoke-direct {p1, p0, v4, p2, v0}, Lu1/c2;-><init>(Lu1/e2;Lx1/i;Ljava/lang/String;I)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v5, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v2, v4}, Lu1/h2;->a(Lx1/i;)V

    .line 780
    .line 781
    .line 782
    iput-boolean v0, v2, Lu1/h2;->l:Z

    .line 783
    .line 784
    invoke-virtual {v2, v5}, Lu1/h2;->c(Landroid/app/Activity;)V

    .line 785
    .line 786
    .line 787
    return v1

    .line 788
    :cond_21
    if-eqz v4, :cond_22

    .line 789
    .line 790
    sget-object v6, Lu1/i2;->h:Lu1/i2;

    .line 791
    .line 792
    if-ne v3, v6, :cond_22

    .line 793
    .line 794
    new-instance p1, Lu1/c2;

    .line 795
    .line 796
    invoke-direct {p1, p0, v4, p2, v1}, Lu1/c2;-><init>(Lu1/e2;Lx1/i;Ljava/lang/String;I)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v5, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 800
    .line 801
    .line 802
    return v1

    .line 803
    :cond_22
    if-eqz v4, :cond_23

    .line 804
    .line 805
    sget-object v6, Lu1/i2;->g:Lu1/i2;

    .line 806
    .line 807
    if-ne v3, v6, :cond_23

    .line 808
    .line 809
    iget-object v3, p0, Lu1/e2;->d:Ljava/lang/String;

    .line 810
    .line 811
    invoke-static {p2, v3}, Lt2/i;->R(Ljava/lang/String;Ljava/lang/String;)Z

    .line 812
    .line 813
    .line 814
    move-result v3

    .line 815
    if-nez v3, :cond_23

    .line 816
    .line 817
    new-instance p1, Lu1/c2;

    .line 818
    .line 819
    const/4 v0, 0x2

    .line 820
    invoke-direct {p1, p0, v4, p2, v0}, Lu1/c2;-><init>(Lu1/e2;Lx1/i;Ljava/lang/String;I)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v5, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 824
    .line 825
    .line 826
    return v1

    .line 827
    :cond_23
    iget-boolean p2, v5, Lco/median/android/MainActivity;->H:Z

    .line 828
    .line 829
    if-eqz p2, :cond_24

    .line 830
    .line 831
    invoke-virtual {v2, p1}, Lu1/h2;->a(Lx1/i;)V

    .line 832
    .line 833
    .line 834
    iput-boolean v0, v5, Lco/median/android/MainActivity;->H:Z

    .line 835
    .line 836
    :cond_24
    :goto_b
    return v0

    .line 837
    :cond_25
    :goto_c
    invoke-virtual {v5}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 838
    .line 839
    .line 840
    move-result-object p1

    .line 841
    check-cast p1, Lco/median/android/GoNativeApplication;

    .line 842
    .line 843
    iget-object p1, p1, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 844
    .line 845
    invoke-virtual {p1, v5, v2}, Lu1/x;->b(Landroid/app/Activity;Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    return v1
.end method
