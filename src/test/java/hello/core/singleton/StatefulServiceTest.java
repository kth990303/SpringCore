package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService s1 = ac.getBean(StatefulService.class);
        StatefulService s2 = ac.getBean(StatefulService.class);

        int price1 = s1.order("userA", 10000);
        int price2 = s2.order("userB", 20000);
        // 지역변수는 공유되는게 아니니까
        // 싱글톤 방식으로 할 경우, 클래스 변수 및 공유값은 건드리지 않도록
        Assertions.assertThat(price1).isNotEqualTo(price2);
    }
    static class TestConfig{
        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }
}
