package com.cong.fishisland.model.vo.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户数据web
 * @author 许林涛
 * @date 2025年05月22日 9:46
 */
@Data
public class UserDataWebVO implements Serializable {
    /**
     * 总用户数
     */
    private Integer totalUsers;
    /**
     * 今日活跃用户数
     */
    private Integer todayActiveUsers;
    /**
     * 今日新增用户数
     */
    private Integer todayNewUsers;
    /**
     * 本月活跃用户数
     */
    private Integer thisMonthActiveUsers;
    private static final long serialVersionUID = 1L;
}
