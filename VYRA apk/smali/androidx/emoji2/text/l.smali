.class public final synthetic Landroidx/emoji2/text/l;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Landroidx/emoji2/text/l;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/emoji2/text/l;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/emoji2/text/l;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Landroidx/emoji2/text/l;->i:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/emoji2/text/l;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/emoji2/text/l;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lco/median/android/MainActivity;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/emoji2/text/l;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/emoji2/text/l;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lu1/x;

    .line 17
    .line 18
    sget v3, Lco/median/android/MainActivity;->G0:I

    .line 19
    .line 20
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0, v3}, Lu1/x;->b(Landroid/app/Activity;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v2, v0, v1}, Lu1/x;->b(Landroid/app/Activity;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void

    .line 37
    :pswitch_0
    iget-object v0, p0, Landroidx/emoji2/text/l;->g:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lu1/f0;

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/emoji2/text/l;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Landroid/webkit/WebResourceRequest;

    .line 44
    .line 45
    iget-object v2, p0, Landroidx/emoji2/text/l;->i:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Ljava/util/Map;

    .line 48
    .line 49
    iget-object v0, v0, Lu1/f0;->b:Lco/median/android/MainActivity;

    .line 50
    .line 51
    invoke-interface {v1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v0, v0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 60
    .line 61
    check-cast v0, Landroid/webkit/WebView;

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_1
    iget-object v0, p0, Landroidx/emoji2/text/l;->g:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lx1/g;

    .line 70
    .line 71
    iget-object v1, p0, Landroidx/emoji2/text/l;->h:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v2, p0, Landroidx/emoji2/text/l;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Lorg/json/JSONObject;

    .line 78
    .line 79
    invoke-static {v1, v2}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v0, Lco/median/android/MainActivity;

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    invoke-virtual {v0, v1, v2}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_2
    iget-object v0, p0, Landroidx/emoji2/text/l;->g:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, La3/h0;

    .line 93
    .line 94
    iget-object v1, p0, Landroidx/emoji2/text/l;->h:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lu1/h0;

    .line 97
    .line 98
    iget-object v2, p0, Landroidx/emoji2/text/l;->i:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 101
    .line 102
    :try_start_1
    iget-object v0, v0, La3/h0;->g:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Landroid/content/Context;

    .line 105
    .line 106
    invoke-static {v0}, Le4/a;->m(Landroid/content/Context;)Landroidx/emoji2/text/v;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_0

    .line 111
    .line 112
    iget-object v3, v0, Landroidx/emoji2/text/g;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v3, Landroidx/emoji2/text/j;

    .line 115
    .line 116
    check-cast v3, Landroidx/emoji2/text/u;

    .line 117
    .line 118
    iget-object v4, v3, Landroidx/emoji2/text/u;->i:Ljava/lang/Object;

    .line 119
    .line 120
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    :try_start_2
    iput-object v2, v3, Landroidx/emoji2/text/u;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 122
    .line 123
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    :try_start_3
    iget-object v0, v0, Landroidx/emoji2/text/g;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Landroidx/emoji2/text/j;

    .line 127
    .line 128
    new-instance v3, Landroidx/emoji2/text/m;

    .line 129
    .line 130
    invoke-direct {v3, v1, v2}, Landroidx/emoji2/text/m;-><init>(Lu1/h0;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v0, v3}, Landroidx/emoji2/text/j;->u(Lu1/h0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :catchall_0
    move-exception v0

    .line 138
    goto :goto_1

    .line 139
    :catchall_1
    move-exception v0

    .line 140
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 141
    :try_start_5
    throw v0

    .line 142
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 143
    .line 144
    const-string v3, "EmojiCompat font provider not available on this device."

    .line 145
    .line 146
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 150
    :goto_1
    invoke-virtual {v1, v0}, Lu1/h0;->P(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 154
    .line 155
    .line 156
    :goto_2
    return-void

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
