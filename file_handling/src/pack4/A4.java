package pack4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A4 
{
	public static void main(String[] args) 
	{
		File file = new File("test4.txt");
		
		try(FileWriter fileWriter = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
		{
			bufferedWriter.write(1234551511);
			bufferedWriter.write("write method is overloaded with int so we can directly supply int");
			bufferedWriter.newLine();
			bufferedWriter.write("but we dont get the same number into the file");
			bufferedWriter.newLine();
			bufferedWriter.write("it will be treated as a hashCode value");
			bufferedWriter.newLine();
			bufferedWriter.write("but we get the corresponding character for the given hashcode");
			
			bufferedWriter.newLine();
			bufferedWriter.write("Developed using try with resource");
			bufferedWriter.newLine();
			bufferedWriter.write("if Resources created in the try parenthesis implements Closeable they will close automatically");
			
		} 
		
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}
}
