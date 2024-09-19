import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;


public class FileHandling
{
    public static void main(String[] args) {
        try {
            // Define file and directory paths
            String filePath = "example.txt";
            String directoryPath = "testDir";

            // Create File object for a file
            File file = new File(filePath);

            // 1. createNewFile()
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Various methods to get file information
            System.out.println("File Name: " + file.getName()); // 2. getName()
            System.out.println("Parent: " + file.getParent()); // 3. getParent()
            System.out.println("Path: " + file.getPath()); // 4. getPath()
            System.out.println("Absolute Path: " + file.getAbsolutePath()); // 5. getAbsolutePath()
            System.out.println("Is Absolute: " + file.isAbsolute()); // 6. isAbsolute()
            System.out.println("Can Read: " + file.canRead()); // 7. canRead()
            System.out.println("Can Write: " + file.canWrite()); // 8. canWrite()
            System.out.println("Exists: " + file.exists()); // 9. exists()
            System.out.println("Is Directory: " + file.isDirectory()); // 10. isDirectory()
            System.out.println("Is File: " + file.isFile()); // 11. isFile()
            System.out.println("Last Modified: " + file.lastModified()); // 12. lastModified()
            System.out.println("Length: " + file.length() + " bytes"); // 13. length()

            // 14. setReadOnly()
            System.out.println("Set Read Only: " + file.setReadOnly());
            System.out.println("Can Write after setting read-only: " + file.canWrite()); // 15. canWrite() after setReadOnly()

            // 16. setLastModified()
            System.out.println("Set Last Modified: " + file.setLastModified(System.currentTimeMillis()));

            // Create a directory
            File dir = new File(directoryPath);
            if (dir.mkdir()) { // 17. mkdir()
                System.out.println("Directory created: " + dir.getName());
            } else {
                System.out.println("Directory already exists.");
            }

            // Create some files inside the directory
            new File(dir, "file1.txt").createNewFile();
            new File(dir, "file2.txt").createNewFile();

            // List files in the directory
            String[] filesList = dir.list(); // 18. list()
            System.out.println("Files in directory:");
            for (String fileName : filesList) {
                System.out.println(fileName);
            }

            File[] filesArray = dir.listFiles(); // 19. listFiles()
            System.out.println("Files as File objects:");
            for (File f : filesArray) {
                System.out.println(f.getName());
            }

            // 20. list(FilenameFilter filter)
            FilenameFilter filter = (f, name) -> name.endsWith(".txt");
            String[] filteredFiles = dir.list(filter);
            System.out.println("Filtered files:");
            for (String fileName : filteredFiles) {
                System.out.println(fileName);
            }

            // 21. renameTo()
            File renamedFile = new File("renamed_example.txt");
            if (file.renameTo(renamedFile)) {
                System.out.println("File renamed to: " + renamedFile.getName());
            } else {
                System.out.println("Failed to rename file.");
            }

            // 22. deleteOnExit()
            renamedFile.deleteOnExit();
            dir.deleteOnExit();

            // 23. compareTo(File pathname)
            File anotherFile = new File("anotherFile.txt");
            anotherFile.createNewFile();
            System.out.println("Comparing files: " + renamedFile.compareTo(anotherFile));

            // 24. toString()
            System.out.println("File path as string: " + renamedFile.toString());

            // 25. equals(Object obj)
            System.out.println("Files are equal: " + renamedFile.equals(new File("renamed_example.txt")));

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

