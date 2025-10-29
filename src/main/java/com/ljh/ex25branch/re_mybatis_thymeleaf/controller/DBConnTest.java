package com.ljh.ex25branch.re_mybatis_thymeleaf.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;

@RestController
public class DBConnTest {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/dbconn4")
    public String dbconn4() {
        try (Connection conn = dataSource.getConnection()){
            String result = conn.getMetaData().getURL();
            return "DB 연결 성공: " + result;
        } catch (Exception e) {
            e.printStackTrace();
            return "DB 연결 실패";
        }
    }
}
