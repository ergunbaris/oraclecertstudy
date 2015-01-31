package fileio;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class TestPrintRwters{
    public static void main(String...args) throws IOException{
	File myDir = new File("/tmp/barise");
	boolean isDirCreated = myDir.mkdir();
	System.out.println("isDirCreated: " + isDirCreated);
	System.out.println("myDir.isDirectory():" + myDir.isDirectory());
	System.out.println("myDir.isFile():" + myDir.isFile());
	System.out.println("myDir.exists():" + myDir.exists());

	File myFile = new File(myDir,"sample" + System.currentTimeMillis());
	//boolean isFileCreated = myFile.createNewFile(); no need PrintWriter will auto create if not exists
	//System.out.println("isFileCreated: " + isFileCreated);
	System.out.println("myFile.isDirectory():" + myFile.isDirectory());
	System.out.println("myFile.isFile():" + myFile.isFile());
	System.out.println("myFile.exists():" + myFile.exists());

	PrintWriter fw = new PrintWriter(myFile);
	fw.println("hello");
	fw.println("world");
	fw.flush();
	fw.close();

	FileReader fr = new FileReader(myFile);
	BufferedReader br = new BufferedReader(fr);
	String data;
	while(null != (data = br.readLine())){
	    System.out.println(data);
	}
	fr.close();
	String [] listOfFiles = myDir.list();
	for(String file:listOfFiles){
	    System.out.println("file listed:" + file);
	}
	System.out.println("myFile.delete():" + myFile.delete());
	System.out.println("myFile.delete():" + myFile.delete());
	System.out.println("myDir.delete():" + myDir.delete());
	System.out.println("myDir.delete():" + myDir.delete());
	
    }
}
