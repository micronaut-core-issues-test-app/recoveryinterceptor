package example.micronaut;

import io.micronaut.aop.MethodInvocationContext;
import io.micronaut.context.BeanContext;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.inject.MethodExecutionHandle;
import io.micronaut.retry.intercept.RecoveryInterceptor;
import jakarta.inject.Singleton;

import java.util.Optional;

@Singleton
@Replaces(RecoveryInterceptor.class)
public class MyRecoveryInterceptor extends RecoveryInterceptor {

    public MyRecoveryInterceptor(BeanContext beanContext) {
        super(beanContext);
        System.out.println("==================== MyRecoveryInterceptor.MyRecoveryInterceptor ====================");
    }

    @Override
    public Optional<? extends MethodExecutionHandle<?, Object>> findFallbackMethod(MethodInvocationContext<Object, Object> context) {
        System.out.println("==================== MyRecoveryInterceptor.findFallbackMethod ====================");
        return super.findFallbackMethod(context);
    }
}
