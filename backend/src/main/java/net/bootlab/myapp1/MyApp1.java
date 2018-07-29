package net.bootlab.myapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by @author <a href="mailto:andrei.belov@mail.ru">Andrei Belov</a>
 * Inspired by @see <a href="https://github.com/kantega/react-and-spring">kantega/react-and-spring</a>
 * and @see <a href="https://github.com/justin-calleja/webpack-mvn">justin-calleja/webpack-mvn</a>
 * and @see <a href="https://stormpath.com/blog/crud-application-react-spring-boot-user-authentication">
 *     Build a CRUD Application with React, Spring Boot, and User Authentication</a>
 */
@SpringBootApplication
public class MyApp1{


    /**
     * @see <a href="https://www.jetbrains.com/help/idea/spring-boot.html">spring-boot</a>
     * @see <a href="https://www.jetbrains.com/help/idea/debugger-hotswap.html">debugger-hotswap</a>
     * @see <a href="https://docs.spring.io/spring-boot/docs/current/reference/html/howto-hotswapping.html">howto-hotswapping</a>
     * @see <a href="https://www.romaniancoder.com/spring-boot-live-reload-with-intellij/">spring-boot-live-reload-with-intellij</a>
     */
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "true");
        SpringApplication.run(MyApp1.class, args);
    }
}
