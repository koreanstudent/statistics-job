package co.kr.statistics.config;

import co.kr.statistics.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class TestRunner {


  private final TestService testService;

  @Bean
  public ApplicationRunner applicationRunner() {
    return new ApplicationRunner() {
      @Override
      public void run(ApplicationArguments args) throws Exception {
        for (String x : args.getNonOptionArgs()){
          log.debug(" ApplicationArguments : {}" , x);
        }

        log.debug(" testService : {}" , testService.hello());
      }
    };
  }



}
