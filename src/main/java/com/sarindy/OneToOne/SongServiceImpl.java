package com.sarindy.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl {

	@Autowired
	private SongRepo songRepo;

	public void addSong(Song song) {
		songRepo.save(song);
	}

}
