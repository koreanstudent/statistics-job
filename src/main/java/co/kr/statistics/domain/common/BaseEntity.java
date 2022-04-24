package co.kr.statistics.domain.common;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@Getter
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

  @Column(name = "create_date_time", nullable = false, updatable = false)
  private LocalDateTime createDateTime;

  @Column(name = "update_date_time")
  private LocalDateTime updateDateTime;

}
