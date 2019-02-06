package com.json.writejson;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WritejsonController {
	
	@RequestMapping(value = "/writejson", method = RequestMethod.POST )
	public ResponseEntity<Object> writeJson(@RequestBody String jsonObject) throws IOException {
		
		Path path = FileSystems.getDefault().getPath("write.json").toAbsolutePath();
		FileWriter file = new FileWriter(path.toString());
		try{
			file.write(jsonObject.toString());
		}catch(IOException e){
			e.printStackTrace();
		} finally {
			file.flush();
			file.close();
		}
	    return new ResponseEntity<>("Json File Write Successfully.",HttpStatus.OK);
    }
}
