package ex02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 메서드 위에만 가능, type 은 클래스 위에만
@Retention(RetentionPolicy.RUNTIME) //런타임 때 실행, class는 컴파일시에 실행
public @interface RequestMapping {
    String uri();
}
