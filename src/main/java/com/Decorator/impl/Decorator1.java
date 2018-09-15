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
 * @Date :创建时间: 10:57 2018/9/15
 * <p>
 * <p>
 * 作者: xusy
 */
public class Decorator1 implements Sourcable {

    private Sourcable sourcable ;

    public Decorator1(Sourcable sourcable) {
        this.sourcable = sourcable;
    }

    @Override
    public void operation() {
        System.out.println("第一个装饰器前");
        sourcable.operation() ;
        System.out.println("第一个装饰器后");
    }
}
