/*
 * FileName: StringSubAppearCount.java
 * Author:   bm
 * Date:     2021-06-20 23:57:31
 * Description: //模块目的、功能描述
 * History: //修改记录 修改人姓名 修改时间 版本号 描述 需求来源
 * <2021-06-20 23:57:31> <version> <desc> <source>
 *
 */

package wk.lear.algorithm;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringSubAppearCount {

    public static void main(String[] args) {

        //子字符串出现的次数
        //subStrAppearCount("jin tian shi ge hao ri zi ,jiushi jin tian ya ,jintian","jin");
        //公共字符串
        //  getMaxSameString();

        //最大不重复子串
        maxLengsubString();
    }

    /**
     * 子字符串穿线次数
     */
    public static void subStrAppearCount(String str, String subStr) {

        int count = 0;
        int index = 0;
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index = index + subStr.length();
            System.out.println(index);
        }
        System.out.println("子字符串出现的次数:" + count);
    }

    /**
     * 获取两个字符串中最大相同的子串
     */
    public static void getMaxSameString() {

        String max = "zhangsanlisi";
        String min = "abgsanac";
        String common = null;

        for (int i = 0; i < min.length(); i++) {
            for (int j = 0, h = min.length() - i; h < min.length(); j++, h++) {
                if (max.indexOf(min.substring(j, h)) != -1) {
                    common = min.substring(j, h);
                    break;
                }
            }
            if (common != null) {
                break;
            }
        }
        System.out.println(common);
    }

    /**
     * 最大不重复字符串
     */
    public static void maxLengsubString() {

        String s = "abca1234321gfds3";
        String con = null;
        Set set = new LinkedHashSet();
        int j = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (j < s.length() && !set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
            }
            //  System.out.println(set.size());
            if (con == null || con.length() < set.size()) {
                StringBuffer sb = new StringBuffer();
                for (Object o : set) {
                    sb.append(o);
                }
                con = sb.toString();
                //   System.out.println(con);
            }

            if (j == s.length()) break;
        }
        System.out.println(con);
    }


}
