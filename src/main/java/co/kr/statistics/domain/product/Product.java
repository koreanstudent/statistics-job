package co.kr.statistics.domain.product;

import co.kr.statistics.domain.common.BaseEntity;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Comment;

@Entity
public class Product extends BaseEntity {

  @Comment("상품 ID")
  @Column(name = "product_id")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Comment("상품명")
  @Column(name = "product_name")
  private String productName;

  @Comment("가격")
  private int price;

  @Comment("상품타입")
  @Column(name="product_type")
  private String productType;

  @Comment("삭제여부")
  @Column(name = "delete_yn")
  private boolean deleteYN;

  @Comment("삭제일시/판매종료")
  @Column(name = "delete_date_time", updatable = false)
  private LocalDateTime deleteDateTime;
}
