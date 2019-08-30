package application;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@Introspected
@AllArgsConstructor
public class MyBean {
    int num;
    String str;

    public <T extends Enum<T>> MyBean(int num, String str, Class<T> enumClass) {
        this(num, str + enumClass.getName());
    }
}
