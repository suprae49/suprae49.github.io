.class public final synthetic Lu1/d;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:Lr3/k;

.field public final synthetic g:Lu1/e;


# direct methods
.method public synthetic constructor <init>(Lr3/k;Lu1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/d;->f:Lr3/k;

    .line 5
    .line 6
    iput-object p2, p0, Lu1/d;->g:Lu1/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lu1/d;->f:Lr3/k;

    .line 2
    .line 3
    iget-object v0, p1, Lr3/k;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "share"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lu1/d;->g:Lu1/e;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object p1, v2, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0, v0}, Lco/median/android/MainActivity;->l0(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string v1, "refresh"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object p1, v2, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 33
    .line 34
    invoke-virtual {p1}, Lco/median/android/MainActivity;->N()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget-object v0, v2, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 39
    .line 40
    iget-object v0, v0, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 41
    .line 42
    iget-object p1, p1, Lr3/k;->f:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {v0, p1, v1, v2}, Lu1/x1;->b(Ljava/lang/String;ZZ)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
