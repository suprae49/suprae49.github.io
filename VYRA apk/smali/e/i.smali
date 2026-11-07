.class public final Le/i;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements La/b;


# instance fields
.field public final synthetic a:Le/j;


# direct methods
.method public constructor <init>(Le/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le/i;->a:Le/j;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroidx/activity/q;)V
    .locals 2

    .line 1
    iget-object p1, p0, Le/i;->a:Le/j;

    .line 2
    .line 3
    invoke-virtual {p1}, Le/j;->u()Le/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Le/q;->a()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Landroidx/activity/q;->i:Ll1/d;

    .line 11
    .line 12
    iget-object p1, p1, Ll1/d;->b:Ll1/c;

    .line 13
    .line 14
    const-string v1, "androidx:appcompat"

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ll1/c;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Le/q;->d()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
