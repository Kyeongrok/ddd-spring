# CHAPTER 06 메시지와 인터페이스

## 01 협력과 메시지

### 메시지와 메시지 전송
메시지(message)는 객체들이 협력하기 위해 사용할 수 있는 유일한 의사소통 수단이다. 메시지는 오퍼레이션명(operation name)과 
인자(argument)로 구성되며 메시지 전송은 여기에 메시지 수신자를 추가한 것이다.

### 시그니처
오퍼레이션(또는 메서드)의 이름과 파라미터 목록을 합쳐 시그니처(signature)라고 부릅니다. 
오퍼레이션은 실행 코드 없이 시그니처만을 정의한 것이다.

### 디미터 법칙(Law of Demeter)
객체의 내부 구조에 강하게 결합되지 않도록 협력 경로를 제한하라는 것입니다. "요약하자면 오직 인접한 이웃하고만 말하라."로 요약 할 수 있습니다.

### 묻지 말고 시켜라

ReservationAgency는 Screening 내부의 Movie에 접근하는 대신 Screening에게 직접 요금을 계산하도록 요청했습니다.
요금을 계산하는데 필요한 정보를 잘 알고 있는 screening에게 요금을 계산할 **책임**을 할당 한 것입니다.

```java
public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee);
    }
}
```


### 의도를 드러내는 인터페이스

메서드가 작업을 어떻게 수행하는지를 나타내도록 이름을 짓는 것.

'어떻게'가 아니라 '무엇'을 하는지를 드러내는 것.


```java
public class TicketSeller {
    public void sellTo(Audience audience) {}
}
```

```java
public class Audience {
    public Long buy(Ticket ticket){}
}
```

```java
public class Bag {
    public Long hold(Ticket ticket) {}
}
```

## 04 명령-쿼리 분리 원칙

명령(Command)과 쿼리(Query)는 객체의 인터페이스 측면에서 프로시저와 함수를 부르는 또 다른 이름이다.  
명령은 부수효과를 발생시키지만 값을 리턴하지 않고 쿼리는 값을 리턴하지만 부수효과는 발생시킬 수 없다.

오퍼레이션은 부수효과를 발생시키는 명령이거나 부수효과를 발생시키지 않는 쿼리 중 하나여야 한다는 것이다.

