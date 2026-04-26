{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Scanner;\
\
public class SecureATMSystemAgojo \{\
    public static void main(String[] args) \{\
        Scanner sc = new Scanner(System.in);\
\
        String correctPin = "Agojo1234";\
        String enteredPin;\
        int attempts = 0;\
        boolean accessGranted = false;\
\
        while (attempts < 3) \{\
            System.out.print("Enter PIN: ");\
            enteredPin = sc.nextLine();\
\
            if (enteredPin.equals(correctPin)) \{\
                accessGranted = true;\
                break;\
            \} else \{\
                attempts++;\
                System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));\
            \}\
        \}\
\
        if (!accessGranted) \{\
            System.out.println("Account Locked");\
            return;\
        \}\
\
        double balance = 5000;\
        int choice;\
        int transactionCount = 0;\
\
        do \{\
            System.out.println("\\n===== ATM MENU =====");\
            System.out.println("1. Check Balance");\
            System.out.println("2. Deposit");\
            System.out.println("3. Withdraw");\
            System.out.println("4. Exit");\
            System.out.print("Choose an option: ");\
            choice = sc.nextInt();\
\
            switch (choice) \{\
                case 1:\
                    System.out.println("Current Balance: " + balance);\
                    transactionCount++;\
                    break;\
\
                case 2:\
                    System.out.print("Enter deposit amount: ");\
                    double deposit = sc.nextDouble();\
\
                    if (deposit > 0) \{\
                        balance += deposit;\
                        System.out.println("Deposit successful.");\
                        transactionCount++;\
                    \} else \{\
                        System.out.println("Invalid deposit amount.");\
                    \}\
                    break;\
\
                case 3:\
                    System.out.print("Enter withdrawal amount (Max 2000): ");\
                    double withdraw = sc.nextDouble();\
\
                    if (withdraw > 0) \{\
                        if (withdraw <= 2000) \{\
                            if (withdraw <= balance) \{\
                                balance -= withdraw;\
                                System.out.println("Withdrawal successful.");\
                                transactionCount++;\
                            \} else \{\
                                System.out.println("Insufficient balance.");\
                            \}\
                        \} else \{\
                            System.out.println("Withdrawal exceeds 2000 limit.");\
                        \}\
                    \} else \{\
                        System.out.println("Invalid withdrawal amount.");\
                    \}\
                    break;\
\
                case 4:\
                    System.out.println("Thank you for using the ATM.");\
                    break;\
\
                default:\
                    System.out.println("Invalid choice.");\
            \}\
\
        \} while (choice != 4);\
\
        System.out.println("Total Transactions: " + transactionCount);\
        sc.close();\
    \}\
\}\
}