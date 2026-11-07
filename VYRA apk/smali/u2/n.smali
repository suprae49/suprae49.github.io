.class public final Lu2/n;
.super Ly0/d;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:Lcom/google/android/material/navigation/NavigationView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/navigation/NavigationView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu2/n;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/n;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/material/navigation/NavigationView;->D:Landroidx/emoji2/text/t;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroidx/activity/k;

    .line 11
    .line 12
    const/16 v2, 0x10

    .line 13
    .line 14
    invoke-direct {v1, v2, v0}, Landroidx/activity/k;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/n;->a:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    iget-object p1, v0, Lcom/google/android/material/navigation/NavigationView;->D:Landroidx/emoji2/text/t;

    .line 6
    .line 7
    iget-object v1, p1, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lt2/c;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/google/android/material/navigation/NavigationView;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lt2/c;->c(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-boolean p1, v0, Lcom/google/android/material/navigation/NavigationView;->y:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget p1, v0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput p1, v0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/navigation/NavigationView;->g(II)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method
