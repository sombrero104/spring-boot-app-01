package sombrero;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SampleArguments {
    /**
     * 어떤 빈에 생성자가 하나이고
     * 그 생성자의 파라미터가 빈일 경우에는
     * 스프링이 자동으로 파라미터를 주입해줌.
     */

    /**
     *
     *
     * intellij에서 Run/Debug Configurations
     *
     * (1) VM Option : -Dfoo
     * (2) Program arguments : --bar
     *
     * --로 들어오는 Program arguments만 사용하는 것을 확인할 수 있다.
     *
     * $ java -jar target/spring-boot-app-01-1.0-SNAPSHOT.jar -Dfoo --bar
     *
     */

    public SampleArguments(ApplicationArguments arguments) {
        System.out.println("==================================");
        System.out.println("# (1) foo: " + arguments.containsOption("foo"));
        System.out.println("# (2) bar: " + arguments.containsOption("bar"));
        System.out.println("==================================");
    }
}
