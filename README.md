# Producer-ConsumerProblem
Producer-Consumer Problem
(Synchronized,interTHread communication)

This is a well know problem with Multi THreading

It occurs when there are multiple threads runnin in our system with some specific task which are dependent to each other. Then we get this problem

ForExample -> we are producing item and that item should be consumed by other thread. And also produced item should be cosumed. If item is getting produced in each sec and Consumer can only consume after 2 sec. then it lead to this problem because items are getting produced more than they are getting consumed

To resolve this, we use synchronization and inter thread communication to let thread know whether they are ready to perform their task
