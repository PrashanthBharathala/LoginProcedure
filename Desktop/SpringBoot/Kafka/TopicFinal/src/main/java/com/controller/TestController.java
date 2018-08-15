package com.controller;

import java.util.List;
import java.util.Properties;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkConnection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kafka.admin.AdminUtils;
import kafka.utils.ZKStringSerializer$;
import kafka.utils.ZkUtils;
import scala.collection.JavaConversions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{

	@RequestMapping("/topiccreate.do")
	public String topicCreation(@RequestParam("topic") String topic)
	{
		System.out.println("controller entered");
		
		//String zookeeperConnect = "zkserver1:2181,zkserver2:2181";
		
				String zookeeperConnect = "localhost:2181";
				//String zookeeperConnect = "192.168.1.1:2181,192.168.1.2:2181";
				
			    int sessionTimeoutMs = 10 * 1000;
			    int connectionTimeoutMs = 8 * 1000;
			    // Note: You must initialize the ZkClient with ZKStringSerializer.  If you don't, then
			    // createTopic() will only seem to work (it will return without error).  The topic will exist in
			    // only ZooKeeper and will be returned when listing topics, but Kafka itself does not create the
			    // topic.
			    ZkClient zkClient = new ZkClient(
			        zookeeperConnect,
			        sessionTimeoutMs,
			        connectionTimeoutMs,
			        ZKStringSerializer$.MODULE$);
			    // Security for Kafka was added in Kafka 0.9.0.0
			    boolean isSecureKafkaCluster = false;
			    ZkUtils zkUtils = new ZkUtils(zkClient, new ZkConnection(zookeeperConnect), isSecureKafkaCluster);
			    String topic1 = topic;
			    int partitions = 2;
			    int replication = 1;
			    Properties topicConfig = new Properties(); // add per-topic configurations settings here
			    AdminUtils.createTopic(zkUtils, topic1, partitions, replication, topicConfig);
			    System.out.println("cretaed");
			    zkClient.close();
		return "Topic created Successfully";
		
	}
	
	
	@RequestMapping("/getTopic.do")
	public List getTopicDetails()
	{
		//String zookeeperConnect = "zkserver1:2181,zkserver2:2181";
		
				String zookeeperConnect = "localhost:2181";
				//String zookeeperConnect = "192.168.1.1:2181,192.168.1.2:2181";
				
			    int sessionTimeoutMs = 10 * 1000;
			    int connectionTimeoutMs = 8 * 1000;
			    // Note: You must initialize the ZkClient with ZKStringSerializer.  If you don't, then
			    // createTopic() will only seem to work (it will return without error).  The topic will exist in
			    // only ZooKeeper and will be returned when listing topics, but Kafka itself does not create the
			    // topic.
			    /*ZkClient zkClient = new ZkClient(
			        zookeeperConnect,
			        sessionTimeoutMs,
			        connectionTimeoutMs,
			        ZKStringSerializer$.MODULE$);
			    */
			    
			    ZkClient zkClient = new ZkClient(
				        zookeeperConnect);
				        
				    
			    

			    // Security for Kafka was added in Kafka 0.9.0.0
			    boolean isSecureKafkaCluster = false;
			    ZkUtils zkUtils = new ZkUtils(zkClient, new ZkConnection(zookeeperConnect), isSecureKafkaCluster);

			  
			   // zkUtils.getAllTopics();
			  List<String>  list=JavaConversions.seqAsJavaList(zkUtils.getAllTopics());
			  
			  list.forEach(s1->{
				  System.out.println(s1);
				  
			  });

			    System.out.println("Got the topics");
			    zkClient.close();
		return list;
		
	}
}
