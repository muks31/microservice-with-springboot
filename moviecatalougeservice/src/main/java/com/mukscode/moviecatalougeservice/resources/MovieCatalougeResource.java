package com.mukscode.moviecatalougeservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mukscode.moviecatalougeservice.models.CatalougItem;

@RestController
@RequestMapping("/catalouge")
public class MovieCatalougeResource {

	@RequestMapping("/{userId}")
	public List<CatalougItem> getCatalouge(@PathVariable("userId") String userId){
		
		return Collections.singletonList(new CatalougItem("Transformers", "Testing", 4));
		
	}
}
