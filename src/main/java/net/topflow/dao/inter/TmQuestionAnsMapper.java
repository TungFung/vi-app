package net.topflow.dao.inter;

import net.topflow.dao.model.TmQuestionAns;
import net.topflow.dao.model.TmQuestionAnsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmQuestionAnsMapper {
    long countByExample(TmQuestionAnsExample example);

    int deleteByExample(TmQuestionAnsExample example);

    int insert(TmQuestionAns record);

    int insertSelective(TmQuestionAns record);

    List<TmQuestionAns> selectByExample(TmQuestionAnsExample example);

    int updateByExampleSelective(@Param("record") TmQuestionAns record, @Param("example") TmQuestionAnsExample example);

    int updateByExample(@Param("record") TmQuestionAns record, @Param("example") TmQuestionAnsExample example);
}