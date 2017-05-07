package net.topflow.dao.inter;

import net.topflow.dao.model.TmHangupRec;
import net.topflow.dao.model.TmHangupRecExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmHangupRecMapper {
    long countByExample(TmHangupRecExample example);

    int deleteByExample(TmHangupRecExample example);

    int insert(TmHangupRec record);

    int insertSelective(TmHangupRec record);

    List<TmHangupRec> selectByExample(TmHangupRecExample example);

    int updateByExampleSelective(@Param("record") TmHangupRec record, @Param("example") TmHangupRecExample example);

    int updateByExample(@Param("record") TmHangupRec record, @Param("example") TmHangupRecExample example);
}