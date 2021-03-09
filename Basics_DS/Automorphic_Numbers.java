//An automorphic number is a number in which the last 
//digits of the square of the number is equal to the number itself.
//Ex :- 5 square 25 last no is 5 in the square
//ex :- 25 sqaure is 625 in which last two digit is 25


import java.util.*;

public class Automorphic_Numbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to be tested: ");
    int num=sc.nextInt();
    int temp = num;
    int square = num*num;
    int flag=0;
    while(num>0){
        if(num%10!=square%10){
            flag=1; break;}
        num=num/10;
        square=square/10;
    }
    if(flag==1)
        System.out.println("Not automorphic");
    else
        System.out.println("Automorphic Number");
}
}
