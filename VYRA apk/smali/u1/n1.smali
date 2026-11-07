.class public final Lu1/n1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/LinkedList;

.field public final synthetic c:Landroidx/emoji2/text/x;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/x;Ljava/lang/String;Ljava/util/LinkedList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/n1;->c:Landroidx/emoji2/text/x;

    .line 5
    .line 6
    iput-object p2, p0, Lu1/n1;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lu1/n1;->b:Ljava/util/LinkedList;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    new-instance v0, Lu1/o1;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/n1;->c:Landroidx/emoji2/text/x;

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lco/median/android/GoNativeApplication;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/os/AsyncTask;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p0, v0, Lu1/o1;->a:Lu1/n1;

    .line 13
    .line 14
    iput-object v1, v0, Lu1/o1;->b:Landroidx/emoji2/text/x;

    .line 15
    .line 16
    iput-object v2, v0, Lu1/o1;->c:Lco/median/android/GoNativeApplication;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    new-array v1, v1, [Ljava/lang/Void;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 22
    .line 23
    .line 24
    return-void
.end method
