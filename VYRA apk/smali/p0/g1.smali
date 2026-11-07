.class public Lp0/g1;
.super Lp0/f1;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp0/f1;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Lp0/y1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lp0/f1;-><init>(Lp0/y1;)V

    return-void
.end method


# virtual methods
.method public d(ILf0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/d1;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-static {p1}, Lp0/x1;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p2}, Lf0/c;->e()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/common/api/a;->q(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
