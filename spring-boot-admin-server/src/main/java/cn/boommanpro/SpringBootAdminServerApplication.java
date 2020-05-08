package cn.boommanpro;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author <a href="mailto:boommanpro@gmail.com">boommanpro</a>
 * @date 2019/8/29 14:03
 * @created by wangqimeng
 */
@EnableAdminServer
@SpringBootApplication

public class SpringBootAdminServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplication(SpringBootAdminServerApplication.class).run(args);
    }

}
