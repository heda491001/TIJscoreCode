import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

class B{
	public void test(){
		System.out.println("inside B");
	}
}

class C extends B{
	@Override
	public void test() {
		System.out.println("inside C");
	}
}
public class test {
	static ArrayList<String> db;
	public static void main(){
		
	}
	public test() {
		db=new ArrayList<>();
		try(Scanner scanner =new Scanner(new File("F:\\JAVA\\workspace\\SynTest\\words.txt"))){
			while(scanner.hasNext()){
				db.add(scanner.next());
			}
			System.out.println("mark");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		int a=15;
		
		System.out.println(a/20.0);
	}
}
class A<K extends B>{
	private K a;
	public A(K a) {
		this.a=a;
		a.test();
	}
}