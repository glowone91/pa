import tester.*;

public class DesignRecipeExamples{
    //problem 1 
    int volume(int length, int width, int height){
    return length * width * height; 
    }

    //problem 2 
    int quadracticequation(int a, int b, int c, int x){
        return (a *(x * x)) + (b * x) + c; 
    }

    //problem 3, this method takes any given amount of Euros (European currency), and converts and returns
    // it to the amount that it would be in US dollars
    double eurotousd(double euro){
        return euro * 1.0950199;
    }

    //problem 4, this method takes any given amount of hours and minutes, and outputs the total number of minutes 
    int totalminutes(int hours, int minutes){ 
        return (hours * 60) + minutes; 
    }


    public static void main(String[] args) {
        DesignRecipeExamples dre = new DesignRecipeExamples(); 

        //Problem 1 Example 1: volume of a cuboid with dimensions 5x5x5, expected value 125 
        int volumecuboid1 = dre.volume(5, 5, 5); 
        System.out.println("Volume1: " + volumecuboid1); 
        //Problem 1 Example 2: volume of a cuboid with dimensions 3*5*7, expected value 105 
        int volumecuboid2 = dre.volume(3, 5, 7); 
        System.out.println("Volume2: " + volumecuboid2); 
        
        //Problem 2 Example 1: quadratic equation with a = 1, b = 2, c = 1, x = 1, expected value 4
        int quadraticsolution1 = dre.quadracticequation(1, 2, 1, 1); 
        System.out.println("Quadratic Solution 1: " + quadraticsolution1); 
        //Problem 2 Example 2: quadratic equation with a = 2, b = 3, c = 1, x = 2, expected value 15
        int quadraticsolution2 = dre.quadracticequation(2, 3, 1, 2);
        System.out.println("Quadratic Solution 2: " + quadraticsolution2); 

        //Problem 3 Example 1: conversion of 10 euros, expected value 10.950199000000001 - no difference from converter I used 
        // compared to expected value given 
        double eurotousd1 = dre.eurotousd(10);
        System.out.println("Euro conversion 1: " + eurotousd1); 

        //Problem 3 Example 2: conversion of 4529 euros, expected value 4959.3451271 - no difference from converter I used 
        // compared to expected value given 
        double eurotousd2 = dre.eurotousd(4529); 
        System.out.println("Euro conversion 2: " + eurotousd2); 

        //Problem 4 Example trying to make incorrect output 1: attempted to produce an incorrect output by incorporating a negative number for the hours 
        //though I feel like this is a matter of perspective, -20 minutes don't exist in my opinion since you can't take away 
        //time but there might be use cases where a negative time number is the expected output 
        //hence, I can produce a correct and an incorrect output that run with the given method 
        int totalminutes1 = dre.totalminutes(-1, 40); 
        System.out.println("Totalminutes 1: " + totalminutes1); 

        //Problem 4 Example 2: 30 hours and 5 minutes as input, expected value 1805
        int totalminutes2 = dre.totalminutes(30, 5); 
        System.out.println("Totalminutes 2: " + totalminutes2); 

        //Problem 4 Example 3: 0 hours and 1000 minuts as input, expected value 1000 
        int totalminutes3 = dre.totalminutes(0, 1000); 
        System.out.println("Totalminutes 3: " + totalminutes3); 

    }

}


