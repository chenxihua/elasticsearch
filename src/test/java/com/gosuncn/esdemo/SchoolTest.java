//package com.gosuncn.esdemo;
//
//
//import com.gosuncn.esdemo.domin.School;
//import com.gosuncn.esdemo.repository.SchoolRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Iterator;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SchoolTest {
//
//    @Autowired
//    SchoolRepository schoolRepository;
//
//
//    @Test
//    public void testQuery(){
//        Iterable<School> all = schoolRepository.findAll();
//        Iterator<School> iterator = all.iterator();
//        while (iterator.hasNext()){
//            System.out.println("---> : "+iterator.next());
//        }
//    }
//
//}
