package sombrero;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(1)
public class SampleCommandRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("==================================");
        System.out.print("# CommandLineRunner: ");
        Arrays.stream(args).forEach(System.out::println);
        System.out.println("==================================");
    }
}
