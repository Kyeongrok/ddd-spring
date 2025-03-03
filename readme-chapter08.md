# CHAPTER 08 의존성 관리하기

## 01 의존성 이해하기

### 변경과 의존성
어떤 객체가 협력하기 위해 다른 객체를 필요로 할 때 두 객체 사이에 의존성이 존재하게 됩니다. 
의존성은 실행 시점과 구현 시점에 서로 다른 의미를 가집니다.


### 의존성 해결하기
생성자와 Setter를 이용해 컴파일타임 의존성을 구체적인 런타임 의존성으로 대체해야 합니다.

Movie가 항상 할인 정책을 알 필요까지는 없고 가격을 계산할 때만 일시적으로 알아도 무방하다면 메서드의 인자를 이용해 의존성을 해결할 수도 있다.
```java
public class Movie {
    public Money calculateMovieFee(Screening screening, DiscountPolicy discountPolicy){
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
```
