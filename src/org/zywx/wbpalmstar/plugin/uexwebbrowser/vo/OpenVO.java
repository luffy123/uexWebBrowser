package org.zywx.wbpalmstar.plugin.uexwebbrowser.vo;

import android.view.ViewGroup;

import java.io.Serializable;

/**
 * Created by ylt on 2017/3/27.
 */

public class OpenVO implements Serializable {

    public int x=0;

    public int y=0;

    public int width= ViewGroup.LayoutParams.MATCH_PARENT;

    public int height=ViewGroup.LayoutParams.MATCH_PARENT;

    public String url;

}
