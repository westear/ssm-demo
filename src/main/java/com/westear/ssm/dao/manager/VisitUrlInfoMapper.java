package com.westear.ssm.dao.manager;

import com.westear.ssm.model.manager.VisitUrlInfo;
import com.westear.ssm.model.manager.VisitUrlInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VisitUrlInfoMapper {
    int countByExample(VisitUrlInfoExample example);

    int deleteByExample(VisitUrlInfoExample example);

    int insert(VisitUrlInfo record);

    int insertSelective(VisitUrlInfo record);

    List<VisitUrlInfo> selectByExample(VisitUrlInfoExample example);

    int updateByExampleSelective(@Param("record") VisitUrlInfo record, @Param("example") VisitUrlInfoExample example);

    int updateByExample(@Param("record") VisitUrlInfo record, @Param("example") VisitUrlInfoExample example);
}