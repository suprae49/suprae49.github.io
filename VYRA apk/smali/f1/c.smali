.class public final Lf1/c;
.super Lf1/b;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 15
    sget-object p1, Lf1/a;->b:Lf1/a;

    invoke-direct {p0, p1}, Lf1/c;-><init>(Lf1/b;)V

    return-void
.end method

.method public constructor <init>(Lf1/b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lf1/b;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lf1/b;->a:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    iget-object p1, p1, Lf1/b;->a:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
