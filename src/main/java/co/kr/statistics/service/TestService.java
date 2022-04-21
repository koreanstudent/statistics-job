package co.kr.statistics.service;


import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

  private final TestRepository testRepository;
  public String hello() {
    return testRepository.repository();
  }
}
