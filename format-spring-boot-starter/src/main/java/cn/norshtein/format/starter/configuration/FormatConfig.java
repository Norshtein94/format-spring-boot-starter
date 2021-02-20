package cn.norshtein.format.starter.configuration;

import cn.norshtein.format.starter.processor.FormatProcessor;
import cn.norshtein.format.starter.processor.StringFormatProcessor;
import cn.norshtein.format.starter.processor.JsonFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Norshtein
 */
@Configuration
public class FormatConfig {
    @Bean
    @Primary
    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    public FormatProcessor stringProcessor(){
        return new StringFormatProcessor();
    }

    @Bean
    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    public FormatProcessor jsonProcessor(){
        return new JsonFormatProcessor();
    }
}