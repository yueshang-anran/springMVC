package com.kuang.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author 书
 * @date 2021/4/10 - 19:24
 */
public class JsonUtils {

    public static String getJson(Object object) {
        return getJson(object, "yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object object, String dateFormat) {
        ObjectMapper mapper = new ObjectMapper();

        //java自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        //sdf.format(date)

        // 使用ObjectMapper 来格式化输出
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.setDateFormat(sdf);

        try {
            //ObjectMapper,时间解析后的默认格式为：时间戳
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
