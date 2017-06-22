package com.sarindy.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class SongControllerService {
	
	@Autowired
	private SongRepo songRepo;
	
	@RequestMapping(value="/addSong")
	public void addSong(Song song){
		songRepo.save(song);
	}

}
