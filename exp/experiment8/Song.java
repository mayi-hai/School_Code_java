package experiment8;

/*
 * 歌曲类，只包含歌曲具有的属性和对应的getter\setter方法
 */
public class Song {
	private int id;
	private String songName;
	private String category;
	private String language;
	private String singer;

	public Song() {

	}

	public Song(int id, String songName, String category, String language, String singer) {
		super();
		this.id = id;
		this.songName = songName;
		this.category = category;
		this.language = language;
		this.singer = singer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

}
