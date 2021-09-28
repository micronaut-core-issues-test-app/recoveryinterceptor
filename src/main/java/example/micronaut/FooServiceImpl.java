package example.micronaut;

import io.micronaut.retry.annotation.Recoverable;
import jakarta.inject.Singleton;

@Singleton
@Recoverable(api = FooService.class)
public class FooServiceImpl implements FooService {

    @Override
    public String doSomething() {
        throw new RuntimeException("boom!");
    }
}
