package com.sarindy.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "song_detail")
public class SongDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "song_detail_id")
	private int id;

	@Column(name = "song_genre")
	private String genre;

	public SongDetail(String genre) {

		this.genre = genre;
	}

	@OneToOne(mappedBy = "songDetail")
	private Song song;

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public SongDetail() {

	}

	// When we put @JoinClolumn here mean that this table is the owner of the
	// relationship which mean it will create field song_id which is the foreign
	// key from song table

}
