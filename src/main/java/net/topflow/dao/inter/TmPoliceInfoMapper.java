package net.topflow.dao.inter;

import net.topflow.dao.model.TmPoliceInfo;
import net.topflow.dao.model.TmPoliceInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmPoliceInfoMapper {
    long countByExample(TmPoliceInfoExample example);

    int deleteByExample(TmPoliceInfoExample example);

    int insert(TmPoliceInfo record);

    int insertSelective(TmPoliceInfo record);

    List<TmPoliceInfo> selectByExample(TmPoliceInfoExample example);

    int updateByExampleSelective(@Param("record") TmPoliceInfo record, @Param("example") TmPoliceInfoExample example);

    int updateByExample(@Param("record") TmPoliceInfo record, @Param("example") TmPoliceInfoExample example);
}