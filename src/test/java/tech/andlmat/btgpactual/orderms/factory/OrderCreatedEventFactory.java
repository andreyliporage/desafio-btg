package tech.andlmat.btgpactual.orderms.factory;

import tech.andlmat.btgpactual.orderms.listener.dto.OrderCreatedEvent;
import tech.andlmat.btgpactual.orderms.listener.dto.OrderItemEvent;

import java.math.BigDecimal;
import java.util.List;

public class OrderCreatedEventFactory {

    public static OrderCreatedEvent buildWithOneItem() {
        var itens = new OrderItemEvent("notebook", 1, BigDecimal.valueOf(20.50));

        return new OrderCreatedEvent(1L, 2L, List.of(itens));
    }

    public static OrderCreatedEvent buildWithTwoItem() {
        var item1 = new OrderItemEvent("notebook", 1, BigDecimal.valueOf(20.50));
        var item2 = new OrderItemEvent("mouse", 1, BigDecimal.valueOf(35.25));

        return new OrderCreatedEvent(1L, 2L, List.of(item1, item2));
    }
}
