package com.by.mapper;

import com.by.model.Books;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface BooksMapper {
    /**
     *
     * @mbg.generated
     */
    @Delete({
        "delete from books",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    @Insert({
        "insert into books (name, num)",
        "values (#{name,jdbcType=VARCHAR}, #{num,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Books record);

    /**
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, name, num",
        "from books",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER)
    })
    Books selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, name, num",
        "from books"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER)
    })
    List<Books> selectAll();

    /**
     *
     * @mbg.generated
     */
    @Update({
        "update books",
        "set name = #{name,jdbcType=VARCHAR},",
          "num = #{num,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Books record);
}