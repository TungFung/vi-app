package net.topflow.dao.inter;

import net.topflow.dao.model.TmCallRec;
import net.topflow.dao.model.TmCallRecExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmCallRecMapper {
    long countByExample(TmCallRecExample example);

    int deleteByExample(TmCallRecExample example);

    int insert(TmCallRec record);

    int insertSelective(TmCallRec record);

    List<TmCallRec> selectByExample(TmCallRecExample example);

    int updateByExampleSelective(@Param("record") TmCallRec record, @Param("example") TmCallRecExample example);

    int updateByExample(@Param("record") TmCallRec record, @Param("example") TmCallRecExample example);
}