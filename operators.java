import java.util.*;
// // class basic
// // {
// //     public static void main(String[] args)
// //     {
// //         // System.out.println(5>>1);
//         // System.out.println(5<<1);
//         // Scanner sc=new Scanner(System.in);
//         // int a=sc.nextInt();
//         // String ter=(a%7==0)?"yes,multiple of 7":"no not multiple of 7";
//         // System.out.println(ter);
//         // int a=5,b=8,c=3,d=4;
//         // int max=(5>8)?5:(8>3)?8:(3>4)?3:4;
//         // System.out.println(max);
//         // int a=3,b=4;
//         // a=a+b;
//         // b=a-b;
//         // a=a-b;
//         // System.ou.println(a+" "b);
//         // System.out.println((5>3)&&(2>1));
//         // System.out.println((3>5)||(2>1));
//         // System.out.println(5&1);
//         // System.out.println((5<3)&&(2>1));
//         // System.out.println((3>5)|   |(2<1));
//         // System.out.println(5&10);
//         // int a=20,b=30;
//         // System.out.println(a++ > b-- && ++a > b++);
//         // System.out.println(a);
//         // System.out.println(b);
//         // int mobile=1000;
//         // switch(mobile){
//         //     case 10000:System.out.println("10000"); break;
//         //     case 20000:System.out.println("20000");break;
//         //     case 60000:System.out.println("60000");break;
//         //     default:System.out.println("default");
//         // }
//         // Scanner sc=new Scanner(System.in);
//         // int a=sc.nextInt();
//         // int b=sc.nextInt();
//         // String bit=sc.next();
//         // switch(bit)
//         // {
//         //     case "AND":System.out.println(a&b); break;
//         //     case "OR":System.out.println(a|b);break;
//         //     case "XOR":System.out.println(a^b);break;
//         //     case "NAND":System.out.println(~(a&b));break;
//         //     default:System.out.println("nothing");
//         // }
// //         Scanner sc=new Scanner(System.in);
// //         int score=sc.nextInt();
// //         char grade=(score>=90 && score<=100)?'A':(score>=80 && score<=89)?'B':(score>=70 && score<=79)?'C':(score>=60 && score<=69)?'D':'F';
// //         System.out.println(grade);
//         // Scanner sc=new Scanner(System.in);
//         //   int month=sc.nextInt();
//         //   switch(month)
//         //   {
//         //     case 1:System.out.println("january");
//         //     System.out.println("february");
//         //     System.out.println("march");
//         //     System.out.println("april");
//         //     System.out.println("may");
//         //     System.out.println("june");
//         //     System.out.println("july");
//         //     System.out.println("august");
//         //     System.out.println("september");
//         //     System.out.println("october");
//         //     System.out.println("november");
//         //     System.out.println("december");
//         //     break;

//         //     case2:
//         //     System.out.println("february");
//         //     System.out.println("march");
//         //     System.out.println("april");
//         //     System.out.println("may");
//         //     System.out.println("june");
//         //     System.out.println("july");
//         //     System.out.println("august");
//         //     System.out.println("september");
//         //     System.out.println("october");
//         //     System.out.println("november");
//         //     System.out.println("december");
//         //     break;

//         //     case3:
//         //     System.out.println("march");
//         //     System.out.println("april");
//         //     System.out.println("may");
//         //     System.out.println("june");
//         //     System.out.println("july");
//         //     System.out.println("august");
//         //     System.out.println("september");
//         //     System.out.println("october");
//         //     System.out.println("november");
//         //     System.out.println("december");
//         //     break;


//         //     case4:
//         //      System.out.println("april");
//         //     System.out.println("may");
//         //     System.out.println("june");
//         //     System.out.println("july");
//         //     System.out.println("august");
//         //     System.out.println("september");
//         //     System.out.println("october");
//         //     System.out.println("november");
//         //     System.out.println("december");
//         //     break;


//         //     case5:
//         //     System.out.println("may");
//         //     System.out.println("june");
//         //     System.out.println("july");
//         //     System.out.println("august");
//         //     System.out.println("september");
//         //     System.out.println("october");
//         //     System.out.println("november");
//         //     System.out.println("december");
//         //     break;


//         //     case6:
//         //     System.out.println("june");
//         //     System.out.println("july");
//         //     System.out.println("august");
//         //     System.out.println("september");
//         //     System.out.println("october");
//         //     System.out.println("november");
//         //     System.out.println("december");
//         //     break;

//         //     case 7:
//         //         System.out.println("july");
//         //     System.out.println("august");
//         //     System.out.println("september");
//         //     System.out.println("october");
//         //     System.out.println("november");
//         //     System.out.println("december");
//         //     break;

//         //     case8:
//         //     System.out.println("august");
//         //     System.out.println("september");
//         //     System.out.println("october");
//         //     System.out.println("november");
//         //     System.out.println("december");
//         //     break;
            
//         //     case 9:
//         //         System.out.println("september");
//         //     System.out.println("october");
//         //     System.out.println("november");
//         //     System.out.println("december");
//         //     break;


//         //     case 10:
//         //         System.out.println("october");
//         //     System.out.println("november");
//         //     System.out.println("december");
//         //     break;

//         //     case 11:
//         //         System.out.println("november");
//         //     System.out.println("december");
//         //     break;

//         //     case 12:
//         //         System.out.println("december");
//         //     break;

//         //     default:System.out.println("enter correct input");