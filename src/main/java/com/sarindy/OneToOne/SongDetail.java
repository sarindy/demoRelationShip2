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

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "song_detail")
public class SongDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "song_detail_id")
	@Getter
	@Setter
	private int id;

	@Column(name = "song_genre")
	@Getter
	@Setter
	private String genre;

	@Getter
	@Setter
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "song_id")
	private Song songProperty;

	// When we put @JoinClolumn here mean that this table is the owner of the
	// relationship which mean it will create field song_id which is the foreign
	// key from song table

}
