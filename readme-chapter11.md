# CHAPTER 11 합성과 유연한 설계

상속은 부모 객체 안에 구현된 코드 자체를 재사용하지만 합성은 포함되는 객체의 퍼블릭 인터페이스를 재사용합니다.
따라서 상속 대신 합성을 사용하면 구현에 대한 의존성을 인터페이스에 대한 의존성으로 변경할 수 있습니다.

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

