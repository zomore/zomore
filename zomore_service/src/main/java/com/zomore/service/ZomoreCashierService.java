package com.zomore.service;

import com.zomore.domain.ZomoreCashier;
import com.zomore.utils.PageResult;

import java.util.List;

//收银员资料
public interface ZomoreCashierService {
    //查询所有收银员资料
    List<ZomoreCashier> selectAll();
    //分页查询所有收银员资料
    PageResult<ZomoreCashier> selectAllByPage(PageResult<ZomoreCashier> page);
    //根据收银员名称查找收银员资料
    PageResult<ZomoreCashier>  selectByCondent(PageResult<ZomoreCashier> page,String condent);
    //根据员工id查找收银员资料
    ZomoreCashier selectByRuleId(String id);
    //根据员工id查找
    ZomoreCashier selectByName(String name);
    //添加收银员资料
    boolean insert(ZomoreCashier zomoreCashier);
    //删除收银员资料(根据员工id)
    boolean deleted(String id);
    //修改收银员资料(根据id)
    boolean update(ZomoreCashier zomoreCashier);
    //根据编号id和密码查询收银员
    ZomoreCashier select(String id, String num);
}
