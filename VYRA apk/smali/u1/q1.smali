.class public final Lu1/q1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lco/median/android/MainActivity;

.field public final b:Lco/median/android/widget/GoNativeDrawerLayout;

.field public c:Lu1/p1;

.field public final d:Lcom/google/android/material/navigation/NavigationView;

.field public final e:Landroid/widget/RelativeLayout;

.field public final f:Lu1/i0;

.field public final g:Ljava/util/LinkedHashMap;

.field public h:Z

.field public i:Z

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/q1;->a:Lco/median/android/MainActivity;

    .line 5
    .line 6
    const v0, 0x7f0900be

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Le/j;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v0, Lco/median/android/widget/GoNativeDrawerLayout;

    .line 17
    .line 18
    iput-object v0, p0, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 19
    .line 20
    const v0, 0x7f09015f

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Le/j;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    .line 31
    .line 32
    iput-object v0, p0, Lu1/q1;->d:Lcom/google/android/material/navigation/NavigationView;

    .line 33
    .line 34
    const v1, 0x7f0900ef

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 42
    .line 43
    iput-object v1, p0, Lu1/q1;->e:Landroid/widget/RelativeLayout;

    .line 44
    .line 45
    const v1, 0x7f0900bf

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroid/widget/ExpandableListView;

    .line 53
    .line 54
    new-instance v1, Lu1/i0;

    .line 55
    .line 56
    invoke-direct {v1, p1, v0}, Lu1/i0;-><init>(Lco/median/android/MainActivity;Landroid/widget/ExpandableListView;)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lu1/q1;->f:Lu1/i0;

    .line 60
    .line 61
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lu1/q1;->g:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Lu1/q1;->h:Z

    .line 70
    .line 71
    iput-boolean v0, p0, Lu1/q1;->i:Z

    .line 72
    .line 73
    const-string v0, "default"

    .line 74
    .line 75
    iput-object v0, p0, Lu1/q1;->j:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v0, Lu1/y0;

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-direct {v0, v1, p0}, Lu1/y0;-><init>(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lx1/a;->i(Lx1/e;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu1/q1;->f:Lu1/i0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string v1, "/$"

    .line 10
    .line 11
    const-string v2, ""

    .line 12
    .line 13
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v3, v0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v3, 0x0

    .line 23
    :goto_0
    iget-object v4, v0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 24
    .line 25
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-ge v3, v4, :cond_2

    .line 30
    .line 31
    iget-object v4, v0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 32
    .line 33
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v5, "url"

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    iget-object p1, v0, Lu1/i0;->b:Landroid/widget/ExpandableListView;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-virtual {p1, v3, v1}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 57
    .line 58
    .line 59
    iput v3, v0, Lu1/i0;->k:I

    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    :goto_1
    return-void
.end method

.method public final b(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lu1/q1;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lu1/q1;->a:Lco/median/android/MainActivity;

    .line 7
    .line 8
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-boolean v2, v1, Lx1/a;->H:Z

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    xor-int/lit8 v2, p1, 0x1

    .line 18
    .line 19
    iget-object v3, p0, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ly0/f;->setDrawerLockMode(I)V

    .line 22
    .line 23
    .line 24
    iget-boolean v2, p0, Lu1/q1;->i:Z

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    iget-boolean v2, v1, Lx1/a;->m0:Z

    .line 29
    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    :cond_2
    if-eqz p1, :cond_3

    .line 33
    .line 34
    const v2, 0x7f090224

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Le/j;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Landroidx/appcompat/widget/Toolbar;

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0}, Le/j;->v()Lu1/h0;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    invoke-virtual {v2, p1}, Lu1/h0;->Z(Z)V

    .line 56
    .line 57
    .line 58
    iget-object p1, v1, Lx1/a;->K:Ljava/lang/String;

    .line 59
    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    invoke-static {p1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const v3, 0x7f070055

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    const v3, 0x7f0603e3

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v3}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    new-instance v4, Lv1/b;

    .line 88
    .line 89
    iget-object v1, v1, Lx1/a;->K:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-direct {v4, v0, p1, v3, v1}, Lv1/b;-><init>(Landroid/content/Context;IILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Lv1/b;->d()Landroid/graphics/drawable/Drawable;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v2, p1}, Lu1/h0;->f0(Landroid/graphics/drawable/Drawable;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    :goto_0
    return-void
.end method

.method public final c(Z)V
    .locals 5

    .line 1
    iput-boolean p1, p0, Lu1/q1;->h:Z

    .line 2
    .line 3
    iget-object v0, p0, Lu1/q1;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    new-instance p1, Lu1/p1;

    .line 12
    .line 13
    iget-object v2, p0, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 14
    .line 15
    invoke-direct {p1, p0, v1, v0, v2}, Lu1/p1;-><init>(Lu1/q1;Lx1/a;Lco/median/android/MainActivity;Lco/median/android/widget/GoNativeDrawerLayout;)V

    .line 16
    .line 17
    .line 18
    const v1, 0x7f0603e3

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p1, Lu1/p1;->c:Lg/b;

    .line 26
    .line 27
    iget-object v3, v2, Lg/b;->a:Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/graphics/Paint;->getColor()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eq v1, v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 39
    .line 40
    .line 41
    :cond_0
    iput-object p1, p0, Lu1/q1;->c:Lu1/p1;

    .line 42
    .line 43
    :cond_1
    new-instance p1, Ld3/a0;

    .line 44
    .line 45
    const/4 v1, 0x7

    .line 46
    invoke-direct {p1, v1, p0}, Ld3/a0;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lu1/q1;->d:Lcom/google/android/material/navigation/NavigationView;

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Lcom/google/android/material/navigation/NavigationView;->setNavigationItemSelectedListener(Lu2/p;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-boolean v0, p1, Lx1/a;->r0:Z

    .line 59
    .line 60
    iget-boolean v1, p1, Lx1/a;->s0:Z

    .line 61
    .line 62
    const/16 v2, 0x8

    .line 63
    .line 64
    iget-object v3, p0, Lu1/q1;->e:Landroid/widget/RelativeLayout;

    .line 65
    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-boolean v0, p1, Lx1/a;->r0:Z

    .line 74
    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    const v0, 0x7f090057

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Landroid/widget/ImageView;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    :cond_3
    const v0, 0x7f090058

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Landroid/widget/TextView;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    iget-object p1, p1, Lx1/a;->g:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    const/4 p1, 0x4

    .line 111
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 112
    .line 113
    .line 114
    :cond_5
    :goto_0
    iget-object p1, p0, Lu1/q1;->j:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Lu1/q1;->d(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/q1;->j:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v0, p0, Lu1/q1;->a:Lco/median/android/MainActivity;

    .line 7
    .line 8
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Lx1/a;->G:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lorg/json/JSONArray;

    .line 19
    .line 20
    iget-object v0, p0, Lu1/q1;->f:Lu1/i0;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    iput-object p1, v0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    new-instance p1, Lorg/json/JSONArray;

    .line 28
    .line 29
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    :goto_0
    const/4 p1, 0x0

    .line 39
    iput-boolean p1, v0, Lu1/i0;->i:Z

    .line 40
    .line 41
    iput-boolean p1, v0, Lu1/i0;->j:Z

    .line 42
    .line 43
    move v1, p1

    .line 44
    :goto_1
    iget-object v2, v0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 45
    .line 46
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-ge v1, v2, :cond_7

    .line 51
    .line 52
    iget-object v2, v0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 53
    .line 54
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-nez v2, :cond_1

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_1
    const-string v3, "icon"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string v4, "activeIcon"

    .line 68
    .line 69
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const/4 v5, 0x1

    .line 78
    if-eqz v3, :cond_2

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_3

    .line 85
    .line 86
    :cond_2
    iput-boolean v5, v0, Lu1/i0;->i:Z

    .line 87
    .line 88
    :cond_3
    const-string v3, "isGrouping"

    .line 89
    .line 90
    invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_6

    .line 95
    .line 96
    const-string v3, "subLinks"

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-eqz v2, :cond_6

    .line 103
    .line 104
    move v3, p1

    .line 105
    :goto_2
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-ge v3, v4, :cond_6

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    const-string v6, "icon"

    .line 116
    .line 117
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    const-string v7, "activeIcon"

    .line 122
    .line 123
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_5

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-nez v4, :cond_4

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    :goto_3
    iput-boolean v5, v0, Lu1/i0;->j:Z

    .line 144
    .line 145
    :cond_6
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_7
    invoke-virtual {v0}, Landroid/widget/BaseExpandableListAdapter;->notifyDataSetChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    monitor-exit v0

    .line 152
    return-void

    .line 153
    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    throw p1
.end method
