.class public interface abstract Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;,
        Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$ConfigField;,
        Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Baseline;
    }
.end annotation


# virtual methods
.method public abstract applyTo(Landroid/webkit/WebView;Ljava/util/function/Consumer;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Ljava/util/function/Consumer<",
            "Ljava/util/function/BiConsumer<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract build(Landroid/content/Context;Ljava/util/function/Consumer;)Landroid/webkit/WebView;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/function/Consumer<",
            "Ljava/util/function/BiConsumer<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;>;)",
            "Landroid/webkit/WebView;"
        }
    .end annotation
.end method
