package org.chromium.support_lib_boundary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public interface WebSettingsBoundaryInterface {

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributionBehavior {
        public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
        public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
        public static final int DISABLED = 0;
        public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface HyperlinkContextMenuItems {
        public static final int COPY_LINK_ADDRESS = 1;
        public static final int COPY_LINK_TEXT = 2;
        public static final int DISABLED = 0;
        public static final int OPEN_LINK = 4;
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SpeculativeLoadingStatus {
        public static final int DISABLED = 0;
        public static final int PRERENDER_ENABLED = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebViewMediaIntegrityApiStatus {
        public static final int DISABLED = 0;
        public static final int ENABLED = 2;
        public static final int ENABLED_WITHOUT_APP_IDENTITY = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebauthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    int getAttributionBehavior();

    boolean getBackForwardCacheEnabled();

    InvocationHandler getBackForwardCacheSettings();

    boolean getBackForwardCacheSettingsKeepForwardEntries();

    int getBackForwardCacheSettingsMaxPagesInCache();

    long getBackForwardCacheSettingsTimeout();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getHasEnrolledInstrumentEnabled();

    boolean getIgnoreDuplicateNavEnabled();

    int getIgnoreDuplicateNavThreshold();

    boolean getIncludeCookiesOnIntercept();

    boolean getOffscreenPreRaster();

    boolean getPaymentRequestEnabled();

    boolean getSafeBrowsingEnabled();

    int getSpeculativeLoadingStatus();

    Map<String, Object> getUserAgentMetadataMap();

    int getWebViewMediaIntegrityApiDefaultStatus();

    Map<String, Integer> getWebViewMediaIntegrityApiOverrideRules();

    int getWebauthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z4);

    void setAttributionBehavior(int i4);

    void setBackForwardCacheEnabled(boolean z4);

    void setBackForwardCacheSettings(InvocationHandler invocationHandler);

    void setBackForwardCacheSettingsKeepForwardEntries(boolean z4);

    void setBackForwardCacheSettingsMaxPagesInCache(int i4);

    void setBackForwardCacheSettingsTimeout(long j4);

    void setDisabledActionModeMenuItems(int i4);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z4);

    void setForceDark(int i4);

    void setForceDarkBehavior(int i4);

    void setHasEnrolledInstrumentEnabled(boolean z4);

    void setHyperlinkContextMenuItems(int i4);

    void setIgnoreDuplicateNavEnabled(boolean z4);

    void setIgnoreDuplicateNavThreshold(int i4);

    void setIncludeCookiesOnIntercept(boolean z4);

    void setOffscreenPreRaster(boolean z4);

    void setPaymentRequestEnabled(boolean z4);

    void setSafeBrowsingEnabled(boolean z4);

    void setSpeculativeLoadingStatus(int i4);

    void setUserAgentMetadataFromMap(Map<String, Object> map);

    void setWebViewMediaIntegrityApiStatus(int i4, Map<String, Integer> map);

    void setWebauthnSupport(int i4);

    void setWillSuppressErrorPage(boolean z4);
}
