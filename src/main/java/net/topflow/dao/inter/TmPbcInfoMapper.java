package net.topflow.dao.inter;

import net.topflow.dao.model.TmPbcInfo;
import net.topflow.dao.model.TmPbcInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmPbcInfoMapper {
    long countByExample(TmPbcInfoExample example);

    int deleteByExample(TmPbcInfoExample example);

    int insert(TmPbcInfo record);

    int insertSelective(TmPbcInfo record);

    List<TmPbcInfo> selectByExample(TmPbcInfoExample example);

    int updateByExampleSelective(@Param("record") TmPbcInfo record, @Param("example") TmPbcInfoExample example);

    int updateByExample(@Param("record") TmPbcInfo record, @Param("example") TmPbcInfoExample example);
}