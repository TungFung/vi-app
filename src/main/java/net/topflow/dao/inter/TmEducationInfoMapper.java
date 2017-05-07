package net.topflow.dao.inter;

import net.topflow.dao.model.TmEducationInfo;
import net.topflow.dao.model.TmEducationInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmEducationInfoMapper {
    long countByExample(TmEducationInfoExample example);

    int deleteByExample(TmEducationInfoExample example);

    int insert(TmEducationInfo record);

    int insertSelective(TmEducationInfo record);

    List<TmEducationInfo> selectByExample(TmEducationInfoExample example);

    int updateByExampleSelective(@Param("record") TmEducationInfo record, @Param("example") TmEducationInfoExample example);

    int updateByExample(@Param("record") TmEducationInfo record, @Param("example") TmEducationInfoExample example);
}