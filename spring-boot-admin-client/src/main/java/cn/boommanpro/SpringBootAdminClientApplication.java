package cn.boommanpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author <a href="mailto:wangqimeng@mininglamp.com">wangqimeng</a>
 * @date 2019/8/29 13:58
 * @created by wangqimeng
 */
@SpringBootApplication
public class SpringBootAdminClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplication(SpringBootAdminClientApplication.class).run(args);
    }
}
