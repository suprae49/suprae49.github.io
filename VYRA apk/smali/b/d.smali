.class public final synthetic Lb/d;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroidx/lifecycle/r;


# instance fields
.field public final synthetic f:Lb/h;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lb/b;

.field public final synthetic i:Lc/a;


# direct methods
.method public synthetic constructor <init>(Lb/h;Ljava/lang/String;Lb/b;Lc/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb/d;->f:Lb/h;

    .line 5
    .line 6
    iput-object p2, p0, Lb/d;->g:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lb/d;->h:Lb/b;

    .line 9
    .line 10
    iput-object p4, p0, Lb/d;->i:Lc/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/t;Landroidx/lifecycle/m;)V
    .locals 7

    .line 1
    iget-object p1, p0, Lb/d;->f:Lb/h;

    .line 2
    .line 3
    iget-object v0, p1, Lb/h;->g:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-object v1, p1, Lb/h;->e:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    iget-object v2, p1, Lb/h;->f:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    iget-object v3, p0, Lb/d;->g:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v4, p0, Lb/d;->h:Lb/b;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v5, p0, Lb/d;->i:Lc/a;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v6, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 25
    .line 26
    if-ne v6, p2, :cond_1

    .line 27
    .line 28
    new-instance p1, Lb/e;

    .line 29
    .line 30
    invoke-direct {p1, v5, v4}, Lb/e;-><init>(Lc/a;Lb/b;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-interface {v4, p1}, Lb/b;->a(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-static {v0, v3}, Le4/a;->G(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget p2, p1, Landroidx/activity/result/ActivityResult;->f:I

    .line 64
    .line 65
    iget-object p1, p1, Landroidx/activity/result/ActivityResult;->g:Landroid/content/Intent;

    .line 66
    .line 67
    invoke-virtual {v5, p2, p1}, Lc/a;->c(ILandroid/content/Intent;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {v4, p1}, Lb/b;->a(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    sget-object v0, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 76
    .line 77
    if-ne v0, p2, :cond_2

    .line 78
    .line 79
    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    sget-object v0, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 84
    .line 85
    if-ne v0, p2, :cond_3

    .line 86
    .line 87
    invoke-virtual {p1, v3}, Lb/h;->f(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    return-void
.end method
