//CLASS CREATION
class Calculator{

    public int add(int n1, int n2){

        int r = n1+n2;
        return r;
    }
}



class Hello {

    public static void main(String arg[]) {

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

        String name = new String("Rose Marvelous");

        String name2 = "Imisioluwa";

        System.out.println(" Hello " + name );
        System.out.println(name2.charAt(3));
        System.out.println(name.codePointAt(3));
        System.out.println(name.codePointBefore(3));
        System.out.println(name2.compareTo(name));
        System.out.println(name.compareToIgnoreCase("Yes"));
        System.out.println(name.concat(" is a girl"));
        System.out.println(name.contains("Ro"));
        System.out.println(name.contentEquals(name2));
        System.out.println(name.endsWith("s"));
        System.out.println(name.equals(name2));
        System.out.println(name2.hashCode());
        System.out.println(name2.indexOf("o"));
        System.out.println(name2.isBlank());
       
        
        StringBuffer sb = new StringBuffer("Rose Marvelous");

        System.out.println(sb.capacity());
        System.out.println(sb.charAt(9));
        System.out.println(sb.length());
        System.out.println(sb.substring(3, 9));
        System.out.println(sb.append(2.555f));


    }

}