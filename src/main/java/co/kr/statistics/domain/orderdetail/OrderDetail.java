package co.kr.statistics.domain.orderdetail;

import co.kr.statistics.domain.common.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Comment;

@Entity
public class OrderDetail extends BaseEntity {

  @Comment("주문 상세 ID")
  @Column(name = "detail_id")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Comment("주문 ID")
  @Column(name = "order_id")
  private Long orderId;

  @Comment("상품 ID")
  @Column(name = "product_id")
  private Long productId;

  @Comment("수량")
  @Column(name = "quantify")
  private int quantify;

  @Comment("가격")
  private int price;

}
