package com.xicheng.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/1/23 下午 05:08
 */
@Component
public class T03_BService {

	@Autowired
	private T03_AService aService;
}
