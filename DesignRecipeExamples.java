import tester.*;

    class DesignRecipesExamples {

    // Problem 1: Calculate the volume of a cuboid
    int volume(int length, int width, int height){
        return length * width * height; 
    }

    // Problem 2: Solve a quadratic equation
    int quadracticequation(int a, int b, int c, int x){
        return (a * (x * x)) + (b * x) + c; 
    }

    // Problem 3: Convert Euros to US dollars
    double eurotousd(double euro){
        return euro * 1.0950199;
    }

    // Problem 4: Convert hours and minutes to total minutes
    int totalminutes(int hours, int minutes){ 
        return (hours * 60) + minutes; 
    }

    // Test cases
    //Problem 1 
    int volumecuboid1 = this.volume(5, 5, 5); // expected 125
    int volumecuboid2 = this.volume(3, 5, 7); // expected 105
    //Problem 2 
    int quadraticsolution1 = this.quadracticequation(1, 2, 1, 1); // expected 4
    int quadraticsolution2 = this.quadracticequation(2, 3, 1, 2); // expected 15
    //Problem 3 
    double eurotousd1 = this.eurotousd(10); // expected 10.950199000000001
    double eurotousd2 = this.eurotousd(4529); // expected 4959.3451271
    
    //Problem 4 Example trying to make incorrect output: attempted to produce an incorrect output by incorporating a negative number for the hours 
    //though I feel like this is a matter of perspective, -20 minutes don't exist in my opinion since you can't take away 
    //time but there might be use cases where a negative time number is the expected output 
    //hence, I can produce a correct and an incorrect output that run with the given method 
    int totalminutes1 = this.totalminutes(-1, 40); // expected -20
    int totalminutes2 = this.totalminutes(30, 5); // expected 1805
    int totalminutes3 = this.totalminutes(0, 1000); // expected 1000
}
