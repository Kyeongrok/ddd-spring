# CHAPTER 11 합성과 유연한 설계

상속은 부모 객체 안에 구현된 코드 자체를 재사용하지만 합성은 포함되는 객체의 퍼블릭 인터페이스를 재사용합니다.
따라서 상속 대신 합성을 사용하면 구현에 대한 의존성을 인터페이스에 대한 의존성으로 변경할 수 있습니다.

## 01 상속을 합성으로 변경하기
다음과 갈이 Hashtable을 Properties의 인스턴스 변수로 포함시키면 '합성' 관계로 변경할 수 있습니다.
```java
import java.util.Hashtable;

public class Properties {
    private Hashtable<String, String> properties = new Hashtable<>();

    public String setProperty(String key, String value) {
        return properties.put(key, valud);
    }

    public String getProperty(String key) {
        return properties.get(key);
    }
}
```

## 02 상속으로 인한 조합의 폭발적인 증가

### 기본 정책과 부가 정책 조합하기


### 추상 메서드와 훅 메서드
개방-폐쇄 원칙을 만족하는 설계를 만들 수 있는 한 가지 방법은 부모 클래스에 새로운 추상 메서드를 추가하고 부모 클래스의 다른 메서드 안에서 호출하는 것이다.
자식 클래스는 추상 메서드를 오버라이딩하고 자신만의 로직을 구현해서 부모 클래스에서 정의한 플로우에 개입할 수 있게 된다.

[11b 합성 관계록 변경하기](src/main/java/com/osc/object/chapter11b/readme.md)


## 03 합성관계로 변경하기

```java
public abstract class BasePolicy implements RatePolicy {
    private RatePolicy next;

    public BasePolicy(RatePolicy next) {
        this.next = next;
    }
    @Override
    public Money calculateFee(Phone phone){
        Money fee = calculateCallFee(phone);
        return fee;
    }
    abstract protected Money isSatisfiedBy(Money fee);
}
```