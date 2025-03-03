# CHAPTER 04 설계 품질과 트레이드오프

## 

자신의 크기를 Rectangle 스스로 증가시키도록 '책임을 이동'시킨 코드 입니다.
```java
class Rectangle {
    public void enlarge(int multiple) {
        right *= multiple;
        left *= multiple;
    }
}
```

### 


## 05 캡슐화 위반

응집도가 낮은 이유는 캡슐화를 위반했기 때문입니다. 
DiscountCondition과 Movie의 내부 구현이 인터페이스에 그대로 노출되고 있고 Screening은 노출된 구현에 직접적으로 의존하고 있습니다.


## 데이터 중심 설계의 문제점
- 데이터 중심의 설계는 본질적으로 너무 이른 시기에 데이터에 관해 결정하도록 강요 합니다.
- 데이터 중심 설계에서는 '협력'이라는 문맥을 고려하지 않고 객체를 고립시킨 채 오퍼레이션을 결정합니다.

 

