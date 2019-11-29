package com.gosuncn.esdemo;

import com.gosuncn.esdemo.constant.EsData;
import com.gosuncn.esdemo.domin.Library;
import com.gosuncn.esdemo.repository.LibraryRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EsdemoApplicationTests {




    private static final Logger logger = LoggerFactory.getLogger(EsdemoApplicationTests.class);

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    LibraryRepository libraryRepository;


//    @Test
//    public void testIndex(){
//
//        boolean indexExists = elasticsearchTemplate.indexExists(Library.class);
//        if (indexExists){
//            logger.warn("存在索引");
//        }else {
//            logger.warn("索引不存在。。。");
//            try {
//                boolean index = elasticsearchTemplate.createIndex(Library.class, EsData.DEFAULT_SETTING);
//                if (index){
//                    logger.info("索引创建成功。。。");
//                }else {
//                    logger.warn("索引创建失败。。。");
//                }
//            }catch (Exception e){
//                logger.error("error: {}", e.getLocalizedMessage());
//            }
//        }
//    }



    /**
     * 插入数据
     */
//    @Test
//    public void testInsert(){
//        libraryRepository.save(new Library(42, "A00042", "明史简述", 59, "吴晗", "吴晗背景uniworsity厉害"));
//        libraryRepository.save(new Library(43, "A00043", "傅雷家书", 99, "傅聪", "都是NB，class大家u"));
//        libraryRepository.save(new Library(24, "A00942", "时间简史", 169, "霍金", "教授宇宙大爆发的59年历史"));
//        libraryRepository.save(new Library(25, "A00925", "我的前半生", 39, "方舟89子", "都是生活，每晚9点"));
//        libraryRepository.save(new Library(29, "A00029", "围9城", 139, "钱钟书", "你想出城？不存在的"));
//    }
//
//
//    // 全字段查询,不分页
    @Test
    public void testSearch(){
        try {
            String searchStr = "三西阿";
            QueryStringQueryBuilder builder = new QueryStringQueryBuilder(searchStr);
            Iterable<Library> search = libraryRepository.search(builder);
            Iterator<Library> iterator = search.iterator();
            while (iterator.hasNext()){
                System.out.println("--> 数据："+iterator.next());
            }
        }catch (Exception e){
            System.out.println("---> 异常信息： "+e);
        }
    }
//    // 全字段查询, 已经分页
//    @Test
//    public void testSearchByPage(){
//        try {
//            String searchStr = "三西阿";
//            QueryStringQueryBuilder builder = new QueryStringQueryBuilder(searchStr);
//            Iterable<Library> search = libraryRepository.search(builder, PageRequest.of(0,2));
//            Iterator<Library> iterator = search.iterator();
//            while (iterator.hasNext()){
//                System.out.println("--> 数据："+iterator.next());
//            }
//        }catch (Exception e){
//            System.out.println("---> 异常信息： "+e);
//        }
//    }
//
//    @Test
//    public void testByWeight(){
//        NativeSearchQueryBuilder searchQueryBuilder = new NativeSearchQueryBuilder();
//        searchQueryBuilder.withQuery(QueryBuilders.termQuery("book_price", 9));
//        Page<Library> libraryPage = libraryRepository.search(searchQueryBuilder.build());
//        Iterator<Library> iterator = libraryPage.iterator();
//        while (iterator.hasNext()){
//            System.out.println("--->  "+iterator.next());
//        }
//    }
//
//    // 查询全部
    @Test
    public void testQuery(){
        Iterable<Library> all = libraryRepository.findAll();
        Iterator<Library> iterator = all.iterator();
        while (iterator.hasNext()){
            System.out.println("---> 全部数据: "+iterator.next());
        }
    }
//
//    // 按序排序
//    @Test
//    public void testQueryBySort(){
//        Iterable<Library> all = libraryRepository.findAll(Sort.by("book_price").descending());
//        Iterator<Library> iterator = all.iterator();
//        while (iterator.hasNext()){
//            System.out.println("---> 全部数据： "+iterator.next());
//        }
//    }
//
//    // 自定义方法
////    @Test
////    public void testQueryByCoustom(){
////        Iterable<Library> priceBetween = libraryRepository.findByBookPriceBetween(100, 200);
////        Iterator<Library> iterator = priceBetween.iterator();
////        while (iterator.hasNext()){
////            System.out.println("---> 具体数据： "+iterator.next());
////        }
////    }
//
//    // 自定义查询
//    @Test
//    public void testBulders(){
//        String str = "三门";
//        // 构建查询条件
//        NativeSearchQueryBuilder builder = new NativeSearchQueryBuilder();
//        // 添加基本分词查询
//        //builder.withQuery(QueryBuilders.termQuery("book_name",str));       // 不分词
//        builder.withQuery(QueryBuilders.matchQuery("book_name",str));  // 分词
//        //builder.withQuery(QueryBuilders.rangeQuery("book_price").from(100).to(200));  // 范围匹配
//        //builder.withQuery(QueryBuilders.fuzzyQuery("book_name",str));  // 模糊匹配，不分词的
//        // 搜索，获取结果
//        Page<Library> libraries = libraryRepository.search(builder.build());
//        // 总条数
//        System.out.println("---> 总数： "+libraries.getTotalElements());
//        libraries.forEach(library -> System.out.println("---> 具体数据： "+ library));
//    }
//
//    // 自定义分页查询
//    @Test
//    public void testBuldersByPage(){
//        // 构建查询条件
//        NativeSearchQueryBuilder builder = new NativeSearchQueryBuilder();
//        // 添加基本分词查询   这个termQuery方法好像明显比上面的好
//        builder.withQuery(QueryBuilders.termQuery("book_author", "阿"));
//        // 分页
//        builder.withPageable(PageRequest.of(0,2));
//        // 排序
//        //queryBuilder.withSort(SortBuilders.fieldSort("price").order(SortOrder.ASC));
//        // 搜索，获取结果
//        Page<Library> libraries = libraryRepository.search(builder.build());
//        System.out.println("总数："+libraries.getTotalElements()+"; 总页数："+libraries.getTotalPages());
//        libraries.forEach(library -> System.out.println("具体数据："+library));
//    }
//
//
}
