import tester.*;

public class DesignRecipesExamples{
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

        //Problem 1 Example 1: volume of a cuboid with dimensions 5x5x5, expected value 125 
        int volumecuboid1 = volume(5, 5, 5); 

        //Problem 1 Example 2: volume of a cuboid with dimensions 3*5*7, expected value 105 
        int volumecuboid2 = volume(3, 5, 7); 
        
        //Problem 2 Example 1: quadratic equation with a = 1, b = 2, c = 1, x = 1, expected value 4
        int quadraticsolution1 = quadracticequation(1, 2, 1, 1); 

        //Problem 2 Example 2: quadratic equation with a = 2, b = 3, c = 1, x = 2, expected value 15
        int quadraticsolution2 = quadracticequation(2, 3, 1, 2);

        //Problem 3 Example 1: conversion of 10 euros, expected value 10.950199000000001 - no difference from converter I used 
        // compared to expected value given 
        double eurotousd1 = eurotousd(10);

        //Problem 3 Example 2: conversion of 4529 euros, expected value 4959.3451271 - no difference from converter I used 
        // compared to expected value given 
        double eurotousd2 = eurotousd(4529); 

        //Problem 4 Example trying to make incorrect output 1: attempted to produce an incorrect output by incorporating a negative number for the hours 
        //though I feel like this is a matter of perspective, -20 minutes don't exist in my opinion since you can't take away 
        //time but there might be use cases where a negative time number is the expected output 
        //hence, I can produce a correct and an incorrect output that run with the given method 
        int totalminutes1 = totalminutes(-1, 40);  

        //Problem 4 Example 2: 30 hours and 5 minutes as input, expected value 1805
        int totalminutes2 = totalminutes(30, 5); 

        //Problem 4 Example 3: 0 hours and 1000 minuts as input, expected value 1000 
        int totalminutes3 = totalminutes(0, 1000);  

}
