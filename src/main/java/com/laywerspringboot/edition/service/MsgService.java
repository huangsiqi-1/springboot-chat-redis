package com.laywerspringboot.edition.service;

import com.laywerspringboot.edition.entity.Msg;

import java.util.List;


/**
 * (Msg)表服务接口
 *
 * @author makejava
 * @since 2020-11-14 22:07:28
 */
public interface MsgService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Msg queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Msg> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param msg 实例对象
     * @return 实例对象
     */
    Msg insert(Msg msg);

    /**
     * 修改数据
     *
     * @param msg 实例对象
     * @return 实例对象
     */
    Msg update(Msg msg);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    /**
     * 根据名字查询是否在线
     * @param name
     * @return
     */
    Msg queryByName(String name);
}