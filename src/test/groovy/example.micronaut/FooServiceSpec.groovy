package example.micronaut

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class FooServiceSpec extends Specification {

    @Inject FooService fooService

    void 'fallback works'() {
        when:
        String result = fooService.doSomething()

        then:
        noExceptionThrown()
        result == 'Fallback'
    }
}
