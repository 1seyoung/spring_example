package hello.core.order;

public interface OrderService {

    //설계 그림 참고: OrderService는 할인에 대한 내용은 몰라도 된다. 할인에 대한 것은 DiscountPolicy에게 맡긴다.
    //주문 생성 (회원 id, 상품명, 상품 가격) -> 주문 결과 반환(return)
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
