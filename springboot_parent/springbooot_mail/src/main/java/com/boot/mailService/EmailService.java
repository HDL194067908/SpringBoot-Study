package com.boot.mailService;

import java.io.File;

public interface EmailService {
	void simplemail(String sendTo,String title,String context);

	void filemail(String sendTo,String title,String context,File file);
}
