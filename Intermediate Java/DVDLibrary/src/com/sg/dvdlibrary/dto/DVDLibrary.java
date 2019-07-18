package com.sg.dvdlibrary.dto;

import java.util.Date;

public class DVDLibrary {

	private transient String tittle;
	private transient Date releaseDate;
	private transient String mpaaRating;
	private transient String directorName;
	private transient String studio;
	private transient String userRatingNotes;

	public DVDLibrary(String tittle) {
		this.tittle = tittle;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getMpaaRating() {
		return mpaaRating;
	}

	public void setMpaaRating(String mpaaRating) {
		this.mpaaRating = mpaaRating;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public String getUserRatingNotes() {
		return userRatingNotes;
	}

	public void setUserRatingNotes(String userRatingNotes) {
		this.userRatingNotes = userRatingNotes;
	}

	public String getTittle() {
		return tittle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studio == null) ? 0 : studio.hashCode());
		result = prime * result + ((directorName == null) ? 0 : directorName.hashCode());
		result = prime * result + ((mpaaRating == null) ? 0 : mpaaRating.hashCode());
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
		result = prime * result + ((tittle == null) ? 0 : tittle.hashCode());
		result = prime * result + ((userRatingNotes == null) ? 0 : userRatingNotes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DVDLibrary other = (DVDLibrary) obj;
		if (studio == null) {
			if (other.studio != null)
				return false;
		} else if (!studio.equals(other.studio))
			return false;
		if (directorName == null) {
			if (other.directorName != null)
				return false;
		} else if (!directorName.equals(other.directorName))
			return false;
		if (mpaaRating == null) {
			if (other.mpaaRating != null)
				return false;
		} else if (!mpaaRating.equals(other.mpaaRating))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		if (tittle == null) {
			if (other.tittle != null)
				return false;
		} else if (!tittle.equals(other.tittle))
			return false;
		if (userRatingNotes == null) {
			if (other.userRatingNotes != null)
				return false;
		} else if (!userRatingNotes.equals(other.userRatingNotes))
			return false;
		return true;
	}
}
