//CLASS CREATION
// class Calculator{

//     int age = 20;

//     public int add(int n1, int n2){

//         int r = n1+n2;
//         return r;
//     }
// }

// class Mobile {

//     String brand; 
//     int price;
//     static String name = "smart";

//     //CONSTRUCTORS - Used to assign value to an instance variable instead of creating objects
//     public Mobile(){
//         brand = "Apple";
//         price = 150;

//         //But we can't have this here cause it would keep running when the constructor is clled, hence we can use a block called static
//         name = "SmartTab";
    
//     }

//     // STATIC BLOCKS - Used to assign value to a static variable 
//     static{
//         name = "SmartTab";
//     }

//     public void show(){
//         System.out.println("name : " + name + " brand : " + brand + "price : " + price);
//     }

// }

// class Human{

//     //Encapsulation
//     private int age  = 17;
//     String name = "rose" ;
//     String course;

//     // Default Constructor
//     public Human(){
//         this.age =50;
//         this.name = "Sophia";
//         System.out.println("in the object");
//     }

//     //Parameterized Constructor
//     // public Human(int a, String n){
//     //     this.age = a;
//     //     this.name = n;
//     // }

//     //Getters
//     public int getAge(){
//         return age;
//     }

//     //Setters
//     public void setAge(int age){
//     this.age = age;
//     }

//     //Setter
//   //this keyword - represents the current object the methos is declared in

//     public void setName(String name){
//         this.name = name;
//     }

//     //getter
//     public String getName(){
//         return name;
//     }
   

    
// }

//Importing all the classes at once
import tools.*;

//Manually importing all the classes
// import tools.AdvCalc;
// import tools.Calc;
// import tools.VeryAdvCalc;

class Hello {

    public static void main(String arg[]) { 
    // object creation
        Calc perform = new Calc();
        int s1 = perform.add(10, 20);
        int s2 = perform.sub(5, 10);

        System.out.println("Sum Addition : " + s1 + " and " + "Sum Subtraction : " + s2);

        // single inheritabce class object
        AdvCalc advcalc = new AdvCalc();
        int r1 = advcalc.add(3, 3);
        int r2 = advcalc.sub(20, 80);
        int r3 = advcalc.divide(11, 10);
        int r4 = advcalc.multiply(10, 0);

        System.out.println(r1 + " " +  r2 + " " + r3  + " " + r4);

        // multi level inheritance class object
        VeryAdvCalc scientific = new VeryAdvCalc();
        int t1 = scientific.add(2, 5);
        int t2 = scientific.sub(3, 4);
        int t3 = scientific.divide(10, 2);
        int t4 = scientific.multiply(10, -1);
        double t5 = scientific.power(5, 2);

        System.out.println(t1 + " " + t2 + " " + t3 + " " + t4 + " " + t5);
        //Default Constructor Initialization
        // Human person1 = new Human();


        //Parameterized Constructor Initialization
        // Human person2 = new Human(10, "Rose");
        
        // person1.getAge();

        //Anonymous Object
        // new Human();
        // person1.setAge(20);
        // person1.setName("Marv");
        // person1.age = 17;
        // person1.course = "computer science";
        // person1.name = "Rose Marvelous";

        //Printing out Default Constructor 
        // System.out.println(person1.getAge() + ":" + person1.getName());
        //  //Printing out Parameterized Constructor 
        // System.out.println(person2.getAge() + ":" + person2.getName());




//STATIC BLOCKS 
// Mobile mob1 = new Mobile();

//     mob1.brand = "Apple";
//     mob1.price = 1800;


//STATIC VARIBLES & METHODS
    // Mobile mob1 = new Mobile();

    // mob1.brand = "Apple";
    // mob1.price = 1800;
   
    // Mobile mob2 = new Mobile();
    // mob2.brand = "Samsung";
    // mob2.price = 100;

    // Mobile mob3 = new Mobile();
    // mob3.brand = "Nokia";
    // mob3.price = 400;
   

    // mob1.show();
    // mob2.show();
    // mob3.show();
     


        // Array of objects
        // Student s1 = new Student();

        // s1.name = "Rose";
        // s1.score = 20;

        // Student s2  = new Student();
        // s2.name = "Marvvy";
        // s2.score = 30;

        // Student s3 = new Student();
        // s3.name = "Happy";
        // s3.score = 40;

        // System.out.println(s1.name);

        // Student students[] = new Student[3];
        //  students[0] = s1;
        //  students[1] = s2;
        //  students[2] = s3;


        //  System.out.println(students[2].name);

        //  for(int i = 0; i < students.length; i++){
        //     System.out.println(students[i].name + " : " + students[i].score);
        //  }


         //ENHANCED FOR LOOP
        //  for(Student stu : students){
        //     System.out.println(stu.name + " : " + stu.score);
        //  }



        // int num1 = 20;
        // // num1 +=2;

        // num1 ++;
        // int num2 = 30;
        // int result = num1 + num2;

        // boolean b = true;
        // long l = 3333344l;
        // float f = 43.4f;
        // double d = 34.56;

        // char c = 'A';
        // c++;
        // System.out.println(c);
        // System.out.println(result);

        // char digit = '8';

        // System.out.println(f + d + c + digit);
        // System.out.println(b);
        // System.out.println(digit);

        // System.out.println(result);

        // System.out.println("Hello world");

        // int x = 20;
        // int y = 8;
        // int z = 20;

        // if (x>10 && y>=10 || z < 10)
        // System.out.println("Hello");
        // else{
        // System.out.println("Bye");
        // }

        // int n = 20;

        // int result = 0;

        // IF-ELSE STATEMENT
        // if(n%2==0)
        // result= 20;
        // else
        // result = 15;
        // System.out.println(result);

        // TENARY OPERATOR
        // result = n%2==0 && n>10 ? 10 : 20;

        // System.out.println(result);

        // FORMER SWITCH CASE IN JAVA
        // int n = 10;

        // switch (n) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // default:
        // System.out.println("Day Error!!");
        // break;
        // }

        // NEW SWITCH CASE IN JAVA

        // String days = "tnjn";

        // switch(days){

        // case "Monday", "Tuesday", "wednesday", "Thursday" -> System.out.println("it
        // is a work day");
        // case "friday", "saturday", "sunday" -> System.out.println("it is weekend
        // bro!!");
        // default -> System.out.println("it is not a day jare");
        // }

        // USING THE YEILD AND : iIN PLACE OF ->
        // String time = "Monday";
        // String result = " ";

        // result = switch(time){

        // case "Monday", "Tuesday", "wednesday", "Thursday" : { yield "6am";}
        // case "friday", "saturday", "sunday" : {yield "10am";}
        // default : { yield "No alarm set" ; }
        // };
        // System.out.println(result);

        // WHILE LOOP
        // int num1 = 3;
        // int num2 = 8;

        // while (num1 <= 6 && num2 < 10) {
        //     while (num1 <= 10 && num2 < 20) {
        //         num2++;
        //         System.out.println("The second number is " + num2);
        //     }
        //     num1++;
        //     System.out.println("The first number " + num1);
        // }

        //DO-WHILE LOOP
        // int num3 = 7;

        // do{

        //     System.out.println("It is even number");

        // }
        // while(num3 % 2 == 0);

        //FOR LOOP AND INNER FOR LOOP
        // for(int i=1; i <=5; i++ ){
        //     System.out.println("Day " + i );

        //     for(int j = 1; j < 9; j++){
        //     System.out.println(j + "-" + (j + 2));
        //     }
        // }

        //OBJECT AND CLASSES

        // Calculator addnums = new Calculator();

        // int result = addnums.add(20, 10);

        // System.out.println(result);

        //ARRAYS
        // int nums[] = {2, 3, 4, 5};

        // for (int n = 0; n < 4; n++){
        //    System.out.println(nums[n]);
        // }
        
        // // 2D ARRAYS
        // int ages[][] = new int[3][4];

         

        //  for(int a = 0; a < 3 ; a++)
        //     {
             
        //     for(int k = 0; k < 4; k++){
               
        //         ages[a][k] = (int)(Math.random() * 10);
        //         System.out.println(ages[a][k]);
        //     }

        //      for(int n[] : ages){
        //    for(int m : n){
        //     System.out.print(m + " ");
        //    }
        //  System.out.println();
        //  }
            
        //  }

         // JAGGED ARRAYS
        // int ages[][] = new int[3][];

        // ages[0] = new int[3];
        // ages[1] = new int[8];
        // ages[2] = new int[5];
 
        //  for(int a = 0; a < ages.length;  a++)
        //     {
             
        //     for(int k = 0; k < ages[a].length; k++){
               
        //         ages[a][k] = (int)(Math.random() * 10);
        //         System.out.println(ages[a][k]);
        //     }

        //      for(int n[] : ages){
        //    for(int m : n){
        //     System.out.print(m + " ");
        //    }
        //  System.out.println();
        //  }
            

        //  }

        //STRINGS -> when you assign value to a string a space is created in heap memory automatically

        // String name = new String("Rose Marvelous");

        // String name2 = "Imisioluwa";

        // System.out.println(" Hello " + name );
        // System.out.println(name2.charAt(3));
        // System.out.println(name.codePointAt(3));
        // System.out.println(name.codePointBefore(3));
        // System.out.println(name2.compareTo(name));
        // System.out.println(name.compareToIgnoreCase("Yes"));
        // System.out.println(name.concat(" is a girl"));
        // System.out.println(name.contains("Ro"));
        // System.out.println(name.contentEquals(name2));
        // System.out.println(name.endsWith("s"));
        // System.out.println(name.equals(name2));
        // System.out.println(name2.hashCode());
        // System.out.println(name2.indexOf("o"));
        // System.out.println(name2.isBlank());
       
        
        //STRING BUFFER

        // StringBuffer sb = new StringBuffer("Rose Marvelous");
        // System.out.println(sb.capacity());
        // System.out.println(sb.charAt(9));
        // System.out.println(sb.length());
        // System.out.println(sb.substring(3, 9));
        // System.out.println(sb.append(2.555f));

        // // STRING BUILDER
        // StringBuilder stringbuild = new StringBuilder("rose") ;

        // System.out.println(stringbuild.capacity());




        

    }

}