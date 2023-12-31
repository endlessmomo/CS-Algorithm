## What is Design-Pattern ?
> 건물을 지을 때 사전 설계가 중요하듯 개발 또한 그렇다.<br>
> 어떤 문제나 수정 사항이 발생했을 때 시행착오를 통해 하나하나 고쳐나가는 것은 많은 기회 비용이 발생한다. <br>
> 따라서, 특정 상황에서 공통적으로 발생하는 문제에 대해 재사용 가능한 해결책이 바로 **디자인 패턴**이다.

## 디자인 패턴의 학습 목적
1. 반복해서 같은 문제가 발생하는 원인을 파악하여 동일한 일을 두번 다시 하지 않고 해결할 수 있도록 한다.
2. 구체적인 설명 없이 구조화된 패턴에 대한 사전 지식이 있다면 개발자 간에 커뮤니케이션이 수월하다.
3. 이미 검증된 구조로 작업하기 때문에 작업 속도가 향상된다.

## 디자인 패턴의 종류
> GoF 디자인 패턴은 생성, 구조, 행동 3가지로 나눌 수 있다. <br>
> "+"는 주로 사용되는 패턴으로 코드 예시가 있습니다.
### Creational Patterns (생성)
생성 패턴은 객체의 생성과 참조 과정을 캡슐화하여 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 받지 않도록 하여 프로그램에 유연성을 높힌다.
- [Singleton (싱글톤) +](https://github.com/endlessmomo/CS-Algorithm/tree/main/Design/Creational/Singleton) 
- [Builder (빌더) +](https://github.com/endlessmomo/CS-Algorithm/tree/main/Design/Creational/Builder)
- [Factory Method (팩토리 메소드) +](https://github.com/endlessmomo/CS-Algorithm/tree/main/Design/Creational/FactoryMethod)
- [Abstract Factory (추상 팩토리) +](https://github.com/endlessmomo/CS-Algorithm/tree/main/Design/Creational/AbstractFactory)
- [Prototype (프로토 타입) +](https://github.com/endlessmomo/CS-Algorithm/tree/main/Design/Creational/Prototype)

### Structural Patterns (구조)
구조 패턴은 클래스나 객체들을 조합해 더 큰 구조로 만들 수 있게 해준다.
- [Adaptor (어댑터) +]()
- [Decorator (데코레이터) +]()
- [Facade (퍼샤드) +]()
- [Composit (컴포지트) +]()
- [Proxy (프록시) +]()
- [Flyweight (플라이웨이트)]()
- [Bridge (브릿지)]()

### Behavioral Patterns (행위)
행위 패턴은 클래스나 객체들이 서로 상호작용하는 방법이나 어떤 태스크, 어떤 알고리즘을 어떤 객체에 할당하는 것이 좋을지를 정의한다.
- [State (상태) +]()
- [Observer (옵저버) +]()
- [Strategy (전략) +]()
- [Command (커맨드) +]()
- [Chain-of-Responsibility (책임 연쇄)]()
- [Interpreter (인터프리터)]()
- [Iterator (이터레이터)]()
- [Mediator (미디에이터)]()
- [Memento (메멘토)]()
- [Template Method(템플릿 메소드)]()
- [Visitor (방문자)]()
