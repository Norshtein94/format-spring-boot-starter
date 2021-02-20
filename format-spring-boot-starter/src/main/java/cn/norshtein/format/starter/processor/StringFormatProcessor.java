package cn.norshtein.format.starter.processor;

import java.util.Objects;

/**
 * @author Norshtein
 */
public class StringFormatProcessor implements FormatProcessor{

    @Override
    public <T> String process(T obj) {
        return "StringFormatProcessor: " + Objects.toString(obj);
    }
}