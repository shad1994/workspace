package com.TestProjects;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.JSONObject;

public class WriterTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter writer = new PrintWriter("home/qainfotech/workspace/FirstTest/test.txt");
		JSONObject obj=new JSONObject();
		obj.put("name", "shadab");
		obj.put("id", "4180");
        writer.println(obj.toString(2));
        writer.close();

	}

}
