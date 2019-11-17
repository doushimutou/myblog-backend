//package cn.dblearn.blog.search.task;
//
//import cn.dblearn.blog.entity.article.Article;
//import cn.dblearn.blog.portal.article.service.ArticleService;
//import cn.dblearn.blog.search.mapper.ArticleRepository;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.io.IOException;
//import java.util.List;
//
///**
// * Description
// * Author ayt  on
// */
//
//@Component
//public class EsTask {
//	@Resource
//	private ArticleRepository articleRepository;
//
//	@Resource
//	private ArticleService articleService;
//
//	@Scheduled(initialDelay = 10000, fixedRate = 5000)
//	public void task1() {
//		articleRepository.deleteAll();
//		List<Article> list = articleService.list(new QueryWrapper<Article>().lambda().eq(Article::getPublish, true));
//		articleRepository.saveAll(list);
//	}
//
//
//}
