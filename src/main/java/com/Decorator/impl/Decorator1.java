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
 * @Date :����ʱ��: 10:57 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public class Decorator1 implements Sourcable {

    private Sourcable sourcable ;

    public Decorator1(Sourcable sourcable) {
        this.sourcable = sourcable;
    }

    @Override
    public void operation() {
        System.out.println("��һ��װ����ǰ");
        sourcable.operation() ;
        System.out.println("��һ��װ������");
    }
}
