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
 * @Date :����ʱ��: 11:03 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public class Decorator3 implements Sourcable {

    private Sourcable sourcable ;

    public Decorator3(Sourcable sourcable) {
        this.sourcable = sourcable;
    }

    @Override
    public void operation() {
        System.out.println("������װ����ǰ");
        sourcable.operation();
        System.out.println("������װ������sfs");
    }
}
