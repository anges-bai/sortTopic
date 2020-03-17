import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

/**
 * @Author: BaiMiao
 * @Date: 2020/2/18 11:29
 * @Description:
 */
public class testGson {
    public static void main(String[] args) {
        HashMap<String,Object> hashMap=new HashMap<>();
        hashMap.put("name","李白");
        hashMap.put("skill1","诗");
        hashMap.put("skill2","酒");
        hashMap.put("skill3","金银财帛");

        //通过map转换为json结构的字符串
        //1.创建一个json对象
        Gson gson=new GsonBuilder().create();
        //2.使用toJson方法把键值对结构转换为json字符串
        String str=gson.toJson(hashMap);
        System.out.println(str);
    }
}

