package OOPS.examples;

import DSA.main;

class Account{
    String name;
    int acc_no;
    float amount;
    void insert_data(String n,int a, float s){
        name=n;
        acc_no=a;
        amount=s;
    }
    void deposit(float am){
        amount+=am;
        System.out.println(amount+"deposited");
    }
    void withdraw(float withdraw){
        if(withdraw<amount){
            amount=amount-withdraw;
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    void checkbalance(){
        System.out.println("Your current balance is:"+amount);
    }  
}

class SBI{
    public static void main(String[] args) {
    Account a=new Account();
    a.insert_data("bala",123456789,9000);
    a.checkbalance();
    a.withdraw(1000);
    a.deposit(2000);
    a.checkbalance();
}
}