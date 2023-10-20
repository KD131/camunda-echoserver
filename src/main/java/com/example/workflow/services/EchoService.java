package com.example.workflow.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EchoService implements JavaDelegate {
    private static final Logger LOGGER = LoggerFactory.getLogger(EchoService.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String input = (String) delegateExecution.getVariable("input");
        LOGGER.info("Echo: " + input);
    }
}
