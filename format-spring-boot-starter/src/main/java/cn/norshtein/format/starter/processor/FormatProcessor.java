package cn.norshtein.format.starter.processor;

/**
 * @author Norshtein
 */
public interface FormatProcessor {
    <T> String process(T obj);
}