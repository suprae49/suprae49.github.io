.class public final Landroidx/emoji2/text/t;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static e:Landroidx/emoji2/text/t;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1144
    const/16 v0, 0x8

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x3

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    .line 1158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1159
    const-class v0, Lcom/google/android/material/datepicker/l;

    .line 1160
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f040387

    .line 1161
    invoke-static {p1, v1, v0}, Lt1/l;->r(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    move-result-object v0

    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 1162
    sget-object v1, La2/a;->v:[I

    .line 1163
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    .line 1164
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 1165
    invoke-static {p1, v1}, La3/h0;->w(Landroid/content/Context;I)La3/h0;

    move-result-object v1

    iput-object v1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    const/4 v1, 0x2

    .line 1166
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 1167
    invoke-static {p1, v1}, La3/h0;->w(Landroid/content/Context;I)La3/h0;

    const/4 v1, 0x3

    .line 1168
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 1169
    invoke-static {p1, v1}, La3/h0;->w(Landroid/content/Context;I)La3/h0;

    const/4 v1, 0x5

    .line 1170
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 1171
    invoke-static {p1, v1}, La3/h0;->w(Landroid/content/Context;I)La3/h0;

    const/4 v1, 0x7

    .line 1172
    invoke-static {p1, v0, v1}, Lt2/i;->h(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    const/16 v3, 0x9

    .line 1173
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 1174
    invoke-static {p1, v3}, La3/h0;->w(Landroid/content/Context;I)La3/h0;

    move-result-object v3

    iput-object v3, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    const/16 v3, 0x8

    .line 1175
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 1176
    invoke-static {p1, v3}, La3/h0;->w(Landroid/content/Context;I)La3/h0;

    const/16 v3, 0xa

    .line 1177
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 1178
    invoke-static {p1, v2}, La3/h0;->w(Landroid/content/Context;I)La3/h0;

    move-result-object p1

    iput-object p1, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 1179
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 1180
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 1181
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    .line 1145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1146
    iput-object p1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1147
    iput-object p2, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    .line 1152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1153
    new-instance v0, Le/n0;

    .line 1154
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1155
    iput-object v0, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 1156
    iput-object p1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1157
    iput-object p2, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/emoji2/text/x;La3/f;Landroidx/emoji2/text/d;Ljava/util/Set;)V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    .line 1188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1189
    iput-object p2, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1190
    iput-object p1, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 1191
    iput-object p3, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 1192
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 1193
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 1194
    new-instance v1, Ljava/lang/String;

    const/4 p3, 0x0

    array-length p4, p2

    invoke-direct {v1, p2, p3, p4}, Ljava/lang/String;-><init>([III)V

    .line 1195
    new-instance v6, Landroidx/emoji2/text/r;

    const/4 p2, 0x0

    invoke-direct {v6, v1, p2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 1196
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Landroidx/emoji2/text/t;->u(Ljava/lang/CharSequence;IIIZLandroidx/emoji2/text/q;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/t0;Landroidx/lifecycle/s0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    sget-object v0, Lf1/a;->b:Lf1/a;

    .line 1143
    invoke-direct {p0, p1, p2, v0}, Landroidx/emoji2/text/t;-><init>(Landroidx/lifecycle/t0;Landroidx/lifecycle/s0;Lf1/b;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/t0;Landroidx/lifecycle/s0;Lf1/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1126
    iput-object p1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1127
    iput-object p2, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 1128
    iput-object p3, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb0/j;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    iput v0, v1, Landroidx/emoji2/text/t;->a:I

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, v1, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object v2, v1, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v0, v2, Lb0/j;->a:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v3, v2, Lb0/j;->p:Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v4, v2, Lb0/j;->c:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v5, v2, Lb0/j;->d:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v6, v2, Lb0/j;->m:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v7, Landroid/app/Notification$Builder;

    .line 31
    .line 32
    invoke-direct {v7, v0, v6}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v7, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v6, v2, Lb0/j;->o:Landroid/app/Notification;

    .line 38
    .line 39
    iget-wide v8, v6, Landroid/app/Notification;->when:J

    .line 40
    .line 41
    invoke-virtual {v7, v8, v9}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v8, v6, Landroid/app/Notification;->icon:I

    .line 46
    .line 47
    iget v9, v6, Landroid/app/Notification;->iconLevel:I

    .line 48
    .line 49
    invoke-virtual {v0, v8, v9}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v8, v6, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 54
    .line 55
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v8, v6, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 60
    .line 61
    const/4 v9, 0x0

    .line 62
    invoke-virtual {v0, v8, v9}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v8, v6, Landroid/app/Notification;->vibrate:[J

    .line 67
    .line 68
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget v8, v6, Landroid/app/Notification;->ledARGB:I

    .line 73
    .line 74
    iget v10, v6, Landroid/app/Notification;->ledOnMS:I

    .line 75
    .line 76
    iget v11, v6, Landroid/app/Notification;->ledOffMS:I

    .line 77
    .line 78
    invoke-virtual {v0, v8, v10, v11}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget v8, v6, Landroid/app/Notification;->flags:I

    .line 83
    .line 84
    const/4 v10, 0x2

    .line 85
    and-int/2addr v8, v10

    .line 86
    const/4 v11, 0x1

    .line 87
    const/4 v12, 0x0

    .line 88
    if-eqz v8, :cond_0

    .line 89
    .line 90
    move v8, v11

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    move v8, v12

    .line 93
    :goto_0
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget v8, v6, Landroid/app/Notification;->flags:I

    .line 98
    .line 99
    and-int/lit8 v8, v8, 0x8

    .line 100
    .line 101
    if-eqz v8, :cond_1

    .line 102
    .line 103
    move v8, v11

    .line 104
    goto :goto_1

    .line 105
    :cond_1
    move v8, v12

    .line 106
    :goto_1
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget v8, v6, Landroid/app/Notification;->flags:I

    .line 111
    .line 112
    and-int/lit8 v8, v8, 0x10

    .line 113
    .line 114
    if-eqz v8, :cond_2

    .line 115
    .line 116
    move v8, v11

    .line 117
    goto :goto_2

    .line 118
    :cond_2
    move v8, v12

    .line 119
    :goto_2
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget v8, v6, Landroid/app/Notification;->defaults:I

    .line 124
    .line 125
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v8, v2, Lb0/j;->e:Ljava/lang/CharSequence;

    .line 130
    .line 131
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v8, v2, Lb0/j;->f:Ljava/lang/CharSequence;

    .line 136
    .line 137
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0, v9}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget-object v8, v2, Lb0/j;->g:Landroid/app/PendingIntent;

    .line 146
    .line 147
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-object v8, v6, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 152
    .line 153
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iget v8, v6, Landroid/app/Notification;->flags:I

    .line 158
    .line 159
    and-int/lit16 v8, v8, 0x80

    .line 160
    .line 161
    if-eqz v8, :cond_3

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_3
    move v11, v12

    .line 165
    :goto_3
    invoke-virtual {v0, v9, v11}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0, v12, v12, v12}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7, v9}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7, v9}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    iget v7, v2, Lb0/j;->h:I

    .line 188
    .line 189
    invoke-virtual {v0, v7}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 190
    .line 191
    .line 192
    iget-object v7, v2, Lb0/j;->b:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    move v0, v12

    .line 199
    :goto_4
    const-string v13, "android.support.allowGeneratedReplies"

    .line 200
    .line 201
    if-ge v0, v8, :cond_12

    .line 202
    .line 203
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    add-int/lit8 v16, v0, 0x1

    .line 208
    .line 209
    check-cast v15, Lb0/i;

    .line 210
    .line 211
    iget-object v0, v15, Lb0/i;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 212
    .line 213
    if-nez v0, :cond_4

    .line 214
    .line 215
    iget v0, v15, Lb0/i;->e:I

    .line 216
    .line 217
    if-eqz v0, :cond_4

    .line 218
    .line 219
    invoke-static {v0}, Landroidx/core/graphics/drawable/IconCompat;->a(I)Landroidx/core/graphics/drawable/IconCompat;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iput-object v0, v15, Lb0/i;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 224
    .line 225
    :cond_4
    iget-object v11, v15, Lb0/i;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 226
    .line 227
    move/from16 v17, v12

    .line 228
    .line 229
    iget-boolean v12, v15, Lb0/i;->c:Z

    .line 230
    .line 231
    iget-object v10, v15, Lb0/i;->a:Landroid/os/Bundle;

    .line 232
    .line 233
    new-instance v9, Landroid/app/Notification$Action$Builder;

    .line 234
    .line 235
    if-eqz v11, :cond_c

    .line 236
    .line 237
    const-string v14, "IconCompat"

    .line 238
    .line 239
    iget v0, v11, Landroidx/core/graphics/drawable/IconCompat;->a:I

    .line 240
    .line 241
    packed-switch v0, :pswitch_data_0

    .line 242
    .line 243
    .line 244
    :pswitch_0
    const-string v0, "Unknown type"

    .line 245
    .line 246
    invoke-static {v0}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const/4 v0, 0x0

    .line 250
    throw v0

    .line 251
    :pswitch_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 252
    .line 253
    const/16 v14, 0x1e

    .line 254
    .line 255
    if-lt v0, v14, :cond_5

    .line 256
    .line 257
    invoke-virtual {v11}, Landroidx/core/graphics/drawable/IconCompat;->c()Landroid/net/Uri;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v0}, Lc0/b;->b(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    :goto_5
    move-object/from16 v18, v4

    .line 266
    .line 267
    :goto_6
    move-object/from16 v21, v5

    .line 268
    .line 269
    move-object/from16 v19, v7

    .line 270
    .line 271
    move/from16 v20, v8

    .line 272
    .line 273
    const/4 v5, 0x2

    .line 274
    goto/16 :goto_e

    .line 275
    .line 276
    :cond_5
    const-string v0, "Context is required to resolve the file uri of the icon: "

    .line 277
    .line 278
    invoke-virtual {v11}, Landroidx/core/graphics/drawable/IconCompat;->c()Landroid/net/Uri;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-static {v2, v0}, Landroidx/fragment/app/q;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const/4 v0, 0x0

    .line 286
    throw v0

    .line 287
    :pswitch_2
    iget-object v0, v11, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v0, Landroid/graphics/Bitmap;

    .line 290
    .line 291
    invoke-static {v0}, Landroid/graphics/drawable/Icon;->createWithAdaptiveBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    goto :goto_5

    .line 296
    :pswitch_3
    iget-object v0, v11, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v0, Ljava/lang/String;

    .line 299
    .line 300
    invoke-static {v0}, Landroid/graphics/drawable/Icon;->createWithContentUri(Ljava/lang/String;)Landroid/graphics/drawable/Icon;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    goto :goto_5

    .line 305
    :pswitch_4
    iget-object v0, v11, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, [B

    .line 308
    .line 309
    iget v14, v11, Landroidx/core/graphics/drawable/IconCompat;->e:I

    .line 310
    .line 311
    move-object/from16 v18, v4

    .line 312
    .line 313
    iget v4, v11, Landroidx/core/graphics/drawable/IconCompat;->f:I

    .line 314
    .line 315
    invoke-static {v0, v14, v4}, Landroid/graphics/drawable/Icon;->createWithData([BII)Landroid/graphics/drawable/Icon;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    goto :goto_6

    .line 320
    :pswitch_5
    move-object/from16 v18, v4

    .line 321
    .line 322
    const/4 v4, -0x1

    .line 323
    if-ne v0, v4, :cond_7

    .line 324
    .line 325
    iget-object v0, v11, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 326
    .line 327
    const-string v4, "Unable to get icon package"

    .line 328
    .line 329
    move-object/from16 v19, v7

    .line 330
    .line 331
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 332
    .line 333
    move/from16 v20, v8

    .line 334
    .line 335
    const/16 v8, 0x1c

    .line 336
    .line 337
    if-lt v7, v8, :cond_6

    .line 338
    .line 339
    invoke-static {v0}, Lc0/a;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    move-object/from16 v21, v5

    .line 344
    .line 345
    :goto_7
    const/4 v5, 0x2

    .line 346
    goto :goto_d

    .line 347
    :cond_6
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    const-string v8, "getResPackage"
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3

    .line 352
    .line 353
    move-object/from16 v21, v5

    .line 354
    .line 355
    const/4 v5, 0x0

    .line 356
    :try_start_1
    invoke-virtual {v7, v8, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    invoke-virtual {v7, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 365
    .line 366
    goto :goto_7

    .line 367
    :catch_0
    move-exception v0

    .line 368
    goto :goto_8

    .line 369
    :catch_1
    move-exception v0

    .line 370
    goto :goto_9

    .line 371
    :catch_2
    move-exception v0

    .line 372
    goto :goto_a

    .line 373
    :catch_3
    move-exception v0

    .line 374
    move-object/from16 v21, v5

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :catch_4
    move-exception v0

    .line 378
    move-object/from16 v21, v5

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :catch_5
    move-exception v0

    .line 382
    move-object/from16 v21, v5

    .line 383
    .line 384
    goto :goto_a

    .line 385
    :goto_8
    invoke-static {v14, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 386
    .line 387
    .line 388
    goto :goto_b

    .line 389
    :goto_9
    invoke-static {v14, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 390
    .line 391
    .line 392
    goto :goto_b

    .line 393
    :goto_a
    invoke-static {v14, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 394
    .line 395
    .line 396
    :goto_b
    const/4 v0, 0x0

    .line 397
    goto :goto_7

    .line 398
    :cond_7
    move-object/from16 v21, v5

    .line 399
    .line 400
    move-object/from16 v19, v7

    .line 401
    .line 402
    move/from16 v20, v8

    .line 403
    .line 404
    const/4 v5, 0x2

    .line 405
    if-ne v0, v5, :cond_a

    .line 406
    .line 407
    iget-object v0, v11, Landroidx/core/graphics/drawable/IconCompat;->j:Ljava/lang/String;

    .line 408
    .line 409
    if-eqz v0, :cond_9

    .line 410
    .line 411
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-eqz v0, :cond_8

    .line 416
    .line 417
    goto :goto_c

    .line 418
    :cond_8
    iget-object v0, v11, Landroidx/core/graphics/drawable/IconCompat;->j:Ljava/lang/String;

    .line 419
    .line 420
    goto :goto_d

    .line 421
    :cond_9
    :goto_c
    iget-object v0, v11, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, Ljava/lang/String;

    .line 424
    .line 425
    const-string v7, ":"

    .line 426
    .line 427
    invoke-virtual {v0, v7, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    aget-object v0, v0, v17

    .line 432
    .line 433
    :goto_d
    iget v4, v11, Landroidx/core/graphics/drawable/IconCompat;->e:I

    .line 434
    .line 435
    invoke-static {v0, v4}, Landroid/graphics/drawable/Icon;->createWithResource(Ljava/lang/String;I)Landroid/graphics/drawable/Icon;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    goto :goto_e

    .line 440
    :cond_a
    const-string v0, "called getResPackage() on "

    .line 441
    .line 442
    invoke-static {v11, v0}, Landroidx/fragment/app/q;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    const/4 v0, 0x0

    .line 446
    throw v0

    .line 447
    :pswitch_6
    move-object/from16 v18, v4

    .line 448
    .line 449
    move-object/from16 v21, v5

    .line 450
    .line 451
    move-object/from16 v19, v7

    .line 452
    .line 453
    move/from16 v20, v8

    .line 454
    .line 455
    const/4 v5, 0x2

    .line 456
    iget-object v0, v11, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v0, Landroid/graphics/Bitmap;

    .line 459
    .line 460
    invoke-static {v0}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    :goto_e
    iget-object v4, v11, Landroidx/core/graphics/drawable/IconCompat;->g:Landroid/content/res/ColorStateList;

    .line 465
    .line 466
    if-eqz v4, :cond_b

    .line 467
    .line 468
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Icon;->setTintList(Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Icon;

    .line 469
    .line 470
    .line 471
    :cond_b
    iget-object v4, v11, Landroidx/core/graphics/drawable/IconCompat;->h:Landroid/graphics/PorterDuff$Mode;

    .line 472
    .line 473
    sget-object v7, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 474
    .line 475
    if-eq v4, v7, :cond_d

    .line 476
    .line 477
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Icon;->setTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/drawable/Icon;

    .line 478
    .line 479
    .line 480
    goto :goto_f

    .line 481
    :pswitch_7
    move-object/from16 v18, v4

    .line 482
    .line 483
    move-object/from16 v21, v5

    .line 484
    .line 485
    move-object/from16 v19, v7

    .line 486
    .line 487
    move/from16 v20, v8

    .line 488
    .line 489
    const/4 v5, 0x2

    .line 490
    iget-object v0, v11, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v0, Landroid/graphics/drawable/Icon;

    .line 493
    .line 494
    goto :goto_f

    .line 495
    :cond_c
    move-object/from16 v18, v4

    .line 496
    .line 497
    move-object/from16 v21, v5

    .line 498
    .line 499
    move-object/from16 v19, v7

    .line 500
    .line 501
    move/from16 v20, v8

    .line 502
    .line 503
    const/4 v5, 0x2

    .line 504
    const/4 v0, 0x0

    .line 505
    :cond_d
    :goto_f
    iget-object v4, v15, Lb0/i;->f:Ljava/lang/CharSequence;

    .line 506
    .line 507
    iget-object v7, v15, Lb0/i;->g:Landroid/app/PendingIntent;

    .line 508
    .line 509
    invoke-direct {v9, v0, v4, v7}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 510
    .line 511
    .line 512
    if-eqz v10, :cond_e

    .line 513
    .line 514
    new-instance v0, Landroid/os/Bundle;

    .line 515
    .line 516
    invoke-direct {v0, v10}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 517
    .line 518
    .line 519
    goto :goto_10

    .line 520
    :cond_e
    new-instance v0, Landroid/os/Bundle;

    .line 521
    .line 522
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 523
    .line 524
    .line 525
    :goto_10
    invoke-virtual {v0, v13, v12}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v9, v12}, Landroid/app/Notification$Action$Builder;->setAllowGeneratedReplies(Z)Landroid/app/Notification$Action$Builder;

    .line 529
    .line 530
    .line 531
    const-string v4, "android.support.action.semanticAction"

    .line 532
    .line 533
    move/from16 v7, v17

    .line 534
    .line 535
    invoke-virtual {v0, v4, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 536
    .line 537
    .line 538
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 539
    .line 540
    const/16 v8, 0x1c

    .line 541
    .line 542
    if-lt v4, v8, :cond_f

    .line 543
    .line 544
    invoke-static {v9}, Lb0/k;->a(Landroid/app/Notification$Action$Builder;)V

    .line 545
    .line 546
    .line 547
    :cond_f
    const/16 v7, 0x1d

    .line 548
    .line 549
    if-lt v4, v7, :cond_10

    .line 550
    .line 551
    invoke-static {v9}, Lb0/f;->d(Landroid/app/Notification$Action$Builder;)V

    .line 552
    .line 553
    .line 554
    :cond_10
    const/16 v7, 0x1f

    .line 555
    .line 556
    if-lt v4, v7, :cond_11

    .line 557
    .line 558
    invoke-static {v9}, Lb0/l;->a(Landroid/app/Notification$Action$Builder;)V

    .line 559
    .line 560
    .line 561
    :cond_11
    const-string v4, "android.support.action.showsUserInterface"

    .line 562
    .line 563
    iget-boolean v7, v15, Lb0/i;->d:Z

    .line 564
    .line 565
    invoke-virtual {v0, v4, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v9, v0}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 569
    .line 570
    .line 571
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v0, Landroid/app/Notification$Builder;

    .line 574
    .line 575
    invoke-virtual {v9}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 580
    .line 581
    .line 582
    move v10, v5

    .line 583
    move/from16 v0, v16

    .line 584
    .line 585
    move-object/from16 v4, v18

    .line 586
    .line 587
    move-object/from16 v7, v19

    .line 588
    .line 589
    move/from16 v8, v20

    .line 590
    .line 591
    move-object/from16 v5, v21

    .line 592
    .line 593
    const/4 v9, 0x0

    .line 594
    const/4 v12, 0x0

    .line 595
    goto/16 :goto_4

    .line 596
    .line 597
    :cond_12
    move-object/from16 v18, v4

    .line 598
    .line 599
    move-object/from16 v21, v5

    .line 600
    .line 601
    iget-object v0, v2, Lb0/j;->l:Landroid/os/Bundle;

    .line 602
    .line 603
    if-eqz v0, :cond_13

    .line 604
    .line 605
    iget-object v4, v1, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v4, Landroid/os/Bundle;

    .line 608
    .line 609
    invoke-virtual {v4, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 610
    .line 611
    .line 612
    :cond_13
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v0, Landroid/app/Notification$Builder;

    .line 615
    .line 616
    iget-boolean v4, v2, Lb0/j;->i:Z

    .line 617
    .line 618
    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 619
    .line 620
    .line 621
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v0, Landroid/app/Notification$Builder;

    .line 624
    .line 625
    iget-boolean v4, v2, Lb0/j;->k:Z

    .line 626
    .line 627
    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    .line 628
    .line 629
    .line 630
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v0, Landroid/app/Notification$Builder;

    .line 633
    .line 634
    const/4 v5, 0x0

    .line 635
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 636
    .line 637
    .line 638
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v0, Landroid/app/Notification$Builder;

    .line 641
    .line 642
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 643
    .line 644
    .line 645
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v0, Landroid/app/Notification$Builder;

    .line 648
    .line 649
    const/4 v7, 0x0

    .line 650
    invoke-virtual {v0, v7}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 651
    .line 652
    .line 653
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v0, Landroid/app/Notification$Builder;

    .line 656
    .line 657
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 658
    .line 659
    .line 660
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 661
    .line 662
    check-cast v0, Landroid/app/Notification$Builder;

    .line 663
    .line 664
    invoke-virtual {v0, v7}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 665
    .line 666
    .line 667
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v0, Landroid/app/Notification$Builder;

    .line 670
    .line 671
    invoke-virtual {v0, v7}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 672
    .line 673
    .line 674
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v0, Landroid/app/Notification$Builder;

    .line 677
    .line 678
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 679
    .line 680
    .line 681
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v0, Landroid/app/Notification$Builder;

    .line 684
    .line 685
    iget-object v4, v6, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 686
    .line 687
    iget-object v5, v6, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 688
    .line 689
    invoke-virtual {v0, v4, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    .line 690
    .line 691
    .line 692
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 693
    .line 694
    const/16 v8, 0x1c

    .line 695
    .line 696
    if-ge v0, v8, :cond_18

    .line 697
    .line 698
    if-nez v18, :cond_14

    .line 699
    .line 700
    const/4 v0, 0x0

    .line 701
    goto :goto_11

    .line 702
    :cond_14
    new-instance v0, Ljava/util/ArrayList;

    .line 703
    .line 704
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    .line 705
    .line 706
    .line 707
    move-result v4

    .line 708
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 712
    .line 713
    .line 714
    move-result-object v4

    .line 715
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 716
    .line 717
    .line 718
    move-result v5

    .line 719
    if-nez v5, :cond_17

    .line 720
    .line 721
    :goto_11
    if-nez v0, :cond_15

    .line 722
    .line 723
    goto :goto_12

    .line 724
    :cond_15
    if-nez v3, :cond_16

    .line 725
    .line 726
    move-object v3, v0

    .line 727
    goto :goto_12

    .line 728
    :cond_16
    new-instance v4, Lp/g;

    .line 729
    .line 730
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 731
    .line 732
    .line 733
    move-result v5

    .line 734
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 735
    .line 736
    .line 737
    move-result v6

    .line 738
    add-int/2addr v6, v5

    .line 739
    invoke-direct {v4, v6}, Lp/g;-><init>(I)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v4, v0}, Lp/g;->addAll(Ljava/util/Collection;)Z

    .line 743
    .line 744
    .line 745
    invoke-virtual {v4, v3}, Lp/g;->addAll(Ljava/util/Collection;)Z

    .line 746
    .line 747
    .line 748
    new-instance v3, Ljava/util/ArrayList;

    .line 749
    .line 750
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 751
    .line 752
    .line 753
    goto :goto_12

    .line 754
    :cond_17
    invoke-static {v4}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    throw v0

    .line 759
    :cond_18
    :goto_12
    if-eqz v3, :cond_19

    .line 760
    .line 761
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    if-nez v0, :cond_19

    .line 766
    .line 767
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 768
    .line 769
    .line 770
    move-result v0

    .line 771
    const/4 v4, 0x0

    .line 772
    :goto_13
    if-ge v4, v0, :cond_19

    .line 773
    .line 774
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    add-int/lit8 v4, v4, 0x1

    .line 779
    .line 780
    check-cast v5, Ljava/lang/String;

    .line 781
    .line 782
    iget-object v6, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v6, Landroid/app/Notification$Builder;

    .line 785
    .line 786
    invoke-virtual {v6, v5}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 787
    .line 788
    .line 789
    goto :goto_13

    .line 790
    :cond_19
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->size()I

    .line 791
    .line 792
    .line 793
    move-result v0

    .line 794
    if-lez v0, :cond_21

    .line 795
    .line 796
    iget-object v0, v2, Lb0/j;->l:Landroid/os/Bundle;

    .line 797
    .line 798
    if-nez v0, :cond_1a

    .line 799
    .line 800
    new-instance v0, Landroid/os/Bundle;

    .line 801
    .line 802
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 803
    .line 804
    .line 805
    iput-object v0, v2, Lb0/j;->l:Landroid/os/Bundle;

    .line 806
    .line 807
    :cond_1a
    iget-object v0, v2, Lb0/j;->l:Landroid/os/Bundle;

    .line 808
    .line 809
    const-string v3, "android.car.EXTENSIONS"

    .line 810
    .line 811
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    if-nez v0, :cond_1b

    .line 816
    .line 817
    new-instance v0, Landroid/os/Bundle;

    .line 818
    .line 819
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 820
    .line 821
    .line 822
    :cond_1b
    new-instance v4, Landroid/os/Bundle;

    .line 823
    .line 824
    invoke-direct {v4, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 825
    .line 826
    .line 827
    new-instance v5, Landroid/os/Bundle;

    .line 828
    .line 829
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 830
    .line 831
    .line 832
    const/4 v6, 0x0

    .line 833
    :goto_14
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->size()I

    .line 834
    .line 835
    .line 836
    move-result v7

    .line 837
    if-ge v6, v7, :cond_1f

    .line 838
    .line 839
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v7

    .line 843
    move-object/from16 v8, v21

    .line 844
    .line 845
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v9

    .line 849
    check-cast v9, Lb0/i;

    .line 850
    .line 851
    new-instance v10, Landroid/os/Bundle;

    .line 852
    .line 853
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 854
    .line 855
    .line 856
    iget-object v11, v9, Lb0/i;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 857
    .line 858
    if-nez v11, :cond_1c

    .line 859
    .line 860
    iget v11, v9, Lb0/i;->e:I

    .line 861
    .line 862
    if-eqz v11, :cond_1c

    .line 863
    .line 864
    invoke-static {v11}, Landroidx/core/graphics/drawable/IconCompat;->a(I)Landroidx/core/graphics/drawable/IconCompat;

    .line 865
    .line 866
    .line 867
    move-result-object v11

    .line 868
    iput-object v11, v9, Lb0/i;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 869
    .line 870
    :cond_1c
    iget-object v11, v9, Lb0/i;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 871
    .line 872
    iget-object v12, v9, Lb0/i;->a:Landroid/os/Bundle;

    .line 873
    .line 874
    if-eqz v11, :cond_1d

    .line 875
    .line 876
    invoke-virtual {v11}, Landroidx/core/graphics/drawable/IconCompat;->b()I

    .line 877
    .line 878
    .line 879
    move-result v11

    .line 880
    goto :goto_15

    .line 881
    :cond_1d
    const/4 v11, 0x0

    .line 882
    :goto_15
    const-string v14, "icon"

    .line 883
    .line 884
    invoke-virtual {v10, v14, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 885
    .line 886
    .line 887
    const-string v11, "title"

    .line 888
    .line 889
    iget-object v14, v9, Lb0/i;->f:Ljava/lang/CharSequence;

    .line 890
    .line 891
    invoke-virtual {v10, v11, v14}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 892
    .line 893
    .line 894
    const-string v11, "actionIntent"

    .line 895
    .line 896
    iget-object v14, v9, Lb0/i;->g:Landroid/app/PendingIntent;

    .line 897
    .line 898
    invoke-virtual {v10, v11, v14}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 899
    .line 900
    .line 901
    if-eqz v12, :cond_1e

    .line 902
    .line 903
    new-instance v11, Landroid/os/Bundle;

    .line 904
    .line 905
    invoke-direct {v11, v12}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 906
    .line 907
    .line 908
    goto :goto_16

    .line 909
    :cond_1e
    new-instance v11, Landroid/os/Bundle;

    .line 910
    .line 911
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 912
    .line 913
    .line 914
    :goto_16
    iget-boolean v12, v9, Lb0/i;->c:Z

    .line 915
    .line 916
    invoke-virtual {v11, v13, v12}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 917
    .line 918
    .line 919
    const-string v12, "extras"

    .line 920
    .line 921
    invoke-virtual {v10, v12, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 922
    .line 923
    .line 924
    const-string v11, "remoteInputs"

    .line 925
    .line 926
    const/4 v12, 0x0

    .line 927
    invoke-virtual {v10, v11, v12}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 928
    .line 929
    .line 930
    const-string v11, "showsUserInterface"

    .line 931
    .line 932
    iget-boolean v9, v9, Lb0/i;->d:Z

    .line 933
    .line 934
    invoke-virtual {v10, v11, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 935
    .line 936
    .line 937
    const-string v9, "semanticAction"

    .line 938
    .line 939
    const/4 v11, 0x0

    .line 940
    invoke-virtual {v10, v9, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v5, v7, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 944
    .line 945
    .line 946
    add-int/lit8 v6, v6, 0x1

    .line 947
    .line 948
    move-object/from16 v21, v8

    .line 949
    .line 950
    goto :goto_14

    .line 951
    :cond_1f
    const-string v6, "invisible_actions"

    .line 952
    .line 953
    invoke-virtual {v0, v6, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 957
    .line 958
    .line 959
    iget-object v5, v2, Lb0/j;->l:Landroid/os/Bundle;

    .line 960
    .line 961
    if-nez v5, :cond_20

    .line 962
    .line 963
    new-instance v5, Landroid/os/Bundle;

    .line 964
    .line 965
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 966
    .line 967
    .line 968
    iput-object v5, v2, Lb0/j;->l:Landroid/os/Bundle;

    .line 969
    .line 970
    :cond_20
    iget-object v5, v2, Lb0/j;->l:Landroid/os/Bundle;

    .line 971
    .line 972
    invoke-virtual {v5, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 973
    .line 974
    .line 975
    iget-object v0, v1, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 976
    .line 977
    check-cast v0, Landroid/os/Bundle;

    .line 978
    .line 979
    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 980
    .line 981
    .line 982
    :cond_21
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v0, Landroid/app/Notification$Builder;

    .line 985
    .line 986
    iget-object v3, v2, Lb0/j;->l:Landroid/os/Bundle;

    .line 987
    .line 988
    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 989
    .line 990
    .line 991
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 992
    .line 993
    check-cast v0, Landroid/app/Notification$Builder;

    .line 994
    .line 995
    const/4 v5, 0x0

    .line 996
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 997
    .line 998
    .line 999
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1000
    .line 1001
    check-cast v0, Landroid/app/Notification$Builder;

    .line 1002
    .line 1003
    const/4 v7, 0x0

    .line 1004
    invoke-virtual {v0, v7}, Landroid/app/Notification$Builder;->setBadgeIconType(I)Landroid/app/Notification$Builder;

    .line 1005
    .line 1006
    .line 1007
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1008
    .line 1009
    check-cast v0, Landroid/app/Notification$Builder;

    .line 1010
    .line 1011
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setSettingsText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 1012
    .line 1013
    .line 1014
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1015
    .line 1016
    check-cast v0, Landroid/app/Notification$Builder;

    .line 1017
    .line 1018
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setShortcutId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 1019
    .line 1020
    .line 1021
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1022
    .line 1023
    check-cast v0, Landroid/app/Notification$Builder;

    .line 1024
    .line 1025
    const-wide/16 v3, 0x0

    .line 1026
    .line 1027
    invoke-virtual {v0, v3, v4}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;

    .line 1028
    .line 1029
    .line 1030
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1031
    .line 1032
    check-cast v0, Landroid/app/Notification$Builder;

    .line 1033
    .line 1034
    const/4 v7, 0x0

    .line 1035
    invoke-virtual {v0, v7}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;

    .line 1036
    .line 1037
    .line 1038
    iget-object v0, v2, Lb0/j;->m:Ljava/lang/String;

    .line 1039
    .line 1040
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    if-nez v0, :cond_22

    .line 1045
    .line 1046
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1047
    .line 1048
    check-cast v0, Landroid/app/Notification$Builder;

    .line 1049
    .line 1050
    const/4 v5, 0x0

    .line 1051
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    invoke-virtual {v0, v7}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    invoke-virtual {v0, v7, v7, v7}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v0

    .line 1063
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 1064
    .line 1065
    .line 1066
    :cond_22
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1067
    .line 1068
    const/16 v8, 0x1c

    .line 1069
    .line 1070
    if-lt v0, v8, :cond_23

    .line 1071
    .line 1072
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v3

    .line 1076
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1077
    .line 1078
    .line 1079
    move-result v4

    .line 1080
    if-nez v4, :cond_24

    .line 1081
    .line 1082
    :cond_23
    const/16 v7, 0x1d

    .line 1083
    .line 1084
    goto :goto_17

    .line 1085
    :cond_24
    invoke-static {v3}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    throw v0

    .line 1090
    :goto_17
    if-lt v0, v7, :cond_25

    .line 1091
    .line 1092
    iget-object v3, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1093
    .line 1094
    check-cast v3, Landroid/app/Notification$Builder;

    .line 1095
    .line 1096
    iget-boolean v2, v2, Lb0/j;->n:Z

    .line 1097
    .line 1098
    invoke-static {v3, v2}, Lb0/f;->b(Landroid/app/Notification$Builder;Z)V

    .line 1099
    .line 1100
    .line 1101
    iget-object v2, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1102
    .line 1103
    check-cast v2, Landroid/app/Notification$Builder;

    .line 1104
    .line 1105
    invoke-static {v2}, Lb0/f;->c(Landroid/app/Notification$Builder;)V

    .line 1106
    .line 1107
    .line 1108
    :cond_25
    const/16 v2, 0x24

    .line 1109
    .line 1110
    if-lt v0, v2, :cond_26

    .line 1111
    .line 1112
    iget-object v0, v1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1113
    .line 1114
    check-cast v0, Landroid/app/Notification$Builder;

    .line 1115
    .line 1116
    invoke-static {v0}, Lb0/m;->a(Landroid/app/Notification$Builder;)V

    .line 1117
    .line 1118
    .line 1119
    :cond_26
    return-void

    .line 1120
    nop

    .line 1121
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    .line 1121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1122
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 1123
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 1124
    iput-object p1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/navigation/NavigationView;)V
    .locals 2

    const/16 v0, 0x9

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    .line 1133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1134
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 1135
    new-instance v0, Lt2/e;

    .line 1136
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    .line 1137
    new-instance v0, Lt2/c;

    .line 1138
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 1139
    :goto_0
    iput-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1140
    iput-object p1, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 1141
    iput-object p1, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    .line 1148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1149
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 1150
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 1151
    iput-object p1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk1/a0;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    .line 1129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1130
    iput-object p1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1131
    new-instance p1, Lk1/b;

    invoke-direct {p1}, Lk1/b;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 1132
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu/e;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Landroidx/emoji2/text/t;->a:I

    .line 1182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1183
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 1184
    new-instance v0, Lv/b;

    .line 1185
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1186
    iput-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 1187
    iput-object p1, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    return-void
.end method

.method public static c(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq p1, v2, :cond_6

    .line 23
    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-class v2, Landroidx/emoji2/text/b0;

    .line 30
    .line 31
    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, [Landroidx/emoji2/text/b0;

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    if-lez v2, :cond_6

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    move v3, v0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez p2, :cond_3

    .line 61
    .line 62
    if-eq v4, p1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-le p1, v5, :cond_5

    .line 65
    .line 66
    if-ge p1, v4, :cond_5

    .line 67
    .line 68
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    :goto_1
    return v0
.end method

.method public static s(IILandroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/emoji2/text/t;
    .locals 1

    .line 1
    new-instance v0, Landroidx/emoji2/text/t;

    .line 2
    .line 3
    invoke-virtual {p2, p3, p4, p0, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p2, p0}, Landroidx/emoji2/text/t;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static t(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/emoji2/text/t;
    .locals 1

    .line 1
    new-instance v0, Landroidx/emoji2/text/t;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p0, p1}, Landroidx/emoji2/text/t;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/View;IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk1/a0;

    .line 4
    .line 5
    iget-object v0, v0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    if-gez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p2}, Landroidx/emoji2/text/t;->l(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    :goto_0
    iget-object v1, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lk1/b;

    .line 21
    .line 22
    invoke-virtual {v1, p2, p3}, Lk1/b;->e(IZ)V

    .line 23
    .line 24
    .line 25
    if-eqz p3, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroidx/emoji2/text/t;->p(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public b(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk1/a0;

    .line 4
    .line 5
    iget-object v0, v0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    if-gez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p2}, Landroidx/emoji2/text/t;->l(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    :goto_0
    iget-object v1, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lk1/b;

    .line 21
    .line 22
    invoke-virtual {v1, p2, p4}, Lk1/b;->e(IZ)V

    .line 23
    .line 24
    .line 25
    if-eqz p4, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroidx/emoji2/text/t;->p(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    if-eqz p4, :cond_4

    .line 35
    .line 36
    invoke-virtual {p4}, Lk1/x0;->j()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p4}, Lk1/x0;->o()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    new-instance p2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string p3, "Called attach on a child which is not detached: "

    .line 54
    .line 55
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_3
    :goto_1
    iget v1, p4, Lk1/x0;->j:I

    .line 77
    .line 78
    and-int/lit16 v1, v1, -0x101

    .line 79
    .line 80
    iput v1, p4, Lk1/x0;->j:I

    .line 81
    .line 82
    :cond_4
    invoke-static {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->b(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Landroidx/emoji2/text/t;->l(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lk1/b;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lk1/b;->f(I)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lk1/a0;

    .line 15
    .line 16
    iget-object v0, v0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v1}, Lk1/x0;->j()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Lk1/x0;->o()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v3, "called detach on an already detached child "

    .line 48
    .line 49
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_1
    :goto_0
    const/16 v2, 0x100

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Lk1/x0;->a(I)V

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-static {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->c(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/p0;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/s0;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/lifecycle/t0;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v1, Landroidx/lifecycle/t0;->a:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Landroidx/lifecycle/p0;

    .line 19
    .line 20
    invoke-virtual {p2, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    instance-of p1, v0, Landroidx/lifecycle/n0;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    check-cast v0, Landroidx/lifecycle/n0;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p1, v0, Landroidx/lifecycle/n0;->i:Landroidx/lifecycle/o;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p2, v0, Landroidx/lifecycle/n0;->j:Ll1/c;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v2, p2, p1}, Landroidx/lifecycle/k0;->a(Landroidx/lifecycle/p0;Ll1/c;Landroidx/lifecycle/o;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_2
    new-instance v2, Lf1/c;

    .line 56
    .line 57
    iget-object v3, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lf1/b;

    .line 60
    .line 61
    invoke-direct {v2, v3}, Lf1/c;-><init>(Lf1/b;)V

    .line 62
    .line 63
    .line 64
    sget-object v3, Landroidx/lifecycle/q0;->g:Landroidx/lifecycle/q0;

    .line 65
    .line 66
    iget-object v4, v2, Lf1/b;->a:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-interface {v4, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :try_start_0
    invoke-interface {v0, p2, v2}, Landroidx/lifecycle/s0;->l(Ljava/lang/Class;Lf1/c;)Landroidx/lifecycle/p0;

    .line 72
    .line 73
    .line 74
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    goto :goto_1

    .line 76
    :catch_0
    invoke-interface {v0, p2}, Landroidx/lifecycle/s0;->c(Ljava/lang/Class;)Landroidx/lifecycle/p0;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Landroidx/lifecycle/p0;

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    invoke-virtual {p1}, Landroidx/lifecycle/p0;->b()V

    .line 92
    .line 93
    .line 94
    :cond_3
    return-object p2
.end method

.method public f(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/emoji2/text/t;->l(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lk1/a0;

    .line 8
    .line 9
    iget-object v0, v0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public g()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk1/a0;

    .line 4
    .line 5
    iget-object v0, v0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    sub-int/2addr v0, v1

    .line 20
    return v0
.end method

.method public h(I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v2, v1}, Lc0/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public i(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p1, v1}, Lu1/h0;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public j(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lk/u;->a()Lk/u;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v2, v0, Lk/u;->a:Lk/h2;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {v2, v1, p1, v3}, Lk/h2;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v0

    .line 39
    return-object p1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method

.method public k(IILk/q0;)Landroid/graphics/Typeface;
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroid/util/TypedValue;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Landroid/util/TypedValue;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_1
    iget-object p1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    check-cast v2, Landroid/content/Context;

    .line 30
    .line 31
    iget-object p1, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v4, p1

    .line 34
    check-cast v4, Landroid/util/TypedValue;

    .line 35
    .line 36
    sget-object p1, Le0/l;->a:Ljava/lang/ThreadLocal;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :goto_0
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    :cond_2
    const/4 v7, 0x1

    .line 47
    const/4 v8, 0x0

    .line 48
    move v5, p2

    .line 49
    move-object v6, p3

    .line 50
    invoke-static/range {v2 .. v8}, Le0/l;->a(Landroid/content/Context;ILandroid/util/TypedValue;ILe0/b;ZZ)Landroid/graphics/Typeface;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method public l(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk1/b;

    .line 4
    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v1, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lk1/a0;

    .line 11
    .line 12
    iget-object v1, v1, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    move v2, p1

    .line 19
    :goto_0
    if-ge v2, v1, :cond_3

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lk1/b;->b(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    sub-int v3, v2, v3

    .line 26
    .line 27
    sub-int v3, p1, v3

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    :goto_1
    invoke-virtual {v0, v2}, Lk1/b;->d(I)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return v2

    .line 41
    :cond_2
    add-int/2addr v2, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_2
    const/4 p1, -0x1

    .line 44
    return p1
.end method

.method public m(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk1/a0;

    .line 4
    .line 5
    iget-object v0, v0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public n()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk1/a0;

    .line 4
    .line 5
    iget-object v0, v0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public o(Ljava/lang/CharSequence;IILandroidx/emoji2/text/a0;)Z
    .locals 7

    .line 1
    iget v0, p4, Landroidx/emoji2/text/a0;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroidx/emoji2/text/d;

    .line 13
    .line 14
    invoke-virtual {p4}, Landroidx/emoji2/text/a0;->b()La1/a;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/16 v5, 0x8

    .line 19
    .line 20
    invoke-virtual {v4, v5}, La1/c;->a(I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    iget-object v6, v4, La1/c;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v4, v4, La1/c;->a:I

    .line 31
    .line 32
    add-int/2addr v5, v4

    .line 33
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v4, Landroidx/emoji2/text/d;->b:Ljava/lang/ThreadLocal;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    new-instance v5, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    if-ge p2, p3, :cond_2

    .line 65
    .line 66
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    add-int/lit8 p2, p2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object p1, v0, Landroidx/emoji2/text/d;->a:Landroid/text/TextPaint;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iget p2, p4, Landroidx/emoji2/text/a0;->c:I

    .line 87
    .line 88
    and-int/lit8 p2, p2, 0x4

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    or-int/lit8 p1, p2, 0x2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    or-int/lit8 p1, p2, 0x1

    .line 96
    .line 97
    :goto_1
    iput p1, p4, Landroidx/emoji2/text/a0;->c:I

    .line 98
    .line 99
    :cond_4
    iget p1, p4, Landroidx/emoji2/text/a0;->c:I

    .line 100
    .line 101
    and-int/lit8 p1, p1, 0x3

    .line 102
    .line 103
    if-ne p1, v1, :cond_5

    .line 104
    .line 105
    return v3

    .line 106
    :cond_5
    return v2
.end method

.method public p(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lk1/a0;

    .line 11
    .line 12
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-object v1, p1, Lk1/x0;->a:Landroid/view/View;

    .line 19
    .line 20
    iget-object v0, v0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    iget v2, p1, Lk1/x0;->q:I

    .line 23
    .line 24
    const/4 v3, -0x1

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    iput v2, p1, Lk1/x0;->p:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v2, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iput v2, p1, Lk1/x0;->p:I

    .line 37
    .line 38
    :goto_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v3, 0x4

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    iput v3, p1, Lk1/x0;->q:I

    .line 46
    .line 47
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->x0:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    sget-object p1, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 54
    .line 55
    invoke-virtual {v1, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void
.end method

.method public q(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lco/median/android/MainActivity;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v2, v2, Landroidx/emoji2/text/x;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_0
    invoke-static {p1, p2}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {v0, p1, p2}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception p1

    .line 34
    const-string p2, "androidx.emoji2.text.t"

    .line 35
    .line 36
    const-string v0, "launchCallbackEvent: "

    .line 37
    .line 38
    invoke-static {p2, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method public r(ILu/d;Lx/f;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv/b;

    .line 4
    .line 5
    iget-object v1, p2, Lu/d;->p0:[I

    .line 6
    .line 7
    iget-object v2, p2, Lu/d;->t:[I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    aget v4, v1, v3

    .line 11
    .line 12
    iput v4, v0, Lv/b;->a:I

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    aget v1, v1, v4

    .line 16
    .line 17
    iput v1, v0, Lv/b;->b:I

    .line 18
    .line 19
    invoke-virtual {p2}, Lu/d;->q()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, v0, Lv/b;->c:I

    .line 24
    .line 25
    invoke-virtual {p2}, Lu/d;->k()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, v0, Lv/b;->d:I

    .line 30
    .line 31
    iput-boolean v3, v0, Lv/b;->i:Z

    .line 32
    .line 33
    iput p1, v0, Lv/b;->j:I

    .line 34
    .line 35
    iget p1, v0, Lv/b;->a:I

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    if-ne p1, v1, :cond_0

    .line 39
    .line 40
    move p1, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move p1, v3

    .line 43
    :goto_0
    iget v5, v0, Lv/b;->b:I

    .line 44
    .line 45
    if-ne v5, v1, :cond_1

    .line 46
    .line 47
    move v1, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v1, v3

    .line 50
    :goto_1
    const/4 v5, 0x0

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget p1, p2, Lu/d;->W:F

    .line 54
    .line 55
    cmpl-float p1, p1, v5

    .line 56
    .line 57
    if-lez p1, :cond_2

    .line 58
    .line 59
    move p1, v4

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move p1, v3

    .line 62
    :goto_2
    if-eqz v1, :cond_3

    .line 63
    .line 64
    iget v1, p2, Lu/d;->W:F

    .line 65
    .line 66
    cmpl-float v1, v1, v5

    .line 67
    .line 68
    if-lez v1, :cond_3

    .line 69
    .line 70
    move v1, v4

    .line 71
    goto :goto_3

    .line 72
    :cond_3
    move v1, v3

    .line 73
    :goto_3
    const/4 v5, 0x4

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    aget p1, v2, v3

    .line 77
    .line 78
    if-ne p1, v5, :cond_4

    .line 79
    .line 80
    iput v4, v0, Lv/b;->a:I

    .line 81
    .line 82
    :cond_4
    if-eqz v1, :cond_5

    .line 83
    .line 84
    aget p1, v2, v4

    .line 85
    .line 86
    if-ne p1, v5, :cond_5

    .line 87
    .line 88
    iput v4, v0, Lv/b;->b:I

    .line 89
    .line 90
    :cond_5
    invoke-virtual {p3, p2, v0}, Lx/f;->b(Lu/d;Lv/b;)V

    .line 91
    .line 92
    .line 93
    iget p1, v0, Lv/b;->e:I

    .line 94
    .line 95
    invoke-virtual {p2, p1}, Lu/d;->O(I)V

    .line 96
    .line 97
    .line 98
    iget p1, v0, Lv/b;->f:I

    .line 99
    .line 100
    invoke-virtual {p2, p1}, Lu/d;->L(I)V

    .line 101
    .line 102
    .line 103
    iget-boolean p1, v0, Lv/b;->h:Z

    .line 104
    .line 105
    iput-boolean p1, p2, Lu/d;->E:Z

    .line 106
    .line 107
    iget p1, v0, Lv/b;->g:I

    .line 108
    .line 109
    invoke-virtual {p2, p1}, Lu/d;->I(I)V

    .line 110
    .line 111
    .line 112
    iput v3, v0, Lv/b;->j:I

    .line 113
    .line 114
    iget-boolean p1, v0, Lv/b;->i:Z

    .line 115
    .line 116
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/emoji2/text/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lk1/b;

    .line 19
    .line 20
    invoke-virtual {v1}, Lk1/b;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", hidden list:"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/CharSequence;IIIZLandroidx/emoji2/text/q;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    new-instance v5, Landroidx/emoji2/text/s;

    .line 12
    .line 13
    iget-object v6, v0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Landroidx/emoji2/text/x;

    .line 16
    .line 17
    iget-object v6, v6, Landroidx/emoji2/text/x;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v6, Landroidx/emoji2/text/w;

    .line 20
    .line 21
    invoke-direct {v5, v6}, Landroidx/emoji2/text/s;-><init>(Landroidx/emoji2/text/w;)V

    .line 22
    .line 23
    .line 24
    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x1

    .line 30
    move v9, v6

    .line 31
    move v10, v7

    .line 32
    move v11, v8

    .line 33
    move/from16 v6, p2

    .line 34
    .line 35
    :cond_0
    :goto_0
    move v7, v6

    .line 36
    :goto_1
    const/4 v12, 0x2

    .line 37
    if-ge v6, v2, :cond_f

    .line 38
    .line 39
    if-ge v10, v3, :cond_f

    .line 40
    .line 41
    if-eqz v11, :cond_f

    .line 42
    .line 43
    iget-object v13, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/w;

    .line 44
    .line 45
    iget-object v13, v13, Landroidx/emoji2/text/w;->a:Landroid/util/SparseArray;

    .line 46
    .line 47
    if-nez v13, :cond_1

    .line 48
    .line 49
    const/4 v13, 0x0

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    check-cast v13, Landroidx/emoji2/text/w;

    .line 56
    .line 57
    :goto_2
    iget v14, v5, Landroidx/emoji2/text/s;->a:I

    .line 58
    .line 59
    const/4 v15, 0x3

    .line 60
    if-eq v14, v12, :cond_3

    .line 61
    .line 62
    if-nez v13, :cond_2

    .line 63
    .line 64
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 65
    .line 66
    .line 67
    :goto_3
    move v13, v8

    .line 68
    goto :goto_6

    .line 69
    :cond_2
    iput v12, v5, Landroidx/emoji2/text/s;->a:I

    .line 70
    .line 71
    iput-object v13, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/w;

    .line 72
    .line 73
    iput v8, v5, Landroidx/emoji2/text/s;->f:I

    .line 74
    .line 75
    :goto_4
    move v13, v12

    .line 76
    goto :goto_6

    .line 77
    :cond_3
    if-eqz v13, :cond_4

    .line 78
    .line 79
    iput-object v13, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/w;

    .line 80
    .line 81
    iget v13, v5, Landroidx/emoji2/text/s;->f:I

    .line 82
    .line 83
    add-int/2addr v13, v8

    .line 84
    iput v13, v5, Landroidx/emoji2/text/s;->f:I

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    const v13, 0xfe0e

    .line 88
    .line 89
    .line 90
    if-ne v9, v13, :cond_5

    .line 91
    .line 92
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    const v13, 0xfe0f

    .line 97
    .line 98
    .line 99
    if-ne v9, v13, :cond_6

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    iget-object v13, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/w;

    .line 103
    .line 104
    iget-object v14, v13, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/a0;

    .line 105
    .line 106
    if-eqz v14, :cond_9

    .line 107
    .line 108
    iget v14, v5, Landroidx/emoji2/text/s;->f:I

    .line 109
    .line 110
    if-ne v14, v8, :cond_8

    .line 111
    .line 112
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->b()Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_7

    .line 117
    .line 118
    iget-object v13, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/w;

    .line 119
    .line 120
    iput-object v13, v5, Landroidx/emoji2/text/s;->d:Landroidx/emoji2/text/w;

    .line 121
    .line 122
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 123
    .line 124
    .line 125
    :goto_5
    move v13, v15

    .line 126
    goto :goto_6

    .line 127
    :cond_7
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    iput-object v13, v5, Landroidx/emoji2/text/s;->d:Landroidx/emoji2/text/w;

    .line 132
    .line 133
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_9
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :goto_6
    iput v9, v5, Landroidx/emoji2/text/s;->e:I

    .line 142
    .line 143
    if-eq v13, v8, :cond_e

    .line 144
    .line 145
    if-eq v13, v12, :cond_c

    .line 146
    .line 147
    if-eq v13, v15, :cond_a

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_a
    if-nez p5, :cond_b

    .line 151
    .line 152
    iget-object v12, v5, Landroidx/emoji2/text/s;->d:Landroidx/emoji2/text/w;

    .line 153
    .line 154
    iget-object v12, v12, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/a0;

    .line 155
    .line 156
    invoke-virtual {v0, v1, v7, v6, v12}, Landroidx/emoji2/text/t;->o(Ljava/lang/CharSequence;IILandroidx/emoji2/text/a0;)Z

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    if-nez v12, :cond_0

    .line 161
    .line 162
    :cond_b
    iget-object v11, v5, Landroidx/emoji2/text/s;->d:Landroidx/emoji2/text/w;

    .line 163
    .line 164
    iget-object v11, v11, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/a0;

    .line 165
    .line 166
    invoke-interface {v4, v1, v7, v6, v11}, Landroidx/emoji2/text/q;->c(Ljava/lang/CharSequence;IILandroidx/emoji2/text/a0;)Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    add-int/lit8 v10, v10, 0x1

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    add-int/2addr v12, v6

    .line 179
    if-ge v12, v2, :cond_d

    .line 180
    .line 181
    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    move v9, v6

    .line 186
    :cond_d
    move v6, v12

    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    add-int/2addr v6, v7

    .line 198
    if-ge v6, v2, :cond_0

    .line 199
    .line 200
    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    move v9, v7

    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_f
    iget v2, v5, Landroidx/emoji2/text/s;->a:I

    .line 208
    .line 209
    if-ne v2, v12, :cond_12

    .line 210
    .line 211
    iget-object v2, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/w;

    .line 212
    .line 213
    iget-object v2, v2, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/a0;

    .line 214
    .line 215
    if-eqz v2, :cond_12

    .line 216
    .line 217
    iget v2, v5, Landroidx/emoji2/text/s;->f:I

    .line 218
    .line 219
    if-gt v2, v8, :cond_10

    .line 220
    .line 221
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->b()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_12

    .line 226
    .line 227
    :cond_10
    if-ge v10, v3, :cond_12

    .line 228
    .line 229
    if-eqz v11, :cond_12

    .line 230
    .line 231
    if-nez p5, :cond_11

    .line 232
    .line 233
    iget-object v2, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/w;

    .line 234
    .line 235
    iget-object v2, v2, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/a0;

    .line 236
    .line 237
    invoke-virtual {v0, v1, v7, v6, v2}, Landroidx/emoji2/text/t;->o(Ljava/lang/CharSequence;IILandroidx/emoji2/text/a0;)Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-nez v2, :cond_12

    .line 242
    .line 243
    :cond_11
    iget-object v2, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/w;

    .line 244
    .line 245
    iget-object v2, v2, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/a0;

    .line 246
    .line 247
    invoke-interface {v4, v1, v7, v6, v2}, Landroidx/emoji2/text/q;->c(Ljava/lang/CharSequence;IILandroidx/emoji2/text/a0;)Z

    .line 248
    .line 249
    .line 250
    :cond_12
    invoke-interface {v4}, Landroidx/emoji2/text/q;->a()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    return-object v1
.end method

.method public v()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w(Lu/e;III)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lu/d;->b0:I

    .line 5
    .line 6
    iget v1, p1, Lu/d;->c0:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput v2, p1, Lu/d;->b0:I

    .line 10
    .line 11
    iput v2, p1, Lu/d;->c0:I

    .line 12
    .line 13
    invoke-virtual {p1, p3}, Lu/d;->O(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p4}, Lu/d;->L(I)V

    .line 17
    .line 18
    .line 19
    if-gez v0, :cond_0

    .line 20
    .line 21
    iput v2, p1, Lu/d;->b0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput v0, p1, Lu/d;->b0:I

    .line 25
    .line 26
    :goto_0
    if-gez v1, :cond_1

    .line 27
    .line 28
    iput v2, p1, Lu/d;->c0:I

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iput v1, p1, Lu/d;->c0:I

    .line 32
    .line 33
    :goto_1
    iget-object p1, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lu/e;

    .line 36
    .line 37
    iput p2, p1, Lu/e;->t0:I

    .line 38
    .line 39
    invoke-virtual {p1}, Lu/e;->U()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public x(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lk1/a0;

    .line 14
    .line 15
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    iget v1, p1, Lk1/x0;->p:I

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    iput v1, p1, Lk1/x0;->q:I

    .line 32
    .line 33
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->x0:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p1, Lk1/x0;->a:Landroid/view/View;

    .line 40
    .line 41
    sget-object v2, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    const/4 v0, 0x0

    .line 47
    iput v0, p1, Lk1/x0;->p:I

    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public y(Lu/e;)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Lu/e;->q0:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    const/4 v4, 0x1

    .line 17
    if-ge v3, v1, :cond_2

    .line 18
    .line 19
    iget-object v5, p1, Lu/e;->q0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Lu/d;

    .line 26
    .line 27
    iget-object v6, v5, Lu/d;->p0:[I

    .line 28
    .line 29
    aget v7, v6, v2

    .line 30
    .line 31
    const/4 v8, 0x3

    .line 32
    if-eq v7, v8, :cond_0

    .line 33
    .line 34
    aget v4, v6, v4

    .line 35
    .line 36
    if-ne v4, v8, :cond_1

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object p1, p1, Lu/e;->s0:Lv/e;

    .line 45
    .line 46
    iput-boolean v4, p1, Lv/e;->b:Z

    .line 47
    .line 48
    return-void
.end method
