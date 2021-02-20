package cn.norshtein.format.starter.configuration;

import cn.norshtein.format.starter.FormatTemplate;
import cn.norshtein.format.starter.processor.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Norshtein
 */
@EnableConfigurationProperties(FormatProperties.class)
@Import(FormatConfig.class)
@Configuration
public class FormatAutoConfiguration {

    @Bean
    public FormatTemplate formatTemplate(FormatProperties formatProperties, FormatProcessor formatProcessor){
        return new FormatTemplate(formatProperties, formatProcessor);
    }
}