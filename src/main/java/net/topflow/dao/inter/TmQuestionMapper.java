package net.topflow.dao.inter;

import net.topflow.dao.model.TmQuestion;
import net.topflow.dao.model.TmQuestionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmQuestionMapper {
    long countByExample(TmQuestionExample example);

    int deleteByExample(TmQuestionExample example);

    int insert(TmQuestion record);

    int insertSelective(TmQuestion record);

    List<TmQuestion> selectByExample(TmQuestionExample example);

    int updateByExampleSelective(@Param("record") TmQuestion record, @Param("example") TmQuestionExample example);

    int updateByExample(@Param("record") TmQuestion record, @Param("example") TmQuestionExample example);
}