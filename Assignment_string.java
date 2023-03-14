package String;

import java.util.StringTokenizer;

//Write a program which creates a String “Welcome to Java World”
public class Assignment_string {  //main class
	public static void main(String[] args) { //main method
		String a="Welcome to Java World"; 
		String c=new String(a);
		System.out.println("Character at 5th position : "+a.charAt(5)); //Returns the character at 5th position
		String we="Welcome";
		System.out.println("Compare string : "+((a.compareToIgnoreCase(we)))); //Compares the above String 
		System.out.println("Concatenates : "+(a.concat(" Learn java")));   //Concatenates 
		System.out.println("position of a : "+a.indexOf('a'));    //Returns the position of the first occurrence of character‘a’
		System.out.println("Replace a with e : "+a.replace('a','e'));    //Replaces all the occurrences of‘a’character with the new‘e’ 
		System.out.println("Return String of 4th and 10th position : "+a.substring(4,10));    //Returns string between 4th position and 10th position
		System.out.println("lower case : "+a.toLowerCase());   //Returns the lowercase of the string
		
		
		// WAP which create a StringBuffer
		StringBuffer s=new StringBuffer(" This is StringBuffer"); 
		s.append(" This is a sample program");  //adds the string "this is stringbuffer"
		System.out.println(s.insert(21, "Object"));  //insert the string "object" in 21st position
		System.out.println(s.reverse());  //reverse the entire string
		System.out.println(s.replace(14, 19, "builder"));  //replace buffer with builder
		
		//problem statement-3
		String t= "C:\\\\IBM\\\\DB2\\\\PROGRAM\\\\DB2COPY1.EXE";
        StringTokenizer st = new StringTokenizer( t,"\\");
        String drive = st.nextToken();
        StringBuilder folders = new StringBuilder();
        while (st.hasMoreTokens()) {
            folders.append(st.nextToken());
            if (st.hasMoreTokens()) {
                folders.append(" || ");
            }
        }
        String file = folders.substring(folders.lastIndexOf(" || ") + 4);
        folders.delete(folders.lastIndexOf(" || "), folders.length());

        // Display the output in the required format
        System.out.println("Drive:"+drive);
        System.out.println("Folders:"+folders);
        System.out.println("File:"+file);
		}	
      }
	
	
	

