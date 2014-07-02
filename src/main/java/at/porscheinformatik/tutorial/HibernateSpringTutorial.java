package at.porscheinformatik.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class HibernateSpringTutorial
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(HibernateSpringTutorial.class, args);

        PersonService personService = applicationContext.getBean(PersonService.class);
        Logger logger = LoggerFactory.getLogger(HibernateSpringTutorial.class);

        logger.info("Person created: {}", personService.createPerson("Markus", "Mustermann"));
    }
}
