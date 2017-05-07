package net.topflow.dao.inter;

import net.topflow.dao.model.TmCaseHis;
import net.topflow.dao.model.TmCaseHisExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmCaseHisMapper {
    long countByExample(TmCaseHisExample example);

    int deleteByExample(TmCaseHisExample example);

    int insert(TmCaseHis record);

    int insertSelective(TmCaseHis record);

    List<TmCaseHis> selectByExample(TmCaseHisExample example);

    int updateByExampleSelective(@Param("record") TmCaseHis record, @Param("example") TmCaseHisExample example);

    int updateByExample(@Param("record") TmCaseHis record, @Param("example") TmCaseHisExample example);
}