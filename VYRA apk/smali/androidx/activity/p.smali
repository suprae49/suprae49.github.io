.class public final synthetic Landroidx/activity/p;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/p;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/activity/p;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/activity/p;->h:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Landroidx/activity/p;->f:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, Landroidx/activity/p;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v5, p0, Landroidx/activity/p;->g:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v5, Landroid/app/Activity;

    .line 14
    .line 15
    check-cast v4, Lz1/g;

    .line 16
    .line 17
    invoke-static {v5}, Lt1/l;->a(Landroid/app/Activity;)V

    .line 18
    .line 19
    .line 20
    iput-boolean v3, v4, Lz1/g;->e:Z

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iput-wide v0, v4, Lz1/g;->f:J

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    check-cast v5, Lu1/e2;

    .line 30
    .line 31
    check-cast v4, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v0, v5, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 34
    .line 35
    iget-object v0, v0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0, v4, v2}, Lu1/e;->c(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :pswitch_1
    check-cast v5, Lco/median/android/MainActivity$a;

    .line 45
    .line 46
    check-cast v4, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v5, v4}, Lco/median/android/MainActivity$a;->a(Lco/median/android/MainActivity$a;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_2
    check-cast v5, Lco/median/android/MainActivity;

    .line 53
    .line 54
    check-cast v4, Ljava/lang/String;

    .line 55
    .line 56
    sget v0, Lco/median/android/MainActivity;->G0:I

    .line 57
    .line 58
    invoke-virtual {v5, v4, v1}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_3
    check-cast v5, Lu1/w;

    .line 63
    .line 64
    check-cast v4, Lu1/u;

    .line 65
    .line 66
    iget-object v0, v5, Lu1/w;->d:Lco/median/android/MainActivity;

    .line 67
    .line 68
    iget-object v1, v4, Lu1/u;->g:Landroid/net/Uri;

    .line 69
    .line 70
    if-nez v1, :cond_1

    .line 71
    .line 72
    iget-object v1, v4, Lu1/u;->f:Ljava/io/File;

    .line 73
    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v6, ".fileprovider"

    .line 93
    .line 94
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object v6, v4, Lu1/u;->f:Ljava/io/File;

    .line 102
    .line 103
    invoke-static {v0, v1, v6}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iput-object v1, v4, Lu1/u;->g:Landroid/net/Uri;

    .line 108
    .line 109
    :cond_1
    iget-object v1, v4, Lu1/u;->g:Landroid/net/Uri;

    .line 110
    .line 111
    if-nez v1, :cond_2

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    iget-object v4, v4, Lu1/u;->d:Ljava/lang/String;

    .line 115
    .line 116
    iget v5, v5, Lu1/w;->a:I

    .line 117
    .line 118
    const/4 v6, 0x2

    .line 119
    if-ne v5, v6, :cond_3

    .line 120
    .line 121
    move v2, v3

    .line 122
    :cond_3
    invoke-static {v0, v1, v4, v2}, Lu1/o;->k(Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;Z)V

    .line 123
    .line 124
    .line 125
    :goto_1
    return-void

    .line 126
    :pswitch_4
    check-cast v5, Landroid/app/Activity;

    .line 127
    .line 128
    check-cast v4, Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v5, v4, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_5
    check-cast v5, Lu1/o;

    .line 139
    .line 140
    check-cast v4, Ljava/lang/String;

    .line 141
    .line 142
    iget-object v0, v5, Lu1/o;->a:Lco/median/android/MainActivity;

    .line 143
    .line 144
    const v1, 0x7f11006c

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_6
    check-cast v5, La3/h0;

    .line 168
    .line 169
    check-cast v4, Lp1/h;

    .line 170
    .line 171
    iget-object v0, v5, La3/h0;->g:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Landroidx/emoji2/text/p;

    .line 174
    .line 175
    invoke-virtual {v0}, Landroidx/emoji2/text/p;->n()Landroid/view/ViewGroup;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v5}, Lp1/h;->b(La3/h0;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :pswitch_7
    check-cast v5, Lcom/google/android/material/button/MaterialButton;

    .line 187
    .line 188
    check-cast v4, Ljava/lang/Runnable;

    .line 189
    .line 190
    sget-object v0, Lcom/google/android/material/button/MaterialButton;->S:[I

    .line 191
    .line 192
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    .line 193
    .line 194
    .line 195
    iget-object v0, v5, Lcom/google/android/material/button/MaterialButton;->H:Landroid/widget/LinearLayout$LayoutParams;

    .line 196
    .line 197
    if-eqz v0, :cond_4

    .line 198
    .line 199
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 200
    .line 201
    .line 202
    iput-object v1, v5, Lcom/google/android/material/button/MaterialButton;->H:Landroid/widget/LinearLayout$LayoutParams;

    .line 203
    .line 204
    const/high16 v0, -0x31000000

    .line 205
    .line 206
    iput v0, v5, Lcom/google/android/material/button/MaterialButton;->E:F

    .line 207
    .line 208
    :cond_4
    invoke-virtual {v5}, Landroid/view/View;->requestLayout()V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :pswitch_8
    check-cast v5, Le0/b;

    .line 213
    .line 214
    check-cast v4, Landroid/graphics/Typeface;

    .line 215
    .line 216
    invoke-virtual {v5, v4}, Le0/b;->i(Landroid/graphics/Typeface;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :pswitch_9
    check-cast v5, Le/o;

    .line 221
    .line 222
    check-cast v4, Ljava/lang/Runnable;

    .line 223
    .line 224
    :try_start_0
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5}, Le/o;->a()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :catchall_0
    move-exception v0

    .line 232
    invoke-virtual {v5}, Le/o;->a()V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :pswitch_a
    check-cast v5, Landroidx/fragment/app/e0;

    .line 237
    .line 238
    check-cast v4, Landroidx/activity/j0;

    .line 239
    .line 240
    sget v0, Landroidx/activity/q;->x:I

    .line 241
    .line 242
    iget-object v0, v5, Landroidx/activity/q;->f:Landroidx/lifecycle/v;

    .line 243
    .line 244
    new-instance v1, Landroidx/activity/h;

    .line 245
    .line 246
    invoke-direct {v1, v4, v5}, Landroidx/activity/h;-><init>(Landroidx/activity/j0;Landroidx/fragment/app/e0;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v1}, Landroidx/lifecycle/v;->a(Landroidx/lifecycle/s;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
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
