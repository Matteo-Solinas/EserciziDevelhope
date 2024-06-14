package com.exercise.logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    Logger logger = LoggerFactory.getLogger(BasicService.class);

    @Value("${int1}")
    private int int1;

    @Value("${int2}")
    private int int2;

    public double doPowerOfTwoInt() {
        logger.debug("Start power calculation");
        logger.debug("Calculating {} raised to the power of {}.", this.int1, this.int2);
        double result = Math.pow(this.int1, this.int2);
        logger.debug("Calculation complete.");
        logger.debug("The result of {}^{} is {}", this.int1, this.int2, result);
        return result;
    }

}
