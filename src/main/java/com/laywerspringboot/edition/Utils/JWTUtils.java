package com.laywerspringboot.edition.Utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

/**
 * @Author:小七
 * @createTime:2020-10-26-21-57
 */
public class JWTUtils {
    private static String TOKEN = "token!Q@W3e4r";
    /**
     * 生成token
     * @param map  //传入payload
     * @return 返回token
     */
    public static String getToken(Map<String,String> map){
        JWTCreator.Builder builder = JWT.create();
        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.MINUTE,30);
        builder.withExpiresAt(instance.getTime());
        return builder.sign(Algorithm.HMAC256(TOKEN)).toString();
    }
    /**
     * 验证token
     * @param token
     * @return
     */
    public static void verify(String token){
        JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }
    /**
     * 获取token中payload
     * @param token
     * @return
     */
    public static DecodedJWT getToken(String token){
        return JWT.require(Algorithm.HMAC256(TOKEN)).build().verify(token);
    }
}