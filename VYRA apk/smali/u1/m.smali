.class public final Lu1/m;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lu1/o;


# direct methods
.method public constructor <init>(Lu1/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/m;->a:Lu1/o;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    check-cast p2, Lu1/i;

    .line 2
    .line 3
    iget-object p1, p2, Lu1/i;->a:Lco/median/android/DownloadService;

    .line 4
    .line 5
    iget-object p2, p0, Lu1/m;->a:Lu1/o;

    .line 6
    .line 7
    iput-object p1, p2, Lu1/o;->f:Lco/median/android/DownloadService;

    .line 8
    .line 9
    iput-object p2, p1, Lco/median/android/DownloadService;->g:Lu1/o;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p2, Lu1/o;->g:Z

    .line 13
    .line 14
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iget-object v0, p0, Lu1/m;->a:Lu1/o;

    .line 3
    .line 4
    iput-object p1, v0, Lu1/o;->f:Lco/median/android/DownloadService;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, v0, Lu1/o;->g:Z

    .line 8
    .line 9
    return-void
.end method
