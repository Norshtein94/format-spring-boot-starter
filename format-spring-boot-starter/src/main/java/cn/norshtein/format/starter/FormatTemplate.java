package cn.norshtein.format.starter;

import cn.norshtein.format.starter.processor.FormatProcessor;
import cn.norshtein.format.starter.configuration.FormatProperties;

/**
 * @author Norshtein
 */
public class FormatTemplate {
    private FormatProperties properties;
    private FormatProcessor processor;

    public FormatTemplate(FormatProperties properties, FormatProcessor processor) {
        this.properties = properties;
        this.processor = processor;
    }

    public <T> String doFormat(T obj){
        return "Begin format:<br>"
                + processor.process(properties) + "<br>"
                + processor.process(obj) + "<br>"
                + "End format.";
    }
}