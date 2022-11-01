package com.raeltecnologia.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raeltecnologia.hrpayroll.entities.Payment;
import com.raeltecnologia.hrpayroll.entities.Worker;
import com.raeltecnologia.hrpayroll.feignclients.WorkerFeignClients;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClients workerFeignClients;

	public Payment getPayment(long workerId, int days) {

		Worker worker = workerFeignClients.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);

	}

}
