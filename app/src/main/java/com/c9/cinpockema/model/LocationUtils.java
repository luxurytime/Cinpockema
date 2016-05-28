package com.c9.cinpockema.model;

import com.baidu.location.BDLocation;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.DistanceUtil;

/**
 * Created by marionette on 2016/5/27.
 */
public class LocationUtils {
    //定位当前位置

    //计算两坐标的距离,单位米
    public static int getDistance(LatLng start, LatLng end) {
        int dis = (int) DistanceUtil.getDistance(start, end);
        return dis;
    }

}
