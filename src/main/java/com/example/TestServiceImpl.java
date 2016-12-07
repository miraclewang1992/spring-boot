package com.example;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by doshest on 2016/9/30.
 */
@Service
public class TestServiceImpl implements  ITestService {
    @Resource
    private TestMapper testDao;
    @Override
    public List<User> selctBySize(int size) {
        return this.testDao.selectBySize(size);
    }
}
