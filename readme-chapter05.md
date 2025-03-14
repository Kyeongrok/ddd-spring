# CHAPTER 05 책임 할당하기

## 01 책임 주도 설계를 향해

- 데이터보다 행동을 먼저 결정하라
- 협력이라는 문맥 안에서 책임을 결정하라

"이 객체가 수행해야 하는 책임은 무엇인가?"를 결정한 후에 "이 책임을 수행하는 데 필요한 데이터는 무엇인가?"를 결정한다.

## 02 GRASP 패턴을 이용한 설계


### CREATOR 패턴

객체 A를 생성해야 할 때 어떤 객체에게 객체 생성 책임을 할당해야 할까요? 아래 조건을 최대한 많이 만족하는 B에게 객체 생성 책임을 할당 합니다. 
- B가 A 객체를 포함하거나 참조한다. B includes or references A
- B가 A 객체를 기록한다. B records A Object.
- B가 A 객체를 긴밀하게 사용한다. B uses A Object closely.
- B가 A객체를 초기화 하는데 필요한 데이터를 가지고 있다. B has the data required to initialize A.

[Screening.java](src/main/java/com/osc/object/chapter05/Screening.java)



### DiscountCondition 개선하기

변경에 취약한 클래스란 코드를 수정해야 하는 이유를 하나 이상 가지는 클래스다. DiscountCondition은 다음과 같이 서로 다른 세 가지 이유로 변경될 수 있습니다.

#### 새로운 할인 조건 추가

[DiscountCondition.java](src/main/java/com/osc/object/chapter05/DiscountCondition.java)

다음 isSatisfiedBy는 새로운 조건이 추가된다면 if ~ else 구문을 수정해야 합니다. 
또한 새로운 할인 조건이 새로운 데이터를 요구한다면 DiscountCondition에 속성을 추가하는 작업도 필요 합니다.

```java
public boolean isSatisfiedBy(Screening screening) {
    if (type == DiscountConditionType.PERIOD) {
        return isSatisfiedByPeriod(screening);
    }
    return isSatisfiedBySequence(screening);
}
```

#### 순번 조건을 판단하는 로직 변경

#### 기간 조건을 판단하는 로직이 변경되는 경우

[DiscountCondition.java](src/main/java/com/osc/object/chapter06/DiscountCondition.java)


DiscountCondition은 하나 이상의 변경 이유를 가지기 때문에 응집도가 낮습니다. 
응집도가 낮다는 것은 **서로 연관성이 없는** 기능이나 데이터가 하나의 클래스 안에 뭉쳐져 있다는 것을 의미 합니다.


### 변경과 유연성(합성)

## 04 책임 주도 설계의 대안

일단 만들고 '책임'을 찾아냅니다. 숙련된 전문가도 '역할'과 '책임'을 찾기가 어려운 경우가 많기 때문입니다.


## Memo

DiscountCondition은 DiscountConditionType에 따라 어떤 메소드를 태울지 결정 합니다.

```java
public class DiscountCondition {
  private DiscountConditionType type;
  private int sequence;
  private DayOfWeek dayOfWeek;
  private LocalTime startTime;
  private LocalTime endTime;

  public boolean isDiscountable(Screening screening) {
    if (type == DiscountConditionType.PERIOD) {
      return isSatisfiedByPeriod(screening);
    }
    return isSatisfiedBySequence(screening);
  }

  private boolean isSatisfiedByPeriod(Screening screening) {
    return screening.getWhenScreened().getDayOfWeek().equals(dayOfWeek)
            && startTime.isBefore(screening.getWhenScreened().toLocalTime())
            && endTime.isAfter(screening.getWhenScreened().toLocalTime());
  }

  private boolean isSatisfiedBySequence(Screening screening) {
    return sequence == screening.getSequence();
  }
}
```


