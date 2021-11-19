package com.example.demo01;

import com.example.demo01.domain.Company;
import com.example.demo01.service.IncService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IncTest {
    @Autowired
    private IncService incService;

    @Test
    public void test1(){
        Company prechange = incService.prechange(9);
        System.out.println(prechange);
    }
}
