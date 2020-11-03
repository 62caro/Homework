package hw_04_11_2020;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Hw_2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for directory");
        String name = scanner.nextLine();
        createFile(name);

        zip("D:\\" + name, "D:\\z.zip");

        System.out.println("Enter new directory ");
        String newdir = scanner.nextLine();
        readDirectory("D:\\" + newdir);

        File fileSource = new File("D:\\" + newdir);
        deleteDirectory(fileSource);

    }

    private static void createFile(String name) throws IOException {
        new File("D:\\" + name).mkdir();
        File file = new File("D:\\" + name + "\\file1.txt");
        File file1 = new File("D:\\" + name + "\\file2.txt");
        File file2 = new File("D:\\" + name + "\\file3.txt");
        file.createNewFile();
        file1.createNewFile();
        file2.createNewFile();
    }

    private static void zip(String source_dir, String zip_file) throws Exception {
        FileOutputStream fout = new FileOutputStream(zip_file);
        ZipOutputStream zout = new ZipOutputStream(fout);

        File fileSource = new File(source_dir);

        addDirectory(zout, fileSource);

        zout.close();

        System.out.println("Zip created!");
    }

    private static void addDirectory(ZipOutputStream zout, File fileSource) throws Exception {
        File[] files = fileSource.listFiles();
        System.out.println("Read directory <" + fileSource.getName() + ">");
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                addDirectory(zout, files[i]);
                continue;
            }
            System.out.println("Add file <" + files[i].getName() + ">");

            FileInputStream fis = new FileInputStream(files[i]);

            zout.putNextEntry(new ZipEntry(files[i].getPath()));

            byte[] buffer = new byte[4048];
            int length;
            while ((length = fis.read(buffer)) > 0)
                zout.write(buffer, 0, length);

            zout.closeEntry();
            fis.close();
        }
    }

    private static void readDirectory(String source_dir) {
        File dir = new File(source_dir);
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        System.out.println("Files in directory " + lst);
    }

    public static void deleteDirectory(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                File f = new File(dir, children[i]);
                deleteDirectory(f);
            }
            dir.delete();
            System.out.println("Directory was deleted");
        } else dir.delete();
    }
}