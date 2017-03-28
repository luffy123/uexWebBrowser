package org.zywx.wbpalmstar.plugin.uexwebbrowser;

import android.graphics.Bitmap;

import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
import org.zywx.wbpalmstar.base.BDebug;

/**
 * Created by ylt on 2017/3/27.
 */

public class X5WebViewClient extends WebViewClient {


    public X5WebViewClient(){

    }

    @Override
    public void onPageFinished(WebView webView, String s) {
        super.onPageFinished(webView, s);
    }

    @Override
    public void onPageStarted(WebView webView, String s, Bitmap bitmap) {
        BDebug.d(s);
        super.onPageStarted(webView, s, bitmap);
    }

    @Override
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        BDebug.e("sslError");
        sslErrorHandler.proceed();
    }
}
