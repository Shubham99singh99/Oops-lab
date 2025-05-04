// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
   public FileReadExample() {
   }

   public static void readFile(String var0) throws FileNotFoundException {
      File var1 = new File(var0);
      Scanner var2 = new Scanner(var1);

      while(var2.hasNextLine()) {
         System.out.println(var2.nextLine());
      }

      var2.close();
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String var2 = var1.nextLine();
      var1.close();

      try {
         readFile(var2);
      } catch (FileNotFoundException var7) {
         System.out.println("Error: File not found.");
      } finally {
         System.out.println("File operation attempted.");
      }

   }
}
