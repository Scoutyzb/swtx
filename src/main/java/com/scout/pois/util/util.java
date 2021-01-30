package com.scout.pois.util;

import com.scout.pois.entity.Constants;
import com.scout.pois.entity.Position;
import com.scout.pois.services.PoiService;

/**
 * @author:Scout
 * @data:2021/1/25
 * @description:
 */
public final class util {

    private static final double PI = 3.1415926535897932384626D;

    // 火星坐标系与百度坐标系转换的中间量
    private static final double X_PI = 3.14159265358979324 * 3000.0 / 180.0D;

    // Krasovsky 1940
    // 长半轴a = 6378245.0, 1/f = 298.3
    // b = a * (1 - f)
    // 扁率ee = (a^2 - b^2) / a^2;

    // 长半轴
    private static final double SEMI_MAJOR = 6378245.0D;

    // 扁率
    private static final double FLATTENING = 0.00669342162296594323D;

    public static double ytometer(double y){
        return y*111*1000;
    }

    public static double metertoy(double meter){
        return meter/(111*1000);
    }

    public static double metertox(double meter){
        return meter/(111*1000*Math.cos(Constants.avelatitude));
    }

    public static double xtometer(double x){
        return x*111*1000*Math.cos(Constants.avelatitude);
    }

    public static double caldis(Position one, Position two){
        double disx = xtometer((one.getX()-two.getX()));
        double disy = ytometer((one.getY()-two.getY()));
        return Math.sqrt(disx*disx+disy*disy);
    }
    public static Position gcj02ToBd09(Position position){
        return gcj02ToBd09(position.getX(), position.getY());
    }

    public static Position gcj02ToBd09(double lng, double lat) {
        double z = Math.sqrt(lng * lng + lat * lat) + 0.00002 * Math.sin(lat * X_PI);
        double theta = Math.atan2(lat, lng) + 0.000003 * Math.cos(lng * X_PI);
        double bd_lng = z * Math.cos(theta) + 0.0065;
        double bd_lat = z * Math.sin(theta) + 0.006;
        return new Position(bd_lng, bd_lat);
    }

    public static Position bd09ToGcj02(Position position){
        return bd09ToGcj02(position.getX(), position.getY());
    }

    public static Position bd09ToGcj02(double lng, double lat) {
        double x = lng - 0.0065;
        double y = lat - 0.006;
        double z = Math.sqrt(x * x + y * y) - 0.00002 * Math.sin(y * X_PI);
        double theta = Math.atan2(y, x) - 0.000003 * Math.cos(x * X_PI);
        double gcj_lng = z * Math.cos(theta);
        double gcj_lat = z * Math.sin(theta);
        return new Position(gcj_lng, gcj_lat);
    }




}
