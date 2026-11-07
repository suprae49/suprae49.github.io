.class public final Lz0/b;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final i:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Lp/k;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lr0/b;

.field public final d:Landroidx/activity/k;

.field public final e:Landroidx/emoji2/text/p;

.field public f:Z

.field public g:F

.field public h:Landroidx/emoji2/text/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz0/b;->i:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroidx/emoji2/text/p;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp/k;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lp/k;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lz0/b;->a:Lp/k;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lz0/b;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Lr0/b;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lr0/b;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lz0/b;->c:Lr0/b;

    .line 25
    .line 26
    new-instance v0, Landroidx/activity/k;

    .line 27
    .line 28
    const/16 v2, 0x15

    .line 29
    .line 30
    invoke-direct {v0, v2, p0}, Landroidx/activity/k;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lz0/b;->d:Landroidx/activity/k;

    .line 34
    .line 35
    iput-boolean v1, p0, Lz0/b;->f:Z

    .line 36
    .line 37
    const/high16 v0, 0x3f800000    # 1.0f

    .line 38
    .line 39
    iput v0, p0, Lz0/b;->g:F

    .line 40
    .line 41
    iput-object p1, p0, Lz0/b;->e:Landroidx/emoji2/text/p;

    .line 42
    .line 43
    return-void
.end method
