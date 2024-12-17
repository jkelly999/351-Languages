/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

public class MyClass {
  public static void main(String args[]) {
    
    //declaration of more than three data types
    
    int x = 999;
    double y = 99.9;
    boolean TorF = true;
    String[] Lineup = {"Hellcat", "392ScatPack", "RT"};
    String middle = " is too ";
    int a = 99;
    int b = 99;
    
    //printing of three different data types
    
    System.out.println("Integer: " + x);
    System.out.println("Double: " + y);
    System.out.println("Boolean: " + TorF);
    
    //while loop w/ break
    
    int i = 0;
    
    while(i < 5){
        if(i == 4){
            break;
        }
        System.out.println(i);
        i++;
    }
    
    //for loop w/ continue
    
    for(int count = 0; count < 5; count++){
        if(count == 3){
            continue;
        }
        System.out.println("Not Immutable");
        i++;
    }
    
    //do while loop
    
    int count2 = 0;
    
    do{
        
        System.out.println("I have a OS midterm on Monday and I'm Scared!");
        count2++;
        
    }while(count2 <= 5);
    
    
    //Enhanced for loop
    
    for(String Dodge : Lineup){
        System.out.println(Dodge);
    }
    
    //string concatenation
    
    System.out.println("System.out.println" + middle + "long for my liking.");
    
    
    //printing of function result
    
    int answer = sum(a,b);
    System.out.println(answer);
    
  }
  
  //multi paramater function
  
  public static int sum(int a, int b){
      return a + b;
  }
}