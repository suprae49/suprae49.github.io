.class public final Lu1/w1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lu2/m;


# instance fields
.field public final a:Lco/median/android/MainActivity;

.field public final b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

.field public final c:Landroid/view/View;

.field public final d:Lx1/a;

.field public final e:Lco/median/android/widget/BottomNavigationShowOnScrollBehavior;

.field public final f:Landroid/widget/RelativeLayout$LayoutParams;

.field public g:I

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Lorg/json/JSONArray;

.field public k:Ljava/util/HashMap;

.field public final l:I

.field public m:I

.field public n:I

.field public final o:Ljava/util/HashMap;

.field public p:Z

.field public q:Z


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lu1/w1;->n:I

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lu1/w1;->o:Ljava/util/HashMap;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lu1/w1;->q:Z

    .line 16
    .line 17
    iput-object p1, p0, Lu1/w1;->a:Lco/median/android/MainActivity;

    .line 18
    .line 19
    iput-object p2, p0, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 20
    .line 21
    invoke-virtual {p2, p0}, Lcom/google/android/material/navigation/d;->setOnItemSelectedListener(Lu2/m;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lu1/w1;->d:Lx1/a;

    .line 29
    .line 30
    const v1, 0x7f09006d

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1}, Le/j;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, p0, Lu1/w1;->c:Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 44
    .line 45
    iput-object v1, p0, Lu1/w1;->f:Landroid/widget/RelativeLayout$LayoutParams;

    .line 46
    .line 47
    invoke-virtual {p1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const v2, 0x7f0a0052

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iput v1, p0, Lu1/w1;->l:I

    .line 59
    .line 60
    const v1, 0x7f0603e2

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v1}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iput p1, p0, Lu1/w1;->m:I

    .line 68
    .line 69
    new-instance p1, Lu1/y0;

    .line 70
    .line 71
    const/4 v1, 0x2

    .line 72
    invoke-direct {p1, v1, p0}, Lu1/y0;-><init>(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lx1/a;->i(Lx1/e;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lu1/w1;->c()V

    .line 79
    .line 80
    .line 81
    new-instance p1, Lu1/t1;

    .line 82
    .line 83
    invoke-direct {p1, p0, p2}, Lu1/t1;-><init>(Lu1/w1;Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 87
    .line 88
    .line 89
    iget-boolean p1, v0, Lx1/a;->o0:Z

    .line 90
    .line 91
    if-eqz p1, :cond_0

    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Lz/e;

    .line 98
    .line 99
    iget-object p1, p1, Lz/e;->a:Lz/b;

    .line 100
    .line 101
    check-cast p1, Lco/median/android/widget/BottomNavigationShowOnScrollBehavior;

    .line 102
    .line 103
    iput-object p1, p0, Lu1/w1;->e:Lco/median/android/widget/BottomNavigationShowOnScrollBehavior;

    .line 104
    .line 105
    if-eqz p1, :cond_0

    .line 106
    .line 107
    iput-object p0, p1, Lco/median/android/widget/BottomNavigationShowOnScrollBehavior;->t:Lu1/w1;

    .line 108
    .line 109
    new-instance p2, Lu1/u1;

    .line 110
    .line 111
    invoke-direct {p2, p0}, Lu1/u1;-><init>(Lu1/w1;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p1, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->i:Ljava/util/LinkedHashSet;

    .line 115
    .line 116
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lu1/w1;->j:Lorg/json/JSONArray;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Lu1/w1;->j:Lorg/json/JSONArray;

    .line 9
    .line 10
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge v0, v1, :cond_9

    .line 15
    .line 16
    iget-object v1, p0, Lu1/w1;->j:Lorg/json/JSONArray;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_5

    .line 20
    .line 21
    if-ltz v0, :cond_5

    .line 22
    .line 23
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-lt v0, v1, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    iget-object v1, p0, Lu1/w1;->j:Lorg/json/JSONArray;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iget-object v3, p0, Lu1/w1;->o:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v2, v1

    .line 52
    check-cast v2, Ljava/util/List;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    const-string v4, "regex"

    .line 56
    .line 57
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    if-nez v4, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-static {v4}, Lt2/i;->f(Ljava/lang/Object;)Ljava/util/LinkedList;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :goto_1
    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_5
    :goto_2
    if-nez v2, :cond_6

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_6
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_8

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Ljava/util/regex/Pattern;

    .line 89
    .line 90
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    iget-object p1, p0, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/google/android/material/navigation/d;->getMenu()Landroid/view/Menu;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const/4 v0, 0x1

    .line 111
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_8
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_9
    :goto_4
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 7

    .line 1
    iput-object p1, p0, Lu1/w1;->i:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lu1/w1;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lu1/w1;->d:Lx1/a;

    .line 12
    .line 13
    iget-object v2, v1, Lx1/a;->Y0:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_1
    iget-boolean v2, p0, Lu1/w1;->p:Z

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lu1/w1;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    iget-object v2, v1, Lx1/a;->Z:Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v1, v1, Lx1/a;->a0:Ljava/util/ArrayList;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v2, :cond_a

    .line 37
    .line 38
    if-nez v1, :cond_3

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move v4, v3

    .line 42
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const/4 v6, 0x0

    .line 47
    if-ge v4, v5, :cond_5

    .line 48
    .line 49
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Ljava/util/regex/Pattern;

    .line 54
    .line 55
    invoke-virtual {v5, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/String;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    move-object v1, v6

    .line 76
    :goto_1
    if-nez v1, :cond_6

    .line 77
    .line 78
    iput-object v6, p0, Lu1/w1;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p0, v3}, Lu1/w1;->f(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_6
    iget-object v2, p0, Lu1/w1;->h:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v2, :cond_7

    .line 87
    .line 88
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_9

    .line 93
    .line 94
    :cond_7
    iput-object v1, p0, Lu1/w1;->h:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v0, v0, Lx1/a;->Y:Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lorg/json/JSONArray;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lu1/w1;->e(Lorg/json/JSONArray;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/google/android/material/navigation/d;->getMenu()Landroid/view/Menu;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {v0}, Landroid/view/Menu;->size()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_8

    .line 122
    .line 123
    const/4 v3, 0x1

    .line 124
    :cond_8
    invoke-virtual {p0, v3}, Lu1/w1;->f(Z)V

    .line 125
    .line 126
    .line 127
    :cond_9
    :goto_2
    if-eqz v1, :cond_b

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Lu1/w1;->a(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_a
    :goto_3
    invoke-virtual {p0, v3}, Lu1/w1;->f(Z)V

    .line 134
    .line 135
    .line 136
    :cond_b
    :goto_4
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object v0, p0, Lu1/w1;->d:Lx1/a;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/a;->Z:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, v0, Lx1/a;->a0:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v3, p0, Lu1/w1;->k:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v3, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-ge v4, v5, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Ljava/util/regex/Pattern;

    .line 42
    .line 43
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, v0, Lx1/a;->Y:Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/util/Map$Entry;

    .line 70
    .line 71
    new-instance v2, Lu1/v1;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Lorg/json/JSONArray;

    .line 81
    .line 82
    iput-object v4, v2, Lu1/v1;->a:Lorg/json/JSONArray;

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, Ljava/util/regex/Pattern;

    .line 93
    .line 94
    iget-object v4, p0, Lu1/w1;->k:Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v4, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    :goto_2
    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    if-nez p2, :cond_1

    .line 5
    .line 6
    const-string p2, ""

    .line 7
    .line 8
    :cond_1
    iget-object v0, p0, Lu1/w1;->j:Lorg/json/JSONArray;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Lu1/w1;->j:Lorg/json/JSONArray;

    .line 14
    .line 15
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ge v0, v1, :cond_3

    .line 20
    .line 21
    iget-object v1, p0, Lu1/w1;->j:Lorg/json/JSONArray;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    const-string v2, "url"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "javascript"

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Lcom/google/android/material/navigation/d;->setSelectedItemId(I)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    :goto_1
    return-void
.end method

.method public final e(Lorg/json/JSONArray;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, Lu1/w1;->j:Lorg/json/JSONArray;

    .line 6
    .line 7
    iget-object v2, v0, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/google/android/material/navigation/d;->getMenu()Landroid/view/Menu;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Landroid/view/Menu;->clear()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {v2}, Lcom/google/android/material/navigation/d;->getMenu()Landroid/view/Menu;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v2}, Landroid/view/Menu;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, -0x1

    .line 33
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    if-ge v7, v9, :cond_b

    .line 38
    .line 39
    const/4 v9, 0x4

    .line 40
    const/4 v10, 0x0

    .line 41
    if-le v7, v9, :cond_1

    .line 42
    .line 43
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v6, "u1.w1"

    .line 48
    .line 49
    const-string v7, "Tab menu items list should not have more than 5 items"

    .line 50
    .line 51
    invoke-virtual {v1, v6, v7, v10}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_1
    invoke-virtual {v1, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    if-nez v9, :cond_2

    .line 61
    .line 62
    :goto_1
    const/4 v6, 0x0

    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_2
    const-string v11, "label"

    .line 66
    .line 67
    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    const-string v12, "icon"

    .line 72
    .line 73
    invoke-virtual {v9, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    const-string v13, "activeIcon"

    .line 78
    .line 79
    invoke-virtual {v9, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    const-string v14, "inactiveIcon"

    .line 84
    .line 85
    invoke-virtual {v9, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v14

    .line 89
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    if-eqz v15, :cond_3

    .line 94
    .line 95
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    if-eqz v15, :cond_3

    .line 100
    .line 101
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    if-eqz v15, :cond_3

    .line 106
    .line 107
    const-string v15, "url"

    .line 108
    .line 109
    invoke-virtual {v9, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    invoke-virtual {v15}, Ljava/lang/String;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    if-eqz v15, :cond_3

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v15

    .line 124
    if-eqz v15, :cond_5

    .line 125
    .line 126
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    if-nez v12, :cond_4

    .line 131
    .line 132
    move-object v12, v13

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    const-string v12, "faw_question"

    .line 135
    .line 136
    :cond_5
    :goto_2
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v15

    .line 140
    if-eqz v15, :cond_6

    .line 141
    .line 142
    move-object v13, v12

    .line 143
    :cond_6
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    if-eqz v15, :cond_7

    .line 148
    .line 149
    move-object v14, v12

    .line 150
    :cond_7
    iget v12, v0, Lu1/w1;->m:I

    .line 151
    .line 152
    iget-object v15, v0, Lu1/w1;->a:Lco/median/android/MainActivity;

    .line 153
    .line 154
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    new-instance v5, Lg/d;

    .line 158
    .line 159
    invoke-direct {v5, v10, v10}, Lg/d;-><init>(Lg/c;Landroid/content/res/Resources;)V

    .line 160
    .line 161
    .line 162
    new-instance v10, Lv1/b;

    .line 163
    .line 164
    iget v6, v0, Lu1/w1;->l:I

    .line 165
    .line 166
    invoke-direct {v10, v15, v6, v12, v13}, Lv1/b;-><init>(Landroid/content/Context;IILjava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v10}, Lv1/b;->d()Landroid/graphics/drawable/Drawable;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    new-instance v13, Lv1/b;

    .line 174
    .line 175
    invoke-direct {v13, v15, v6, v12, v14}, Lv1/b;-><init>(Landroid/content/Context;IILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v13}, Lv1/b;->d()Landroid/graphics/drawable/Drawable;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    const v12, 0x10100a0

    .line 183
    .line 184
    .line 185
    filled-new-array {v12}, [I

    .line 186
    .line 187
    .line 188
    move-result-object v12

    .line 189
    invoke-virtual {v5, v12, v10}, Lg/d;->a([ILandroid/graphics/drawable/Drawable;)V

    .line 190
    .line 191
    .line 192
    const v10, -0x10100a0

    .line 193
    .line 194
    .line 195
    filled-new-array {v10}, [I

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    invoke-virtual {v5, v10, v6}, Lg/d;->a([ILandroid/graphics/drawable/Drawable;)V

    .line 200
    .line 201
    .line 202
    if-ge v7, v3, :cond_9

    .line 203
    .line 204
    invoke-interface {v2, v7}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    if-eqz v6, :cond_8

    .line 209
    .line 210
    invoke-interface {v6, v11}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 211
    .line 212
    .line 213
    invoke-interface {v6, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 214
    .line 215
    .line 216
    :cond_8
    const/4 v6, 0x0

    .line 217
    goto :goto_3

    .line 218
    :cond_9
    const/4 v6, 0x0

    .line 219
    invoke-interface {v2, v6, v7, v6, v11}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    invoke-interface {v10, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 224
    .line 225
    .line 226
    :goto_3
    const-string v5, "selected"

    .line 227
    .line 228
    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-eqz v5, :cond_a

    .line 233
    .line 234
    move v8, v7

    .line 235
    :cond_a
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_b
    :goto_5
    if-le v3, v4, :cond_d

    .line 240
    .line 241
    move v1, v4

    .line 242
    :goto_6
    if-ge v1, v3, :cond_d

    .line 243
    .line 244
    invoke-interface {v2, v4}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    if-eqz v5, :cond_c

    .line 249
    .line 250
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    invoke-interface {v2, v5}, Landroid/view/Menu;->removeItem(I)V

    .line 255
    .line 256
    .line 257
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_d
    const/4 v1, -0x1

    .line 261
    if-le v8, v1, :cond_e

    .line 262
    .line 263
    new-instance v1, Landroid/os/Handler;

    .line 264
    .line 265
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 266
    .line 267
    .line 268
    new-instance v2, Lb3/c;

    .line 269
    .line 270
    const/4 v3, 0x3

    .line 271
    invoke-direct {v2, v8, v3, v0}, Lb3/c;-><init>(IILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    const-wide/16 v3, 0xa

    .line 275
    .line 276
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 277
    .line 278
    .line 279
    :cond_e
    return-void
.end method

.method public final f(Z)V
    .locals 1

    .line 1
    new-instance v0, Lu1/s1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lu1/s1;-><init>(Lu1/w1;Z)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lu1/w1;->a:Lco/median/android/MainActivity;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu1/w1;->d:Lx1/a;

    .line 2
    .line 3
    iget-boolean v0, v0, Lx1/a;->o0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lu1/w1;->e:Lco/median/android/widget/BottomNavigationShowOnScrollBehavior;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget v2, p0, Lu1/w1;->g:I

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    if-ne v2, v3, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v1, v0}, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->x(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method
