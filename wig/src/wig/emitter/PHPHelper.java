package wig.emitter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PHPHelper
{
   private final static String PHP_HELPER_FILE = "src/phphelpers.txt";

   public static String getHelperPHPFunctions() throws IOException
   {
       StringBuilder sb = new StringBuilder();
       BufferedReader reader = new BufferedReader(new FileReader(PHP_HELPER_FILE));
       String line = null;
       while ((line = reader.readLine()) != null)
       {
           sb.append(line+"\n");
       }
       reader.close();
       return sb.toString();
   }

}
