package info.zhirong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wrong
 * Created on 2019-04-21
 */
//@EnableEurekaClient
@EnableFeignClients
//@SpringBootApplication
//@EnableCircuitBreaker
@SpringBootApplication
@EnableHystrix
public class UserEdgeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserEdgeServiceApplication.class);
    }
}
