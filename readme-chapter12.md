# 다형성

아래 코드는 포함 다형성의 전형적인 예를 잘 보여줍니다. Movie클래스는 discountPolicy에게 calculateDiscountAmount() 메시지를 전송하지만 실제로 실행되는 메서드는 메시지를 수신한 객체의 타입에 따라 달라집니다.

```java
public class Movie {
    private DiscountPolicy discountPolicy;
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
```

상속의 목적은 서브타입의 구현입니다. 코드재사용이 아닙니다.

## 02 상속의 양면성
