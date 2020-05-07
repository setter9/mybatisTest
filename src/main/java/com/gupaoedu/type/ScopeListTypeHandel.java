package com.gupaoedu.type;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2020/5/7 - 22:18
 */
public class ScopeListTypeHandel extends BaseTypeHandler<List<Integer>> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<Integer> parameterList, JdbcType jdbcType) throws SQLException {
        String newStr = String.join(",", parameterList.stream().map(x -> x + "").collect(Collectors.toList()));

        System.out.println("---------------setNonNullParameter1："+newStr);
        ps.setString(i, newStr);
    }

    @Override
    public List<Integer> getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        System.out.println("---------------setNonNullParameter1："+resultSet.getString(columnName));

        final List<Integer> list = Arrays.asList(resultSet.getString(columnName).split(",")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        return list;
    }

    @Override
    public List<Integer> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public List<Integer> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
