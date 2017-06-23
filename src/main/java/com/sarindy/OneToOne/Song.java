
package com.sarindy.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "song")
public class Song {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "song_id")

	private int id;
	@Column(name = "song_name")

	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "song_detail")
	private SongDetail songDetail;
	// MappedBy here is the local property from Song_detail class

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SongDetail getSongDetail() {
		return songDetail;
	}

	public void setSongDetail(SongDetail songDetail) {
		this.songDetail = songDetail;
	}

	public Song() {

	}

	public Song(String name) {

		this.name = name;
	}

	public Song(String name, SongDetail songDetail) {

		this.name = name;
		this.songDetail = songDetail;
	}

}
