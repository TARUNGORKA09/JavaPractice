import java.util.Scanner;

public class InnerClassDemo {
    InnerClassDemo(){}
    InnerClassDemo(int id){
        System.out.print("Welcome to the IT world "+id);
    }
    class InnerClass{
        InnerClass(int id){
            System.out.println("Welome to the JIO world "+id);
        }
        public void show(){
            System.out.println("Hello World!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Id : ");
        int id = sc.nextInt();
        InnerClassDemo icd = new InnerClassDemo(id);
        InnerClass ic = new InnerClassDemo().new InnerClass(id);
        ic.show();
    }
}
