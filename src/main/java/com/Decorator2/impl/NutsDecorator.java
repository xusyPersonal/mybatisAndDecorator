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
 * @Date :����ʱ��: 12:40 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public class NutsDecorator extends DecoratorCake {
    public NutsDecorator(Cake cake) {
        super(cake);
        super.remark = "һ�Ź���" ;
    }

    @Override
    public String getRemark() {
        return super.cake.getRemark()+","+super.remark;
    }

    @Override
    public String getExpression() {
        return super.cake.getExpression()+","+"����һ�Ź��ʣ�������";
    }
}
