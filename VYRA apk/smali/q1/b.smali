.class public final Lq1/b;
.super Landroid/graphics/drawable/Animatable2$AnimationCallback;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:Lv2/d;


# direct methods
.method public constructor <init>(Lv2/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq1/b;->a:Lv2/d;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Animatable2$AnimationCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/b;->a:Lv2/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lv2/d;->a(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onAnimationStart(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq1/b;->a:Lv2/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lv2/d;->b(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
