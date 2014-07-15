package com.bruce.foundation.admin.mapper.security;

import com.bruce.foundation.admin.model.security.AdminRole;
import com.bruce.foundation.admin.model.security.AdminRoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    int countByExample(AdminRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    int deleteByExample(AdminRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    int insert(AdminRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    int insertSelective(AdminRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    List<AdminRole> selectByExample(AdminRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    AdminRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    int updateByExampleSelective(@Param("record") AdminRole record, @Param("example") AdminRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    int updateByExample(@Param("record") AdminRole record, @Param("example") AdminRoleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    int updateByPrimaryKeySelective(AdminRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_role
     *
     * @mbggenerated Thu Jul 10 18:39:11 CST 2014
     */
    int updateByPrimaryKey(AdminRole record);
}