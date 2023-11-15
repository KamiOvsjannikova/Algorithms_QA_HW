package org.example.homework0811;
public class TextFile {
public static void main(String args[]) throws IOException {
        String s;
        while (true) {
            System.out.println("Enter full path ('quit' to exit): ");
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextLine();

            if (s.equals("quit")) break;
            File directory = new File(s);
            if (!directory.exists()) {
                System.out.println("\nNot found: " + s);
                continue;
            }

            if (!directory.isDirectory()) {
                System.out.println("\nNot directory: " + s);
                continue;
            }

            listTextFiles(directory);
        }
    }

    public static void listTextFiles(File dir) throws IOException {

        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    listTextFiles(file);
                } else {
                    if (file.getName().endsWith(".txt")) {
                        System.out.println("File: " + file.getAbsolutePath());
                        displayFileContents(file);
                        System.out.println("*****************");


                    }
                }
            }
        }
    }
    public static void displayFileContents(File file) throws IOException {
        List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        lines.forEach(System.out::println);
    }
}
