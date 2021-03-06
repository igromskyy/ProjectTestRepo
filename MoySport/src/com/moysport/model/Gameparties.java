package com.moysport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GAMEPARTIES")
public class Gameparties {
	@Id
	@Column(name = "IDGP")
	@GeneratedValue
	private Integer idgp;

	@Column(name = "IDGAME")
	private Integer idgame;

	@Column(name = "IDUSER")
	private Integer iduser;

	@Column(name = "VISITED")
	private Integer visited;

	@Column(name = "MARK")
	private Integer mark;

	@Column(name = "IDTEAM")
	private Integer idteam;

	public Integer getIdgp() {
		return idgp;
	}

	public void setIdgp(Integer idgp) {
		this.idgp = idgp;
	}

	public Integer getIdgame() {
		return idgame;
	}

	public void setIdgame(Integer idgame) {
		this.idgame = idgame;
	}

	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public Integer getIdteam() {
		return idteam;
	}

	public void setIdteam(Integer idteam) {
		this.idteam = idteam;
	}

}
