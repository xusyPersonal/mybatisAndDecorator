package com.Decorator2.impl;

import com.Decorator2.Cake;

/**
 * 标题:
 * <p>
 * <p>
 * 描述:
 * <p>
 * 版权: 税友软件集团股份有限公司
 *
 * @Date :创建时间: 12:43 2018/9/15
 * <p>
 * <p>
 * 作者: xusy
 */
public class DecoratorCakeTest {

    public static void main(String[] args) {
        Cake nutFlowerCake =
                new NutsDecorator(new FlowerDecorator(new CheeseCake())) ;

        System.out.println("remark::"+nutFlowerCake.getRemark());
        System.out.println("expression:::"+nutFlowerCake.getExpression());
    }
}
