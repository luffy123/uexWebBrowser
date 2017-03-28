package org.zywx.wbpalmstar.plugin.uexwebbrowser;

import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;

/**
 * Created by ylt on 2017/3/27.
 */

public class X5WebChromeClient extends WebChromeClient {

    @Override
    public boolean onJsConfirm(WebView webView, String s, String s1, JsResult jsResult) {
        return super.onJsConfirm(webView, s, s1, jsResult);
    }


}
