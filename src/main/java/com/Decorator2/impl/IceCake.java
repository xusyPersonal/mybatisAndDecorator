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
 * @Date :创建时间: 12:24 2018/9/15
 * <p>
 * <p>
 * 作者: xusy
 */
public class IceCake extends Cake {

    public IceCake() {
        super.remark = "冰淇淋蛋糕";
    }


    @Override
    public String getExpression() {
        return "冰凉的感觉很好" ;
    }


}
