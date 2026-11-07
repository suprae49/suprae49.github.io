.class public final synthetic Lu1/a;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Landroidx/appcompat/widget/e;

.field public final synthetic b:Lu1/e;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/e;Lu1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/a;->a:Landroidx/appcompat/widget/e;

    .line 5
    .line 6
    iput-object p2, p0, Lu1/a;->b:Lu1/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lu1/a;->a:Landroidx/appcompat/widget/e;

    .line 4
    .line 5
    iget-boolean p1, p1, Landroidx/appcompat/widget/e;->T:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lu1/a;->b:Lu1/e;

    .line 10
    .line 11
    iget-object p2, p1, Lu1/e;->m:Landroidx/appcompat/widget/e;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/e;->setIconified(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p1, p1, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 20
    .line 21
    invoke-virtual {p1}, Le/j;->invalidateOptionsMenu()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method
