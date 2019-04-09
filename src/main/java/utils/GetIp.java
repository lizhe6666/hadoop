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
    /*
     * @description
     * @author li zhe
     * @date 2018/12/2 19:28
     * @param [str = IpAddress]
     * @return void
     */
    public static void getIp(String str){
        TaobaoIPResult result = TaobaoIP.getResult(str);
        if (result.getCode() == 0){
            System.out.println("国家/地区：" + result.getCountry());
            System.out.println("省份：" + result.getRegion());
            System.out.println("城市：" + result.getCity());
            System.out.println("运营商：" + result.getIsp());
            System.out.println("测试中------------");
            System.out.println("第二次测试--------");
        }
        else { System.err.println("ip地址查询失败，请检查ip地址是否正确"); }
        //xiu gai
        //第二次修改
        //第三次修改
        //我的修改
        //我的最后的修改
    }

    public static void main(String[] args) {
        getIp("210.75.225.254");
    }
}
