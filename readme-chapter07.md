# CHAPTER 07 객체 분해

단기기억의 한계를 뛰어넘기 위해 본질적인 정보만 남기고 불필요한 세부사항을 걸러내 문제를 단순화 하는 것을 추상화 라고 합니다.

## 02 프로시저 추상화와 기능 분해

데이터를 중심으로 **타입**을 추상화  
데이터를 중심으로 **프로시저**를 추상화

```
직원의 급여를 계산한다.
    사용자로부터 소득세율을 입력받는다.
        "세율을 입력하세요: "라는 문장을 화면에 출력한다.
        키보드를 통해 세율을 입력받는다.
    직원의 급여를 계산한다
        전역 변수에 저장된 직원의 기본급 정보를 얻는다
        급여를 계산한다
    양식에 맞게 결과를 출력한다.
        "이름: {직원명}, 급여: {계산된 금액}" 형식에 따라 출력 문자열을 생성한다
```

```ruby
def sumOfBasePays()
    result = 0
    for basePay in $basePays
        result += basePay
    end
    puts(result)
end
```

### 데이터 변경으로 인한 파급효과

하향식 기능 분해의 가장 큰 문제점은 어떤 데이터를 어떤 함수가 사용하고 있는지를 추적하기 어렵다는 것이다.


calculatePay 함수에 조건 분기를 추가함으로써 해결할 수 있다.

```ruby
def calculatePay(name)
    taxRate = getTaxRate()
    if (hourly?(name)) then
        pay = calculateHoulyPayFor(name, taxRate)
    else
        pay = calculatePayFor(name, taxRate)
    end
    puts(describeResult(name, pay))
end
```

```ruby
def calculateHourlyPayFor(name, taxRate)
    index = $employees.index(name)
    basePay = $basePays[index] * $timeCards[index]
    return basePay - (basePay * taxRate)
end

def calculatePayFor(name, taxRate)

end
```

정규 직원과 아르바이트 직원을 판단하는 hourly? 함수 추가. 아르바이트 직원이면 true를 반환한다.
```ruby
def hourly?(name)
    return $hourlys[$employees.index(name)]
end
```

## 03 모듈

### 정보은닉과 모듈

정보은닉은 시스템을 모듈 단위로 분해하기 위한 기본 원리로 시스템에서 자주 변경되는 부분을 상대적으로 덜 변경되는 안정적인 인터페이스 뒤로 감춰야 한다는 것이 핵심이다.


## 04 데이터 추상화와 추상 데이터 타입
프로시저 추상화 만으로는 충분히 풍부한 추상화의 어휘집을 제공할 수 없습니다. 이 때 필요한 것이 **데이터 추상화** 입니다.


## 05 클래스

### 클래스는 추상 데이터 타입인가?
Employee 클래스는 하나의 클래스 처럼 보이지만 아르바이트 직원과 정규직원 두개의 타입이 공존합니다.  
설계적인 관점에서 하나의 대표적인 타입이 다수의 세부적인 타입을 감추기 때문에 이를 타입 추상화라고 불렀습니다.

### 변경을 기준으로 선택하라
기존 코드에 아무런 영향도 미치지 않고 새로운 객체 유형과 행위를 추가할 수 있는 객체지향의 특성을 개방-폐쇄 원칙(Open-Closed Principle, OCP)라고 부릅니다.
