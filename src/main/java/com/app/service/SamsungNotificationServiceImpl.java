package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("samsung")
public class SamsungNotificationServiceImpl implements INotificationService {

	@Override
	public void notification() {
		System.out.println("only for Samsung Profile...");

	}

}
