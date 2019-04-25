package info.zhirong.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 
 * Created on 2019-04-21
 */
@FeignClient(value = "user-service", fallback = UserServiceClientFallback.class)
public interface UserServiceClient {

    @GetMapping("/users/")
    String getUserInfo();
}
