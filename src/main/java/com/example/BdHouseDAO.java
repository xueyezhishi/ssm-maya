package com.example;

import org.springframework.stereotype.Repository;

/**
 * BdHouseDAO继承基类
 */
@Repository
public interface BdHouseDAO extends MyBatisBaseDao<BdHouse, String> {
}