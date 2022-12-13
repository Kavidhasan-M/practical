import java.io.*;
public class PrintInfo
{
public static void main(String filepath) throws FileNotFoundException,IOException
{
file f=new file(filepath);
if(f.exists())
{
system.out.println("File is present");
BufferedReader br=new Bufferedreader (new FileReader());
system.out.println(br.readline());
}
else
{
system.out.println("File is not Present");
}
}
}
