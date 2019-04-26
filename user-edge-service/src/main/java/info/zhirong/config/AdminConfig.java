package info.zhirong.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author wrong big@brother.watch
 * Created on 2019-04-25
 */
@Data
@Component
@ConfigurationProperties("admin")
@RefreshScope
public class AdminConfig {

    private String name;
}
