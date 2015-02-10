package nio;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativePaths{
    public static void main(String...args){
        // / -
        //   home -
        //        someone   -
        //                  some.mp3
        //        otherone  -
        //                  some.txt
        //   root -
        //        temp
        //   tmp  -
        //        boris     -
        //                  tmpfile.txt
        Path path1 = Paths.get("/home/someone/");// path doesnt have to exist
        Path path1a = Paths.get("some.mp3");// path doesnt have to exist
        Path path2 = Paths.get("/home/otherone/some.txt");// path doesnt have to exist
        Path path3 = Paths.get("/root/temp");// path doesnt have to exist
        Path path4 = Paths.get("/tmp/boris/tmpfile.txt");// path doesnt have to exist
        
        Path resolved = path1.resolve(path1a);
        System.out.printf("resolved path is %s\n",resolved);
        // resolve is overloaded with String or Path argument so a direct null wont compile
        // path1.resolve(null);
        // but
        // path1.resolve((String)null); // will not fail because it is know which method signature
        // will be called.
        Path resolved2 = path1.resolve("../bloodydir/./tmpdir/../tmpdir2/");
        System.out.printf("resolved2 path is %s\n",resolved2);
        System.out.printf("normalized resolved2 path is %s\n",resolved2.normalize());

        Path relative = path1.relativize(path2);
        System.out.printf("relative path pf %s to %s is %s\n",path2,path1,relative);
        Path relative1 = path3.relativize(path4);
        System.out.printf("relative path pf %s to %s is %s\n",path4,path3,relative1);

        Path pathRelativeFromScratch = Paths.get("whatever");
        Path relative2 = path3.relativize(pathRelativeFromScratch);
        System.out.printf("relative path pf %s to %s is %s\n",pathRelativeFromScratch,path3,relative2);//expecting exception
        
                
    }
}
