package com.Decorator2.impl;

import com.Decorator2.Cake;
import com.Decorator2.DecoratorCake;

/**
 * ����:
 * <p>
 * <p>
 * ����:
 * <p>
 * ��Ȩ: ˰��������Źɷ����޹�˾
 *
 * @Date :����ʱ��: 12:29 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public class FlowerDecorator extends DecoratorCake {
    public FlowerDecorator(Cake cake) {
        super(cake);
        super.remark = "һ��õ�廨" ;
    }

    @Override
    public String getRemark() {
        return super.cake.getRemark()+"+"+ super.remark;
    }

    @Override
    public String getExpression() {
        return super.cake.getExpression()+","+"����һ�仨��happy";
    }
}
