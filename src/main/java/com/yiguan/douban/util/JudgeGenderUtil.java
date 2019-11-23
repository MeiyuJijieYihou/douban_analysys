package com.yiguan.douban.util;

import java.io.*;

/**
 * Description: 判断用户性别工具类
 *
 * @author zhaofeng
 * @version 1.0
 * @date: 2019/11/23 16:21
 * @since JDK 1.8
 */
public class JudgeGenderUtil {
    public static final String PYTHON_INSTRUCTION = "python modify_text.py ";

    public static final String FEMALE = "female";

    /**
     *
     * @description： 根据用户id判断用户为女性
     *
     * @params [userId] 用户id
     * @return true 如果用户为女性
     * @author zhaofeng
     * @date 2019/11/23 17:27
     */
    public static boolean isFemale(String userId) throws IOException, InterruptedException {
        String cmd = PYTHON_INSTRUCTION + userId;

        Process proc = Runtime.getRuntime().exec(cmd);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));) {
            String result = null;
            if ((result = in.readLine()) != null && result.contains(FEMALE)) {
                return true;
            }
        }

        proc.waitFor();

        return false;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        String userId = "102909515";
        String userId2 = "cloud";
        System.out.println(isFemale(userId));
        System.out.println(isFemale(userId2));
    }
}
