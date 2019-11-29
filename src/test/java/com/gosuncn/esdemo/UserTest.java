//package com.gosuncn.esdemo;
//
//import com.gosuncn.esdemo.domin.User;
//import com.gosuncn.esdemo.repository.UserRepository;
//import org.elasticsearch.index.query.QueryStringQueryBuilder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Iterator;
////
////
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserTest {
////
//    @Autowired
//    UserRepository userRepository;
////
////    @Test
////    public void testQuery(){
////        Iterable<User> users = userRepository.findAll();
////        Iterator<User> iterator = users.iterator();
////        while (iterator.hasNext()){
////            System.out.println("---> 数据： "+iterator.next());
////        }
////    }
////
////    // 插入数据
////    @Test
////    public void testInsert(){
////        userRepository.save(new User(3, "高新兴", "gao45", 18, "我登录的ip地址是：127.145.0.11"));
////        userRepository.save(new User(4, "神州@数码", "shen18", 18, "我登录的ip地址是：127.124.0.11"));
////        userRepository.save(new User(5, "岭南师范", "ling009", 18, "我记录的ip地址是：127.125.0.11"));
////        userRepository.save(new User(6, "西南大学", "xida", 18, "我登录的ip地址是：127.126.0.11"));
////        userRepository.save(new User(7, "北京大学", "beida", 18, "我记录的ip地址是：127.127.0.11"));
////        userRepository.save(new User(8, "姚#明", "yao210", 18, "我登录的@#%ip地址是：127.248.0.11"));
////        userRepository.save(new User(9, "邓紫棋", "dengml", 18, "我使用的ip地址是：127.249.0.11"));
////        userRepository.save(new User(10, "李荣浩", "li06", 18, "我使用的@ip地址是：127.234.0.11"));
////        userRepository.save(new User(11, "陈奕迅", "19ch8en", 18, "我登录的ip地址是：127.219.0.11"));
////        userRepository.save(new User(12, "周杰伦", "xiayu2014", 18, "我登录的ip地址是：127.0.0.11"));
////        userRepository.save(new User(13, "林俊杰", "zho99", 18, "我登录,的ip地址是：127.111.0.11"));
////        userRepository.save(new User(33, "陈%喜华", "gao45", 18, "我登录的ip地址是：127.145.0.11"));
////        userRepository.save(new User(34, "钟楚莹", "shen18", 18, "我登录的ip地址是：127.124.0.11"));
////        userRepository.save(new User(35, "马@,#立志", "ling009", 18, "我记录的ip地址是：127.125.0.11"));
////        userRepository.save(new User(36, "陈耀鹏", "xida", 18, "我登录的ip地址是：127.126.0.11"));
////        userRepository.save(new User(47, "梁#文友", "beida", 18, "我记录的ip地址是：127.127.0.11"));
////        userRepository.save(new User(48, "郭才莹", "yao210", 18, "我登录的,@#%ip地址是：127.248.0.11"));
////        userRepository.save(new User(49, "黄群", "dengml", 18, "我使用的ip地址是：127.249.0.11"));
////        userRepository.save(new User(104, "黄小群", "li06", 18, "我使用的@ip地址是：127.234.0.11"));
////        userRepository.save(new User(115, "朱&@#%夏宇", "19ch8en", 18, "我登录的ip地址是：127.219.0.11"));
////        userRepository.save(new User(126, "夏雨", "xiayu2014", 18, "我登录的ip地址是：127.0.0.11"));
////        userRepository.save(new User(137, "林薇因", "zho99", 18, "我登录,的ip地址是：127.111.0.11"));
////        userRepository.save(new User(141, "天大会下雨", "tian99", 16, "我登录,的ip地址是：128.111.0.11"));
////        userRepository.save(new User(142, "盗版下雨", "dao199", 26, "我登录,的ip地址是：129.111.0.11"));
////    }
////
////
////    @Test
////    public void testDelete(){
////        userRepository.deleteAll();
////    }
////
////
//    @Test
//    public void testQueryByStr(){
//        try {
//            String searchStr = "陈夏天u马立,@456";
//            QueryStringQueryBuilder builder = new QueryStringQueryBuilder(searchStr);
//            builder.analyzer("myanalyzer").field("username").field("password").field("ip");
//
//
//            Iterable<User> search = userRepository.search(builder);
//            Iterator<User> iterator = search.iterator();
//
//            while (iterator.hasNext()){
//                System.out.println("---> 匹配数据： "+iterator.next());
//            }
//        }catch (Exception e){
//            System.out.println("---> 异常信息 "+e);
//        }
//    }
////
//}
