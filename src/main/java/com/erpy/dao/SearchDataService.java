package com.erpy.dao;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by baeonejune on 15. 5. 3..
 */
public class SearchDataService {

    @Autowired
    private SearchDataMapper searchDataMapper;

    public List<SearchData> getAllSearchData() {
        return searchDataMapper.getSearchDataAll();
    }

    public List<SearchData> getCpSearchData(String cpName) {
        return searchDataMapper.getCpSearchData(cpName);
    }

    public List<SearchData> getAllUpdateData() {
        return searchDataMapper.getAllUpdateData();
    }
}
