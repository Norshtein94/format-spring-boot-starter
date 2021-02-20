package cn.norshtein.format.starter.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Norshtein
 */
@ConfigurationProperties(prefix = FormatProperties.FORMAT_PROPERTY_PREFIX)
public class FormatProperties {
    static final String FORMAT_PROPERTY_PREFIX = "format.config";
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FormatProperties{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}