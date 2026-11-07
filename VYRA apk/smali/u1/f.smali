.class public final synthetic Lu1/f;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lco/median/android/MainActivity;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lco/median/android/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/f;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lu1/f;->b:Lco/median/android/MainActivity;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu1/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/f;->b:Lco/median/android/MainActivity;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne p1, v2, :cond_0

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    const-string p1, "t1.l"

    .line 10
    .line 11
    const-string v2, "AudioFocusListener GAINED. Try to request audio focus"

    .line 12
    .line 13
    invoke-static {p1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lt1/l;->o(Lco/median/android/MainActivity;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lt1/l;->b(Lco/median/android/MainActivity;)V

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1

    .line 27
    :cond_0
    return-void
.end method
