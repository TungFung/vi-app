package net.topflow.dao.inter;

import net.topflow.dao.model.TmGroup;
import net.topflow.dao.model.TmGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmGroupMapper {
    long countByExample(TmGroupExample example);

    int deleteByExample(TmGroupExample example);

    int insert(TmGroup record);

    int insertSelective(TmGroup record);

    List<TmGroup> selectByExample(TmGroupExample example);

    int updateByExampleSelective(@Param("record") TmGroup record, @Param("example") TmGroupExample example);

    int updateByExample(@Param("record") TmGroup record, @Param("example") TmGroupExample example);
}