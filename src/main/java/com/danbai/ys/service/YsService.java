package com.danbai.ys.service;

import com.danbai.ys.entity.Gkls;
import com.danbai.ys.entity.VideoTime;
import com.danbai.ys.entity.Ysb;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;

/**
 * @author danbai
 * @date 2019/10/13
 */
public interface YsService {
    /**
     * 获取影视列表
     *
     * @param page    页数
     * @param pagenum 页大小
     * @return List<Ysb>
     */
    List<Ysb> page(int page, int pagenum);

    /**
     * 统计影视
     *
     * @return int
     */
    int contYs();

    /**
     * 根据影视id查询一个影视信息
     *
     * @param id 影视id
     * @return Ysb
     */
    Ysb selectYsById(int id);

    /**
     * 根据影视名查询影视
     *
     * @param pm 片名
     * @return List<Ysb>
     */
    List<Ysb> selectYsByPm(String pm);

    /**
     * 根据影视id查询影视返回影视列表
     *
     * @param id 影视id
     * @return List<Ysb>
     */
    List<Ysb> selectYsByIdlist(int id);

    /**
     * 增加影视
     *
     * @param ysb 影视
     * @return boolean
     */
    boolean addYs(Ysb ysb);

    /**
     * 更新影视
     *
     * @param ysb 影视
     * @return boolean
     */
    boolean update(Ysb ysb);

    /**
     * 删除影视
     *
     * @param ysb 影视
     * @return boolean
     */
    boolean delYs(Ysb ysb);

    /**
     * 根据影视类型获取分页
     *
     * @param lx   类型
     * @param page 页
     * @param size 大小
     * @return PageInfo
     */
    PageInfo getYs(String lx, int page, int size);

    /**
     * 增加影视观看时间
     *
     * @param videoTime
     */
    void addYsTime(VideoTime videoTime);

    /**
     * 获取影视观看时间
     *
     * @param videoTime 影视记录
     * @return float
     */
    float getYsTime(VideoTime videoTime);

    /**
     * 获取观看历史
     *
     * @param username 用户名
     * @return List<Gkls>
     */
    List<Gkls> getGkls(String username);

    /**
     * 获取影视观看时间
     *
     * @param username 用户名
     * @param ysid     影视id
     * @return HashMap
     */
    HashMap getYsLs(String username, int ysid);
}
