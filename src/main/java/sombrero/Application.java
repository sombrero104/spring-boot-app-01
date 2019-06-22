package sombrero;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);
        SpringApplication app  = new SpringApplication(Application.class);
        app.addListeners(new SampleListener());
        app.setWebApplicationType(WebApplicationType.SERVLET);
        /**
         * WebApplicationType.SERVLET
         *  => Spring Web MVC 를 사용하면 기본적으로 SERVLET을 실행.
         *      서블릿이 없으면 REACTIVE로 동작. 서블릿이 있으면 무조건 SERVLET으로 동작. 둘 다 없으면 NONE으로 동작.
         *      둘 다 있으면 SERVLET으로 동작. 가장 먼저 서블릿이 있는지 없는지를 체크하기 때문.
         *      둘 다 있는데 WebFlux를 사용하고 싶을 경우 REACTIVE를 설정.
         * WebApplicationType.REACTIVE
         *  => Spring WebFlux 로 설정되어 있으면 기본적으로 REACTIVE를 실행.
         * WebApplicationType.NONE
         */
        app.run(args);



    }

}
