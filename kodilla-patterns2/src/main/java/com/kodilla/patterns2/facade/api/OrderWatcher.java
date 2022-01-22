package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(...))" +
    "%% args(orderDto, userId) && target(orderDto, userId)")
    public void logEvent(OrderDto orderDto, Long userId) {
        LOGGER.info("User's ID: " + userId);
        LOGGER.info("Number of items: " + orderDto.getItems().size());
    }
}
