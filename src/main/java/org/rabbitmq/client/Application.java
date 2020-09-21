package org.rabbitmq.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);

        int i = 0;

        for (String beanName : ctx.getBeanDefinitionNames()) {
            i = i + 1;
            logger.info(String.format("[%d] Bean: %s", i, beanName));
        }
    }
}
