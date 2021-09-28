package example.micronaut;

import io.micronaut.retry.annotation.Fallback;

@Fallback
public class FooFallback implements FooService {

    @Override
    public String doSomething() {
        return "Fallback";
    }
}
