package nio;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.io.File;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

public class TestNio{
    public static void main(String...args) throws IOException{
        String tmpFile = "/tmp/baris";
        Path pathShort = Paths.get(tmpFile);
        System.out.printf("patshShort: %s exists()= %b\n", pathShort.getFileName(),Files.exists(pathShort));
        System.out.printf("pathShort: %s notExists()= %b\n", pathShort.getFileName(),Files.notExists(pathShort));
        Path pathLong = FileSystems.getDefault().getPath(tmpFile);
        System.out.printf("pathLong: %s exists()= %b\n", pathLong.getFileName(),Files.exists(pathLong));
        System.out.printf("pathLong: %s notExists()= %b\n", pathLong.getFileName(),Files.notExists(pathLong));
        System.out.printf("pathShort runtime class is= %s\n", pathShort.getClass());
        System.out.printf("pathLong runtime class is= %s\n", pathLong.getClass());
        File convertedFile = pathShort.toFile();
        Path convertedPath = convertedFile.toPath();
        System.out.printf("pathShort.getName(0):%s\n", pathShort.getName(0));        
        System.out.printf("pathShort.getName(1):%s\n", pathShort.getName(1));        
        System.out.printf("pathShort.getNameCount():%s\n", pathShort.getNameCount());        
        System.out.printf("pathShort.getParent():%s\n", pathShort.getParent());        
        System.out.printf("pathShort.getRoot():%s\n", pathShort.getRoot());     
        System.out.printf("pathShort.subpath(0,2):%s\n", pathShort.subpath(0,2));
        Path pathNormalizable = Paths.get(tmpFile,"..");
        System.out.printf("pathNormalizable:%s\n", pathNormalizable);     
        System.out.printf("pathNormalizable.normalize():%s\n", pathNormalizable.normalize());     
        createFile(convertedPath);
        System.out.printf("patshShort: %s exists()= %b\n", pathShort.getFileName(),Files.exists(pathShort));
        System.out.printf("pathShort: %s notExists()= %b\n", pathShort.getFileName(),Files.notExists(pathShort));
        BasicFileAttributes basic = Files.readAttributes(convertedPath, BasicFileAttributes.class);
        System.out.println("create time:" + basic.creationTime());
        System.out.println("access time:" + basic.lastAccessTime());
        System.out.println("modify time:" + basic.lastModifiedTime());
        System.out.println("is directory:" + basic.isDirectory());
        Files.delete(pathShort);
        String tmpDirectory1 = "/tmp/temp1";
        String tmpDirectory2 = "/tmp/temp1/temp2";
        Path tmpDir1 = Paths.get(tmpDirectory1);
        Path tmpDir2 = Paths.get(tmpDirectory2);
        Files.deleteIfExists(tmpDir2);
        Files.deleteIfExists(tmpDir1);
        Files.createDirectory(tmpDir1);
        Files.createDirectory(tmpDir2);
        
        System.out.printf("tmpDir1: %s exists()= %b\n", tmpDir1.getFileName(),Files.exists(tmpDir1));
        System.out.printf("tmpDir1: %s notExists()= %b\n", tmpDir1.getFileName(),Files.notExists(tmpDir1));
        System.out.printf("tmpDir2: %s exists()= %b\n", tmpDir2.getFileName(),Files.exists(tmpDir2));
        System.out.printf("tmpDir2: %s notExists()= %b\n", tmpDir2.getFileName(),Files.notExists(tmpDir2));
    
        Files.deleteIfExists(tmpDir2);
        Files.deleteIfExists(tmpDir1);
        Files.createDirectories(tmpDir2);
        Files.deleteIfExists(tmpDir2);
        Files.deleteIfExists(tmpDir1);

        
    }
    
    private static void createFile(Path path) throws IOException{
        Files.createFile(path);
    }
}
