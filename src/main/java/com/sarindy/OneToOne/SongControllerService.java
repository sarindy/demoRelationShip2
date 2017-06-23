package com.sarindy.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongControllerService {

	@Autowired
	private SongServiceImpl songService;
	
	@RequestMapping(value = "/addSong", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void addSong(@RequestBody Song song) {

		songService.addSong(song);
	}

	/*
	 * @RequestMapping(value = "/getAllSong", produces =
	 * MediaType.APPLICATION_JSON_UTF8_VALUE) public ResponseEntity<List<Song>>
	 * getAllSong() { return new ResponseEntity<List<Song>>((List<Song>)
	 * songRepo.findAll(), HttpStatus.OK); }
	 */

}
