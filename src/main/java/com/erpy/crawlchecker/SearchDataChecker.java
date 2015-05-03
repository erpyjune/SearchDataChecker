package com.erpy.crawlchecker;

import com.erpy.dao.SearchData;
import com.erpy.dao.SearchDataService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * Created by baeonejune on 15. 5. 3..
 */
public class SearchDataChecker {
    public static void main(String[] args) throws Exception {
        SearchData searchData;
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");
        SearchDataService searchDataService = (SearchDataService) cxt.getBean("searchDataService");
        List<SearchData> searchDataList = searchDataService.getAllSearchData();
        Iterator iter = searchDataList.iterator();
        while (iter.hasNext()) {
            searchData = (SearchData) iter.next();

            System.out.println(String.format("product_name (%s)", searchData.get_product_name()));
        }
    }
}
