.class public final Le/x;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/Window$Callback;


# instance fields
.field public final f:Landroid/view/Window$Callback;

.field public g:Le/j0;

.field public h:Z

.field public i:Z

.field public j:Z

.field public final synthetic k:Le/d0;


# direct methods
.method public constructor <init>(Le/d0;Landroid/view/Window$Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le/x;->k:Le/d0;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p2, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p1, "Window callback may not be null"

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    throw p1
.end method


# virtual methods
.method public final a(Landroid/view/Window$Callback;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Le/x;->h:Z

    .line 4
    .line 5
    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Le/x;->h:Z

    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    iput-boolean v1, p0, Le/x;->h:Z

    .line 13
    .line 14
    throw p1
.end method

.method public final b(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final c(ILandroid/view/Menu;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3}, Li/l;->a(Landroid/view/Window$Callback;Ljava/util/List;Landroid/view/Menu;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/x;->i:Z

    .line 2
    .line 3
    iget-object v1, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p0, Le/x;->k:Le/d0;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Le/d0;->v(Landroid/view/KeyEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 30
    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v2, p0, Le/x;->k:Le/d0;

    .line 15
    .line 16
    invoke-virtual {v2}, Le/d0;->C()V

    .line 17
    .line 18
    .line 19
    iget-object v3, v2, Le/d0;->t:Lu1/h0;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, v0, p1}, Lu1/h0;->Q(ILandroid/view/KeyEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, v2, Le/d0;->R:Le/c0;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v2, v0, v3, p1}, Le/d0;->H(Le/c0;ILandroid/view/KeyEvent;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object p1, v2, Le/d0;->R:Le/c0;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    iput-boolean v1, p1, Le/c0;->l:Z

    .line 49
    .line 50
    return v1

    .line 51
    :cond_1
    iget-object v0, v2, Le/d0;->R:Le/c0;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Le/d0;->B(I)Le/c0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v2, v0, p1}, Le/d0;->I(Le/c0;Landroid/view/KeyEvent;)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-virtual {v2, v0, v4, p1}, Le/d0;->H(Le/c0;ILandroid/view/KeyEvent;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput-boolean v3, v0, Le/c0;->k:Z

    .line 72
    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    return v3

    .line 77
    :cond_3
    :goto_0
    return v1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeFinished(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeStarted(Landroid/view/ActionMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/Window$Callback;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onContentChanged()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/x;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    instance-of v0, p2, Lj/m;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Le/x;->g:Le/j0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroid/view/View;

    .line 8
    .line 9
    iget-object v0, v0, Le/j0;->f:Le/l0;

    .line 10
    .line 11
    iget-object v0, v0, Le/l0;->e:Lk/k3;

    .line 12
    .line 13
    iget-object v0, v0, Lk/k3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-eqz v1, :cond_1

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 28
    .line 29
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/view/Window$Callback;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Le/x;->b(ILandroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x6c

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, p2, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Le/x;->k:Le/d0;

    .line 10
    .line 11
    invoke-virtual {p1}, Le/d0;->C()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p1, Le/d0;->t:Lu1/h0;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lu1/h0;->t(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return v0
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/x;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Le/x;->c(ILandroid/view/Menu;)V

    .line 12
    .line 13
    .line 14
    const/16 p2, 0x6c

    .line 15
    .line 16
    iget-object v0, p0, Le/x;->k:Le/d0;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-ne p1, p2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Le/d0;->C()V

    .line 22
    .line 23
    .line 24
    iget-object p1, v0, Le/d0;->t:Lu1/h0;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lu1/h0;->t(Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    if-nez p1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Le/d0;->B(I)Le/c0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-boolean p2, p1, Le/c0;->m:Z

    .line 39
    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, Le/d0;->t(Le/c0;Z)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final onPointerCaptureChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {v0, p1}, Li/m;->a(Landroid/view/Window$Callback;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 5

    .line 1
    instance-of v0, p3, Lj/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lj/m;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const/4 v1, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 v2, 0x1

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iput-boolean v2, v0, Lj/m;->x:Z

    .line 20
    .line 21
    :cond_2
    iget-object v3, p0, Le/x;->g:Le/j0;

    .line 22
    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    if-nez p1, :cond_3

    .line 26
    .line 27
    iget-object v3, v3, Le/j0;->f:Le/l0;

    .line 28
    .line 29
    iget-boolean v4, v3, Le/l0;->h:Z

    .line 30
    .line 31
    if-nez v4, :cond_3

    .line 32
    .line 33
    iget-object v4, v3, Le/l0;->e:Lk/k3;

    .line 34
    .line 35
    iput-boolean v2, v4, Lk/k3;->l:Z

    .line 36
    .line 37
    iput-boolean v2, v3, Le/l0;->h:Z

    .line 38
    .line 39
    :cond_3
    iget-object v2, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 40
    .line 41
    invoke-interface {v2, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    iput-boolean v1, v0, Lj/m;->x:Z

    .line 48
    .line 49
    :cond_4
    return p1
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/x;->k:Le/d0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Le/d0;->B(I)Le/c0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Le/c0;->h:Lj/m;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, p3}, Le/x;->d(Ljava/util/List;Landroid/view/Menu;I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Le/x;->d(Ljava/util/List;Landroid/view/Menu;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onSearchRequested()Z
    .locals 1

    .line 8
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public final onSearchRequested(Landroid/view/SearchEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-static {v0, p1}, Li/k;->a(Landroid/view/Window$Callback;Landroid/view/SearchEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowFocusChanged(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 434
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 8

    .line 1
    iget-object v0, p0, Le/x;->k:Le/d0;

    .line 2
    .line 3
    iget-object v1, v0, Le/d0;->p:Landroid/content/Context;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Le/x;->f:Landroid/view/Window$Callback;

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, Li/k;->b(Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p2, Landroidx/emoji2/text/x;

    .line 15
    .line 16
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p2, Landroidx/emoji2/text/x;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p1, p2, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p2, Landroidx/emoji2/text/x;->c:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance p1, Lp/k;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {p1, v2}, Lp/k;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p2, Landroidx/emoji2/text/x;->d:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object p1, v0, Le/d0;->z:Li/a;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Li/a;->a()V

    .line 43
    .line 44
    .line 45
    :cond_1
    new-instance p1, Landroidx/emoji2/text/p;

    .line 46
    .line 47
    const/4 v3, 0x4

    .line 48
    invoke-direct {p1, v0, p2, v3, v2}, Landroidx/emoji2/text/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Le/d0;->C()V

    .line 52
    .line 53
    .line 54
    iget-object v3, v0, Le/d0;->t:Lu1/h0;

    .line 55
    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    invoke-virtual {v3, p1}, Lu1/h0;->p0(Landroidx/emoji2/text/p;)Li/a;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iput-object v3, v0, Le/d0;->z:Li/a;

    .line 63
    .line 64
    :cond_2
    iget-object v3, v0, Le/d0;->z:Li/a;

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    if-nez v3, :cond_e

    .line 68
    .line 69
    iget-object v3, v0, Le/d0;->D:Lp0/r0;

    .line 70
    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    invoke-virtual {v3}, Lp0/r0;->b()V

    .line 74
    .line 75
    .line 76
    :cond_3
    iget-object v3, v0, Le/d0;->z:Li/a;

    .line 77
    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    invoke-virtual {v3}, Li/a;->a()V

    .line 81
    .line 82
    .line 83
    :cond_4
    iget-object v3, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    if-nez v3, :cond_7

    .line 87
    .line 88
    iget-boolean v3, v0, Le/d0;->N:Z

    .line 89
    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    new-instance v3, Landroid/util/TypedValue;

    .line 93
    .line 94
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    const v7, 0x7f04000b

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v7, v3, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 105
    .line 106
    .line 107
    iget v7, v3, Landroid/util/TypedValue;->resourceId:I

    .line 108
    .line 109
    if-eqz v7, :cond_5

    .line 110
    .line 111
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v7}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v7, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 120
    .line 121
    .line 122
    iget v6, v3, Landroid/util/TypedValue;->resourceId:I

    .line 123
    .line 124
    invoke-virtual {v7, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 125
    .line 126
    .line 127
    new-instance v6, Li/c;

    .line 128
    .line 129
    invoke-direct {v6, v1, v2}, Li/c;-><init>(Landroid/content/Context;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6}, Li/c;->getTheme()Landroid/content/res/Resources$Theme;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 137
    .line 138
    .line 139
    move-object v1, v6

    .line 140
    :cond_5
    new-instance v6, Landroidx/appcompat/widget/ActionBarContextView;

    .line 141
    .line 142
    invoke-direct {v6, v1, v4}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 143
    .line 144
    .line 145
    iput-object v6, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 146
    .line 147
    new-instance v6, Landroid/widget/PopupWindow;

    .line 148
    .line 149
    const v7, 0x7f04001a

    .line 150
    .line 151
    .line 152
    invoke-direct {v6, v1, v4, v7}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 153
    .line 154
    .line 155
    iput-object v6, v0, Le/d0;->B:Landroid/widget/PopupWindow;

    .line 156
    .line 157
    const/4 v7, 0x2

    .line 158
    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 159
    .line 160
    .line 161
    iget-object v6, v0, Le/d0;->B:Landroid/widget/PopupWindow;

    .line 162
    .line 163
    iget-object v7, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 164
    .line 165
    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 166
    .line 167
    .line 168
    iget-object v6, v0, Le/d0;->B:Landroid/widget/PopupWindow;

    .line 169
    .line 170
    const/4 v7, -0x1

    .line 171
    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    const v7, 0x7f040005

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6, v7, v3, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 182
    .line 183
    .line 184
    iget v3, v3, Landroid/util/TypedValue;->data:I

    .line 185
    .line 186
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-static {v3, v1}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    iget-object v3, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 199
    .line 200
    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 201
    .line 202
    .line 203
    iget-object v1, v0, Le/d0;->B:Landroid/widget/PopupWindow;

    .line 204
    .line 205
    const/4 v3, -0x2

    .line 206
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 207
    .line 208
    .line 209
    new-instance v1, Le/r;

    .line 210
    .line 211
    invoke-direct {v1, v0, v5}, Le/r;-><init>(Le/d0;I)V

    .line 212
    .line 213
    .line 214
    iput-object v1, v0, Le/d0;->C:Le/r;

    .line 215
    .line 216
    goto :goto_0

    .line 217
    :cond_6
    iget-object v1, v0, Le/d0;->F:Landroid/view/ViewGroup;

    .line 218
    .line 219
    const v3, 0x7f090042

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, Landroidx/appcompat/widget/ViewStubCompat;

    .line 227
    .line 228
    if-eqz v1, :cond_7

    .line 229
    .line 230
    invoke-virtual {v0}, Le/d0;->z()Landroid/content/Context;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v1, v3}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    check-cast v1, Landroidx/appcompat/widget/ActionBarContextView;

    .line 246
    .line 247
    iput-object v1, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 248
    .line 249
    :cond_7
    :goto_0
    iget-object v1, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 250
    .line 251
    if-eqz v1, :cond_d

    .line 252
    .line 253
    iget-object v1, v0, Le/d0;->D:Lp0/r0;

    .line 254
    .line 255
    if-eqz v1, :cond_8

    .line 256
    .line 257
    invoke-virtual {v1}, Lp0/r0;->b()V

    .line 258
    .line 259
    .line 260
    :cond_8
    iget-object v1, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 261
    .line 262
    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 263
    .line 264
    .line 265
    new-instance v1, Li/d;

    .line 266
    .line 267
    iget-object v3, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 268
    .line 269
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    iget-object v6, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 274
    .line 275
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 276
    .line 277
    .line 278
    iput-object v3, v1, Li/d;->h:Landroid/content/Context;

    .line 279
    .line 280
    iput-object v6, v1, Li/d;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 281
    .line 282
    iput-object p1, v1, Li/d;->j:Landroidx/emoji2/text/p;

    .line 283
    .line 284
    new-instance v3, Lj/m;

    .line 285
    .line 286
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    invoke-direct {v3, v6}, Lj/m;-><init>(Landroid/content/Context;)V

    .line 291
    .line 292
    .line 293
    iput v5, v3, Lj/m;->l:I

    .line 294
    .line 295
    iput-object v3, v1, Li/d;->m:Lj/m;

    .line 296
    .line 297
    iput-object v1, v3, Lj/m;->e:Lj/k;

    .line 298
    .line 299
    iget-object p1, p1, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p1, Landroidx/emoji2/text/x;

    .line 302
    .line 303
    invoke-virtual {p1, v1, v3}, Landroidx/emoji2/text/x;->e(Li/a;Landroid/view/Menu;)Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    if-eqz p1, :cond_c

    .line 308
    .line 309
    invoke-virtual {v1}, Li/d;->g()V

    .line 310
    .line 311
    .line 312
    iget-object p1, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 313
    .line 314
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/ActionBarContextView;->c(Li/a;)V

    .line 315
    .line 316
    .line 317
    iput-object v1, v0, Le/d0;->z:Li/a;

    .line 318
    .line 319
    iget-boolean p1, v0, Le/d0;->E:Z

    .line 320
    .line 321
    if-eqz p1, :cond_9

    .line 322
    .line 323
    iget-object p1, v0, Le/d0;->F:Landroid/view/ViewGroup;

    .line 324
    .line 325
    if-eqz p1, :cond_9

    .line 326
    .line 327
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 328
    .line 329
    .line 330
    move-result p1

    .line 331
    if-eqz p1, :cond_9

    .line 332
    .line 333
    move p1, v5

    .line 334
    goto :goto_1

    .line 335
    :cond_9
    move p1, v2

    .line 336
    :goto_1
    iget-object v1, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 337
    .line 338
    const/high16 v3, 0x3f800000    # 1.0f

    .line 339
    .line 340
    if-eqz p1, :cond_a

    .line 341
    .line 342
    const/4 p1, 0x0

    .line 343
    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    .line 344
    .line 345
    .line 346
    iget-object p1, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 347
    .line 348
    invoke-static {p1}, Lp0/p0;->a(Landroid/view/View;)Lp0/r0;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-virtual {p1, v3}, Lp0/r0;->a(F)V

    .line 353
    .line 354
    .line 355
    iput-object p1, v0, Le/d0;->D:Lp0/r0;

    .line 356
    .line 357
    new-instance v1, Le/t;

    .line 358
    .line 359
    invoke-direct {v1, v5, v0}, Le/t;-><init>(ILjava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1, v1}, Lp0/r0;->d(Lp0/s0;)V

    .line 363
    .line 364
    .line 365
    goto :goto_2

    .line 366
    :cond_a
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 367
    .line 368
    .line 369
    iget-object p1, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 370
    .line 371
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 372
    .line 373
    .line 374
    iget-object p1, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 375
    .line 376
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    instance-of p1, p1, Landroid/view/View;

    .line 381
    .line 382
    if-eqz p1, :cond_b

    .line 383
    .line 384
    iget-object p1, v0, Le/d0;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 385
    .line 386
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    check-cast p1, Landroid/view/View;

    .line 391
    .line 392
    sget-object v1, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 393
    .line 394
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 395
    .line 396
    .line 397
    :cond_b
    :goto_2
    iget-object p1, v0, Le/d0;->B:Landroid/widget/PopupWindow;

    .line 398
    .line 399
    if-eqz p1, :cond_d

    .line 400
    .line 401
    iget-object p1, v0, Le/d0;->q:Landroid/view/Window;

    .line 402
    .line 403
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    iget-object v1, v0, Le/d0;->C:Le/r;

    .line 408
    .line 409
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 410
    .line 411
    .line 412
    goto :goto_3

    .line 413
    :cond_c
    iput-object v4, v0, Le/d0;->z:Li/a;

    .line 414
    .line 415
    :cond_d
    :goto_3
    invoke-virtual {v0}, Le/d0;->K()V

    .line 416
    .line 417
    .line 418
    iget-object p1, v0, Le/d0;->z:Li/a;

    .line 419
    .line 420
    iput-object p1, v0, Le/d0;->z:Li/a;

    .line 421
    .line 422
    :cond_e
    invoke-virtual {v0}, Le/d0;->K()V

    .line 423
    .line 424
    .line 425
    iget-object p1, v0, Le/d0;->z:Li/a;

    .line 426
    .line 427
    if-eqz p1, :cond_f

    .line 428
    .line 429
    invoke-virtual {p2, p1}, Landroidx/emoji2/text/x;->b(Li/a;)Li/e;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    :cond_f
    return-object v4
.end method
