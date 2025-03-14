
[Chapter01 객체, 설계](readme-chapter01.md)  
[Chapter06 메세지와 인터페이스](readme-chapter06.md)  
[Chapter07 객체 분해](readme-chapter07.md)
[Chapter08 의존성 관리하기](readme-chapter08.md)
[Chapter09 유연한 설계](readme-chapter09.md)
[Chapter10 상속과 코드 재사용](readme-chapter10.md)
[Chapter11 합성과 유연한 설계](readme-chapter11.md)

## DDD란?
비즈니스로직을 오브젝트에 최대한 넣고 테이블 설계 전에 도메인 설계를 먼저 하는 개발 방법론 입니다. 기존에 우리가 익숙한 방식은 Data Driven입니다.

도메인 드리븐은 도메인 관점에서 개발을 진행하는 것 입니다. 

우리가 익숙한 방법론은 Data Driven으로 DB를 먼저 생각하는 방법입니다. 도메인 드리븐 개발을 시작 하려면 도메인 관점으로 접근하는 생각의 전환이 필요 합니다.

## DDD로 전환 하는 이유
IT로의 요구사항이 점점 복잡해지면서 Data Driven은 DB와 Dependency가 많고 한쪽 부분이 커졌을 때 분리하기가 어렵기 때문에 Domain Driven으로 전환하려는 시도가 많습니다.



## DDD와 Data Driven의 차이
Data Driven은 데이터를 기준으로 개발을 합니다. 그래서 DB에 데이터를 어떻게 넣을 것인지에 대한 DB설계가 나오고 DB설계는 비즈니스 로직 분석을 통해 ERD를 그리고 시작 합니다. 하지만 DDD는 도메인부터 설계 합니다. DDD가 Data Driven보다는 개발자에 더 친숙하다고 볼 수 있습니다.



## DDD의 단점
구현할 때 손이 많이 가고 복잡 합니다. Data Driven은 DB관점으로 생각 하기 때문에 DB모델링이 잘 되어 있어야 하고 그것에 의존하여 개발하면 됩니다. 하지만 Domain Driven은 개발자가 비즈니스 로직을 고려해서 코드를 설계 해야 합니다.



## DDD의 장점
개발자가 도메인이나 애그리거트(Aggregate) 기준으로 독립적으로 개발을 할 수 있습니다. 왜냐하면 데이터 처리 로직을 도메인 안쪽에 넣기 때문에 한개의 어플리케이션에서 특정 도메인이 커져서 새로운 프로젝트로 분리하는 경우 분리가 가능합니다.



## DDD와 AxonIQ
MSA에서 DDD와 Event Driven방식을 프레임웍으로 구현해놓은 제품입니다. DDD방법론으로 구현한 애그리거트를 어플리케이션으로 분리했을 때 발생할 수 있는 문제점들을 해결하기위한 반복되는 코드 예를들어 어플리케이션간에 트렌젝션 처리 등을 프레임웍으로 정의 해놓았습니다.



## DDD개발의 순서
1. 요구사항 정의
2. Domain설계
3. 애그리거트로의 경계 설정
4. 어플리케이션으로 분리(애그리거트가 충분히 커졌을 때)
5. AxonIQ적용

