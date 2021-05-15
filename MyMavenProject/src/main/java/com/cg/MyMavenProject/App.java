package com.cg.MyMavenProject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	System.out.println( "Hello World!" );
         
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the eid");
		int eid = Integer.parseInt(bf.readLine());
		System.out.println("Enter the ename");
		String ename = bf.readLine();
		System.out.println("Enter the salary");
		int salary = Integer.parseInt(bf.readLine());
       
        Employee e = new Employee(eid,ename,salary);
        System.out.println(e);
        
        
    }
    
}
	