package com.txy.gkzyfz.pojo;

import com.txy.gkzyfz.pojo.Guanliyuan;

public interface GuanliyuanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guanliyuan
     *
     * @mbg.generated Fri Apr 17 08:46:39 CST 2020
     */
    int deleteByPrimaryKey(String gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guanliyuan
     *
     * @mbg.generated Fri Apr 17 08:46:39 CST 2020
     */
    int insert(Guanliyuan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guanliyuan
     *
     * @mbg.generated Fri Apr 17 08:46:39 CST 2020
     */
    int insertSelective(Guanliyuan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guanliyuan
     *
     * @mbg.generated Fri Apr 17 08:46:39 CST 2020
     */
    Guanliyuan selectByPrimaryKey(String gid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guanliyuan
     *
     * @mbg.generated Fri Apr 17 08:46:39 CST 2020
     */
    int updateByPrimaryKeySelective(Guanliyuan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guanliyuan
     *
     * @mbg.generated Fri Apr 17 08:46:39 CST 2020
     */
    int updateByPrimaryKey(Guanliyuan record);

    Guanliyuan selectByUsername(String username);
}