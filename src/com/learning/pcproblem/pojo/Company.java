package com.learning.pcproblem.pojo;

public class Company {
    int item = 0;
    Boolean f=false;
    //f-> false , chance for producer
    //f-> true , chance for consumer
    synchronized public void produceItem(int n) throws InterruptedException {
        if(f){
            wait();
        }

        System.out.println("Produced:"+n);
        f = true;
        this.item = n;
        notify();
    }

    synchronized public void consumeItem() throws InterruptedException {
        if(!f){
            wait();
        }

        System.out.println("Consumed Thread:"+this.item);
        f=false;
        notify();
    }
}
