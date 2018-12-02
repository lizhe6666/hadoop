package utils;

import com.elevoc.sdk3rd.taobaoip.TaobaoIP;
import com.elevoc.sdk3rd.taobaoip.TaobaoIPResult;

/**
 * @program: hadoop
 * @description: 得到IP地址
 * @author: li zhe
 * @create: 2018-12-02 17:50
 */
public class GetIp {
    public static void getIp(String str){
        TaobaoIPResult result = TaobaoIP.getResult(str);
        if (result.getCode() == 0){
            System.out.println("国家/地区：" + result.getCountry());
            System.out.println("省份：" + result.getRegion());
            System.out.println("城市：" + result.getCity());
            System.out.println("运营商：" + result.getIsp());
        }
        else { System.err.println("ip地址查询失败，请检查ip地址是否正确"); }

    }

    public static void main(String[] args) {
        getIp("210.75.225.254");
    }
}
