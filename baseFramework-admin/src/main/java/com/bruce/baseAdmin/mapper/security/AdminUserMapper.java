package com.bruce.baseAdmin.mapper.security;

import com.bruce.baseAdmin.model.security.AdminUser;
import com.bruce.baseAdmin.model.security.AdminUserCriteria;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    int countByExample(AdminUserCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    int deleteByExample(AdminUserCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    int insert(AdminUser record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    int insertSelective(AdminUser record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    List<AdminUser> selectByExample(AdminUserCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    AdminUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    int updateByExampleSelective(@Param("record") AdminUser record,
            @Param("example") AdminUserCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    int updateByExample(@Param("record") AdminUser record,
            @Param("example") AdminUserCriteria example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    int updateByPrimaryKeySelective(AdminUser record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table admin_user
     * @mbggenerated  Wed Aug 07 10:02:03 CST 2013
     */
    int updateByPrimaryKey(AdminUser record);
}