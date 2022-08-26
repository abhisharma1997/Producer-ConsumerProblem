package com.learning.pcproblem.thread;

import com.learning.pcproblem.pojo.Company;

public class ConsumerThread extends Thread{
    Company company ;

    public ConsumerThread(Company c){
        company=c;
    }

    public void run(){
        int n=1;
        do{
            try {
                company.consumeItem();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while(n<20);



    }
}
