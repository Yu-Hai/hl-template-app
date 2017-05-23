package com.office.springboot.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.office.springboot.user.dto.UserDTO;

public class ThreadPool {

	ExecutorService executor = Executors.newFixedThreadPool(5);

	private static List<UserDTO> list = null;

	static {
		list = new ArrayList<UserDTO>();
		UserDTO user = null;
		for (int i = 0; i < 100; i++) {
			user = new UserDTO();
			user.setIdUser("idUser-" + i);
			list.add(user);
		}
	}

}
