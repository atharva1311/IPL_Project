package com.aj.entity;

public class Players {

	private String name;
	private int jersy_no;
	private String nationality;
	private String specialization;
	private int debut;
	private int matches;
	private int total_runs;
	private int total_wickets;
	public Players() {
		super();
		
	}

	public Players(String name, int jersy_no, String nationality, String specialization, int debut, int matches,
			int total_runs, int total_wickets) {
		super();
		this.name = name;
		this.jersy_no = jersy_no;
		this.nationality = nationality;
		this.specialization = specialization;
		this.debut = debut;
		this.matches = matches;
		this.total_runs = total_runs;
		this.total_wickets = total_wickets;
	}
	public int getJersy_no() {
		return jersy_no;
	}

	public void setJersy_no(int jersy_no) {
		this.jersy_no = jersy_no;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getDebut() {
		return debut;
	}
	public void setDebut(int debut) {
		this.debut = debut;
	}

	public int getTotal_runs() {
		return total_runs;
	}
	public void setTotal_runs(int total_runs) {
		this.total_runs = total_runs;
	}
	public int getTotal_wickets() {
		return total_wickets;
	}
	public void setTotal_wickets(int total_wickets) {
		this.total_wickets = total_wickets;
	}



	@Override
	public String toString() {
		return "Players [name=" + name + ", jersy_no=" + jersy_no + ", nationality=" + nationality + ", specialization="
				+ specialization + ", debut=" + debut + ", matches=" + matches + ", total_runs=" + total_runs
				+ ", total_wickets=" + total_wickets + "]";
	}
	
	
	
	



}
