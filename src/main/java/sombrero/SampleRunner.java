package sombrero;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SampleRunner implements ApplicationRunner {
    /**
     * 애플리케이션이 다 뜬 다음에 뭔가를 실행하고 싶을 때 ApplicationRunner 사용.
     * 혹은 CommandLineRunner 사용.
     */

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==================================");
        System.out.println("# ApplicationRunner: ");
        System.out.println("# (1) foo: " + args.containsOption("foo"));
        System.out.println("# (2) bar: " + args.containsOption("bar"));
        System.out.println("==================================");
    }

}
