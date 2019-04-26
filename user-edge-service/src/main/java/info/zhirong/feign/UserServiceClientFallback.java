package info.zhirong.feign;

import org.springframework.stereotype.Component;

/**
 * @author
 * Created on 2019-04-21
 */
@Component
public class UserServiceClientFallback implements UserServiceClient {

    @Override
    public String getUserInfo() {
        return "user service gone away";
    }
}
