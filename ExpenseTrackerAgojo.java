{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Scanner;\
\
public class ExpenseTrackerAgojo \{\
\
    public static void displayTitle() \{\
        System.out.println("=====================================");\
        System.out.println("      PERSONAL EXPENSE TRACKER       ");\
        System.out.println("=====================================");\
    \}\
\
    public static double calculateTotal(double food, double transport, double other, double entertainment) \{\
        return food + transport + other + entertainment;\
    \}\
\
    public static String checkBudget(double totalExpense, double budget) \{\
        if (totalExpense > budget) \{\
            return "WARNING!! You have EXCEEDED your budget!";\
        \} else if (totalExpense == budget) \{\
            return "OKAY!! You have EXACTLY met your budget.";\
        \} else \{\
            return "NICE ONE!! You are WITHIN your budget.";\
        \}\
    \}\
\
    public static void displayResults(double totalExpense, double budget, double remaining, String status) \{\
        System.out.println("\\n========= EXPENSE SUMMARY =========");\
        System.out.println("Total Expenses: Php" + totalExpense);\
        System.out.println("Budget: Php" + budget);\
        System.out.println("Remaining Budget: Php" + remaining);\
        System.out.println("Status: " + status);\
        System.out.println("===================================");\
    \}\
\
    public static void main(String[] args) \{\
        Scanner input = new Scanner(System.in);\
\
        displayTitle();\
\
        System.out.print("Enter your name: ");\
        String name = input.nextLine();\
\
        System.out.print("Enter your budget: ");\
        double budget = input.nextDouble();\
\
        System.out.print("Enter food expense: ");\
        double food = input.nextDouble();\
\
        System.out.print("Enter transportation expense: ");\
        double transport = input.nextDouble();\
\
        System.out.print("Enter other expenses: ");\
        double other = input.nextDouble();\
\
        System.out.print("Enter entertainment expense: ");\
        double entertainment = input.nextDouble();\
\
        double total = calculateTotal(food, transport, other, entertainment);\
        String status = checkBudget(total, budget);\
\
        double remaining = budget - total;\
\
        System.out.println("\\nHello, " + name + "! Here's your expense report:");\
\
        displayResults(total, budget, remaining, status);\
\
        input.close();\
    \}\
\}}