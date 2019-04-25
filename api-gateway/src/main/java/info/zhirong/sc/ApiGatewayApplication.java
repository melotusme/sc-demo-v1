package info.zhirong.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author wrong
 * Created on 2019-04-22
 */

@EnableZuulServer
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
