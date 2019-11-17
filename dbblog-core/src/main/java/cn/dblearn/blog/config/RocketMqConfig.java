//package cn.dblearn.blog.config;
//
//import cn.dblearn.blog.common.constants.RocketMqTagEn;
//import cn.dblearn.blog.common.constants.RocketMqTopicEn;
//import cn.dblearn.blog.common.util.ConsumerListener;
//import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.client.producer.TransactionMQProducer;
//import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
///**
// * Description
// * Author ayt  on
// */
//@Component
//public class RocketMqConfig {
//
//	private static DefaultMQPushConsumer defaultMQPushConsumer;
//	private static TransactionMQProducer transactionMQProducer;
//	private String consumerGroupName;
//	private String namesrvAddr;
//	private String topic;
//	private String tag;
//	private String producerGroup;
//
//	@Resource
//	ConsumerListener consumerListener;
//
//	@Bean
//	public DefaultMQPushConsumer defaultMQPushConsumer() throws MQClientException {
//		defaultMQPushConsumer = new DefaultMQPushConsumer(consumerGroupName);
//		defaultMQPushConsumer.setNamesrvAddr(namesrvAddr);
//		defaultMQPushConsumer.setConsumeThreadMax(10);
//		defaultMQPushConsumer.setConsumeThreadMin(1);
//		defaultMQPushConsumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
//		defaultMQPushConsumer.setInstanceName(String.valueOf(System.currentTimeMillis()));
//		defaultMQPushConsumer.subscribe(RocketMqTopicEn.BLOG_ARTICLE_TOPIC.getTopic(), RocketMqTagEn.BLOG_ARTICLE_TAG.getTag());
//		defaultMQPushConsumer.setMessageListener(consumerListener);
//		defaultMQPushConsumer.start();
//		return defaultMQPushConsumer;
//	}
//
//	@Bean
//	public TransactionMQProducer transactionMQProducer() throws MQClientException {
//		transactionMQProducer = new TransactionMQProducer();
//		transactionMQProducer.setNamesrvAddr(namesrvAddr);
//		transactionMQProducer.setProducerGroup(producerGroup);
//		transactionMQProducer.setInstanceName(String.valueOf(System.currentTimeMillis()));
//		transactionMQProducer.start();
//		return transactionMQProducer;
//	}
//
//
//}
