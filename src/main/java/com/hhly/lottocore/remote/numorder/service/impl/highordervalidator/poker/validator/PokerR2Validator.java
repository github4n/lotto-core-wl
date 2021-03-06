package com.hhly.lottocore.remote.numorder.service.impl.highordervalidator.poker.validator;

import org.springframework.stereotype.Component;

/**
 * @desc    任二
 * @author  Tony Wang
 * @date    2017年6月13日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@Component
public class PokerR2Validator extends PokerRnValidator{

	@Override
	protected int getMinSelect() {
		return 2;
	}
}
