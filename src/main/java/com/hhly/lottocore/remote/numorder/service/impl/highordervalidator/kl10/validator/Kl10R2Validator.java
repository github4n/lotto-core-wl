package com.hhly.lottocore.remote.numorder.service.impl.highordervalidator.kl10.validator;

import org.springframework.stereotype.Component;

/**
 * @desc    任二与选二连组验证规则一样
 * @author  Tony Wang
 * @date    2017年6月13日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@Component
public class Kl10R2Validator extends Kl10RnValidator{

	@Override
	protected int getMinSelect() {
		return 2;
	}
}
