.class public final Lm0/c;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Li1/a;

.field public final synthetic b:La3/h0;


# direct methods
.method public constructor <init>(Li1/a;La3/h0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/c;->a:Li1/a;

    .line 5
    .line 6
    iput-object p2, p0, Lm0/c;->b:La3/h0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lm0/c;->a:Li1/a;

    .line 15
    .line 16
    iget-object p2, p1, Li1/a;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Lm0/g;

    .line 19
    .line 20
    invoke-interface {p2}, Lm0/g;->b()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-object p3, p0, Lm0/c;->b:La3/h0;

    .line 25
    .line 26
    if-nez p2, :cond_2

    .line 27
    .line 28
    iget-object p2, p1, Li1/a;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, Lp1/h;

    .line 31
    .line 32
    if-nez p2, :cond_1

    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :cond_1
    const/4 p4, 0x0

    .line 36
    iput-object p4, p1, Li1/a;->g:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object p1, p3, La3/h0;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroidx/emoji2/text/p;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/emoji2/text/p;->n()Landroid/view/ViewGroup;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance p4, Landroidx/activity/p;

    .line 47
    .line 48
    const/4 p5, 0x4

    .line 49
    invoke-direct {p4, p3, p5, p2}, Landroidx/activity/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p4}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    iput-object p3, p1, Li1/a;->h:Ljava/lang/Object;

    .line 57
    .line 58
    return-void
.end method
