package com.mksun.ucenter.service;

import com.mksun.ucenter.entity.Test;

import java.util.List;

public interface TestService {
    public List<Test> queryTestList();
    public Test queryTestById(String id);

    int registerTest(Test test);
}
