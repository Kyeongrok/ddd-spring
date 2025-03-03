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
#### 순번 조건을 판단하는 로직 변경
#### 기간 조건을 판단하는 로직이 변경되는 경우
