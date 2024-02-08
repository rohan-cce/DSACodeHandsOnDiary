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
    public static void pattern12(int n){
    /*
        Input Format: N = 3
        Result: 
        1    1
        12  21
        123321
        
        Input Format: N = 6
        Result:   
        1          1
        12        21
        12       321
        1234    4321
        12345  54321
        123456654321
    */
        System.out.println("Pattern – 12: Number Crown Pattern");
        int spaces = 2*(n-1)-1;
        for(int i = 0; i < n; i++){
            //numbers
            for(int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            //spaces
            for(int j = 0; j <= spaces; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j = i+1; j > 0; j--){
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;
        }
        System.out.println();
    }
    public static void pattern13(int n){
    /*
        Input Format: N = 3
        Result: 
        1
        2 3
        4 5 6
        
        Input Format: N = 6
        Result:   
        1
        2  3
        4  5  6
        7  8  9  10
        11  12  13  14  15
        16  17  18  19  20  21
    */
        System.out.println("Pattern – 13: Increasing Number Triangle Pattern");
        int value = 1;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(value+" ");
                value ++;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern14(int n){
    /*
        Input Format: N = 3
        Result: 
        A
        A B
        A B C
        
        Input Format: N = 6
        Result:   
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
     */
        System.out.println("Pattern-14: Increasing Letter Triangle Pattern");
        for(int i = 0; i < n; i++){
            for(char ch = 'A' ; ch <= 'A'+i ; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern15(int n){
    /*
        Input Format: N = 3
        Result: 
        A B C
        A B
        A
        
        Input Format: N = 6
        Result:   
        A B C D E F
        A B C D E 
        A B C D
        A B C
        A B
        A
     */
        System.out.println("Pattern-15: Reverse Letter Triangle Pattern");
        for(int i = 0; i < n; i++){
            for(char ch = 'A'; ch < 'A'+(n-i); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern16(int n){
    /*
        Input Format: N = 3
        Result: 
        A
        B B
        C C C
        
        Input Format: N = 6
        Result:   
        A 
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
     */
        System.out.println("Pattern – 16: Alpha-Ramp Pattern");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print((char) ((int) 'A' + i - 1) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern17(int n){
    /*
        Input Format: N = 3
        Result: 
          A  
         ABA 
        ABCBA
        2,1,2
        1,3,1
        0,5,0
        
        Input Format: N = 6
        Result:   
             A     
            ABA    
           ABCBA   
          ABCDCBA  
         ABCDEDCBA 
        ABCDEFEDCBA
    */
        System.out.println("Pattern – 17: Alpha-Hill Pattern");
        for(int i = 0; i < n; i++){

            //space
            for(int j = 0; j < n-i-1 ; j++){
                System.out.print(" ");
            }

            //alphabet
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j = 0; j < 2*i+1; j++){
                System.out.print(ch);
                if(j<breakpoint) ch++;
                else ch--;
            }

            //space
            for(int j = 0; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern18(int n){
    /*
        Input Format: N = 3
        Result: 
        C
        B C
        A B C
        
        Input Format: N = 6
        Result:   
        F
        E F
        D E F
        C D E F
        B C D E F
        A B C D E F
     */
        System.out.println("Pattern-18: Alpha-Triangle Pattern");
        for(int i = 0; i < n; i++){
            for(char ch = (char)((int)'A'+(n-i)-1); ch <= 'A'+ n - 1 ; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern19(int n){
    /*
        Input Format: N = 3
        Result: 
        ******
        **  **
        *    *
        *    *
        **  **
        ******
        
        Input Format: N = 6
        Result:   
        ************
        *****  *****
        ****    ****
        ***      ***
        **        **
        *          *
        *          *
        **        **
        ***      ***
        ****    ****
        *****  *****
        ************
     */
        System.out.println("Pattern-19: Symmetric-Void Pattern");
        int intialSpaces = 0;
        for(int i = 0; i < n; i++){
            //stars
            for(int j = 0; j < (n-i); j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j < intialSpaces; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 0; j < (n-i); j++){
                System.out.print("*");
            }
            intialSpaces+=2;
            System.out.println();
        }
        intialSpaces = 2*n-2;
        for(int i = 0; i < n; i++){
            //stars
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j < intialSpaces ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            intialSpaces-=2;
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern20(int n){
    /*
        Input Format: N = 3
        Result: 
        *    *
        **  **
        ******
        **  **
        *    *
        
        
        Input Format: N = 6
        Result:   
        *          *
        **        **
        ***      ***
        ****    ****
        *****  *****
        ************
        *****  *****
        ****    ****
        ***      ***
        **        **
        *          *
     */
        System.out.println("Pattern – 20: Symmetric-Butterfly Pattern");
        int spaces = 2*n;
        for(int i = 0; i < 2*n; i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
        
            //stars
            for(int j = 0; j < stars ; j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 0; j < stars ; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces-=2;
            else spaces+=2;
        }
        System.out.println();
    }
    public static void pattern21(int n){
    /*
        Input Format: N = 3
        Result: 
        ***
        * *
        ***
        
        Input Format: N = 6
        Result:   
        ******
        *    *
        *    *
        *    *
        *    *
        ******
     */
        System.out.println("Pattern – 21: Hollow Rectangle Pattern");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern22(int n){
    /*
        Input Format: N = 3
        Result: 
        3 3 3 3 3 
        3 2 2 2 3 
        3 2 1 2 3 
        3 2 2 2 3 
        3 3 3 3 3
        
        Input Format: N = 6
        Result:   
        6 6 6 6 6 6 6 6 6 6 6 
        6 5 5 5 5 5 5 5 5 5 6 
        6 5 4 4 4 4 4 4 4 5 6 
        6 5 4 3 3 3 3 3 4 5 6 
        6 5 4 3 2 2 2 3 4 5 6 
        6 5 4 3 2 1 2 3 4 5 6 
        6 5 4 3 2 2 2 3 4 5 6 
        6 5 4 3 3 3 3 3 4 5 6 
        6 5 4 4 4 4 4 4 4 5 6 
        6 5 5 5 5 5 5 5 5 5 6 
        6 6 6 6 6 6 6 6 6 6 6
    */
        System.out.println("Pattern – 22: The Number Pattern");
        for(int i = 0; i < 2*n-1 ; i++){
            for(int j = 0; j< 2*n-1 ; j++){
                int top = i;
                int bottom = j; 
                int right = (2*n-2)-j;
                int left = (2*n-2)-i;
                System.out.print(n-Math.min(
                                        Math.min(top, bottom),
                                        Math.min(left, right)
                                    ));
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
        pattern12(i);
        pattern13(i);
        pattern14(i);
        pattern15(i);
        pattern16(i);
        pattern17(i);
        pattern18(i);
        pattern19(i);
        pattern20(i);
        pattern21(i);
        pattern22(i);
        sc.close();
    }
}


