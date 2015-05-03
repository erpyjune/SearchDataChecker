package com.erpy.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by baeonejune on 15. 5. 3..
 */
public interface SearchDataMapper {
    // Annotation
    @Select("SELECT * FROM search")
    @Results(value = {
            @Result(property="_id",             column="appsid"),
            @Result(property="_product_id",     column="product_id"),
            @Result(property="_product_name",   column="product_name"),
            @Result(property="_brand_name",     column="brand_name"),
            @Result(property="_url",            column="url"),
            @Result(property="_thumb_url",      column="thumb_url"),
            @Result(property="_org_price",      column="org_price"),
            @Result(property="_sale_price",     column="sale_price"),
            @Result(property="_sale_per",       column="sale_per"),
            @Result(property="_cp",             column="cp"),
            @Result(property="_keyword",        column="keyword"),
            @Result(property="_status",         column="status"),
            @Result(property="_seed_url",       column="seed_url"),
            @Result(property="_date",           column="date")
    })
    public List<SearchData> getSearchDataAll();
}
