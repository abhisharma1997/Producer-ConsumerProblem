package com.learning.pcproblem;

import com.learning.pcproblem.pojo.Company;
import com.learning.pcproblem.thread.ConsumerThread;
import com.learning.pcproblem.thread.ProducerThread;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Company company = new Company();
        ProducerThread producerThread = new ProducerThread(company);
        ConsumerThread consumerThread =  new ConsumerThread(company);

        producerThread.start();
        consumerThread.start();



    }
}
