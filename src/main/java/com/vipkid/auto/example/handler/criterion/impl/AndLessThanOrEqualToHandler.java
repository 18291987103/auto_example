package com.vipkid.auto.example.handler.criterion.impl;

import com.vipkid.auto.example.handler.criterion.CriterionHandler;
import tk.mybatis.mapper.entity.Example;

/**
 * @author hujun1
 * @date 2019-08-16 14:24
 */
public class AndLessThanOrEqualToHandler extends CriterionHandler {

  @Override
  public void handle(Example.Criteria criteria,String property, Object value) {
    criteria.andLessThanOrEqualTo(property, checkTime(property,value));
  }
}
