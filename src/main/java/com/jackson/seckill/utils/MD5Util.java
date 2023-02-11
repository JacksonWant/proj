package com.jackson.seckill.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;


@Component
public class MD5Util {
    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    private static final String salt = "1a2b3c4d";

    public static String inputPassToFormPass(String inputPass){
        String str = inputPass + salt.charAt(0) + salt.charAt(2) + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    public static String formPassToDBPass(String formPass,String nextSalt){
        String str = formPass + nextSalt.charAt(0) + nextSalt.charAt(2) + nextSalt.charAt(5) + nextSalt.charAt(4);
        return md5(str);
    }

    public static String inputPassToDBPass(String inputPass, String nextSalt){
        String formPass = inputPassToFormPass(inputPass);
        String dbPass = formPassToDBPass(formPass, nextSalt);
        return dbPass;
    }

    public static void main(String[] args) {
        //601870ad5d0414812295d6b1b1677ec7
        System.out.println(inputPassToFormPass("123456"));
        //ed1361a46d2dce763e6d03bad6562089
        System.out.println(inputPassToDBPass("601870ad5d0414812295d6b1b1677ec7","1w2e3r4t"));
    }
}
