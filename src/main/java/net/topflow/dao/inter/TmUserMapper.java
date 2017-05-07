package net.topflow.dao.inter;

import net.topflow.dao.model.TmUser;
import net.topflow.dao.model.TmUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmUserMapper {
    long countByExample(TmUserExample example);

    int deleteByExample(TmUserExample example);

    int insert(TmUser record);

    int insertSelective(TmUser record);

    List<TmUser> selectByExample(TmUserExample example);

    int updateByExampleSelective(@Param("record") TmUser record, @Param("example") TmUserExample example);

    int updateByExample(@Param("record") TmUser record, @Param("example") TmUserExample example);
}