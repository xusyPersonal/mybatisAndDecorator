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
public class testArrayList {

    public static void main(String[] args) {
        List list = new ArrayList(1) ;
        list.size() ;
        list.add(0,1);
        list.add(1,3);
        list.toArray() ;
        System.out.println(list);
        System.out.println(list.toArray());
        System.out.println(list.toArray()[1]);
        Integer.valueOf(210) ;
        String.valueOf(320) ;
        Short i =2;
        System.out.println(Short.valueOf(i)) ;
        Double.valueOf(2.0) ;


    }
}
