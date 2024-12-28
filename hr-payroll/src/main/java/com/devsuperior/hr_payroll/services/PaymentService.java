package com.devsuperior.hr_payroll.services;

import com.devsuperior.hr_payroll.entities.Payment;
import com.devsuperior.hr_payroll.entities.Worker;
import com.devsuperior.hr_payroll.feingclients.WorkerFeingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeingClient workerFeingClient;

    public Payment getPayment(Long workerId, Integer days) {
        Worker worker = workerFeingClient.findById(workerId).getBody();

        assert worker != null;
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
