package co.kr.statistics.domain.orders;


import co.kr.statistics.domain.common.BaseEntity;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

  @Comment("주문 ID")
  @Column(name = "order_id")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Comment("주문채널")
  private String channel;

  @Comment("온라인 주문코드")
  @Column(name = "app_order_code")
  private String appOrderCode;

  @Comment("결제 타입")
  @Column(name="payment_type")
  private String paymentType;

  @Comment("주문 총액")
  @Column(name="total_price")
  private int totalPrice;

  @Comment("삭제여부")
  @Column(name = "delete_yn")
  private boolean deleteYN;

  @Comment("삭제일시")
  @Column(name = "delete_date_time", updatable = false)
  private LocalDateTime deleteDateTime;

}
