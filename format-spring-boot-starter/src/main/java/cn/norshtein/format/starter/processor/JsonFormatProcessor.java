package cn.norshtein.format.starter.processor;

import com.alibaba.fastjson.JSON;

/**
 * @author Norshtein
 */
public class JsonFormatProcessor implements FormatProcessor {

    @Override
    public <T> String process(T obj) {
        return "JsonFormatProcessor: " + JSON.toJSONString(obj);
    }
}