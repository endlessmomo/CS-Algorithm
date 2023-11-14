## What is Builder-Pattern ?
> <span style="background-color: #f1f8ff" >복잡한 객체의 생성 과정</span>과 <span style="background-color: #f1f8ff">표현 방법을 분리</span>하여 다양한 구성의 인스턴스를 만드는 생성 패턴이다.<br>

즉,  별도의 Builder 클래스를 만들어 메소드를 통해step-by-step으로 값을 입력받은 후,<br> 최종적으로 build() 메소드로 하나의 인스턴스를 생성하여 반환하는 디자인 패턴이다.

## 이러한 빌더 패턴은 왜 사용할까?
Builder 패턴에는 크게 4가지의 장점이 있을 수 있다.
1. 불필요한 생성자를 만들지 않고 객체를 생성할 수 있다.
2. 데이터의 순서에 상관없이 객체를 생성할 수 있다.
3. 가독성이 향상된다.
4. 유지보수가 편리하다는 장점들이 있다.

자 그렇다면 먼저 코드로 확인해보자.

먼저, 빌더 패턴을 사용하지 않고 객체를 생성하는 경우 두 가지를 먼저 확인해보자.

### 점층적 생성자 패턴
> 필수 매개변수와 함께 선택 매개변수를 N개의 형태로, 우리가 다양한 매개변수를 입력받아 인스턴스를 생성하고 싶을 때 사용하는 생성자를 오버로딩하여 사용한다.

```Java
class SubwaySandwich {
    // 필수 매개변수
    private int bread;
    private int patty;
    private int cheese;
    
    // 선택 매개변수
    private boolean lettuce;
    private boolean pickle;
    private boolean tomato;
    private boolean olive;
    
    public SubwaySandwich(int bread, int patty, int cheese, boolean lettuce, boolean pickle, boolean tomato, boolean olive) {
        this.bread = bread;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.pickle = pickle;
        this.tomato = tomato;
        this.olive = olive;
    }
    public SubwaySandwich(int bread, int patty, int cheese, boolean pickle) {
        this.bread = bread;
        this.patty = patty;
        this.cheese = cheese;
        this.pickle = pickle;
    }

    public SubwaySandwich(int bread, int patty, int cheese, boolean olive) {
        this.bread = bread;
        this.patty = patty;
        this.cheese = cheese;
        this.olive = olive;
    }
    
    ...
    
    public SubwaySandwich(int bread, int patty, int cheese) {
        this.bread = bread;
        this.patty = patty;
        this.cheese = cheese;
    }
    
}
```