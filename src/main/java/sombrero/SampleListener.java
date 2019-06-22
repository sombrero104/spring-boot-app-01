package sombrero;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// @Component
public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {
    /**
     * ApplicationListener<ApplicationStartingEvent>
     *     => 어떤 이벤트의 리스너를 만들 것인지 타입<>을 줌.
     *
     *     이벤트 중 현재 사용하려는 ApplicationStartingEvent 이 이벤트가 만들어지는 시점에는
     *     ApplicationContext 가 아직 생성되지 않은 시점이기 때문에
     *     리스너를 빈으로 등록하게 되면 빈으로 등록하기 이전에 실행이 되어 리스너가 동작이 안됨.
     *     이런 경우에는 직접 등록을 해줘야 함. -> Application.java
     *      @Component 로 빈으로 등록하는 것이 의미가 없음.
     */
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("==================================");
        System.out.println("Application is starting.. :D");
        System.out.println("==================================");
    }
}
