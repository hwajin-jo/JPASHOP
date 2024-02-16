package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderSearch {

    private String membername;
    private OrderStatus orderStatus; // 주문 상태[ORDER, CANCEL]
}
