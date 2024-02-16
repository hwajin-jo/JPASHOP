package jpabook.jpashop.domain;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class OrderSearch {

    private String membername;
    private OrderStatus orderStatus; // 주문 상태[ORDER, CANCEL]
}
