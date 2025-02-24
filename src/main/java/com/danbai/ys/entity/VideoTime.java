package com.danbai.ys.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**观看时间类
 * @author danbai
 */
@Table(name = "video_time")
public class VideoTime implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    private String username;

    private Integer ysid;

    /**
     * 影视id
     */
    private String ysjiname;

    /**
     * 观看时间
     */
    private Float time;

    private Date gktime;

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return ysid
     */
    public Integer getYsid() {
        return ysid;
    }

    /**
     * @param ysid 影视id
     */
    public void setYsid(Integer ysid) {
        this.ysid = ysid;
    }

    /**
     * 获取影视id
     *
     * @return ysjiname - 影视id
     */
    public String getYsjiname() {
        return ysjiname;
    }

    /**
     * 设置影视id
     *
     * @param ysjiname 影视id
     */
    public void setYsjiname(String ysjiname) {
        this.ysjiname = ysjiname;
    }

    /**
     * 获取观看时间
     *
     * @return time - 观看时间
     */
    public Float getTime() {
        return time;
    }

    /**
     * 设置观看时间
     *
     * @param time 观看时间
     */
    public void setTime(Float time) {
        this.time = time;
    }

    /**
     * @return gktime 观看时间
     */
    public Date getGktime() {
        return gktime;
    }

    /**
     * @param gktime 观看时间
     */
    public void setGktime(Date gktime) {
        this.gktime = gktime;
    }
}