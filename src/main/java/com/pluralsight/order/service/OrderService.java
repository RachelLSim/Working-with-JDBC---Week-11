package com.pluralsight.order.service;

import com.pluralsight.order.dto.ParamsDto;

import java.sql.SQLException;

/**
 * Interface for service classes
 */
public interface OrderService {
    String execute(ParamsDto paramsDTO) throws SQLException;
}
