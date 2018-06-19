package file_handling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class File_handling1 {
	public static void main(String[] args) throws IOException {
   File file=new File("C:\\Users\\user\\Desktop\\xyz.txt");
   FileReader in = null;
   FileWriter out=new FileWriter("C:\\\\Users\\\\user\\\\Desktop\\\\abc.txt");
   try {
	   in=new FileReader(file);
	   int ch;
	   String a="";
	   while((ch=in.read())!=-1) {
		   System.out.print((char)ch);
	   a=a+(char)ch;
	   }
	   char b[]=a.toCharArray();
	   for(int i=0;i<b.length;i++){
		   out.write(b[i]);
	   }
	   out.close();
   }catch(InputMismatchException e) {
	   System.out.println("Wrong Input");
   }finally{
	   if(in!=null)
	   in.close();
   }
	}
}
