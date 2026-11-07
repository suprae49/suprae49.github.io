.class public final Lb0/b;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    .line 1
    const/4 p3, 0x4

    .line 2
    iput p3, p0, Lb0/b;->f:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb0/b;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p2, p0, Lb0/b;->f:I

    iput-object p1, p0, Lb0/b;->g:Ljava/lang/Object;

    iput-object p3, p0, Lb0/b;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 12
    iput p3, p0, Lb0/b;->f:I

    iput-object p1, p0, Lb0/b;->h:Ljava/lang/Object;

    iput-object p2, p0, Lb0/b;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lb0/b;->f:I

    .line 2
    .line 3
    iget-object v1, p0, Lb0/b;->h:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lu1/e2;

    .line 9
    .line 10
    iget-object v0, v1, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 11
    .line 12
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lx1/i;

    .line 19
    .line 20
    invoke-interface {v1}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-boolean v0, v0, Lx1/a;->W:Z

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const-string v0, "file:///android_asset/offline.html"

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    check-cast v1, Lu1/o0;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lu1/o0;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :pswitch_0
    check-cast v1, Lu1/e2;

    .line 43
    .line 44
    iget-object v0, v1, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 45
    .line 46
    iget-object v1, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->K(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_1
    check-cast v1, Lco/median/android/MainActivity;

    .line 55
    .line 56
    iget-object v0, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/lang/String;

    .line 59
    .line 60
    sget v2, Lco/median/android/MainActivity;->G0:I

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Lco/median/android/MainActivity;->X(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_2
    iget-object v0, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ll0/f;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ll0/f;->accept(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_3
    iget-object v0, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, La3/h0;

    .line 77
    .line 78
    check-cast v1, Landroid/graphics/Typeface;

    .line 79
    .line 80
    iget-object v0, v0, La3/h0;->g:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Le0/b;

    .line 83
    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Le0/b;->i(Landroid/graphics/Typeface;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    return-void

    .line 90
    :pswitch_4
    check-cast v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 91
    .line 92
    iget-object v0, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->f:Lw0/e;

    .line 93
    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0}, Lw0/e;->g()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    iget-object v0, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Landroid/view/View;

    .line 105
    .line 106
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    return-void

    .line 110
    :pswitch_5
    move-object v0, v1

    .line 111
    check-cast v0, Lb4/e;

    .line 112
    .line 113
    iget-object v2, v0, Lb4/e;->h:Lz3/h;

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    :cond_3
    :try_start_0
    iget-object v3, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v3, Ljava/lang/Runnable;

    .line 119
    .line 120
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :catchall_0
    move-exception v3

    .line 125
    sget-object v4, Li3/h;->f:Li3/h;

    .line 126
    .line 127
    invoke-static {v4, v3}, Lz3/l;->c(Li3/g;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    :goto_0
    invoke-virtual {v0}, Lb4/e;->h()Ljava/lang/Runnable;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    if-nez v3, :cond_4

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    iput-object v3, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 138
    .line 139
    add-int/lit8 v1, v1, 0x1

    .line 140
    .line 141
    const/16 v3, 0x10

    .line 142
    .line 143
    if-lt v1, v3, :cond_3

    .line 144
    .line 145
    invoke-virtual {v2, v0}, Lz3/h;->d(Li3/g;)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_3

    .line 150
    .line 151
    invoke-virtual {v2, v0, p0}, Lz3/h;->c(Li3/g;Ljava/lang/Runnable;)V

    .line 152
    .line 153
    .line 154
    :goto_1
    return-void

    .line 155
    :pswitch_6
    iget-object v0, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 156
    .line 157
    :try_start_1
    sget-object v2, Lb0/d;->d:Ljava/lang/reflect/Method;

    .line 158
    .line 159
    if-eqz v2, :cond_5

    .line 160
    .line 161
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 162
    .line 163
    const-string v4, "AppCompat recreation"

    .line 164
    .line 165
    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :catchall_1
    move-exception v0

    .line 174
    goto :goto_2

    .line 175
    :catch_0
    move-exception v0

    .line 176
    goto :goto_3

    .line 177
    :cond_5
    sget-object v2, Lb0/d;->e:Ljava/lang/reflect/Method;

    .line 178
    .line 179
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 180
    .line 181
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :goto_2
    const-string v1, "ActivityRecreator"

    .line 190
    .line 191
    const-string v2, "Exception while invoking performStopActivity"

    .line 192
    .line 193
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    const-class v2, Ljava/lang/RuntimeException;

    .line 202
    .line 203
    if-ne v1, v2, :cond_7

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    if-eqz v1, :cond_7

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    const-string v2, "Unable to stop"

    .line 216
    .line 217
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-nez v1, :cond_6

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_6
    throw v0

    .line 225
    :cond_7
    :goto_4
    return-void

    .line 226
    :pswitch_7
    check-cast v1, Landroid/app/Application;

    .line 227
    .line 228
    iget-object v0, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Lb0/c;

    .line 231
    .line 232
    invoke-virtual {v1, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :pswitch_8
    iget-object v0, p0, Lb0/b;->g:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Lb0/c;

    .line 239
    .line 240
    iput-object v1, v0, Lb0/c;->f:Ljava/lang/Object;

    .line 241
    .line 242
    return-void

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
