package me.sombrero;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Lombok
 * 롬복 동작 원리:
 *      컴파일 시점에 애노테이션 프로세서를 사용하여
 *      소스코드의 AST(abstract syntax tree)를 조작한다.
 *      컴파일할 때 특정한 애노테이션이 붙어있는 소스코드를 참조해서 또 다른 소스코드를 만든다.
 */
@Getter @Setter
@EqualsAndHashCode
public class Member {

    private String name;

    private int age;

    public boolean isSameAge(Member member) {
        return this.age == member.age;
    }

}
