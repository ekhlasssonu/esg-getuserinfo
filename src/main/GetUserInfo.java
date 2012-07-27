package main;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


public class GetUserInfo {
	@RequestMapping(method=RequestMethod.GET, value="/userinfo")
    public @ResponseBody String getUserInfo(HttpServletRequest request) throws Exception {
		System.out.println("In getUserInfo");
		System.out.println("TIME: "+System.currentTimeMillis());
		//TODO:Code to extract user info given ID
		
		String response = "<ui_url>UserName:</ui_url>";
		return response;
	}
}
