package nio;

import java.nio.file.SimpleFileVisitor;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;

public class TestFileVisitor{
    public static void main (String ... args) throws IOException{
        if(args.length != 1){
            throw new IllegalArgumentException();
        }
        String dirName = args[0];
        PrintFiles pFiles = new PrintFiles(dirName);
        Files.walkFileTree(Paths.get("."), pFiles);

    }

}

class PrintFiles extends SimpleFileVisitor<Path>{
    private final String dirName;
    public PrintFiles(String dirName){
        this.dirName = dirName;
    }
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(file.toString().contains(dirName)){
            System.out.println(file);
            return FileVisitResult.SKIP_SIBLINGS;
        }else{            
            System.out.println(file);
        }
        return FileVisitResult.CONTINUE;
    }
}
