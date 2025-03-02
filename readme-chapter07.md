# CHAPTER 07 객체 분해

단기기억의 한계를 뛰어넘기 위해 본질적인 정보만 남기고 불필요한 세부사항을 걸러내느 문제를 단순화 하는 것을 추상화 라고 합니다.

## 02 프로시저 추상화와 기능 분해

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




