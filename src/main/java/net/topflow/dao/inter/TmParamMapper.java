package net.topflow.dao.inter;

import net.topflow.dao.model.TmParam;
import net.topflow.dao.model.TmParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmParamMapper {
    long countByExample(TmParamExample example);

    int deleteByExample(TmParamExample example);

    int insert(TmParam record);

    int insertSelective(TmParam record);

    List<TmParam> selectByExample(TmParamExample example);

    int updateByExampleSelective(@Param("record") TmParam record, @Param("example") TmParamExample example);

    int updateByExample(@Param("record") TmParam record, @Param("example") TmParamExample example);
}