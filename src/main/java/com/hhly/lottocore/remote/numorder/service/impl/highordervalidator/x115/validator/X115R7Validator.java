package com.hhly.lottocore.remote.numorder.service.impl.highordervalidator.x115.validator;

import org.springframework.stereotype.Component;

@Component
public class X115R7Validator extends X115RnValidator{

	@Override
	protected int getMinSelect() {
		return 7;
	}
}
