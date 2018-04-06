package RecursivePuzzels;

import java.util.Scanner;

public class SmallestElementInArray {
public static void main(String []args){
System.out.println("Enter 4 integers to find out the minimum integer- ");
Scanner s= new Scanner(System.in);
int f= s.nextInt();
int g= s.nextInt();
int h= s.nextInt();
int i= s.nextInt();
int a[]={f,g,h,i};
int n=0;
 if (a[n]<a[1] && a[n]<a[2] && a[n]<a[3]){
 
 System.out.print("smallest integer is " + a[n]); 

 }
 else if(a[1]<a[0] && a[1]<a[2] && a[1]<a[3]){
 System.out.print("smallest integer is " + a[1]);
 }
 else if(a[2]<a[1] && a[2]<a[0] && a[2]<a[3]){
 System.out.print("smallest integer is " + a[2]);
 }
 else if(a[3]<a[1] && a[3]<a[0] && a[3]<a[1]){
 System.out.print("smallest integer is " + a[3]);
 }
}
}
