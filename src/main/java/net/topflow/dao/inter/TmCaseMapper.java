package net.topflow.dao.inter;

import net.topflow.dao.model.TmCase;
import net.topflow.dao.model.TmCaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmCaseMapper {
    long countByExample(TmCaseExample example);

    int deleteByExample(TmCaseExample example);

    int insert(TmCase record);

    int insertSelective(TmCase record);

    List<TmCase> selectByExample(TmCaseExample example);

    int updateByExampleSelective(@Param("record") TmCase record, @Param("example") TmCaseExample example);

    int updateByExample(@Param("record") TmCase record, @Param("example") TmCaseExample example);
}