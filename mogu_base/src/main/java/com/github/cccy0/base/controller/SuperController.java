package com.github.cccy0.base.controller;

import com.github.cccy0.base.global.Constants;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zhai
 * 2021/6/19 14:47
 */

public class SuperController {
    /**
     * 获取一个map
     */
    public static Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>(Constants.NUM_ONE);
        return map;
    }

    /**
     * 将map转换成json字符串
     */
    public String toJson(Map<String, Object> map) {
        return JSONObject.fromObject(map).toString();
    }

    public <T> String toJson(List<T> list) {
        return JSONObject.fromObject(list).toString();
    }
}
