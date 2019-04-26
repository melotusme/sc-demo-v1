package info.zhirong.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * @author wrong
 * Created on 2019-04-26
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableEurekaClient
public class SpringBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }

    //    @Configuration
    //    public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
    //        @Override
    //        protected void configure(HttpSecurity http) throws Exception {
    //            http.authorizeRequests().anyRequest().permitAll()
    //                    .and().csrf().disable();
    //        }
    //    }
}
