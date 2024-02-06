package Code.Patterns;

import java.util.Scanner;


public class Pattern{
    /* 
     * reference - https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
    */
    public static void pattern1(int n){
    /*
     *  Example 1:
        Input: N = 3
        Output: 
        * * *
        * * *
        * * *


        Example 2:
        Input: N = 6
        Output:
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
     */
        System.out.println("Pattern-1: Rectangular Star Pattern");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern2(int n){
    /*
        Input Format: N = 3
        Result: 
        * 
        * * 
        * * *
        
        Input Format: N = 6
        Result:
        * 
        * * 
        * * *
        * * * *
        * * * * *
        * * * * * *
     */
        System.out.println("Pattern-2: Right-Angled Triangle Pattern");
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern3(int n){
    /*
        Input Format: N = 3
        Result: 
        1
        1 2 
        1 2 3
        
        Input Format: N = 6
        Result:
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
    */
        System.out.println("Pattern – 3: Right-Angled Number Pyramid");
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern4(int n){
    /*
        Input Format: N = 3
        Result: 
        1
        2 2 
        3 3 3
        
        Input Format: N = 6
        Result:
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        6 6 6 6 6 6
    */
        System.out.println("Pattern – 4: Right-Angled Number Pyramid – II");
        for(int i = 0; i < n ; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern5(int n){
    /*
        Input Format: N = 3
        Result: 
        * * *
        * * 
        *
        
        Input Format: N = 6
        Result:
        * * * * * *
        * * * * * 
        * * * * 
        * * * 
        * * 
        * 
     */
        System.out.println("Pattern-5: Inverted Right Pyramid");
        for(int i = n-1; i >= 0; i--){
            for(int j = i; j >=0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern6(int n){
    /*
        Input Format: N = 3
        Result: 
        1 2 3
        1 2
        1
        
        Input Format: N = 6
        Result:
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2 
        1
     */
        System.out.println("Pattern – 6: Inverted Numbered Right Pyramid");
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern7(int n){
    /*
        Input Format: N = 3
        Result: 
          *  
         *** 
        *****   
        Input Format: N = 6
        Result:
             *     
            ***    
           *****   
          *******  
         ********* 
        ***********
     */
        System.out.println("Pattern – 7: Star Pyramid");
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < 2*i+1 ; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern8(int n){
    /*
        Input Format: N = 3
        Result: 
        *****  
         ***
          *   
        Input Format: N = 6
        Result:     
        ***********
         *********
          *******
           ***** 
            ***    
             *
     */
        System.out.println("Pattern – 8: Inverted Star Pyramid");
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < 2*n - (2*i+1) ; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern9(int n){
    /*
        Input Format: N = 3
        Result: 
          *  
         ***
        ***** 
        *****  
         ***
          *   
        Input Format: N = 6
        Result:   
             *
            ***
           ***** 
          *******
         *********
        ***********  
        ***********
         *********
          *******
           ***** 
            ***    
             *
     */
        System.out.println("Pattern – 9: Diamond Star Pattern");
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < 2*i+1 ; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < 2*n - (2*i+1) ; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern10(int n){
    /*
        Input Format: N = 3
        Result: 
          *  
          **
          ***  
          **
          *   
        Input Format: N = 6
        Result:   
             *
             **
             *** 
             ****
             *****
             ******  
             *****
             ****
             ***    
             **
             *
    */
    System.out.println("Pattern – 10: Half Diamond Star Pattern");
    for(int i = 0; i < 2*n; i++){
        int stars = i+1;
        if(i>n){
            stars = 2*n-i+1;
        }
        for(int j = 0; j < stars-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
    }
    public static void pattern11(int n){
    /* 
        Input Format: N = 3
        Result: 
        1
        01
        101

        Input Format: N = 6
        Result:   
        1
        01
        101
        0101
        10101
        010101
    */
        System.out.println("Pattern – 11: Binary Number Triangle Pattern");
        int start = 1;
        for(int i = 0; i < n; i++){
            if(i%2==0) start = 1;
            else start = 0;
            for(int j = 0; j <= i ;j++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }   
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        pattern1(i);
        pattern2(i);
        pattern3(i);
        pattern4(i);
        pattern5(i);
        pattern6(i);
        pattern7(i);
        pattern8(i);
        pattern9(i);
        pattern10(i);
        pattern11(i);

        sc.close();
    }
}


