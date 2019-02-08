package com.company;

public class Main
    
    {
    
        public static void main ( String[] args )
            {
                int num = 0;
            
                System.out.println ( "Count up by 10." );
            
                while ( num <= 10 ) {
                    System.out.println ( num * 10 );
                    num++;
                }
            
                num = 10;
            
                System.out.println ( "\n Count down by 10." );
            
                while ( num >= 0 ) {
                    System.out.println ( num * 10 );
                    num--;
                }
            }
    }