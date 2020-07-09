package edu.cnm.deepdive.quotes;

import edu.cnm.deepdive.quotes.model.entity.Source;
import edu.cnm.deepdive.quotes.model.entity.Tag;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.lang.NonNull;

@SpringBootApplication
@EnableHypermediaSupport(type = HypermediaType.HAL)
public class QuotesApplication {

  public static void main(String[] args) {
    SpringApplication.run(QuotesApplication.class, args);
  }


}
