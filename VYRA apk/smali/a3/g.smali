.class public final La3/g;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:La3/j;


# direct methods
.method public synthetic constructor <init>(La3/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, La3/g;->a:La3/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(La3/d;)La3/d;
    .locals 2

    .line 1
    instance-of v0, p1, La3/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v0, La3/b;

    .line 7
    .line 8
    iget-object v1, p0, La3/g;->a:La3/j;

    .line 9
    .line 10
    invoke-virtual {v1}, La3/j;->k()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    neg-float v1, v1

    .line 15
    invoke-direct {v0, v1, p1}, La3/b;-><init>(FLa3/d;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
