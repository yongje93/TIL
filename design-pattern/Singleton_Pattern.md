# Singleton Pattern

싱글톤 패턴이란 **단 하나의 유일한 객체를 만들기 위한** 코드 패턴<br>
메모리 절약을 위해, 인스턴스가 필요할 때 똑같은 인스턴스를 새로 만들지 않고 기존의 인스턴스를 가져와 활용하는 기법<br>

## 싱글톤 패턴 구현 기법
- Bill Pugh Solution (LazyHolder)
```java
class Singleton {

    private Singleton() {}
    
    private static class SingleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }
}
```
- - -
## 싱글톤의 문제점
1. 모듈간 의존성이 높아짐
   - 클래스의 객체를 미리 생성하고 정적 메소드를 이용해 사용하기 때문에 클래스 사이에 강한 의존성과 높은 결합이 생긴다.
   - 하나의 싱글톤 클래스를 여러 모듈들이 공유하기 때문에 싱글톤의 인스턴스가 변경되면 이를 참조하는 모듈들도 수정이 필요하다.
   - 클라이언트 코드에서 너무 많은 곳에서 사용하면 클래스 간의 결합도가 높아진다.
2. SOLID 원칙에 위배되는 경우가 있음
   - 하나의 싱글톤 인스턴스가 여러 가지 책임을 지니는 경우가 많아 단일 책임 원칙(SRP)를 위반
   - 싱글톤 인스턴스가 혼자 너무 많은 일을 하거나, 많은 데이터를 공유시키면 다른 클래스들 간의 결합도가 높아짐 -> 개방-폐쇄 원칙(OCP) 위반
   - 의존 관계상 클라이언트가 인터페이스와 같은 추상화가 아닌 구체 클래스에 의존하게 되어 의존 역전 원칙(DIP)도 위반
3. TDD 단위 테스트에 애로사항이 있음
   - 단위 테스트는 테스트가 서로 독립적이어야 하며 테스트를 어떤 순서대로 실행할 수 있어야한다.
   - 하지만 싱글톤 인스턴스는 자원을 공유하고 있기 때문에 매번 인스턴스의 상태를 초기화 시켜주어야 한다.

- - -
## 결론
싱글톤 기법은 오직 한 개의 인스턴스 생성을 보증하여 효율을 찾을 수 있지만, 그에 못지않게 수반되는 문제점도 많다.<br>
직접 유저가 만들어 사용하는 것 보다 스프링 컨테이너와 같은 프레임워크의 도움을 받으면 싱글톤 패턴의 문제점을 보완하면서 장점을 얻어 갈 수 있다.<br>
스프링 프레임워크에서는 싱글톤 패턴 대신 내부적으로 클래스의 제어를 IoC 방식의 컨터이너에게 넘겨 관리하기 때문에 하나의 인스턴스 뿐인 싱글톤으로 존재가 가능하다.