//package cn.dblearn.blog.common.util;
//
//import cn.dblearn.blog.entity.article.Article;
//import cn.dblearn.blog.portal.article.service.ArticleService;
//import cn.dblearn.blog.search.mapper.ArticleRepository;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.rabbitmq.client.Channel;
//import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
//import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
//import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
//import org.apache.rocketmq.common.message.MessageExt;
//import org.springframework.amqp.core.Message;
//import org.springframework.stereotype.Component;
//import org.springframework.util.CollectionUtils;
//
//import javax.annotation.Resource;
//import java.io.IOException;
//import java.util.List;
//
///**
// * Description
// * Author ayt  on
// */
//@Component
//public class ConsumerListener implements MessageListenerConcurrently {
//
//	@Resource
//	ArticleRepository articleRepository;
//
//
//	@Resource
//	private ArticleService articleService;
//
//	@Override
//	public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
//		if (CollectionUtils.isEmpty(list)) {
//			return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//		}
//		return refresh();
//	}
//
//	public ConsumeConcurrentlyStatus refresh() {
//		articleRepository.deleteAll();
//		List<Article> list = articleService.list(new QueryWrapper<Article>().lambda().eq(Article::getPublish, true));
//		articleRepository.saveAll(list);
//		return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//	}
//}
