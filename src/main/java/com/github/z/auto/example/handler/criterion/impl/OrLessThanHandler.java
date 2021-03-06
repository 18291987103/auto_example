package com.github.z.auto.example.handler.criterion.impl;

import com.github.z.auto.example.handler.criterion.CriterionHandler;
import tk.mybatis.mapper.entity.Example;

/**
 * @author hujun
 * date 2019-08-16 14:24
 */
public class OrLessThanHandler extends CriterionHandler {

  @Override
  public void handle(Example.Criteria criteria,String property, Object value) {
    criteria.orLessThan(property, checkTime(property,value));
  }
}
