package com.springrecipes.beans;

import org.springframework.core.io.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.annotation.PostConstruct;	
public class BannerLoader {
	Resource banner;
	
	public void setBanner(Resource banner) {
		this.banner=banner;
	}
	@PostConstruct()
	public void showBanner() throws IOException{
		InputStream in=banner.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		String line="";
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
