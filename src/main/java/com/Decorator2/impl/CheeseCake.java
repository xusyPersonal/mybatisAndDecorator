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
 * @Date :创建时间: 12:19 2018/9/15
 * <p>
 * <p>
 * 作者: xusy
 */
public class CheeseCake extends Cake {

    public CheeseCake() {
        super.remark = "乳酪蛋糕";
    }

    @Override
    public String getExpression() {
        return "乳酪蛋糕，香甜可口";
    }
}
