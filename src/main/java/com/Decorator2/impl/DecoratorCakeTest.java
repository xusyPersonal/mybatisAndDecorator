package com.Decorator2.impl;

import com.Decorator2.Cake;

/**
 * ����:
 * <p>
 * <p>
 * ����:
 * <p>
 * ��Ȩ: ˰��������Źɷ����޹�˾
 *
 * @Date :����ʱ��: 12:43 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public class DecoratorCakeTest {

    public static void main(String[] args) {
        Cake nutFlowerCake =
                new NutsDecorator(new FlowerDecorator(new CheeseCake())) ;

        System.out.println("remark::"+nutFlowerCake.getRemark());
        System.out.println("expression:::"+nutFlowerCake.getExpression());
    }
}
