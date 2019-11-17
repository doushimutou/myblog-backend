//package cn.dblearn.blog.common.util;
//
//import cn.dblearn.blog.common.constants.RocketMqTagEn;
//import cn.dblearn.blog.common.constants.RocketMqTopicEn;
//import org.apache.rocketmq.client.exception.MQBrokerException;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.client.producer.TransactionMQProducer;
//import org.apache.rocketmq.common.message.Message;
//import org.apache.rocketmq.remoting.exception.RemotingException;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Collection;
//
///**
// * RabbitMqUtils
// *
// * @author bobbi
// * @date 2019/03/16 22:08
// * @email 571002217@qq.com
// * @description
// */
//@Component
//public class RabbitMqUtils {
//
//	@Autowired
//	private TransactionMQProducer transactionMQProducer;
//
//
//	/**
//	 * 发送到指定Queue
//	 *
//	 * @param
//	 * @param obj
//	 */
//	public void send( Object obj) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
//		Message message = new Message(RocketMqTopicEn.BLOG_ARTICLE_TOPIC.getTopic(), RocketMqTagEn.BLOG_ARTICLE_TAG.getTag(), obj.toString().getBytes());
//
//		transactionMQProducer.send(message);
//	}
//}
