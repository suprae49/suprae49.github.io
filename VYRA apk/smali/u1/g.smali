.class public final synthetic Lu1/g;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lco/median/android/MainActivity;

.field public final synthetic c:Landroid/media/AudioManager;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lco/median/android/MainActivity;Landroid/media/AudioManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/g;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lu1/g;->b:Lco/median/android/MainActivity;

    .line 7
    .line 8
    iput-object p3, p0, Lu1/g;->c:Landroid/media/AudioManager;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lu1/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/g;->b:Lco/median/android/MainActivity;

    .line 4
    .line 5
    iget-object v2, p0, Lu1/g;->c:Landroid/media/AudioManager;

    .line 6
    .line 7
    const/4 v3, -0x3

    .line 8
    if-eq p1, v3, :cond_1

    .line 9
    .line 10
    const/4 v3, -0x2

    .line 11
    if-eq p1, v3, :cond_1

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    if-eq p1, v3, :cond_1

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-eq p1, v3, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    monitor-enter v0

    .line 21
    :try_start_0
    const-string p1, "t1.l"

    .line 22
    .line 23
    const-string v3, "AudioFocus GAINED. Try to connect bluetooth device"

    .line 24
    .line 25
    invoke-static {p1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lt1/l;->n(Lco/median/android/MainActivity;Landroid/media/AudioManager;)V

    .line 29
    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p1

    .line 36
    :cond_1
    monitor-enter v0

    .line 37
    :try_start_1
    const-string p1, "t1.l"

    .line 38
    .line 39
    const-string v3, "AudioFocus LOST. Try to reconnect bluetooth device"

    .line 40
    .line 41
    invoke-static {p1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lt1/l;->n(Lco/median/android/MainActivity;Landroid/media/AudioManager;)V

    .line 45
    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    throw p1
.end method
