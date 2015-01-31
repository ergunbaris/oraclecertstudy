package fileio;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TestFileRwters{
    public static void main(String...args) throws IOException{
	File myDir = new File("/tmp/barise");
	boolean isDirCreated = myDir.mkdir();
	System.out.println("isDirCreated: " + isDirCreated);
	System.out.println("myDir.isDirectory():" + myDir.isDirectory());
	System.out.println("myDir.isFile():" + myDir.isFile());
	System.out.println("myDir.exists():" + myDir.exists());

	File myFile = new File(myDir,"sample" + System.currentTimeMillis());
	boolean isFileCreated = myFile.createNewFile();
	System.out.println("isFileCreated: " + isFileCreated);
	System.out.println("myFile.isDirectory():" + myFile.isDirectory());
	System.out.println("myFile.isFile():" + myFile.isFile());
	System.out.println("myFile.exists():" + myFile.exists());

	FileWriter fw = new FileWriter(myFile);
	fw.write("hello\nworld\n");
	fw.flush();
	fw.close();

	char in[] = new char[50];
	FileReader fr = new FileReader(myFile);
	int myFileSize = fr.read(in);	
	System.out.println("myFile size:" + myFileSize);
	for(char c:in){
	    System.out.print(c);
	}
	fr.close();
	System.out.println("isFileDeleted:" + myFile.delete());
	System.out.println("isFileDeleted:" + myFile.delete());
	System.out.println("isDirDeleted:" + myDir.delete());
	System.out.println("isDirDeleted:" + myDir.delete());
	
    }
}
