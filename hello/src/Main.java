import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Main {
     int a =1;
    public static void main(String[] args) {
        Student c = new Student();
        Student a = new Student();
        Student b = a;
        System.out.println(b.toString());
        a = c;
        System.out.println(a.toString() + b.toString());
        Map<String,String> m=new HashMap<String,String>();
m.put("1","qq");
    }
    @Test
    public  void t1(){
        a=2;
        System.out.println(a);
        t2();
    }
    @Test
    public  void t2(){
        int e=1;
        System.out.println(a);
    }
}
