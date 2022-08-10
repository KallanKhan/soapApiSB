package com.mypractice.soapApiSB.endpoint;

import com.mypractice.soapApiSB.loaneligibility.Acknowledgement;
import com.mypractice.soapApiSB.loaneligibility.CustomerRequest;
import com.mypractice.soapApiSB.service.LoanEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@Endpoint
public class LoanEligibilityindicatorEndpoint {

    private static final String NAMESPACE = "http://www.example.org/loanEligibilty";
    @Autowired
    private LoanEligibilityService service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
    @ResponsePayload
    public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest request) {
        return service.checkLoanEligibility(request);
    }

}