import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;



public class WalkFileTreePattern {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("files/");
        
        boolean directory = Files.isDirectory(path);
        System.out.println("Directory = " + directory);
        
        var visitor = new FileVisitor<Path>(){

            private long countFiles = 0L;
            private long countDirs = 0L;

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                countDirs++;
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                countFiles++;
                return FileVisitResult.CONTINUE;
            }


            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return null;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            return FileVisitResult.CONTINUE;
            }

        };


        Files.walkFileTree(path, visitor);

        System.out.println("Number of files = " + visitor.countFiles);
        System.out.println("Number of directories = " + visitor.countDirs);

    }

}
