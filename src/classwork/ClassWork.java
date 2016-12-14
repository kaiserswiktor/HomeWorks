package classwork;
import java.io.*;
public class ClassWork {
public static void main(String args[]) throws FileNotFoundException{
BufferedReader in = new BufferedReader(new FileReader("123.txt"));
String s = null ;
try {
	s = in.readLine();
} catch (IOException e) {
	e.printStackTrace();
}
//System.out.println(s.toString());

/*char ch []=s.toCharArray();
for(int i=0;i<ch.length;i++){
	if(ch[i]==1){
	System.out.println(i);
	*/

  try {
	FileWriter w=new FileWriter("1.txt");
	w.write(s);
} catch (IOException e) {
	
	e.printStackTrace();
}

}}



