import java.util.ArrayList;
import java.util.List;

/**
 * ����:
 * <p>
 * <p>
 * ����:
 * <p>
 * ��Ȩ: ˰��������Źɷ����޹�˾
 *
 * @Date :����ʱ��: 17:28 2018/9/8
 * <p>
 * <p>
 * ����: xusy
 */
public class StaticTest {
    private static final a btest = new a("btest") ;
    private static a atest = new a("atest") ;
       private  a ctest = new a("ctest");

    static {
        System.out.println("I AM STATIC BLOCK");
    }
    static {
        System.out.println("I AM STATIC BLOCK TWO");
    }

    public static void main(String[] args) {
       StaticTest staticTest = new StaticTest();
        staticTest.test() ;
//        StaticTest b = new StaticTest();
//         b.test() ;



    }
    public void test(){
        System.out.println("I AM NOT STATIC BLOCK");
    }
    static class a{
        a(String a ){
            System.out.println(a);
        }
    }
}
