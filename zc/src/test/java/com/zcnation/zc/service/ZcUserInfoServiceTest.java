/**********************************************
 * 杭州枭雄网络科技有限公司 @2014 版权所有
 * 项目：zc
 * 时间：2014年7月28日 下午11:39:12
 * 作者:xiaoymin@foxmail.com 萧玉民
 * 说明：
 **********************************************/
package com.zcnation.zc.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.zcnation.zc.dao.ZcProjectInfoDao;
import com.zcnation.zc.dao.ZcUserInfoDao;
import com.zcnation.zc.domain.ZcUserInfo;

@ContextConfiguration(locations={"classpath:config/applicationContext*.xml","classpath:config/spring.xml"})
@TransactionConfiguration(defaultRollback=true)
public class ZcUserInfoServiceTest extends AbstractJUnit38SpringContextTests{

	public void testFindPhone(){
		/*ZcUserInfoService service=applicationContext.getBean("zcUserInfoService", ZcUserInfoService.class);
		ZcUserInfo z=new ZcUserInfo(); 
		z.setUserPhone("13586552493");
		ZcUserInfo json=service.queryUserInfoByPhone(z);
		System.out.println(json);*/
		
	}
	
	public void testCountEmail(){
		ZcUserInfoDao dao=applicationContext.getBean(ZcUserInfoDao.class);
		//Long a=dao.countByEmail("xiaoymin@foxmail.com");
		//System.out.println("邮箱："+a);
		System.out.println("ddd");
		List<ZcUserInfo> list=dao.findByEmailAndPassword("xiaoymin@foxmail.com", "123456");
		System.out.println(list.size());
		ZcUserInfo info=list.get(0);
		info.setUserName("caidao1");;
		dao.save(info);
	}
	public void testCountemailUser(){
		ZcUserInfoDao dao=applicationContext.getBean(ZcUserInfoDao.class);
		//Long a=dao.countByEmail("xiaoymin@foxmail.com");
		Long a=dao.countByUerOrEmailOrPhone("asdfsdf", "xiaoymin@foxmail.com", "12343443");
		System.out.println("邮箱s："+a);
		System.out.println("ssssssssss");
	}
	
}
