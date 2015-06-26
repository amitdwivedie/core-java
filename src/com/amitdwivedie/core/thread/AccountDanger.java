package com.amitdwivedie.core.thread;

/**
 * @author Amit Dwivedi
 *
 */
public class AccountDanger implements Runnable {

    private Account account = new Account();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeWithdrawal(10);
        }
    }

    private synchronized void makeWithdrawal(int amt) {
        if (account.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completed the withdrawal");
        } else {
            System.out.println("Not enough balance in account for " + Thread.currentThread().getName()
                    + " to withdraw " + amt);
        }
    }

    public static void main(String[] args) {

        AccountDanger accountDanger = new AccountDanger();
        Thread fredo = new Thread(accountDanger, "Fredo");
        Thread lucy = new Thread(accountDanger, "Lucy");

        fredo.start();
        lucy.start();
    }

}

class Account {

    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;

    }
}
