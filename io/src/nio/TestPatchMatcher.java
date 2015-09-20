package nio;
import java.nio.file.*;

class TestPatchMatcher{
    public static final void main(String...args){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:[!f.]?{z[A-E]}");
        Path p = Paths.get(args[0]);
        if(matcher.matches(p)){
            System.out.println("matches");
        }
    }

}
