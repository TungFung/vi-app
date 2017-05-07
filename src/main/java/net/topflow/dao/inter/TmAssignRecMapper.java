package net.topflow.dao.inter;

import net.topflow.dao.model.TmAssignRec;
import net.topflow.dao.model.TmAssignRecExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmAssignRecMapper {
    long countByExample(TmAssignRecExample example);

    int deleteByExample(TmAssignRecExample example);

    int insert(TmAssignRec record);

    int insertSelective(TmAssignRec record);

    List<TmAssignRec> selectByExample(TmAssignRecExample example);

    int updateByExampleSelective(@Param("record") TmAssignRec record, @Param("example") TmAssignRecExample example);

    int updateByExample(@Param("record") TmAssignRec record, @Param("example") TmAssignRecExample example);
}