package com.Decorator2.impl;

import com.Decorator2.Cake;
import com.Decorator2.DecoratorCake;

/**
 * 标题:
 * <p>
 * <p>
 * 描述:
 * <p>
 * 版权: 税友软件集团股份有限公司
 *
 * @Date :创建时间: 12:40 2018/9/15
 * <p>
 * <p>
 * 作者: xusy
 */
public class NutsDecorator extends DecoratorCake {
    public NutsDecorator(Cake cake) {
        super(cake);
        super.remark = "一颗果仁" ;
    }

    @Override
    public String getRemark() {
        return super.cake.getRemark()+","+super.remark;
    }

    @Override
    public String getExpression() {
        return super.cake.getExpression()+","+"看到一颗果仁，哈哈哈";
    }
}
