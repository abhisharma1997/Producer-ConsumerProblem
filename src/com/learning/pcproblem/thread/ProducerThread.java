package com.learning.pcproblem.thread;

import com.learning.pcproblem.ProducerConsumerDemo;
import com.learning.pcproblem.pojo.Company;

public class ProducerThread extends Thread{

    Company company ;

    public ProducerThread(Company c){
        company=c;
    }

    public void run(){
        int n=1;
        do{
            try {
                company.produceItem(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while(n<=20);


    }
}
