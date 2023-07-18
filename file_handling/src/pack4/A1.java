/*
 * Low level API classes : FileWriter, FileReader
 * read and write operation takes more time
 * character by character transfer(bit by bit)
 * line by line Write/Read is not possible
  
 * to overcome above drawbacks 
 
 * BufferedWriter/BufferedReader were developed on top of FileWriter/FileReader
 * Refined Operations
 */

package pack4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A1 
{
	public static void main(String[] args) throws IOException
	{
		
//		Creating new file with Name.ext
		File f1 = new File("test1.txt");
		
		/*
		 * Using FileWriter
		 * Carry out the write operation if file already exists.
		 * else creates new file with the given name and proceeds with operation
		 * multiple execution will not append the content into the existing file
		 * by default append = false : overwrite the file in everyExecution
		 */
		FileWriter fileWriter = new FileWriter(f1);
//		FileWriter fileWriter = new FileWriter(f1, true);   --> To append the content
		
		/*
		 * Using BufferedWriter 
		 * BufferedWriter takes FileWriter as Constructor-arg
		 * BufferedWriter is built upon FileWriter
		 */
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("Writing in to the file using BufferWriter");
		bufferedWriter.write("By default the content writing will start from the last cursor location");
		bufferedWriter.write("write the content in the same line");

//		BufferedWriter having builtIn function to nextLine
		bufferedWriter.newLine();
		
		bufferedWriter.write("BufferedWriter is having newLine() which will create the new line");
		bufferedWriter.write("Content writing start from the next line");

		bufferedWriter.newLine();
		
		bufferedWriter.write("newLine() can be used to create new line whenever necessary");
		bufferedWriter.write("content will write in the new line");
		
//		flush() will push the trapped content to the file explicitly
//		close the established connection to the resource
//		first close the BufferredWriter
		
		bufferedWriter.flush();
		bufferedWriter.close();
		
//		close the FileWriter
//		flushing again is not necessary as the stream will be same for FileWriter and BufferedWriter
		fileWriter.close();
		
	}
}
