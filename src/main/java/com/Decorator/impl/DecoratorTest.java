package com.Decorator.impl;

import com.Decorator.Sourcable;

/**
 * ����:
 * <p>
 * <p>
 * ����:
 * <p>
 * ��Ȩ: ˰��������Źɷ����޹�˾
 *
 * @Date :����ʱ��: 11:07 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public class DecoratorTest {

   public static  Sourcable sourcable = new Source() ;

    public static void main(String[] args) {
        Sourcable obj =
               new Decorator2(new Decorator3(sourcable)) ;
        obj.operation();
    }
}
