package com.erpy.crawlchecker;

import com.erpy.dao.SearchData;
import com.erpy.dao.SearchDataService;
import com.erpy.data.CP;
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
        CP cp = new CP();
        SearchData searchData=null;
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");
        SearchDataService searchDataService = (SearchDataService) cxt.getBean("searchDataService");

        // all search data.
//        List<SearchData> searchDataList = searchDataService.getAllSearchData();
//        Iterator iter = searchDataList.iterator();
//        int count = 0;
//        while (iter.hasNext()) {
//            searchData = (SearchData) iter.next();
//            System.out.println(String.format("[%d]product_name (%s)", ++count, searchData.get_product_name()));
//            System.out.println(String.format("[%d]date (%s)",           count, searchData.get_date()));
//            System.out.println(String.format("[%d]cp (%s)",             count, searchData.get_cp()));
//            System.out.println("============================================================================");
//        }

        List<SearchData> searchDataList = searchDataService.getAllUpdateData();
        Iterator iter = searchDataList.iterator();
        int totalCount = 0;
        while (iter.hasNext()) {
            searchData = (SearchData) iter.next();
            System.out.println(String.format("[%d]product_name (%s)", totalCount, searchData.get_product_name()));
            System.out.println(String.format("[%d]date (%s)",         totalCount, searchData.get_date()));
            System.out.println(String.format("[%d]cp (%s)",           totalCount, searchData.get_cp()));
            System.out.println("============================================================================");
            totalCount++;

            if (searchData.get_cp().equals("airmt")) cp.airmt++;
            if (searchData.get_cp().equals("ccamping")) cp.ccamping++;
            if (searchData.get_cp().equals("sbclub")) cp.sbclub++;
            if (searchData.get_cp().equals("dicamping")) cp.dicamping++;
            if (searchData.get_cp().equals("camping365")) cp.camping365++;
        }

//        List<SearchData> searchDataList = searchDataService.getCpSearchData("ccamping");
//        Iterator iter = searchDataList.iterator();
//        int totalCount = 0;
//        int updateCount=0;
//        while (iter.hasNext()) {
//            searchData = (SearchData) iter.next();
//            if (searchData.get_date().startsWith("20150511 00:02:58")) {
//                updateCount++;
//            }
//            searchData = (SearchData) iter.next();
//            System.out.println(String.format("[%d]product_name (%s)", totalCount, searchData.get_product_name()));
//            System.out.println(String.format("[%d]date (%s)",         totalCount, searchData.get_date()));
//            System.out.println(String.format("[%d]cp (%s)",           totalCount, searchData.get_cp()));
//            System.out.println("============================================================================");
//            totalCount++;
//        }
        System.out.println("============================================================================");
    }
}
