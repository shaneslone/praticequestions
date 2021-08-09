package com.infostretch;

import com.infostretch.Dev.DevQuestions;
import com.infostretch.QA.QAQuestions;

/**
 * REFER TO README FOR INFORMATION ON HOW TO UTILIZE THIS PROGRAM
 */
public class App 
{
    public static void main(String[] args )
    {
        System.out.println("\033[1;31m\nRUN QA QUESTIONS\n");
        QAQuestions.run();

        System.out.println("\033[1;31m\nRUN DEV QUESTIONS\n");
        DevQuestions.run();
    }
}
