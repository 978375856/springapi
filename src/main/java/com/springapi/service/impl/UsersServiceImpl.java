package com.springapi.service.impl;

import com.springapi.entity.Users;
import com.springapi.dao.UsersDao;
import com.springapi.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2024-11-26 14:06:12
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Users queryById(Integer id) {
        return this.usersDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param users 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Users> queryByPage(Users users, PageRequest pageRequest) {
        long total = this.usersDao.count(users);
        return new PageImpl<>(this.usersDao.queryAllByLimit(users, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public Users insert(Users users) {
        this.usersDao.insert(users);
        return users;
    }

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public Users update(Users users) {
        this.usersDao.update(users);
        return this.queryById(users.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.usersDao.deleteById(id) > 0;
    }
}
