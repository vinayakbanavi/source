/*
 * Append = true
 * Constructors are overloading in FileWriter
 * if we are just supplying name, Append will be false
 * 
 * Append will write into the existing file without overWriting
 */

package pack4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A2 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File( /*String name = */"test2.txt");
		
		FileWriter fileWriter = new FileWriter( /*File file =  */ file, /*Boolean append = */ true);
		
		BufferedWriter bufferedWriter = new BufferedWriter( /*FileWriter file = */ fileWriter);
		
		bufferedWriter.write( /*String text =  */ "Writing in to the file");
		bufferedWriter.write("Using buffered writer,");
		bufferedWriter.write("write will start writing in the same line from last cursor point");
		bufferedWriter.write("Doesnt add any spacing for each write statement");
		
		bufferedWriter.newLine();
		bufferedWriter.write("bufferedWriter has a function to create newLine()");
		bufferedWriter.write("will insert the new line and content start writing in the newly produced line");
		
		bufferedWriter.newLine();
		bufferedWriter.write("As we are used append = true the following content will be added in successive execution");
	
		bufferedWriter.newLine();
		
		bufferedWriter.flush();
		bufferedWriter.close();
		
		fileWriter.close();
	}
}
