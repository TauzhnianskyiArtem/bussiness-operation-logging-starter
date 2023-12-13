package ua.artem.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggingAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public BusinessOpsLoggingAspect businessOpsLoggingAspect() {
        return new BusinessOpsLoggingAspect();
    }
}
