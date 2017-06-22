package com.sarindy.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "song")
public class Song {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "song_id")
	@Getter
	@Setter
	private int id;
	@Column(name = "song_name")
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	@OneToOne(mappedBy="songProperty")
	private SongDetail songDetail;
	
	//MappedBy here is the local property from Song_detail class

}
