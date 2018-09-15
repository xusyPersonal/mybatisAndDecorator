package com.Decorator.impl;

import com.Decorator.Sourcable;

/**
 * 标题:
 * <p>
 * <p>
 * 描述:
 * <p>
 * 版权: 税友软件集团股份有限公司
 *
 * @Date :创建时间: 11:07 2018/9/15
 * <p>
 * <p>
 * 作者: xusy
 */
public class DecoratorTest {

   public static  Sourcable sourcable = new Source() ;

    public static void main(String[] args) {
        Sourcable obj =
               new Decorator2(new Decorator3(sourcable)) ;
        obj.operation();
    }
}
