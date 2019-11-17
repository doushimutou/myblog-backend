//package cn.dblearn.blog.search.config;
//
//import cn.dblearn.blog.common.constants.RabbitMqConstants;
//import cn.dblearn.blog.common.util.RabbitMqUtils;
//import org.apache.rocketmq.client.exception.MQBrokerException;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.remoting.exception.RemotingException;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
//
///**
// * InitialConfig
// *
// * @author bobbi
// * @date 2019/03/16 23:04
// * @email 571002217@qq.com
// * @description
// */
//@Configuration
//public class InitialConfig {
//
//    @Resource
//    private RabbitMqUtils rabbitMqUtils;
//
//    /**
//     * 项目启动时重新导入索引
//     */
//    @PostConstruct
//    public void initEsIndex() throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
//        rabbitMqUtils.send("dbblog-search init index");
//
//    }
//}
