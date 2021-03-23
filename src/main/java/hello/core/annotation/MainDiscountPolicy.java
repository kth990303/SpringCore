package hello.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

import java.lang.annotation.*;

// qualifierd 클래스에서 가져온 어노테이션
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
// 이렇게 클래스를 만들면
// 오타로 인한 잘못 지정된 qualifier어노테이션
// 컴파일 에러로 잡아낼 수 있음
@Qualifier("mainDiscountPolicy")
@Primary
public @interface MainDiscountPolicy {

}
