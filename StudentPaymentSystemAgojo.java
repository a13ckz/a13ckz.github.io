{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Scanner;\
\
public class StudentPaymentSystemAgojo \{\
    public static void main(String[] args) \{\
\
        Scanner sc = new Scanner(System.in);\
\
        System.out.print("Enter Student Name: ");\
        String studentName = sc.nextLine();\
\
        System.out.print("Enter Student ID: ");\
        String studentID = sc.nextLine();\
\
        System.out.print("Enter Total Tuition Fee: ");\
        double totalTuition = sc.nextDouble();\
\
        double balance = totalTuition;\
        int transactions = 0;\
        boolean discountApplied = false;\
\
        int choice;\
\
        do \{\
            System.out.println("\\n===== PAYMENT MENU =====");\
            System.out.println("1. Pay Tuition");\
            System.out.println("2. Check Balance");\
            System.out.println("3. Apply Discount");\
            System.out.println("4. Exit");\
            System.out.print("Enter choice: ");\
            choice = sc.nextInt();\
\
            switch (choice) \{\
\
                case 1: \
                    if (balance == 0) \{\
                        System.out.println("No remaining balance.");\
                        break;\
                    \}\
\
                    System.out.print("Enter payment amount: ");\
                    double payment = sc.nextDouble();\
\
                    if (payment <= 0) \{\
                        System.out.println("Invalid Payment.");\
                    \} else \{\
                        if (payment > balance) \{\
                            System.out.println("Invalid Payment");\
                        \} else \{\
                            balance -= payment;\
                            transactions++;\
                            System.out.println("Payment successful!");\
                        \}\
                    \}\
                    break;\
\
                case 2: \
                    if (balance == 0) \{\
                        System.out.println("No remaining balance.");\
                    \} else \{\
                        System.out.println("Remaining Balance: " + balance);\
                    \}\
                    transactions++;\
                    break;\
\
                case 3: \
                    if (discountApplied) \{\
                        System.out.println("Discount already applied.");\
                    \} else \{\
                        System.out.println("Are you a:");\
                        System.out.println("1. Regular Student");\
                        System.out.println("2. Scholar");\
                        System.out.print("Enter choice: ");\
                        int type = sc.nextInt();\
\
                        if (type == 2) \{\
                            double discount = balance * 0.20;\
                            balance -= discount;\
                            discountApplied = true;\
                            transactions++;\
                            System.out.println("20% discount applied!");\
                        \} else if (type == 1) \{\
                            System.out.println("No discount applied.");\
                            discountApplied = true;\
                            transactions++;\
                        \} else \{\
                            System.out.println("Invalid choice.");\
                        \}\
                    \}\
                    break;\
\
                case 4: \
                    System.out.println("\\n===== FINAL SUMMARY =====");\
                    System.out.println("Student Name: " + studentName);\
                    System.out.println("Total Transactions: " + transactions);\
                    System.out.println("Final Balance: " + balance);\
                    System.out.println("Program Ended.");\
                    break;\
\
                default:\
                    System.out.println("Invalid choice. Try again.");\
            \}\
\
        \} while (choice != 4);\
\
        sc.close();\
    \}\
\}}