/*
 * FileHandling with try{} catch(){}
 */

package pack4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A3 
{
	public static void main(String[] args) /*throws is not necessary if Exception is handling*/
	{
		File file = new File("test3.txt");
		
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		try 
		{
			fileWriter = new FileWriter(file);
			bufferedWriter  = new BufferedWriter(fileWriter);
			
			bufferedWriter.write("content writing in to the file");
			bufferedWriter.newLine();
			bufferedWriter.write("content writing in to the file");
			bufferedWriter.newLine();
			bufferedWriter.write("content writing in to the file");
		}
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			if (bufferedWriter != null)
			{
				try 
				{
					bufferedWriter.flush();
					bufferedWriter.close();
					
//					fileWriter.close();  place it in new tryCatch
				} 
				catch (IOException ex) 
				{
					ex.printStackTrace();
				}
			}
			
			if (fileWriter != null)
			{
				try 
				{
					fileWriter.close();  
				} 
				catch (IOException ex) 
				{
					ex.printStackTrace();
				}
			}
		}
	}
}
