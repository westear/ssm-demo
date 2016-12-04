package com.westear.ssm.dao;

import com.westear.ssm.model.VisitUrlInfo;

public interface VisitUrlInfoMapper {
    int insert(VisitUrlInfo record);

    int insertSelective(VisitUrlInfo record);
}